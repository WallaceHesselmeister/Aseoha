package com.code.common.interfaces;

public interface IFireArm {
    /** The amount of energy to drain from the magazine **/
    int GetConsumeRate();

    /** The amount of energy to drain from the magazine **/
    void SetConsumeRate(int i);

    /** Get the amount of Damage each plasma beam does **/
    int GetDamage();

    /** Set the amount of Damage each plasma beam does **/
    void SetDamage(int i);
}
