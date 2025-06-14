/* (C) TAMA Studios 2025 */
package tama.Client.Models.Consoles;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.animations.AnimationHelper;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataBool;
import net.tardis.mod.control.datas.ControlDataFloat;
import net.tardis.mod.registry.ControlRegistry;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import tama.TileEntities.Console.BrackolinConsoleTile;
import tama.aseoha;

import java.util.Optional;

public class BrackolinConsoleModel<T extends BrackolinConsoleTile> extends BaseTileHierarchicalModel<T>
        implements IAdditionalConsoleRenderData {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer
    // and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(aseoha.MODID, "brackolin"), "main");
    private final ModelPart Console;
    private final ModelPart BaseConsole;
    private final ModelPart Feet;
    private final ModelPart Foot1;
    private final ModelPart Foot2;
    private final ModelPart Foot3;
    private final ModelPart ConsolePillar;
    private final ModelPart Part1;
    private final ModelPart Part2;
    private final ModelPart Part3;
    private final ModelPart Part4;
    private final ModelPart Part5;
    private final ModelPart PanelBase;
    private final ModelPart P1;
    private final ModelPart PanelSplitters;
    private final ModelPart Rotation;
    private final ModelPart Angle;
    private final ModelPart PanelBaseSlant;
    private final ModelPart bone19;
    private final ModelPart bone18;
    private final ModelPart P2;
    private final ModelPart PanelSplitters2;
    private final ModelPart Rotation2;
    private final ModelPart Angle2;
    private final ModelPart PanelBaseSlant2;
    private final ModelPart bone16;
    private final ModelPart bone17;
    private final ModelPart P3;
    private final ModelPart PanelSplitters3;
    private final ModelPart Rotation3;
    private final ModelPart Angle3;
    private final ModelPart PanelBaseSlant3;
    private final ModelPart P4;
    private final ModelPart PanelSplitters4;
    private final ModelPart Rotation4;
    private final ModelPart Angle4;
    private final ModelPart PanelBaseSlant4;
    private final ModelPart bone20;
    private final ModelPart bone21;
    private final ModelPart P5;
    private final ModelPart PanelSplitters5;
    private final ModelPart Rotation5;
    private final ModelPart Angle5;
    private final ModelPart PanelBaseSlant5;
    private final ModelPart Monitor;
    private final ModelPart P6;
    private final ModelPart PanelSplitters6;
    private final ModelPart Rotation6;
    private final ModelPart Angle6;
    private final ModelPart PanelBaseSlant6;
    private final ModelPart SupportStruts;
    private final ModelPart Strut1;
    private final ModelPart Strut2;
    private final ModelPart Strut3;
    private final ModelPart TimeRotor;
    private final ModelPart Part6;
    private final ModelPart Part7;
    private final ModelPart Part8;
    private final ModelPart Controls;
    private final ModelPart Panel1;
    private final ModelPart PanelBaseSlant7;
    private final ModelPart Refuel;
    private final ModelPart DimensionalShifter;
    private final ModelPart XControl;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart YControl;
    private final ModelPart ZControl;
    private final ModelPart ControlIncMod;
    private final ModelPart Panel2;
    private final ModelPart PanelBaseSlant8;
    private final ModelPart DoorSwitch;
    private final ModelPart DoorSwitch2;
    private final ModelPart Panel3;
    private final ModelPart PanelBaseSlant9;
    private final ModelPart Randomiser;
    private final ModelPart VerticalLandType;
    private final ModelPart VerticalLandTypeUp;
    private final ModelPart VerticalLandTypeDown;
    private final ModelPart ExteriorFacing;
    private final ModelPart bone15;
    private final ModelPart TopBitFacing;
    private final ModelPart ExteriorFacingWest;
    private final ModelPart ExteriorFacingSouth;
    private final ModelPart ExteriorFacingEast;
    private final ModelPart ExteriorFacingNorth;
    private final ModelPart RandomLevers;
    private final ModelPart Lever;
    private final ModelPart Lever2;
    private final ModelPart Lever3;
    private final ModelPart Lever4;
    private final ModelPart Lever6;
    private final ModelPart Lever7;
    private final ModelPart Lever8;
    private final ModelPart Lever9;
    private final ModelPart Lights2;
    private final ModelPart Lamp2;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart bone7;
    private final ModelPart bone8;
    private final ModelPart Panel4;
    private final ModelPart PanelBaseSlant10;
    private final ModelPart Handbrake;
    private final ModelPart Throttle;
    private final ModelPart Lights3;
    private final ModelPart Lamp3;
    private final ModelPart Lights5;
    private final ModelPart Lamp5;
    private final ModelPart bone;
    private final ModelPart bone2;
    private final ModelPart bone4;
    private final ModelPart bone3;
    private final ModelPart Panel6;
    private final ModelPart PanelBaseSlant11;
    private final ModelPart FastReturn;
    private final ModelPart Lights4;
    private final ModelPart Lamp4;
    private final ModelPart bone13;
    private final ModelPart bone14;
    private final ModelPart bone12;
    private final ModelPart bone11;
    private final ModelPart RandomLevers2;
    private final ModelPart Lever5;
    private final ModelPart Lever10;
    private final ModelPart Lever11;
    private final ModelPart Lever12;
    private final ModelPart Lever13;
    private final ModelPart Lever14;
    private final ModelPart Lever15;
    private final ModelPart Lever16;
    private final ModelPart bb_main;

    public BrackolinConsoleModel(ModelPart root) {
        super(root);
        this.Console = root.getChild("Console");
        this.BaseConsole = this.Console.getChild("BaseConsole");
        this.Feet = this.BaseConsole.getChild("Feet");
        this.Foot1 = this.Feet.getChild("Foot1");
        this.Foot2 = this.Feet.getChild("Foot2");
        this.Foot3 = this.Feet.getChild("Foot3");
        this.ConsolePillar = this.BaseConsole.getChild("ConsolePillar");
        this.Part1 = this.ConsolePillar.getChild("Part1");
        this.Part2 = this.ConsolePillar.getChild("Part2");
        this.Part3 = this.ConsolePillar.getChild("Part3");
        this.Part4 = this.ConsolePillar.getChild("Part4");
        this.Part5 = this.ConsolePillar.getChild("Part5");
        this.PanelBase = this.BaseConsole.getChild("PanelBase");
        this.P1 = this.PanelBase.getChild("P1");
        this.PanelSplitters = this.P1.getChild("PanelSplitters");
        this.Rotation = this.PanelSplitters.getChild("Rotation");
        this.Angle = this.Rotation.getChild("Angle");
        this.PanelBaseSlant = this.P1.getChild("PanelBaseSlant");
        this.bone19 = this.PanelBaseSlant.getChild("bone19");
        this.bone18 = this.PanelBaseSlant.getChild("bone18");
        this.P2 = this.PanelBase.getChild("P2");
        this.PanelSplitters2 = this.P2.getChild("PanelSplitters2");
        this.Rotation2 = this.PanelSplitters2.getChild("Rotation2");
        this.Angle2 = this.Rotation2.getChild("Angle2");
        this.PanelBaseSlant2 = this.P2.getChild("PanelBaseSlant2");
        this.bone16 = this.PanelBaseSlant2.getChild("bone16");
        this.bone17 = this.PanelBaseSlant2.getChild("bone17");
        this.P3 = this.PanelBase.getChild("P3");
        this.PanelSplitters3 = this.P3.getChild("PanelSplitters3");
        this.Rotation3 = this.PanelSplitters3.getChild("Rotation3");
        this.Angle3 = this.Rotation3.getChild("Angle3");
        this.PanelBaseSlant3 = this.P3.getChild("PanelBaseSlant3");
        this.P4 = this.PanelBase.getChild("P4");
        this.PanelSplitters4 = this.P4.getChild("PanelSplitters4");
        this.Rotation4 = this.PanelSplitters4.getChild("Rotation4");
        this.Angle4 = this.Rotation4.getChild("Angle4");
        this.PanelBaseSlant4 = this.P4.getChild("PanelBaseSlant4");
        this.bone20 = this.PanelBaseSlant4.getChild("bone20");
        this.bone21 = this.PanelBaseSlant4.getChild("bone21");
        this.P5 = this.PanelBase.getChild("P5");
        this.PanelSplitters5 = this.P5.getChild("PanelSplitters5");
        this.Rotation5 = this.PanelSplitters5.getChild("Rotation5");
        this.Angle5 = this.Rotation5.getChild("Angle5");
        this.PanelBaseSlant5 = this.P5.getChild("PanelBaseSlant5");
        this.Monitor = this.PanelBaseSlant5.getChild("Monitor");
        this.P6 = this.PanelBase.getChild("P6");
        this.PanelSplitters6 = this.P6.getChild("PanelSplitters6");
        this.Rotation6 = this.PanelSplitters6.getChild("Rotation6");
        this.Angle6 = this.Rotation6.getChild("Angle6");
        this.PanelBaseSlant6 = this.P6.getChild("PanelBaseSlant6");
        this.SupportStruts = this.BaseConsole.getChild("SupportStruts");
        this.Strut1 = this.SupportStruts.getChild("Strut1");
        this.Strut2 = this.SupportStruts.getChild("Strut2");
        this.Strut3 = this.SupportStruts.getChild("Strut3");
        this.TimeRotor = this.Console.getChild("TimeRotor");
        this.Part6 = this.TimeRotor.getChild("Part6");
        this.Part7 = this.TimeRotor.getChild("Part7");
        this.Part8 = this.TimeRotor.getChild("Part8");
        this.Controls = root.getChild("Controls");
        this.Panel1 = this.Controls.getChild("Panel1");
        this.PanelBaseSlant7 = this.Panel1.getChild("PanelBaseSlant7");
        this.Refuel = this.PanelBaseSlant7.getChild("Refuel");
        this.DimensionalShifter = this.PanelBaseSlant7.getChild("DimensionalShifter");
        this.XControl = this.PanelBaseSlant7.getChild("XControl");
        this.bone9 = this.PanelBaseSlant7.getChild("bone9");
        this.bone10 = this.PanelBaseSlant7.getChild("bone10");
        this.YControl = this.PanelBaseSlant7.getChild("YControl");
        this.ZControl = this.PanelBaseSlant7.getChild("ZControl");
        this.ControlIncMod = this.PanelBaseSlant7.getChild("ControlIncMod");
        this.Panel2 = this.Controls.getChild("Panel2");
        this.PanelBaseSlant8 = this.Panel2.getChild("PanelBaseSlant8");
        this.DoorSwitch = this.Panel2.getChild("DoorSwitch");
        this.DoorSwitch2 = this.Panel2.getChild("DoorSwitch2");
        this.Panel3 = this.Controls.getChild("Panel3");
        this.PanelBaseSlant9 = this.Panel3.getChild("PanelBaseSlant9");
        this.Randomiser = this.PanelBaseSlant9.getChild("Randomiser");
        this.VerticalLandType = this.PanelBaseSlant9.getChild("VerticalLandType");
        this.VerticalLandTypeUp = this.VerticalLandType.getChild("VerticalLandTypeUp");
        this.VerticalLandTypeDown = this.VerticalLandType.getChild("VerticalLandTypeDown");
        this.ExteriorFacing = this.PanelBaseSlant9.getChild("ExteriorFacing");
        this.bone15 = this.ExteriorFacing.getChild("bone15");
        this.TopBitFacing = this.ExteriorFacing.getChild("TopBitFacing");
        this.ExteriorFacingWest = this.TopBitFacing.getChild("ExteriorFacingWest");
        this.ExteriorFacingSouth = this.TopBitFacing.getChild("ExteriorFacingSouth");
        this.ExteriorFacingEast = this.TopBitFacing.getChild("ExteriorFacingEast");
        this.ExteriorFacingNorth = this.TopBitFacing.getChild("ExteriorFacingNorth");
        this.RandomLevers = this.PanelBaseSlant9.getChild("RandomLevers");
        this.Lever = this.RandomLevers.getChild("Lever");
        this.Lever2 = this.RandomLevers.getChild("Lever2");
        this.Lever3 = this.RandomLevers.getChild("Lever3");
        this.Lever4 = this.RandomLevers.getChild("Lever4");
        this.Lever6 = this.RandomLevers.getChild("Lever6");
        this.Lever7 = this.RandomLevers.getChild("Lever7");
        this.Lever8 = this.RandomLevers.getChild("Lever8");
        this.Lever9 = this.RandomLevers.getChild("Lever9");
        this.Lights2 = this.PanelBaseSlant9.getChild("Lights2");
        this.Lamp2 = this.Lights2.getChild("Lamp2");
        this.bone5 = this.Lamp2.getChild("bone5");
        this.bone6 = this.Lamp2.getChild("bone6");
        this.bone7 = this.Lamp2.getChild("bone7");
        this.bone8 = this.Lamp2.getChild("bone8");
        this.Panel4 = this.Controls.getChild("Panel4");
        this.PanelBaseSlant10 = this.Panel4.getChild("PanelBaseSlant10");
        this.Handbrake = this.PanelBaseSlant10.getChild("Handbrake");
        this.Throttle = this.PanelBaseSlant10.getChild("Throttle");
        this.Lights3 = this.PanelBaseSlant10.getChild("Lights3");
        this.Lamp3 = this.Lights3.getChild("Lamp3");
        this.Lights5 = this.PanelBaseSlant10.getChild("Lights5");
        this.Lamp5 = this.Lights5.getChild("Lamp5");
        this.bone = this.Lamp5.getChild("bone");
        this.bone2 = this.Lamp5.getChild("bone2");
        this.bone4 = this.Lamp5.getChild("bone4");
        this.bone3 = this.Lamp5.getChild("bone3");
        this.Panel6 = this.Controls.getChild("Panel6");
        this.PanelBaseSlant11 = this.Panel6.getChild("PanelBaseSlant11");
        this.FastReturn = this.PanelBaseSlant11.getChild("FastReturn");
        this.Lights4 = this.PanelBaseSlant11.getChild("Lights4");
        this.Lamp4 = this.Lights4.getChild("Lamp4");
        this.bone13 = this.Lamp4.getChild("bone13");
        this.bone14 = this.Lamp4.getChild("bone14");
        this.bone12 = this.Lamp4.getChild("bone12");
        this.bone11 = this.Lamp4.getChild("bone11");
        this.RandomLevers2 = this.PanelBaseSlant11.getChild("RandomLevers2");
        this.Lever5 = this.RandomLevers2.getChild("Lever5");
        this.Lever10 = this.RandomLevers2.getChild("Lever10");
        this.Lever11 = this.RandomLevers2.getChild("Lever11");
        this.Lever12 = this.RandomLevers2.getChild("Lever12");
        this.Lever13 = this.RandomLevers2.getChild("Lever13");
        this.Lever14 = this.RandomLevers2.getChild("Lever14");
        this.Lever15 = this.RandomLevers2.getChild("Lever15");
        this.Lever16 = this.RandomLevers2.getChild("Lever16");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Console = partdefinition.addOrReplaceChild(
                "Console", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition BaseConsole =
                Console.addOrReplaceChild("BaseConsole", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Feet =
                BaseConsole.addOrReplaceChild("Feet", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Foot1 = Feet.addOrReplaceChild(
                "Foot1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r1 = Foot1.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(46, 92)
                        .addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 99)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.7119F, -8.1283F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Foot1.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(26, 124)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.249F)),
                PartPose.offsetAndRotation(0.0F, -0.4775F, -6.0761F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r3 = Foot1.addOrReplaceChild(
                "cube_r3",
                CubeListBuilder.create()
                        .texOffs(94, 86)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.1736F, -3.9923F, -0.2618F, 0.0F, 0.0F));

        PartDefinition Foot2 = Feet.addOrReplaceChild(
                "Foot2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r4 = Foot2.addOrReplaceChild(
                "cube_r4",
                CubeListBuilder.create()
                        .texOffs(86, 6)
                        .addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(75, 29)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.7119F, -8.1283F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r5 = Foot2.addOrReplaceChild(
                "cube_r5",
                CubeListBuilder.create()
                        .texOffs(80, 66)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.249F)),
                PartPose.offsetAndRotation(0.0F, -0.4775F, -6.0761F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r6 = Foot2.addOrReplaceChild(
                "cube_r6",
                CubeListBuilder.create()
                        .texOffs(86, 21)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.1736F, -3.9923F, -0.2618F, 0.0F, 0.0F));

        PartDefinition Foot3 = Feet.addOrReplaceChild(
                "Foot3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r7 = Foot3.addOrReplaceChild(
                "cube_r7",
                CubeListBuilder.create()
                        .texOffs(42, 70)
                        .addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 67)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.7119F, -8.1283F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r8 = Foot3.addOrReplaceChild(
                "cube_r8",
                CubeListBuilder.create()
                        .texOffs(16, 70)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.249F)),
                PartPose.offsetAndRotation(0.0F, -0.4775F, -6.0761F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r9 = Foot3.addOrReplaceChild(
                "cube_r9",
                CubeListBuilder.create()
                        .texOffs(66, 78)
                        .addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.1736F, -3.9923F, -0.2618F, 0.0F, 0.0F));

        PartDefinition ConsolePillar = BaseConsole.addOrReplaceChild(
                "ConsolePillar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Part1 = ConsolePillar.addOrReplaceChild(
                "Part1",
                CubeListBuilder.create()
                        .texOffs(39, 135)
                        .addBox(-0.9946F, -9.0F, -5.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(53, 103)
                        .addBox(-0.9946F, -9.0F, 4.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(43, 39)
                        .addBox(-5.0F, -9.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(0, 13)
                        .addBox(4.0F, -9.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -10.75F, 0.0F));

        PartDefinition hexadecagon_r1 = Part1.addOrReplaceChild(
                "hexadecagon_r1",
                CubeListBuilder.create()
                        .texOffs(0, 26)
                        .addBox(4.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(0, 39)
                        .addBox(-5.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(104, 105)
                        .addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(78, 133)
                        .addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r2 = Part1.addOrReplaceChild(
                "hexadecagon_r2",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(4.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(34, 52)
                        .addBox(-5.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(39, 102)
                        .addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 135)
                        .addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r3 = Part1.addOrReplaceChild(
                "hexadecagon_r3",
                CubeListBuilder.create()
                        .texOffs(48, 55)
                        .addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(107, 86)
                        .addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r4 = Part1.addOrReplaceChild(
                "hexadecagon_r4",
                CubeListBuilder.create()
                        .texOffs(0, 81)
                        .addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(117, 135)
                        .addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Part2 = ConsolePillar.addOrReplaceChild(
                "Part2",
                CubeListBuilder.create()
                        .texOffs(0, 81)
                        .addBox(-0.8951F, -11.0F, -4.5F, 1.7902F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 112)
                        .addBox(-4.5F, -11.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -3.0F, 0.0F));

        PartDefinition hexadecagon_r5 = Part2.addOrReplaceChild(
                "hexadecagon_r5",
                CubeListBuilder.create()
                        .texOffs(108, 73)
                        .addBox(-4.5F, -3.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(66, 75)
                        .addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r6 = Part2.addOrReplaceChild(
                "hexadecagon_r6",
                CubeListBuilder.create()
                        .texOffs(113, 105)
                        .addBox(-4.5F, -3.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(82, 66)
                        .addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r7 = Part2.addOrReplaceChild(
                "hexadecagon_r7",
                CubeListBuilder.create()
                        .texOffs(43, 70)
                        .addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r8 = Part2.addOrReplaceChild(
                "hexadecagon_r8",
                CubeListBuilder.create()
                        .texOffs(23, 84)
                        .addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Part3 = ConsolePillar.addOrReplaceChild(
                "Part3",
                CubeListBuilder.create()
                        .texOffs(86, 6)
                        .addBox(-0.9946F, -7.0F, -5.0F, 1.9891F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(111, 116)
                        .addBox(-5.0F, -7.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 1.0F, 0.0F));

        PartDefinition hexadecagon_r9 = Part3.addOrReplaceChild(
                "hexadecagon_r9",
                CubeListBuilder.create()
                        .texOffs(114, 26)
                        .addBox(-5.0F, 1.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(85, 40)
                        .addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r10 = Part3.addOrReplaceChild(
                "hexadecagon_r10",
                CubeListBuilder.create()
                        .texOffs(23, 117)
                        .addBox(-5.0F, 1.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, new CubeDeformation(0.0F))
                        .texOffs(86, 21)
                        .addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r11 = Part3.addOrReplaceChild(
                "hexadecagon_r11",
                CubeListBuilder.create()
                        .texOffs(79, 84)
                        .addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r12 = Part3.addOrReplaceChild(
                "hexadecagon_r12",
                CubeListBuilder.create()
                        .texOffs(46, 88)
                        .addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Part4 = ConsolePillar.addOrReplaceChild(
                "Part4",
                CubeListBuilder.create()
                        .texOffs(17, 55)
                        .addBox(-1.1935F, -5.0F, -6.0F, 2.3869F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                        .texOffs(101, 11)
                        .addBox(-6.0F, -5.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 3.0F, 0.0F));

        PartDefinition hexadecagon_r13 = Part4.addOrReplaceChild(
                "hexadecagon_r13",
                CubeListBuilder.create()
                        .texOffs(101, 6)
                        .addBox(-6.0F, 3.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, new CubeDeformation(0.0F))
                        .texOffs(0, 52)
                        .addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r14 = Part4.addOrReplaceChild(
                "hexadecagon_r14",
                CubeListBuilder.create()
                        .texOffs(101, 21)
                        .addBox(-6.0F, 3.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, new CubeDeformation(0.0F))
                        .texOffs(46, 55)
                        .addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r15 = Part4.addOrReplaceChild(
                "hexadecagon_r15",
                CubeListBuilder.create()
                        .texOffs(41, 40)
                        .addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r16 = Part4.addOrReplaceChild(
                "hexadecagon_r16",
                CubeListBuilder.create()
                        .texOffs(58, 29)
                        .addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -8.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Part5 = ConsolePillar.addOrReplaceChild(
                "Part5",
                CubeListBuilder.create()
                        .texOffs(133, 139)
                        .addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(139, 6)
                        .addBox(-0.8951F, -3.0F, 3.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(99, 120)
                        .addBox(3.5F, -3.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(25, 84)
                        .addBox(-4.5F, -3.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -17.0F, 0.0F));

        PartDefinition hexadecagon_r17 = Part5.addOrReplaceChild(
                "hexadecagon_r17",
                CubeListBuilder.create()
                        .texOffs(57, 70)
                        .addBox(-4.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(53, 120)
                        .addBox(3.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(139, 0)
                        .addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(139, 126)
                        .addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r18 = Part5.addOrReplaceChild(
                "hexadecagon_r18",
                CubeListBuilder.create()
                        .texOffs(87, 39)
                        .addBox(-4.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(73, 125)
                        .addBox(3.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, new CubeDeformation(0.0F))
                        .texOffs(139, 28)
                        .addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 13)
                        .addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r19 = Part5.addOrReplaceChild(
                "hexadecagon_r19",
                CubeListBuilder.create()
                        .texOffs(137, 98)
                        .addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(139, 90)
                        .addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r20 = Part5.addOrReplaceChild(
                "hexadecagon_r20",
                CubeListBuilder.create()
                        .texOffs(139, 84)
                        .addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 66)
                        .addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition PanelBase =
                BaseConsole.addOrReplaceChild("PanelBase", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition P1 = PanelBase.addOrReplaceChild(
                "P1",
                CubeListBuilder.create()
                        .texOffs(96, 66)
                        .addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(43, 16)
                        .addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition PanelSplitters =
                P1.addOrReplaceChild("PanelSplitters", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Rotation = PanelSplitters.addOrReplaceChild(
                "Rotation",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Angle = Rotation.addOrReplaceChild(
                "Angle",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -16.25F, -10.5F, 0.4625F, 0.0F, 0.0F));

        PartDefinition cube_r10 = Angle.addOrReplaceChild(
                "cube_r10",
                CubeListBuilder.create()
                        .texOffs(100, 28)
                        .addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition PanelBaseSlant = P1.addOrReplaceChild(
                "PanelBaseSlant",
                CubeListBuilder.create()
                        .texOffs(100, 45)
                        .addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                        .texOffs(98, 129)
                        .addBox(3.0F, -0.634F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(10, 123)
                        .addBox(-6.0F, -0.634F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(23, 90)
                        .addBox(-5.0F, -0.634F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(94, 91)
                        .addBox(2.0F, -0.634F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(114, 33)
                        .addBox(-4.0F, -0.634F, 2.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone19 = PanelBaseSlant.addOrReplaceChild(
                "bone19",
                CubeListBuilder.create()
                        .texOffs(116, 123)
                        .addBox(-3.5F, -0.5F, -1.0F, 7.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.2075F, -0.2255F, -0.5236F, 0.0F, 0.0F));

        PartDefinition bone18 = PanelBaseSlant.addOrReplaceChild(
                "bone18",
                CubeListBuilder.create()
                        .texOffs(121, 90)
                        .addBox(-3.5F, -0.5F, -2.5F, 7.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.0308F, 2.2654F, 0.829F, 0.0F, 0.0F));

        PartDefinition P2 = PanelBase.addOrReplaceChild(
                "P2",
                CubeListBuilder.create()
                        .texOffs(86, 3)
                        .addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(43, 3)
                        .addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition PanelSplitters2 =
                P2.addOrReplaceChild("PanelSplitters2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Rotation2 = PanelSplitters2.addOrReplaceChild(
                "Rotation2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Angle2 = Rotation2.addOrReplaceChild(
                "Angle2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -16.25F, -10.5F, 0.4625F, 0.0F, 0.0F));

        PartDefinition cube_r11 = Angle2.addOrReplaceChild(
                "cube_r11",
                CubeListBuilder.create()
                        .texOffs(74, 99)
                        .addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition PanelBaseSlant2 = P2.addOrReplaceChild(
                "PanelBaseSlant2",
                CubeListBuilder.create()
                        .texOffs(100, 41)
                        .addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 58)
                        .addBox(3.5F, -0.634F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(121, 84)
                        .addBox(-5.5F, -0.634F, -1.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(110, 49)
                        .addBox(-4.5F, -0.634F, 1.5F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone16 = PanelBaseSlant2.addOrReplaceChild(
                "bone16",
                CubeListBuilder.create()
                        .texOffs(130, 20)
                        .addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(3.0F, 0.7075F, 0.6405F, -0.5236F, 0.0F, 0.0F));

        PartDefinition bone17 = PanelBaseSlant2.addOrReplaceChild(
                "bone17",
                CubeListBuilder.create()
                        .texOffs(129, 55)
                        .addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(3.0F, 0.3905F, 1.5915F, 1.0472F, 0.0F, 0.0F));

        PartDefinition P3 = PanelBase.addOrReplaceChild(
                "P3",
                CubeListBuilder.create()
                        .texOffs(80, 63)
                        .addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 39)
                        .addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition PanelSplitters3 =
                P3.addOrReplaceChild("PanelSplitters3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Rotation3 = PanelSplitters3.addOrReplaceChild(
                "Rotation3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Angle3 = Rotation3.addOrReplaceChild(
                "Angle3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -16.25F, -10.5F, 0.4625F, 0.0F, 0.0F));

        PartDefinition cube_r12 = Angle3.addOrReplaceChild(
                "cube_r12",
                CubeListBuilder.create()
                        .texOffs(0, 99)
                        .addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition PanelBaseSlant3 = P3.addOrReplaceChild(
                "PanelBaseSlant3",
                CubeListBuilder.create()
                        .texOffs(63, 55)
                        .addBox(-6.5F, -0.634F, -2.5F, 13.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                        .texOffs(111, 16)
                        .addBox(-5.0F, -0.634F, 1.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                        .texOffs(117, 98)
                        .addBox(-4.0F, -0.634F, 2.5F, 8.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition P4 = PanelBase.addOrReplaceChild(
                "P4",
                CubeListBuilder.create()
                        .texOffs(43, 0)
                        .addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 0)
                        .addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition PanelSplitters4 =
                P4.addOrReplaceChild("PanelSplitters4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Rotation4 = PanelSplitters4.addOrReplaceChild(
                "Rotation4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Angle4 = Rotation4.addOrReplaceChild(
                "Angle4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -16.25F, -10.5F, 0.4625F, 0.0F, 0.0F));

        PartDefinition cube_r13 = Angle4.addOrReplaceChild(
                "cube_r13",
                CubeListBuilder.create()
                        .texOffs(60, 93)
                        .addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition PanelBaseSlant4 = P4.addOrReplaceChild(
                "PanelBaseSlant4",
                CubeListBuilder.create()
                        .texOffs(96, 69)
                        .addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                        .texOffs(63, 61)
                        .addBox(-5.4F, -0.634F, -1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(121, 0)
                        .addBox(-1.4F, -0.634F, -1.0F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(43, 29)
                        .addBox(-4.5F, -0.634F, 1.5F, 9.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r14 = PanelBaseSlant4.addOrReplaceChild(
                "cube_r14",
                CubeListBuilder.create()
                        .texOffs(0, 73)
                        .addBox(-0.5F, -0.65F, -2.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(-3.0F, 0.7075F, 0.6405F, -0.5236F, 0.0F, 0.0F));

        PartDefinition bone20 = PanelBaseSlant4.addOrReplaceChild(
                "bone20",
                CubeListBuilder.create()
                        .texOffs(133, 47)
                        .addBox(-0.9F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(-3.0F, 0.7075F, 0.6405F, -0.5236F, 0.0F, 0.0F));

        PartDefinition bone21 = PanelBaseSlant4.addOrReplaceChild(
                "bone21",
                CubeListBuilder.create()
                        .texOffs(127, 128)
                        .addBox(-1.9F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(-3.0F, 0.3905F, 1.5915F, 1.0472F, 0.0F, 0.0F));

        PartDefinition P5 = PanelBase.addOrReplaceChild(
                "P5",
                CubeListBuilder.create()
                        .texOffs(78, 0)
                        .addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 26)
                        .addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition PanelSplitters5 =
                P5.addOrReplaceChild("PanelSplitters5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Rotation5 = PanelSplitters5.addOrReplaceChild(
                "Rotation5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Angle5 = Rotation5.addOrReplaceChild(
                "Angle5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -16.25F, -10.5F, 0.4625F, 0.0F, 0.0F));

        PartDefinition cube_r15 = Angle5.addOrReplaceChild(
                "cube_r15",
                CubeListBuilder.create()
                        .texOffs(94, 73)
                        .addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition PanelBaseSlant5 = P5.addOrReplaceChild(
                "PanelBaseSlant5",
                CubeListBuilder.create()
                        .texOffs(88, 101)
                        .addBox(-6.5F, -0.634F, -2.5F, 13.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                        .texOffs(71, 115)
                        .addBox(-3.0F, -0.384F, -1.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
                        .texOffs(129, 60)
                        .addBox(-2.5F, -0.734F, -1.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 105)
                        .addBox(1.5F, -0.634F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(23, 102)
                        .addBox(-5.5F, -0.634F, -1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(58, 38)
                        .addBox(-5.5F, -0.634F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(17, 61)
                        .addBox(1.5F, -0.634F, 3.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(108, 129)
                        .addBox(1.3F, -0.734F, 2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(123, 128)
                        .addBox(-3.3F, -0.734F, 2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(32, 74)
                        .addBox(-3.3F, -0.734F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(82, 112)
                        .addBox(1.3F, -0.734F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(17, 55)
                        .addBox(2.3F, -0.734F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 52)
                        .addBox(-3.3F, -0.734F, -0.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                        .texOffs(37, 88)
                        .addBox(-3.5F, -0.634F, 3.5F, 7.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                        .texOffs(73, 122)
                        .addBox(-2.5F, -0.734F, 3.25F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(128, 7)
                        .addBox(2.5F, -0.634F, -0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                        .texOffs(14, 84)
                        .addBox(-5.5F, -0.634F, -0.5F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition Monitor = PanelBaseSlant5.addOrReplaceChild(
                "Monitor",
                CubeListBuilder.create()
                        .texOffs(107, 154)
                        .addBox(-3.0F, -0.484F, -1.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition P6 = PanelBase.addOrReplaceChild(
                "P6",
                CubeListBuilder.create()
                        .texOffs(75, 36)
                        .addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(0, 13)
                        .addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition PanelSplitters6 =
                P6.addOrReplaceChild("PanelSplitters6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Rotation6 = PanelSplitters6.addOrReplaceChild(
                "Rotation6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Angle6 = Rotation6.addOrReplaceChild(
                "Angle6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -16.25F, -10.5F, 0.4625F, 0.0F, 0.0F));

        PartDefinition cube_r16 = Angle6.addOrReplaceChild(
                "cube_r16",
                CubeListBuilder.create()
                        .texOffs(93, 88)
                        .addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.5F, 2.5F, 0.0F, 0.0F, 0.7854F));

        PartDefinition PanelBaseSlant6 = P6.addOrReplaceChild(
                "PanelBaseSlant6",
                CubeListBuilder.create()
                        .texOffs(58, 44)
                        .addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                        .texOffs(93, 56)
                        .addBox(-5.0F, -0.634F, 1.0F, 10.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition SupportStruts = BaseConsole.addOrReplaceChild(
                "SupportStruts", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Strut1 = SupportStruts.addOrReplaceChild(
                "Strut1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r17 = Strut1.addOrReplaceChild(
                "cube_r17",
                CubeListBuilder.create()
                        .texOffs(131, 71)
                        .addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.0F, -12.3986F, -9.7876F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r18 = Strut1.addOrReplaceChild(
                "cube_r18",
                CubeListBuilder.create()
                        .texOffs(107, 86)
                        .addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, -5.7953F, -6.5822F, 2.0508F, 0.0F, 0.0F));

        PartDefinition cube_r19 = Strut1.addOrReplaceChild(
                "cube_r19",
                CubeListBuilder.create()
                        .texOffs(53, 108)
                        .addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, -5.7953F, -6.5822F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r20 = Strut1.addOrReplaceChild(
                "cube_r20",
                CubeListBuilder.create()
                        .texOffs(87, 117)
                        .addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.7F))
                        .texOffs(16, 70)
                        .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, -9.0F, 1.0036F, 0.0F, 0.0F));

        PartDefinition Strut2 = SupportStruts.addOrReplaceChild(
                "Strut2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r21 = Strut2.addOrReplaceChild(
                "cube_r21",
                CubeListBuilder.create()
                        .texOffs(65, 131)
                        .addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.0F, -12.3986F, -9.7876F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r22 = Strut2.addOrReplaceChild(
                "cube_r22",
                CubeListBuilder.create()
                        .texOffs(39, 105)
                        .addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, -5.7953F, -6.5822F, 2.0508F, 0.0F, 0.0F));

        PartDefinition cube_r23 = Strut2.addOrReplaceChild(
                "cube_r23",
                CubeListBuilder.create()
                        .texOffs(90, 105)
                        .addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, -5.7953F, -6.5822F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r24 = Strut2.addOrReplaceChild(
                "cube_r24",
                CubeListBuilder.create()
                        .texOffs(117, 56)
                        .addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.7F))
                        .texOffs(0, 67)
                        .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, -9.0F, 1.0036F, 0.0F, 0.0F));

        PartDefinition Strut3 = SupportStruts.addOrReplaceChild(
                "Strut3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r25 = Strut3.addOrReplaceChild(
                "cube_r25",
                CubeListBuilder.create()
                        .texOffs(52, 131)
                        .addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.0F, -12.3986F, -9.7876F, 1.7453F, 0.0F, 0.0F));

        PartDefinition cube_r26 = Strut3.addOrReplaceChild(
                "cube_r26",
                CubeListBuilder.create()
                        .texOffs(34, 55)
                        .addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, -5.7953F, -6.5822F, 2.0508F, 0.0F, 0.0F));

        PartDefinition cube_r27 = Strut3.addOrReplaceChild(
                "cube_r27",
                CubeListBuilder.create()
                        .texOffs(25, 102)
                        .addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, -5.7953F, -6.5822F, 1.6144F, 0.0F, 0.0F));

        PartDefinition cube_r28 = Strut3.addOrReplaceChild(
                "cube_r28",
                CubeListBuilder.create()
                        .texOffs(41, 117)
                        .addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, new CubeDeformation(-0.7F))
                        .texOffs(64, 61)
                        .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, -9.0F, 1.0036F, 0.0F, 0.0F));

        PartDefinition TimeRotor = Console.addOrReplaceChild(
                "TimeRotor",
                CubeListBuilder.create()
                        .texOffs(89, 127)
                        .addBox(-1.0F, -5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -14.0F, 0.0F));

        PartDefinition Part6 = TimeRotor.addOrReplaceChild(
                "Part6",
                CubeListBuilder.create()
                        .texOffs(99, 120)
                        .addBox(-0.6962F, -3.0F, -3.5F, 1.3924F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(53, 35)
                        .addBox(-3.5F, -3.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.75F, 0.0F));

        PartDefinition hexadecagon_r21 = Part6.addOrReplaceChild(
                "hexadecagon_r21",
                CubeListBuilder.create()
                        .texOffs(17, 52)
                        .addBox(-3.5F, 4.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                        .texOffs(53, 120)
                        .addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r22 = Part6.addOrReplaceChild(
                "hexadecagon_r22",
                CubeListBuilder.create()
                        .texOffs(57, 75)
                        .addBox(-3.5F, 4.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, new CubeDeformation(0.0F))
                        .texOffs(63, 122)
                        .addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r23 = Part6.addOrReplaceChild(
                "hexadecagon_r23",
                CubeListBuilder.create()
                        .texOffs(32, 70)
                        .addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r24 = Part6.addOrReplaceChild(
                "hexadecagon_r24",
                CubeListBuilder.create()
                        .texOffs(0, 123)
                        .addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Part7 = TimeRotor.addOrReplaceChild(
                "Part7",
                CubeListBuilder.create()
                        .texOffs(32, 124)
                        .addBox(-0.5967F, -7.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(67, 112)
                        .addBox(-3.0F, -7.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.0F, 0.0F));

        PartDefinition hexadecagon_r25 = Part7.addOrReplaceChild(
                "hexadecagon_r25",
                CubeListBuilder.create()
                        .texOffs(14, 107)
                        .addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, new CubeDeformation(0.0F))
                        .texOffs(17, 124)
                        .addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r26 = Part7.addOrReplaceChild(
                "hexadecagon_r26",
                CubeListBuilder.create()
                        .texOffs(23, 114)
                        .addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, new CubeDeformation(0.0F))
                        .texOffs(74, 125)
                        .addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r27 = Part7.addOrReplaceChild(
                "hexadecagon_r27",
                CubeListBuilder.create()
                        .texOffs(14, 99)
                        .addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r28 = Part7.addOrReplaceChild(
                "hexadecagon_r28",
                CubeListBuilder.create()
                        .texOffs(41, 127)
                        .addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Part8 = TimeRotor.addOrReplaceChild(
                "Part8",
                CubeListBuilder.create()
                        .texOffs(69, 138)
                        .addBox(-0.5027F, -10.5F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(119, 55)
                        .addBox(-0.5027F, -10.5F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(14, 99)
                        .addBox(1.5F, -10.5F, -0.4973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 93)
                        .addBox(-2.5F, -10.5F, -0.4973F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.75F, 0.0F));

        PartDefinition hexadecagon_r29 = Part8.addOrReplaceChild(
                "hexadecagon_r29",
                CubeListBuilder.create()
                        .texOffs(61, 88)
                        .addBox(-2.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(98, 136)
                        .addBox(1.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(136, 103)
                        .addBox(-0.5027F, -2.5F, 1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(0, 137)
                        .addBox(-0.5027F, -2.5F, -2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.0F, -10.75F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hexadecagon_r30 = Part8.addOrReplaceChild(
                "hexadecagon_r30",
                CubeListBuilder.create()
                        .texOffs(46, 135)
                        .addBox(-2.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(103, 136)
                        .addBox(1.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(136, 112)
                        .addBox(-0.5027F, -2.5F, 1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(5, 137)
                        .addBox(-0.5027F, -2.5F, -2.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.0F, -10.75F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hexadecagon_r31 = Part8.addOrReplaceChild(
                "hexadecagon_r31",
                CubeListBuilder.create()
                        .texOffs(29, 105)
                        .addBox(-0.5027F, -3.5F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 123)
                        .addBox(-0.5027F, -3.5F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hexadecagon_r32 = Part8.addOrReplaceChild(
                "hexadecagon_r32",
                CubeListBuilder.create()
                        .texOffs(63, 120)
                        .addBox(-0.5027F, -3.5F, 1.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 139)
                        .addBox(-0.5027F, -3.5F, -2.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition Controls = partdefinition.addOrReplaceChild(
                "Controls", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Panel1 =
                Controls.addOrReplaceChild("Panel1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition PanelBaseSlant7 = Panel1.addOrReplaceChild(
                "PanelBaseSlant7",
                CubeListBuilder.create()
                        .texOffs(125, 133)
                        .addBox(-4.75F, -0.884F, -2.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F))
                        .texOffs(60, 138)
                        .addBox(-1.25F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F))
                        .texOffs(51, 138)
                        .addBox(0.0F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F))
                        .texOffs(124, 137)
                        .addBox(1.25F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F))
                        .texOffs(28, 137)
                        .addBox(2.5F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.45F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r29 = PanelBaseSlant7.addOrReplaceChild(
                "cube_r29",
                CubeListBuilder.create()
                        .texOffs(135, 33)
                        .addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(1.2F, -0.584F, 3.4F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r30 = PanelBaseSlant7.addOrReplaceChild(
                "cube_r30",
                CubeListBuilder.create()
                        .texOffs(10, 137)
                        .addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(-1.2F, -0.584F, 3.4F, 0.0F, -0.7854F, 0.0F));

        PartDefinition Refuel = PanelBaseSlant7.addOrReplaceChild(
                "Refuel",
                CubeListBuilder.create()
                        .texOffs(137, 25)
                        .addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(-2.75F, -0.384F, -1.5F));

        PartDefinition DimensionalShifter = PanelBaseSlant7.addOrReplaceChild(
                "DimensionalShifter", CubeListBuilder.create(), PartPose.offset(0.0F, 0.2075F, -0.2255F));

        PartDefinition cube_r31 = DimensionalShifter.addOrReplaceChild(
                "cube_r31",
                CubeListBuilder.create()
                        .texOffs(44, 147)
                        .addBox(-1.05F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(39, 147)
                        .addBox(-1.05F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(147, 18)
                        .addBox(-0.5F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(147, 11)
                        .addBox(-0.5F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(64, 147)
                        .addBox(0.05F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(147, 60)
                        .addBox(0.05F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(147, 128)
                        .addBox(0.6F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(128, 147)
                        .addBox(0.6F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(69, 147)
                        .addBox(-1.6F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(147, 66)
                        .addBox(-1.6F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(95, 147)
                        .addBox(-2.15F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(90, 147)
                        .addBox(-2.15F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(103, 147)
                        .addBox(1.15F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(108, 147)
                        .addBox(1.15F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(67, 106)
                        .addBox(-2.5F, -0.65F, -0.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

        PartDefinition XControl = PanelBaseSlant7.addOrReplaceChild(
                "XControl",
                CubeListBuilder.create()
                        .texOffs(80, 145)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(-0.25F, -0.384F, -1.5F));

        PartDefinition bone9 = PanelBaseSlant7.addOrReplaceChild(
                "bone9",
                CubeListBuilder.create()
                        .texOffs(19, 137)
                        .addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(-1.2F, -0.584F, 3.4F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone10 = PanelBaseSlant7.addOrReplaceChild(
                "bone10",
                CubeListBuilder.create()
                        .texOffs(136, 135)
                        .addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(1.2F, -0.584F, 3.4F, 0.0F, 0.7854F, 0.0F));

        PartDefinition YControl = PanelBaseSlant7.addOrReplaceChild(
                "YControl",
                CubeListBuilder.create()
                        .texOffs(75, 145)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(1.0F, -0.384F, -1.5F));

        PartDefinition ZControl = PanelBaseSlant7.addOrReplaceChild(
                "ZControl",
                CubeListBuilder.create()
                        .texOffs(145, 63)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(2.25F, -0.384F, -1.5F));

        PartDefinition ControlIncMod = PanelBaseSlant7.addOrReplaceChild(
                "ControlIncMod",
                CubeListBuilder.create()
                        .texOffs(60, 145)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(3.5F, -0.384F, -1.5F));

        PartDefinition Panel2 = Controls.addOrReplaceChild(
                "Panel2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition PanelBaseSlant8 = Panel2.addOrReplaceChild(
                "PanelBaseSlant8",
                CubeListBuilder.create()
                        .texOffs(128, 66)
                        .addBox(-3.4F, -0.884F, -1.1F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(88, 105)
                        .addBox(-3.4F, -1.384F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(45, 144)
                        .addBox(-3.3F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(79, 142)
                        .addBox(-2.95F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(107, 144)
                        .addBox(-2.25F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(61, 142)
                        .addBox(-2.6F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(55, 145)
                        .addBox(-0.85F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(145, 57)
                        .addBox(-1.2F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(40, 144)
                        .addBox(-1.9F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 98)
                        .addBox(-1.55F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(139, 143)
                        .addBox(-1.9F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(94, 144)
                        .addBox(-1.55F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(145, 39)
                        .addBox(-1.2F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(50, 145)
                        .addBox(-0.85F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 34)
                        .addBox(-2.25F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(51, 142)
                        .addBox(-2.6F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(56, 142)
                        .addBox(-3.3F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 60)
                        .addBox(-2.95F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(29, 145)
                        .addBox(-0.5F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(89, 144)
                        .addBox(-0.5F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 69)
                        .addBox(-0.5F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(134, 142)
                        .addBox(-3.3F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(141, 132)
                        .addBox(-3.3F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 3)
                        .addBox(-2.95F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 17)
                        .addBox(-2.95F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 20)
                        .addBox(-2.6F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(70, 144)
                        .addBox(-2.25F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(143, 9)
                        .addBox(-2.25F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 31)
                        .addBox(-2.6F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(35, 143)
                        .addBox(-1.9F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(143, 46)
                        .addBox(-1.9F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 74)
                        .addBox(-1.55F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 81)
                        .addBox(-1.55F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(9, 145)
                        .addBox(-1.2F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(14, 145)
                        .addBox(-1.2F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(19, 145)
                        .addBox(-0.85F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(145, 23)
                        .addBox(-0.85F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(141, 117)
                        .addBox(-3.3F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(124, 141)
                        .addBox(-2.95F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(129, 141)
                        .addBox(-2.6F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 87)
                        .addBox(-2.25F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(142, 129)
                        .addBox(-1.9F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 52)
                        .addBox(-1.55F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(127, 144)
                        .addBox(-1.2F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(144, 142)
                        .addBox(-0.85F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(65, 144)
                        .addBox(-0.5F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(24, 145)
                        .addBox(-0.5F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r32 = PanelBaseSlant8.addOrReplaceChild(
                "cube_r32",
                CubeListBuilder.create()
                        .texOffs(32, 70)
                        .addBox(-1.0F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(3.0F, 0.7075F, 0.6405F, -0.5236F, 0.0F, 0.0F));

        PartDefinition DoorSwitch = Panel2.addOrReplaceChild(
                "DoorSwitch",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(2.25F, -15.5634F, -8.584F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r33 = DoorSwitch.addOrReplaceChild(
                "cube_r33",
                CubeListBuilder.create()
                        .texOffs(122, 144)
                        .addBox(-1.0F, -1.95F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
                        .texOffs(141, 101)
                        .addBox(-1.0F, -1.85F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)),
                PartPose.offsetAndRotation(0.4F, 0.5209F, 0.5745F, -0.5236F, 0.0F, 0.0F));

        PartDefinition DoorSwitch2 = Panel2.addOrReplaceChild(
                "DoorSwitch2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(2.9F, -15.5634F, -8.584F, 0.5236F, 0.0F, 0.0F));

        PartDefinition cube_r34 = DoorSwitch2.addOrReplaceChild(
                "cube_r34",
                CubeListBuilder.create()
                        .texOffs(117, 144)
                        .addBox(-1.0F, -1.95F, -1.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.32F))
                        .texOffs(141, 94)
                        .addBox(-1.0F, -1.85F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.35F)),
                PartPose.offsetAndRotation(0.4F, 0.5209F, 0.5745F, -0.5236F, 0.0F, 0.0F));

        PartDefinition Panel3 = Controls.addOrReplaceChild(
                "Panel3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition PanelBaseSlant9 = Panel3.addOrReplaceChild(
                "PanelBaseSlant9",
                CubeListBuilder.create()
                        .texOffs(26, 132)
                        .addBox(-4.25F, -0.884F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition Randomiser = PanelBaseSlant9.addOrReplaceChild(
                "Randomiser",
                CubeListBuilder.create()
                        .texOffs(131, 78)
                        .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.45F)),
                PartPose.offset(-2.75F, -0.284F, -0.5F));

        PartDefinition VerticalLandType = PanelBaseSlant9.addOrReplaceChild(
                "VerticalLandType",
                CubeListBuilder.create()
                        .texOffs(74, 99)
                        .addBox(-1.0F, -0.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(3.5F, -0.384F, -0.5F));

        PartDefinition VerticalLandTypeUp = VerticalLandType.addOrReplaceChild(
                "VerticalLandTypeUp",
                CubeListBuilder.create()
                        .texOffs(43, 3)
                        .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)),
                PartPose.offset(0.0F, 0.0F, 0.5F));

        PartDefinition VerticalLandTypeDown = VerticalLandType.addOrReplaceChild(
                "VerticalLandTypeDown",
                CubeListBuilder.create()
                        .texOffs(43, 16)
                        .addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.55F)),
                PartPose.offset(0.0F, 0.0F, -0.5F));

        PartDefinition ExteriorFacing = PanelBaseSlant9.addOrReplaceChild(
                "ExteriorFacing", CubeListBuilder.create(), PartPose.offset(-1.5F, -0.084F, 2.75F));

        PartDefinition bone15 = ExteriorFacing.addOrReplaceChild(
                "bone15",
                CubeListBuilder.create()
                        .texOffs(13, 132)
                        .addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)),
                PartPose.offsetAndRotation(0.0F, -0.3F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition TopBitFacing = ExteriorFacing.addOrReplaceChild(
                "TopBitFacing",
                CubeListBuilder.create()
                        .texOffs(146, 116)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.15F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition ExteriorFacingWest = TopBitFacing.addOrReplaceChild(
                "ExteriorFacingWest",
                CubeListBuilder.create()
                        .texOffs(146, 125)
                        .addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.75F, 0.084F, -3.5F));

        PartDefinition ExteriorFacingSouth = TopBitFacing.addOrReplaceChild(
                "ExteriorFacingSouth",
                CubeListBuilder.create()
                        .texOffs(146, 131)
                        .addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(1.5F, 0.084F, -4.25F));

        PartDefinition ExteriorFacingEast = TopBitFacing.addOrReplaceChild(
                "ExteriorFacingEast",
                CubeListBuilder.create()
                        .texOffs(137, 146)
                        .addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(2.25F, 0.084F, -3.5F));

        PartDefinition ExteriorFacingNorth = TopBitFacing.addOrReplaceChild(
                "ExteriorFacingNorth",
                CubeListBuilder.create()
                        .texOffs(5, 147)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.0F, -0.35F, 0.75F));

        PartDefinition RandomLevers = PanelBaseSlant9.addOrReplaceChild(
                "RandomLevers",
                CubeListBuilder.create()
                        .texOffs(136, 63)
                        .addBox(0.1F, -16.284F, -7.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.25F, 15.75F, 8.4F));

        PartDefinition Lever = RandomLevers.addOrReplaceChild(
                "Lever",
                CubeListBuilder.create()
                        .texOffs(74, 141)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 101)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(0.35F, -16.234F, -6.65F));

        PartDefinition Lever2 = RandomLevers.addOrReplaceChild(
                "Lever2",
                CubeListBuilder.create()
                        .texOffs(141, 41)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 95)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(0.65F, -16.234F, -6.65F));

        PartDefinition Lever3 = RandomLevers.addOrReplaceChild(
                "Lever3",
                CubeListBuilder.create()
                        .texOffs(30, 141)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 89)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(0.95F, -16.234F, -6.65F));

        PartDefinition Lever4 = RandomLevers.addOrReplaceChild(
                "Lever4",
                CubeListBuilder.create()
                        .texOffs(25, 141)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(85, 146)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(1.25F, -16.234F, -6.65F));

        PartDefinition Lever6 = RandomLevers.addOrReplaceChild(
                "Lever6",
                CubeListBuilder.create()
                        .texOffs(20, 141)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 84)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(1.95F, -16.234F, -6.65F));

        PartDefinition Lever7 = RandomLevers.addOrReplaceChild(
                "Lever7",
                CubeListBuilder.create()
                        .texOffs(15, 141)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 77)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(2.25F, -16.234F, -6.65F));

        PartDefinition Lever8 = RandomLevers.addOrReplaceChild(
                "Lever8",
                CubeListBuilder.create()
                        .texOffs(10, 141)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 49)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(2.55F, -16.234F, -6.65F));

        PartDefinition Lever9 = RandomLevers.addOrReplaceChild(
                "Lever9",
                CubeListBuilder.create()
                        .texOffs(140, 139)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 42)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(2.85F, -16.234F, -6.65F));

        PartDefinition Lights2 = PanelBaseSlant9.addOrReplaceChild(
                "Lights2",
                CubeListBuilder.create()
                        .texOffs(146, 5)
                        .addBox(-1.35F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .addBox(-1.35F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .mirror()
                        .addBox(1.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(146, 5)
                        .mirror()
                        .addBox(1.6F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offset(0.0F, 15.75F, 8.65F));

        PartDefinition Lamp2 =
                Lights2.addOrReplaceChild("Lamp2", CubeListBuilder.create(), PartPose.offset(0.0F, -15.75F, -8.65F));

        PartDefinition bone5 = Lamp2.addOrReplaceChild(
                "bone5",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .mirror(false),
                PartPose.offsetAndRotation(2.1F, -0.334F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone6 = Lamp2.addOrReplaceChild(
                "bone6",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .mirror(false),
                PartPose.offsetAndRotation(2.1F, -0.334F, -1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone7 = Lamp2.addOrReplaceChild(
                "bone7",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-0.85F, -0.334F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone8 = Lamp2.addOrReplaceChild(
                "bone8",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-0.85F, -0.334F, -1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition Panel4 = Controls.addOrReplaceChild(
                "Panel4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition PanelBaseSlant10 = Panel4.addOrReplaceChild(
                "PanelBaseSlant10",
                CubeListBuilder.create()
                        .texOffs(112, 128)
                        .addBox(0.75F, -1.134F, -2.25F, 3.0F, 2.0F, 4.0F, new CubeDeformation(-0.45F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition Handbrake = PanelBaseSlant10.addOrReplaceChild(
                "Handbrake", CubeListBuilder.create(), PartPose.offset(-2.5F, -0.3925F, -1.5425F));

        PartDefinition cube_r35 = Handbrake.addOrReplaceChild(
                "cube_r35",
                CubeListBuilder.create()
                        .texOffs(130, 13)
                        .addBox(-1.0F, -0.25F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(112, 144)
                        .addBox(-0.5F, 0.0F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.26F)),
                PartPose.offsetAndRotation(0.0F, -0.4352F, 2.419F, -0.2182F, 0.0F, 0.0F));

        PartDefinition cube_r36 = Handbrake.addOrReplaceChild(
                "cube_r36",
                CubeListBuilder.create()
                        .texOffs(7, 52)
                        .addBox(-0.5F, -1.3378F, -0.3814F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.26F)),
                PartPose.offsetAndRotation(0.0F, 0.85F, 1.25F, -0.7418F, 0.0F, 0.0F));

        PartDefinition Throttle = PanelBaseSlant10.addOrReplaceChild(
                "Throttle",
                CubeListBuilder.create()
                        .texOffs(61, 131)
                        .addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(34, 146)
                        .addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(2.25F, -0.884F, -1.25F));

        PartDefinition Lights3 = PanelBaseSlant10.addOrReplaceChild(
                "Lights3", CubeListBuilder.create(), PartPose.offset(0.0F, 15.75F, 8.65F));

        PartDefinition Lamp3 =
                Lights3.addOrReplaceChild("Lamp3", CubeListBuilder.create(), PartPose.offset(0.0F, -15.75F, -8.65F));

        PartDefinition Lights5 = PanelBaseSlant10.addOrReplaceChild(
                "Lights5",
                CubeListBuilder.create()
                        .texOffs(146, 5)
                        .addBox(0.15F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .addBox(0.15F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .addBox(1.4F, -16.284F, -7.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .addBox(0.15F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 15.75F, 8.65F));

        PartDefinition Lamp5 =
                Lights5.addOrReplaceChild("Lamp5", CubeListBuilder.create(), PartPose.offset(0.0F, -15.75F, -8.65F));

        PartDefinition bone = Lamp5.addOrReplaceChild(
                "bone",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.65F, -0.334F, -1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone2 = Lamp5.addOrReplaceChild(
                "bone2",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.65F, -0.334F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone4 = Lamp5.addOrReplaceChild(
                "bone4",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(1.9F, -0.334F, 2.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone3 = Lamp5.addOrReplaceChild(
                "bone3",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.65F, -0.334F, 1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition Panel6 = Controls.addOrReplaceChild(
                "Panel6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition PanelBaseSlant11 = Panel6.addOrReplaceChild(
                "PanelBaseSlant11",
                CubeListBuilder.create()
                        .texOffs(0, 132)
                        .addBox(-1.5F, -0.784F, -2.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(70, 50)
                        .addBox(-2.0F, -0.684F, 1.55F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                        .texOffs(134, 123)
                        .addBox(-2.0F, -0.884F, 3.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(131, 39)
                        .addBox(-2.0F, -0.884F, 1.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(130, 95)
                        .addBox(-2.0F, -0.884F, 2.05F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(134, 13)
                        .addBox(-2.0F, -0.884F, 1.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F))
                        .texOffs(101, 26)
                        .addBox(1.0F, -0.884F, 1.55F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F))
                        .texOffs(148, 8)
                        .addBox(-1.0F, -0.884F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(147, 147)
                        .addBox(0.0F, -0.884F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(148, 8)
                        .addBox(-1.0F, -0.884F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(147, 147)
                        .addBox(0.0F, -0.884F, 1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(10, 148)
                        .addBox(-1.2F, -0.884F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(123, 147)
                        .addBox(0.2F, -0.884F, 2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(118, 147)
                        .addBox(-0.2F, -0.884F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(113, 147)
                        .addBox(-0.8F, -0.884F, 2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(99, 117)
                        .addBox(-2.0F, -0.884F, 2.55F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(113, 0)
                        .addBox(-2.0F, -0.884F, 3.05F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
                PartPose.offsetAndRotation(0.0F, -15.75F, -8.65F, 0.5236F, 0.0F, 0.0F));

        PartDefinition FastReturn = PanelBaseSlant11.addOrReplaceChild(
                "FastReturn",
                CubeListBuilder.create()
                        .texOffs(131, 42)
                        .addBox(-1.5F, -1.084F, -2.25F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.35F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Lights4 = PanelBaseSlant11.addOrReplaceChild(
                "Lights4",
                CubeListBuilder.create()
                        .texOffs(146, 5)
                        .addBox(-2.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .addBox(-2.6F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 5)
                        .mirror()
                        .addBox(1.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(146, 5)
                        .mirror()
                        .addBox(1.6F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offset(0.0F, 15.75F, 8.65F));

        PartDefinition Lamp4 =
                Lights4.addOrReplaceChild("Lamp4", CubeListBuilder.create(), PartPose.offset(0.0F, -15.75F, -8.65F));

        PartDefinition bone13 = Lamp4.addOrReplaceChild(
                "bone13",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-2.1F, -0.334F, 1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone14 = Lamp4.addOrReplaceChild(
                "bone14",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-2.1F, -0.334F, -1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone12 = Lamp4.addOrReplaceChild(
                "bone12",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .mirror(false),
                PartPose.offsetAndRotation(2.1F, -0.334F, 1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone11 = Lamp4.addOrReplaceChild(
                "bone11",
                CubeListBuilder.create()
                        .texOffs(23, 132)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .mirror(false),
                PartPose.offsetAndRotation(2.1F, -0.334F, -1.25F, 0.0F, -0.7854F, 0.0F));

        PartDefinition RandomLevers2 = PanelBaseSlant11.addOrReplaceChild(
                "RandomLevers2",
                CubeListBuilder.create()
                        .texOffs(109, 123)
                        .addBox(0.1F, -16.284F, -7.15F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-1.6F, 15.75F, 7.9F));

        PartDefinition Lever5 = RandomLevers2.addOrReplaceChild(
                "Lever5",
                CubeListBuilder.create()
                        .texOffs(90, 140)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(146, 0)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(0.35F, -16.234F, -6.65F));

        PartDefinition Lever10 = RandomLevers2.addOrReplaceChild(
                "Lever10",
                CubeListBuilder.create()
                        .texOffs(140, 71)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(0, 146)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(0.65F, -16.234F, -6.65F));

        PartDefinition Lever11 = RandomLevers2.addOrReplaceChild(
                "Lever11",
                CubeListBuilder.create()
                        .texOffs(129, 71)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(143, 145)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(0.95F, -16.234F, -6.65F));

        PartDefinition Lever12 = RandomLevers2.addOrReplaceChild(
                "Lever12",
                CubeListBuilder.create()
                        .texOffs(50, 129)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(145, 137)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(1.25F, -16.234F, -6.65F));

        PartDefinition Lever13 = RandomLevers2.addOrReplaceChild(
                "Lever13",
                CubeListBuilder.create()
                        .texOffs(83, 126)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(145, 134)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(1.95F, -16.234F, -6.65F));

        PartDefinition Lever14 = RandomLevers2.addOrReplaceChild(
                "Lever14",
                CubeListBuilder.create()
                        .texOffs(66, 93)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(132, 145)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(2.25F, -16.234F, -6.65F));

        PartDefinition Lever15 = RandomLevers2.addOrReplaceChild(
                "Lever15",
                CubeListBuilder.create()
                        .texOffs(37, 84)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(145, 122)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(2.55F, -16.234F, -6.65F));

        PartDefinition Lever16 = RandomLevers2.addOrReplaceChild(
                "Lever16",
                CubeListBuilder.create()
                        .texOffs(24, 55)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(145, 119)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offset(2.85F, -16.234F, -6.65F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild(
                "bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 160, 160);
    }

    @Override
    public void setupAnimations(T t, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.animate(t.rotorAnimationState, BrackolinAnimation.ROTOR, ageInTicks);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent(tardis -> {
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.RANDOMIZER.get())
                            .getUseAnimationState(),
                    CopperConsoleModel.CopperConsoleModelAnimation.RANDOMIZER,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.X.get()).getUseAnimationState(),
                    BrackolinAnimation.X,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.Y.get()).getUseAnimationState(),
                    BrackolinAnimation.Y,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.Z.get()).getUseAnimationState(),
                    BrackolinAnimation.Z,
                    ageInTicks);
            //
            // this.animate(tardis.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get()).getUseAnimationState(),
            // BrackolinAnimation.BRAKE, ageInTicks);
            //
            // this.animate(tardis.getControlDataOrCreate(ControlRegistry.DIMENSIONS.get()).getUseAnimationState(),
            // BrackolinAnimation.DIMENSION, ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.DOOR.get()).getUseAnimationState(),
                    BrackolinAnimation.DOOR,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.FACING.get()).getUseAnimationState(),
                    BrackolinAnimation.FACING,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.FAST_RETURN.get())
                            .getUseAnimationState(),
                    BrackolinAnimation.FAST_RETURN,
                    ageInTicks);
            //
            // this.animate(tardis.getControlDataOrCreate(ControlRegistry.REFUELER.get()).getUseAnimationState(),
            // CopperConsoleModel.CopperConsoleModelAnimation.REFUEL_ON, ageInTicks);
            //
            // this.animate(tardis.getControlDataOrCreate(ControlRegistry.STABILIZERS.get()).getUseAnimationState(),
            // CopperConsoleModel.CopperConsoleModelAnimation.STABILIZER, ageInTicks);

            BrackolinAnimation.animateConditional(tardis, this, ageInTicks);
        });
    }

    @Override
    public Optional<String> getPartForControl(ControlType<?> controlType) {
        if (controlType == ControlRegistry.SONIC_PORT.get()) {
            return Optional.of("controls/controls_3/sonic_port/sonic_base");
        }
        return Optional.empty();
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
        Console.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Controls.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public static class BrackolinAnimation {
        public static final AnimationDefinition X = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "XControl",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition Y = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "YControl",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition Z = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "ZControl",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition INCREMENT = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "ControlIncMod",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition REFUEL = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "Refuel",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition RANDOMIZER = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "Randomiser",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition TELEPATHIC =
                AnimationDefinition.Builder.withLength(0.0F).build();

        public static final AnimationDefinition VERTICAL_LANDING = AnimationDefinition.Builder.withLength(0.7917F)
                .addAnimation(
                        "VerticalLandTypeUp",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5417F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.7917F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "VerticalLandTypeDown",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5417F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition HANDBRAKE =
                AnimationDefinition.Builder.withLength(0.0F).build();

        public static final AnimationDefinition DOOR =
                AnimationDefinition.Builder.withLength(0.0F).build();

        public static final AnimationDefinition FACING = AnimationDefinition.Builder.withLength(1.1667F)
                .addAnimation(
                        "TopBitFacing",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.125F,
                                        KeyframeAnimations.degreeVec(0.0F, 13.33F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.2917F,
                                        KeyframeAnimations.degreeVec(0.0F, 33.61F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.375F,
                                        KeyframeAnimations.degreeVec(0.0F, 47.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.75F,
                                        KeyframeAnimations.degreeVec(0.0F, 250.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.875F,
                                        KeyframeAnimations.degreeVec(0.0F, 274.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0833F,
                                        KeyframeAnimations.degreeVec(0.0F, 323.78F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.1667F,
                                        KeyframeAnimations.degreeVec(0.0F, 340.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition FAST_RETURN = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation(
                        "FastReturn",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, -0.15F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition ROTOR = AnimationDefinition.Builder.withLength(1.3333F)
                .looping()
                .addAnimation(
                        "TimeRotor",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.3333F,
                                        KeyframeAnimations.degreeVec(0.0F, 90.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "TimeRotor",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.6667F,
                                        KeyframeAnimations.posVec(0.0F, -2.75F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.3333F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static void animateConditional(ITardisLevel tardis, BrackolinConsoleModel<?> model, float ageInTicks) {
            final ControlDataFloat throttle = tardis.getControlDataOrCreate(ControlRegistry.THROTTLE.get());
            final ControlDataBool handbrake = tardis.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get());

            model.getAnyDescendantWithName("Throttle")
                    .ifPresent(control -> control.offsetPos(AnimationHelper.slideBasedOnState(
                            throttle,
                            -142.5F,
                            throttle.getPrevious(),
                            throttle.get(),
                            ageInTicks,
                            5,
                            new Vector3f(0, 0, 1))));

            model.getAnyDescendantWithName("Handbrake")
                    .ifPresent(control -> control.offsetPos(new Vector3f(AnimationHelper.slideBasedOnState(
                            handbrake, -42.5F, (!handbrake.get() ? 1 : 0), ageInTicks, 20, 5, new Vector3f(0, 1, 0)))));
        }
    }
}
