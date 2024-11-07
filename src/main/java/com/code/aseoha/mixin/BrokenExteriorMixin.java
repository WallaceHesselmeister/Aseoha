package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithBrokenExteriorType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.registries.ForgeRegistryEntry;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.BrokenExteriorType;
import net.tardis.mod.tileentities.BrokenExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BrokenExteriorTile.class)
public abstract class BrokenExteriorMixin {


    @Shadow(remap = false) public abstract BrokenExteriorType getBrokenType();

    @Inject(method = "tameTardis(Lnet/minecraft/entity/player/PlayerEntity;)V", at = @At("HEAD"), remap = false)
    public void Aseoha$TameTARDIS(PlayerEntity player, CallbackInfo ci){
        ((IHelpWithBrokenExteriorType) this.getBrokenType()).Aseoha$SetPlayer(player);
    }
}
