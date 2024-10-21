package com.code.aseoha.entities;


import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.tardis.api.space.entities.ISpaceImmuneEntity;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.entity.BessieEntity;
import net.tardis.mod.items.TItems;
import net.tardis.mod.sounds.TSounds;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

/**
 * @author Codiak <br />
 * This is a ridable Davros wheelchair.
 */
public class DavrosChair extends CreatureEntity implements IMob, ISpaceImmuneEntity {
    public DavrosChair(EntityType<? extends CreatureEntity> p_i50129_1_, World p_i50129_2_) {
        super(p_i50129_1_, p_i50129_2_);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return CreatureEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, Float.POSITIVE_INFINITY)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE, 13.0D)
                .add(Attributes.FOLLOW_RANGE, 0);
    }

    public void positionRider(@NotNull Entity pass) {
//        Vector3d pos = new Vector3d(0, 1, 0);
//            pass.setPos(pos.x, pos.y, pos.z);
        Vector3d pos;
        if (!this.getPassengers().isEmpty()) {
            pos = this.getLookAngle().scale(0.25).add(this.position()); //.scale(0.5).add(this.position());
            pass.setPos(pos.x, pos.y, pos.z);
        }

    }

    public void push(@NotNull Entity entityIn) {
        if (!(entityIn instanceof PlayerEntity) && this.getPassengers().isEmpty() && this.level.getGameTime() % 20L == 0L && entityIn.getVehicle() == null) {
            entityIn.startRiding(this);
        }

        super.push(entityIn);
    }

    @NotNull
    @Override
    public ActionResultType interact(PlayerEntity player, @NotNull Hand hand) {
        if (!player.isCrouching() && getPassengers().isEmpty() && player.getMainHandItem().isEmpty()) {
            player.startRiding(this);
        }
        if (player.isCrouching() && player.getMainHandItem().getItem() == TItems.SONIC.get()) {
            heal(1);
        }
        return super.interact(player, hand);
    }

    public double getPassengersRidingOffset() {
        return 0.5;
    }

    public void tick() {
        this.setCustomNameVisible(this.hasCustomName());
        boolean canDrive = this.getHealth() > 5.0F;
        if (this.getPassengers().isEmpty() && this.onGround) {
            this.setDeltaMovement(0.0, 0.0, 0.0);
        }

        this.setAirSupply(this.getMaxAirSupply());
        if (this.level.isClientSide) {
            if (this.tickCount == 10) {
                ClientHelper.playMovingSound(this, TSounds.DALEK_MOVES.get(), SoundCategory.NEUTRAL, 0.3F, true);
            }

            if (!canDrive) {
                BlockPos pos = this.blockPosition();
                Vector3d look = this.getLookAngle();
                CampfireBlock.makeParticles(this.level, pos.relative(Direction.getNearest(look.x, look.y, look.z)), false, false);
            }
        }

        super.tick();
    }

    public void travel(@NotNull Vector3d p_213352_1_) {
        float motion = MathHelper.sqrt(Entity.getHorizontalDistanceSqr(this.getDeltaMovement()));
        boolean isMoving = this.getSpeed() > 0;
        if (this.isAlive()) {
            if (this.isVehicle() && this.canBeControlledByRider()) {
                if (this.getControllingPassenger() != null) {
                    LivingEntity livingentity = (LivingEntity)this.getControllingPassenger();
                    if (isMoving) {
                        this.yRot = livingentity.yRot;
                    }

                    this.yRotO = this.yRot;
                    this.xRot = livingentity.xRot * 0.5F;
                    this.setRot(this.yRot, this.xRot);
                    this.yBodyRot = this.yRot;
                    this.yHeadRot = this.yBodyRot;
                    float moveForwardAmount = livingentity.zza;
                    if (moveForwardAmount <= 0.0F) {
                        moveForwardAmount *= 0.25F;
                    }

                    this.maxUpStep = 1.0F;
                    if (this.isControlledByLocalInstance()) {
                        this.setSpeed(0.3F);
                        super.travel(new Vector3d(0.0, p_213352_1_.y, (double) moveForwardAmount));
                    }
                }
            } else {
                super.travel(p_213352_1_);
            }
        }

    }

    public boolean shouldShowName() {
        return super.shouldShowName();
    }

    public boolean rideableUnderWater() {
        return true;
    }

    @Nullable
    public Entity getControllingPassenger() {
        if(!this.getPassengers().isEmpty())
            return this.getPassengers().get(0);
        else
            return (Entity) null;
    }

    public boolean canBeControlledByRider() {
        return true;
    }

    protected void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
    }

    protected void playSwimSound(float volume) {
    }

    public boolean fireImmune() {
        return true;
    }

    public boolean displayFireAnimation() {
        return false;
    }

    @Override
    public boolean shouldTakeSpaceDamage() {
        return false;
    }
}
