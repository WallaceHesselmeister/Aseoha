package com.code.aseoha.client.models.blocks;

import com.code.aseoha.tileentities.blocks.EOHTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.TileModel;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class EOHModel extends EntityModel<Entity> implements TileModel<EOHTile> {
    private final ModelRenderer base;
    private final ModelRenderer Star1;
    private final ModelRenderer Star2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer Projecter;

    public EOHModel() {
        texWidth = 128;
        texHeight = 128;

        base = new ModelRenderer(this);
        base.setPos(0.0F, -25.0F, 0.0F);


        Star1 = new ModelRenderer(this);
        Star1.setPos(0.0F, -8.5F, 0.0F);
        base.addChild(Star1);
        Star1.texOffs(76, 71).addBox(-5.0F, -4.5F, -4.0F, 9.0F, 9.0F, 9.0F, 12.0F, false);

        Star2 = new ModelRenderer(this);
        Star2.setPos(0.0F, -8.5F, 0.0F);
        base.addChild(Star2);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -0.5F, 0.0F);
        Star2.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.7854F, 0.7854F, 0.0F);
        cube_r1.texOffs(76, 71).addBox(-5.0F, -4.0F, -4.0F, 9.0F, 9.0F, 9.0F, 12.0F, false);

        Projecter = new ModelRenderer(this);
        Projecter.setPos(0.0F, 49.0F, 0.0F);
        base.addChild(Projecter);
        Projecter.texOffs(0, 24).addBox(-10.0F, -10.0F, -10.0F, 20.0F, 8.0F, 20.0F, 0.0F, false);
        Projecter.texOffs(80, 24).addBox(-9.0F, -13.0F, 8.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(80, 28).addBox(-3.0F, -13.0F, -3.5F, 6.0F, 3.0F, 7.0F, 0.0F, false);
        Projecter.texOffs(80, 24).addBox(-9.0F, -13.0F, -9.5F, 18.0F, 3.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(0, 52).addBox(-9.0F, -14.0F, -9.0F, 6.0F, 1.0F, 18.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, 5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-5.5F, -14.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-5.5F, -14.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-5.5F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-5.5F, -14.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-5.5F, -14.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-7.0F, -14.5F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(-8.5F, -14.5F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, 5.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.5F, -14.5F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.5F, -14.5F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.5F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.5F, -14.5F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.5F, -14.5F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(6.0F, -14.5F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(7.5F, -14.5F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(5.5F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.0F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(2.5F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(1.0F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-0.5F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-2.0F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-3.5F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-5.0F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-5.0F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-3.5F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-2.0F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-0.5F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(1.0F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(2.5F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-3.5F, -14.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-2.0F, -14.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-0.5F, -14.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(1.0F, -14.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(2.5F, -14.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.0F, -14.5F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-6.5F, -14.5F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(5.5F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.0F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(2.5F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(1.0F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-0.5F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-2.0F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-3.5F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-5.0F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-5.0F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-3.5F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-2.0F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-0.5F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(1.0F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(2.5F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-3.5F, -14.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-2.0F, -14.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-0.5F, -14.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(1.0F, -14.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(2.5F, -14.5F, 4.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(4.0F, -14.5F, 6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(17, 69).addBox(-6.5F, -14.5F, 7.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Projecter.texOffs(80, 38).addBox(-3.0F, -14.0F, -9.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        Projecter.texOffs(80, 45).addBox(-3.0F, -14.0F, 3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        Projecter.texOffs(88, 20).addBox(-3.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(88, 22).addBox(-3.0F, -14.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(0, 92).addBox(2.0F, -14.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(4, 92).addBox(2.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Projecter.texOffs(48, 52).addBox(3.0F, -14.0F, -9.0F, 6.0F, 1.0F, 18.0F, 0.0F, false);
        Projecter.texOffs(0, 71).addBox(-9.5F, -13.0F, -9.0F, 1.0F, 3.0F, 18.0F, 0.0F, false);
        Projecter.texOffs(38, 71).addBox(8.5F, -13.0F, -9.0F, 1.0F, 3.0F, 18.0F, 0.0F, false);
        Projecter.texOffs(0, 0).addBox(-11.0F, -2.0F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);
        Projecter.texOffs(88, 0).addBox(-11.2F, -2.4F, 8.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Projecter.texOffs(88, 0).addBox(8.2F, -2.4F, 8.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Projecter.texOffs(88, 0).addBox(-11.2F, -2.4F, -11.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Projecter.texOffs(88, 0).addBox(8.2F, -2.4F, -11.2F, 3.0F, 3.0F, 3.0F, 0.0F, false);
        Projecter.texOffs(88, 6).addBox(-10.5F, -7.0F, -10.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        Projecter.texOffs(88, 13).addBox(8.5F, -7.0F, -10.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        Projecter.texOffs(76, 89).addBox(8.5F, -7.0F, 8.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        Projecter.texOffs(84, 89).addBox(-10.5F, -7.0F, 8.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
}
    @Override
    public void setupAnim(@NotNull Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
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

    @Override
    public void render(EOHTile tileEntity, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Star1.yRot = (float) Math.toRadians(Objects.requireNonNull(tileEntity.getLevel()).getGameTime() % 360);
        this.Star2.yRot = -(float) Math.toRadians(Objects.requireNonNull(tileEntity.getLevel()).getGameTime() % 360);
        this.Star1.xRot = (float) Math.toRadians(Objects.requireNonNull(tileEntity.getLevel()).getGameTime() % 360);
        this.Star2.xRot = -(float) Math.toRadians(Objects.requireNonNull(tileEntity.getLevel()).getGameTime() % 360);
        matrixStack.pushPose();
//        matrixStack.translate(0, Math.toRadians(tileEntity.getLevel().getGameTime()) % 360, 0);
        if(tileEntity.active){
            Star1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            Star2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        }
        matrixStack.popPose();
        matrixStack.pushPose();
        Projecter.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.popPose();
    }
}
