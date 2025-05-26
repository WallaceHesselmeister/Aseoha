package com.code.aseoha.capabilities;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

public class OverworldCapabilityStorage implements Capability.IStorage<IOverworldCapability> {
    @Override
    public CompoundNBT writeNBT(Capability<IOverworldCapability> capability, IOverworldCapability instance, Direction side) {
        CompoundNBT tag = new CompoundNBT();
        // Add your NBT writing logic here
        return tag;
    }

    @Override
    public void readNBT(Capability<IOverworldCapability> capability, IOverworldCapability instance, Direction side, INBT nbt) {
        if (nbt instanceof CompoundNBT) {
            CompoundNBT tag = (CompoundNBT) nbt;
            // Add your NBT reading logic here
        }
    }
}