package com.code.aseoha.client.renderers.blocks;

import com.code.aseoha.client.models.blocks.EOHModel;
import com.code.aseoha.client.models.blocks.TardisCoralModel;
import com.code.aseoha.tileentities.blocks.EOHTile;
import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class EOHRenderer extends TileEntityRenderer<EOHTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/block/eoh.png");
//    public static CoralExterior MODEL = new CoralExterior();
    //public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    private EOHModel MODEL = new EOHModel();

    public EOHRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(@NotNull EOHTile eohTile, float v, MatrixStack matrixStackIn, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
        matrixStackIn.pushPose();
        float scale = 0.0625F;
        matrixStackIn.scale((float) 1, (float) 1, (float) 1);
        matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(180));
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180));
        matrixStackIn.translate(-0.5, -3.1, 0.5);
        MODEL.render(eohTile, scale, matrixStackIn, iRenderTypeBuffer.getBuffer(RenderType.entityTranslucent(TEXTURE)), i, OverlayTexture.NO_OVERLAY, 1.0F, eohTile.IsOverheated ? 0.5F : 1F, eohTile.IsOverheated ? 0.5F : 1F, 1.0F);
        matrixStackIn.popPose();
        //************************ NETHER STAR RENDER **************************//
        matrixStackIn.pushPose();
        matrixStackIn.translate(0.5, 3,0.5);
        matrixStackIn.scale(1,1,1);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(90));
        if(!eohTile.active && eohTile.hasStar)
            Minecraft.getInstance().getItemRenderer().renderStatic(Items.NETHER_STAR.getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStackIn, iRenderTypeBuffer);
        matrixStackIn.popPose();
    }
}
