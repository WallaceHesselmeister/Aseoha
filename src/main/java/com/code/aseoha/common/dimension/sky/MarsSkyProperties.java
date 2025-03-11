package com.code.aseoha.common.dimension.sky;

import blue.endless.jankson.annotation.Nullable;
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
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

import java.util.Random;

public class MarsSkyProperties implements DimensionRenderingRegistry.SkyRenderer {
    public static final float[] SUNSET_COLORS = {0, 0, 0, 0};

    public MarsSkyProperties() {
//        super(Overworld.CLOUDS_HEIGHT, true, SkyType.NONE, true, false);
//            this.
    }

    private VertexBuffer STAR_VERTEX_BUFFER;
    private final VertexFormat VERTEX_FORMAT = VertexFormats.POSITION_COLOR;

    @Environment(EnvType.CLIENT)
    @Override
    public void render(WorldRenderContext context) {
        MatrixStack matrixStack = context.matrixStack();

        matrixStack.push();
        BufferBuilder bufferBuilder = Tessellator.getInstance().getBuffer();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SrcFactor.SRC_ALPHA, GlStateManager.DstFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SrcFactor.ONE, GlStateManager.DstFactor.ZERO);
        this.generateOrDrawStars(bufferBuilder, matrixStack);
        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
        matrixStack.pop();
    }

    @Environment(EnvType.CLIENT)
    private void generateOrDrawStars(BufferBuilder bufferbuilder, MatrixStack matrixStack) {
        if (STAR_VERTEX_BUFFER == null) {
            this.STAR_VERTEX_BUFFER = this.VERTEX_FORMAT.getBuffer();
            this.RenderSky(bufferbuilder, matrixStack);
//            bufferbuilder.end();
            this.STAR_VERTEX_BUFFER.upload(bufferbuilder.end());
        }
        if (STAR_VERTEX_BUFFER != null) {
            Matrix4f urrrrrghghghghghghghg = matrixStack.peek().getPositionMatrix();
            ShaderProgram shaderProgram = RenderSystem.getShader();
            STAR_VERTEX_BUFFER.bind();
            VERTEX_FORMAT.setupState();
            STAR_VERTEX_BUFFER.draw(matrixStack.peek().getPositionMatrix(), urrrrrghghghghghghghg, shaderProgram);
            VertexBuffer.unbind();
            VERTEX_FORMAT.clearState();
        }

    }

//    private void generatePlanets(BufferBuilder bufferbuilder, MatrixStack matrixStack){
//        if (PLANET_VERTEX_BUFFER == null) {
//            this.PLANET_VERTEX_BUFFER = new VertexBuffer(this.VERTEX_FORMAT);
//            this.RenderSinglePlanets(bufferbuilder, matrixStack);
////            bufferbuilder.end();
//            this.PLANET_VERTEX_BUFFER.upload(bufferbuilder.end());
//        }
//
//        if(PLANET_VERTEX_BUFFER != null) {
//            PLANET_VERTEX_BUFFER.bind();
//            PLANET_VERTEX_FORMAT.setupState();
//            PLANET_VERTEX_BUFFER.draw(matrixStack.peek().getPositionMatrix(), GL11.GL_QUADS);
//            VertexBuffer.unbind();
//            PLANET_VERTEX_FORMAT.clearState();
//        }
//    }

    //    private void RenderSinglePlanets(BufferBuilder bufferBuilder, MatrixStack matrixStack) {
//        bufferBuilder.begin(GL11.GL_QUADS,PLANET_VERTEX_FORMAT);
//        Matrix4f matrix4f = matrixStack.last().pose();
//
//        PlanetUVs mars = new PlanetUVs();
//        mars.SetHorizontalUVs(0.203125F, 0F, 0.29296875F, 0.08984375F);
//        mars.SetVerticleUVs(0.3046875F, 0F, 0.39453125F, 0.08984375F);
//
//        this.RenderSinglePlanet(bufferBuilder, matrix4f, 45, -26, -40, 25, mars);
////        this.RenderSinglePlanet(bufferBuilder, matrix4f, 23, 100, 0, 10, sun);
//    }
    @Environment(EnvType.CLIENT)
    private void RenderSky(@NotNull BufferBuilder bufferBuilder, @NotNull MatrixStack matrixStack) {
        bufferBuilder.begin(VertexFormat.DrawMode.QUADS, VERTEX_FORMAT); //GL11.GL_QUADS
        assert MinecraftClient.getInstance().world != null;
        Random rand = new Random(MinecraftClient.getInstance().world.getTime());
        int skySize = 190;
        Matrix4f matrix4f = matrixStack.peek().getPositionMatrix();
        for (int i = 0; i < 1000; ++i) {
            this.RenderStarDirectionUp(bufferBuilder, matrix4f, skySize - rand.nextFloat() * (skySize * 2), skySize, skySize - rand.nextFloat() * (skySize * 2));
        }

        for (int i = 0; i < 1000; ++i) {
            this.RenderStarDirectionS(bufferBuilder, matrix4f, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2), skySize);
        }

        for (int i = 0; i < 1000; ++i) {
            this.RenderStarDirectionW(bufferBuilder, matrix4f, -skySize, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2));
        }

        for (int i = 0; i < 1000; ++i) {
            this.RenderStarDirectionN(bufferBuilder, matrix4f, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2), -skySize);
        }

        for (int i = 0; i < 1000; ++i) {
            this.RenderStarDirectionE(bufferBuilder, matrix4f, skySize, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2));
        }

        for (int i = 0; i < 1000; ++i) {
            this.renderStarDown(bufferBuilder, matrix4f, skySize - rand.nextFloat() * (skySize * 2), -skySize, skySize - rand.nextFloat() * (skySize * 2));
        }

    }

    //    private void RenderSinglePlanet(BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z, float size, PlanetUVs planet) {
