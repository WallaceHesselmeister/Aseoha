package com.code.aseoha.entities;//package com.code.aseoha.entities;
//
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.MobEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.ItemTier;
//import net.minecraft.item.ToolItem;
//import net.minecraft.util.DamageSource;
//import net.minecraft.world.World;
//import net.tardis.api.space.entities.ISpaceImmuneEntity;
//
//public class k9 extends MobEntity implements ISpaceImmuneEntity {
//    public k9(EntityType<? extends MobEntity> type, World worldIn) {super(type, worldIn);}
//    public void tick() {
//        super.tick();
//    }
//
//    public boolean canBreatheUnderwater() {return true;}
//
//    public boolean doHurtTarget(Entity attacker) {return super.doHurtTarget(attacker);}
//
//    public boolean hurt(DamageSource source, float amount) {
//        if (source.getDirectEntity() instanceof PlayerEntity) {
//            PlayerEntity player = (PlayerEntity)source.getDirectEntity();
//            if (player.getMainHandItem().getItem() instanceof ToolItem && ((ToolItem)player.getMainHandItem().getItem()).getTier() == ItemTier.IRON) {
//                amount *= 1.5F;
//            }
//        }
//
//        return super.hurt(source, amount);
//    }
//
//    public boolean shouldTakeSpaceDamage() {
//        return false;
//    }
//}

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.common.util.BlockSnapshot;
import net.minecraftforge.event.ForgeEventFactory;
import net.tardis.api.space.entities.ISpaceImmuneEntity;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

/**
 * @author Me <br />
 * Will extend K9 in the future for usefull stuff such as power and TARDIS stuff. <br />
 * Also this is the Entity class
 */
@SuppressWarnings("deprecation")
public class Walle extends k9 implements ISpaceImmuneEntity {
    private static final DataParameter<Optional<BlockState>> DATA_CARRY_STATE;

