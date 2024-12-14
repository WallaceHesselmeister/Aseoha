package com.code.common.client.models;


import com.code.common.entities.DalekEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;


public class CybusCybermanModel<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "cyberman"), "main");
    private final ModelPart h_head;
    private final ModelPart Body;
    private final ModelPart RightArm;
    private final ModelPart LeftArm;
    private final ModelPart RightLeg;
    private final ModelPart LeftLeg;

    public CybusCybermanModel(ModelPart root) {
        this.h_head = root.getChild("h_head");
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
        this.RightLeg = root.getChild("RightLeg");
        this.LeftLeg = root.getChild("LeftLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition h_head = partdefinition.addOrReplaceChild("h_head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(15, 30).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F))
                .texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 1).addBox(-5.0F, -10.0F, -0.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 18).addBox(-3.0F, -10.0F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 10).addBox(-2.0F, -6.0F, -4.25F, 4.0F, 6.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(9, 10).addBox(-3.0F, -6.0F, -4.25F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(7, 8).addBox(-3.0F, -6.0F, -4.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(7, 8).addBox(2.0F, -6.0F, -4.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(6, 8).addBox(1.0F, -7.0F, -4.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(6, 8).addBox(-3.0F, -7.0F, -4.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(9, 10).addBox(2.0F, -8.0F, -4.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(9, 10).addBox(3.0F, -8.0F, -4.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(9, 10).addBox(-3.0F, -8.0F, -4.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(9, 10).addBox(-4.0F, -8.0F, -4.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(-4.0F, -7.0F, -4.25F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(8, 10).addBox(3.0F, -7.0F, -4.25F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(7, 8).addBox(-3.0F, -6.0F, -4.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(-4.25F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 2).addBox(-4.25F, -5.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 2).addBox(-4.25F, -5.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 2).addBox(2.25F, -5.0F, -2.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 2).addBox(2.25F, -5.0F, 1.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 2).addBox(2.25F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = h_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, -3.1416F, 0.0F, -3.0543F));

        PartDefinition cube_r2 = h_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

        PartDefinition cube_r3 = h_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.25F, -0.5F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r4 = h_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(25, 1).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -5.0F, 0.5F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(13, 33).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(5, 17).addBox(-2.0F, -1.0F, -2.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 17).addBox(1.0F, -1.0F, -2.25F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 17).addBox(-1.0F, 2.0F, -2.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(4, 28).addBox(-2.0F, 8.0F, -2.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(4, 28).addBox(-2.0F, 6.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(4, 28).addBox(1.0F, 6.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 30).addBox(-4.0F, 5.0F, -2.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(5, 30).addBox(2.0F, 5.0F, -2.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(5, 30).addBox(2.0F, 7.0F, -2.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(5, 30).addBox(-4.0F, 7.0F, -2.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 28).addBox(1.0F, 8.0F, -2.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 30).addBox(-4.0F, 9.0F, -2.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(5, 30).addBox(2.0F, 9.0F, -2.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(4, 27).addBox(-1.0F, 6.0F, -2.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 27).addBox(-2.0F, 3.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 27).addBox(1.0F, 3.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r5 = Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 15).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 2.0F, -1.25F, 0.0F, 0.0F, -0.3927F));

        PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 15).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 2.5F, -1.25F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r7 = Body.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(4, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.75F, -1.5F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r8 = Body.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(4, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 8.75F, -1.5F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r9 = Body.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(5, 17).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 2.25F, -1.75F, 0.0F, 0.0F, 0.3927F));

        PartDefinition cube_r10 = Body.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(5, 17).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.25F, 1.75F, -1.75F, 0.0F, 0.0F, -0.3927F));

        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(16, 32).addBox(-29.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(40, 32).addBox(-24.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(11, 51).addBox(-29.25F, -2.25F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(30, 48).addBox(-29.25F, -0.25F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(1, 1).addBox(-29.25F, -0.25F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 1).addBox(-29.25F, -0.25F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 40).addBox(-28.0F, 0.0F, -2.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(21, 39).addBox(-28.0F, 2.0F, -2.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(23, 46).addBox(-28.0F, 5.0F, -2.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 43).addBox(-29.0F, 5.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(-29.0F, 1.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(-26.0F, 1.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(-26.0F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(-29.0F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(21.0F, 2.0F, 0.0F));

        PartDefinition cube_r11 = RightArm.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(25, 46).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.25F, 10.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r12 = RightArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 46).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.25F, 11.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r13 = RightArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(25, 46).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.25F, 10.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r14 = RightArm.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(21, 39).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(21, 39).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.25F, 4.75F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r15 = RightArm.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 40).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.0F, 3.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r16 = RightArm.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 40).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-26.0F, 3.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r17 = RightArm.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(21, 39).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 45).addBox(0.0F, 4.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(23, 46).addBox(-2.0F, 3.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 39).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.0F, 2.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r18 = RightArm.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(22, 42).addBox(-3.0F, -2.0F, -1.0F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.75F, 7.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r19 = RightArm.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(25, 45).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.0F, 8.0F, -3.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r20 = RightArm.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(25, 45).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.0F, 8.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r21 = RightArm.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(25, 45).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.0F, 8.0F, -3.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r22 = RightArm.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(21, 43).addBox(-3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.25F, 7.0F, -1.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r23 = RightArm.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(21, 43).addBox(-3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-28.25F, 7.0F, -4.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r24 = RightArm.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(24, 43).addBox(-3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-31.0F, 7.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r25 = RightArm.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(39, 36).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.25F, -1.25F, -0.5F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r26 = RightArm.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(53, 40).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 31).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.0F, 7.0F, 1.5F, 0.0F, 0.0F, 0.0436F));

        PartDefinition cube_r27 = RightArm.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(52, 30).addBox(-1.0F, -3.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.0F, 6.25F, 1.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(48, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(21, 40).addBox(-1.0F, 1.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 39).addBox(0.0F, 2.0F, -2.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(2.0F, 1.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(2.0F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(-1.0F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(23, 46).addBox(-1.0F, 5.0F, -2.25F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 45).addBox(1.0F, 6.0F, -2.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 45).addBox(2.0F, 7.0F, -2.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 43).addBox(2.0F, 5.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 2.0F, 0.0F));

        PartDefinition cube_r28 = LeftArm.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(25, 46).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 10.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r29 = LeftArm.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(25, 46).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 10.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r30 = LeftArm.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(24, 46).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 39).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.25F, 11.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r31 = LeftArm.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(24, 43).addBox(-3.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(23, 46).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r32 = LeftArm.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(25, 45).addBox(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r33 = LeftArm.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(25, 45).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 40).addBox(-1.0F, -7.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 8.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r34 = LeftArm.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(21, 39).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(21, 39).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 4.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r35 = LeftArm.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(21, 40).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r36 = LeftArm.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(39, 36).addBox(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -1.25F, 0.5F, -3.1416F, 0.0F, -2.7489F));

        PartDefinition cube_r37 = LeftArm.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 48).addBox(-1.0F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(11, 51).addBox(-1.0F, -4.0F, -4.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.75F, -1.5F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r38 = LeftArm.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1, 1).addBox(-1.0F, -2.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 1.75F, -5.5F, 0.0F, 3.1416F, 0.0F));

        PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(16, 32).addBox(4.0F, -24.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 22.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 32).addBox(-2.25F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(0, 38).addBox(-1.25F, 1.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 35).addBox(-1.25F, 6.0F, -2.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.25F, 2.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.75F, 8.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-2.25F, 8.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-2.25F, 8.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.75F, 8.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.75F, 11.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-2.25F, 11.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-1.25F, 10.0F, -2.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.25F, 3.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-1.25F, 2.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 39).addBox(0.75F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 39).addBox(0.75F, 3.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 38).addBox(-2.25F, 0.0F, -2.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 38).addBox(-2.25F, 0.0F, 2.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 38).addBox(-2.25F, 0.0F, 0.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 38).addBox(-1.25F, 1.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-1.25F, 2.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.25F, 2.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.25F, 3.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 39).addBox(0.75F, 3.0F, 0.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

        PartDefinition cube_r39 = RightLeg.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r40 = RightLeg.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 12.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r41 = RightLeg.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 13.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r42 = RightLeg.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 11.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r43 = RightLeg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 12.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r44 = RightLeg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 11.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r45 = RightLeg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 11.1F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r46 = RightLeg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, 13.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r47 = RightLeg.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(22, 35).addBox(0.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.75F, 9.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(0, 32).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F))
                .texOffs(1, 39).addBox(-2.05F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 39).addBox(-1.05F, 3.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.05F, 2.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 38).addBox(-0.05F, 1.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-1.05F, 2.0F, -2.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 38).addBox(0.95F, 0.0F, -2.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 38).addBox(0.95F, 0.0F, 2.25F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 38).addBox(-0.05F, 1.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-0.05F, 2.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-1.05F, 2.0F, 0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 39).addBox(-2.05F, 3.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(1, 39).addBox(-1.05F, 3.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(22, 35).addBox(-1.05F, 6.0F, -2.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.95F, 8.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-2.05F, 8.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.95F, 8.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-2.05F, 8.0F, 2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-1.05F, 10.0F, -2.25F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.95F, 11.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(-2.05F, 11.0F, -2.25F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

        PartDefinition cube_r48 = LeftLeg.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(25, 42).addBox(0.0F, -5.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 13.0F, -2.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r49 = LeftLeg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 11.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r50 = LeftLeg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 12.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r51 = LeftLeg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(25, 42).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 11.1F, -1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r52 = LeftLeg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 35).addBox(0.0F, -3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.95F, 9.0F, 1.25F, 0.0F, 3.1416F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        h_head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}