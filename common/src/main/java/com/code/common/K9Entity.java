package com.code.common;

import com.code.common.items.SonicItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.ContainerEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;


/**
 * @author Me <br />
 * K9! The Entity Class
 */
public class K9Entity extends Wolf implements HasCustomInventoryScreen, ContainerEntity {

    private static final int CONTAINER_SIZE = 54;
    private NonNullList<ItemStack> itemStacks;
    @Nullable
    private ResourceLocation lootTable;
    private long lootTableSeed;
    private static final EntityDataAccessor<Integer> DATA_ID_ATTACK_TARGET;
    private static final EntityDataAccessor<Boolean> DATA_ID_MOVING;
    public boolean isDead = true;
    public byte power = 0;
    public int timer = 0;
//    private static float TailAngle;

    public K9Entity(EntityType<? extends Wolf> type, Level worldIn) {
        super(type, worldIn);
    }

    public static AttributeSupplier.Builder setCustomAttributes() {
        return AmbientCreature.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 60.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE, 13.0D)
                .add(Attributes.FOLLOW_RANGE, 99999999.0D);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
//        this.goalSelector.removeGoal(new SwimGoal(this));
        this.goalSelector.removeGoal(new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.removeGoal(new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.removeGoal(new BreedGoal(this, 1.0));
        this.goalSelector.removeGoal(new AvoidEntityGoal<>(this, Llama.class, 24.0F, 1.5, 1.5));

//        this.goalSelector.addGoal(0, new SwimGoal(this));
//        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.5, 40, 6.0F));
//        this.goalSelector.addGoal(2, new ZombieAttackGoal(this, 1.0D, false));
//        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(K9Entity.class));
//        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
//        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
        this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Creeper.class, true));
        this.targetSelector.removeGoal(new NonTameRandomTargetGoal(this, Animal.class, false, PREY_SELECTOR));
        this.goalSelector.addGoal(4, new K9Entity.AttackGoal(this));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, K9Entity.class, 12.0F, 0.01F));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, false, new K9Entity.AttackSelector(this)));
//        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, true, false, new K9Entity.AttackSelector(this)));

        this.goalSelector.removeGoal(new NearestAttackableTargetGoal<>(this, Player.class, true));
//        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Player.class, 10, true, false, this::isAngryAt));
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_MOVING, false);
        this.entityData.define(DATA_ID_ATTACK_TARGET, 0);
    }

    public void onSyncedDataUpdated(EntityDataAccessor<?> entityDataAccessor) {
        super.onSyncedDataUpdated(entityDataAccessor);
        if (DATA_ID_ATTACK_TARGET.equals(entityDataAccessor)) {
//            this.clientSideAttackTime = 0;
//            this.clientSideCachedAttackTarget = null;
        }

    }

    void setActiveAttackTarget(int i) {
        this.entityData.set(DATA_ID_ATTACK_TARGET, i);
    }

    protected boolean shouldDespawnInPeaceful() {
        return false;
    }


    public boolean hasActiveAttackTarget() {
        return (Integer)this.entityData.get(DATA_ID_ATTACK_TARGET) != 0;
    }


    /**
     * @param target         The Targeted Entity
     * @param distanceFactor The Distance
     *                       Old 1.16 code, figure it out
     */
    public void performRangedAttack(@NotNull LivingEntity target, float distanceFactor) {
//        if (!this.level.isClientSide && this.canSee(target)) {
//            LaserEntity lazer = new LaserEntity(TEntities.LASER.get(), this, this.getCommandSenderWorld(), 4.0F, TDamageSources.causeTardisMobDamage("laser", this));
//            lazer.setColor(new Vector3d(1.0, 0.0, 0.0));
//            lazer.setDamage((float) Objects.requireNonNull(this.getAttribute(Attributes.ATTACK_DAMAGE)).getBaseValue());
//            lazer.setRayLength(1F);
//            lazer.shootFromRotation(lazer, this.xRot, this.yHeadRot, 0.0F, 1.5F, 0.0F);
//            this.level.addFreshEntity(lazer);
//            this.level.playSound(null, this.blockPosition(), TSounds.LASER_GUN_FIRE.get(), SoundCategory.HOSTILE, 1.0F, 1.0F);
//        }

    }

