package com.code.common.entities;

import com.code.common.registries.AseohaEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.dimension.DimensionType;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class DalekEntity extends Monster implements RangedAttackMob {
    private byte Variant = 0;
    private boolean HasVariant = false;
    public boolean UseTemporaryVariant = false;
    public boolean IsLoaded = false;

    private static final EntityDataAccessor<Integer> DATA_ID_ATTACK_TARGET;
    private static final EntityDataAccessor<Boolean> DATA_ID_MOVING;

    public DalekEntity(EntityType<? extends Monster> entityType, Level level) {
        super(entityType, level);
        this.xpReward = 25;
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(2, new RestrictSunGoal(this));
        this.goalSelector.addGoal(3, new FleeSunGoal(this, 1.0));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, LivingEntity.class, true));
    }

    public static AttributeSupplier.Builder setCustomAttributes() {
        return AmbientCreature.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 60.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE, 13.0D)
                .add(Attributes.FOLLOW_RANGE,  Double.POSITIVE_INFINITY);
    }

    @NotNull
    @Override
    public AttributeMap getAttributes() {
        return new AttributeMap(DalekEntity.setCustomAttributes().build());
    }

    @Override
    public void performRangedAttack(LivingEntity livingEntity, float f) {
        if (!this.level().isClientSide && this.hasLineOfSight(livingEntity)) {

            Lazer PlasmaBoltEntity = new Lazer(AseohaEntities.LAZER.get(), this.level());

            AbstractArrow abstractArrow = PlasmaBoltEntity.createFromConstructor(this.level(), this);

            abstractArrow.setBaseDamage(10);

            abstractArrow.shootFromRotation(abstractArrow, this.getXRot(), this.yHeadRot, 0.0F, 1.5F, 0.0F);

            this.level().addFreshEntity(abstractArrow);
        }
    }


    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        if(this.Variant != 0)
            compoundTag.putByte("Variant", this.Variant);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        if(compoundTag.contains("Variant"))
            this.Variant = compoundTag.getByte("Variant");
        else
            this.Variant = ((byte) new Random(System.currentTimeMillis()).nextInt(1, 4));
    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_MOVING, false);
        this.entityData.define(DATA_ID_ATTACK_TARGET, 0);
    }

    public byte GetVariant() {
        return this.Variant;
    }

    static {
        DATA_ID_MOVING = SynchedEntityData.defineId(DalekEntity.class, EntityDataSerializers.BOOLEAN);
        DATA_ID_ATTACK_TARGET = SynchedEntityData.defineId(DalekEntity.class, EntityDataSerializers.INT);
    }
}
