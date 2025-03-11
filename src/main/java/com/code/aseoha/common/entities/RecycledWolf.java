package com.code.aseoha.common.entities;

import java.util.UUID;
import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.AnimalMateGoal;
import net.minecraft.entity.ai.goal.AttackWithOwnerGoal;
import net.minecraft.entity.ai.goal.EscapeDangerGoal;
import net.minecraft.entity.ai.goal.FleeEntityGoal;
import net.minecraft.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.entity.ai.goal.LookAroundGoal;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.PounceAtTargetGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.ai.goal.SitGoal;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.entity.ai.goal.TrackOwnerAttackerGoal;
import net.minecraft.entity.ai.goal.UniversalAngerGoal;
import net.minecraft.entity.ai.goal.UntamedActiveTargetGoal;
import net.minecraft.entity.ai.goal.WanderAroundFarGoal;
import net.minecraft.entity.ai.goal.WolfBegGoal;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.AbstractSkeletonEntity;
import net.minecraft.entity.mob.Angerable;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Hand;
import net.minecraft.util.TimeHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.EntityView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

public class RecycledWolf extends TameableEntity implements Angerable {
    private static final TrackedData<Boolean> BEGGING;
    private static final TrackedData<Integer> COLLAR_COLOR;
    private static final TrackedData<Integer> ANGER_TIME;
    public static final Predicate<LivingEntity> FOLLOW_TAMED_PREDICATE;
    private static final float WILD_MAX_HEALTH = 8.0F;
    private static final float TAMED_MAX_HEALTH = 20.0F;
    private float begAnimationProgress;
    private float lastBegAnimationProgress;
    private boolean furWet;
    private boolean canShakeWaterOff;
    private float shakeProgress;
    private float lastShakeProgress;
    private static final UniformIntProvider ANGER_TIME_RANGE;
    @Nullable
    private UUID angryAt;

