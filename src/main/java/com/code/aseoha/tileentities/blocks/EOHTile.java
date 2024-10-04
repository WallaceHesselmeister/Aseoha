package com.code.aseoha.tileentities.blocks;

import java.util.*;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.ModBlocks;
import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.config;
import com.code.aseoha.misc.FEHandler;
import net.minecraft.block.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.tardis.mod.tileentities.ConsoleTile;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.tardis.mod.helper.TardisHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class EOHTile extends TileEntity implements ITickableTileEntity, IEnergyStorage {
    public EOHTile() {
        super(AseohaTiles.EYE_OF_HARMONY.get());
    }

    public static Capability<IEnergyStorage> ENERGY = null;

    @CapabilityInject(IEnergyStorage.class)
    private static void onEnergyStorageInit(Capability<IEnergyStorage> capability) {
        aseoha.LOGGER.info("Received IEnergyStorage capability '{}': enabling Forge Energy support", capability);
        ENERGY = capability;
    }

    /**
     * This is used to get the time the Eye has NOT had a stabilizer for
     */
    public long timer = 0;
    /**
     * This is here for activation/de-activation
     */
    public boolean active = false;
    /**
     * if there's a stabilizer within 10 blocks of the EOH
     */
    public boolean HasStabilizerNear = false;
    /**
     * if it's "overheated", basically if it's gone 8 minutes without a stabilizer
     */
    public boolean IsOverheated;

    public int numberOfPillars = 0;

    public void setHasStar(boolean hasStar) {
        this.hasStar = hasStar;
    }

    public boolean hasStar = false;

    ConsoleTile consoleTile;

    /**
     * Okay so how this SHOULD work is after 5 minutes, the EOH starts causing some time-space distortion (after giving you a few nasty effects) and at 8 minutes "overheats" AKA Shuts Off, you can keep it on with NO side effects by having a "Harmonic Stabilizer" within 10 blocks of the EOH.
     */
    @Override
    public void tick() {
        assert this.level != null;
        this.consoleTile = TardisHelper.getConsoleInWorld(Objects.requireNonNull(this.getLevel())).orElse(null);
        if (this.consoleTile != null && this.active) {
            this.timer++;
            if (((IHelpWithConsole) this.consoleTile).Aseoha$GetEOH() == null || !((IHelpWithConsole) this.consoleTile).Aseoha$GetHasEOH()) {
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOH(this);
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetHasEOH(true);
            }

            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHTimer(this.timer);

            if (this.GetStabilizers() >= 2) {
                this.IsOverheated = false;
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(false);
                this.timer = 0;
            }

            // Check for Harmonic Pillars
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHPillars(this.GetStabilizer());
            this.HasStabilizerNear = this.GetStabilizer();
            if (this.timer > 9600) {
                this.IsOverheated = true;
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(true);
            }
            this.consoleTile.updateClient();
        }
    }

    public boolean GetStabilizer() {
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 10, this.getBlockPos().getZ()), 10, 11, 10).iterator(); iterator.hasNext(); ) {
            assert this.level != null;
            if (this.level.getBlockState(iterator.next()).getBlock() == ModBlocks.HARMONIC_PILLAR.get())
                return true;
            else if (!iterator.hasNext()) return false;
        }
        return false;
    }

    public int GetStabilizers() {
        int stabs = 0;
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 10, this.getBlockPos().getZ()), 10, 11, 10).iterator(); iterator.hasNext(); ) {
            assert this.level != null;
            if (this.level.getBlockState(iterator.next()).getBlock() == ModBlocks.HARMONIC_PILLAR.get())
                stabs++;
            else
                if (!iterator.hasNext()){
                    this.numberOfPillars = stabs;
                    stabs = 0;
                    return this.numberOfPillars;
                };
        }
        return this.numberOfPillars;
    }

    @Override
    public void load(@NotNull BlockState blockState, CompoundNBT compoundNBT) {
        this.IsOverheated = compoundNBT.getBoolean("overheatedState");
        this.timer = compoundNBT.getLong("timer");
        this.active = compoundNBT.getBoolean("active");
        super.load(blockState, compoundNBT);
//        this.worldPosition = new BlockPos(p_230337_2_.getInt("x"), p_230337_2_.getInt("y"), p_230337_2_.getInt("z"));
//        if (p_230337_2_.contains("ForgeData")) this.customTileData = p_230337_2_.getCompound("ForgeData");
//        if (getCapabilities() != null && p_230337_2_.contains("ForgeCaps")) deserializeCaps(p_230337_2_.getCompound("ForgeCaps"));
    }

    @NotNull
    @Override
    public CompoundNBT save(@NotNull CompoundNBT compoundNBT) {
        compoundNBT.putLong("timer", this.timer);
        compoundNBT.putBoolean("overheatedState", this.IsOverheated);
        compoundNBT.putBoolean("active", this.active);
        return super.saveMetadata(compoundNBT);
    }

    @Override
    public void setRemoved() {
        super.setRemoved();
        assert this.level != null;
        if (this.consoleTile != null) {
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetHasEOH(false);
            this.remove = true;
            this.invalidateCaps();
            this.requestModelDataUpdate();
        }
    }

    public void Activate(){
        this.active = true;
    }

    public void SideEffects() {
//        if (!this.IsOverheated || !this.HasStabilizerNear) {
//            if (this.timer > 6000) {
//                assert this.level != null;
//                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
//                for (int i = 0; i < PlayerList.size(); i++) {
//                    PlayerList.get(i).addEffect(new EffectInstance(Effects.CONFUSION, 20, 20));
//                }
//            }
//            if (this.timer > 7200) {
//                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
//                for (int i = 0; i < PlayerList.size(); i++) {
//                    PlayerList.get(i).addEffect(new EffectInstance(Effects.POISON, 20, 20));
//                }
//            }
//
//            if (this.timer > 8400) {
//                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
//                for (int i = 0; i < PlayerList.size(); i++) {
//                    PlayerList.get(i).addEffect(new EffectInstance(Effects.BLINDNESS, 20, 20, true, true, true));
//                }
//            }
//            if (this.timer > 9600) {
//                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
//                for (int i = 0; i < PlayerList.size(); i++) {
//                    this.IsOverheated = true;
//                }
//            }
//        }
    }




















    protected int energy = Integer.MAX_VALUE;
    protected int capacity = Integer.MAX_VALUE;
    protected int maxReceive = 0;
    protected int maxExtract = config.SERVER.EOHMaxFETransfer.get();

    public int receiveEnergy(int maxReceive, boolean simulate) {
//        if (!this.canReceive()) {
            return 0;
//        } else {
//            int energyReceived = Math.min(this.capacity - this.energy, Math.min(this.maxReceive, maxReceive));
//            if (!simulate) {
//                this.energy += energyReceived;
//            }
//
//            return energyReceived;
//        }
    }

    public int extractEnergy(int maxExtract, boolean simulate) {
        if (!this.canExtract()) {
            return 0;
        } else {
            int energyExtracted = Math.min(this.energy, Math.min(this.maxExtract, maxExtract));
//            if (!simulate) {
//                this.energy -= energyExtracted;
//            }

            return energyExtracted;
        }
    }

    public int getEnergyStored() {
        return Integer.MAX_VALUE;
    }

    public int getMaxEnergyStored() {
        return Integer.MAX_VALUE;
    }

    public boolean canExtract() {
        return !this.IsOverheated;
        }

    public boolean canReceive() {
        return false;
    }




    private final LazyOptional<IEnergyStorage> iEnergyStorageLazyOptional = LazyOptional.of(() -> new FEHandler(Integer.MAX_VALUE, config.SERVER.EOHMaxFETransfer.get()));

    @Override
    public <T> LazyOptional<T> getCapability(Capability<T> capability, @Nullable Direction direction) {
        if (capability == CapabilityEnergy.ENERGY) {
            return this.iEnergyStorageLazyOptional.cast();
        }
        return super.getCapability(capability, direction); // See note after snippet
    }
//        return cap == CapabilityEnergy.ENERGY ? this.getCapability(cap) : super.getCapability(cap, side);

    @Override
    protected void invalidateCaps() {
        super.invalidateCaps();
        this.iEnergyStorageLazyOptional.invalidate();
    }
}