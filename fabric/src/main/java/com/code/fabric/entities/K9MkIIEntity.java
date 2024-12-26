package com.code.fabric.entities;

import com.code.fabric.client.GUIHelper;
import com.code.fabric.registries.AseohaEntities;
import loqor.ait.core.AITItems;
import loqor.ait.core.item.ChargedZeitonCrystalItem;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.vehicle.ContainerEntity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;


/**
 * @author Me <br />
 * K9! The Entity Class
 */
public class K9MkIIEntity extends com.code.common.entities.K9MkIIEntity implements HasCustomInventoryScreen, ContainerEntity, RangedAttackMob {

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

    public K9MkIIEntity(EntityType<? extends K9MkIIEntity> type, Level worldIn) {
        super(type, worldIn);
    }

    void setActiveAttackTarget(int i) {
        this.entityData.set(DATA_ID_ATTACK_TARGET, i);
    }

    public boolean hasActiveAttackTarget() {
        return (Integer)this.entityData.get(DATA_ID_ATTACK_TARGET) != 0;
    }

    @Override
    public void performRangedAttack(LivingEntity livingEntity, float f) {
        if (!this.level().isClientSide && this.hasLineOfSight(livingEntity)) {

            Lazer PlasmaBoltEntity = new Lazer(AseohaEntities.LAZER.get(), this.level());

            AbstractArrow abstractArrow = PlasmaBoltEntity.createFromConstructor(this.level(), this);

            abstractArrow.setBaseDamage(20);

            abstractArrow.shootFromRotation(abstractArrow, this.getXRot(), this.yHeadRot, 0.0F, 1.5F, 0.0F);

            this.level().addFreshEntity(abstractArrow);
        }
    }

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
        if (hand.equals(InteractionHand.OFF_HAND))
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
                } else return InteractionResult.FAIL;
            }
            return InteractionResult.FAIL;
        }

        if (this.isTame()) {
            if (item.equals(this.GetChargeItem())) {
                ((ChargedZeitonCrystalItem) this.GetChargeItem()).removeFuel(1000, itemstack);
                this.power = (byte) 1000;
                player.sendSystemMessage(Component.translatable("aseoha.k9.power.add"));
                return InteractionResult.SUCCESS;
            }
        }

        if (this.isTame()) { // && this.isOwnedBy(player)
            /** if player's crouching, but not holding [Charge item] make K-9 sit **/
            if (player.isCrouching() && !item.equals(this.GetChargeItem())) {
//                this.setOrderedToSit(!this.isOrderedToSit());
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

    @Override
    public boolean isSensitiveToWater() {
        return false;
    }

        @Override
    public void tick() {
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

    static {
        DATA_ID_MOVING = SynchedEntityData.defineId(K9MkIIEntity.class, EntityDataSerializers.BOOLEAN);
        DATA_ID_ATTACK_TARGET = SynchedEntityData.defineId(K9MkIIEntity.class, EntityDataSerializers.INT);
    }
}