//    private MenuProvider createContainerProvider() {
//        return new MenuComponent() {
//            public Container createMenu(int i, @NotNull Inventory playerInventory, @NotNull Player player) {
//                return new InventoryContainers(i, playerInventory, K9Entity.this.inventory);
//            }
//
//            @NotNull
//            public Component getDisplayName() {
//                return Component.translatable("aseoha.k9.inventory");
//            }
//        };
//    }

    //Why does this exist? I have no clue honestly
//    @Override
//    protected int addExperiencePoints(PlayerEntity player)
//    {
//        return 3 + this.world.random.nextInt(5);
//    }

    /**
     * @return The Item used for recharging K-9
     */
    public Item GetChargeItem(){
        return Items.IRON_INGOT;
    }

    /**
     * @return The Item used for taming K-9
     */
    public Item GetTameItem(){
        return Items.IRON_INGOT;
    }

    //***************************I've gotta do a MASSIVE sound overhaul someday*******************************/
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ARMOR_EQUIP_IRON;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSourceIn) {
        return SoundEvents.IRON_GOLEM_HURT;
    }

    @Override
    protected void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
        this.playSound(SoundEvents.METAL_STEP, 0.20F, 0.5F);
    }

    /**
     * @return Duration of time it takes to deplete one percent of K-9's charge
     */
    public static int TimeToDeplete(){
        return 1200 * 20;
    }

    @Override
    public void tick() {
        if(!this.isTame() || this.isDead){
            this.getNavigation().stop();
        }
        if (this.isAlive()) {
            if (this.timer < TimeToDeplete()) {
                timer++;
            }
            if (this.timer >= TimeToDeplete()) {
                if (this.power > 0)
                    this.power -= 1;
                this.timer = 0;
            }
            if(this.isTame() && this.getOwner() != null) {
                if (this.power == 10)
                    this.getOwner().sendSystemMessage(Component.nullToEmpty("Power Banks At 10%, Master."));
                if (this.power == 0) {
                    this.getOwner().sendSystemMessage(Component.nullToEmpty("Power Banks Depleted, Master."));
                    this.power = -1;
                }
            }
            this.isDead = this.power <= 0;
            if (this.isDead) {
                if (!this.isInsidePortal && this.onGround()) {
                    this.setNoAi(this.isDead);
                    this.navigation.stop();
                    this.setTarget((LivingEntity) null);
                }
            }

            this.power = this.power < 0 ? -1 : this.power;
        }
        super.tick();
    }


    //    @Override
//    public boolean attackEntityAsMob(Entity entityIn) {
//        if (!super.attackEntityAsMob(entityIn)) {
//            return false;
//        } else {
//            if (entityIn instanceof LivingEntity) {
//                ((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 200,3));
//                ((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.WEAKNESS, 200));
//                ((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.CONFUSION, 200));
//            }
//            return true;
//        }
//    }
    //****************************************Just for power****************************************//
