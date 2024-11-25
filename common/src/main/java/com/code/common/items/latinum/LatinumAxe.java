package com.code.common.items.latinum;

import net.minecraft.network.chat.Component;
import net.minecraft.server.dedicated.Settings;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LatinumAxe extends AxeItem {
    public LatinumAxe(Tier material, float attackDamage, float attackSpeed, Properties settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, @NotNull List<Component> tooltip, TooltipFlag flagIn) {

        tooltip.add(Component.translatable("tooltip.aseoha.latinum.tool"));

        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
