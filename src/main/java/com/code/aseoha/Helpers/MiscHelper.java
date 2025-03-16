package com.code.aseoha.Helpers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.PointOfView;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

public class MiscHelper {

    @OnlyIn(Dist.CLIENT)
    public static void forceThirdPerson() {
            Minecraft.getInstance().options.setCameraType(PointOfView.THIRD_PERSON_BACK);
    }

    public static Item getItemFromResourceLocation(ResourceLocation resourceLocation) {
        Item item = ForgeRegistries.ITEMS.getValue(resourceLocation);
        if (item == null) {
            throw new IllegalArgumentException("No item found for ResourceLocation: " + resourceLocation);
        }
        return item;
    }
}
