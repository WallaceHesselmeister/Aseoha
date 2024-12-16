package com.code.aseoha.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.misc.CrashTypes;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(HandbrakeControl.class)
public abstract class HandbrakeMixin extends BaseControl {
    @Shadow(remap = false)
    private boolean isFree;

    @Shadow(remap = false)
    public abstract boolean isFree();

    public HandbrakeMixin(ControlRegistry.ControlEntry entry, ConsoleTile console, ControlEntity entity) {
        super(entry, console, entity);
    }

//    //TODO: FIX THIS
//    @ModifyExpressionValue(remap = false, method = "onRightClicked(Lnet/tardis/mod/tileentities/ConsoleTile;Lnet/minecraft/entity/player/PlayerEntity;)Z", at = @At(value = "INVOKE", target = "Lnet/tardis/mod/tileentities/ConsoleTile;isInFlight()Z"))
//    public boolean Aseoha$OnRightClicked(boolean original){
//        return original && ((HandbrakeControl) (Object) this).getConsole().getControl(ThrottleControl.class).get().getAmount() != 0F;
//    }

    /**
     * @author Codiak540
     * @reason Using handbrake while landing won't crash you.
     */
    @Overwrite(remap = false)
    public boolean onRightClicked(ConsoleTile console, PlayerEntity player) {
        if (console != null && console.hasLevel()) {

            if (!console.getLevel().isClientSide()) {

                this.isFree = !this.isFree;

                console.getControl(ThrottleControl.class).ifPresent((throttle) -> {

                    if (console.isInFlight() && !this.isFree && throttle.getAmount() != 0.0F)
                        console.crash(CrashTypes.DEFAULT);

                    if (throttle.getAmount() > 0.0F && this.isFree())
                        console.takeoff();
                });
                this.markDirty();
            }

            return true;
        } else
            return false;
    }
}