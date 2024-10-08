package com.code.aseoha.client.guis.monitors;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.guis.monitors.BaseMonitorScreen;
import net.tardis.mod.sounds.TSounds;

public class SmithMonitorScreen extends BaseMonitorScreen {
    public static final ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/gui/monitors/smithconsole.png");

    public SmithMonitorScreen() {
    }

    protected void init() {
        super.init();
        Minecraft.getInstance().getSoundManager().play(SimpleSound.forUI(TSounds.EYE_MONITOR_INTERACT.get(), 1.0F));
    }

    @Override
    public void renderMonitor(MatrixStack matrixStack) {
        Minecraft.getInstance().getTextureManager().bind(TEXTURE);
        this.renderBackground(matrixStack);
        int guiWidth = 255;
        int guiHeight = 182;
        this.blit(matrixStack, this.width / 2 - guiWidth / 2, this.height / 2 - guiHeight / 2, 0, 0, guiWidth, guiHeight);
    }

    @Override
    public int getMinY() {
        return this.height / 2 + 45;
    }

    @Override
    public int getMinX() {
        return this.width / 2 - 100;
    }

    @Override
    public int getMaxX() {
        return this.getMinX() + 200;
    }

    @Override
    public int getMaxY() {
        return this.getMinY() - 120;
    }

    @Override
    public int getWidth() {
        return 200;
    }

    @Override
    public int getHeight() {
        return 135;
    }

    @Override
    public int getGuiID() {
        return 251;
    }
}