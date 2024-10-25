package com.code.aseoha.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.tardis.mod.entity.ControlEntity;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(ControlEntity.class)
public abstract class ControlMixin extends Entity {
    public ControlMixin(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(p_i48580_1_, p_i48580_2_);
    }

    @Override
    public boolean canCollideWith(@NotNull Entity p_241849_1_) {
        return canBeCollidedWith();
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }
}