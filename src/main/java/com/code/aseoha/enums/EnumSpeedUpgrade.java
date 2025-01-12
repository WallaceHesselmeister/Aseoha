package com.code.aseoha.enums;

import com.code.aseoha.misc.ISpeedUpgradeEnum;

public enum EnumSpeedUpgrade implements ISpeedUpgradeEnum {
    TESSERACT_DRIVE(7),
    WARP_DRIVE(6),
    HYPER_DRIVE(5),
    LIGHTSPEED_DRIVE(4),
    MACH_DRIVE_II(3),
    MACH_DRIVE_I(2),
    BASIC(1);

    EnumSpeedUpgrade(int speed){this.Speed = speed;}
    
    final int Speed;

    @Override
    public int GetSpeed() {
        return this.Speed;
    }
}
