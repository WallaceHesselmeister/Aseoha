package com.code.aseoha.mixin;

import net.minecraft.block.BlockState;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.helper.Helper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Helper.class)
public class HelperMixin {

    @Inject(method = "Lnet/tardis/mod/helper/Helper;canRenderInBOTI(Lnet/minecraft/block/BlockState;)Z", remap = false, at = @At("HEAD"), cancellable = true)
    private static void Aseoha$HelperBlockState(BlockState state, CallbackInfoReturnable<Boolean> cir){
        if(state == TBlocks.bottom_exterior.get().defaultBlockState() || state.getBlock() instanceof ExteriorBlock)
            cir.setReturnValue(false);
    }

}
