package com.code.aseoha.common.dimension.sky;

import dev.amble.ait.client.models.decoration.TardisStarModel;
import dev.amble.ait.client.renderers.AITRenderLayers;
import dev.amble.ait.tardis.Tardis;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.joml.Matrix4f;

public class StarRenderer {
        public static final Identifier TARDIS_STAR_TEXTURE = new Identifier("ait", "textures/environment/tardis_star.png");
//        private static final float HALF_SQRT_3 = (float)(Math.sqrt(3.0) / 2.0);

        public static void render(WorldRenderContext context, World world) {
            renderStar(context, world);
            renderShine(context, world);
        }

        public static void renderStar(WorldRenderContext context, World world) {
            Camera camera = context.camera();
            VertexConsumerProvider provider = context.consumers();
            Vec3d cameraPos = camera.getPos();
//            Vec3d targetPos = new Vec3d((double)tardis.engine().getCorePos().x(), (double)(context.world().getBottomY() - (tardis.isGrowth() ? 120 : 90)), (double)tardis.engine().getCorePos().y());
//            Vec3d targetpos = new Vec3d();
//            Vec3d diff = targetPos.subtract(cameraPos);
            MatrixStack matrixStack = new MatrixStack();
            matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(camera.getPitch()));
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(camera.getYaw() + 180.0F));
//            if (tardis.isGrowth()) {
//                matrixStack.translate((double)tardis.getDesktop().doorPos().getPos().getX(), diff.y, (double)tardis.getDesktop().doorPos().getPos().getX());
//            } else {
//                matrixStack.translate(tardis.engine().getCorePos().x != 0 ? diff.x - 0.5 : (double)tardis.getDesktop().doorPos().getPos().getX() - 0.5, diff.y, tardis.engine().getCorePos().y != 0 ? diff.z - 0.5 : (double)tardis.getDesktop().doorPos().getPos().getX() - 0.5);
//            }

            matrixStack.scale(20.0F, 20.0F, 20.0F);
            assert MinecraftClient.getInstance().player != null;
            matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float) MinecraftClient.getInstance().player.age / 200.0F * 360.0F));
            assert provider != null;
            TardisStarModel.getTexturedModelData().createModel().render(matrixStack, provider.getBuffer(AITRenderLayers.tardisEmissiveCullZOffset(TARDIS_STAR_TEXTURE, true)), 15728880, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 0.5F);
            matrixStack.scale(0.9F, 0.9F, 0.9F);
            TardisStarModel.getTexturedModelData().createModel().render(matrixStack, provider.getBuffer(AITRenderLayers.tardisEmissiveCullZOffset(TARDIS_STAR_TEXTURE, true)), 15728880, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
        }

        public static void renderShine(WorldRenderContext context, World world) {
//            if (!tardis.isGrowth()) {
                MatrixStack matrixStack = new MatrixStack();
                VertexConsumerProvider provider = context.consumers();
                Vec3d cameraPos = context.camera().getPos();
                Vec3d targetPos = new Vec3d((double)0, (double)((90)), (double)128);
                Vec3d diff = targetPos.subtract(cameraPos);
                float l = MinecraftClient.getInstance().getTickDelta() / 50120.0F;
                assert MinecraftClient.getInstance().player != null;
                float sinFunc = (float)Math.sin((double)((float)MinecraftClient.getInstance().player.age / 400.0F * 220.0F * 0.2F + 0.2F));
                Random random = Random.create(432L);
                assert provider != null;
                VertexConsumer vertexConsumer4 = provider.getBuffer(AITRenderLayers.getLightning());
                matrixStack.push();
                matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(context.camera().getPitch()));
                matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(context.camera().getYaw() + 180.0F));
//                    matrixStack.translate(tardis.engine().getCorePos().x != 0 ? diff.x - 0.5 : (double)tardis.getDesktop().doorPos().getPos().getX() - 0.5, diff.y, tardis.engine().getCorePos().y != 0 ? diff.z - 0.5 : (double)tardis.getDesktop().doorPos().getPos().getX() - 0.5);


                    matrixStack.scale(4.0F + sinFunc, 4.0F + sinFunc, 4.0F + sinFunc);

                matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees((float)MinecraftClient.getInstance().player.age / 200.0F * 360.0F));
                float m = Math.min(l > 0.8F ? (l - 0.8F) / 0.2F : 0.0F, 1.0F);

                for(int n = 0; n < 30; ++n) {
                    matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(random.nextFloat() * 360.0F));
                    matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(random.nextFloat() * 360.0F));
                    matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(random.nextFloat() * 360.0F));
                    matrixStack.multiply(RotationAxis.POSITIVE_X.rotationDegrees(random.nextFloat() * 360.0F));
                    matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(random.nextFloat() * 360.0F));
                    matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(random.nextFloat() * 360.0F + l * 90.0F));
                    float o = random.nextFloat() * 10.0F + 10.0F + m * 10.0F;
                    float p = random.nextFloat() * 0.5F + 1.0F + m * 2.0F;
                    Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
                    int q = (int)(255.0F * (1.0F - m));
                    putDeathLightSourceVertex(vertexConsumer4, matrix4f, q);
                    putDeathLightNegativeXTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightPositiveXTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightSourceVertex(vertexConsumer4, matrix4f, q);
                    putDeathLightPositiveXTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightPositiveZTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightSourceVertex(vertexConsumer4, matrix4f, q);
                    putDeathLightPositiveZTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightNegativeXTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightSourceVertex(vertexConsumer4, matrix4f, q);
                    putDeathLightPositiveZTerminalVertex(vertexConsumer4, matrix4f, o, p);
                    putDeathLightPositiveZTerminalVertex(vertexConsumer4, matrix4f, o, p);
                }

//            }
        }

        public static void putDeathLightSourceVertex(VertexConsumer buffer, Matrix4f matrix, int alpha) {
            buffer.vertex(matrix, 0.0F, 0.0F, 0.0F).color(255, 255, 255, alpha).next();
        }

        public static void putDeathLightNegativeXTerminalVertex(VertexConsumer buffer, Matrix4f matrix, float radius, float width) {
            buffer.vertex(matrix, -((float)(Math.sqrt(3.0) / 2.0)) * width, radius, -0.5F * width).color(255, 154, 0, 0).next();
        }

        public static void putDeathLightPositiveXTerminalVertex(VertexConsumer buffer, Matrix4f matrix, float radius, float width) {
            buffer.vertex(matrix, ((float)(Math.sqrt(3.0) / 2.0)) * width, radius, -0.5F * width).color(255, 154, 0, 0).next();
        }

        public static void putDeathLightPositiveZTerminalVertex(VertexConsumer buffer, Matrix4f matrix, float radius, float width) {
            buffer.vertex(matrix, 0.0F, radius, width).color(255, 154, 0, 0).next();
        }
    }
