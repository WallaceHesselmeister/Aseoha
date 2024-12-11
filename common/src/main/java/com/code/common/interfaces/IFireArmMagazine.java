package com.code.common.interfaces;

public interface IFireArmMagazine {
    /** The Capacity of the Magazine **/
    double GetMaxSize();
    /** Gets called when the firearm is discharged, used mainly for plasma discharge **/
    void OnShoot();
    /** Sets the charge of the magazine **/
    void SetCharge(int i);
    /** Removes charge from the magazine **/
    void RemoveCharge(int i);
    /** Adds charge to the magazine **/
    void AddCharge(int i);
    /** Gets the charge of the magazine **/
    int GetCharge();
}