    public RecycledWolf(EntityType<? extends RecycledWolf> entityType, World world) {
        super(entityType, world);
        this.setTamed(false);
        this.setPathfindingPenalty(PathNodeType.POWDER_SNOW, -1.0F);
        this.setPathfindingPenalty(PathNodeType.DANGER_POWDER_SNOW, -1.0F);
    }

    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(1, new WolfEscapeDangerGoal(1.5));
        this.goalSelector.add(2, new SitGoal(this));
        this.goalSelector.add(3, new AvoidLlamaGoal<>(this, LlamaEntity.class, 24.0F, 1.5, 1.5));
        this.goalSelector.add(4, new PounceAtTargetGoal(this, 0.4F));
        this.goalSelector.add(5, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.add(6, new FollowOwnerGoal(this, 1.0, 10.0F, 2.0F, false));
        this.goalSelector.add(7, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(8, new WanderAroundFarGoal(this, 1.0));
//        this.goalSelector.add(9, new WolfBegGoal(this, 8.0F));
        this.goalSelector.add(10, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(10, new LookAroundGoal(this));
        this.targetSelector.add(1, new TrackOwnerAttackerGoal(this));
        this.targetSelector.add(2, new AttackWithOwnerGoal(this));
        this.targetSelector.add(3, (new RevengeGoal(this, new Class[0])).setGroupRevenge());
        this.targetSelector.add(4, new ActiveTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::shouldAngerAt));
        this.targetSelector.add(5, new UntamedActiveTargetGoal<>(this, AnimalEntity.class, false, FOLLOW_TAMED_PREDICATE));
        this.targetSelector.add(6, new UntamedActiveTargetGoal<>(this, TurtleEntity.class, false, TurtleEntity.BABY_TURTLE_ON_LAND_FILTER));
        this.targetSelector.add(7, new ActiveTargetGoal<>(this, AbstractSkeletonEntity.class, false));
        this.targetSelector.add(8, new UniversalAngerGoal<>(this, true));
    }

    public static DefaultAttributeContainer.Builder createWolfAttributes() {
        return MobEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.30000001192092896).add(EntityAttributes.GENERIC_MAX_HEALTH, 8.0).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 2.0);
    }

    protected void initDataTracker() {
        super.initDataTracker();
        this.dataTracker.startTracking(BEGGING, false);
        this.dataTracker.startTracking(COLLAR_COLOR, DyeColor.RED.getId());
        this.dataTracker.startTracking(ANGER_TIME, 0);
    }

    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_WOLF_STEP, 0.15F, 1.0F);
    }

    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putByte("CollarColor", (byte)this.getCollarColor().getId());
        this.writeAngerToNbt(nbt);
    }

    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("CollarColor", NbtElement.NUMBER_TYPE)) {
            this.setCollarColor(DyeColor.byId(nbt.getInt("CollarColor")));
        }

        this.readAngerFromNbt(this.getWorld(), nbt);
    }

    protected SoundEvent getAmbientSound() {
        if (this.hasAngerTime()) {
            return SoundEvents.ENTITY_WOLF_GROWL;
        } else if (this.random.nextInt(3) == 0) {
            return this.isTamed() && this.getHealth() < 10.0F ? SoundEvents.ENTITY_WOLF_WHINE : SoundEvents.ENTITY_WOLF_PANT;
        } else {
            return SoundEvents.ENTITY_WOLF_AMBIENT;
        }
    }

    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_WOLF_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_WOLF_DEATH;
    }

    protected float getSoundVolume() {
        return 0.4F;
    }

    public void tickMovement() {
        super.tickMovement();
        if (!this.getWorld().isClient && this.furWet && !this.canShakeWaterOff && !this.isNavigating() && this.isOnGround()) {
            this.canShakeWaterOff = true;
            this.shakeProgress = 0.0F;
            this.lastShakeProgress = 0.0F;
            this.getWorld().sendEntityStatus(this, EntityStatuses.SHAKE_OFF_WATER);
        }

        if (!this.getWorld().isClient) {
            this.tickAngerLogic((ServerWorld)this.getWorld(), true);
        }

    }

    public void tick() {
        super.tick();
        if (this.isAlive()) {
            this.lastBegAnimationProgress = this.begAnimationProgress;
            if (this.isBegging()) {
                this.begAnimationProgress += (1.0F - this.begAnimationProgress) * 0.4F;
            } else {
                this.begAnimationProgress += (0.0F - this.begAnimationProgress) * 0.4F;
            }

            if (this.isWet()) {
                this.furWet = true;
                if (this.canShakeWaterOff && !this.getWorld().isClient) {
                    this.getWorld().sendEntityStatus(this, EntityStatuses.RESET_WOLF_SHAKE);
                    this.resetShake();
                }
            } else if ((this.furWet || this.canShakeWaterOff) && this.canShakeWaterOff) {
                if (this.shakeProgress == 0.0F) {
                    this.playSound(SoundEvents.ENTITY_WOLF_SHAKE, this.getSoundVolume(), (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
                    this.emitGameEvent(GameEvent.ENTITY_SHAKE);
                }

                this.lastShakeProgress = this.shakeProgress;
                this.shakeProgress += 0.05F;
                if (this.lastShakeProgress >= 2.0F) {
                    this.furWet = false;
                    this.canShakeWaterOff = false;
                    this.lastShakeProgress = 0.0F;
                    this.shakeProgress = 0.0F;
                }

                if (this.shakeProgress > 0.4F) {
                    float f = (float)this.getY();
                    int i = (int)(MathHelper.sin((this.shakeProgress - 0.4F) * 3.1415927F) * 7.0F);
                    Vec3d vec3d = this.getVelocity();

                    for(int j = 0; j < i; ++j) {
                        float g = (this.random.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.5F;
                        float h = (this.random.nextFloat() * 2.0F - 1.0F) * this.getWidth() * 0.5F;
                        this.getWorld().addParticle(ParticleTypes.SPLASH, this.getX() + (double)g, (double)(f + 0.8F), this.getZ() + (double)h, vec3d.x, vec3d.y, vec3d.z);
                    }
                }
            }

        }
    }

    private void resetShake() {
        this.canShakeWaterOff = false;
        this.shakeProgress = 0.0F;
        this.lastShakeProgress = 0.0F;
    }

    public void onDeath(DamageSource damageSource) {
        this.furWet = false;
        this.canShakeWaterOff = false;
        this.lastShakeProgress = 0.0F;
        this.shakeProgress = 0.0F;
        super.onDeath(damageSource);
    }

    /**
     * Returns whether this wolf's fur is wet.
     * <p>
     * The wolf's fur will remain wet until the wolf shakes.
     */
    public boolean isFurWet() {
        return this.furWet;
    }

    /**
     * Returns this wolf's brightness multiplier based on the fur wetness.
     * <p>
     * The brightness multiplier represents how much darker the wolf gets while its fur is wet. The multiplier changes (from 0.75 to 1.0 incrementally) when a wolf shakes.
     *
     * @return Brightness as a float value between 0.75 and 1.0.
     * @see net.minecraft.client.render.entity.model.TintableAnimalModel#setColorMultiplier(float, float, float)
     *
     * @param tickDelta progress for linearly interpolating between the previous and current game state
     */
    public float getFurWetBrightnessMultiplier(float tickDelta) {
        return Math.min(0.5F + MathHelper.lerp(tickDelta, this.lastShakeProgress, this.shakeProgress) / 2.0F * 0.5F, 1.0F);
    }

    public float getShakeAnimationProgress(float tickDelta, float f) {
        float g = (MathHelper.lerp(tickDelta, this.lastShakeProgress, this.shakeProgress) + f) / 1.8F;
        if (g < 0.0F) {
            g = 0.0F;
        } else if (g > 1.0F) {
            g = 1.0F;
        }

        return MathHelper.sin(g * 3.1415927F) * MathHelper.sin(g * 3.1415927F * 11.0F) * 0.15F * 3.1415927F;
    }

    public float getBegAnimationProgress(float tickDelta) {
        return MathHelper.lerp(tickDelta, this.lastBegAnimationProgress, this.begAnimationProgress) * 0.15F * 3.1415927F;
    }

    protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
        return dimensions.height * 0.8F;
    }

    public int getMaxLookPitchChange() {
        return this.isInSittingPose() ? 20 : super.getMaxLookPitchChange();
    }

    public boolean damage(DamageSource source, float amount) {
        if (this.isInvulnerableTo(source)) {
            return false;
        } else {
            Entity entity = source.getAttacker();
            if (!this.getWorld().isClient) {
                this.setSitting(false);
            }

            if (entity != null && !(entity instanceof PlayerEntity) && !(entity instanceof PersistentProjectileEntity)) {
                amount = (amount + 1.0F) / 2.0F;
            }

            return super.damage(source, amount);
        }
    }

    public boolean tryAttack(Entity target) {
        boolean bl = target.damage(this.getDamageSources().mobAttack(this), (float)((int)this.getAttributeValue(EntityAttributes.GENERIC_ATTACK_DAMAGE)));
        if (bl) {
            this.applyDamageEffects(this, target);
        }

        return bl;
    }

    public void setTamed(boolean tamed) {
        super.setTamed(tamed);
        if (tamed) {
            this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(20.0);
            this.setHealth(20.0F);
        } else {
            this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(8.0);
        }

        this.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).setBaseValue(4.0);
    }

    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        Item item = itemStack.getItem();
        if (this.getWorld().isClient) {
            boolean bl = this.isOwner(player) || this.isTamed() || itemStack.isOf(Items.BONE) && !this.isTamed() && !this.hasAngerTime();
            return bl ? ActionResult.CONSUME : ActionResult.PASS;
        } else {
            label90: {
                if (this.isTamed()) {
                    if (this.isBreedingItem(itemStack) && this.getHealth() < this.getMaxHealth()) {
                        if (!player.getAbilities().creativeMode) {
                            itemStack.decrement(1);
                        }

                        this.heal((float)item.getFoodComponent().getHunger());
                        return ActionResult.SUCCESS;
                    }

                    if (!(item instanceof DyeItem)) {
                        break label90;
                    }

                    DyeItem dyeItem = (DyeItem)item;
                    if (!this.isOwner(player)) {
                        break label90;
                    }

                    DyeColor dyeColor = dyeItem.getColor();
                    if (dyeColor != this.getCollarColor()) {
                        this.setCollarColor(dyeColor);
                        if (!player.getAbilities().creativeMode) {
                            itemStack.decrement(1);
                        }

                        return ActionResult.SUCCESS;
                    }
                } else if (itemStack.isOf(Items.BONE) && !this.hasAngerTime()) {
                    if (!player.getAbilities().creativeMode) {
                        itemStack.decrement(1);
                    }

                    if (this.random.nextInt(3) == 0) {
                        this.setOwner(player);
                        this.navigation.stop();
                        this.setTarget((LivingEntity)null);
                        this.setSitting(true);
                        this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_POSITIVE_PLAYER_REACTION_PARTICLES);
                    } else {
                        this.getWorld().sendEntityStatus(this, EntityStatuses.ADD_NEGATIVE_PLAYER_REACTION_PARTICLES);
                    }

                    return ActionResult.SUCCESS;
                }

                return super.interactMob(player, hand);
            }

            ActionResult actionResult = super.interactMob(player, hand);
            if ((!actionResult.isAccepted() || this.isBaby()) && this.isOwner(player)) {
                this.setSitting(!this.isSitting());
                this.jumping = false;
                this.navigation.stop();
                this.setTarget((LivingEntity)null);
                return ActionResult.SUCCESS;
            } else {
                return actionResult;
            }
        }
    }

    public void handleStatus(byte status) {
        if (status == EntityStatuses.SHAKE_OFF_WATER) {
            this.canShakeWaterOff = true;
            this.shakeProgress = 0.0F;
            this.lastShakeProgress = 0.0F;
        } else if (status == EntityStatuses.RESET_WOLF_SHAKE) {
            this.resetShake();
        } else {
            super.handleStatus(status);
        }

    }

    public float getTailAngle() {
        if (this.hasAngerTime()) {
            return 1.5393804F;
        } else {
            return this.isTamed() ? (0.55F - (this.getMaxHealth() - this.getHealth()) * 0.02F) * 3.1415927F : 0.62831855F;
        }
    }

    public boolean isBreedingItem(ItemStack stack) {
        Item item = stack.getItem();
        return item.isFood() && item.getFoodComponent().isMeat();
    }

    public int getLimitPerChunk() {
        return 8;
    }

    public int getAngerTime() {
        return (Integer)this.dataTracker.get(ANGER_TIME);
    }

    public void setAngerTime(int angerTime) {
        this.dataTracker.set(ANGER_TIME, angerTime);
    }

    public void chooseRandomAngerTime() {
        this.setAngerTime(ANGER_TIME_RANGE.get(this.random));
    }

    @Nullable
    public UUID getAngryAt() {
        return this.angryAt;
    }

    public void setAngryAt(@Nullable UUID angryAt) {
        this.angryAt = angryAt;
    }

    public DyeColor getCollarColor() {
        return DyeColor.byId((Integer)this.dataTracker.get(COLLAR_COLOR));
    }

    public void setCollarColor(DyeColor color) {
        this.dataTracker.set(COLLAR_COLOR, color.getId());
    }

    @Nullable
    public RecycledWolf createChild(ServerWorld serverWorld, PassiveEntity passiveEntity) {
        return null;
    }

    public void setBegging(boolean begging) {
        this.dataTracker.set(BEGGING, begging);
    }

    public boolean canBreedWith(AnimalEntity other) {
        if (other == this) {
            return false;
        } else if (!this.isTamed()) {
            return false;
        } else if (!(other instanceof RecycledWolf)) {
            return false;
        } else {
            RecycledWolf wolfEntity = (RecycledWolf)other;
            if (!wolfEntity.isTamed()) {
                return false;
            } else if (wolfEntity.isInSittingPose()) {
                return false;
            } else {
                return this.isInLove() && wolfEntity.isInLove();
            }
        }
    }

    public boolean isBegging() {
        return (Boolean)this.dataTracker.get(BEGGING);
    }

    public boolean canAttackWithOwner(LivingEntity target, LivingEntity owner) {
        if (!(target instanceof CreeperEntity) && !(target instanceof GhastEntity)) {
            if (target instanceof RecycledWolf) {
                RecycledWolf wolfEntity = (RecycledWolf)target;
                return !wolfEntity.isTamed() || wolfEntity.getOwner() != owner;
            } else if (target instanceof PlayerEntity && owner instanceof PlayerEntity && !((PlayerEntity)owner).shouldDamagePlayer((PlayerEntity)target)) {
                return false;
            } else if (target instanceof AbstractHorseEntity && ((AbstractHorseEntity)target).isTame()) {
                return false;
            } else {
                return !(target instanceof TameableEntity) || !((TameableEntity)target).isTamed();
            }
        } else {
            return false;
        }
    }

    public boolean canBeLeashedBy(PlayerEntity player) {
        return !this.hasAngerTime() && super.canBeLeashedBy(player);
    }

    public Vec3d getLeashOffset() {
        return new Vec3d(0.0, (double)(0.6F * this.getStandingEyeHeight()), (double)(this.getWidth() * 0.4F));
    }

    public static boolean canSpawn(EntityType<RecycledWolf> type, WorldAccess world, SpawnReason spawnReason, BlockPos pos, Random random) {
        return world.getBlockState(pos.down()).isIn(BlockTags.WOLVES_SPAWNABLE_ON) && isLightLevelValidForNaturalSpawn(world, pos);
    }

    static {
        BEGGING = DataTracker.registerData(RecycledWolf.class, TrackedDataHandlerRegistry.BOOLEAN);
        COLLAR_COLOR = DataTracker.registerData(RecycledWolf.class, TrackedDataHandlerRegistry.INTEGER);
        ANGER_TIME = DataTracker.registerData(RecycledWolf.class, TrackedDataHandlerRegistry.INTEGER);
        FOLLOW_TAMED_PREDICATE = (entity) -> {
            EntityType<?> entityType = entity.getType();
            return entityType == EntityType.SHEEP || entityType == EntityType.RABBIT || entityType == EntityType.FOX;
        };
        ANGER_TIME_RANGE = TimeHelper.betweenSeconds(20, 39);
    }

    @Override
    public EntityView method_48926() {
        return null;
    }

    class WolfEscapeDangerGoal extends EscapeDangerGoal {
        public WolfEscapeDangerGoal(double speed) {
            super(RecycledWolf.this, speed);
        }

        protected boolean isInDanger() {
            return this.mob.shouldEscapePowderSnow() || this.mob.isOnFire();
        }
    }

    class AvoidLlamaGoal<T extends LivingEntity> extends FleeEntityGoal<T> {
        private final RecycledWolf wolf;

        public AvoidLlamaGoal(RecycledWolf wolf, Class<T> fleeFromType, float distance, double slowSpeed, double fastSpeed) {
            super(wolf, fleeFromType, distance, slowSpeed, fastSpeed);
            this.wolf = wolf;
        }

        public boolean canStart() {
            if (super.canStart() && this.targetEntity instanceof LlamaEntity) {
                return !this.wolf.isTamed() && this.isScaredOf((LlamaEntity)this.targetEntity);
            } else {
                return false;
            }
        }

        private boolean isScaredOf(LlamaEntity llama) {
            return llama.getStrength() >= random.nextInt(5);
        }

        public void start() {
            setTarget((LivingEntity)null);
            super.start();
        }

        public void tick() {
            setTarget((LivingEntity)null);
            super.tick();
        }
    }
}
