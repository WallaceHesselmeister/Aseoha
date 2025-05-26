package com.code.aseoha.misc.Container;

import com.code.aseoha.aseoha;
import com.code.aseoha.entities.K9Entity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * This is the monitor renderer for the K9Monitor Screen, this gets called to open the screen
 */

@OnlyIn(Dist.CLIENT)
public class K9Screen extends K9MonitorScreen {
    public static final ResourceLocation TEXTURE = new ResourceLocation(aseoha.MODID, "textures/gui/monitors/K9Entity.png");

    /**
     * This is here for emotional support for java
     */
    public K9Screen(K9Entity intK9){
        super(intK9);
    }
    @Override
    public void renderMonitor(MatrixStack matrixStack) {
        Minecraft.getInstance().getTextureManager().bind(TEXTURE);
        this.renderBackground(matrixStack);
        int texWidth = 239;
        int texHeight = 181;
        this.blit(matrixStack, this.width / 2 - texWidth / 2, this.height / 2 - texHeight / 2, 0, 0, texWidth, texHeight);
    }

    /**
     * @return Height / 2 + 60
     */
    public int getMinY() {
        return this.height / 2 + 60;
    }

    /**
     * @return Width / 2 - 100
     */
    public int getMinX() {
        return this.width / 2 - 100;
    }

    /**
     * @return Maximum X + 200
     */
    public int getMaxX() {
        return this.getMinX() + 200;
    }

    /**
     * @return Minimum Y - 140
     */
    public int getMaxY() {
        return this.getMinY() - 140;
    }
    /**
     * @return 201
     */
    public int getWidth() {
        return 201;
    }

    /**
     * @return 152
     */
    public int getHeight() {
        return 152;
    }

    /**
     * @return Yeah so I got lazy here and made the Gui Id 314159265 (the first few digits of pi)
     */
    public int getGuiID() {
        return 314159265;
    }
}
