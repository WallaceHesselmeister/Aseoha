package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.BrackolinRender;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import static java.awt.SystemColor.info;

public class CoralExterior extends ExteriorModel {
    private final ModelRenderer LeftDoor;
    private final ModelRenderer RightDoor;
    private final ModelRenderer base;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer boti;

    public CoralExterior() {
        texWidth = 512;
        texHeight = 512;

        LeftDoor = new ModelRenderer(this);
        LeftDoor.setPos(-16.9167F, -18.2308F, -22.0167F);
        LeftDoor.texOffs(86, 278).addBox(-0.0833F, -36.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(80, 278).addBox(14.9167F, -36.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(28, 6).addBox(13.9167F, -10.2692F, -0.4833F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(62, 278).addBox(15.9167F, -36.7692F, -0.9833F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 138).addBox(1.9167F, 35.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 122).addBox(1.9167F, 20.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 134).addBox(1.9167F, 17.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 106).addBox(1.9167F, 2.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 130).addBox(1.9167F, -0.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 87).addBox(1.9167F, -15.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 126).addBox(1.9167F, -18.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 122).addBox(1.9167F, -36.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 71).addBox(1.9167F, -33.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);

        RightDoor = new ModelRenderer(this);
        RightDoor.setPos(16.9167F, -18.1667F, -22.0167F);
        RightDoor.texOffs(74, 278).addBox(-16.9167F, -36.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(68, 278).addBox(-1.9167F, -36.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 118).addBox(-14.9167F, 35.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 55).addBox(-14.9167F, 20.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 114).addBox(-14.9167F, 17.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 32).addBox(-14.9167F, 2.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 110).addBox(-14.9167F, -0.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 16).addBox(-14.9167F, -15.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 106).addBox(-14.9167F, -18.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 48).addBox(-14.9167F, -36.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 0).addBox(-14.9167F, -33.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(28, 0).addBox(-15.9167F, -9.3333F, -0.9833F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        base = new ModelRenderer(this);
        base.setPos(0.0F, 24.0F, 0.0F);
        base.texOffs(0, 0).addBox(-26.0F, -3.0F, -26.0F, 52.0F, 3.0F, 52.0F, 0.0F, false);
        base.texOffs(0, 55).addBox(-25.0F, -4.0F, -25.0F, 50.0F, 1.0F, 50.0F, 0.0F, false);
        base.texOffs(72, 156).addBox(18.0F, -87.0F, -24.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
        base.texOffs(28, 41).addBox(19.0F, -91.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        base.texOffs(48, 156).addBox(-24.0F, -87.0F, -24.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
        base.texOffs(28, 41).addBox(-23.0F, -91.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        base.texOffs(0, 156).addBox(-24.0F, -87.0F, 18.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
        base.texOffs(28, 41).addBox(-23.0F, -91.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        base.texOffs(28, 41).addBox(19.0F, -91.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        base.texOffs(24, 156).addBox(18.0F, -87.0F, 18.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
        base.texOffs(268, 284).addBox(17.0F, -79.0F, -23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(264, 284).addBox(-18.0F, -79.0F, -23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(184, 161).addBox(-18.0F, -80.0F, -23.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
        base.texOffs(232, 0).addBox(-21.0F, -86.0F, -26.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);
        base.texOffs(260, 145).addBox(-15.0F, -76.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        base.texOffs(228, 145).addBox(-21.5F, -76.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(22, 278).addBox(-22.0F, -79.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        base.texOffs(28, 278).addBox(-22.0F, -76.0F, -2.0F, 1.0F, 69.0F, 4.0F, 0.0F, false);
        base.texOffs(38, 278).addBox(-23.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        base.texOffs(0, 245).addBox(-22.0F, -7.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(96, 208).addBox(-21.5F, -22.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(16, 278).addBox(-22.0F, -79.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        base.texOffs(62, 245).addBox(-22.0F, -25.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(172, 208).addBox(-21.5F, -40.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(62, 245).addBox(-22.0F, -43.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(204, 223).addBox(-21.5F, -58.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(62, 245).addBox(-22.0F, -61.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(0, 245).addBox(-22.0F, -79.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(260, 284).addBox(-23.0F, -79.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(96, 157).addBox(-23.0F, -80.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
        base.texOffs(256, 284).addBox(-23.0F, -79.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(56, 278).addBox(15.0F, -79.0F, 21.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(246, 284).addBox(-2.0F, -76.0F, 21.0F, 4.0F, 69.0F, 1.0F, 0.0F, false);
        base.texOffs(50, 278).addBox(-1.0F, -79.0F, 22.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(232, 10).addBox(-15.0F, -7.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        base.texOffs(258, 190).addBox(-15.0F, -22.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        base.texOffs(44, 278).addBox(-17.0F, -79.0F, 21.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(96, 202).addBox(-15.0F, -25.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        base.texOffs(232, 55).addBox(-15.0F, -40.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        base.texOffs(96, 202).addBox(-15.0F, -43.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        base.texOffs(184, 145).addBox(-15.0F, -58.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        base.texOffs(96, 202).addBox(-15.0F, -61.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        base.texOffs(232, 10).addBox(-15.0F, -79.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        base.texOffs(242, 284).addBox(-18.0F, -79.0F, 22.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(150, 103).addBox(-18.0F, -80.0F, 22.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
        base.texOffs(238, 284).addBox(17.0F, -79.0F, 22.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(150, 55).addBox(-26.0F, -86.0F, -21.0F, 4.0F, 6.0F, 42.0F, 0.0F, false);
        base.texOffs(200, 52).addBox(20.5F, -76.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(10, 278).addBox(21.0F, -79.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        base.texOffs(0, 278).addBox(21.0F, -76.0F, -2.0F, 1.0F, 69.0F, 4.0F, 0.0F, false);
        base.texOffs(228, 268).addBox(22.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        base.texOffs(236, 251).addBox(21.0F, -7.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(200, 7).addBox(20.5F, -22.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(222, 268).addBox(21.0F, -79.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        base.texOffs(236, 218).addBox(21.0F, -25.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(196, 163).addBox(20.5F, -40.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(236, 218).addBox(21.0F, -43.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(140, 193).addBox(20.5F, -58.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        base.texOffs(236, 218).addBox(21.0F, -61.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(236, 251).addBox(21.0F, -79.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        base.texOffs(234, 284).addBox(22.0F, -79.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(156, 0).addBox(22.0F, -80.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
        base.texOffs(156, 271).addBox(22.0F, -79.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        base.texOffs(204, 208).addBox(-21.0F, -86.0F, 22.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);
        base.texOffs(134, 145).addBox(22.0F, -86.0F, -21.0F, 4.0F, 6.0F, 42.0F, 0.0F, false);
        base.texOffs(0, 106).addBox(-22.0F, -92.0F, -22.0F, 44.0F, 6.0F, 44.0F, 0.0F, false);
        base.texOffs(132, 106).addBox(-18.0F, -95.0F, -18.0F, 36.0F, 3.0F, 36.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, 0.0F, 0.0F);
        base.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
        cube_r1.texOffs(28, 91).addBox(-2.5F, -102.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, 0.0F, 0.0F);
        base.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
        cube_r2.texOffs(28, 97).addBox(-2.5F, -102.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(27, 10).addBox(-3.0F, -103.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r2.texOffs(27, 26).addBox(-3.0F, -97.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r2.texOffs(28, 71).addBox(-2.0F, -101.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        cube_r2.texOffs(28, 76).addBox(-2.0F, -100.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        cube_r2.texOffs(28, 81).addBox(-2.0F, -98.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.1F, false);
        cube_r2.texOffs(28, 17).addBox(-2.0F, -102.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
        cube_r2.texOffs(28, 86).addBox(-2.0F, -104.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r2.texOffs(28, 0).addBox(-2.5F, -96.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        boti = new ModelRenderer(this);
        boti.setPos(0.0F, 24.0F, 0.0F);
        boti.texOffs(426, 0).addBox(-20.0F, -86.0F, -1.0F, 41.0F, 86.0F, 2.0F, 0.0F, false);
}
    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
    @Override
    public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
        matrixStack.pushPose();
        EnumDoorState state = exterior.getOpen();
        matrixStack.translate(0.0D, 0.3D, 0.0D);
        matrixStack.scale(0.8F, 0.8F, 0.8F);
        switch (state) {
            case ONE:
                this.RightDoor.yRot = (float) Math.toRadians(90.0);
                this.LeftDoor.yRot = (float) Math.toRadians(0.0);
                break;
            case BOTH:
                this.RightDoor.yRot = (float) Math.toRadians(90.0);
                this.LeftDoor.yRot = (float) Math.toRadians(-90.0);
                break;
            case CLOSED:
                this.RightDoor.yRot = (float) Math.toRadians(0);
                this.LeftDoor.yRot = (float) Math.toRadians(0);
        }
        base.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
        LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
        RightDoor.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//        boti.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
        matrixStack.translate(-0.3,-0.4,0);
//        doorsright.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
//        doorsleft.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);

        matrixStack.popPose();

    }
    public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
        if(exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
            PortalInfo info = new PortalInfo();
            info.setPosition(exterior.getBlockPos());
            info.setWorldShell(exterior.getBotiWorld());

            info.setTranslate(matrix -> {
                matrix.translate(-0.5, 0.1, -0.5);
                ExteriorRenderer.applyTransforms(matrix, exterior);
            });
            //Interior Portal Position
            info.setTranslatePortal(matrix -> {
                matrixStack.scale(1,1,1);
                matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
                matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
                matrix.translate(-0.5, -0.4, -0.5);
            });
            //Exterior Portal Location
            info.setRenderPortal((matrix, buf) -> {
                matrix.pushPose();
                matrix.scale(0.3f, 0.4f, 0.3f);
//                this.boti.render(matrix, buf.getBuffer(RenderType.entityCutout(CoralRenderer.TEXTURE)), packedLight, packedOverlay);
                this.boti.render(matrix, buf.getBuffer(RenderType.entityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
                matrix.popPose();
            });
            //Interior Doors Location
//			info.setRenderDoor((matrix, buf) -> {
//				matrix.pushPose();
//				matrix.scale(0.8F, 0.8F, 0.8F);
//				this.Doors.render(matrix, buf.getBuffer(RenderType.entityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
//				matrix.popPose();
//			});

            BOTIRenderer.addPortal(info);
        }

    }

//    @Override
//    public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
//        if (exterior.getBotiWorld() != null && exterior.getMatterState() == EnumMatterState.SOLID && exterior.getOpen() != EnumDoorState.CLOSED) {
//            PortalInfo info = new PortalInfo();
//            info.setPosition(exterior.getBlockPos());
//            info.setWorldShell(exterior.getBotiWorld());
//            info.setTranslate((matrix) -> {
//                matrix.mulPose(Vector3f.YP.rotationDegrees(90));
//                matrix.translate(-0.5, 0.0, -0.5);
//                ExteriorRenderer.applyTransforms(matrix, exterior);
//                matrix.translate(0.0, -1.0, -0.05);
//            });
//            info.setTranslatePortal((matrix) -> {
//                matrix.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
//                matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())-90));
//                matrix.translate(-0.5, -1.5, -0.5);
//            });
//            info.setRenderPortal((matrix, buf) -> {
//                matrix.pushPose();
//                this.boti.render(matrix, buf.getBuffer(TRenderTypes.getTardis(Helper.getVariantTextureOr(exterior.getVariant(), CoralRenderer.TEXTURE))), packedLight, packedOverlay);
//                matrix.popPose();
//            });
//            BOTIRenderer.addPortal(info);
//        }
//    }
}