//    @Override
//    public void tick() {
//        super.tick();
////        aseoha.k9TickThread.Call(this);
//        if (this.isAlive()) {
//            this.setNoAi(this.isDead);
//            if (this.timer < config.SERVER.K9PowerDrainRate.get() * 20) {
//                timer++;
//            }
//            if (this.timer >= config.SERVER.K9PowerDrainRate.get() * 20) {
//                if (this.power > 0)
//                    this.power -= 1;
//                this.timer = 0;
//            }
//            if (this.timer == 0 && this.power == 10)
//                Objects.requireNonNull(this.getOwner()).sendSystemMessage(Component.nullToEmpty("Power Banks At 10%, Master."), Objects.requireNonNull(this.getOwnerUUID()));
//            if (this.timer == 0 && this.power == 1) {
//                Objects.requireNonNull(this.getOwner()).level.(Component.nullToEmpty("Power Banks Depleted, Master."), Objects.requireNonNull(this.getOwnerUUID()));
//                this.power = 0;
//            }
//            this.isDead = this.power <= 0;
//            if (this.isDead) {
//                this.jumping = false;
//                this.setNoGravity(false);
//                if (!this.isInsidePortal && this.onGround) {
//                    this.navigation.stop();
//                    this.setTarget((LivingEntity) null);
//                }
//            }
////            aseoha.LOGGER.info(this.power);
//            if (this.power < 0) this.power = 0;
//        }
//    }

    //*******************************Honestly I can barely read half of this, need to clean it****************************************//
    @NotNull
    @Override
    public InteractionResult mobInteract(Player player, @NotNull InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        Item item = itemstack.getItem();

        /******************** If it's tamed by the player ***************************/
        if (this.isTame() && this.isOwnedBy(player)) {
            /** if player's crouching, but not holding [Charge item] make K-9 sit **/
            if (player.isCrouching() && !item.equals(this.GetChargeItem()))
                this.setOrderedToSit(!this.isOrderedToSit());
            /** Else open inventory **/
            else if (!item.equals(this.GetChargeItem()))
                this.openCustomInventoryScreen(player);

        }

        if (!this.isTame()) {
            if (item.equals(this.GetTameItem())) {
                int rand = new Random(System.currentTimeMillis()).nextInt(100);
                if (rand >= 75) {
                    this.tame(player);
                    return InteractionResult.SUCCESS;
                }
            }
        }
        if (this.level().isClientSide) {
            boolean flag = this.isOwnedBy(player) || this.isTame() || item == Items.IRON_INGOT && !this.isTame() && !this.isAngry();
            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            if (this.isTame()) {
                if (item.equals(this.GetChargeItem())) {
                    this.power++;
                }
            }
        }

        //********INVENTORY********//
        if (player.isCrouching() && !this.isNoAi()) {
            if (!this.isDead) {
                this.openCustomInventoryScreen(player);
                return InteractionResult.SUCCESS;
            }
        }
//                if (!(item instanceof IArtronItemStackBattery && !player.isCrouching())) {
        if (!player.isCrouching()) {
            InteractionResult actionresulttype = super.mobInteract(player, hand);
            if (this.isOwnedBy(player)) {
                K9Entity.Say("Power is at " + this.power, player, player.level()); //TODO: Add power to the K9 Screen, distress signals, etc
//                        this.setOrderedToSit(!this.isOrderedToSit());
                return InteractionResult.SUCCESS;
            }
            return actionresulttype;
//                }
        }
//        else if (item instanceof SonicItem && !this.isAngry()) {
////                if (!player.abilities.instabuild) {
////                    itemstack.shrink(1);
////                }
//
//            this.random.nextInt(1);
//            if (!this.isTame()) {
//                this.tame(player);
//                this.navigation.stop();
//                this.setTarget((LivingEntity) null);
//                this.setOrderedToSit(true);
//                this.level().broadcastEntityEvent(this, (byte) 7);
//            } else {
//                this.level().broadcastEntityEvent(this, (byte) 6);
//            }
//
//            return InteractionResult.SUCCESS;
//        }
        return InteractionResult.FAIL;
    }
//@OnlyIn(Dist.CLIENT)
//    public void openK9Screen() {Minecraft.getInstance().setScreen(new K9Screen(this) {});}

    //************************I don't even know why this is here*******************************//

    @Override
    public void setTame(boolean p_70903_1_) {
        super.setTame(p_70903_1_);
    }

//    @Override
//    public void die(@NotNull DamageSource damageSource) {
////        super.die(damageSource);
//        this.setHealth(1000);
//        this.power=0;
//    }


//    public AttributeModifierManager getAttributes() {
//        return new AttributeModifierManager(createAttributes().build());
//    }


    /**
     * NTM would use an implement and this to disable space damage, might ask Loqor to do this for AIT
     */
//    public boolean shouldTakeSpaceDamage() {
//        return false;
//    }

    @Override
    public boolean canMate(@NotNull Animal p_70878_1_) {
        return false;
    }

    /**
     * It's a robot, whaddya expect?
     * @return true because it's sensitive to water, like enderman
     */
    @Override
    public boolean isSensitiveToWater() {
        return true;
    }

    //    @Override
//    public void tick() {
//        k9.this.setTarget((LivingEntity)null);
////        world.getPlayerByUUID(this.getOwnerUUID()).
//        super.tick();
//    }
//private static int timer = 0;
//    public static void Talk(int text, Player player, Level worldIn) {
//        assert player != null;
////        TardisHelper.getConsoleInWorld(player.level);
//        Objects.requireNonNull(worldIn.getServer()).tell(new TickTask(1, () -> {
//
//            switch (text) {
//                case 1:
//                    player.displayClientMessage(Constants.AffirmativeK9, player.getUUID());
//                    break;
//                case 2:
//                    player.displayClientMessage(Constants.DoesNotComputeK9, player.getUUID());
//                    break;
//                default:
//                    player.displayClientMessage(Constants.InsufficientDataK9, player.getUUID());
//
//            }
//        }));
//    }

    public static void Say(String text, Player player, Level worldIn) {
        assert player != null;
        Objects.requireNonNull(worldIn.getServer()).tell(new TickTask(1, () -> player.displayClientMessage(Component.nullToEmpty(text + ", Master."), false)));
    }
