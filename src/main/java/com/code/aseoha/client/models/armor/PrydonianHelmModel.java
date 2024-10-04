package com.code.aseoha.client.models.armor;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.tardis.mod.client.models.entity.TBaseArmorModel;

public class PrydonianHelmModel extends TBaseArmorModel<LivingEntity> {
	private final ModelRenderer armorHead;
	private final ModelRenderer armorHead_r1;
	private final ModelRenderer armorHead_r2;
	private final ModelRenderer armorHead_r3;
	private final ModelRenderer armorHead_r4;

	public PrydonianHelmModel(float modelSize) {
		super(modelSize);
		texWidth = 128;
		texHeight = 128;

		armorHead = new ModelRenderer(this);
		armorHead.setPos(0.0F, 1.778F, -2.0F);


		armorHead_r1 = new ModelRenderer(this);
		armorHead_r1.setPos(-3.5F, -3.478F, 7.7F);
		armorHead.addChild(armorHead_r1);
		setRotationAngle(armorHead_r1, -1.5708F, 0.0F, 0.0F);
		armorHead_r1.texOffs(75, 0).addBox(-6.5F, 0.5F, -9.5F, 20.0F, 0.0F, 13.0F, 0.0F, false);

		armorHead_r2 = new ModelRenderer(this);
		armorHead_r2.setPos(3.5512F, 0.1593F, 3.5F);
		armorHead.addChild(armorHead_r2);
		setRotationAngle(armorHead_r2, 0.0F, 0.0F, -3.1416F);
		armorHead_r2.texOffs(53, 9).addBox(-1.5F, -0.5F, -2.0F, 11.0F, 1.0F, 6.0F, -0.3F, false);

		armorHead_r3 = new ModelRenderer(this);
		armorHead_r3.setPos(4.5512F, -1.2407F, 3.5F);
		armorHead.addChild(armorHead_r3);
		setRotationAngle(armorHead_r3, 0.0F, 0.0F, -1.5708F);
		armorHead_r3.texOffs(52, 16).addBox(-1.5F, -0.5F, -2.0F, 3.0F, 1.0F, 6.0F, -0.3F, false);

		armorHead_r4 = new ModelRenderer(this);
		armorHead_r4.setPos(-4.5244F, -1.2407F, 4.5F);
		armorHead.addChild(armorHead_r4);
		setRotationAngle(armorHead_r4, 0.0F, 0.0F, 1.5708F);
		armorHead_r4.texOffs(54, 50).addBox(-1.5F, -0.5F, -3.0F, 3.0F, 1.0F, 6.0F, -0.3F, false);
		}

	public void setupAnim(LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netbipedHeadYaw, float bipedHeadPitch) {
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netbipedHeadYaw, bipedHeadPitch);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		armorHead.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		super.head = this.armorHead;
//		this.armorHead_r1.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.armorHead_r2.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.armorHead_r3.render(matrixStack, buffer, packedLight, packedOverlay);
//		this.armorHead_r4.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pushPose();
//		matrixStack.translate(0,0,-0.1);
		armorHead.z = (float) Math.toRadians(-.2F);
		super.head.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.popPose();

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}