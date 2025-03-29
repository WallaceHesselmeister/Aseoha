package com.code.aseoha.tileentities.blocks.misc;

import net.minecraft.world.World;
import net.minecraftforge.energy.IEnergyStorage;

public class EOHEnergyStorage implements IEnergyStorage {
    private int energy;
    private final int capacity = (int) Float.POSITIVE_INFINITY;
    private final int maxReceive = 0;
    private final int maxExtract = 200;
    private World level;
    public EOHEnergyStorage(World level) {
        this.level = level;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int energyReceived = Math.min(maxReceive, Math.min(this.maxReceive, capacity - energy));
        if (!simulate) {
            energy += energyReceived;
        }
        return energyReceived;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        int energyExtracted = Math.min(maxExtract, Math.min(maxExtract, energy));
        if (!simulate) {
            energy -= energyExtracted;
        }
        return energyExtracted;
    }

    @Override
    public int getEnergyStored() {
        return energy;
    }

    @Override
    public int getMaxEnergyStored() {
        return capacity;
    }

    @Override
    public boolean canReceive() {
        return false;
    }

    @Override
    public boolean canExtract() {
        return this.level.getGameTime() % 20 == 0;
    }
}
