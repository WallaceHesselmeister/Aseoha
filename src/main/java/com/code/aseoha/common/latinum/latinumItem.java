package com.code.aseoha.common.latinum;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class latinumItem extends Item {

    public latinumItem(Settings settings) {
        super(settings);
    }

    //    @Override
//    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
////        super.appendTooltip(stack, world, tooltip.stream().toList().set(1, Text.translatable("")), context);
//        appendTooltip(this.getDefaultStack(), world, tooltip.);
//    }
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World worldIn, @NotNull List<Text> tooltip, TooltipContext flagIn) {

        tooltip.add(Text.translatable("tooltip.aseoha.latinum"));

        super.appendTooltip(stack, worldIn, tooltip, flagIn);
    }
}