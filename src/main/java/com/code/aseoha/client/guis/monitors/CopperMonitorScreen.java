package com.code.aseoha.client.guis.monitors;//


import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.tardis.mod.client.guis.monitors.BaseMonitorScreen;
import net.tardis.mod.sounds.TSounds;

public class CopperMonitorScreen extends BaseMonitorScreen {
    public static final ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/gui/consoles/copper.png");

    public CopperMonitorScreen() {
    }

    protected void init() {
        super.init();
        Minecraft.getInstance().getSoundManager().play(SimpleSound.forUI((SoundEvent) TSounds.STEAMPUNK_MONITOR_INTERACT.get(), 1.0F));
    }

    @Override
    public void renderMonitor(MatrixStack matrixStack) {
        Minecraft.getInstance().getTextureManager().bind(TEXTURE);
        this.renderBackground(matrixStack);
        int texWidth = 239;
        int texHeight = 182;
        this.blit(matrixStack, this.width / 2 - texWidth / 2, this.height / 2 - texHeight / 2, 0, 0, texWidth, texHeight);
    }

@Override
    public int getMinY() {
        return this.height / 2 + 65;
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
        return this.getMinY() - 140;
    }
    @Override
    public int getWidth() {
        return 201;
    }
    @Override
    public int getHeight() {
        return 152;
    }
    @Override
    public int getGuiID() {
        return 8;
    }
}