    public Walle(EntityType<? extends RecycledWolf> type, World worldIn) {
        super(type, worldIn);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return CreatureEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 60.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.30D)
                .add(Attributes.ATTACK_DAMAGE, 13.0D)
                .add(Attributes.FOLLOW_RANGE, 50.0D);
    }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(10, new PlaceBlockGoal(this));
        this.goalSelector.addGoal(11, new TakeBlockGoal(this));
        this.goalSelector.removeGoal(new SwimGoal(this));
        this.goalSelector.removeGoal(new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.removeGoal(new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.removeGoal(new BreedGoal(this, 1.0));
        this.goalSelector.removeGoal(new AvoidEntityGoal<>(this, LlamaEntity.class, 24.0F, 1.5, 1.5));

        this.goalSelector.addGoal(0, new SwimGoal(this));
//        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.5, 40, 6.0F));
        this.goalSelector.removeGoal(new NearestAttackableTargetGoal<>( this, PlayerEntity.class, true) );
//        this.goalSelector.addGoal(2, new ZombieAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers(RecycledWolf.class));
//        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
//        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, AbstractVillagerEntity.class, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, CreeperEntity.class, true));
//        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, TurtleEntity.class, 10, true, false, TurtleEntity.TARGET_DRY_BABY));
    }

//    public void performRangedAttack(LivingEntity target, float distanceFactor) {
//        if (!this.level.isClientSide && this.canSee(target)) {
//            LaserEntity lazer = new LaserEntity((EntityType) TEntities.LASER.get(), this, this.getCommandSenderWorld(), 4.0F, TDamageSources.causeTardisMobDamage("laser", this));
//            lazer.setColor(new Vector3d(1.0, 0.0, 0.0));
//            lazer.setDamage((float)this.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue());
//            lazer.setRayLength(1F);
//            lazer.shootFromRotation(lazer, this.xRot, this.yHeadRot, 0.0F, 1.5F, 0.0F);
//            this.level.addFreshEntity(lazer);
//            this.level.playSound((PlayerEntity)null, this.blockPosition(), (SoundEvent) TSounds.LASER_GUN_FIRE.get(), SoundCategory.HOSTILE, 1.0F, 1.0F);
//        }
//
//    }

    @Override
    protected SoundEvent getAmbientSound(){return SoundEvents.ARMOR_EQUIP_IRON;}

    @Override
    protected SoundEvent getDeathSound(){return SoundEvents.IRON_GOLEM_DEATH;}

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSourceIn){return SoundEvents.IRON_GOLEM_HURT;}

    @Override
    protected void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn){this.playSound(SoundEvents.METAL_STEP, 0.20F, 0.5F);}

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
@NotNull
@Override
public ActionResultType mobInteract(PlayerEntity player, @NotNull Hand hand) {
    ItemStack itemstack = player.getItemInHand(hand);
    Item item = itemstack.getItem();
    if (this.level.isClientSide) {
        boolean flag = this.isOwnedBy(player) || this.isTame() || item == Items.POPPY && !this.isTame() && !this.isAngry();
        return flag ? ActionResultType.CONSUME : ActionResultType.PASS;
    } else {
        if (this.isTame()) {
            if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                if (!player.abilities.instabuild) {
                    itemstack.shrink(1);
                }

                this.heal((float) Objects.requireNonNull(item.getFoodProperties()).getNutrition());
                return ActionResultType.SUCCESS;
            }

            if (!(item instanceof DyeItem)) {
                ActionResultType actionresulttype = super.mobInteract(player, hand);
                if ((!actionresulttype.consumesAction()) && this.isOwnedBy(player)) {
                    this.setOrderedToSit(!this.isOrderedToSit());
                    this.jumping = false;
                    this.navigation.stop();
                    this.setTarget((LivingEntity)null);
                    return ActionResultType.SUCCESS;
                }

                return actionresulttype;
            }
        } else if (item == Items.COMPOSTER && !this.isAngry()) {
            if (!player.abilities.instabuild) {
                itemstack.shrink(1);
            }

            if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, player)) {
                this.tame(player);
                this.navigation.stop();
                this.setTarget((LivingEntity)null);
                this.setOrderedToSit(true);
                this.level.broadcastEntityEvent(this, (byte)7);
            } else {
                this.level.broadcastEntityEvent(this, (byte)6);
            }

            return ActionResultType.SUCCESS;
        }

        return super.mobInteract(player, hand);
    }
}


public boolean shouldTakeSpaceDamage() {
        return false;
    }

@Override
public boolean canMate(@NotNull AnimalEntity a){return false;}

