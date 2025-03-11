package com.code.aseoha.common.latinum;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LatinumAxe extends AxeItem {
    public LatinumAxe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World worldIn, @NotNull List<Text> tooltip, TooltipContext flagIn) {

        tooltip.add(Text.translatable("tooltip.aseoha.latinum.axe"));

        super.appendTooltip(stack, worldIn, tooltip, flagIn);
    }
}
