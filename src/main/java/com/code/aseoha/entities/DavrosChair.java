package com.code.aseoha.entities;


import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tardis.api.space.entities.ISpaceImmuneEntity;
import org.jetbrains.annotations.NotNull;

/**
 * @author Codiak <br />
 * This is a ridable Davros wheelchair.
 */
public class DavrosChair extends HorseEntity implements ISpaceImmuneEntity {
    public DavrosChair(EntityType<? extends HorseEntity> p_i50129_1_, World p_i50129_2_) {
        super(p_i50129_1_, p_i50129_2_);
    }


//    protected DavrosChair(EntityType<? extends MobEntity> p_i48576_1_, World p_i48576_2_) {
//        super(p_i48576_1_, p_i48576_2_);
//    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return CreatureEntity.createMobAttributes()
                .add(Attributes.MAX_HEALTH, Float.POSITIVE_INFINITY)
                .add(Attributes.MOVEMENT_SPEED, 0.2D)
                .add(Attributes.ATTACK_DAMAGE, 13.0D)
                .add(Attributes.FOLLOW_RANGE, 0);
    }

//    private boolean inputLeft;
//    private boolean inputRight;
//    private boolean inputUp;
//    private boolean inputDown;
//    private float deltaRotation;
//    private final float[] paddlePositions = new float[2];
//    private static final DataParameter<Boolean> DATA_ID_PADDLE_LEFT = EntityDataManager.defineId(DavrosChair.class, DataSerializers.BOOLEAN);
//    private static final DataParameter<Boolean> DATA_ID_PADDLE_RIGHT = EntityDataManager.defineId(DavrosChair.class, DataSerializers.BOOLEAN);


//    @NotNull
//    @Override
//    public AttributeModifierManager getAttributes() {
//        return new AttributeModifierManager(setCustomAttributes().build());
//    }
//
//    @Override
//    public boolean canBeControlledByRider() {
//        return true;
//    }
//
//    @Override
//    protected boolean canRide(@NotNull Entity p_184228_1_) {
//        return true;
//    }

//    @Override
//    public PathNavigator getNavigation() {
//        if (this.isPassenger() && this.getVehicle() instanceof MobEntity) {
//            MobEntity mobentity = (MobEntity)this.getVehicle();
//            return mobentity.getNavigation();
//        }
//        else-if (this.isVehicle() && this.getControllingPassenger() instanceof PlayerEntity) {
//            PlayerEntity player = (PlayerEntity) this.getVehicle();
//            return ;
//        }else {
//            return this.navigation;
//        }
//    }

//    @Override
//    protected void defineSynchedData() {
//        this.entityData.define(DATA_ID_PADDLE_LEFT, false);
//        this.entityData.define(DATA_ID_PADDLE_RIGHT, false);
//    }
//    @Override
//    public void tick() {
//        super.tick();
//        this.tickLerp();
//        if (this.isControlledByLocalInstance()) {
//            if (this.getPassengers().isEmpty() || !(this.getPassengers().get(0) instanceof PlayerEntity)) {
//                this.setPaddleState(false, false);
//            }
//
//            if (this.level.isClientSide) {
//                this.controlBoat();
//                Networking.sendToServer(new CSteerBoatPacket(this.getPaddleState(0), this.getPaddleState(1)));
//            }
//
//            this.move(MoverType.SELF, this.getDeltaMovement());
//        } else {
//            this.setDeltaMovement(Vector3d.ZERO);
//        }
//
//
//        for(int i = 0; i <= 1; ++i) {
//            if (this.getPaddleState(i)) {
//                if (!this.isSilent() && (double)(this.paddlePositions[i] % ((float)Math.PI * 2F)) <= (double)((float)Math.PI / 4F) && ((double)this.paddlePositions[i] + (double)((float)Math.PI / 8F)) % (double)((float)Math.PI * 2F) >= (double)((float)Math.PI / 4F)) {
////                    SoundEvent soundevent = this.getPaddleSound();
////                    if (soundevent != null) {
//                        Vector3d vector3d = this.getViewVector(1.0F);
//                        double d0 = i == 1 ? -vector3d.z : vector3d.z;
//                        double d1 = i == 1 ? vector3d.x : -vector3d.x;
////                        this.level.playSound((PlayerEntity)null, this.getX() + d0, this.getY(), this.getZ() + d1, soundevent, this.getSoundSource(), 1.0F, 0.8F + 0.4F * this.random.nextFloat());
////                    }
//                }
//
//                this.paddlePositions[i] = (float)((double)this.paddlePositions[i] + (double)((float)Math.PI / 8F));
//            } else {
//                this.paddlePositions[i] = 0.0F;
//            }
//        }
//
//
//        if (this.level.isClientSide) {
//            this.controlBoat();
//            Networking.sendToServer(new CSteerBoatPacket(this.getPaddleState(0), this.getPaddleState(1)));
//        }
//    }
//
//    private void tickLerp() {
//        if (this.isControlledByLocalInstance()) {
//            this.lerpSteps = 0;
//            this.setPacketCoordinates(this.getX(), this.getY(), this.getZ());
//        }
//
//        if (this.lerpSteps > 0) {
//            double d0 = this.getX() + (this.lerpX - this.getX()) / (double)this.lerpSteps;
//            double d1 = this.getY() + (this.lerpY - this.getY()) / (double)this.lerpSteps;
//            double d2 = this.getZ() + (this.lerpZ - this.getZ()) / (double)this.lerpSteps;
//            double d3 = MathHelper.wrapDegrees(this.lerpYRot - (double)this.yRot);
//            this.yRot = (float)((double)this.yRot + d3 / (double)this.lerpSteps);
//            this.xRot = (float)((double)this.xRot + (this.lerpXRot - (double)this.xRot) / (double)this.lerpSteps);
//            --this.lerpSteps;
//            this.setPos(d0, d1, d2);
//            this.setRot(this.yRot, this.xRot);
//        }
//    }
//
//
//    protected void clampRotation(@NotNull Entity p_184454_1_) {
//        p_184454_1_.setYBodyRot(this.yRot);
//        float f = MathHelper.wrapDegrees(p_184454_1_.yRot - this.yRot);
//        float f1 = MathHelper.clamp(f, -105.0F, 105.0F);
//        p_184454_1_.yRotO += f1 - f;
//        p_184454_1_.yRot += f1 - f;
//        p_184454_1_.setYHeadRot(p_184454_1_.yRot);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void onPassengerTurned(@NotNull Entity p_184190_1_) {
//        this.clampRotation(p_184190_1_);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void setInput(boolean p_184442_1_, boolean p_184442_2_, boolean p_184442_3_, boolean p_184442_4_) {
//        this.inputLeft = p_184442_1_;
//        this.inputRight = p_184442_2_;
//        this.inputUp = p_184442_3_;
//        this.inputDown = p_184442_4_;
//    }

    @Override
    protected float getBlockSpeedFactor() {
        return 1.0F;
    }

