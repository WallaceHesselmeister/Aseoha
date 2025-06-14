/* (C) TAMA Studios 2025 */
package tama.mixin;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.Control;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.SonicPortControl;
import net.tardis.mod.control.datas.ControlDataItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tama.Events.ControlEvent;

@Mixin(SonicPortControl.class)
public abstract class SonicPortMixin extends Control<ControlDataItemStack> {
    public SonicPortMixin(ControlType<ControlDataItemStack> type) {
        super(type);
    }

    @Inject(
            method =
                    "onUse(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/InteractionHand;Lnet/tardis/mod/cap/level/ITardisLevel;)Lnet/minecraft/world/InteractionResult;",
            at =
                    @At(
                            value = "INVOKE",
                            target =
                                    "Lnet/minecraft/world/entity/player/Player;setItemInHand(Lnet/minecraft/world/InteractionHand;Lnet/minecraft/world/item/ItemStack;)V",
                            shift = At.Shift.BEFORE),
            cancellable = true)
    public void Aseoha$OnAddedToPort(
            Player player, InteractionHand hand, ITardisLevel level, CallbackInfoReturnable<InteractionResult> cir) {
        ControlEvent.SonicInsertEvent event =
                new ControlEvent.SonicInsertEvent(level, player, player.getItemInHand(hand));
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled()) cir.setReturnValue(InteractionResult.FAIL);
    }
}
