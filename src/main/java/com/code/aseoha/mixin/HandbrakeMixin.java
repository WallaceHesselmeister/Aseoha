package com.code.aseoha.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(HandbrakeControl.class)
public abstract class HandbrakeMixin extends BaseControl {
    public HandbrakeMixin(ControlRegistry.ControlEntry entry, ConsoleTile console, ControlEntity entity) {
        super(entry, console, entity);
    }

    @ModifyExpressionValue(remap = false, method = "onRightClicked(Lnet/tardis/mod/tileentities/ConsoleTile;Lnet/minecraft/entity/player/PlayerEntity;)Z", at = @At(value = "INVOKE", target = "Lnet/tardis/mod/tileentities/ConsoleTile;isInFlight()Z"))
    public boolean Aseoha$OnRightClicked(boolean original){
        return original && this.getConsole().getControl(ThrottleControl.class).get().getAmount() != 0F;
    }
}
