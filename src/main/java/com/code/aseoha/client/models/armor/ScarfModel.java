package com.code.aseoha.client.models.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class ScarfModel extends BipedModel<LivingEntity> {
    private final ModelRenderer base;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer steve;

    public ScarfModel() {
        super(1.0F);
        texWidth = 64;
        texHeight = 64;

        base = new ModelRenderer(this);
        base.setPos(-3.5F, -9.8476F, -0.3871F);
        base.texOffs(8, 30).addBox(5.0F, 20.09F, -5.2119F, 3.0F, 8.0F, 1.0F, 0.0F, false);
        base.texOffs(24, 30).addBox(-1.0F, 20.09F, -5.2119F, 3.0F, 8.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        base.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        cube_r1.texOffs(32, 33).addBox(-1.0F, 11.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r1.texOffs(32, 30).addBox(5.0F, 11.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(6.2086F, 28.09F, -4.1424F);
        base.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.1739F, 0.0854F, -0.0284F);
        cube_r2.texOffs(12, 39).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.2086F, 28.09F, -4.1424F);
        base.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.1739F, 0.0854F, -0.0284F);
        cube_r3.texOffs(8, 39).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(5.0086F, 28.09F, -4.2424F);
        base.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1298F, -0.0011F, -0.017F);
        cube_r4.texOffs(4, 39).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-0.9914F, 28.09F, -4.2424F);
        base.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.1298F, -0.0011F, -0.017F);
        cube_r5.texOffs(36, 36).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(7.0086F, 28.09F, -4.3424F);
        base.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.1309F, -0.1309F, 0.0F);
        cube_r6.texOffs(0, 39).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(1.0086F, 28.09F, -4.3424F);
        base.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.1309F, -0.1309F, 0.0F);
        cube_r7.texOffs(32, 36).addBox(0.0F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(1.0F, 14.1393F, -3.9511F);
        base.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        cube_r8.texOffs(16, 30).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
        cube_r8.texOffs(0, 30).addBox(4.0F, -2.0F, -1.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(6.8F, 10.0976F, 3.1371F);
        base.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.0873F);
        cube_r9.texOffs(22, 25).addBox(-8.0F, -2.0F, 1.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r9.texOffs(0, 27).addBox(-8.0F, -2.0F, -7.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r9.texOffs(22, 11).addBox(0.0F, -2.0F, -7.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);
        cube_r9.texOffs(22, 0).addBox(-8.0F, -2.0F, -7.0F, 1.0F, 2.0F, 9.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(6.5F, 11.0976F, 3.6371F);
        base.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, -0.0436F);
        cube_r10.texOffs(0, 12).addBox(-8.0F, -2.0F, -8.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r10.texOffs(0, 24).addBox(-8.0F, -2.0F, 1.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r10.texOffs(22, 22).addBox(-8.0F, -2.0F, -8.0F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r10.texOffs(0, 0).addBox(1.0F, -2.0F, -8.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        steve = new ModelRenderer(this);
        steve.setPos(0.0F, 16.0F, 0.25F);
        steve.texOffs(32, 48).addBox(-4.0F, -23.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-4.0F, -15.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-8.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(4.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-4.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(0.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(@NotNull LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    @Override
    public void renderToBuffer(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}