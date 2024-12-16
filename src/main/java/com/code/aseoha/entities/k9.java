package com.code.aseoha.entities;


import com.code.aseoha.Constants;
import com.code.aseoha.aseoha;
import com.code.aseoha.config;
import com.code.aseoha.misc.InventoryContainers;
import com.code.aseoha.threads.K9TickThread;
import net.minecraft.block.BlockState;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierManager;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.*;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.ForgeEventFactory;
import net.tardis.api.space.entities.ISpaceImmuneEntity;
import net.tardis.mod.artron.IArtronItemStackBattery;
import net.tardis.mod.damagesources.TDamageSources;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.entity.projectiles.LaserEntity;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.sounds.TSounds;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.UUID;

import static com.code.aseoha.misc.NBTHelper.getInvNBT;
import static com.code.aseoha.misc.NBTHelper.setInvNBT;
import static com.code.aseoha.misc.ScreenClientStuff.OpenK9Screen;

/**
 * @author Me <br />
 * K9! The Entity Class
 */
public class k9 extends RecycledWolf implements IAngerable, ISpaceImmuneEntity, IRangedAttackMob {
    private World world;
    private final Inventory inventory = new Inventory(36);
    public boolean isDead = true;
    public byte power = 0;
    public int timer = 0;
//    private static float TailAngle;


    public k9(EntityType<? extends RecycledWolf> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return CreatureEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 60.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE, 13.0D)
                .add(Attributes.FOLLOW_RANGE, 99999999.0D);
    }


    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.removeGoal(new SwimGoal(this));
        this.goalSelector.removeGoal(new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.removeGoal(new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.removeGoal(new BreedGoal(this, 1.0));
        this.goalSelector.removeGoal(new AvoidEntityGoal<>(this, LlamaEntity.class, 24.0F, 1.5, 1.5));

        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.5, 40, 6.0F));
        this.goalSelector.removeGoal(new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
//        this.goalSelector.addGoal(2, new ZombieAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(RecycledWolf.class));
//        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
//        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, CreeperEntity.class, true));
//        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, 10, true, false, TurtleEntity.TARGET_DRY_BABY));
    }

    /**
     * Recycled from the security drone
     *
     * @param target         The Targeted Entity
     * @param distanceFactor The Distance (unused)
     */
    public void performRangedAttack(@NotNull LivingEntity target, float distanceFactor) {
        if (!this.level.isClientSide && this.canSee(target)) {
            LaserEntity lazer = new LaserEntity(TEntities.LASER.get(), this, this.getCommandSenderWorld(), 4.0F, TDamageSources.causeTardisMobDamage("laser", this));
            lazer.setColor(new Vector3d(1.0, 0.0, 0.0));
            lazer.setDamage((float) Objects.requireNonNull(this.getAttribute(Attributes.ATTACK_DAMAGE)).getBaseValue());
            lazer.setRayLength(1F);
            lazer.shootFromRotation(lazer, this.xRot, this.yHeadRot, 0.0F, 1.5F, 0.0F);
            this.level.addFreshEntity(lazer);
            this.level.playSound(null, this.blockPosition(), TSounds.LASER_GUN_FIRE.get(), SoundCategory.HOSTILE, 1.0F, 1.0F);
        }

    }

    private INamedContainerProvider createContainerProvider() {
        return new INamedContainerProvider() {
            public Container createMenu(int i, @NotNull PlayerInventory playerInventory, @NotNull PlayerEntity player) {
                return new InventoryContainers(i, playerInventory, k9.this.inventory);
            }

            @NotNull
            public ITextComponent getDisplayName() {
                return new TranslationTextComponent("aseoha.k9.inventory");
            }
        };
    }

    //Why does this exist? I have no clue honestly
