package com.code.aseoha.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.WardrobeRender;
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
import net.tardis.mod.client.models.interiordoors.AbstractInteriorDoorModel;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.entity.DoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class WardrobeInteriorDoor extends AbstractInteriorDoorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer BOTI;

	public WardrobeInteriorDoor() {
		texWidth = 160;
		texHeight = 160;

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 24.0F, 0.0F);
		Shell.texOffs(19, 47).addBox(-17.0F, -5.0F, -12.0F, 34.0F, 3.0F, 5.0F, 0.0F, false);
		Shell.texOffs(19, 19).addBox(-17.0F, -47.0F, -12.0F, 34.0F, 3.0F, 5.0F, 0.0F, false);
		Shell.texOffs(93, 0).addBox(-12.0F, -44.0F, -10.0F, 24.0F, 2.0F, 1.0F, 0.0F, false);
		Shell.texOffs(10, 9).addBox(13.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Shell.texOffs(97, 112).addBox(12.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.texOffs(84, 112).addBox(-15.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, 0.0F, false);
		Shell.texOffs(10, 3).addBox(-16.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(12.0F, -0.25F, -10.0F);
		RightDoor.texOffs(0, 98).addBox(-12.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, 0.0F, false);
		RightDoor.texOffs(7, 15).addBox(-12.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-12.0F, -0.25F, -10.0F);
		LeftDoor.texOffs(0, 12).addBox(11.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		LeftDoor.texOffs(29, 112).addBox(0.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(92, 3).addBox(2.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-12.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(2.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-2.0F, -42.0F, -11.0F, 4.0F, 18.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-2.0F, -24.0F, -11.0F, 4.0F, 19.0F, 2.0F, 0.0F, false);
		BOTI.texOffs(92, 3).addBox(-12.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, 0.0F, false);
	}



	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.pushPose();
		matrixStack.translate(0.0D, 0.3D, -0.05D);
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
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.popPose();
	}

	@Override
	public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {
//		this.texture = WardrobeRender.TEXTURE;
	}

	@Override
	public void renderBoti(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight,
						   int packedOverlay) {
		if(Minecraft.getInstance().level != null && door.getOpenState() != EnumDoorState.CLOSED){
			Minecraft.getInstance().level.getCapability(Capabilities.TARDIS_DATA).ifPresent(data -> {
				matrixStack.pushPose();
				PortalInfo info = new PortalInfo();
				info.setPosition(door.position());
				info.setWorldShell(data.getBotiWorld());

				info.setTranslate(matrix -> {

					matrix.scale(1.1f, 1.1f, 1.2f);
					matrix.translate(0.025, 0, 3);
					DoorRenderer.applyTranslations(matrix, door.yRot - 180, door.getDirection());
				});
				info.setTranslatePortal(matrix -> {
					matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
					matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(data.getBotiWorld().getPortalDirection())));
					matrix.translate(-0.5, -1.75, -0.5);
				});

				info.setRenderPortal((matrix, impl) -> {
					matrix.pushPose();
					matrix.translate(-0.05, -0.2, -0.5f);
					matrix.scale(1.1F, 1.1F, 1.1F);
					this.BOTI.render(matrix, impl.getBuffer(RenderType.entityCutout(this.getTexture())), packedLight, packedOverlay);
					matrix.popPose();
				});

				BOTIRenderer.addPortal(info);
				matrixStack.popPose();
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

		return WardrobeRender.TEXTURE;
	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer modelRenderer) {

	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer... modelRenderers) {

	}

	@Override
	public boolean doesDoorOpenIntoBotiWindow() {
		return false;
	}


}