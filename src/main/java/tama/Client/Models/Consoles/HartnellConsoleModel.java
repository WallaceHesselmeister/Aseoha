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
import net.tardis.mod.client.models.BasicTileHierarchicalModel;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataBool;
import net.tardis.mod.control.datas.ControlDataFloat;
import net.tardis.mod.registry.ControlRegistry;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;
import tama.TileEntities.Console.HartnellConsoleTile;

import java.util.Optional;

public class HartnellConsoleModel<T extends HartnellConsoleTile> extends BasicTileHierarchicalModel<T>
        implements IAdditionalConsoleRenderData {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer
    // and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation("modid", "hartnellmodel"), "main");
    private final ModelPart Console;
    private final ModelPart BaseGrid;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart cube_r3;
    private final ModelPart LowerBasePanels;
    private final ModelPart cube_r4;
    private final ModelPart cube_r5;
    private final ModelPart cube_r6;
    private final ModelPart cube_r7;
    private final ModelPart cube_r8;
    private final ModelPart LowerBaseSlants;
    private final ModelPart LowerSlant1;
    private final ModelPart cube_r9;
    private final ModelPart cube_r10;
    private final ModelPart LowerSlant2;
    private final ModelPart cube_r11;
    private final ModelPart cube_r12;
    private final ModelPart LowerSlant3;
    private final ModelPart cube_r13;
    private final ModelPart cube_r14;
    private final ModelPart cube_r15;
    private final ModelPart cube_r16;
    private final ModelPart LowerSlant4;
    private final ModelPart cube_r17;
    private final ModelPart cube_r18;
    private final ModelPart LowerSlant5;
    private final ModelPart cube_r19;
    private final ModelPart cube_r20;
    private final ModelPart LowerSlant6;
    private final ModelPart cube_r21;
    private final ModelPart cube_r22;
    private final ModelPart UpperBaseSlant;
    private final ModelPart UpperSlant1;
    private final ModelPart cube_r23;
    private final ModelPart cube_r24;
    private final ModelPart UpperSlant2;
    private final ModelPart cube_r25;
    private final ModelPart cube_r26;
    private final ModelPart UpperSlant3;
    private final ModelPart cube_r27;
    private final ModelPart cube_r28;
    private final ModelPart UpperSlant4;
    private final ModelPart cube_r29;
    private final ModelPart cube_r30;
    private final ModelPart UpperSlant5;
    private final ModelPart cube_r31;
    private final ModelPart cube_r32;
    private final ModelPart UpperSlant6;
    private final ModelPart cube_r33;
    private final ModelPart cube_r34;
    private final ModelPart PanelDividers;
    private final ModelPart Part1;
    private final ModelPart cube_r35;
    private final ModelPart Part2;
    private final ModelPart cube_r36;
    private final ModelPart Part3;
    private final ModelPart cube_r37;
    private final ModelPart Part4;
    private final ModelPart cube_r38;
    private final ModelPart Part5;
    private final ModelPart cube_r39;
    private final ModelPart Part6;
    private final ModelPart cube_r40;
    private final ModelPart UnderconsoleBaseSlant;
    private final ModelPart Slant1;
    private final ModelPart cube_r41;
    private final ModelPart Slant2;
    private final ModelPart cube_r42;
    private final ModelPart Slant3;
    private final ModelPart cube_r43;
    private final ModelPart Slant4;
    private final ModelPart cube_r44;
    private final ModelPart Slant5;
    private final ModelPart cube_r45;
    private final ModelPart Slant6;
    private final ModelPart cube_r46;
    private final ModelPart ConsoleCover;
    private final ModelPart cube_r47;
    private final ModelPart cube_r48;
    private final ModelPart cube_r49;
    private final ModelPart cube_r50;
    private final ModelPart cube_r51;
    private final ModelPart cube_r52;
    private final ModelPart TimeRotor;
    private final ModelPart Glass;
    private final ModelPart cube_r53;
    private final ModelPart cube_r54;
    private final ModelPart cube_r55;
    private final ModelPart cube_r56;
    private final ModelPart cube_r57;
    private final ModelPart cube_r58;
    private final ModelPart Rotor;
    private final ModelPart RotorRing;
    private final ModelPart cube_r59;
    private final ModelPart cube_r60;
    private final ModelPart cube_r61;
    private final ModelPart cube_r62;
    private final ModelPart cube_r63;
    private final ModelPart cube_r64;
    private final ModelPart cube_r65;
    private final ModelPart RotorRing2;
    private final ModelPart cube_r66;
    private final ModelPart cube_r67;
    private final ModelPart cube_r68;
    private final ModelPart cube_r69;
    private final ModelPart cube_r70;
    private final ModelPart cube_r71;
    private final ModelPart cube_r72;
    private final ModelPart Controls;
    private final ModelPart Throttle;
    private final ModelPart cube_r73;
    private final ModelPart DoorControl;
    private final ModelPart DoorControlTranslate;
    private final ModelPart cube_r74;
    private final ModelPart Handbrake;
    private final ModelPart cube_r75;
    private final ModelPart MiniLeversPanel1;
    private final ModelPart MiniLever1;
    private final ModelPart cube_r76;
    private final ModelPart MiniLever2;
    private final ModelPart cube_r77;
    private final ModelPart MiniLever3;
    private final ModelPart cube_r78;
    private final ModelPart MiniLever4;
    private final ModelPart cube_r79;
    private final ModelPart MiniLever5;
    private final ModelPart cube_r80;
    private final ModelPart MiniLeversPanel2;
    private final ModelPart Panel2Rot;
    private final ModelPart MiniLever6;
    private final ModelPart cube_r81;
    private final ModelPart MiniLever7;
    private final ModelPart cube_r82;
    private final ModelPart MiniLever8;
    private final ModelPart cube_r83;
    private final ModelPart MiniLever9;
    private final ModelPart cube_r84;
    private final ModelPart MiniLever10;
    private final ModelPart cube_r85;
    private final ModelPart MiniLever11;
    private final ModelPart cube_r86;
    private final ModelPart MiniLeversPanel5;
    private final ModelPart Panel5Rot;
    private final ModelPart MiniLever12;
    private final ModelPart cube_r87;
    private final ModelPart MiniLever13;
    private final ModelPart cube_r88;
    private final ModelPart MiniLever14;
    private final ModelPart cube_r89;
    private final ModelPart MiniLever15;
    private final ModelPart cube_r90;
    private final ModelPart MiniLeverPanel6;
    private final ModelPart Panel5Rot2;
    private final ModelPart MiniLever19;
    private final ModelPart cube_r91;
    private final ModelPart Random;
    private final ModelPart rando;
    private final ModelPart cube_r92;
    private final ModelPart bone5;
    private final ModelPart bone4;
    private final ModelPart bone3;
    private final ModelPart bone2;
    private final ModelPart bone;
    private final ModelPart cube_r93;
    private final ModelPart cube_r94;
    private final ModelPart cube_r95;
    private final ModelPart cube_r96;
    private final ModelPart cube_r97;
    private final ModelPart randomizer;
    private final ModelPart cube_r98;
    private final ModelPart fastret;
    private final ModelPart cube_r100;
    private final ModelPart stabs;
    private final ModelPart cube_r101;
    private final ModelPart Swivelers;
    private final ModelPart Panel2;
    private final ModelPart Swiv1;
    private final ModelPart SwivCap1;
    private final ModelPart Swiv2;
    private final ModelPart SwivCap2;
    private final ModelPart Panel5;
    private final ModelPart Swiv3;
    private final ModelPart SwivCap3;
    private final ModelPart Swiv4;
    private final ModelPart SwivCap4;
    private final ModelPart Swiv5;
    private final ModelPart SwivCap5;
    private final ModelPart Swiv6;
    private final ModelPart SwivCap6;
    private final ModelPart Panel6;
    private final ModelPart Swiv8;
    private final ModelPart SwivCap8;
    private final ModelPart Swiv7;
    private final ModelPart SwivCap7;
    private final ModelPart Swiv9;
    private final ModelPart SwivCap9;
    private final ModelPart Refueller;
    private final ModelPart DimensionControl;
    private final ModelPart cube_r99;
    private final ModelPart bb_main;

    public HartnellConsoleModel(ModelPart root) {
        super(root);
        this.Console = root.getChild("Console");
        this.BaseGrid = this.Console.getChild("BaseGrid");
        this.cube_r1 = this.BaseGrid.getChild("cube_r1");
        this.cube_r2 = this.BaseGrid.getChild("cube_r2");
        this.cube_r3 = this.BaseGrid.getChild("cube_r3");
        this.LowerBasePanels = this.Console.getChild("LowerBasePanels");
        this.cube_r4 = this.LowerBasePanels.getChild("cube_r4");
        this.cube_r5 = this.LowerBasePanels.getChild("cube_r5");
        this.cube_r6 = this.LowerBasePanels.getChild("cube_r6");
        this.cube_r7 = this.LowerBasePanels.getChild("cube_r7");
        this.cube_r8 = this.LowerBasePanels.getChild("cube_r8");
        this.LowerBaseSlants = this.Console.getChild("LowerBaseSlants");
        this.LowerSlant1 = this.LowerBaseSlants.getChild("LowerSlant1");
        this.cube_r9 = this.LowerSlant1.getChild("cube_r9");
        this.cube_r10 = this.LowerSlant1.getChild("cube_r10");
        this.LowerSlant2 = this.LowerBaseSlants.getChild("LowerSlant2");
        this.cube_r11 = this.LowerSlant2.getChild("cube_r11");
        this.cube_r12 = this.LowerSlant2.getChild("cube_r12");
        this.LowerSlant3 = this.LowerBaseSlants.getChild("LowerSlant3");
        this.cube_r13 = this.LowerSlant3.getChild("cube_r13");
        this.cube_r14 = this.LowerSlant3.getChild("cube_r14");
        this.cube_r15 = this.LowerSlant3.getChild("cube_r15");
        this.cube_r16 = this.LowerSlant3.getChild("cube_r16");
        this.LowerSlant4 = this.LowerBaseSlants.getChild("LowerSlant4");
        this.cube_r17 = this.LowerSlant4.getChild("cube_r17");
        this.cube_r18 = this.LowerSlant4.getChild("cube_r18");
        this.LowerSlant5 = this.LowerBaseSlants.getChild("LowerSlant5");
        this.cube_r19 = this.LowerSlant5.getChild("cube_r19");
        this.cube_r20 = this.LowerSlant5.getChild("cube_r20");
        this.LowerSlant6 = this.LowerBaseSlants.getChild("LowerSlant6");
        this.cube_r21 = this.LowerSlant6.getChild("cube_r21");
        this.cube_r22 = this.LowerSlant6.getChild("cube_r22");
        this.UpperBaseSlant = this.Console.getChild("UpperBaseSlant");
        this.UpperSlant1 = this.UpperBaseSlant.getChild("UpperSlant1");
        this.cube_r23 = this.UpperSlant1.getChild("cube_r23");
        this.cube_r24 = this.UpperSlant1.getChild("cube_r24");
        this.UpperSlant2 = this.UpperBaseSlant.getChild("UpperSlant2");
        this.cube_r25 = this.UpperSlant2.getChild("cube_r25");
        this.cube_r26 = this.UpperSlant2.getChild("cube_r26");
        this.UpperSlant3 = this.UpperBaseSlant.getChild("UpperSlant3");
        this.cube_r27 = this.UpperSlant3.getChild("cube_r27");
        this.cube_r28 = this.UpperSlant3.getChild("cube_r28");
        this.UpperSlant4 = this.UpperBaseSlant.getChild("UpperSlant4");
        this.cube_r29 = this.UpperSlant4.getChild("cube_r29");
        this.cube_r30 = this.UpperSlant4.getChild("cube_r30");
        this.UpperSlant5 = this.UpperBaseSlant.getChild("UpperSlant5");
        this.cube_r31 = this.UpperSlant5.getChild("cube_r31");
        this.cube_r32 = this.UpperSlant5.getChild("cube_r32");
        this.UpperSlant6 = this.UpperBaseSlant.getChild("UpperSlant6");
        this.cube_r33 = this.UpperSlant6.getChild("cube_r33");
        this.cube_r34 = this.UpperSlant6.getChild("cube_r34");
        this.PanelDividers = this.Console.getChild("PanelDividers");
        this.Part1 = this.PanelDividers.getChild("Part1");
        this.cube_r35 = this.Part1.getChild("cube_r35");
        this.Part2 = this.PanelDividers.getChild("Part2");
        this.cube_r36 = this.Part2.getChild("cube_r36");
        this.Part3 = this.PanelDividers.getChild("Part3");
        this.cube_r37 = this.Part3.getChild("cube_r37");
        this.Part4 = this.PanelDividers.getChild("Part4");
        this.cube_r38 = this.Part4.getChild("cube_r38");
        this.Part5 = this.PanelDividers.getChild("Part5");
        this.cube_r39 = this.Part5.getChild("cube_r39");
        this.Part6 = this.PanelDividers.getChild("Part6");
        this.cube_r40 = this.Part6.getChild("cube_r40");
        this.UnderconsoleBaseSlant = this.Console.getChild("UnderconsoleBaseSlant");
        this.Slant1 = this.UnderconsoleBaseSlant.getChild("Slant1");
        this.cube_r41 = this.Slant1.getChild("cube_r41");
        this.Slant2 = this.UnderconsoleBaseSlant.getChild("Slant2");
        this.cube_r42 = this.Slant2.getChild("cube_r42");
        this.Slant3 = this.UnderconsoleBaseSlant.getChild("Slant3");
        this.cube_r43 = this.Slant3.getChild("cube_r43");
        this.Slant4 = this.UnderconsoleBaseSlant.getChild("Slant4");
        this.cube_r44 = this.Slant4.getChild("cube_r44");
        this.Slant5 = this.UnderconsoleBaseSlant.getChild("Slant5");
        this.cube_r45 = this.Slant5.getChild("cube_r45");
        this.Slant6 = this.UnderconsoleBaseSlant.getChild("Slant6");
        this.cube_r46 = this.Slant6.getChild("cube_r46");
        this.ConsoleCover = this.Console.getChild("ConsoleCover");
        this.cube_r47 = this.ConsoleCover.getChild("cube_r47");
        this.cube_r48 = this.ConsoleCover.getChild("cube_r48");
        this.cube_r49 = this.ConsoleCover.getChild("cube_r49");
        this.cube_r50 = this.ConsoleCover.getChild("cube_r50");
        this.cube_r51 = this.ConsoleCover.getChild("cube_r51");
        this.cube_r52 = this.ConsoleCover.getChild("cube_r52");
        this.TimeRotor = root.getChild("TimeRotor");
        this.Glass = this.TimeRotor.getChild("Glass");
        this.cube_r53 = this.Glass.getChild("cube_r53");
        this.cube_r54 = this.Glass.getChild("cube_r54");
        this.cube_r55 = this.Glass.getChild("cube_r55");
        this.cube_r56 = this.Glass.getChild("cube_r56");
        this.cube_r57 = this.Glass.getChild("cube_r57");
        this.cube_r58 = this.Glass.getChild("cube_r58");
        this.Rotor = this.TimeRotor.getChild("Rotor");
        this.RotorRing = this.Rotor.getChild("RotorRing");
        this.cube_r59 = this.RotorRing.getChild("cube_r59");
        this.cube_r60 = this.RotorRing.getChild("cube_r60");
        this.cube_r61 = this.RotorRing.getChild("cube_r61");
        this.cube_r62 = this.RotorRing.getChild("cube_r62");
        this.cube_r63 = this.RotorRing.getChild("cube_r63");
        this.cube_r64 = this.RotorRing.getChild("cube_r64");
        this.cube_r65 = this.RotorRing.getChild("cube_r65");
        this.RotorRing2 = this.Rotor.getChild("RotorRing2");
        this.cube_r66 = this.RotorRing2.getChild("cube_r66");
        this.cube_r67 = this.RotorRing2.getChild("cube_r67");
        this.cube_r68 = this.RotorRing2.getChild("cube_r68");
        this.cube_r69 = this.RotorRing2.getChild("cube_r69");
        this.cube_r70 = this.RotorRing2.getChild("cube_r70");
        this.cube_r71 = this.RotorRing2.getChild("cube_r71");
        this.cube_r72 = this.RotorRing2.getChild("cube_r72");
        this.Controls = root.getChild("Controls");
        this.Throttle = this.Controls.getChild("Throttle");
        this.cube_r73 = this.Throttle.getChild("cube_r73");
        this.DoorControl = this.Controls.getChild("DoorControl");
        this.DoorControlTranslate = this.DoorControl.getChild("DoorControlTranslate");
        this.cube_r74 = this.DoorControlTranslate.getChild("cube_r74");
        this.Handbrake = this.Controls.getChild("Handbrake");
        this.cube_r75 = this.Handbrake.getChild("cube_r75");
        this.MiniLeversPanel1 = this.Controls.getChild("MiniLeversPanel1");
        this.MiniLever1 = this.MiniLeversPanel1.getChild("MiniLever1");
        this.cube_r76 = this.MiniLever1.getChild("cube_r76");
        this.MiniLever2 = this.MiniLeversPanel1.getChild("MiniLever2");
        this.cube_r77 = this.MiniLever2.getChild("cube_r77");
        this.MiniLever3 = this.MiniLeversPanel1.getChild("MiniLever3");
        this.cube_r78 = this.MiniLever3.getChild("cube_r78");
        this.MiniLever4 = this.MiniLeversPanel1.getChild("MiniLever4");
        this.cube_r79 = this.MiniLever4.getChild("cube_r79");
        this.MiniLever5 = this.MiniLeversPanel1.getChild("MiniLever5");
        this.cube_r80 = this.MiniLever5.getChild("cube_r80");
        this.MiniLeversPanel2 = this.Controls.getChild("MiniLeversPanel2");
        this.Panel2Rot = this.MiniLeversPanel2.getChild("Panel2Rot");
        this.MiniLever6 = this.Panel2Rot.getChild("MiniLever6");
        this.cube_r81 = this.MiniLever6.getChild("cube_r81");
        this.MiniLever7 = this.Panel2Rot.getChild("MiniLever7");
        this.cube_r82 = this.MiniLever7.getChild("cube_r82");
        this.MiniLever8 = this.Panel2Rot.getChild("MiniLever8");
        this.cube_r83 = this.MiniLever8.getChild("cube_r83");
        this.MiniLever9 = this.Panel2Rot.getChild("MiniLever9");
        this.cube_r84 = this.MiniLever9.getChild("cube_r84");
        this.MiniLever10 = this.Panel2Rot.getChild("MiniLever10");
        this.cube_r85 = this.MiniLever10.getChild("cube_r85");
        this.MiniLever11 = this.Panel2Rot.getChild("MiniLever11");
        this.cube_r86 = this.MiniLever11.getChild("cube_r86");
        this.MiniLeversPanel5 = this.Controls.getChild("MiniLeversPanel5");
        this.Panel5Rot = this.MiniLeversPanel5.getChild("Panel5Rot");
        this.MiniLever12 = this.Panel5Rot.getChild("MiniLever12");
        this.cube_r87 = this.MiniLever12.getChild("cube_r87");
        this.MiniLever13 = this.Panel5Rot.getChild("MiniLever13");
        this.cube_r88 = this.MiniLever13.getChild("cube_r88");
        this.MiniLever14 = this.Panel5Rot.getChild("MiniLever14");
        this.cube_r89 = this.MiniLever14.getChild("cube_r89");
        this.MiniLever15 = this.Panel5Rot.getChild("MiniLever15");
        this.cube_r90 = this.MiniLever15.getChild("cube_r90");
        this.MiniLeverPanel6 = this.Controls.getChild("MiniLeverPanel6");
        this.Panel5Rot2 = this.MiniLeverPanel6.getChild("Panel5Rot2");
        this.MiniLever19 = this.Panel5Rot2.getChild("MiniLever19");
        this.cube_r91 = this.MiniLever19.getChild("cube_r91");
        this.Random = this.Controls.getChild("Random");
        this.rando = this.Random.getChild("rando");
        this.cube_r92 = this.rando.getChild("cube_r92");
        this.bone5 = this.cube_r92.getChild("bone5");
        this.bone4 = this.cube_r92.getChild("bone4");
        this.bone3 = this.cube_r92.getChild("bone3");
        this.bone2 = this.cube_r92.getChild("bone2");
        this.bone = this.cube_r92.getChild("bone");
        this.cube_r93 = this.rando.getChild("cube_r93");
        this.cube_r94 = this.rando.getChild("cube_r94");
        this.cube_r95 = this.rando.getChild("cube_r95");
        this.cube_r96 = this.rando.getChild("cube_r96");
        this.cube_r97 = this.rando.getChild("cube_r97");
        this.randomizer = this.rando.getChild("randomizer");
        this.cube_r98 = this.randomizer.getChild("cube_r98");
        this.fastret = this.rando.getChild("fastret");
        this.cube_r100 = this.fastret.getChild("cube_r100");
        this.stabs = this.rando.getChild("stabs");
        this.cube_r101 = this.stabs.getChild("cube_r101");
        this.Swivelers = this.Random.getChild("Swivelers");
        this.Panel2 = this.Swivelers.getChild("Panel2");
        this.Swiv1 = this.Panel2.getChild("Swiv1");
        this.SwivCap1 = this.Swiv1.getChild("SwivCap1");
        this.Swiv2 = this.Panel2.getChild("Swiv2");
        this.SwivCap2 = this.Swiv2.getChild("SwivCap2");
        this.Panel5 = this.Swivelers.getChild("Panel5");
        this.Swiv3 = this.Panel5.getChild("Swiv3");
        this.SwivCap3 = this.Swiv3.getChild("SwivCap3");
        this.Swiv4 = this.Panel5.getChild("Swiv4");
        this.SwivCap4 = this.Swiv4.getChild("SwivCap4");
        this.Swiv5 = this.Panel5.getChild("Swiv5");
        this.SwivCap5 = this.Swiv5.getChild("SwivCap5");
        this.Swiv6 = this.Panel5.getChild("Swiv6");
        this.SwivCap6 = this.Swiv6.getChild("SwivCap6");
        this.Panel6 = this.Swivelers.getChild("Panel6");
        this.Swiv8 = this.Panel6.getChild("Swiv8");
        this.SwivCap8 = this.Swiv8.getChild("SwivCap8");
        this.Swiv7 = this.Panel6.getChild("Swiv7");
        this.SwivCap7 = this.Swiv7.getChild("SwivCap7");
        this.Swiv9 = this.Panel6.getChild("Swiv9");
        this.SwivCap9 = this.Swiv9.getChild("SwivCap9");
        this.Refueller = root.getChild("Refueller");
        this.DimensionControl = root.getChild("DimensionControl");
        this.cube_r99 = this.DimensionControl.getChild("cube_r99");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Console = partdefinition.addOrReplaceChild(
                "Console", CubeListBuilder.create(), PartPose.offset(0.25F, 16.0F, 0.0F));

        PartDefinition BaseGrid =
                Console.addOrReplaceChild("BaseGrid", CubeListBuilder.create(), PartPose.offset(8.0F, 8.0F, -8.0F));

        PartDefinition cube_r1 = BaseGrid.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-15.75F, -8.5F, -0.5F, 32.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.25F, -9.8F, 8.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r2 = BaseGrid.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-15.75F, -8.5F, -0.5F, 32.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.25F, -9.8F, 8.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r3 = BaseGrid.addOrReplaceChild(
                "cube_r3",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-15.75F, -8.5F, -0.5F, 32.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.25F, -9.8F, 8.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition LowerBasePanels = Console.addOrReplaceChild(
                "LowerBasePanels",
                CubeListBuilder.create()
                        .texOffs(0, 60)
                        .addBox(-3.5F, -18.05F, -7.125F, 7.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.25F, 8.0F, 0.0F));

        PartDefinition cube_r4 = LowerBasePanels.addOrReplaceChild(
                "cube_r4",
                CubeListBuilder.create()
                        .texOffs(0, 60)
                        .addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r5 = LowerBasePanels.addOrReplaceChild(
                "cube_r5",
                CubeListBuilder.create()
                        .texOffs(0, 60)
                        .addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r6 = LowerBasePanels.addOrReplaceChild(
                "cube_r6",
                CubeListBuilder.create()
                        .texOffs(0, 60)
                        .addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r7 = LowerBasePanels.addOrReplaceChild(
                "cube_r7",
                CubeListBuilder.create()
                        .texOffs(0, 60)
                        .addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r8 = LowerBasePanels.addOrReplaceChild(
                "cube_r8",
                CubeListBuilder.create()
                        .texOffs(0, 60)
                        .addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition LowerBaseSlants = Console.addOrReplaceChild(
                "LowerBaseSlants", CubeListBuilder.create(), PartPose.offset(-0.25F, 8.0F, 0.0F));

        PartDefinition LowerSlant1 = LowerBaseSlants.addOrReplaceChild(
                "LowerSlant1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r9 = LowerSlant1.addOrReplaceChild(
                "cube_r9",
                CubeListBuilder.create()
                        .texOffs(24, 67)
                        .addBox(-8.5F, -0.5F, 2.25F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -0.6435F, -16.9752F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r10 = LowerSlant1.addOrReplaceChild(
                "cube_r10",
                CubeListBuilder.create()
                        .texOffs(36, 20)
                        .addBox(-8.0F, 0.0F, -7.0F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -3.05F, -7.125F, 0.3054F, 0.0F, 0.0F));

        PartDefinition LowerSlant2 = LowerBaseSlants.addOrReplaceChild(
                "LowerSlant2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r11 = LowerSlant2.addOrReplaceChild(
                "cube_r11",
                CubeListBuilder.create()
                        .texOffs(24, 67)
                        .addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, -16.9752F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r12 = LowerSlant2.addOrReplaceChild(
                "cube_r12",
                CubeListBuilder.create()
                        .texOffs(36, 20)
                        .addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 13.75F, -7.125F, 0.3054F, 0.0F, 0.0F));

        PartDefinition LowerSlant3 = LowerBaseSlants.addOrReplaceChild(
                "LowerSlant3",
                CubeListBuilder.create()
                        .texOffs(24, 82)
                        .addBox(-8.0F, -0.3935F, -14.25F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.001F))
                        .texOffs(24, 82)
                        .addBox(-8.0F, -0.3935F, -0.25F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r13 = LowerSlant3.addOrReplaceChild(
                "cube_r13",
                CubeListBuilder.create()
                        .texOffs(24, 82)
                        .addBox(-8.0F, -16.55F, -14.25F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.002F))
                        .texOffs(24, 82)
                        .addBox(-8.0F, -16.55F, -0.25F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.002F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r14 = LowerSlant3.addOrReplaceChild(
                "cube_r14",
                CubeListBuilder.create()
                        .texOffs(24, 82)
                        .addBox(-8.0F, -16.55F, -14.25F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                        .texOffs(24, 82)
                        .addBox(-8.0F, -16.55F, -0.25F, 16.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r15 = LowerSlant3.addOrReplaceChild(
                "cube_r15",
                CubeListBuilder.create()
                        .texOffs(24, 67)
                        .addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, -16.9752F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r16 = LowerSlant3.addOrReplaceChild(
                "cube_r16",
                CubeListBuilder.create()
                        .texOffs(36, 20)
                        .addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 13.75F, -7.125F, 0.3054F, 0.0F, 0.0F));

        PartDefinition LowerSlant4 = LowerBaseSlants.addOrReplaceChild(
                "LowerSlant4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r17 = LowerSlant4.addOrReplaceChild(
                "cube_r17",
                CubeListBuilder.create()
                        .texOffs(24, 67)
                        .addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, -16.9752F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r18 = LowerSlant4.addOrReplaceChild(
                "cube_r18",
                CubeListBuilder.create()
                        .texOffs(36, 20)
                        .addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 13.75F, -7.125F, 0.3054F, 0.0F, 0.0F));

        PartDefinition LowerSlant5 = LowerBaseSlants.addOrReplaceChild(
                "LowerSlant5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r19 = LowerSlant5.addOrReplaceChild(
                "cube_r19",
                CubeListBuilder.create()
                        .texOffs(24, 67)
                        .addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, -16.9752F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r20 = LowerSlant5.addOrReplaceChild(
                "cube_r20",
                CubeListBuilder.create()
                        .texOffs(36, 20)
                        .addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 13.75F, -7.125F, 0.3054F, 0.0F, 0.0F));

        PartDefinition LowerSlant6 = LowerBaseSlants.addOrReplaceChild(
                "LowerSlant6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r21 = LowerSlant6.addOrReplaceChild(
                "cube_r21",
                CubeListBuilder.create()
                        .texOffs(24, 67)
                        .addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 16.1565F, -16.9752F, -0.0436F, 0.0F, 0.0F));

        PartDefinition cube_r22 = LowerSlant6.addOrReplaceChild(
                "cube_r22",
                CubeListBuilder.create()
                        .texOffs(36, 20)
                        .addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 13.75F, -7.125F, 0.3054F, 0.0F, 0.0F));

        PartDefinition UpperBaseSlant = Console.addOrReplaceChild(
                "UpperBaseSlant", CubeListBuilder.create(), PartPose.offset(-0.25F, 8.0F, 0.0F));

        PartDefinition UpperSlant1 = UpperBaseSlant.addOrReplaceChild(
                "UpperSlant1",
                CubeListBuilder.create()
                        .texOffs(0, 57)
                        .addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 69)
                        .addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r23 = UpperSlant1.addOrReplaceChild(
                "cube_r23",
                CubeListBuilder.create()
                        .texOffs(70, 0)
                        .addBox(-14.0F, 0.0F, -0.5F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -22.5662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition cube_r24 = UpperSlant1.addOrReplaceChild(
                "cube_r24",
                CubeListBuilder.create()
                        .texOffs(0, 19)
                        .addBox(-14.0F, -1.0F, 0.0F, 28.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -21.8684F, -22.7088F, 1.3003F, 0.0F, 0.0F));

        PartDefinition UpperSlant2 = UpperBaseSlant.addOrReplaceChild(
                "UpperSlant2",
                CubeListBuilder.create()
                        .texOffs(0, 57)
                        .addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 69)
                        .addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r25 = UpperSlant2.addOrReplaceChild(
                "cube_r25",
                CubeListBuilder.create()
                        .texOffs(70, 15)
                        .addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.7662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition cube_r26 = UpperSlant2.addOrReplaceChild(
                "cube_r26",
                CubeListBuilder.create()
                        .texOffs(0, 19)
                        .addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.0684F, -22.7088F, 1.3003F, 0.0F, 0.0F));

        PartDefinition UpperSlant3 = UpperBaseSlant.addOrReplaceChild(
                "UpperSlant3",
                CubeListBuilder.create()
                        .texOffs(0, 57)
                        .addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 69)
                        .addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(69, 106)
                        .addBox(-8.0F, -25.3162F, -21.9736F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r27 = UpperSlant3.addOrReplaceChild(
                "cube_r27",
                CubeListBuilder.create()
                        .texOffs(70, 30)
                        .addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.7662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition cube_r28 = UpperSlant3.addOrReplaceChild(
                "cube_r28",
                CubeListBuilder.create()
                        .texOffs(0, 19)
                        .addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.0684F, -22.7088F, 1.3003F, 0.0F, 0.0F));

        PartDefinition UpperSlant4 = UpperBaseSlant.addOrReplaceChild(
                "UpperSlant4",
                CubeListBuilder.create()
                        .texOffs(0, 57)
                        .addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 69)
                        .addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r29 = UpperSlant4.addOrReplaceChild(
                "cube_r29",
                CubeListBuilder.create()
                        .texOffs(70, 45)
                        .addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.7662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition cube_r30 = UpperSlant4.addOrReplaceChild(
                "cube_r30",
                CubeListBuilder.create()
                        .texOffs(0, 19)
                        .addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.0684F, -22.7088F, 1.3003F, 0.0F, 0.0F));

        PartDefinition UpperSlant5 = UpperBaseSlant.addOrReplaceChild(
                "UpperSlant5",
                CubeListBuilder.create()
                        .texOffs(0, 57)
                        .addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 69)
                        .addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r31 = UpperSlant5.addOrReplaceChild(
                "cube_r31",
                CubeListBuilder.create()
                        .texOffs(70, 60)
                        .addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.7662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition cube_r32 = UpperSlant5.addOrReplaceChild(
                "cube_r32",
                CubeListBuilder.create()
                        .texOffs(0, 19)
                        .addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.0684F, -22.7088F, 1.3003F, 0.0F, 0.0F));

        PartDefinition UpperSlant6 = UpperBaseSlant.addOrReplaceChild(
                "UpperSlant6",
                CubeListBuilder.create()
                        .texOffs(0, 57)
                        .addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 69)
                        .addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r33 = UpperSlant6.addOrReplaceChild(
                "cube_r33",
                CubeListBuilder.create()
                        .texOffs(70, 75)
                        .addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.7662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition cube_r34 = UpperSlant6.addOrReplaceChild(
                "cube_r34",
                CubeListBuilder.create()
                        .texOffs(0, 19)
                        .addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -5.0684F, -22.7088F, 1.3003F, 0.0F, 0.0F));

        PartDefinition PanelDividers = Console.addOrReplaceChild(
                "PanelDividers", CubeListBuilder.create(), PartPose.offset(-0.25F, 8.0F, 0.0F));

        PartDefinition Part1 = PanelDividers.addOrReplaceChild(
                "Part1", CubeListBuilder.create(), PartPose.offset(0.0F, -7.0478F, 0.0F));

        PartDefinition cube_r35 = Part1.addOrReplaceChild(
                "cube_r35",
                CubeListBuilder.create()
                        .texOffs(43, 43)
                        .addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(-13.8539F, -17.3F, -23.9757F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition Part2 = PanelDividers.addOrReplaceChild(
                "Part2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.0478F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r36 = Part2.addOrReplaceChild(
                "cube_r36",
                CubeListBuilder.create()
                        .texOffs(43, 43)
                        .addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(-13.8539F, -0.5F, -23.9757F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition Part3 = PanelDividers.addOrReplaceChild(
                "Part3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.0478F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r37 = Part3.addOrReplaceChild(
                "cube_r37",
                CubeListBuilder.create()
                        .texOffs(43, 43)
                        .addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(-13.8539F, -0.5F, -23.9757F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition Part4 = PanelDividers.addOrReplaceChild(
                "Part4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.0478F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r38 = Part4.addOrReplaceChild(
                "cube_r38",
                CubeListBuilder.create()
                        .texOffs(43, 43)
                        .addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(-13.8539F, -0.5F, -23.9757F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition Part5 = PanelDividers.addOrReplaceChild(
                "Part5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.0478F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r39 = Part5.addOrReplaceChild(
                "cube_r39",
                CubeListBuilder.create()
                        .texOffs(43, 43)
                        .addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(-13.8539F, -0.5F, -23.9757F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition Part6 = PanelDividers.addOrReplaceChild(
                "Part6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.0478F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r40 = Part6.addOrReplaceChild(
                "cube_r40",
                CubeListBuilder.create()
                        .texOffs(43, 43)
                        .addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(-13.8539F, -0.5F, -23.9757F, 0.3054F, 0.5236F, 0.0F));

        PartDefinition UnderconsoleBaseSlant = Console.addOrReplaceChild(
                "UnderconsoleBaseSlant", CubeListBuilder.create(), PartPose.offset(-0.25F, 15.5F, 0.0F));

        PartDefinition Slant1 = UnderconsoleBaseSlant.addOrReplaceChild(
                "Slant1", CubeListBuilder.create(), PartPose.offset(0.0F, -7.5F, 0.0F));

        PartDefinition cube_r41 = Slant1.addOrReplaceChild(
                "cube_r41",
                CubeListBuilder.create()
                        .texOffs(0, 53)
                        .addBox(-6.0F, 0.25F, -0.5F, 29.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(10.9864F, -22.5434F, -19.029F, -2.6068F, -0.9507F, 2.5124F));

        PartDefinition Slant2 = UnderconsoleBaseSlant.addOrReplaceChild(
                "Slant2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r42 = Slant2.addOrReplaceChild(
                "cube_r42",
                CubeListBuilder.create()
                        .texOffs(0, 53)
                        .addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(10.9864F, -5.7434F, -19.029F, -2.6068F, -0.9507F, 2.5124F));

        PartDefinition Slant3 = UnderconsoleBaseSlant.addOrReplaceChild(
                "Slant3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r43 = Slant3.addOrReplaceChild(
                "cube_r43",
                CubeListBuilder.create()
                        .texOffs(0, 53)
                        .addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(10.9864F, -5.7434F, -19.029F, -2.6068F, -0.9507F, 2.5124F));

        PartDefinition Slant4 = UnderconsoleBaseSlant.addOrReplaceChild(
                "Slant4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r44 = Slant4.addOrReplaceChild(
                "cube_r44",
                CubeListBuilder.create()
                        .texOffs(0, 53)
                        .addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(10.9864F, -5.7434F, -19.029F, -2.6068F, -0.9507F, 2.5124F));

        PartDefinition Slant5 = UnderconsoleBaseSlant.addOrReplaceChild(
                "Slant5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r45 = Slant5.addOrReplaceChild(
                "cube_r45",
                CubeListBuilder.create()
                        .texOffs(0, 53)
                        .addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(10.9864F, -5.7434F, -19.029F, -2.6068F, -0.9507F, 2.5124F));

        PartDefinition Slant6 = UnderconsoleBaseSlant.addOrReplaceChild(
                "Slant6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r46 = Slant6.addOrReplaceChild(
                "cube_r46",
                CubeListBuilder.create()
                        .texOffs(0, 53)
                        .addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, new CubeDeformation(-0.01F)),
                PartPose.offsetAndRotation(10.9864F, -5.7434F, -19.029F, -2.6068F, -0.9507F, 2.5124F));

        PartDefinition ConsoleCover = Console.addOrReplaceChild(
                "ConsoleCover",
                CubeListBuilder.create()
                        .texOffs(8, 97)
                        .addBox(-15.0F, -23.8F, -15.0F, 30.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.25F, 8.0F, 0.0F));

        PartDefinition cube_r47 = ConsoleCover.addOrReplaceChild(
                "cube_r47",
                CubeListBuilder.create()
                        .texOffs(33, 106)
                        .addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, -1.5708F, 1.0472F, 0.0F));

        PartDefinition cube_r48 = ConsoleCover.addOrReplaceChild(
                "cube_r48",
                CubeListBuilder.create()
                        .texOffs(33, 106)
                        .addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, -1.5708F, 2.0944F, 0.0F));

        PartDefinition cube_r49 = ConsoleCover.addOrReplaceChild(
                "cube_r49",
                CubeListBuilder.create()
                        .texOffs(33, 106)
                        .addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, -1.5708F, 3.1416F, 0.0F));

        PartDefinition cube_r50 = ConsoleCover.addOrReplaceChild(
                "cube_r50",
                CubeListBuilder.create()
                        .texOffs(33, 106)
                        .addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, -1.5708F, -2.0944F, 0.0F));

        PartDefinition cube_r51 = ConsoleCover.addOrReplaceChild(
                "cube_r51",
                CubeListBuilder.create()
                        .texOffs(33, 106)
                        .addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, -1.5708F, -1.0472F, 0.0F));

        PartDefinition cube_r52 = ConsoleCover.addOrReplaceChild(
                "cube_r52",
                CubeListBuilder.create()
                        .texOffs(33, 106)
                        .addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, -1.5708F, 0.0F, 0.0F));

        PartDefinition TimeRotor = partdefinition.addOrReplaceChild(
                "TimeRotor", CubeListBuilder.create(), PartPose.offset(0.0F, 24.75F, 0.0F));

        PartDefinition Glass =
                TimeRotor.addOrReplaceChild("Glass", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r53 = Glass.addOrReplaceChild(
                "cube_r53",
                CubeListBuilder.create()
                        .texOffs(0, 61)
                        .addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, new CubeDeformation(0.011F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition cube_r54 = Glass.addOrReplaceChild(
                "cube_r54",
                CubeListBuilder.create()
                        .texOffs(0, 61)
                        .addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r55 = Glass.addOrReplaceChild(
                "cube_r55",
                CubeListBuilder.create()
                        .texOffs(0, 61)
                        .addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, new CubeDeformation(0.011F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r56 = Glass.addOrReplaceChild(
                "cube_r56",
                CubeListBuilder.create()
                        .texOffs(0, 61)
                        .addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r57 = Glass.addOrReplaceChild(
                "cube_r57",
                CubeListBuilder.create()
                        .texOffs(0, 61)
                        .addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, new CubeDeformation(0.01F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r58 = Glass.addOrReplaceChild(
                "cube_r58",
                CubeListBuilder.create()
                        .texOffs(0, 61)
                        .addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, new CubeDeformation(0.011F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition Rotor = TimeRotor.addOrReplaceChild(
                "Rotor",
                CubeListBuilder.create()
                        .texOffs(0, 103)
                        .addBox(-3.0F, -31.8F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.5F))
                        .texOffs(0, 112)
                        .addBox(-3.0F, -33.8F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(124, 99)
                        .addBox(-0.5F, -41.8F, -0.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(18, 112)
                        .addBox(0.0F, -40.8F, -2.5F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 114)
                        .addBox(-4.0F, -42.8F, -4.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(10, 114)
                        .addBox(3.0F, -42.8F, -4.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(10, 114)
                        .addBox(-0.5F, -42.8F, 3.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(0, 114)
                        .addBox(-4.0F, -33.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F))
                        .texOffs(0, 114)
                        .addBox(3.0F, -33.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RotorRing = Rotor.addOrReplaceChild(
                "RotorRing",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -34.8F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -1.0F, 0.0F));

        PartDefinition cube_r59 = RotorRing.addOrReplaceChild(
                "cube_r59",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r60 = RotorRing.addOrReplaceChild(
                "cube_r60",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r61 = RotorRing.addOrReplaceChild(
                "cube_r61",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 2.3562F, 0.0F));

        PartDefinition cube_r62 = RotorRing.addOrReplaceChild(
                "cube_r62",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r63 = RotorRing.addOrReplaceChild(
                "cube_r63",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -2.3562F, 0.0F));

        PartDefinition cube_r64 = RotorRing.addOrReplaceChild(
                "cube_r64",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r65 = RotorRing.addOrReplaceChild(
                "cube_r65",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition RotorRing2 = Rotor.addOrReplaceChild(
                "RotorRing2",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -34.8F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -8.0F, 0.0F));

        PartDefinition cube_r66 = RotorRing2.addOrReplaceChild(
                "cube_r66",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r67 = RotorRing2.addOrReplaceChild(
                "cube_r67",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r68 = RotorRing2.addOrReplaceChild(
                "cube_r68",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 2.3562F, 0.0F));

        PartDefinition cube_r69 = RotorRing2.addOrReplaceChild(
                "cube_r69",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r70 = RotorRing2.addOrReplaceChild(
                "cube_r70",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -2.3562F, 0.0F));

        PartDefinition cube_r71 = RotorRing2.addOrReplaceChild(
                "cube_r71",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r72 = RotorRing2.addOrReplaceChild(
                "cube_r72",
                CubeListBuilder.create()
                        .texOffs(0, 126)
                        .addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.8F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition Controls = partdefinition.addOrReplaceChild(
                "Controls", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Throttle =
                Controls.addOrReplaceChild("Throttle", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r73 = Throttle.addOrReplaceChild(
                "cube_r73",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-8.25F, 5.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.25F, -22.5662F, -22.9736F, 1.946F, 0.0F, 0.0F));

        PartDefinition DoorControl = Controls.addOrReplaceChild(
                "DoorControl",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition DoorControlTranslate = DoorControl.addOrReplaceChild(
                "DoorControlTranslate", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7662F, -22.9736F));

        PartDefinition cube_r74 = DoorControlTranslate.addOrReplaceChild(
                "cube_r74",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, 10.6572F, 15.381F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.946F, 0.0F, 0.0F));

        PartDefinition Handbrake = Controls.addOrReplaceChild(
                "Handbrake", CubeListBuilder.create(), PartPose.offset(0.0F, -5.7662F, -22.9736F));

        PartDefinition cube_r75 = Handbrake.addOrReplaceChild(
                "cube_r75",
                CubeListBuilder.create()
                        .texOffs(68, 105)
                        .addBox(-3.25F, 5.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.25F, -16.8F, 0.0F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLeversPanel1 = Controls.addOrReplaceChild(
                "MiniLeversPanel1", CubeListBuilder.create(), PartPose.offset(3.875F, -8.0162F, -18.5361F));

        PartDefinition MiniLever1 = MiniLeversPanel1.addOrReplaceChild(
                "MiniLever1",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.125F, -0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r76 = MiniLever1.addOrReplaceChild(
                "cube_r76",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.875F, -1.5206F, 15.4342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.875F, -1.5206F, 16.8092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever2 = MiniLeversPanel1.addOrReplaceChild(
                "MiniLever2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(1.0F, 0.0F, 0.125F, 0.9163F, 0.0F, 0.0F));

        PartDefinition cube_r77 = MiniLever2.addOrReplaceChild(
                "cube_r77",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.875F, 20.6492F, 4.3807F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.875F, 20.6492F, 5.7557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever3 = MiniLeversPanel1.addOrReplaceChild(
                "MiniLever3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(2.0F, 0.0F, 0.125F, 0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r78 = MiniLever3.addOrReplaceChild(
                "cube_r78",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.875F, 18.5093F, 9.0225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.875F, 18.5093F, 10.3975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever4 = MiniLeversPanel1.addOrReplaceChild(
                "MiniLever4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(3.0F, 0.0F, 0.125F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r79 = MiniLever4.addOrReplaceChild(
                "cube_r79",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.875F, 4.2068F, 16.5474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.875F, 4.2068F, 17.9224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever5 = MiniLeversPanel1.addOrReplaceChild(
                "MiniLever5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(4.0F, 0.0F, 0.125F, -0.8727F, 0.0F, 0.0F));

        PartDefinition cube_r80 = MiniLever5.addOrReplaceChild(
                "cube_r80",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.875F, -3.5163F, 14.5141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.875F, -3.5163F, 15.8891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLeversPanel2 = Controls.addOrReplaceChild(
                "MiniLeversPanel2", CubeListBuilder.create(), PartPose.offset(3.625F, -8.0162F, -18.5361F));

        PartDefinition Panel2Rot = MiniLeversPanel2.addOrReplaceChild(
                "Panel2Rot",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-9.625F, 6.5162F, 15.5361F, 0.0F, -1.0472F, 0.0F));

        PartDefinition MiniLever6 = Panel2Rot.addOrReplaceChild(
                "MiniLever6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(3.625F, -8.0162F, -18.4111F, -0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r81 = MiniLever6.addOrReplaceChild(
                "cube_r81",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.75F, -1.5206F, 15.4342F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.75F, -1.5206F, 16.8092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever7 = Panel2Rot.addOrReplaceChild(
                "MiniLever7",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(4.625F, -8.0162F, -18.4111F, 0.9163F, 0.0F, 0.0F));

        PartDefinition cube_r82 = MiniLever7.addOrReplaceChild(
                "cube_r82",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-1.0F, 20.6492F, 4.3807F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-1.0F, 20.6492F, 5.7557F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever8 = Panel2Rot.addOrReplaceChild(
                "MiniLever8",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(5.625F, -8.0162F, -18.4111F, 0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r83 = MiniLever8.addOrReplaceChild(
                "cube_r83",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-1.25F, 18.5093F, 9.0225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-1.25F, 18.5093F, 10.3975F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever9 = Panel2Rot.addOrReplaceChild(
                "MiniLever9",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(6.625F, -8.0162F, -18.4111F, -0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r84 = MiniLever9.addOrReplaceChild(
                "cube_r84",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-1.5F, 4.2068F, 16.5474F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-1.5F, 4.2068F, 17.9224F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever10 = Panel2Rot.addOrReplaceChild(
                "MiniLever10",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(7.625F, -8.0162F, -18.4111F, -0.8727F, 0.0F, 0.0F));

        PartDefinition cube_r85 = MiniLever10.addOrReplaceChild(
                "cube_r85",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-1.75F, -3.5163F, 14.5141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-1.75F, -3.5163F, 15.8891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever11 = Panel2Rot.addOrReplaceChild(
                "MiniLever11",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(8.375F, -8.0162F, -18.4111F, -0.8727F, 0.0F, 0.0F));

        PartDefinition cube_r86 = MiniLever11.addOrReplaceChild(
                "cube_r86",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-1.75F, -3.5163F, 14.5141F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-1.75F, -3.5163F, 15.8891F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLeversPanel5 = Controls.addOrReplaceChild(
                "MiniLeversPanel5", CubeListBuilder.create(), PartPose.offset(3.625F, -8.0162F, -18.5361F));

        PartDefinition Panel5Rot = MiniLeversPanel5.addOrReplaceChild(
                "Panel5Rot",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(3.375F, 6.2662F, 22.2861F, 0.0F, 2.0944F, 0.0F));

        PartDefinition MiniLever12 = Panel5Rot.addOrReplaceChild(
                "MiniLever12",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(3.75F, -8.0162F, -18.4111F, -0.7418F, 0.0F, 0.0F));

        PartDefinition cube_r87 = MiniLever12.addOrReplaceChild(
                "cube_r87",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.4375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.5F, -0.5F, 0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.125F, -12.1435F, -11.3285F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever13 = Panel5Rot.addOrReplaceChild(
                "MiniLever13",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(4.0F, -6.6412F, -21.7861F, 0.9163F, 0.0F, 0.0F));

        PartDefinition cube_r88 = MiniLever13.addOrReplaceChild(
                "cube_r88",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.6875F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.5F, -0.5F, 0.6875F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(-0.125F, -10.216F, 13.2581F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever14 = Panel5Rot.addOrReplaceChild(
                "MiniLever14",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(4.25F, -5.5162F, -25.0361F, 0.6109F, 0.0F, 0.0F));

        PartDefinition cube_r89 = MiniLever14.addOrReplaceChild(
                "cube_r89",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.4375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.5F, -0.5F, 0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(-0.375F, -13.5181F, 9.6576F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLever15 = Panel5Rot.addOrReplaceChild(
                "MiniLever15",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(6.0F, -5.3912F, -24.7861F, -0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r90 = MiniLever15.addOrReplaceChild(
                "cube_r90",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-1.5F, -2.199F, 15.1566F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-1.5F, -2.199F, 16.5316F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.375F, 2.25F, -4.5625F, 1.946F, 0.0F, 0.0F));

        PartDefinition MiniLeverPanel6 = Controls.addOrReplaceChild(
                "MiniLeverPanel6", CubeListBuilder.create(), PartPose.offset(3.625F, -8.0162F, -18.5361F));

        PartDefinition Panel5Rot2 = MiniLeverPanel6.addOrReplaceChild(
                "Panel5Rot2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(3.375F, 3.0162F, 22.2861F, 0.0F, 1.0472F, 0.0F));

        PartDefinition MiniLever19 = Panel5Rot2.addOrReplaceChild(
                "MiniLever19",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-5.25F, -21.3466F, -22.4944F, -0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r91 = MiniLever19.addOrReplaceChild(
                "cube_r91",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.4375F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F))
                        .texOffs(68, 105)
                        .addBox(-0.5F, -0.5F, 0.9375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, 0.2938F, 0.0135F, 1.946F, 0.0F, 0.0F));

        PartDefinition Random =
                Controls.addOrReplaceChild("Random", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rando =
                Random.addOrReplaceChild("rando", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r92 = rando.addOrReplaceChild(
                "cube_r92",
                CubeListBuilder.create()
                        .texOffs(68, 101)
                        .addBox(2.8333F, 2.9792F, -0.6042F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(3.0417F, -24.186F, -19.8275F, 1.946F, 0.0F, 0.0F));

        PartDefinition bone5 = cube_r92.addOrReplaceChild(
                "bone5",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(1.3333F, -1.1458F, 0.0208F));

        PartDefinition bone4 = cube_r92.addOrReplaceChild(
                "bone4",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(-0.6667F, -1.2708F, 0.0208F));

        PartDefinition bone3 = cube_r92.addOrReplaceChild(
                "bone3",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.3333F, -0.6458F, 0.0208F));

        PartDefinition bone2 = cube_r92.addOrReplaceChild(
                "bone2",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(-1.6667F, -1.0208F, 0.0208F));

        PartDefinition bone = cube_r92.addOrReplaceChild(
                "bone",
                CubeListBuilder.create()
                        .texOffs(68, 105)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(-2.6667F, -0.3958F, 0.0208F));

        PartDefinition cube_r93 = rando.addOrReplaceChild(
                "cube_r93",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(5.5F, 14.375F, -9.0986F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.125F))
                        .texOffs(68, 105)
                        .addBox(0.75F, 18.625F, -9.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, -22.5662F, 0.0F, -1.1956F, -2.0944F, 0.0F));

        PartDefinition cube_r94 = rando.addOrReplaceChild(
                "cube_r94",
                CubeListBuilder.create()
                        .texOffs(70, 112)
                        .addBox(1.625F, 14.5F, -8.8486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F))
                        .texOffs(70, 112)
                        .addBox(-2.625F, 14.5F, -8.8486F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.25F)),
                PartPose.offsetAndRotation(0.0F, -22.5662F, 0.0F, -1.1956F, 3.1416F, 0.0F));

        PartDefinition cube_r95 = rando.addOrReplaceChild(
                "cube_r95",
                CubeListBuilder.create()
                        .texOffs(69, 108)
                        .addBox(8.25F, 18.5F, -9.3486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 108)
                        .addBox(7.0F, 18.5F, -9.3486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(68, 105)
                        .addBox(2.625F, 18.75F, -9.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, -22.5662F, 0.0F, -1.1956F, 2.0944F, 0.0F));

        PartDefinition cube_r96 = rando.addOrReplaceChild(
                "cube_r96",
                CubeListBuilder.create()
                        .texOffs(69, 108)
                        .addBox(6.625F, 16.5F, -9.3486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(69, 108)
                        .addBox(8.625F, 16.5F, -9.3486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(69, 108)
                        .addBox(7.625F, 16.5F, -9.3486F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -22.5662F, 0.0F, -1.1956F, 1.0472F, 0.0F));

        PartDefinition cube_r97 = rando.addOrReplaceChild(
                "cube_r97",
                CubeListBuilder.create()
                        .texOffs(68, 105)
                        .addBox(4.125F, 19.0F, -9.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F))
                        .texOffs(68, 105)
                        .addBox(-5.125F, 19.0F, -9.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, -22.5662F, 0.0F, -1.1956F, -1.0472F, 0.0F));

        PartDefinition randomizer =
                rando.addOrReplaceChild("randomizer", CubeListBuilder.create(), PartPose.offset(0.0F, -22.5662F, 0.0F));

        PartDefinition cube_r98 = randomizer.addOrReplaceChild(
                "cube_r98",
                CubeListBuilder.create()
                        .texOffs(68, 105)
                        .addBox(6.75F, 18.625F, -9.0986F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1956F, -2.0944F, 0.0F));

        PartDefinition fastret =
                rando.addOrReplaceChild("fastret", CubeListBuilder.create(), PartPose.offset(0.0F, -22.5662F, 0.0F));

        PartDefinition cube_r100 = fastret.addOrReplaceChild(
                "cube_r100",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(-6.75F, 13.5F, -9.0986F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1956F, 3.1416F, 0.0F));

        PartDefinition stabs =
                rando.addOrReplaceChild("stabs", CubeListBuilder.create(), PartPose.offset(0.0F, -22.5662F, 0.0F));

        PartDefinition cube_r101 = stabs.addOrReplaceChild(
                "cube_r101",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(4.75F, 13.5F, -9.0986F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1956F, 3.1416F, 0.0F));

        PartDefinition Swivelers = Random.addOrReplaceChild(
                "Swivelers", CubeListBuilder.create(), PartPose.offset(3.625F, -8.0162F, -18.5361F));

        PartDefinition Panel2 = Swivelers.addOrReplaceChild(
                "Panel2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-3.625F, 1.0F, 18.5361F, 0.0F, -1.0472F, 0.0F));

        PartDefinition Swiv1 = Panel2.addOrReplaceChild(
                "Swiv1",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-4.75F, -1.25F, -18.0361F));

        PartDefinition SwivCap1 = Swiv1.addOrReplaceChild(
                "SwivCap1",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.0F, -0.875F, -0.0625F));

        PartDefinition Swiv2 = Panel2.addOrReplaceChild(
                "Swiv2",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(4.75F, -1.25F, -18.0361F));

        PartDefinition SwivCap2 = Swiv2.addOrReplaceChild(
                "SwivCap2",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offset(0.0F, -0.875F, -0.0625F));

        PartDefinition Panel5 = Swivelers.addOrReplaceChild(
                "Panel5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-3.625F, 1.0F, 18.5361F, 0.0F, 2.0944F, 0.0F));

        PartDefinition Swiv3 = Panel5.addOrReplaceChild(
                "Swiv3",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-8.125F, 0.0F, -20.6611F));

        PartDefinition SwivCap3 = Swiv3.addOrReplaceChild(
                "SwivCap3",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, -0.6109F, 0.0F));

        PartDefinition Swiv4 = Panel5.addOrReplaceChild(
                "Swiv4",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-9.625F, 0.125F, -21.4111F));

        PartDefinition SwivCap4 = Swiv4.addOrReplaceChild(
                "SwivCap4",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, 1.0472F, 0.0F));

        PartDefinition Swiv5 = Panel5.addOrReplaceChild(
                "Swiv5",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.875F, -1.875F, -16.7861F));

        PartDefinition SwivCap5 = Swiv5.addOrReplaceChild(
                "SwivCap5",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, 1.0472F, 0.0F));

        PartDefinition Swiv6 = Panel5.addOrReplaceChild(
                "Swiv6",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.875F, -1.875F, -16.7861F));

        PartDefinition SwivCap6 = Swiv6.addOrReplaceChild(
                "SwivCap6",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, -0.4363F, 0.0F));

        PartDefinition Panel6 = Swivelers.addOrReplaceChild(
                "Panel6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-3.625F, 1.0F, 18.5361F, 0.0F, 1.0472F, 0.0F));

        PartDefinition Swiv8 = Panel6.addOrReplaceChild(
                "Swiv8",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-9.375F, 0.125F, -21.1611F));

        PartDefinition SwivCap8 = Swiv8.addOrReplaceChild(
                "SwivCap8",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, 0.0436F, 0.0F));

        PartDefinition Swiv7 = Panel6.addOrReplaceChild(
                "Swiv7",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-7.375F, 0.125F, -21.1611F));

        PartDefinition SwivCap7 = Swiv7.addOrReplaceChild(
                "SwivCap7",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, -0.4363F, 0.0F));

        PartDefinition Swiv9 = Panel6.addOrReplaceChild(
                "Swiv9",
                CubeListBuilder.create()
                        .texOffs(69, 113)
                        .addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.25F, -15.2861F));

        PartDefinition SwivCap9 = Swiv9.addOrReplaceChild(
                "SwivCap9",
                CubeListBuilder.create()
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.125F))
                        .texOffs(69, 115)
                        .addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)),
                PartPose.offsetAndRotation(0.0F, -0.875F, -0.0625F, 0.0F, 1.0472F, 0.0F));

        PartDefinition Refueller = partdefinition.addOrReplaceChild(
                "Refueller",
                CubeListBuilder.create()
                        .texOffs(68, 105)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(-5.0F, -0.8799F, -17.7255F, 0.3491F, 0.0F, 0.0F));

        PartDefinition DimensionControl = partdefinition.addOrReplaceChild(
                "DimensionControl", CubeListBuilder.create(), PartPose.offset(0.0F, 1.4338F, 0.0F));

        PartDefinition cube_r99 = DimensionControl.addOrReplaceChild(
                "cube_r99",
                CubeListBuilder.create()
                        .texOffs(68, 108)
                        .addBox(1.0F, 14.375F, -9.0986F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.125F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1956F, -2.0944F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild(
                "bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnimations(T t, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent(tardis -> {
            this.animate(t.rotorAnimationState, HartnellModelAnimation.ROTOR, ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.INCREMENT.get())
                            .getUseAnimationState(),
                    HartnellModelAnimation.INCREMENT_MODIFIER,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.LANDING_TYPE.get())
                            .getUseAnimationState(),
                    HartnellModelAnimation.LANDING_TYPE,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.REFUELER.get())
                            .getUseAnimationState(),
                    HartnellModelAnimation.REFUELER,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.X.get()).getUseAnimationState(),
                    HartnellModelAnimation.X,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.Y.get()).getUseAnimationState(),
                    HartnellModelAnimation.Y,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.Z.get()).getUseAnimationState(),
                    HartnellModelAnimation.Z,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.FACING.get()).getUseAnimationState(),
                    HartnellModelAnimation.FACING,
                    ageInTicks);
            HartnellModelAnimation.animateConditional(tardis, this, ageInTicks);
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
        TimeRotor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Controls.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Refueller.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        DimensionControl.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public static class HartnellModelAnimation {
        public static final AnimationDefinition X = AnimationDefinition.Builder.withLength(1.0F)
                .addAnimation(
                        "cube_r87",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(92.5F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition Y = AnimationDefinition.Builder.withLength(1.0F)
                .addAnimation(
                        "cube_r88",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(-100.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition Z = AnimationDefinition.Builder.withLength(1.0F)
                .addAnimation(
                        "cube_r89",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(-82.5F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition REFUELER = AnimationDefinition.Builder.withLength(1.0F)
                .addAnimation(
                        "cube_r92",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "bone5",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.6667F,
                                        KeyframeAnimations.posVec(0.0F, 0.37F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "bone4",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "bone3",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "bone2",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.7083F,
                                        KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "bone",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition FACING = AnimationDefinition.Builder.withLength(0.75F)
                .addAnimation(
                        "SwivCap9",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, -62.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, -260.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.75F,
                                        KeyframeAnimations.degreeVec(0.0F, -360.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition LANDING_TYPE = AnimationDefinition.Builder.withLength(1.0F)
                .addAnimation(
                        "cube_r91",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(90.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition INCREMENT_MODIFIER = AnimationDefinition.Builder.withLength(0.75F)
                .addAnimation(
                        "SwivCap6",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, 87.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 275.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.75F,
                                        KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition ROTOR = AnimationDefinition.Builder.withLength(2.0F)
                .looping()
                .addAnimation(
                        "TimeRotor",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.0F,
                                        KeyframeAnimations.posVec(0.0F, -6.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        1.5F,
                                        KeyframeAnimations.posVec(0.0F, -2.5F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        2.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "cube_r56",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "Rotor",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        2.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 350.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static void animateConditional(ITardisLevel tardis, HartnellConsoleModel<?> model, float ageInTicks) {
            final ControlDataFloat throttle = tardis.getControlDataOrCreate(ControlRegistry.THROTTLE.get());
            final ControlDataBool handbrake = tardis.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get());

            model.getAnyDescendantWithName("Throttle")
                    .ifPresent(control -> control.offsetRotation(AnimationHelper.slideBasedOnState(
                            throttle,
                            142.5F,
                            throttle.getPrevious(),
                            throttle.get(),
                            ageInTicks,
                            20,
                            new Vector3f(1, 0, 0))));

            model.getAnyDescendantWithName("Handbrake")
                    .ifPresent(control -> control.offsetRotation(new Vector3f(AnimationHelper.slideBasedOnState(
                            handbrake, -42.5F, (!handbrake.get() ? 1 : 0), ageInTicks, 20, 5, new Vector3f(1, 0, 0)))));
        }
    }
}
