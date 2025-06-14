/* (C) TAMA Studios 2025 */
package tama.Client.Models.Armor;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

import static tama.aseoha.MODID;

public class MondasCybermanArmorModel extends EntityModel<LivingEntity> {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer
    // and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(MODID, "mondascybermanarmor"), "main");
    private final ModelPart Player;
    public final ModelPart Head;
    private final ModelPart cyberhead;
    private final ModelPart head2;
    public final ModelPart Body;
    private final ModelPart cyberbody;
    private final ModelPart chestunit;
    private final ModelPart bone4;
    private final ModelPart left;
    private final ModelPart right2;
    private final ModelPart off2;
    private final ModelPart bone;
    private final ModelPart bone5;
    private final ModelPart right3;
    private final ModelPart left2;
    private final ModelPart bone2;
    private final ModelPart right4;
    private final ModelPart bone6;
    private final ModelPart left3;
    private final ModelPart bone3;
    private final ModelPart bone7;
    private final ModelPart left4;
    private final ModelPart right5;
    private final ModelPart off;
    private final ModelPart off3;
    private final ModelPart topright;
    private final ModelPart bottomright;
    private final ModelPart bottomleft;
    private final ModelPart topleft;
    private final ModelPart right;
    private final ModelPart bone8;
    private final ModelPart right6;
    private final ModelPart left5;
    public final ModelPart RightArm;
    private final ModelPart cyberrightarm;
    public final ModelPart LeftArm;
    private final ModelPart cyberleftarm;
    public final ModelPart RightLeg;
    private final ModelPart cyberrightleg;
    public final ModelPart LeftLeg;
    private final ModelPart cyberleftleg;

