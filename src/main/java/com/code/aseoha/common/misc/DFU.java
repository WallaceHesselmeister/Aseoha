package com.code.aseoha.common.misc;

import net.minecraft.client.MinecraftClient;

//Not much of a DFU, but kinda like one in the sense that it (should) upgrades dimensions from version 1A of ASEOHA 1.20
public class DFU {
    public static void init(){
        System.out.println(MinecraftClient.getInstance().runDirectory.toPath());
    }

    public void UpgradeDimensions(){

    }
}