public boolean isSensitiveToWater() {
        return true;
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_CARRY_STATE, Optional.empty());
    }


    public void setCarriedBlock(@Nullable BlockState p_195406_1_) {
        this.entityData.set(DATA_CARRY_STATE, Optional.ofNullable(p_195406_1_));
    }
    @Nullable
    @SuppressWarnings("unchecked")
    public BlockState getCarriedBlock() {
        return (BlockState)((Optional)this.entityData.get(DATA_CARRY_STATE)).orElse((BlockState)null);
    }


    static class PlaceBlockGoal extends Goal {
        private final Walle walle;

        public PlaceBlockGoal(Walle p_i45843_1_) {
            this.walle = p_i45843_1_;
        }

        public boolean canUse() {
            if (this.walle.getCarriedBlock() == null) {
                return false;
            } else if (!ForgeEventFactory.getMobGriefingEvent(this.walle.level, this.walle)) {
                return false;
            } else {
                return this.walle.getRandom().nextInt(2000) == 0;
            }
        }
        public boolean isMoving = false;
        public void tick() {
            Random random = this.walle.getRandom();
            World world = this.walle.level;
            int i = MathHelper.floor(this.walle.getX() - 1.0 + random.nextDouble() * 2.0);
            int j = MathHelper.floor(this.walle.getY() + random.nextDouble() * 2.0);
            int k = MathHelper.floor(this.walle.getZ() - 1.0 + random.nextDouble() * 2.0);
            BlockPos blockpos = new BlockPos(i, j, k);
            BlockState blockstate = world.getBlockState(blockpos);
            BlockPos blockpos1 = blockpos.below();
            BlockState blockstate1 = world.getBlockState(blockpos1);
            BlockState blockstate2 = this.walle.getCarriedBlock();
            if (blockstate2 != null) {
                blockstate2 = Block.updateFromNeighbourShapes(blockstate2, this.walle.level, blockpos);
                if (this.canPlaceBlock(world, blockpos, blockstate2, blockstate, blockstate1, blockpos1) && !ForgeEventFactory.onBlockPlace(this.walle, BlockSnapshot.create(world.dimension(), world, blockpos1), Direction.UP)) {
                    world.setBlock(blockpos, blockstate2, 3);
                    this.walle.setCarriedBlock((BlockState)null);
                }
            }
        }

        private boolean canPlaceBlock(World p_220836_1_, BlockPos p_220836_2_, BlockState p_220836_3_, BlockState p_220836_4_, BlockState p_220836_5_, BlockPos p_220836_6_) {
            return p_220836_4_.isAir(p_220836_1_, p_220836_2_) && !p_220836_5_.isAir(p_220836_1_, p_220836_6_) && !p_220836_5_.is(Blocks.BEDROCK) && !p_220836_5_.is(net.minecraftforge.common.Tags.Blocks.ENDERMAN_PLACE_ON_BLACKLIST) && p_220836_5_.isCollisionShapeFullBlock(p_220836_1_, p_220836_6_) && p_220836_3_.canSurvive(p_220836_1_, p_220836_2_) && p_220836_1_.getEntities(this.walle, AxisAlignedBB.unitCubeFromLowerCorner(Vector3d.atLowerCornerOf(p_220836_2_))).isEmpty();
        }
    }



    static class TakeBlockGoal extends Goal {
        private final Walle walle;

        public TakeBlockGoal(Walle block) { //dunno if block is actually the block, should research that a bit more
            this.walle = block;
        }

        public boolean canUse() {
            if (this.walle.getCarriedBlock() != null) {
                return false;
            } else if (!ForgeEventFactory.getMobGriefingEvent(this.walle.level, this.walle)) {
                return false;
            } else {
                return this.walle.getRandom().nextInt(20) == 0;
            }
        }

        public void tick() {
            Random random = this.walle.getRandom();
            World world = this.walle.level;
            int i = MathHelper.floor(this.walle.getX() - 2.0 + random.nextDouble() * 4.0);
            int j = MathHelper.floor(this.walle.getY() + random.nextDouble() * 3.0);
            int k = MathHelper.floor(this.walle.getZ() - 2.0 + random.nextDouble() * 4.0);
            BlockPos blockpos = new BlockPos(i, j, k);
            BlockState blockstate = world.getBlockState(blockpos);
            Block block = blockstate.getBlock();
            Vector3d vector3d = new Vector3d((double)MathHelper.floor(this.walle.getX()) + 0.5, (double)j + 0.5, (double)MathHelper.floor(this.walle.getZ()) + 0.5);
            Vector3d vector3d1 = new Vector3d((double)i + 0.5, (double)j + 0.5, (double)k + 0.5);
            BlockRayTraceResult blockraytraceresult = world.clip(new RayTraceContext(vector3d, vector3d1, RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, this.walle));
            boolean flag = blockraytraceresult.getBlockPos().equals(blockpos);
            if (block.is(BlockTags.ENDERMAN_HOLDABLE) && flag) {
                world.removeBlock(blockpos, false);
                this.walle.setCarriedBlock(blockstate.getBlock().defaultBlockState());
            }

        }
    }

    static {
        DATA_CARRY_STATE = EntityDataManager.defineId(Walle.class, DataSerializers.BLOCK_STATE);
    }
}
