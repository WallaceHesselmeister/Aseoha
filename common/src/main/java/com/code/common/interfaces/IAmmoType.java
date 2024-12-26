package com.code.common.interfaces;

import com.code.common.enums.FireArmType;

public interface IAmmoType {
    String GetCaliber();
    FireArmType GetSupportingFireArm();
}
