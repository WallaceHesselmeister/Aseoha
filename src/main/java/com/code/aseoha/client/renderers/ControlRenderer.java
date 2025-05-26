package com.code.aseoha.client.renderers;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.controls.*;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.entity.ControlEntity;

import java.awt.*;

public class ControlRenderer {
    private static final SonicScrewdriverHolderModel holder = new SonicScrewdriverHolderModel();
    private static final GaugeDisplayModel gaugeDisplay = new GaugeDisplayModel();
    private static final GaugeNeedleModel gaugeNeedle = new GaugeNeedleModel();
    private static final ValveWheelModel wheel = new ValveWheelModel();
    private static final LeverModel lever = new LeverModel();
    private static final LeverBaseModel leverBase = new LeverBaseModel();
    private static final ScreenFrameModel screenFrame = new ScreenFrameModel();
    private static final ScreenModel screen = new ScreenModel();
    private static final ButtonModel button = new ButtonModel();
    private static final PushLeverModel pushSwitch = new PushLeverModel();
    private static final SpecialLeverModel specLever = new SpecialLeverModel();
    private static final SchemaDisplayModel schemaDisplay = new SchemaDisplayModel();
    private static final TardisLightModel light = new TardisLightModel();
    private final TextureManager textureManager;

    public final ResourceLocation SCHEMA_DISPLAY_TEXTURE = new ResourceLocation(aseoha.MODID, "textures/models/SchemaDisplay.png");
    public final ResourceLocation SONIC_SCREWDRIVER_TEXTURE = new ResourceLocation(aseoha.MODID, "textures/models/SonicScrewdriverHolder.png");
    public final ResourceLocation GAUGE_DISPLAY_TEXTURE = new ResourceLocation(aseoha.MODID, "textures/models/TardisConsoleGaugeDisplay.png");
    public final ResourceLocation GAUGE_NEEDLE = new ResourceLocation(aseoha.MODID, "textures/models/TardisConsoleGaugeNeedle.png");
    public final ResourceLocation VALVE_WHEEL = new ResourceLocation(aseoha.MODID, "textures/models/TardisValveWheel.png");
    public final ResourceLocation LIGHT = new ResourceLocation(aseoha.MODID, "textures/models/Light.png");
    public final ResourceLocation LEVER_BASE = new ResourceLocation(aseoha.MODID, "textures/models/TardisConsoleLeverBase.png");
    public final ResourceLocation LEVER = new ResourceLocation(aseoha.MODID, "textures/models/TardisConsoleLever.png");
    public final ResourceLocation SPECIAL_LEVER = new ResourceLocation(aseoha.MODID, "textures/models/SpecialLever.png");
    public final ResourceLocation SCREEN_FRAME = new ResourceLocation(aseoha.MODID, "textures/models/ScreenFrame.png");
    public final ResourceLocation PUSH_LEVER = new ResourceLocation(aseoha.MODID, "textures/models/PushLever.png");

    public ControlRenderer(Font font, TextureManager textureManager) {
        this.textureManager = textureManager;
    }

    protected void bindTexture(ResourceLocation resourceLocation) {
        if (this.textureManager != null) {
            this.textureManager.bind(resourceLocation);
        }
    }

    private void handleSettings(MatrixStack matrixStack, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ) {
        matrixStack.translate(x, y, z);
        matrixStack.mulPose(Vector3f.ZP.rotationDegrees((float) rZ));
        matrixStack.mulPose(Vector3f.YP.rotationDegrees((float) rY));
        matrixStack.mulPose(Vector3f.XP.rotationDegrees((float) rX));
        matrixStack.scale((float) sX, (float) sY, (float) sZ);
    }

    private void resetHighlight() {
        RenderSystem.depthFunc(515); // GL_LEQUAL
    }

    private float[] getHighlightColor(ControlEntity te, int controlID) {
        if (controlID >= 0 && te.getControl().getAnimationProgress() >= 0.0) {
            double hi = te.getControl().getAnimationProgress();
            RenderSystem.depthFunc(519); // GL_ALWAYS
            return new float[] { (float) (0.2 * hi), (float) (0.5 * hi), (float) hi, 1.0F };
        }
        return new float[] { 1.0F, 1.0F, 1.0F, 1.0F };
    }

