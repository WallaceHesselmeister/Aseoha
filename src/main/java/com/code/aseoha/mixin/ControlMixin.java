package com.code.aseoha.mixin;

import com.code.aseoha.events.ControlEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.mistersecret312.temporal_api.events.ControlEvent;
import net.tardis.mod.controls.AbstractControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ControlEntity.class)
public abstract class ControlMixin extends Entity {
    @Shadow(remap = false) public abstract AbstractControl getControl();

    public ControlMixin(EntityType<?> p_i48580_1_, World p_i48580_2_) {
        super(p_i48580_1_, p_i48580_2_);
    }

//    @Override
//    public boolean canCollideWith(@NotNull Entity p_241849_1_) {
//        return canBeCollidedWith();
//    }
//
//    @Override
//    public boolean canBeCollidedWith() {
//        return true;
//    }

    @Inject(method = "interactAt(Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/math/vector/Vector3d;Lnet/minecraft/util/Hand;)Lnet/minecraft/util/ActionResultType;", at = @At("HEAD"), cancellable = true, remap = false)
    public void onUsed(PlayerEntity player, Vector3d vec, Hand hand, CallbackInfoReturnable<ActionResultType> cir) {
        ControlEvents.ControlClickEvent event = new ControlEvents.ControlClickEvent(this.getControl(), player);
        MinecraftForge.EVENT_BUS.post(event);
        if(event.isCanceled())
            cir.setReturnValue(ActionResultType.FAIL);
    }
}