//    @NotNull
//    @Override
//    public final ActionResultType interact(@NotNull PlayerEntity p_184230_1_, @NotNull Hand p_184230_2_) {
//        if(this.getPassengers().isEmpty()){
//            p_184230_1_.startRiding(this);
//            return ActionResultType.SUCCESS;
//        }
//        else{
//            return ActionResultType.FAIL;
//        }
//    }

    @Override
    protected void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
        this.playSound(SoundEvents.METAL_STEP, 0.20F, 0.5F);
    }
    @Override
    public boolean shouldTakeSpaceDamage() {
        return false;
    }

    //    @Override
//    public boolean canMate(@NotNull AnimalEntity p_70878_1_) {
//        return false;
//    }

    //    @Override
//    public void tick() {
//        k9.this.setTarget((LivingEntity)null);
////        world.getPlayerByUUID(this.getOwnerUUID()).
//        super.tick();
//    }
//private static int timer = 0;


//    @Override
//    public void addAdditionalSaveData(@NotNull CompoundNBT nbt) {
//        super.addAdditionalSaveData(nbt);
//        setInvNBT(this.inventory, nbt);
//        nbt.putByte("Power", this.power);
//
//    }

//    @Override
//    public void readAdditionalSaveData(@NotNull CompoundNBT nbt) {
//        super.readAdditionalSaveData(nbt);
//        getInvNBT(this.inventory, nbt);
//        if (nbt.contains("Power", 99)) {
//            this.power = nbt.getByte("Power");
//        }
//    }

//    @NotNull
//    @Override
//    public AttributeModifierManager getAttributes() {
//        return new AttributeModifierManager(setCustomAttributes().build());
//    }

//    @Override
//    public boolean hurt(DamageSource source, float amount) {
//        if (source.getDirectEntity() instanceof PlayerEntity) {
//            PlayerEntity player = (PlayerEntity) source.getDirectEntity();
//            if (player.getMainHandItem().getItem() instanceof ToolItem && ((ToolItem) player.getMainHandItem().getItem()).getTier() == ItemTier.IRON) {
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
//    public RecycledWolf getBreedOffspring(ServerWorld world, AgeableEntity ageableEntity) {
//        return (RecycledWolf) null;
//    }

//    @Override
//    public void aiStep() {
//        super.aiStep();
//        if (!this.level.isClientSide && !this.isPathFinding() && this.onGround) {
//            this.level.broadcastEntityEvent(this, (byte) 8);
//        }
//
//        if (!this.level.isClientSide) {
//            this.updatePersistentAnger((ServerWorld) this.level, true);
//        }
//
//    }

//    @OnlyIn(Dist.CLIENT)
//    public void handleEntityEvent(byte p_70103_1_) {
//        if (p_70103_1_ == 8) {
//        } else {
//            super.handleEntityEvent(p_70103_1_);
//        }
//
//    }

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
//
//    public static float StaticGetTailAngle(){
//        aseoha.LOGGER.info(TailAngle);
//        return TailAngle;
//    }
}