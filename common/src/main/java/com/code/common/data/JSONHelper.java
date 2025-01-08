package com.code.common.data;

import net.minecraft.resources.ResourceLocation;

public class JSONHelper {
    public static boolean isJson(ResourceLocation rl) {
        return rl.getPath().endsWith(".json");
    }
}
