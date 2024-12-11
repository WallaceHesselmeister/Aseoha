package com.code.common.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Dalekaniumtem extends Item {
    public Dalekaniumtem(Properties settings) {
        super(settings);
    }

    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.translatable("tooltip.aseoha.dalekanium"));
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
