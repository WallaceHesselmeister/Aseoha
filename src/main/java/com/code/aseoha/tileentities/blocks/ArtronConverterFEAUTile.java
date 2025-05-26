package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.Config;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.misc.ModEnergy;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.particles.TParticleTypes;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ArtronConverterFEAUTile extends TileEntity implements ITickableTileEntity {
    private static final int TICK_INTERVAL = 7;
    private final int energyCapacity = Config.SERVER.generator_capacity.get();
    private final int chargeRate = Config.SERVER.generator_charge.get();
    private final int conversionAmount = Config.SERVER.generator_usage.get();
    private final ModEnergy energy = new ModEnergy(energyCapacity, chargeRate, energyCapacity);
    private final LazyOptional<EnergyStorage> energyHolder = LazyOptional.of(() -> energy);
    private int tickCounter = TICK_INTERVAL;
    private boolean isEnergyFull = false;
    private boolean shouldSpawnParticles = false;
    private ConsoleTile consoleTile;
    private final Random random = new Random();

    public ArtronConverterFEAUTile() {
        super(AseohaTiles.ARTRON_CONVERTER_FE_AU.get());
    }

    @Override
    public void tick() {
        if (level == null) return;

        // Cache console tile
        if (consoleTile == null || consoleTile.isRemoved()) {
            TardisHelper.getConsoleInWorld(level).ifPresent(console -> consoleTile = console);
            if (consoleTile == null) return;
        }

        // Access capability once per tick
        energyHolder.ifPresent(energy -> {
            boolean shouldUpdate = false;

            if (consoleTile.getArtron() < consoleTile.getMaxArtron()) {
                boolean isPowered = level.hasNeighborSignal(getBlockPos());
                if (!isPowered && energy.getEnergyStored() >= conversionAmount) {
                    if (--tickCounter <= 0) {
                        consoleTile.setArtron(consoleTile.getArtron() + 1);
                        energy.extractEnergy(conversionAmount, false);
                        shouldSpawnParticles = true;
                        shouldUpdate = true;
                        tickCounter = TICK_INTERVAL;
                    }
                } else {
                    shouldSpawnParticles = false;
                    isEnergyFull = energy.getEnergyStored() >= energy.getMaxEnergyStored();
                    if (--tickCounter <= 0) {
                        tickCounter = TICK_INTERVAL;
                        shouldUpdate = true;
                    }
                }
            } else {
                shouldSpawnParticles = false;
                isEnergyFull = energy.getEnergyStored() >= energy.getMaxEnergyStored();
                if (--tickCounter <= 0) {
                    tickCounter = TICK_INTERVAL;
                    shouldUpdate = true;
                }
            }

            // Send block update if needed
            if (shouldUpdate || isEnergyFull != (energy.getEnergyStored() >= energy.getMaxEnergyStored())) {
                level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 2);
            }
        });
    }

    @Override
    public CompoundNBT save(@NotNull CompoundNBT compound) {
        compound.putBoolean("particle", shouldSpawnParticles);
        compound.put("energy", energy.serializeNBT());
        return super.save(compound);
    }

    @Override
    public void load(@NotNull BlockState state, CompoundNBT nbt) {
        super.load(state, nbt);
        energy.deserializeNBT(nbt.getCompound("energy"));
        shouldSpawnParticles = nbt.getBoolean("particle");
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        BlockState state = getBlockState();
        load(state, pkt.getTag());
        if (shouldSpawnParticles && level != null) {
            for (int i = 0; i < 5; i++) {
                level.addParticle(TParticleTypes.ARTRON.get(),
                        getBlockPos().getX() + random.nextFloat(),
                        getBlockPos().getY() + random.nextFloat(),
                        getBlockPos().getZ() + random.nextFloat(),
                        0, 0, 0);
            }
        }
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return cap == CapabilityEnergy.ENERGY ? energyHolder.cast() : super.getCapability(cap, side);
    }

    @Override
    public void setRemoved() {
        super.setRemoved();
        energyHolder.invalidate();
    }
}