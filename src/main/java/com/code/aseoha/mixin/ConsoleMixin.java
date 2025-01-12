package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithExterior;
import com.code.aseoha.aseoha;
import com.code.aseoha.config;
import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.protocol.EjectProtocol;
import com.code.aseoha.registries.ControlsRegistry;
import com.code.aseoha.tileentities.blocks.EOHTile;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.util.LazyOptional;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.controls.AbstractControl;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.CrashType;
import net.tardis.mod.misc.ITickable;
import net.tardis.mod.misc.SpaceTimeCoord;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ExteriorPropertyManager;
import net.tardis.mod.tileentities.console.misc.SparkingLevel;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;
import java.util.Optional;

@Mixin(value = ConsoleTile.class, priority = 998)
public abstract class ConsoleMixin extends TileEntity implements ITickableTileEntity, IHelpWithConsole {

    public ConsoleMixin(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
    }

    @Inject(method = "<init>(Lnet/minecraft/tileentity/TileEntityType;)V", at = @At("TAIL"), remap = false)
    private void Aseoha$ConsoleTile(TileEntityType type, CallbackInfo ci) {
        this.registerControlEntry(ControlsRegistry.COFFEEPOT.get());
        this.registerControlEntry(ControlsRegistry.WIBBLY_LEVER.get());
    }

    @Shadow(remap = false)
    public abstract <T extends AbstractControl> Optional<T> getControl(Class<T> clazz);

    @Shadow(remap = false)
    private TardisEntity tardisEntity;

    @Shadow(remap = false)
    public abstract RegistryKey<World> getDestinationDimension();

    @Shadow(remap = false)
    @Nullable
    public abstract TardisEntity getEntity();

    @Shadow(remap = false)
    private BlockPos destination;

    @Shadow(remap = false)
    public abstract boolean isInFlight();

    @Shadow(remap = false)
    public abstract AbstractExterior getExteriorType();

    @Shadow(remap = false)
    public abstract void registerControlEntry(ControlRegistry.ControlEntry entry);

    @Shadow(remap = false)
    public abstract void setMaxArtron(float maxArtron);

    @Shadow(remap = false)
    public abstract void setArtron(float artron);

    @Shadow(remap = false)
    public abstract void updateClient();

    @Shadow(remap = false)
    private ConsoleRoom consoleRoom;
    @Shadow(remap = false)
    private SparkingLevel sparkLevel;

    @Shadow(remap = false) public abstract void registerTicker(ITickable ticker);

    @Shadow(remap = false) public abstract boolean relocatePlayerToExterior(PlayerEntity player, ServerWorld destWorld);

    @Shadow(remap = false) public abstract void registerControlOverrides();

    @Shadow(remap = false) private SpaceTimeCoord returnLocation;

    @Shadow(remap = false) public abstract void playSoundAtExterior(SoundEvent sound, SoundCategory cat, float vol, float pitch);

    @Shadow(remap = false) public abstract PlayerEntity getPilot();

    @Shadow(remap = false) public abstract LazyOptional<DoorEntity> getDoor();

    @Shadow(remap = false) public abstract ExteriorPropertyManager getExteriorManager();

    @Shadow(remap = false) private AbstractExterior exterior;
    //TODO: FINISH MAINTENANCE MODE

    @Unique
    public boolean Aseoha$Hads = false;
    @Unique
    public boolean Aseoha$Maintenance = false;
    @Unique
    public boolean Aseoha$ExteriorSize = true;
//    @Unique
//    private ConsoleTile Aseoha$ConsoleTile;

    @Unique
    public EOHTile Aseoha$EOH;

    @Override
    public boolean Aseoha$GetEOHActive() {
        return Aseoha$EOHActive;
    }

    @Override
    public void Aseoha$SetEOHActive(boolean aseoha$EOHActive) {
        Aseoha$EOHActive = aseoha$EOHActive;
    }

    @Unique
    public boolean Aseoha$EOHActive;

    @Unique
    public boolean Aseoha$EOHOverheated;

    @Unique
    public byte Aseoha$EOHPillars;

