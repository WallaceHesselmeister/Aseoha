package com.code.common.items.latinum;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LatinumHoe extends HoeItem {
    public LatinumHoe(Tier material, int attackDamage, float attackSpeed, Item.Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendHoverText(net.minecraft.world.item.ItemStack stack, @Nullable Level worldIn, @NotNull List<Component> tooltip, TooltipFlag flagIn) {

        tooltip.add(Component.translatable("tooltip.aseoha.latinum.tool"));

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
