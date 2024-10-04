package com.code.aseoha.client.models.interiordoors;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.models.exteriors.CoralExterior;
import com.code.aseoha.client.renderers.exteriors.CoralRenderer;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.models.interiordoors.AbstractInteriorDoorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.entity.DoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.misc.IDoorType;

public class CoralInteriorDoor extends AbstractInteriorDoorModel {
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer base;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer boti;

	public CoralInteriorDoor() {
		texWidth = 512;
		texHeight = 512;

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.9167F, -18.2308F, -22.0167F);
		LeftDoor.texOffs(86, 278).addBox(-0.0833F, -32.5692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(80, 278).addBox(14.9167F, -32.5692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(28, 6).addBox(13.9167F, -6.0692F, -0.4833F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(62, 278).addBox(15.9167F, -32.5692F, -0.9833F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 138).addBox(1.9167F, 39.4308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 122).addBox(1.9167F, 24.4308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 134).addBox(1.9167F, 21.4308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 106).addBox(1.9167F, 6.4308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 130).addBox(1.9167F, 3.4308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 87).addBox(1.9167F, -11.5692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 126).addBox(1.9167F, -14.5692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 122).addBox(1.9167F, -32.5692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 0).addBox(1.9167F, -29.5692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.9167F, -18.1667F, -22.0167F);
		RightDoor.texOffs(74, 278).addBox(-16.9167F, -32.6333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(68, 278).addBox(-1.9167F, -32.6333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 118).addBox(-14.9167F, 39.3667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 55).addBox(-14.9167F, 24.3667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 114).addBox(-14.9167F, 21.3667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 32).addBox(-14.9167F, 6.3667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 110).addBox(-14.9167F, 3.3667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.9167F, -11.6333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 106).addBox(-14.9167F, -14.6333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 48).addBox(-14.9167F, -32.6333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 0).addBox(-14.9167F, -29.6333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 0).addBox(-15.9167F, -5.1333F, -0.9833F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		base = new ModelRenderer(this);
		base.setPos(0.0F, 24.0F, 0.0F);
		base.texOffs(28, 41).addBox(19.0F, -86.8F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		base.texOffs(28, 41).addBox(-23.0F, -86.8F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		base.texOffs(268, 284).addBox(17.0F, -74.8F, -23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(264, 284).addBox(-18.0F, -74.8F, -23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(184, 161).addBox(-18.0F, -75.8F, -21.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		base.texOffs(232, 0).addBox(-21.0F, -81.8F, -23.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -84.8F, -20.0F);
		base.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.texOffs(40, 146).addBox(-22.0F, -3.0F, -0.1F, 44.0F, 6.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-21.0F, -41.3F, -21.0F);
		base.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.texOffs(48, 156).addBox(-3.0F, -41.5F, -3.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(21.0F, -41.3F, -21.0F);
		base.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.texOffs(72, 156).addBox(-3.0F, -41.5F, -3.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);

		boti = new ModelRenderer(this);
		boti.setPos(0.0F, 24.0F, 0.0F);
}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void renderBones(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
//		matrixStack.pushPose();
//		matrixStack.translate(0.0, -0.0, 0.0);
//		matrixStack.scale(1.1F, 1.1F, 1.1F);
//		matrixStack.mulPose(Vector3f.YP.rotationDegrees(90));
//		EnumDoorState state = door.getOpenState();
//		switch (state) {
//			case ONE:
//				this.RightDoor.yRot = (float) Math.toRadians(150.0);
//				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CORAL.getRotationForState(EnumDoorState.CLOSED));
//				break;
//			case BOTH:
//				this.RightDoor.yRot = (float) Math.toRadians(150.0);
//				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CORAL.getRotationForState(EnumDoorState.BOTH));
//				break;
//			case CLOSED:
//				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CORAL.getRotationForState(EnumDoorState.CLOSED));
//				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CORAL.getRotationForState(EnumDoorState.CLOSED));
//		}
//		this.base.render(matrixStack, buffer, packedLight, packedOverlay);
//		matrixStack.popPose();
		matrixStack.pushPose();
		EnumDoorState state = door.getOpenState();
		matrixStack.translate(0.0D, 0.9D, 0.0D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.RightDoor.yRot = (float) Math.toRadians(90.0);
				this.LeftDoor.yRot = (float) Math.toRadians(0.0);
				break;
			case BOTH:
				this.RightDoor.yRot = (float) Math.toRadians(90.0);
				this.LeftDoor.yRot = (float) Math.toRadians(-90.0);
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(0);
				this.LeftDoor.yRot = (float) Math.toRadians(0);
		}

		matrixStack.scale(.5F,.5F,.5F);
		base.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
        boti.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.translate(-0.3,-0.4,0);
		renderBoti(door, matrixStack, buffer, packedLight, packedOverlay);
//        doorsright.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//        doorsleft.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);

		matrixStack.popPose();
	}
@Override
	public void renderBoti(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		if (Minecraft.getInstance().level != null && door.getOpenState() != EnumDoorState.CLOSED) {
			Minecraft.getInstance().level.getCapability(Capabilities.TARDIS_DATA).ifPresent((data) -> {
				matrixStack.pushPose();
				PortalInfo info = new PortalInfo();
				info.setPosition(door.position());
				info.setWorldShell(data.getBotiWorld());
				info.setTranslate((matrix) -> {//INSIDE
					matrix.scale(0.95F, 1.0F, 1.0F);
					if(door.yRot>=-1F && door.yRot<=1F){ //NORTH
						matrix.translate(.1, -1.53, -.1);
					}
					if(door.yRot==90F){//EAST
						matrix.translate(0.05, -1.53, 0.1);
					}
					if(door.yRot<=179 && door.yRot<=-179){ //SOUTH
						matrix.translate(-0.1343, -1.53, .1);
					}
					if(door.yRot==-90){ //WEST
						matrix.translate(-0.0343, -1.53, -0.13);
					}

					DoorRenderer.applyTranslations(matrix, door.yRot - 90.0F, door.getDirection());
				});
				info.setTranslatePortal((matrix) -> {//OUTSIDE
					matrix.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
					matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(data.getBotiWorld().getPortalDirection())));
					matrix.mulPose(Vector3f.YP.rotationDegrees(-90));
					matrix.translate(-0.5, 0, -0.5);

				});
				info.setRenderPortal((matrix, impl) -> {
					matrix.pushPose();
//					matrix.push();
					if(door.yRot>=-1F && door.yRot<=1F){ //NORTH
						matrix.translate(-1.1, .06, 0);
					}
					if(door.yRot==90F){//EAST
						matrix.translate(-1.08, .06, -.01);
					}
					if(door.yRot<=179 && door.yRot<=-179){ //SOUTH
						matrix.translate(-1.1, .06, 0);
					}
					if(door.yRot==-90){ //WEST
						matrix.translate(-1.1, .06, .025);
					}
					else { //SOUTH
						//matrix.translate(-1.05, 1, 0);
					}
//					matrix.translate(-1.05, 0.0, 0);
					matrix.scale(1.1F, 1.1F, 1.1F);
					this.boti.render(matrix, impl.getBuffer(RenderType.entityCutout(this.getTexture())), packedLight, packedOverlay);
					matrix.popPose();
				});
				BOTIRenderer.addPortal(info);
				matrixStack.popPose();
			});
		}

	}

	public ResourceLocation getTexture(){return CoralRenderer.TEXTURE;}
}