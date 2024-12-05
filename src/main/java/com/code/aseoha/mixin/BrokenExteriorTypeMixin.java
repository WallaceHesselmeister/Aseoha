package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithBrokenExteriorType;
import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithExterior;
import com.code.aseoha.Helpers.IHelpWithPlayerEntity;
import com.code.aseoha.aseoha;
import com.code.aseoha.misc.Pilot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.BrokenExteriorType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrokenExteriorType.class)
public class BrokenExteriorTypeMixin implements IHelpWithBrokenExteriorType {
    @Unique
    public PlayerEntity Aseoha$Player;


    @Override
    public void Aseoha$SetPlayer(PlayerEntity player) {
        this.Aseoha$Player = player;
    }

    @Override
    public PlayerEntity Aseoha$GetPlayer() {
        return this.Aseoha$Player;
    }

    @Inject(method = "swapWithReal", at = @At("TAIL"), remap = false)
    public void Aseoha$SwapWithReal(ServerWorld world, BlockPos pos, World interior, Direction dir, CallbackInfo ci){
        TardisHelper.getConsole(world.getServer(), interior).ifPresent(tile -> {
            aseoha.SendDebugToAll("Assigning Player " + this.Aseoha$GetPlayer() + " to Pilot Console " + tile + " In the world " + tile.getLevel());
            ((IHelpWithConsole) tile).Aseoha$SetPilot(this.Aseoha$GetPlayer());
        });
    }
}
