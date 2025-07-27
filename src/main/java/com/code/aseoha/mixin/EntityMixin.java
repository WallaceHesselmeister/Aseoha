package com.code.aseoha.mixin;

import net.minecraft.command.ICommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.INameable;
import net.minecraftforge.common.capabilities.CapabilityProvider;
import net.minecraftforge.common.extensions.IForgeEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin extends CapabilityProvider<Entity> implements INameable, ICommandSource, IForgeEntity {

    public float getAseoha$EntityScale() {
        return Aseoha$EntityScale;
    }

    public void setAseoha$EntityScale(float aseoha$EntityScale) {
        Aseoha$EntityScale = aseoha$EntityScale;
    }

    @Unique public float Aseoha$EntityScale = 0.1F;

    protected EntityMixin(Class<Entity> baseClass) {
        super(baseClass);
    }

    protected EntityMixin(Class<Entity> baseClass, boolean isLazy) {
        super(baseClass, isLazy);
    }

    @Inject(method = "Lnet/minecraft/entity/Entity;save(Lnet/minecraft/nbt/CompoundNBT;)Z", at = @At("TAIL"))
    public void Aseoha$Save(CompoundNBT p_70039_1_, CallbackInfoReturnable<Boolean> cir) {
        p_70039_1_.putFloat("aseoha_size", this.Aseoha$EntityScale);
    }


    @Inject(method = "Lnet/minecraft/entity/Entity;load(Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("TAIL"))
    public void Aseoha$Load(CompoundNBT p_70020_1_, CallbackInfo ci) {
        this.Aseoha$EntityScale = p_70020_1_.getFloat("aseoha_size");
    }
}
