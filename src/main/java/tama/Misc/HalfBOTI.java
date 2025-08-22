/* (C) TAMA Studios 2025 */
package tama.Misc;

import com.mojang.blaze3d.pipeline.RenderTarget;
import com.mojang.blaze3d.pipeline.TextureTarget;
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
import org.joml.Vector3f;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class HalfBOTI {
    public static void render(
            ITardisLevel tardis,
            InteriorDoorTile tile,
            PoseStack pose,
            MultiBufferSource buffer,
            float ageInTicks,
            int packedLight,
            int packedOverlay,
            CallbackInfo ci) {

        // If I just do "return" it'll throw unreachable
        //        if (true) return; // TODO: Make this werk (better than it does right now), vortex needs to render on
        // top of
        // EVERYTHING, look into a mask or framebuffers or smth

        RenderSystem.assertOnRenderThread();
        Minecraft mc = Minecraft.getInstance();

        mc.getMainRenderTarget().enableStencil();

        GL11.glEnable(GL11.GL_STENCIL_TEST);
        GL11.glStencilMask(0xFF);
        GL11.glClear(GL11.GL_STENCIL_BUFFER_BIT);
        GL11.glStencilFunc(GL11.GL_ALWAYS, 1, 0xFF);
        GL11.glStencilOp(GL11.GL_KEEP, GL11.GL_KEEP, GL11.GL_REPLACE);
        RenderSystem.depthMask(true);

        pose.pushPose();

        RenderSystem.disableDepthTest();

        drawFrame(pose, 1, 2); // draws the "frame"

        pose.popPose();

        RenderSystem.colorMask(true, true, true, true);
        RenderSystem.depthMask(true);

        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);

        GL11.glStencilMask(0x00);
        GL11.glStencilFunc(GL11.GL_EQUAL, 1, 0xFF);

        pose.pushPose();
        pose.translate(0, 0, 10);

        renderVortex(mc.level, 1, mc.getPartialTick(), pose); // Render vortex
        RenderSystem.enableDepthTest();

        pose.popPose();

        GL11.glDisable(GL11.GL_STENCIL_TEST);
    }

    private static void drawFrame(PoseStack poseStack, float width, float height) {
        RenderSystem.setShader(GameRenderer::getPositionShader);
        BufferBuilder builder = Tesselator.getInstance().getBuilder();
        builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION);
        poseStack.translate(-width / 2, -height / 2, 0);
        var matrix = poseStack.last().pose();

        builder.vertex(matrix, 0, 0, 0).endVertex();
        builder.vertex(matrix, 0, height, 0).endVertex();
        builder.vertex(matrix, width, height, 0).endVertex();
        builder.vertex(matrix, width, 0, 0).endVertex();

        Tesselator.getInstance().end();
    }

    public static boolean renderVortex(ClientLevel level, int ticks, float partialTick, PoseStack poseStack) {

        boolean isInVortex = Capabilities.getCap(Capabilities.TARDIS, level)
                .map(t -> t.isInVortex())
                .orElse(false);
        if (!isInVortex) return true;

        poseStack.pushPose();

        final BufferBuilder builder = Tesselator.getInstance().getBuilder();
        final MultiBufferSource source = MultiBufferSource.immediate(builder);
        VertexConsumer buffer = source.getBuffer(TardisRenderTypes.VORTEX);

        TardisRenderTypes.VORTEX.setupRenderState();
        // RenderSystem.setShader(() -> TardisRenderTypes.VORTEX_SHADER);
        RenderSystem.setShaderGameTime(ticks, partialTick);

        int segments = 40;

        if (positions == null) {
            positions = new Pair[segments];
            for (int i = 0; i < segments; ++i) {
                if (i == (segments / 2) - 1) positions[i] = new Pair<>(0F, 0F);
                positions[i] = new Pair<Float, Float>(
                        (float) level.random.nextInt(12) - 6, (float) level.random.nextInt(12 - 6));
            }
        }

        for (int i = 0; i < positions.length; ++i) {
            positions[i] = new Pair<>(
                    (float) Math.sin((Minecraft.getInstance().player.tickCount + partialTick) * 0.001 * i) * 10.0F,
                    (float) Math.cos((Minecraft.getInstance().player.tickCount + partialTick) * 0.001 * i) * 10.0F

                    /*
                    (float)Mth.lerp(partialTick, Math.sin((i * Minecraft.getInstance().player.tickCount) * 0.01) * 10, Math.sin((i * level.getGameTime()) * 0.01) * 10),
                    (float) Mth.lerp(partialTick, Math.cos((i * Minecraft.getInstance().player.tickCount -1  ) * 0.01) * 10, Math.cos((i * level.getGameTime()) * 0.01) * 10)
                     */
                    );
        }

        float lastX = 0, lastY = 0;
        int index = 0;
        for (int i = -(segments / 2); i < segments / 2; ++i) {
            Pair<Float, Float> offsets = positions[index];
            ++index;

            renderCylinder(poseStack, buffer, 30, 10, lastX, lastY, offsets.getFirst(), offsets.getSecond(), 20 * i);
            lastX = offsets.getFirst();
            lastY = offsets.getSecond();
        }

        poseStack.popPose();

        if (builder.building()) BufferUploader.drawWithShader(builder.end());
        TardisRenderTypes.VORTEX.clearRenderState();

        /*
        RenderSystem.enableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_COLOR, GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR);
        RenderSystem.depthMask(true);
        getTarget().blitToScreen(w.getWidth(), w.getHeight(), Minecraft.ON_OSX);
        RenderSystem.disableDepthTest();
        RenderSystem.disableBlend();

         */

        return true;
    }

    public static Pair<Float, Float>[] positions;

    private static RenderTarget framebuffer;

    public static RenderTarget getTarget() {
        final Window w = Minecraft.getInstance().getWindow();
        if (framebuffer == null) {
            framebuffer = new TextureTarget(w.getWidth(), w.getHeight(), true, Minecraft.ON_OSX);
            framebuffer.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
        }
        return framebuffer;
    }

    public static void renderCylinder(
            PoseStack pose,
            VertexConsumer buffer,
            int faces,
            int length,
            float startX,
            float startY,
            float endOffsetX,
            float endOffsetY,
            int offsetZ) {
        float leg = 15F;
        final float angle = 360.0F / (float) faces;

        for (int f = 0; f < faces; ++f) {
            final float rad = (float) Math.toRadians(angle * f);
            final float endRad = (float) Math.toRadians((angle * f) + angle);

            final float x = (float) Math.sin(rad) * leg, y = (float) Math.cos(rad) * leg;

            final float endX = (float) Math.sin(endRad) * leg, endY = (float) Math.cos(endRad) * leg;

            final Vector3f normal = new Vector3f(0, (float) Math.cos(rad), (float) Math.sin(-rad));

            buffer.vertex(pose.last().pose(), endOffsetX + x, endOffsetY + y, 10 + offsetZ)
                    .uv(0, 0)
                    .normal(normal.x, normal.y, normal.z)
                    .endVertex();

            buffer.vertex(pose.last().pose(), x + startX, y + startY, -10 + offsetZ)
                    .uv(0, 1)
                    .normal(normal.x, normal.y, normal.z)
                    .endVertex();

            buffer.vertex(pose.last().pose(), endX + startX, endY + startY, -10 + offsetZ)
                    .uv((float) Math.sin(Math.toRadians(angle)) * f, 1)
                    .normal(normal.x, normal.y, normal.z)
                    .endVertex();

            buffer.vertex(pose.last().pose(), endOffsetX + endX, endOffsetY + endY, 10 + offsetZ)
                    .uv((float) Math.sin(Math.toRadians(angle)) * f, 0)
                    .normal(normal.x, normal.y, normal.z)
                    .endVertex();
        }
    }
}
