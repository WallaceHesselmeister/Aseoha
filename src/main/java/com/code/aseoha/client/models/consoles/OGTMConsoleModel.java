package com.code.aseoha.client.models.consoles;// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.tileentities.consoles.BattleConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.consoles.AbstractConsoleEntityModel;

public class OGTMConsoleModel extends AbstractConsoleEntityModel<BattleConsoleTile> {
	private final ModelRenderer CentralShaft;
	private final ModelRenderer Base;
	private final ModelRenderer Arm1;
	private final ModelRenderer Arm3;
	private final ModelRenderer Arm4;
	private final ModelRenderer Arm2;
	private final ModelRenderer Face1;
	private final ModelRenderer Face2;
	private final ModelRenderer Face3;
	private final ModelRenderer Face4;

	public OGTMConsoleModel() {
		texWidth = 256;
		texHeight = 256;

		CentralShaft = new ModelRenderer(this);
		CentralShaft.setPos(0.0F, -8.0F, 0.0F);
		CentralShaft.texOffs(0, 0).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 32.0F, 16.0F, 0.0F, false);

		Base = new ModelRenderer(this);
		Base.setPos(0.0F, 7.0F, 0.0F);
		Base.texOffs(0, 100).addBox(-24.0F, 0.0F, -24.0F, 48.0F, 1.0F, 48.0F, 0.0F, false);

		Arm1 = new ModelRenderer(this);
		Arm1.setPos(-7.0F, -7.0F, -7.0F);
		setRotationAngle(Arm1, -1.0123F, 0.7854F, 0.0F);
		Arm1.texOffs(0, 50).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 27.0F, 1.0F, 0.0F, false);

		Arm3 = new ModelRenderer(this);
		Arm3.setPos(-7.0F, -7.0F, 7.0F);
		setRotationAngle(Arm3, 1.0123F, -0.7854F, 0.0F);
		Arm3.texOffs(0, 50).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 27.0F, 1.0F, 0.0F, false);

		Arm4 = new ModelRenderer(this);
		Arm4.setPos(7.0F, -7.0F, -7.0F);
		setRotationAngle(Arm4, -1.0123F, -0.7854F, 0.0F);
		Arm4.texOffs(0, 50).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 27.0F, 1.0F, 0.0F, false);

		Arm2 = new ModelRenderer(this);
		Arm2.setPos(7.0F, -7.0F, 7.0F);
		setRotationAngle(Arm2, 1.0123F, 0.7854F, 0.0F);
		Arm2.texOffs(0, 50).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 27.0F, 1.0F, 0.0F, false);

		Face1 = new ModelRenderer(this);
		Face1.setPos(0.0F, -6.0F, 7.0F);
		setRotationAngle(Face1, 0.8378F, 0.0F, 0.0F);
		Face1.texOffs(8, 50).addBox(-23.0F, 0.0F, 0.0F, 46.0F, 21.0F, 1.0F, 0.0F, false);

		Face2 = new ModelRenderer(this);
		Face2.setPos(0.0F, -6.0F, -7.0F);
		setRotationAngle(Face2, 0.8378F, 3.1416F, 0.0F);
		Face2.texOffs(8, 50).addBox(-23.0F, 0.0F, 0.0F, 46.0F, 21.0F, 1.0F, 0.0F, false);

		Face3 = new ModelRenderer(this);
		Face3.setPos(-7.0F, -6.0F, 0.0F);
		setRotationAngle(Face3, 0.8378F, -1.5708F, 0.0F);
		Face3.texOffs(8, 50).addBox(-23.0F, 0.0F, 0.0F, 46.0F, 21.0F, 1.0F, 0.0F, false);

		Face4 = new ModelRenderer(this);
		Face4.setPos(7.0F, -6.0F, 0.0F);
		setRotationAngle(Face4, 0.8378F, 1.5708F, 0.0F);
		Face4.texOffs(8, 50).addBox(-23.0F, 0.0F, 0.0F, 46.0F, 21.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(BattleConsoleTile battleConsoleTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
		
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		CentralShaft.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Face1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Face2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Face3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Face4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}