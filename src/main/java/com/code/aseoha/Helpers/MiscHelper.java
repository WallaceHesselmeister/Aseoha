package com.code.aseoha.Helpers;

import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.aseoha;
import com.code.aseoha.data.DataPackWorkbenchRecipe;
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

    public static WorkBenchRecipe WorkbenchDataRecipeToRecipe(DataPackWorkbenchRecipe dataPackRecipe) {
        return new WorkBenchRecipe(
                MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot1()),
                MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot2()),
                MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot3()),
                MiscHelper.getItemFromResourceLocation(dataPackRecipe.getSlot4()),
                MiscHelper.getItemFromResourceLocation(dataPackRecipe.getResult())
        );
    }
}
