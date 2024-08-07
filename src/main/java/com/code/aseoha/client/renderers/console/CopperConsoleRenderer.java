package com.code.aseoha.client.renderers.console;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.consoles.CopperConsoleModel;
import com.code.aseoha.misc.Console;
import com.code.aseoha.tileentities.consoles.CopperConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.consoles.CoralConsoleModel;


import net.tardis.mod.controls.MonitorControl;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.misc.WorldText;
import net.tardis.mod.tileentities.ConsoleTile;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CopperConsoleRenderer extends TileEntityRenderer<CopperConsoleTile> {
    public static final WorldText TEXT = new WorldText(0.31F, 0.26F, 0.003F, 16777215);
    public static CopperConsoleModel MODEL = new CopperConsoleModel();//((tex) -> {
//        return RenderType.entityCutout(tex);
//    });
    public static final ResourceLocation TEXTURE = new ResourceLocation(aseoha.MODID, "textures/consoles/copper.png");

    public CopperConsoleRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {super(rendererDispatcherIn);}

    @Override
    public void render(CopperConsoleTile copperConsoleTile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
        matrixStack.pushPose();
        float scale = 0.0625F;
        matrixStack.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
        matrixStack.translate(-0.5, -1.5, 0.5);
        matrixStack.scale((float) 1.15, (float) 1.255, (float) 1.15);
        //matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
//        ResourceLocation texture = new ResourceLocation(aseoha.MODID, "textures/consoles/copper.png");
//        if(copperConsoleTile.getVariant() != null)
        copperConsoleTile.getControl(MonitorControl.class).ifPresent((monitor) -> {
            matrixStack.pushPose();
            matrixStack.mulPose(Vector3f.YP.rotationDegrees(-60));
            matrixStack.translate(-0.2, -0.96, -0.87);
            TEXT.renderText(matrixStack, iRenderTypeBuffer, i, Helper.getConsoleText(copperConsoleTile));
            matrixStack.popPose();
        });
        @Nonnull ResourceLocation texture = copperConsoleTile.getVariant().getTexture();
        MODEL.render(copperConsoleTile, scale, matrixStack, iRenderTypeBuffer.getBuffer(RenderType.entityTranslucent(texture)), i, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();
        matrixStack.pushPose();
        matrixStack.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
        matrixStack.translate(0.85, 0.9,0.925);
        matrixStack.scale((float) 0.5, (float) 0.5, (float) 0.5);
        Minecraft.getInstance().getItemRenderer().renderStatic(copperConsoleTile.getSonicItem(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStack, iRenderTypeBuffer);
        matrixStack.popPose();
    }

//    public void render(CopperConsoleRenderer tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
//            matrixStackIn.pushPose();
//        float scale = 0.0625F;
//        matrixStackIn.translate(0.5, 1.6, 0.5);
//        matrixStackIn.scale((float) 1.15, (float) 1.255, (float) 1.15);
//        //matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
//        MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.entityTranslucent(TEXTURE)), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
//        matrixStackIn.popPose();
//        matrixStackIn.pushPose();
//        matrixStackIn.translate(0.85, 0.9,0.925);
//        matrixStackIn.scale((float) 0.5, (float) 0.5, (float) 0.5);
//       // Minecraft.getInstance().getItemRenderer().renderStatic(Console.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
//        matrixStackIn.popPose();




//
//
//
//
//        matrixStackIn.pushPose();
//        matrixStackIn.translate(0.5, 1.125, 0.5);
//        matrixStackIn.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
////        console.getControl(MonitorControl.class).ifPresent((monitor) -> {
//        ResourceLocation texture = new ResourceLocation("aseoha", "textures/consoles/copper.png");
//        if (console.getVariant() != null) {
//            texture = console.getVariant().getTexture();
//        }
//
//        float scale = 0.75F;
//        matrixStackIn.scale(scale, scale, scale);
//        model.render(console, scale, matrixStackIn, bufferIn.getBuffer(RenderType.entityTranslucent(texture)), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
//        matrixStackIn.pushPose();
//        matrixStackIn.translate(0.225, 0.5, 1.8);
//        matrixStackIn.mulPose(Vector3f.XN.rotationDegrees(15.0F));
//        float sonic_scale = 0.75F;
//        matrixStackIn.scale(sonic_scale, sonic_scale, sonic_scale);
//        Minecraft.getInstance().getItemRenderer().renderStatic(console.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
//        matrixStackIn.popPose();
//        matrixStackIn.popPose();
//    }


    //@Nullable
    //public TexVariant getVariant() {
    //    return this.variant < this.variants.length ? this.variants[this.variant] : null;
    //}
    //public ItemStack getSonicItem() {
    //    return this.sonic;
    //}

}
