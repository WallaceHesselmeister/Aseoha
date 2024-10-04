package com.code.aseoha.client.renderers.blocks;

import com.code.aseoha.client.models.blocks.UpsideDownEngine;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.models.tiles.EngineModel;
import net.tardis.mod.tileentities.TardisEngineTile;

@OnlyIn(Dist.CLIENT)
public class UpsideDownEngineRenderer extends TileEntityRenderer<TardisEngineTile> {
    public static final UpsideDownEngine MODEL = new UpsideDownEngine();
    public static final ResourceLocation TEXTURE = new ResourceLocation("tardis", "textures/tiles/engine.png");

    public UpsideDownEngineRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    public void render(TardisEngineTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
        matrixStackIn.pushPose();
        matrixStackIn.translate(0.5, 1.5, 0.5);
        matrixStackIn.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
        MODEL.renderToBuffer(matrixStackIn, bufferIn.getBuffer(RenderType.entityTranslucent(TEXTURE)), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.popPose();
    }
}
