package com.code.aseoha.client.models;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.entities.DavrosChair;
import com.code.aseoha.entities.Walle;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class DavrosChairModel<T extends DavrosChair> extends EntityModel<T> {

	private final ModelRenderer Base;
	private final ModelRenderer Base_r1;
	private final ModelRenderer Base_r2;
	private final ModelRenderer BeamLocators;
	private final ModelRenderer cube_r1;
	private final ModelRenderer GunRack;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer Head;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer Eyestalk;

	public DavrosChairModel() {
		texWidth = 144;
		texHeight = 144;

		Base = new ModelRenderer(this);
		Base.setPos(0.0F, 24.0F, 0.0F);
		Base.texOffs(0, 0).addBox(-6.0F, -3.0F, -6.5F, 12.0F, 3.0F, 14.0F, 0.0F, false);
		Base.texOffs(43, 18).addBox(-5.0F, -15.0F, -4.0F, 10.0F, 6.0F, 10.0F, 0.0F, false);
		Base.texOffs(0, 36).addBox(-5.5F, -17.0F, -4.5F, 11.0F, 2.0F, 11.0F, 0.0F, false);
		Base.texOffs(114, 56).addBox(-1.5F, -29.0F, 5.5F, 3.0F, 12.0F, 1.0F, 0.0F, false);
		Base.texOffs(84, 28).addBox(-3.5F, -29.0F, 4.5F, 7.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(114, 70).addBox(-3.5F, -25.0F, 4.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Base.texOffs(108, 119).addBox(-3.5F, -22.0F, 4.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Base.texOffs(0, 122).addBox(-3.5F, -19.0F, 4.5F, 7.0F, 2.0F, 1.0F, 0.0F, false);
		Base.texOffs(0, 18).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 6.0F, 11.0F, 0.0F, false);

		Base_r1 = new ModelRenderer(this);
		Base_r1.setPos(-3.5F, -21.0F, 5.5F);
		Base.addChild(Base_r1);
		setRotationAngle(Base_r1, 0.0F, -0.6109F, 0.0F);
		Base_r1.texOffs(1, 122).addBox(-4.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Base_r1.texOffs(1, 122).addBox(-4.0F, 2.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Base_r1.texOffs(1, 122).addBox(-4.0F, -4.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		Base_r2 = new ModelRenderer(this);
		Base_r2.setPos(3.5F, -21.0F, 5.5F);
		Base.addChild(Base_r2);
		setRotationAngle(Base_r2, 0.0F, 0.6109F, 0.0F);
		Base_r2.texOffs(0, 122).addBox(0.0F, -4.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Base_r2.texOffs(0, 122).addBox(0.0F, -1.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Base_r2.texOffs(0, 122).addBox(0.0F, 2.0F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		BeamLocators = new ModelRenderer(this);
		BeamLocators.setPos(0.0F, 1.375F, 0.0F);
		Base.addChild(BeamLocators);
		BeamLocators.texOffs(74, 35).addBox(2.75F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(0, 80).addBox(0.25F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(27, 80).addBox(-2.25F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(54, 80).addBox(-4.625F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(81, 80).addBox(-4.625F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(82, 0).addBox(-2.25F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(84, 14).addBox(0.25F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(87, 49).addBox(2.75F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		BeamLocators.texOffs(45, 35).addBox(2.875F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(0, 50).addBox(0.25F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(29, 50).addBox(-2.125F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(53, 0).addBox(-4.75F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(58, 50).addBox(-4.75F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(0, 65).addBox(-2.125F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(29, 65).addBox(0.25F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		BeamLocators.texOffs(58, 65).addBox(2.875F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -8.625F, 0.0F);
		BeamLocators.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.texOffs(87, 63).addBox(-3.625F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(0, 94).addBox(-1.25F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(27, 94).addBox(1.25F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(54, 94).addBox(3.625F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(81, 94).addBox(3.625F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(101, 28).addBox(1.25F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(0, 108).addBox(-1.25F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(27, 108).addBox(-3.625F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, -0.125F, false);
		cube_r1.texOffs(54, 108).addBox(-4.375F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(108, 77).addBox(-1.75F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(81, 108).addBox(1.0F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(108, 91).addBox(3.625F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(108, 105).addBox(3.625F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(109, 0).addBox(1.0F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(111, 14).addBox(-1.75F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);
		cube_r1.texOffs(114, 42).addBox(-4.375F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, 0.0F, false);

		GunRack = new ModelRenderer(this);
		GunRack.setPos(0.0F, 7.0F, 1.25F);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(2.5F, 0.0F, -7.5F);
		GunRack.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);


		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(2.5F, 0.0F, -7.5F);
		GunRack.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 15.0F, -1.25F);
		GunRack.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);


		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 0.0F, 1.25F);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-3.0F, -2.625F, 0.0F);
		Head.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.9599F);


		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, -2.625F, -1.25F);
		Head.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.5708F, -0.7854F, -1.5708F);


		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(3.0F, -2.625F, 0.0F);
		Head.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.9599F);


		Eyestalk = new ModelRenderer(this);
		Eyestalk.setPos(0.0F, 24.0F, -1.25F);
		Head.addChild(Eyestalk);
	}

	@Override
	public void setupAnim(T t, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

		//		TrackSuspension.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		// 		Tracks.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		matrixStack.pushPose();
//		matrixStack.mulPose(Vector3f.ZN.rotation(180));
//
		Base.render(matrixStack, buffer, packedLight, packedOverlay);
//		matrixStack.popPose();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setPos(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.x = x;
		modelRenderer.y = y;
		modelRenderer.z = z;
	}
}