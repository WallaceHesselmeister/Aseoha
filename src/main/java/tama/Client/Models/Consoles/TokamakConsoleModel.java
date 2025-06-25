/* (C) TAMA Studios 2025 */
package tama.Client.Models.Consoles;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import org.jetbrains.annotations.NotNull;
import tama.TileEntities.Console.TokamakConsoleTile;

public class TokamakConsoleModel<T extends TokamakConsoleTile> extends BaseTileHierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation("modid", "takomakmodel"), "main");
    private final ModelPart root;
    private final ModelPart PositionMarkersUsedForZeroingConsole;
    private final ModelPart bottom;
    private final ModelPart hex;
    private final ModelPart BTopPanels2;
    private final ModelPart BTopPanels;
    private final ModelPart BTopBottomSeperators;
    private final ModelPart BBottomPanels2;
    private final ModelPart BBottomPanels;
    private final ModelPart BBottomSeperators;
    private final ModelPart emmissives;
    private final ModelPart RotorEmmisiveOne6;
    private final ModelPart bone69;
    private final ModelPart bone70;
    private final ModelPart bone71;
    private final ModelPart bone72;
    private final ModelPart bone73;
    private final ModelPart bone74;
    private final ModelPart base;
    private final ModelPart panels;
    private final ModelPart bottomPanels;
    private final ModelPart bottompanel1;
    private final ModelPart bottompanel2;
    private final ModelPart bottompanel3;
    private final ModelPart bottompanel4;
    private final ModelPart bottompanel5;
    private final ModelPart bottomPanelMergers;
    private final ModelPart bottomMerger1;
    private final ModelPart middlePanels;
    private final ModelPart PanelBackFillers;
    private final ModelPart bone37;
    private final ModelPart bone39;
    private final ModelPart bone46;
    private final ModelPart bone38;
    private final ModelPart bone25;
    private final ModelPart bone42;
    private final ModelPart bone32;
    private final ModelPart bone54;
    private final ModelPart bone65;
    private final ModelPart bone40;
    private final ModelPart topPanels;
    private final ModelPart topPanelMergers;
    private final ModelPart bone;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart bone2;
    private final ModelPart panel1;
    private final ModelPart joystick;
    private final ModelPart panel1Controls;
    private final ModelPart doorControl;
    private final ModelPart doorLight1;
    private final ModelPart doorLight2;
    private final ModelPart doorLight3;
    private final ModelPart doorLight4;
    private final ModelPart doorLight5;
    private final ModelPart doorLight6;
    private final ModelPart bone14;
    private final ModelPart bone17;
    private final ModelPart doorControlKnob;
    private final ModelPart doorControlLever;
    private final ModelPart panel1Misc;
    private final ModelPart panel1Tape;
    private final ModelPart panel2;
    private final ModelPart panel2panel;
    private final ModelPart bone26;
    private final ModelPart bone27;
    private final ModelPart bone51;
    private final ModelPart panel2panelMisc;
    private final ModelPart panel2panelLight11;
    private final ModelPart bone12;
    private final ModelPart panel3;
    private final ModelPart bone16;
    private final ModelPart bone34;
    private final ModelPart bone35;
    private final ModelPart bone31;
    private final ModelPart bone28;
    private final ModelPart bone63;
    private final ModelPart bone29;
    private final ModelPart bone30;
    private final ModelPart bone67;
    private final ModelPart bone36;
    private final ModelPart panel4;
    private final ModelPart panel4Lights;
    private final ModelPart panel4Light1;
    private final ModelPart panel4Light2;
    private final ModelPart panel4Controls;
    private final ModelPart panel4wire;
    private final ModelPart panel4PumpThings;
    private final ModelPart panel4PumpThing1;
    private final ModelPart panel4PumpThing2;
    private final ModelPart coffeepot;
    private final ModelPart bone33;
    private final ModelPart panel5;
    private final ModelPart bone50;
    private final ModelPart doodads;
    private final ModelPart bone7;
    private final ModelPart bone8;
    private final ModelPart bone20;
    private final ModelPart bone19;
    private final ModelPart bone9;
    private final ModelPart bone11;
    private final ModelPart bone18;
    private final ModelPart bone13;
    private final ModelPart bone66;
    private final ModelPart bone68;
    private final ModelPart panel6;
    private final ModelPart bone47;
    private final ModelPart bone10;
    private final ModelPart bone48;
    private final ModelPart bone49;
    private final ModelPart rotor;
    private final ModelPart rotorTop;
    private final ModelPart bone53;
    private final ModelPart bone55;
    private final ModelPart bone56;
    private final ModelPart bone57;
    private final ModelPart bone58;
    private final ModelPart bone59;
    private final ModelPart rotorBase;
    private final ModelPart rotorglass;
    private final ModelPart bone44;
    private final ModelPart bone45;
    private final ModelPart bone41;
    private final ModelPart rotorlightbeams;
    private final ModelPart rotorlightbeam1;
    private final ModelPart timeColumn;
    private final ModelPart bone64;
    private final ModelPart bone15;
    private final ModelPart bone62;
    private final ModelPart bone61;
    private final ModelPart bone60;
    private final ModelPart bone23;
    private final ModelPart bone22;
    private final ModelPart bone21;
    private final ModelPart bone24;
    private final ModelPart bone52;
    private final ModelPart bone43;
    private final ModelPart controls;
    private final ModelPart telepathics;

    public TokamakConsoleModel(ModelPart root) {
        super(root);
        this.root = root.getChild("root");
        this.PositionMarkersUsedForZeroingConsole = this.root.getChild("PositionMarkersUsedForZeroingConsole");
        this.bottom = this.root.getChild("bottom");
        this.hex = this.bottom.getChild("hex");
        this.BTopPanels2 = this.bottom.getChild("BTopPanels2");
        this.BTopPanels = this.BTopPanels2.getChild("BTopPanels");
        this.BTopBottomSeperators = this.BTopPanels2.getChild("BTopBottomSeperators");
        this.BBottomPanels2 = this.bottom.getChild("BBottomPanels2");
        this.BBottomPanels = this.BBottomPanels2.getChild("BBottomPanels");
        this.BBottomSeperators = this.BBottomPanels2.getChild("BBottomSeperators");
        this.emmissives = this.root.getChild("emmissives");
        this.RotorEmmisiveOne6 = this.emmissives.getChild("RotorEmmisiveOne6");
        this.bone69 = this.RotorEmmisiveOne6.getChild("bone69");
        this.bone70 = this.RotorEmmisiveOne6.getChild("bone70");
        this.bone71 = this.RotorEmmisiveOne6.getChild("bone71");
        this.bone72 = this.RotorEmmisiveOne6.getChild("bone72");
        this.bone73 = this.RotorEmmisiveOne6.getChild("bone73");
        this.bone74 = this.RotorEmmisiveOne6.getChild("bone74");
        this.base = this.root.getChild("base");
        this.panels = this.base.getChild("panels");
        this.bottomPanels = this.panels.getChild("bottomPanels");
        this.bottompanel1 = this.bottomPanels.getChild("bottompanel1");
        this.bottompanel2 = this.bottomPanels.getChild("bottompanel2");
        this.bottompanel3 = this.bottomPanels.getChild("bottompanel3");
        this.bottompanel4 = this.bottomPanels.getChild("bottompanel4");
        this.bottompanel5 = this.bottomPanels.getChild("bottompanel5");
        this.bottomPanelMergers = this.bottomPanels.getChild("bottomPanelMergers");
        this.bottomMerger1 = this.bottomPanelMergers.getChild("bottomMerger1");
        this.middlePanels = this.panels.getChild("middlePanels");
        this.PanelBackFillers = this.middlePanels.getChild("PanelBackFillers");
        this.bone37 = this.PanelBackFillers.getChild("bone37");
        this.bone39 = this.PanelBackFillers.getChild("bone39");
        this.bone46 = this.PanelBackFillers.getChild("bone46");
        this.bone38 = this.PanelBackFillers.getChild("bone38");
        this.bone25 = this.middlePanels.getChild("bone25");
        this.bone42 = this.middlePanels.getChild("bone42");
        this.bone32 = this.bone42.getChild("bone32");
        this.bone54 = this.bone32.getChild("bone54");
        this.bone65 = this.bone54.getChild("bone65");
        this.bone40 = this.bone42.getChild("bone40");
        this.topPanels = this.panels.getChild("topPanels");
        this.topPanelMergers = this.topPanels.getChild("topPanelMergers");
        this.bone = this.topPanelMergers.getChild("bone");
        this.bone3 = this.topPanelMergers.getChild("bone3");
        this.bone4 = this.topPanelMergers.getChild("bone4");
        this.bone5 = this.topPanelMergers.getChild("bone5");
        this.bone6 = this.topPanelMergers.getChild("bone6");
        this.bone2 = this.topPanelMergers.getChild("bone2");
        this.panel1 = this.topPanels.getChild("panel1");
        this.joystick = this.panel1.getChild("joystick");
        this.panel1Controls = this.panel1.getChild("panel1Controls");
        this.doorControl = this.panel1Controls.getChild("doorControl");
        this.doorLight1 = this.doorControl.getChild("doorLight1");
        this.doorLight2 = this.doorControl.getChild("doorLight2");
        this.doorLight3 = this.doorControl.getChild("doorLight3");
        this.doorLight4 = this.doorControl.getChild("doorLight4");
        this.doorLight5 = this.doorControl.getChild("doorLight5");
        this.doorLight6 = this.doorControl.getChild("doorLight6");
        this.bone14 = this.doorControl.getChild("bone14");
        this.bone17 = this.bone14.getChild("bone17");
        this.doorControlKnob = this.bone17.getChild("doorControlKnob");
        this.doorControlLever = this.bone17.getChild("doorControlLever");
        this.panel1Misc = this.panel1.getChild("panel1Misc");
        this.panel1Tape = this.panel1Misc.getChild("panel1Tape");
        this.panel2 = this.topPanels.getChild("panel2");
        this.panel2panel = this.panel2.getChild("panel2panel");
        this.bone26 = this.panel2panel.getChild("bone26");
        this.bone27 = this.panel2panel.getChild("bone27");
        this.bone51 = this.panel2panel.getChild("bone51");
        this.panel2panelMisc = this.bone51.getChild("panel2panelMisc");
        this.panel2panelLight11 = this.panel2panelMisc.getChild("panel2panelLight11");
        this.bone12 = this.panel2panelMisc.getChild("bone12");
        this.panel3 = this.topPanels.getChild("panel3");
        this.bone16 = this.panel3.getChild("bone16");
        this.bone34 = this.bone16.getChild("bone34");
        this.bone35 = this.bone34.getChild("bone35");
        this.bone31 = this.bone35.getChild("bone31");
        this.bone28 = this.bone31.getChild("bone28");
        this.bone63 = this.bone28.getChild("bone63");
        this.bone29 = this.bone28.getChild("bone29");
        this.bone30 = this.bone28.getChild("bone30");
        this.bone67 = this.bone34.getChild("bone67");
        this.bone36 = this.bone16.getChild("bone36");
        this.panel4 = this.topPanels.getChild("panel4");
        this.panel4Lights = this.panel4.getChild("panel4Lights");
        this.panel4Light1 = this.panel4Lights.getChild("panel4Light1");
        this.panel4Light2 = this.panel4Lights.getChild("panel4Light2");
        this.panel4Controls = this.panel4.getChild("panel4Controls");
        this.panel4wire = this.panel4Controls.getChild("panel4wire");
        this.panel4PumpThings = this.panel4Controls.getChild("panel4PumpThings");
        this.panel4PumpThing1 = this.panel4PumpThings.getChild("panel4PumpThing1");
        this.panel4PumpThing2 = this.panel4PumpThings.getChild("panel4PumpThing2");
        this.coffeepot = this.panel4Controls.getChild("coffeepot");
        this.bone33 = this.panel4Controls.getChild("bone33");
        this.panel5 = this.topPanels.getChild("panel5");
        this.bone50 = this.panel5.getChild("bone50");
        this.doodads = this.bone50.getChild("doodads");
        this.bone7 = this.doodads.getChild("bone7");
        this.bone8 = this.doodads.getChild("bone8");
        this.bone20 = this.doodads.getChild("bone20");
        this.bone19 = this.doodads.getChild("bone19");
        this.bone9 = this.doodads.getChild("bone9");
        this.bone11 = this.doodads.getChild("bone11");
        this.bone18 = this.doodads.getChild("bone18");
        this.bone13 = this.doodads.getChild("bone13");
        this.bone66 = this.doodads.getChild("bone66");
        this.bone68 = this.doodads.getChild("bone68");
        this.panel6 = this.topPanels.getChild("panel6");
        this.bone47 = this.panel6.getChild("bone47");
        this.bone10 = this.panel6.getChild("bone10");
        this.bone48 = this.panel6.getChild("bone48");
        this.bone49 = this.panel6.getChild("bone49");
        this.rotor = this.base.getChild("rotor");
        this.rotorTop = this.rotor.getChild("rotorTop");
        this.bone53 = this.rotorTop.getChild("bone53");
        this.bone55 = this.rotorTop.getChild("bone55");
        this.bone56 = this.rotorTop.getChild("bone56");
        this.bone57 = this.rotorTop.getChild("bone57");
        this.bone58 = this.rotorTop.getChild("bone58");
        this.bone59 = this.rotorTop.getChild("bone59");
        this.rotorBase = this.rotor.getChild("rotorBase");
        this.rotorglass = this.rotorBase.getChild("rotorglass");
        this.bone44 = this.rotorBase.getChild("bone44");
        this.bone45 = this.rotorBase.getChild("bone45");
        this.bone41 = this.rotorBase.getChild("bone41");
        this.rotorlightbeams = this.rotorBase.getChild("rotorlightbeams");
        this.rotorlightbeam1 = this.rotorlightbeams.getChild("rotorlightbeam1");
        this.timeColumn = this.rotor.getChild("timeColumn");
        this.bone64 = this.timeColumn.getChild("bone64");
        this.bone15 = this.timeColumn.getChild("bone15");
        this.bone62 = this.timeColumn.getChild("bone62");
        this.bone61 = this.timeColumn.getChild("bone61");
        this.bone60 = this.timeColumn.getChild("bone60");
        this.bone23 = this.timeColumn.getChild("bone23");
        this.bone22 = this.timeColumn.getChild("bone22");
        this.bone21 = this.timeColumn.getChild("bone21");
        this.bone24 = this.rotor.getChild("bone24");
        this.bone52 = this.rotor.getChild("bone52");
        this.bone43 = this.bone52.getChild("bone43");
        this.controls = this.root.getChild("controls");
        this.telepathics = this.controls.getChild("telepathics");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild(
                "root",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition PositionMarkersUsedForZeroingConsole = root.addOrReplaceChild(
                "PositionMarkersUsedForZeroingConsole",
                CubeListBuilder.create()
                        .texOffs(-21, -14)
                        .addBox(5.08F, -1.0F, -16.08F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(-21, -14)
                        .addBox(-16.36F, -1.0F, -16.08F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(-21, -14)
                        .addBox(-16.36F, -1.0F, 5.36F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(-21, -14)
                        .addBox(5.08F, -1.0F, 5.36F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(-14, -14)
                        .addBox(22.0F, -72.0F, -8.0F, 2.0F, 72.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.25F));

        PartDefinition bottom = root.addOrReplaceChild(
                "bottom", CubeListBuilder.create(), PartPose.offset(-0.0223F, -4.8537F, 0.4694F));

        PartDefinition hex = bottom.addOrReplaceChild(
                "hex",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(-2.5552F, -1.25F, 0.8746F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.9588F, 0.0973F, 3.0331F));

        PartDefinition hex_r1 = hex.addOrReplaceChild(
                "hex_r1",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(-0.0871F, -1.0F, 1.0228F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition hex_r2 = hex.addOrReplaceChild(
                "hex_r2",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(-0.3064F, -1.0F, 0.9021F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.0F, 0.3927F, 0.0F));

        PartDefinition hex_r3 = hex.addOrReplaceChild(
                "hex_r3",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(-2.6433F, -1.0F, 1.7097F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.0F, -0.3927F, 0.0F));

        PartDefinition hex_r4 = hex.addOrReplaceChild(
                "hex_r4",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(0.8314F, -1.0F, 1.5531F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.383F, -0.25F, -3.0226F, 0.0F, -0.7854F, 0.0F));

        PartDefinition hex_r5 = hex.addOrReplaceChild(
                "hex_r5",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(0.7451F, -1.0F, 1.0406F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.383F, -0.25F, -3.0226F, 0.0F, -1.1781F, 0.0F));

        PartDefinition hex_r6 = hex.addOrReplaceChild(
                "hex_r6",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(-1.5307F, -1.0F, 0.6001F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.383F, -0.25F, -3.0226F, 0.0F, -1.5708F, 0.0F));

        PartDefinition hex_r7 = hex.addOrReplaceChild(
                "hex_r7",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(-1.8018F, -1.0F, 1.064F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.383F, -0.25F, -3.0226F, -3.1416F, -1.1781F, -3.1416F));

        PartDefinition hex_r8 = hex.addOrReplaceChild(
                "hex_r8",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(1.3618F, -1.0F, 0.6345F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3604F, -0.25F, -7.4056F, -3.1416F, -0.7854F, -3.1416F));

        PartDefinition hex_r9 = hex.addOrReplaceChild(
                "hex_r9",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(0.8836F, -1.0F, -0.011F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3604F, -0.25F, -7.4056F, -3.1416F, -0.3927F, -3.1416F));

        PartDefinition hex_r10 = hex.addOrReplaceChild(
                "hex_r10",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(-1.8052F, -1.0F, -0.4244F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3604F, -0.25F, -7.4056F, -3.1416F, 0.0F, -3.1416F));

        PartDefinition hex_r11 = hex.addOrReplaceChild(
                "hex_r11",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(-2.4475F, -1.0F, 0.2226F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3604F, -0.25F, -7.4056F, -3.1416F, 0.3927F, -3.1416F));

        PartDefinition hex_r12 = hex.addOrReplaceChild(
                "hex_r12",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(-1.8038F, -1.0F, -0.827F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0226F, -0.25F, -6.1536F, -3.1416F, 1.1781F, -3.1416F));

        PartDefinition hex_r13 = hex.addOrReplaceChild(
                "hex_r13",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(-0.8088F, -1.0F, -1.1478F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0226F, -0.25F, -6.1536F, -3.1416F, 0.7854F, -3.1416F));

        PartDefinition hex_r14 = hex.addOrReplaceChild(
                "hex_r14",
                CubeListBuilder.create()
                        .texOffs(18, 493)
                        .addBox(-1.1495F, -1.0F, -0.875F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.7477F, -0.25F, -2.7028F, 0.0F, 1.5708F, 0.0F));

        PartDefinition hex_r15 = hex.addOrReplaceChild(
                "hex_r15",
                CubeListBuilder.create()
                        .texOffs(14, 493)
                        .addBox(-1.0674F, -3.8141F, -1.4574F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.321F, 2.5641F, -1.4405F, 0.0F, 1.1781F, 0.0F));

        PartDefinition BTopPanels2 =
                bottom.addOrReplaceChild("BTopPanels2", CubeListBuilder.create(), PartPose.offset(0.0F, -3.818F, 0.0F));

        PartDefinition BTopPanels = BTopPanels2.addOrReplaceChild(
                "BTopPanels",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.1416F));

        PartDefinition hex_r16 = BTopPanels.addOrReplaceChild(
                "hex_r16",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.3095F, 0.0F, 4.3095F, 0.3054F, 0.7854F, 0.0F));

        PartDefinition hex_r17 = BTopPanels.addOrReplaceChild(
                "hex_r17",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 6.0946F, 0.3054F, 0.0F, 0.0F));

        PartDefinition hex_r18 = BTopPanels.addOrReplaceChild(
                "hex_r18",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.3095F, 0.0F, 4.3095F, 0.3054F, -0.7854F, 0.0F));

        PartDefinition hex_r19 = BTopPanels.addOrReplaceChild(
                "hex_r19",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0946F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.3054F));

        PartDefinition hex_r20 = BTopPanels.addOrReplaceChild(
                "hex_r20",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -6.0946F, -2.8362F, 0.0F, -3.1416F));

        PartDefinition hex_r21 = BTopPanels.addOrReplaceChild(
                "hex_r21",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.3095F, 0.0F, -4.3095F, -2.8362F, 0.7854F, 3.1416F));

        PartDefinition hex_r22 = BTopPanels.addOrReplaceChild(
                "hex_r22",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.3095F, 0.0F, -4.3095F, -2.8362F, -0.7854F, 3.1416F));

        PartDefinition hex_r23 = BTopPanels.addOrReplaceChild(
                "hex_r23",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0954F, 0.0301F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.0946F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.3054F));

        PartDefinition BTopBottomSeperators = BTopPanels2.addOrReplaceChild(
                "BTopBottomSeperators",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.0233F, -0.2804F, -0.0129F, 0.0F, 0.0F, -3.1416F));

        PartDefinition hex_r24 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r24",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(5.6598F, 0.0F, 2.3674F, 0.3054F, 1.1781F, 0.0F));

        PartDefinition hex_r25 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r25",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(2.328F, 0.0F, 5.6761F, 0.3054F, 0.3927F, 0.0F));

        PartDefinition hex_r26 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r26",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-2.3674F, 0.0F, 5.6598F, 0.3054F, -0.3927F, 0.0F));

        PartDefinition hex_r27 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r27",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-5.6761F, 0.0F, 2.328F, 0.3054F, -1.1781F, 0.0F));

        PartDefinition hex_r28 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r28",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-5.6598F, 0.0F, -2.3674F, -2.8362F, -1.1781F, -3.1416F));

        PartDefinition hex_r29 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r29",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(5.6761F, 0.0F, -2.328F, -2.8362F, 1.1781F, -3.1416F));

        PartDefinition hex_r30 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r30",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(2.3674F, 0.0F, -5.6598F, -2.8362F, 0.3927F, -3.1416F));

        PartDefinition hex_r31 = BTopBottomSeperators.addOrReplaceChild(
                "hex_r31",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0954F, -0.4699F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-2.328F, 0.0F, -5.6761F, -2.8362F, -0.3927F, -3.1416F));

        PartDefinition BBottomPanels2 = bottom.addOrReplaceChild(
                "BBottomPanels2", CubeListBuilder.create(), PartPose.offset(4.3095F, 4.432F, 4.3095F));

        PartDefinition BBottomPanels = BBottomPanels2.addOrReplaceChild(
                "BBottomPanels", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition hex_r32 = BBottomPanels.addOrReplaceChild(
                "hex_r32",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 0.7854F, 0.0F));

        PartDefinition hex_r33 = BBottomPanels.addOrReplaceChild(
                "hex_r33",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.3095F, 0.0F, 1.7851F, 0.3054F, 0.0F, 0.0F));

        PartDefinition hex_r34 = BBottomPanels.addOrReplaceChild(
                "hex_r34",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.619F, 0.0F, 0.0F, 0.3054F, -0.7854F, 0.0F));

        PartDefinition hex_r35 = BBottomPanels.addOrReplaceChild(
                "hex_r35",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.4041F, 0.0F, -4.3095F, 0.0F, -1.5708F, 0.3054F));

        PartDefinition hex_r36 = BBottomPanels.addOrReplaceChild(
                "hex_r36",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.3095F, 0.0F, -10.4041F, -2.8362F, 0.0F, -3.1416F));

        PartDefinition hex_r37 = BBottomPanels.addOrReplaceChild(
                "hex_r37",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -8.6191F, -2.8362F, 0.7854F, 3.1416F));

        PartDefinition hex_r38 = BBottomPanels.addOrReplaceChild(
                "hex_r38",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.619F, 0.0F, -8.6191F, -2.8362F, -0.7854F, 3.1416F));

        PartDefinition hex_r39 = BBottomPanels.addOrReplaceChild(
                "hex_r39",
                CubeListBuilder.create()
                        .texOffs(16, 478)
                        .addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.7851F, 0.0F, -4.3095F, 0.0F, 1.5708F, -0.3054F));

        PartDefinition BBottomSeperators = BBottomPanels2.addOrReplaceChild(
                "BBottomSeperators", CubeListBuilder.create(), PartPose.offset(-3.9578F, -6.057F, -4.972F));

        PartDefinition hex_r40 = BBottomSeperators.addOrReplaceChild(
                "hex_r40",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(5.2848F, 6.2516F, 3.017F, 0.3054F, 1.1781F, 0.0F));

        PartDefinition hex_r41 = BBottomSeperators.addOrReplaceChild(
                "hex_r41",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(1.953F, 6.2516F, 6.3256F, 0.3054F, 0.3927F, 0.0F));

        PartDefinition hex_r42 = BBottomSeperators.addOrReplaceChild(
                "hex_r42",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-2.7424F, 6.2516F, 6.3093F, 0.3054F, -0.3927F, 0.0F));

        PartDefinition hex_r43 = BBottomSeperators.addOrReplaceChild(
                "hex_r43",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-6.0511F, 6.2516F, 2.9775F, 0.3054F, -1.1781F, 0.0F));

        PartDefinition hex_r44 = BBottomSeperators.addOrReplaceChild(
                "hex_r44",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-6.0348F, 6.2516F, -1.7179F, -2.8362F, -1.1781F, -3.1416F));

        PartDefinition hex_r45 = BBottomSeperators.addOrReplaceChild(
                "hex_r45",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(5.3011F, 6.2516F, -1.6785F, -2.8362F, 1.1781F, -3.1416F));

        PartDefinition hex_r46 = BBottomSeperators.addOrReplaceChild(
                "hex_r46",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(1.9924F, 6.2516F, -5.0103F, -2.8362F, 0.3927F, -3.1416F));

        PartDefinition hex_r47 = BBottomSeperators.addOrReplaceChild(
                "hex_r47",
                CubeListBuilder.create()
                        .texOffs(60, 505)
                        .addBox(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(-2.703F, 6.2516F, -5.0266F, -2.8362F, -0.3927F, -3.1416F));

        PartDefinition emmissives = root.addOrReplaceChild(
                "emmissives",
                CubeListBuilder.create()
                        .texOffs(288, 179)
                        .addBox(-0.6F, -47.76F, -0.1126F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.0F, 0.0F, 0.25F));

        PartDefinition cube_r1 = emmissives.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(6, 224)
                        .addBox(1.925F, -2.0708F, -3.1122F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F))
                        .texOffs(6, 215)
                        .addBox(-4.375F, -2.0579F, -3.1171F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(10.1678F, -15.6786F, 5.9683F, -2.5307F, -1.0472F, 3.1416F));

        PartDefinition cube_r2 = emmissives.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(6, 233)
                        .addBox(-1.367F, -2.0273F, -2.8425F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(10.1678F, -15.6786F, 5.9683F, -2.7925F, -1.0472F, 3.1416F));

        PartDefinition cube_r3 = emmissives.addOrReplaceChild(
                "cube_r3",
                CubeListBuilder.create()
                        .texOffs(6, 233)
                        .addBox(-2.7F, -1.9698F, -2.921F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(12.1158F, -15.9321F, 1.7525F, -0.3491F, 1.0472F, 0.0F));

        PartDefinition RotorEmmisiveOne6 = emmissives.addOrReplaceChild(
                "RotorEmmisiveOne6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone69 = RotorEmmisiveOne6.addOrReplaceChild(
                "bone69", CubeListBuilder.create(), PartPose.offset(-3.8612F, -21.4874F, 2.3948F));

        PartDefinition cube_r4 = bone69.addOrReplaceChild(
                "cube_r4",
                CubeListBuilder.create()
                        .texOffs(107, 505)
                        .addBox(0.2969F, 1.5454F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(105, 507)
                        .addBox(-0.2031F, 1.6954F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.6987F, -2.816F, 1.4426F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition cube_r5 = bone69.addOrReplaceChild(
                "cube_r5",
                CubeListBuilder.create()
                        .texOffs(15, 186)
                        .addBox(-1.6599F, -1.0726F, -0.8643F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2795F, 1.101F, -0.8954F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition bone70 = RotorEmmisiveOne6.addOrReplaceChild(
                "bone70",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-3.8612F, -21.4874F, 2.3948F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r6 = bone70.addOrReplaceChild(
                "cube_r6",
                CubeListBuilder.create()
                        .texOffs(107, 505)
                        .addBox(0.2969F, 1.5454F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(105, 507)
                        .addBox(-0.2031F, 1.6954F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4487F, -2.816F, 6.7908F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition cube_r7 = bone70.addOrReplaceChild(
                "cube_r7",
                CubeListBuilder.create()
                        .texOffs(15, 186)
                        .addBox(-1.6599F, -1.0726F, -1.3643F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5295F, 1.101F, 4.4528F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition bone71 = RotorEmmisiveOne6.addOrReplaceChild(
                "bone71",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.3954F, -21.4874F, 4.8524F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r8 = bone71.addOrReplaceChild(
                "cube_r8",
                CubeListBuilder.create()
                        .texOffs(107, 505)
                        .addBox(0.2969F, 1.5454F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(105, 507)
                        .addBox(-0.2031F, 1.6954F, -1.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.6987F, -2.816F, 6.3578F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition cube_r9 = bone71.addOrReplaceChild(
                "cube_r9",
                CubeListBuilder.create()
                        .texOffs(15, 186)
                        .addBox(-1.6599F, -1.0726F, -0.8643F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2795F, 1.101F, 4.0198F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition bone72 = RotorEmmisiveOne6.addOrReplaceChild(
                "bone72",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.3954F, -21.4874F, 0.6024F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r10 = bone72.addOrReplaceChild(
                "cube_r10",
                CubeListBuilder.create()
                        .texOffs(107, 505)
                        .addBox(0.2969F, 1.5454F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(105, 507)
                        .addBox(-0.2031F, 1.6954F, -1.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.7054F, -2.816F, 4.9984F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition cube_r11 = bone72.addOrReplaceChild(
                "cube_r11",
                CubeListBuilder.create()
                        .texOffs(15, 186)
                        .addBox(-1.6599F, -1.0726F, -1.3643F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.7271F, 1.101F, 2.6603F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition bone73 = RotorEmmisiveOne6.addOrReplaceChild(
                "bone73",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.3954F, -21.4874F, 0.6024F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r12 = bone73.addOrReplaceChild(
                "cube_r12",
                CubeListBuilder.create()
                        .texOffs(107, 505)
                        .addBox(0.2969F, 1.5454F, -1.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(105, 507)
                        .addBox(-0.2031F, 1.6954F, -2.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0314F, -2.816F, 5.0988F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition cube_r13 = bone73.addOrReplaceChild(
                "cube_r13",
                CubeListBuilder.create()
                        .texOffs(15, 186)
                        .addBox(-1.6599F, -1.0726F, -1.8643F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0531F, 1.101F, 2.7608F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition bone74 = RotorEmmisiveOne6.addOrReplaceChild(
                "bone74",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.3954F, -21.4874F, 0.6024F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r14 = bone74.addOrReplaceChild(
                "cube_r14",
                CubeListBuilder.create()
                        .texOffs(107, 505)
                        .addBox(0.2969F, 1.5454F, -2.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(105, 507)
                        .addBox(-0.2031F, 1.6954F, -2.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.7814F, -2.816F, 4.8667F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition cube_r15 = bone74.addOrReplaceChild(
                "cube_r15",
                CubeListBuilder.create()
                        .texOffs(15, 186)
                        .addBox(-1.6599F, -1.0726F, -2.3643F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.8031F, 1.101F, 2.5287F, -0.2393F, 0.4703F, -0.4939F));

        PartDefinition base = root.addOrReplaceChild(
                "base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.25F, 0.25F, 0.0F, -1.0472F, 0.0F));

        PartDefinition panels =
                base.addOrReplaceChild("panels", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottomPanels =
                panels.addOrReplaceChild("bottomPanels", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottompanel1 = bottomPanels.addOrReplaceChild(
                "bottompanel1", CubeListBuilder.create(), PartPose.offset(0.0F, -0.4561F, 0.0F));

        PartDefinition bottompanel2 = bottomPanels.addOrReplaceChild(
                "bottompanel2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.0361F, 0.0F));

        PartDefinition bottompanel3 = bottomPanels.addOrReplaceChild(
                "bottompanel3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -0.0361F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bottompanel4 = bottomPanels.addOrReplaceChild(
                "bottompanel4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -0.0361F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r16 = bottompanel4.addOrReplaceChild(
                "cube_r16",
                CubeListBuilder.create()
                        .texOffs(0, 453)
                        .addBox(-8.1883F, -0.4747F, -4.1776F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.7948F, -11.2097F, -15.2375F, -0.3491F, 0.0F, 0.0F));

        PartDefinition cube_r17 = bottompanel4.addOrReplaceChild(
                "cube_r17",
                CubeListBuilder.create()
                        .texOffs(0, 453)
                        .addBox(-6.6883F, -0.4747F, -4.1776F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-15.0836F, -11.2097F, -4.0298F, -0.3491F, 1.0472F, 0.0F));

        PartDefinition cube_r18 = bottompanel4.addOrReplaceChild(
                "cube_r18",
                CubeListBuilder.create()
                        .texOffs(0, 453)
                        .addBox(-6.6883F, -0.4747F, -4.1776F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.7719F, -11.2097F, 10.9175F, 2.7925F, 1.0472F, 3.1416F));

        PartDefinition cube_r19 = bottompanel4.addOrReplaceChild(
                "cube_r19",
                CubeListBuilder.create()
                        .texOffs(66, 506)
                        .addBox(-11.343F, -0.6514F, -2.194F, 18.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.669F, -11.4664F, -0.2902F, 2.3126F, 1.0472F, 3.1416F));

        PartDefinition cube_r20 = bottompanel4.addOrReplaceChild(
                "cube_r20",
                CubeListBuilder.create()
                        .texOffs(7, 506)
                        .addBox(-15.3429F, -0.6514F, -2.194F, 22.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.326F, -11.4664F, -7.8125F, -0.829F, 1.0472F, 0.0F));

        PartDefinition cube_r21 = bottompanel4.addOrReplaceChild(
                "cube_r21",
                CubeListBuilder.create()
                        .texOffs(7, 506)
                        .addBox(-17.6826F, 16.2554F, 13.2717F, 22.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.6996F, -34.2909F, -5.7959F, -0.829F, 0.0F, 0.0F));

        PartDefinition cube_r22 = bottompanel4.addOrReplaceChild(
                "cube_r22",
                CubeListBuilder.create()
                        .texOffs(14, 500)
                        .addBox(-11.0F, -4.5F, -0.5F, 18.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.9799F, -10.1152F, 5.4619F, 2.3126F, -1.0472F, 3.1416F));

        PartDefinition cube_r23 = bottompanel4.addOrReplaceChild(
                "cube_r23",
                CubeListBuilder.create()
                        .texOffs(7, 506)
                        .addBox(-11.0F, -4.5F, -0.5F, 22.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.9799F, -10.1152F, -6.0423F, -0.829F, -1.0472F, 0.0F));

        PartDefinition cube_r24 = bottompanel4.addOrReplaceChild(
                "cube_r24",
                CubeListBuilder.create()
                        .texOffs(0, 453)
                        .addBox(-6.6883F, -0.4747F, -4.1776F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(15.1175F, -11.2097F, 3.4493F, 2.7925F, -1.0472F, 3.1416F));

        PartDefinition cube_r25 = bottompanel4.addOrReplaceChild(
                "cube_r25",
                CubeListBuilder.create()
                        .texOffs(0, 453)
                        .addBox(-10.61F, 0.1333F, -6.6067F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(10.6098F, -10.9503F, -6.8563F, -0.3491F, -1.0472F, 0.0F));

        PartDefinition bottompanel5 = bottomPanels.addOrReplaceChild(
                "bottompanel5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -0.0361F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bottomPanelMergers = bottomPanels.addOrReplaceChild(
                "bottomPanelMergers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bottomMerger1 = bottomPanelMergers.addOrReplaceChild(
                "bottomMerger1",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition middlePanels = panels.addOrReplaceChild(
                "middlePanels",
                CubeListBuilder.create()
                        .texOffs(0, 16)
                        .addBox(-11.055F, -0.1737F, -19.1183F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 78)
                        .addBox(-11.266F, 0.3648F, -19.3301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F))
                        .texOffs(109, 62)
                        .addBox(10.1565F, 0.3648F, -19.3298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F))
                        .texOffs(88, 78)
                        .addBox(-11.266F, -2.3342F, -19.3301F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F))
                        .texOffs(109, 62)
                        .addBox(10.1565F, -2.3842F, -19.3298F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F))
                        .texOffs(0, 32)
                        .addBox(-11.055F, -1.9957F, -19.1183F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(440, 496)
                        .addBox(-10.552F, -1.0757F, -18.2293F, 21.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.2979F, -13.0074F, 0.2256F));

        PartDefinition cube_r26 = middlePanels.addOrReplaceChild(
                "cube_r26",
                CubeListBuilder.create()
                        .texOffs(440, 496)
                        .addBox(-9.7624F, -13.06F, -17.3877F, 21.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1127F, 11.9843F, 0.1966F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r27 = middlePanels.addOrReplaceChild(
                "cube_r27",
                CubeListBuilder.create()
                        .texOffs(440, 496)
                        .addBox(-10.708F, -13.06F, -16.9491F, 21.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.2277F, 11.9843F, 0.3957F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r28 = middlePanels.addOrReplaceChild(
                "cube_r28",
                CubeListBuilder.create()
                        .texOffs(440, 496)
                        .addBox(-11.5607F, -13.06F, -17.5488F, 21.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.1126F, 11.9843F, 0.5949F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r29 = middlePanels.addOrReplaceChild(
                "cube_r29",
                CubeListBuilder.create()
                        .texOffs(439, 495)
                        .addBox(-13.9676F, -13.06F, -18.587F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.6327F, 11.9843F, 1.894F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r30 = middlePanels.addOrReplaceChild(
                "cube_r30",
                CubeListBuilder.create()
                        .texOffs(440, 496)
                        .addBox(-10.522F, -13.06F, -19.0256F, 21.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7676F, 11.9843F, 0.3957F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r31 = middlePanels.addOrReplaceChild(
                "cube_r31",
                CubeListBuilder.create()
                        .texOffs(0, 16)
                        .addBox(-10.5738F, -13.475F, -19.3193F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-10.5738F, -11.653F, -19.3193F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0371F, 11.4793F, 0.4367F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r32 = middlePanels.addOrReplaceChild(
                "cube_r32",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.3802F, 1.0146F, -2.1834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(9.8222F, -3.3988F, -17.12F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r33 = middlePanels.addOrReplaceChild(
                "cube_r33",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.3343F, 0.6147F, -2.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-9.8858F, -2.9488F, -17.1468F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r34 = middlePanels.addOrReplaceChild(
                "cube_r34",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.3802F, 0.1646F, -2.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-19.763F, -2.5488F, -0.0925F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r35 = middlePanels.addOrReplaceChild(
                "cube_r35",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.3343F, 0.1646F, -2.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-19.763F, -2.5488F, -0.0925F, -3.1416F, 1.0472F, -3.1416F));

        PartDefinition cube_r36 = middlePanels.addOrReplaceChild(
                "cube_r36",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.3343F, -0.2354F, -2.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-9.9322F, -2.0988F, 16.9885F, -3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r37 = middlePanels.addOrReplaceChild(
                "cube_r37",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.3802F, -0.2354F, -2.1834F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-9.9322F, -2.0988F, 16.9885F, 3.1416F, 1.0472F, -3.1416F));

        PartDefinition cube_r38 = middlePanels.addOrReplaceChild(
                "cube_r38",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.3802F, -0.6853F, -2.1833F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(9.7758F, -1.6488F, 17.0152F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r39 = middlePanels.addOrReplaceChild(
                "cube_r39",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.3343F, -0.6853F, -2.2098F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(9.7758F, -1.6488F, 17.0152F, -3.1416F, -1.0472F, -3.1416F));

        PartDefinition cube_r40 = middlePanels.addOrReplaceChild(
                "cube_r40",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.7498F, -2.3653F, -2.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(9.3608F, 2.7302F, -16.4268F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r41 = middlePanels.addOrReplaceChild(
                "cube_r41",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.7957F, -2.1153F, -2.9031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-9.5161F, 2.4802F, -16.4006F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r42 = middlePanels.addOrReplaceChild(
                "cube_r42",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.7498F, -1.8653F, -2.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-18.9319F, 2.2302F, -0.0396F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r43 = middlePanels.addOrReplaceChild(
                "cube_r43",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.7957F, -1.8653F, -2.9031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-18.9319F, 2.2302F, -0.0396F, -3.1416F, 1.0472F, -3.1416F));

        PartDefinition cube_r44 = middlePanels.addOrReplaceChild(
                "cube_r44",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.7498F, -1.6153F, -2.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-9.4708F, 1.9802F, 16.2952F, 3.1416F, 1.0472F, 3.1416F));

        PartDefinition cube_r45 = middlePanels.addOrReplaceChild(
                "cube_r45",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.7957F, -1.6153F, -2.9031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(-9.4708F, 1.9802F, 16.2952F, -3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r46 = middlePanels.addOrReplaceChild(
                "cube_r46",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(0.7957F, -1.3653F, -2.903F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(9.4067F, 1.7302F, 16.2687F, -3.1416F, -1.0472F, -3.1416F));

        PartDefinition cube_r47 = middlePanels.addOrReplaceChild(
                "cube_r47",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-1.7498F, -1.3653F, -2.9295F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(9.4067F, 1.7302F, 16.2687F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r48 = middlePanels.addOrReplaceChild(
                "cube_r48",
                CubeListBuilder.create()
                        .texOffs(88, 78)
                        .addBox(-10.5738F, -14.975F, -19.3193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F))
                        .texOffs(88, 78)
                        .addBox(-10.5738F, -17.6582F, -19.3193F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(0.216F, 15.324F, -0.645F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r49 = middlePanels.addOrReplaceChild(
                "cube_r49",
                CubeListBuilder.create()
                        .texOffs(109, 62)
                        .addBox(-0.5F, -27.45F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F))
                        .texOffs(109, 62)
                        .addBox(-0.5F, -30.1332F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2115F)),
                PartPose.offsetAndRotation(21.5509F, 27.799F, -0.1714F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r50 = middlePanels.addOrReplaceChild(
                "cube_r50",
                CubeListBuilder.create()
                        .texOffs(0, 48)
                        .addBox(-10.6462F, -13.475F, -19.3192F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-10.6462F, -11.653F, -19.3192F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.4629F, 11.4793F, -0.2388F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r51 = middlePanels.addOrReplaceChild(
                "cube_r51",
                CubeListBuilder.create()
                        .texOffs(0, 64)
                        .addBox(-10.5738F, -13.475F, -19.3193F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0729F, 11.4793F, -0.5682F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r52 = middlePanels.addOrReplaceChild(
                "cube_r52",
                CubeListBuilder.create()
                        .texOffs(0, 80)
                        .addBox(-10.5376F, -13.475F, -19.3819F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 48)
                        .addBox(-10.5376F, -11.653F, -19.3819F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4073F, 11.4793F, -0.3951F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r53 = middlePanels.addOrReplaceChild(
                "cube_r53",
                CubeListBuilder.create()
                        .texOffs(0, 80)
                        .addBox(-10.6462F, -13.475F, -19.3193F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 64)
                        .addBox(-10.6462F, -11.653F, -19.3193F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3529F, 11.4793F, 0.1073F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r54 = middlePanels.addOrReplaceChild(
                "cube_r54",
                CubeListBuilder.create()
                        .texOffs(0, 32)
                        .addBox(-12.0738F, -12.725F, -19.3193F, 22.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.8229F, 12.5513F, 0.7308F, 0.0F, -2.0944F, 0.0F));

        PartDefinition PanelBackFillers = middlePanels.addOrReplaceChild(
                "PanelBackFillers", CubeListBuilder.create(), PartPose.offset(0.4073F, 11.2793F, -0.3951F));

        PartDefinition bone37 = PanelBackFillers.addOrReplaceChild(
                "bone37", CubeListBuilder.create(), PartPose.offset(2.0099F, 0.2F, -5.7357F));

        PartDefinition cube_r55 = bone37.addOrReplaceChild(
                "cube_r55",
                CubeListBuilder.create()
                        .texOffs(0, 285)
                        .addBox(-1.5377F, -13.575F, -14.6319F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0873F, 0.0F, 0.2769F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone39 = PanelBackFillers.addOrReplaceChild(
                "bone39",
                CubeListBuilder.create()
                        .texOffs(0, 292)
                        .addBox(-14.6585F, -13.675F, -12.8668F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(39, 292)
                        .addBox(-14.6585F, -13.925F, -12.8668F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0099F, 0.2F, -5.7357F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r56 = bone39.addOrReplaceChild(
                "cube_r56",
                CubeListBuilder.create()
                        .texOffs(0, 285)
                        .addBox(-1.5377F, -13.575F, -14.6319F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(39, 292)
                        .addBox(-1.5377F, -13.925F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 292)
                        .addBox(-1.5377F, -13.675F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0989F, 0.0F, -4.9947F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r57 = bone39.addOrReplaceChild(
                "cube_r57",
                CubeListBuilder.create()
                        .texOffs(39, 292)
                        .addBox(-1.5377F, -13.725F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 292)
                        .addBox(-1.5377F, -13.475F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.2181F, -0.2F, 6.9739F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r58 = bone39.addOrReplaceChild(
                "cube_r58",
                CubeListBuilder.create()
                        .texOffs(0, 292)
                        .addBox(-1.5377F, -13.475F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(39, 292)
                        .addBox(-1.5377F, -13.725F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.7557F, -0.2F, 6.1984F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r59 = bone39.addOrReplaceChild(
                "cube_r59",
                CubeListBuilder.create()
                        .texOffs(0, 292)
                        .addBox(-1.5377F, -13.475F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(39, 292)
                        .addBox(-1.5377F, -13.725F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1962F, -0.2F, 0.2141F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone46 = PanelBackFillers.addOrReplaceChild(
                "bone46",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(2.0099F, 0.2F, -5.7357F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r60 = bone46.addOrReplaceChild(
                "cube_r60",
                CubeListBuilder.create()
                        .texOffs(39, 301)
                        .addBox(-1.5377F, -13.725F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 285)
                        .addBox(-1.5377F, -13.375F, -14.6319F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 301)
                        .addBox(-1.5377F, -13.475F, -14.6319F, 16.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.6267F, -0.2F, -11.2559F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r61 = bone46.addOrReplaceChild(
                "cube_r61",
                CubeListBuilder.create()
                        .texOffs(0, 285)
                        .addBox(-1.5377F, -13.575F, -14.6319F, 16.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.089F, 0.0F, -10.4804F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone38 = PanelBackFillers.addOrReplaceChild(
                "bone38", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r62 = bone38.addOrReplaceChild(
                "cube_r62",
                CubeListBuilder.create()
                        .texOffs(0, 285)
                        .addBox(-7.5377F, -13.575F, -14.3819F, 19.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.2F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone25 = middlePanels.addOrReplaceChild(
                "bone25", CubeListBuilder.create(), PartPose.offset(-6.6385F, -2.1957F, 10.9118F));

        PartDefinition cube_r63 = bone25.addOrReplaceChild(
                "cube_r63",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1F, 0.0F, -0.3F, 3.1416F, -0.7854F, -3.1416F));

        PartDefinition cube_r64 = bone25.addOrReplaceChild(
                "cube_r64",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(3.5F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.6F, 0.4F, -1.0071F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r65 = bone25.addOrReplaceChild(
                "cube_r65",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 0.0F, -0.3F, 3.1416F, -0.7854F, -3.1416F));

        PartDefinition cube_r66 = bone25.addOrReplaceChild(
                "cube_r66",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(3.5F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.3071F, 0.4F, -0.3F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r67 = bone25.addOrReplaceChild(
                "cube_r67",
                CubeListBuilder.create()
                        .texOffs(4, 307)
                        .addBox(3.0F, -0.2569F, -0.95F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)),
                PartPose.offsetAndRotation(4.6F, -0.55F, 0.2657F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r68 = bone25.addOrReplaceChild(
                "cube_r68",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.1F, 0.0F, 0.7F, 3.1416F, -0.7854F, -3.1416F));

        PartDefinition cube_r69 = bone25.addOrReplaceChild(
                "cube_r69",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(3.5F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.6F, 0.4F, 0.4071F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r70 = bone25.addOrReplaceChild(
                "cube_r70",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(3.5F, -1.4F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.8929F, 0.4F, -0.3F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r71 = bone25.addOrReplaceChild(
                "cube_r71",
                CubeListBuilder.create()
                        .texOffs(14, 309)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1F, 0.0F, 0.7F, 3.1416F, -0.7854F, -3.1416F));

        PartDefinition cube_r72 = bone25.addOrReplaceChild(
                "cube_r72",
                CubeListBuilder.create()
                        .texOffs(4, 307)
                        .addBox(-1.0F, -0.4569F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.2F)),
                PartPose.offsetAndRotation(0.6F, -0.35F, 0.2157F, 3.1416F, 0.7854F, -3.1416F));

        PartDefinition cube_r73 = bone25.addOrReplaceChild(
                "cube_r73",
                CubeListBuilder.create()
                        .texOffs(3, 315)
                        .addBox(3.3F, -4.2F, -1.85F, 3.0F, 3.1969F, 3.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(5.4F, 0.6F, -0.1157F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition bone42 = middlePanels.addOrReplaceChild(
                "bone42", CubeListBuilder.create(), PartPose.offset(-9.3663F, -3.5661F, 0.1099F));

        PartDefinition bone32 = bone42.addOrReplaceChild(
                "bone32", CubeListBuilder.create(), PartPose.offset(9.183F, -0.6989F, 0.0966F));

        PartDefinition bone54 = bone32.addOrReplaceChild(
                "bone54", CubeListBuilder.create(), PartPose.offset(0.0217F, 0.2176F, -0.039F));

        PartDefinition cube_r74 = bone54.addOrReplaceChild(
                "cube_r74",
                CubeListBuilder.create()
                        .texOffs(320, 14)
                        .addBox(-0.5317F, 2.1803F, -11.0731F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.7741F, 0.5239F, 3.1164F));

        PartDefinition cube_r75 = bone54.addOrReplaceChild(
                "cube_r75",
                CubeListBuilder.create()
                        .texOffs(320, 14)
                        .addBox(-0.4192F, 2.1726F, -11.0529F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)),
                PartPose.offsetAndRotation(0.0229F, 0.0F, 0.0384F, 1.197F, 1.549F, 1.5519F));

        PartDefinition cube_r76 = bone54.addOrReplaceChild(
                "cube_r76",
                CubeListBuilder.create()
                        .texOffs(327, 1)
                        .addBox(0.0408F, -0.8554F, -10.301F, 0.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-0.0217F, -1.0007F, 0.039F, -3.1164F, -0.5239F, -3.1164F));

        PartDefinition cube_r77 = bone54.addOrReplaceChild(
                "cube_r77",
                CubeListBuilder.create()
                        .texOffs(320, 14)
                        .addBox(-0.4161F, 2.1659F, -11.1009F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)),
                PartPose.offsetAndRotation(-0.043F, -0.0003F, -0.0002F, 2.7725F, -0.5242F, -3.1125F));

        PartDefinition cube_r78 = bone54.addOrReplaceChild(
                "cube_r78",
                CubeListBuilder.create()
                        .texOffs(320, 14)
                        .addBox(-0.4942F, 2.1871F, -11.0937F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)),
                PartPose.offsetAndRotation(-0.0664F, 0.0F, 0.0397F, -1.9446F, -1.549F, 1.5897F));

        PartDefinition cube_r79 = bone54.addOrReplaceChild(
                "cube_r79",
                CubeListBuilder.create()
                        .texOffs(320, 14)
                        .addBox(-0.4817F, 2.1793F, -11.0735F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)),
                PartPose.offsetAndRotation(-0.0435F, 0.0F, 0.0781F, -0.3675F, -0.5239F, 0.0252F));

        PartDefinition cube_r80 = bone54.addOrReplaceChild(
                "cube_r80",
                CubeListBuilder.create()
                        .texOffs(320, 14)
                        .addBox(-0.3942F, 2.1721F, -10.9531F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.09F)),
                PartPose.offsetAndRotation(0.0012F, 0.0F, 0.0774F, -0.3423F, 0.523F, 0.0252F));

        PartDefinition cube_r81 = bone54.addOrReplaceChild(
                "cube_r81",
                CubeListBuilder.create()
                        .texOffs(327, 1)
                        .addBox(0.1381F, -0.8337F, -10.2581F, 0.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-0.0217F, -1.0007F, 0.039F, 0.0504F, 0.523F, 0.0252F));

        PartDefinition cube_r82 = bone54.addOrReplaceChild(
                "cube_r82",
                CubeListBuilder.create()
                        .texOffs(327, 1)
                        .addBox(0.0506F, -0.8348F, -10.2797F, 0.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-0.0217F, -1.0007F, 0.039F, 0.0252F, -0.5239F, 0.0252F));

        PartDefinition cube_r83 = bone54.addOrReplaceChild(
                "cube_r83",
                CubeListBuilder.create()
                        .texOffs(327, 1)
                        .addBox(0.0381F, -0.8353F, -10.3013F, 0.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-0.0217F, -1.0007F, 0.039F, -1.5519F, -1.549F, 1.5897F));

        PartDefinition cube_r84 = bone54.addOrReplaceChild(
                "cube_r84",
                CubeListBuilder.create()
                        .texOffs(327, 1)
                        .addBox(0.0007F, -0.8343F, -10.3168F, 0.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-0.0217F, -1.0007F, 0.039F, -3.1164F, 0.5239F, 3.1164F));

        PartDefinition cube_r85 = bone54.addOrReplaceChild(
                "cube_r85",
                CubeListBuilder.create()
                        .texOffs(327, 1)
                        .addBox(0.1132F, -0.8331F, -10.2581F, 0.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-0.0217F, -1.0007F, 0.039F, 1.5897F, 1.549F, 1.5519F));

        PartDefinition bone65 = bone54.addOrReplaceChild(
                "bone65",
                CubeListBuilder.create()
                        .texOffs(161, 1)
                        .addBox(3.5801F, 0.0F, -2.5F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)),
                PartPose.offsetAndRotation(0.0524F, -1.6402F, -0.0074F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r86 = bone65.addOrReplaceChild(
                "cube_r86",
                CubeListBuilder.create()
                        .texOffs(161, 1)
                        .addBox(3.5288F, -1.1226F, -2.5884F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)),
                PartPose.offsetAndRotation(-0.0509F, 1.1226F, 0.0886F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r87 = bone65.addOrReplaceChild(
                "cube_r87",
                CubeListBuilder.create()
                        .texOffs(161, 1)
                        .addBox(3.4779F, -1.1226F, -2.4998F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)),
                PartPose.offsetAndRotation(-0.0509F, 1.1226F, 0.0886F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r88 = bone65.addOrReplaceChild(
                "cube_r88",
                CubeListBuilder.create()
                        .texOffs(161, 1)
                        .addBox(3.6823F, -1.1226F, -2.5002F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)),
                PartPose.offsetAndRotation(-0.0509F, 1.1226F, 0.0886F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r89 = bone65.addOrReplaceChild(
                "cube_r89",
                CubeListBuilder.create()
                        .texOffs(161, 1)
                        .addBox(3.6314F, -1.1226F, -2.4116F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)),
                PartPose.offsetAndRotation(-0.0509F, 1.1226F, 0.0886F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r90 = bone65.addOrReplaceChild(
                "cube_r90",
                CubeListBuilder.create()
                        .texOffs(161, 1)
                        .addBox(3.5292F, -1.1226F, -2.4114F, 1.0F, 0.0F, 5.0F, new CubeDeformation(0.35F)),
                PartPose.offsetAndRotation(-0.0509F, 1.1226F, 0.0886F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone40 = bone42.addOrReplaceChild(
                "bone40", CubeListBuilder.create(), PartPose.offset(2.6639F, 0.1205F, 3.8854F));

        PartDefinition cube_r91 = bone40.addOrReplaceChild(
                "cube_r91",
                CubeListBuilder.create()
                        .texOffs(263, 6)
                        .addBox(-6.125F, -0.9306F, -3.2911F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(268, 9)
                        .addBox(-2.825F, -0.9768F, -2.8103F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4204F, 0.1854F, -0.3871F, 2.8362F, 1.0472F, 3.1416F));

        PartDefinition cube_r92 = bone40.addOrReplaceChild(
                "cube_r92",
                CubeListBuilder.create()
                        .texOffs(263, 6)
                        .addBox(-6.125F, -0.9306F, -3.2911F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(268, 9)
                        .addBox(-2.775F, -0.9768F, -2.8103F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.4375F, 0.153F, 3.1796F, 2.8362F, 0.0F, 3.1416F));

        PartDefinition cube_r93 = bone40.addOrReplaceChild(
                "cube_r93",
                CubeListBuilder.create()
                        .texOffs(263, 6)
                        .addBox(-6.125F, -0.9306F, -3.2911F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(268, 9)
                        .addBox(-2.775F, -0.9768F, -2.8103F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.5147F, 0.1527F, -0.2098F, 2.8362F, -1.0472F, 3.1416F));

        PartDefinition cube_r94 = bone40.addOrReplaceChild(
                "cube_r94",
                CubeListBuilder.create()
                        .texOffs(263, 6)
                        .addBox(-5.975F, -0.9306F, -3.2911F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(268, 9)
                        .addBox(-2.825F, -0.9768F, -2.8103F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.694F, 0.153F, -10.7322F, -0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r95 = bone40.addOrReplaceChild(
                "cube_r95",
                CubeListBuilder.create()
                        .texOffs(263, 6)
                        .addBox(-6.125F, -0.9306F, -3.2911F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(268, 9)
                        .addBox(-2.875F, -0.9768F, -2.8103F, 6.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.6163F, 0.153F, -7.1648F, -0.3054F, -1.0472F, 0.0F));

        PartDefinition topPanels =
                panels.addOrReplaceChild("topPanels", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition topPanelMergers = topPanels.addOrReplaceChild(
                "topPanelMergers", CubeListBuilder.create(), PartPose.offset(0.0F, -14.07F, 0.0F));

        PartDefinition bone =
                topPanelMergers.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone3 = topPanelMergers.addOrReplaceChild(
                "bone3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.065F, 0.0F, 0.1172F, 0.0F, -1.0647F, 0.0F));

        PartDefinition bone4 = topPanelMergers.addOrReplaceChild(
                "bone4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.071F, 0.0F, -0.1136F, 0.0F, -2.1293F, 0.0F));

        PartDefinition bone5 = topPanelMergers.addOrReplaceChild(
                "bone5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.5358F, 0.0F, 0.014F, 0.0F, 3.1154F, 0.0F));

        PartDefinition bone6 = topPanelMergers.addOrReplaceChild(
                "bone6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.2969F, 0.0F, 0.5248F, 0.0F, 2.0857F, 0.0F));

        PartDefinition bone2 = topPanelMergers.addOrReplaceChild(
                "bone2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.165F, 0.0F, 0.2916F, 0.0F, 1.0559F, 0.0F));

        PartDefinition panel1 = topPanels.addOrReplaceChild(
                "panel1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r96 = panel1.addOrReplaceChild(
                "cube_r96",
                CubeListBuilder.create()
                        .texOffs(76, 153)
                        .addBox(-8.955F, -1.8572F, -1.7186F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.0984F, -13.5338F, -7.0947F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r97 = panel1.addOrReplaceChild(
                "cube_r97",
                CubeListBuilder.create()
                        .texOffs(155, 157)
                        .addBox(7.135F, -3.3162F, -3.9216F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-11.5384F, -13.8432F, -6.1674F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r98 = panel1.addOrReplaceChild(
                "cube_r98",
                CubeListBuilder.create()
                        .texOffs(149, 157)
                        .addBox(6.135F, -4.8161F, -4.9216F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-1.5F))
                        .texOffs(158, 211)
                        .addBox(-8.015F, -3.0661F, -6.1716F, 16.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.8755F, -13.9936F, -6.362F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r99 = panel1.addOrReplaceChild(
                "cube_r99",
                CubeListBuilder.create()
                        .texOffs(38, 228)
                        .addBox(-10.945F, -2.9292F, -6.4086F, 22.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.7144F, -14.1366F, -6.142F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition joystick = panel1.addOrReplaceChild(
                "joystick", CubeListBuilder.create(), PartPose.offset(-14.4126F, -14.7859F, -10.1212F));

        PartDefinition cube_r100 = joystick.addOrReplaceChild(
                "cube_r100",
                CubeListBuilder.create()
                        .texOffs(180, 202)
                        .addBox(-0.4858F, -2.2279F, -0.367F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.45F)),
                PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.1719F, -0.4971F, -0.3492F));

        PartDefinition cube_r101 = joystick.addOrReplaceChild(
                "cube_r101",
                CubeListBuilder.create()
                        .texOffs(204, 155)
                        .addBox(-0.4188F, -1.9179F, -0.434F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(-0.1826F, -0.5732F, -0.0281F, 0.1719F, -0.4971F, -0.3492F));

        PartDefinition panel1Controls =
                panel1.addOrReplaceChild("panel1Controls", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition doorControl = panel1Controls.addOrReplaceChild(
                "doorControl", CubeListBuilder.create(), PartPose.offset(0.0F, 0.335F, 0.0F));

        PartDefinition doorLight1 = doorControl.addOrReplaceChild(
                "doorLight1", CubeListBuilder.create(), PartPose.offset(-10.1541F, -15.611F, -5.8625F));

        PartDefinition doorLight2 = doorControl.addOrReplaceChild(
                "doorLight2", CubeListBuilder.create(), PartPose.offset(-10.1541F, -15.611F, -5.8625F));

        PartDefinition doorLight3 = doorControl.addOrReplaceChild(
                "doorLight3", CubeListBuilder.create(), PartPose.offset(-10.1541F, -15.611F, -5.8625F));

        PartDefinition doorLight4 = doorControl.addOrReplaceChild(
                "doorLight4", CubeListBuilder.create(), PartPose.offset(-10.1541F, -15.611F, -5.8625F));

        PartDefinition doorLight5 = doorControl.addOrReplaceChild(
                "doorLight5", CubeListBuilder.create(), PartPose.offset(-10.1541F, -15.611F, -5.8625F));

        PartDefinition doorLight6 = doorControl.addOrReplaceChild(
                "doorLight6", CubeListBuilder.create(), PartPose.offset(-10.1541F, -15.611F, -5.8625F));

        PartDefinition bone14 = doorControl.addOrReplaceChild(
                "bone14", CubeListBuilder.create(), PartPose.offset(-11.7357F, -16.1141F, -2.6753F));

        PartDefinition bone17 = bone14.addOrReplaceChild(
                "bone17", CubeListBuilder.create(), PartPose.offset(2.924F, -1.3859F, -3.6824F));

        PartDefinition cube_r102 = bone17.addOrReplaceChild(
                "cube_r102",
                CubeListBuilder.create()
                        .texOffs(154, 204)
                        .addBox(-1.0166F, -1.0583F, -0.12F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4024F, -0.3446F, -0.9F));

        PartDefinition cube_r103 = bone17.addOrReplaceChild(
                "cube_r103",
                CubeListBuilder.create()
                        .texOffs(167, 234)
                        .addBox(-0.0938F, -2.3275F, -2.9315F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-0.7657F, 2.1282F, 0.4534F, 0.4024F, -0.3446F, -0.9F));

        PartDefinition cube_r104 = bone17.addOrReplaceChild(
                "cube_r104",
                CubeListBuilder.create()
                        .texOffs(0, 407)
                        .addBox(-3.1225F, -1.2878F, -4.9469F, 4.0F, 4.0F, 6.0F, new CubeDeformation(-0.8F))
                        .texOffs(0, 397)
                        .addBox(-3.2725F, -1.2378F, -4.9469F, 4.0F, 4.0F, 6.0F, new CubeDeformation(-0.8F)),
                PartPose.offsetAndRotation(-0.5258F, 0.9556F, -2.1256F, 2.7392F, 0.3446F, 2.2416F));

        PartDefinition cube_r105 = bone17.addOrReplaceChild(
                "cube_r105",
                CubeListBuilder.create()
                        .texOffs(167, 234)
                        .addBox(-0.0938F, -2.3275F, -0.8815F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(167, 234)
                        .addBox(-0.0938F, -2.3275F, -0.9815F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(167, 234)
                        .addBox(-0.0938F, -2.3275F, -1.4815F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(167, 234)
                        .addBox(-0.0938F, -2.3275F, 0.8185F, 3.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-0.9032F, 2.1282F, 0.6915F, 0.4024F, -0.3446F, -0.9F));

        PartDefinition doorControlKnob = bone17.addOrReplaceChild(
                "doorControlKnob", CubeListBuilder.create(), PartPose.offset(-0.876F, 0.4188F, -0.3914F));

        PartDefinition cube_r106 = doorControlKnob.addOrReplaceChild(
                "cube_r106",
                CubeListBuilder.create()
                        .texOffs(100, 193)
                        .addBox(-0.2314F, -0.8878F, -0.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(0.0F, -0.25F, 0.0F, 0.4024F, -0.3446F, -0.9F));

        PartDefinition doorControlLever = bone17.addOrReplaceChild(
                "doorControlLever",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-2.2022F, 1.465F, 3.3189F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r107 = doorControlLever.addOrReplaceChild(
                "cube_r107",
                CubeListBuilder.create()
                        .texOffs(76, 183)
                        .addBox(-0.0319F, -0.5236F, -1.2993F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(202, 8)
                        .addBox(0.0111F, -0.5103F, -0.7123F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(0.0891F, -0.475F, -0.1663F, -0.0004F, -0.0218F, -1.533F));

        PartDefinition cube_r108 = doorControlLever.addOrReplaceChild(
                "cube_r108",
                CubeListBuilder.create()
                        .texOffs(168, 202)
                        .addBox(0.2056F, -0.6102F, -0.8623F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.2287F, -1.5224F, 0.0066F, -0.0004F, -0.0218F, -1.533F));

        PartDefinition panel1Misc = panel1.addOrReplaceChild(
                "panel1Misc",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-11.6047F, -14.07F, -6.7F, 0.0F, -0.5236F, 0.0F));

        PartDefinition panel1Tape = panel1Misc.addOrReplaceChild(
                "panel1Tape",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.0131F, -2.0052F, -0.8956F, 0.0F, 0.0F, -0.1309F));

        PartDefinition cube_r109 = panel1Tape.addOrReplaceChild(
                "cube_r109",
                CubeListBuilder.create()
                        .texOffs(198, 131)
                        .addBox(-1.6227F, -3.1582F, -5.799F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                        .texOffs(151, 63)
                        .addBox(-1.6047F, -2.4441F, -5.799F, 2.0F, 0.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(190, 61)
                        .addBox(-1.1407F, -4.3281F, -5.321F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
                        .texOffs(54, 188)
                        .addBox(-1.1407F, -4.5781F, 3.729F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.15F))
                        .texOffs(198, 127)
                        .addBox(-1.6227F, -3.1582F, 3.261F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(1.2631F, 1.6052F, 0.3956F, 0.0F, 0.0F, -0.3054F));

        PartDefinition panel2 = topPanels.addOrReplaceChild(
                "panel2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r110 = panel2.addOrReplaceChild(
                "cube_r110",
                CubeListBuilder.create()
                        .texOffs(38, 228)
                        .addBox(-10.945F, -3.1676F, -6.3335F, 22.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.7314F, -13.8866F, -5.8518F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition panel2panel = panel2.addOrReplaceChild(
                "panel2panel", CubeListBuilder.create(), PartPose.offset(-11.6974F, -13.6936F, -6.7265F));

        PartDefinition cube_r111 = panel2panel.addOrReplaceChild(
                "cube_r111",
                CubeListBuilder.create()
                        .texOffs(134, 155)
                        .addBox(-1.0452F, -0.9769F, -4.3566F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-3.0247F, -2.1582F, 3.4602F, 0.6584F, 1.3225F, 0.3768F));

        PartDefinition cube_r112 = panel2panel.addOrReplaceChild(
                "cube_r112",
                CubeListBuilder.create()
                        .texOffs(156, 155)
                        .addBox(1.8062F, -3.3026F, -4.5974F, 2.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.002F, 0.2405F, -1.5292F, 0.2072F, 0.7512F, -0.124F));

        PartDefinition cube_r113 = panel2panel.addOrReplaceChild(
                "cube_r113",
                CubeListBuilder.create()
                        .texOffs(122, 163)
                        .addBox(-3.239F, -3.3026F, 3.4096F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(1.5386F, -0.025F, -2.5064F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r114 = panel2panel.addOrReplaceChild(
                "cube_r114",
                CubeListBuilder.create()
                        .texOffs(178, 162)
                        .addBox(-4.239F, -3.3026F, 3.4096F, 5.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.0987F, -0.025F, -0.0124F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r115 = panel2panel.addOrReplaceChild(
                "cube_r115",
                CubeListBuilder.create()
                        .texOffs(148, 50)
                        .addBox(-5.239F, -3.3026F, -4.5904F, 10.0F, 1.0F, 9.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone26 = panel2panel.addOrReplaceChild(
                "bone26", CubeListBuilder.create(), PartPose.offset(-3.0117F, -2.1105F, 3.4677F));

        PartDefinition cube_r116 = bone26.addOrReplaceChild(
                "cube_r116",
                CubeListBuilder.create()
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.4717F, -0.8361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, -0.8361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, -0.6361F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, -0.5861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.0717F, -0.5861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, -0.3861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.4717F, 0.664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, 0.464F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, 0.664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, 0.214F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.2717F, 0.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, -0.0717F, 0.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(137, 161)
                        .addBox(-0.3975F, 0.6783F, -0.5861F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, 0.4283F, 0.414F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(139, 162)
                        .addBox(-0.3975F, 0.4283F, -0.5861F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-3.6532F, -0.5473F, -0.6264F, 0.6584F, 1.3225F, 0.3768F));

        PartDefinition bone27 = panel2panel.addOrReplaceChild(
                "bone27", CubeListBuilder.create(), PartPose.offset(-3.0117F, -2.1105F, 3.7177F));

        PartDefinition cube_r117 = bone27.addOrReplaceChild(
                "cube_r117",
                CubeListBuilder.create()
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.5252F, -1.1849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, -1.1849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, -0.9849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, -0.9349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.1252F, -0.9349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, -0.7349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.5252F, -0.0849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, -0.2849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, -0.0849F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, 0.2651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.3252F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, -0.1252F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(137, 161)
                        .addBox(-0.7803F, 0.6248F, -0.9349F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, 0.3748F, 0.0651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(139, 162)
                        .addBox(-0.7803F, 0.3748F, -0.9349F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(1.9426F, -0.5991F, -9.8844F, 2.9344F, -0.7512F, 3.0175F));

        PartDefinition bone51 = panel2panel.addOrReplaceChild(
                "bone51", CubeListBuilder.create(), PartPose.offset(0.25F, -0.25F, 0.25F));

        PartDefinition cube_r118 = bone51.addOrReplaceChild(
                "cube_r118",
                CubeListBuilder.create()
                        .texOffs(116, 173)
                        .addBox(-0.648F, -3.4361F, 1.3716F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(198, 139)
                        .addBox(1.702F, -3.5371F, 1.1046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(198, 139)
                        .addBox(-4.078F, -3.5371F, 1.1046F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(118, 152)
                        .addBox(-2.158F, -3.4361F, -0.2354F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(120, 159)
                        .addBox(-2.158F, -3.3361F, -0.2354F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
                        .texOffs(174, 172)
                        .addBox(-4.048F, -3.3361F, -4.4564F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r119 = bone51.addOrReplaceChild(
                "cube_r119",
                CubeListBuilder.create()
                        .texOffs(200, 150)
                        .addBox(-1.5F, -1.3686F, -0.6622F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(1.4416F, -2.6264F, -2.8651F, 0.7418F, 1.0472F, 0.0F));

        PartDefinition cube_r120 = bone51.addOrReplaceChild(
                "cube_r120",
                CubeListBuilder.create()
                        .texOffs(200, 150)
                        .addBox(-0.5F, -1.3686F, -0.6622F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-1.9484F, -2.6264F, 3.0066F, 0.7418F, 1.0472F, 0.0F));

        PartDefinition cube_r121 = bone51.addOrReplaceChild(
                "cube_r121",
                CubeListBuilder.create()
                        .texOffs(23, 176)
                        .addBox(-1.8932F, 14.8653F, -13.6419F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(23, 177)
                        .addBox(-2.6432F, 14.8653F, -13.6419F, 8.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(18, 170)
                        .addBox(-2.4932F, 14.7653F, -13.4919F, 8.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(3.0782F, -20.3835F, 3.5725F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition panel2panelMisc = bone51.addOrReplaceChild(
                "panel2panelMisc",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-1.1605F, -2.01F, -0.67F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r122 = panel2panelMisc.addOrReplaceChild(
                "cube_r122",
                CubeListBuilder.create()
                        .texOffs(44, 183)
                        .addBox(-2.0837F, -1.6823F, -3.7426F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(34, 183)
                        .addBox(-2.0837F, -1.6823F, -3.2066F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(24, 183)
                        .addBox(-2.0837F, -1.6823F, -2.6706F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(0, 183)
                        .addBox(-2.0837F, -1.6823F, -2.1346F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(54, 183)
                        .addBox(-2.0837F, -1.6823F, -1.5986F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(182, 181)
                        .addBox(-2.0837F, -1.6823F, -0.2586F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(120, 182)
                        .addBox(-2.0837F, -1.6823F, 0.2774F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(110, 182)
                        .addBox(-2.0837F, -1.6823F, 0.8134F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(172, 181)
                        .addBox(-2.0837F, -1.6823F, 1.3494F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(162, 181)
                        .addBox(-2.0837F, -1.6823F, 1.8854F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3142F));

        PartDefinition panel2panelLight11 = panel2panelMisc.addOrReplaceChild(
                "panel2panelLight11", CubeListBuilder.create(), PartPose.offset(3.015F, -0.938F, 4.422F));

        PartDefinition bone12 = panel2panelMisc.addOrReplaceChild(
                "bone12", CubeListBuilder.create(), PartPose.offset(-3.0674F, 1.4635F, 0.5345F));

        PartDefinition cube_r123 = bone12.addOrReplaceChild(
                "cube_r123",
                CubeListBuilder.create()
                        .texOffs(21, 235)
                        .addBox(-1.7682F, 2.1133F, -3.8325F, 3.0F, 2.0F, 9.0F, new CubeDeformation(-1.0F)),
                PartPose.offsetAndRotation(0.5408F, 1.6643F, 0.0F, 3.1416F, 0.0F, -0.3142F));

        PartDefinition panel3 = topPanels.addOrReplaceChild(
                "panel3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r124 = panel3.addOrReplaceChild(
                "cube_r124",
                CubeListBuilder.create()
                        .texOffs(221, 147)
                        .mirror()
                        .addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
                        .mirror(false),
                PartPose.offsetAndRotation(-5.1224F, -15.2988F, -8.3633F, -0.9128F, -0.2852F, 0.6047F));

        PartDefinition cube_r125 = panel3.addOrReplaceChild(
                "cube_r125",
                CubeListBuilder.create()
                        .texOffs(221, 147)
                        .mirror()
                        .addBox(-4.5F, -1.5F, -0.5F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(-8.3647F, -15.1998F, -11.7235F, -0.2277F, -0.9243F, -0.4694F));

        PartDefinition cube_r126 = panel3.addOrReplaceChild(
                "cube_r126",
                CubeListBuilder.create()
                        .texOffs(211, 143)
                        .mirror()
                        .addBox(-2.1363F, -0.9769F, -0.4365F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.01F))
                        .mirror(false),
                PartPose.offsetAndRotation(-7.899F, -16.2982F, -9.4506F, 2.8893F, 0.9243F, 2.6721F));

        PartDefinition cube_r127 = panel3.addOrReplaceChild(
                "cube_r127",
                CubeListBuilder.create()
                        .texOffs(221, 151)
                        .mirror()
                        .addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
                        .mirror(false),
                PartPose.offsetAndRotation(-10.0638F, -15.2988F, 0.1955F, 2.8553F, 0.5741F, -2.4344F));

        PartDefinition cube_r128 = panel3.addOrReplaceChild(
                "cube_r128",
                CubeListBuilder.create()
                        .texOffs(221, 147)
                        .addBox(-4.5F, -1.5F, -0.5F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-14.595F, -15.1998F, -0.9323F, 2.5104F, 0.0662F, 2.8649F));

        PartDefinition cube_r129 = panel3.addOrReplaceChild(
                "cube_r129",
                CubeListBuilder.create()
                        .texOffs(211, 143)
                        .addBox(-4.3637F, -1.9769F, -0.4365F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(-14.533F, -14.6632F, -1.6804F, 0.1513F, -0.0662F, -0.2766F));

        PartDefinition cube_r130 = panel3.addOrReplaceChild(
                "cube_r130",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-8.0F, -0.276F, -1.4169F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.1216F, -16.5403F, -1.3836F, 2.1555F, -1.0472F, 3.1416F));

        PartDefinition cube_r131 = panel3.addOrReplaceChild(
                "cube_r131",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-0.0412F, -0.2728F, -0.583F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.6563F, -17.3837F, -1.115F, 1.0991F, 0.9152F, 0.1354F));

        PartDefinition cube_r132 = panel3.addOrReplaceChild(
                "cube_r132",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-4.9589F, -0.2728F, -0.583F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.5536F, -17.3837F, -8.2211F, 0.7972F, 1.1667F, -0.2108F));

        PartDefinition cube_r133 = panel3.addOrReplaceChild(
                "cube_r133",
                CubeListBuilder.create()
                        .texOffs(40, 181)
                        .addBox(-6.945F, -3.1676F, -6.3334F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.351F, -16.4665F, -6.886F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r134 = panel3.addOrReplaceChild(
                "cube_r134",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-6.945F, -3.1676F, -6.3334F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9538F, -16.4665F, -4.1099F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r135 = panel3.addOrReplaceChild(
                "cube_r135",
                CubeListBuilder.create()
                        .texOffs(46, 226)
                        .addBox(-6.945F, -3.1676F, -6.3334F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.4885F, -13.8866F, -5.692F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r136 = panel3.addOrReplaceChild(
                "cube_r136",
                CubeListBuilder.create()
                        .texOffs(38, 222)
                        .addBox(-10.945F, -3.1676F, -6.3334F, 22.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.4882F, -13.8857F, -5.6919F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone16 = panel3.addOrReplaceChild(
                "bone16",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-11.6735F, -15.9602F, -6.8452F, -0.0524F, 0.0005F, 0.096F));

        PartDefinition cube_r137 = bone16.addOrReplaceChild(
                "cube_r137",
                CubeListBuilder.create()
                        .texOffs(138, 231)
                        .addBox(-3.9564F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-4.3064F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-4.6564F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-5.0064F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-5.3564F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-5.7064F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-6.0564F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(138, 231)
                        .addBox(-6.4064F, -1.33F, -4.4647F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(131, 218)
                        .addBox(-7.7564F, -2.23F, -4.5147F, 6.0F, 4.0F, 4.0F, new CubeDeformation(-1.5F))
                        .texOffs(105, 209)
                        .addBox(-7.2564F, -0.705F, -4.5647F, 14.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                        .texOffs(112, 255)
                        .addBox(-7.2564F, -0.63F, -4.5647F, 14.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1264F, 0.4606F, 0.0788F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone34 = bone16.addOrReplaceChild(
                "bone34", CubeListBuilder.create(), PartPose.offset(-1.2582F, -0.079F, -0.6015F));

        PartDefinition cube_r138 = bone34.addOrReplaceChild(
                "cube_r138",
                CubeListBuilder.create()
                        .texOffs(105, 250)
                        .addBox(-0.5761F, -1.4904F, -0.4055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(105, 250)
                        .addBox(-0.3761F, -1.4904F, -0.4055F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(-0.2325F, 0.3046F, 3.9938F, 0.2161F, 0.7939F, -0.1112F));

        PartDefinition cube_r139 = bone34.addOrReplaceChild(
                "cube_r139",
                CubeListBuilder.create()
                        .texOffs(105, 250)
                        .addBox(-4.7795F, -1.308F, -0.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(1.2306F, 0.2138F, 0.8223F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r140 = bone34.addOrReplaceChild(
                "cube_r140",
                CubeListBuilder.create()
                        .texOffs(105, 250)
                        .addBox(-4.5295F, -1.308F, -0.1259F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(96, 249)
                        .addBox(-5.3795F, -1.208F, -2.1259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(104, 257)
                        .addBox(-3.5795F, -1.008F, -1.8259F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(96, 249)
                        .addBox(-4.6795F, -1.208F, -2.1259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(104, 249)
                        .addBox(-4.4295F, -1.208F, -0.6259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(104, 249)
                        .addBox(-5.1295F, -1.208F, -0.6259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(2.2205F, -1.308F, -1.1259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(2.9205F, -1.308F, -1.1259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(1.5205F, -1.308F, -1.1259F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(0.9958F, -1.3829F, 0.3514F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(-3.0042F, -1.3829F, 0.3514F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)),
                PartPose.offsetAndRotation(1.2056F, 0.2138F, 0.8656F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone35 = bone34.addOrReplaceChild(
                "bone35", CubeListBuilder.create(), PartPose.offset(-0.9128F, 0.5432F, 0.4815F));

        PartDefinition cube_r141 = bone35.addOrReplaceChild(
                "cube_r141",
                CubeListBuilder.create()
                        .texOffs(102, 239)
                        .addBox(0.0337F, -1.3314F, -4.0215F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(-1.1663F, -1.3314F, -4.0215F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(-2.3663F, -1.3314F, -4.0215F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)),
                PartPose.offsetAndRotation(2.2184F, -0.3294F, 0.2841F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r142 = bone35.addOrReplaceChild(
                "cube_r142",
                CubeListBuilder.create()
                        .texOffs(113, 247)
                        .addBox(-0.5182F, -0.7731F, 0.4031F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.38F)),
                PartPose.offsetAndRotation(0.3776F, -1.1545F, 1.7048F, 1.5177F, 1.073F, -0.4095F));

        PartDefinition cube_r143 = bone35.addOrReplaceChild(
                "cube_r143",
                CubeListBuilder.create()
                        .texOffs(110, 247)
                        .addBox(-0.0656F, -0.5231F, 0.0216F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0531F, -0.8799F, 1.4335F, 1.8023F, 1.0588F, -0.085F));

        PartDefinition cube_r144 = bone35.addOrReplaceChild(
                "cube_r144",
                CubeListBuilder.create()
                        .texOffs(110, 247)
                        .addBox(0.0466F, -0.5231F, 0.0453F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0531F, -0.8799F, 1.4335F, 1.1218F, 1.013F, -0.8656F));

        PartDefinition cube_r145 = bone35.addOrReplaceChild(
                "cube_r145",
                CubeListBuilder.create()
                        .texOffs(87, 228)
                        .addBox(-2.7219F, -0.2965F, -0.8499F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.6516F, 0.5426F, -0.6852F, 2.6616F, 1.0472F, 0.0F));

        PartDefinition cube_r146 = bone35.addOrReplaceChild(
                "cube_r146",
                CubeListBuilder.create()
                        .texOffs(95, 233)
                        .addBox(-2.7219F, -0.7166F, -0.9969F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.9434F, -0.4104F, -0.5167F, 1.8762F, 1.0472F, 0.0F));

        PartDefinition cube_r147 = bone35.addOrReplaceChild(
                "cube_r147",
                CubeListBuilder.create()
                        .texOffs(95, 233)
                        .addBox(-2.7219F, -0.9097F, -1.3978F, 5.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(1.7333F, -0.846F, -0.0607F, 1.0908F, 1.0472F, 0.0F));

        PartDefinition bone31 = bone35.addOrReplaceChild(
                "bone31", CubeListBuilder.create(), PartPose.offset(13.9445F, 15.2459F, 6.6152F));

        PartDefinition bone28 = bone31.addOrReplaceChild(
                "bone28",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-12.9317F, -16.0391F, -7.1967F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone63 = bone28.addOrReplaceChild(
                "bone63", CubeListBuilder.create(), PartPose.offset(-0.3105F, 1.01F, -0.1724F));

        PartDefinition cube_r148 = bone63.addOrReplaceChild(
                "cube_r148",
                CubeListBuilder.create()
                        .texOffs(98, 239)
                        .addBox(-0.9534F, 0.219F, 2.6843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(96, 237)
                        .addBox(-0.9534F, 0.219F, 0.7343F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0681F, 1.5565F, -1.921F));

        PartDefinition bone29 = bone28.addOrReplaceChild(
                "bone29", CubeListBuilder.create(), PartPose.offset(-0.2828F, 0.3772F, -0.2882F));

        PartDefinition cube_r149 = bone29.addOrReplaceChild(
                "cube_r149",
                CubeListBuilder.create()
                        .texOffs(101, 245)
                        .addBox(-2.2034F, 0.219F, 2.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(97, 242)
                        .addBox(-2.2034F, 0.219F, 0.7343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
                        .texOffs(89, 244)
                        .addBox(-2.7034F, -0.281F, 1.1843F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.75F)),
                PartPose.offsetAndRotation(-0.0277F, 0.6328F, 0.0909F, -0.0681F, 1.5565F, -1.921F));

        PartDefinition bone30 = bone28.addOrReplaceChild(
                "bone30", CubeListBuilder.create(), PartPose.offset(-0.2828F, 0.6272F, -0.2133F));

        PartDefinition cube_r150 = bone30.addOrReplaceChild(
                "cube_r150",
                CubeListBuilder.create()
                        .texOffs(101, 245)
                        .addBox(0.2966F, 0.219F, 2.7843F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(89, 244)
                        .addBox(-0.2034F, -0.281F, 1.1843F, 2.0F, 2.0F, 3.0F, new CubeDeformation(-0.75F))
                        .texOffs(97, 242)
                        .addBox(0.2966F, 0.219F, 0.7343F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(-0.0277F, 0.3828F, 0.0909F, -0.0681F, 1.5565F, -1.921F));

        PartDefinition bone67 = bone34.addOrReplaceChild(
                "bone67", CubeListBuilder.create(), PartPose.offset(1.2056F, 0.2138F, 0.8656F));

        PartDefinition cube_r151 = bone67.addOrReplaceChild(
                "cube_r151",
                CubeListBuilder.create()
                        .texOffs(96, 253)
                        .addBox(-3.5795F, -1.108F, -1.5759F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(96, 257)
                        .addBox(-3.5795F, -1.608F, -1.5759F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F))
                        .texOffs(104, 253)
                        .addBox(-3.5795F, -1.158F, -1.5759F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone36 = bone16.addOrReplaceChild(
                "bone36", CubeListBuilder.create(), PartPose.offset(-0.0526F, 0.1348F, 0.2641F));

        PartDefinition cube_r152 = bone36.addOrReplaceChild(
                "cube_r152",
                CubeListBuilder.create()
                        .texOffs(116, 241)
                        .addBox(2.2189F, -1.1549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(112, 241)
                        .addBox(2.2189F, -0.7549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(116, 241)
                        .addBox(0.7689F, -1.1549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(112, 241)
                        .addBox(0.7689F, -0.7549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(116, 241)
                        .addBox(-0.5811F, -1.1549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(112, 241)
                        .addBox(-0.5811F, -0.7549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(116, 241)
                        .addBox(-1.9311F, -1.1549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(112, 241)
                        .addBox(-1.9311F, -0.7549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(116, 241)
                        .addBox(-3.2811F, -1.1549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                        .texOffs(112, 241)
                        .addBox(-3.2811F, -0.7549F, 1.7126F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition panel4 = topPanels.addOrReplaceChild(
                "panel4", CubeListBuilder.create(), PartPose.offset(0.2607F, -1.5281F, 0.6622F));

        PartDefinition cube_r153 = panel4.addOrReplaceChild(
                "cube_r153",
                CubeListBuilder.create()
                        .texOffs(38, 228)
                        .addBox(-10.945F, -3.3016F, -6.3334F, 22.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.4545F, -12.2307F, -6.4645F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r154 = panel4.addOrReplaceChild(
                "cube_r154",
                CubeListBuilder.create()
                        .texOffs(32, 155)
                        .addBox(-8.625F, -3.0956F, -2.2434F, 17.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.4881F, -12.0237F, -6.4839F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition panel4Lights = panel4.addOrReplaceChild(
                "panel4Lights", CubeListBuilder.create(), PartPose.offset(-17.7721F, -12.6431F, -4.5001F));

        PartDefinition panel4Light1 = panel4Lights.addOrReplaceChild(
                "panel4Light1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r155 = panel4Light1.addOrReplaceChild(
                "cube_r155",
                CubeListBuilder.create()
                        .texOffs(75, 177)
                        .addBox(-2.075F, -2.4323F, -0.8798F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 1.0472F, 0.0F));

        PartDefinition panel4Light2 = panel4Lights.addOrReplaceChild(
                "panel4Light2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r156 = panel4Light2.addOrReplaceChild(
                "cube_r156",
                CubeListBuilder.create()
                        .texOffs(117, 177)
                        .addBox(11.665F, -2.4323F, -0.8798F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 1.0472F, 0.0F));

        PartDefinition panel4Controls = panel4.addOrReplaceChild(
                "panel4Controls", CubeListBuilder.create(), PartPose.offset(-10.4881F, -12.0237F, -6.4839F));

        PartDefinition cube_r157 = panel4Controls.addOrReplaceChild(
                "cube_r157",
                CubeListBuilder.create()
                        .texOffs(68, 161)
                        .addBox(-1.815F, -2.835F, -5.845F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
                        .texOffs(52, 161)
                        .addBox(-1.815F, -2.935F, -5.845F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
                        .texOffs(52, 161)
                        .addBox(-1.815F, -2.935F, 2.005F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F))
                        .texOffs(68, 161)
                        .addBox(-1.815F, -2.835F, 2.005F, 4.0F, 2.0F, 4.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition panel4wire = panel4Controls.addOrReplaceChild(
                "panel4wire", CubeListBuilder.create(), PartPose.offset(2.1651F, -7.75F, 1.25F));

        PartDefinition cube_r158 = panel4wire.addOrReplaceChild(
                "cube_r158",
                CubeListBuilder.create()
                        .texOffs(152, 145)
                        .mirror()
                        .addBox(1.958F, -1.835F, -4.84F, 4.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F))
                        .mirror(false),
                PartPose.offsetAndRotation(-1.9053F, 7.75F, -1.1F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r159 = panel4wire.addOrReplaceChild(
                "cube_r159",
                CubeListBuilder.create()
                        .texOffs(144, 145)
                        .mirror()
                        .addBox(-2.042F, -2.585F, -4.34F, 4.0F, 1.0F, 9.0F, new CubeDeformation(-0.1F))
                        .mirror(false),
                PartPose.offsetAndRotation(-1.732F, 7.75F, -1.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition panel4PumpThings = panel4Controls.addOrReplaceChild(
                "panel4PumpThings", CubeListBuilder.create(), PartPose.offset(-0.433F, 0.0F, -0.25F));

        PartDefinition panel4PumpThing1 = panel4PumpThings.addOrReplaceChild(
                "panel4PumpThing1",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-4.4178F, -2.9366F, 2.3853F, -0.0653F, 0.0037F, 0.1133F));

        PartDefinition cube_r160 = panel4PumpThing1.addOrReplaceChild(
                "cube_r160",
                CubeListBuilder.create()
                        .texOffs(126, 202)
                        .addBox(-0.8901F, -2.3739F, -0.67F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.346F, 1.0499F, 0.3977F, -0.1243F, -0.51F, 0.2506F));

        PartDefinition cube_r161 = panel4PumpThing1.addOrReplaceChild(
                "cube_r161",
                CubeListBuilder.create()
                        .texOffs(202, 52)
                        .addBox(-1.4756F, -9.713F, -1.8509F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(4.5102F, 0.229F, -8.0292F, -1.6951F, -0.51F, 0.2506F));

        PartDefinition cube_r162 = panel4PumpThing1.addOrReplaceChild(
                "cube_r162",
                CubeListBuilder.create()
                        .texOffs(200, 171)
                        .addBox(-1.2961F, -1.9979F, 8.694F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(209, 171)
                        .addBox(-1.5461F, -1.9979F, 8.694F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(208, 171)
                        .addBox(-1.0461F, -1.9979F, 8.694F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(5.036F, 1.0499F, -7.7256F, -0.1243F, -0.51F, 0.2506F));

        PartDefinition panel4PumpThing2 = panel4PumpThings.addOrReplaceChild(
                "panel4PumpThing2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0813F, -3.0599F, -4.3598F, -0.0653F, 0.0037F, 0.1133F));

        PartDefinition cube_r163 = panel4PumpThing2.addOrReplaceChild(
                "cube_r163",
                CubeListBuilder.create()
                        .texOffs(209, 171)
                        .addBox(-1.5461F, -1.9979F, 0.444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(200, 171)
                        .addBox(-1.2961F, -1.9979F, 0.444F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(208, 171)
                        .addBox(-1.0461F, -1.9979F, 0.444F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(0.5547F, 1.2405F, -0.9702F, -0.1243F, -0.51F, 0.2506F));

        PartDefinition cube_r164 = panel4PumpThing2.addOrReplaceChild(
                "cube_r164",
                CubeListBuilder.create()
                        .texOffs(202, 52)
                        .addBox(-1.4756F, -1.463F, -1.8509F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(0.0289F, 0.4196F, -1.2738F, -1.6951F, -0.51F, 0.2506F));

        PartDefinition cube_r165 = panel4PumpThing2.addOrReplaceChild(
                "cube_r165",
                CubeListBuilder.create()
                        .texOffs(126, 202)
                        .addBox(-0.8901F, -2.3739F, -8.92F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.1353F, 1.2405F, 7.1531F, -0.1243F, -0.51F, 0.2506F));

        PartDefinition coffeepot = panel4Controls.addOrReplaceChild(
                "coffeepot", CubeListBuilder.create(), PartPose.offset(1.374F, -7.75F, 0.6201F));

        PartDefinition cube_r166 = coffeepot.addOrReplaceChild(
                "cube_r166",
                CubeListBuilder.create()
                        .texOffs(40, 170)
                        .addBox(-2.039F, -3.6579F, -3.801F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7617F, 6.9079F, 1.2719F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r167 = coffeepot.addOrReplaceChild(
                "cube_r167",
                CubeListBuilder.create()
                        .texOffs(86, 254)
                        .addBox(-0.7197F, -3.0F, -0.8232F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.501F)),
                PartPose.offsetAndRotation(1.626F, 5.5F, 0.4407F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r168 = coffeepot.addOrReplaceChild(
                "cube_r168",
                CubeListBuilder.create()
                        .texOffs(76, 254)
                        .addBox(-0.7197F, -3.0F, -2.1768F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(1.626F, 5.5F, 0.4407F, 0.0F, 0.2618F, 0.0F));

        PartDefinition cube_r169 = coffeepot.addOrReplaceChild(
                "cube_r169",
                CubeListBuilder.create()
                        .texOffs(86, 254)
                        .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.501F)),
                PartPose.offsetAndRotation(0.8297F, 5.5F, -1.4479F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r170 = coffeepot.addOrReplaceChild(
                "cube_r170",
                CubeListBuilder.create()
                        .texOffs(76, 254)
                        .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(-0.6228F, 5.5F, -1.6391F, -3.1416F, 1.309F, 3.1416F));

        PartDefinition cube_r171 = coffeepot.addOrReplaceChild(
                "cube_r171",
                CubeListBuilder.create()
                        .texOffs(86, 254)
                        .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.501F)),
                PartPose.offsetAndRotation(-1.7851F, 5.5F, -0.7473F, -3.1416F, 0.5236F, 3.1416F));

        PartDefinition cube_r172 = coffeepot.addOrReplaceChild(
                "cube_r172",
                CubeListBuilder.create()
                        .texOffs(76, 254)
                        .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(0.3681F, 5.5F, 2.0588F, 0.0F, -1.309F, 0.0F));

        PartDefinition cube_r173 = coffeepot.addOrReplaceChild(
                "cube_r173",
                CubeListBuilder.create()
                        .texOffs(76, 254)
                        .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(-1.9764F, 5.5F, 0.7053F, -3.1416F, -0.2618F, 3.1416F));

        PartDefinition cube_r174 = coffeepot.addOrReplaceChild(
                "cube_r174",
                CubeListBuilder.create()
                        .texOffs(86, 254)
                        .addBox(-1.0F, -3.0F, -1.5F, 2.0F, 5.0F, 3.0F, new CubeDeformation(-0.501F)),
                PartPose.offsetAndRotation(-1.0845F, 5.5F, 1.8676F, -3.1416F, -1.0472F, 3.1416F));

        PartDefinition bone33 =
                panel4Controls.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r175 = bone33.addOrReplaceChild(
                "cube_r175",
                CubeListBuilder.create()
                        .texOffs(115, 165)
                        .addBox(-2.985F, -3.9696F, -5.6634F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
                        .texOffs(100, 164)
                        .addBox(-2.985F, -4.0696F, -5.6634F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
                        .texOffs(100, 160)
                        .addBox(-2.985F, -3.9196F, -5.6634F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F))
                        .texOffs(85, 165)
                        .addBox(-2.985F, -3.8196F, -5.6634F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition panel5 = topPanels.addOrReplaceChild(
                "panel5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r176 = panel5.addOrReplaceChild(
                "cube_r176",
                CubeListBuilder.create()
                        .texOffs(221, 151)
                        .mirror()
                        .addBox(-2.5F, -1.5F, -0.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F))
                        .mirror(false),
                PartPose.offsetAndRotation(-4.8456F, -15.2988F, -8.7839F, -0.9128F, -0.2852F, 0.6047F));

        PartDefinition cube_r177 = panel5.addOrReplaceChild(
                "cube_r177",
                CubeListBuilder.create()
                        .texOffs(221, 147)
                        .mirror()
                        .addBox(-4.5F, -1.5F, -0.5F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(-8.0879F, -15.1998F, -12.1441F, -0.2277F, -0.9243F, -0.4694F));

        PartDefinition cube_r178 = panel5.addOrReplaceChild(
                "cube_r178",
                CubeListBuilder.create()
                        .texOffs(211, 143)
                        .mirror()
                        .addBox(-2.1363F, -0.9769F, -0.4365F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(-7.6222F, -16.2982F, -9.8713F, 2.8893F, 0.9243F, 2.6721F));

        PartDefinition cube_r179 = panel5.addOrReplaceChild(
                "cube_r179",
                CubeListBuilder.create()
                        .texOffs(215, 151)
                        .addBox(-4.7728F, -1.8148F, -0.2234F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(-8.5103F, -13.7077F, 0.861F, 0.2863F, -0.5741F, 0.7072F));

        PartDefinition cube_r180 = panel5.addOrReplaceChild(
                "cube_r180",
                CubeListBuilder.create()
                        .texOffs(211, 147)
                        .addBox(-4.3637F, -1.8936F, -0.2234F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-14.3182F, -14.6998F, -1.3529F, 0.6312F, -0.0662F, -0.2766F));

        PartDefinition cube_r181 = panel5.addOrReplaceChild(
                "cube_r181",
                CubeListBuilder.create()
                        .texOffs(211, 143)
                        .addBox(-4.3637F, -1.9769F, -0.4365F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-14.2562F, -14.6632F, -2.1011F, 0.1513F, -0.0662F, -0.2766F));

        PartDefinition cube_r182 = panel5.addOrReplaceChild(
                "cube_r182",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-8.0F, -0.276F, -1.4169F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.8448F, -16.5403F, -1.8043F, 2.1555F, -1.0472F, 3.1416F));

        PartDefinition cube_r183 = panel5.addOrReplaceChild(
                "cube_r183",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-0.0411F, -0.2728F, -0.583F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.3795F, -17.3837F, -1.5356F, 1.0991F, 0.9152F, 0.1354F));

        PartDefinition cube_r184 = panel5.addOrReplaceChild(
                "cube_r184",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-4.9589F, -0.2728F, -0.583F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.2768F, -17.3837F, -8.6418F, 0.7972F, 1.1667F, -0.2108F));

        PartDefinition cube_r185 = panel5.addOrReplaceChild(
                "cube_r185",
                CubeListBuilder.create()
                        .texOffs(40, 181)
                        .addBox(-6.945F, -3.1676F, -6.3335F, 5.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(-0.0743F, -16.4665F, -7.3066F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r186 = panel5.addOrReplaceChild(
                "cube_r186",
                CubeListBuilder.create()
                        .texOffs(210, 177)
                        .addBox(-6.945F, -3.1676F, -6.3334F, 4.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(-1.677F, -16.4665F, -4.5306F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r187 = panel5.addOrReplaceChild(
                "cube_r187",
                CubeListBuilder.create()
                        .texOffs(46, 226)
                        .addBox(-6.945F, -3.1676F, -6.3334F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.2117F, -13.8866F, -6.1127F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r188 = panel5.addOrReplaceChild(
                "cube_r188",
                CubeListBuilder.create()
                        .texOffs(38, 222)
                        .addBox(-10.945F, -3.1676F, -6.3334F, 22.0F, 0.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-10.2115F, -13.8857F, -6.1125F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone50 = panel5.addOrReplaceChild(
                "bone50",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-11.6735F, -15.9602F, -6.8452F, -0.0524F, 0.0005F, 0.096F));

        PartDefinition cube_r189 = bone50.addOrReplaceChild(
                "cube_r189",
                CubeListBuilder.create()
                        .texOffs(219, 178)
                        .addBox(-8.0814F, -1.93F, -4.4897F, 15.0F, 2.0F, 9.0F, new CubeDeformation(-1.0F))
                        .texOffs(206, 189)
                        .addBox(-8.0814F, -1.83F, -4.6147F, 15.0F, 2.0F, 9.0F, new CubeDeformation(-0.75F))
                        .texOffs(203, 200)
                        .addBox(-7.3564F, -0.88F, -4.5647F, 14.0F, 0.0F, 8.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 224)
                        .addBox(-7.3564F, -0.63F, -4.5647F, 14.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.4021F, 0.4562F, -0.3425F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition doodads = bone50.addOrReplaceChild(
                "doodads", CubeListBuilder.create(), PartPose.offset(0.4021F, 0.4562F, -0.3425F));

        PartDefinition cube_r190 = doodads.addOrReplaceChild(
                "cube_r190",
                CubeListBuilder.create()
                        .texOffs(102, 239)
                        .addBox(3.7337F, -1.4814F, -4.6965F, 2.0F, 1.6247F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(4.2337F, -1.4814F, -3.8465F, 2.0F, 1.6247F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(-5.6663F, -1.4814F, -3.8465F, 2.0F, 1.6247F, 2.0F, new CubeDeformation(-0.7F))
                        .texOffs(102, 239)
                        .addBox(-5.2663F, -1.4814F, -4.6965F, 2.0F, 1.6247F, 2.0F, new CubeDeformation(-0.7F)),
                PartPose.offsetAndRotation(-0.3547F, -0.3213F, 0.5067F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition bone7 = doodads.addOrReplaceChild(
                "bone7", CubeListBuilder.create(), PartPose.offset(-4.0406F, -0.2887F, 3.3984F));

        PartDefinition cube_r191 = bone7.addOrReplaceChild(
                "cube_r191",
                CubeListBuilder.create()
                        .texOffs(104, 249)
                        .addBox(-1.0935F, -1.0346F, -0.9022F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(106, 250)
                        .addBox(-0.3435F, -0.8846F, -0.4022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(106, 250)
                        .addBox(-0.5435F, -0.8846F, -0.4022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(106, 250)
                        .addBox(-0.7435F, -0.8846F, -0.4022F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0976F, -0.0077F, -0.0565F, 0.1719F, -0.4971F, -0.3492F));

        PartDefinition bone8 = doodads.addOrReplaceChild(
                "bone8", CubeListBuilder.create(), PartPose.offset(-4.4423F, -0.0205F, 2.3928F));

        PartDefinition cube_r192 = bone8.addOrReplaceChild(
                "cube_r192",
                CubeListBuilder.create()
                        .texOffs(104, 249)
                        .addBox(-1.0501F, -1.0478F, -1.1405F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F))
                        .texOffs(106, 250)
                        .addBox(-0.7001F, -0.6978F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(106, 250)
                        .addBox(-0.5001F, -0.6978F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(106, 250)
                        .addBox(-0.3001F, -0.6978F, -0.6405F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(0.0502F, -0.0109F, 0.1334F, 0.157F, 0.2788F, -0.223F));

        PartDefinition bone20 = doodads.addOrReplaceChild(
                "bone20", CubeListBuilder.create(), PartPose.offset(-5.2482F, 0.3329F, 1.5473F));

        PartDefinition cube_r193 = bone20.addOrReplaceChild(
                "cube_r193",
                CubeListBuilder.create()
                        .texOffs(114, 253)
                        .addBox(-0.3F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(114, 253)
                        .addBox(-0.5F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(112, 254)
                        .addBox(-0.7F, -0.6F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(4.6082F, -0.0711F, -8.0294F, 0.9562F, -1.3857F, -1.2146F));

        PartDefinition bone19 = doodads.addOrReplaceChild(
                "bone19", CubeListBuilder.create(), PartPose.offset(-5.2482F, 0.3329F, 1.5473F));

        PartDefinition cube_r194 = bone19.addOrReplaceChild(
                "cube_r194",
                CubeListBuilder.create()
                        .texOffs(114, 253)
                        .addBox(-0.3F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(114, 253)
                        .addBox(-0.5F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(112, 254)
                        .addBox(-0.7F, -0.35F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(-1.0819F, -0.3095F, 1.6758F, 0.1759F, 0.537F, -0.1759F));

        PartDefinition bone9 = doodads.addOrReplaceChild(
                "bone9", CubeListBuilder.create(), PartPose.offset(-5.2482F, 0.3329F, 1.5473F));

        PartDefinition cube_r195 = bone9.addOrReplaceChild(
                "cube_r195",
                CubeListBuilder.create()
                        .texOffs(104, 249)
                        .addBox(-1.0185F, -1.0346F, -1.5023F, 2.0F, 1.737F, 2.0F, new CubeDeformation(-0.8F)),
                PartPose.offsetAndRotation(0.4078F, -0.1419F, 0.2574F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition cube_r196 = bone9.addOrReplaceChild(
                "cube_r196",
                CubeListBuilder.create()
                        .texOffs(106, 250)
                        .addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(-0.1914F, -0.3576F, 0.106F, -2.8362F, 1.0472F, 0.0F));

        PartDefinition cube_r197 = bone9.addOrReplaceChild(
                "cube_r197",
                CubeListBuilder.create()
                        .texOffs(106, 250)
                        .addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(-0.0914F, -0.3576F, -0.0672F, -2.8362F, 1.0472F, 0.0F));

        PartDefinition cube_r198 = bone9.addOrReplaceChild(
                "cube_r198",
                CubeListBuilder.create()
                        .texOffs(106, 250)
                        .addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(0.0086F, -0.3576F, -0.2404F, -2.8362F, 1.0472F, 0.0F));

        PartDefinition bone11 = doodads.addOrReplaceChild(
                "bone11", CubeListBuilder.create(), PartPose.offset(-4.8404F, 0.191F, 1.8046F));

        PartDefinition cube_r199 = bone11.addOrReplaceChild(
                "cube_r199",
                CubeListBuilder.create()
                        .texOffs(106, 250)
                        .addBox(-0.2251F, -0.6978F, -0.4905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(106, 250)
                        .addBox(-0.4251F, -0.6978F, -0.4905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(106, 250)
                        .addBox(-0.6251F, -0.6978F, -0.4905F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.4F))
                        .texOffs(104, 249)
                        .addBox(-0.9751F, -1.0478F, -0.9905F, 2.0F, 1.8034F, 2.0F, new CubeDeformation(-0.8F)),
                PartPose.offsetAndRotation(3.2216F, 0.1665F, -6.5481F, 2.8362F, -1.0472F, 3.1416F));

        PartDefinition bone18 = doodads.addOrReplaceChild(
                "bone18", CubeListBuilder.create(), PartPose.offset(-0.3775F, -0.0523F, -4.4456F));

        PartDefinition cube_r200 = bone18.addOrReplaceChild(
                "cube_r200",
                CubeListBuilder.create()
                        .texOffs(106, 250)
                        .addBox(0.5514F, -0.9027F, -1.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(106, 250)
                        .addBox(0.3514F, -0.9027F, -1.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(106, 250)
                        .addBox(0.1514F, -0.9027F, -1.0102F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(104, 249)
                        .addBox(-0.1499F, -1.0479F, -1.5095F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)),
                PartPose.offsetAndRotation(-0.0081F, 0.0247F, 0.0096F, 0.1719F, -0.4971F, -0.3492F));

        PartDefinition bone13 = doodads.addOrReplaceChild(
                "bone13", CubeListBuilder.create(), PartPose.offset(-0.3775F, -0.0523F, -4.4456F));

        PartDefinition cube_r201 = bone13.addOrReplaceChild(
                "cube_r201",
                CubeListBuilder.create()
                        .texOffs(106, 250)
                        .addBox(-0.3348F, -0.9027F, -0.4756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(106, 250)
                        .addBox(-0.5348F, -0.9027F, -0.4756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(106, 250)
                        .addBox(-0.7348F, -0.9027F, -0.4756F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.6F))
                        .texOffs(104, 249)
                        .addBox(-1.0499F, -1.0479F, -1.0095F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.8F)),
                PartPose.offsetAndRotation(-0.0081F, 0.0247F, 0.0096F, 0.5001F, -1.2518F, -0.7451F));

        PartDefinition bone66 =
                doodads.addOrReplaceChild("bone66", CubeListBuilder.create(), PartPose.offset(-4.75F, -0.5F, 1.25F));

        PartDefinition cube_r202 = bone66.addOrReplaceChild(
                "cube_r202",
                CubeListBuilder.create()
                        .texOffs(156, 510)
                        .addBox(1.875F, 0.15F, -8.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(156, 510)
                        .addBox(1.875F, 0.15F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(156, 510)
                        .addBox(1.45F, 0.15F, -7.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(156, 510)
                        .addBox(1.45F, 0.15F, 0.55F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(-1.15F, 0.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(0.9F, 0.15F, 0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(0.25F, 0.15F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(-0.4F, 0.15F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(0.9F, 0.15F, -7.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(0.25F, 0.15F, -6.95F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(-0.4F, 0.15F, -6.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                        .texOffs(152, 510)
                        .addBox(-1.15F, 0.15F, -6.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1719F, -0.4971F, -0.3492F));

        PartDefinition bone68 = doodads.addOrReplaceChild(
                "bone68", CubeListBuilder.create(), PartPose.offset(-0.4547F, -0.3213F, 0.6067F));

        PartDefinition cube_r203 = bone68.addOrReplaceChild(
                "cube_r203",
                CubeListBuilder.create()
                        .texOffs(96, 257)
                        .addBox(2.1705F, -1.958F, 1.1741F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F))
                        .texOffs(104, 253)
                        .addBox(2.1705F, -1.508F, 1.1741F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(96, 253)
                        .addBox(2.1705F, -1.458F, 1.1741F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(96, 253)
                        .addBox(-3.3295F, -1.458F, 1.1741F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(96, 257)
                        .addBox(-3.3295F, -1.958F, 1.1741F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.85F))
                        .texOffs(104, 253)
                        .addBox(-3.3295F, -1.508F, 1.1741F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3054F, 1.0472F, 0.0F));

        PartDefinition panel6 = topPanels.addOrReplaceChild(
                "panel6",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(13.4647F, 2.9752F, -22.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(95, 44)
                        .addBox(13.4653F, 0.6992F, -22.2553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(12.065F, -15.8293F, -7.2936F, 0.0F, -2.618F, 0.0F));

        PartDefinition cube_r204 = panel6.addOrReplaceChild(
                "cube_r204",
                CubeListBuilder.create()
                        .texOffs(0, 153)
                        .addBox(-7.4265F, 0.7579F, 0.6668F, 18.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(46, 212)
                        .addBox(-4.1237F, -0.2683F, -0.3064F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8535F, 0.0878F, 0.0825F, 0.0F, 1.5708F, -0.3054F));

        PartDefinition cube_r205 = panel6.addOrReplaceChild(
                "cube_r205",
                CubeListBuilder.create()
                        .texOffs(34, 215)
                        .addBox(-6.3162F, -0.2683F, -5.7808F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(-1.8535F, 0.0878F, -1.6675F, 3.1416F, 1.1781F, 2.8362F));

        PartDefinition cube_r206 = panel6.addOrReplaceChild(
                "cube_r206",
                CubeListBuilder.create()
                        .texOffs(39, 215)
                        .addBox(-10.3737F, -5.5183F, -3.3064F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2748F, 5.0948F, 0.0825F, 0.0F, 1.5708F, -0.3054F));

        PartDefinition cube_r207 = panel6.addOrReplaceChild(
                "cube_r207",
                CubeListBuilder.create()
                        .texOffs(66, 217)
                        .addBox(-7.1237F, 0.0219F, -3.3172F, 16.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8535F, 0.0878F, 0.0825F, 0.0F, 1.5708F, -0.2182F));

        PartDefinition cube_r208 = panel6.addOrReplaceChild(
                "cube_r208",
                CubeListBuilder.create()
                        .texOffs(39, 207)
                        .addBox(1.25F, -1.0269F, -3.0997F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(2.5292F, -0.289F, -6.3438F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition cube_r209 = panel6.addOrReplaceChild(
                "cube_r209",
                CubeListBuilder.create()
                        .texOffs(25, 221)
                        .addBox(6.9353F, -0.2683F, -6.4515F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(-1.8535F, 0.0878F, 1.8325F, 0.0F, 1.1781F, -0.3054F));

        PartDefinition cube_r210 = panel6.addOrReplaceChild(
                "cube_r210",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.5265F, 1.2262F, -2.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.1161F, -0.577F, 9.287F, -3.1416F, 1.0472F, -3.1416F));

        PartDefinition cube_r211 = panel6.addOrReplaceChild(
                "cube_r211",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.3798F, 0.0968F, 8.3151F, -0.2618F, -1.0472F, 0.0F));

        PartDefinition cube_r212 = panel6.addOrReplaceChild(
                "cube_r212",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5265F, 0.6658F, -2.2526F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.1161F, -0.577F, 9.287F, -2.8798F, 1.0472F, 3.1416F));

        PartDefinition cube_r213 = panel6.addOrReplaceChild(
                "cube_r213",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.5265F, 0.8262F, -2.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9382F, -0.127F, 19.1642F, -3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r214 = panel6.addOrReplaceChild(
                "cube_r214",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9647F, 0.1468F, 17.1746F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r215 = panel6.addOrReplaceChild(
                "cube_r215",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5265F, 0.2795F, -2.1491F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9382F, -0.127F, 19.1642F, -2.8798F, 0.0F, 3.1416F));

        PartDefinition cube_r216 = panel6.addOrReplaceChild(
                "cube_r216",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.5265F, 0.3762F, -2.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(31.0192F, 0.273F, 9.3334F, -3.1416F, -1.0472F, -3.1416F));

        PartDefinition cube_r217 = panel6.addOrReplaceChild(
                "cube_r217",
                CubeListBuilder.create()
                        .texOffs(93, 37)
                        .mirror()
                        .addBox(-0.5265F, -0.1552F, 0.4674F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(93, 42)
                        .addBox(-0.5265F, -0.1552F, -2.0326F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(31.0192F, 0.273F, 9.3334F, -2.8798F, -1.0472F, 3.1416F));

        PartDefinition cube_r218 = panel6.addOrReplaceChild(
                "cube_r218",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.5265F, -0.0239F, -2.0035F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(31.046F, 0.723F, -10.3746F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r219 = panel6.addOrReplaceChild(
                "cube_r219",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(29.3097F, 0.1469F, -9.4027F, 2.8798F, 1.0472F, -3.1416F));

        PartDefinition cube_r220 = panel6.addOrReplaceChild(
                "cube_r220",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5265F, -0.5416F, -1.9291F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(31.046F, 0.723F, -10.3746F, 0.2618F, -1.0472F, 0.0F));

        PartDefinition cube_r221 = panel6.addOrReplaceChild(
                "cube_r221",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(13.9653F, 0.1468F, -18.2622F, 2.8798F, 0.0F, 3.1416F));

        PartDefinition cube_r222 = panel6.addOrReplaceChild(
                "cube_r222",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5265F, -0.9762F, -1.8126F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9917F, 1.173F, -20.2518F, 0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r223 = panel6.addOrReplaceChild(
                "cube_r223",
                CubeListBuilder.create()
                        .texOffs(90, 39)
                        .addBox(-0.4735F, -1.7068F, -0.4157F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 42)
                        .addBox(-0.4735F, -1.7068F, -3.1657F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.3699F, 5.552F, 8.9174F, 2.8536F, 1.0472F, -3.1416F));

        PartDefinition cube_r224 = panel6.addOrReplaceChild(
                "cube_r224",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.4735F, -2.5768F, -2.8346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.3699F, 5.552F, 8.9174F, 3.1416F, 1.0472F, -3.1416F));

        PartDefinition cube_r225 = panel6.addOrReplaceChild(
                "cube_r225",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.4735F, -2.3268F, -2.8346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9911F, 5.302F, 18.3332F, 3.1416F, 0.0F, -3.1416F));

        PartDefinition cube_r226 = panel6.addOrReplaceChild(
                "cube_r226",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.4735F, -1.7444F, -3.0947F, 1.0F, 1.2773F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(90, 39)
                        .addBox(-0.4735F, -3.4671F, -0.3447F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9911F, 5.302F, 18.3332F, 2.8536F, 0.0F, -3.1416F));

        PartDefinition cube_r227 = panel6.addOrReplaceChild(
                "cube_r227",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.4735F, -2.0768F, -2.8346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(30.326F, 5.052F, 8.872F, 3.1416F, -1.0472F, -3.1416F));

        PartDefinition cube_r228 = panel6.addOrReplaceChild(
                "cube_r228",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.4735F, -1.5047F, -3.0237F, 1.0F, 1.2773F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(90, 39)
                        .addBox(-0.4735F, -3.2274F, -0.2737F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(30.326F, 5.052F, 8.872F, 2.8536F, -1.0472F, -3.1416F));

        PartDefinition cube_r229 = panel6.addOrReplaceChild(
                "cube_r229",
                CubeListBuilder.create()
                        .texOffs(90, 39)
                        .addBox(-0.4735F, -0.9877F, -0.2027F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 42)
                        .addBox(-0.4735F, -0.9877F, -2.9527F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(30.2998F, 4.802F, -10.0049F, -0.288F, -1.0472F, 0.0F));

        PartDefinition cube_r230 = panel6.addOrReplaceChild(
                "cube_r230",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.4735F, -1.8268F, -2.8346F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(30.2998F, 4.802F, -10.0049F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r231 = panel6.addOrReplaceChild(
                "cube_r231",
                CubeListBuilder.create()
                        .texOffs(90, 39)
                        .addBox(-0.4735F, -0.748F, -0.1317F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 42)
                        .addBox(-0.4735F, -0.748F, -2.8817F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.9382F, 4.552F, -19.4207F, -0.288F, 0.0F, 0.0F));

        PartDefinition cube_r232 = panel6.addOrReplaceChild(
                "cube_r232",
                CubeListBuilder.create()
                        .texOffs(95, 44)
                        .addBox(-0.5F, -27.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(95, 44)
                        .addBox(-0.5F, -29.2602F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5386F, 29.9594F, -10.6498F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r233 = panel6.addOrReplaceChild(
                "cube_r233",
                CubeListBuilder.create()
                        .texOffs(90, 39)
                        .addBox(-0.5F, -0.5F, -0.875F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 42)
                        .addBox(-0.5F, -0.5F, -3.625F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.7045F, 4.5095F, -9.5909F, -0.288F, 1.0472F, 0.0F));

        PartDefinition cube_r234 = panel6.addOrReplaceChild(
                "cube_r234",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(-1.3795F, 0.1468F, -9.4032F, 2.8798F, -1.0472F, -3.1416F));

        PartDefinition cube_r235 = panel6.addOrReplaceChild(
                "cube_r235",
                CubeListBuilder.create()
                        .texOffs(93, 42)
                        .addBox(-0.5F, -0.4483F, -2.7371F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.4475F, 0.4238F, -10.0199F, 0.2618F, 1.0472F, 0.0F));

        PartDefinition cube_r236 = panel6.addOrReplaceChild(
                "cube_r236",
                CubeListBuilder.create()
                        .texOffs(89, 208)
                        .addBox(4.8763F, -0.2683F, -3.3064F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.8535F, 0.0878F, 0.3325F, 0.0F, 1.5708F, -0.3054F));

        PartDefinition bone47 = panel6.addOrReplaceChild(
                "bone47", CubeListBuilder.create(), PartPose.offset(-1.8535F, 0.0878F, 0.0825F));

        PartDefinition cube_r237 = bone47.addOrReplaceChild(
                "cube_r237",
                CubeListBuilder.create()
                        .texOffs(39, 207)
                        .addBox(-6.0737F, -0.5183F, 3.4436F, 12.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                        .texOffs(38, 207)
                        .mirror()
                        .addBox(-5.7737F, -0.5183F, 2.4436F, 13.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                        .mirror(false)
                        .texOffs(38, 207)
                        .addBox(-5.7737F, -0.5183F, 3.4436F, 13.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.3054F));

        PartDefinition cube_r238 = bone47.addOrReplaceChild(
                "cube_r238",
                CubeListBuilder.create()
                        .texOffs(10, 206)
                        .addBox(-3.1395F, -1.9813F, -2.442F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(4.3355F, -1.1939F, -1.6763F, -3.1416F, 0.0F, 2.7925F));

        PartDefinition cube_r239 = bone47.addOrReplaceChild(
                "cube_r239",
                CubeListBuilder.create()
                        .texOffs(10, 206)
                        .addBox(-2.7132F, -1.9096F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(3.7563F, -0.9798F, -5.2263F, 0.0F, 0.0F, -0.6109F));

        PartDefinition cube_r240 = bone47.addOrReplaceChild(
                "cube_r240",
                CubeListBuilder.create()
                        .texOffs(10, 206)
                        .addBox(-3.171F, -1.9698F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(4.5621F, -1.2995F, 4.3237F, -3.1416F, 0.0F, 2.7925F));

        PartDefinition cube_r241 = bone47.addOrReplaceChild(
                "cube_r241",
                CubeListBuilder.create()
                        .texOffs(10, 206)
                        .addBox(-2.7132F, -1.9096F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(-1.2F)),
                PartPose.offsetAndRotation(3.7555F, -0.9737F, 1.0237F, 0.0F, 0.0F, -0.6109F));

        PartDefinition bone10 = panel6.addOrReplaceChild(
                "bone10", CubeListBuilder.create(), PartPose.offset(-1.8535F, 0.0878F, 0.0825F));

        PartDefinition cube_r242 = bone10.addOrReplaceChild(
                "cube_r242",
                CubeListBuilder.create()
                        .texOffs(63, 240)
                        .addBox(-5.3737F, -0.1781F, -3.0672F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(63, 243)
                        .addBox(-5.1237F, -0.1781F, -3.0672F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(63, 234)
                        .addBox(-5.3737F, -0.2281F, -3.0672F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(63, 237)
                        .addBox(-5.1237F, -0.2281F, -3.0672F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(33, 241)
                        .addBox(-4.8737F, -0.1281F, -3.3172F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(39, 234)
                        .addBox(-5.1237F, -0.1281F, -3.3172F, 12.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.2182F));

        PartDefinition bone48 = panel6.addOrReplaceChild(
                "bone48", CubeListBuilder.create(), PartPose.offset(-3.2372F, 1.1699F, 6.7062F));

        PartDefinition cube_r243 = bone48.addOrReplaceChild(
                "cube_r243",
                CubeListBuilder.create()
                        .texOffs(82, 208)
                        .addBox(-1.8559F, -1.4435F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 2.6616F));

        PartDefinition cube_r244 = bone48.addOrReplaceChild(
                "cube_r244",
                CubeListBuilder.create()
                        .texOffs(138, 507)
                        .addBox(-1.8686F, -1.5378F, -8.875F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(0.0802F, -0.2948F, -7.375F, 3.1416F, 0.0F, 2.3126F));

        PartDefinition bone49 = panel6.addOrReplaceChild(
                "bone49", CubeListBuilder.create(), PartPose.offset(-3.2372F, 1.1699F, 6.7062F));

        PartDefinition cube_r245 = bone49.addOrReplaceChild(
                "cube_r245",
                CubeListBuilder.create()
                        .texOffs(82, 208)
                        .addBox(-1.8559F, -1.4435F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -14.75F, 3.1416F, 0.0F, 2.6616F));

        PartDefinition cube_r246 = bone49.addOrReplaceChild(
                "cube_r246",
                CubeListBuilder.create()
                        .texOffs(138, 507)
                        .addBox(-1.8686F, -1.5378F, -8.875F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(0.0802F, -0.2948F, -22.125F, 3.1416F, 0.0F, 2.3126F));

        PartDefinition rotor = base.addOrReplaceChild(
                "rotor",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0375F, -2.01F, -0.065F, 0.0F, -0.5236F, 0.0F));

        PartDefinition rotorTop = rotor.addOrReplaceChild(
                "rotorTop",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1732F, 2.01F, -0.0134F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone53 = rotorTop.addOrReplaceChild(
                "bone53",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-4.4881F, -54.6909F, -0.16F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r247 = bone53.addOrReplaceChild(
                "cube_r247",
                CubeListBuilder.create()
                        .texOffs(492, 110)
                        .addBox(-1.232F, 0.7322F, 1.2211F, 9.12F, 0.76F, 0.76F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2348F, -0.0957F, -1.2266F, 0.5156F, 0.0955F, 1.404F));

        PartDefinition cube_r248 = bone53.addOrReplaceChild(
                "cube_r248",
                CubeListBuilder.create()
                        .texOffs(463, 117)
                        .addBox(-1.102F, -1.0602F, -3.022F, 9.0F, 1.0F, 6.84F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.2066F, 0.0128F, -2.1452F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r249 = bone53.addOrReplaceChild(
                "cube_r249",
                CubeListBuilder.create()
                        .texOffs(492, 110)
                        .addBox(-2.6854F, 0.1335F, 0.0334F, 9.12F, 0.76F, 0.76F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.9544F, 1.4347F, -4.377F, -0.5156F, -0.0955F, 1.404F));

        PartDefinition cube_r250 = bone53.addOrReplaceChild(
                "cube_r250",
                CubeListBuilder.create()
                        .texOffs(499, 87)
                        .addBox(-0.9149F, -0.6492F, -1.6621F, 0.76F, 0.76F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3588F, -0.1387F, -2.6571F, 0.0F, 0.0F, 1.3963F));

        PartDefinition bone55 = rotorTop.addOrReplaceChild(
                "bone55",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-2.4882F, -54.6909F, 3.3041F, 0.0F, 0.5236F, 0.0F));

        PartDefinition cube_r251 = bone55.addOrReplaceChild(
                "cube_r251",
                CubeListBuilder.create()
                        .texOffs(492, 110)
                        .addBox(-2.6854F, -0.0665F, -0.2934F, 9.12F, 0.76F, 0.76F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0842F, 1.4937F, 1.1787F, 0.5156F, 0.0955F, 1.404F));

        PartDefinition cube_r252 = bone55.addOrReplaceChild(
                "cube_r252",
                CubeListBuilder.create()
                        .texOffs(508, 124)
                        .addBox(1.1129F, 3.6444F, -1.8621F, 0.76F, 0.0F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.844F, 0.0232F, -0.0549F, 0.0F, 0.0F, 0.2618F));

        PartDefinition cube_r253 = bone55.addOrReplaceChild(
                "cube_r253",
                CubeListBuilder.create()
                        .texOffs(463, 117)
                        .addBox(-1.102F, -0.9602F, -4.2721F, 9.0F, 1.0F, 6.84F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.844F, 0.0232F, -0.0549F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r254 = bone55.addOrReplaceChild(
                "cube_r254",
                CubeListBuilder.create()
                        .texOffs(505, 100)
                        .addBox(3.4862F, 0.8007F, -1.8621F, 1.52F, 1.52F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.844F, 0.0232F, -0.0549F, 0.0F, 0.0F, 0.9599F));

        PartDefinition cube_r255 = bone55.addOrReplaceChild(
                "cube_r255",
                CubeListBuilder.create()
                        .texOffs(504, 112)
                        .addBox(1.8823F, -1.9831F, -1.8621F, 2.28F, 1.52F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.844F, 0.0232F, -0.0549F, 0.0F, 0.0F, 1.6581F));

        PartDefinition cube_r256 = bone55.addOrReplaceChild(
                "cube_r256",
                CubeListBuilder.create()
                        .texOffs(499, 87)
                        .addBox(-0.9148F, -0.6492F, -3.0621F, 0.76F, 0.76F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.9962F, -0.1283F, -0.4168F, 0.0F, 0.0F, 1.3963F));

        PartDefinition bone56 = rotorTop.addOrReplaceChild(
                "bone56",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-2.4882F, -54.6909F, 3.3041F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r257 = bone56.addOrReplaceChild(
                "cube_r257",
                CubeListBuilder.create()
                        .texOffs(463, 117)
                        .addBox(-1.117F, -0.9749F, -3.0721F, 9.0F, 1.0F, 6.84F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.9027F, 0.0128F, 2.5886F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r258 = bone56.addOrReplaceChild(
                "cube_r258",
                CubeListBuilder.create()
                        .texOffs(499, 87)
                        .addBox(-0.9299F, -0.5639F, -1.6621F, 0.76F, 0.76F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.956F, -0.1179F, 2.0514F, 0.0F, 0.0F, 1.3963F));

        PartDefinition bone57 = rotorTop.addOrReplaceChild(
                "bone57",
                CubeListBuilder.create()
                        .texOffs(476, 99)
                        .addBox(-5.5058F, 7.6252F, -1.2227F, 9.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(458, 99)
                        .addBox(-5.5058F, -0.6248F, -1.2227F, 9.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.4882F, -54.6909F, 3.3041F, -3.1416F, 0.5236F, 3.1416F));

        PartDefinition cube_r259 = bone57.addOrReplaceChild(
                "cube_r259",
                CubeListBuilder.create()
                        .texOffs(463, 117)
                        .addBox(-1.132F, -1.0396F, -4.5221F, 9.0F, 1.0F, 6.84F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.7904F, 0.0128F, 5.1093F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r260 = bone57.addOrReplaceChild(
                "cube_r260",
                CubeListBuilder.create()
                        .texOffs(492, 110)
                        .addBox(-2.7044F, 0.0316F, -0.2934F, 9.12F, 0.76F, 0.76F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.8495F, 1.5041F, 1.5943F, -0.5156F, -0.0955F, 1.404F));

        PartDefinition cube_r261 = bone57.addOrReplaceChild(
                "cube_r261",
                CubeListBuilder.create()
                        .texOffs(505, 100)
                        .addBox(3.3868F, 0.9426F, -1.8621F, 1.52F, 1.52F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.5404F, 0.0128F, 5.1093F, 0.0F, 0.0F, 0.9599F));

        PartDefinition cube_r262 = bone57.addOrReplaceChild(
                "cube_r262",
                CubeListBuilder.create()
                        .texOffs(504, 112)
                        .addBox(1.8974F, -1.8106F, -1.8621F, 2.28F, 1.52F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.5404F, 0.0128F, 5.1093F, 0.0F, 0.0F, 1.6581F));

        PartDefinition cube_r263 = bone57.addOrReplaceChild(
                "cube_r263",
                CubeListBuilder.create()
                        .texOffs(499, 87)
                        .addBox(-0.9449F, -0.4786F, -3.0621F, 0.76F, 0.76F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.7426F, -0.1074F, 4.4793F, 0.0F, 0.0F, 1.3963F));

        PartDefinition bone58 = rotorTop.addOrReplaceChild(
                "bone58",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-2.4882F, -54.6909F, 3.3041F, -3.1416F, -0.5236F, 3.1416F));

        PartDefinition cube_r264 = bone58.addOrReplaceChild(
                "cube_r264",
                CubeListBuilder.create()
                        .texOffs(463, 117)
                        .addBox(-20.5499F, -8.1123F, -4.7951F, 9.0F, 1.0F, 6.84F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.2117F, 20.3638F, 2.4759F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r265 = bone58.addOrReplaceChild(
                "cube_r265",
                CubeListBuilder.create()
                        .texOffs(492, 110)
                        .addBox(-2.714F, 0.2807F, 0.12F, 9.12F, 0.76F, 0.76F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.2562F, 1.4764F, -1.4809F, -0.5156F, -0.0955F, 1.404F));

        PartDefinition cube_r266 = bone58.addOrReplaceChild(
                "cube_r266",
                CubeListBuilder.create()
                        .texOffs(499, 87)
                        .addBox(-20.3628F, -7.5513F, -3.5351F, 0.76F, 0.76F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-12.1627F, 20.254F, 2.1119F, 0.0F, 0.0F, 1.3963F));

        PartDefinition bone59 = rotorTop.addOrReplaceChild(
                "bone59",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-2.4882F, -54.6909F, 3.3041F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r267 = bone59.addOrReplaceChild(
                "cube_r267",
                CubeListBuilder.create()
                        .texOffs(463, 117)
                        .addBox(-1.117F, -1.0249F, -3.0721F, 9.0F, 1.0F, 6.84F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.5585F, 0.0128F, -3.1244F, 0.0F, 0.0F, 1.3963F));

        PartDefinition cube_r268 = bone59.addOrReplaceChild(
                "cube_r268",
                CubeListBuilder.create()
                        .texOffs(492, 110)
                        .addBox(-2.7044F, 0.2316F, 0.0334F, 9.12F, 0.76F, 0.76F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.2963F, 1.4868F, -5.2991F, -0.5156F, -0.0955F, 1.404F));

        PartDefinition cube_r269 = bone59.addOrReplaceChild(
                "cube_r269",
                CubeListBuilder.create()
                        .texOffs(505, 100)
                        .addBox(3.4365F, 0.8717F, -0.5121F, 1.52F, 1.52F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.4085F, 0.0128F, -3.1244F, 0.0F, 0.0F, 0.9599F));

        PartDefinition cube_r270 = bone59.addOrReplaceChild(
                "cube_r270",
                CubeListBuilder.create()
                        .texOffs(504, 112)
                        .addBox(1.8898F, -1.8968F, -0.5121F, 2.28F, 1.52F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.4085F, 0.0128F, -3.1244F, 0.0F, 0.0F, 1.6581F));

        PartDefinition cube_r271 = bone59.addOrReplaceChild(
                "cube_r271",
                CubeListBuilder.create()
                        .texOffs(499, 87)
                        .addBox(-0.9299F, -0.5639F, -1.7121F, 0.76F, 0.76F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.6094F, -0.1491F, -3.5793F, 0.0F, 0.0F, 1.3963F));

        PartDefinition rotorBase =
                rotor.addOrReplaceChild("rotorBase", CubeListBuilder.create(), PartPose.offset(0.402F, -13.735F, 0.0F));

        PartDefinition rotorglass = rotorBase.addOrReplaceChild(
                "rotorglass",
                CubeListBuilder.create()
                        .texOffs(148, 0)
                        .addBox(1.5471F, -33.43F, -3.8538F, 4.0F, 28.0F, 8.0F, new CubeDeformation(-2.0F)),
                PartPose.offset(-0.1112F, 0.0F, 0.0722F));

        PartDefinition cube_r272 = rotorglass.addOrReplaceChild(
                "cube_r272",
                CubeListBuilder.create()
                        .texOffs(148, 0)
                        .addBox(-0.4335F, -35.45F, -2.135F, 4.0F, 28.0F, 8.0F, new CubeDeformation(-2.0F)),
                PartPose.offsetAndRotation(0.7494F, 2.02F, 2.722F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r273 = rotorglass.addOrReplaceChild(
                "cube_r273",
                CubeListBuilder.create()
                        .texOffs(148, 0)
                        .addBox(-0.4335F, -35.45F, -1.885F, 4.0F, 28.0F, 8.0F, new CubeDeformation(-2.0F)),
                PartPose.offsetAndRotation(2.8635F, 2.02F, 0.7321F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r274 = rotorglass.addOrReplaceChild(
                "cube_r274",
                CubeListBuilder.create()
                        .texOffs(148, 0)
                        .addBox(-0.8665F, -35.45F, -1.885F, 4.0F, 28.0F, 8.0F, new CubeDeformation(-2.0F)),
                PartPose.offsetAndRotation(-0.5833F, 2.02F, -2.9297F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r275 = rotorglass.addOrReplaceChild(
                "cube_r275",
                CubeListBuilder.create()
                        .texOffs(148, 0)
                        .addBox(-0.8665F, -35.45F, -2.135F, 4.0F, 28.0F, 8.0F, new CubeDeformation(-2.0F)),
                PartPose.offsetAndRotation(-2.6974F, 2.02F, -0.9397F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r276 = rotorglass.addOrReplaceChild(
                "cube_r276",
                CubeListBuilder.create()
                        .texOffs(148, 0)
                        .addBox(-0.65F, -35.45F, -2.26F, 4.0F, 28.0F, 8.0F, new CubeDeformation(-2.0F)),
                PartPose.offsetAndRotation(-2.0311F, 2.02F, 1.8862F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone44 = rotorBase.addOrReplaceChild(
                "bone44",
                CubeListBuilder.create()
                        .texOffs(0, 258)
                        .addBox(1.4157F, -7.43F, -1.8538F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0202F, 0.0F, 0.0722F));

        PartDefinition cube_r277 = bone44.addOrReplaceChild(
                "cube_r277",
                CubeListBuilder.create()
                        .texOffs(0, 258)
                        .addBox(-2.4335F, -7.43F, -1.885F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r278 = bone44.addOrReplaceChild(
                "cube_r278",
                CubeListBuilder.create()
                        .texOffs(4, 258)
                        .addBox(1.5665F, -7.43F, -2.135F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1141F, 0.0F, -0.01F, -3.1416F, -1.0472F, 3.1416F));

        PartDefinition cube_r279 = bone44.addOrReplaceChild(
                "cube_r279",
                CubeListBuilder.create()
                        .texOffs(0, 258)
                        .addBox(1.35F, -7.43F, -2.26F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1625F, 0.0F, -0.1138F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r280 = bone44.addOrReplaceChild(
                "cube_r280",
                CubeListBuilder.create()
                        .texOffs(0, 258)
                        .addBox(1.1335F, -7.43F, -1.885F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0173F, 0.0F, -0.1976F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r281 = bone44.addOrReplaceChild(
                "cube_r281",
                CubeListBuilder.create()
                        .texOffs(1, 258)
                        .addBox(2.1335F, -7.43F, -2.115F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1141F, 0.0F, -0.1976F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone45 = rotorBase.addOrReplaceChild(
                "bone45",
                CubeListBuilder.create()
                        .texOffs(104, 169)
                        .addBox(3.666F, -3.75F, -2.0283F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.01F)),
                PartPose.offset(-0.3716F, -0.25F, -0.2433F));

        PartDefinition cube_r282 = bone45.addOrReplaceChild(
                "cube_r282",
                CubeListBuilder.create()
                        .texOffs(104, 169)
                        .addBox(3.9065F, -3.75F, -2.555F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r283 = bone45.addOrReplaceChild(
                "cube_r283",
                CubeListBuilder.create()
                        .texOffs(104, 169)
                        .addBox(3.9065F, -3.75F, -2.805F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(0.3599F, 0.0F, -0.18F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r284 = bone45.addOrReplaceChild(
                "cube_r284",
                CubeListBuilder.create()
                        .texOffs(104, 169)
                        .addBox(3.69F, -3.75F, -2.93F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.6957F, 0.0F, 0.0417F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r285 = bone45.addOrReplaceChild(
                "cube_r285",
                CubeListBuilder.create()
                        .texOffs(104, 169)
                        .addBox(3.4735F, -3.75F, -2.805F, 1.0F, 3.0F, 5.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(0.6716F, 0.0F, 0.4433F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r286 = bone45.addOrReplaceChild(
                "cube_r286",
                CubeListBuilder.create()
                        .texOffs(104, 169)
                        .addBox(3.4735F, -3.75F, -2.555F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3118F, 0.0F, 0.6233F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone41 = rotorBase.addOrReplaceChild(
                "bone41",
                CubeListBuilder.create()
                        .texOffs(136, 245)
                        .addBox(3.8881F, -1.25F, -3.4823F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.1222F, 0.25F, 0.1767F));

        PartDefinition cube_r287 = bone41.addOrReplaceChild(
                "cube_r287",
                CubeListBuilder.create()
                        .texOffs(243, 149)
                        .addBox(4.1645F, -1.75F, -3.3581F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r288 = bone41.addOrReplaceChild(
                "cube_r288",
                CubeListBuilder.create()
                        .texOffs(148, 246)
                        .addBox(4.5145F, -1.75F, -3.6081F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.4939F, 0.5F, -0.32F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r289 = bone41.addOrReplaceChild(
                "cube_r289",
                CubeListBuilder.create()
                        .texOffs(135, 243)
                        .addBox(3.2155F, -1.75F, -2.0019F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0481F, 0.5F, -1.4646F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r290 = bone41.addOrReplaceChild(
                "cube_r290",
                CubeListBuilder.create()
                        .texOffs(243, 129)
                        .addBox(2.8655F, -1.75F, -2.7519F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.4203F, 0.5F, -0.6446F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r291 = bone41.addOrReplaceChild(
                "cube_r291",
                CubeListBuilder.create()
                        .texOffs(243, 139)
                        .addBox(3.34F, -1.75F, -3.43F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.8962F, 0.5F, 0.0877F, 0.0F, 3.1416F, 0.0F));

        PartDefinition rotorlightbeams = rotorBase.addOrReplaceChild(
                "rotorlightbeams", CubeListBuilder.create(), PartPose.offset(-0.134F, -2.68F, 0.0F));

        PartDefinition rotorlightbeam1 = rotorlightbeams.addOrReplaceChild(
                "rotorlightbeam1", CubeListBuilder.create(), PartPose.offset(-0.268F, 18.425F, 0.0F));

        PartDefinition timeColumn = rotor.addOrReplaceChild(
                "timeColumn",
                CubeListBuilder.create()
                        .texOffs(293, 178)
                        .addBox(-0.1F, -10.87F, -0.71F, 0.0F, 18.24F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offset(0.5F, -31.43F, 0.15F));

        PartDefinition cube_r292 = timeColumn.addOrReplaceChild(
                "cube_r292",
                CubeListBuilder.create()
                        .texOffs(297, 178)
                        .addBox(0.0F, -43.06F, -0.76F, 0.0F, 18.24F, 1.52F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, 32.19F, 0.05F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone64 = timeColumn.addOrReplaceChild(
                "bone64",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1F, 10.53F, 0.05F, 0.0F, 0.0F, -3.1416F));

        PartDefinition cube_r293 = bone64.addOrReplaceChild(
                "cube_r293",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1767F, 0.0F, 0.2383F, 0.0F, 1.0472F, 3.1416F));

        PartDefinition cube_r294 = bone64.addOrReplaceChild(
                "cube_r294",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3143F, 0.0F, -0.008F, -3.1416F, 1.0472F, 0.0F));

        PartDefinition cube_r295 = bone64.addOrReplaceChild(
                "cube_r295",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1697F, 0.0F, -0.2504F, -3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r296 = bone64.addOrReplaceChild(
                "cube_r296",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1124F, 0.0F, -0.2464F, -3.1416F, -1.0472F, 0.0F));

        PartDefinition cube_r297 = bone64.addOrReplaceChild(
                "cube_r297",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, 0.0F, -1.0472F, -3.1416F));

        PartDefinition cube_r298 = bone64.addOrReplaceChild(
                "cube_r298",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1055F, 0.0F, 0.2413F, 0.0F, 0.0F, -3.1416F));

        PartDefinition bone15 = timeColumn.addOrReplaceChild(
                "bone15", CubeListBuilder.create(), PartPose.offset(-0.1F, -13.97F, 0.05F));

        PartDefinition cube_r299 = bone15.addOrReplaceChild(
                "cube_r299",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1767F, 0.0F, 0.2383F, 0.0F, 1.0472F, 3.1416F));

        PartDefinition cube_r300 = bone15.addOrReplaceChild(
                "cube_r300",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.3143F, 0.0F, -0.008F, -3.1416F, 1.0472F, 0.0F));

        PartDefinition cube_r301 = bone15.addOrReplaceChild(
                "cube_r301",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1697F, 0.0F, -0.2504F, -3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r302 = bone15.addOrReplaceChild(
                "cube_r302",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1124F, 0.0F, -0.2464F, -3.1416F, -1.0472F, 0.0F));

        PartDefinition cube_r303 = bone15.addOrReplaceChild(
                "cube_r303",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, 0.0F, -1.0472F, -3.1416F));

        PartDefinition cube_r304 = bone15.addOrReplaceChild(
                "cube_r304",
                CubeListBuilder.create()
                        .texOffs(305, 190)
                        .addBox(-0.8624F, -3.1576F, -1.9784F, 2.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.1055F, 0.0F, 0.2413F, 0.0F, 0.0F, -3.1416F));

        PartDefinition bone62 = timeColumn.addOrReplaceChild(
                "bone62",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1F, 3.31F, 0.05F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r305 = bone62.addOrReplaceChild(
                "cube_r305",
                CubeListBuilder.create()
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -24.8176F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -43.0576F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -27.8576F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -26.3376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -40.0176F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -41.5376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -29.3776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -30.8976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -36.9776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -38.4976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -32.4176F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -33.9376F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -35.4576F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone61 = timeColumn.addOrReplaceChild(
                "bone61",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1F, 3.31F, 0.05F, -3.1416F, -1.0472F, 3.1416F));

        PartDefinition cube_r306 = bone61.addOrReplaceChild(
                "cube_r306",
                CubeListBuilder.create()
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -24.8176F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -43.0576F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -27.8576F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -26.3376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -40.0176F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -41.5376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -29.3776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -30.8976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -36.9776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -38.4976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -32.4176F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -33.9376F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -35.4576F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone60 = timeColumn.addOrReplaceChild(
                "bone60",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1F, 3.31F, 0.05F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r307 = bone60.addOrReplaceChild(
                "cube_r307",
                CubeListBuilder.create()
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -24.8176F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -43.0576F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -27.8576F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -26.3376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -40.0176F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -41.5376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -29.3776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -30.8976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -36.9776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -38.4976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -32.4176F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -33.9376F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -35.4576F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone23 = timeColumn.addOrReplaceChild(
                "bone23",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1F, 3.31F, 0.05F, -3.1416F, 1.0472F, 3.1416F));

        PartDefinition cube_r308 = bone23.addOrReplaceChild(
                "cube_r308",
                CubeListBuilder.create()
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -24.8176F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -43.0576F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -27.8576F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -26.3376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -40.0176F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -41.5376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -29.3776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -30.8976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -36.9776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -38.4976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -32.4176F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -33.9376F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -35.4576F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone22 = timeColumn.addOrReplaceChild(
                "bone22",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-0.1F, 3.31F, 0.05F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r309 = bone22.addOrReplaceChild(
                "cube_r309",
                CubeListBuilder.create()
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -24.8176F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -43.0576F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -27.8576F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -26.3376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -40.0176F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -41.5376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -29.3776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -30.8976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -36.9776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -38.4976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -32.4176F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -33.9376F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -35.4576F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone21 =
                timeColumn.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offset(-0.1F, 3.31F, 0.05F));

        PartDefinition cube_r310 = bone21.addOrReplaceChild(
                "cube_r310",
                CubeListBuilder.create()
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -24.8176F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(462, 293)
                        .addBox(-1.5176F, -43.0576F, -2.2776F, 3.0352F, -0.0048F, 2.2752F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -27.8576F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -26.3376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -40.0176F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(472, 294)
                        .addBox(-1.5176F, -41.5376F, -2.6576F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -29.3776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -30.8976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -36.9776F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(499, 308)
                        .addBox(-1.5176F, -38.4976F, -3.0376F, 3.0352F, -0.0048F, 3.0352F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -32.4176F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(489, 177)
                        .addBox(0.0024F, -43.4376F, -4.1776F, -0.0048F, 18.9952F, 8.3552F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -33.9376F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F))
                        .texOffs(488, 312)
                        .addBox(-1.8976F, -35.4576F, -3.4176F, 3.7952F, -0.0048F, 3.7952F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r311 = bone21.addOrReplaceChild(
                "cube_r311",
                CubeListBuilder.create()
                        .texOffs(489, 202)
                        .addBox(0.0024F, -43.4376F, -4.1776F, -0.0048F, 18.9952F, 8.3552F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, 28.88F, 0.0F, -3.1416F, 1.0472F, 3.1416F));

        PartDefinition cube_r312 = bone21.addOrReplaceChild(
                "cube_r312",
                CubeListBuilder.create()
                        .texOffs(489, 202)
                        .addBox(0.0024F, -9.9976F, -4.1776F, -0.0048F, 18.9952F, 8.3552F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -4.56F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r313 = bone21.addOrReplaceChild(
                "cube_r313",
                CubeListBuilder.create()
                        .texOffs(489, 202)
                        .addBox(0.0024F, -9.9976F, -4.1776F, -0.0048F, 18.9952F, 8.3552F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -4.56F, 0.0F, -3.1416F, -1.0472F, 3.1416F));

        PartDefinition cube_r314 = bone21.addOrReplaceChild(
                "cube_r314",
                CubeListBuilder.create()
                        .texOffs(489, 177)
                        .addBox(0.0024F, -9.9976F, -4.1776F, -0.0048F, 18.9952F, 8.3552F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -4.56F, 0.0F, 0.0F, -2.618F, 0.0F));

        PartDefinition cube_r315 = bone21.addOrReplaceChild(
                "cube_r315",
                CubeListBuilder.create()
                        .texOffs(489, 177)
                        .addBox(0.0024F, -9.9976F, -4.1776F, -0.0048F, 18.9952F, 8.3552F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -4.56F, 0.0F, 0.0F, 2.618F, 0.0F));

        PartDefinition bone24 = rotor.addOrReplaceChild(
                "bone24",
                CubeListBuilder.create()
                        .texOffs(284, 179)
                        .addBox(-0.5F, -15.5F, -0.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offset(0.3874F, -30.3F, 0.1F));

        PartDefinition bone52 = rotor.addOrReplaceChild(
                "bone52",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.15F, -20.2991F, 0.2F, 0.0F, 0.0F, -3.1416F));

        PartDefinition cube_r316 = bone52.addOrReplaceChild(
                "cube_r316",
                CubeListBuilder.create()
                        .texOffs(490, 16)
                        .addBox(-1.0F, 19.171F, -1.8085F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(-0.0328F, 44.0086F, 3.052F, -3.0543F, 0.0F, 0.0F));

        PartDefinition cube_r317 = bone52.addOrReplaceChild(
                "cube_r317",
                CubeListBuilder.create()
                        .texOffs(490, 16)
                        .addBox(-1.0F, 19.0725F, -2.7084F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(-2.7528F, 44.0086F, 1.5592F, -3.0107F, -1.0472F, 0.0F));

        PartDefinition cube_r318 = bone52.addOrReplaceChild(
                "cube_r318",
                CubeListBuilder.create()
                        .texOffs(490, 16)
                        .addBox(-1.0F, 19.171F, -1.8085F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(-2.82F, 44.0086F, -1.5428F, 0.0873F, -1.0472F, 3.1416F));

        PartDefinition cube_r319 = bone52.addOrReplaceChild(
                "cube_r319",
                CubeListBuilder.create()
                        .texOffs(490, 16)
                        .addBox(-1.0F, 19.171F, -1.8085F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(-0.1672F, 44.0086F, -3.152F, 0.0873F, 0.0F, 3.1416F));

        PartDefinition cube_r320 = bone52.addOrReplaceChild(
                "cube_r320",
                CubeListBuilder.create()
                        .texOffs(490, 16)
                        .addBox(-1.0F, 19.171F, -1.8085F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(2.5528F, 44.0086F, -1.6592F, 0.0873F, 1.0472F, -3.1416F));

        PartDefinition cube_r321 = bone52.addOrReplaceChild(
                "cube_r321",
                CubeListBuilder.create()
                        .texOffs(490, 16)
                        .addBox(-1.0F, 19.171F, -1.8085F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(2.62F, 44.0086F, 1.4428F, -3.0543F, 1.0472F, 0.0F));

        PartDefinition bone43 =
                bone52.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offset(2.52F, 1.8596F, 1.4428F));

        PartDefinition cube_r322 = bone43.addOrReplaceChild(
                "cube_r322",
                CubeListBuilder.create()
                        .texOffs(496, 19)
                        .addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0543F, 1.0472F, 0.0F));

        PartDefinition cube_r323 = bone43.addOrReplaceChild(
                "cube_r323",
                CubeListBuilder.create()
                        .texOffs(496, 19)
                        .addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.6528F, 0.0F, 1.6092F, 3.0543F, 0.0F, 0.0F));

        PartDefinition cube_r324 = bone43.addOrReplaceChild(
                "cube_r324",
                CubeListBuilder.create()
                        .texOffs(496, 19)
                        .addBox(-1.0F, -0.9957F, -0.0653F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.3728F, 0.0F, 0.1165F, 3.0107F, -1.0472F, 0.0F));

        PartDefinition cube_r325 = bone43.addOrReplaceChild(
                "cube_r325",
                CubeListBuilder.create()
                        .texOffs(496, 19)
                        .addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.44F, 0.0F, -2.9855F, -0.0873F, -1.0472F, -3.1416F));

        PartDefinition cube_r326 = bone43.addOrReplaceChild(
                "cube_r326",
                CubeListBuilder.create()
                        .texOffs(496, 19)
                        .addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.7872F, 0.0F, -4.5947F, -0.0873F, 0.0F, -3.1416F));

        PartDefinition cube_r327 = bone43.addOrReplaceChild(
                "cube_r327",
                CubeListBuilder.create()
                        .texOffs(496, 19)
                        .addBox(-1.0F, -0.9981F, -0.0436F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0672F, 0.0F, -3.102F, -0.0873F, 1.0472F, 3.1416F));

        PartDefinition controls =
                root.addOrReplaceChild("controls", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.25F));

        PartDefinition telepathics = controls.addOrReplaceChild(
                "telepathics",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(7.0889F, -17.0573F, 13.5F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r328 = telepathics.addOrReplaceChild(
                "cube_r328",
                CubeListBuilder.create()
                        .texOffs(223, 0)
                        .addBox(-1.6687F, 0.0717F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(-0.7F))
                        .texOffs(208, 1)
                        .addBox(-1.6687F, 0.8717F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(-0.7F))
                        .texOffs(0, 33)
                        .addBox(-1.2187F, -1.7283F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.6F)),
                PartPose.offsetAndRotation(0.1297F, 0.5026F, -0.5F, 0.0F, 0.0F, 2.5744F));

        return LayerDefinition.create(meshdefinition, 512, 512);
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
        poseStack.pushPose();
        poseStack.translate(0f, -0.56f, 0f);
        poseStack.scale(1.55f, 1.55f, 1.55f);

        //
        // Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucentEmissive(new
        // ResourceLocation(MODID, "textures/consoles/tokamak.png")));
        root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.popPose();
    }

    @Override
    public void setupAnimations(T t, float v) {}

    @Override
    public ModelPart root() {
        return super.root();
    }

    @Override
    public void setupAnim(Entity entity, float v, float v1, float v2, float v3, float v4) {}
}
