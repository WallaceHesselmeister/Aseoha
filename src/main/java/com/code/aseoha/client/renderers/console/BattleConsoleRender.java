package com.code.aseoha.client.renderers.console;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.consoles.BattleConsoleModel;
import com.code.aseoha.tileentities.consoles.BattleConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
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
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class BattleConsoleRender extends TileEntityRenderer<BattleConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(aseoha.MODID, "textures/consoles/battle.png");
	public static final BattleConsoleModel MODEL = new BattleConsoleModel();

	public BattleConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(@NotNull BattleConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.pushPose();
		float scale = 0.0625F;
		matrixStackIn.scale((float) 1.15, (float) 1.15, (float) 1.15);
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(180));
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180));
		matrixStackIn.translate(-0.5, -1.68, 0.5);
		MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.entityTranslucent(TEXTURE)), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.popPose();
		matrixStackIn.pushPose();
		matrixStackIn.translate(0.2, 1.25, 0.55);
		matrixStackIn.scale(0.5f, 0.5f, 0.5f);
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(-120));
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(110));
		matrixStackIn.scale((float) 0.5, (float) 0.5, (float) 0.5);
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(90));
		Minecraft.getInstance().getItemRenderer().renderStatic(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
		matrixStackIn.popPose();
	}
}