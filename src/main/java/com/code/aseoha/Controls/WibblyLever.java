package com.code.aseoha.Controls;

import com.code.aseoha.aseoha;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.registries.ControlRegistry.ControlEntry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.consoles.*;

public class WibblyLever extends BaseControl {

    public static final ResourceLocation SAVE_KEY = new ResourceLocation(aseoha.MODID, "wibbly_lever_data");

    public WibblyLever(ControlEntry entry, ConsoleTile console, ControlEntity entity) {
        super(entry, console, entity);
    }

    @Override
    public EntitySize getSize() {
        if (this.getConsole() instanceof NemoConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        if (this.getConsole() instanceof GalvanicConsoleTile)
            return EntitySize.scalable(0.0625F, 0.0625F);

        if (getConsole() instanceof CoralConsoleTile) {
            return EntitySize.scalable(0.125F, 0.125F);
        }

        if (this.getConsole() instanceof HartnellConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        if (this.getConsole() instanceof XionConsoleTile)
            return EntitySize.scalable(0.0625F, 0.0625F);

        if (this.getConsole() instanceof ToyotaConsoleTile)
            return EntitySize.scalable(0.0625F, 0.0625F);

        if (this.getConsole() instanceof NeutronConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        if (this.getConsole() instanceof KeltConsoleTile)
            return EntitySize.scalable(0.125F, 0.125F);

        return EntitySize.scalable(0.125F, 0.125F);
    }

    @Override
    public Vector3d getPos() {
        if (getConsole() instanceof NemoConsoleTile)
            return new Vector3d(0, .5, 0);

        if (getConsole() instanceof GalvanicConsoleTile)
            return new Vector3d(0, .45, 0);

        if (getConsole() instanceof CoralConsoleTile)
            return new Vector3d(0, .5, 0);

        if (this.getConsole() instanceof HartnellConsoleTile)
            return new Vector3d(0, .47, 0);

        if (this.getConsole() instanceof ToyotaConsoleTile)
            return new Vector3d(0, .47, 0);

        if (this.getConsole() instanceof XionConsoleTile)
            return new Vector3d(0, .45, 0);

        if (this.getConsole() instanceof NeutronConsoleTile)
            return new Vector3d(0, .55, 0);

        if (this.getConsole() instanceof KeltConsoleTile)
            return new Vector3d(0, .5, 0);

        if (this.getConsole() instanceof SteamConsoleTile)
            return new Vector3d(0, 7.0 / 16.0, 0);

        return new Vector3d(0, 7.0 / 16.0, 0);
    }


    @Override
    public void deserializeNBT(CompoundNBT tag) {

    }

    @Override
    public CompoundNBT serializeNBT() {
        return new CompoundNBT();
    }

    @Override
    public boolean onRightClicked(ConsoleTile console, PlayerEntity player) {
        if (console == null || !console.hasLevel())
            return false;
        if (console.getArtron() >= 64 && console.canFly()) {
//            console.setDestination(console.getLevel().dimension(), new BlockPos(0, 128, 5));
            this.getConsole().forceLoadInteriorChunk(true, false);
//            this.getConsole().takeoffLocation = this.location;
            if (this.getConsole().getEntity() != null)
                this.getConsole().getEntity().remove();

            if (this.getConsole() != null && this.getConsole().getLevel() != null && this.getConsole().getLevel().getServer() != null) {
                ServerWorld otherWorld = this.getConsole().getLevel().getServer().getLevel(this.getConsole().getLevel().dimension());

                BlockPos extPos = this.getConsole().getBlockPos().above(); //Assume the exterior block is one block above our location
                ChunkPos chunkPos = new ChunkPos(extPos);

                WorldHelper.forceChunkIfNotLoaded(otherWorld, chunkPos, extPos);

//                this.getConsole().getLevel().getServer().tell(new TickDelayedTask(1, () -> {
                    this.getConsole().getExteriorType().remove(this.getConsole());
                    WorldHelper.unForceChunkIfLoaded(otherWorld, chunkPos, this.getConsole().getBlockPos().above());
//                }));
//            console.fly();
//            console.setDestinationReachedTick(1);
//            console.setFlightTicks(console.getReachDestinationTick());
//            console.land();
                console.getExteriorType().place(console, console.getLevel().dimension(), new BlockPos(0, 128, 5));
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public SoundEvent getFailSound(ConsoleTile console) {
        return TSounds.SONIC_FAIL.get();
    }

    @Override
    public SoundEvent getSuccessSound(ConsoleTile console) {
        return TSounds.SHIELD_HUM.get();
    }

    @Override
    public ResourceLocation getAdditionalDataSaveKey() {
        return SAVE_KEY;
    }

    @Override
    public void setConsole(ConsoleTile console, ControlEntity entity) {
        super.setConsole(console, entity);
        console.registerDataHandler(SAVE_KEY, this);
    }
}