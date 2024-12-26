package com.code.common.items;

import com.code.common.enums.FireArmType;
import net.minecraft.world.item.Item;

public class PlasmaRifle extends AbstractFirearm {

    public PlasmaRifle(Item.Properties settings) {
        super(settings);
    }

    @Override
    public FireArmType GetFireArmType() {
        return FireArmType.RIFLE;
    }
}