package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class RaniExterior extends ExteriorModel {
	private final ModelRenderer Door;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Shell;
	private final ModelRenderer BOTI;

	public RaniExterior() {
		texWidth = 160;
		texHeight = 160;

		Door = new ModelRenderer(this);
		Door.setPos(7.0F, 3.0F, -9.0F);
		Door.texOffs(116, 56).addBox(-13.0F, 17.0F, 0.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Door.texOffs(112, 118).addBox(-14.0F, -18.0F, 0.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Door.texOffs(92, 0).addBox(-13.0F, -17.0F, 0.5F, 12.0F, 34.0F, 1.0F, 0.0F, false);
		Door.texOffs(116, 118).addBox(-1.0F, -18.0F, 0.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Door.texOffs(66, 45).addBox(-13.0F, -18.0F, 0.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Door.texOffs(92, 35).addBox(-12.0F, -12.0F, -0.25F, 10.0F, 24.0F, 1.0F, -0.25F, false);
		Door.texOffs(116, 39).addBox(-12.0F, -7.0F, -0.75F, 10.0F, 14.0F, 1.0F, -0.25F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-6.9876F, -6.75F, -0.15F);
		Door.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.texOffs(0, 23).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.151F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-6.9876F, 6.75F, -0.15F);
		Door.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.texOffs(0, 8).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.151F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-6.9848F, -11.75F, 0.348F);
		Door.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.texOffs(0, 0).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.153F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-6.9848F, 11.75F, 0.348F);
		Door.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.texOffs(0, 31).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.153F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-7.0F, 0.0F, -0.75F);
		Door.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.texOffs(0, 45).addBox(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, -0.25F, false);

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 24.0F, 0.0F);
		Shell.texOffs(76, 64).addBox(-11.0F, -40.0F, 8.0F, 22.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(84, 77).addBox(-7.0F, -40.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.texOffs(19, 78).addBox(-7.0F, -3.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.texOffs(0, 23).addBox(-13.0F, -2.0F, -10.0F, 26.0F, 2.0F, 20.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(-13.0F, -43.0F, -10.0F, 26.0F, 3.0F, 20.0F, 0.0F, false);
		Shell.texOffs(0, 45).addBox(-12.0F, -44.0F, -9.0F, 24.0F, 1.0F, 18.0F, 0.0F, false);
		Shell.texOffs(38, 64).addBox(-12.0F, -40.0F, -9.0F, 1.0F, 38.0F, 18.0F, 0.0F, false);
		Shell.texOffs(84, 103).addBox(-11.0F, -40.0F, -9.0F, 3.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(76, 103).addBox(8.0F, -40.0F, -9.0F, 3.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(98, 103).addBox(9.0F, -40.0F, -9.5F, 2.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(92, 103).addBox(-11.0F, -40.0F, -9.5F, 2.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(107, 117).addBox(7.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);
		Shell.texOffs(103, 117).addBox(-8.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);
		Shell.texOffs(0, 64).addBox(11.0F, -40.0F, -9.0F, 1.0F, 38.0F, 18.0F, 0.0F, false);
		Shell.texOffs(20, 120).addBox(11.25F, -39.0F, -8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(16, 120).addBox(11.25F, -39.0F, 7.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(104, 103).addBox(11.25F, -4.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Shell.texOffs(100, 48).addBox(11.25F, -39.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Shell.texOffs(8, 120).addBox(-12.25F, -39.0F, 7.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(4, 120).addBox(-11.0F, -39.0F, 8.25F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(0, 120).addBox(10.0F, -39.0F, 8.25F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(114, 37).addBox(-10.0F, -4.0F, 8.25F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(114, 35).addBox(-10.0F, -39.0F, 8.25F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(20, 64).addBox(-12.25F, -4.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
		Shell.texOffs(12, 120).addBox(-12.25F, -39.0F, -8.0F, 1.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(66, 48).addBox(-12.25F, -39.0F, -7.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(130, 123).addBox(-7.0F, -39.0F, -7.5F, 14.0F, 36.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Door.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BOTI.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}





	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.pushPose();
		EnumDoorState state = exterior.getOpen();
		matrixStack.translate(0.0D, 0.3D, 0.0D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.Door.yRot = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.ONE));
				break;
			case CLOSED:
				this.Door.yRot = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.CLOSED));
		}
		Door.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}


	}
//	public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer,
//						   int packedLight, int packedOverlay, float alpha) {
//		if(exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
//			PortalInfo info = new PortalInfo();
//			info.setPosition(exterior.getBlockPos());
//			info.setWorldShell(exterior.getBotiWorld());
//
//			info.setTranslate(matrix -> {
//				matrix.translate(-0.5, 0.7, -0.5);
//				ExteriorRenderer.applyTransforms(matrix, exterior);
//			});
//			info.setTranslatePortal(matrix -> {
//				matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
//				matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
//				matrix.translate(-0.5, -1, -0.5);
//			});
//
//			info.setRenderPortal((matrix, buf) -> {
//				matrix.pushPose();
//				matrix.scale(0.8f, 0.8f, 1f);
//				this.BOTI.render(matrix, buf.getBuffer(TRenderTypes.getTardis(Helper.getVariantTextureOr(exterior.getVariant(), BrackolinRender.TEXTURE))), packedLight, packedOverlay);
//				matrix.popPose();
//			});
//			BOTIRenderer.addPortal(info);
//		}
//
//	}
