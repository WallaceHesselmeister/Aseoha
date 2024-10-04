package com.code.aseoha.client.renderers.console;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.consoles.BlueMarbleConsoleModel;
import com.code.aseoha.tileentities.consoles.BlueMarbleTile;
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
import net.tardis.mod.controls.MonitorControl;
import net.tardis.mod.helper.Helper;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

import static com.code.aseoha.client.renderers.exteriors.BrackolinRender.TEXT;

@OnlyIn(Dist.CLIENT)
public class BlueMarbleRender extends TileEntityRenderer<BlueMarbleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(aseoha.MODID, "textures/consoles/bluemarble.png");
	public static final BlueMarbleConsoleModel MODEL = new BlueMarbleConsoleModel();

	public BlueMarbleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(BlueMarbleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {

		matrixStackIn.pushPose();
		float scale = 0.0625F;
		matrixStackIn.scale((float) .90, (float) .90, (float) .90);
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(180));
		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(180));
		matrixStackIn.translate(-0.65, -1.6, 0.65);
		tileEntityIn.getControl(MonitorControl.class).ifPresent((monitor) -> {
			matrixStackIn.pushPose();
			matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(90));
			matrixStackIn.translate(-0.3, -.50500, -0.705);
			matrixStackIn.scale((float) 1.2, (float) 1.4, (float) 1.2);
			TEXT.renderText(matrixStackIn, bufferIn, combinedLightIn, Helper.getConsoleText(tileEntityIn));
			matrixStackIn.popPose();
		});
		MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.entityTranslucent(TEXTURE )), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.popPose();
		matrixStackIn.pushPose();
		matrixStackIn.translate(-.10, 1.4,.3);
		matrixStackIn.scale((float) 0.7, (float) 0.7, (float) 0.7);
//		matrixStackIn.scale(0.5f,0.5f,0.5f);
		matrixStackIn.mulPose(Vector3f.XP.rotationDegrees(0));
//		matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(0));
		matrixStackIn.mulPose(Vector3f.ZP.rotationDegrees(0));
		Minecraft.getInstance().getItemRenderer().renderStatic(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
		matrixStackIn.popPose();
	}
}