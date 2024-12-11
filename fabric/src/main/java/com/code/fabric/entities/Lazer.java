package com.code.fabric.entities;

import com.code.fabric.registries.AseohaEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class Lazer extends AbstractArrow {
    private double BaseDamage;
    public Lazer(EntityType<? extends Lazer> entityType, Level world) {
        super(AseohaEntities.LazerEntityType(), world);
    }

    private Lazer(Level world, double x, double y, double z) {
        super(AseohaEntities.LazerEntityType(), x, y, z, world);
    }

    private Lazer(Level world, LivingEntity shooter) {
        super(AseohaEntities.LazerEntityType(), shooter, world);
    }

    public Lazer createFromConstructor(Level world, LivingEntity shooter) {
        return new Lazer(world, shooter);
    }

    public EntityType<?> EntityType() {
        return AseohaEntities.LazerEntityType();
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    @Override
    public boolean isNoGravity() {
        return true;
    }

    @Override
    protected void onHitBlock(BlockHitResult ray) {
        super.onHitBlock(ray);
        BlockState TheBlockAbove = this.level().getBlockState(ray.getBlockPos().above(1));
        if (TheBlockAbove.equals(Blocks.AIR.defaultBlockState()))
            this.level().setBlock(ray.getBlockPos().above(1), Blocks.FIRE.defaultBlockState(), 0);
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    public void setBaseDamage(double d) {
        this.BaseDamage = d;
    }

    @Override
    public double getBaseDamage() {
        return this.BaseDamage;
    }
}