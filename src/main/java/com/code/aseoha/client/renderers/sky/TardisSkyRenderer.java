package com.code.aseoha.client.renderers.sky;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.ISkyRenderHandler;
import net.tardis.mod.Tardis;
import net.tardis.mod.client.renderers.sky.Planet;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.opengl.GL11;

import java.util.Random;

@OnlyIn(Dist.CLIENT)
public class TardisSkyRenderer implements ISkyRenderHandler {

//    public static final ResourceLocation TEXTURE = new ResourceLocation(Tardis.MODID, "textures/sky/vortex.png");
    private VertexBuffer STAR_VBO;
    private VertexBuffer PLANET_VBO;
    private final ResourceLocation PLANETS_TEXTURE = new ResourceLocation(Tardis.MODID, "textures/sky/planets.png");
    private final VertexFormat FORMAT = DefaultVertexFormats.POSITION_COLOR;
    private final VertexFormat FORMAT_PLANET = DefaultVertexFormats.POSITION_TEX;
    
    @Override
    @SuppressWarnings("deprecation")
    public void render(int ticks, float partialTicks, MatrixStack matrixStack, ClientWorld world, Minecraft mc) {
        matrixStack.pushPose();
        BufferBuilder bb = Tessellator.getInstance().getBuilder();
        RenderSystem.disableTexture();
        RenderSystem.depthMask(false);
        RenderSystem.disableFog();
        RenderSystem.disableAlphaTest();
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.shadeModel(7425);
        this.generateOrDrawStars(bb, matrixStack);
        RenderSystem.enableAlphaTest();
        RenderSystem.depthMask(true);
        RenderSystem.disableBlend();
        RenderSystem.shadeModel(7424);

        RenderSystem.enableTexture();
        RenderSystem.disableAlphaTest();
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.depthMask(false);
        matrixStack.pushPose();//Planet push
        matrixStack.mulPose(Vector3f.ZP.rotation(world.getSunAngle(partialTicks)));
        matrixStack.translate(-10, 60, 60);
        float scale = 1.125F;
        matrixStack.scale(scale, scale, scale);
        Minecraft.getInstance().getTextureManager().bind(PLANETS_TEXTURE);
        this.generatePlanets(bb, matrixStack);
        matrixStack.popPose(); //Planet stack end
        RenderSystem.disableTexture();
        //Re enable properties
        RenderSystem.enableAlphaTest();
        RenderSystem.disableBlend();
        RenderSystem.depthMask(true);
        RenderSystem.enableFog();

        matrixStack.popPose();
    }

    private void generateOrDrawStars(BufferBuilder bufferbuilder, MatrixStack matrixStack){
        if (STAR_VBO == null) { //If the vbo is null (which it is when first called), initialise it and render our data onto it
            this.STAR_VBO = new VertexBuffer(this.FORMAT);
            this.renderSky(bufferbuilder, matrixStack);
            bufferbuilder.end();
            this.STAR_VBO.upload(bufferbuilder);
        }
        if (STAR_VBO != null) { //Once our rendering is done, setup the buffer and send the quads to the gpu
            STAR_VBO.bind();
            FORMAT.setupBufferState(0L);
            STAR_VBO.draw(matrixStack.last().pose(), GL11.GL_QUADS);
            VertexBuffer.unbind();
            FORMAT.clearBufferState();
        }

    }

    private void generatePlanets(BufferBuilder bufferbuilder, MatrixStack matrixStack){
        if (PLANET_VBO == null) {
            this.PLANET_VBO = new VertexBuffer(this.FORMAT);
            this.renderPlanets(bufferbuilder, matrixStack);
            bufferbuilder.end();
            this.PLANET_VBO.upload(bufferbuilder);
        }

        if(PLANET_VBO != null) {
            PLANET_VBO.bind();
            FORMAT_PLANET.setupBufferState(0L);
            PLANET_VBO.draw(matrixStack.last().pose(), GL11.GL_QUADS);
            VertexBuffer.unbind();
            FORMAT_PLANET.clearBufferState();
        }
    }

