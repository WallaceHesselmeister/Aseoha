package com.code.aseoha;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.energy.IEnergyStorage;
import net.tardis.mod.cap.ILightCap;
import net.tardis.mod.cap.items.IVortexCap;

public class Capabilities {
    @CapabilityInject(IVortexCap.class)
    public static final Capability<IEnergyStorage> EOHEnergyCap = null;

}
