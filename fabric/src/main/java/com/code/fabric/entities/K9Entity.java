package com.code.fabric.entities;

import com.code.fabric.client.GUIHelper;
import com.code.fabric.registries.AseohaEntities;
import dev.architectury.platform.Platform;
import loqor.ait.core.AITItems;
import loqor.ait.core.item.ChargedZeitonCrystalItem;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.TickTask;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.*;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
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

import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;
import java.util.function.Predicate;


/**
 * @author Me <br />
 * K9! The Entity Class
 */
public class K9Entity extends com.code.common.entities.K9Entity implements HasCustomInventoryScreen, ContainerEntity, RangedAttackMob {
    private float TailAngle;
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

            abstractArrow.setBaseDamage(10);

            abstractArrow.shootFromRotation(abstractArrow, this.getXRot(), this.yHeadRot, 0.0F, 1.5F, 0.0F);

            this.level().addFreshEntity(abstractArrow);
        }
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
//@OnlyIn(Dist.CLIENT)
//    public void openK9Screen() {Minecraft.getInstance().setScreen(new K9Screen(this) {});}

    //************************I don't even know why this is here*******************************//

    @Override
    public void setTame(boolean p_70903_1_) {
        super.setTame(p_70903_1_);
    }

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

    public void Say(String text, Player player, Level worldIn) {
        assert player != null;
        Objects.requireNonNull(worldIn.getServer()).tell(new TickTask(1, () -> player.displayClientMessage(Component.nullToEmpty(text + ", Master."), false)));
    }

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
        if (!Objects.equals(source.getEntity(), this.getOwner()))
            this.setTarget((LivingEntity) source.getEntity());

        this.power -= (byte) amount;

        return super.hurt(source, amount);
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
    public @NotNull ItemStack getItem(int i) {
        return this.getItemStacks().get(i);
    }

    @Override
    public @NotNull ItemStack removeItem(int i, int j) {
        return this.removeChestVehicleItem(i, j);
    }

    @Override
    public @NotNull ItemStack removeItemNoUpdate(int i) {
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


    @Environment(EnvType.CLIENT)
    public float getTailAngle() {
        if (this.isAngry()) {
            this.TailAngle = 1.5393804F;
            return 1.5393804F;
        } else {
            this.TailAngle = this.isTame() ? (0.55F - (100 - this.power) * 0.02F) * (float) Math.PI : ((float) Math.PI / 5F);
            return this.isTame() ? (0.55F - (100 - this.power) * 0.02F) * (float) Math.PI : ((float) Math.PI / 5F);
        }
    }

//    public static float StaticGetTailAngle(){
//        aseoha.LOGGER.info(TailAngle);
//        return TailAngle;
//    }


    static {
        DATA_ID_MOVING = SynchedEntityData.defineId(K9Entity.class, EntityDataSerializers.BOOLEAN);
        DATA_ID_ATTACK_TARGET = SynchedEntityData.defineId(K9Entity.class, EntityDataSerializers.INT);
    }
}