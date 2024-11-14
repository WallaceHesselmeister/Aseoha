package com.code.common.client.models;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.common.K9Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import static com.code.aseoha.MOD_ID;

public class K9model<T extends K9Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MOD_ID, "k9model"), "main");
    private final ModelPart head;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart body;
    private final ModelPart base;
    private final ModelPart base2;
    private final ModelPart side1;
    private final ModelPart cube_r8;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart cube_r11;
    private final ModelPart side2;
    private final ModelPart cube_r12;
    private final ModelPart cube_r13;
    private final ModelPart cube_r14;
    private final ModelPart cube_r15;
    private final ModelPart tail;

    public K9model(ModelPart root) {
        this.head = root.getChild("head");
        this.cube_r1 = this.head.getChild("cube_r1");
        this.cube_r2 = this.head.getChild("cube_r2");
        this.cube_r3 = this.head.getChild("cube_r3");
        this.cube_r4 = this.head.getChild("cube_r4");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.cube_r7 = this.head.getChild("cube_r7");
        this.body = root.getChild("body");
        this.base = this.body.getChild("base");
        this.base2 = this.body.getChild("base2");
        this.side1 = this.body.getChild("side1");
        this.cube_r8 = this.side1.getChild("cube_r8");
        this.cube_r9 = this.side1.getChild("cube_r9");
        this.cube_r10 = this.side1.getChild("cube_r10");
        this.cube_r11 = this.side1.getChild("cube_r11");
        this.side2 = this.body.getChild("side2");
        this.cube_r12 = this.side2.getChild("cube_r12");
        this.cube_r13 = this.side2.getChild("cube_r13");
        this.cube_r14 = this.side2.getChild("cube_r14");
        this.cube_r15 = this.side2.getChild("cube_r15");
        this.tail = root.getChild("tail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -9.0F, -9.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 38).addBox(-1.0F, -5.0F, -8.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.5F, -14.0F, -13.75F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 23.5F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 11).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -12.0F, -11.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -14.0F, -12.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 11).addBox(1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -12.0F, -13.75F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 6).addBox(0.0F, -1.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -14.0F, -12.25F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -3.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -10.75F, -13.75F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(42, 51).addBox(-2.0F, -3.0F, -6.0F, 5.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -8.25F, -11.5F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(38, 0).addBox(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.25F, -9.75F, -0.7854F, 0.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition base = body.addOrReplaceChild("base", CubeListBuilder.create().texOffs(32, 17).addBox(-6.25F, 2.25F, -7.5F, 11.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.75F, -3.25F, 0.0F));

        PartDefinition base2 = body.addOrReplaceChild("base2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.75F, 1.25F, -8.0F, 11.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-7.25F, -6.75F, -8.0F, 8.0F, 5.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 55).addBox(-5.25F, -7.75F, -3.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(50, 33).addBox(-7.75F, -1.75F, -7.75F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 38).addBox(-7.75F, -1.75F, 6.75F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.25F, -2.75F, 0.0F));

        PartDefinition side1 = body.addOrReplaceChild("side1", CubeListBuilder.create(), PartPose.offset(3.25F, -2.75F, 0.0F));

        PartDefinition cube_r8 = side1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 38).addBox(1.5F, 1.75F, -8.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r9 = side1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 38).addBox(1.5F, -6.25F, -4.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r10 = side1.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 38).addBox(0.5F, -6.25F, 6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(32, 17).addBox(0.5F, -6.25F, -8.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r11 = side1.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(39, 0).addBox(2.5F, -1.25F, -8.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.25F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition side2 = body.addOrReplaceChild("side2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, -2.75F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r12 = side2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 50).addBox(1.5F, 1.75F, -8.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r13 = side2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(36, 33).addBox(1.5F, -6.25F, -4.0F, 1.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r14 = side2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 17).addBox(0.5F, -6.25F, 6.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 17).addBox(0.5F, -6.25F, -8.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r15 = side2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(39, 0).addBox(2.5F, -1.25F, -8.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, 16.5F, 9.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(K9Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}