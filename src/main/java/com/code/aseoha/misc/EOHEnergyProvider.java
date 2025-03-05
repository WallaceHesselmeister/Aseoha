package com.code.aseoha.misc;

import com.code.aseoha.Config;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EOHEnergyProvider implements IEnergyStorage, ICapabilityProvider {
    @CapabilityInject(IEnergyStorage.class)
    public static final Capability<IEnergyStorage> ENERGY = null;
    private IEnergyStorage instance = ENERGY.getDefaultInstance();
    protected int maxExtract = Config.SERVER.EOHMaxFETransfer.get();

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        return 0;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        if (!this.canExtract()) {
            return 0;
        } else {
            return this.maxExtract; //Math.min(this.energy, Math.min(this.maxExtract, maxExtract));
        }
    }

    @Override
    public int getEnergyStored() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxEnergyStored() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean canExtract() {
        return true;
    }

    @Override
    public boolean canReceive() {
        return false;
    }

    public LazyOptional<IEnergyStorage> energy = LazyOptional.of(() -> instance);

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if (cap == CapabilityEnergy.ENERGY) {
            return energy.cast();
        }
        return null;
    }
}
