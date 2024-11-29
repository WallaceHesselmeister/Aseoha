package com.code.aseoha.Helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.PointOfView;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MiscHelper {

    @OnlyIn(Dist.CLIENT)
    public static void forceThirdPerson() {
            Minecraft.getInstance().options.setCameraType(PointOfView.THIRD_PERSON_BACK);
    }
}
