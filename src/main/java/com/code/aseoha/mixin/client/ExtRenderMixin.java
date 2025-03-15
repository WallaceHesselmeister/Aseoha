package com.code.aseoha.mixin.client;

import com.code.aseoha.Helpers.IHelpWithExterior;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ExteriorRenderer.class)
public class ExtRenderMixin {

    @Inject(method = "applyTransforms(Lcom/mojang/blaze3d/matrix/MatrixStack;Lnet/tardis/mod/tileentities/exteriors/ExteriorTile;)V", at = @At("TAIL"), remap = false)
    private static void Aseoha$UpdateTransforms(MatrixStack matrixStack, ExteriorTile tile, CallbackInfo ci) {
        if (tile != null) {
                    float scale;
                    if (((IHelpWithExterior) tile).Aseoha$GetScale())
                        scale = 1;
                    else if (!((IHelpWithExterior) tile).Aseoha$GetScale())
                        scale = 0.3F;
                    else
                        scale = 0;
                    matrixStack.scale(scale, scale, scale);
                    if(scale != 1) matrixStack.translate(0, 1F, 0);
                }
    }

}