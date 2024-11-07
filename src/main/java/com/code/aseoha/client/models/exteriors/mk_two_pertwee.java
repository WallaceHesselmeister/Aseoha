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

public class mk_two_pertwee extends ExteriorModel {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;

	public mk_two_pertwee() {
		texWidth = 256;
		texHeight = 256;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);
		bone.texOffs(0, 0).addBox(-14.0F, -2.0F, -14.0F, 28.0F, 2.0F, 28.0F, 0.0F, false);
		bone.texOffs(72, 30).addBox(-9.0F, -44.0F, -12.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(84, 7).addBox(-11.0F, -48.0F, -14.0F, 22.0F, 4.0F, 3.0F, 0.0F, false);
		bone.texOffs(84, 0).addBox(-11.0F, -48.0F, 11.0F, 22.0F, 4.0F, 3.0F, 0.0F, false);
		bone.texOffs(76, 35).addBox(-14.0F, -48.0F, -11.0F, 3.0F, 4.0F, 22.0F, 0.0F, false);
		bone.texOffs(76, 35).addBox(11.0F, -48.0F, -11.0F, 3.0F, 4.0F, 22.0F, 0.0F, true);
		bone.texOffs(0, 30).addBox(-12.0F, -51.0F, -12.0F, 24.0F, 3.0F, 24.0F, 0.0F, false);
		bone.texOffs(76, 61).addBox(-13.0F, -49.0F, -13.0F, 4.0F, 47.0F, 4.0F, 0.0F, false);
		bone.texOffs(76, 61).addBox(-13.0F, -49.0F, 9.0F, 4.0F, 47.0F, 4.0F, 0.0F, false);
		bone.texOffs(76, 61).addBox(9.0F, -49.0F, 9.0F, 4.0F, 47.0F, 4.0F, 0.0F, false);
		bone.texOffs(76, 61).addBox(9.0F, -49.0F, -13.0F, 4.0F, 47.0F, 4.0F, 0.0F, false);
		bone.texOffs(0, 3).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.texOffs(0, 57).addBox(-12.0F, -44.0F, -9.0F, 1.0F, 42.0F, 18.0F, 0.0F, false);
		bone.texOffs(0, 57).addBox(11.0F, -44.0F, -9.0F, 1.0F, 42.0F, 18.0F, 0.0F, true);
		bone.texOffs(0, 7).addBox(-3.0F, -52.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		bone.texOffs(0, 0).addBox(-3.0F, -57.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		bone.texOffs(9, 14).addBox(-1.0F, -58.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone.texOffs(0, 41).addBox(-2.0F, -56.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		bone.texOffs(38, 57).addBox(-9.0F, -44.0F, 11.0F, 18.0F, 42.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -54.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(0, 14).addBox(-0.5F, -2.0F, -3.5F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -54.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(0, 30).addBox(-0.5F, -2.0F, -3.5F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(9.0F, -22.5F, -11.0F);
		bone.addChild(RightDoor);
		RightDoor.texOffs(92, 61).addBox(-9.0F, -20.5F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 0).addBox(-9.0F, -6.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-9.0F, -22.5F, -11.0F);
		bone.addChild(LeftDoor);
		LeftDoor.texOffs(38, 100).addBox(0.0F, -20.5F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);
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