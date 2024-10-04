package com.code.aseoha.client.models.interiordoors;// Made with Blockbench 4.9.0-beta.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.RaniRender;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.AbstractInteriorDoorModel;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class RaniInteriorDoor extends AbstractInteriorDoorModel {
	private final ModelRenderer Door;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer Shell;
	private final ModelRenderer BOTI;

	public RaniInteriorDoor() {
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
		Shell.texOffs(82, 73).addBox(-7.0F, -40.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.texOffs(20, 82).addBox(-7.0F, -3.0F, -9.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Shell.texOffs(102, 1).addBox(-12.0F, -40.0F, -9.0F, 4.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(94, 1).addBox(8.0F, -40.0F, -9.0F, 4.0F, 38.0F, 1.0F, 0.0F, false);
		Shell.texOffs(98, 103).addBox(9.0F, -39.0F, -8.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(92, 103).addBox(-11.0F, -39.0F, -8.5F, 2.0F, 36.0F, 1.0F, 0.0F, false);
		Shell.texOffs(104, 12).addBox(7.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);
		Shell.texOffs(104, 117).addBox(-8.0F, -40.0F, -9.5F, 1.0F, 38.0F, 2.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 24.0F, 0.0F);
		BOTI.texOffs(130, 123).addBox(-7.0F, -39.0F, -10.5F, 14.0F, 36.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.pushPose();
		matrixStack.translate(0.0D, 0.3D, -0.1D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.Door.yRot = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.ONE));
				break;
			case CLOSED:
				this.Door.yRot = (float) Math.toRadians(EnumDoorTypes.RANI.getRotationForState(EnumDoorState.CLOSED));
		}
		Door.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.popPose();
	}

	@Override
	public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}

	@Override
	public void renderBoti(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}


	@Override
	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().level).orElse(null);
		if (tile != null) {
			int index = tile.getExteriorManager().getExteriorVariant();
			if (tile.getExteriorType().getVariants() != null && index < tile.getExteriorType().getVariants().length)
				return tile.getExteriorType().getVariants()[index].getTexture();
		}


		return RaniRender.TEXTURE;
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


	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}