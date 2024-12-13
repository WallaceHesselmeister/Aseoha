package com.code.common.client;
import net.minecraft.client.Minecraft;

public class GUIHelper {
    /**
     * 1: K-9 Screen
     */
    public static void OpenGUI(int Id){
        switch (Id){
            case 1 -> Minecraft.getInstance().setScreen(new K9Screen());
            default -> Minecraft.getInstance().setScreen(new K9Screen());
        }
    }
}
