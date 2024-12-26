package com.code.fabric.items.magazines.nine_mil;


import com.code.common.enums.AmmoType;
import com.code.fabric.items.magazines.AbstractMagazine;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NineMilExtendedMag extends AbstractMagazine {
    public NineMilExtendedMag(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, list, tooltipFlag);
    }

    @Override
    public short GetMaxSize() {
        return 24;
    }

    /**
     * The type of ammunition the mag holds
     **/
    @Override
    public AmmoType GetAmmoType() {
        return AmmoType.NINE_MILLIMETER;
    }
}