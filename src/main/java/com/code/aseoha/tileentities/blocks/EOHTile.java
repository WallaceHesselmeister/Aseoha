package com.code.aseoha.tileentities.blocks;

import java.util.*;

import com.code.aseoha.block.AseohaBlocks;
import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.tardis.mod.tileentities.ConsoleTile;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.tardis.mod.helper.TardisHelper;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class EOHTile extends TileEntity implements ITickableTileEntity {
    public EOHTile() {
        super(AseohaTiles.EYE_OF_HARMONY.get());
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

    public boolean GetHasStar() {
        return this.hasStar;
    }

    boolean Mark;

    private boolean hasStar = false;

    private ConsoleTile consoleTile;

    /**
     * Okay so how this SHOULD work is after 5 minutes, the EOH starts causing some time-space distortion (after giving you a few nasty effects) and at 8 minutes "overheats" AKA Shuts Off, you can keep it on with NO side effects by having a "Harmonic Stabilizer" within 10 blocks of the EOH.
     * TODO: Add nasty side effects
     */
    @Override
    public void tick() {
        assert this.level != null;
        this.consoleTile = TardisHelper.getConsoleInWorld(Objects.requireNonNull(this.getLevel())).orElse(null);
        if (this.consoleTile != null) {
            if (!((IHelpWithConsole) this.consoleTile).Aseoha$GetHasEOH())
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetHasEOH(true);

            if (((IHelpWithConsole) this.consoleTile).Aseoha$GetEOH() == null)
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOH(this);

        }
        if (this.consoleTile != null && this.active) {
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHTimer(this.timer);

            // Check for Harmonic Pillars
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHPillars(this.GetStabilizers() > 0);
            this.HasStabilizerNear = this.GetStabilizers() > 0;
            this.consoleTile.updateClient();
        }

        if (this.level.getGameTime() % 20 == 0)
            if (this.Mark) {
                this.setChanged();
                if (this.consoleTile != null)
                    ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(this.active);
            }
        this.Update();
    }

    @Deprecated
    public boolean GetStabilizer() {
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 10, this.getBlockPos().getZ()), 10, 11, 10).iterator(); iterator.hasNext(); ) {
            assert this.level != null;
            if (this.level.getBlockState(iterator.next()).getBlock() == AseohaBlocks.HARMONIC_PILLAR.get())
                return true;
            else if (!iterator.hasNext()) return false;
        }
        return false;
    }

    public int GetStabilizers() {
        int stabs = 0;
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getBlockPos().getX(), this.getBlockPos().getY() + 10, this.getBlockPos().getZ()), 10, 11, 10).iterator(); iterator.hasNext(); ) {
            assert this.level != null;
            if (this.level.getBlockState(iterator.next()).getBlock() == AseohaBlocks.HARMONIC_PILLAR.get())
                stabs++;
            else if (!iterator.hasNext()) {
                this.numberOfPillars = stabs;
                stabs = 0;
                return this.numberOfPillars;
            }
            ;
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
//        this.worldPosition = new BlockPos(p_230337_2_.getInt("x"), p_230337_2_.getInt("y"), p_230337_2_.getInt("z"));
//        if (p_230337_2_.contains("ForgeData")) this.customTileData = p_230337_2_.getCompound("ForgeData");
//        if (getCapabilities() != null && p_230337_2_.contains("ForgeCaps")) deserializeCaps(p_230337_2_.getCompound("ForgeCaps"));
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

    @NotNull
    @Override
    public CompoundNBT getUpdateTag() {
        return this.save(new CompoundNBT());
    }

    @Override
    public void setRemoved() {
        this.active = false;
        this.timer = 0;
        this.IsOverheated = false;
        this.setHasStar(false);
        assert this.level != null;
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

    public void Activate() {
        this.active = true;
        if (this.consoleTile != null) {
            this.consoleTile.updateArtronValues();
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(true);
        }
        this.Mark = true;
    }

    public void Update() {
        if (this.active && this.GetStabilizers() < 2) {
            if (this.consoleTile != null)
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(true);
            this.timer++;
        }
        if (this.timer != 0 && this.GetStabilizers() > 1) {
            this.timer = 0;
            this.IsOverheated = false;
            if (this.consoleTile != null)
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(false);
            this.Mark = true;
        }
        if (this.timer > 9600) {
            this.IsOverheated = true;
            if (this.consoleTile != null)
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(true);
            this.Mark = true;
        }
    }

    public void SideEffects() {
        if (!this.IsOverheated || !this.HasStabilizerNear) {
            if (this.timer > 6000) {
                assert this.level != null;
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (int i = 0; i < PlayerList.size(); i++) {
                    PlayerList.get(i).addEffect(new EffectInstance(Effects.CONFUSION, 20, 20));
                }
            }
            if (this.timer > 7200) {
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (int i = 0; i < PlayerList.size(); i++) {
                    PlayerList.get(i).addEffect(new EffectInstance(Effects.POISON, 20, 20));
                }
            }

            if (this.timer > 8400) {
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (int i = 0; i < PlayerList.size(); i++) {
                    PlayerList.get(i).addEffect(new EffectInstance(Effects.BLINDNESS, 20, 20, true, true, true));
                }
            }
            if (this.timer > 9600) {
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (int i = 0; i < PlayerList.size(); i++) {
                    this.IsOverheated = true;
                }
            }
        }
    }

//    public LazyOptional<IEnergyStorage> energy = LazyOptional.of(() -> EOHEnergyProvider.ENERGY.getDefaultInstance());

//    @NotNull
//    @Override
//    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
//        if (cap == CapabilityEnergy.ENERGY) {
//            return energy.cast();
//        }
//        return super.getCapability(cap, side);
//    }

}