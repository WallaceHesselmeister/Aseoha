package com.code.common.client;
import com.code.common.client.K9Screen;
import net.minecraft.client.Minecraft;

public class GUIHelper {
    /**
     * 1: K-9 Screen
     */
    public static void OpenGUI(int Id){
        switch (Id){
            case 1:
                Minecraft.getInstance().setScreen(new K9Screen());
                break;
            default:
                Minecraft.getInstance().setScreen(new K9Screen());
                break;
        }
    }
}
