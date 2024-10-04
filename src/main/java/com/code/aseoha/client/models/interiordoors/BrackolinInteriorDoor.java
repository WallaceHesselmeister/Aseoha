package com.code.aseoha.client.models.interiordoors;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.BrackolinRender;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.models.interiordoors.AbstractInteriorDoorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.entity.DoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class BrackolinInteriorDoor extends AbstractInteriorDoorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer BOTI;

	public BrackolinInteriorDoor() {
		texWidth = 176;
		texHeight = 176;

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 24.0F, 0.0F);
		Shell.texOffs(36, 123).addBox(10.0F, -48.0F, -13.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.texOffs(52, 123).addBox(9.0F, -44.0F, -12.0F, 1.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.texOffs(48, 123).addBox(-10.0F, -44.0F, -12.0F, 1.0F, 42.0F, 1.0F, 0.0F, false);
		Shell.texOffs(22, 61).addBox(-9.0F, -44.0F, -12.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(24, 123).addBox(-13.0F, -48.0F, -13.0F, 3.0F, 46.0F, 3.0F, 0.0F, false);
		Shell.texOffs(112, 0).addBox(-12.0F, -47.0F, -14.0F, 24.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.texOffs(112, 0).addBox(-12.0F, -47.0F, 10.0F, 24.0F, 3.0F, 2.0F, -0.01F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-9.0F, 22.0F, -11.0F);
		LeftDoor.texOffs(15, 6).addBox(7.25F, -27.0F, -2.0F, 1.0F, 3.0F, 2.0F, -0.25F, false);
		LeftDoor.texOffs(104, 104).addBox(0.0F, -41.0F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(9.0F, 22.0F, -11.0F);
		RightDoor.texOffs(84, 104).addBox(-9.0F, -41.0F, -1.0F, 9.0F, 41.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(21, 7).addBox(-8.75F, -27.0F, -2.0F, 1.0F, 3.0F, 2.0F, -0.25F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, -3.0F);
		BOTI.texOffs(136, 133).addBox(-9.0F, -43.0F, -11.0F, 18.0F, 41.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BOTI.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void renderBones(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		matrixStack.pushPose();

		matrixStack.translate(0, .25, -0.5);
		matrixStack.scale(1, 1, 1);
		this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(door.getOpenState()));
		this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.BRACKOLIN.getRotationForState(door.getOpenState()));
		this.LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.renderDoorWhenClosed(door, matrixStack, buffer, packedLight, packedOverlay, this.RightDoor);
//		this.renderDoorWhenClosed(door, matrixStack, buffer, packedLight, packedOverlay, this.LeftDoor);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);

		matrixStack.popPose();


	}

	@Override
	public void renderBoti(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
						   int packedOverlay) {
		if(Minecraft.getInstance().level != null && door.getOpenState() != EnumDoorState.CLOSED){
			Minecraft.getInstance().level.getCapability(Capabilities.TARDIS_DATA).ifPresent(data -> {

				PortalInfo info = new PortalInfo();
				info.setPosition(door.position());
				info.setWorldShell(data.getBotiWorld());
				info.setTranslate(matrix -> {
					DoorRenderer.applyTranslations(matrix, door.yRot - 180, door.getDirection());
					matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
					matrix.translate(0, -0.15, -0.45);
				});
				info.setTranslatePortal(matrix -> {
					matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(data.getBotiWorld().getPortalDirection())));
					matrix.translate(-0.5, -1.25, -0.5);
				});

				info.setRenderPortal((matrix, buf) -> {
					matrix.pushPose();
					matrix.scale(0.5F, 0.5F, 0.5F);
					this.BOTI.render(matrix, buf.getBuffer(RenderType.entityCutout(getTexture())), packedLight, packedOverlay);
					matrix.popPose();
				});

				/**info.setRenderDoor((matrix, buf) -> {
				 matrix.push();
				 matrix.rotate(Vector3f.ZN.rotationDegrees(180));
				 matrix.translate(0, 0.5, 0);
				 matrix.scale(0.5F, 0.5F, 0.5F);
				 this.lid_rotate_y.render(matrix, buf.getBuffer(RenderType.getEntityCutout(getTexture())), packedLight, packedOverlay);
				 matrix.pop();
				 });**/


				BOTIRenderer.addPortal(info);
			});
		}
	}




	@Override
	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().level).orElse(null);
		if (tile != null) {
			int index = tile.getExteriorManager().getExteriorVariant();
			if (tile.getExteriorType().getVariants() != null && index < tile.getExteriorType().getVariants().length)
				return tile.getExteriorType().getVariants()[index].getTexture();
		}

		return BrackolinRender.TEXTURE;
	}

//	@Override
//	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer modelRenderer) {
//
//	}
//
//	@Override
//	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer... modelRenderers) {
//
//	}

	@Override
	public boolean doesDoorOpenIntoBotiWindow() {
		return true;
	}

}