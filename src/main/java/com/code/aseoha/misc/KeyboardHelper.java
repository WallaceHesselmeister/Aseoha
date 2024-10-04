package com.code.aseoha.misc;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;
@OnlyIn(Dist.CLIENT)
public class KeyboardHelper {
    private static final long WINDOW = Minecraft.getInstance().getWindow().getWindow();

    public static boolean isHoldingShift() {return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT);}

    public static boolean isHoldingRightShift(){return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_SHIFT);}

    public static boolean isHoldingControl() {return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_CONTROL);}

    public static boolean isHoldingRightControl(){return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_CONTROL);}

    public static boolean isHoldingSpace() {return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_SPACE);}

    public static boolean isHoldingAlt() {return InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_LEFT_ALT) || InputMappings.isKeyDown(WINDOW, GLFW.GLFW_KEY_RIGHT_ALT);}
}