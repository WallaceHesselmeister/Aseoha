/* (C) TAMA Studios 2025 */
package tama.Misc;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import com.mojang.datafixers.util.Pair;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.*;
import net.tardis.mod.blockentities.InteriorDoorTile;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.TardisRenderTypes;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class HalfBOTI {

    private static RenderTarget framebuffer;
    public static Pair<Float, Float>[] positions;

    public static void render(
            ITardisLevel tardis,
            InteriorDoorTile tile,
            PoseStack pose,
            MultiBufferSource buffer,
            float ageInTicks,
            int packedLight,
            int packedOverlay,
            CallbackInfo ci) {

        if (true) return;

        RenderSystem.assertOnRenderThread();
        Minecraft mc = Minecraft.getInstance();
        Window window = mc.getWindow();

        // --- Offscreen: render vortex into its own RenderTarget ---
        RenderTarget fb = getTargetResized(window);
        fb.bindWrite(true);
        fb.clear(Minecraft.ON_OSX); // clears color + depth (+ stencil if present)

        PoseStack vortexPose = new PoseStack();
        assert mc.player != null;
        renderVortexOffscreen(mc.level, mc.player.tickCount, mc.getPartialTick(), vortexPose);

        // Back to main framebuffer (world is already rendered at this point)
        mc.getMainRenderTarget().bindWrite(true);

        // --- Stencil: mark mask area with 1 ---
        mc.getMainRenderTarget().enableStencil();
        GL11.glEnable(GL11.GL_STENCIL_TEST);
        GL11.glStencilMask(0xFF);
        GL11.glClear(GL11.GL_STENCIL_BUFFER_BIT);
        GL11.glStencilFunc(GL11.GL_ALWAYS, 1, 0xFF);
        GL11.glStencilOp(GL11.GL_KEEP, GL11.GL_KEEP, GL11.GL_REPLACE);

        pose.pushPose();
        pose.translate(0, 0, -2);
        drawFrame(pose, 2, 4); // writes "1" into stencil where the quad is
        pose.popPose();

        // Only allow drawing where stencil == 1
        GL11.glStencilMask(0x00);
        GL11.glStencilFunc(GL11.GL_EQUAL, 1, 0xFF);

        // Draw the offscreen texture OVER the world, restricted to the mask
        drawFramebufferToScreen(fb, mc.getWindow());

        // Cleanup
        GL11.glDisable(GL11.GL_STENCIL_TEST);
    }

    // ------------------------------
    // RENDER VORTEX OFFSCREEN
    // ------------------------------
    public static void renderVortexOffscreen(ClientLevel level, int ticks, float partialTick, PoseStack poseStack) {
        boolean isInVortex = Capabilities.getCap(Capabilities.TARDIS, level)
                .map(t -> t.isInVortex())
                .orElse(false);
        if (!isInVortex) return;

        poseStack.pushPose();

        // Use POSITION_TEX (position + uv). Don't call .normal() later.
        BufferBuilder builder = Tesselator.getInstance().getBuilder();
        builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);

        // If you have a custom shader instance, you can set it; otherwise use the default position-tex shader:
        if (TardisRenderTypes.VORTEX_SHADER != null) {
            RenderSystem.setShader(() -> TardisRenderTypes.VORTEX_SHADER);
        } else {
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
        }
        RenderSystem.setShaderGameTime(ticks, partialTick);

        final int segments = 40;
        if (positions == null || positions.length != segments) {
            positions = new Pair[segments];
            for (int i = 0; i < segments; ++i) {
                positions[i] =
                        new Pair<>((float) (level.random.nextInt(12) - 6), (float) (level.random.nextInt(12) - 6));
            }
        }

        for (int i = 0; i < positions.length; ++i) {
            positions[i] = new Pair<>(
                    (float) Math.sin((Minecraft.getInstance().player.tickCount + partialTick) * 0.001 * i) * 10.0F,
                    (float) Math.cos((Minecraft.getInstance().player.tickCount + partialTick) * 0.001 * i) * 10.0F);
        }

        float lastX = 0f, lastY = 0f;
        int index = 0;
        for (int i = -(segments / 2); i < segments / 2; ++i) {
            Pair<Float, Float> offs = positions[index++];
            renderCylinder(poseStack, builder, 30, 10, lastX, lastY, offs.getFirst(), offs.getSecond(), 20 * i);
            lastX = offs.getFirst();
            lastY = offs.getSecond();
        }

        poseStack.popPose();

        // push geometry to GPU while the framebuffer is still bound
        BufferUploader.drawWithShader(builder.end());
    }

    // ------------------------------
    // RENDER CYLINDER (POSITION + TEX ONLY)
    // ------------------------------
    public static void renderCylinder(
            PoseStack pose,
            BufferBuilder buffer,
            int faces,
            int length,
            float startX,
            float startY,
            float endOffsetX,
            float endOffsetY,
            int offsetZ) {
        float leg = 15F;
        final float angle = 360.0F / (float) faces;
        Matrix4f mat = pose.last().pose();

        for (int f = 0; f < faces; ++f) {
            final float rad = (float) Math.toRadians(angle * f);
            final float endRad = (float) Math.toRadians((angle * f) + angle);

            final float x = (float) Math.sin(rad) * leg, y = (float) Math.cos(rad) * leg;

            final float endX = (float) Math.sin(endRad) * leg, endY = (float) Math.cos(endRad) * leg;

            // write position + uv only (matching POSITION_TEX)
            buffer.vertex(mat, endOffsetX + x, endOffsetY + y, 10 + offsetZ)
                    .uv(0.0F, 0.0F)
                    .endVertex();

            buffer.vertex(mat, x + startX, y + startY, -10 + offsetZ)
                    .uv(0.0F, 1.0F)
                    .endVertex();

            buffer.vertex(mat, endX + startX, endY + startY, -10 + offsetZ)
                    .uv((float) Math.sin(Math.toRadians(angle)) * f, 1.0F)
                    .endVertex();

            buffer.vertex(mat, endOffsetX + endX, endOffsetY + endY, 10 + offsetZ)
                    .uv((float) Math.sin(Math.toRadians(angle)) * f, 0.0F)
                    .endVertex();
        }
    }

    // ------------------------------
    // DRAW MASK FRAME
    // ------------------------------
    private static void drawFrame(PoseStack poseStack, float width, float height) {
        RenderSystem.setShader(GameRenderer::getPositionShader);
        BufferBuilder builder = Tesselator.getInstance().getBuilder();
        builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION);

        poseStack.translate(-width / 2, -height / 2, 0);
        Matrix4f mat = poseStack.last().pose();

        builder.vertex(mat, 0, 0, 0).endVertex();
        builder.vertex(mat, 0, height, 0).endVertex();
        builder.vertex(mat, width, height, 0).endVertex();
        builder.vertex(mat, width, 0, 0).endVertex();

        Tesselator.getInstance().end();
    }

    // ------------------------------
    // BLIT FRAMEBUFFER TO SCREEN
    // ------------------------------
    private static void drawFramebufferToScreen(RenderTarget fb, Window window) {
        // make sure we draw on top of world geometry in the masked area
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        // Use standard alpha blending (src alpha, 1-src alpha)
        RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

        // Use built-in position+tex shader and bind the framebuffer color texture to unit 0
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderTexture(0, fb.getColorTextureId());

        // Draw fullscreen NDC quad sampling the fb texture
        BufferBuilder b = Tesselator.getInstance().getBuilder();
        b.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX);

        // Note: texture coordinates (0,0)-(1,1). If you see vertical flip, swap the V coords.
        b.vertex(-1.0F, -1.0F, 0.0F).uv(0.0F, 1.0F).endVertex();
        b.vertex(1.0F, -1.0F, 0.0F).uv(1.0F, 1.0F).endVertex();
        b.vertex(1.0F, 1.0F, 0.0F).uv(1.0F, 0.0F).endVertex();
        b.vertex(-1.0F, 1.0F, 0.0F).uv(0.0F, 0.0F).endVertex();

        Tesselator.getInstance().end();

        // restore state
        RenderSystem.disableBlend();
        RenderSystem.enableDepthTest();
    }

    // ------------------------------
    // GET / RESIZE OFFSCREEN TARGET
    // ------------------------------
    public static RenderTarget getTarget() {
        Window w = Minecraft.getInstance().getWindow();
        if (framebuffer == null) {
            framebuffer = new TextureTarget(w.getWidth(), w.getHeight(), true, Minecraft.ON_OSX);
            framebuffer.setClearColor(0, 0, 0, 0);
        }
        return framebuffer;
    }

    private static RenderTarget getTargetResized(Window w) {
        RenderTarget fb = getTarget();
        if (fb.width != w.getWidth() || fb.height != w.getHeight()) {
            fb.resize(w.getWidth(), w.getHeight(), Minecraft.ON_OSX);
        }
        return fb;
    }
}
