package com.code.aseoha.client.renderers.blocks;

import com.code.aseoha.client.models.blocks.TardisCoralModel;
import com.code.aseoha.client.models.exteriors.CoralExterior;
import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import com.code.aseoha.tileentities.exteriors.CoralTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.controls.MonitorControl;
import net.tardis.mod.helper.Helper;

import static com.code.aseoha.client.renderers.exteriors.BrackolinRender.TEXT;

@OnlyIn(Dist.CLIENT)
public class TardisCoralRenderer extends TileEntityRenderer<TardisCoralTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/block/tardis_coral.png");
//    public static CoralExterior MODEL = new CoralExterior();
    //public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    private TardisCoralModel MODEL = new TardisCoralModel();

    public TardisCoralRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(TardisCoralTile tardisCoralTile, float v, MatrixStack matrixStackIn, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
        matrixStackIn.pushPose();
        float scale = 0.0625F;
        matrixStackIn.scale((float) 1.15, (float) 1.15, (float) 1.15);
        matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(180));
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180));
        matrixStackIn.translate(-0.5, -1.5, 0.5);
        MODEL.renderToBuffer(matrixStackIn, iRenderTypeBuffer.getBuffer(RenderType.entityTranslucent(TEXTURE)), i, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStackIn.popPose();
        matrixStackIn.pushPose();
        matrixStackIn.translate(0.2, 1.25,0.55);
        matrixStackIn.scale(0.5f,0.5f,0.5f);
        matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(-120));
        matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(110));
        matrixStackIn.scale((float) 0.5, (float) 0.5, (float) 0.5);
        matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(90));matrixStackIn.popPose();
    }
}
