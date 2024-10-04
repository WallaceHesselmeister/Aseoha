package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.2
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

public class AlfieHudolinExterior extends ExteriorModel {
	private final ModelRenderer TARDIS;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer pto_handle_r1;
	private final ModelRenderer door_divider_r1;
	private final ModelRenderer left_door_r1;
	private final ModelRenderer RightDoor;
	private final ModelRenderer lock_r1;
	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer BOTI;

	public AlfieHudolinExterior() {
		texWidth = 512;
		texHeight = 512;

		TARDIS = new ModelRenderer(this);
		TARDIS.setPos(-5.0F, 22.0F, 0.0F);
		

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-11.5F, -48.0F, -19.25F);
		TARDIS.addChild(LeftDoor);
		

		pto_handle_r1 = new ModelRenderer(this);
		pto_handle_r1.setPos(29.34F, 39.42F, 14.09F);
		LeftDoor.addChild(pto_handle_r1);
		setRotationAngle(pto_handle_r1, 0.0F, 1.5708F, 0.0F);
		pto_handle_r1.texOffs(276, 354).addBox(14.7F, -35.38F, -27.135F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		door_divider_r1 = new ModelRenderer(this);
		door_divider_r1.setPos(16.46F, 38.96F, 13.17F);
		LeftDoor.addChild(door_divider_r1);
		setRotationAngle(door_divider_r1, 0.0F, 1.5708F, 0.0F);
		door_divider_r1.texOffs(204, 307).addBox(13.555F, -58.42F, -0.61F, 1.0F, 66.0F, 1.0F, 0.0F, false);

		left_door_r1 = new ModelRenderer(this);
		left_door_r1.setPos(16.46F, 38.96F, 14.09F);
		LeftDoor.addChild(left_door_r1);
		setRotationAngle(left_door_r1, 0.0F, 1.5708F, 0.0F);
		left_door_r1.texOffs(265, 239).addBox(14.18F, -58.645F, -17.23F, 1.0F, 66.0F, 17.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(21.5F, -48.0F, -19.2F);
		TARDIS.addChild(RightDoor);
		

		lock_r1 = new ModelRenderer(this);
		lock_r1.setPos(-3.66F, 38.96F, 14.04F);
		RightDoor.addChild(lock_r1);
		setRotationAngle(lock_r1, 0.0F, 1.5708F, 0.0F);
		lock_r1.texOffs(-1, 20).addBox(14.318F, -36.645F, -12.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lock_r1.texOffs(0, 0).addBox(15.1F, -33.66F, -12.25F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		lock_r1.texOffs(73, 213).addBox(14.18F, -58.72F, -12.88F, 1.0F, 66.0F, 17.0F, 0.0F, false);

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 24.0F, 0.0F);
		Shell.texOffs(194, 307).addBox(-20.55F, -69.21F, -0.335F, 1.0F, 66.0F, 1.0F, 0.0F, false);
		Shell.texOffs(190, 202).addBox(-20.28F, -71.76F, -17.73F, 1.0F, 69.0F, 35.0F, 0.0F, false);
		Shell.texOffs(109, 209).addBox(19.87F, -69.16F, -0.235F, 1.0F, 66.0F, 1.0F, 0.0F, false);
		Shell.texOffs(117, 202).addBox(19.7F, -71.76F, -16.88F, 1.0F, 69.0F, 35.0F, 0.0F, false);
		Shell.texOffs(362, 172).addBox(-21.58F, -81.7F, -21.62F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Shell.texOffs(346, 149).addBox(18.48F, -81.7F, -21.62F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Shell.texOffs(354, 118).addBox(18.455F, -81.7F, 18.79F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Shell.texOffs(368, 150).addBox(-21.53F, -81.7F, 18.665F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Shell.texOffs(302, 45).addBox(-22.52F, -79.76F, 17.405F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Shell.texOffs(73, 297).addBox(17.46F, -79.76F, 17.405F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Shell.texOffs(301, 234).addBox(17.46F, -79.76F, -22.6F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Shell.texOffs(99, 302).addBox(-22.52F, -79.76F, -22.6F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Shell.texOffs(0, 111).addBox(-19.47F, -78.43F, -24.92F, 39.0F, 6.0F, 50.0F, 0.0F, false);
		Shell.texOffs(168, 308).addBox(-17.88F, -71.76F, 18.09F, 1.0F, 68.0F, 3.0F, 0.0F, false);
		Shell.texOffs(123, 308).addBox(16.87F, -71.76F, 18.09F, 1.0F, 68.0F, 3.0F, 0.0F, false);
		Shell.texOffs(186, 308).addBox(-17.63F, -71.76F, -20.71F, 1.0F, 68.0F, 3.0F, 0.0F, false);
		Shell.texOffs(177, 308).addBox(16.62F, -71.76F, -20.71F, 1.0F, 68.0F, 3.0F, 0.0F, false);
		Shell.texOffs(130, 54).addBox(-20.63F, -71.46F, -21.185F, 42.0F, 2.0F, 42.0F, -0.1F, false);
		Shell.texOffs(148, 0).addBox(-21.155F, -72.06F, -21.76F, 43.0F, 1.0F, 43.0F, 0.0F, false);
		Shell.texOffs(129, 111).addBox(-21.13F, -72.86F, -21.835F, 43.0F, 1.0F, 43.0F, 0.1F, false);
		Shell.texOffs(0, 52).addBox(0.0276F, -93.4888F, -3.4528F, 0.0F, 7.0F, 7.0F, 0.0F, false);
		Shell.texOffs(30, 8).addBox(-1.996F, -93.0072F, -1.9764F, 4.0F, 1.0F, 4.0F, 0.1F, false);
		Shell.texOffs(30, 8).addBox(-1.996F, -88.0072F, -1.9764F, 4.0F, 1.0F, 4.0F, 0.1F, false);
		Shell.texOffs(10, 76).addBox(-2.496F, -93.7572F, -2.4764F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.texOffs(10, 76).addBox(-2.496F, -87.2572F, -2.4764F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.texOffs(0, 12).addBox(-3.6328F, -94.4958F, -3.3396F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(-3.9762F, -86.5492F, -3.9712F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		Shell.texOffs(18, 28).addBox(-1.9993F, -93.002F, -1.9731F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		Shell.texOffs(2, 169).addBox(-18.455F, -85.07F, -18.485F, 37.0F, 3.0F, 37.0F, 0.0F, false);
		Shell.texOffs(138, 156).addBox(-20.44F, -83.12F, -20.5F, 41.0F, 5.0F, 41.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(-24.485F, -4.0F, -24.455F, 49.0F, 4.0F, 49.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0276F, -0.8224F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(20, 12).addBox(0.0F, -92.7164F, -4.4528F, 0.0F, 7.0F, 9.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0276F, -0.8224F, 0.0F);
		Shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(20, 12).addBox(0.0F, -92.7164F, -4.4528F, 0.0F, 7.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0276F, -0.7724F, 0.0F);
		Shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.texOffs(0, 52).addBox(0.0F, -92.7164F, -3.4528F, 0.0F, 7.0F, 7.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-0.04F, -11.96F, 0.3F);
		Shell.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
		cube_r4.texOffs(132, 308).addBox(-17.84F, -59.8F, -20.81F, 1.0F, 68.0F, 3.0F, 0.0F, false);
		cube_r4.texOffs(150, 308).addBox(-17.84F, -59.8F, 18.14F, 1.0F, 68.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-0.04F, -11.96F, 0.0F);
		Shell.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.texOffs(141, 308).addBox(16.91F, -59.8F, -20.81F, 1.0F, 68.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-0.04F, -11.96F, -0.05F);
		Shell.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
		cube_r6.texOffs(303, 128).addBox(16.91F, -59.8F, 18.14F, 1.0F, 68.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-0.04F, -45.75F, 0.3F);
		Shell.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, -1.5708F, 0.0F);
		cube_r7.texOffs(0, 111).addBox(-19.905F, -32.68F, -25.095F, 39.0F, 6.0F, 50.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-0.04F, -11.04F, 0.3F);
		Shell.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
		cube_r8.texOffs(-1, 209).addBox(-20.04F, -60.72F, -17.905F, 1.0F, 69.0F, 35.0F, 0.0F, false);
		cube_r8.texOffs(199, 307).addBox(-20.235F, -58.12F, -0.485F, 1.0F, 66.0F, 1.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(440, 0).addBox(-17.0F, -70.0F, -18.0F, 34.0F, 66.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		TARDIS.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		matrixStack.translate(0.0D, 0.75D, 0.0D);
		matrixStack.scale(0.5F, 0.5F, 0.5F);
		switch (state) {
			case ONE:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(EnumDoorState.CLOSED));
		}
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(-0.3,1.4,0);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}
}