package com.code.common.enums;

import com.code.common.interfaces.IAmmoType;

public enum AmmoType implements IAmmoType {
    NINE_MILLIMETER("9mm", FireArmType.PISTOL),
    FIVE_FIVE_SIX_FORTY_FIVE_NATO("5.56x45 NATO", FireArmType.PISTOL),
    THREE_FIVE_SEVEN(".357 Magnum", FireArmType.PISTOL),
    THIRTY_EIGHT_SPL(".38 S&W Special", FireArmType.PISTOL),
    FIVE_SEVEN_FN("5.7 FN", FireArmType.PISTOL),
    TEN_MILLIMETER("10mm", FireArmType.PISTOL),
    FORTY_FIVE_ACP("45 ACP", FireArmType.PISTOL),
    THREE_EIGHTY_ACP(".380 ACP", FireArmType.PISTOL),
    TWENTY_TWO_LR(".22 LR", FireArmType.PISTOL);

    private final String Caliber;
    private final FireArmType SupportingFireArm;
    AmmoType(String Caliber, FireArmType SupportingFireArmType) {
        this.Caliber = Caliber;
        this.SupportingFireArm = SupportingFireArmType;
    }


    @Override
    public String GetCaliber() {
        return this.Caliber;
    }

    @Override
    public FireArmType GetSupportingFireArm() {
        return this.SupportingFireArm;
    }
}
