package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.BrackolinRender;
import com.code.aseoha.client.renderers.exteriors.CapaldiRender;
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

public class McGannModel extends ExteriorModel {
	private final ModelRenderer base;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer BOTI;

	public McGannModel() {
		texWidth = 512;
		texHeight = 512;

		base = new ModelRenderer(this);
		base.setPos(0.0F, 24.0F, 0.0F);
		base.texOffs(12, 271).addBox(20.0F, -79.0F, -16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(0, 0).addBox(-25.0F, -3.0F, -25.0F, 50.0F, 3.0F, 50.0F, 0.0F, false);
		base.texOffs(0, 53).addBox(-24.0F, -4.0F, -24.0F, 48.0F, 1.0F, 48.0F, 0.0F, false);
		base.texOffs(72, 149).addBox(-23.0F, -87.0F, -23.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		base.texOffs(68, 271).addBox(-17.0F, -79.0F, -22.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(64, 271).addBox(16.0F, -79.0F, -22.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(90, 149).addBox(-17.0F, -80.0F, -22.0F, 34.0F, 1.0F, 1.0F, 0.0F, false);
		base.texOffs(182, 0).addBox(-20.0F, -86.0F, -26.0F, 40.0F, 6.0F, 5.0F, 0.0F, false);
		base.texOffs(0, 102).addBox(-21.0F, -91.0F, -21.0F, 42.0F, 5.0F, 42.0F, 0.0F, false);
		base.texOffs(126, 102).addBox(-17.0F, -93.0F, -17.0F, 34.0F, 2.0F, 34.0F, 0.0F, false);
		base.texOffs(126, 111).addBox(-4.0F, -94.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		base.texOffs(126, 102).addBox(-4.0F, -101.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		base.texOffs(40, 38).addBox(-3.0F, -100.0F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		base.texOffs(36, 38).addBox(-3.0F, -100.0F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		base.texOffs(28, 38).addBox(2.0F, -100.0F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		base.texOffs(32, 38).addBox(2.0F, -100.0F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		base.texOffs(28, 0).addBox(-2.0F, -100.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		base.texOffs(28, 31).addBox(-22.0F, -90.0F, -22.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		base.texOffs(28, 24).addBox(18.0F, -90.0F, -22.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		base.texOffs(28, 10).addBox(18.0F, -90.0F, 18.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		base.texOffs(28, 17).addBox(-22.0F, -90.0F, 18.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		base.texOffs(144, 53).addBox(-26.0F, -86.0F, -20.0F, 5.0F, 6.0F, 40.0F, 0.0F, false);
		base.texOffs(178, 138).addBox(-20.0F, -86.0F, 21.0F, 40.0F, 6.0F, 5.0F, 0.0F, false);
		base.texOffs(128, 138).addBox(21.0F, -86.0F, -20.0F, 5.0F, 6.0F, 40.0F, 0.0F, false);
		base.texOffs(222, 34).addBox(-22.0F, -80.0F, -17.0F, 1.0F, 1.0F, 34.0F, 0.0F, false);
		base.texOffs(56, 271).addBox(-22.0F, -79.0F, -17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(60, 271).addBox(-22.0F, -79.0F, 16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(144, 99).addBox(-17.0F, -80.0F, 21.0F, 34.0F, 1.0F, 1.0F, 0.0F, false);
		base.texOffs(48, 271).addBox(-17.0F, -79.0F, 21.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(52, 271).addBox(16.0F, -79.0F, 21.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(216, 165).addBox(21.0F, -80.0F, -17.0F, 1.0F, 1.0F, 34.0F, 0.0F, false);
		base.texOffs(40, 271).addBox(21.0F, -79.0F, 16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(44, 271).addBox(21.0F, -79.0F, -17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(48, 149).addBox(17.0F, -87.0F, -23.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		base.texOffs(0, 149).addBox(17.0F, -87.0F, 17.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		base.texOffs(24, 149).addBox(-23.0F, -87.0F, 17.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		base.texOffs(232, 267).addBox(-21.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		base.texOffs(258, 267).addBox(-22.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		base.texOffs(228, 69).addBox(-21.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		base.texOffs(160, 244).addBox(-21.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		base.texOffs(192, 214).addBox(-20.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(160, 199).addBox(-20.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(94, 244).addBox(-21.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		base.texOffs(96, 199).addBox(-20.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(242, 0).addBox(-21.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		base.texOffs(194, 23).addBox(-20.5F, -77.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(62, 238).addBox(-21.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		base.texOffs(28, 271).addBox(-21.0F, -79.0F, -16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(24, 271).addBox(-21.0F, -79.0F, 15.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(242, 267).addBox(-2.0F, -79.0F, 20.0F, 4.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(264, 267).addBox(-1.0F, -79.0F, 21.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(150, 45).addBox(-15.0F, -8.0F, 20.0F, 30.0F, 4.0F, 1.0F, 0.0F, false);
		base.texOffs(182, 11).addBox(-15.0F, -26.0F, 20.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		base.texOffs(194, 69).addBox(-15.0F, -23.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		base.texOffs(220, 149).addBox(-15.0F, -41.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		base.texOffs(182, 15).addBox(-15.0F, -44.0F, 20.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		base.texOffs(252, 165).addBox(-15.0F, -59.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		base.texOffs(182, 19).addBox(-15.0F, -62.0F, 20.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		base.texOffs(252, 181).addBox(-15.0F, -77.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		base.texOffs(194, 85).addBox(-15.0F, -79.0F, 20.0F, 30.0F, 2.0F, 1.0F, 0.0F, false);
		base.texOffs(16, 271).addBox(-16.0F, -79.0F, 20.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(20, 271).addBox(15.0F, -79.0F, 20.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		base.texOffs(222, 267).addBox(20.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		base.texOffs(252, 267).addBox(21.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		base.texOffs(224, 200).addBox(20.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		base.texOffs(228, 103).addBox(20.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		base.texOffs(150, 0).addBox(19.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(96, 154).addBox(19.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(128, 229).addBox(20.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		base.texOffs(128, 184).addBox(19.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(224, 234).addBox(20.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		base.texOffs(188, 154).addBox(19.5F, -77.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		base.texOffs(0, 238).addBox(20.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		base.texOffs(156, 262).addBox(20.0F, -79.0F, 15.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.0F, -18.7692F, -21.0F);
		setRotationAngle(LeftDoor, 0.0F, 2.0944F, 0.0F);
		LeftDoor.texOffs(270, 267).addBox(15.0F, -36.2308F, -1.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(6, 271).addBox(14.0F, -36.2308F, 0.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(36, 271).addBox(0.0F, -36.2308F, 0.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(126, 125).addBox(1.0F, 34.7692F, 0.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(144, 61).addBox(1.0F, 16.7692F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 118).addBox(1.0F, 19.7692F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 69).addBox(1.0F, 1.7692F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(144, 57).addBox(1.0F, -1.2308F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 32).addBox(1.0F, -16.2308F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(28, 0).addBox(1.0F, -10.7308F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(126, 138).addBox(1.0F, -19.2308F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 0).addBox(1.0F, -34.2308F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 134).addBox(1.0F, -36.2308F, 0.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.0F, -18.8333F, -21.0F);
		RightDoor.texOffs(0, 271).addBox(-16.0F, -36.1667F, 0.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(126, 120).addBox(-14.0F, 34.8333F, 0.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(144, 65).addBox(-14.0F, 16.8333F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 102).addBox(-14.0F, 19.8333F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 85).addBox(-14.0F, 1.8333F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(43, 9).addBox(-15.0F, -7.1667F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(144, 53).addBox(-14.0F, -1.1667F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 53).addBox(-14.0F, -16.1667F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 138).addBox(-14.0F, -19.1667F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.0F, -34.1667F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(126, 130).addBox(-14.0F, -36.1667F, 0.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(32, 271).addBox(-1.0F, -36.1667F, 0.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(432, 37).addBox(-19.0F, -86.0F, -1.0F, 38.0F, 86.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		LeftDoor.y = (float) -18.85;
		RightDoor.y = (float) -18.85;
		base.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//		BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
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
}