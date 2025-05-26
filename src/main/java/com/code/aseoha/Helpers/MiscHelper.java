package com.code.aseoha.Helpers;

import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.data.DataPackWorkbenchRecipe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.PointOfView;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemStackHandler;
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

    public static void DropItem(Item item, World world, BlockPos dropPos) {
        ItemStack stack = item.getDefaultInstance();
        ItemEntity itemEntity = new ItemEntity(world, dropPos.getX(), dropPos.getY(), dropPos.getZ(), stack);
        itemEntity.setDefaultPickUpDelay();
        world.addFreshEntity(itemEntity);
    }

    /**
     * handler1 will get all the items from handler2
     **/
    public static void SyncHandlers(ItemStackHandler handler1, ItemStackHandler handler2) {
        for(int i = 0; i < handler2.getSlots(); i++) {
            if((i < handler1.getSlots()))
                handler1.setStackInSlot(i, handler2.getStackInSlot(i));
        }
    }
}
