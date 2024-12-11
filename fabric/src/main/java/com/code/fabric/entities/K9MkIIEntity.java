package com.code.fabric.entities;

import com.code.fabric.client.GUIHelper;
import loqor.ait.core.AITItems;
import loqor.ait.core.item.ChargedZeitonCrystalItem;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Difficulty;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.ContainerEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
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
public class K9MkIIEntity extends com.code.common.entities.K9MkIIEntity implements HasCustomInventoryScreen, ContainerEntity {

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

    public K9MkIIEntity(EntityType<? extends Wolf> type, Level worldIn) {
        super(type, worldIn);
    }

    void setActiveAttackTarget(int i) {
        this.entityData.set(DATA_ID_ATTACK_TARGET, i);
    }

    public boolean hasActiveAttackTarget() {
        return (Integer)this.entityData.get(DATA_ID_ATTACK_TARGET) != 0;
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

    @Override
    public Item GetChargeItem(){
        return AITItems.CHARGED_ZEITON_CRYSTAL;
    }

    @Override
    public Item GetTameItem(){
        return GetChargeItem();
    }

    @NotNull
    @Override
    public InteractionResult mobInteract(Player player, @NotNull InteractionHand hand) {
        if(hand.equals(InteractionHand.OFF_HAND))
            return InteractionResult.PASS;

        ItemStack itemstack = player.getItemInHand(hand);

        Item item = itemstack.getItem();


        if (!this.isTame()) {
            if (item.equals(this.GetTameItem())) {
                int rand = new Random(System.currentTimeMillis()).nextInt(100);
                if (rand >= 50) {
                    ((ChargedZeitonCrystalItem) this.GetChargeItem()).removeFuel(1000, itemstack);
                    this.tame(player);
                    player.sendSystemMessage(Component.translatable("aseoha.k9.tame"));
                    return InteractionResult.SUCCESS;
                }
                else return InteractionResult.FAIL;
            }
            return InteractionResult.FAIL;
        }

//        if (this.level().isClientSide) {
//            boolean flag = this.isOwnedBy(player) || this.isTame() || item == this.GetTameItem() && !this.isTame() && !this.isAngry();
//            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
//        }
//        else {
            if (this.isTame()) {
                if (item.equals(this.GetChargeItem())) {
                    ((ChargedZeitonCrystalItem) this.GetChargeItem()).removeFuel(1000, itemstack);
                    this.power = (byte) 1000;
                    player.sendSystemMessage(Component.translatable("aseoha.k9.power.add"));
                    return InteractionResult.SUCCESS;
                }
            }
//        }

//        if (!player.isCrouching()) {
//            InteractionResult actionresulttype = super.mobInteract(player, hand);
//            if (this.isOwnedBy(player)) {
//                K9Entity.Say("Power is at " + this.power, player, player.level()); //TODO: Add power to the K9 Screen, distress signals, etc
//                return InteractionResult.SUCCESS;
//            }
//            return actionresulttype;
//        }


        if (this.isTame()) { // && this.isOwnedBy(player)
            /** if player's crouching, but not holding [Charge item] make K-9 sit **/
            if (player.isCrouching() && !item.equals(this.GetChargeItem())) {
//                this.setOrderedToSit(!this.isOrderedToSit());
                if(this.level().isClientSide)
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


    @Override
    public boolean isSensitiveToWater() {
        return false;
    }

        @Override
    public void tick() {
        /** this.isDead is true if this.power is less than or equal to 0 **/
        this.isDead = this.power <= 0;

        /** If 1200 ticks (60 seconds) has passed, remove 1 byte of power**/
        this.power = this.level().getGameTime() % 1200 == 0 ? (byte) (this.power - 1) : this.power;

        if(this.isDead) {
            this.Die();
            return;
        }

        super.tick();
    }
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

    /**
     * Sets the target to null and tells the owner it's dead.
     */
    public void Die(){
        this.setTarget(null);
        /** If the owner either doesn't exist, isn't available server-side, or K-9 just doesn't have one for literally any reason **/
        if(this.getOwner() == null) return;
        if(this.level() == null) return;
        Say(Component.translatable("aseoha.k9.dead").toString(), (Player) this.getOwner(), this.level());
    }

    public static void Say(String text, Player player, Level worldIn) {
        assert player != null;
        worldIn.getServer().tell(new TickTask(1, () -> player.displayClientMessage(Component.nullToEmpty(text + ", Master."), false)));
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
        return new AttributeMap(K9MkIIEntity.setCustomAttributes().build());
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
        return this;
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
        private final K9MkIIEntity k9;

        public AttackSelector(K9MkIIEntity k9) {
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
        private final K9MkIIEntity k9;
        private int attackTime;
        private final boolean elder;

        public AttackGoal(K9MkIIEntity k9) {
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
        DATA_ID_MOVING = SynchedEntityData.defineId(K9MkIIEntity.class, EntityDataSerializers.BOOLEAN);
        DATA_ID_ATTACK_TARGET = SynchedEntityData.defineId(K9MkIIEntity.class, EntityDataSerializers.INT);
    }
}