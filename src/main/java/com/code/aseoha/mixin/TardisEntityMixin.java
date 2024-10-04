package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithTardisEntity;
import com.code.aseoha.aseoha;
import com.code.aseoha.misc.*;
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
        return false;
    }

//    @Override
//    public boolean canPassengerSteer() {
//        return true;
//    }

    @Override
    protected boolean canRide(@NotNull Entity entityIn) {
        return true;
    }


    @Inject(method = "interact(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResultType;", at = @At("HEAD"))
    private void Aseoha$Interact(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResultType> cir) {
        if (player.level.isClientSide) {
            Objects.requireNonNull(player.level.getServer()).tell(new TickDelayedTask(1, () -> {
                double x = 0, y = TardisHelper.TARDIS_POS.getY(), z = 0;
                ConsoleTile console = null;
//                ServerWorld ws = Objects.requireNonNull(this.level.getServer()).getLevel(Objects.requireNonNull(Objects.requireNonNull(Objects.requireNonNull(this.getConsole().getLevel()).getServer()).getLevel(this.getConsole().getLevel().dimension())).dimension());
                assert console != null;
                ServerWorld ws = ((IHelpWithConsole) console).Aseoha$GetInteriorDimension().getServer().getLevel(((IHelpWithConsole) console).Aseoha$GetInteriorDimension().dimension());//this.level.getServer().getLevel(((IHelpWithConsole) this.getConsole()).getInteriorDimension().dimension());
                //Get Console
                if (ws != null) {
                    TileEntity te = ws.getBlockEntity(TardisHelper.TARDIS_POS);
                    if (te instanceof ConsoleTile)
                        console = (ConsoleTile) te;
                }

                //If an interior door exists, put the player near it
                DoorEntity door = console != null ? console.getDoor().orElse(null) : null;

                float rotationYaw = door != null ? door.yRot : player.yRot;

                aseoha.LOGGER.info("test {}", player);

                if (door != null)
                    door.addEntityToTeleportImmuneList(player.getUUID());

                WorldHelper.teleportEntities(player, ws, x, y, z, rotationYaw, player.xRot);

                //Motion

                Vector3d oldMotion = player.getDeltaMovement();
                assert door != null;
                Vector3d setMot = oldMotion.yRot(-(float) Math.toRadians(door.yRot));

                this.level.getServer().tell(new TickDelayedTask(1, () -> {
                    Entity ent = ws.getEntity(player.getUUID());
                    if (ent != null)
                        ent.moveTo(setMot);
                    if (ent instanceof ServerPlayerEntity) {
                        ((ServerPlayerEntity) ent).connection.send(new SEntityVelocityPacket(ent));
                    }
                }));
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


    @Inject(method = "tick()V", at = @At("HEAD"))
    private void Aseoha$Tick(CallbackInfo ci) {
        if (Dist.CLIENT.isClient()) {
            if (this.isVehicle()) {
//                ClientHelper.proxy.forceThirdPerson();
//                WorldHelper.forceThirdPerson
                MiscHelper.forceThirdPerson();

            }
        }
//        if(this.getControllingPassenger().equals(TardisEntity.class))

        if (this.isVehicle()) {
            if (this.getControllingPassenger() != null && this.getControllingPassenger() instanceof PlayerEntity) {
                if(this.getConsole() != null && this.getExteriorTile() != null) {
                    this.renderYaw += 5;

                    if (this.level.isClientSide) {
                        this.moveTo(Vector3d.ZERO);

                        PlayerEntity entity = (PlayerEntity) this.getControllingPassenger();

                        this.prevRotationPitch = this.xRot;
                        this.prevRotationYaw = this.yRot;

                        this.rotationPitch = entity.xRot;
                        this.rotationYaw = entity.yRot;

                        ThrottleControl throt = this.getConsole().getControl(ThrottleControl.class).get();
                        float speed = throt.getAmount();

                        Vector3d lookVec = PlayerHelper.getVectorForRotation(0, this.rotationYaw).scale(speed);

                        if (entity.getSpeed() > 0) {
                            this.moveTo(this.getDeltaMovement().add(lookVec.x, 0, lookVec.z));
                        } else if (entity.moveDist < 0) {
                            this.moveTo(this.getDeltaMovement().add(-lookVec.x, 0, -lookVec.z));
                        }

                        if (entity.getX() > 0) {
                            Vector3d vec = PlayerHelper.getVectorForRotation(0, this.rotationYaw - 90F).scale(speed);

                            this.moveTo(this.getDeltaMovement().add(vec.x, 0, vec.z));
                        } else if (entity.getX() < 0) {
                            Vector3d vec = PlayerHelper.getVectorForRotation(0, this.rotationYaw + 90F).scale(speed);

                            this.moveTo(this.getDeltaMovement().add(vec.x, 0, vec.z));
                        }

                        if (this.isJumping()) {
                            this.moveTo(this.getDeltaMovement().add(0, 1 * speed, 0));
                            this.setJumping(false);
                        }

                        if (entity.isCrouching()) {
                            this.moveRelative(this.getMotionDirection().toYRot(), new Vector3d(0, -1 * speed, 0));
                        }

                        //Update Tardis Screen
                        this.getConsole().setCurrentLocation(this.level.dimension(), this.blockPosition());
                        this.getConsole().updateFlightTime();
                    }
                }
//                else this.remove();
            }
            else
                ((IHelpWithConsole) this.getConsole()).Aseoha$StopRide(true);
        }
    }

    @Override
    public Entity getControllingPassenger() {
        if (!this.getPassengers().isEmpty()) {
            return this.getPassengers().get(0);
        }

        return null;
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
            Objects.requireNonNull(this.getVehicle()).positionRider(this);
        }
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
