package com.code.common.interfaces;

import com.code.common.enums.AmmoType;

public interface IFireArmMagazine {
    /** The Capacity of the Magazine **/
    short GetMaxSize();
    /** Gets called when the firearm is discharged, used mainly for plasma discharge **/
    void OnShoot();
    /** Sets the charge of the magazine **/
    void SetRounds(short i);
    /** Removes charge from the magazine **/
    void RemoveRounds(short i);
    /** Adds charge to the magazine **/
    void AddRounds(short i);
    /** Gets the charge of the magazine **/
    short GetRounds();
    /** Loads ammo into the gun and takes away from the mag **/
    short LoadAmmo(short Ammo);
    /** Returns the full amount of ammo in the mag and removes it all **/
    int Empty();
    /** The type of ammunition the mag holds **/
    AmmoType GetAmmoType();
}
