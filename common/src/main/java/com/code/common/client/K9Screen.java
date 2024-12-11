package com.code.common.client;


import com.code.aseoha;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.FastColor;

import java.util.ArrayList;

@Environment(EnvType.CLIENT)
public class K9Screen extends Screen {
    public ArrayList<Integer> ButtonSizes = new ArrayList<>();
//    private final Screen parent;

    public K9Screen() {
        super(Component.translatable("aseoha.k9.container.screen"));
//        this.parent = parent;
    }

    @Override
    public void onClose() {
        assert this.minecraft != null;
        this.minecraft.setScreen((Screen) null);
    }


    public Button button1;
    public Button button2;

    @Override
    protected void init() {
        this.addButton(new PlainTextButton((width / 2 - 40), (height / 2) - 20,
                this.font.width("Fly TARDIS"), 20, Component.translatable("aseoha.tardis.fly").withStyle(ChatFormatting.BOLD), button -> {
            System.out.println("YIPPEE!!");
        }, this.font));
        this.ButtonSizes.add(this.font.width("Fly TARDIS"));
    }

    // For versions 1.20 below
//    @Override
//    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
//        super.render(matrices, mouseX, mouseY, delta);
//        drawCenteredTextWithShadow(matrices, textRenderer, Text.literal("You must see me"), width / 2, height / 2, 0xffffff);
//    }

    // For versions 1.20 and after
    @Override
    public void render(GuiGraphics context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
//        context.fill(width / 2 - 50, height / 2 - 30, width + this.ButtonSizes.get(0) / 2 - 30, height / 2 - 10, FastColor.ARGB32.color(255, 255, 255, 255));
//        context.drawCenteredString(font, Component.literal("You must see me"), width / 2, height / 2, 0xffffff);

    }

    private <T extends AbstractWidget> void addButton(T button) {
        this.addRenderableWidget(button);
        button.active = true;
    }
}