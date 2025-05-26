package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class mk_two_capaldi extends ExteriorModel {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;

	public mk_two_capaldi() {
		texWidth = 256;
		texHeight = 256;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		bone.texOffs(0, 0).addBox(-15.0F, -3.0F, -15.0F, 30.0F, 3.0F, 30.0F, 0.0F, false);
		bone.texOffs(74, 125).addBox(-14.0F, -49.0F, -14.0F, 4.0F, 46.0F, 4.0F, 0.0F, false);
		bone.texOffs(58, 125).addBox(-14.0F, -49.0F, 10.0F, 4.0F, 46.0F, 4.0F, 0.0F, false);
		bone.texOffs(110, 106).addBox(10.0F, -49.0F, 10.0F, 4.0F, 46.0F, 4.0F, 0.0F, false);
		bone.texOffs(42, 85).addBox(10.0F, -49.0F, -14.0F, 4.0F, 46.0F, 4.0F, 0.0F, false);
		bone.texOffs(42, 135).addBox(-10.0F, -43.0F, -13.0F, 1.0F, 40.0F, 1.0F, 0.0F, false);
		bone.texOffs(0, 85).addBox(-13.0F, -43.0F, -10.0F, 1.0F, 40.0F, 20.0F, 0.0F, false);
		bone.texOffs(110, 65).addBox(-10.0F, -43.0F, 12.0F, 20.0F, 40.0F, 1.0F, 0.0F, false);
		bone.texOffs(68, 65).addBox(12.0F, -43.0F, -10.0F, 1.0F, 40.0F, 20.0F, 0.0F, false);
		bone.texOffs(58, 85).addBox(9.0F, -43.0F, -13.0F, 1.0F, 40.0F, 1.0F, 0.0F, false);
		bone.texOffs(90, 28).addBox(-9.0F, -43.0F, -13.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(104, 41).addBox(-12.0F, -47.0F, -15.0F, 24.0F, 4.0F, 4.0F, 0.0F, false);
		bone.texOffs(90, 0).addBox(-15.0F, -47.0F, -12.0F, 4.0F, 4.0F, 24.0F, 0.0F, false);
		bone.texOffs(104, 33).addBox(-12.0F, -47.0F, 11.0F, 24.0F, 4.0F, 4.0F, 0.0F, false);
		bone.texOffs(72, 37).addBox(11.0F, -47.0F, -12.0F, 4.0F, 4.0F, 24.0F, 0.0F, false);
		bone.texOffs(18, 0).addBox(-1.5F, -57.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.15F, false);
		bone.texOffs(0, 33).addBox(-12.0F, -51.0F, -12.0F, 24.0F, 4.0F, 24.0F, 0.0F, false);
		bone.texOffs(0, 61).addBox(-11.0F, -53.0F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);
		bone.texOffs(0, 7).addBox(-3.0F, -54.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		bone.texOffs(0, 0).addBox(-3.0F, -59.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		bone.texOffs(7, 14).addBox(-1.0F, -60.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.texOffs(0, 23).addBox(-1.5F, -58.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(0, 14).addBox(-0.5F, -58.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(12, 14).addBox(-0.5F, -58.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(9.0F, -22.5F, -12.0F);
		bone.addChild(RightDoor);
		RightDoor.texOffs(90, 125).addBox(-9.0F, -19.5F, -1.0F, 9.0F, 39.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(74, 125).addBox(-9.0F, -5.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-9.0F, -22.5F, -12.0F);
		bone.addChild(LeftDoor);
		LeftDoor.texOffs(126, 106).addBox(0.0F, -19.5F, -1.0F, 9.0F, 39.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(86, 126).addBox(7.0F, -5.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.pushPose();
		EnumDoorState state = exterior.getOpen();
//		matrixStack.translate(0.0D, 0.3D, 0.0D);
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
//		LeftDoor.y = 2.25F;
//		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(0,2.25,0);
//		LeftDoor.y = (float) -18.85;
//		RightDoor.y = (float) -18.85;
		bone.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//		BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}