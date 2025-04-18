package com.code.aseoha.capabilities;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.Nullable;

import javax.annotation.Nonnull;

import static com.code.aseoha.aseoha.MODID;

public class OverworldCapabilityProvider implements ICapabilitySerializable<CompoundNBT> {
    public static final ResourceLocation OVERWORLD_CAP = new ResourceLocation(MODID, "overworld_capability");

    private final IOverworldCapability instance = new OverworldCapability();
    private final LazyOptional<IOverworldCapability> holder = LazyOptional.of(() -> instance);

    @CapabilityInject(IOverworldCapability.class)
    public static Capability<IOverworldCapability> CAPABILITY = null;

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return cap == CAPABILITY ? holder.cast() : LazyOptional.empty();
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT tag = new CompoundNBT();
        if (CAPABILITY != null) {
            tag = (CompoundNBT) CAPABILITY.getStorage().writeNBT(CAPABILITY, instance, null);
        }
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        if (CAPABILITY != null && nbt != null) {
            CAPABILITY.getStorage().readNBT(CAPABILITY, instance, null, nbt);
        }
    }
}