    private void renderPlanets(@NotNull BufferBuilder bb, @NotNull MatrixStack ms) {
        bb.begin(GL11.GL_QUADS, FORMAT_PLANET);
        Matrix4f matrix4f = ms.last().pose();
        /** NOTE TO FUTURE ME: THIS IS HOW UV'S ARE CALCULATED:
         * The U is the X axis on the texture, V is Y, the U and V both start at the top left of the texture, just like in HTML
         * to calculate the U/V coordinate, take the X/Y coordinate of the texture and divide it by the length of the axis you're measuring
         * The Planet.setXXXXXXXUVs() Params are as follows: Minimum U, Minimum V, Maximum U, Maximum V
         * Planet.setHorizontalUVs are for the bottom and tops of planets (Where the Y is the same on both sides of the 3D face)
         * Planet.setVerticalUVs are for the (NESW) Sides of planets (Where the X is the same on both sides of the 3D face
         */


        Planet mars = new Planet();
        mars.setHorizontalUVs(0.203125F, 0F, 0.29296875F, 0.08984375F);
        mars.setVerticleUVs(0.3046875F, 0F, 0.39453125F, 0.08984375F);

        Planet earth = new Planet();
        earth.setHorizontalUVs(0, 0, 0.08984375F, 0.08984375F);
        earth.setVerticleUVs(0.1015625F, 0, 0.19140625F, 0.08984375F);

        Planet sun = new Planet();
        sun.setHorizontalUVs(0, 0.1015625F, 0.03125F, 0.1328125F);
        sun.setVerticleUVs(0, 0.1015625F, 0.03125F, 0.1328125F);

//        Planet mars = new Planet();
//        mars.setHorizontalUVs(0, 0, 0.08984375F, 0.08984375F);
//        mars.setVerticleUVs(0.1015625F, 0, 0.19140625F, 0.08984375F);
        /**
         * For reference on these positionings, the planets rotate positive on the Z Axis
         * Which means basically nothing, they're all centered in a line on the X axis, and Z axis moves then along that line
         * Y just brings em up/down like normal
         */
        this.renderPlanet(bb, matrix4f, 0, 100, -80, 25, earth);   //3
        this.renderPlanet(bb, matrix4f, 0, 15, -200, 30, mars);      //2
        this.renderPlanet(bb, matrix4f, 20, 100, 0, 10, sun);       //1
    }

    private void renderSky(@NotNull BufferBuilder bb, @NotNull MatrixStack ms) {
        bb.begin(GL11.GL_QUADS, FORMAT);
        Random rand = new Random(666L);
        int skySize = 190;
        Matrix4f matrix4f = ms.last().pose();
        for(int i = 0; i < 1000; ++i){
            this.renderStarUp(bb, matrix4f, skySize - rand.nextFloat() * (skySize * 2), skySize, skySize - rand.nextFloat() * (skySize * 2));
        }

        for(int i = 0; i < 1000; ++i){
            this.renderStarSouth(bb, matrix4f, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2), skySize);
        }

