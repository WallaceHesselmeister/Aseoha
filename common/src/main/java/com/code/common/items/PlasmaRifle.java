package com.code.common.items;

import net.minecraft.world.item.Item;

public class PlasmaRifle extends AbstractFirearm {

    public PlasmaRifle(Item.Properties settings) {
        super(settings);
    }

    /**
     * The amount of energy to drain from the magazine
     **/
    @Override
    public int GetConsumeRate() {
        return 20;
    }

    /**
     * The amount of energy to drain from the magazine
     **/
    @Override
    public int GetDamage() {
        return 12;
    }


}