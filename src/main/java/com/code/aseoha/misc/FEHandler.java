package com.code.aseoha.misc;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.energy.EnergyStorage;

public class FEHandler extends EnergyStorage implements INBTSerializable<CompoundNBT> {

    public FEHandler(int maxFE) {
        super(maxFE);
    }

    public FEHandler(int maxFE, int maxTransfer) {
        super(maxFE, maxTransfer);
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT tag = new CompoundNBT();
        tag.putInt("fe", getEnergyStored());
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        this.energy = (nbt.getInt("energy"));
    }
}