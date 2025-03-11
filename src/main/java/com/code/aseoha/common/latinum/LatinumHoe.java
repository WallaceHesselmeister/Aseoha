package com.code.aseoha.common.latinum;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LatinumHoe extends HoeItem {
    public LatinumHoe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

//    @Override
//    public float getAttackDamage() {
//        return 15;
//    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World worldIn, @NotNull List<Text> tooltip, TooltipContext flagIn) {

        tooltip.add(Text.translatable("tooltip.aseoha.latinum.hoe"));

        super.appendTooltip(stack, worldIn, tooltip, flagIn);
    }
}
