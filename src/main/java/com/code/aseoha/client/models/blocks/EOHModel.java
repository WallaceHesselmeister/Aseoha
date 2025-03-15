package com.code.aseoha.client.models.blocks;

import com.code.aseoha.tileentities.blocks.EOHTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.models.TileModel;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class EOHModel extends EntityModel<Entity> implements TileModel<EOHTile> {
    private final ModelRenderer base;
    private final ModelRenderer Projector;
    private final ModelRenderer projecter3;
    private final ModelRenderer leftaddon;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer projecter2;
    private final ModelRenderer Star1;
    private final ModelRenderer Star2;
    private final ModelRenderer cube_r1;

    public EOHModel() {
        texWidth = 256;
        texHeight = 256;

        base = new ModelRenderer(this);
        base.setPos(0.0F, 24.0F, 0.0F);


        Projector = new ModelRenderer(this);
        Projector.setPos(0.0F, 0.0F, 0.0F);
        base.addChild(Projector);


        projecter3 = new ModelRenderer(this);
        projecter3.setPos(0.0F, 0.0F, 0.0F);
        Projector.addChild(projecter3);
        projecter3.texOffs(70, 170).addBox(-9.0F, -14.0F, -9.0F, 9.0F, 1.0F, 18.0F, 0.0F, false);
        projecter3.texOffs(176, 119).addBox(-9.5F, -13.0F, -9.0F, 1.0F, 5.0F, 18.0F, 0.0F, false);
        projecter3.texOffs(112, 189).addBox(-9.0F, -13.0F, -9.5F, 9.0F, 5.0F, 1.0F, 0.0F, false);
        projecter3.texOffs(132, 189).addBox(-9.0F, -13.0F, 8.5F, 9.0F, 5.0F, 1.0F, 0.0F, false);

        leftaddon = new ModelRenderer(this);
        leftaddon.setPos(0.0F, 0.0F, 0.0F);
        Projector.addChild(leftaddon);
        leftaddon.texOffs(0, 166).addBox(-15.0F, -12.0706F, -21.7274F, 31.0F, 10.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(0, 0).addBox(-23.0F, -2.0F, -23.0F, 46.0F, 2.0F, 46.0F, 0.0F, false);
        leftaddon.texOffs(180, 67).addBox(-23.0F, -16.0F, -23.0F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        leftaddon.texOffs(180, 79).addBox(-23.0F, -16.0F, 14.0F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        leftaddon.texOffs(178, 180).addBox(14.0F, -16.0F, 14.0F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        leftaddon.texOffs(184, 0).addBox(14.0F, -16.0F, -23.0F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        leftaddon.texOffs(180, 48).addBox(-22.4F, -13.0F, 14.4F, 8.0F, 11.0F, 8.0F, 0.0F, false);
        leftaddon.texOffs(96, 96).addBox(-21.2726F, -12.0706F, -18.0F, 4.0F, 10.0F, 36.0F, 0.0F, false);
        leftaddon.texOffs(0, 152).addBox(-18.0F, -12.0706F, 17.7274F, 36.0F, 10.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(172, 192).addBox(20.0F, -4.0F, -24.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(92, 195).addBox(-24.0F, -4.0F, -24.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(108, 195).addBox(-24.0F, -4.0F, 20.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(188, 192).addBox(20.0F, -4.0F, 20.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(32, 180).addBox(-22.4F, -13.0F, -22.6F, 8.0F, 11.0F, 8.0F, 0.0F, false);
        leftaddon.texOffs(178, 160).addBox(14.6F, -14.0F, -22.6F, 8.0F, 12.0F, 8.0F, 0.0F, false);
        leftaddon.texOffs(96, 142).addBox(-10.0F, -9.0F, -10.0F, 20.0F, 8.0F, 20.0F, 0.0F, false);
        leftaddon.texOffs(176, 142).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 8.0F, 10.0F, 0.0F, false);
        leftaddon.texOffs(184, 12).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
        leftaddon.texOffs(96, 48).addBox(17.7274F, -12.0706F, -19.0F, 4.0F, 10.0F, 38.0F, 0.0F, false);
        leftaddon.texOffs(0, 180).addBox(14.6F, -13.0F, 14.6F, 8.0F, 11.0F, 8.0F, 0.0F, false);
        leftaddon.texOffs(64, 189).addBox(-2.0F, -13.0F, 21.0F, 4.0F, 13.0F, 3.0F, 0.0F, false);
        leftaddon.texOffs(80, 152).addBox(21.0F, -13.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(184, 28).addBox(-24.0F, -13.0F, -2.0F, 3.0F, 13.0F, 4.0F, 0.0F, false);
        leftaddon.texOffs(78, 189).addBox(-2.0F, -13.0F, -24.0F, 4.0F, 13.0F, 3.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-22.0681F, -12.4824F, -0.5F);
        leftaddon.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2618F);
        cube_r2.texOffs(160, 195).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(23.0341F, -12.7412F, -0.5F);
        leftaddon.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.2618F);
        cube_r3.texOffs(148, 195).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.5F, -12.4824F, 22.0681F);
        leftaddon.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        cube_r4.texOffs(136, 195).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.5F, -12.7412F, -23.0341F);
        leftaddon.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        cube_r5.texOffs(124, 195).addBox(-2.0F, -6.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-17.2726F, -12.0706F, 18.0F);
        leftaddon.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.2618F, 0.0F, 0.0F);
        cube_r6.texOffs(0, 138).addBox(-0.7274F, -0.0705F, -12.2633F, 36.0F, 2.0F, 12.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(-20.0F, -8.327F, -11.4836F);
        leftaddon.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
        cube_r7.texOffs(0, 124).addBox(2.0F, -2.0F, -7.0F, 36.0F, 2.0F, 12.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-17.2791F, -9.8799F, -1.0F);
        leftaddon.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.2618F);
        cube_r8.texOffs(0, 86).addBox(-1.0F, -2.0F, -17.0F, 12.0F, 2.0F, 36.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(11.4836F, -8.327F, 0.0F);
        leftaddon.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.2618F);
        cube_r9.texOffs(0, 48).addBox(-5.0F, -2.0F, -18.0F, 12.0F, 2.0F, 36.0F, 0.0F, false);

        projecter2 = new ModelRenderer(this);
        projecter2.setPos(0.0F, 0.0F, 0.0F);
        Projector.addChild(projecter2);
        projecter2.texOffs(176, 96).addBox(8.5F, -13.0F, -9.0F, 1.0F, 5.0F, 18.0F, 0.0F, false);
        projecter2.texOffs(92, 189).addBox(0.0F, -13.0F, 8.5F, 9.0F, 5.0F, 1.0F, 0.0F, false);
        projecter2.texOffs(124, 170).addBox(0.0F, -14.0F, -9.0F, 9.0F, 1.0F, 18.0F, 0.0F, false);
        projecter2.texOffs(152, 189).addBox(0.0F, -13.0F, -9.5F, 9.0F, 5.0F, 1.0F, 0.0F, false);

        Star1 = new ModelRenderer(this);
        Star1.setPos(0.0F, -57.5F, 0.0F);
        base.addChild(Star1);
        Star1.texOffs(220, 238).addBox(-5.0F, -2.25F, -4.0F, 9.0F, 9.0F, 9.0F, 10.0F, false);

        Star2 = new ModelRenderer(this);
        Star2.setPos(0.0F, -57.5F, 0.0F);
        base.addChild(Star2);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -0.5F, 0.0F);
        Star2.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.7854F, 0.7854F, 0.0F);
        cube_r1.texOffs(220, 238).addBox(-5.0F, -2.409F, -2.409F, 9.0F, 9.0F, 9.0F, 10.0F, false);
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
        matrixStack.translate(0, 3.1, 0);
        if(tileEntity.active){
            matrixStack.translate(0, Math.sin(Minecraft.getInstance().level.dayTime() / 20F) / 3, 0);
            Star1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            Star2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            matrixStack.translate(0, -Math.sin(Minecraft.getInstance().level.dayTime() / 20F) / 3, 0);
        }

        Projector.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.popPose();
    }
}
