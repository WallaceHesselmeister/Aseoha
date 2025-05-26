package com.code.aseoha.mixin.client;

import com.code.aseoha.Config;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.controls.TelepathicControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(TelepathicControl.class)
public abstract class TelepathicCircuitMixin extends BaseControl {

    public TelepathicCircuitMixin(ControlRegistry.ControlEntry entry, ConsoleTile console, ControlEntity entity) {
        super(entry, console, entity);
    }

    @ModifyExpressionValue(remap = false, method = "onRightClicked", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;isClientSide()Z"))
    private boolean onRightClicked(boolean original) {
        return original && (this.getConsole().isInFlight() && Config.COMMON.ShouldOpenGUIInFlight.get());
    }
}
