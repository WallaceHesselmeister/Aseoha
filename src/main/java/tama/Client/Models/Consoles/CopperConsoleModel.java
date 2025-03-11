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
import tama.TileEntities.Console.CopperConsoleTile;
import tama.aseoha;

import java.util.Optional;

public class CopperConsoleModel<T extends CopperConsoleTile> extends BasicTileHierarchicalModel<T> implements IAdditionalConsoleRenderData {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(aseoha.MODID, "copperconsolemodel"), "main");

    private final ModelPart base;
    private final ModelPart side;
    private final ModelPart bone;
    private final ModelPart bone14;
    private final ModelPart bone15;
    private final ModelPart bone4;
    private final ModelPart bone13;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart throttle;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart fastreturn;
    private final ModelPart bone7;
    private final ModelPart bone8;
    private final ModelPart bone12;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart bone11;
    private final ModelPart side2;
    private final ModelPart bone16;
    private final ModelPart bone23_r1;
    private final ModelPart bone22_r1;
    private final ModelPart bone21_r1;
    private final ModelPart bone23_r2;
    private final ModelPart bone22_r2;
    private final ModelPart bone21_r2;
    private final ModelPart bone23_r3;
    private final ModelPart bone22_r3;
    private final ModelPart bone21_r3;
    private final ModelPart bone20_r1;
    private final ModelPart bone21_r4;
    private final ModelPart bone20_r2;
    private final ModelPart bone19_r1;
    private final ModelPart bone18_r1;
    private final ModelPart bone17;
    private final ModelPart bone18;
    private final ModelPart bone19;
    private final ModelPart bone151;
    private final ModelPart yswitch;
    private final ModelPart xswitch;
    private final ModelPart zswitch;
    private final ModelPart bone20;
    private final ModelPart bone21;
    private final ModelPart bone22;
    private final ModelPart bone154;
    private final ModelPart bone23;
    private final ModelPart doorcontrol;
    private final ModelPart bone24;
    private final ModelPart bone25;
    private final ModelPart bone26;
    private final ModelPart bone27;
    private final ModelPart bone28;
    private final ModelPart bone29;
    private final ModelPart bone30;
    private final ModelPart side3;
    private final ModelPart bone31;
    private final ModelPart bone31_r1;
    private final ModelPart telepathic;
    private final ModelPart telepathic_r1;
    private final ModelPart bone32;
    private final ModelPart bone33;
    private final ModelPart bone34;
    private final ModelPart bone165;
    private final ModelPart bone166;
    private final ModelPart bone34_r1;
    private final ModelPart bone35;
    private final ModelPart bone36;
    private final ModelPart bone37;
    private final ModelPart verticallanding_r1;
    private final ModelPart verticallanding;
    private final ModelPart bone38;
    private final ModelPart bone39;
    private final ModelPart bone40;
    private final ModelPart bone41;
    private final ModelPart bone42;
    private final ModelPart bone43;
    private final ModelPart bone44;
    private final ModelPart bone45;
    private final ModelPart side4;
    private final ModelPart bone46;
    private final ModelPart phone;
    private final ModelPart bone47;
    private final ModelPart bone48;
    private final ModelPart bone49;
    private final ModelPart randomiser;
    private final ModelPart bone164;
    private final ModelPart bone160;
    private final ModelPart bone161;
    private final ModelPart bone162;
    private final ModelPart bone150;
    private final ModelPart bone152;
    private final ModelPart bone159;
    private final ModelPart bone158;
    private final ModelPart bone153;
    private final ModelPart bone155;
    private final ModelPart bone156;
    private final ModelPart bone157;
    private final ModelPart bone163;
    private final ModelPart bone146;
    private final ModelPart bone148;
    private final ModelPart bone50;
    private final ModelPart bone51;
    private final ModelPart bone52;
    private final ModelPart bone53_r1;
    private final ModelPart bone53;
    private final ModelPart bone54;
    private final ModelPart bone55;
    private final ModelPart bone56;
    private final ModelPart bone57;
    private final ModelPart bone58;
    private final ModelPart bone59;
    private final ModelPart bone60;
    private final ModelPart side5;
    private final ModelPart bone61;
    private final ModelPart bone62;
    private final ModelPart bone63;
    private final ModelPart bone64;
    private final ModelPart bone64_r1;
    private final ModelPart bone64_r2;
    private final ModelPart sonicport;
    private final ModelPart bluestab;
    private final ModelPart bone65;
    private final ModelPart bone66;
    private final ModelPart bone67;
    private final ModelPart bone67_r1;
    private final ModelPart incrementincrease;
    private final ModelPart bone68;
    private final ModelPart bone69;
    private final ModelPart handbreak_r1;
    private final ModelPart handbreak;
    private final ModelPart bone70;
    private final ModelPart bone71;
    private final ModelPart bone72;
    private final ModelPart bone73;
    private final ModelPart bone74;
    private final ModelPart bone75;
    private final ModelPart side6;
    private final ModelPart bone76;
    private final ModelPart bone82_r1;
    private final ModelPart bone78_r1;
    private final ModelPart bone80_r1;
    private final ModelPart bone79_r1;
    private final ModelPart bone80_r2;
    private final ModelPart bone79_r2;
    private final ModelPart bone82_r2;
    private final ModelPart bone81_r1;
    private final ModelPart bone79_r3;
    private final ModelPart bone81_r2;
    private final ModelPart bone80_r3;
    private final ModelPart bone79_r4;
    private final ModelPart bone147;
    private final ModelPart bone147_r1;
    private final ModelPart bone147_r2;
    private final ModelPart bone147_r3;
    private final ModelPart facingcontrol;
    private final ModelPart bone77;
    private final ModelPart bone78;
    private final ModelPart bone79;
    private final ModelPart bone149;
    private final ModelPart bone80;
    private final ModelPart bone81;
    private final ModelPart bone82;
    private final ModelPart bone83;
    private final ModelPart bone84;
    private final ModelPart refuel;
    private final ModelPart bone85;
    private final ModelPart bone86;
    private final ModelPart bone87;
    private final ModelPart bone88;
    private final ModelPart bone89;
    private final ModelPart bone90;
    private final ModelPart bone95;
    private final ModelPart bone94;
    private final ModelPart bone93;
    private final ModelPart bone92;
    private final ModelPart bone91;
    private final ModelPart bone92_r1;
    private final ModelPart bone91_r1;
    private final ModelPart bone96;
    private final ModelPart bone97;
    private final ModelPart bone98;
    private final ModelPart bone99;
    private final ModelPart bone100;
    private final ModelPart bone101;
    private final ModelPart bone102;
    private final ModelPart bone103;
    private final ModelPart bone104;
    private final ModelPart bone105;
    private final ModelPart bone106;
    private final ModelPart bone107;
    private final ModelPart bone108;
    private final ModelPart bone109;
    private final ModelPart bone110;
    private final ModelPart bone111;
    private final ModelPart bone112;
    private final ModelPart bone113;
    private final ModelPart bone114;
    private final ModelPart bone115;
    private final ModelPart bone116;
    private final ModelPart bone117;
    private final ModelPart bone118;
    private final ModelPart bone119;
    private final ModelPart bone120;
    private final ModelPart circle;
    private final ModelPart bone128;
    private final ModelPart bone129;
    private final ModelPart bone130;
    private final ModelPart bone131;
    private final ModelPart circle2;
    private final ModelPart bone132;
    private final ModelPart bone133;
    private final ModelPart bone134;
    private final ModelPart bone135;
    private final ModelPart circle3;
    private final ModelPart bone136;
    private final ModelPart bone137;
    private final ModelPart bone138;
    private final ModelPart bone139;
    private final ModelPart circle4;
    private final ModelPart bone142;
    private final ModelPart bone143;
    private final ModelPart bone144;
    private final ModelPart bone145;
    private final ModelPart rotar3;
    private final ModelPart bone121;
    private final ModelPart bone122;
    private final ModelPart bone123;
    private final ModelPart rotar2;
    private final ModelPart bone124;
    private final ModelPart bone125;
    private final ModelPart bone126;
    private final ModelPart bone127;
    private final ModelPart bone141;
    private final ModelPart bone140;
    private final ModelPart monitor;
    private final ModelPart bone140_r1;
    private final ModelPart screen;
    private final ModelPart hammer;
    private final ModelPart cube_r1;
    private final ModelPart cube_r2;
    private final ModelPart rotor;
    private final ModelPart rotortop;
    private final ModelPart rotorbottom;
    private final ModelPart controls;
    private final ModelPart bb_main;

    public CopperConsoleModel(ModelPart root) {
        super(root);
        this.base = root.getChild("base");
        this.side = this.base.getChild("side");
        this.bone = this.side.getChild("bone");
        this.bone14 = this.bone.getChild("bone14");
        this.bone15 = this.bone.getChild("bone15");
        this.bone4 = this.bone.getChild("bone4");
        this.bone13 = this.bone.getChild("bone13");
        this.bone2 = this.side.getChild("bone2");
        this.bone3 = this.bone2.getChild("bone3");
        this.throttle = this.bone3.getChild("throttle");
        this.bone5 = this.side.getChild("bone5");
        this.bone6 = this.bone5.getChild("bone6");
        this.fastreturn = this.bone6.getChild("fastreturn");
        this.bone7 = this.side.getChild("bone7");
        this.bone8 = this.bone7.getChild("bone8");
        this.bone12 = this.bone7.getChild("bone12");
        this.bone9 = this.side.getChild("bone9");
        this.bone10 = this.bone9.getChild("bone10");
        this.bone11 = this.bone10.getChild("bone11");
        this.side2 = this.base.getChild("side2");
        this.bone16 = this.side2.getChild("bone16");
        this.bone23_r1 = this.bone16.getChild("bone23_r1");
        this.bone22_r1 = this.bone16.getChild("bone22_r1");
        this.bone21_r1 = this.bone16.getChild("bone21_r1");
        this.bone23_r2 = this.bone16.getChild("bone23_r2");
        this.bone22_r2 = this.bone16.getChild("bone22_r2");
        this.bone21_r2 = this.bone16.getChild("bone21_r2");
        this.bone23_r3 = this.bone16.getChild("bone23_r3");
        this.bone22_r3 = this.bone16.getChild("bone22_r3");
        this.bone21_r3 = this.bone16.getChild("bone21_r3");
        this.bone20_r1 = this.bone16.getChild("bone20_r1");
        this.bone21_r4 = this.bone16.getChild("bone21_r4");
        this.bone20_r2 = this.bone16.getChild("bone20_r2");
        this.bone19_r1 = this.bone16.getChild("bone19_r1");
        this.bone18_r1 = this.bone16.getChild("bone18_r1");
        this.bone17 = this.bone16.getChild("bone17");
        this.bone18 = this.bone16.getChild("bone18");
        this.bone19 = this.bone16.getChild("bone19");
        this.bone151 = this.bone19.getChild("bone151");
        this.yswitch = this.bone19.getChild("yswitch");
        this.xswitch = this.bone19.getChild("xswitch");
        this.zswitch = this.bone19.getChild("zswitch");
        this.bone20 = this.bone16.getChild("bone20");
        this.bone21 = this.side2.getChild("bone21");
        this.bone22 = this.bone21.getChild("bone22");
        this.bone154 = this.bone22.getChild("bone154");
        this.bone23 = this.side2.getChild("bone23");
        this.doorcontrol = this.bone23.getChild("doorcontrol");
        this.bone24 = this.bone23.getChild("bone24");
        this.bone25 = this.side2.getChild("bone25");
        this.bone26 = this.bone25.getChild("bone26");
        this.bone27 = this.bone25.getChild("bone27");
        this.bone28 = this.side2.getChild("bone28");
        this.bone29 = this.bone28.getChild("bone29");
        this.bone30 = this.bone29.getChild("bone30");
        this.side3 = this.base.getChild("side3");
        this.bone31 = this.side3.getChild("bone31");
        this.bone31_r1 = this.bone31.getChild("bone31_r1");
        this.telepathic = this.bone31.getChild("telepathic");
        this.telepathic_r1 = this.telepathic.getChild("telepathic_r1");
        this.bone32 = this.bone31.getChild("bone32");
        this.bone33 = this.bone31.getChild("bone33");
        this.bone34 = this.bone31.getChild("bone34");
        this.bone165 = this.bone34.getChild("bone165");
        this.bone166 = this.bone165.getChild("bone166");
        this.bone34_r1 = this.bone34.getChild("bone34_r1");
        this.bone35 = this.bone31.getChild("bone35");
        this.bone36 = this.side3.getChild("bone36");
        this.bone37 = this.bone36.getChild("bone37");
        this.verticallanding_r1 = this.bone37.getChild("verticallanding_r1");
        this.verticallanding = this.bone37.getChild("verticallanding");
        this.bone38 = this.side3.getChild("bone38");
        this.bone39 = this.bone38.getChild("bone39");
        this.bone40 = this.side3.getChild("bone40");
        this.bone41 = this.bone40.getChild("bone41");
        this.bone42 = this.bone40.getChild("bone42");
        this.bone43 = this.side3.getChild("bone43");
        this.bone44 = this.bone43.getChild("bone44");
        this.bone45 = this.bone44.getChild("bone45");
        this.side4 = this.base.getChild("side4");
        this.bone46 = this.side4.getChild("bone46");
        this.phone = this.bone46.getChild("phone");
        this.bone47 = this.bone46.getChild("bone47");
        this.bone48 = this.bone46.getChild("bone48");
        this.bone49 = this.bone46.getChild("bone49");
        this.randomiser = this.bone49.getChild("randomiser");
        this.bone164 = this.randomiser.getChild("bone164");
        this.bone160 = this.randomiser.getChild("bone160");
        this.bone161 = this.randomiser.getChild("bone161");
        this.bone162 = this.randomiser.getChild("bone162");
        this.bone150 = this.randomiser.getChild("bone150");
        this.bone152 = this.randomiser.getChild("bone152");
        this.bone159 = this.randomiser.getChild("bone159");
        this.bone158 = this.randomiser.getChild("bone158");
        this.bone153 = this.randomiser.getChild("bone153");
        this.bone155 = this.randomiser.getChild("bone155");
        this.bone156 = this.randomiser.getChild("bone156");
        this.bone157 = this.randomiser.getChild("bone157");
        this.bone163 = this.randomiser.getChild("bone163");
        this.bone146 = this.randomiser.getChild("bone146");
        this.bone148 = this.randomiser.getChild("bone148");
        this.bone50 = this.bone46.getChild("bone50");
        this.bone51 = this.side4.getChild("bone51");
        this.bone52 = this.bone51.getChild("bone52");
        this.bone53_r1 = this.bone52.getChild("bone53_r1");
        this.bone53 = this.side4.getChild("bone53");
        this.bone54 = this.bone53.getChild("bone54");
        this.bone55 = this.side4.getChild("bone55");
        this.bone56 = this.bone55.getChild("bone56");
        this.bone57 = this.bone55.getChild("bone57");
        this.bone58 = this.side4.getChild("bone58");
        this.bone59 = this.bone58.getChild("bone59");
        this.bone60 = this.bone59.getChild("bone60");
        this.side5 = this.base.getChild("side5");
        this.bone61 = this.side5.getChild("bone61");
        this.bone62 = this.bone61.getChild("bone62");
        this.bone63 = this.bone61.getChild("bone63");
        this.bone64 = this.bone61.getChild("bone64");
        this.bone64_r1 = this.bone64.getChild("bone64_r1");
        this.bone64_r2 = this.bone64.getChild("bone64_r2");
        this.sonicport = this.bone64.getChild("sonicport");
        this.bluestab = this.bone64.getChild("bluestab");
        this.bone65 = this.bone61.getChild("bone65");
        this.bone66 = this.side5.getChild("bone66");
        this.bone67 = this.bone66.getChild("bone67");
        this.bone67_r1 = this.bone67.getChild("bone67_r1");
        this.incrementincrease = this.bone67.getChild("incrementincrease");
        this.bone68 = this.side5.getChild("bone68");
        this.bone69 = this.bone68.getChild("bone69");
        this.handbreak_r1 = this.bone69.getChild("handbreak_r1");
        this.handbreak = this.bone69.getChild("handbreak");
        this.bone70 = this.side5.getChild("bone70");
        this.bone71 = this.bone70.getChild("bone71");
        this.bone72 = this.bone70.getChild("bone72");
        this.bone73 = this.side5.getChild("bone73");
        this.bone74 = this.bone73.getChild("bone74");
        this.bone75 = this.bone74.getChild("bone75");
        this.side6 = this.base.getChild("side6");
        this.bone76 = this.side6.getChild("bone76");
        this.bone82_r1 = this.bone76.getChild("bone82_r1");
        this.bone78_r1 = this.bone76.getChild("bone78_r1");
        this.bone80_r1 = this.bone76.getChild("bone80_r1");
        this.bone79_r1 = this.bone76.getChild("bone79_r1");
        this.bone80_r2 = this.bone76.getChild("bone80_r2");
        this.bone79_r2 = this.bone76.getChild("bone79_r2");
        this.bone82_r2 = this.bone76.getChild("bone82_r2");
        this.bone81_r1 = this.bone76.getChild("bone81_r1");
        this.bone79_r3 = this.bone76.getChild("bone79_r3");
        this.bone81_r2 = this.bone76.getChild("bone81_r2");
        this.bone80_r3 = this.bone76.getChild("bone80_r3");
        this.bone79_r4 = this.bone76.getChild("bone79_r4");
        this.bone147 = this.bone76.getChild("bone147");
        this.bone147_r1 = this.bone147.getChild("bone147_r1");
        this.bone147_r2 = this.bone147.getChild("bone147_r2");
        this.bone147_r3 = this.bone147.getChild("bone147_r3");
        this.facingcontrol = this.bone76.getChild("facingcontrol");
        this.bone77 = this.bone76.getChild("bone77");
        this.bone78 = this.bone76.getChild("bone78");
        this.bone79 = this.bone76.getChild("bone79");
        this.bone149 = this.bone79.getChild("bone149");
        this.bone80 = this.bone76.getChild("bone80");
        this.bone81 = this.side6.getChild("bone81");
        this.bone82 = this.bone81.getChild("bone82");
        this.bone83 = this.side6.getChild("bone83");
        this.bone84 = this.bone83.getChild("bone84");
        this.refuel = this.bone84.getChild("refuel");
        this.bone85 = this.side6.getChild("bone85");
        this.bone86 = this.bone85.getChild("bone86");
        this.bone87 = this.bone85.getChild("bone87");
        this.bone88 = this.side6.getChild("bone88");
        this.bone89 = this.bone88.getChild("bone89");
        this.bone90 = this.bone89.getChild("bone90");
        this.bone95 = this.base.getChild("bone95");
        this.bone94 = this.bone95.getChild("bone94");
        this.bone93 = this.bone95.getChild("bone93");
        this.bone92 = this.bone95.getChild("bone92");
        this.bone91 = this.bone95.getChild("bone91");
        this.bone92_r1 = this.bone91.getChild("bone92_r1");
        this.bone91_r1 = this.bone91.getChild("bone91_r1");
        this.bone96 = this.base.getChild("bone96");
        this.bone97 = this.bone96.getChild("bone97");
        this.bone98 = this.bone96.getChild("bone98");
        this.bone99 = this.bone96.getChild("bone99");
        this.bone100 = this.bone96.getChild("bone100");
        this.bone101 = this.base.getChild("bone101");
        this.bone102 = this.bone101.getChild("bone102");
        this.bone103 = this.bone101.getChild("bone103");
        this.bone104 = this.bone101.getChild("bone104");
        this.bone105 = this.bone101.getChild("bone105");
        this.bone106 = this.base.getChild("bone106");
        this.bone107 = this.bone106.getChild("bone107");
        this.bone108 = this.bone106.getChild("bone108");
        this.bone109 = this.bone106.getChild("bone109");
        this.bone110 = this.bone106.getChild("bone110");
        this.bone111 = this.base.getChild("bone111");
        this.bone112 = this.bone111.getChild("bone112");
        this.bone113 = this.bone111.getChild("bone113");
        this.bone114 = this.bone111.getChild("bone114");
        this.bone115 = this.bone111.getChild("bone115");
        this.bone116 = this.base.getChild("bone116");
        this.bone117 = this.bone116.getChild("bone117");
        this.bone118 = this.bone116.getChild("bone118");
        this.bone119 = this.bone116.getChild("bone119");
        this.bone120 = this.bone116.getChild("bone120");
        this.circle = this.base.getChild("circle");
        this.bone128 = this.circle.getChild("bone128");
        this.bone129 = this.circle.getChild("bone129");
        this.bone130 = this.circle.getChild("bone130");
        this.bone131 = this.circle.getChild("bone131");
        this.circle2 = this.base.getChild("circle2");
        this.bone132 = this.circle2.getChild("bone132");
        this.bone133 = this.circle2.getChild("bone133");
        this.bone134 = this.circle2.getChild("bone134");
        this.bone135 = this.circle2.getChild("bone135");
        this.circle3 = this.base.getChild("circle3");
        this.bone136 = this.circle3.getChild("bone136");
        this.bone137 = this.circle3.getChild("bone137");
        this.bone138 = this.circle3.getChild("bone138");
        this.bone139 = this.circle3.getChild("bone139");
        this.circle4 = this.base.getChild("circle4");
        this.bone142 = this.circle4.getChild("bone142");
        this.bone143 = this.circle4.getChild("bone143");
        this.bone144 = this.circle4.getChild("bone144");
        this.bone145 = this.circle4.getChild("bone145");
        this.rotar3 = this.base.getChild("rotar3");
        this.bone121 = this.rotar3.getChild("bone121");
        this.bone122 = this.rotar3.getChild("bone122");
        this.bone123 = this.rotar3.getChild("bone123");
        this.rotar2 = this.base.getChild("rotar2");
        this.bone124 = this.rotar2.getChild("bone124");
        this.bone125 = this.rotar2.getChild("bone125");
        this.bone126 = this.rotar2.getChild("bone126");
        this.bone127 = this.base.getChild("bone127");
        this.bone141 = this.base.getChild("bone141");
        this.bone140 = this.base.getChild("bone140");
        this.monitor = this.base.getChild("monitor");
        this.bone140_r1 = this.monitor.getChild("bone140_r1");
        this.screen = this.bone140_r1.getChild("screen");
        this.hammer = this.base.getChild("hammer");
        this.cube_r1 = this.hammer.getChild("cube_r1");
        this.cube_r2 = this.hammer.getChild("cube_r2");
        this.rotor = this.base.getChild("rotor");
        this.rotortop = this.rotor.getChild("rotortop");
        this.rotorbottom = this.rotor.getChild("rotorbottom");
        this.controls = root.getChild("controls");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition base = partdefinition.addOrReplaceChild("base", CubeListBuilder.create().texOffs(232, 250).addBox(-4.5F, -26.0F, -5.8F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(236, 253).addBox(-4.5F, -38.0F, -5.2F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(236, 253).addBox(-5.5F, -48.0F, -5.2F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(236, 253).addBox(-5.4F, -53.7F, -5.2F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(232, 253).addBox(-6.7F, -75.1F, -5.2F, 11.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(232, 253).addBox(-6.6F, -75.1F, 1.8244F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(236, 248).addBox(-5.1F, -53.7F, 1.8244F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(236, 248).addBox(-5.5F, -48.0F, 1.5244F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 253).addBox(-4.5F, -38.0F, 1.5244F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 253).addBox(-4.5F, -26.0F, 1.8244F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(239, 2).addBox(-4.5F, -49.0F, 2.5F, 7.0F, 32.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(237, 2).addBox(-5.3F, -79.0F, 2.5F, 8.0F, 31.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(237, 2).addBox(-5.4F, -79.0F, -4.6F, 8.0F, 31.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(237, 2).addBox(-5.0F, -49.0F, -4.6F, 8.0F, 32.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.35F, 23.0F, 1.5F));

        PartDefinition side = base.addOrReplaceChild("side", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, -8.0F));

        PartDefinition bone = side.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(45, 82).addBox(-7.0F, -15.15F, -11.45F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(62, 47).addBox(-3.0F, -14.25F, -11.75F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(95, 104).addBox(-4.0F, -23.1F, -2.7F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(30, 14).addBox(-4.0F, -20.1F, -0.7F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(30, 14).addBox(-4.0F, -6.1F, -0.7F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(0, 131).addBox(-0.6F, -22.3F, -2.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(118, 124).addBox(-2.1F, -22.3F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(108, 124).addBox(-3.1F, -23.3F, -3.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(130, 78).addBox(-2.0F, -25.4F, -2.7F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 138).addBox(-2.9739F, -25.5191F, -2.7F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-2.0261F, -25.5191F, -2.7F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(14, 131).addBox(-9.0F, -15.65F, -11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(127, 25).addBox(-10.7F, -15.65F, -10.45F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(112, 130).addBox(5.0F, -15.65F, -11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(127, 19).addBox(5.4F, -15.65F, -10.05F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone14 = bone.addOrReplaceChild("bone14", CubeListBuilder.create().texOffs(130, 78).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -23.1F, -2.7F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone15 = bone.addOrReplaceChild("bone15", CubeListBuilder.create().texOffs(130, 78).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -23.1F, -2.7F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone4 = bone.addOrReplaceChild("bone4", CubeListBuilder.create().texOffs(78, 55).addBox(-2.4F, 0.0F, -1.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(128, 12).addBox(-2.4F, -0.45F, -0.625F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(-2.9F, 0.0F, -2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 78).addBox(-4.9F, 0.0F, -5.0F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(10, 67).addBox(-3.9F, 14.5F, -11.6F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(78, 29).addBox(-5.9F, 0.0F, -7.0F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(124, 19).addBox(-2.9F, -0.2F, -8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(124, 70).addBox(1.8F, -0.4F, -7.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(124, 70).addBox(1.8F, -0.9F, -7.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(124, 70).addBox(0.6F, -0.4F, -8.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(124, 70).addBox(0.6F, -0.9F, -8.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(124, 70).addBox(3.1F, -0.4F, -8.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(124, 70).addBox(3.1F, -0.9F, -8.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(124, 19).addBox(-2.9F, -0.5F, -8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(124, 19).addBox(-4.9F, -0.4F, -8.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(128, 14).addBox(-1.5F, -0.7F, -2.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                .texOffs(128, 14).addBox(-3.0F, -0.7F, -3.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                .texOffs(128, 14).addBox(-2.3F, -0.7F, -4.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                .texOffs(128, 14).addBox(0.9F, -0.7F, -3.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                .texOffs(128, 14).addBox(0.2F, -0.7F, -4.9F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
                .texOffs(88, 123).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(98, 123).addBox(-0.5F, -0.3F, -2.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(98, 123).addBox(-2.0F, -0.3F, -3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(98, 123).addBox(-1.3F, -0.3F, -4.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(98, 123).addBox(0.9F, -0.3F, -3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(98, 123).addBox(0.2F, -0.3F, -4.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F))
                .texOffs(88, 123).addBox(-2.0F, -0.5F, -3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(88, 123).addBox(-1.3F, -0.5F, -4.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(88, 123).addBox(0.9F, -0.5F, -3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(88, 123).addBox(0.2F, -0.5F, -4.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(63, 4).addBox(-5.9F, 0.0F, -10.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -20.4268F, -2.6F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone13 = bone.addOrReplaceChild("bone13", CubeListBuilder.create().texOffs(30, 14).addBox(-2.4F, 0.0F, -1.0F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 101).addBox(-2.9F, 0.0F, -2.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 88).addBox(-4.4F, 0.0F, -5.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 76).addBox(-5.9F, 0.0F, -8.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(54, 74).addBox(-5.9F, 0.0F, -10.0F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -12.1499F, -0.5857F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone2 = side.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(136, 103).addBox(0.0F, -1.8585F, -0.2549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(122, 112).addBox(-2.0598F, -9.8718F, -0.2549F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(130, 111).addBox(-2.0598F, -6.8718F, -1.9549F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(59, 119).addBox(-2.0598F, -6.3718F, -2.9549F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(59, 119).addBox(-2.0598F, -5.3718F, -3.3549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(136, 31).addBox(-2.0598F, -6.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-2.0598F, -5.3718F, -3.8549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-2.0598F, -4.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-2.0598F, -3.6718F, -2.7049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-2.0598F, -7.0718F, -2.7049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-1.0598F, -6.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-1.0598F, -5.3718F, -3.8549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-1.0598F, -4.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-1.0598F, -3.6718F, -2.7049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(136, 31).addBox(-1.0598F, -7.0718F, -2.7049F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(59, 115).addBox(-2.3598F, -5.8718F, -2.7549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(59, 115).addBox(-0.7598F, -5.8718F, -2.7549F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition throttle = bone3.addOrReplaceChild("throttle", CubeListBuilder.create().texOffs(59, 123).addBox(-0.4848F, -0.4718F, -3.4549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(51, 127).addBox(-0.4848F, -0.4718F, -3.4549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                .texOffs(123, 39).addBox(-0.4848F, -0.4718F, -0.4549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(59, 123).addBox(1.5152F, -0.4718F, -3.4549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(51, 127).addBox(2.5152F, -0.4718F, -3.4549F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                .texOffs(123, 39).addBox(2.5152F, -0.4718F, -0.4549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-2.6F, -4.9F, -1.8F, -0.9599F, 0.0F, 0.0F));

        PartDefinition bone5 = side.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(103, 136).addBox(0.0F, -1.8585F, -0.2549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(122, 100).addBox(0.0598F, -9.8718F, -0.2549F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 0).addBox(0.1598F, -6.5718F, -1.7549F, 1.0F, 4.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(95, 136).addBox(0.0598F, -2.2718F, -1.4549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F))
                .texOffs(95, 136).addBox(0.0598F, -8.8718F, -1.4549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.45F))
                .texOffs(95, 136).addBox(0.0598F, -2.2718F, -2.1549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                .texOffs(95, 136).addBox(0.0598F, -8.8718F, -2.1549F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
                .texOffs(47, 92).addBox(0.5598F, -6.0718F, -1.5549F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(121, 84).addBox(-0.9402F, -7.0718F, -0.6549F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(47, 92).addBox(-0.1402F, -6.0718F, -1.5549F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition fastreturn = bone6.addOrReplaceChild("fastreturn", CubeListBuilder.create().texOffs(88, 34).addBox(-1.2402F, -0.5718F, -0.2549F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(32, 101).addBox(1.2598F, -0.5718F, -0.2549F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.3F, -4.5F, -0.9F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone7 = side.addOrReplaceChild("bone7", CubeListBuilder.create().texOffs(74, 136).addBox(0.0F, -2.0865F, 1.8571F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(114, 111).addBox(-1.9634F, -11.0784F, 1.8571F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(97, 38).addBox(-1.9634F, -11.0784F, 3.8571F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone12 = bone7.addOrReplaceChild("bone12", CubeListBuilder.create().texOffs(126, 70).addBox(-1.9634F, -5.452F, 12.5218F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition bone9 = side.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(66, 136).addBox(0.0F, -2.0865F, 1.8571F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create().texOffs(74, 114).addBox(-0.0366F, -11.0784F, 1.8571F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(96, 81).addBox(-0.0366F, -11.0784F, 3.8571F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone11 = bone10.addOrReplaceChild("bone11", CubeListBuilder.create().texOffs(79, 102).addBox(-2.0F, -0.0235F, 0.0086F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, -11.0784F, 10.8321F, -1.1345F, 0.0F, 0.0F));

        PartDefinition side2 = base.addOrReplaceChild("side2", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.0F, 3.0F, -8.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone16 = side2.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(81, 65).addBox(-2.1902F, -15.15F, 1.7192F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(95, 104).addBox(0.8098F, -23.1F, 10.4692F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(94, 34).addBox(-1.1902F, -20.1F, 12.4692F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(79, 62).addBox(-1.1902F, -6.1F, 12.4692F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(123, 0).addBox(1.6098F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(121, 37).addBox(1.3098F, -24.2F, 10.0692F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(123, 0).addBox(5.3098F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(122, 2).addBox(4.7098F, -23.5F, 10.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(122, 2).addBox(4.7098F, -25.7F, 10.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(52, 62).addBox(4.7098F, -25.6F, 10.0692F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(30, 39).addBox(1.8098F, -24.7F, 10.4692F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(30, 39).addBox(3.2098F, -24.7F, 13.6692F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(30, 39).addBox(1.8098F, -24.7F, 10.4692F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(14, 1).addBox(5.8098F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(14, 1).addBox(4.5598F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(123, 0).addBox(4.0598F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 1).addBox(2.1098F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(123, 0).addBox(2.8598F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 1).addBox(3.3598F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(130, 78).addBox(2.8098F, -25.7F, 10.4692F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(1.8358F, -25.9191F, 10.4692F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(3.7837F, -25.9191F, 10.4692F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(130, 105).addBox(-4.1902F, -15.65F, 1.4192F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(119, 137).addBox(-4.1902F, -15.65F, 0.8192F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(68, 107).addBox(-4.0902F, -15.55F, 0.3192F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(121, 59).addBox(-3.6902F, -13.55F, 0.3192F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(114, 88).addBox(-4.6902F, -15.55F, 0.3192F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(107, 65).addBox(-3.2902F, -15.55F, 0.3192F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(82, 137).addBox(-3.2902F, -12.55F, -1.0808F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(32, 126).addBox(-5.9902F, -15.65F, 2.7656F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(104, 130).addBox(9.8098F, -15.65F, 1.4192F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(126, 0).addBox(10.7F, -15.65F, 2.829F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone23_r1 = bone16.addOrReplaceChild("bone23_r1", CubeListBuilder.create().texOffs(172, 115).addBox(-0.9F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3875F, -28.8495F, 10.9577F, 2.4199F, -0.7009F, -1.2691F));

        PartDefinition bone22_r1 = bone16.addOrReplaceChild("bone22_r1", CubeListBuilder.create().texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3875F, -28.8495F, 10.9577F, 2.1337F, -0.931F, -0.881F));

        PartDefinition bone21_r1 = bone16.addOrReplaceChild("bone21_r1", CubeListBuilder.create().texOffs(170, 113).addBox(-1.9F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3875F, -28.8495F, 10.9577F, 1.6202F, -1.0408F, -0.2718F));

        PartDefinition bone23_r2 = bone16.addOrReplaceChild("bone23_r2", CubeListBuilder.create().texOffs(172, 113).addBox(0.9F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2927F, -28.5534F, 11.7712F, 1.4495F, 0.6462F, 0.293F));

        PartDefinition bone22_r2 = bone16.addOrReplaceChild("bone22_r2", CubeListBuilder.create().texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2927F, -28.5534F, 11.7712F, 1.7151F, 0.6421F, 0.7308F));

        PartDefinition bone21_r2 = bone16.addOrReplaceChild("bone21_r2", CubeListBuilder.create().texOffs(172, 115).addBox(-2.1F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.2927F, -28.5534F, 11.7712F, 1.947F, 0.5508F, 1.1392F));

        PartDefinition bone23_r3 = bone16.addOrReplaceChild("bone23_r3", CubeListBuilder.create().texOffs(172, 115).addBox(-2.2F, -0.5F, -1.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3401F, -26.822F, 10.6804F, 0.4275F, 0.1932F, 0.2556F));

        PartDefinition bone22_r3 = bone16.addOrReplaceChild("bone22_r3", CubeListBuilder.create().texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3401F, -26.822F, 10.6804F, 0.4842F, 0.5074F, 0.4186F));

        PartDefinition bone21_r3 = bone16.addOrReplaceChild("bone21_r3", CubeListBuilder.create().texOffs(172, 113).addBox(0.9F, -0.5F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3401F, -26.822F, 10.6804F, 0.6277F, 0.8055F, 0.6505F));

        PartDefinition bone20_r1 = bone16.addOrReplaceChild("bone20_r1", CubeListBuilder.create().texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.1072F, -28.2336F, 12.3993F, 1.2139F, -0.2048F, 0.0757F));

        PartDefinition bone21_r4 = bone16.addOrReplaceChild("bone21_r4", CubeListBuilder.create().texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3401F, -30.5808F, 12.0485F, 1.731F, -0.4462F, 0.8694F));

        PartDefinition bone20_r2 = bone16.addOrReplaceChild("bone20_r2", CubeListBuilder.create().texOffs(170, 113).addBox(-1.9F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3401F, -30.5808F, 12.0485F, 1.5569F, -0.472F, 1.2582F));

        PartDefinition bone19_r1 = bone16.addOrReplaceChild("bone19_r1", CubeListBuilder.create().texOffs(172, 115).addBox(-0.9F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3401F, -30.5808F, 12.0485F, 1.8783F, -0.3643F, 0.4997F));

        PartDefinition bone18_r1 = bone16.addOrReplaceChild("bone18_r1", CubeListBuilder.create().texOffs(173, 115).addBox(-15.4402F, -24.7F, 10.1692F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.65F, -2.0F, 6.5F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create().texOffs(130, 78).addBox(4.5197F, -4.645F, 13.1692F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -23.1F, -2.7F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone18 = bone16.addOrReplaceChild("bone18", CubeListBuilder.create().texOffs(130, 78).addBox(2.5197F, -1.355F, 13.1692F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -23.1F, -2.7F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone19 = bone16.addOrReplaceChild("bone19", CubeListBuilder.create().texOffs(78, 55).addBox(2.4098F, 6.5846F, 10.4049F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(125, 67).addBox(2.4098F, 6.1346F, 10.7799F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(1.9098F, 6.5846F, 9.4049F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 67).addBox(0.9098F, 21.1846F, -0.0951F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(38, 78).addBox(-0.0902F, 6.5846F, 6.4049F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(58, 136).addBox(0.7098F, 5.7846F, 2.4049F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(22, 119).addBox(1.1098F, 5.7846F, 2.9049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(77, 110).addBox(-0.1902F, 5.6846F, 2.9049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(78, 29).addBox(-1.0902F, 6.5846F, 4.4049F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(63, 4).addBox(-1.0902F, 6.5846F, 1.4049F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(40, 103).addBox(6.9098F, 5.9846F, 3.9049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(40, 103).addBox(6.0098F, 5.9846F, 5.5049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(40, 103).addBox(6.0098F, 5.9846F, 2.2049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1F, -20.4268F, -2.6F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone151 = bone19.addOrReplaceChild("bone151", CubeListBuilder.create().texOffs(58, 136).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(58, 136).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(111, 136).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offset(4.8098F, 5.2846F, 7.4049F));

        PartDefinition yswitch = bone19.addOrReplaceChild("yswitch", CubeListBuilder.create().texOffs(118, 65).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(116, 71).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(7.5848F, 5.7846F, 4.4049F));

        PartDefinition xswitch = bone19.addOrReplaceChild("xswitch", CubeListBuilder.create().texOffs(118, 65).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(116, 71).addBox(-0.5F, -0.8F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(6.9098F, 5.7846F, 6.0049F));

        PartDefinition zswitch = bone19.addOrReplaceChild("zswitch", CubeListBuilder.create().texOffs(118, 65).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(116, 71).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(7.4848F, 5.7346F, 2.7049F));

        PartDefinition bone20 = bone16.addOrReplaceChild("bone20", CubeListBuilder.create().texOffs(30, 13).addBox(2.4098F, -2.1478F, 12.1191F, 5.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(101, 6).addBox(1.9098F, -1.1478F, 11.1191F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(86, 77).addBox(0.4098F, -1.1478F, 8.1191F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(27, 73).addBox(-1.0902F, -1.1478F, 5.1191F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(72, 58).addBox(-1.0902F, -1.1478F, 3.1191F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -12.1499F, -0.5857F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone21 = side2.addOrReplaceChild("bone21", CubeListBuilder.create().texOffs(50, 136).addBox(4.8098F, -13.2634F, 6.3297F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone22 = bone21.addOrReplaceChild("bone22", CubeListBuilder.create().texOffs(43, 122).addBox(7.1192F, -18.1754F, 6.3297F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 66).addBox(7.6192F, -12.1754F, 5.5297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(108, 41).addBox(7.6192F, -13.9754F, 5.5297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(108, 37).addBox(7.6192F, -15.3754F, 5.5297F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(136, 109).addBox(7.6192F, -15.3754F, 5.5297F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone154 = bone22.addOrReplaceChild("bone154", CubeListBuilder.create().texOffs(49, 109).addBox(-2.65F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.175F))
                .texOffs(38, 109).addBox(-1.35F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.9692F, -11.6754F, 5.4297F, 0.0F, 0.0F, 0.1745F));

        PartDefinition bone23 = side2.addOrReplaceChild("bone23", CubeListBuilder.create().texOffs(42, 136).addBox(4.8098F, -13.2634F, 6.3297F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(131, 38).addBox(7.0098F, -17.7634F, 6.0297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(131, 38).addBox(7.0098F, -17.7634F, 5.7297F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition doorcontrol = bone23.addOrReplaceChild("doorcontrol", CubeListBuilder.create().texOffs(51, 127).addBox(-0.5F, -0.2739F, -0.6011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.175F))
                .texOffs(123, 42).addBox(-0.5F, 1.3261F, -0.6011F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(7.5098F, -15.7634F, 6.3297F, -0.9599F, 0.0F, 0.0F));

        PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(121, 47).addBox(-0.401F, -22.2408F, 6.3297F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 136).addBox(-0.401F, -20.9408F, 5.9297F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(136, 8).addBox(-0.401F, -14.9408F, 5.8297F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(137, 51).addBox(0.099F, -14.4408F, 5.8297F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(126, 120).addBox(0.099F, -20.4408F, 3.2297F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.3F))
                .texOffs(117, 108).addBox(0.099F, -20.4408F, 3.2297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(117, 108).addBox(0.099F, -20.4408F, 5.5297F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone25 = side2.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(126, 135).addBox(4.8098F, -15.2056F, 0.7094F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create().texOffs(66, 114).addBox(7.9401F, -20.9357F, 0.7094F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(92, 95).addBox(7.9401F, -20.9357F, 2.7094F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone27 = bone25.addOrReplaceChild("bone27", CubeListBuilder.create().texOffs(24, 126).addBox(7.9401F, -14.8708F, 15.6475F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition bone28 = side2.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(126, 135).addBox(4.8098F, -15.2056F, 0.7094F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create().texOffs(74, 114).addBox(-1.2218F, -25.0011F, 0.7094F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(81, 93).addBox(-1.2218F, -25.0011F, 2.7094F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone30 = bone29.addOrReplaceChild("bone30", CubeListBuilder.create().texOffs(40, 101).addBox(-3.1852F, -4.8672F, -13.0947F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, -11.0784F, 10.8321F, -1.1345F, 0.0F, 0.0F));

        PartDefinition side3 = base.addOrReplaceChild("side3", CubeListBuilder.create(), PartPose.offsetAndRotation(-32.0F, 3.0F, -8.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone31 = side3.addOrReplaceChild("bone31", CubeListBuilder.create().texOffs(0, 80).addBox(-27.1902F, -15.15F, 5.541F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(95, 104).addBox(-24.1902F, -23.1F, 14.291F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(118, 61).addBox(-24.1902F, -20.1F, 16.291F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(118, 34).addBox(-24.1902F, -6.1F, 16.291F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(130, 78).addBox(-22.1902F, -25.6F, 14.291F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-23.1642F, -25.6191F, 14.291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-21.2163F, -25.6191F, 14.291F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(130, 99).addBox(-29.1902F, -15.65F, 5.241F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(125, 84).addBox(-31.0304F, -15.65F, 6.5642F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(96, 130).addBox(-15.1902F, -15.65F, 5.241F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(57, 125).addBox(-14.3902F, -15.65F, 6.5874F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone31_r1 = bone31.addOrReplaceChild("bone31_r1", CubeListBuilder.create().texOffs(30, 27).addBox(-51.7402F, -24.2F, 6.891F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(137, 48).addBox(-52.7402F, -24.4F, 7.291F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(29.65F, -3.25F, 5.0F, 0.0F, 0.0436F, 0.0F));

        PartDefinition telepathic = bone31.addOrReplaceChild("telepathic", CubeListBuilder.create(), PartPose.offset(-4.0F, -12.0F, -11.0F));

        PartDefinition telepathic_r1 = telepathic.addOrReplaceChild("telepathic_r1", CubeListBuilder.create().texOffs(29, 92).addBox(-54.3402F, -21.7F, -1.959F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(127, 96).addBox(-53.7402F, -22.1F, -1.959F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(122, 79).addBox(-52.9402F, -21.5F, -3.459F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(123, 37).addBox(-52.9402F, -21.1F, -3.459F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F))
                .texOffs(123, 37).addBox(-52.9402F, -21.8F, -3.459F, 2.0F, 1.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(34.65F, 10.0F, 17.5F, -0.3927F, 0.0F, 0.0F));

        PartDefinition bone32 = bone31.addOrReplaceChild("bone32", CubeListBuilder.create().texOffs(130, 78).addBox(-18.9726F, 3.9055F, 16.991F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -23.1F, -2.7F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone33 = bone31.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(130, 78).addBox(-20.9726F, -9.9055F, 16.991F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -23.1F, -2.7F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone34 = bone31.addOrReplaceChild("bone34", CubeListBuilder.create().texOffs(78, 55).addBox(-22.5902F, 8.4955F, 13.7147F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(108, 8).addBox(-22.5902F, 8.0455F, 14.0897F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(-23.0902F, 8.4955F, 12.7147F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 78).addBox(-25.0902F, 8.4955F, 9.7147F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(10, 67).addBox(-24.0902F, 23.0205F, 3.1147F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(78, 29).addBox(-26.0902F, 8.4955F, 7.7147F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-20.0902F, 6.5955F, 9.8147F, 0.0F, 2.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(87, 135).addBox(-21.0902F, 5.0955F, 9.2147F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(135, 83).addBox(-21.0902F, 7.9955F, 9.3397F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(94, 37).addBox(-21.5902F, 5.0955F, 9.2147F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(0, 0).addBox(-20.0902F, 6.5955F, 10.7147F, 0.0F, 2.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(63, 4).addBox(-26.0902F, 8.4955F, 4.7147F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(135, 87).addBox(-23.8902F, 7.9955F, 7.6147F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(136, 77).addBox(-23.8902F, 7.7955F, 7.6147F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(135, 87).addBox(-21.1402F, 7.9955F, 5.3647F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 1).addBox(-22.8902F, 7.6955F, 8.5147F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(116, 71).addBox(-16.6902F, 6.9846F, 6.9049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(116, 71).addBox(-16.6902F, 6.9846F, 5.6049F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(118, 65).addBox(-16.6902F, 6.9846F, 6.9049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(118, 65).addBox(-16.6902F, 6.9846F, 5.6049F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.4F))
                .texOffs(40, 103).addBox(-17.6902F, 7.9846F, 6.9049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(40, 103).addBox(-16.6902F, 7.9846F, 5.6049F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1F, -20.4268F, -2.6F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone165 = bone34.addOrReplaceChild("bone165", CubeListBuilder.create().texOffs(136, 77).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offset(-20.1402F, 8.2955F, 6.3647F));

        PartDefinition bone166 = bone165.addOrReplaceChild("bone166", CubeListBuilder.create().texOffs(8, 1).addBox(0.0F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone34_r1 = bone34.addOrReplaceChild("bone34_r1", CubeListBuilder.create(), PartPose.offsetAndRotation(-20.8902F, 8.1955F, 6.0147F, 0.0F, -0.9599F, 0.0F));

        PartDefinition bone35 = bone31.addOrReplaceChild("bone35", CubeListBuilder.create().texOffs(30, 14).addBox(-22.5902F, -1.4809F, 15.9264F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(104, 53).addBox(-23.0902F, -1.4809F, 14.9264F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(86, 73).addBox(-24.5902F, -1.4809F, 11.9264F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 72).addBox(-26.0902F, -1.4809F, 8.9264F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(71, 18).addBox(-26.0902F, -1.4809F, 6.9264F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -12.1499F, -0.5857F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone36 = side3.addOrReplaceChild("bone36", CubeListBuilder.create().texOffs(135, 62).addBox(-20.1902F, -16.5732F, 8.2406F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone37 = bone36.addOrReplaceChild("bone37", CubeListBuilder.create().texOffs(120, 4).addBox(-14.1397F, -31.7405F, 8.2406F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-14.1165F, -29.9663F, 7.9438F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.025F))
                .texOffs(96, 110).addBox(-13.6165F, -25.9163F, 7.4938F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(114, 26).addBox(-14.1165F, -28.7163F, 6.9938F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(104, 47).addBox(-13.5165F, -29.7163F, 6.9938F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(104, 47).addBox(-13.0165F, -29.7163F, 6.9938F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(0, 91).addBox(-14.1165F, -29.7163F, 7.3938F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition verticallanding_r1 = bone37.addOrReplaceChild("verticallanding_r1", CubeListBuilder.create().texOffs(105, 49).addBox(-0.1563F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 0).addBox(0.1938F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F))
                .texOffs(105, 49).addBox(-0.8313F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 0).addBox(-0.2062F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F)), PartPose.offsetAndRotation(-12.7602F, -27.7436F, 7.3837F, 0.829F, 0.0F, 0.0F));

        PartDefinition verticallanding = bone37.addOrReplaceChild("verticallanding", CubeListBuilder.create().texOffs(105, 30).addBox(-0.1563F, 0.0F, -2.95F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 0).addBox(-0.2062F, 0.0F, -2.95F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 0).addBox(0.1938F, 0.0F, -2.95F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F))
                .texOffs(105, 30).addBox(-0.8313F, 0.0F, -2.95F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-13.6102F, -27.6163F, 7.4438F, -0.9599F, 0.0F, 0.0F));

        PartDefinition bone38 = side3.addOrReplaceChild("bone38", CubeListBuilder.create().texOffs(135, 44).addBox(-20.1902F, -16.5732F, 8.2406F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create().texOffs(119, 88).addBox(-24.4574F, -14.675F, 8.2406F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(89, 104).addBox(-24.0586F, -8.5361F, 7.0496F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(81, 91).addBox(-24.0586F, -11.1361F, 7.0246F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(50, 103).addBox(-24.0586F, -7.8361F, 7.0496F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
                .texOffs(69, 99).addBox(-24.0586F, -6.5361F, 6.9246F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.125F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone40 = side3.addOrReplaceChild("bone40", CubeListBuilder.create().texOffs(135, 38).addBox(-20.1902F, -19.0129F, 0.3763F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone41 = bone40.addOrReplaceChild("bone41", CubeListBuilder.create().texOffs(27, 113).addBox(-13.1086F, -34.9517F, 0.3763F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(47, 92).addBox(-13.1086F, -34.9517F, 2.3763F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone42 = bone40.addOrReplaceChild("bone42", CubeListBuilder.create().texOffs(120, 124).addBox(-13.1086F, -27.7144F, 21.269F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition bone43 = side3.addOrReplaceChild("bone43", CubeListBuilder.create().texOffs(135, 23).addBox(-20.1902F, -19.0129F, 0.3763F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone44 = bone43.addOrReplaceChild("bone44", CubeListBuilder.create().texOffs(106, 111).addBox(-25.4885F, -17.8861F, 0.3763F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 92).addBox(-25.4885F, -17.8861F, 2.3763F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone45 = bone44.addOrReplaceChild("bone45", CubeListBuilder.create().texOffs(16, 101).addBox(-27.452F, -1.5584F, -6.7872F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, -11.0784F, 10.8321F, -1.1345F, 0.0F, 0.0F));

        PartDefinition side4 = base.addOrReplaceChild("side4", CubeListBuilder.create(), PartPose.offsetAndRotation(-32.0F, 3.0F, -8.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone46 = side4.addOrReplaceChild("bone46", CubeListBuilder.create().texOffs(134, 4).addBox(-32.0F, -4.15F, -18.591F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.2F))
                .texOffs(78, 51).addBox(-37.0F, -15.15F, -24.591F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(95, 104).addBox(-34.0F, -23.1F, -15.841F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(40, 99).addBox(-29.8F, -24.7F, -16.041F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(40, 99).addBox(-29.8F, -24.7F, -16.241F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(88, 55).addBox(-36.0F, -20.1F, -13.841F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(79, 62).addBox(-36.0F, -6.1F, -13.841F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(130, 78).addBox(-32.0F, -25.7F, -15.841F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-32.9739F, -25.9191F, -15.841F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-31.0261F, -25.9191F, -15.841F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(73, 130).addBox(-39.0F, -15.65F, -24.891F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(110, 124).addBox(-40.8F, -15.65F, -23.491F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(65, 130).addBox(-25.0F, -15.65F, -24.891F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(100, 124).addBox(-24.2F, -15.65F, -23.591F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition phone = bone46.addOrReplaceChild("phone", CubeListBuilder.create().texOffs(90, 123).addBox(-29.0F, -12.7F, -5.041F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(1, 1).addBox(-27.1F, -11.4F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-26.5F, -11.4F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-27.1F, -10.9F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-26.5F, -10.9F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-27.1F, -10.4F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-26.5F, -10.4F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-27.1F, -9.925F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(1, 1).addBox(-26.5F, -9.925F, -5.041F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offset(-4.0F, -12.0F, -11.0F));

        PartDefinition bone47 = bone46.addOrReplaceChild("bone47", CubeListBuilder.create().texOffs(130, 78).addBox(-28.1908F, 7.2606F, -13.141F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -23.1F, -2.7F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone48 = bone46.addOrReplaceChild("bone48", CubeListBuilder.create().texOffs(130, 78).addBox(-30.1908F, -13.2606F, -13.141F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -23.1F, -2.7F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone49 = bone46.addOrReplaceChild("bone49", CubeListBuilder.create().texOffs(78, 55).addBox(-32.4F, -6.5705F, -12.3805F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(107, 24).addBox(-32.4F, -7.0205F, -12.0055F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(-32.9F, -6.5705F, -13.3805F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 78).addBox(-34.9F, -6.5705F, -16.3805F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(103, 97).addBox(-32.8F, -7.8705F, -16.0805F, 6.0F, 2.0F, 3.0F, new CubeDeformation(-0.3F))
                .texOffs(10, 67).addBox(-33.9F, 7.9045F, -22.9555F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(78, 29).addBox(-35.9F, -6.5705F, -18.3805F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(63, 4).addBox(-35.9F, -6.5705F, -21.3805F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -20.4268F, -2.6F, 0.5236F, 0.0F, 0.0F));

        PartDefinition randomiser = bone49.addOrReplaceChild("randomiser", CubeListBuilder.create().texOffs(119, 16).addBox(-32.8F, -8.4705F, -18.1805F, 6.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(0, 84).addBox(-32.8F, -8.0705F, -22.3805F, 6.0F, 2.0F, 5.0F, new CubeDeformation(-0.3F))
                .texOffs(107, 84).addBox(-32.8F, -8.4705F, -20.3805F, 6.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(117, 105).addBox(-32.5F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-31.85F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-31.2F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-30.6F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-29.95F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-29.3F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-28.7F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-28.1F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-32.5F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(117, 105).addBox(-32.5F, -8.2455F, -22.2305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone164 = randomiser.addOrReplaceChild("bone164", CubeListBuilder.create().texOffs(127, 93).addBox(-2.5F, -1.0F, -0.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(-29.8F, -8.6705F, -18.5805F));

        PartDefinition bone160 = randomiser.addOrReplaceChild("bone160", CubeListBuilder.create(), PartPose.offset(31.75F, 18.4268F, 9.1F));

        PartDefinition bone161 = randomiser.addOrReplaceChild("bone161", CubeListBuilder.create(), PartPose.offset(31.75F, 18.4268F, 9.1F));

        PartDefinition bone162 = randomiser.addOrReplaceChild("bone162", CubeListBuilder.create(), PartPose.offset(31.75F, 18.4268F, 9.1F));

        PartDefinition bone150 = randomiser.addOrReplaceChild("bone150", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-31.35F, -7.2455F, -21.7305F));

        PartDefinition bone152 = randomiser.addOrReplaceChild("bone152", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-31.35F, -7.2455F, -21.1305F));

        PartDefinition bone159 = randomiser.addOrReplaceChild("bone159", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-30.7F, -7.2455F, -21.1305F));

        PartDefinition bone158 = randomiser.addOrReplaceChild("bone158", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-30.1F, -7.2455F, -21.1305F));

        PartDefinition bone153 = randomiser.addOrReplaceChild("bone153", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-29.45F, -7.2455F, -21.1305F));

        PartDefinition bone155 = randomiser.addOrReplaceChild("bone155", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-28.8F, -7.2455F, -21.1305F));

        PartDefinition bone156 = randomiser.addOrReplaceChild("bone156", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-28.2F, -7.2455F, -21.1305F));

        PartDefinition bone157 = randomiser.addOrReplaceChild("bone157", CubeListBuilder.create().texOffs(117, 105).addBox(-59.85F, -26.6723F, -30.7305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(31.75F, 18.4268F, 9.1F));

        PartDefinition bone163 = randomiser.addOrReplaceChild("bone163", CubeListBuilder.create().texOffs(117, 105).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-27.6F, -7.2455F, -21.7305F));

        PartDefinition bone146 = randomiser.addOrReplaceChild("bone146", CubeListBuilder.create().texOffs(117, 105).addBox(-60.45F, -26.6723F, -31.3305F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(31.75F, 18.4268F, 9.1F));

        PartDefinition bone148 = randomiser.addOrReplaceChild("bone148", CubeListBuilder.create().texOffs(137, 27).addBox(-1.5F, -1.0F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.275F)), PartPose.offset(-29.7F, -7.2455F, -21.7305F));

        PartDefinition bone50 = bone46.addOrReplaceChild("bone50", CubeListBuilder.create().texOffs(30, 14).addBox(-32.4F, 1.1453F, -14.091F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(47, 90).addBox(-32.9F, 1.1453F, -15.091F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(86, 69).addBox(-34.4F, 1.1453F, -18.091F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(71, 14).addBox(-35.9F, 1.1453F, -21.091F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(59, 70).addBox(-35.9F, 1.1453F, -23.091F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -12.1499F, -0.5857F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone51 = side4.addOrReplaceChild("bone51", CubeListBuilder.create().texOffs(6, 135).addBox(-30.0F, 9.522F, -6.8254F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone52 = bone51.addOrReplaceChild("bone52", CubeListBuilder.create().texOffs(119, 22).addBox(-34.0586F, -12.2361F, -6.8254F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(57, 115).addBox(-34.2586F, -11.1361F, -7.1254F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(62, 36).addBox(-36.2586F, -8.7361F, -7.8004F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(116, 33).addBox(-36.2586F, -9.7111F, -7.8004F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(58, 97).addBox(-37.2586F, -9.8361F, -7.8004F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(57, 115).addBox(-37.2586F, -10.6361F, -7.8004F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(55, 25).addBox(-37.2586F, -11.1361F, -7.8004F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone53_r1 = bone52.addOrReplaceChild("bone53_r1", CubeListBuilder.create().texOffs(55, 25).addBox(-0.5F, -0.5F, -0.25F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-31.2586F, -10.6361F, -7.3004F, 0.0F, -0.9163F, 0.0F));

        PartDefinition bone53 = side4.addOrReplaceChild("bone53", CubeListBuilder.create().texOffs(134, 129).addBox(-30.0F, 9.522F, -6.8254F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone54 = bone53.addOrReplaceChild("bone54", CubeListBuilder.create().texOffs(16, 119).addBox(-22.3198F, 13.121F, -6.8254F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 137).addBox(-21.8198F, 18.921F, -7.1254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 137).addBox(-21.8198F, 20.821F, -7.1254F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone55 = side4.addOrReplaceChild("bone55", CubeListBuilder.create().texOffs(134, 123).addBox(-30.0F, 11.0045F, 3.0025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone56 = bone55.addOrReplaceChild("bone56", CubeListBuilder.create().texOffs(98, 110).addBox(-34.6852F, -11.8925F, 3.0025F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 91).addBox(-34.6852F, -11.8925F, 5.0025F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone57 = bone55.addOrReplaceChild("bone57", CubeListBuilder.create().texOffs(82, 123).addBox(-34.6852F, -5.7058F, 13.9039F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition bone58 = side4.addOrReplaceChild("bone58", CubeListBuilder.create().texOffs(134, 73).addBox(-30.0F, 11.0045F, 3.0025F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone59 = bone58.addOrReplaceChild("bone59", CubeListBuilder.create().texOffs(90, 110).addBox(-21.6933F, 13.4646F, 3.0025F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 90).addBox(-21.6933F, 13.4646F, 5.0025F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone60 = bone59.addOrReplaceChild("bone60", CubeListBuilder.create().texOffs(69, 99).addBox(-23.6567F, 9.3108F, 22.7361F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, -11.0784F, 10.8321F, -1.1345F, 0.0F, 0.0F));

        PartDefinition side5 = base.addOrReplaceChild("side5", CubeListBuilder.create(), PartPose.offsetAndRotation(-32.0F, 3.0F, -8.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone61 = side5.addOrReplaceChild("bone61", CubeListBuilder.create().texOffs(78, 47).addBox(-15.8098F, -15.15F, -48.1525F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(95, 104).addBox(-12.8098F, -23.1F, -39.4025F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(38, 28).addBox(-12.6098F, -23.6F, -40.3025F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(38, 28).addBox(-8.3098F, -23.4F, -40.3025F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.1F))
                .texOffs(72, 114).addBox(-12.6098F, -23.0F, -40.3025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(114, 29).addBox(-10.5098F, -24.0F, -39.7025F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(115, 6).addBox(-10.5098F, -23.6F, -39.9025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(72, 114).addBox(-8.3098F, -22.8F, -40.3025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 41).addBox(-8.5098F, -23.1F, -39.4025F, 0.0F, 4.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(254, 241).addBox(-8.5098F, -25.2F, -39.4025F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(252, 239).addBox(-8.5098F, -25.8F, -39.4025F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
                .texOffs(30, 14).addBox(-12.8098F, -20.1F, -37.4025F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(30, 14).addBox(-12.8098F, -6.1F, -37.4025F, 6.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(130, 78).addBox(-10.8098F, -25.6F, -39.4025F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-11.7837F, -25.6191F, -39.4025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(-9.8358F, -25.6191F, -39.4025F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(88, 129).addBox(-17.8098F, -15.65F, -48.4525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(134, 69).addBox(-17.8098F, -14.85F, -49.1525F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(62, 51).addBox(-19.3598F, -15.65F, -46.6731F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(129, 47).addBox(-3.8098F, -15.65F, -48.4525F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(62, 40).addBox(-3.0562F, -15.65F, -47.0793F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone62 = bone61.addOrReplaceChild("bone62", CubeListBuilder.create().texOffs(130, 78).addBox(-8.2785F, 0.0131F, -36.7025F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -23.1F, -2.7F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone63 = bone61.addOrReplaceChild("bone63", CubeListBuilder.create().texOffs(130, 78).addBox(-10.2785F, -6.0131F, -36.7025F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -23.1F, -2.7F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone64 = bone61.addOrReplaceChild("bone64", CubeListBuilder.create().texOffs(78, 55).addBox(-11.2098F, -18.3513F, -32.7853F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(106, 12).addBox(-11.2098F, -18.8013F, -32.4103F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(-11.7098F, -18.3513F, -33.7853F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 78).addBox(-13.7098F, -18.3513F, -36.7853F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(9, 66).addBox(-12.7098F, -3.7763F, -43.2853F, 8.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(78, 29).addBox(-14.7098F, -18.3513F, -38.7853F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(33, 113).addBox(-6.8848F, -18.7513F, -35.9853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(33, 113).addBox(-7.0848F, -18.7513F, -35.9853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(33, 113).addBox(-6.6848F, -18.7513F, -35.9853F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(254, 242).addBox(-6.4098F, -18.5513F, -34.9853F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.1F))
                .texOffs(63, 4).addBox(-14.7098F, -18.3513F, -41.7853F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -20.4268F, -2.6F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone64_r1 = bone64.addOrReplaceChild("bone64_r1", CubeListBuilder.create().texOffs(254, 242).addBox(-0.6F, 0.0F, -0.2F, 0.0F, 0.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-6.4098F, -18.7513F, -32.1853F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone64_r2 = bone64.addOrReplaceChild("bone64_r2", CubeListBuilder.create().texOffs(253, 241).addBox(-0.3F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-6.4098F, -18.5513F, -32.9853F, 0.0F, -0.3054F, 0.0F));

        PartDefinition sonicport = bone64.addOrReplaceChild("sonicport", CubeListBuilder.create().texOffs(12, 137).addBox(0.18F, -0.5201F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(112, 55).addBox(-1.07F, -0.42F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(18, 97).addBox(-0.97F, -0.52F, -1.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                .texOffs(12, 137).addBox(-1.17F, -0.5201F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
                .texOffs(18, 97).addBox(-0.97F, -0.52F, 0.175F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(-10.9398F, -18.2313F, -36.5853F));

        PartDefinition bluestab = bone64.addOrReplaceChild("bluestab", CubeListBuilder.create().texOffs(26, 82).addBox(-13.4848F, -19.9513F, -39.4603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(26, 82).addBox(-12.5848F, -19.9513F, -39.7103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(26, 82).addBox(-13.3348F, -19.7013F, -40.4603F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(1, 1).addBox(-12.6F, -20.2F, -39.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(1, 1).addBox(-13.5F, -20.1F, -39.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(1, 1).addBox(-13.35F, -19.9F, -40.45F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone65 = bone61.addOrReplaceChild("bone65", CubeListBuilder.create().texOffs(30, 14).addBox(-11.2098F, 3.1988F, -37.5629F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 88).addBox(-11.7098F, 3.1988F, -38.5629F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 86).addBox(-13.2098F, 3.1988F, -41.5629F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(52, 66).addBox(-14.7098F, 3.1988F, -44.5629F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(63, 8).addBox(-14.7098F, 3.1988F, -46.5629F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -12.1499F, -0.5857F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone66 = side5.addOrReplaceChild("bone66", CubeListBuilder.create().texOffs(36, 134).addBox(-8.8098F, 29.9268F, -18.6062F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone67 = bone66.addOrReplaceChild("bone67", CubeListBuilder.create().texOffs(118, 71).addBox(-23.4772F, 15.2124F, -18.6062F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 134).addBox(-23.4772F, 16.2124F, -19.0062F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(131, 53).addBox(-23.4772F, 18.6124F, -19.0062F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(91, 2).addBox(-23.4772F, 21.9124F, -19.0062F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(91, 2).addBox(-22.4772F, 21.9124F, -19.0062F, 1.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(120, 19).addBox(-23.4772F, 18.6124F, -19.4062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(120, 19).addBox(-23.4772F, 20.5124F, -19.4062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(96, 83).addBox(-23.4772F, 19.0124F, -19.9062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(120, 19).addBox(-22.4772F, 18.6124F, -19.4062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(120, 19).addBox(-22.4772F, 20.5124F, -19.4062F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(96, 83).addBox(-22.4772F, 19.0124F, -19.9062F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(134, 4).addBox(-23.4772F, 16.2124F, -19.2062F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone67_r1 = bone67.addOrReplaceChild("bone67_r1", CubeListBuilder.create().texOffs(133, 58).addBox(-0.6457F, -1.7807F, -1.2339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
                .texOffs(81, 133).addBox(-0.6457F, -1.7807F, -1.0339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
                .texOffs(120, 133).addBox(-0.2457F, -0.3807F, -1.3339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.5F))
                .texOffs(132, 133).addBox(-0.2457F, -0.3807F, -1.0339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(132, 133).addBox(-2.5457F, -0.9807F, -0.6339F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(127, 90).addBox(-1.7457F, -1.7807F, -0.4339F, 4.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(11, 92).addBox(-2.7457F, -1.2807F, -0.4339F, 5.0F, 3.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-26.0315F, 21.6931F, -18.0723F, 0.0F, 0.0F, -0.0873F));

        PartDefinition incrementincrease = bone67.addOrReplaceChild("incrementincrease", CubeListBuilder.create().texOffs(96, 93).addBox(-22.5022F, 22.0124F, -20.5062F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offset(-1.0F, 2.0F, 1.0F));

        PartDefinition bone68 = side5.addOrReplaceChild("bone68", CubeListBuilder.create().texOffs(133, 14).addBox(-8.8098F, 29.9268F, -18.6062F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone69 = bone68.addOrReplaceChild("bone69", CubeListBuilder.create().texOffs(8, 117).addBox(5.5085F, 22.6587F, -18.6062F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 91).addBox(5.5085F, 26.6587F, -19.3062F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 91).addBox(5.5085F, 26.6587F, -19.3062F, 2.0F, 4.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(115, 49).addBox(5.5085F, 23.6587F, -19.2062F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(115, 49).addBox(5.5085F, 23.6587F, -19.6062F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(112, 37).addBox(6.0085F, 24.2587F, -20.1062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(96, 110).addBox(6.0085F, 30.4587F, -19.2062F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 0).addBox(5.5085F, 26.4087F, -18.7562F, 2.0F, 5.0F, 1.0F, new CubeDeformation(-0.025F))
                .texOffs(114, 26).addBox(5.5085F, 27.6587F, -19.7062F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(104, 47).addBox(6.1085F, 26.6587F, -19.7062F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(104, 47).addBox(6.6085F, 26.6587F, -19.7062F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(6.2585F, 29.4587F, -19.8562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(6.4585F, 29.4587F, -19.8562F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition handbreak_r1 = bone69.addOrReplaceChild("handbreak_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.2063F, -0.0154F, -2.6032F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F))
                .texOffs(105, 49).addBox(-0.8313F, -0.0154F, -2.6032F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(105, 49).addBox(-0.1563F, -0.0154F, -2.6032F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 0).addBox(0.1938F, -0.0154F, -2.6032F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F)), PartPose.offsetAndRotation(6.8648F, 28.5594F, -19.1757F, 0.829F, 0.0F, 0.0F));

        PartDefinition handbreak = bone69.addOrReplaceChild("handbreak", CubeListBuilder.create().texOffs(105, 30).addBox(-0.85F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(105, 30).addBox(-0.175F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 0).addBox(0.175F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F))
                .texOffs(0, 0).addBox(-0.225F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, new CubeDeformation(-0.125F)), PartPose.offsetAndRotation(6.0335F, 28.7587F, -19.4562F, -0.6109F, 0.0F, 0.0F));

        PartDefinition bone70 = side5.addOrReplaceChild("bone70", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone71 = bone70.addOrReplaceChild("bone71", CubeListBuilder.create().texOffs(82, 110).addBox(-25.4F, 18.3357F, 5.056F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(36, 90).addBox(-25.4F, 18.3357F, 7.056F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone72 = bone70.addOrReplaceChild("bone72", CubeListBuilder.create().texOffs(0, 123).addBox(-25.4F, 22.5581F, 2.9901F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition bone73 = side5.addOrReplaceChild("bone73", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone74 = bone73.addOrReplaceChild("bone74", CubeListBuilder.create().texOffs(106, 111).addBox(7.4312F, 25.782F, 5.056F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 90).addBox(7.4312F, 25.782F, 7.056F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone75 = bone74.addOrReplaceChild("bone75", CubeListBuilder.create().texOffs(59, 97).addBox(5.4678F, 12.6553F, 34.7673F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, -11.0784F, 10.8321F, -1.1345F, 0.0F, 0.0F));

        PartDefinition side6 = base.addOrReplaceChild("side6", CubeListBuilder.create(), PartPose.offsetAndRotation(-32.0F, 3.0F, -8.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone76 = side6.addOrReplaceChild("bone76", CubeListBuilder.create().texOffs(78, 41).addBox(15.1902F, -15.15F, -41.582F, 12.0F, 3.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(88, 110).addBox(15.3902F, -14.65F, -42.082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(110, 55).addBox(15.3902F, -14.65F, -42.482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(88, 110).addBox(25.9902F, -14.65F, -42.082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F))
                .texOffs(110, 55).addBox(25.9902F, -14.65F, -42.482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(95, 104).addBox(18.1902F, -23.1F, -32.832F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(86, 81).addBox(18.2652F, -23.3F, -33.932F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(88, 45).addBox(21.2652F, -25.0F, -33.932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 45).addBox(19.2652F, -24.0F, -33.932F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(86, 81).addBox(18.2652F, -22.9F, -33.932F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(86, 81).addBox(18.2652F, -21.5F, -33.932F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(0, 104).addBox(18.1902F, -23.2F, -33.932F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 104).addBox(23.2902F, -23.2F, -33.932F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(30, 0).addBox(16.1902F, -20.1F, -30.832F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(30, 0).addBox(16.1902F, -6.1F, -30.832F, 10.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(130, 78).addBox(20.1902F, -25.7F, -32.832F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(19.2163F, -25.9191F, -32.832F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 104).addBox(21.1642F, -25.9191F, -32.832F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(6, 129).addBox(13.1902F, -15.65F, -41.882F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(62, 28).addBox(11.4964F, -15.65F, -40.0124F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(128, 125).addBox(27.1902F, -15.65F, -41.882F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(46, 51).addBox(27.7402F, -15.65F, -40.1026F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone82_r1 = bone76.addOrReplaceChild("bone82_r1", CubeListBuilder.create().texOffs(88, 45).addBox(-0.9622F, -0.5F, -0.5098F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(21.7733F, -25.5F, -33.1438F, 0.0F, -1.6144F, 0.5236F));

        PartDefinition bone78_r1 = bone76.addOrReplaceChild("bone78_r1", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0081F, -0.5F, -0.5382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(21.7733F, -25.5F, -33.1438F, 0.0F, 0.0F, 0.5236F));

        PartDefinition bone80_r1 = bone76.addOrReplaceChild("bone80_r1", CubeListBuilder.create().texOffs(88, 45).addBox(-0.9959F, -0.4929F, -0.5382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(21.7733F, -25.5F, -33.1438F, 0.0F, 0.0F, 2.618F));

        PartDefinition bone79_r1 = bone76.addOrReplaceChild("bone79_r1", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0047F, -0.4933F, -0.5382F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(21.7733F, -25.5F, -33.1438F, 0.0F, 0.0F, 1.4835F));

        PartDefinition bone80_r2 = bone76.addOrReplaceChild("bone80_r2", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(20.2652F, -23.5F, -33.432F, 0.0F, 0.0F, 2.0944F));

        PartDefinition bone79_r2 = bone76.addOrReplaceChild("bone79_r2", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(20.2652F, -23.5F, -33.432F, 0.0F, 0.0F, 0.9599F));

        PartDefinition bone82_r2 = bone76.addOrReplaceChild("bone82_r2", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, 0.5F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(18.5331F, -24.5F, -33.432F, 0.0F, -1.6144F, 0.0F));

        PartDefinition bone81_r1 = bone76.addOrReplaceChild("bone81_r1", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, 0.5F, -2.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 45).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(20.5331F, -25.5F, -33.432F, 0.0F, -1.6144F, 0.0F));

        PartDefinition bone79_r3 = bone76.addOrReplaceChild("bone79_r3", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(22.2652F, -24.5F, -33.432F, 0.0F, 0.0F, 2.0944F));

        PartDefinition bone81_r2 = bone76.addOrReplaceChild("bone81_r2", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(20.5365F, -25.4869F, -32.932F, 0.0F, 0.0F, -3.098F));

        PartDefinition bone80_r3 = bone76.addOrReplaceChild("bone80_r3", CubeListBuilder.create().texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(20.5365F, -25.4869F, -32.932F, 0.0F, 0.0F, 2.0071F));

        PartDefinition bone79_r4 = bone76.addOrReplaceChild("bone79_r4", CubeListBuilder.create().texOffs(88, 45).addBox(-2.8F, 0.35F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(22.2652F, -24.5F, -33.432F, 0.0F, 0.0F, 0.9599F));

        PartDefinition bone147 = bone76.addOrReplaceChild("bone147", CubeListBuilder.create(), PartPose.offset(24.2733F, -16.6497F, -40.4036F));

        PartDefinition bone147_r1 = bone147.addOrReplaceChild("bone147_r1", CubeListBuilder.create().texOffs(88, 45).addBox(7.0378F, -2.5F, 0.4902F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(101, 61).addBox(7.2878F, -3.0F, 0.4902F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-2.0F, -7.8503F, -0.9902F, 0.0F, 0.0F, 1.5708F));

        PartDefinition bone147_r2 = bone147.addOrReplaceChild("bone147_r2", CubeListBuilder.create().texOffs(101, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.0625F, 0.0F, 0.8727F, 0.0F, 1.5708F));

        PartDefinition bone147_r3 = bone147.addOrReplaceChild("bone147_r3", CubeListBuilder.create().texOffs(101, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -0.0625F, 0.0F, 2.0508F, 0.0F, 1.5708F));

        PartDefinition facingcontrol = bone76.addOrReplaceChild("facingcontrol", CubeListBuilder.create(), PartPose.offset(21.3652F, -24.2F, -33.4654F));

        PartDefinition bone77 = bone76.addOrReplaceChild("bone77", CubeListBuilder.create().texOffs(130, 78).addBox(20.852F, -10.5895F, -30.132F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -23.1F, -2.7F, 0.0F, 0.0F, 0.3491F));

        PartDefinition bone78 = bone76.addOrReplaceChild("bone78", CubeListBuilder.create().texOffs(130, 78).addBox(18.852F, 4.5895F, -30.132F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -23.1F, -2.7F, 0.0F, 0.0F, -0.3491F));

        PartDefinition bone79 = bone76.addOrReplaceChild("bone79", CubeListBuilder.create().texOffs(78, 55).addBox(19.7902F, -15.066F, -27.0951F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 11).addBox(19.7902F, -15.516F, -26.7201F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(19.2902F, -15.066F, -28.0951F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 78).addBox(17.2902F, -15.066F, -31.0951F, 10.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(10, 67).addBox(18.2902F, -0.566F, -37.6951F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(78, 29).addBox(16.2902F, -15.066F, -33.0951F, 12.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(63, 4).addBox(16.2902F, -15.066F, -36.0951F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(63, 4).addBox(16.2902F, -15.066F, -36.0951F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(103, 61).addBox(19.2902F, -15.066F, -39.3951F, 6.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
                .texOffs(68, 26).addBox(19.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(19.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 88).addBox(20.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(20.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(20.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 88).addBox(21.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(21.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(21.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(22.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(22.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(11, 107).addBox(23.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(23.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(23.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 88).addBox(19.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 88).addBox(19.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 88).addBox(24.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(19.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(19.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(88, 88).addBox(20.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(20.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(20.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(21.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(21.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(11, 107).addBox(22.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(11, 107).addBox(22.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(11, 107).addBox(21.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(22.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(22.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(11, 107).addBox(23.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(23.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(23.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(24.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(24.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(19.7902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(20.2902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(38, 82).addBox(20.7902F, -15.266F, -39.1951F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(22.7902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(22.2902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(23.2902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(68, 26).addBox(23.7902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1F, -20.4268F, -2.6F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone149 = bone79.addOrReplaceChild("bone149", CubeListBuilder.create().texOffs(57, 132).addBox(-1.0385F, -0.0538F, -0.9615F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(26, 105).addBox(0.8615F, 0.2462F, -0.3615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(79, 102).addBox(-0.4385F, 0.2462F, -1.4615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(63, 86).addBox(-0.4385F, 0.2462F, -1.7615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(0, 96).addBox(-0.1385F, 0.2462F, -0.3615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(26, 105).addBox(-0.9385F, -0.9538F, -0.8615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(27, 109).addBox(-0.9385F, -0.7538F, -0.8615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(27, 109).addBox(-0.1385F, -0.7538F, -0.3615F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(93, 104).addBox(-0.1385F, -0.9538F, -0.3615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(93, 104).addBox(-1.7385F, 0.2462F, -0.5615F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(0, 96).addBox(-1.6385F, 0.2462F, -0.5615F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
                .texOffs(63, 86).addBox(-0.6385F, 0.2462F, 0.8385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.275F))
                .texOffs(79, 102).addBox(-0.6385F, 0.2462F, -0.3615F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(22.3281F, -16.1554F, -31.8778F, 0.0F, -0.6109F, 0.0F));

        PartDefinition bone80 = bone76.addOrReplaceChild("bone80", CubeListBuilder.create().texOffs(30, 14).addBox(19.7902F, 2.6262F, -31.0174F, 5.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 70).addBox(19.2902F, 2.6262F, -32.0174F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 84).addBox(17.7902F, 2.6262F, -35.0174F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(63, 0).addBox(16.2902F, 2.6262F, -38.0174F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(52, 62).addBox(16.2902F, 2.6262F, -40.0174F, 12.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.1F, -12.1499F, -0.5857F, -0.0873F, 0.0F, 0.0F));

        PartDefinition bone81 = side6.addOrReplaceChild("bone81", CubeListBuilder.create().texOffs(49, 132).addBox(22.1902F, 24.2366F, -15.3209F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone82 = bone81.addOrReplaceChild("bone82", CubeListBuilder.create().texOffs(51, 115).addBox(7.0231F, 23.1564F, -15.3209F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(128, 6).addBox(7.0231F, 26.9564F, -15.7209F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(52, 38).addBox(7.6231F, 24.1564F, -15.7209F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(52, 38).addBox(8.0231F, 24.1564F, -15.7209F, 0.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                .texOffs(46, 46).addBox(8.6231F, 24.1564F, -15.7209F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(46, 46).addBox(8.6231F, 25.1564F, -15.7209F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(46, 46).addBox(8.6231F, 24.1564F, -15.7209F, 0.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                .texOffs(30, 132).addBox(7.0231F, 26.9564F, -16.1209F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(30, 132).addBox(7.0231F, 28.9564F, -16.1209F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F))
                .texOffs(17, 84).addBox(7.5231F, 29.4314F, -16.3209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F))
                .texOffs(82, 88).addBox(7.5231F, 27.4064F, -16.3209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.4F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone83 = side6.addOrReplaceChild("bone83", CubeListBuilder.create().texOffs(126, 131).addBox(22.1902F, 24.2366F, -15.3209F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.0472F, 0.0F, 0.0F));

        PartDefinition bone84 = bone83.addOrReplaceChild("bone84", CubeListBuilder.create().texOffs(115, 37).addBox(31.1993F, 4.4005F, -15.3209F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 90).addBox(31.1993F, 10.3005F, -16.3209F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 0).addBox(33.2993F, 12.3005F, -16.3209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(27, 0).addBox(31.0993F, 12.3005F, -16.3209F, 0.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(0, 84).addBox(31.2993F, 10.4005F, -16.9209F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(0, 84).addBox(32.0993F, 10.4005F, -16.9209F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(90, 0).addBox(31.1993F, 6.3005F, -15.8209F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(104, 29).addBox(31.1993F, 7.8005F, -15.5209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(17, 104).addBox(32.1993F, 7.8005F, -15.5209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(54, 103).addBox(31.0993F, 6.3005F, -16.3209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(54, 103).addBox(32.2993F, 6.3005F, -16.3209F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition refuel = bone84.addOrReplaceChild("refuel", CubeListBuilder.create().texOffs(32, 101).addBox(0.35F, -0.5F, -2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(131, 34).addBox(0.35F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(131, 34).addBox(-1.35F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F))
                .texOffs(32, 101).addBox(-1.35F, -0.5F, -2.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(32.2493F, 13.4005F, -16.0209F, 0.4363F, 0.0F, 0.0F));

        PartDefinition bone85 = side6.addOrReplaceChild("bone85", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone86 = bone85.addOrReplaceChild("bone86", CubeListBuilder.create().texOffs(0, 110).addBox(5.4618F, 25.5046F, 4.4833F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(59, 88).addBox(5.4618F, 25.5046F, 6.4833F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

        PartDefinition bone87 = bone85.addOrReplaceChild("bone87", CubeListBuilder.create().texOffs(46, 40).addBox(5.4618F, 28.8133F, -0.5587F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -2.0F, 0.0F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition bone88 = side6.addOrReplaceChild("bone88", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -15.5F, -11.5F, -1.6581F, 0.0F, 0.0F));

        PartDefinition bone89 = bone88.addOrReplaceChild("bone89", CubeListBuilder.create().texOffs(74, 114).addBox(32.7605F, 6.7486F, 4.4833F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(85, 84).addBox(32.7605F, 6.7486F, 6.4833F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition bone90 = bone89.addOrReplaceChild("bone90", CubeListBuilder.create().texOffs(30, 99).addBox(30.7971F, 5.1304F, 17.2752F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9634F, -11.0784F, 10.8321F, -1.1345F, 0.0F, 0.0F));

        PartDefinition bone95 = base.addOrReplaceChild("bone95", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -1.0F));

        PartDefinition bone94 = bone95.addOrReplaceChild("bone94", CubeListBuilder.create().texOffs(104, 47).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5726F, 6.8804F, 8.652F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition bone93 = bone95.addOrReplaceChild("bone93", CubeListBuilder.create().texOffs(36, 61).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2239F, -1.0891F, 6.3161F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone92 = bone95.addOrReplaceChild("bone92", CubeListBuilder.create().texOffs(30, 28).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2239F, -1.0891F, 8.0481F, 0.0873F, 0.5236F, 0.0F));

        PartDefinition bone91 = bone95.addOrReplaceChild("bone91", CubeListBuilder.create().texOffs(62, 47).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(67, 127).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));

        PartDefinition bone92_r1 = bone91.addOrReplaceChild("bone92_r1", CubeListBuilder.create().texOffs(21, 1).addBox(-1.0392F, -1.5531F, 1.0054F, 1.0F, 1.0F, 0.0F, new CubeDeformation(-0.15F))
                .texOffs(12, 0).addBox(-1.0392F, -1.5531F, -1.4946F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(118, 64).addBox(-0.9892F, -1.5531F, -3.6946F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.5999F, -21.3182F, 8.4414F, 2.0071F, 0.0F, 0.0F));

        PartDefinition bone91_r1 = bone91.addOrReplaceChild("bone91_r1", CubeListBuilder.create().texOffs(95, 98).addBox(-0.1082F, -1.0047F, 0.7496F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 77).addBox(-1.5582F, -2.4047F, -3.9504F, 4.0F, 4.0F, 7.0F, new CubeDeformation(-2.25F))
                .texOffs(12, 0).addBox(-0.1082F, -1.0047F, -1.7504F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1309F, -21.6141F, 8.4707F, 2.0071F, 0.2618F, 0.0F));

        PartDefinition bone96 = base.addOrReplaceChild("bone96", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.95F, 1.0F, -0.4F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone97 = bone96.addOrReplaceChild("bone97", CubeListBuilder.create().texOffs(107, 65).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5726F, 6.8804F, 8.652F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition bone98 = bone96.addOrReplaceChild("bone98", CubeListBuilder.create().texOffs(55, 14).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2239F, -1.0891F, 6.3161F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone99 = bone96.addOrReplaceChild("bone99", CubeListBuilder.create().texOffs(62, 36).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2239F, -1.0891F, 8.0481F, 0.0873F, 0.5236F, 0.0F));

        PartDefinition bone100 = bone96.addOrReplaceChild("bone100", CubeListBuilder.create().texOffs(36, 62).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(29, 96).addBox(-1.5891F, -22.3713F, 2.0468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 57).addBox(-2.731F, -22.0101F, 1.2854F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(68, 107).addBox(-1.5891F, -22.3713F, 2.5468F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
                .texOffs(29, 96).addBox(-1.5891F, -22.3713F, 7.0468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(118, 64).addBox(-0.9891F, -21.9713F, 4.8468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
                .texOffs(19, 0).addBox(-1.4891F, -22.5713F, 9.2468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(127, 31).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));

        PartDefinition bone101 = base.addOrReplaceChild("bone101", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 1.0F, -0.6F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone102 = bone101.addOrReplaceChild("bone102", CubeListBuilder.create().texOffs(27, 107).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5726F, 6.8804F, 8.652F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition bone103 = bone101.addOrReplaceChild("bone103", CubeListBuilder.create().texOffs(30, 50).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2239F, -1.0891F, 6.3161F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone104 = bone101.addOrReplaceChild("bone104", CubeListBuilder.create().texOffs(62, 25).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2239F, -1.0891F, 8.0481F, 0.0873F, 0.5236F, 0.0F));

        PartDefinition bone105 = bone101.addOrReplaceChild("bone105", CubeListBuilder.create().texOffs(20, 61).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(125, 64).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(19, 0).addBox(-1.7391F, -22.4713F, 9.1468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(118, 64).addBox(-1.2391F, -21.8713F, 4.7468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
                .texOffs(29, 96).addBox(-1.8391F, -22.2713F, 6.9468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 107).addBox(-1.8391F, -22.2713F, 2.4468F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
                .texOffs(29, 96).addBox(-1.8391F, -22.2713F, 1.9468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));

        PartDefinition bone106 = base.addOrReplaceChild("bone106", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 1.0F, -1.9F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone107 = bone106.addOrReplaceChild("bone107", CubeListBuilder.create().texOffs(106, 105).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5726F, 6.8804F, 8.652F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition bone108 = bone106.addOrReplaceChild("bone108", CubeListBuilder.create().texOffs(46, 28).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2239F, -1.0891F, 6.3161F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone109 = bone106.addOrReplaceChild("bone109", CubeListBuilder.create().texOffs(55, 14).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2239F, -1.0891F, 8.0481F, 0.0873F, 0.5236F, 0.0F));

        PartDefinition bone110 = bone106.addOrReplaceChild("bone110", CubeListBuilder.create().texOffs(46, 51).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(52, 70).addBox(-2.2141F, -21.0713F, 0.6468F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                .texOffs(109, 102).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(19, 0).addBox(-1.6391F, -22.5713F, 9.3468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(118, 64).addBox(-1.0391F, -22.0713F, 4.9468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
                .texOffs(29, 96).addBox(-1.6391F, -22.4713F, 7.1468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 107).addBox(-1.6391F, -22.4713F, 2.6468F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
                .texOffs(29, 96).addBox(-1.6391F, -22.4713F, 2.1468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));

        PartDefinition bone111 = base.addOrReplaceChild("bone111", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.925F, 1.0F, -2.4F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone112 = bone111.addOrReplaceChild("bone112", CubeListBuilder.create().texOffs(0, 104).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5726F, 6.8804F, 8.652F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition bone113 = bone111.addOrReplaceChild("bone113", CubeListBuilder.create().texOffs(30, 39).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2239F, -1.0891F, 6.3161F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone114 = bone111.addOrReplaceChild("bone114", CubeListBuilder.create().texOffs(30, 50).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2239F, -1.0891F, 8.0481F, 0.0873F, 0.5236F, 0.0F));

        PartDefinition bone115 = bone111.addOrReplaceChild("bone115", CubeListBuilder.create().texOffs(46, 40).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(68, 107).addBox(-1.6141F, -22.4445F, 2.3468F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
                .texOffs(118, 64).addBox(-1.0141F, -21.8713F, 4.7468F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
                .texOffs(29, 96).addBox(-1.6141F, -22.4445F, 1.8468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(29, 96).addBox(-1.6141F, -22.4445F, 6.8468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 0).addBox(-1.6141F, -22.4445F, 9.0468F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(62, 58).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));

        PartDefinition bone116 = base.addOrReplaceChild("bone116", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.225F, 1.0F, -2.325F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone117 = bone116.addOrReplaceChild("bone117", CubeListBuilder.create().texOffs(103, 27).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.5726F, 6.8804F, 8.652F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition bone118 = bone116.addOrReplaceChild("bone118", CubeListBuilder.create().texOffs(30, 28).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.2239F, -1.0891F, 6.3161F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone119 = bone116.addOrReplaceChild("bone119", CubeListBuilder.create().texOffs(46, 29).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.2239F, -1.0891F, 8.0481F, 0.0873F, 0.5236F, 0.0F));

        PartDefinition bone120 = bone116.addOrReplaceChild("bone120", CubeListBuilder.create().texOffs(30, 39).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(29, 96).addBox(-1.8141F, -22.2713F, 1.8718F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 107).addBox(-1.8141F, -22.2713F, 2.3718F, 2.0F, 2.0F, 5.0F, new CubeDeformation(-0.1F))
                .texOffs(29, 96).addBox(-1.8141F, -22.2713F, 6.8718F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(118, 64).addBox(-1.2141F, -21.8713F, 4.6718F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.25F))
                .texOffs(19, 0).addBox(-1.8141F, -22.3713F, 9.0718F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
                .texOffs(30, 24).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.5236F, 0.0F));

        PartDefinition circle = base.addOrReplaceChild("circle", CubeListBuilder.create(), PartPose.offset(2.5F, -25.0F, -57.5F));

        PartDefinition bone128 = circle.addOrReplaceChild("bone128", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition bone129 = circle.addOrReplaceChild("bone129", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone130 = circle.addOrReplaceChild("bone130", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone131 = circle.addOrReplaceChild("bone131", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition circle2 = base.addOrReplaceChild("circle2", CubeListBuilder.create(), PartPose.offset(2.5F, -37.0F, -57.5F));

        PartDefinition bone132 = circle2.addOrReplaceChild("bone132", CubeListBuilder.create().texOffs(101, 21).addBox(-8.0F, -11.0F, 2.3F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition bone133 = circle2.addOrReplaceChild("bone133", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone134 = circle2.addOrReplaceChild("bone134", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone135 = circle2.addOrReplaceChild("bone135", CubeListBuilder.create().texOffs(101, 3).addBox(-8.0F, -11.0F, 9.0244F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition circle3 = base.addOrReplaceChild("circle3", CubeListBuilder.create(), PartPose.offset(2.5F, -49.0F, -57.5F));

        PartDefinition bone136 = circle3.addOrReplaceChild("bone136", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition bone137 = circle3.addOrReplaceChild("bone137", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone138 = circle3.addOrReplaceChild("bone138", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone139 = circle3.addOrReplaceChild("bone139", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition circle4 = base.addOrReplaceChild("circle4", CubeListBuilder.create(), PartPose.offset(2.5F, -41.0F, -57.5F));

        PartDefinition bone142 = circle4.addOrReplaceChild("bone142", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition bone143 = circle4.addOrReplaceChild("bone143", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone144 = circle4.addOrReplaceChild("bone144", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 50.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone145 = circle4.addOrReplaceChild("bone145", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 50.0F));

        PartDefinition rotar3 = base.addOrReplaceChild("rotar3", CubeListBuilder.create(), PartPose.offsetAndRotation(5.1F, -16.0F, -1.5F, 0.0F, 0.0F, 0.0349F));

        PartDefinition bone121 = rotar3.addOrReplaceChild("bone121", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5983F, -83.9058F, -5.0F, 1.0F, 64.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 20.0F, 2.0F));

        PartDefinition bone122 = rotar3.addOrReplaceChild("bone122", CubeListBuilder.create().texOffs(14, 0).addBox(-2.1301F, -83.9058F, 2.5444F, 1.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 20.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone123 = rotar3.addOrReplaceChild("bone123", CubeListBuilder.create().texOffs(14, 0).addBox(0.6983F, -83.9058F, -8.3728F, 1.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 20.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition rotar2 = base.addOrReplaceChild("rotar2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, -16.0F, -1.5F, 0.0F, 3.1416F, -0.0349F));

        PartDefinition bone124 = rotar2.addOrReplaceChild("bone124", CubeListBuilder.create().texOffs(0, 0).addBox(-1.8993F, -83.9651F, -5.0F, 1.0F, 64.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(1.1F, 20.0F, 2.0F));

        PartDefinition bone125 = rotar2.addOrReplaceChild("bone125", CubeListBuilder.create().texOffs(22, 0).addBox(-0.9288F, -83.9651F, 1.343F, 1.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 20.0F, 2.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone126 = rotar2.addOrReplaceChild("bone126", CubeListBuilder.create().texOffs(14, 0).addBox(1.8996F, -83.9651F, -7.1714F, 1.0F, 64.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, 20.0F, 2.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition bone127 = base.addOrReplaceChild("bone127", CubeListBuilder.create().texOffs(101, 0).addBox(-5.0F, -49.0F, -34.6F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(78, 27).addBox(-7.1301F, -48.5F, -38.1641F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 101).addBox(-5.0F, -49.0F, -18.2795F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(93, 10).addBox(-7.1301F, -48.5F, -14.9154F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(75, 74).addBox(1.7699F, -48.5F, -22.9154F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.25F)), PartPose.offset(-0.95F, 1.0F, 24.5F));

        PartDefinition bone141 = base.addOrReplaceChild("bone141", CubeListBuilder.create().texOffs(99, 58).addBox(-27.4645F, -49.0F, 4.3096F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(98, 18).addBox(-27.4645F, -49.0F, 20.6301F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(78, 25).addBox(-29.486F, -48.5F, 24.2569F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 1.0F, 24.5F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone140 = base.addOrReplaceChild("bone140", CubeListBuilder.create().texOffs(98, 14).addBox(-27.4645F, -49.0F, -21.6301F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(61, 78).addBox(-27.4645F, -49.0F, -5.3096F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(76, 12).addBox(-29.6161F, -48.5F, -1.7828F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(78, 32).addBox(-29.6161F, -48.5F, -25.0315F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(125, 55).addBox(-18.6161F, -48.5F, -25.0315F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F))
                .texOffs(123, 42).addBox(-27.6161F, -48.5F, -4.7828F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.95F, 1.0F, 24.5F, 0.0F, -1.0472F, 0.0F));

        PartDefinition monitor = base.addOrReplaceChild("monitor", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.35F, -32.0F, -1.5F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone140_r1 = monitor.addOrReplaceChild("bone140_r1", CubeListBuilder.create().texOffs(164, 87).addBox(6.0F, -5.75F, 0.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(103, 90).addBox(-4.0F, -13.45F, 0.5F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(71, 22).addBox(-7.0F, -6.55F, 0.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(160, 6).addBox(-7.0F, 5.55F, 0.0F, 14.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                .texOffs(166, 92).addBox(-7.0F, -5.75F, 0.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.101F))
                .texOffs(192, 183).addBox(4.8F, 1.55F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
                .texOffs(190, 182).addBox(4.8F, 1.55F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
                .texOffs(190, 182).addBox(4.8F, -2.45F, -1.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.05F))
                .texOffs(201, 10).addBox(-0.5F, 3.15F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
                .texOffs(192, 183).addBox(4.8F, -2.45F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
                .texOffs(186, 182).addBox(-1.5F, -4.45F, -1.5F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F))
                .texOffs(168, 110).addBox(-5.0F, 2.55F, -1.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(159, 11).addBox(-5.0F, -3.45F, -0.6F, 10.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(168, 110).addBox(-5.0F, -4.45F, -1.0F, 10.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(168, 110).addBox(-6.0F, -3.95F, -1.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(168, 110).addBox(4.0F, -3.95F, -1.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.8161F, -1.05F, 6.0684F, 0.0F, 2.0944F, 0.0F));

        PartDefinition screen = bone140_r1.addOrReplaceChild("screen", CubeListBuilder.create().texOffs(214, 148).addBox(-15.8161F, -37.5F, 5.2184F, 10.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(10.8161F, 34.05F, -6.0684F));

        PartDefinition hammer = base.addOrReplaceChild("hammer", CubeListBuilder.create().texOffs(92, 93).addBox(19.0F, -8.0F, 2.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 90).addBox(19.0F, -3.0F, 1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.35F, 1.0F, -1.5F));

        PartDefinition cube_r1 = hammer.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(54, 45).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.5F, -8.5F, 3.0F, 0.0F, -0.48F, 0.0F));

        PartDefinition cube_r2 = hammer.addOrReplaceChild("cube_r2", CubeListBuilder.create(), PartPose.offsetAndRotation(19.5F, -2.0F, 3.0F, 0.0F, 0.0F, -3.1416F));

        PartDefinition rotor = base.addOrReplaceChild("rotor", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -1.0F));

        PartDefinition rotortop = rotor.addOrReplaceChild("rotortop", CubeListBuilder.create().texOffs(0, 193).addBox(-1.5F, 2.2F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.5F))
                .texOffs(0, 151).addBox(-1.5F, -6.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(2.0F))
                .texOffs(0, 151).addBox(-1.5F, -17.8F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(2.0F))
                .texOffs(0, 143).addBox(-1.5F, -12.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.0F))
                .texOffs(0, 143).addBox(-1.5F, -2.3F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.0F))
                .texOffs(0, 143).addBox(-1.5F, 6.7F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.0F))
                .texOffs(0, 205).addBox(-1.5F, 7.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.6F))
                .texOffs(0, 205).addBox(-1.5F, 8.3F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offset(-1.2F, -59.2F, 0.0F));

        PartDefinition rotorbottom = rotor.addOrReplaceChild("rotorbottom", CubeListBuilder.create().texOffs(0, 166).addBox(-1.5F, -0.0143F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.0F))
                .texOffs(0, 159).addBox(-1.5F, 5.4857F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.5F))
                .texOffs(0, 159).addBox(-1.5F, 11.0857F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(1.7F))
                .texOffs(0, 185).addBox(-1.5F, -3.3143F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.5F))
                .texOffs(0, 173).addBox(-1.5F, -6.3143F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.6F))
                .texOffs(0, 173).addBox(-1.5F, -8.3143F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(-0.6F))
                .texOffs(0, 173).addBox(-1.5F, -10.1143F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offset(-1.2F, -32.4857F, 0.0F));

        PartDefinition controls = partdefinition.addOrReplaceChild("controls", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(12.9255F, -15.6932F, 4.7157F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }


    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnimations(T t, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent(tardis -> {
            this.animate(t.rotorAnimationState, CopperConsoleModelAnimation.ROTOR, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.RANDOMIZER.get()).getUseAnimationState(), CopperConsoleModelAnimation.RANDOMIZER, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.X.get()).getUseAnimationState(), CopperConsoleModelAnimation.X, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.Y.get()).getUseAnimationState(), CopperConsoleModelAnimation.Y, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.Z.get()).getUseAnimationState(), CopperConsoleModelAnimation.Z, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get()).getUseAnimationState(), CopperConsoleModelAnimation.BRAKE, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.DIMENSIONS.get()).getUseAnimationState(), CopperConsoleModelAnimation.DIMENSION, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.DOOR.get()).getUseAnimationState(), CopperConsoleModelAnimation.WIBBLY, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.FACING.get()).getUseAnimationState(), CopperConsoleModelAnimation.FACING, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.FAST_RETURN.get()).getUseAnimationState(), CopperConsoleModelAnimation.FAST_RETURN, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.REFUELER.get()).getUseAnimationState(), CopperConsoleModelAnimation.REFUEL_ON, ageInTicks);
            this.animate(tardis.getControlDataOrCreate(ControlRegistry.STABILIZERS.get()).getUseAnimationState(), CopperConsoleModelAnimation.STABILIZER, ageInTicks);
            CopperConsoleModelAnimation.animateConditional(tardis, this, ageInTicks);
        });
    }

    @Override
    public Optional<String> getPartForControl(ControlType<?> controlType) {
        if (controlType == ControlRegistry.SONIC_PORT.get()) {
            return Optional.of("controls/controls_3/sonic_port/sonic_base");
        }
        return Optional.empty();
    }


    public static class CopperConsoleModelAnimation {
        public static final AnimationDefinition RANDOMIZER = AnimationDefinition.Builder.withLength(2.0F)
                .addAnimation("bone148", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone150", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.125F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.8333F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone152", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0833F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.375F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.4167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.8333F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.875F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone153", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.7917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.875F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone155", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.2917F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4167F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.4583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.625F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone156", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.8333F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9167F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone158", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.2083F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone159", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.2083F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.01F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7083F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone163", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.5417F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.625F, KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("bone164", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0417F, KeyframeAnimations.posVec(-0.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.posVec(0.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F, KeyframeAnimations.posVec(-0.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition THROTTLE_UP = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation("throttle", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(125.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition THROTTLE_DOWN = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation("throttle", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(125.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition REFUEL_ON = AnimationDefinition.Builder.withLength(0.25F)
                .addAnimation("refuel", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition REFUEL_OFF = AnimationDefinition.Builder.withLength(0.25F)
                .addAnimation("refuel", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(-72.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition FAST_RETURN = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation("fastreturn", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -70.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition X = AnimationDefinition.Builder.withLength(0.25F)
                .addAnimation("xswitch", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0833F, KeyframeAnimations.posVec(0.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(-0.25F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition Y = AnimationDefinition.Builder.withLength(0.1667F)
                .addAnimation("yswitch", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0833F, KeyframeAnimations.posVec(0.75F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition Z = AnimationDefinition.Builder.withLength(0.1667F)
                .addAnimation("zswitch", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0833F, KeyframeAnimations.posVec(-1.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition WIBBLY = AnimationDefinition.Builder.withLength(0.1667F)
                .addAnimation("doorcontrol", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0833F, KeyframeAnimations.degreeVec(-70.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition VERTICAL = AnimationDefinition.Builder.withLength(0.625F)
                .addAnimation("verticallanding", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(102.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("verticallanding_r1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(-100.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.625F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition BRAKE = AnimationDefinition.Builder.withLength(0.3333F)
                .addAnimation("handbreak", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("handbreak_r1", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.1667F, KeyframeAnimations.degreeVec(-90.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition DIMENSION = AnimationDefinition.Builder.withLength(1.0F)
                .addAnimation("bone149", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.3333F, KeyframeAnimations.degreeVec(0.0F, 70.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5417F, KeyframeAnimations.degreeVec(0.0F, 277.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F, KeyframeAnimations.degreeVec(0.0F, 355.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition FACING = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation("bone147", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, -180.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition STABILIZER = AnimationDefinition.Builder.withLength(0.75F)
                .addAnimation("bone166", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 90.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 280.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static final AnimationDefinition ROTOR = AnimationDefinition.Builder.withLength(0.75F).looping()
                .addAnimation("rotortop", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, -1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, 3.38F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, 2.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, 0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, -1.25F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("rotorbottom", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.0833F, KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.375F, KeyframeAnimations.posVec(0.0F, -4.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.5F, KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.6667F, KeyframeAnimations.posVec(0.0F, -1.5F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .build();

        public static void animateConditional(ITardisLevel tardis, CopperConsoleModel<?> model, float ageInTicks) {
            final ControlDataFloat throttle = tardis.getControlDataOrCreate(ControlRegistry.THROTTLE.get());
            final ControlDataBool handbrake = tardis.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get());

            model.getAnyDescendantWithName("throttle").ifPresent(control ->
                    control.offsetRotation(AnimationHelper.getSteppedRotation(throttle, 142.5F, throttle.getPrevious(), throttle.get(), ageInTicks, 20, new Vector3f(1, 0, 0))));

            model.getAnyDescendantWithName("handbreak").ifPresent(control ->
                    control.offsetRotation(new Vector3f(AnimationHelper.getSteppedRotation(handbrake, -42.5F, (!handbrake.get() ? 1 : 0), ageInTicks, 20, 5, new Vector3f(1, 0, 0)))));
        }
    }
}