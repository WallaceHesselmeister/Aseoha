//package com.code.aseoha.common.entities;
//
//
//import com.code.aseoha.misc.InventoryContainers;
//import net.minecraft.block.BlockState;
//import net.minecraft.entity.*;
//import net.minecraft.entity.ai.goal.SwimGoal;
//import net.minecraft.entity.passive.AnimalEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.player.PlayerInventory;
//import net.minecraft.inventory.Inventory;
//import net.minecraft.item.*;
//import net.minecraft.util.*;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import org.jetbrains.annotations.NotNull;
//
//import java.util.Objects;
//
///**
// * @author Me <br />
// * K9! The Entity Class
// */
//public class K9 extends RecycledWolf {
//    private World world;
//    private final Inventory inventory = new Inventory(36);
//    public boolean isDead = true;
//    public byte power = 0;
//    private int timer = 0;
//
//
//    public K9(EntityType<? extends RecycledWolf> type, World worldIn) {
//        super(type, worldIn);
//    }
//
//    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
//        return CreatureEntity.createMobAttributes()
//                .add(Attributes.MAX_HEALTH, 60.0D)
//                .add(Attributes.MOVEMENT_SPEED, 0.2D)
//                .add(Attributes.ATTACK_DAMAGE, 13.0D)
//                .add(Attributes.FOLLOW_RANGE, 99999999.0D);
//    }
//
//
//    @Override
//    protected void registerGoals() {
//        super.registerGoals();
//        this.goalSelector.removeGoal(new SwimGoal(this));
//        this.goalSelector.removeGoal(new LeapAtTargetGoal(this, 0.4F));
//        this.goalSelector.removeGoal(new MeleeAttackGoal(this, 1.0, true));
//        this.goalSelector.removeGoal(new BreedGoal(this, 1.0));
//        this.goalSelector.removeGoal(new AvoidEntityGoal<>(this, LlamaEntity.class, 24.0F, 1.5, 1.5));
//
//        this.goalSelector.addGoal(0, new SwimGoal(this));
//        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.5, 40, 6.0F));
//        this.goalSelector.removeGoal(new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
////        this.goalSelector.addGoal(2, new ZombieAttackGoal(this, 1.0D, false));
//        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
//        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(RecycledWolf.class));
////        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
////        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
//        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, CreeperEntity.class, true));
////        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, 10, true, false, TurtleEntity.TARGET_DRY_BABY));
//    }
//
//    /**
//     * Recycled from the security drone
//     * @param target The Targeted Entity
//     * @param distanceFactor The Distance
//     */
//    public void performRangedAttack(@NotNull LivingEntity target, float distanceFactor) {
//        if(this.blockPosition().closerThan(target.blockPosition(), 6)){
//            this.walkDist = 0;
//            this.walkDistO = 0;
//        }
//        if (!this.level.isClientSide && this.canSee(target)) {
//            LaserEntity lazer = new LaserEntity(TEntities.LASER.get(), this, this.getCommandSenderWorld(), 4.0F, TDamageSources.causeTardisMobDamage("laser", this));
//            lazer.setColor(new Vector3d(1.0, 0.0, 0.0));
//            lazer.setDamage((float) Objects.requireNonNull(this.getAttribute(Attributes.ATTACK_DAMAGE)).getBaseValue());
//            lazer.setRayLength(1F);
//            lazer.shootFromRotation(lazer, this.xRot, this.yHeadRot, 0.0F, 1.5F, 0.0F);
//            this.level.addFreshEntity(lazer);
//            this.level.playSound(null, this.blockPosition(), TSounds.LASER_GUN_FIRE.get(), SoundCategory.HOSTILE, 1.0F, 1.0F);
//        }
//
//    }
//
//    private INamedContainerProvider createContainerProvider() {
//        return new INamedContainerProvider() {
//            public Container createMenu(int i, @NotNull PlayerInventory playerInventory, @NotNull PlayerEntity player) {
//                return new InventoryContainers(i, playerInventory, K9.this.inventory);
//            }
//
//            @NotNull
//            public ITextComponent getDisplayName() {
//                return new TranslationTextComponent("aseoha.K9.inventory");
//            }
//        };
//    }
//
//    //Why does this exist? I have no clue honestly
////    @Override
////    protected int addExperiencePoints(PlayerEntity player)
////    {
////        return 3 + this.world.random.nextInt(5);
////    }
//
//    //***************************I've gotta do a MASSIVE sound overhaul someday*******************************/
//    @Override
//    protected SoundEvent getAmbientSound() {
//        return SoundEvents.ARMOR_EQUIP_IRON;
//    }
//
//    @Override
//    protected SoundEvent getDeathSound() {
//        return SoundEvents.IRON_GOLEM_DEATH;
//    }
//
//    @Override
//    protected SoundEvent getHurtSound(@NotNull DamageSource damageSourceIn) {
//        return SoundEvents.IRON_GOLEM_HURT;
//    }
//
//    @Override
//    protected void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
//        this.playSound(SoundEvents.METAL_STEP, 0.20F, 0.5F);
//    }
//
//    //    @Override
////    public boolean attackEntityAsMob(Entity entityIn) {
////        if (!super.attackEntityAsMob(entityIn)) {
////            return false;
////        } else {
////            if (entityIn instanceof LivingEntity) {
////                ((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 200,3));
////                ((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.WEAKNESS, 200));
////                ((LivingEntity)entityIn).addEffect(new EffectInstance(Effects.CONFUSION, 200));
////            }
////            return true;
////        }
////    }
//    //****************************************Just for power****************************************//
//    @Override
//    public void tick() {
//        super.tick();
//        if(this.isAlive()) {
//            this.setNoAi(this.isDead);
//            if (this.timer < config.SERVER.K9PowerDrainRate.get() * 20) {
//                timer++;
//            }
//            if(this.timer >= config.SERVER.K9PowerDrainRate.get() * 20){
//                if(this.power > 0)
//                    this.power -= 1;
//                this.timer = 0;
//            }
//            if(this.timer == 0 && this.power == 10)
//                Objects.requireNonNull(this.getOwner()).sendMessage(ITextComponent.nullToEmpty("Power Banks At 10%, Master."), Objects.requireNonNull(this.getOwnerUUID()));
//            if(this.timer == 0 && this.power == 1) {
//                Objects.requireNonNull(this.getOwner()).sendMessage(ITextComponent.nullToEmpty("Power Banks Depleted, Master."), Objects.requireNonNull(this.getOwnerUUID()));
//                this.power = 0;
//            }
//            this.isDead = this.power <= 0;
//            if(this.isDead){
//                this.jumping = false;
//                this.setNoGravity(false);
//                if(!this.isInsidePortal && this.onGround) {
//                    this.navigation.stop();
//                    this.setTarget((LivingEntity) null);
//                }
//            }
////            aseoha.LOGGER.info(this.power);
//            if(this.power < 0) this.power = 0;
//        }
//    }
//
//    //*******************************Honestly I can barely read half of this, need to clean it****************************************//
//    @NotNull
//    @Override
//    public ActionResultType mobInteract(PlayerEntity player, @NotNull Hand hand) {
//        ItemStack itemstack = player.getItemInHand(hand);
//        Item item = itemstack.getItem();
//        if (this.level.isClientSide) {
//            boolean flag = this.isOwnedBy(player) || this.isTame() || item == Items.IRON_INGOT && !this.isTame() && !this.isAngry();
//            return flag ? ActionResultType.CONSUME : ActionResultType.PASS;
//        } else {
//            if (this.isTame()) {
//                //***********HEAL***********//
////                if (item instanceof SonicItem) {
////                    if (this.getHealth() < this.getMaxHealth()) {
////                        if(((SonicItem) item).getCharge(itemstack) > 25) {
////                            ((SonicItem) item).discharge(itemstack, 25);
////                            this.heal((float) 1);
////                            return ActionResultType.SUCCESS;
////                        }
////                    }
////                    if (power < 100) {
////                        if(((SonicItem) item).getCharge(itemstack) > 25) {
////                            ((SonicItem) item).discharge(itemstack, 25);
////                            this.power += 25;
////                        }
////                    }
////                }
//                if (item instanceof IArtronItemStackBattery) {
////                    if (this.getHealth() < this.getMaxHealth()) {
////                        ((IArtronItemStackBattery) item).discharge(itemstack, 25);
////                        this.heal((float) 1);
////                        return ActionResultType.SUCCESS;
////                    }
////                    for(int i = 100;this.getHealth()<this.maxHe && ((IArtronItemStackBattery) item).getCharge(itemstack) > 1; i--){
////                        this.power++;
////                        ((IArtronItemStackBattery) item).discharge(itemstack, 1);
////                    }
////                    if (power < 75) {
////                        ((IArtronItemStackBattery) item).discharge(itemstack, 25);
////                        this.power += 25;
////                    }
//                    for(int i = 100;this.power<100 && ((IArtronItemStackBattery) item).getCharge(itemstack) > 1; i--){
//                        this.power++;
//                        ((IArtronItemStackBattery) item).discharge(itemstack, 1);
//                    }
//                }
//
//                //********INVENTORY********//
//                if (player.isCrouching() && !this.isNoAi()) {
//                    if(!this.isDead)
//                        player.openMenu(this.createContainerProvider());
//                }
//                if (!(item instanceof IArtronItemStackBattery && !player.isCrouching())) {
//                    ActionResultType actionresulttype = super.mobInteract(player, hand);
//                    if (this.isOwnedBy(player)) {
//                        K9.Say("Power is at " + this.power, player, player.level); //TODO: Add power to the K9 Screen, distress signals, etc
////                        this.setOrderedToSit(!this.isOrderedToSit());
//                        if(!this.isDead && !player.isCrouching())
//                            OpenK9Screen(this);
//                        this.jumping = false;
//                        this.navigation.stop();
//                        this.setTarget((LivingEntity) null);
//                        return ActionResultType.SUCCESS;
//                    }
//                    return actionresulttype;
//                }
//
//                //TAME
//            } else if (item instanceof SonicItem && !this.isAngry()) {
////                if (!player.abilities.instabuild) {
////                    itemstack.shrink(1);
////                }
//
////                this.random.nextInt(1);
//                if (!ForgeEventFactory.onAnimalTame(this, player)) {
//                    this.tame(player);
//                    this.navigation.stop();
//                    this.setTarget((LivingEntity) null);
//                    this.setOrderedToSit(true);
//                    this.level.broadcastEntityEvent(this, (byte) 7);
//                } else {
//                    this.level.broadcastEntityEvent(this, (byte) 6);
//                }
//
//                return ActionResultType.SUCCESS;
//            }
//
//            return super.mobInteract(player, hand);
//        }
//    }
//
////@OnlyIn(Dist.CLIENT)
////    public void openK9Screen() {Minecraft.getInstance().setScreen(new K9Screen(this) {});}
//
//    //************************I don't even know why this is here*******************************//
//    @Override
//    public void setTame(boolean p_70903_1_) {
//        super.setTame(p_70903_1_);
//        Objects.requireNonNull(this.getAttribute(Attributes.MAX_HEALTH)).setBaseValue(50.0D);
//
//        Objects.requireNonNull(this.getAttribute(Attributes.ATTACK_DAMAGE)).setBaseValue(4.0D);
//    }
//
////    @Override
////    public void die(@NotNull DamageSource damageSource) {
//////        super.die(damageSource);
////        this.setHealth(1000);
////        this.power=0;
////    }
//
//
////    public AttributeModifierManager getAttributes() {
////        return new AttributeModifierManager(createAttributes().build());
////    }
//
//
//    public boolean shouldTakeSpaceDamage() {
//        return false;
//    }
//
//    @Override
//    public boolean canMate(@NotNull AnimalEntity p_70878_1_) {
//        return false;
//    }
//
//    public boolean isSensitiveToWater() {
//        return true;
//    }
//
//    //    @Override
////    public void tick() {
////        K9.this.setTarget((LivingEntity)null);
//////        world.getPlayerByUUID(this.getOwnerUUID()).
////        super.tick();
////    }
////private static int timer = 0;
//    public static void Talk(int text, PlayerEntity player, World worldIn) {
//        assert player != null;
//        TardisHelper.getConsoleInWorld(player.level);
//        Objects.requireNonNull(worldIn.getServer()).tell(new TickDelayedTask(1, () -> {
//
//            switch (text) {
//                case 1:
//                    player.sendMessage(Constants.AffirmativeK9, player.getUUID());
//                    break;
//                case 2:
//                    player.sendMessage(Constants.DoesNotComputeK9, player.getUUID());
//                    break;
//                default:
//                    player.sendMessage(Constants.InsufficientDataK9, player.getUUID());
//
//            }
//        }));
//    }
//
//    public static void Say(String text, PlayerEntity player, World worldIn) {
//        assert player != null;
//        Objects.requireNonNull(worldIn.getServer()).tell(new TickDelayedTask(1, () -> player.sendMessage(new StringTextComponent(text + ", Master."), player.getUUID())));
//    }
//    @Override
//    public void addAdditionalSaveData(@NotNull CompoundNBT nbt){
//        super.addAdditionalSaveData(nbt);
//        setInvNBT(this.inventory, nbt);
//        nbt.putByte("Power", this.power);
//
//    }
//    @Override
//    public void readAdditionalSaveData(@NotNull CompoundNBT nbt){
//        super.readAdditionalSaveData(nbt);
//        getInvNBT(this.inventory, nbt);
//        if (nbt.contains("Power", 99)) {
//            this.power = nbt.getByte("Power");
//        }
//    }
//
//    @NotNull
//    @Override
//    public AttributeModifierManager getAttributes() {
//        return new AttributeModifierManager(setCustomAttributes().build());
//    }
//    @Override
//    public boolean hurt(DamageSource source, float amount) {
//        if (source.getDirectEntity() instanceof PlayerEntity) {
//            PlayerEntity player = (PlayerEntity)source.getDirectEntity();
//            if (player.getMainHandItem().getItem() instanceof ToolItem && ((ToolItem)player.getMainHandItem().getItem()).getTier() == ItemTier.IRON) {
//                amount *= 1.5F;
//            }
//        }
////        this.knockback(.1F, .1, .1);
//        this.power -= (byte) amount;
//        return false;
////        return super.hurt(source, amount);
//
//    }
//    @Override
//    public void aiStep() {
//        super.aiStep();
//        if (!this.level.isClientSide && !this.isPathFinding() && this.onGround) {
//            this.level.broadcastEntityEvent(this, (byte)8);
//        }
//
//        if (!this.level.isClientSide) {
//            this.updatePersistentAnger((ServerWorld)this.level, true);
//        }
//
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void handleEntityEvent(byte p_70103_1_) {
//        if (p_70103_1_ == 8) {
//        } else {
//            super.handleEntityEvent(p_70103_1_);
//        }
//
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public float getTailAngle() {
//        if (this.isAngry()) {
//            return 1.5393804F;
//        } else {
//            return this.isTame() ? (0.55F - (this.getMaxHealth() - this.getHealth()) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F);
//        }
//    }
//}