    @Unique
    public long Aseoha$EOHTimer;

    @Unique
    private boolean Aseoha$RealWorldFlight;

    @Unique
    private BlockPos Aseoha$RidingPlayerPos;

    @Unique
    private World Aseoha$InteriorDimension;

    @Unique
    private PlayerEntity Aseoha$Pilot;

    @Override
    public void Aseoha$SetPilot(PlayerEntity player) {
        this.Aseoha$Pilot = player;
    }

    @Override
    public PlayerEntity Aseoha$GetPilot() {
        return this.Aseoha$Pilot;
    }

    @Inject(method = "load(Lnet/minecraft/block/BlockState;Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("HEAD"))
    public void Aseoha$ConsoleRead(BlockState state, CompoundNBT compound, CallbackInfo ci) {
        /** it's not pretty but it gets the job done **/
        if (compound.contains("hads"))
            this.Aseoha$Hads = compound.getBoolean("hads");
        if (compound.contains("eoh_timer"))
            this.Aseoha$EOHTimer = compound.getLong("eoh_timer");
        if (compound.contains("has_eoh"))
            this.Aseoha$HasEOH = compound.getBoolean("has_eoh");
        if (compound.contains("eoh_pillars_count"))
            this.Aseoha$EOHPillars = compound.getByte("eoh_pillars_count");
        if (compound.contains("maintenance"))
            this.Aseoha$Maintenance = compound.getBoolean("maintenance");

        //Old versions of ASEOHA used an integer for the scale (I planned on variable size), check if this is a boolean, if not, convert the int to a bool
        if (compound.contains("exterior_size_scale")) {
            if (compound.get("exterior_size_scale").getClass().equals(Boolean.class)) {
                this.Aseoha$ExteriorSize = compound.getBoolean("exterior_size_scale");
            } else {
                this.Aseoha$ExteriorSize = compound.getInt("exterior_size_scale") == 1;
            }
        }
//        if (!compound.contains("Aseoha$Pilot_UUID")) return;
//        if(this.level.getPlayerByUUID(compound.getUUID("Aseoha$Pilot_UUID")) == null) return;
//        this.Aseoha$Pilot = //new Pilot(
//                this.level.getPlayerByUUID(compound.getUUID("Aseoha$Pilot_UUID"));
    }

    @Inject(method = "save(Lnet/minecraft/nbt/CompoundNBT;)Lnet/minecraft/nbt/CompoundNBT;", at = @At("HEAD"))
    public void Aseoha$ConsoleWrite(CompoundNBT compound, CallbackInfoReturnable<CompoundNBT> cir) {
        compound.putBoolean("hads", this.Aseoha$Hads);
        compound.putBoolean("has_eoh", this.Aseoha$HasEOH);
        compound.putByte("eoh_pillars_count", this.Aseoha$EOHPillars);
        compound.putLong("eoh_timer", this.Aseoha$EOHTimer);
        compound.putBoolean("maintenance", this.Aseoha$Maintenance);
        compound.putBoolean("exterior_size_scale", this.Aseoha$ExteriorSize);
//        if (this.Aseoha$Pilot == null) return;
//        compound.putUUID("Aseoha$Pilot_UUID", this.Aseoha$Pilot.getUUID());
    }


    @Inject(method = "tick()V", at = @At("TAIL"))
    public void Aseoha$Tick(CallbackInfo ci) {

        if(this.Aseoha$IsRealWorldFlight()) {
            if(!this.getLevel().isClientSide) {
                TardisEntity tardis = this.Aseoha$GetTardisEntity();
                if (tardis.getPassengers().isEmpty()) {
                    PlayerEntity p = this.getPilot();
                    ExteriorTile Exterior = this.exterior.getExteriorTile(this.Aseoha$GetConsole());

                    tardis.setNoGravity(true);

                    this.relocatePlayerToExterior(p, (ServerWorld) Exterior.getLevel());
                    aseoha.LOGGER.warn("GO BULLSEYE!!");
                    p.startRiding(tardis);
                    aseoha.LOGGER.warn("GO BULLSEYE!! TAKE 2");
//                    ((IHelpWithExterior) Exterior).Aseoha$DematFly();
                    Exterior.setRemoved();
                    aseoha.LOGGER.warn("GO BULLSEYE!! TAKE 3");
                    this.updateClient();
                }
            }
        }

        if (!this.Aseoha$GetHasEOH()) return;
        if (this.Aseoha$GetEOH() == null) return;
        this.Aseoha$EOH.tick();
    }

    @Inject(method = "lambda$updateArtronValues$26", at = @At("TAIL"), remap = false)
    public void Aseoha$UpdateArtronValues(CallbackInfo ci) {
        if (!this.Aseoha$GetHasEOH()) return;
        if (this.Aseoha$GetEOH() == null) return;
        if (this.Aseoha$GetEOHOverheated()) return;
        if (!this.Aseoha$GetEOHActive()) return;
        this.setMaxArtron(Float.POSITIVE_INFINITY);
        this.setArtron(Float.POSITIVE_INFINITY);
    }

    @Override
    public boolean Aseoha$GetHads() {
        return Aseoha$Hads;
    }

    @Override
    public void Aseoha$SetHads(boolean Hads) {
        this.Aseoha$Hads = Hads;
    }

    @Override
    public long Aseoha$GetEOHTimer() {
        return this.Aseoha$EOHTimer;
    }

    @Override
    public void Aseoha$SetEOHTimer(long timer) {
        this.Aseoha$EOHTimer = timer;
    }

    @Override
    public boolean Aseoha$GetMaintenance() {
        return this.Aseoha$Maintenance;
    }

    @Override
    public void Aseoha$SetMaintenance(boolean maintenance) {
        this.Aseoha$Maintenance = maintenance;
    }

    @Override
    public boolean Aseoha$GetExteriorSize() {
        return this.Aseoha$ExteriorSize;
    }

    @Override
    public void Aseoha$SetExteriorSize(boolean aseoha$ExteriorSize) {
        this.Aseoha$ExteriorSize = aseoha$ExteriorSize;
    }

    @Override
    public void Aseoha$SetEOH(EOHTile eoh) {
        this.Aseoha$EOH = eoh;
    }

    @Override
    public void Aseoha$SetHasEOH(boolean eoh) {
        this.Aseoha$HasEOH = eoh;
    }

    @Override
    public boolean Aseoha$GetHasEOH() {
        return this.Aseoha$HasEOH;
    }

    @Override
    public void Aseoha$SetEOHPillars(byte EOHPillars) {
        this.Aseoha$EOHPillars = EOHPillars;
    }

    @Override
    public byte Aseoha$GetEOHPillars() {
        return this.Aseoha$EOHPillars;
    }


    @Override
    public EOHTile Aseoha$GetEOH() {
        return this.Aseoha$EOH;
    }

    @Override
    public boolean Aseoha$GetEOHOverheated() {
        return this.Aseoha$EOHOverheated;
    }

    @Override
    public void Aseoha$SetEOHOverheated(boolean overheatState) {
        this.Aseoha$EOHOverheated = overheatState;
    }

    @Unique
    public boolean Aseoha$HasEOH;

//    @ModifyExpressionValue(method = "Lnet/tardis/mod/tileentities/ConsoleTile;fly()V", at = @At(value = "INVOKE", target = "Lnet/tardis/mod/tileentities/ConsoleTile;isInFlight()Z"), remap = false)
//    private boolean Aseoha$OnlyFlyIfAllowed(boolean original) {
//        return original && !this.Aseoha$RealWorldFlight;
//    }


//    @ModifyReturnValue(method = "isInFlight()Z", at = @At("RETURN"), remap = false)
//    private boolean Aseoha$IsInFlight(boolean original) {
//        return original || this.isInFlight();
//    }


//    @Inject(method = "Lnet/tardis/mod/tileentities/ConsoleTile;fly()V", at = @At("HEAD"), remap = false)
//    private void Aseoha$Fly(CallbackInfo ci) {
//        this.artron = this.Aseoha$RealWorldFlight ? this.artron - this.calcFuelUse() * 2 : this.artron;
//        if (this.Aseoha$IsRealWorldFlight())
//            Networking.sendToServer(new RWFPacket((this.getExteriorType().getRegistryName())));
//
//    }

//    @Inject(method = "lambda$land$11", at = @At(value = "INVOKE", target = "Lnet/tardis/mod/exterior/AbstractExterior;remat(Lnet/tardis/mod/tileentities/ConsoleTile;)V", shift = At.Shift.AFTER), remap = false)
//    private void Aseoha$Land(CallbackInfo ci) {
//
//        if (this.Aseoha$IsRealWorldFlight()) {
//            this.Aseoha$RealWorldFlight = false;
//
//            this.getControl(HandbrakeControl.class).ifPresent((brake) -> brake.setFree(false)); //TODO: REMOVE this
//
//            this.tardisEntity.land(); //TODO: setHasLanded
//            this.tardisEntity.remove();
//        }
//    }

//    @Override
//    public void Aseoha$Ride(PlayerEntity playerEntity) {
//        this.Aseoha$StopRide(false);
//
//        if (this.Aseoha$GetTardisEntity() != null) {
//            ((IHelpWithTardisEntity) this.Aseoha$GetTardisEntity()).setCanDismount(false);
//
//
//            this.Aseoha$RidingPlayerPos = playerEntity.blockPosition();
//
//            BlockPos tardisPos = this.Aseoha$GetTardisEntity().blockPosition();
//            WorldHelper.teleportEntities(playerEntity, Objects.requireNonNull(Objects.requireNonNull(this.getEntity()).level.getServer()).getLevel(this.getDestinationDimension()), tardisPos.getX(), tardisPos.getY(), tardisPos.getZ(), playerEntity.yRot, playerEntity.xRot);
//            playerEntity.startRiding(this.Aseoha$GetTardisEntity(), true);
//        }
//    }

//    @Override
//    public void Aseoha$StopRide(boolean land) {
//        assert this.level != null;
//        if (this.level.isClientSide()) {
//            if (this.tardisEntity != null) {
//                if (!this.tardisEntity.getPassengers().isEmpty()) {
//                    Entity entity = this.tardisEntity.getPassengers().get(0);
//
//                    if (entity instanceof PlayerEntity) {
//                        ((IHelpWithTardisEntity) this.tardisEntity).setCanDismount(true);
//
//                        PlayerEntity playerEntity = (PlayerEntity) entity;
//                        playerEntity.stopRiding();
//                        if (this.Aseoha$InteriorDimension != null) {
//                            assert this.Aseoha$GetInteriorDimension() != null;
//                            Objects.requireNonNull(this.Aseoha$GetInteriorDimension().getServer()).tell(new TickDelayedTask(1, ()
//                                    -> WorldHelper.teleportEntities(playerEntity, this.Aseoha$GetInteriorDimension().getServer().getLevel(this.Aseoha$GetInteriorDimension().dimension()), this.Aseoha$RidingPlayerPos.getX(), this.Aseoha$RidingPlayerPos.getY(), this.Aseoha$RidingPlayerPos.getZ(), playerEntity.yRot, playerEntity.xRot)
//                            ));
//                        }
//                    }
//
//                    ClientHelper.shutTheFuckUp(null, SoundCategory.BLOCKS);
////                }
//                }
//
//                if (land) {
//                    if (this.tardisEntity != null) {
//                        this.destination = this.tardisEntity.blockPosition();
//                    }
//
//                    this.land();
//                }
//            }
//        }
////        }
//    }

//    @Inject(method = "lambda$takeoff$7", at = @At(value = "INVOKE", target = "Lnet/tardis/mod/exterior/AbstractExterior;demat(Lnet/tardis/mod/tileentities/ConsoleTile;)V", shift = At.Shift.BEFORE), remap = false)
//    public void Aseoha$TakeoffLambda7(ServerWorld otherWorld, ChunkPos chunkPos, CallbackInfo ci) {
//        this.flightTicks = 0;
//        if (!this.Aseoha$RealWorldFlight) {
//            this.flightTicks = this.reachDestinationTick;
//        }
//    }

//    @Inject(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/tardis/mod/tileentities/ConsoleTile;playAmbientNoises()V", shift = At.Shift.AFTER), remap = false)
//    public void Aseoha$ConsoleTick(CallbackInfo ci) {
////        setConsole(TardisHelper.getConsoleInWorld(this));
//        if (this.Aseoha$GetTardisEntity() != null) {
////            this.setConsole(this.getTardisEntity().getConsole());
////            aseoha.LOGGER.info("NOT NULL");
//            assert this.tardisEntity.level != null;
//            if (this.tardisEntity.level.isClientSide && this.getExteriorType().getExteriorTile(this.Aseoha$GetConsole()) == null && this.tardisEntity == null && !this.isInFlight()) {
//                this.getExteriorType().place(this.Aseoha$GetConsole(), this.destinationDimension, this.getDestinationPosition());
//            }
////            aseoha.LOGGER.info("FINISHED");
//        }
//    }

    /**
     * @author Codiak
     * @reason Get ambient noises to stfu.
     */
    @Overwrite(remap = false)
    private void playAmbientNoises() {
        if (!this.level.isClientSide) return;

        if (!config.COMMON.ShouldAmbientSoundsPlay.get()) return;

        PlayerEntity player = ClientHelper.getClientPlayer();

        if (player.tickCount % 2400 == 0)
            ClientHelper.playMovingSound(player, (SoundEvent) TSounds.AMBIENT_CREAKS.get(), SoundCategory.AMBIENT, 0.5F, false);

        if (this.consoleRoom == ConsoleRoom.NAUTILUS && player.tickCount % 600 == 0)
            ClientHelper.playMovingSound(player, SoundEvents.AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE, SoundCategory.AMBIENT, 1.0F, false);

        if (this.sparkLevel == SparkingLevel.SPARKS && this.level.getGameTime() % 60L == 0L)
            this.level.playSound(ClientHelper.getClientPlayer(), this.getBlockPos(), (SoundEvent) TSounds.ELECTRIC_SPARK.get(), SoundCategory.BLOCKS, 0.3F, 1.0F);
    }

    @Override
    public void Aseoha$CleanupRide() {
        this.Aseoha$RealWorldFlight = false;
        this.getControl(ThrottleControl.class).ifPresent(throt -> throt.setAmount(0.0F));
        this.getControl(HandbrakeControl.class).ifPresent(brake -> brake.setFree(false));
    }

    @Inject(method = "crash(Lnet/tardis/mod/misc/CrashType;)V", at = @At("HEAD"), remap = false)
    private void Aseoha$Crash(CrashType type, CallbackInfo ci) {
//        this.Aseoha$StopRide(false);
        this.getEntity().ejectPassengers();
    }

    @Override
    public TardisEntity Aseoha$GetTardisEntity() {
        return this.tardisEntity != null ? this.tardisEntity : new TardisEntity(this.getExteriorType().getExteriorTile(this.Aseoha$GetConsole()).getLevel());
    }

    @Override
    public World Aseoha$GetInteriorDimension() {
//        return interiorDimension;
        return this.level;
    }

    @Override
    public void Aseoha$SetInteriorDimension(World interiorDimension) {
        this.Aseoha$InteriorDimension = interiorDimension;
    }

    @Override
    public boolean Aseoha$IsRealWorldFlight() {
        return Aseoha$RealWorldFlight;
    }

    @Override
    public void Aseoha$SetRealWorldFlight(boolean rwf) {
        this.Aseoha$RealWorldFlight = rwf;
    }

//    private void setConsole(ConsoleTile console){
//        this.Aseoha$ConsoleTile = console;
//    }

    /**
     * Use this in the Mixin to get the ConsoleTile
     *
     * @return ConsoleTile
     */
    @Override
    public ConsoleTile Aseoha$GetConsole() {
        assert this.Aseoha$GetInteriorDimension() != null;
        return TardisHelper.getConsoleInWorld(this.Aseoha$GetInteriorDimension()).get();
    }
}