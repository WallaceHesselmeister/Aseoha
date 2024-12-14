package com.code.fabric.entities;

import com.code.fabric.registries.AseohaEntities;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.*;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Iterator;

public class Lazer extends AbstractArrow {
    private double BaseDamage;
    private double knockback;

    public Lazer(EntityType<? extends Lazer> entityType, Level world) {
        super(AseohaEntities.LazerEntityType(), world);
    }

    private Lazer(Level world, double x, double y, double z) {
        super(AseohaEntities.LazerEntityType(), x, y, z, world);
    }

    private Lazer(Level world, LivingEntity shooter) {
        super(AseohaEntities.LazerEntityType(), shooter, world);
    }

    public Lazer createFromConstructor(Level world, LivingEntity shooter) {
        return new Lazer(world, shooter);
    }

    public EntityType<?> EntityType() {
        return AseohaEntities.LazerEntityType();
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }

    public void SetKnockback(int k) {
        this.knockback = k;
    }

    @Override
    protected void onHitBlock(BlockHitResult ray) {
        super.onHitBlock(ray);
        BlockState TheBlock = this.level().getBlockState(ray.getBlockPos());
        if (TheBlock.equals(Blocks.AIR.defaultBlockState()))
            this.level().setBlock(ray.getBlockPos(), Blocks.FIRE.defaultBlockState(), 0);
        this.remove(RemovalReason.DISCARDED);
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    public void setBaseDamage(double d) {
        this.BaseDamage = d;
    }

    @Override
    public double getBaseDamage() {
        return this.BaseDamage;
    }


    @Override
    public void tick() {
        boolean bl = this.isNoPhysics();
        Vec3 vec3 = this.getDeltaMovement();
        Vec3 vec32;

        Vec3 vec33 = this.position();
        vec32 = vec33.add(vec3);
        HitResult hitResult = this.level().clip(new ClipContext(vec33, vec32, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, this));
        if (hitResult.getType() != HitResult.Type.MISS) {
            vec32 = hitResult.getLocation();
        }
//
        while (!this.isRemoved()) {
            EntityHitResult entityHitResult = this.findHitEntity(vec33, vec32);
            if (entityHitResult != null) {
                hitResult = entityHitResult;
            }

            if (hitResult != null && ((HitResult) hitResult).getType() == HitResult.Type.ENTITY) {
                Entity entity = ((EntityHitResult) hitResult).getEntity();
                Entity entity2 = this.getOwner();
                if (entity instanceof Player && entity2 instanceof Player && !((Player) entity2).canHarmPlayer((Player) entity)) {
                    hitResult = null;
                    entityHitResult = null;
                }
            }

            if (hitResult != null && !bl) {
                this.onHit((HitResult) hitResult);
                this.hasImpulse = true;
            }
//
            if (entityHitResult == null || this.getPierceLevel() <= 0) {
                break;
            }

            hitResult = null;
        }

        vec3 = this.getDeltaMovement();
        double e = vec3.x;
        double f = vec3.y;
        double g = vec3.z;

        double h = this.getX() + e;
        double j = this.getY() + f;
        double k = this.getZ() + g;
        double l = vec3.horizontalDistance();
        if (bl) {
            this.setYRot((float) (Mth.atan2(-e, -g) * 57.2957763671875));
        } else {
            this.setYRot((float) (Mth.atan2(e, g) * 57.2957763671875));
        }

        this.setXRot((float) (Mth.atan2(f, l) * 57.2957763671875));
        this.setXRot(lerpRotation(this.xRotO, this.getXRot()));
        this.setYRot(lerpRotation(this.yRotO, this.getYRot()));
        float m = 1F;

        this.setDeltaMovement(vec3.scale(m));
        if (!this.isNoGravity() && !bl) {
            Vec3 vec34 = this.getDeltaMovement();
            this.setDeltaMovement(vec34.x, vec34.y, vec34.z);
        }

        this.setPos(h, j, k);
        this.checkInsideBlocks();

    }


    @Override
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        float f = (float) this.getDeltaMovement().length();
        int i = Mth.ceil(Mth.clamp((double) f * this.BaseDamage, 0.0, 2.147483647E9));

        Entity entity2 = this.getOwner();
        DamageSource damageSource;
        if (entity2 == null) {
            damageSource = this.damageSources().arrow(this, this);
        } else {
            damageSource = this.damageSources().arrow(this, entity2);
            if (entity2 instanceof LivingEntity) {
                ((LivingEntity) entity2).setLastHurtMob(entity);
            }
        }

        if (entity.hurt(damageSource, (float) i)) {

            if (entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity) entity;
                if (!this.level().isClientSide && this.getPierceLevel() <= 0) {
                    livingEntity.setArrowCount(livingEntity.getArrowCount() + 1);
                }

                if (this.knockback > 0) {
                    double d = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                    Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale((double) this.knockback * 0.6 * d);
                    if (vec3.lengthSqr() > 0.0) {
                        livingEntity.push(vec3.x, 0.1, vec3.z);
                    }
                }

                if (!this.level().isClientSide && entity2 instanceof LivingEntity) {
                    EnchantmentHelper.doPostHurtEffects(livingEntity, entity2);
                    EnchantmentHelper.doPostDamageEffects((LivingEntity) entity2, livingEntity);
                }

                this.doPostHurtEffects(livingEntity);
                if (entity2 != null && livingEntity != entity2 && livingEntity instanceof Player && entity2 instanceof ServerPlayer && !this.isSilent()) {
                    ((ServerPlayer) entity2).connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.ARROW_HIT_PLAYER, 0.0F));
                }
            }

//            this.playSound(this.soundEvent, 1.0F, 1.2F / (this.random.nextFloat() * 0.2F + 0.9F));
        } else {
            this.setDeltaMovement(this.getDeltaMovement().scale(-0.1));
            this.setYRot(this.getYRot() + 180.0F);
            this.yRotO += 180.0F;
            if (!this.level().isClientSide && this.getDeltaMovement().lengthSqr() < 1.0E-7)
                this.discard();
        }

    }
}