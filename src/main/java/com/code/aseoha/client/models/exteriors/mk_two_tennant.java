package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class mk_two_tennant extends ExteriorModel {
	private final ModelRenderer RightDoor;
	private final ModelRenderer bone;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer bone2;
	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public mk_two_tennant() {
		texWidth = 256;
		texHeight = 256;

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(9.0F, -0.25F, -11.0F);
		RightDoor.texOffs(110, 64).addBox(-9.0F, -17.75F, -1.0F, 9.0F, 39.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(106, 64).addBox(-9.0F, -3.25F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(107, 65).addBox(-9.0F, -3.25F, -2.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);
		RightDoor.texOffs(106, 64).addBox(-9.0F, -0.25F, -2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(-8.5F, -3.25F, -1.5F);
		RightDoor.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -3.1416F);
		bone.texOffs(106, 64).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-9.0F, -0.5F, -11.0F);
		LeftDoor.texOffs(107, 65).addBox(7.0F, -3.0F, -2.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		LeftDoor.texOffs(106, 64).addBox(7.0F, -1.0F, -2.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 104).addBox(0.0F, -17.5F, -1.0F, 9.0F, 39.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(106, 64).addBox(7.0F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(7.5F, -3.0F, -1.5F);
		LeftDoor.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -3.1416F);
		bone2.texOffs(106, 64).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, -31.5F, 0.0F);
		Shell.texOffs(4, 2).addBox(-14.0F, 52.5F, -14.0F, 28.0F, 3.0F, 28.0F, 0.0F, false);
		Shell.texOffs(54, 84).addBox(-13.0F, 7.5F, -13.0F, 3.0F, 45.0F, 3.0F, 0.0F, false);
		Shell.texOffs(68, 64).addBox(-12.0F, 12.5F, -10.0F, 1.0F, 40.0F, 20.0F, 0.0F, false);
		Shell.texOffs(0, 125).addBox(11.0F, 12.5F, -10.0F, 1.0F, 40.0F, 20.0F, 0.0F, false);
		Shell.texOffs(0, 84).addBox(-10.0F, 12.5F, 11.0F, 20.0F, 40.0F, 1.0F, 0.0F, false);
		Shell.texOffs(42, 84).addBox(10.0F, 7.5F, -13.0F, 3.0F, 45.0F, 3.0F, 0.0F, false);
		Shell.texOffs(42, 84).addBox(-13.0F, 7.5F, 10.0F, 3.0F, 45.0F, 3.0F, 0.0F, false);
		Shell.texOffs(54, 84).addBox(10.0F, 7.5F, 10.0F, 3.0F, 45.0F, 3.0F, 0.0F, false);
		Shell.texOffs(70, 124).addBox(-10.0F, 13.5F, -12.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		Shell.texOffs(66, 124).addBox(9.0F, 13.5F, -12.0F, 1.0F, 39.0F, 1.0F, 0.0F, false);
		Shell.texOffs(90, 28).addBox(-10.0F, 12.5F, -12.0F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(100, 39).addBox(-12.0F, 8.5F, -14.0F, 24.0F, 4.0F, 2.0F, 0.0F, false);
		Shell.texOffs(100, 33).addBox(-12.0F, 8.5F, 12.0F, 24.0F, 4.0F, 2.0F, 0.0F, false);
		Shell.texOffs(90, 0).addBox(-14.0F, 8.5F, -12.0F, 2.0F, 4.0F, 24.0F, 0.0F, false);
		Shell.texOffs(72, 36).addBox(12.0F, 8.5F, -12.0F, 2.0F, 4.0F, 24.0F, 0.0F, false);
		Shell.texOffs(0, 33).addBox(-12.0F, 5.5F, -12.0F, 24.0F, 3.0F, 24.0F, 0.0F, false);
		Shell.texOffs(0, 60).addBox(-11.0F, 3.5F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(-3.0F, 2.5F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Shell.texOffs(0, 22).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		Shell.texOffs(18, 0).addBox(-1.5F, 0.75F, -1.5F, 3.0F, 1.0F, 3.0F, 0.15F, false);
		Shell.texOffs(15, 7).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.15F, false);
		Shell.texOffs(0, 7).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.texOffs(12, 22).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(12, 13).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r2);
		setRotationAngle(cube_r2, -3.1416F, 0.7854F, 3.1416F);
		cube_r2.texOffs(0, 13).addBox(-0.5F, -1.5F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
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