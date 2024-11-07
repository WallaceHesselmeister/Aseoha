package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.BrackolinRender;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class WhittakerModel extends ExteriorModel {
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer Base;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer BOTI;

	public WhittakerModel() {
		texWidth = 512;
		texHeight = 512;

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.9167F, -18.2308F, -22.0167F);
		LeftDoor.texOffs(240, 286).addBox(-0.0833F, -37.7692F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(234, 286).addBox(14.9167F, -37.7692F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(28, 0).addBox(1.9167F, -12.2692F, -0.4833F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(78, 278).addBox(15.9167F, -37.7692F, -0.9833F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 132).addBox(1.9167F, 33.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 124).addBox(1.9167F, 18.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 128).addBox(1.9167F, 15.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 108).addBox(1.9167F, 0.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 124).addBox(1.9167F, -2.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 89).addBox(1.9167F, -17.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 120).addBox(1.9167F, -20.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 139).addBox(1.9167F, -37.7692F, 0.0167F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 73).addBox(1.9167F, -35.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.9167F, -18.1667F, -22.0167F);
		RightDoor.texOffs(155, 286).addBox(-16.9167F, -37.8333F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(84, 278).addBox(-1.9167F, -37.8333F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 116).addBox(-14.9167F, 33.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 57).addBox(-14.9167F, 18.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 112).addBox(-14.9167F, 15.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 32).addBox(-14.9167F, 0.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 108).addBox(-14.9167F, -2.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.9167F, -17.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 48).addBox(-14.9167F, -20.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 136).addBox(-14.9167F, -37.8333F, 0.0167F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 0).addBox(-14.9167F, -35.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 6).addBox(-15.9167F, -12.3333F, -0.9833F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		Base = new ModelRenderer(this);
		Base.setPos(0.0F, 22.0F, 17.0F);
		Base.texOffs(0, 0).addBox(-26.0F, -3.0F, -43.0F, 52.0F, 5.0F, 52.0F, 0.0F, false);
		Base.texOffs(0, 57).addBox(-25.0F, -4.0F, -42.0F, 50.0F, 1.0F, 50.0F, 0.0F, false);
		Base.texOffs(72, 157).addBox(-24.0F, -86.0F, -41.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		Base.texOffs(24, 157).addBox(-24.0F, -86.0F, 1.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		Base.texOffs(0, 157).addBox(18.0F, -86.0F, 1.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		Base.texOffs(48, 157).addBox(18.0F, -86.0F, -41.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		Base.texOffs(28, 64).addBox(19.0F, -89.0F, -40.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(28, 57).addBox(-23.0F, -89.0F, -40.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(28, 40).addBox(-23.0F, -89.0F, 2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(28, 33).addBox(19.0F, -89.0F, 2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(270, 286).addBox(17.0F, -78.0F, -40.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(266, 286).addBox(-18.0F, -78.0F, -40.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(90, 157).addBox(-18.0F, -79.0F, -40.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Base.texOffs(258, 286).addBox(-23.0F, -78.0F, 0.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(96, 159).addBox(-23.0F, -79.0F, -35.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Base.texOffs(262, 286).addBox(-23.0F, -78.0F, -35.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(250, 286).addBox(17.0F, -78.0F, 5.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(150, 105).addBox(-18.0F, -79.0F, 5.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Base.texOffs(254, 286).addBox(-18.0F, -78.0F, 5.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(90, 278).addBox(22.0F, -78.0F, -35.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(156, 0).addBox(22.0F, -79.0F, -35.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Base.texOffs(246, 286).addBox(22.0F, -78.0F, 0.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(232, 0).addBox(-21.0F, -85.0F, -43.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);
		Base.texOffs(150, 57).addBox(-26.0F, -85.0F, -38.0F, 4.0F, 6.0F, 42.0F, 0.0F, false);
		Base.texOffs(204, 210).addBox(-21.0F, -85.0F, 5.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);
		Base.texOffs(134, 147).addBox(22.0F, -85.0F, -38.0F, 4.0F, 6.0F, 42.0F, 0.0F, false);
		Base.texOffs(0, 108).addBox(-22.0F, -90.0F, -39.0F, 44.0F, 5.0F, 44.0F, 0.0F, false);
		Base.texOffs(132, 108).addBox(-18.0F, -93.0F, -35.0F, 36.0F, 3.0F, 36.0F, 0.0F, false);
		Base.texOffs(42, 278).addBox(-22.0F, -78.0F, -2.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(36, 278).addBox(-22.0F, -78.0F, -17.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(30, 278).addBox(-23.0F, -78.0F, -18.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(236, 253).addBox(-22.0F, -7.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(228, 147).addBox(-21.5F, -22.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(62, 245).addBox(-22.0F, -25.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(204, 225).addBox(-21.5F, -40.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(0, 245).addBox(-22.0F, -43.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(172, 210).addBox(-21.5F, -58.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(128, 240).addBox(-22.0F, -61.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(160, 255).addBox(-22.0F, -78.0F, -32.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		Base.texOffs(96, 210).addBox(-21.5F, -76.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(24, 278).addBox(-22.0F, -78.0F, -19.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(18, 278).addBox(-22.0F, -78.0F, -34.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(48, 278).addBox(15.0F, -78.0F, 4.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(54, 278).addBox(0.0F, -78.0F, 4.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(60, 278).addBox(-1.0F, -78.0F, 5.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(96, 196).addBox(-15.0F, -7.0F, 4.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(184, 147).addBox(-15.0F, -22.0F, 3.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(96, 200).addBox(-15.0F, -25.0F, 4.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(232, 55).addBox(-15.0F, -40.0F, 3.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(96, 204).addBox(-15.0F, -43.0F, 4.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(258, 192).addBox(-15.0F, -58.0F, 3.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(204, 220).addBox(-15.0F, -61.0F, 4.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(232, 10).addBox(-15.0F, -78.0F, 4.0F, 30.0F, 2.0F, 1.0F, 0.0F, false);
		Base.texOffs(260, 147).addBox(-15.0F, -76.0F, 3.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(66, 278).addBox(-2.0F, -78.0F, 4.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(72, 278).addBox(-17.0F, -78.0F, 4.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		Base.texOffs(222, 270).addBox(21.0F, -78.0F, -34.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(228, 270).addBox(21.0F, -78.0F, -19.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(0, 278).addBox(22.0F, -78.0F, -18.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(232, 22).addBox(21.0F, -7.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(140, 195).addBox(20.5F, -22.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(232, 75).addBox(21.0F, -25.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(196, 165).addBox(20.5F, -40.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(236, 220).addBox(21.0F, -43.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(200, 7).addBox(20.5F, -58.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(240, 108).addBox(21.0F, -61.0F, -32.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(94, 255).addBox(21.0F, -78.0F, -32.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		Base.texOffs(200, 52).addBox(20.5F, -76.0F, -32.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(6, 278).addBox(21.0F, -78.0F, -17.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		Base.texOffs(12, 278).addBox(21.0F, -78.0F, -2.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 2.0F, -17.0F);
		Base.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(28, 71).addBox(-2.5F, -102.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 2.0F, -17.0F);
		Base.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(28, 77).addBox(-2.5F, -102.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r2.texOffs(27, 10).addBox(-3.0F, -103.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.texOffs(27, 26).addBox(-3.0F, -97.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.texOffs(28, 17).addBox(-2.0F, -102.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(28, 47).addBox(-2.0F, -104.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.texOffs(28, 0).addBox(-2.5F, -96.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(-38, 0).addBox(-20.0F, -86.75F, -20.75F, 40.0F, 82.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		Base.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
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
				this.BOTI.render(matrix, buf.getBuffer(RenderType.entityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
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

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}