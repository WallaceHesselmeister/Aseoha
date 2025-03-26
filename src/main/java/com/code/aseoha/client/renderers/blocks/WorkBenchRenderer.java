package com.code.aseoha.client.renderers.blocks;

import com.code.aseoha.WorkBench.WorkBenchRecipeHandler;
import com.code.aseoha.tileentities.blocks.WorkbenchTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class WorkBenchRenderer extends TileEntityRenderer<WorkbenchTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/block/workbench.png");

    public WorkBenchRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(@NotNull WorkbenchTile workbenchTile, float v, MatrixStack matrixStackIn, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
        matrixStackIn.pushPose();
        if(!workbenchTile.StoredItems.isEmpty()) {
            matrixStackIn.scale(0.2f, 0.2f, 0.2f);
            matrixStackIn.translate(2.5, 5.5, 2.5);
            matrixStackIn.pushPose();
            matrixStackIn.translate(-0.9, 0, 0.9);
            Minecraft.getInstance().getItemRenderer().renderStatic(workbenchTile.StoredItems.get(0).getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStackIn, iRenderTypeBuffer);
            matrixStackIn.popPose();
            matrixStackIn.pushPose();
            matrixStackIn.translate(-0.9, 0, -0.9);
            Minecraft.getInstance().getItemRenderer().renderStatic(workbenchTile.StoredItems.get(1).getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStackIn, iRenderTypeBuffer);
            matrixStackIn.popPose();
            matrixStackIn.pushPose();
            matrixStackIn.translate(0.9, 0, 0.9);
            Minecraft.getInstance().getItemRenderer().renderStatic(workbenchTile.StoredItems.get(2).getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStackIn, iRenderTypeBuffer);
            matrixStackIn.popPose();
            matrixStackIn.pushPose();
            matrixStackIn.translate(0.9, 0, -0.9);
            Minecraft.getInstance().getItemRenderer().renderStatic(workbenchTile.StoredItems.get(3).getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStackIn, iRenderTypeBuffer);
            matrixStackIn.popPose();
            matrixStackIn.pushPose();
            matrixStackIn.translate(0.95, -3, 0.0);
            matrixStackIn.mulPose(Vector3f.YN.rotationDegrees(90.0F));
            matrixStackIn.scale(2, 2, 2);
            Minecraft.getInstance().getItemRenderer().renderStatic(WorkBenchRecipeHandler.GetDefault().GetRecipeResult(workbenchTile.StoredItems).getDefaultInstance(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStackIn, iRenderTypeBuffer);
            matrixStackIn.popPose();
        }
        matrixStackIn.popPose();
    }
}