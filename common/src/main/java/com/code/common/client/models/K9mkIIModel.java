package com.code.common.client.models;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.common.entities.K9Entity;
import com.code.common.entities.K9MkIIEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class K9mkIIModel<T extends K9MkIIEntity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MOD_ID, "k9mkiimodel"), "main");
    private final ModelPart Base;
    private final ModelPart head;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart bone3;
    private final ModelPart body;
    private final ModelPart base2;
    private final ModelPart bone;
    private final ModelPart bone4;
    private final ModelPart bone2;
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

    public K9mkIIModel(ModelPart root) {
        this.Base = root.getChild("Base");
        this.head = this.Base.getChild("head");
        this.cube_r1 = this.head.getChild("cube_r1");
        this.cube_r2 = this.head.getChild("cube_r2");
        this.cube_r3 = this.head.getChild("cube_r3");
        this.cube_r4 = this.head.getChild("cube_r4");
        this.cube_r5 = this.head.getChild("cube_r5");
        this.cube_r6 = this.head.getChild("cube_r6");
        this.cube_r7 = this.head.getChild("cube_r7");
        this.bone3 = this.cube_r7.getChild("bone3");
        this.body = this.Base.getChild("body");
        this.base2 = this.body.getChild("base2");
        this.bone = this.base2.getChild("bone");
        this.bone4 = this.bone.getChild("bone4");
        this.bone2 = this.base2.getChild("bone2");
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
        this.tail = this.Base.getChild("tail");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Base = partdefinition.addOrReplaceChild("Base", CubeListBuilder.create().texOffs(8, 38).addBox(-1.0F, -5.0F, -8.8F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 22.5F, 1.0F));

        PartDefinition head_r1 = Base.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, -2.4F, -0.9F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.2F, -7.6F, -0.3491F, 0.0F, 0.0F));

        PartDefinition head = Base.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -6.6176F, -7.7118F));

        PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(2, 2).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.899F, -1.578F, -0.1309F, 0.0F, 0.0F));

        PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(2, 2).addBox(-2.5F, -3.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.899F, -1.578F, 0.1309F, 0.0F, 0.0F));

        PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(2, 2).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.8733F, -1.9696F, 0.0436F, 0.0F, 0.0F));

        PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(2, 2).addBox(-2.5F, 0.0F, -0.6F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(1, 1).addBox(-2.5F, 0.0F, 0.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.4824F, -4.9382F, 0.1745F, 0.0F, 0.0F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(10, 11).addBox(0.2222F, -4.1F, 0.7778F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.25F, -4.8824F, -3.2882F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(13, 6).addBox(0.7778F, 0.4F, 0.2778F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, -7.3824F, -4.5382F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 11).addBox(1.7778F, -4.1F, 0.7778F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -4.8824F, -6.0382F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 6).addBox(-0.7778F, 0.4F, 0.2778F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.5F, -7.3824F, -4.5382F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 6).addBox(-2.0F, -2.4724F, 0.3197F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 6).addBox(-2.0F, -1.4724F, 0.3197F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.0324F, -6.6382F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r7_r1 = cube_r5.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(38, 8).addBox(-0.5F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 8).addBox(1.5F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 8).addBox(0.5F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 8).addBox(2.3F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 8).addBox(3.3F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.4F, -1.45F, -0.4F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r10_r1 = cube_r5.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(38, 8).addBox(-0.7F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 8).addBox(-1.7F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 8).addBox(-2.5F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 8).addBox(-3.5F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 8).addBox(-4.5F, 0.8063F, 0.0601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.6F, -2.45F, -0.4F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r7_r2 = cube_r5.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(42, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.4724F, 0.7197F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(44, 53).addBox(-2.0F, -2.0075F, -4.1827F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(47, 54).addBox(0.0F, -2.6602F, -4.9523F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.6324F, -3.7882F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r11_r1 = cube_r6.addOrReplaceChild("cube_r11_r1", CubeListBuilder.create().texOffs(48, 59).addBox(-2.5F, 2.7682F, 0.3848F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 58).addBox(-2.5F, 1.3682F, 0.3848F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.0844F, -6.44F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r9_r1 = cube_r6.addOrReplaceChild("cube_r9_r1", CubeListBuilder.create().texOffs(48, 57).addBox(-2.5F, 0.0738F, 0.9409F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 57).addBox(-2.5F, -0.3262F, 0.9409F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.4228F, -5.9395F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r7_r3 = cube_r6.addOrReplaceChild("cube_r7_r3", CubeListBuilder.create().texOffs(45, 54).addBox(-2.5F, 1.1541F, -2.6705F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -4.0F, -2.5F, 0.1745F, 0.0F, 0.0F));

        PartDefinition cube_r9_r2 = cube_r6.addOrReplaceChild("cube_r9_r2", CubeListBuilder.create().texOffs(48, 57).addBox(-2.5F, -1.4226F, -1.273F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 57).addBox(-2.5F, -0.8226F, 0.327F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 57).addBox(-2.5F, -0.4226F, 0.427F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.5F, 0.1F, 0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3676F, -2.0382F, -0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r11_r2 = cube_r7.addOrReplaceChild("cube_r11_r2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5314F, -1.2814F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3101F, -1.3079F, -0.0928F, 0.0924F, -2.3605F));

        PartDefinition cube_r10_r2 = cube_r7.addOrReplaceChild("cube_r10_r2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5314F, -0.7814F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0607F, -1.25F, -1.3F, -0.0928F, 0.0924F, -2.3605F));

        PartDefinition cube_r9_r3 = cube_r7.addOrReplaceChild("cube_r9_r3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4686F, -0.7814F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.25F, -1.3F, -0.0928F, -0.0924F, 2.3605F));

        PartDefinition cube_r10_r3 = cube_r7.addOrReplaceChild("cube_r10_r3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4686F, -1.2814F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0607F, -1.3101F, -1.3079F, -0.0928F, -0.0924F, 2.3605F));

        PartDefinition cube_r8_r1 = cube_r7.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4556F, -0.75F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0126F, -1.2801F, -1.304F, 0.0F, -0.1309F, 1.5708F));

        PartDefinition cube_r9_r4 = cube_r7.addOrReplaceChild("cube_r9_r4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4556F, -1.25F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0732F, -1.2801F, -1.304F, 0.0F, -0.1309F, 1.5708F));

        PartDefinition cube_r8_r2 = cube_r7.addOrReplaceChild("cube_r8_r2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -1.2056F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0303F, -1.2375F, -1.2984F, 0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r7_r4 = cube_r7.addOrReplaceChild("cube_r7_r4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -0.7056F, -0.5794F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0303F, -1.3226F, -1.3096F, 0.1309F, 0.0F, 0.0F));

        PartDefinition bone3 = cube_r7.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(0.0F, -1.25F, -1.3F));

        PartDefinition cube_r9_r5 = bone3.addOrReplaceChild("cube_r9_r5", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5F, -1.2056F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(39, 0).addBox(-0.5F, -0.7056F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r11_r3 = bone3.addOrReplaceChild("cube_r11_r3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.5314F, -0.7814F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(39, 0).addBox(-0.5314F, -1.2814F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0928F, 0.0924F, -2.3605F));

        PartDefinition cube_r10_r4 = bone3.addOrReplaceChild("cube_r10_r4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4556F, -1.25F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(39, 0).addBox(-0.4556F, -0.75F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 1.5708F));

        PartDefinition cube_r11_r4 = bone3.addOrReplaceChild("cube_r11_r4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.4686F, -1.2814F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(39, 0).addBox(-0.4686F, -0.7814F, 3.4206F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0928F, -0.0924F, 2.3605F));

        PartDefinition body = Base.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 0.0F));

        PartDefinition base2 = body.addOrReplaceChild("base2", CubeListBuilder.create().texOffs(7, 23).addBox(-6.25F, -6.7476F, -6.7034F, 6.0F, 5.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(16, 32).addBox(-6.25F, -6.7476F, -7.0534F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 32).addBox(-6.25F, -6.7476F, 3.4966F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 32).addBox(-2.85F, -7.1476F, 2.8966F, 3.0F, 5.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(15, 32).addBox(-6.65F, -7.1476F, 2.8966F, 5.0F, 5.0F, 1.0F, new CubeDeformation(-0.401F))
                .texOffs(0, 55).addBox(-5.25F, -7.75F, -4.3F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(4, 59).addBox(-5.75F, -8.75F, -6.3F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-1.0F)), PartPose.offset(3.25F, -2.75F, 0.0F));

        PartDefinition base4_r1 = base2.addOrReplaceChild("base4_r1", CubeListBuilder.create().texOffs(4, 59).addBox(-2.5F, -2.0F, -1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(-3.25F, -3.2329F, 4.4751F, -1.309F, 0.0F, 0.0F));

        PartDefinition base3_r1 = base2.addOrReplaceChild("base3_r1", CubeListBuilder.create().texOffs(30, 66).addBox(-4.5F, 0.0F, -4.0F, 9.0F, 0.0F, 9.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(-3.25F, -5.8F, -0.8F, 3.1416F, 0.0F, 0.0F));

        PartDefinition base3_r2 = base2.addOrReplaceChild("base3_r2", CubeListBuilder.create().texOffs(16, 32).addBox(-3.0F, -2.1F, 0.05F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, -4.25F, 3.3F, 0.2182F, 0.0F, 0.0F));

        PartDefinition base3_r3 = base2.addOrReplaceChild("base3_r3", CubeListBuilder.create().texOffs(16, 15).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 1.75F, 6.75F, -0.7854F, 0.0F, 0.0F));

        PartDefinition base3_r4 = base2.addOrReplaceChild("base3_r4", CubeListBuilder.create().texOffs(16, 15).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.25F, 1.75F, -8.85F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone = base2.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(50, 33).addBox(-5.25F, 0.35F, -4.0875F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 33).addBox(-5.25F, 0.25F, -4.0875F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 33).addBox(-5.25F, 3.35F, -4.3875F, 9.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 31).addBox(-3.75F, -4.75F, -4.2375F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(15, 31).mirror().addBox(-3.75F, -4.75F, -4.4875F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, -1.139F, -3.7004F, -0.2182F, 0.0F, 0.0F));

        PartDefinition base4_r2 = bone.addOrReplaceChild("base4_r2", CubeListBuilder.create().texOffs(15, 30).addBox(-2.0F, -0.2F, -0.9F, 4.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.75F, -0.05F, -3.9375F, -0.1309F, 0.0F, 0.0F));

        PartDefinition cube_r12_r1 = bone.addOrReplaceChild("cube_r12_r1", CubeListBuilder.create().texOffs(73, 20).mirror().addBox(-1.9397F, -5.242F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.9862F, 0.1965F, -3.4875F, 0.0F, 0.0F, -0.3491F));

        PartDefinition cube_r11_r5 = bone.addOrReplaceChild("cube_r11_r5", CubeListBuilder.create().texOffs(73, 20).addBox(-0.0603F, -5.242F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.4862F, 0.1965F, -3.4875F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-11.6564F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
                .texOffs(0, 80).mirror().addBox(-11.6564F, -0.48F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
                .texOffs(1, 87).mirror().addBox(-11.6564F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
                .texOffs(0, 79).mirror().addBox(-11.3964F, -0.74F, -0.76F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(1, 80).addBox(-5.26F, -0.74F, -0.76F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.01F))
                .texOffs(0, 80).addBox(-6.0F, -0.48F, -1.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(1, 86).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(16, 80).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(4.5782F, 4.4572F, -3.7375F));

        PartDefinition cube_r15_r1 = bone4.addOrReplaceChild("cube_r15_r1", CubeListBuilder.create().texOffs(1, 81).addBox(5.3282F, 2.9736F, -15.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(0, 83).addBox(5.3282F, 2.4736F, -15.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(0, 80).addBox(-0.6718F, 2.9936F, -15.0858F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(1, 80).addBox(0.0682F, 2.7336F, -14.8458F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.01F))
                .texOffs(0, 79).mirror().addBox(-6.0682F, 2.7336F, -14.8458F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(0, 85).mirror().addBox(-6.3282F, 2.4736F, -15.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
                .texOffs(0, 80).mirror().addBox(-6.3282F, 2.9936F, -15.0858F, 7.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
                .texOffs(0, 82).mirror().addBox(-6.3282F, 2.9736F, -15.0858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-5.3078F, -0.3994F, 0.0365F, 2.7053F, 0.0F, -3.1416F));

        PartDefinition cube_r15_r2 = bone4.addOrReplaceChild("cube_r15_r2", CubeListBuilder.create().texOffs(0, 80).addBox(-0.9218F, -0.448F, -14.8062F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 81).mirror().addBox(-6.0782F, -0.448F, -14.8062F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.3078F, -0.3994F, 0.0365F, 2.9234F, 0.0F, -3.1416F));

        PartDefinition cube_r14_r1 = bone4.addOrReplaceChild("cube_r14_r1", CubeListBuilder.create().texOffs(0, 80).addBox(-6.0F, -0.5F, -1.0F, 7.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 81).mirror().addBox(-11.1564F, -0.5F, -1.0F, 6.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.25F, -0.4346F, 0.6181F, 0.2182F, 0.0F, 0.0F));

        PartDefinition bone2 = base2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, -1.139F, 8.0996F, -0.2182F, 0.0F, 0.0F));

        PartDefinition base5_r1 = bone2.addOrReplaceChild("base5_r1", CubeListBuilder.create().texOffs(53, 33).addBox(-6.0577F, 8.6947F, -1.2013F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 33).addBox(-5.0577F, 8.6947F, -1.2013F, 7.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 33).addBox(-5.3577F, 5.5947F, -1.7013F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1077F, -5.3612F, -4.4625F, 0.4363F, 0.0F, 0.0F));

        PartDefinition cube_r15_r3 = bone2.addOrReplaceChild("cube_r15_r3", CubeListBuilder.create().texOffs(8, 21).mirror().addBox(-1.9397F, -2.2962F, -1.829F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0342F, -0.2011F, -2.0287F, 0.9366F, 0.1451F, -0.3186F));

        PartDefinition cube_r14_r2 = bone2.addOrReplaceChild("cube_r14_r2", CubeListBuilder.create().texOffs(8, 21).addBox(-0.0603F, -2.2962F, -1.829F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -0.2863F, -2.0685F, 0.9366F, -0.1451F, 0.3186F));

        PartDefinition cube_r14_r3 = bone2.addOrReplaceChild("cube_r14_r3", CubeListBuilder.create().texOffs(8, 17).addBox(-0.0603F, -5.092F, -2.7F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 22).addBox(-0.0603F, -0.342F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -0.2863F, -2.0685F, 0.413F, -0.1451F, 0.3186F));

        PartDefinition cube_r14_r4 = bone2.addOrReplaceChild("cube_r14_r4", CubeListBuilder.create().texOffs(8, 22).mirror().addBox(-1.9397F, -0.342F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0342F, -0.2011F, -2.0287F, 0.413F, 0.1451F, -0.3186F));

        PartDefinition cube_r14_r5 = bone2.addOrReplaceChild("cube_r14_r5", CubeListBuilder.create().texOffs(32, 17).mirror().addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-2.6518F, -3.8101F, -5.3667F, 0.4272F, -0.0916F, 0.1983F));

        PartDefinition cube_r13_r1 = bone2.addOrReplaceChild("cube_r13_r1", CubeListBuilder.create().texOffs(32, 17).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.186F, -3.7249F, -5.327F, 0.4272F, 0.0916F, -0.1983F));

        PartDefinition cube_r12_r2 = bone2.addOrReplaceChild("cube_r12_r2", CubeListBuilder.create().texOffs(32, 17).addBox(-1.9397F, -5.092F, -2.7F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0342F, -0.2011F, -2.0287F, 0.413F, 0.1451F, -0.3186F));

        PartDefinition side1 = body.addOrReplaceChild("side1", CubeListBuilder.create(), PartPose.offset(3.25F, -2.75F, 0.0F));

        PartDefinition cube_r8 = side1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(50, 38).addBox(1.5F, 1.75F, -9.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r9_r6 = cube_r8.addOrReplaceChild("cube_r9_r6", CubeListBuilder.create().texOffs(50, 38).addBox(-1.1881F, -0.8592F, -7.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.25F, -2.0F, 0.0F, 0.0F, -0.48F));

        PartDefinition cube_r9 = side1.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 39).addBox(0.5549F, -6.5824F, -5.0534F, 1.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(11, 49).addBox(0.5549F, -6.5824F, 5.4966F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F))
                .texOffs(30, 55).addBox(0.5549F, -5.5824F, -1.0534F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(14, 54).addBox(1.4209F, -5.3236F, -1.0534F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0483F, 0.0129F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r10 = side1.addOrReplaceChild("cube_r10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r11 = side1.addOrReplaceChild("cube_r11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.25F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r13_r2 = cube_r11.addOrReplaceChild("cube_r13_r2", CubeListBuilder.create().texOffs(39, 0).addBox(-0.766F, -2.1428F, -7.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9627F, 0.3647F, -2.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition cube_r12_r3 = cube_r11.addOrReplaceChild("cube_r12_r3", CubeListBuilder.create().texOffs(39, 0).addBox(-0.9914F, -1.5695F, -7.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9627F, 0.3647F, -2.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition side2 = body.addOrReplaceChild("side2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.25F, -2.75F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r12 = side2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(28, 50).addBox(1.5F, 1.75F, -7.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r13_r3 = cube_r12.addOrReplaceChild("cube_r13_r3", CubeListBuilder.create().texOffs(28, 50).addBox(-1.1881F, -0.8592F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 2.25F, -2.0F, 0.0F, 0.0F, -0.48F));

        PartDefinition cube_r13 = side2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(37, 34).addBox(0.5049F, -6.5824F, -1.9466F, 1.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(47, 44).addBox(0.505F, -6.5824F, -2.4966F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.001F))
                .texOffs(1, 48).addBox(-1.9901F, -9.3324F, -4.3966F, 7.0F, 12.0F, 15.0F, new CubeDeformation(-3.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r14 = side2.addOrReplaceChild("cube_r14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r15 = side2.addOrReplaceChild("cube_r15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0F, 2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition cube_r16_r1 = cube_r15.addOrReplaceChild("cube_r16_r1", CubeListBuilder.create().texOffs(39, 0).addBox(-0.9763F, -1.4836F, -5.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.138F, 0.2638F, -2.0F, 0.0F, 0.0F, 0.48F));

        PartDefinition cube_r15_r4 = cube_r15.addOrReplaceChild("cube_r15_r4", CubeListBuilder.create().texOffs(39, 0).addBox(-0.766F, -2.1428F, -5.0F, 0.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.138F, 0.2638F, -2.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition tail = Base.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(52, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -5.8F, 5.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(@NotNull K9MkIIEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.zRot = ((float) Math.toRadians(entity.isDead ? 50f : -37.5));
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Base.zScale = 1.2f;
        Base.yScale = 1.2f;
        Base.xScale = 1.2f;
        Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}