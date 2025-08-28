package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithTardisEntity;
import com.code.aseoha.Helpers.MiscHelper;
import com.code.aseoha.Helpers.PlayerHelper;
import com.code.aseoha.aseoha;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReceiver;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SEntityVelocityPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;
import java.util.Objects;

import static org.jline.terminal.MouseEvent.Modifier.Shift;

@Mixin(TardisEntity.class)
public abstract class TardisEntityMixin extends Entity implements IHelpWithTardisEntity {
    public TardisEntityMixin(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(p_i48580_1_, p_i48580_2_);
    }

    @Shadow(remap = false)
    public abstract ConsoleTile getConsole();

    @Shadow(remap = false)
    private ConsoleTile console;

    @Shadow(remap = false)
    @Nullable
    public abstract ExteriorTile getExteriorTile();

    @Shadow(remap = false)
    private AbstractExterior exterior;

    @Shadow(remap = false)
    private boolean hasLanded;

    @Shadow(remap = false) public abstract Entity changeDimension(@NotNull ServerWorld destination);

//    private RegistryKey<DimensionType> interiorDimension;
    private boolean canDismount = false;
    private boolean jumping = false;
    public float renderYaw = 0;
    private float prevRotationPitch;
    private float prevRotationYaw;
    private float rotationPitch;
    private float rotationYaw;

    @Override
    public boolean isJumping() {
        return jumping;
    }

    @Override
    public void setJumping(boolean jumpingState) {
        this.jumping = jumpingState;
    }

    @Override
    public void setHasLanded(boolean hasLanded) {
        this.hasLanded = hasLanded;
    }

    /**
     * @author Codiak
     * @reason RWF
     */
    @Overwrite(remap = false)
    public boolean isPushable() {
        return true;
    }

    @Override
    public double getPassengersRidingOffset() {
        return (double)this.getDimensions(this.getPose()).height * 0.9D;
    }

    @Override
    protected boolean canRide(@NotNull Entity entityIn) {
        return true;
    }


    @Inject(method = "interact(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResultType;", at = @At("HEAD"), cancellable = true)
    private void Aseoha$Interact(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResultType> cir) {
        if (!player.level.isClientSide) {
            player.level.getServer().tell(new TickDelayedTask(1, () -> {
                double x = 0, y = TardisHelper.TARDIS_POS.getY(), z = 0;
                ConsoleTile console = this.getConsole();
                
                // Get interior dimension from console
                ServerWorld ws = null;
                if (console != null) {
                    ws = ((IHelpWithConsole) console).Aseoha$GetInteriorDimension().getServer().getLevel(((IHelpWithConsole) console).Aseoha$GetInteriorDimension().dimension());
                }
                
                //Get Console from interior dimension if not already available
                if (ws != null && console == null) {
                    TileEntity te = ws.getBlockEntity(TardisHelper.TARDIS_POS);
                    if (te instanceof ConsoleTile)
                        console = (ConsoleTile) te;
                }

                // Only proceed if we have a valid console and world
                if (console != null && ws != null) {
                    //If an interior door exists, put the player near it
                    DoorEntity door = console.getDoor().orElse(null);

                    float rotationYaw = door != null ? door.yRot : player.yRot;

                    aseoha.LOGGER.info("Teleporting player {} to TARDIS interior", player);

                    if (door != null)
                        door.addEntityToTeleportImmuneList(player.getUUID());

                    WorldHelper.teleportEntities(player, ws, x, y, z, rotationYaw, player.xRot);

                    //Motion
                    Vector3d oldMotion = player.getDeltaMovement();
                    if (door != null) {
                        Vector3d setMot = oldMotion.yRot(-(float) Math.toRadians(door.yRot));

                        this.level.getServer().tell(new TickDelayedTask(1, () -> {
                            Entity ent = ws.getEntity(player.getUUID());
                            if (ent != null)
                                ent.moveTo(setMot);
                            if (ent instanceof ServerPlayerEntity) {
                                ((ServerPlayerEntity) ent).connection.send(new SEntityVelocityPacket(ent));
                            }
                        }));
                    }
                } else {
                    aseoha.LOGGER.warn("Failed to teleport player to TARDIS interior - console: {}, world: {}", console, ws);
                }
            }));
        }
        cir.setReturnValue(ActionResultType.FAIL);
    }

    @Override
    public void setCanDismount(boolean canDismount) {
        this.canDismount = canDismount;
    }

    @Override
    public boolean canDismount() {
        return canDismount;
    }

    @Override
    public boolean canBeRiddenInWater(Entity rider) {
        return true;
    }


