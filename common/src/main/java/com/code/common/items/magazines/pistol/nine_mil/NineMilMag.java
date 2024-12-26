package com.code.common.items.magazines.pistol.nine_mil;

import com.code.common.enums.AmmoType;
import com.code.common.items.magazines.AbstractMagazine;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NineMilMag extends AbstractMagazine {
    public NineMilMag(Properties properties) {
        super(properties);
    }

    @Override
    public short GetMaxSize() {
        return 12;
    }

    @Override
    public AmmoType GetAmmoType() {
        return AmmoType.NINE_MILLIMETER;
    }
}
