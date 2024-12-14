package com.code.common.interfaces;

import com.code.common.misc.AmmoType;
import com.code.common.misc.FireArmType;

public interface IFireArm {
    /** The amount to drain from the magazine **/
    int GetConsumeRate();

    /** The amount to drain from the magazine **/
    void SetConsumeRate(int i);

    /** Get the amount of Damage each projectile does **/
    int GetDamage();

    /** Set the amount of Damage each projectile does **/
    void SetDamage(int i);

    int GetAccuracy();

    /** The type of gun **/
    FireArmType GetFireArmType();
}