//
//    @Override
//    public void addAdditionalSaveData(@NotNull CompoundNBT nbt) {
//        super.addAdditionalSaveData(nbt);
//        setInvNBT(this.inventory, nbt);
//        nbt.putByte("Power", this.power);
//
//    }
//
//    @Override
//    public void readAdditionalSaveData(@NotNull CompoundNBT nbt) {
//        super.readAdditionalSaveData(nbt);
//        getInvNBT(this.inventory, nbt);
//        if (nbt.contains("Power", 99)) {
//            this.power = nbt.getByte("Power");
//        }
//    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        this.addChestVehicleSaveData(compoundTag);
        compoundTag.putByte("Power", this.power);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.readChestVehicleSaveData(compoundTag);
        if(compoundTag.contains("Power"))
            this.power = compoundTag.getByte("Power");
    }


    @NotNull
    @Override
    public AttributeMap getAttributes() {
        return new AttributeMap(K9Entity.setCustomAttributes().build());
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.getDirectEntity() instanceof Player) {
            Player player = (Player) source.getDirectEntity();
//            if (player.getMainHandItem().getItem() instanceof ToolItem && ((ToolItem) player.getMainHandItem().getItem()).getTier() == ItemTier.IRON) {
//                amount *= 1.5F;
//            }
        }
//        this.knockback(.1F, .1, .1);
        this.power -= (byte) amount;
        return false;
//        return super.hurt(source, amount);

    }

    @Override
    public Wolf getBreedOffspring(ServerLevel world, AgeableMob ageableEntity) {
        return (Wolf) null;
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!this.level().isClientSide && !this.isPathFinding() && this.onGround()) {
            this.level().broadcastEntityEvent(this, (byte) 8);
        }

        if (!this.level().isClientSide) {
            this.updatePersistentAnger((ServerLevel) this.level(), true);
        }

    }

//    @OnlyIn(Dist.CLIENT)
//    public void handleEntityEvent(byte p_70103_1_) {
//        if (p_70103_1_ == 8) {
//        } else {
//            super.handleEntityEvent(p_70103_1_);
//        }
//
//    }

    @Override
    public void openCustomInventoryScreen(Player player) {
        player.openMenu(this);
        if (!player.level().isClientSide) {
            this.gameEvent(GameEvent.CONTAINER_OPEN, player);
//            PiglinAi.angerNearbyPiglins(player, true);
        }

    }

    @Override
    public void clearContent() {
        this.clearChestVehicleContent();
    }

    @Override
    public int getContainerSize() {
        return CONTAINER_SIZE;
    }

    @Override
    public ItemStack getItem(int i) {
//        return this.getChestVehicleItem(i);
//        this.unpackChestVehicleLootTable((Player)null);
        return (ItemStack)this.getItemStacks().get(i);
    }

    @Override
    public ItemStack removeItem(int i, int j) {
        return this.removeChestVehicleItem(i, j);
    }

    @Override
    public ItemStack removeItemNoUpdate(int i) {
        return this.removeChestVehicleItemNoUpdate(i);
    }

    @Override
    public void setItem(int i, ItemStack itemStack) {
        this.setChestVehicleItem(i, itemStack);
    }

    @Override
    public SlotAccess getSlot(int i) {
        return this.getChestVehicleSlot(i);
    }

    public void setChanged() {}

    @Override
    public boolean stillValid(Player player) {
        return this.isChestVehicleStillValid(player);
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        if (this.lootTable != null && player.isSpectator()) {
            return null;
        } else {
            this.unpackLootTable(inventory.player);
            return ChestMenu.sixRows(i, inventory, this);
        }
    }

    public void unpackLootTable(@Nullable Player player) {
        this.unpackChestVehicleLootTable(player);
    }

