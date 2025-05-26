package com.code.aseoha.client.models.controls;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LeverModel extends EntityModel<Entity> {
	private final ModelRenderer bb_main;

	public LeverModel() {
		texWidth = 32;
		texHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setPos(0.0F, 24.0F, 0.0F);
		bb_main.texOffs(10, 0).addBox(1.5F, -24.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(14, 0).addBox(-2.5F, -24.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(18, 0).addBox(-3.5F, -30.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(22, 0).addBox(2.5F, -30.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(10, 2).addBox(-2.5F, -30.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(14, 2).addBox(1.5F, -30.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.texOffs(0, 0).addBox(-1.5F, -31.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}