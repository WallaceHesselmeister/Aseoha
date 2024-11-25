package com.code.common.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class ButtonManager {
    private ArrayList<GUIButton> Buttons = new ArrayList<>();

    public ButtonManager() {}

    public void AddButton(String ID, String Text, int PosX, int PosY, int SizeXMin, int SizeYMin, int SizeXMax, int SizeYMax, int Padding, int R, int G, int B, int A) {
        GUIButton guiButton = new GUIButton(ID, Text, PosX, PosY, SizeXMin, SizeYMin, SizeXMax, SizeYMax, Padding, R, G, B, A);
        this.Buttons.add(guiButton);
    }

    public GUIButton GetButton(String ID) {
        AtomicReference<GUIButton> buttonAtomicReference = new AtomicReference<>();
        this.Buttons.forEach(guiButton -> {
            if(guiButton.GetID().equals(ID)) {
                buttonAtomicReference.set(guiButton);
                return;
            }});
        return buttonAtomicReference.get();
    }

    public void RenderButton(GuiGraphics graphics, String ID) {
        GUIButton button = this.GetButton(ID);
        graphics.fill(button.GetPosX() - button.GetPadding(),
                button.GetPosY() - button.GetPadding(),
                button.GetPosX() + button.GetPadding() + Minecraft.getInstance().font.width(button.GetText()),
                button.GetPosY() + Minecraft.getInstance().font.lineHeight + button.GetPadding(),
                button.GetARGB32());
    }

    public void RenderButtonGradient(GuiGraphics graphics, String ID, int GradientARGB) {
        GUIButton button = this.GetButton(ID);
        graphics.fillGradient(button.GetPosX() - button.GetPadding(),
                button.GetPosY() - button.GetPadding(),
                button.GetPosX() + button.GetPadding() + Minecraft.getInstance().font.width(button.GetText()),
                button.GetPosY() + Minecraft.getInstance().font.lineHeight + button.GetPadding(),
                button.GetARGB32(),
                GradientARGB);
    }
}