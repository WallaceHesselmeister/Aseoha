package com.code.aseoha.common.latinum;

import com.code.aseoha.common.Items;
import net.minecraft.block.DispenserBlock;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;

public class LatinumElytra extends ElytraItem {
    public LatinumElytra(Settings settings) {
        super(settings);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);
    }

    @Override public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isOf(Items.LATINUM_BAR);
    }

}
