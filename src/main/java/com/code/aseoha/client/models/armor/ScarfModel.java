package com.code.aseoha.client.models.armor;

import com.code.aseoha.interfaces.IAmBoringBipedModelStuff;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class ScarfModel extends BipedModel<LivingEntity> implements IAmBoringBipedModelStuff {
    private final ModelRenderer base;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer steve;

    public ScarfModel() {
        super(1.0F);
        texWidth = 64;
        texHeight = 64;


        base = new ModelRenderer(this);
        base.setPos(0.0506F, 7.8075F, 0.2229F);
        base.texOffs(8, 30).addBox(1.4494F, 2.4349F, -5.8219F, 3.0F, 8.0F, 1.0F, 0.0F, false);
        base.texOffs(24, 30).addBox(-4.5506F, 2.4349F, -5.8219F, 3.0F, 8.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.3054F, 0.0F, 0.0F);
        cube_r1.texOffs(32, 33).addBox(-4.5592F, -6.7088F, -7.1283F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r1.texOffs(32, 30).addBox(1.4408F, -6.7088F, -7.1283F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.1739F, 0.0854F, -0.0284F);
        cube_r2.texOffs(12, 39).addBox(2.772F, 10.0556F, -3.7433F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(8, 39).addBox(-3.2037F, 9.9766F, -4.2767F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.1298F, -0.0011F, -0.017F);
        cube_r3.texOffs(4, 39).addBox(1.2844F, 9.9189F, -4.5093F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r3.texOffs(36, 36).addBox(-4.7147F, 9.8167F, -4.5159F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.1309F, -0.1309F, 0.0F);
        cube_r4.texOffs(0, 39).addBox(2.7852F, 9.9659F, -5.004F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(32, 36).addBox(-3.1635F, 9.8637F, -4.2275F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        cube_r5.texOffs(16, 30).addBox(-4.5592F, -6.3933F, -5.6667F, 3.0F, 8.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(0, 30).addBox(1.4408F, -6.3933F, -5.6667F, 3.0F, 8.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0873F);
        cube_r6.texOffs(22, 25).addBox(-5.5241F, -10.8839F, 3.6176F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r6.texOffs(0, 27).addBox(-5.5241F, -10.8839F, -4.3824F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r6.texOffs(22, 11).addBox(2.4759F, -10.8839F, -4.3824F, 1.0F, 2.0F, 9.0F, 0.0F, false);
        cube_r6.texOffs(22, 0).addBox(-5.5241F, -10.8839F, -4.3824F, 1.0F, 2.0F, 9.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0087F, 1.0768F, -0.0905F);
        base.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.0436F);
        cube_r7.texOffs(0, 12).addBox(-4.729F, -9.4988F, -4.8824F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r7.texOffs(0, 24).addBox(-4.729F, -9.4988F, 4.1176F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r7.texOffs(22, 22).addBox(-4.729F, -9.4988F, -4.8824F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r7.texOffs(0, 0).addBox(4.271F, -9.4988F, -4.8824F, 1.0F, 2.0F, 10.0F, 0.0F, false);

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
//        this.base.yRot = netHeadYaw * ((float) Math.PI / (360 * 3));
//        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

        // Sync your custom head with the parent's head rotation
        this.base.yRot = head.yRot;
    }

    @Override
    public void renderToBuffer(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}