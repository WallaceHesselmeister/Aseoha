package tama.Client.Models.Exteriors;

import net.minecraft.client.renderer.RenderType;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.tardis.mod.client.animations.exterior.ImpalaExteriorAnimation;
import net.tardis.mod.entity.CarExteriorEntity;
import net.tardis.mod.helpers.WorldHelper;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import tama.aseoha;

public class DeLoreanExteriorModel<T extends CarExteriorEntity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(aseoha.MODID, "delorean"), "main");
    private final ModelPart root;
    private final ModelPart LicensePlatePart1;
    private final ModelPart BTTFPartIII;
    private final ModelPart wheelsBTTFIII;
    private final ModelPart frontWheelsBTTF3;
    private final ModelPart FrontRightWheel2;
    private final ModelPart FrontLeftWheel2;
    private final ModelPart backWheelsBTTF3;
    private final ModelPart BackLeftWheel;
    private final ModelPart BackRightWheel;
    private final ModelPart wheelsBTTF1;
    private final ModelPart frontWheels;
    private final ModelPart FrontRightWheel;
    private final ModelPart FrontLeftWheel;
    private final ModelPart backWheels;
    private final ModelPart bone5;
    private final ModelPart bone12;
    private final ModelPart Hook;
    private final ModelPart ReactorBase;
    private final ModelPart PlutoniumTankCap;
    private final ModelPart MrFusion;
    private final ModelPart Base;
    private final ModelPart Back2;
    private final ModelPart bone6;
    private final ModelPart bone7;
    private final ModelPart thruster;
    private final ModelPart pipes;
    private final ModelPart pipe1;
    private final ModelPart pipe11;
    private final ModelPart pipe2;
    private final ModelPart pipe3;
    private final ModelPart pipe4;
    private final ModelPart pipe5;
    private final ModelPart pipe6;
    private final ModelPart pipe7;
    private final ModelPart pipe8;
    private final ModelPart pipe9;
    private final ModelPart pipe10;
    private final ModelPart thruster2;
    private final ModelPart Reactor;
    private final ModelPart bone;
    private final ModelPart steering;
    private final ModelPart SteeringWheel;
    private final ModelPart DMC;
    private final ModelPart LeftDoor;
    private final ModelPart RightDoor;
    private final ModelPart bone4;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone9;
    private final ModelPart bone8;
    private final ModelPart base1;
    private final ModelPart bone15;
    private final ModelPart bone11;
    private final ModelPart bone10;
    private final ModelPart bone14;
    private final ModelPart bone13;

    public DeLoreanExteriorModel(ModelPart root) {
        this.root = root.getChild("root");
        this.LicensePlatePart1 = this.root.getChild("LicensePlatePart1");
        this.BTTFPartIII = this.root.getChild("BTTFPartIII");
        this.wheelsBTTFIII = this.root.getChild("wheelsBTTFIII");
        this.frontWheelsBTTF3 = this.wheelsBTTFIII.getChild("frontWheelsBTTF3");
        this.FrontRightWheel2 = this.frontWheelsBTTF3.getChild("FrontRightWheel2");
        this.FrontLeftWheel2 = this.frontWheelsBTTF3.getChild("FrontLeftWheel2");
        this.backWheelsBTTF3 = this.wheelsBTTFIII.getChild("backWheelsBTTF3");
        this.BackLeftWheel = this.backWheelsBTTF3.getChild("BackLeftWheel");
        this.BackRightWheel = this.backWheelsBTTF3.getChild("BackRightWheel");
        this.wheelsBTTF1 = this.root.getChild("wheelsBTTF1");
        this.frontWheels = this.wheelsBTTF1.getChild("frontWheels");
        this.FrontRightWheel = this.frontWheels.getChild("FrontRightWheel");
        this.FrontLeftWheel = this.frontWheels.getChild("FrontLeftWheel");
        this.backWheels = this.wheelsBTTF1.getChild("backWheels");
        this.bone5 = this.backWheels.getChild("bone5");
        this.bone12 = this.backWheels.getChild("bone12");
        this.Hook = this.root.getChild("Hook");
        this.ReactorBase = this.root.getChild("ReactorBase");
        this.PlutoniumTankCap = this.ReactorBase.getChild("PlutoniumTankCap");
        this.MrFusion = this.root.getChild("MrFusion");
        this.Base = this.root.getChild("Base");
        this.Back2 = this.Base.getChild("Back2");
        this.bone6 = this.Back2.getChild("bone6");
        this.bone7 = this.Back2.getChild("bone7");
        this.thruster = this.Back2.getChild("thruster");
        this.pipes = this.thruster.getChild("pipes");
        this.pipe1 = this.pipes.getChild("pipe1");
        this.pipe11 = this.pipes.getChild("pipe11");
        this.pipe2 = this.pipes.getChild("pipe2");
        this.pipe3 = this.pipes.getChild("pipe3");
        this.pipe4 = this.pipes.getChild("pipe4");
        this.pipe5 = this.pipes.getChild("pipe5");
        this.pipe6 = this.pipes.getChild("pipe6");
        this.pipe7 = this.pipes.getChild("pipe7");
        this.pipe8 = this.pipes.getChild("pipe8");
        this.pipe9 = this.pipes.getChild("pipe9");
        this.pipe10 = this.pipes.getChild("pipe10");
        this.thruster2 = this.Back2.getChild("thruster2");
        this.Reactor = this.Back2.getChild("Reactor");
        this.bone = this.Base.getChild("bone");
        this.steering = this.Base.getChild("steering");
        this.SteeringWheel = this.steering.getChild("SteeringWheel");
        this.DMC = this.Base.getChild("DMC");
        this.LeftDoor = this.Base.getChild("LeftDoor");
        this.RightDoor = this.Base.getChild("RightDoor");
        this.bone4 = this.Base.getChild("bone4");
        this.bone2 = this.bone4.getChild("bone2");
        this.bone3 = this.bone4.getChild("bone3");
        this.bone9 = this.bone4.getChild("bone9");
        this.bone8 = this.bone4.getChild("bone8");
        this.base1 = this.Base.getChild("base1");
        this.bone15 = this.base1.getChild("bone15");
        this.bone11 = this.bone15.getChild("bone11");
        this.bone10 = this.bone15.getChild("bone10");
        this.bone14 = this.bone15.getChild("bone14");
        this.bone13 = this.bone15.getChild("bone13");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition LicensePlatePart1 = root.addOrReplaceChild("LicensePlatePart1", CubeListBuilder.create(), PartPose.offset(1.0481F, -10.691F, 52.7621F));

        PartDefinition cube_r1 = LicensePlatePart1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(345, 113).addBox(-25.5F, -20.15F, 10.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-28.05F, 12.15F, -18.65F, -1.5708F, 0.0F, 3.1416F));

        PartDefinition cube_r2 = LicensePlatePart1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(345, 113).addBox(-25.5F, -20.15F, 9.7F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.101F)), PartPose.offsetAndRotation(-28.05F, 10.35F, -18.65F, -1.5708F, 0.0F, 3.1416F));

        PartDefinition cube_r3 = LicensePlatePart1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(304, 53).addBox(-40.25F, -27.15F, -2.3F, 28.0F, 27.0F, 28.0F, new CubeDeformation(-12.75F)), PartPose.offsetAndRotation(-28.7F, 11.7F, -13.0F, -1.5708F, 0.0F, 3.1416F));

        PartDefinition cube_r4 = LicensePlatePart1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(276, 53).addBox(-40.25F, -27.15F, -2.3F, 28.0F, 27.0F, 28.0F, new CubeDeformation(-12.75F)), PartPose.offsetAndRotation(-26.2F, 11.7F, -13.0F, -1.5708F, 0.0F, 3.1416F));

        PartDefinition BTTFPartIII = root.addOrReplaceChild("BTTFPartIII", CubeListBuilder.create().texOffs(6, 17).addBox(-4.75F, -3.75F, 4.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 1).addBox(-4.75F, -3.75F, 2.25F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 5).addBox(-4.75F, -2.75F, -6.75F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(9, 0).addBox(-0.5F, -3.25F, -5.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 22).addBox(2.75F, -2.25F, -6.5F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(22, 24).addBox(-2.0F, -2.25F, -2.75F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(24, 18).addBox(-2.0F, -2.75F, -2.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(24, 21).addBox(0.0F, -2.75F, -2.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(4, 17).addBox(-4.5F, -3.75F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-4.5F, -3.75F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 9).addBox(-4.25F, -3.55F, 0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(33, 18).addBox(-0.75F, -3.55F, 5.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(23, 9).addBox(-4.25F, -3.55F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(19, 17).addBox(-4.5F, -3.55F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(31, 9).addBox(-4.5F, -3.55F, -3.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 13).addBox(-3.25F, -3.75F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 15).addBox(-3.25F, -3.75F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(17, 11).addBox(-2.0F, -3.75F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(-2.0F, -3.75F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 18).addBox(1.5F, -3.0F, -6.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(6, 25).addBox(0.5F, -3.0F, -6.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(26, 14).addBox(-0.5F, -3.0F, -6.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 2).addBox(1.75F, -3.75F, 1.75F, 3.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(10, 23).addBox(3.25F, -5.75F, 4.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.05F))
                .texOffs(13, 16).addBox(2.0F, -4.45F, 5.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.0F, -13.6203F, -12.2491F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r5 = BTTFPartIII.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(34, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(3.75F, -1.7162F, 9.1472F, -1.3526F, 0.0F, 0.0F));

        PartDefinition cube_r6 = BTTFPartIII.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(35, 10).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(3.75F, -3.4395F, 8.3138F, -1.0472F, 0.0F, 0.0F));

        PartDefinition cube_r7 = BTTFPartIII.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(30, 15).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(3.75F, -4.6981F, 6.9506F, -0.6545F, 0.0F, 0.0F));

        PartDefinition cube_r8 = BTTFPartIII.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(33, 23).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(3.75F, -5.1101F, 6.1592F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r9 = BTTFPartIII.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(191, 432).addBox(-13.0F, -0.2529F, -6.5025F, 26.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(191, 432).addBox(-13.0F, -0.2529F, 4.2475F, 26.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(206, 433).addBox(-6.0F, -1.6586F, 7.0292F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(206, 433).addBox(-6.0F, -1.7022F, -7.9698F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(191, 418).addBox(-6.0F, 0.0471F, -8.0025F, 12.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0962F, 0.024F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r10 = BTTFPartIII.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(192, 433).addBox(-6.9698F, -1.7022F, 5.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(192, 433).addBox(-6.9708F, -1.6586F, -6.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0962F, 0.024F, 0.0F, -1.5708F, 0.0F));

        PartDefinition wheelsBTTFIII = root.addOrReplaceChild("wheelsBTTFIII", CubeListBuilder.create(), PartPose.offset(-12.45F, -8.5F, -8.5F));

        PartDefinition frontWheelsBTTF3 = wheelsBTTFIII.addOrReplaceChild("frontWheelsBTTF3", CubeListBuilder.create().texOffs(18, 0).addBox(-16.0F, -0.5F, -0.5F, 32.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.1527F, 3.2804F, 0.0F));

        PartDefinition FrontRightWheel2 = frontWheelsBTTF3.addOrReplaceChild("FrontRightWheel2", CubeListBuilder.create().texOffs(0, 430).addBox(-1.6F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 440).addBox(-2.1F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 440).addBox(-2.1F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.1F, -0.25F, 0.0F));

        PartDefinition cube_r11 = FrontRightWheel2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(26, 453).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 428).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition FrontLeftWheel2 = frontWheelsBTTF3.addOrReplaceChild("FrontLeftWheel2", CubeListBuilder.create(), PartPose.offset(15.25F, 0.0F, 0.0F));

        PartDefinition cube_r12 = FrontLeftWheel2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 440).addBox(-2.0F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 428).addBox(-2.0F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r13 = FrontLeftWheel2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 440).addBox(-2.0F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 453).addBox(-2.0F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, -1.5708F, 0.0F, -3.1416F));

        PartDefinition cube_r14 = FrontLeftWheel2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 430).addBox(-1.5F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition backWheelsBTTF3 = wheelsBTTFIII.addOrReplaceChild("backWheelsBTTF3", CubeListBuilder.create().texOffs(28, 3).addBox(-15.3409F, -0.5F, -0.5F, 31.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.4936F, 3.0304F, 44.0F));

        PartDefinition BackLeftWheel = backWheelsBTTF3.addOrReplaceChild("BackLeftWheel", CubeListBuilder.create().texOffs(26, 440).addBox(4.6F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 428).addBox(4.6F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 430).addBox(5.1F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0091F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r15 = BackLeftWheel.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(26, 440).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 440).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.1F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition BackRightWheel = backWheelsBTTF3.addOrReplaceChild("BackRightWheel", CubeListBuilder.create().texOffs(0, 440).addBox(-4.85F, -2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 453).addBox(-4.85F, 5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 430).addBox(-4.35F, 0.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.2909F, -3.0F, 0.0F));

        PartDefinition cube_r16 = BackRightWheel.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(26, 440).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 428).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.35F, 3.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition wheelsBTTF1 = root.addOrReplaceChild("wheelsBTTF1", CubeListBuilder.create(), PartPose.offset(-12.45F, -8.5F, -8.5F));

        PartDefinition frontWheels = wheelsBTTF1.addOrReplaceChild("frontWheels", CubeListBuilder.create().texOffs(18, 0).addBox(-16.0F, -0.5F, -0.5F, 32.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.1527F, 3.2804F, 0.0F));

        PartDefinition FrontRightWheel = frontWheels.addOrReplaceChild("FrontRightWheel", CubeListBuilder.create(), PartPose.offset(-14.6027F, -2.0304F, 0.0F));

        PartDefinition cube_r17 = FrontRightWheel.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 492).addBox(-1.75F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 480).addBox(-1.75F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3473F, 2.0304F, 0.0F, -1.5708F, 0.0F, 3.1416F));

        PartDefinition cube_r18 = FrontRightWheel.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 500).addBox(-1.75F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(496, 233).addBox(-1.75F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(26, 480).addBox(-1.75F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3473F, 2.0304F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition FrontLeftWheel = frontWheels.addOrReplaceChild("FrontLeftWheel", CubeListBuilder.create().texOffs(496, 233).addBox(-3.8473F, -0.4696F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 500).addBox(-3.8473F, -3.4696F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 480).addBox(-3.8473F, 4.5304F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(17.1973F, -2.0304F, 0.0F));

        PartDefinition cube_r19 = FrontLeftWheel.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(26, 492).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 480).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3473F, 2.0304F, 0.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition backWheels = wheelsBTTF1.addOrReplaceChild("backWheels", CubeListBuilder.create().texOffs(28, 3).addBox(-15.3409F, -0.5F, -0.5F, 31.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.4936F, 3.0304F, 44.0F));

        PartDefinition bone5 = backWheels.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(0, 500).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(496, 233).addBox(-3.5F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(26, 480).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(16.9091F, 0.0F, 0.0F));

        PartDefinition cube_r20 = bone5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 480).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 492).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition bone12 = backWheels.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(0, 500).addBox(-2.1F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 480).addBox(-2.1F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(496, 233).addBox(-2.1F, -2.5F, -2.5F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.2409F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r21 = bone12.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 480).addBox(-3.5F, 2.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(26, 492).addBox(-3.5F, -5.5F, -4.5F, 4.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition Hook = root.addOrReplaceChild("Hook", CubeListBuilder.create(), PartPose.offset(0.1384F, -22.3893F, 41.9378F));

        PartDefinition cube_r22 = Hook.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(504, 334).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1F, -31.9299F, 15.0706F, 2.5307F, 0.0F, 0.0F));

        PartDefinition cube_r23 = Hook.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(504, 334).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1F, -28.8173F, 11.6704F, 0.9599F, 0.0F, 0.0F));

        PartDefinition cube_r24 = Hook.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(504, 334).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.1F, -30.1276F, 15.0294F, 0.9599F, 0.0F, 0.0F));

        PartDefinition cube_r25 = Hook.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(504, 334).addBox(0.5F, -42.45F, -5.05F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-1.1F, 6.9272F, -7.8036F, -0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r26 = Hook.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(476, 340).addBox(-0.5F, -40.45F, -5.05F, 2.0F, 38.0F, 2.0F, new CubeDeformation(-0.6F))
                .texOffs(321, 199).addBox(-1.5F, -3.95F, -6.05F, 4.0F, 4.0F, 4.0F, new CubeDeformation(-0.75F))
                .texOffs(310, 220).addBox(-1.0F, -1.0F, -6.2F, 3.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 7.05F, -8.5F, -0.6109F, 0.0F, 0.0F));

        PartDefinition ReactorBase = root.addOrReplaceChild("ReactorBase", CubeListBuilder.create(), PartPose.offset(0.1558F, -17.1059F, 41.7704F));

        PartDefinition cube_r27 = ReactorBase.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-0.1152F, 0.1167F, 0.1652F, 0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r28 = ReactorBase.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.0087F, 0.1167F, 0.2165F, 1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r29 = ReactorBase.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.1326F, 0.1167F, 0.1652F, 2.3562F, 0.0F, 1.5708F));

        PartDefinition cube_r30 = ReactorBase.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-0.1665F, 0.1167F, 0.0413F, 0.0F, 0.0F, 1.5708F));

        PartDefinition cube_r31 = ReactorBase.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.0087F, 0.1167F, -0.1339F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r32 = ReactorBase.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(-0.1152F, 0.1167F, -0.0826F, -0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r33 = ReactorBase.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.1839F, 0.1167F, 0.0413F, -3.1416F, 0.0F, 1.5708F));

        PartDefinition cube_r34 = ReactorBase.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(315, 2).addBox(-2.0F, -2.25F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.24F)), PartPose.offsetAndRotation(0.1326F, 0.1167F, -0.0826F, -2.3562F, 0.0F, 1.5708F));

        PartDefinition PlutoniumTankCap = ReactorBase.addOrReplaceChild("PlutoniumTankCap", CubeListBuilder.create(), PartPose.offset(0.2991F, -4.2333F, 0.7298F));

        PartDefinition cube_r35 = PlutoniumTankCap.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(367, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, -0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r36 = PlutoniumTankCap.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(367, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r37 = PlutoniumTankCap.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(369, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, -2.3562F, 0.0F, 1.5708F));

        PartDefinition cube_r38 = PlutoniumTankCap.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(367, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, -3.1416F, 0.0F, 1.5708F));

        PartDefinition cube_r39 = PlutoniumTankCap.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(367, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, 2.3562F, 0.0F, 1.5708F));

        PartDefinition cube_r40 = PlutoniumTankCap.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(367, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, 1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r41 = PlutoniumTankCap.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(367, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, 0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r42 = PlutoniumTankCap.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(368, 0).addBox(-0.5F, -0.5F, -1.2212F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.3058F, 3.1F, -0.699F, 0.0F, 0.0F, 1.5708F));

        PartDefinition MrFusion = root.addOrReplaceChild("MrFusion", CubeListBuilder.create(), PartPose.offset(0.1384F, -19.3393F, 41.6878F));

        PartDefinition cube_r43 = MrFusion.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(116, 186).addBox(-1.8F, -17.0F, -18.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-17.8F, -1.2F, -16.0F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r44 = MrFusion.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(116, 184).addBox(-3.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r45 = MrFusion.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(116, 189).addBox(-1.8F, -17.0F, -18.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-18.2F, -1.2F, -16.0F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r46 = MrFusion.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(131, 188).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.51F, 2.0F, -1.5312F, 0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r47 = MrFusion.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(127, 188).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.51F, 2.0F, -1.5312F, 0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r48 = MrFusion.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(131, 185).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.51F, 2.0F, 1.4888F, -0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r49 = MrFusion.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(127, 185).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.51F, 2.0F, 1.4888F, -0.7854F, 0.0F, 1.5708F));

        PartDefinition cube_r50 = MrFusion.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(136, 177).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 2.0F, -1.7425F, 1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r51 = MrFusion.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(136, 181).mirror().addBox(-0.5F, -3.5F, -2.5F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.7212F, 2.0F, 0.9788F, 0.0F, 0.0F, -1.5708F));

        PartDefinition cube_r52 = MrFusion.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(128, 177).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0F, 2.0F, 1.7F, 1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r53 = MrFusion.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(128, 181).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.7212F, 2.0F, 0.9788F, 0.0F, 0.0F, 1.5708F));

        PartDefinition cube_r54 = MrFusion.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(116, 182).addBox(-3.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, -0.7854F, 0.0F, 1.5708F));

        PartDefinition Base = root.addOrReplaceChild("Base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Back2 = Base.addOrReplaceChild("Back2", CubeListBuilder.create().texOffs(297, 508).addBox(-2.65F, 8.25F, 7.25F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(283, 290).addBox(-9.5F, 6.75F, -12.75F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(155, 303).addBox(-6.25F, 7.0F, -12.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(-0.75F))
                .texOffs(155, 283).addBox(2.25F, 7.0F, -12.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(-0.45F))
                .texOffs(309, 298).addBox(-9.75F, 7.25F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(15, 9).addBox(-6.25F, 7.75F, -9.25F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(0, 2).addBox(-2.75F, 7.8F, -8.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 1).addBox(0.65F, 7.8F, -8.25F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.1384F, -22.3893F, 41.9378F));

        PartDefinition cube_r55 = Back2.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(169, 266).addBox(-1.5F, -1.5F, -7.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(-0.55F)), PartPose.offsetAndRotation(5.75F, 8.5F, -11.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r56 = Back2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(4, 11).addBox(-0.6F, -2.75F, -6.5F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(4, 11).addBox(-0.6F, -2.75F, -4.25F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.5815F, 9.3233F, 4.416F, 0.0F, 0.0436F, -0.5672F));

        PartDefinition bone6 = Back2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(-14.1843F, 7.8364F, -6.9536F, 0.0F, 0.0873F, 0.0F));

        PartDefinition cube_r57 = bone6.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(449, 317).addBox(6.0F, -9.75F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(445, 326).addBox(6.0F, -2.75F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(440, 317).addBox(5.5F, -8.75F, -4.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.34F)), PartPose.offsetAndRotation(-3.4F, -7.8364F, -5.4773F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r58 = bone6.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(449, 323).addBox(6.0F, -2.75F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(440, 317).addBox(5.5F, -8.75F, -4.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.34F))
                .texOffs(449, 326).addBox(6.0F, -9.75F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-2.15F, -6.0864F, -5.4773F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r59 = bone6.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(439, 317).addBox(4.5F, -7.75F, -4.4F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.4F, -5.2364F, -7.4773F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r60 = bone6.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(439, 317).addBox(4.5F, -7.75F, -4.4F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.4F, -5.2364F, -5.9773F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r61 = bone6.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(441, 326).addBox(6.0F, -9.75F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(440, 317).addBox(5.5F, -8.75F, -4.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(-0.34F))
                .texOffs(449, 320).addBox(6.0F, -2.75F, -3.9F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.65F, -6.0864F, -5.4773F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition bone7 = Back2.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(12.8943F, 7.5008F, -7.8693F, -0.0174F, 0.0F, -0.0015F));

        PartDefinition cube_r62 = bone7.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(204, 136).addBox(-0.25F, 2.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F))
                .texOffs(204, 136).addBox(-0.25F, -1.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F))
                .texOffs(204, 136).addBox(-0.25F, -4.0F, -2.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.19F))
                .texOffs(195, 143).addBox(1.0F, -4.0F, -2.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.26F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.8326F));

        PartDefinition cube_r63 = bone7.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(198, 126).addBox(-2.0F, -4.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(198, 126).addBox(-2.0F, 2.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(198, 126).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(402, 502).addBox(1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.26F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.7017F));

        PartDefinition cube_r64 = bone7.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(196, 117).mirror().addBox(-3.0F, 0.0F, 1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(196, 117).mirror().addBox(-3.0F, -3.0F, 1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-26.0654F, 0.0F, 0.0F, -1.5708F, 0.0F, -1.7017F));

        PartDefinition thruster = Back2.addOrReplaceChild("thruster", CubeListBuilder.create(), PartPose.offset(7.5F, 0.7F, 9.5F));

        PartDefinition cube_r65 = thruster.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(18, 11).addBox(0.3099F, -1.5594F, -5.3314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-3.6298F, 7.6848F, -9.923F, 0.0879F, 0.0859F, 0.0152F));

        PartDefinition cube_r66 = thruster.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(4, 23).mirror().addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)).mirror(false), PartPose.offsetAndRotation(-9.633F, 8.4688F, -4.8679F, -0.1657F, 0.9554F, -0.1339F));

        PartDefinition cube_r67 = thruster.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(4, 11).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-5.6439F, 8.4688F, -4.8679F, -0.1657F, -0.9554F, 0.1339F));

        PartDefinition cube_r68 = thruster.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(487, 275).mirror().addBox(-0.5F, -4.0F, -8.5F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-12.1074F, 6.9F, -15.3579F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r69 = thruster.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(507, 286).mirror().addBox(-0.5F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(93, 0).mirror().addBox(-0.5F, -1.9F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offsetAndRotation(-12.0619F, 6.9F, -15.3996F, 0.0F, -1.6581F, 0.0F));

        PartDefinition cube_r70 = thruster.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(507, 282).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1529F, 6.9F, -15.3996F, 0.0F, 1.6581F, 0.0F));

        PartDefinition cube_r71 = thruster.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(93, 5).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-3.2149F, 6.5F, -15.3996F, 0.0F, 1.6581F, 0.0F));

        PartDefinition cube_r72 = thruster.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(508, 0).addBox(8.2F, -23.0F, -5.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, 0.9687F, -18.3004F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r73 = thruster.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(509, 0).addBox(7.1F, -23.0F, -3.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-7.5F, 1.7779F, -18.2996F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r74 = thruster.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(496, 4).addBox(-2.0F, -1.15F, -3.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-7.0F, 10.7327F, 3.69F, -1.5708F, -0.5236F, 1.5708F));

        PartDefinition cube_r75 = thruster.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(496, 4).addBox(-2.0F, -1.15F, -3.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 10.7327F, 3.69F, -1.5708F, -0.5236F, 1.5708F));

        PartDefinition cube_r76 = thruster.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(492, -2).addBox(0.0F, -1.15F, -3.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 10.75F, 3.7F, -1.5708F, -0.5236F, 1.5708F));

        PartDefinition cube_r77 = thruster.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(508, 0).addBox(8.2F, -23.0F, -5.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-3.5F, 0.9687F, -18.3004F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r78 = thruster.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(509, 0).addBox(7.1F, -23.0F, -3.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.5F, 1.7779F, -18.2996F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r79 = thruster.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(502, 4).addBox(4.5F, -4.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 4.5835F, -0.5891F, -1.5708F, -0.2618F, 1.5708F));

        PartDefinition cube_r80 = thruster.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(488, 0).addBox(-2.6833F, -2.4858F, -3.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.0F, 5.3345F, 1.1798F, -1.5708F, -0.2618F, 1.5708F));

        PartDefinition cube_r81 = thruster.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(509, 0).addBox(4.5F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(2.0F, 4.5835F, -0.5891F, -1.5708F, -0.2618F, 1.5708F));

        PartDefinition cube_r82 = thruster.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(488, 0).addBox(-2.6833F, -2.4858F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.01F))
                .texOffs(500, 0).addBox(-2.6833F, -2.4858F, 3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 5.3345F, 1.1798F, -1.5708F, -0.2618F, 1.5708F));

        PartDefinition cube_r83 = thruster.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(487, 14).addBox(-0.9108F, -2.1062F, -3.0F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.01F))
                .texOffs(500, 32).addBox(-0.9108F, -2.7062F, -3.0F, 0.0F, 8.3007F, 6.0F, new CubeDeformation(0.01F))
                .texOffs(487, 14).addBox(-0.9108F, -2.1062F, 3.0F, 7.0F, 7.5507F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 3.7458F, 0.5466F, -1.5708F, -0.3054F, 1.5708F));

        PartDefinition cube_r84 = thruster.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(499, -6).addBox(7.2F, -22.7F, -11.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, -3.1495F, -18.3273F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r85 = thruster.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(499, -6).addBox(7.2F, -22.7F, -11.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, -0.9684F, -17.8397F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r86 = thruster.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(499, -6).addBox(7.2F, -23.9F, -11.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, 1.35F, -18.5F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r87 = thruster.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(499, -6).addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 8.6817F, 3.9F, -1.5708F, -0.2618F, 1.5708F));

        PartDefinition cube_r88 = thruster.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(492, -2).addBox(2.25F, 0.1F, -2.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.0F, 3.55F, -1.5708F, -0.1745F, 1.5708F));

        PartDefinition cube_r89 = thruster.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(492, -2).addBox(0.0F, 0.3F, -2.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 4.0F, 3.65F, -1.5708F, -0.1745F, 1.5708F));

        PartDefinition cube_r90 = thruster.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(493, 6).addBox(-2.0F, -4.5F, 1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0425F, 6.563F, -7.0433F, -2.1817F, 0.0F, 1.5708F));

        PartDefinition cube_r91 = thruster.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(498, 76).addBox(-2.5F, -1.5015F, -1.8471F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(498, 76).addBox(-2.5F, -1.4985F, -0.1529F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1529F, 7.4503F, -10.9525F, -1.5708F, 0.3927F, 1.5708F));

        PartDefinition cube_r92 = thruster.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(498, 76).addBox(4.0F, -19.0F, -11.8F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-11.4942F, 0.563F, -27.3784F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r93 = thruster.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(498, 76).addBox(4.0F, -19.75F, -11.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, 0.563F, -28.1254F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r94 = thruster.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(493, 6).addBox(4.0F, -23.0F, -11.8F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-11.4942F, 0.563F, -27.3584F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r95 = thruster.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(493, 6).addBox(4.0F, -23.0F, -11.5F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, 0.563F, -27.3554F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r96 = thruster.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(501, 6).addBox(-1.39F, -0.6F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 9.9533F, 3.8075F, -1.5708F, -0.5323F, 1.5708F));

        PartDefinition cube_r97 = thruster.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(502, 6).addBox(-0.39F, -0.6F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.01F))
                .texOffs(502, 6).addBox(-1.01F, -0.6F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-1.0F, 9.5579F, 4.0378F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r98 = thruster.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(489, 2).addBox(4.0F, -16.8F, -11.5F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.5F, 0.563F, -18.8654F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r99 = thruster.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(502, 6).addBox(4.5F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.0F, 4.5835F, -0.5891F, -1.5708F, -0.2618F, 1.5708F));

        PartDefinition pipes = thruster.addOrReplaceChild("pipes", CubeListBuilder.create(), PartPose.offset(-16.1335F, 6.0F, -12.9671F));

        PartDefinition pipe1 = pipes.addOrReplaceChild("pipe1", CubeListBuilder.create().texOffs(267, 219).addBox(3.1596F, 3.508F, 18.5958F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offset(14.3736F, -4.2581F, -6.429F));

        PartDefinition cube_r100 = pipe1.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(281, 224).addBox(-1.25F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.354F, 1.3536F, -2.4539F));

        PartDefinition cube_r101 = pipe1.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(281, 214).addBox(-1.25F, -1.0F, -0.75F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(2.5453F, 0.5227F, 4.8163F, -2.8317F, 1.0464F, -2.9591F));

        PartDefinition cube_r102 = pipe1.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(281, 219).addBox(-1.25F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(4.2698F, 1.3417F, 7.69F, -2.579F, 0.9719F, -2.6614F));

        PartDefinition cube_r103 = pipe1.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(296, 224).addBox(-1.25F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(4.8486F, 2.3107F, 10.7634F, -1.9633F, 1.2393F, -1.9835F));

        PartDefinition cube_r104 = pipe1.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(296, 219).addBox(-1.25F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(4.9096F, 3.3423F, 14.0351F, -1.5708F, 1.2654F, -1.5708F));

        PartDefinition cube_r105 = pipe1.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(267, 211).addBox(-1.25F, -1.0F, -0.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(4.9096F, 4.0133F, 16.4543F, -1.5708F, 1.309F, -1.5708F));

        PartDefinition cube_r106 = pipe1.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(267, 215).addBox(-1.25F, -1.0F, -0.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)), PartPose.offsetAndRotation(4.9096F, 4.4102F, 18.9522F, -1.5708F, 1.4399F, -1.5708F));

        PartDefinition cube_r107 = pipe1.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(266, 223).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F)), PartPose.offsetAndRotation(4.6596F, 4.508F, 19.5958F, -0.1309F, 0.0F, 0.0F));

        PartDefinition pipe11 = pipes.addOrReplaceChild("pipe11", CubeListBuilder.create().texOffs(302, 180).mirror().addBox(-5.1596F, 3.508F, 18.5958F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false), PartPose.offset(2.6166F, -4.2581F, -6.429F));

        PartDefinition cube_r108 = pipe11.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(283, 180).mirror().addBox(-3.75F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.354F, -1.3536F, 2.4539F));

        PartDefinition cube_r109 = pipe11.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(281, 176).mirror().addBox(-5.75F, -1.0F, -0.75F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-2.5453F, 0.5227F, 4.8163F, -2.8317F, -1.0464F, 2.9591F));

        PartDefinition cube_r110 = pipe11.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(299, 176).mirror().addBox(-3.75F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-4.2698F, 1.3417F, 7.69F, -2.579F, -0.9719F, 2.6614F));

        PartDefinition cube_r111 = pipe11.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(313, 176).mirror().addBox(-3.75F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-4.8486F, 2.3107F, 10.7634F, -1.9633F, -1.2393F, 1.9835F));

        PartDefinition cube_r112 = pipe11.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(313, 180).mirror().addBox(-3.75F, -1.0F, -0.75F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-4.9096F, 3.3423F, 14.0351F, -1.5708F, -1.2654F, 1.5708F));

        PartDefinition cube_r113 = pipe11.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(313, 184).mirror().addBox(-2.75F, -1.0F, -0.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-4.9096F, 4.0133F, 16.4543F, -1.5708F, -1.309F, 1.5708F));

        PartDefinition cube_r114 = pipe11.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(301, 184).mirror().addBox(-2.75F, -1.0F, -0.75F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.75F)).mirror(false), PartPose.offsetAndRotation(-4.9096F, 4.4102F, 18.9522F, -1.5708F, -1.4399F, 1.5708F));

        PartDefinition cube_r115 = pipe11.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(291, 184).mirror().addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F)).mirror(false), PartPose.offsetAndRotation(-4.6596F, 4.508F, 19.5958F, -0.1309F, 0.0F, 0.0F));

        PartDefinition pipe2 = pipes.addOrReplaceChild("pipe2", CubeListBuilder.create().texOffs(350, 179).addBox(2.1492F, -1.0F, 2.3736F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(13.4843F, 0.0F, -1.9064F));

        PartDefinition cube_r116 = pipe2.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(349, 182).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r117 = pipe2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(338, 176).addBox(0.0F, -1.0F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7685F, 0.0F, 2.0675F, 0.0F, 0.5672F, 0.0F));

        PartDefinition pipe3 = pipes.addOrReplaceChild("pipe3", CubeListBuilder.create().texOffs(357, 204).addBox(0.9194F, -1.0F, 1.9579F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(13.7141F, 2.0F, -2.2408F));

        PartDefinition cube_r118 = pipe3.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(356, 203).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r119 = pipe3.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(356, 203).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2201F, 0.0F, 1.0042F, 0.0F, -0.3054F, 0.0F));

        PartDefinition cube_r120 = pipe3.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(356, 203).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0617F, 0.0F, 0.4129F, 0.0F, 0.829F, 0.0F));

        PartDefinition pipe4 = pipes.addOrReplaceChild("pipe4", CubeListBuilder.create(), PartPose.offset(4.4865F, 1.6848F, 3.0441F));

        PartDefinition cube_r121 = pipe4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(282, 196).mirror().addBox(-1.3099F, -1.5594F, -5.3314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0879F, -0.0859F, -0.0152F));

        PartDefinition cube_r122 = pipe4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(279, 196).mirror().addBox(-1.3099F, -1.2235F, -2.7941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.043F, -0.0859F, -0.0152F));

        PartDefinition cube_r123 = pipe4.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(296, 198).mirror().addBox(-1.3099F, -0.7805F, -1.433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4357F, -0.0859F, -0.0152F));

        PartDefinition cube_r124 = pipe4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(292, 197).mirror().addBox(-1.3816F, -0.7805F, -0.1011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4426F, 0.1909F, -0.1448F));

        PartDefinition cube_r125 = pipe4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(288, 198).mirror().addBox(-1.7933F, -0.2677F, 1.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1546F, 0.429F, -0.219F));

        PartDefinition cube_r126 = pipe4.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(275, 197).mirror().addBox(-2.5615F, -0.3996F, 2.5481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2294F, 0.6808F, -0.2844F));

        PartDefinition pipe5 = pipes.addOrReplaceChild("pipe5", CubeListBuilder.create(), PartPose.offset(12.5037F, 1.6848F, 3.0441F));

        PartDefinition cube_r127 = pipe5.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(294, 193).addBox(0.3099F, -1.5594F, -5.3314F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0879F, 0.0859F, 0.0152F));

        PartDefinition cube_r128 = pipe5.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(309, 194).addBox(0.3099F, -1.2235F, -2.7941F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.043F, 0.0859F, 0.0152F));

        PartDefinition cube_r129 = pipe5.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(287, 194).addBox(0.3099F, -0.7805F, -1.433F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4357F, 0.0859F, 0.0152F));

        PartDefinition cube_r130 = pipe5.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(291, 193).addBox(0.3816F, -0.7805F, -0.1011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4426F, -0.1909F, 0.1448F));

        PartDefinition cube_r131 = pipe5.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(303, 194).addBox(0.7933F, -0.2677F, 1.3529F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1546F, -0.429F, 0.219F));

        PartDefinition cube_r132 = pipe5.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(299, 193).addBox(1.5615F, -0.3996F, 2.5481F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2294F, -0.6808F, 0.2844F));

        PartDefinition pipe6 = pipes.addOrReplaceChild("pipe6", CubeListBuilder.create(), PartPose.offset(13.2343F, 0.0F, -1.9064F));

        PartDefinition cube_r133 = pipe6.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(349, 275).addBox(-0.5F, -0.4842F, -1.4311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2013F, -0.887F, 0.9245F, 0.0723F, 0.0915F, -0.3281F));

        PartDefinition cube_r134 = pipe6.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.4407F, -0.0727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2013F, -0.887F, 0.9245F, 0.2468F, 0.0915F, -0.3281F));

        PartDefinition cube_r135 = pipe6.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2523F, -0.9798F, 1.5907F, 0.2332F, -0.5087F, -0.4597F));

        PartDefinition cube_r136 = pipe6.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4257F, -1.0432F, 1.8188F, 0.7132F, -0.5087F, -0.4597F));

        PartDefinition cube_r137 = pipe6.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5988F, -1.2187F, 1.9575F, 1.2368F, -0.5087F, -0.4597F));

        PartDefinition cube_r138 = pipe6.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7891F, -1.3613F, 1.982F, 1.6839F, -0.591F, -1.2799F));

        PartDefinition cube_r139 = pipe6.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.0719F, -1.4043F, 1.9164F, 1.9621F, -0.4678F, -1.8198F));

        PartDefinition cube_r140 = pipe6.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9781F, -1.4104F, 1.9504F, 1.9621F, -0.4678F, -1.8198F));

        PartDefinition cube_r141 = pipe6.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(350, 276).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.6756F, -1.298F, 1.657F, 2.1412F, -0.1987F, -2.3511F));

        PartDefinition cube_r142 = pipe6.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(350, 276).addBox(-0.4441F, -0.5F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9974F, -0.824F, 1.4897F, 1.7859F, -0.1056F, -2.8727F));

        PartDefinition cube_r143 = pipe6.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(350, 276).addBox(-0.3587F, -0.5F, -0.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9974F, -0.824F, 1.4897F, 1.7049F, -0.1987F, -2.3511F));

        PartDefinition cube_r144 = pipe6.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(350, 276).addBox(-0.4154F, -0.5F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9974F, -0.824F, 1.4897F, 1.8033F, -0.057F, -3.0861F));

        PartDefinition cube_r145 = pipe6.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(347, 273).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1239F, -0.1854F, 1.3817F, 1.5851F, -0.057F, -3.0861F));

        PartDefinition pipe7 = pipes.addOrReplaceChild("pipe7", CubeListBuilder.create(), PartPose.offset(3.8559F, 0.0F, -1.9064F));

        PartDefinition cube_r146 = pipe7.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(379, 281).mirror().addBox(-0.5F, -0.4842F, -1.4311F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2013F, -0.887F, 0.9245F, 0.0723F, -0.0915F, 0.3281F));

        PartDefinition cube_r147 = pipe7.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.4407F, -0.0727F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2013F, -0.887F, 0.9245F, 0.2468F, -0.0915F, 0.3281F));

        PartDefinition cube_r148 = pipe7.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.2523F, -0.9798F, 1.5907F, 0.2332F, 0.5087F, 0.4597F));

        PartDefinition cube_r149 = pipe7.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4257F, -1.0432F, 1.8188F, 0.7132F, 0.5087F, 0.4597F));

        PartDefinition cube_r150 = pipe7.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.5988F, -1.2187F, 1.9575F, 1.2368F, 0.5087F, 0.4597F));

        PartDefinition cube_r151 = pipe7.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7891F, -1.3613F, 1.982F, 1.6839F, 0.591F, 1.2799F));

        PartDefinition cube_r152 = pipe7.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.0719F, -1.4043F, 1.9164F, 1.9621F, 0.4678F, 1.8198F));

        PartDefinition cube_r153 = pipe7.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9781F, -1.4104F, 1.9504F, 1.9621F, 0.4678F, 1.8198F));

        PartDefinition cube_r154 = pipe7.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.6756F, -1.298F, 1.657F, 2.1412F, 0.1987F, 2.3511F));

        PartDefinition cube_r155 = pipe7.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5559F, -0.5F, -0.5394F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9974F, -0.824F, 1.4897F, 1.7859F, 0.1056F, 2.8727F));

        PartDefinition cube_r156 = pipe7.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.6413F, -0.5F, -0.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9974F, -0.824F, 1.4897F, 1.7049F, 0.1987F, 2.3511F));

        PartDefinition cube_r157 = pipe7.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(380, 282).mirror().addBox(-0.5846F, -0.5F, -0.1986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9974F, -0.824F, 1.4897F, 1.8033F, 0.057F, 3.0861F));

        PartDefinition cube_r158 = pipe7.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(377, 279).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1239F, -0.1854F, 1.3817F, 1.5851F, 0.057F, 3.0861F));

        PartDefinition pipe8 = pipes.addOrReplaceChild("pipe8", CubeListBuilder.create().texOffs(293, 205).mirror().addBox(-1.8242F, -1.0F, 1.3907F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(3.1809F, 2.0F, -1.6735F));

        PartDefinition cube_r159 = pipe8.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(345, 210).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.1781F, 0.0F));

        PartDefinition cube_r160 = pipe8.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(295, 188).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5995F, 0.0F, 0.6835F, 0.0F, -0.2618F, 0.0F));

        PartDefinition pipe9 = pipes.addOrReplaceChild("pipe9", CubeListBuilder.create().texOffs(317, 245).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r161 = pipe9.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(276, 178).mirror().addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4483F, 0.0F, 2.1907F, 0.0F, -0.2618F, 0.0F));

        PartDefinition cube_r162 = pipe9.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(285, 245).mirror().addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.1654F, 0.0F, 1.2295F, 0.0F, -0.6545F, 0.0F));

        PartDefinition cube_r163 = pipe9.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(347, 245).mirror().addBox(-1.0F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.622F, 0.0F, -0.3666F, 0.0F, -0.9599F, 0.0F));

        PartDefinition cube_r164 = pipe9.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(328, 178).mirror().addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(3.5059F, 0.0F, -1.9064F, 0.0F, -1.5708F, 0.0F));

        PartDefinition pipe10 = pipes.addOrReplaceChild("pipe10", CubeListBuilder.create(), PartPose.offset(-14.0744F, -4.3667F, -8.3874F));

        PartDefinition cube_r165 = pipe10.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(348, 226).addBox(3.8F, -7.25F, -23.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r166 = pipe10.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(343, 226).addBox(-0.8F, -1.0F, -0.5F, 0.9305F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                .texOffs(341, 223).addBox(-8.0195F, -1.0F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(22.75F, 4.8F, 6.8195F, 0.0F, -1.5708F, 0.0F));

        PartDefinition thruster2 = Back2.addOrReplaceChild("thruster2", CubeListBuilder.create(), PartPose.offset(-7.7769F, 0.7F, 9.5F));

        PartDefinition cube_r167 = thruster2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(508, 0).mirror().addBox(-9.2F, -23.0F, -5.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, 0.9687F, -18.3004F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r168 = thruster2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(509, 0).mirror().addBox(-8.1F, -23.0F, -3.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(7.5F, 1.7779F, -18.2996F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r169 = thruster2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(496, 4).mirror().addBox(0.0F, -1.15F, -3.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(7.0F, 10.7327F, 3.69F, -1.5708F, 0.5236F, -1.5708F));

        PartDefinition cube_r170 = thruster2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(496, 4).mirror().addBox(0.0F, -1.15F, -3.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 10.7327F, 3.69F, -1.5708F, 0.5236F, -1.5708F));

        PartDefinition cube_r171 = thruster2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(492, -2).mirror().addBox(0.0F, -1.15F, -3.0F, 0.0F, 3.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 10.75F, 3.7F, -1.5708F, 0.5236F, -1.5708F));

        PartDefinition cube_r172 = thruster2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(508, 0).mirror().addBox(-9.2F, -23.0F, -5.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(3.5F, 0.9687F, -18.3004F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r173 = thruster2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(509, 0).mirror().addBox(-8.1F, -23.0F, -3.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.5F, 1.7779F, -18.2996F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r174 = thruster2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(502, 4).mirror().addBox(-5.5F, -4.0F, 0.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 4.5835F, -0.5891F, -1.5708F, 0.2618F, -1.5708F));

        PartDefinition cube_r175 = thruster2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(488, 0).mirror().addBox(-3.3167F, -2.4858F, -3.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(4.0F, 5.3345F, 1.1798F, -1.5708F, 0.2618F, -1.5708F));

        PartDefinition cube_r176 = thruster2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(509, 0).mirror().addBox(-5.5F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-2.0F, 4.5835F, -0.5891F, -1.5708F, 0.2618F, -1.5708F));

        PartDefinition cube_r177 = thruster2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(488, 0).mirror().addBox(-3.3167F, -2.4858F, -3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(500, 0).mirror().addBox(-3.3167F, -2.4858F, 3.0F, 6.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 5.3345F, 1.1798F, -1.5708F, 0.2618F, -1.5708F));

        PartDefinition cube_r178 = thruster2.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(486, 24).mirror().addBox(-6.0892F, -2.1062F, -3.0F, 7.0F, 8.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(488, 32).mirror().addBox(0.9108F, -2.7062F, -3.0F, 0.0F, 8.3007F, 6.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(487, 14).mirror().addBox(-6.0892F, -2.1062F, 3.0F, 7.0F, 7.5507F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 3.7458F, 0.5466F, -1.5708F, 0.3054F, -1.5708F));

        PartDefinition cube_r179 = thruster2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(499, -6).mirror().addBox(-7.2F, -22.7F, -11.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, -3.1495F, -18.3273F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r180 = thruster2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(499, -6).mirror().addBox(-7.2F, -22.7F, -11.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, -0.9684F, -17.8397F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r181 = thruster2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(499, -6).mirror().addBox(-7.2F, -23.9F, -11.5F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, 1.35F, -18.5F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r182 = thruster2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(499, -6).mirror().addBox(0.0F, -0.5F, -3.0F, 0.0F, 1.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 8.6817F, 3.9F, -1.5708F, 0.2618F, -1.5708F));

        PartDefinition cube_r183 = thruster2.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(492, -2).mirror().addBox(-2.25F, 0.1F, -2.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, 3.55F, -1.5708F, 0.1745F, -1.5708F));

        PartDefinition cube_r184 = thruster2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(492, -2).mirror().addBox(0.0F, 0.3F, -2.0F, 0.0F, 2.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.0F, 4.0F, 3.65F, -1.5708F, 0.1745F, -1.5708F));

        PartDefinition cube_r185 = thruster2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(493, 6).mirror().addBox(-3.0F, -4.5F, 1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0425F, 6.563F, -7.0433F, -2.1817F, 0.0F, -1.5708F));

        PartDefinition cube_r186 = thruster2.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(498, 76).mirror().addBox(-9.0F, -19.0F, -11.8F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(11.4942F, 0.563F, -27.3784F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r187 = thruster2.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(498, 76).mirror().addBox(-9.0F, -19.75F, -11.5F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, 0.563F, -28.1254F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r188 = thruster2.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(493, 6).mirror().addBox(-9.0F, -23.0F, -11.8F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(11.4942F, 0.563F, -27.3584F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r189 = thruster2.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(493, 6).mirror().addBox(-9.0F, -23.0F, -11.5F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, 0.563F, -27.3554F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r190 = thruster2.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(498, 76).addBox(-2.5F, -1.4985F, -0.1529F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F))
                .texOffs(498, 76).addBox(-2.5F, -1.5015F, -1.8471F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1529F, 7.4503F, -10.9495F, -1.5708F, 0.3927F, 1.5708F));

        PartDefinition cube_r191 = thruster2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(501, 6).mirror().addBox(-0.61F, -0.6F, 0.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 9.9533F, 3.8075F, -1.5708F, 0.5323F, -1.5708F));

        PartDefinition cube_r192 = thruster2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(502, 6).mirror().addBox(-0.61F, -0.6F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(502, 6).mirror().addBox(0.01F, -0.6F, 0.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(1.0F, 9.5579F, 4.0378F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r193 = thruster2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(489, 2).mirror().addBox(-9.0F, -16.8F, -11.5F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.5F, 0.563F, -18.8654F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r194 = thruster2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(502, 6).mirror().addBox(-5.5F, -4.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(4.0F, 4.5835F, -0.5891F, -1.5708F, 0.2618F, -1.5708F));

        PartDefinition Reactor = Back2.addOrReplaceChild("Reactor", CubeListBuilder.create().texOffs(445, 488).addBox(-3.5451F, -1.4733F, -0.7862F, 7.0F, 6.0F, 1.3924F, new CubeDeformation(0.0F))
                .texOffs(446, 496).addBox(-0.5989F, -0.9733F, -3.09F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(445, 496).addBox(-0.7413F, -1.4733F, -3.59F, 1.3924F, 6.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(222, 57).addBox(-3.0309F, -1.8733F, -0.6196F, 6.0F, 1.0F, 1.1935F, new CubeDeformation(0.0F))
                .texOffs(196, 62).addBox(-0.6277F, -1.8733F, -3.0228F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0174F, 6.7833F, -0.1674F));

        PartDefinition hexadecagon_r1 = Reactor.addOrReplaceChild("hexadecagon_r1", CubeListBuilder.create().texOffs(205, 62).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0309F, -1.3733F, -0.0228F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hexadecagon_r2 = Reactor.addOrReplaceChild("hexadecagon_r2", CubeListBuilder.create().texOffs(202, 62).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(222, 60).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0309F, -1.3733F, -0.0228F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r3 = Reactor.addOrReplaceChild("hexadecagon_r3", CubeListBuilder.create().texOffs(199, 62).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(222, 63).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0309F, -1.3733F, -0.0228F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r4 = Reactor.addOrReplaceChild("hexadecagon_r4", CubeListBuilder.create().texOffs(193, 62).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0309F, -1.3733F, -0.0228F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r5 = Reactor.addOrReplaceChild("hexadecagon_r5", CubeListBuilder.create().texOffs(445, 496).addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0451F, 2.0267F, -0.09F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hexadecagon_r6 = Reactor.addOrReplaceChild("hexadecagon_r6", CubeListBuilder.create().texOffs(445, 496).addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 6.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(445, 488).addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 6.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0451F, 2.0267F, -0.09F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r7 = Reactor.addOrReplaceChild("hexadecagon_r7", CubeListBuilder.create().texOffs(446, 496).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r8 = Reactor.addOrReplaceChild("hexadecagon_r8", CubeListBuilder.create().texOffs(445, 496).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(446, 496).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, 0.0F, -1.1781F, 0.0F));

        PartDefinition hexadecagon_r9 = Reactor.addOrReplaceChild("hexadecagon_r9", CubeListBuilder.create().texOffs(446, 496).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(446, 496).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, 0.0F, -1.5708F, 0.0F));

        PartDefinition hexadecagon_r10 = Reactor.addOrReplaceChild("hexadecagon_r10", CubeListBuilder.create().texOffs(445, 496).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(445, 496).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, -3.1416F, -1.1781F, 3.1416F));

        PartDefinition hexadecagon_r11 = Reactor.addOrReplaceChild("hexadecagon_r11", CubeListBuilder.create().texOffs(445, 496).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, -3.1416F, -0.7854F, 3.1416F));

        PartDefinition hexadecagon_r12 = Reactor.addOrReplaceChild("hexadecagon_r12", CubeListBuilder.create().texOffs(445, 496).addBox(-0.5F, -1.5F, -4.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, -3.1416F, -0.3927F, 3.1416F));

        PartDefinition hexadecagon_r13 = Reactor.addOrReplaceChild("hexadecagon_r13", CubeListBuilder.create().texOffs(445, 496).addBox(-0.5F, -1.5F, -3.0F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0989F, 0.5267F, -0.09F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r14 = Reactor.addOrReplaceChild("hexadecagon_r14", CubeListBuilder.create().texOffs(445, 496).addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 6.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(445, 488).addBox(-3.5F, -3.5F, -0.6962F, 7.0F, 6.0F, 1.3924F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0451F, 2.0267F, -0.09F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r15 = Reactor.addOrReplaceChild("hexadecagon_r15", CubeListBuilder.create().texOffs(445, 496).addBox(-0.6962F, -3.5F, -3.5F, 1.3924F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0451F, 2.0267F, -0.09F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone = Base.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(79, 101).addBox(-2.0F, 2.1032F, 22.4217F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(74, 48).addBox(-15.1473F, 4.3336F, 21.4217F, 31.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 56).addBox(-2.4F, 6.1032F, 22.4217F, 18.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(1, 93).addBox(-15.0F, 6.0F, 22.0F, 16.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.35F, -15.0603F, -22.9646F));

        PartDefinition cube_r195 = bone.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(117, 65).addBox(-7.5F, -3.75F, -0.8461F, 31.0F, 5.0F, 5.3461F, new CubeDeformation(0.0F))
                .texOffs(117, 65).addBox(-7.5F, -2.0F, -1.5961F, 31.0F, 1.0F, 0.75F, new CubeDeformation(0.0F))
                .texOffs(117, 65).addBox(-7.5F, -1.75F, -1.5961F, 31.0F, 3.0F, 0.75F, new CubeDeformation(0.0F))
                .texOffs(117, 65).addBox(-7.5F, -0.75F, -2.5F, 31.0F, 2.0F, 0.9039F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8473F, 3.1158F, 26.1186F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r196 = bone.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(76, 40).addBox(-7.5F, -3.75F, -2.5F, 31.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.8473F, 2.282F, 26.7109F, 2.6616F, 0.0F, 0.0F));

        PartDefinition steering = Base.addOrReplaceChild("steering", CubeListBuilder.create(), PartPose.offset(8.0F, -13.4076F, 6.6736F));

        PartDefinition cube_r197 = steering.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(40, 222).addBox(-0.5F, -0.5F, -11.0F, 1.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3473F, 2.0304F, 0.0F, 0.6545F, 0.0F, 0.0F));

        PartDefinition SteeringWheel = steering.addOrReplaceChild("SteeringWheel", CubeListBuilder.create().texOffs(46, 13).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(51, 13).addBox(2.0F, -0.5967F, -0.5F, 1.0F, 1.1935F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.35F, 0.4757F, 2.4298F, 0.6545F, 0.0F, 0.0F));

        PartDefinition hexadecagon_r16 = SteeringWheel.addOrReplaceChild("hexadecagon_r16", CubeListBuilder.create().texOffs(68, 28).addBox(2.0F, -0.5967F, -0.5F, 1.0F, 1.1935F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(83, 34).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

        PartDefinition hexadecagon_r17 = SteeringWheel.addOrReplaceChild("hexadecagon_r17", CubeListBuilder.create().texOffs(51, 13).addBox(2.0F, -0.5967F, -0.5F, 1.0F, 1.1935F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 13).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.7489F));

        PartDefinition hexadecagon_r18 = SteeringWheel.addOrReplaceChild("hexadecagon_r18", CubeListBuilder.create().texOffs(68, 30).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.3562F));

        PartDefinition hexadecagon_r19 = SteeringWheel.addOrReplaceChild("hexadecagon_r19", CubeListBuilder.create().texOffs(46, 13).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(51, 13).addBox(2.0F, -0.5967F, -0.5F, 1.0F, 1.1935F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.7489F));

        PartDefinition hexadecagon_r20 = SteeringWheel.addOrReplaceChild("hexadecagon_r20", CubeListBuilder.create().texOffs(83, 30).addBox(-0.5967F, 0.0F, -0.5F, 1.1935F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.3562F));

        PartDefinition hexadecagon_r21 = SteeringWheel.addOrReplaceChild("hexadecagon_r21", CubeListBuilder.create().texOffs(51, 13).addBox(2.0F, -0.5967F, -0.5F, 1.0F, 1.1935F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 13).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition hexadecagon_r22 = SteeringWheel.addOrReplaceChild("hexadecagon_r22", CubeListBuilder.create().texOffs(51, 13).addBox(2.0F, -0.5967F, -0.5F, 1.0F, 1.1935F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 13).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition hexadecagon_r23 = SteeringWheel.addOrReplaceChild("hexadecagon_r23", CubeListBuilder.create().texOffs(65, 35).addBox(-0.5967F, -3.0F, -0.5F, 1.1935F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition hexadecagon_r24 = SteeringWheel.addOrReplaceChild("hexadecagon_r24", CubeListBuilder.create().texOffs(46, 13).addBox(-0.5967F, 2.0F, -0.5F, 1.1935F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition DMC = Base.addOrReplaceChild("DMC", CubeListBuilder.create(), PartPose.offset(0.1541F, -9.0854F, -27.0754F));

        PartDefinition cube_r198 = DMC.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(219, 18).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-0.15F, -0.7247F, -0.7071F, 0.0F, -0.2618F, -1.5708F));

        PartDefinition cube_r199 = DMC.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(219, 18).addBox(-3.75F, -2.5F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.6F))
                .texOffs(209, 13).addBox(0.7F, -2.5F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-0.15F, 0.5F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition LeftDoor = Base.addOrReplaceChild("LeftDoor", CubeListBuilder.create(), PartPose.offset(2.9736F, -20.6751F, 15.269F));

        PartDefinition cube_r200 = LeftDoor.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(12, 228).addBox(-6.0F, -37.0F, -1.0F, 1.0F, 29.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(13.1764F, 13.2467F, -25.1406F, -1.5708F, 0.0F, 1.3963F));

        PartDefinition cube_r201 = LeftDoor.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(490, 485).addBox(-9.5F, 1.0F, -1.0F, 10.0F, 26.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(156, 121).mirror().addBox(-4.5F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(12.0076F, 7.3142F, 10.8594F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r202 = LeftDoor.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(24, 237).addBox(-1.0F, -2.2F, -28.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.2707F, 0.5101F, 9.657F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r203 = LeftDoor.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(24, 237).addBox(-1.0F, -3.2F, -28.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.2707F, 0.5101F, 1.857F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r204 = LeftDoor.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(0.0F, -15.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 19).mirror().addBox(0.0F, -15.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.2764F, 7.4251F, -15.269F, -1.0821F, -0.3578F, 0.0F));

        PartDefinition cube_r205 = LeftDoor.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(26, 167).mirror().addBox(0.0F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.6963F, -0.1026F, -3.019F, -1.5621F, -0.3578F, 0.0F));

        PartDefinition cube_r206 = LeftDoor.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(156, 121).mirror().addBox(-4.5F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(9.4987F, 3.7737F, 10.857F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r207 = LeftDoor.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(95, 63).mirror().addBox(-3.0F, -14.0F, 0.0F, 6.0F, 28.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(13.3379F, 15.0329F, -2.1406F, -1.5708F, 0.0F, -1.3526F));

        PartDefinition cube_r208 = LeftDoor.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(13, 229).mirror().addBox(-2.5F, -14.5F, 0.0F, 5.0F, 29.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(13.5534F, 9.6262F, -2.6406F, -1.5708F, 0.0F, -1.7453F));

        PartDefinition cube_r209 = LeftDoor.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(193, 75).addBox(-1.8672F, -1.8294F, 0.1911F, 3.6569F, 4.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(66, 314).addBox(-3.2103F, -1.8294F, 0.1911F, 2.1431F, 2.1079F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(12.8695F, 6.633F, -12.9947F, 1.6674F, -1.0134F, -2.1318F));

        PartDefinition cube_r210 = LeftDoor.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(66, 314).addBox(-1.7641F, -1.9863F, 0.059F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(12.8695F, 6.633F, -12.9947F, -0.1372F, -0.3027F, 0.0411F));

        PartDefinition RightDoor = Base.addOrReplaceChild("RightDoor", CubeListBuilder.create(), PartPose.offset(-2.7029F, -20.665F, 16.926F));

        PartDefinition cube_r211 = RightDoor.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(12, 228).mirror().addBox(5.0F, -37.0F, -1.0F, 1.0F, 29.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-13.4471F, 13.2367F, -26.7976F, -1.5708F, 0.0F, -1.3963F));

        PartDefinition cube_r212 = RightDoor.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(490, 485).mirror().addBox(-0.5F, 1.0F, -1.0F, 10.0F, 26.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(156, 121).addBox(-0.5F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-12.2783F, 7.3041F, 9.2024F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition cube_r213 = RightDoor.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(24, 237).mirror().addBox(0.0F, -2.2F, -28.0F, 1.0F, 7.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(20.0F, 0.5F, 8.0F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r214 = RightDoor.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(24, 237).mirror().addBox(0.0F, -3.2F, -28.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(20.0F, 0.5F, 0.2F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r215 = RightDoor.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(0, 19).addBox(-1.0F, -15.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 19).addBox(-1.0F, -15.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.5471F, 7.415F, -16.926F, -1.0821F, 0.3578F, 0.0F));

        PartDefinition cube_r216 = RightDoor.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(26, 167).addBox(-1.0F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.967F, -0.1126F, -4.6759F, -1.5621F, 0.3578F, 0.0F));

        PartDefinition cube_r217 = RightDoor.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(156, 121).addBox(-0.5F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-9.7695F, 3.7637F, 9.2F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition cube_r218 = RightDoor.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(95, 63).addBox(-3.0F, -14.0F, 0.0F, 6.0F, 28.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-13.6086F, 15.0228F, -3.7976F, -1.5708F, 0.0F, 1.3526F));

        PartDefinition cube_r219 = RightDoor.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(13, 229).addBox(-2.5F, -14.5F, 0.0F, 5.0F, 29.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-13.8242F, 9.6162F, -4.2976F, -1.5708F, 0.0F, 1.7453F));

        PartDefinition cube_r220 = RightDoor.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(193, 75).mirror().addBox(-1.7897F, -1.8294F, 0.1911F, 3.6569F, 4.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
                .texOffs(66, 314).mirror().addBox(1.0672F, -1.8294F, 0.1911F, 2.1431F, 2.1079F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-13.1402F, 6.623F, -14.6517F, 1.6674F, 1.0134F, 2.1318F));

        PartDefinition cube_r221 = RightDoor.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(66, 314).mirror().addBox(-3.2359F, -1.9863F, 0.059F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(-13.1402F, 6.623F, -14.6517F, -0.1372F, 0.3027F, -0.0411F));

        PartDefinition bone4 = Base.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-0.0276F, -22.7409F, 53.2997F));

        PartDefinition cube_r222 = bone4.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(76, 46).mirror().addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-14.0312F, 12.1273F, 0.281F, -1.5708F, 0.0F, -1.3963F));

        PartDefinition cube_r223 = bone4.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(195, 57).mirror().addBox(-0.464F, -0.5F, -0.5F, 1.964F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(204, 57).mirror().addBox(-1.4F, -0.5F, -0.5F, 1.016F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-14.1446F, 15.8744F, 0.281F, 0.0F, 0.0F, -1.789F));

        PartDefinition cube_r224 = bone4.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(62, 204).mirror().addBox(-15.5F, -0.9F, -13.3F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-1.0273F, 1.8514F, -0.119F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r225 = bone4.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(216, 57).addBox(-1.5F, -0.5F, -0.5F, 1.964F, 1.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(210, 57).addBox(0.384F, -0.5F, -0.5F, 1.016F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(14.1997F, 15.8744F, 0.281F, 0.0F, 0.0F, 1.789F));

        PartDefinition cube_r226 = bone4.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(103, 0).addBox(13.5F, -0.8F, -15.0F, 0.8751F, 2.0F, 29.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6175F, -0.0438F, -0.019F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r227 = bone4.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(76, 46).addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(14.0863F, 12.1273F, 0.281F, -1.5708F, 0.0F, 1.3963F));

        PartDefinition cube_r228 = bone4.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(120, 37).addBox(-2.5F, -0.5F, -1.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(12.9756F, 12.9999F, 0.0624F, -1.5708F, 0.0F, 1.3963F));

        PartDefinition cube_r229 = bone4.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(56, 204).addBox(12.5F, -0.9F, -13.3F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(1.0825F, 1.8514F, -0.119F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r230 = bone4.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(202, 39).mirror().addBox(-12.5F, 0.1F, -13.3021F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.6205F, 1.9999F, 0.7124F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r231 = bone4.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(276, 139).addBox(8.5F, 0.1F, -13.3021F, 4.0F, 1.0F, 27.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.1756F, 1.9999F, 0.6624F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r232 = bone4.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(120, 41).addBox(-2.5F, -0.5F, -0.25F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-12.5244F, 12.9999F, 0.0624F, -1.5708F, 0.0F, 1.7453F));

        PartDefinition cube_r233 = bone4.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(219, 12).addBox(6.5F, -0.8F, -13.3F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-13.3876F, 3.0768F, -0.019F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r234 = bone4.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(96, 207).addBox(6.5F, -0.8F, -14.3F, 1.0F, 2.0F, 15.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.1573F, 3.0768F, -0.019F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition bone2 = bone4.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(15.1947F, 13.9099F, -9.1895F, -0.0173F, 0.0026F, 0.0F));

        PartDefinition cube_r235 = bone2.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(95, 105).addBox(3.1897F, -2.4093F, -1.5448F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(216, 88).addBox(2.6897F, 0.5907F, -1.5448F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4165F, -2.1133F, -0.1008F, -1.6594F, -0.1739F, 1.8043F));

        PartDefinition cube_r236 = bone2.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(112, 170).addBox(4.2044F, 2.5907F, -1.5448F, 1.4853F, 1.1303F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(112, 170).addBox(3.7344F, 3.7411F, -1.5448F, 1.9553F, 9.8497F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.9616F, -4.0209F, 10.7009F, -1.6594F, -0.1739F, 1.8043F));

        PartDefinition cube_r237 = bone2.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(108, 74).addBox(5.7273F, -8.474F, -1.5448F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4165F, -2.1133F, -0.1008F, -1.6591F, -0.1565F, 1.8028F));

        PartDefinition cube_r238 = bone2.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(148, 151).addBox(2.3459F, -8.7959F, -1.5448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5158F, -2.153F, 1.1059F, -1.6581F, 0.0174F, 1.7874F));

        PartDefinition cube_r239 = bone2.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(152, 149).addBox(2.3459F, -8.7959F, -1.5448F, 1.0F, 10.9953F, 1.0F, new CubeDeformation(0.01F))
                .texOffs(148, 153).addBox(2.3459F, 2.2194F, -1.5448F, 1.0F, 0.9847F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.4252F, -2.1512F, 0.0899F, -1.6581F, 0.0174F, 1.7874F));

        PartDefinition bone3 = bone4.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.1395F, 13.9099F, -9.1895F, -0.0173F, -0.0026F, 0.0F));

        PartDefinition cube_r240 = bone3.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(95, 105).mirror().addBox(-4.1897F, -2.4093F, -1.5448F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(216, 88).mirror().addBox(-5.6897F, 0.5907F, -1.5448F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.4165F, -2.1133F, -0.1008F, -1.6594F, 0.1739F, -1.8043F));

        PartDefinition cube_r241 = bone3.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(112, 170).mirror().addBox(-5.6897F, 2.5907F, -1.5448F, 1.4853F, 1.1303F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(112, 170).mirror().addBox(-5.6897F, 3.7411F, -1.5448F, 1.9553F, 9.8497F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.9616F, -4.0209F, 10.7009F, -1.6594F, 0.1739F, -1.8043F));

        PartDefinition cube_r242 = bone3.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(108, 74).mirror().addBox(-6.7273F, -8.474F, -1.5448F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.4165F, -2.1133F, -0.1008F, -1.6591F, 0.1565F, -1.8028F));

        PartDefinition cube_r243 = bone3.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(156, 149).mirror().addBox(-3.3459F, -8.7959F, -1.5448F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.5158F, -2.153F, 1.1059F, -1.6581F, -0.0174F, -1.7874F));

        PartDefinition cube_r244 = bone3.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(152, 149).mirror().addBox(-3.3459F, -8.7959F, -1.5448F, 1.0F, 10.9953F, 1.0F, new CubeDeformation(0.01F)).mirror(false)
                .texOffs(148, 149).mirror().addBox(-3.3459F, 2.2194F, -1.5448F, 1.0F, 0.9847F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.4252F, -2.1512F, 0.0899F, -1.6581F, -0.0174F, -1.7874F));

        PartDefinition bone9 = bone4.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offset(0.6756F, 1.9999F, 0.7124F));

        PartDefinition cube_r245 = bone9.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(134, 110).addBox(10.5F, 0.0F, -13.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, -10.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(10.5F, 0.0F, -12.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(9.5F, 0.0F, -12.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(8.5F, 0.0F, -12.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(134, 110).addBox(8.5F, 0.0F, -13.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(134, 110).addBox(9.5F, 0.0F, -13.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(9.5F, 0.0F, -11.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(10.5F, 0.0F, -11.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, -10.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, -10.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, -5.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, -5.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(142, 106).addBox(8.5F, 0.0F, -4.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(142, 106).addBox(9.5F, 0.0F, -4.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(142, 106).addBox(10.5F, 0.0F, -4.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, -7.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, -7.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, -7.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, -6.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, -6.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, -6.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, -9.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, -9.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, -9.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, -8.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, -8.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, -8.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(8.5F, 0.0F, -11.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, -5.3021F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition bone8 = bone4.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0222F, 11.9999F, 0.2124F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r246 = bone8.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(139, 109).addBox(8.5F, 0.0F, 12.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, 12.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, 12.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(142, 106).addBox(8.5F, 0.0F, 13.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(142, 106).addBox(9.5F, 0.0F, 13.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(134, 110).addBox(9.5F, 0.0F, 4.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(134, 110).addBox(10.5F, 0.0F, 4.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(142, 106).addBox(10.5F, 0.0F, 13.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, 10.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, 10.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, 10.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, 11.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, 11.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, 11.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, 8.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, 8.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, 8.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, 9.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, 9.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, 9.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(8.5F, 0.0F, 6.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(9.5F, 0.0F, 6.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(10.5F, 0.0F, 6.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(8.5F, 0.0F, 7.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(9.5F, 0.0F, 7.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 109).addBox(10.5F, 0.0F, 7.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(10.5F, 0.0F, 5.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(9.5F, 0.0F, 5.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(139, 112).addBox(8.5F, 0.0F, 5.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(134, 110).addBox(8.5F, 0.0F, 4.6979F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(9.6979F, -10.0F, 0.5F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition base1 = Base.addOrReplaceChild("base1", CubeListBuilder.create().texOffs(0, 48).addBox(-21.6813F, 6.3272F, -69.1558F, 34.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(194, 44).addBox(-22.1313F, 11.3272F, -69.1558F, 18.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(194, 39).addBox(-5.3813F, 11.3272F, -69.1558F, 18.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(203, 75).addBox(-16.8292F, 7.4016F, -66.1628F, 25.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(205, 35).addBox(7.3906F, 7.695F, -67.1628F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(205, 35).mirror().addBox(-20.7668F, 7.695F, -67.1628F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(191, 95).addBox(-20.034F, 3.4539F, -68.6129F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F))
                .texOffs(191, 95).addBox(-16.284F, 3.4539F, -68.6129F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F))
                .texOffs(191, 95).addBox(2.916F, 3.4539F, -68.6129F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F))
                .texOffs(191, 95).addBox(6.666F, 3.4539F, -68.6129F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.5F))
                .texOffs(112, 116).addBox(-20.534F, 3.5039F, -67.8629F, 32.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(445, 500).addBox(-2.5354F, 8.9697F, -30.7375F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(449, 501).addBox(-18.0354F, 9.9697F, -30.4875F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(445, 500).addBox(-18.5354F, 8.9697F, -30.7375F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(325, 393).addBox(-20.3579F, 11.2379F, -41.1192F, 17.0F, 1.0F, 30.0F, new CubeDeformation(0.0F))
                .texOffs(298, 350).addBox(-4.0183F, 11.2379F, -41.1192F, 15.0F, 1.0F, 30.0F, new CubeDeformation(0.0F))
                .texOffs(342, 381).addBox(-5.0183F, 11.2379F, -66.1192F, 16.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(277, 396).addBox(-17.5683F, 11.2379F, -55.1192F, 25.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(301, 411).addBox(-20.3579F, 11.2379F, -66.1192F, 16.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(157, 149).addBox(-6.8854F, 6.7626F, -37.8304F, 4.0F, 5.0F, 19.0F, new CubeDeformation(0.0F))
                .texOffs(154, 170).addBox(-20.3854F, 5.2626F, -41.8304F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(428, 500).addBox(-21.8381F, 6.8393F, -69.4375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.2F))
                .texOffs(88, 189).mirror().addBox(11.0619F, 6.1893F, -58.8875F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F)).mirror(false)
                .texOffs(88, 189).addBox(-22.4381F, 6.1893F, -58.3875F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.1F))
                .texOffs(425, 228).mirror().addBox(11.4619F, 6.8393F, -69.4375F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.2F)).mirror(false)
                .texOffs(406, 167).mirror().addBox(12.0619F, 7.3893F, -70.0375F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(406, 167).mirror().addBox(12.0619F, 6.1393F, -70.0375F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(406, 167).mirror().addBox(12.0619F, 6.1393F, -70.0375F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(406, 167).mirror().addBox(12.0619F, 7.3893F, -70.0375F, 1.0F, 1.0F, 12.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(393, 232).addBox(-21.8381F, 6.8393F, -69.4375F, 34.0F, 1.0F, 0.0F, new CubeDeformation(0.2F))
                .texOffs(398, 142).addBox(-5.3381F, 6.1393F, -70.0375F, 18.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(398, 142).addBox(-22.0381F, 6.1393F, -70.0375F, 18.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(398, 142).addBox(-22.0381F, 7.3893F, -70.0375F, 18.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(398, 142).addBox(-5.3381F, 7.3893F, -70.0375F, 18.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(90, 195).addBox(-9.6881F, -7.6107F, -13.4375F, 10.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F))
                .texOffs(86, 191).addBox(-6.6881F, -8.0107F, -13.4375F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(87, 191).addBox(-6.1881F, -8.3607F, -13.4375F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(85, 188).addBox(-5.6881F, -8.4107F, -14.4375F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
                .texOffs(85, 188).addBox(-5.6881F, -8.8107F, -14.4375F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
                .texOffs(1, 1).addBox(-21.791F, 6.9651F, -55.9096F, 2.0F, 4.3621F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.6881F, -14.9393F, 40.2375F));

        PartDefinition cube_r247 = base1.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(79, 128).addBox(-3.9733F, -3.0355F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-17.9832F, 8.4053F, 7.3038F, -0.1671F, -0.0751F, 3.1293F));

        PartDefinition cube_r248 = base1.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(501, 445).mirror().addBox(0.9733F, -3.0355F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(8.607F, 8.4053F, 7.278F, -0.1671F, 0.0751F, -3.1293F));

        PartDefinition cube_r249 = base1.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(394, 500).addBox(-19.25F, -1.5F, -3.4F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.01F))
                .texOffs(394, 500).addBox(-19.25F, -1.5F, -23.75F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.4427F, -8.2192F, -12.3592F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r250 = base1.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(163, 12).addBox(-19.4F, -0.25F, -18.7F, 17.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(3.2617F, -8.1954F, -11.1116F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r251 = base1.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(128, 167).addBox(-2.5F, -11.5F, -1.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-19.9151F, 9.5688F, -21.6092F, -1.5708F, 0.0F, -1.789F));

        PartDefinition cube_r252 = base1.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(209, 28).addBox(-1.5F, 14.0F, -0.75F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.6502F, 5.0055F, 3.8908F, -1.5708F, 0.0F, -1.3963F));

        PartDefinition cube_r253 = base1.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(70, 224).mirror().addBox(-1.0F, -1.0F, 10.25F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.6074F, -4.8178F, -9.5522F, -0.2793F, -0.1309F, 0.0F));

        PartDefinition cube_r254 = base1.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(204, 268).addBox(-1.5F, -10.4672F, -0.5F, 5.0F, 10.9672F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.8545F, 4.9695F, -9.6355F, -1.6581F, 0.0F, -1.3963F));

        PartDefinition cube_r255 = base1.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(56, 97).mirror().addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.5313F, 1.3F, 12.6567F, 0.4625F, -0.1309F, 0.0F));

        PartDefinition cube_r256 = base1.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(222, 49).addBox(-1.0F, 0.2892F, -5.25F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2208F, 1.3F, 12.6567F, -0.2793F, 0.1309F, 0.0F));

        PartDefinition cube_r257 = base1.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(56, 97).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.2208F, 1.3F, 12.6567F, 0.4625F, 0.1309F, 0.0F));

        PartDefinition cube_r258 = base1.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(70, 224).addBox(-1.0F, -1.0F, 10.25F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2969F, -4.8178F, -9.5522F, -0.2793F, 0.1309F, 0.0F));

        PartDefinition cube_r259 = base1.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(148, 234).mirror().addBox(-1.0F, -1.0F, 1.5F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-14.1996F, -5.7137F, -12.6496F, -0.2793F, -0.1309F, 0.0F));

        PartDefinition cube_r260 = base1.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(148, 234).addBox(-1.0F, -1.0F, 1.5F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.8891F, -5.7137F, -12.6496F, -0.2793F, 0.1309F, 0.0F));

        PartDefinition cube_r261 = base1.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(133, 131).addBox(-0.2F, -1.0F, -17.35F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.6129F, 2.1332F, -34.6017F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r262 = base1.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(127, 125).addBox(-0.2F, -1.0F, -17.35F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.6129F, 2.8311F, -50.5865F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r263 = base1.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(21, 366).addBox(-0.2F, -2.75F, -17.35F, 1.0F, 1.0F, 26.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(10.9629F, 4.2451F, -50.8751F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r264 = base1.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(-10, 366).addBox(-31.2F, -1.0F, -17.35F, 32.0F, 1.0F, 26.0F, new CubeDeformation(0.0F))
                .texOffs(82, 271).addBox(-14.2F, -1.0F, 8.5F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 271).addBox(-31.2021F, -1.0F, 8.5F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.4129F, 2.8311F, -50.5865F, 0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r265 = base1.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(226, 143).addBox(-2.0F, -6.5F, -1.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.8326F, 8.9287F, -61.2236F, -1.5882F, -0.0524F, 1.789F));

        PartDefinition cube_r266 = base1.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(213, 143).addBox(-3.0F, -6.2487F, -1.0F, 5.0F, 11.7487F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.2088F, 8.9305F, -61.3095F, -1.5882F, 0.0524F, -1.789F));

        PartDefinition cube_r267 = base1.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(184, 235).mirror().addBox(-0.5F, -12.5F, -15.0F, 1.0F, 24.0F, 3.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-4.8686F, 2.7833F, -0.6542F, -1.6581F, 0.0F, -1.5708F));

        PartDefinition cube_r268 = base1.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(177, 236).addBox(-1.125F, 0.885F, -1.125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.16F)), PartPose.offsetAndRotation(7.8468F, 2.1099F, 1.6463F, -1.6499F, 0.0368F, 2.0057F));

        PartDefinition cube_r269 = base1.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(149, 258).addBox(-1.375F, -3.385F, -1.375F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(7.636F, 2.1583F, 2.5313F, -1.6499F, 0.0368F, 2.0057F));

        PartDefinition cube_r270 = base1.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(184, 235).addBox(-0.5F, -12.5F, -15.0F, 1.0F, 24.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-4.5076F, 2.7833F, -0.6542F, -1.6581F, 0.0F, 1.5708F));

        PartDefinition cube_r271 = base1.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(21, 186).addBox(4.65F, -10.25F, -25.65F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.01F))
                .texOffs(0, 165).addBox(7.4F, -22.0F, -36.25F, 1.0F, 23.0F, 27.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-27.2576F, -5.1167F, -10.1542F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r272 = base1.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(163, 0).addBox(2.0F, 0.75F, -19.4F, 18.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-13.3325F, -8.1954F, -10.1116F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r273 = base1.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(242, 273).mirror().addBox(0.0F, -9.7243F, -28.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(23.3148F, -5.2257F, -20.5158F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r274 = base1.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(242, 273).mirror().addBox(0.0F, -8.7243F, -28.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(23.3148F, -5.2257F, -20.8158F, -1.5708F, 0.0F, -1.5708F));

        PartDefinition cube_r275 = base1.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(156, 121).mirror().addBox(-4.5F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(7.7842F, -1.9621F, -14.0916F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r276 = base1.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(156, 121).mirror().addBox(-4.5F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(7.7842F, -1.9621F, -13.7916F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r277 = base1.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(156, 121).mirror().addBox(-5.15F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(10.6779F, 2.1244F, -13.7873F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r278 = base1.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(156, 121).mirror().addBox(-5.15F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(10.6779F, 2.1244F, -14.0873F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r279 = base1.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(242, 273).addBox(-1.0F, -8.7243F, -28.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-32.691F, -5.2257F, -20.8158F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r280 = base1.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(242, 273).addBox(-1.0F, -9.7243F, -28.3F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-32.691F, -5.2257F, -20.5158F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r281 = base1.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(30, 248).addBox(-1.0F, 3.5757F, -27.3F, 1.0F, 1.0F, 19.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-22.4041F, -5.2345F, -23.7694F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r282 = base1.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(112, 149).addBox(-0.98F, -11.2743F, -20.3F, 1.0F, 15.0F, 6.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-22.0052F, -5.2515F, -23.5616F, -1.5708F, 0.0F, 1.5708F));

        PartDefinition cube_r283 = base1.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(174, 220).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8854F, 5.2626F, -34.8304F, 0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r284 = base1.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(279, 382).addBox(-12.5F, -0.5F, -6.5F, 25.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.0683F, 11.2379F, -4.6692F, 0.0785F, 0.0F, 0.0F));

        PartDefinition cube_r285 = base1.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(464, 498).addBox(-5.5F, -5.0F, -0.5F, 11.0F, 13.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(464, 498).addBox(10.5F, -5.0F, -0.5F, 11.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0354F, 1.9697F, -18.8375F, -0.1745F, 0.0F, 0.0F));

        PartDefinition cube_r286 = base1.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(0, 217).addBox(-5.0F, -0.5F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.9646F, 10.4697F, -25.4875F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r287 = base1.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(62, 53).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.3538F, 5.1486F, -66.9514F, -1.5784F, -0.0007F, -1.7452F));

        PartDefinition cube_r288 = base1.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(66, 107).addBox(-2.5F, 0.0F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.7279F, 5.1486F, -66.9514F, -1.5784F, 0.0007F, 1.7452F));

        PartDefinition cube_r289 = base1.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(65, 239).addBox(-3.576F, -12.0911F, 1.0F, 5.0F, 26.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.4172F, 5.648F, -53.0471F, -1.5784F, -0.043F, 1.7455F));

        PartDefinition cube_r290 = base1.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(374, 486).addBox(-1.424F, -12.0911F, 1.0F, 5.0F, 26.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.041F, 5.648F, -53.0471F, -1.5784F, 0.043F, -1.7455F));

        PartDefinition cube_r291 = base1.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(103, 31).addBox(-7.5F, -2.5F, -0.5F, 15.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.684F, 6.0039F, -68.0629F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r292 = base1.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(208, 45).mirror().addBox(-0.7F, -1.9F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-20.5811F, 9.2019F, -66.9628F, 0.0F, 0.0F, -0.2094F));

        PartDefinition cube_r293 = base1.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(208, 45).addBox(-1.3F, -1.9F, -0.2F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.2049F, 9.2019F, -66.9628F, 0.0F, 0.0F, 0.2094F));

        PartDefinition cube_r294 = base1.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(206, 36).mirror().addBox(-0.5F, -0.5F, -6.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.4744F, 11.8272F, -60.1709F, 0.0F, 0.0262F, 0.0F));

        PartDefinition cube_r295 = base1.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(207, 65).addBox(-2.5F, -0.5F, -6.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(93, 181).addBox(-1.5F, -4.8879F, 5.0F, 2.0F, 4.3879F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.9619F, 11.8272F, -60.1709F, 0.0F, -0.0262F, 0.0F));

        PartDefinition cube_r296 = base1.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(17, 5).addBox(-17.0F, -0.5F, -1.5F, 18.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(35, 5).addBox(0.25F, -0.5F, -1.5F, 16.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2881F, 8.0135F, -68.0566F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r297 = base1.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(0, 71).addBox(-1.0F, -15.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5619F, 1.6893F, -40.2375F, -1.0821F, -0.3578F, 0.0F));

        PartDefinition cube_r298 = base1.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-1.0F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.9818F, -5.8384F, -27.9875F, -1.5621F, -0.3578F, 0.0F));

        PartDefinition cube_r299 = base1.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(130, 142).addBox(0.0F, -0.7F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.358F, -5.8384F, -27.9875F, -1.5621F, 0.3578F, 0.0F));

        PartDefinition cube_r300 = base1.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(0, 70).addBox(0.0F, -15.0F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.9381F, 1.6893F, -40.2375F, -1.0821F, 0.3578F, 0.0F));

        PartDefinition cube_r301 = base1.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(156, 121).addBox(0.15F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.0541F, 2.1244F, -13.7873F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition cube_r302 = base1.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(156, 121).addBox(-0.5F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-17.1605F, -1.9621F, -13.7916F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition cube_r303 = base1.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(188, 88).addBox(-0.5F, -1.0F, 0.0F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-19.6693F, 1.5784F, -11.8592F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition cube_r304 = base1.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(68, 484).mirror().addBox(1.0F, -37.0F, -1.0F, 5.0F, 28.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-20.8381F, 7.5109F, -50.1292F, -1.5708F, 0.0F, -1.3963F));

        PartDefinition cube_r305 = base1.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(99, 484).mirror().addBox(-2.5F, -13.5F, -1.0F, 6.0F, 28.0F, 0.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-19.9151F, 9.5688F, -26.6292F, -1.5708F, 0.0F, -1.789F));

        PartDefinition cube_r306 = base1.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(99, 484).addBox(-3.5F, -13.5F, -1.0F, 6.0F, 28.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.5389F, 9.5688F, -26.6092F, -1.5708F, 0.0F, 1.789F));

        PartDefinition cube_r307 = base1.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(68, 484).addBox(-6.0F, -37.0F, -1.0F, 5.0F, 28.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.4619F, 7.5109F, -50.1092F, -1.5708F, 0.0F, 1.3963F));

        PartDefinition cube_r308 = base1.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(163, 24).addBox(-8.5F, -1.0F, 0.0F, 9.0F, 1.0F, 7.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.2931F, 1.5784F, -11.8592F, -1.5708F, 0.0F, 0.9599F));

        PartDefinition cube_r309 = base1.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(249, 0).mirror().addBox(-1.5F, -22.5F, -0.5F, 5.0F, 12.0128F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-20.8545F, 4.9695F, -9.6355F, -1.6581F, 0.0F, -1.3963F));

        PartDefinition cube_r310 = base1.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(249, 0).addBox(-3.5F, -22.5F, -0.5F, 5.0F, 12.0128F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.4783F, 4.9695F, -9.6355F, -1.6581F, 0.0F, 1.3963F));

        PartDefinition cube_r311 = base1.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(249, 0).addBox(-3.5F, -10.4672F, -0.5F, 5.0F, 10.9672F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.4783F, 4.9695F, -9.6355F, -1.6581F, 0.0F, 1.3963F));

        PartDefinition cube_r312 = base1.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(94, 177).addBox(-3.5F, 14.0F, -0.75F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(11.274F, 5.0055F, 3.8908F, -1.5708F, 0.0F, 1.3963F));

        PartDefinition cube_r313 = base1.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(114, 123).addBox(-2.5F, -8.5F, -1.0F, 6.0F, 1.739F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-19.9151F, 9.5688F, -49.6292F, -1.5708F, 0.0F, -1.789F));

        PartDefinition cube_r314 = base1.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(114, 58).addBox(-3.5F, -8.5F, -1.0F, 6.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.5389F, 9.5688F, -49.6092F, -1.5708F, 0.0F, 1.789F));

        PartDefinition cube_r315 = base1.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(144, 208).addBox(-0.5F, -6.0F, 0.5F, 1.0F, 12.0F, 7.4738F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-19.5219F, 9.9383F, 7.2463F, -1.5778F, 0.1548F, -1.5732F));

        PartDefinition cube_r316 = base1.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(71, 191).mirror().addBox(-0.5F, -6.0F, -0.5F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-18.7819F, 9.943F, 7.2138F, -1.6214F, 0.1548F, -1.5732F));

        PartDefinition cube_r317 = base1.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(71, 191).addBox(0.5F, -6.0F, -0.5F, 0.0F, 12.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(9.4372F, 9.9413F, 7.215F, -1.6214F, -0.1548F, 1.5732F));

        PartDefinition cube_r318 = base1.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(0, 318).addBox(-0.5F, -5.0F, 6.9771F, 2.0F, 10.0F, 13.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(8.9245F, 9.9384F, 7.2296F, -1.5778F, -0.1548F, 1.5732F));

        PartDefinition cube_r319 = base1.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(56, 177).addBox(-0.5F, -6.0F, -0.5F, 1.0F, 12.0F, 7.2071F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(9.1745F, 9.9384F, 7.2296F, -1.5778F, -0.1548F, 1.5732F));

        PartDefinition cube_r320 = base1.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(142, 121).addBox(-3.5F, -11.5F, -1.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(10.5389F, 9.5688F, -21.6092F, -1.5708F, 0.0F, 1.789F));

        PartDefinition cube_r321 = base1.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(156, 121).addBox(-0.5F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-17.1605F, -1.9621F, -14.0916F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition cube_r322 = base1.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(156, 121).addBox(0.15F, -3.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-20.0541F, 2.1244F, -14.0873F, -1.5708F, 0.0F, -0.9599F));

        PartDefinition bone15 = base1.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(-4.6881F, -6.6107F, -11.9375F));

        PartDefinition cube_r323 = bone15.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(466, 432).addBox(-1.0F, -0.5F, -10.5F, 2.0F, 2.0F, 21.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone11 = bone15.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(13.0925F, 15.2408F, 19.2472F));

        PartDefinition cube_r324 = bone11.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(98, 125).mirror().addBox(-2.0267F, -3.1355F, 0.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.3157F, -0.2203F, -0.0039F, -0.1671F, 0.0751F, -3.1293F));

        PartDefinition cube_r325 = bone11.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(98, 127).mirror().addBox(-2.0267F, -3.1355F, 0.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.4042F, -0.0233F, -1.3799F, -0.1671F, 0.0751F, -3.1293F));

        PartDefinition cube_r326 = bone11.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(100, 129).mirror().addBox(-2.7201F, -2.9582F, 0.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1286F, -0.1306F, 1.8596F));

        PartDefinition cube_r327 = bone11.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(95, 128).mirror().addBox(1.3299F, -2.9582F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(100, 131).mirror().addBox(-2.7201F, -2.9582F, -1.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.018F, -0.075F, -0.0059F, -0.1286F, -0.1306F, 1.8596F));

        PartDefinition cube_r328 = bone11.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(219, 130).mirror().addBox(-0.2F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(219, 130).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.0201F, -0.7691F, -0.0612F, -0.1726F, 1.4638F));

        PartDefinition cube_r329 = bone11.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(219, 130).mirror().addBox(-0.7F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.0132F, -2.0701F, -0.7691F, -0.0612F, -0.1726F, 1.4638F));

        PartDefinition cube_r330 = bone11.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(220, 130).mirror().addBox(-2.9622F, -3.7413F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.0104F, -0.006F, -0.0019F, -0.0612F, -0.1726F, 1.4202F));

        PartDefinition cube_r331 = bone11.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(219, 130).mirror().addBox(-3.0122F, -3.7413F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0266F, 0.2375F, 0.041F, -0.0612F, -0.1726F, 1.4202F));

        PartDefinition cube_r332 = bone11.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(68, 97).mirror().addBox(-1.25F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(72, 97).mirror().addBox(-1.6F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.3636F, -2.2313F, 0.5639F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r333 = bone11.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(62, 97).mirror().addBox(2.9F, -1.1F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2149F, -5.4597F, -4.1668F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r334 = bone11.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(76, 93).mirror().addBox(-0.5F, -1.1F, -1.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1983F, -5.5088F, -4.252F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r335 = bone11.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(79, 99).mirror().addBox(-1.6F, -1.0F, 0.1F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2871F, -5.3515F, -3.8426F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r336 = bone11.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(75, 99).mirror().addBox(-1.6F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.2814F, -5.5827F, -4.1691F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r337 = bone11.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(73, 103).mirror().addBox(3.7F, -1.1F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.1306F, -8.2445F, -8.1086F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r338 = bone11.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(478, 465).mirror().addBox(10.2F, -1.1F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.1653F, -6.2213F, -16.3872F, -1.5708F, -1.4835F, 2.9932F));

        PartDefinition cube_r339 = bone11.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(492, 459).mirror().addBox(10.2F, -1.1F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(471, 465).mirror().addBox(9.55F, -1.1F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(463, 455).mirror().addBox(-1.5F, -1.1F, 0.2F, 12.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(463, 457).mirror().addBox(-1.5F, -1.1F, -1.25F, 12.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.1308F, -6.2161F, -15.9887F, -1.5708F, -1.4835F, 2.9932F));

        PartDefinition cube_r340 = bone11.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(502, 471).mirror().addBox(-4.5759F, -1.1F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
                .texOffs(506, 461).mirror().addBox(-3.4259F, -1.1F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.2312F, -6.2311F, -15.2385F, 0.0F, -1.5708F, 1.4224F));

        PartDefinition cube_r341 = bone11.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(498, 459).mirror().addBox(-4.7759F, -1.1F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.2312F, -6.2311F, -15.6385F, 0.0F, -1.5708F, 1.4224F));

        PartDefinition cube_r342 = bone11.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(504, 459).mirror().addBox(-3.9259F, -1.3F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false)
                .texOffs(500, 461).mirror().addBox(-3.9259F, -1.3F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)).mirror(false), PartPose.offsetAndRotation(3.1295F, -6.1615F, -15.2214F, 0.0F, -1.5708F, 1.4224F));

        PartDefinition cube_r343 = bone11.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(457, 470).mirror().addBox(-5.0F, -1.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.308F, -6.3943F, -15.4144F, 0.0F, -1.5708F, 1.4224F));

        PartDefinition cube_r344 = bone11.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(450, 441).mirror().addBox(-1.2F, -1.1F, -10.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.731F, -14.8729F, -19.2144F, 0.0F, -1.5708F, 0.9425F));

        PartDefinition cube_r345 = bone11.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(463, 440).mirror().addBox(0.2F, -1.1F, -10.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.7413F, -14.8675F, -19.2472F, 0.0F, -1.5708F, 0.9425F));

        PartDefinition cube_r346 = bone11.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(168, 201).mirror().addBox(0.2F, -0.6F, -10.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-12.4116F, -15.1995F, -19.2472F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r347 = bone11.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(177, 200).mirror().addBox(0.2F, -0.6F, -10.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-12.4014F, -15.2049F, -20.6144F, 0.0F, -1.5708F, 0.0F));

        PartDefinition bone10 = bone15.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offset(-13.0925F, 15.2408F, 19.2472F));

        PartDefinition cube_r348 = bone10.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(85, 126).addBox(-3.9733F, -3.1355F, 0.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.3157F, -0.2203F, -0.0039F, -0.1671F, -0.0751F, 3.1293F));

        PartDefinition cube_r349 = bone10.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(98, 133).addBox(-3.9733F, -3.1355F, 0.2F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.4042F, -0.0233F, -1.3799F, -0.1671F, -0.0751F, 3.1293F));

        PartDefinition cube_r350 = bone10.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(87, 132).addBox(-2.2799F, -2.9582F, 0.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1286F, 0.1306F, -1.8596F));

        PartDefinition cube_r351 = bone10.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(91, 128).addBox(-2.3299F, -2.9582F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(89, 130).addBox(-2.2799F, -2.9582F, -1.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.018F, -0.075F, -0.0059F, -0.1286F, 0.1306F, -1.8596F));

        PartDefinition cube_r352 = bone10.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(219, 130).addBox(-0.8F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(219, 130).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.0132F, -2.0201F, -0.7691F, -0.0612F, 0.1726F, -1.4638F));

        PartDefinition cube_r353 = bone10.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(219, 130).addBox(-0.3F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.0132F, -2.0701F, -0.7691F, -0.0612F, 0.1726F, -1.4638F));

        PartDefinition cube_r354 = bone10.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(220, 130).addBox(1.9622F, -3.7413F, 0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0104F, -0.006F, -0.0019F, -0.0612F, 0.1726F, -1.4202F));

        PartDefinition cube_r355 = bone10.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(219, 130).addBox(1.0122F, -3.7413F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.0266F, 0.2375F, 0.041F, -0.0612F, 0.1726F, -1.4202F));

        PartDefinition cube_r356 = bone10.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(80, 101).addBox(0.25F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(76, 101).addBox(0.6F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.3636F, -2.2313F, 0.5639F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r357 = bone10.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(68, 104).addBox(-4.9F, -1.1F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2149F, -5.4597F, -4.1668F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r358 = bone10.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(60, 101).addBox(-4.5F, -1.1F, -1.2F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1983F, -5.5088F, -4.252F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r359 = bone10.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(61, 99).addBox(-4.4F, -1.0F, 0.1F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2871F, -5.3515F, -3.8426F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r360 = bone10.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(72, 101).addBox(0.6F, -1.0F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.2814F, -5.5827F, -4.1691F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r361 = bone10.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(78, 104).addBox(-5.7F, -1.1F, -1.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.1306F, -8.2445F, -8.1086F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r362 = bone10.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(473, 467).addBox(-11.2F, -1.1F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.1653F, -6.2213F, -16.3872F, -1.5708F, 1.4835F, -2.9932F));

        PartDefinition cube_r363 = bone10.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(469, 467).addBox(-11.2F, -1.1F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(465, 465).addBox(-11.55F, -1.1F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(472, 469).addBox(-10.5F, -1.1F, 0.2F, 12.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(458, 459).addBox(-10.5F, -1.1F, -1.25F, 12.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.1308F, -6.2161F, -15.9887F, -1.5708F, 1.4835F, -2.9932F));

        PartDefinition cube_r364 = bone10.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(488, 461).addBox(1.5759F, -1.1F, -1.25F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(484, 459).addBox(1.4259F, -1.1F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2312F, -6.2311F, -15.2385F, 0.0F, 1.5708F, -1.4224F));

        PartDefinition cube_r365 = bone10.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(496, 467).addBox(2.7759F, -1.1F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.2312F, -6.2311F, -15.6385F, 0.0F, 1.5708F, -1.4224F));

        PartDefinition cube_r366 = bone10.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(497, 470).addBox(1.9259F, -1.3F, 0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(482, 461).addBox(1.9259F, -1.3F, 0.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(-3.1295F, -6.1615F, -15.2214F, 0.0F, 1.5708F, -1.4224F));

        PartDefinition cube_r367 = bone10.addOrReplaceChild("cube_r367", CubeListBuilder.create().texOffs(502, 467).addBox(4.0F, -1.0F, -1.1F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.308F, -6.3943F, -15.4144F, 0.0F, 1.5708F, -1.4224F));

        PartDefinition cube_r368 = bone10.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(484, 471).addBox(0.2F, -1.1F, -10.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.731F, -14.8729F, -19.2144F, 0.0F, 1.5708F, -0.9425F));

        PartDefinition cube_r369 = bone10.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(463, 428).addBox(-1.2F, -1.1F, -10.5F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.7413F, -14.8675F, -19.2472F, 0.0F, 1.5708F, -0.9425F));

        PartDefinition cube_r370 = bone10.addOrReplaceChild("cube_r370", CubeListBuilder.create().texOffs(160, 209).addBox(-1.2F, -0.6F, -10.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(12.4116F, -15.1995F, -19.2472F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r371 = bone10.addOrReplaceChild("cube_r371", CubeListBuilder.create().texOffs(183, 208).addBox(-1.2F, -0.6F, -10.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(12.4014F, -15.2049F, -20.6144F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone14 = bone15.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offset(-13.2951F, 15.0161F, 19.2413F));

        PartDefinition cube_r372 = bone14.addOrReplaceChild("cube_r372", CubeListBuilder.create().texOffs(96, 135).addBox(-3.9733F, -3.0355F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1671F, -0.0751F, 3.1293F));

        PartDefinition cube_r373 = bone14.addOrReplaceChild("cube_r373", CubeListBuilder.create().texOffs(100, 121).addBox(-2.2799F, -2.8582F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2206F, 0.1497F, 0.0F, -0.1286F, 0.1306F, -1.8596F));

        PartDefinition cube_r374 = bone14.addOrReplaceChild("cube_r374", CubeListBuilder.create().texOffs(218, 129).addBox(0.8122F, -3.6413F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.2206F, 0.1497F, 0.0F, -0.0612F, 0.1726F, -1.4202F));

        PartDefinition cube_r375 = bone14.addOrReplaceChild("cube_r375", CubeListBuilder.create().texOffs(60, 93).addBox(-5.5F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.9957F, -5.2841F, -4.2461F, -0.1514F, 0.9545F, -1.5463F));

        PartDefinition cube_r376 = bone14.addOrReplaceChild("cube_r376", CubeListBuilder.create().texOffs(489, 455).addBox(1.5759F, -1.0F, -1.0F, 3.4241F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-3.0291F, -6.0065F, -15.2413F, 0.0F, 1.5708F, -1.4224F));

        PartDefinition cube_r377 = bone14.addOrReplaceChild("cube_r377", CubeListBuilder.create().texOffs(482, 463).addBox(-11.5F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.9283F, -5.9914F, -15.9828F, -1.5708F, 1.4835F, -2.9932F));

        PartDefinition cube_r378 = bone14.addOrReplaceChild("cube_r378", CubeListBuilder.create().texOffs(486, 419).addBox(-1.0F, -1.0F, -10.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(2.9438F, -14.6428F, -19.2413F, 0.0F, 1.5708F, -0.9425F));

        PartDefinition cube_r379 = bone14.addOrReplaceChild("cube_r379", CubeListBuilder.create().texOffs(176, 209).addBox(-1.0F, -0.5F, -10.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(12.6951F, -15.0161F, -19.2413F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone13 = bone15.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(500, 455).mirror().addBox(-4.1951F, -15.5161F, -20.2155F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offset(13.2951F, 15.0161F, 19.2155F));

        PartDefinition cube_r380 = bone13.addOrReplaceChild("cube_r380", CubeListBuilder.create().texOffs(451, 465).mirror().addBox(-2.0267F, -3.0355F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1671F, 0.0751F, -3.1293F));

        PartDefinition cube_r381 = bone13.addOrReplaceChild("cube_r381", CubeListBuilder.create().texOffs(457, 469).mirror().addBox(-1.0F, -1.0F, -10.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-2.9438F, -14.6428F, -19.2155F, 0.0F, -1.5708F, 0.9425F));

        PartDefinition cube_r382 = bone13.addOrReplaceChild("cube_r382", CubeListBuilder.create().texOffs(501, 449).mirror().addBox(-5.0F, -1.0F, -1.0F, 3.3982F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(3.0291F, -6.0065F, -15.2155F, 0.0F, -1.5708F, 1.4224F));

        PartDefinition cube_r383 = bone13.addOrReplaceChild("cube_r383", CubeListBuilder.create().texOffs(82, 135).mirror().addBox(-2.7201F, -2.8582F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2206F, 0.1497F, 0.0F, -0.1286F, -0.1306F, 1.8596F));

        PartDefinition cube_r384 = bone13.addOrReplaceChild("cube_r384", CubeListBuilder.create().texOffs(218, 129).mirror().addBox(-2.8122F, -3.6413F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.2206F, 0.1497F, 0.0F, -0.0612F, -0.1726F, 1.4202F));

        PartDefinition cube_r385 = bone13.addOrReplaceChild("cube_r385", CubeListBuilder.create().texOffs(76, 95).mirror().addBox(-1.5F, -1.0F, -1.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.9957F, -5.2841F, -4.2461F, -0.1514F, -0.9545F, 1.5463F));

        PartDefinition cube_r386 = bone13.addOrReplaceChild("cube_r386", CubeListBuilder.create().texOffs(454, 461).mirror().addBox(-1.5F, -1.0F, -1.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(2.9283F, -5.9914F, -15.9828F, -1.5708F, -1.4835F, 2.9932F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        /** Replace these with a way to switch between BTTF 1/2/3 DeLorean later **/
        /** 0 = BTTF 1, 1 = BTTF2, 2 = BTTF3 **/
        byte BTTFVar = 0;
        boolean HasHook = false;

        switch(BTTFVar) {
            case 0: {
                Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                wheelsBTTF1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                ReactorBase.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                break;
            }

            case 1: {
                Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                wheelsBTTF1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                MrFusion.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            }

            case 2: {
                Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                wheelsBTTFIII.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                MrFusion.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                BTTFPartIII.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
            }

            default: {
                Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                wheelsBTTF1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
                break;
            }
        }

        if(HasHook)
            Hook.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public @NotNull ModelPart root() {
        return this.root;
    }

    @Override
    public void setupAnim(T t, float v, float v1, float v2, float v3, float v4) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        animateConditional(t, this);
    }


    public static <T extends CarExteriorEntity> void animateConditional(T car, DeLoreanExteriorModel<?> model) {
        String[] wheels = new String[]{"FrontRightWheel", "FrontLeftWheel", "BackLeftWheel", "BackRightWheel"};
        String[] frontWheels = new String[]{"FrontRightWheel", "FrontLeftWheel"};

        String[] wheelsbtt3 = new String[]{"FrontRightWheel2", "FrontLeftWheel2", "bone5", "bone12"};
        String[] frontWheelsbttf3 = new String[]{"FrontRightWheel2", "FrontLeftWheel2"};

        float wheelTurn = (float)Math.toRadians(car.getTurnAmount() * 6.0);
        int var4 = frontWheels.length;

        int var5;
        for(var5 = 0; var5 < var4; ++var5) {
            String name = frontWheels[var5];
            model.getAnyDescendantWithName(name).ifPresent((part) -> {
                part.offsetRotation(new Vector3f(0.0F, -wheelTurn, 0.0F));
            });
        }

        float wheelSpin = (float)Math.toRadians(-WorldHelper.getHorizonalSpeed(car) * (double)car.tickCount * 10.0 % 360.0);
        var5 = wheels.length;

        for(int var10 = 0; var10 < var5; ++var10) {
            String name = wheels[var10];
            model.getAnyDescendantWithName(name).ifPresent((part) -> {
                part.offsetRotation(new Vector3f(wheelSpin, 0.0F, 0.0F));
            });
        }
//  Trunk Animation
//        model.getAnyDescendantWithName("trunk").ifPresent((part) -> part.offsetRotation(new Vector3f((float)Math.toRadians(car.getDoorHandler().getDoorState().isOpen() ? 60.0 : 0.0), 0.0F, 0.0F)));
    }
}
