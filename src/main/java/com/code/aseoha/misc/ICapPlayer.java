package com.code.aseoha.misc;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

public interface ICapPlayer {

    void setFlyingInTardis(boolean flying);
    boolean hasFlyedInTardis();

    void setInteriorDimension(RegistryKey<World> type);
    RegistryKey<World> getInteriorDimension();

}
