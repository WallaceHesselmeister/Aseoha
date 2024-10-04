package com.code.aseoha.mixin;

import com.code.aseoha.aseoha;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.models.exteriors.TTCapsuleExteriorModel;
import net.tardis.mod.client.renderers.exteriors.TTCapsuleExteriorRenderer;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.exteriors.TTCapsuleExteriorTile;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.lang.annotation.Target;

@Mixin(TTCapsuleExteriorRenderer.class)
public class TTExterior {
//    @Shadow @Final public static ResourceLocation TEXTURE;
@Shadow(remap = false) public static final TTCapsuleExteriorModel MODEL = new TTCapsuleExteriorModel();
//    @Inject(method = "renderExterior(Lnet/tardis/mod/tileentities/exteriors/TTCapsuleExteriorTile;FLcom/mojang/blaze3d/matrix/MatrixStack;Lnet/minecraft/client/renderer/IRenderTypeBuffer;IIF)V", at = @At("HEAD"), remap = false)
/**
 * @author me
 * @reason texvariants
 */
@Overwrite(remap = false)
    public void renderExterior(TTCapsuleExteriorTile tile, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, float alpha){
        if (tile.getVariant() != null) {
            ResourceLocation TEXTURE;
            TEXTURE = tile.getVariant().getTexture();
            matrixStackIn.pushPose();
            matrixStackIn.translate(0, -1, 0);
            Minecraft.getInstance().getTextureManager().bind(TEXTURE);
            MODEL.render(tile, 1.0F, matrixStackIn, bufferIn.getBuffer(TRenderTypes.getTardis(TEXTURE)), combinedLightIn, combinedOverlayIn, alpha);
            matrixStackIn.popPose();
        }
    }
    //new TexVariant(new ResourceLocation(aseoha.MODID,"textures/exteriors/invisible.png"), "exterior.capaldi.invisible"),
}