        for(int i = 0; i < 1000; ++i){
            this.renderStarWest(bb, matrix4f, -skySize, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2));
        }

        for(int i = 0; i < 1000; ++i){
            this.renderStarNorth(bb, matrix4f, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2), -skySize);
        }

        for(int i = 0; i < 1000; ++i){
            this.renderStarEast(bb, matrix4f, skySize, skySize - rand.nextFloat() * (skySize * 2), skySize - rand.nextFloat() * (skySize * 2));
        }

        for(int i = 0; i < 1000; ++i){
            this.renderStarDown(bb, matrix4f, skySize - rand.nextFloat() * (skySize * 2), -skySize, skySize - rand.nextFloat() * (skySize * 2));
        }

    }

    private void renderPlanet(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z, float size, @NotNull Planet planet) {
        //NORTH
        bb.vertex(matrix4f, x, y, z).uv(planet.maxHU, planet.minHV).endVertex();
        bb.vertex(matrix4f, x, y + size, z).uv(planet.maxHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x - size, y + size, z).uv(planet.minHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x - size, y, z).uv(planet.minHU, planet.minHV).endVertex();

        //UP
        bb.vertex(matrix4f, x - size, y + size, z - size).uv(planet.minVU, planet.minVV).endVertex();
        bb.vertex(matrix4f, x - size, y + size, z).uv(planet.minVU, planet.maxVV).endVertex();
        bb.vertex(matrix4f, x, y + size, z).uv(planet.maxVU, planet.maxVV).endVertex();
        bb.vertex(matrix4f, x, y + size, z - size).uv(planet.maxVU, planet.minVV).endVertex();

        //East
        bb.vertex(matrix4f, x, y, z - size).uv(planet.minHU, planet.minHV).endVertex();
        bb.vertex(matrix4f, x, y + size, z - size).uv(planet.minHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x, y + size, z).uv(planet.maxHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x, y, z).uv(planet.maxHU, planet.minHV).endVertex();

        //West
        bb.vertex(matrix4f, x - size, y, z).uv(planet.minHU, planet.minHV).endVertex();
        bb.vertex(matrix4f, x - size, y + size, z).uv(planet.minHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x - size, y + size, z - size).uv(planet.maxHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x - size, y, z - size).uv(planet.maxHU, planet.minHV).endVertex();

        //SOUTH
        bb.vertex(matrix4f, x - size, y, z - size).uv(planet.minHU, planet.minHV).endVertex();
        bb.vertex(matrix4f, x - size, y + size, z - size).uv(planet.minHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x, y + size, z - size).uv(planet.maxHU, planet.maxHV).endVertex();
        bb.vertex(matrix4f, x, y, z - size).uv(planet.maxHU, planet.minHV).endVertex();

        //Down
        bb.vertex(matrix4f, x, y, z - size).uv(planet.maxVU, planet.minVV).endVertex();
        bb.vertex(matrix4f, x, y, z).uv(planet.maxVU, planet.maxVV).endVertex();
        bb.vertex(matrix4f, x - size, y, z).uv(planet.minVU, planet.maxVV).endVertex();
        bb.vertex(matrix4f, x - size, y, z - size).uv(planet.minVU, planet.minVV).endVertex();

    }

    private void renderStarUp(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z){
        float size = 0.5F;
        bb.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x + size, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x + size, y, z + size).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y, z + size).color(1F, 1, 1, 1).endVertex();
    }

    private void renderStarSouth(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z){
        float size = 0.5F;
        bb.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y + size, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x + size, y + size, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x + size, y, z).color(1F, 1, 1, 1).endVertex();
    }

    private void renderStarWest(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z){
        float size = 0.5F;
        bb.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y, z - size).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y + size, z - size).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y + size, z).color(1F, 1, 1, 1).endVertex();
    }

    private void renderStarNorth(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z){
        float size = 0.5F;
        bb.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y + size, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x - size, y + size, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x - size, y, z).color(1F, 1, 1, 1).endVertex();
    }

    private void renderStarEast(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z){
        float size = 0.5F;
        bb.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y + size, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y + size, z - size).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y, z - size).color(1F, 1, 1, 1).endVertex();
    }

    private void renderStarDown(@NotNull BufferBuilder bb, Matrix4f matrix4f, float x, float y, float z){
        float size = 0.5F;
        bb.vertex(matrix4f, x, y, z).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x, y, z + size).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x + size, y, z + size).color(1F, 1, 1, 1).endVertex();
        bb.vertex(matrix4f, x + size, y, z).color(1F, 1, 1, 1).endVertex();
    }

    public void drawQuad(@NotNull BufferBuilder bb, int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        bb.vertex(minX, minY, minZ).uv(0, 0).endVertex();
        bb.vertex(maxX, minY, minZ).uv(1, 0).endVertex();
        bb.vertex(maxX, maxY, minZ).uv(1, 1).endVertex();
        bb.vertex(minX, maxY, minZ).uv(0, 1).endVertex();
    }

}
