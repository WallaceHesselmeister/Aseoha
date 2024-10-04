package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.OlwarriorRender;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
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

public class OlwarriorExterior extends ExteriorModel {
	private final ModelRenderer shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer door;
	private final ModelRenderer rightdoor;
	private final ModelRenderer leftdoor;
	private final ModelRenderer cube_r13;
	private final ModelRenderer BOTI;

	public OlwarriorExterior() {
		texWidth = 176;
		texHeight = 176;

		shell = new ModelRenderer(this);
		shell.setPos(0.0F, 24.0F, 0.0F);
		shell.texOffs(0, 0).addBox(-10.5F, -1.0F, -10.5F, 21.0F, 1.0F, 21.0F, 0.0F, false);
		shell.texOffs(0, 22).addBox(-10.0F, -1.5F, -10.0F, 20.0F, 1.0F, 20.0F, 0.0F, false);
		shell.texOffs(0, 43).addBox(-8.0F, -40.5F, -10.0F, 16.0F, 1.0F, 20.0F, -0.01F, false);
		shell.texOffs(52, 43).addBox(-10.0F, -40.5F, -8.0F, 20.0F, 1.0F, 16.0F, 0.0F, false);
		shell.texOffs(60, 22).addBox(-8.5F, -42.5F, -8.5F, 17.0F, 2.0F, 17.0F, 0.0F, false);
		shell.texOffs(0, 0).addBox(-1.5F, -46.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		shell.texOffs(4, 15).addBox(-1.0F, -46.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		shell.texOffs(10, 6).addBox(-1.0F, -45.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		shell.texOffs(58, 113).addBox(-10.0F, -39.5F, -9.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(30, 99).addBox(-9.0F, -40.5F, -9.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		shell.texOffs(54, 113).addBox(-9.0F, -39.5F, -10.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(63, 12).addBox(-9.0F, -39.5F, -10.5F, 18.0F, 3.0F, 1.0F, -0.01F, false);
		shell.texOffs(104, 72).addBox(-8.0F, -38.5F, -10.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		shell.texOffs(104, 68).addBox(-8.0F, -38.0F, -9.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		shell.texOffs(63, 8).addBox(-9.0F, -39.5F, 9.5F, 18.0F, 3.0F, 1.0F, -0.01F, false);
		shell.texOffs(74, 113).addBox(-10.0F, -38.5F, -10.0F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		shell.texOffs(70, 113).addBox(9.0F, -38.5F, -10.0F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		shell.texOffs(66, 113).addBox(9.0F, -38.5F, 9.0F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		shell.texOffs(62, 113).addBox(-10.0F, -38.5F, 9.0F, 1.0F, 37.0F, 1.0F, 0.0F, false);
		shell.texOffs(46, 113).addBox(8.0F, -39.5F, -10.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(26, 99).addBox(8.0F, -40.5F, -9.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		shell.texOffs(50, 113).addBox(9.0F, -39.5F, -9.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(38, 113).addBox(9.0F, -39.5F, 8.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(42, 113).addBox(8.0F, -39.5F, 9.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(22, 99).addBox(8.0F, -40.5F, 8.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		shell.texOffs(18, 99).addBox(-9.0F, -40.5F, 8.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		shell.texOffs(111, 0).addBox(-10.0F, -39.5F, 8.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(34, 113).addBox(-9.0F, -39.5F, 9.0F, 1.0F, 38.0F, 1.0F, 0.0F, false);
		shell.texOffs(68, 78).addBox(-8.0F, -35.0F, 8.0F, 16.0F, 34.0F, 1.0F, 0.0F, false);
		shell.texOffs(55, 60).addBox(-8.0F, -36.0F, -9.0F, 16.0F, 1.0F, 17.0F, 0.01F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-9.0196F, -18.0F, 0.0504F);
		shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 2.3562F, 0.0F);
		cube_r1.texOffs(78, 113).addBox(-0.5F, -17.5F, -0.5F, 1.0F, 35.0F, 1.0F, -0.3F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, -0.1F);
		shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -2.3562F, 0.0F);
		cube_r2.texOffs(78, 113).addBox(5.9129F, -35.5F, -6.9842F, 1.0F, 35.0F, 1.0F, -0.3F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-0.1F, 0.0F, 0.0F);
		shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.texOffs(78, 113).addBox(5.9129F, -35.5F, -6.9842F, 1.0F, 35.0F, 1.0F, -0.3F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		shell.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
		cube_r4.texOffs(0, 64).addBox(-8.0F, -35.0F, 8.0F, 16.0F, 34.0F, 1.0F, 0.0F, false);
		cube_r4.texOffs(0, 8).addBox(-1.5F, -43.0F, -1.5F, 3.0F, 1.0F, 3.0F, -0.01F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		shell.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.texOffs(34, 78).addBox(-8.0F, -35.0F, 8.0F, 16.0F, 34.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 0.0F, 0.5F);
		shell.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
		cube_r6.texOffs(63, 4).addBox(-8.5F, -39.5F, -10.5F, 18.0F, 3.0F, 1.0F, -0.01F, false);
		cube_r6.texOffs(63, 0).addBox(-8.5F, -39.5F, 9.5F, 18.0F, 3.0F, 1.0F, -0.01F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, 0.0F, 0.0F);
		shell.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
		cube_r7.texOffs(34, 72).addBox(-8.0F, -38.5F, -10.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r7.texOffs(34, 68).addBox(-8.0F, -38.0F, -9.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, 0.0F, 0.0F);
		shell.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
		cube_r8.texOffs(34, 64).addBox(-8.0F, -38.5F, -10.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r8.texOffs(63, 16).addBox(-8.0F, -38.0F, -9.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, 0.0F, 0.0F);
		shell.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
		cube_r9.texOffs(104, 64).addBox(-8.0F, -38.5F, -10.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r9.texOffs(104, 60).addBox(-8.0F, -38.0F, -9.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, -47.1F, 0.0F);
		shell.addChild(cube_r10);
		setRotationAngle(cube_r10, 1.1098F, -0.4622F, 2.4799F);
		cube_r10.texOffs(4, 12).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.1F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, -45.5F, 0.0F);
		shell.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.7854F, 0.0F);
		cube_r11.texOffs(0, 4).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, -0.01F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, -42.5F, 0.0F);
		shell.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
		cube_r12.texOffs(9, 1).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		door = new ModelRenderer(this);
		door.setPos(8.0F, 6.0F, -8.5F);
		

		rightdoor = new ModelRenderer(this);
		rightdoor.setPos(0.0F, 0.0F, 0.0F);
		door.addChild(rightdoor);
		rightdoor.texOffs(0, 99).addBox(-8.0F, -17.0F, -0.5F, 8.0F, 34.0F, 1.0F, 0.0F, false);
		rightdoor.texOffs(10, 10).addBox(-7.55F, -5.5F, -1.0F, 1.0F, 3.0F, 2.0F, -0.2F, false);

		leftdoor = new ModelRenderer(this);
		leftdoor.setPos(-16.0F, 0.0F, 0.0F);
		door.addChild(leftdoor);
		leftdoor.texOffs(102, 78).addBox(0.0F, -17.0F, -0.5F, 8.0F, 34.0F, 1.0F, 0.0F, false);
		leftdoor.texOffs(0, 12).addBox(6.55F, -5.5F, -1.0F, 1.0F, 3.0F, 2.0F, -0.2F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(7.9782F, -4.0F, -0.4995F);
		leftdoor.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.829F, 0.0F);
		cube_r13.texOffs(78, 113).addBox(-0.5F, -13.5F, -0.5F, 1.0F, 35.0F, 1.0F, -0.3F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.5F, 0.0F);
		BOTI.texOffs(119, 112).addBox(-8.0F, -35.5F, -8.0F, 16.0F, 34.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		door.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BOTI.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		matrixStack.translate(0.0D, 0.15D, 0.0D);
		matrixStack.scale(0.9F, 0.9F, 0.9F);
		switch (state) {
			case ONE:
				this.rightdoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.leftdoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.rightdoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.leftdoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.rightdoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				this.leftdoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
		}
		shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(0.5,0.35,-0.54);
		leftdoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		rightdoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}


	public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer,
						   int packedLight, int packedOverlay, float alpha) {
		if(exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
			PortalInfo info = new PortalInfo();
			info.setPosition(exterior.getBlockPos());
			info.setWorldShell(exterior.getBotiWorld());

			info.setTranslate(matrix -> {
				matrix.translate(-0.5, 0.76, -0.5);
				ExteriorRenderer.applyTransforms(matrix, exterior);
			});
			//Interior Portal Position
			info.setTranslatePortal(matrix -> {
				matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
				matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
				matrix.translate(-0.5, -1.2, -0.5);
			});
			//Exterior Portal Location
			info.setRenderPortal((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(1f, 1f, 1f);
				matrix.translate(0, -0.1,0);
				this.BOTI.render(matrix, buf.getBuffer(RenderType.entityCutout(OlwarriorRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});
			//Interior Doors Location
			info.setRenderDoor((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(0.9F, 0.9F, 0.9F);
				matrix.translate(0,-0.1,0);
				this.door.render(matrix, buf.getBuffer(RenderType.entityCutout(OlwarriorRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});

			BOTIRenderer.addPortal(info);
		}
	}
}