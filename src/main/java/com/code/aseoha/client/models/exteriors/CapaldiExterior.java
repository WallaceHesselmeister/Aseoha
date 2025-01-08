package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import com.code.aseoha.client.renderers.exteriors.BrackolinRender;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class CapaldiExterior extends ExteriorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer boti;

	public CapaldiExterior() {
		texWidth = 368;
		texHeight = 368;

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 23.0F, 0.0F);
		Shell.texOffs(0, 0).addBox(-27.0F, -3.0F, -27.0F, 54.0F, 4.0F, 54.0F, 0.0F, false);
		Shell.texOffs(0, 58).addBox(-26.0F, -4.0F, -26.0F, 52.0F, 1.0F, 52.0F, 0.0F, false);
		Shell.texOffs(28, 66).addBox(-23.0F, -91.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Shell.texOffs(84, 161).addBox(-25.0F, -87.0F, -25.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);
		Shell.texOffs(268, 284).addBox(17.0F, -79.0F, -24.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(264, 284).addBox(-18.0F, -79.0F, -24.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(156, 108).addBox(-18.0F, -80.0F, -24.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(238, 11).addBox(-21.0F, -86.0F, -27.0F, 42.0F, 6.0F, 5.0F, 0.0F, false);
		Shell.texOffs(0, 111).addBox(-22.0F, -92.0F, -22.0F, 44.0F, 6.0F, 44.0F, 0.0F, false);
		Shell.texOffs(132, 111).addBox(-18.0F, -96.0F, -18.0F, 36.0F, 4.0F, 36.0F, 0.0F, false);
		Shell.texOffs(216, 281).addBox(-23.0F, -79.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(104, 277).addBox(-23.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(210, 281).addBox(-24.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(262, 133).addBox(-23.0F, -7.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(176, 233).addBox(-22.5F, -22.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(114, 259).addBox(-23.0F, -25.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(230, 203).addBox(-22.5F, -40.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(32, 254).addBox(-23.0F, -43.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(230, 158).addBox(-22.5F, -58.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(240, 251).addBox(-23.0F, -61.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(0, 251).addBox(-23.0F, -79.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(144, 214).addBox(-22.5F, -76.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(204, 279).addBox(-23.0F, -79.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(260, 284).addBox(-24.0F, -79.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(186, 151).addBox(-24.0F, -80.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Shell.texOffs(256, 284).addBox(-24.0F, -79.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(262, 203).addBox(-15.0F, -76.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Shell.texOffs(240, 55).addBox(-15.0F, -79.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.texOffs(224, 151).addBox(-15.0F, -61.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.texOffs(262, 166).addBox(-15.0F, -58.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Shell.texOffs(144, 207).addBox(-15.0F, -43.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.texOffs(112, 177).addBox(-15.0F, -40.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Shell.texOffs(144, 203).addBox(-15.0F, -25.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.texOffs(112, 161).addBox(-15.0F, -22.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Shell.texOffs(144, 199).addBox(-15.0F, -7.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Shell.texOffs(24, 284).addBox(-1.0F, -79.0F, 23.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(176, 278).addBox(-2.0F, -79.0F, 22.0F, 4.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(18, 284).addBox(-17.0F, -79.0F, 22.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(12, 284).addBox(15.0F, -79.0F, 22.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(208, 52).addBox(21.5F, -76.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(208, 248).addBox(22.0F, -79.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(82, 244).addBox(22.0F, -61.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(206, 7).addBox(21.5F, -58.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(240, 100).addBox(22.0F, -43.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(112, 199).addBox(21.5F, -40.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(240, 67).addBox(22.0F, -25.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(198, 188).addBox(21.5F, -22.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Shell.texOffs(240, 22).addBox(22.0F, -7.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Shell.texOffs(198, 278).addBox(23.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(94, 277).addBox(22.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(192, 278).addBox(22.0F, -79.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(186, 278).addBox(22.0F, -79.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(252, 284).addBox(-18.0F, -79.0F, 23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(156, 106).addBox(-18.0F, -80.0F, 23.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(248, 284).addBox(17.0F, -79.0F, 23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(244, 284).addBox(23.0F, -79.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(162, 0).addBox(23.0F, -80.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Shell.texOffs(240, 284).addBox(23.0F, -79.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(56, 161).addBox(-25.0F, -87.0F, 18.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);
		Shell.texOffs(28, 161).addBox(18.0F, -87.0F, 18.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);
		Shell.texOffs(0, 161).addBox(18.0F, -87.0F, -25.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);
		Shell.texOffs(28, 58).addBox(-23.0F, -91.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Shell.texOffs(28, 41).addBox(19.0F, -91.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Shell.texOffs(28, 33).addBox(19.0F, -91.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Shell.texOffs(156, 58).addBox(-27.0F, -86.0F, -21.0F, 5.0F, 6.0F, 42.0F, 0.0F, false);
		Shell.texOffs(238, 0).addBox(-21.0F, -86.0F, 22.0F, 42.0F, 6.0F, 5.0F, 0.0F, false);
		Shell.texOffs(134, 151).addBox(22.0F, -86.0F, -21.0F, 5.0F, 6.0F, 42.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.texOffs(40, 74).addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r1.texOffs(28, 17).addBox(-2.0F, -103.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(24, 49).addBox(-2.0F, -105.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r1.texOffs(27, 10).addBox(-3.0F, -104.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.texOffs(27, 26).addBox(-3.0F, -98.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.texOffs(28, 0).addBox(-2.5F, -97.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.texOffs(28, 74).addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.9167F, -18.2308F, -23.0167F);
		LeftDoor.texOffs(6, 284).addBox(-0.0833F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 139).addBox(1.9167F, 34.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 284).addBox(14.9167F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 127).addBox(1.9167F, 19.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 111).addBox(1.9167F, 1.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 135).addBox(1.9167F, 16.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 90).addBox(1.9167F, -16.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 131).addBox(1.9167F, -1.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 74).addBox(1.9167F, -34.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 127).addBox(1.9167F, -19.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 123).addBox(1.9167F, -37.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(234, 281).addBox(15.9167F, -37.7692F, -0.9833F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(28, 0).addBox(13.9167F, -11.2692F, -0.4833F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.9167F, -18.1667F, -23.0167F);
		RightDoor.texOffs(228, 281).addBox(-16.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(222, 281).addBox(-1.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 119).addBox(-14.9167F, 34.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 58).addBox(-14.9167F, 19.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 115).addBox(-14.9167F, 16.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 32).addBox(-14.9167F, 1.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 111).addBox(-14.9167F, -1.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.9167F, -16.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 106).addBox(-14.9167F, -19.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 48).addBox(-14.9167F, -37.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 0).addBox(-14.9167F, -34.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 6).addBox(-15.9167F, -11.3333F, -0.9833F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		boti = new ModelRenderer(this);
		boti.setPos(0.0F, 24.0F, 0.0F);
		boti.texOffs(276, 280).addBox(-22.0F, -86.0F, -1.0F, 44.0F, 86.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		boti.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}




	@Override
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.pushPose();
		EnumDoorState state = exterior.getOpen();
		matrixStack.translate(0.0D, 0.3D, 0.0D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.RightDoor.yRot = (float) -Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.yRot = (float) -Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
		}
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(0,1.5,0);
		LeftDoor.y = (float) -42.2;
		RightDoor.y = (float) -42.2;
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}

	public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		if(exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
			PortalInfo info = new PortalInfo();
			info.setPosition(exterior.getBlockPos());
			info.setWorldShell(exterior.getBotiWorld());

			info.setTranslate(matrix -> {
				matrix.translate(-0.5, 0.1, -0.5);
				ExteriorRenderer.applyTransforms(matrix, exterior);
			});
			//Interior Portal Position
			info.setTranslatePortal(matrix -> {
				matrixStack.scale(1,1,1);
				matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
				matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
				matrix.translate(-0.5, -0.4, -0.5);
			});
			//Exterior Portal Location
			info.setRenderPortal((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(0.3f, 0.4f, 0.3f);
				this.boti.render(matrix, buf.getBuffer(RenderType.entityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});
			//Interior Doors Location
//			info.setRenderDoor((matrix, buf) -> {
//				matrix.pushPose();
//				matrix.scale(0.8F, 0.8F, 0.8F);
//				this.Doors.render(matrix, buf.getBuffer(RenderType.entityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
//				matrix.popPose();
//			});

			BOTIRenderer.addPortal(info);
		}

	}
}