//    @Override
//    protected int addExperiencePoints(PlayerEntity player)
//    {
//        return 3 + this.world.random.nextInt(5);
//    }

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
    @Override
    public void tick() {
        super.tick();
        aseoha.k9TickThread.Call(this);
    }

    //*******************************Honestly I can barely read half of this, need to clean it****************************************//
    @NotNull
    @Override
    public ActionResultType mobInteract(PlayerEntity player, @NotNull Hand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();
        if (this.level.isClientSide) {
            boolean flag = this.isOwnedBy(player) || this.isTame() || item == Items.IRON_INGOT && !this.isTame() && !this.isAngry();
            return flag ? ActionResultType.CONSUME : ActionResultType.PASS;
        } else {
            if (this.isTame()) {
                if (item instanceof IArtronItemStackBattery) {
                    for (int i = 100; this.power < 100 && ((IArtronItemStackBattery) item).getCharge(itemstack) > 1; i--) {
                        this.power++;
                        ((IArtronItemStackBattery) item).discharge(itemstack, 1);
                    }
                }

                //********INVENTORY********//
                if (player.isCrouching() && !this.isNoAi()) {
                    if (!this.isDead)
                        player.openMenu(this.createContainerProvider());
                }
                if (!(item instanceof IArtronItemStackBattery && !player.isCrouching())) {
                    ActionResultType actionresulttype = super.mobInteract(player, hand);
                    if (this.isOwnedBy(player)) {
                        k9.Say("Power is at " + this.power, player, player.level); //TODO: Add power to the K9 Screen, distress signals, etc
//                        this.setOrderedToSit(!this.isOrderedToSit());
                        if (!this.isDead && !player.isCrouching() && this.level.isClientSide)
                            OpenK9Screen(this);
                        this.jumping = false;
                        this.navigation.stop();
                        this.setTarget((LivingEntity) null);
                        return ActionResultType.SUCCESS;
                    }
                    return actionresulttype;
                }

                //TAME
            } else if (item instanceof SonicItem && !this.isAngry()) {
//                if (!player.abilities.instabuild) {
//                    itemstack.shrink(1);
//                }

//                this.random.nextInt(1);
                if (!ForgeEventFactory.onAnimalTame(this, player)) {
                    this.tame(player);
                    this.navigation.stop();
                    this.setTarget((LivingEntity) null);
                    this.setOrderedToSit(true);
                    this.level.broadcastEntityEvent(this, (byte) 7);
                } else {
                    this.level.broadcastEntityEvent(this, (byte) 6);
                }

                return ActionResultType.SUCCESS;
            }

            return super.mobInteract(player, hand);
        }
    }

//@OnlyIn(Dist.CLIENT)
//    public void openK9Screen() {Minecraft.getInstance().setScreen(new K9Screen(this) {});}

    //************************I don't even know why this is here*******************************//
    @Override
    public void setTame(boolean p_70903_1_) {
        super.setTame(p_70903_1_);
        Objects.requireNonNull(this.getAttribute(Attributes.MAX_HEALTH)).setBaseValue(50.0D);

        Objects.requireNonNull(this.getAttribute(Attributes.ATTACK_DAMAGE)).setBaseValue(4.0D);
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


    public boolean shouldTakeSpaceDamage() {
        return false;
    }

    @Override
    public boolean canMate(@NotNull AnimalEntity p_70878_1_) {
        return false;
    }

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
    public static void Talk(int text, PlayerEntity player, World worldIn) {
        assert player != null;
        TardisHelper.getConsoleInWorld(player.level);
        Objects.requireNonNull(worldIn.getServer()).tell(new TickDelayedTask(1, () -> {

            switch (text) {
                case 1:
                    player.sendMessage(Constants.AffirmativeK9, player.getUUID());
                    break;
                case 2:
                    player.sendMessage(Constants.DoesNotComputeK9, player.getUUID());
                    break;
                default:
                    player.sendMessage(Constants.InsufficientDataK9, player.getUUID());

            }
        }));
    }

    public static void Say(String text, PlayerEntity player, World worldIn) {
        assert player != null;
        Objects.requireNonNull(worldIn.getServer()).tell(new TickDelayedTask(1, () -> player.sendMessage(new StringTextComponent(text + ", Master."), player.getUUID())));
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundNBT nbt) {
        super.addAdditionalSaveData(nbt);
        setInvNBT(this.inventory, nbt);
        nbt.putByte("Power", this.power);

    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundNBT nbt) {
        super.readAdditionalSaveData(nbt);
        getInvNBT(this.inventory, nbt);
        if (nbt.contains("Power", 99)) {
            this.power = nbt.getByte("Power");
        }
    }

    @NotNull
    @Override
    public AttributeModifierManager getAttributes() {
        return new AttributeModifierManager(setCustomAttributes().build());
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if (source.getDirectEntity() instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) source.getDirectEntity();
            if (player.getMainHandItem().getItem() instanceof ToolItem && ((ToolItem) player.getMainHandItem().getItem()).getTier() == ItemTier.IRON) {
                amount *= 1.5F;
            }
        }
//        this.knockback(.1F, .1, .1);
        this.power -= (byte) amount;
        return false;
//        return super.hurt(source, amount);

    }

    @Override
    public RecycledWolf getBreedOffspring(ServerWorld world, AgeableEntity ageableEntity) {
        return (RecycledWolf) null;
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!this.level.isClientSide && !this.isPathFinding() && this.onGround) {
            this.level.broadcastEntityEvent(this, (byte) 8);
        }

        if (!this.level.isClientSide) {
            this.updatePersistentAnger((ServerWorld) this.level, true);
        }

    }

    @OnlyIn(Dist.CLIENT)
    public void handleEntityEvent(byte p_70103_1_) {
        if (p_70103_1_ == 8) {
        } else {
            super.handleEntityEvent(p_70103_1_);
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
}