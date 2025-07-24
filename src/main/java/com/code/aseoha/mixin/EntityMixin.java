package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithEntity;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.INameable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin extends net.minecraftforge.common.capabilities.CapabilityProvider<Entity> implements INameable, ICommandSource, net.minecraftforge.common.extensions.IForgeEntity, IHelpWithEntity {

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

    @Inject(method = "Lnet/minecraft/entity/Entity;save(Lnet/minecraft/nbt/CompoundNBT;)Z", at = @At("HEAD"), remap=false)
    public void Aseoha$Save(CompoundNBT nbt, CallbackInfoReturnable<Boolean> cir) {
        nbt.putFloat("aseoha_size", this.Aseoha$EntityScale);
    }


    @Inject(method = "Lnet/minecraft/entity/Entity;load(Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("HEAD"), remap=false)
    public void Aseoha$Load(CompoundNBT nbt, CallbackInfo ci) {
        this.Aseoha$EntityScale = nbt.getFloat("aseoha_size");
    }
}