//        //NORTH
//        bufferBuilder.vertex(matrix4f, x, y, z).texture(planet.MaximumHU, planet.MinimumHV).next();
//        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).texture(planet.MaximumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z).texture(planet.MinimumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z).texture(planet.MinimumHU, planet.MinimumHV).next();
//
//        //UP
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z - 0.5F).texture(planet.MinimumVU, planet.MinimumVV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z).texture(planet.MinimumVU, planet.MaximumVV).next();
//        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).texture(planet.MaximumVU, planet.MaximumVV).next();
//        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z - 0.5F).texture(planet.MaximumVU, planet.MinimumVV).next();
//
//        //East
//        bufferBuilder.vertex(matrix4f, x, y, z - 0.5F).texture(planet.MinimumHU, planet.MinimumHV).next();
//        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z - 0.5F).texture(planet.MinimumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).texture(planet.MaximumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x, y, z).texture(planet.MaximumHU, planet.MinimumHV).next();
//
//        //West
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z).texture(planet.MinimumHU, planet.MinimumHV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z).texture(planet.MinimumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z - 0.5F).texture(planet.MaximumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z - 0.5F).texture(planet.MaximumHU, planet.MinimumHV).next();
//
//        //SOUTH
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z - 0.5F).texture(planet.MinimumHU, planet.MinimumHV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z - 0.5F).texture(planet.MinimumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z - 0.5F).texture(planet.MaximumHU, planet.MaximumHV).next();
//        bufferBuilder.vertex(matrix4f, x, y, z - 0.5F).texture(planet.MaximumHU, planet.MinimumHV).next();
//
//        //Down
//        bufferBuilder.vertex(matrix4f, x, y, z - 0.5F).texture(planet.MaximumVU, planet.MinimumVV).next();
//        bufferBuilder.vertex(matrix4f, x, y, z).texture(planet.MaximumVU, planet.MaximumVV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z).texture(planet.MinimumVU, planet.MaximumVV).next();
//        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z - 0.5F).texture(planet.MinimumVU, planet.MinimumVV).next();
//
//    }
    @Environment(EnvType.CLIENT)
    private void RenderStarDirectionUp(@NotNull BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z) {
        bufferBuilder.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x + 0.5F, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x + 0.5F, y, z + 0.5F).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y, z + 0.5F).color(1F, 1, 1, 1).next();
    }

    @Environment(EnvType.CLIENT)
    private void RenderStarDirectionS(@NotNull BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z) {
        bufferBuilder.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x + 0.5F, y + 0.5F, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x + 0.5F, y, z).color(1F, 1, 1, 1).next();
    }

    @Environment(EnvType.CLIENT)
    private void RenderStarDirectionW(@NotNull BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z) {
        bufferBuilder.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y, z - 0.5F).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z - 0.5F).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).color(1F, 1, 1, 1).next();
    }

    @Environment(EnvType.CLIENT)
    private void RenderStarDirectionN(@NotNull BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z) {
        bufferBuilder.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x - 0.5F, y + 0.5F, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x - 0.5F, y, z).color(1F, 1, 1, 1).next();
    }

    @Environment(EnvType.CLIENT)
    private void RenderStarDirectionE(@NotNull BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z) {
        bufferBuilder.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y + 0.5F, z - 0.5F).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y, z - 0.5F).color(1F, 1, 1, 1).next();
    }

    @Environment(EnvType.CLIENT)
    private void renderStarDown(@NotNull BufferBuilder bufferBuilder, Matrix4f matrix4f, float x, float y, float z) {
        bufferBuilder.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x, y, z + 0.5F).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x + 0.5F, y, z + 0.5F).color(1F, 1, 1, 1).next();
        bufferBuilder.vertex(matrix4f, x + 0.5F, y, z).color(1F, 1, 1, 1).next();
    }
}


//adjustSkyColor
//    @Override
//    public Vec3d adjustFogColor(Vec3d color, float sunHeight) {
//        return new Vec3d(0, 0, 0);
//    }
//
//    //isFoggyAt
//    @Override
//    public boolean useThickFog(int camX, int camY) {
//        return false;
//    }
//
//    @Nullable
//    @Override
//    public float[] getFogColorOverride(float p_230492_1_, float p_230492_2_) {
//        return SUNSET_COLORS;
//    }
