package com.code.aseoha.client.models.armor;


import com.code.aseoha.interfaces.IAmBoringBipedModelStuff;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import lombok.Getter;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class FezModel extends BipedModel<LivingEntity> implements IAmBoringBipedModelStuff {
    @Getter
    private final ModelRenderer bone;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer steve;


    public FezModel() {
        super(1.0F);

        texWidth = 32;
        texHeight = 32;

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 0.0F, 0.25F);
        setRotationAngle(bone, 0.0F, 1.5708F, 0.0F);
        bone.texOffs(0, 0).addBox(-2.6F, -12.85F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
        bone.texOffs(0, 10).addBox(-2.1F, -13.25F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, -0.25F);
        bone.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.2132F, -0.762F, 0.3038F);
        cube_r1.texOffs(10, 15).addBox(-6.1994F, -12.2094F, -0.1561F, 0.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, -0.25F);
        bone.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        cube_r2.texOffs(12, 15).addBox(-0.4111F, -13.451F, -0.1561F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(0, 15).addBox(-3.4111F, -13.25F, -0.1561F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        steve = new ModelRenderer(this);
        steve.setPos(0.0F, 15.5F, 0.25F);
        steve.texOffs(32, 48).addBox(-4.0F, -23.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-4.0F, -15.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-8.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(4.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-4.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(0.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(@NotNull LivingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.bone.yRot = netHeadYaw * ((float) Math.PI / 180F);
        this.bone.xRot = headPitch * ((float) Math.PI / 180F);
//        this.bone.zRot = 0.0F;
    }

    @Override
    public void renderToBuffer(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}