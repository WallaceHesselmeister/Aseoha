package com.code.aseoha.client.models;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import com.code.aseoha.entities.k9;
import net.minecraft.util.math.vector.Vector3f;

public class k9model <T extends k9> extends EntityModel<T> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer body;
	private final ModelRenderer base;
	private final ModelRenderer base2;
	private final ModelRenderer side1;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer side2;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer tail;

	public k9model() {
		texWidth = 128;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 23.5F, 0.0F);
		head.texOffs(0, 11).addBox(-2.0F, -9.0F, -9.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.texOffs(8, 38).addBox(-1.0F, -5.0F, -8.5F, 2.0F, 2.0F, 0.0F, 0.0F, false);
		head.texOffs(0, 0).addBox(-2.5F, -14.0F, -13.75F, 5.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.25F, -12.0F, -11.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(10, 11).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(1.5F, -14.0F, -12.25F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(13, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-3.0F, -12.0F, -13.75F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.texOffs(10, 11).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 0.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-1.5F, -14.0F, -12.25F);
		head.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.7854F, 0.0F);
		cube_r4.texOffs(12, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-0.5F, -10.75F, -13.75F);
		head.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3054F, 0.0F, 0.0F);
		cube_r5.texOffs(0, 7).addBox(-2.0F, -3.0F, -1.0F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-0.5F, -8.25F, -11.5F);
		head.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.texOffs(42, 51).addBox(-2.0F, -3.0F, -6.0F, 5.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, -6.25F, -9.75F);
		head.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.texOffs(38, 0).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);


		base = new ModelRenderer(this);
		base.setPos(0.75F, -3.25F, 0.0F);
		body.addChild(base);
		base.texOffs(32, 17).addBox(-6.25F, 2.25F, -7.5F, 11.0F, 1.0F, 15.0F, 0.0F, false);

		base2 = new ModelRenderer(this);
		base2.setPos(3.25F, -2.75F, 0.0F);
		body.addChild(base2);
		base2.texOffs(0, 0).addBox(-8.75F, 1.25F, -8.0F, 11.0F, 1.0F, 16.0F, 0.0F, false);
		base2.texOffs(0, 17).addBox(-7.25F, -6.75F, -8.0F, 8.0F, 5.0F, 16.0F, 0.0F, false);
		base2.texOffs(0, 55).addBox(-5.25F, -7.75F, -3.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		base2.texOffs(50, 33).addBox(-7.75F, -1.75F, -7.75F, 9.0F, 3.0F, 1.0F, 0.0F, false);
		base2.texOffs(14, 38).addBox(-7.75F, -1.75F, 6.75F, 9.0F, 3.0F, 1.0F, 0.0F, false);

		side1 = new ModelRenderer(this);
		side1.setPos(3.25F, -2.75F, 0.0F);
		body.addChild(side1);


		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, 0.0F, 2.0F);
		side1.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.2618F);
		cube_r8.texOffs(50, 38).addBox(1.5F, 1.75F, -8.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, 0.0F, -2.0F);
		side1.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.2618F);
		cube_r9.texOffs(0, 38).addBox(1.5F, -6.25F, -4.0F, 1.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, 0.0F, 0.0F);
		side1.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.2618F);
		cube_r10.texOffs(0, 38).addBox(0.5F, -6.25F, 6.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		cube_r10.texOffs(32, 17).addBox(0.5F, -6.25F, -8.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(-0.25F, 0.0F, 2.0F);
		side1.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.2618F);
		cube_r11.texOffs(39, 0).addBox(2.5F, -1.25F, -8.0F, 0.0F, 4.0F, 12.0F, 0.0F, false);

		side2 = new ModelRenderer(this);
		side2.setPos(-3.25F, -2.75F, 0.0F);
		body.addChild(side2);
		setRotationAngle(side2, 0.0F, 3.1416F, 0.0F);


		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, 0.0F, 2.0F);
		side2.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.2618F);
		cube_r12.texOffs(28, 50).addBox(1.5F, 1.75F, -8.0F, 1.0F, 1.0F, 12.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(0.0F, 0.0F, -2.0F);
		side2.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.2618F);
		cube_r13.texOffs(36, 33).addBox(1.5F, -6.25F, -4.0F, 1.0F, 5.0F, 12.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(0.0F, 0.0F, 0.0F);
		side2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.2618F);
		cube_r14.texOffs(0, 17).addBox(0.5F, -6.25F, 6.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		cube_r14.texOffs(8, 17).addBox(0.5F, -6.25F, -8.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-0.5F, 0.0F, 2.0F);
		side2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.2618F);
		cube_r15.texOffs(39, 0).addBox(2.5F, -1.25F, -8.0F, 0.0F, 4.0F, 12.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(-0.5F, 16.5F, 9.0F);
		tail.texOffs(52, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
	}
	@Override
	public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {
		this.tail.zRot = (float) Math.toRadians(t.power);
	}

//	@Override
//	public void setupAnim(Entity entity, float v, float v1, float v2, float v3, float v4) {
//
//	}

//	@Override
//	public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {
//
//	}
//	@Override
//	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
//		//previously the render function, render code was moved to a method below
//	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		matrixStack.pushPose();
		matrixStack.mulPose(Vector3f.ZN.rotation(180));
//		this.tail.zRot = (float) Math.toRadians(T.StaticGetTailAngle());
//		this.tail.yRot = T.power;
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.popPose();
	}
}