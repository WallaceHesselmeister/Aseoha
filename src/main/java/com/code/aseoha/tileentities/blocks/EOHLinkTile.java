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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class EOHLinkTile extends TileEntity implements ITickableTileEntity, ICapabilityProvider {
    private final EOHEnergyStorage energyStorage = new EOHEnergyStorage(this.level);
    public EOHLinkTile() {
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
        this.setChanged();
        this.Mark = true;
        Networking.sendToDimension(this.level.dimension(), new EOHSyncPacketS2C());
    }

    /**
     * Okay so how this SHOULD work is after 5 minutes, the EOH starts causing some time-space distortion (after giving you a few nasty effects) and at 8 minutes "overheats" AKA Shuts Off, you can keep it on with NO side effects by having a "Harmonic Stabilizer" within 10 blocks of the EOH.
     * TODO: Add nasty side effects and get em working
     */
    @Override
    public void tick() {
        this.Update();
        assert this.level != null;
        if(!this.level.isClientSide)
            WorldHelper.forceChunkVanillaIfNotLoaded(ServerLifecycleHooks.getCurrentServer().getLevel(this.level.dimension()), new ChunkPos(this.getBlockPos().getX() / 16, this.getBlockPos().getZ() / 16));
        this.consoleTile = TardisHelper.getConsoleInWorld(Objects.requireNonNull(this.getLevel())).orElse(null);
        if (this.consoleTile == null) return;
        if (!((IHelpWithConsole) this.consoleTile).Aseoha$GetHasEOH())
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetHasEOH(true);

        if (((IHelpWithConsole) this.consoleTile).Aseoha$GetEOH() == null)
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOH(this);

        this.active = this.hasStar;

        if (this.active) {
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHTimer(this.timer);

            // Check for Harmonic Pillars
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHPillars(((byte) this.GetPillars()));
            this.HasStabilizerNear = this.GetPillars() > 0;
            this.consoleTile.updateClient();
        }

        for (Direction direction : Direction.values()) {
            TileEntity neighbor = this.level.getBlockEntity(this.getBlockPos().offset(direction.getNormal()));
            if (neighbor != null) {
                neighbor.getCapability(CapabilityEnergy.ENERGY, direction.getOpposite()).ifPresent(energy -> {
                    int energyToTransfer = Math.min(energyStorage.extractEnergy(20, true), energy.receiveEnergy(0, true));
                    if (energyToTransfer > 0) {
                        energyStorage.extractEnergy(energyToTransfer, false);
                        energy.receiveEnergy(energyToTransfer, false);
                    }
                });
            }
        }

        if (this.level.getGameTime() % 20 == 0)
            if (this.Mark) {
                this.setChanged();
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(this.active);
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOH(this);
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(this.IsOverheated);
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHTimer(this.timer);
                ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHPillars((byte) this.GetPillars());
                this.Mark = false;
            }
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
                stabs = 0; // Set it to 0 so next time round it doesn't add onto the already existing stabs amount
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

    public void Activate() {
        this.active = true;
        this.hasStar = true;
        this.Mark = true;
        WorldHelper.forceChunkVanillaIfNotLoaded(ServerLifecycleHooks.getCurrentServer().getLevel(this.level.dimension()), new ChunkPos(this.getBlockPos().getX() / 16, this.getBlockPos().getZ() / 16));
        if (this.consoleTile == null) return;
        ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(true);
        ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOH(this);
        this.consoleTile.updateArtronValues();
    }

    public void Update() {
        if (this.consoleTile == null) return;
        if (this.active) {
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHActive(true);
            this.timer++;
        }
        if (this.timer != 0 && this.GetPillars() > 3) {
            this.timer = 0;
            this.IsOverheated = false;
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(false);
            this.Mark = true;
        }
        if (this.timer > 9600) {
            this.IsOverheated = true;
            ((IHelpWithConsole) this.consoleTile).Aseoha$SetEOHOverheated(true);
            this.Mark = true;
        }
    }

    public void SideEffects() {
        if (!this.IsOverheated || !this.HasStabilizerNear) {
            if (this.timer > 6000) {
                assert this.level != null;
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (PlayerEntity player : PlayerList) {
                    player.addEffect(new EffectInstance(Effects.CONFUSION, 20, 20));
                }
            }
            if (this.timer > 7200) {
                assert this.level != null;
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (PlayerEntity player : PlayerList) {
                    player.addEffect(new EffectInstance(Effects.POISON, 20, 20));
                }
            }

            if (this.timer > 8400) {
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (PlayerEntity player : PlayerList) {
                    player.addEffect(new EffectInstance(Effects.BLINDNESS, 20, 20, true, true, true));
                }
            }
            if (this.timer > 9600) {
                assert this.level != null;
                List<PlayerEntity> PlayerList = this.level.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(this.worldPosition).inflate(1000));
                for (int i = 0; i < PlayerList.size(); i++) {
                    this.IsOverheated = true;
                }
            }
        }
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, Direction side) {
        if (cap == CapabilityEnergy.ENERGY) {
            return LazyOptional.of(() -> energyStorage).cast();
        }
        return super.getCapability(cap, side);
    }

    @NotNull
    @Override
    public CompoundNBT getUpdateTag() {
        CompoundNBT nbt = super.getUpdateTag();
        return this.save(nbt);
    }

    @Override
    public void handleUpdateTag(BlockState state, CompoundNBT tag) {
        this.load(state, tag);
    }
}