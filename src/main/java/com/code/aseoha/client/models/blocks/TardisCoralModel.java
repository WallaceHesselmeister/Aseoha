package com.code.aseoha.client.models.blocks;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.TileModel;

public class TardisCoralModel extends EntityModel<Entity> implements TileModel<TardisCoralTile> {
	private final ModelRenderer trunk;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer branches;
	private final ModelRenderer plane_r1;
	private final ModelRenderer plane_r2;
	private final ModelRenderer plane_r3;
	private final ModelRenderer plane_r4;
	private final ModelRenderer plane_r5;
	private final ModelRenderer plane_r6;
	private final ModelRenderer plane_r7;
	private final ModelRenderer plane_r8;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public TardisCoralModel() {
		texWidth = 32;
		texHeight = 32;

		trunk = new ModelRenderer(this);
		trunk.setPos(0.0F, 16.0F, 0.0F);
		trunk.texOffs(8, 0).addBox(-1.0F, 1.975F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		trunk.texOffs(10, 3).addBox(-1.5F, 7.725F, -1.375F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		trunk.texOffs(9, 3).addBox(0.5F, 7.725F, -1.125F, 1.625F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.1F, 0.0F);
		trunk.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.3927F, 0.0F);
		cube_r1.texOffs(10, 3).addBox(-0.375F, 7.5F, 0.5F, 1.0625F, 1.0F, 1.125F, 0.0F, false);
		cube_r1.texOffs(8, 5).addBox(0.5F, 7.75F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.1F, 0.0F);
		trunk.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.3927F, 0.0F);
		cube_r2.texOffs(11, 2).addBox(-0.375F, 7.4375F, 0.5F, 1.0625F, 1.0F, 1.125F, 0.0F, false);

		branches = new ModelRenderer(this);
		branches.setPos(0.0F, 16.0F, 0.0F);
		

		plane_r1 = new ModelRenderer(this);
		plane_r1.setPos(5.9588F, 6.0915F, 0.0F);
		branches.addChild(plane_r1);
		setRotationAngle(plane_r1, 0.0F, 0.0F, 0.7854F);
		plane_r1.texOffs(0, 0).addBox(-6.875F, -2.5F, 0.625F, 2.5F, 3.0F, 0.0F, 0.0F, false);

		plane_r2 = new ModelRenderer(this);
		plane_r2.setPos(-0.125F, 2.9457F, 2.9808F);
		branches.addChild(plane_r2);
		setRotationAngle(plane_r2, -0.4363F, 0.0F, 0.0F);
		plane_r2.texOffs(22, -1).addBox(0.0F, -1.25F, -1.5F, 0.0F, 2.5F, 3.0F, 0.0F, false);

		plane_r3 = new ModelRenderer(this);
		plane_r3.setPos(-0.75F, -2.3064F, 1.9265F);
		branches.addChild(plane_r3);
		setRotationAngle(plane_r3, -0.7854F, 0.0F, 0.0F);
		plane_r3.texOffs(0, 0).addBox(0.75F, 2.0F, -0.375F, 0.0F, 2.5F, 3.0F, 0.0F, false);

		plane_r4 = new ModelRenderer(this);
		plane_r4.setPos(-0.5F, 1.0911F, -4.7944F);
		branches.addChild(plane_r4);
		setRotationAngle(plane_r4, 0.7854F, 0.0F, 0.0F);
		plane_r4.texOffs(3, 6).addBox(1.25F, 1.0F, -0.375F, 0.0F, 3.5F, 5.0F, 0.0F, false);
		plane_r4.texOffs(8, 6).addBox(0.875F, 1.0F, -0.375F, 0.0F, 3.5F, 5.0F, 0.0F, false);

		plane_r5 = new ModelRenderer(this);
		plane_r5.setPos(-4.2992F, -1.5704F, 0.4375F);
		branches.addChild(plane_r5);
		setRotationAngle(plane_r5, 0.0F, 0.0F, -0.3927F);
		plane_r5.texOffs(19, 0).addBox(-0.375F, 1.25F, -0.875F, 5.0F, 2.25F, 0.0F, 0.0F, false);

		plane_r6 = new ModelRenderer(this);
		plane_r6.setPos(-3.6063F, -1.8574F, -5.3125F);
		branches.addChild(plane_r6);
		setRotationAngle(plane_r6, 0.0F, 0.0F, -0.3927F);
		plane_r6.texOffs(7, 3).addBox(1.375F, 1.0F, 1.75F, 0.0F, 3.5F, 5.0F, 0.0F, false);

		plane_r7 = new ModelRenderer(this);
		plane_r7.setPos(-4.0873F, 1.0305F, -4.125F);
		branches.addChild(plane_r7);
		setRotationAngle(plane_r7, 0.0F, 0.0F, -0.7854F);
		plane_r7.texOffs(18, -2).addBox(1.0F, 1.0F, 1.75F, 0.0F, 2.5F, 6.0F, 0.0F, false);

		plane_r8 = new ModelRenderer(this);
		plane_r8.setPos(4.0712F, 0.2291F, -4.75F);
		branches.addChild(plane_r8);
		setRotationAngle(plane_r8, 0.0F, 0.0F, -0.3927F);
		plane_r8.texOffs(2, 8).addBox(-3.5F, 0.5F, 1.75F, 4.25F, 0.0F, 6.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-11.6887F, 2.975F, 8.125F);
		branches.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.texOffs(18, 15).addBox(7.25F, 5.0F, -8.0F, 0.75F, 3.0F, 0.75F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-7.125F, -8.7701F, -0.9436F);
		branches.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.texOffs(8, 0).addBox(7.25F, 5.25F, -7.9459F, 0.75F, 2.75F, 0.75F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(4.5303F, -7.8084F, 9.0F);
		branches.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.texOffs(12, 6).addBox(-8.0F, 7.25F, -9.0F, 5.0F, 0.75F, 0.75F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-7.75F, 6.2959F, 10.2596F);
		branches.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
		cube_r6.texOffs(9, 4).addBox(7.25F, -7.9459F, -8.0F, 0.75F, 0.75F, 2.75F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-10.5286F, -2.2372F, 7.0625F);
		branches.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3927F);
		cube_r7.texOffs(12, 2).addBox(7.25F, 4.0F, -8.0F, 0.75F, 4.0F, 0.75F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		trunk.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		branches.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void render(TardisCoralTile tardisCoralTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
		matrixStack.pushPose();
		matrixStack.scale(TardisCoralTile.timer, TardisCoralTile.timer, TardisCoralTile.timer);
		trunk.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
		branches.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
		matrixStack.popPose();
	}
}