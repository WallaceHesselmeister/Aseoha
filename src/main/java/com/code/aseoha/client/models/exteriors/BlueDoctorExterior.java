package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.BlueDoctorRender;
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

public class BlueDoctorExterior extends ExteriorModel {
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
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer doors;
	private final ModelRenderer rightdoor;
	private final ModelRenderer cube_r15;
	private final ModelRenderer leftdoor;
	private final ModelRenderer cube_r16;
	private final ModelRenderer BOTI;

	public BlueDoctorExterior() {
		texWidth = 192;
		texHeight = 192;

		shell = new ModelRenderer(this);
		shell.setPos(0.0F, 23.0F, 0.0F);
		shell.texOffs(0, 0).addBox(-12.0F, -1.0F, -12.0F, 24.0F, 2.0F, 24.0F, 0.0F, false);
		shell.texOffs(0, 50).addBox(-9.0F, -43.0F, -11.0F, 18.0F, 4.0F, 22.0F, 0.0F, false);
		shell.texOffs(138, 88).addBox(-9.0F, -42.5F, -11.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		shell.texOffs(136, 135).addBox(-9.0F, -42.5F, 10.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		shell.texOffs(58, 50).addBox(-11.0F, -43.0F, -9.0F, 22.0F, 4.0F, 18.0F, 0.0F, false);
		shell.texOffs(0, 130).addBox(-10.25F, -39.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		shell.texOffs(69, 26).addBox(-9.0F, -44.5F, -9.0F, 18.0F, 2.0F, 18.0F, 0.01F, false);
		shell.texOffs(72, 0).addBox(-8.5F, -45.5F, -8.5F, 17.0F, 2.0F, 17.0F, 0.01F, false);
		shell.texOffs(0, 0).addBox(-1.5F, -49.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		shell.texOffs(0, 6).addBox(-1.0F, -46.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		shell.texOffs(8, 2).addBox(-1.0F, -49.5F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		shell.texOffs(0, 12).addBox(-1.5F, -49.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.02F, false);
		shell.texOffs(0, 26).addBox(-11.5F, -2.0F, -11.5F, 23.0F, 1.0F, 23.0F, 0.0F, false);
		shell.texOffs(120, 146).addBox(-11.0F, -44.0F, -11.0F, 2.0F, 42.0F, 2.0F, 0.0F, false);
		shell.texOffs(100, 72).addBox(-10.0F, -38.0F, -9.0F, 1.0F, 36.0F, 18.0F, 0.0F, false);
		shell.texOffs(0, 76).addBox(9.0F, -38.0F, -9.0F, 1.0F, 36.0F, 18.0F, 0.0F, false);
		shell.texOffs(112, 146).addBox(9.0F, -44.0F, -11.0F, 2.0F, 42.0F, 2.0F, 0.0F, false);
		shell.texOffs(96, 145).addBox(9.0F, -44.0F, 9.0F, 2.0F, 42.0F, 2.0F, 0.0F, false);
		shell.texOffs(104, 145).addBox(-11.0F, -44.0F, 9.0F, 2.0F, 42.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, -1.0F);
		shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.texOffs(62, 72).addBox(10.0F, -38.0F, -9.0F, 1.0F, 36.0F, 18.0F, 0.0F, false);
		cube_r1.texOffs(116, 127).addBox(-9.75F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		cube_r1.texOffs(96, 126).addBox(-9.25F, -39.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -49.7F, 0.0F);
		shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.texOffs(0, 16).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -49.0F, 0.0F);
		shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.texOffs(0, 6).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-0.5F, -45.5F, 0.5F);
		shell.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.texOffs(12, 12).addBox(-2.0F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, 0.02F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -45.5F, 0.0F);
		shell.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -1.5708F, 0.0F);
		cube_r5.texOffs(8, 7).addBox(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(11.7606F, -42.426F, 0.0F);
		shell.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, -1.5708F, 0.48F);
		cube_r6.texOffs(72, 19).addBox(-9.0F, -0.158F, 0.9397F, 18.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-10.8736F, -42.8877F, 0.0F);
		shell.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 1.5708F, -0.48F);
		cube_r7.texOffs(92, 46).addBox(-9.0F, -0.158F, -0.0603F, 18.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, -42.8877F, 10.8736F);
		shell.addChild(cube_r8);
		setRotationAngle(cube_r8, -2.6616F, 0.0F, -3.1416F);
		cube_r8.texOffs(120, 84).addBox(-9.0F, -0.158F, -0.0603F, 18.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, -42.8722F, -10.8893F);
		shell.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.48F, 0.0F, 0.0F);
		cube_r9.texOffs(123, 39).addBox(-9.0F, -0.158F, -0.0603F, 18.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(-1.0F, 0.0F, 0.0F);
		shell.addChild(cube_r10);
		cube_r10.texOffs(120, 46).addBox(-9.75F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, 0.0F, 1.0F);
		shell.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 1.5708F, 0.0F);
		cube_r11.texOffs(120, 108).addBox(-9.75F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		cube_r11.texOffs(120, 65).addBox(-9.25F, -39.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(1.0F, 0.0F, 0.0F);
		shell.addChild(cube_r12);
		setRotationAngle(cube_r12, -3.1416F, 0.0F, 3.1416F);
		cube_r12.texOffs(123, 20).addBox(-9.75F, -39.5F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);
		cube_r12.texOffs(122, 1).addBox(-9.25F, -39.0F, -9.0F, 1.0F, 1.0F, 18.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(11.0F, -41.0F, 0.0F);
		shell.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -1.5708F, 0.0F);
		cube_r13.texOffs(136, 127).addBox(-9.0F, -1.5F, -0.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(-11.0F, -41.0F, 0.0F);
		shell.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -1.5708F, 0.0F);
		cube_r14.texOffs(136, 131).addBox(-9.0F, -1.5F, -0.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);

		doors = new ModelRenderer(this);
		doors.setPos(0.0F, 24.0F, 0.0F);
		

		rightdoor = new ModelRenderer(this);
		rightdoor.setPos(9.0F, -20.0F, -9.0F);
		doors.addChild(rightdoor);
		rightdoor.texOffs(16, 0).addBox(-8.75F, -8.0F, -1.5F, 1.0F, 3.0F, 1.0F, -0.2F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-10.0F, 19.0F, -11.0F);
		rightdoor.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -1.5708F, 0.0F);
		cube_r15.texOffs(76, 126).addBox(10.0F, -38.0F, -10.0F, 1.0F, 36.0F, 9.0F, 0.0F, false);

		leftdoor = new ModelRenderer(this);
		leftdoor.setPos(-9.0F, -20.0F, -9.0F);
		doors.addChild(leftdoor);
		leftdoor.texOffs(0, 6).addBox(6.75F, -7.0F, -1.5F, 1.0F, 3.0F, 1.0F, -0.2F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.0F, 19.0F, -11.0F);
		leftdoor.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -1.5708F, 0.0F);
		cube_r16.texOffs(38, 76).addBox(10.0F, -38.0F, -9.0F, 1.0F, 36.0F, 9.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(38, 126).addBox(-9.0F, -39.0F, -9.0F, 18.0F, 36.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		doors.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		matrixStack.translate(0,1.5,0);
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
				matrix.translate(-0.5, -1.1, -0.5);
			});
			//Exterior Portal Location
			info.setRenderPortal((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(0.9f, 1f, 0.9f);
				matrix.translate(0, -0.1,0);
				this.BOTI.render(matrix, buf.getBuffer(RenderType.entityCutout(BlueDoctorRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});
			//Interior Doors Location
			info.setRenderDoor((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(0.9F, 0.9F, 0.9F);
				matrix.translate(0,-0.1,0);
				this.doors.render(matrix, buf.getBuffer(RenderType.entityCutout(BlueDoctorRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});

			BOTIRenderer.addPortal(info);
		}
	}
}