//    @Nullable
//    public ResourceLocation getLootTable() {
//        return this.lootTable;
//    }

    @Override
    public void setLootTable(@Nullable ResourceLocation resourceLocation) {
        this.lootTable = resourceLocation;
    }

    @Override
    public long getLootTableSeed() {
        return this.lootTableSeed;
    }

    @Override
    public void setLootTableSeed(long l) {
        this.lootTableSeed = l;
    }

    @Override
    public @NotNull NonNullList<ItemStack> getItemStacks() {
        return this.itemStacks;
    }

    @Override
    public void clearItemStacks() {
        this.itemStacks = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
    }

    @Override
    public void stopOpen(Player player) {
        this.level().gameEvent(GameEvent.CONTAINER_CLOSE, this.position(), GameEvent.Context.of(player));
    }

    private static class AttackSelector implements Predicate<LivingEntity> {
        private final K9Entity k9;

        public AttackSelector(K9Entity k9) {
            this.k9 = k9;
        }

        public boolean test(@Nullable LivingEntity livingEntity) {
            return (livingEntity instanceof Player || livingEntity instanceof Squid || livingEntity instanceof Axolotl) && livingEntity.distanceToSqr(this.k9) > 9.0;
        }
    }

//    @OnlyIn(Dist.CLIENT)
//    public float getTailAngle() {
//        if (this.isAngry()) {
//            this.TailAngle = 1.5393804F;
//            return 1.5393804F;
//        } else {
//            this.TailAngle = this.isTame() ? (0.55F - (this.getMaxHealth() - this.getHealth()) * 0.02F) * (float) Math.PI : ((float) Math.PI / 5F);
//            return this.isTame() ? (0.55F - (this.getMaxHealth() - this.getHealth()) * 0.02F) * (float) Math.PI : ((float) Math.PI / 5F);
//        }
//    }

//    public static float StaticGetTailAngle(){
//        aseoha.LOGGER.info(TailAngle);
//        return TailAngle;
//    }

    public int getAttackDuration() {
        return 20;
    }

    static class AttackGoal extends Goal {
        private final K9Entity k9;
        private int attackTime;
        private final boolean elder;

        public AttackGoal(K9Entity k9) {
            this.k9 = k9;
            this.elder = false;
            this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
        }

        public boolean canUse() {
            LivingEntity livingEntity = this.k9.getTarget();
            return livingEntity != null && livingEntity.isAlive();
        }

        public boolean canContinueToUse() {
            return super.canContinueToUse() && (this.elder || this.k9.getTarget() != null && this.k9.distanceToSqr(this.k9.getTarget()) > 9.0);
        }

        public void start() {
            this.attackTime = -10;
            this.k9.getNavigation().stop();
            LivingEntity livingEntity = this.k9.getTarget();
            if (livingEntity != null) {
                this.k9.getLookControl().setLookAt(livingEntity, 90.0F, 90.0F);
            }

            this.k9.hasImpulse = true;
        }

        public void stop() {
            this.k9.setActiveAttackTarget(0);
            this.k9.setTarget((LivingEntity) null);
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        public void tick() {
            LivingEntity livingEntity = this.k9.getTarget();
            if (livingEntity != null) {
                this.k9.getNavigation().stop();
                this.k9.getLookControl().setLookAt(livingEntity, 90.0F, 90.0F);
                //    if (!this.k9.hasLineOfSight(livingEntity))
                //    this.k9.setTarget((LivingEntity)null);
                if (this.k9.hasLineOfSight(livingEntity)) {
                    ++this.attackTime;
                    if (this.attackTime == 0) {
                        this.k9.setActiveAttackTarget(livingEntity.getId());
                        if (!this.k9.isSilent()) {
                            this.k9.level().broadcastEntityEvent(this.k9, (byte)21);
                        }
                    } else if (this.attackTime >= this.k9.getAttackDuration()) {
                        float f = 1.0F;
                        if (this.k9.level().getDifficulty() == Difficulty.HARD) {
                            f += 0.7F;
                        }

                        livingEntity.hurt(this.k9.damageSources().indirectMagic(this.k9, this.k9), f);
                        livingEntity.hurt(this.k9.damageSources().mobAttack(this.k9), (float)this.k9.getAttributeValue(Attributes.ATTACK_DAMAGE));
                        this.k9.setTarget((LivingEntity)null);
                    }

                    super.tick();
                }
            }
        }
    }
    static {
        DATA_ID_MOVING = SynchedEntityData.defineId(K9Entity.class, EntityDataSerializers.BOOLEAN);
        DATA_ID_ATTACK_TARGET = SynchedEntityData.defineId(K9Entity.class, EntityDataSerializers.INT);
    }
}