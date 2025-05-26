package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.Config;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.misc.ModEnergy;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.EnergyStorage;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ArtronUse;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;

public class ArtronConverterAUFETile extends TileEntity implements ITickableTileEntity {
    private static final int TICK_INTERVAL = 7;
    private final int buffer = Config.SERVER.converter_capacity.get();
    private final int generationRate = Config.SERVER.converter_generation.get();
    private final ModEnergy energy = new ModEnergy(buffer, generationRate, buffer);
    private final LazyOptional<EnergyStorage> energyHolder = LazyOptional.of(() -> energy);
    private int tickCounter = TICK_INTERVAL;
    private long lastActivationTime = 0;
    private boolean isEnergyFull = false;
    private boolean shouldSpawnParticles = false;
    private ConsoleTile consoleTile;
    private final Random random = new Random();

    public ArtronConverterAUFETile() {
        super(AseohaTiles.ARTRON_CONVERTER_AU_FE.get());
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
            boolean isPowered = level.hasNeighborSignal(getBlockPos());
            boolean shouldUpdate = false;

            if (isPowered && consoleTile.getArtron() > 1 && energy.getEnergyStored() < (energy.getMaxEnergyStored() - generationRate)) {
                energy.receiveEnergy(generationRate, false);
                ArtronUse use = consoleTile.getOrCreateArtronUse(ArtronUse.ArtronType.CONVERTER);
                use.setArtronUsePerTick(1);
                use.setTicksToDrain(1);
                shouldSpawnParticles = true;
                shouldUpdate = true;
            } else {
                shouldSpawnParticles = false;
                isEnergyFull = energy.getEnergyStored() >= energy.getMaxEnergyStored();
            }

            // Handle energy transfer to adjacent blocks
            if (energy.getEnergyStored() >= generationRate) {
                for (Direction dir : Direction.values()) {
                    TileEntity adjacent = level.getBlockEntity(getBlockPos().relative(dir));
                    if (adjacent != null) {
                        adjacent.getCapability(CapabilityEnergy.ENERGY, dir.getOpposite())
                                .ifPresent(adjacentEnergy -> {
                                    int transferred = adjacentEnergy.receiveEnergy(generationRate, false);
                                    energy.extractEnergy(transferred, false);
                                });
                    }
                }
            }

            // Update block state periodically
            if (--tickCounter <= 0) {
                tickCounter = TICK_INTERVAL;
                if (shouldUpdate || isEnergyFull != (energy.getEnergyStored() >= energy.getMaxEnergyStored())) {
                    level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 2);
                }
            }
        });
    }

    @Override
    public CompoundNBT save(CompoundNBT compound) {
        compound.putBoolean("particle", shouldSpawnParticles);
        compound.put("energy", energy.serializeNBT());
        return super.save(compound);
    }

    @Override
    public void load(BlockState state, CompoundNBT nbt) {
        super.load(state, nbt);
        energy.deserializeNBT(nbt.getCompound("energy"));
        shouldSpawnParticles = nbt.getBoolean("particle");
    }

    @Override
    public CompoundNBT getUpdateTag() {
        return this.save(new CompoundNBT());
    }

    @Override
    public void handleUpdateTag(BlockState state, CompoundNBT tag) {
        this.load(state, tag);
    }

    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        CompoundNBT nbtTag = new CompoundNBT();
        this.save(nbtTag);
        return new SUpdateTileEntityPacket(this.getBlockPos(), -1, nbtTag);
    }

    @Override
    public void onDataPacket(NetworkManager net, SUpdateTileEntityPacket pkt) {
        BlockState state = getBlockState();
        load(state, pkt.getTag());
        if (shouldSpawnParticles && level != null) {
            for (int i = 0; i < 5; i++) {
                level.addParticle(RedstoneParticleData.REDSTONE,
                        getBlockPos().getX() + random.nextFloat(),
                        getBlockPos().getY() + random.nextFloat(),
                        getBlockPos().getZ() + random.nextFloat(),
                        0, 0, 0);
            }
        }
    }

    @Nonnull
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
        return cap == CapabilityEnergy.ENERGY ? energyHolder.cast() : super.getCapability(cap, side);
    }

    @Override
    public void setRemoved() {
        super.setRemoved();
        energyHolder.invalidate();
    }
}