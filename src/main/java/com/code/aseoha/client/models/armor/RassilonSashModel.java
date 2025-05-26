package com.code.aseoha.client.models.armor;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.interfaces.IAmBoringBipedModelStuff;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import lombok.Getter;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class RassilonSashModel extends BipedModel<LivingEntity> implements IAmBoringBipedModelStuff {
    @Getter
    private final ModelRenderer group;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer steve;

    public RassilonSashModel() {
        super(1.0F);
        texWidth = 64;
        texHeight = 64;

        group = new ModelRenderer(this);
        group.setPos(7.4F, 13.5F, -2.65F);
        group.texOffs(12, 0).addBox(-12.8716F, -12.7355F, 4.9213F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        group.texOffs(18, 21).addBox(-5.3716F, -13.7355F, 4.9213F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        group.texOffs(18, 19).addBox(-13.3716F, -13.7355F, 4.9213F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        group.texOffs(8, 24).addBox(-13.7284F, -13.0142F, -0.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        group.texOffs(24, 13).addBox(-4.0716F, -13.0284F, -0.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        group.texOffs(12, 3).addBox(-13.7284F, -14.4284F, 1.2142F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        group.texOffs(12, 8).addBox(-4.0716F, -14.4426F, 1.2142F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        group.texOffs(0, 0).addBox(-9.9F, -12.0F, -0.2F, 5.0F, 14.0F, 1.0F, 0.0F, false);
        group.texOffs(12, 13).addBox(-10.1F, 0.0F, -0.4F, 5.3F, 1.0F, 1.2F, 0.0F, false);
        group.texOffs(0, 15).addBox(-10.1F, -3.0F, -0.4F, 5.3F, 1.0F, 1.2F, 0.0F, false);
        group.texOffs(12, 15).addBox(-10.1F, -6.0F, -0.4F, 5.3F, 1.0F, 1.2F, 0.0F, false);
        group.texOffs(0, 17).addBox(-10.1F, -9.0F, -0.4F, 5.3F, 1.0F, 1.2F, 0.0F, false);
        group.texOffs(12, 17).addBox(-10.1F, -11.0F, -0.4F, 5.3F, 1.0F, 1.2F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-4.6929F, -11.7355F, -0.1F);
        group.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        cube_r1.texOffs(10, 19).addBox(-0.6465F, -1.3536F, 0.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-13.082F, -14.1784F, 0.9642F);
        group.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
        cube_r2.texOffs(18, 23).addBox(-0.6464F, -0.3536F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-13.7251F, -13.4855F, 4.7571F);
        group.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        cube_r3.texOffs(0, 26).addBox(0.3536F, -1.0F, -0.3536F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r3.texOffs(24, 16).addBox(9.3536F, -1.0F, -0.3536F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-4.4251F, -14.1926F, 0.9642F);
        group.addChild(cube_r4);
        setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
        cube_r4.texOffs(0, 23).addBox(0.3536F, -0.3535F, 0.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-11.3142F, -10.5142F, -0.1F);
        group.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
        cube_r5.texOffs(0, 19).addBox(-1.3536F, -2.3536F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

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
    public void renderToBuffer(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        group.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}