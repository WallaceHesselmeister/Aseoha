package com.code.common.entities;

import com.code.aseoha;
import com.code.common.client.GUIHelper;
import com.code.common.registries.AseohaEntities;
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
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
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

import java.util.Objects;
import java.util.Random;


/**
 * @author Me <br />
 * K9! The Entity Class
 */
public class K9Entity extends Wolf implements HasCustomInventoryScreen, ContainerEntity, RangedAttackMob {

    private static final int CONTAINER_SIZE = 27;
    private NonNullList<ItemStack> itemStacks;
    @Nullable
    private ResourceLocation lootTable;
    private long lootTableSeed;
    private static final EntityDataAccessor<Integer> DATA_ID_ATTACK_TARGET;
    private static final EntityDataAccessor<Boolean> DATA_ID_MOVING;
    public boolean isDead;
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
                .add(Attributes.FOLLOW_RANGE,  Double.POSITIVE_INFINITY);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.removeGoal(new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.removeGoal(new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.removeGoal(new BreedGoal(this, 1.0));
        this.goalSelector.removeGoal(new AvoidEntityGoal<>(this, Llama.class, 24.0F, 1.5, 1.5));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.5, 40, 6.0F));
        this.goalSelector.removeGoal(new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(K9Entity.class));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Creeper.class, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, Monster.class, true));
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
        return 25 * 20;
    }

    @Override
    public void tick() {
        super.tick();
        aseoha.threadManager.K9TickThread(this);
    }

    @NotNull
    @Override
    public InteractionResult mobInteract(Player player, @NotNull InteractionHand hand) {
        if (hand.equals(InteractionHand.OFF_HAND))
            return InteractionResult.PASS;

        ItemStack itemstack = player.getItemInHand(hand);

        Item item = itemstack.getItem();


        if (!this.isTame()) {
            if (item.equals(this.GetTameItem())) {
                int rand = new Random(System.currentTimeMillis()).nextInt(100);
                if (rand >= 50) {
                    this.tame(player);
                    player.sendSystemMessage(Component.translatable("aseoha.k9.tame"));
                    return InteractionResult.SUCCESS;
                } else return InteractionResult.FAIL;
            }
            return InteractionResult.FAIL;
        }

        if (this.isTame()) {
            if (item.equals(this.GetChargeItem())) {
                this.power += 10;
                player.sendSystemMessage(Component.translatable("aseoha.k9.power.add"));
                return InteractionResult.SUCCESS;
            }
        }


        if (this.isTame()) { // && this.isOwnedBy(player)
            /** if player's crouching, but not holding [Charge item] **/
            if (player.isCrouching() && !item.equals(this.GetChargeItem())) {
                if (this.level().isClientSide)
                    GUIHelper.OpenGUI(1);
                return InteractionResult.SUCCESS;
            }
            /** Else open inventory **/
            else if (!item.equals(this.GetChargeItem())) {
                this.openCustomInventoryScreen(player);
                return InteractionResult.SUCCESS;
            }
        }


        return InteractionResult.FAIL;
    }

    @Override
    public void setTame(boolean p_70903_1_) {
        super.setTame(p_70903_1_);
    }


//    public AttributeModifierManager getAttributes() {
//        return new AttributeModifierManager(createAttributes().build());
//    }



     // NTM would use an implement and this to disable space damage, might ask Loqor to do this for AIT

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

    public void Say(String text, Player player, Level worldIn) {
        assert player != null;
        if(!worldIn.isClientSide)
            worldIn.getServer().tell(new TickTask(1, () -> player.displayClientMessage(Component.nullToEmpty(text + ", Master."), false)));
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        super.addAdditionalSaveData(compoundTag);
        this.addChestVehicleSaveData(compoundTag);
        compoundTag.putByte("Power", this.power);
        this.addPersistentAngerSaveData(compoundTag);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compoundTag) {
        super.readAdditionalSaveData(compoundTag);
        this.readChestVehicleSaveData(compoundTag);
        if (compoundTag.contains("Power"))
            this.power = compoundTag.getByte("Power");
        this.readPersistentAngerSaveData(this.level(), compoundTag);
    }


    @NotNull
    @Override
    public AttributeMap getAttributes() {
        return new AttributeMap(K9Entity.setCustomAttributes().build());
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (!Objects.equals(source.getEntity(), this.getOwner()))
            this.setTarget((LivingEntity) source.getEntity());

        this.power -= (byte) amount;

        return super.hurt(source, amount);
    }

    @Override
    public boolean isInvulnerableTo(DamageSource damageSource) {
        if(this.isRemoved()) return true;

        return !(damageSource.is(DamageTypeTags.BYPASSES_INVULNERABILITY) || damageSource.is(DamageTypes.GENERIC_KILL) || damageSource.is(DamageTypes.FELL_OUT_OF_WORLD));
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

    @Override
    public void openCustomInventoryScreen(Player player) {
        player.openMenu(this);
        if (!player.level().isClientSide) {
            this.gameEvent(GameEvent.CONTAINER_OPEN, player);
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
        return this.getItemStacks().get(i);
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

    public boolean isInsidePortal() {
        return this.isInsidePortal;
    }

    public boolean IsJumping() {
        return this.jumping;
    }

    public void SetIsJumping(boolean b) {
        this.jumping = b;
    }

    static {
        DATA_ID_MOVING = SynchedEntityData.defineId(K9Entity.class, EntityDataSerializers.BOOLEAN);
        DATA_ID_ATTACK_TARGET = SynchedEntityData.defineId(K9Entity.class, EntityDataSerializers.INT);
    }
}