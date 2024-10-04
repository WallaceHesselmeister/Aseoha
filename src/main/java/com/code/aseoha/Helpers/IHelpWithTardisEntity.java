package com.code.aseoha.Helpers;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.DimensionType;

public interface IHelpWithTardisEntity {
    boolean isJumping();
    void setJumping(boolean jumpingState);
    void setHasLanded(boolean hasLanded);
    boolean getHasLanded();
    void setCanDismount(boolean canDismount);
    boolean canDismount();
    RegistryKey<DimensionType> getInteriorDimension();
    void setInteriorDimension(RegistryKey<DimensionType> dimensionType);
}
