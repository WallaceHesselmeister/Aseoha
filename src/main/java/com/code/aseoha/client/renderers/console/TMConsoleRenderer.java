package com.code.aseoha.client.renderers.console;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.consoles.OGTMConsoleModel;
import com.code.aseoha.client.renderers.ControlRenderer;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.controls.DimensionControl;
import net.tardis.mod.controls.SonicPortControl;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import org.lwjgl.opengl.GL11;


public class TMConsoleRenderer extends TileEntityRenderer<ConsoleTile> {
    OGTMConsoleModel model = new OGTMConsoleModel();
    ControlRenderer compRender;

    public TMConsoleRenderer(TileEntityRendererDispatcher dispatcher) {
        super(dispatcher);
    }

    private void renderDimControls(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 60, 1.3, -0.23, -0.45, -45.0, 90.0, 0.0, 0.4, 0.6, 0.6, stack);
    }

    private void renderXControls(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 10, -0.4, -0.28, -1.23, -45.0, 180.0, 0.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 11, 0.0, -0.28, -1.23, -45.0, 180.0, 0.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 16, 0.4, -0.28, -1.23, -45.0, 180.0, 0.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 12, -0.09, -0.65, -0.82, -45.0, 180.0, 0.0, 0.35, 0.5, 0.45, stack);
        this.compRender.renderWheel(tess, tce.getControl(DimensionControl.class).get().getEntity(), 14, -0.35, -0.67, -0.81, -45.0, 180.0, 0.0, 0.3, 0.3, 0.3, stack);
        this.compRender.renderWheel(tess, tce.getControl(DimensionControl.class).get().getEntity(), 15, 0.35, -0.67, -0.81, -45.0, 180.0, 0.0, 0.3, 0.3, 0.3, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 13, 0.09, -0.65, -0.82, -45.0, 180.0, 0.0, 0.35, 0.5, 0.45, stack);
    }

    private void renderZControls(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 20, 0.4, -0.65, 0.78, -45.0, 0.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 21, 0.2, -0.65, 0.78, -45.0, 0.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 26, 0.0, -0.65, 0.78, -45.0, 0.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 22, -0.2, -0.65, 0.78, -45.0, 0.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 23, -0.4, -0.65, 0.78, -45.0, 0.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderWheel(tess, tce.getControl(DimensionControl.class).get().getEntity(), 24, 0.7, -0.28, 1.25, -45.0, 0.0, 0.0, 0.35, 0.3, 0.35, stack);
        this.compRender.renderWheel(tess, tce.getControl(DimensionControl.class).get().getEntity(), 25, 0.1, -0.28, 1.25, -45.0, 0.0, 0.0, 0.35, 0.3, 0.35, stack);
    }

    private void renderYControls(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 30, 0.78, -0.65, 0.3, -45.0, 90.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 31, 0.78, -0.65, 0.15, -45.0, 90.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 32, 0.78, -0.65, 0.0, -45.0, 90.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 33, 0.78, -0.65, -0.15, -45.0, 90.0, 0.0, 0.3, 0.6, 0.6, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 34, 0.81, -0.68, -0.3, -45.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
    }

    private void renderFlightControls(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 40, 0.425, -0.23, 1.3, 45.0, 180.0, 0.0, 1.0, 1.0, 1.0, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 41, 1.3, -0.23, -0.8, -45.0, 90.0, 0.0, 0.8, 0.6, 0.6, stack);
        this.compRender.renderSpecialLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 42, -1.16, -0.35, 0.8, 0.0, 180.0, -45.0, 0.8, 0.8, 0.8, stack);
    }

    private void renderSchemaChooser(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
//        this.compRender.renderTextScreen(tess, tce.getControl(DimensionControl.class).get().getEntity(), tce.schemaCategoryString, 52, 1.05, -0.42, -0.1, -49.0, -90.0, 0.0, 0.4, 0.4, 0.2);
//        this.compRender.renderTextScreen(tess, tce.getControl(DimensionControl.class).get().getEntity(), tce.schemaChooserString, 52, 1.26, -0.22, -0.1, -49.0, -90.0, 0.0, 0.4, 0.4, 0.2);

        this.compRender.renderTextScreen(tess, tce.getControl(DimensionControl.class).get().getEntity(), "Testing", 52, 1.05, -0.42, -0.1, -49.0, -90.0, 0.0, 0.4, 0.4, 0.2, stack);
        this.compRender.renderTextScreen(tess, tce.getControl(DimensionControl.class).get().getEntity(), "Ice", 52, 1.26, -0.22, -0.1, -49.0, -90.0, 0.0, 0.4, 0.4, 0.2, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 57, 1.05, -0.42, 0.8, 41.0, -90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 58, 1.15, -0.33, 0.8, 41.0, -90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 50, 1.26, -0.23, 0.8, 41.0, -90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 51, 1.36, -0.14, 0.8, 41.0, -90.0, 0.0, 0.5, 0.5, 0.5, stack);
    }

    private void renderFrontPanel(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 5, -1.0, -0.53, -0.64, 45.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderScrewdriverHolder(tess, tce.getControl(DimensionControl.class).get().getEntity(), -1.0, -0.55, -0.45, 0.0, 0.0, -45.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderScrewdriver(tess, tce.getControl(DimensionControl.class).get().getEntity(), 0, -1.0, -0.55, -0.45, 0.0, 0.0, -45.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderGauge(tess, tce.getControl(DimensionControl.class).get().getEntity(), 0, -0.7, -0.68, 0.15, 45.0, -90.0, 0.0, 0.75, 0.75, 0.75, stack);
        this.compRender.renderGauge(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1, -0.7, -0.68, -0.125, 45.0, -90.0, 0.0, 0.75, 0.75, 0.75, stack);
        this.compRender.renderGauge(tess, tce.getControl(DimensionControl.class).get().getEntity(), 2, -0.7, -0.68, -0.4, 45.0, -90.0, 0.0, 0.75, 0.75, 0.75, stack);
        this.compRender.renderGauge(tess, tce.getControl(DimensionControl.class).get().getEntity(), 8, -0.56, -0.82, 0.015, 45.0, -90.0, 0.0, 0.75, 0.75, 0.75, stack);
        this.compRender.renderGauge(tess, tce.getControl(DimensionControl.class).get().getEntity(), 9, -0.56, -0.82, -0.285, 45.0, -90.0, 0.0, 0.75, 0.75, 0.75, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 53, -0.7, -0.78, 0.36, 45.0, 90.0, 0.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderWheel(tess, tce.getControl(DimensionControl.class).get().getEntity(), 3, -1.25, -0.3, -0.4, 45.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 4, -1.23, -0.28, 0.4, -45.0, -90.0, 0.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1030, -1.08, -0.43, 0.0, 43.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1031, -1.18, -0.34, 0.0, 43.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1032, -1.28, -0.25, 0.0, 43.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 43, -1.25, -0.3, -0.9, 45.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
    }

    private void renderRightPanel(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.renderXControls(tess, tce, stack);
        this.compRender.renderScreen(tess, tce.getControl(DimensionControl.class).get().getEntity(), 100, "main", -0.7, -0.325, -1.2, -45.0, 180.0, 0.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 901, -1.1, -0.175, -1.35, -45.0, 180.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 55, 0.75, -0.28, -1.25, -45.0, 180.0, 0.0, 0.5, 0.5, 0.5, stack);
        if (tce != null && tce.getSubsystem(StabilizerSubsystem.class).isPresent()) {
            this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 56, 0.75, -0.18, -1.36, -45.0, 180.0, 0.0, 0.5, 0.5, 0.5, stack);
        }

        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1022, 0.75, -0.46, -1.02, 90.0, 45.0, 90.0, 0.3, 0.4, 0.4, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1023, -0.75, -0.46, -1.02, 90.0, 45.0, 90.0, 0.3, 0.4, 0.4, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1020, 0.9, -0.19, -1.3, 45.0, 0.0, 0.0, 0.3, 0.4, 0.4, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1021, 1.07, -0.19, -1.3, 45.0, 0.0, 0.0, 0.3, 0.4, 0.4, stack);
    }

    private void renderLeftPanel(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.renderZControls(tess, tce, stack);

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 5; ++j) {
                this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1019 - 5 * i - (4 - j), -0.3 - 0.125 * (double) j, -0.2 - 0.08 * (double) i, 1.35 - 0.1 * (double) i, -39.0, 0.0, 0.0, 0.6, 0.6, 0.6, stack);
            }
        }

        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 900, -0.95, -0.2, 1.37, -39.0, 0.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderScreen(tess, tce.getControl(DimensionControl.class).get().getEntity(), 54, "scanner", 0.47, -0.38, 1.1, 43.0, 180.0, 0.0, 0.3, 0.3, 0.3, stack);

        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 902, -0.95, -0.29, 1.26, -39.0, 0.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 903, -0.95, -0.38, 1.15, -39.0, 0.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1027, 0.1, -0.42, 1.05, -90.0, -45.0, 90.0, 0.2, 0.3, 0.3, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1028, 0.7, -0.42, 1.05, -90.0, -45.0, 90.0, 0.2, 0.3, 0.3, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1029, 0.7, -0.49, 0.95, -90.0, -45.0, 90.0, 0.2, 0.3, 0.3, stack);
    }

    private void renderBackPanel(Tessellator tess, ConsoleTile tce, MatrixStack stack) {
        this.renderSchemaChooser(tess, tce, stack);
        this.renderDimControls(tess, tce, stack);
        this.renderYControls(tess, tce, stack);
        this.compRender.renderScrewdriverHolder(tess, tce.getControl(SonicPortControl.class).get().getEntity(), 1.2, -0.32, -0.225, 0.0, 0.0, 45.0, 0.5, 0.5, 0.5, stack);
//        this.compRender.renderScrewdriver(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1, 1.2, -0.32, -0.225, 0.0, 0.0, 45.0, 0.5, 0.5, 0.5);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 52, 1.36, -0.15, -1.15, 0.0, 0.0, 45.0, 0.6, 0.6, 0.6, stack);
        this.compRender.renderPushSwitch(tess, tce.getControl(DimensionControl.class).get().getEntity(), 904, 0.81, -0.68, -0.45, -45.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1024, 0.97, -0.49, -0.6, 0.0, 0.0, 45.0, 0.3, 0.4, 0.4, stack);
        this.compRender.renderLever(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1025, 1.02, -0.43, -0.32, 0.0, 0.0, 45.0, 0.3, 0.4, 0.4, stack);
        this.compRender.renderButton(tess, tce.getControl(DimensionControl.class).get().getEntity(), 1026, 0.91, -0.58, -0.3, -45.0, 90.0, 0.0, 0.5, 0.5, 0.5, stack);
    }

    public void render(ConsoleTile te, float p_225616_2_, MatrixStack stack, IRenderTypeBuffer buffer, int p_225616_5_, int p_225616_6_) {
//        if (this.compRender == null) {
//            this.compRender = new ControlRenderer(Minecraft.getInstance().font, Minecraft.getInstance().textureManager);
//        }

        Tessellator tess = Tessellator.getInstance();
        GL11.glPushMatrix();
        GL11.glTranslatef(0.5F, 0.0F, 0.5F);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef(0.0F, -0.5F, 0.0F);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, -0.5F, 0.0F);
        this.model.renderToBuffer(stack, buffer.getBuffer(RenderType.entityCutout(new ResourceLocation(aseoha.MODID, ""))), p_225616_5_, p_225616_6_, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
        this.renderFrontPanel(tess, te, stack);
        this.renderRightPanel(tess, te, stack);
        this.renderBackPanel(tess, te, stack);
        this.renderLeftPanel(tess, te, stack);
        this.renderFlightControls(tess, te, stack);

        GL11.glPopMatrix();
    }
}