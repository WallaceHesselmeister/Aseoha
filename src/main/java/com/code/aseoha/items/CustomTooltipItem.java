package com.code.aseoha.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomTooltipItem extends Item {
    private TranslationTextComponent translationTextComponent;
    public CustomTooltipItem(Properties p_i48487_1_, TranslationTextComponent toolTip) {
        super(p_i48487_1_);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> p_77624_3_, @NotNull ITooltipFlag p_77624_4_) {
        p_77624_3_.add(translationTextComponent);
    }
}
