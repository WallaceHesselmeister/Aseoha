package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.block.AseohaBlocks;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.s2c.EOHSyncPacketS2C;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.misc.EOHEnergyStorage;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class EOHTile extends TileEntity implements ICapabilityProvider {
    private final EOHEnergyStorage energyStorage = new EOHEnergyStorage(this.level);
    public EOHTile() {
        super(AseohaTiles.EYE_OF_HARMONY.get());
    }

    /**
     * This is used to get the time the Eye has NOT had a stabilizer for
     */
    @Getter
    private long timer = 0;
    /**
     * This is here for activation/deactivation
     */
    @Getter @Setter
    public boolean active = false;
    /**
     * if there's a stabilizer within 10 blocks of the EOH
     */
    @Getter @Setter
    public boolean HasStabilizerNear = false;
    /**
     * if it's "overheated", basically if it's gone 8 minutes without a stabilizer
     */
    public boolean IsOverheated;

    @Getter
    private int numberOfPillars = 0;

    @Getter
    public boolean Mark;

    @Getter @Setter
    private boolean hasStar = false;

    @Getter
    private ConsoleTile consoleTile;

    @Override
    public void onLoad() {
        super.onLoad();
        assert this.level != null;
        if(this.level.isClientSide) return;
        Networking.sendToDimension(this.level.dimension(), new EOHSyncPacketS2C());
    }


    @Deprecated
    public boolean GetPillar() {
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 10, this.getBlockPos().getZ()), 10, 11, 10).iterator(); iterator.hasNext(); ) {
            assert this.level != null;
            if (this.level.getBlockState(iterator.next()).getBlock() == AseohaBlocks.HARMONIC_PILLAR.get())
                return true;
            else if (!iterator.hasNext()) return false;
        }
        return false;
    }

    public int GetPillars() {
        int stabs = 0;
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 10, this.getBlockPos().getZ()), 10, 11, 10).iterator(); iterator.hasNext(); ) {
            assert this.level != null;
            if (this.level.getBlockState(iterator.next()).getBlock() == AseohaBlocks.HARMONIC_PILLAR.get())
                stabs++;
            else if (!iterator.hasNext()) {
                this.numberOfPillars = stabs;
                stabs = 0; // Set it to 0 so next time round it doesn't add onto the already existing stabs amount, idk how/why but it DOES do that
                return this.numberOfPillars;
            }
        }
        return this.numberOfPillars;
    }

    @Override
    public void load(@NotNull BlockState blockState, CompoundNBT compoundNBT) {
        this.IsOverheated = compoundNBT.getBoolean("overheatedState");
        this.timer = compoundNBT.getLong("timer");
        this.active = compoundNBT.getBoolean("active");
        this.hasStar = compoundNBT.getBoolean("hasStar");
        this.numberOfPillars = compoundNBT.getInt("numberOfPillars");
        super.load(blockState, compoundNBT);
    }

    @NotNull
    @Override
    public CompoundNBT save(@NotNull CompoundNBT compoundNBT) {
        compoundNBT.putLong("timer", this.timer);
        compoundNBT.putBoolean("overheatedState", this.IsOverheated);
        compoundNBT.putBoolean("hasStar", this.hasStar);
        compoundNBT.putBoolean("active", this.active);
        compoundNBT.putInt("numberOfPillars", this.numberOfPillars);
        return super.save(compoundNBT);
    }

    @Override
    public void setRemoved() {
        this.active = false;
        this.timer = 0;
        this.IsOverheated = false;
        this.setHasStar(false);
        if (this.consoleTile != null) {
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetHasEOH(false);
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOH(null);
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(false);
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHTimer(0);
            this.remove = true;
            this.invalidateCaps();
            this.requestModelDataUpdate();
        }
        super.setRemoved();
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, Direction side) {
        if (cap == CapabilityEnergy.ENERGY) {
            return LazyOptional.of(() -> energyStorage).cast();
        }
        return super.getCapability(cap, side);
    }
}