package com.code.fabric.items;

public class PlasmaRifle extends AbstractFirearm {

    public PlasmaRifle(Properties settings) {
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