    public MondasCybermanArmorModel(ModelPart root) {
        this.Player = root.getChild("Player");
        this.Head = this.Player.getChild("Head");
        this.cyberhead = this.Head.getChild("cyberhead");
        this.head2 = this.cyberhead.getChild("head2");
        this.Body = this.Player.getChild("Body");
        this.cyberbody = this.Body.getChild("cyberbody");
        this.chestunit = this.cyberbody.getChild("chestunit");
        this.bone4 = this.cyberbody.getChild("bone4");
        this.left = this.bone4.getChild("left");
        this.right2 = this.bone4.getChild("right2");
        this.off2 = this.bone4.getChild("off2");
        this.bone = this.cyberbody.getChild("bone");
        this.bone5 = this.bone.getChild("bone5");
        this.right3 = this.bone.getChild("right3");
        this.left2 = this.bone.getChild("left2");
        this.bone2 = this.cyberbody.getChild("bone2");
        this.right4 = this.bone2.getChild("right4");
        this.bone6 = this.bone2.getChild("bone6");
        this.left3 = this.bone2.getChild("left3");
        this.bone3 = this.cyberbody.getChild("bone3");
        this.bone7 = this.bone3.getChild("bone7");
        this.left4 = this.bone3.getChild("left4");
        this.right5 = this.bone3.getChild("right5");
        this.off = this.cyberbody.getChild("off");
        this.off3 = this.off.getChild("off3");
        this.topright = this.off.getChild("topright");
        this.bottomright = this.off.getChild("bottomright");
        this.bottomleft = this.off.getChild("bottomleft");
        this.topleft = this.off.getChild("topleft");
        this.right = this.cyberbody.getChild("right");
        this.bone8 = this.right.getChild("bone8");
        this.right6 = this.right.getChild("right6");
        this.left5 = this.right.getChild("left5");
        this.RightArm = this.Player.getChild("RightArm");
        this.cyberrightarm = this.RightArm.getChild("cyberrightarm");
        this.LeftArm = this.Player.getChild("LeftArm");
        this.cyberleftarm = this.LeftArm.getChild("cyberleftarm");
        this.RightLeg = this.Player.getChild("RightLeg");
        this.cyberrightleg = this.RightLeg.getChild("cyberrightleg");
        this.LeftLeg = this.Player.getChild("LeftLeg");
        this.cyberleftleg = this.LeftLeg.getChild("cyberleftleg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Player = partdefinition.addOrReplaceChild(
                "Player", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Head =
                Player.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

        PartDefinition cyberhead = Head.addOrReplaceChild(
                "cyberhead",
                CubeListBuilder.create()
                        .texOffs(72, 15)
                        .addBox(-4.0F, -8.0F, -4.1F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 50)
                        .addBox(-4.0F, -8.0F, 4.1F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = cyberhead.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(72, 24)
                        .addBox(-4.0F, -5.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.1F, -3.0F, -0.1F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r2 = cyberhead.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(72, 35)
                        .addBox(-4.0F, -5.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.1F, -3.0F, -0.1F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r3 = cyberhead.addOrReplaceChild(
                "cube_r3",
                CubeListBuilder.create()
                        .texOffs(71, 60)
                        .addBox(-4.0F, -5.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -0.9F, 0.9F, 1.5708F, 0.0F, 0.0F));

        PartDefinition head2 = cyberhead.addOrReplaceChild(
                "head2",
                CubeListBuilder.create()
                        .texOffs(73, 72)
                        .addBox(-4.0F, -4.0F, -5.0F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(54, 71)
                        .addBox(0.475F, -0.8F, -1.55F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(54, 71)
                        .addBox(-5.375F, -0.8F, -1.55F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(6, 71)
                        .addBox(-5.35F, -5.9F, -1.05F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 71)
                        .addBox(5.45F, -5.9F, -1.05F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(45, 95)
                        .addBox(1.45F, -6.9F, -1.05F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 95)
                        .addBox(-5.35F, -6.9F, -1.05F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(18, 117)
                        .addBox(-0.95F, -8.075F, -3.05F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(5, 21)
                        .addBox(0.05F, -5.1F, -3.05F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(6, 87)
                        .addBox(0.05F, -6.4F, 2.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(32, 116)
                        .addBox(0.05F, -6.9F, -1.55F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.55F, -4.1F, 0.55F));

        PartDefinition Body =
                Player.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

        PartDefinition cyberbody = Body.addOrReplaceChild(
                "cyberbody",
                CubeListBuilder.create()
                        .texOffs(90, 31)
                        .addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(90, 31)
                        .addBox(-4.0F, 0.0F, 1.1F, 8.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(106, 89)
                        .addBox(-1.5F, 11.0F, -7.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition chestunit = cyberbody.addOrReplaceChild(
                "chestunit",
                CubeListBuilder.create()
                        .texOffs(62, 103)
                        .addBox(-4.0F, -22.0F, -6.0F, 8.0F, 9.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 88)
                        .addBox(-4.0F, -22.0F, -4.0F, 8.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(102, 44)
                        .addBox(-4.1F, -14.0F, -5.7F, 8.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, -0.1F));

        PartDefinition bone4 =
                cyberbody.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-3.0F, 5.0F, -4.1F));

        PartDefinition left = bone4.addOrReplaceChild(
                "left",
                CubeListBuilder.create()
                        .texOffs(96, 109)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right2 = bone4.addOrReplaceChild(
                "right2",
                CubeListBuilder.create()
                        .texOffs(96, 114)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition off2 = bone4.addOrReplaceChild(
                "off2",
                CubeListBuilder.create()
                        .texOffs(96, 106)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -1.0F));

        PartDefinition bone =
                cyberbody.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-3.0F, 7.0F, -5.1F));

        PartDefinition bone5 = bone.addOrReplaceChild(
                "bone5",
                CubeListBuilder.create()
                        .texOffs(89, 98)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right3 = bone.addOrReplaceChild(
                "right3",
                CubeListBuilder.create()
                        .texOffs(96, 114)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 1.0F));

        PartDefinition left2 = bone.addOrReplaceChild(
                "left2",
                CubeListBuilder.create()
                        .texOffs(96, 109)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 1.0F));

        PartDefinition bone2 =
                cyberbody.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(1.0F, 9.0F, -5.1F));

        PartDefinition right4 = bone2.addOrReplaceChild(
                "right4",
                CubeListBuilder.create()
                        .texOffs(96, 114)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.0F, 1.0F));

        PartDefinition bone6 = bone2.addOrReplaceChild(
                "bone6",
                CubeListBuilder.create()
                        .texOffs(122, 106)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition left3 = bone2.addOrReplaceChild(
                "left3",
                CubeListBuilder.create()
                        .texOffs(96, 109)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.0F, 1.0F));

        PartDefinition bone3 =
                cyberbody.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.0F, 9.0F, -5.1F));

        PartDefinition bone7 = bone3.addOrReplaceChild(
                "bone7",
                CubeListBuilder.create()
                        .texOffs(104, 108)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left4 = bone3.addOrReplaceChild(
                "left4",
                CubeListBuilder.create()
                        .texOffs(96, 109)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 1.0F));

        PartDefinition right5 = bone3.addOrReplaceChild(
                "right5",
                CubeListBuilder.create()
                        .texOffs(96, 114)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 1.0F));

        PartDefinition off =
                cyberbody.addOrReplaceChild("off", CubeListBuilder.create(), PartPose.offset(1.0F, 5.0F, -4.1F));

        PartDefinition off3 = off.addOrReplaceChild(
                "off3",
                CubeListBuilder.create()
                        .texOffs(112, 104)
                        .addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition topright = off.addOrReplaceChild(
                "topright",
                CubeListBuilder.create()
                        .texOffs(112, 109)
                        .addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -1.0F));

        PartDefinition bottomright = off.addOrReplaceChild(
                "bottomright",
                CubeListBuilder.create()
                        .texOffs(112, 114)
                        .addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottomleft = off.addOrReplaceChild(
                "bottomleft",
                CubeListBuilder.create()
                        .texOffs(112, 120)
                        .addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition topleft = off.addOrReplaceChild(
                "topleft",
                CubeListBuilder.create()
                        .texOffs(112, 125)
                        .addBox(0.0F, -2.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition right =
                cyberbody.addOrReplaceChild("right", CubeListBuilder.create(), PartPose.offset(-3.0F, 9.0F, -4.1F));

        PartDefinition bone8 = right.addOrReplaceChild(
                "bone8",
                CubeListBuilder.create()
                        .texOffs(96, 102)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, -1.0F));

        PartDefinition right6 = right.addOrReplaceChild(
                "right6",
                CubeListBuilder.create()
                        .texOffs(96, 114)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition left5 = right.addOrReplaceChild(
                "left5",
                CubeListBuilder.create()
                        .texOffs(96, 109)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RightArm =
                Player.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(-5.0F, -22.0F, 0.0F));

        PartDefinition cyberrightarm = RightArm.addOrReplaceChild(
                "cyberrightarm",
                CubeListBuilder.create()
                        .texOffs(47, 40)
                        .addBox(-4.0F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 15)
                        .addBox(-3.0F, -2.0F, -3.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 15)
                        .addBox(-3.0F, -2.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(87, 28)
                        .addBox(-3.0F, 9.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = cyberrightarm.addOrReplaceChild(
                "cube_r4",
                CubeListBuilder.create()
                        .texOffs(85, 15)
                        .addBox(-3.0F, -2.0F, 0.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r5 = cyberrightarm.addOrReplaceChild(
                "cube_r5",
                CubeListBuilder.create()
                        .texOffs(89, 15)
                        .addBox(-3.0F, -2.0F, 0.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition LeftArm =
                Player.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(5.0F, -22.0F, 0.0F));

        PartDefinition cyberleftarm = LeftArm.addOrReplaceChild(
                "cyberleftarm",
                CubeListBuilder.create()
                        .texOffs(92, 15)
                        .addBox(-1.0F, -2.0F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(87, 28)
                        .addBox(-1.0F, 9.1F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 15)
                        .addBox(-1.0F, -2.0F, -3.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(47, 40)
                        .addBox(-1.0F, -3.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r6 = cyberleftarm.addOrReplaceChild(
                "cube_r6",
                CubeListBuilder.create()
                        .texOffs(85, 15)
                        .addBox(-3.0F, -2.0F, 0.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r7 = cyberleftarm.addOrReplaceChild(
                "cube_r7",
                CubeListBuilder.create()
                        .texOffs(90, 15)
                        .addBox(-3.0F, -2.0F, 0.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r8 = cyberleftarm.addOrReplaceChild(
                "cube_r8",
                CubeListBuilder.create()
                        .texOffs(90, 15)
                        .addBox(-3.0F, -2.0F, 0.0F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.1F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition RightLeg =
                Player.addOrReplaceChild("RightLeg", CubeListBuilder.create(), PartPose.offset(-1.9F, -12.0F, 0.0F));

        PartDefinition cyberrightleg = RightLeg.addOrReplaceChild(
                "cyberrightleg",
                CubeListBuilder.create()
                        .texOffs(32, 73)
                        .addBox(1.8F, -1.1F, -2.1F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(20, 73)
                        .addBox(1.9F, -0.1F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r9 = cyberrightleg.addOrReplaceChild(
                "cube_r9",
                CubeListBuilder.create()
                        .texOffs(39, 73)
                        .addBox(-3.0F, -3.0F, 0.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.1F, 1.9F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r10 = cyberrightleg.addOrReplaceChild(
                "cube_r10",
                CubeListBuilder.create()
                        .texOffs(39, 73)
                        .addBox(-3.0F, -3.0F, 0.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.9F, 1.9F, 1.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition LeftLeg =
                Player.addOrReplaceChild("LeftLeg", CubeListBuilder.create(), PartPose.offset(1.9F, -12.0F, 0.0F));

        PartDefinition cyberleftleg = LeftLeg.addOrReplaceChild(
                "cyberleftleg",
                CubeListBuilder.create()
                        .texOffs(32, 73)
                        .addBox(-5.9F, -1.1F, -2.1F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(20, 73)
                        .addBox(-5.9F, -0.1F, 1.1F, 4.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r11 = cyberleftleg.addOrReplaceChild(
                "cube_r11",
                CubeListBuilder.create()
                        .texOffs(39, 73)
                        .addBox(-3.0F, -3.0F, 0.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.9F, 1.9F, -1.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r12 = cyberleftleg.addOrReplaceChild(
                "cube_r12",
                CubeListBuilder.create()
                        .texOffs(39, 73)
                        .addBox(-3.0F, -3.0F, 0.0F, 4.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.1F, 1.9F, -1.0F, 0.0F, 1.5708F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(
            @NotNull PoseStack poseStack,
            @NotNull VertexConsumer vertexConsumer,
            int packedLight,
            int packedOverlay,
            float red,
            float green,
            float blue,
            float alpha) {
        Player.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(
            @NotNull LivingEntity p_102618_,
            float p_102619_,
            float p_102620_,
            float p_102621_,
            float p_102622_,
            float p_102623_) {}

    public void makeInvisible(boolean invisible) {
        Head.visible = !invisible;
        Body.visible = !invisible;
        RightArm.visible = !invisible;
        LeftArm.visible = !invisible;
        RightLeg.visible = !invisible;
        LeftLeg.visible = !invisible;
        // RightBoot.visible = !invisible;
        // LeftBoot.visible = !invisible;
    }
}
