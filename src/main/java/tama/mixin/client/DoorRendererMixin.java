package tama.mixin.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.tardis.mod.blockentities.InteriorDoorTile;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.renderers.tiles.InteriorDoorRender;
import org.checkerframework.checker.units.qual.A;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InteriorDoorRender.class)
public abstract class DoorRendererMixin {

        /**
         * @author codiak
         * @reason half of a BOTI effect while in flight
         */
        @Inject(remap = false, method = "render", at = @At(value = "TAIL"))
        public void render(ITardisLevel tardis, InteriorDoorTile tile, PoseStack pose, MultiBufferSource buffer, float ageInTicks, int packedLight, int packedOverlay, CallbackInfo ci){
            pose.pushPose();

            // Center on block
            pose.translate(0, 0, 0);

            // ========== STEP 1: Write quad into stencil ==========
            GL11.glEnable(GL11.GL_STENCIL_TEST);

            GL11.glClear(GL11.GL_STENCIL_BUFFER_BIT);
            GL11.glStencilFunc(GL11.GL_ALWAYS, 1, 0xFF);
            GL11.glStencilOp(GL11.GL_KEEP, GL11.GL_KEEP, GL11.GL_REPLACE);


            drawQuad(pose, 1, 2); // width=1, height=2

            // ========== STEP 2: Render only where stencil == 1 ==========
            RenderSystem.stencilFunc(GL11.GL_EQUAL, 1, 0xFF);
            RenderSystem.stencilOp(GL11.GL_KEEP, GL11.GL_KEEP, GL11.GL_KEEP);

            RenderSystem.disableDepthTest();

            // Example "see through" effect: colored quad
            drawColoredQuad(pose, 1, 2, 0.0f, 0.8f, 1.0f, 0.5f); // cyan tinted

            RenderSystem.enableDepthTest();

            GL11.glDisable(GL11.GL_STENCIL_TEST);

            pose.popPose();
        }

        private void drawQuad(PoseStack poseStack, float width, float height) {
            BufferBuilder builder = Tesselator.getInstance().getBuilder();
            builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION);
            var matrix = poseStack.last().pose();

            builder.vertex(matrix, 0, 0, 0).endVertex();
            builder.vertex(matrix, 0, height, 0).endVertex();
            builder.vertex(matrix, width, height, 0).endVertex();
            builder.vertex(matrix, width, 0, 0).endVertex();

            Tesselator.getInstance().end();
        }

        private void drawColoredQuad(PoseStack poseStack, float width, float height,
                                     float r, float g, float b, float a) {
            BufferBuilder builder = Tesselator.getInstance().getBuilder();
            builder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_COLOR);
            var matrix = poseStack.last().pose();

            builder.vertex(matrix, 0, 0, 0).color(r, g, b, a).endVertex();
            builder.vertex(matrix, 0, height, 0).color(r, g, b, a).endVertex();
            builder.vertex(matrix, width, height, 0).color(r, g, b, a).endVertex();
            builder.vertex(matrix, width, 0, 0).color(r, g, b, a).endVertex();

            Tesselator.getInstance().end();
        }
}
