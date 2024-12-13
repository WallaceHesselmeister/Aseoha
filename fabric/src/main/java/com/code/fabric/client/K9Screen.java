package com.code.fabric.client;


import com.code.common.client.ButtonManager;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FastColor;

import java.util.ArrayList;

import static com.code.aseoha.MOD_ID;

@Environment(EnvType.CLIENT)
public class K9Screen extends Screen {
    public ArrayList<Integer> ButtonSizes = new ArrayList<>();
    public ButtonManager ButtonManager = new ButtonManager();
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


    public ResourceLocation GUIBackground = new ResourceLocation(MOD_ID, "textures/gui/k9.png");


    @Override
    protected void init() {
        this.addButton(new PlainTextButton((width / 2 - 40), (height / 2) - 20,
                this.font.width("Fly TARDIS"), 20, Component.translatable("aseoha.tardis.fly").withStyle(ChatFormatting.BOLD), button -> {
        }, this.font));

        this.ButtonManager.AddButton("fly-tardis", String.valueOf(Component.translatable("aseoha.tardis.fly").withStyle(ChatFormatting.BOLD)),
                (width / 2) - 40,
                (height / 2) - 20,
                ((width / 2) - 40) - this.font.width(Component.translatable("aseoha.tardis.fly").withStyle(ChatFormatting.BOLD)),
                this.height - this.font.lineHeight,
                ((width / 2) - 40) + this.font.width(Component.translatable("aseoha.tardis.fly").withStyle(ChatFormatting.BOLD)),
                this.font.lineHeight,
                5,
                FastColor.ARGB32.color(255, 0, 0, 0));

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
        context.blit(GUIBackground, 0, 0, width, 0, width, height);

        this.ButtonManager.RenderAllButtons(context);
    }

    private <T extends AbstractWidget> void addButton(T button) {
        this.addRenderableWidget(button);
        button.active = true;
    }
}