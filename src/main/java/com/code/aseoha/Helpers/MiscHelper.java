package com.code.aseoha.Helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.PointOfView;

public class MiscHelper {

    public static void forceThirdPerson() {
//        if(Minecraft.getInstance().options.getCameraType().isFirstPerson()) {
            Minecraft.getInstance().options.setCameraType(PointOfView.THIRD_PERSON_BACK);
//        }
    }
}
