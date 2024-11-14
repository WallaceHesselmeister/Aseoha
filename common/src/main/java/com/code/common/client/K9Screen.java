package com.code.common.client;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

@Environment(EnvType.CLIENT)
public class K9Screen extends Screen {
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
    @Environment(EnvType.CLIENT)
    protected void init() {
        button1 = Button.builder(Component.literal("Button 1"), button -> {
                    System.out.println("You clicked button1!");
                })
                .bounds(width / 2 - 205, 20, 200, 20)
                .tooltip(Tooltip.create(Component.literal("Tooltip of button1")))
                .build();
        button2 = Button.builder(Component.literal("Button 2"), button -> {
                    System.out.println("You clicked button2!");
                })
                .bounds(width / 2 + 5, 20, 200, 20)
                .tooltip(Tooltip.create(Component.literal("Tooltip of button2")))
                .build();

        addWidget(button1) ;
        addWidget(button2) ;
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
        context.drawCenteredString(font, Component.literal("You must see me"), width / 2, height / 2, 0xffffff);
    }
}