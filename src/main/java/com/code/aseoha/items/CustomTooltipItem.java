package com.code.aseoha.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface CustomTooltipItem {

    default void appendHoverText(@NotNull ItemStack stack, @Nullable World world, List<ITextComponent> textComponents, @NotNull ITooltipFlag flag) {
        textComponents.add(toolTip());
    }

    TranslationTextComponent toolTip();
}