package com.code.aseoha.client.models.armor;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


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
    private final ModelRenderer cube_r3;
    private final ModelRenderer steve;

    public FezModel() {
        super(1F);
        texWidth = 32;
        texHeight = 32;

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, -4.0F, 0.25F);
        setRotationAngle(bone, 0.0F, 1.5708F, 0.0F);
        bone.texOffs(0, 0).addBox(-2.6F, -8.85F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
        bone.texOffs(0, 10).addBox(-2.1F, -9.25F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-0.267F, -8.3852F, 0.833F);
        bone.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.2132F, -0.762F, 0.3038F);
        cube_r1.texOffs(10, 15).addBox(-4.0F, 0.0F, -1.0F, 0.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-0.15F, -7.6505F, 0.0964F);
        bone.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        cube_r2.texOffs(12, 15).addBox(-0.4672F, -1.8005F, -0.3964F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-0.2F, -9.25F, 0.9F);
        bone.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        cube_r3.texOffs(0, 15).addBox(-4.0F, 0.0F, -1.0F, 4.0F, 0.0F, 1.0F, 0.0F, false);

        steve = new ModelRenderer(this);
        steve.setPos(0.0F, 15.5F, 0.25F);
        steve.texOffs(32, 48).addBox(-4.0F, -23.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-4.0F, -15.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-8.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(4.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(-4.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        steve.texOffs(32, 48).addBox(0.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);}

    @Override
    public void renderToBuffer(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}