package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.WardrobeRender;
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

public class WardrobeExterior extends ExteriorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer Clothes;
	private final ModelRenderer BOTI;
	private final ModelRenderer Doors;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;

	public WardrobeExterior() {
		texWidth = 160;
		texHeight = 160;

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 24.0F, 0.0F);
		Shell.texOffs(0, 6).addBox(13.0F, -2.0F, 8.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Shell.texOffs(0, 28).addBox(-17.0F, -5.0F, -12.0F, 34.0F, 3.0F, 24.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(-17.0F, -47.0F, -12.0F, 34.0F, 3.0F, 24.0F, 0.0F, false);
		Shell.texOffs(93, 0).addBox(-12.0F, -44.0F, -10.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		Shell.texOffs(10, 9).addBox(13.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Shell.texOffs(97, 112).addBox(12.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.texOffs(84, 112).addBox(-15.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.texOffs(58, 112).addBox(-15.0F, -44.0F, 8.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.texOffs(71, 112).addBox(12.0F, -44.0F, 8.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.texOffs(10, 3).addBox(-16.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(-16.0F, -2.0F, 8.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Shell.texOffs(90, 56).addBox(12.0F, -44.0F, -8.0F, 2.0F, 39.0F, 16.0F, 0.0F, false);
		Shell.texOffs(53, 56).addBox(-14.0F, -44.0F, -8.0F, 2.0F, 39.0F, 16.0F, 0.0F, false);
		Shell.texOffs(0, 56).addBox(-12.0F, -44.0F, 8.0F, 24.0F, 39.0F, 2.0F, 0.0F, false);

		Clothes = new ModelRenderer(this);
		Clothes.setPos(0.0F, 24.0F, 0.0F);
		Clothes.texOffs(0, 156).addBox(-12.0F, -41.0F, -1.0F, 24.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(-10.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(-8.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(-6.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(-4.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(-2.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(0.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(2.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(4.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(6.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(8.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(0, 156).addBox(10.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(-8.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(-10.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(-4.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(109, 117).addBox(-6.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(109, 117).addBox(0.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(-2.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(4.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(2.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(4.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(2.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(6.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(109, 111).addBox(10.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(8.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(-10.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(-8.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(109, 117).addBox(-6.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(-4.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(-2.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(109, 117).addBox(0.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(2.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(4.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(0, 138).addBox(6.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(15, 138).addBox(8.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);
		Clothes.texOffs(109, 111).addBox(10.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 2.0F);
		BOTI.texOffs(92, 3).addBox(2.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-12.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(2.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-2.0F, -42.0F, -11.0F, 4.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-2.0F, -24.0F, -11.0F, 4.0F, 19.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-12.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);

		Doors = new ModelRenderer(this);
		Doors.setPos(0.0F, 24.0F, 0.0F);
		

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(12.0F, -24.25F, -10.0F);
		Doors.addChild(RightDoor);
		RightDoor.texOffs(0, 98).addBox(-12.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, 0.0F, false);
		RightDoor.texOffs(7, 15).addBox(-12.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-12.0F, -24.25F, -10.0F);
		Doors.addChild(LeftDoor);
		LeftDoor.texOffs(0, 12).addBox(11.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		LeftDoor.texOffs(29, 112).addBox(0.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Clothes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BOTI.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Doors.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
		}
		//LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		//RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		Clothes.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		Doors.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}

	public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer,
						   int packedLight, int packedOverlay, float alpha) {
		if (exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
			PortalInfo info = new PortalInfo();
			info.setPosition(exterior.getBlockPos());
			info.setWorldShell(exterior.getBotiWorld());

			info.setTranslate(matrix -> {
				matrix.translate(-0.5, 0.7, -0.5);
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
				matrix.scale(0.8f, 0.8f, 0.8f);
				this.BOTI.render(matrix, buf.getBuffer(RenderType.entityCutout(WardrobeRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});
			//Interior Doors Location
			/**info.setRenderDoor((matrix, buf) -> {
			 matrix.push();
			 matrix.scale(0.8F, 0.8F, 0.8F);
			 this.Doors.render(matrix, buf.getBuffer(RenderType.getEntityCutout(WardrobeRender.TEXTURE)), packedLight, packedOverlay);
			 matrix.pop();
			 });**/

			BOTIRenderer.addPortal(info);
		}
	}
}