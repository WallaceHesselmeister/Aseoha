package com.code.common.items.plasma_magazine;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MediumPlasmaBoltMagazine extends AbstractPlasmaBoltMagazine {
    public MediumPlasmaBoltMagazine(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }

    @Override
    public double GetMaxSize() {
        return 1000;
    }
}
