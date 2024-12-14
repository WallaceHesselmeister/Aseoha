package com.code.common.client.models;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.common.entities.DalekEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class DalekModel<T extends DalekEntity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dalekmodel"), "main");
    private final ModelPart Base;
    private final ModelPart BeamLocators;
    private final ModelPart cube_r1;
    private final ModelPart GunRack;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart cube_r4;
    private final ModelPart plunger;
    private final ModelPart multitool;
    private final ModelPart multitool2;
    private final ModelPart gunstick;
    private final ModelPart Head;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart Eyestalk;

    public DalekModel(ModelPart root) {
        this.Base = root.getChild("Base");
        this.BeamLocators = this.Base.getChild("BeamLocators");
        this.cube_r1 = this.BeamLocators.getChild("cube_r1");
        this.GunRack = root.getChild("GunRack");
        this.cube_r2 = this.GunRack.getChild("cube_r2");
        this.cube_r3 = this.GunRack.getChild("cube_r3");
        this.cube_r4 = this.GunRack.getChild("cube_r4");
        this.plunger = this.GunRack.getChild("plunger");
        this.multitool = this.GunRack.getChild("multitool");
        this.multitool2 = this.GunRack.getChild("multitool2");
        this.gunstick = this.GunRack.getChild("gunstick");
        this.Head = root.getChild("Head");
        this.cube_r5 = this.Head.getChild("cube_r5");
        this.cube_r6 = this.Head.getChild("cube_r6");
        this.cube_r7 = this.Head.getChild("cube_r7");
        this.Eyestalk = this.Head.getChild("Eyestalk");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Base = partdefinition.addOrReplaceChild("Base", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -3.0F, -6.5F, 12.0F, 3.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(32, 24).addBox(-5.0F, -15.0F, -4.0F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition BeamLocators = Base.addOrReplaceChild("BeamLocators", CubeListBuilder.create().texOffs(0, 61).addBox(2.75F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(0.25F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-2.25F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-4.625F, -15.625F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-4.625F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-2.25F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(0.25F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(2.75F, -13.125F, -4.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 47).addBox(2.875F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(0.25F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-2.125F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-4.75F, -9.875F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-4.75F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-2.125F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(0.25F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(2.875F, -7.0F, -5.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.375F, 0.0F));

        PartDefinition cube_r1 = BeamLocators.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 61).addBox(-3.625F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-1.25F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(1.25F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(3.625F, -7.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(3.625F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(1.25F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-1.25F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-3.625F, -4.5F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 61).addBox(-4.375F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-1.75F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(1.0F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(3.625F, -1.25F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(3.625F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(1.0F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-1.75F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(0, 61).addBox(-4.375F, 1.625F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.625F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition GunRack = partdefinition.addOrReplaceChild("GunRack", CubeListBuilder.create().texOffs(0, 34).addBox(-4.5F, -2.0F, -4.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 74).addBox(-5.0F, -3.0F, -0.5F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 80).addBox(-4.5F, -6.0F, -0.5F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 14).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(29, 40).addBox(-3.5F, -6.0F, -3.5F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(44, 14).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 1.25F));

        PartDefinition cube_r2 = GunRack.addOrReplaceChild("cube_r2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.0F, -7.5F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r3 = GunRack.addOrReplaceChild("cube_r3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.0F, -7.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r4 = GunRack.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 80).addBox(-3.5F, -21.0F, -0.5F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 74).addBox(-3.75F, -18.0F, -0.5F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.0F, -1.25F, 0.0F, -1.5708F, 0.0F));

        PartDefinition plunger = GunRack.addOrReplaceChild("plunger", CubeListBuilder.create().texOffs(15, 62).addBox(-3.0F, -17.5F, -12.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F))
                .texOffs(31, 24).addBox(-4.0F, -18.5F, -13.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 17.0F, -1.25F));

        PartDefinition multitool = GunRack.addOrReplaceChild("multitool", CubeListBuilder.create().texOffs(15, 62).addBox(2.0F, -17.5F, -12.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offset(-5.0F, 17.0F, -1.25F));

        PartDefinition GunRack_r1 = multitool.addOrReplaceChild("GunRack_r1", CubeListBuilder.create().texOffs(40, 18).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -17.0F, -13.25F, 0.0F, 1.5708F, 2.0944F));

        PartDefinition GunRack_r2 = multitool.addOrReplaceChild("GunRack_r2", CubeListBuilder.create().texOffs(40, 18).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -17.0F, -13.25F, 0.0F, 1.5708F, 1.0472F));

        PartDefinition GunRack_r3 = multitool.addOrReplaceChild("GunRack_r3", CubeListBuilder.create().texOffs(40, 18).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -17.0F, -13.25F, 0.0F, 1.5708F, 0.0F));

        PartDefinition multitool2 = GunRack.addOrReplaceChild("multitool2", CubeListBuilder.create().texOffs(15, 62).addBox(2.0F, -17.5F, -12.25F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.01F)), PartPose.offset(-5.0F, 17.0F, -1.25F));

        PartDefinition GunRack_r4 = multitool2.addOrReplaceChild("GunRack_r4", CubeListBuilder.create().texOffs(46, 18).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -17.0F, -13.25F, 0.0F, 1.5708F, -2.0944F));

        PartDefinition GunRack_r5 = multitool2.addOrReplaceChild("GunRack_r5", CubeListBuilder.create().texOffs(46, 18).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -17.0F, -13.25F, 0.0F, 1.5708F, 2.0944F));

        PartDefinition GunRack_r6 = multitool2.addOrReplaceChild("GunRack_r6", CubeListBuilder.create().texOffs(46, 18).addBox(-1.0F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -17.0F, -13.25F, 0.0F, 1.5708F, 0.0F));

        PartDefinition gunstick = GunRack.addOrReplaceChild("gunstick", CubeListBuilder.create().texOffs(4, 0).addBox(-1.0F, 0.0F, -6.25F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-0.5F, -0.5F, -6.25F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.001F))
                .texOffs(0, 0).addBox(-1.0F, 0.0F, -6.25F, 2.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, -4.25F));

        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(38, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 3.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(57, 40).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 1.25F));

        PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 24).addBox(-2.25F, -0.625F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-3.0F, -2.625F, 0.0F, 0.0F, 0.0F, 0.9599F));

        PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 19).addBox(2.0F, 1.875F, -0.75F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -2.625F, -1.25F, 1.5708F, -0.7854F, -1.5708F));

        PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 24).addBox(-0.75F, -0.625F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(3.0F, -2.625F, 0.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition Eyestalk = Head.addOrReplaceChild("Eyestalk", CubeListBuilder.create().texOffs(0, 3).addBox(-0.5F, -27.75F, -2.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 51).addBox(-0.5F, -27.0F, -9.25F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(31, 17).addBox(-1.5F, -28.0F, -10.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-1.0F, -27.5F, -7.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-1.0F, -27.5F, -6.25F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -1.25F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(DalekEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw * (float) (Math.PI / 180.0);
        if(entity.getTarget() == null) return;
        double degY = Math.atan2(entity.getTarget().getY(), entity.getY());
        double degZ = Math.atan2(entity.getTarget().getZ(), entity.getZ());
        this.GunRack.yRot = (float) degY;
        this.GunRack.zRot = (float) degZ;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.GunRack.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}