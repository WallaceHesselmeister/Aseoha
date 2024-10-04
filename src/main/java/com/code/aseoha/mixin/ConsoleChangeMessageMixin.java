package com.code.aseoha.mixin;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.misc.Console;
import net.tardis.mod.network.packets.ConsoleChangeMessage;
import net.tardis.mod.tileentities.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.function.Supplier;

@Mixin(ConsoleChangeMessage.class)
public class ConsoleChangeMessageMixin {

    /**
     * @author Me
     * @reason Get hitbox's to change
     */
    @Inject(
            method = {"lambda$handle$1"},
            at = {@At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/util/concurrent/TickDelayedTask;<init>(ILjava/lang/Runnable;)V",
                    shift = At.Shift.BY, by = 2
            )},
            locals = LocalCapture.CAPTURE_FAILHARD,
            remap = false
    )
    private static void handleLambda(Supplier ctx, ConsoleChangeMessage mes, CallbackInfo ci, ServerWorld world, TileEntity te, ConsoleTile oldConsole, Console console, CompoundNBT oldData, TileEntity newConsole) {
        ((ConsoleTile)newConsole).removeControls();
        ((ConsoleTile)newConsole).getOrCreateControls();
    }
}