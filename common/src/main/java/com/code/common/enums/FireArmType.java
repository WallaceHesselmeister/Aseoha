package com.code.common.enums;

import com.code.common.interfaces.IFireArmType;

public enum FireArmType implements IFireArmType {
    RIFLE("Rifle", 2, 2),
    PISTOL("Pistol", 1, 1),
    MARKSMAN("Marksman", 3, 3),
    SNIPER("Sniper", 4, 4);

    private final String TYPE;
    private final int DAMAGE;
    private final int ACCURACY;
    FireArmType(String Type, int DAMAGE, int ACCURACY) {
        this.TYPE = Type;
        this.ACCURACY = ACCURACY;
        this.DAMAGE = DAMAGE;
    }

    @Override
    public String GetType() {
        return this.TYPE;
    }

    @Override
    public int GetBaseDMG() {
        return this.DAMAGE;
    }

    @Override
    public int GetAccuracy() {
        return this.ACCURACY;
    }
}
