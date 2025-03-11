package com.code.aseoha.common.dimension.sky;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.VertexBuffer;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public class GallifreySkyRenderer implements DimensionRenderingRegistry.SkyRenderer {
public GallifreySkyRenderer(){}
    @Nullable
    private VertexBuffer starsBuffer;
    @Nullable
    private VertexBuffer lightSkyBuffer;
    @Nullable
    private VertexBuffer darkSkyBuffer;
    private MinecraftClient client;
    private static final Identifier MOON_PHASES = new Identifier("textures/environment/moon_phases.png");
    private static final Identifier SUN = new Identifier("aseoha","textures/sky/double_sun.png");
    private VertexBuffer STAR_VERTEX_BUFFER;
    private final VertexFormat VERTEX_FORMAT = VertexFormats.POSITION_COLOR;

    @Override
    public void render(WorldRenderContext context) {
        this.renderStars();
        this.renderLightSky();
        this.renderDarkSky();
        MatrixStack matrices = context.matrixStack();
        Camera camera = context.camera();
        this.client = MinecraftClient.getInstance();

            CameraSubmersionType cameraSubmersionType = camera.getSubmersionType();
            if (cameraSubmersionType != CameraSubmersionType.POWDER_SNOW && cameraSubmersionType != CameraSubmersionType.LAVA && !this.hasBlindnessOrDarkness(camera)) {
                    Vec3d vec3d = context.world().getSkyColor(this.client.gameRenderer.getCamera().getPos(), context.tickDelta());
                    float f = (float)vec3d.x;
                    float g = (float)vec3d.y;
                    float h = (float)vec3d.z;
                    BackgroundRenderer.setFogBlack();
                    BufferBuilder bufferBuilder = Tessellator.getInstance().getBuffer();
                    RenderSystem.depthMask(false);
                    RenderSystem.setShaderColor(f, g, h, 1.0F);
                    ShaderProgram shaderProgram = RenderSystem.getShader();
                    this.lightSkyBuffer.bind();
                    this.lightSkyBuffer.draw(matrices.peek().getPositionMatrix(), context.projectionMatrix(), shaderProgram);
                    VertexBuffer.unbind();
                    RenderSystem.enableBlend();
                    float[] fs = context.world().getDimensionEffects().getFogColorOverride(context.world().getSkyAngle(context.tickDelta()), context.tickDelta());
                    float i;
                    float k;
                    float o;
                    float p;
                    float q;
                    if (fs != null) {
                        RenderSystem.setShader(GameRenderer::getPositionColorProgram);
                        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                        matrices.push();
                        matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F));
                        i = MathHelper.sin(context.world().getSkyAngleRadians(context.tickDelta())) < 0.0F ? 180.0F : 0.0F;
                        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(i));
                        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(90.0F));
                        float j = fs[0];
                        k = fs[1];
                        float l = fs[2];
                        Matrix4f matrix4f = matrices.peek().getPositionMatrix();
                        bufferBuilder.begin(VertexFormat.DrawMode.TRIANGLE_FAN, VertexFormats.POSITION_COLOR);
                        bufferBuilder.vertex(matrix4f, 0.0F, 100.0F, 0.0F).color(j, k, l, fs[3]).next();
                        int m = 1;

                        for(int n = 0; n <= 16; ++n) {
                            o = (float)n * 6.2831855F / 16.0F;
                            p = MathHelper.sin(o);
                            q = MathHelper.cos(o);
                            bufferBuilder.vertex(matrix4f, p * 120.0F, q * 120.0F, -q * 40.0F * fs[3]).color(fs[0], fs[1], fs[2], 0.0F).next();
                        }

                        BufferRenderer.drawWithGlobalProgram(bufferBuilder.end());
                        matrices.pop();
                    }

                    RenderSystem.blendFuncSeparate(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE, GlStateManager.SrcFactor.ONE, GlStateManager.DstFactor.ZERO);
                    matrices.push();
                    i = 1.0F - context.world().getRainGradient(context.tickDelta());
                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, i);
                    matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90.0F));
                    matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(context.world().getSkyAngle(context.tickDelta()) * 360.0F));
                    Matrix4f matrix4f2 = matrices.peek().getPositionMatrix();
                    k = 30.0F;
                    RenderSystem.setShader(GameRenderer::getPositionTexProgram);
                    RenderSystem.setShaderTexture(0, SUN);
                    bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
                    bufferBuilder.vertex(matrix4f2, -k, 100.0F, -k).texture(0.0F, 0.0F).next();
                    bufferBuilder.vertex(matrix4f2, k, 100.0F, -k).texture(1.0F, 0.0F).next();
                    bufferBuilder.vertex(matrix4f2, k, 100.0F, k).texture(1.0F, 1.0F).next();
                    bufferBuilder.vertex(matrix4f2, -k, 100.0F, k).texture(0.0F, 1.0F).next();
                    BufferRenderer.drawWithGlobalProgram(bufferBuilder.end());
                    k = 20.0F;
                    RenderSystem.setShaderTexture(0, MOON_PHASES);
                    int r = context.world().getMoonPhase();
                    int s = r % 4;
                    int m = r / 4 % 2;
                    float t = (float)(s + 0) / 4.0F;
                    o = (float)(m + 0) / 2.0F;
                    p = (float)(s + 1) / 4.0F;
                    q = (float)(m + 1) / 2.0F;
                    bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
                    bufferBuilder.vertex(matrix4f2, -k, -100.0F, k).texture(p, q).next();
                    bufferBuilder.vertex(matrix4f2, k, -100.0F, k).texture(t, q).next();
                    bufferBuilder.vertex(matrix4f2, k, -100.0F, -k).texture(t, o).next();
                    bufferBuilder.vertex(matrix4f2, -k, -100.0F, -k).texture(p, o).next();
                    BufferRenderer.drawWithGlobalProgram(bufferBuilder.end());
                    float u = context.world().method_23787(context.tickDelta()) * i;
                    if (u > 0.0F) {
                        RenderSystem.setShaderColor(u, u, u, u);
                        BackgroundRenderer.clearFog();
                        this.starsBuffer.bind();
                        this.starsBuffer.draw(matrices.peek().getPositionMatrix(), context.projectionMatrix(), GameRenderer.getPositionProgram());
                        VertexBuffer.unbind();
                    }

                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                    RenderSystem.disableBlend();
                    RenderSystem.defaultBlendFunc();
                    matrices.pop();
                    RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
                    double d = this.client.player.getCameraPosVec(context.tickDelta()).y - context.world().getLevelProperties().getSkyDarknessHeight(context.world());
                    if (d < 0.0) {
                        matrices.push();
                        matrices.translate(0.0F, 12.0F, 0.0F);
                        this.darkSkyBuffer.bind();
                        this.darkSkyBuffer.draw(matrices.peek().getPositionMatrix(), context.projectionMatrix(), shaderProgram);
                        VertexBuffer.unbind();
                        matrices.pop();
                    }

                    RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                    RenderSystem.depthMask(true);

            }
    }

    private void renderDarkSky() {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        if (this.darkSkyBuffer != null) {
            this.darkSkyBuffer.close();
        }

        this.darkSkyBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
        BufferBuilder.BuiltBuffer builtBuffer = renderSky(bufferBuilder, -16.0F);
        this.darkSkyBuffer.bind();
        this.darkSkyBuffer.upload(builtBuffer);
        VertexBuffer.unbind();
    }

    private void renderLightSky() {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        if (this.lightSkyBuffer != null) {
            this.lightSkyBuffer.close();
        }

        this.lightSkyBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
        BufferBuilder.BuiltBuffer builtBuffer = renderSky(bufferBuilder, 16.0F);
        this.lightSkyBuffer.bind();
        this.lightSkyBuffer.upload(builtBuffer);
        VertexBuffer.unbind();
    }

    private static BufferBuilder.BuiltBuffer renderSky(BufferBuilder builder, float f) {
        float g = Math.signum(f) * 512.0F;
        float h = 512.0F;
        RenderSystem.setShader(GameRenderer::getPositionProgram);
        builder.begin(VertexFormat.DrawMode.TRIANGLE_FAN, VertexFormats.POSITION);
        builder.vertex(0.0, (double)f, 0.0).next();

        for(int i = -180; i <= 180; i += 45) {
            builder.vertex((double)(g * MathHelper.cos((float)i * 0.017453292F)), (double)f, (double)(512.0F * MathHelper.sin((float)i * 0.017453292F))).next();
        }

        return builder.end();
    }

    private boolean hasBlindnessOrDarkness(Camera camera) {
        Entity var3 = camera.getFocusedEntity();
        if (!(var3 instanceof LivingEntity livingEntity)) {
            return false;
        } else {
            return livingEntity.hasStatusEffect(StatusEffects.BLINDNESS) || livingEntity.hasStatusEffect(StatusEffects.DARKNESS);
        }
    }


    private void renderStars() {
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();
        RenderSystem.setShader(GameRenderer::getPositionProgram);
        if (this.starsBuffer != null) {
            this.starsBuffer.close();
        }

        this.starsBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
        BufferBuilder.BuiltBuffer builtBuffer = this.renderStars(bufferBuilder);
        this.starsBuffer.bind();
        this.starsBuffer.upload(builtBuffer);
        VertexBuffer.unbind();
    }

    private BufferBuilder.BuiltBuffer renderStars(BufferBuilder buffer) {
        Random random = Random.create(10842L);
        buffer.begin(VertexFormat.DrawMode.QUADS, VertexFormats.POSITION);

        for(int i = 0; i < 1500; ++i) {
            double d = random.nextFloat() * 2.0F - 1.0F;
            double e = random.nextFloat() * 2.0F - 1.0F;
            double f = random.nextFloat() * 2.0F - 1.0F;
            double g = 0.15F + random.nextFloat() * 0.1F;
            double h = d * d + e * e + f * f;
            if (h < 1.0 && h > 0.01) {
                h = 1.0 / Math.sqrt(h);
                d *= h;
                e *= h;
                f *= h;
                double j = d * 100.0;
                double k = e * 100.0;
                double l = f * 100.0;
                double m = Math.atan2(d, f);
                double n = Math.sin(m);
                double o = Math.cos(m);
                double p = Math.atan2(Math.sqrt(d * d + f * f), e);
                double q = Math.sin(p);
                double r = Math.cos(p);
                double s = random.nextDouble() * Math.PI * 2.0;
                double t = Math.sin(s);
                double u = Math.cos(s);

                for(int v = 0; v < 4; ++v) {
                    double x = (double)((v & 2) - 1) * g;
                    double y = (double)((v + 1 & 2) - 1) * g;
                    double aa = x * u - y * t;
                    double ab = y * u + x * t;
                    double ad = aa * q + 0.0 * r;
                    double ae = 0.0 * q - aa * r;
                    double af = ae * n - ab * o;
                    double ah = ab * n + ae * o;
                    buffer.vertex(j + af, k + ad, l + ah).next();
                }
            }
        }

        return buffer.end();
    }

}