    public void renderTextScreen(Tessellator tess, ControlEntity tce, String s, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        matrixStack.translate(-0.0125, -0.03, 0.0025);
        this.bindTexture(SCHEMA_DISPLAY_TEXTURE);
        schemaDisplay.renderToBuffer(matrixStack, buffer.getBuffer(RenderType.entitySolid(SCHEMA_DISPLAY_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.pushPose();
        RenderSystem.depthMask(false);
        matrixStack.scale(0.022F, 0.022F, 0.022F);
        if (s != null) {
            Minecraft.getInstance().font.draw(matrixStack, s.length() > 18 ? s.substring(0, 18) : s, 0, 0, 16579836);
        }
        RenderSystem.depthMask(true);
        matrixStack.popPose();

        matrixStack.popPose();
        this.resetHighlight();
    }

    public void renderScrewdriverHolder(Tessellator tess, ControlEntity te, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);
        this.resetHighlight();
        this.bindTexture(SONIC_SCREWDRIVER_TEXTURE);
        holder.renderToBuffer(matrixStack, buffer.getBuffer(holder.renderType(SONIC_SCREWDRIVER_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();
    }

    public void renderScrewdriver(Tessellator tess, ControlEntity te, int slot, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
//        ScrewdriverHelper helper = te.getScrewHelper(slot);
//        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
//        if (helper != null) {
//            matrixStack.pushPose();
//            this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);
//            this.resetHighlight();
//            // TODO: Add screwdriver rendering to this console crap
//            this.resetHighlight();
//            matrixStack.popPose();
//        }
    }

    public void renderGauge(Tessellator tess, ControlEntity te, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);
        this.resetHighlight();

        matrixStack.pushPose();
        this.bindTexture(GAUGE_DISPLAY_TEXTURE);
        gaugeDisplay.renderToBuffer(matrixStack, buffer.getBuffer(gaugeDisplay.renderType(GAUGE_DISPLAY_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.pushPose();
        this.bindTexture(GAUGE_NEEDLE);
        matrixStack.translate(0.15, 0.175, 0.0625);
        matrixStack.mulPose(Vector3f.ZP.rotationDegrees((float) (-90.0 - te.getControl().getAnimationProgress() * 180.0)));
        matrixStack.scale(0.25F, 0.4F, 0.25F);
        gaugeNeedle.renderToBuffer(matrixStack, buffer.getBuffer(gaugeNeedle.renderType(GAUGE_NEEDLE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.popPose();
    }

    public void renderGauges(Tessellator tess, ControlEntity te, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack, int... ids) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);
        this.resetHighlight();

        matrixStack.pushPose();
        this.bindTexture(GAUGE_DISPLAY_TEXTURE);
        gaugeDisplay.renderToBuffer(matrixStack, buffer.getBuffer(gaugeDisplay.renderType(GAUGE_DISPLAY_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        for (int id : ids) {
            matrixStack.pushPose();
            this.bindTexture(GAUGE_NEEDLE);
            matrixStack.translate(0.15, 0.175, 0.0625);
            matrixStack.mulPose(Vector3f.ZP.rotationDegrees((float) (-90.0 - te.getControl().getAnimationProgress() * 180.0)));
            matrixStack.scale(0.25F, 0.4F, 0.25F);
            gaugeNeedle.renderToBuffer(matrixStack, buffer.getBuffer(gaugeNeedle.renderType(GAUGE_NEEDLE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
            matrixStack.popPose();
        }

        matrixStack.popPose();
    }

    public void renderWheel(Tessellator tess, ControlEntity te, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);
        matrixStack.mulPose(Vector3f.YP.rotationDegrees((float) (te.getControl().getAnimationProgress() * 360.0)));
        matrixStack.translate(-0.03125, 0.0, -0.03125);
        float[] color = getHighlightColor(te, id);
        this.bindTexture(VALVE_WHEEL);
        wheel.renderToBuffer(matrixStack, buffer.getBuffer(wheel.renderType(VALVE_WHEEL)), 15728880, 65536, color[0], color[1], color[2], color[3]);
        matrixStack.popPose();
    }

    public void renderLight(Tessellator tess, ControlEntity te, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.resetHighlight();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        this.bindTexture(SONIC_SCREWDRIVER_TEXTURE);
        holder.renderToBuffer(matrixStack, buffer.getBuffer(holder.renderType(SONIC_SCREWDRIVER_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.pushPose();
        matrixStack.scale(0.6F, 0.6F, 0.6F);
        matrixStack.translate(-0.125, -0.05, -0.125);
        this.bindTexture(LIGHT);
        float r = 1.0F, g = 1.0F, b = 1.0F, a = 1.0F;
        light.renderToBuffer(matrixStack, buffer.getBuffer(light.renderType(LIGHT)), 15728880, 65536, r, g, b, a);
        this.resetHighlight();
        matrixStack.popPose();

        matrixStack.popPose();
    }

    public void renderLever(Tessellator tess, ControlEntity te, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        matrixStack.mulPose(Vector3f.XP.rotationDegrees((float) (te.getControl().getAnimationProgress() * 140.0 - 70.0)));
        float[] color = getHighlightColor(te, id);
        this.bindTexture(LEVER);
        lever.renderToBuffer(matrixStack, buffer.getBuffer(lever.renderType(LEVER)), 15728880, 65536, color[0], color[1], color[2], color[3]);
        this.resetHighlight();
        matrixStack.popPose();

        matrixStack.pushPose();
        this.bindTexture(LEVER_BASE);
        leverBase.renderToBuffer(matrixStack, buffer.getBuffer(leverBase.renderType(LEVER_BASE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.popPose();
    }

    public void renderSpecialLever(Tessellator tess, ControlEntity te, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        matrixStack.mulPose(Vector3f.ZP.rotationDegrees((float) (70.0 - te.getControl().getAnimationProgress() * 140.0)));
        matrixStack.translate(-0.03125, -0.15625, 0.0);
        float[] color = getHighlightColor(te, id);
        this.bindTexture(SPECIAL_LEVER);
        specLever.renderToBuffer(matrixStack, buffer.getBuffer(specLever.renderType(SPECIAL_LEVER)), 15728880, 65536, color[0], color[1], color[2], color[3]);
        this.resetHighlight();
        matrixStack.popPose();

        matrixStack.pushPose();
        this.resetHighlight();
        matrixStack.translate(0.0, 0.0, 0.0625);
        this.bindTexture(LEVER_BASE);
        leverBase.renderToBuffer(matrixStack, buffer.getBuffer(leverBase.renderType(LEVER_BASE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.popPose();
    }

    public void renderScreen(Tessellator tess, ControlEntity te, int id, String texture, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        matrixStack.translate(0.0, -0.03125, -0.0625);
        this.bindTexture(SCREEN_FRAME);
        screenFrame.renderToBuffer(matrixStack, buffer.getBuffer(screenFrame.renderType(SCREEN_FRAME)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.pushPose();
        ResourceLocation RL = new ResourceLocation(aseoha.MODID, "textures/models/screen/" + texture + ".png");
        this.bindTexture(RL);
        screen.renderToBuffer(matrixStack, buffer.getBuffer(screen.renderType(RL)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.popPose();
    }

    public void renderPushSwitch(Tessellator tess, ControlEntity tce, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        matrixStack.translate(0.03125, 0.0, 0.03125);
        this.bindTexture(SONIC_SCREWDRIVER_TEXTURE);
        holder.renderToBuffer(matrixStack, buffer.getBuffer(holder.renderType(SONIC_SCREWDRIVER_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.pushPose();
        matrixStack.translate(0.0, -0.03125 - 0.3 * tce.getControl().getAnimationProgress(), 0.0);
        float[] color = getHighlightColor(tce, id);
        this.bindTexture(PUSH_LEVER);
        pushSwitch.renderToBuffer(matrixStack, buffer.getBuffer(pushSwitch.renderType(PUSH_LEVER)), 15728880, 65536, color[0], color[1], color[2], color[3]);
        this.resetHighlight();
        matrixStack.popPose();

        matrixStack.popPose();
    }

    public void renderButton(Tessellator tess, ControlEntity tce, int id, double x, double y, double z, double rX, double rY, double rZ, double sX, double sY, double sZ, MatrixStack matrixStack) {
        matrixStack.pushPose();
        IRenderTypeBuffer buffer = Minecraft.getInstance().renderBuffers().bufferSource();
        this.handleSettings(matrixStack, x, y, z, rX, rY, rZ, sX, sY, sZ);

        matrixStack.pushPose();
        matrixStack.translate(0.03125, 0.0, 0.03125);
        this.bindTexture(SONIC_SCREWDRIVER_TEXTURE);
        holder.renderToBuffer(matrixStack, buffer.getBuffer(holder.renderType(SONIC_SCREWDRIVER_TEXTURE)), 15728880, 65536, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();

        matrixStack.pushPose();
        matrixStack.translate(0.0, -0.0015 + 0.06 * tce.getControl().getAnimationProgress(), 0.0);
        float[] color = getHighlightColor(tce, id);
        this.bindTexture(PUSH_LEVER);
        button.renderToBuffer(matrixStack, buffer.getBuffer(button.renderType(PUSH_LEVER)), 15728880, 65536, color[0], color[1], color[2], color[3]);
        this.resetHighlight();
        matrixStack.popPose();

        matrixStack.popPose();
        this.resetHighlight();
    }
}