    @Inject(method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;tick()V", shift = At.Shift.AFTER))
    private void Aseoha$Tick(CallbackInfo ci) {

        if(level.isClientSide) {
            if(isVehicle()) {
                MiscHelper.forceThirdPerson();
            }
        }

        if(isVehicle()) {
            if(this.getControllingPassenger() instanceof PlayerEntity) {
                this.renderYaw += 5;

                if(!level.isClientSide) {
                    this.moveTo(Vector3d.ZERO);

                    PlayerEntity entity = (PlayerEntity) this.getControllingPassenger();

                    this.prevRotationPitch = this.rotationPitch;
                    this.prevRotationYaw = this.rotationYaw;

                    this.rotationPitch = entity.xRot;
                    this.rotationYaw = entity.yRot;

                    float speed = this.getConsole().getControl(ThrottleControl.class).get().getAmount();

                    Vector3d lookVec = PlayerHelper.getVectorForRotation(0, this.rotationYaw).scale(speed);

                    if(entity.getSpeed() > 0) {
                        this.setDeltaMovement(this.getDeltaMovement().add(lookVec.x, 0, lookVec.z));
                    } else if (entity.getSpeed() < 0) {
                        this.setDeltaMovement(this.getDeltaMovement().add(-lookVec.x, 0, -lookVec.z));
                    }

                    if(entity.moveDist > 0) {
                        Vector3d vec = PlayerHelper.getVectorForRotation(0, this.rotationYaw - 90F).scale(speed);

                        this.setDeltaMovement(this.getDeltaMovement().add(vec.x, 0, vec.z));
                    } else if (entity.moveDist < 0) {
                        Vector3d vec = PlayerHelper.getVectorForRotation(0, this.rotationYaw + 90F).scale(speed);

                        this.setDeltaMovement(this.getDeltaMovement().add(vec.x, 0, vec.z));
                    }

                    if(this.isJumping()) {
                        this.setDeltaMovement(this.getDeltaMovement().add(0, 1 * speed, 0));
                        this.setJumping(false);
                    }

                    if(entity.isCrouching()) {
                        this.setDeltaMovement(this.getDeltaMovement().add(0, -1 * speed, 0));
                    }

                    //Update Tardis Screen
                    this.getConsole().setCurrentLocation(this.level.dimension(), this.blockPosition());
                    this.getConsole().updateFlightTime();
                }
            }
        }
//        if (this.level.isClientSide) {
//            if (this.isVehicle()) {
//                MiscHelper.forceThirdPerson();
//            }
//        }
//
////        if(this.getControllingPassenger() instanceof TardisEntity)
//            if (this.isVehicle()) {
//            if (this.getControllingPassenger() instanceof PlayerEntity) {
//                    this.renderYaw += 5;
//
//                    if (this.level.isClientSide) {
//                        this.moveTo(Vector3d.ZERO);
//
//                        PlayerEntity entity = (PlayerEntity) this.getControllingPassenger();
//
//                        this.prevRotationPitch = this.xRot;
//                        this.prevRotationYaw = this.yRot;
//
//                        this.rotationPitch = entity.xRot;
//                        this.rotationYaw = entity.yRot;
//
//                        ThrottleControl throt = this.getConsole().getControl(ThrottleControl.class).get();
//                        float speed = throt.getAmount();
//
//                        Vector3d lookVec = PlayerHelper.getVectorForRotation(0, this.rotationYaw).scale(speed);
//
//                        if (entity.getSpeed() > 0) {
//                            this.moveTo(this.getDeltaMovement().add(lookVec.x, 0, lookVec.z));
//                        } else if (entity.moveDist < 0) {
//                            this.moveTo(this.getDeltaMovement().add(-lookVec.x, 0, -lookVec.z));
//                        }
//
//                        if (entity.getX() > 0) {
//                            Vector3d vec = PlayerHelper.getVectorForRotation(0, this.rotationYaw - 90F).scale(speed);
//
//                            this.moveTo(this.getDeltaMovement().add(vec.x, 0, vec.z));
//                        } else if (entity.getX() < 0) {
//                            Vector3d vec = PlayerHelper.getVectorForRotation(0, this.rotationYaw + 90F).scale(speed);
//
//                            this.moveTo(this.getDeltaMovement().add(vec.x, 0, vec.z));
//                        }
//
//                        if (this.isJumping()) {
//                            this.moveTo(this.getDeltaMovement().add(0, 1 * speed, 0));
//                            this.setJumping(false);
//                        }
//
//                        if (entity.isCrouching()) {
//                            this.moveRelative(this.getDeltaMovementDirection().toYRot(), new Vector3d(0, -1 * speed, 0));
//                        }
//
//                        //Update Tardis Screen
//                        this.getConsole().setCurrentLocation(this.level.dimension(), this.blockPosition());
//                        this.getConsole().updateFlightTime();
//                    }
////                else this.remove();
//            }
//            else
//                ((IHelpWithConsole) this.getConsole()).Aseoha$StopRide(true);
//        }



    }

    @Override
    public Entity getControllingPassenger() {
        return !this.getPassengers().isEmpty() ? this.getPassengers().get(0) : null;
    }

    /**
     * @author Codiak
     * @reason RWF
     */
//    @Overwrite(remap = false)
//    @Override
    @Inject(method = "rideTick()V", at = @At("TAIL"))
    public void rideTick(CallbackInfo ci) {
        this.setDeltaMovement(Vector3d.ZERO);
        if (canUpdate())
            this.tick();
        if (this.isPassenger()) {
            this.getVehicle().positionRider(this);
        }
    }



    public boolean canBeControlledByRider() {
        return true;
    }

//    @Override
//    public RegistryKey<DimensionType> getInteriorDimension() {
//        return interiorDimension;
//    }
//
//    @Override
//    public void setInteriorDimension(RegistryKey<DimensionType> interiorDimension) {
//        this.interiorDimension = interiorDimension;
//    }


}
