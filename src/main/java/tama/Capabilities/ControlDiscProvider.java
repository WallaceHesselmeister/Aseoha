/* (C) TAMA Studios 2025 */
package tama.Capabilities;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import tama.Capabilities.Interfaces.IControlDiscCapability;

import javax.annotation.Nullable;

public class ControlDiscProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    private final IControlDiscCapability capability;
    private final LazyOptional<IControlDiscCapability> optional;

    public ControlDiscProvider(ItemStack stack) {
        this.capability = new ControlDiscCapability(stack);
        this.optional = LazyOptional.of(() -> this.capability);
    }

    @Override
    public <T> @NotNull LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return cap == Capabilities.CONTROL_DISC ? optional.cast() : LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        return capability.serializeNBT();
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        capability.deserializeNBT(nbt);
    }
}
