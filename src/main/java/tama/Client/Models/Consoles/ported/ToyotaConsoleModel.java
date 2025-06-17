/* (C) TAMA Studios 2025 */
package tama.Client.Models.Consoles.ported; // Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

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
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.animations.AnimationHelper;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import net.tardis.mod.control.datas.ControlDataBool;
import net.tardis.mod.control.datas.ControlDataFloat;
import net.tardis.mod.control.datas.ControlDataNone;
import net.tardis.mod.registry.ControlRegistry;
import org.joml.Vector3f;
import tama.aseoha;

public class ToyotaConsoleModel<T extends ConsoleTile> extends BaseTileHierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(aseoha.MODID, "toyotaconsolemodel"), "main");
    private final ModelPart base_console;
    private final ModelPart centre_column;
    private final ModelPart rotorbeam_glow;
    private final ModelPart bone176;
    private final ModelPart bone192;
    private final ModelPart bone197;
    private final ModelPart bone198;
    private final ModelPart bone199;
    private final ModelPart bone130;
    private final ModelPart bone131;
    private final ModelPart bone42;
    private final ModelPart bone44;
    private final ModelPart bone45;
    private final ModelPart bone46;
    private final ModelPart bone47;
    private final ModelPart bone137;
    private final ModelPart bone36;
    private final ModelPart bone38;
    private final ModelPart bone39;
    private final ModelPart bone40;
    private final ModelPart bone41;
    private final ModelPart top_column;
    private final ModelPart bone145;
    private final ModelPart bone146;
    private final ModelPart bone30;
    private final ModelPart bone32;
    private final ModelPart bone33;
    private final ModelPart bone34;
    private final ModelPart bone35;
    private final ModelPart bone152;
    private final ModelPart bone25;
    private final ModelPart bone26;
    private final ModelPart bone27;
    private final ModelPart bone28;
    private final ModelPart bone29;
    private final ModelPart bone158;
    private final ModelPart bone159;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone6;
    private final ModelPart bone165;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart bone11;
    private final ModelPart bone12;
    private final ModelPart bone171;
    private final ModelPart bone172;
    private final ModelPart bone20;
    private final ModelPart bone21;
    private final ModelPart bone22;
    private final ModelPart bone23;
    private final ModelPart bone24;
    private final ModelPart bone178;
    private final ModelPart bone14;
    private final ModelPart bone15;
    private final ModelPart bone16;
    private final ModelPart bone17;
    private final ModelPart bone18;
    private final ModelPart bone206;
    private final ModelPart bone207;
    private final ModelPart bone208;
    private final ModelPart bone209;
    private final ModelPart bone210;
    private final ModelPart bone211;
    private final ModelPart bone200;
    private final ModelPart bone201;
    private final ModelPart bone202;
    private final ModelPart bone203;
    private final ModelPart bone204;
    private final ModelPart bone205;
    private final ModelPart base;
    private final ModelPart base_glow;
    private final ModelPart bone153;
    private final ModelPart bone154;
    private final ModelPart bone155;
    private final ModelPart bone156;
    private final ModelPart bone157;
    private final ModelPart bone13;
    private final ModelPart bone140;
    private final ModelPart bone141;
    private final ModelPart bone142;
    private final ModelPart bone143;
    private final ModelPart bone144;
    private final ModelPart bone7;
    private final ModelPart bone134;
    private final ModelPart bone135;
    private final ModelPart bone136;
    private final ModelPart bone138;
    private final ModelPart bone139;
    private final ModelPart bone;
    private final ModelPart bone147;
    private final ModelPart bone148;
    private final ModelPart bone149;
    private final ModelPart bone150;
    private final ModelPart bone151;
    private final ModelPart bone129;
    private final ModelPart bone123;
    private final ModelPart bone54;
    private final ModelPart bone57;
    private final ModelPart bone58;
    private final ModelPart bone59;
    private final ModelPart bone60;
    private final ModelPart bone117;
    private final ModelPart bone48;
    private final ModelPart bone50;
    private final ModelPart bone51;
    private final ModelPart bone52;
    private final ModelPart bone53;
    private final ModelPart bone85;
    private final ModelPart bone86;
    private final ModelPart bone109;
    private final ModelPart bone110;
    private final ModelPart bone111;
    private final ModelPart bone112;
    private final ModelPart bone113;
    private final ModelPart bone114;
    private final ModelPart bone115;
    private final ModelPart bone116;
    private final ModelPart bone118;
    private final ModelPart bone119;
    private final ModelPart bone81;
    private final ModelPart bone82;
    private final ModelPart bone83;
    private final ModelPart bone84;
    private final ModelPart bone61;
    private final ModelPart bone62;
    private final ModelPart bone63;
    private final ModelPart bone64;
    private final ModelPart bone65;
    private final ModelPart bone66;
    private final ModelPart bone69;
    private final ModelPart bone70;
    private final ModelPart bone71;
    private final ModelPart bone72;
    private final ModelPart bone73;
    private final ModelPart bone74;
    private final ModelPart bone75;
    private final ModelPart bone76;
    private final ModelPart bone77;
    private final ModelPart bone78;
    private final ModelPart bone79;
    private final ModelPart bone80;
    private final ModelPart bone87;
    private final ModelPart bone88;
    private final ModelPart bone67;
    private final ModelPart bone68;
    private final ModelPart bone89;
    private final ModelPart bone90;
    private final ModelPart bone91;
    private final ModelPart bone92;
    private final ModelPart bone93;
    private final ModelPart bone94;
    private final ModelPart bone95;
    private final ModelPart bone96;
    private final ModelPart bone97;
    private final ModelPart bone98;
    private final ModelPart bone55;
    private final ModelPart bone56;
    private final ModelPart bone160;
    private final ModelPart bone161;
    private final ModelPart bone162;
    private final ModelPart bone163;
    private final ModelPart bone164;
    private final ModelPart bone166;
    private final ModelPart bone167;
    private final ModelPart bone168;
    private final ModelPart bone169;
    private final ModelPart bone170;
    private final ModelPart bone43;
    private final ModelPart bone49;
    private final ModelPart bone120;
    private final ModelPart bone121;
    private final ModelPart bone122;
    private final ModelPart bone124;
    private final ModelPart bone125;
    private final ModelPart bone126;
    private final ModelPart bone127;
    private final ModelPart bone128;
    private final ModelPart bone132;
    private final ModelPart bone133;
    private final ModelPart bone37;
    private final ModelPart bone104;
    private final ModelPart bone105;
    private final ModelPart bone106;
    private final ModelPart bone107;
    private final ModelPart bone108;
    private final ModelPart bone31;
    private final ModelPart bone99;
    private final ModelPart bone100;
    private final ModelPart bone101;
    private final ModelPart bone102;
    private final ModelPart bone103;
    private final ModelPart components;
    private final ModelPart south_west;
    private final ModelPart bone174;
    private final ModelPart incrementmodifier_rotate_Y60;
    private final ModelPart randomiser;
    private final ModelPart randomiser_glow;
    private final ModelPart communicator;
    private final ModelPart landtype_selector;
    private final ModelPart sonicport;
    private final ModelPart southwest_glow;
    private final ModelPart bone190;
    private final ModelPart bone212;
    private final ModelPart bone239;
    private final ModelPart bone215;
    private final ModelPart north_west;
    private final ModelPart bone173;
    private final ModelPart dimensioncontrol;
    private final ModelPart dimensioncontrol_glow;
    private final ModelPart dimensionrotate_Y35;
    private final ModelPart bone228;
    private final ModelPart dimensionrotate_Y65;
    private final ModelPart dimensionrotate_Y50;
    private final ModelPart directioncontrol_rotate_Y90;
    private final ModelPart bone177;
    private final ModelPart bone227;
    private final ModelPart north;
    private final ModelPart bone179;
    private final ModelPart door_rotate_x_100;
    private final ModelPart fastreturn_rotate_X65;
    private final ModelPart landtype_rotate_Y70;
    private final ModelPart refuel;
    private final ModelPart north_glow;
    private final ModelPart bone233;
    private final ModelPart bone234;
    private final ModelPart bone194;
    private final ModelPart bone183;
    private final ModelPart bone182;
    private final ModelPart bone225;
    private final ModelPart door2_rotate_x_100;
    private final ModelPart north_east;
    private final ModelPart bone180;
    private final ModelPart bone181;
    private final ModelPart bone184;
    private final ModelPart monitor_glow_optional;
    private final ModelPart monitor_glow;
    private final ModelPart bone186;
    private final ModelPart bone185;
    private final ModelPart south_east;
    private final ModelPart bone187;
    private final ModelPart telepathic_glow;
    private final ModelPart south;
    private final ModelPart bone188;
    private final ModelPart throttle_rotate_X80;
    private final ModelPart bone220;
    private final ModelPart bone221;
    private final ModelPart handbrake_rotate_Y130;
    private final ModelPart bone196;
    private final ModelPart stabiliser;
    private final ModelPart stabiliser_glow;
    private final ModelPart Xincrement;
    private final ModelPart bone222;
    private final ModelPart Yincrement;
    private final ModelPart bone223;
    private final ModelPart Zincrement;
    private final ModelPart bone224;
    private final ModelPart south_glow;
    private final ModelPart bone235;
    private final ModelPart bone236;
    private final ModelPart bone237;
    private final ModelPart bone238;
    private final ModelPart bone219;
    private final ModelPart rotor_top_translate_8;
    private final ModelPart rotortop_glow;
    private final ModelPart rotor_bottom_translate_14;
    private final ModelPart rotorbottom_glow;

    public ToyotaConsoleModel(ModelPart root) {
        super(root);
        this.base_console = root.getChild("base_console");
        this.centre_column = this.base_console.getChild("centre_column");
        this.rotorbeam_glow = this.centre_column.getChild("rotorbeam_glow");
        this.bone176 = this.rotorbeam_glow.getChild("bone176");
        this.bone192 = this.bone176.getChild("bone192");
        this.bone197 = this.bone192.getChild("bone197");
        this.bone198 = this.bone197.getChild("bone198");
        this.bone199 = this.bone198.getChild("bone199");
        this.bone130 = this.centre_column.getChild("bone130");
        this.bone131 = this.bone130.getChild("bone131");
        this.bone42 = this.bone131.getChild("bone42");
        this.bone44 = this.bone42.getChild("bone44");
        this.bone45 = this.bone44.getChild("bone45");
        this.bone46 = this.bone45.getChild("bone46");
        this.bone47 = this.bone46.getChild("bone47");
        this.bone137 = this.bone130.getChild("bone137");
        this.bone36 = this.bone137.getChild("bone36");
        this.bone38 = this.bone36.getChild("bone38");
        this.bone39 = this.bone38.getChild("bone39");
        this.bone40 = this.bone39.getChild("bone40");
        this.bone41 = this.bone40.getChild("bone41");
        this.top_column = this.centre_column.getChild("top_column");
        this.bone145 = this.top_column.getChild("bone145");
        this.bone146 = this.bone145.getChild("bone146");
        this.bone30 = this.bone146.getChild("bone30");
        this.bone32 = this.bone30.getChild("bone32");
        this.bone33 = this.bone32.getChild("bone33");
        this.bone34 = this.bone33.getChild("bone34");
        this.bone35 = this.bone34.getChild("bone35");
        this.bone152 = this.bone145.getChild("bone152");
        this.bone25 = this.bone152.getChild("bone25");
        this.bone26 = this.bone25.getChild("bone26");
        this.bone27 = this.bone26.getChild("bone27");
        this.bone28 = this.bone27.getChild("bone28");
        this.bone29 = this.bone28.getChild("bone29");
        this.bone158 = this.top_column.getChild("bone158");
        this.bone159 = this.bone158.getChild("bone159");
        this.bone2 = this.bone159.getChild("bone2");
        this.bone3 = this.bone2.getChild("bone3");
        this.bone4 = this.bone3.getChild("bone4");
        this.bone5 = this.bone4.getChild("bone5");
        this.bone6 = this.bone5.getChild("bone6");
        this.bone165 = this.bone158.getChild("bone165");
        this.bone8 = this.bone165.getChild("bone8");
        this.bone9 = this.bone8.getChild("bone9");
        this.bone10 = this.bone9.getChild("bone10");
        this.bone11 = this.bone10.getChild("bone11");
        this.bone12 = this.bone11.getChild("bone12");
        this.bone171 = this.top_column.getChild("bone171");
        this.bone172 = this.bone171.getChild("bone172");
        this.bone20 = this.bone172.getChild("bone20");
        this.bone21 = this.bone20.getChild("bone21");
        this.bone22 = this.bone21.getChild("bone22");
        this.bone23 = this.bone22.getChild("bone23");
        this.bone24 = this.bone23.getChild("bone24");
        this.bone178 = this.bone171.getChild("bone178");
        this.bone14 = this.bone178.getChild("bone14");
        this.bone15 = this.bone14.getChild("bone15");
        this.bone16 = this.bone15.getChild("bone16");
        this.bone17 = this.bone16.getChild("bone17");
        this.bone18 = this.bone17.getChild("bone18");
        this.bone206 = this.centre_column.getChild("bone206");
        this.bone207 = this.bone206.getChild("bone207");
        this.bone208 = this.bone207.getChild("bone208");
        this.bone209 = this.bone208.getChild("bone209");
        this.bone210 = this.bone209.getChild("bone210");
        this.bone211 = this.bone210.getChild("bone211");
        this.bone200 = this.centre_column.getChild("bone200");
        this.bone201 = this.bone200.getChild("bone201");
        this.bone202 = this.bone201.getChild("bone202");
        this.bone203 = this.bone202.getChild("bone203");
        this.bone204 = this.bone203.getChild("bone204");
        this.bone205 = this.bone204.getChild("bone205");
        this.base = this.base_console.getChild("base");
        this.base_glow = this.base.getChild("base_glow");
        this.bone153 = this.base_glow.getChild("bone153");
        this.bone154 = this.bone153.getChild("bone154");
        this.bone155 = this.bone154.getChild("bone155");
        this.bone156 = this.bone155.getChild("bone156");
        this.bone157 = this.bone156.getChild("bone157");
        this.bone13 = this.base.getChild("bone13");
        this.bone140 = this.bone13.getChild("bone140");
        this.bone141 = this.bone140.getChild("bone141");
        this.bone142 = this.bone141.getChild("bone142");
        this.bone143 = this.bone142.getChild("bone143");
        this.bone144 = this.bone143.getChild("bone144");
        this.bone7 = this.base.getChild("bone7");
        this.bone134 = this.bone7.getChild("bone134");
        this.bone135 = this.bone134.getChild("bone135");
        this.bone136 = this.bone135.getChild("bone136");
        this.bone138 = this.bone136.getChild("bone138");
        this.bone139 = this.bone138.getChild("bone139");
        this.bone = this.base.getChild("bone");
        this.bone147 = this.bone.getChild("bone147");
        this.bone148 = this.bone147.getChild("bone148");
        this.bone149 = this.bone148.getChild("bone149");
        this.bone150 = this.bone149.getChild("bone150");
        this.bone151 = this.bone150.getChild("bone151");
        this.bone129 = this.base_console.getChild("bone129");
        this.bone123 = this.bone129.getChild("bone123");
        this.bone54 = this.bone123.getChild("bone54");
        this.bone57 = this.bone54.getChild("bone57");
        this.bone58 = this.bone57.getChild("bone58");
        this.bone59 = this.bone58.getChild("bone59");
        this.bone60 = this.bone59.getChild("bone60");
        this.bone117 = this.bone129.getChild("bone117");
        this.bone48 = this.bone117.getChild("bone48");
        this.bone50 = this.bone48.getChild("bone50");
        this.bone51 = this.bone50.getChild("bone51");
        this.bone52 = this.bone51.getChild("bone52");
        this.bone53 = this.bone52.getChild("bone53");
        this.bone85 = this.base_console.getChild("bone85");
        this.bone86 = this.bone85.getChild("bone86");
        this.bone109 = this.bone85.getChild("bone109");
        this.bone110 = this.bone109.getChild("bone110");
        this.bone111 = this.bone109.getChild("bone111");
        this.bone112 = this.bone111.getChild("bone112");
        this.bone113 = this.bone111.getChild("bone113");
        this.bone114 = this.bone113.getChild("bone114");
        this.bone115 = this.bone113.getChild("bone115");
        this.bone116 = this.bone115.getChild("bone116");
        this.bone118 = this.bone115.getChild("bone118");
        this.bone119 = this.bone118.getChild("bone119");
        this.bone81 = this.base_console.getChild("bone81");
        this.bone82 = this.bone81.getChild("bone82");
        this.bone83 = this.bone82.getChild("bone83");
        this.bone84 = this.bone82.getChild("bone84");
        this.bone61 = this.bone81.getChild("bone61");
        this.bone62 = this.bone61.getChild("bone62");
        this.bone63 = this.bone62.getChild("bone63");
        this.bone64 = this.bone62.getChild("bone64");
        this.bone65 = this.bone61.getChild("bone65");
        this.bone66 = this.bone65.getChild("bone66");
        this.bone69 = this.bone66.getChild("bone69");
        this.bone70 = this.bone66.getChild("bone70");
        this.bone71 = this.bone65.getChild("bone71");
        this.bone72 = this.bone71.getChild("bone72");
        this.bone73 = this.bone72.getChild("bone73");
        this.bone74 = this.bone72.getChild("bone74");
        this.bone75 = this.bone71.getChild("bone75");
        this.bone76 = this.bone75.getChild("bone76");
        this.bone77 = this.bone76.getChild("bone77");
        this.bone78 = this.bone76.getChild("bone78");
        this.bone79 = this.bone75.getChild("bone79");
        this.bone80 = this.bone79.getChild("bone80");
        this.bone87 = this.bone80.getChild("bone87");
        this.bone88 = this.bone80.getChild("bone88");
        this.bone67 = this.base_console.getChild("bone67");
        this.bone68 = this.bone67.getChild("bone68");
        this.bone89 = this.bone67.getChild("bone89");
        this.bone90 = this.bone89.getChild("bone90");
        this.bone91 = this.bone89.getChild("bone91");
        this.bone92 = this.bone91.getChild("bone92");
        this.bone93 = this.bone91.getChild("bone93");
        this.bone94 = this.bone93.getChild("bone94");
        this.bone95 = this.bone93.getChild("bone95");
        this.bone96 = this.bone95.getChild("bone96");
        this.bone97 = this.bone95.getChild("bone97");
        this.bone98 = this.bone97.getChild("bone98");
        this.bone55 = this.base_console.getChild("bone55");
        this.bone56 = this.bone55.getChild("bone56");
        this.bone160 = this.bone55.getChild("bone160");
        this.bone161 = this.bone160.getChild("bone161");
        this.bone162 = this.bone160.getChild("bone162");
        this.bone163 = this.bone162.getChild("bone163");
        this.bone164 = this.bone162.getChild("bone164");
        this.bone166 = this.bone164.getChild("bone166");
        this.bone167 = this.bone164.getChild("bone167");
        this.bone168 = this.bone167.getChild("bone168");
        this.bone169 = this.bone167.getChild("bone169");
        this.bone170 = this.bone169.getChild("bone170");
        this.bone43 = this.base_console.getChild("bone43");
        this.bone49 = this.bone43.getChild("bone49");
        this.bone120 = this.bone43.getChild("bone120");
        this.bone121 = this.bone120.getChild("bone121");
        this.bone122 = this.bone120.getChild("bone122");
        this.bone124 = this.bone122.getChild("bone124");
        this.bone125 = this.bone122.getChild("bone125");
        this.bone126 = this.bone125.getChild("bone126");
        this.bone127 = this.bone125.getChild("bone127");
        this.bone128 = this.bone127.getChild("bone128");
        this.bone132 = this.bone127.getChild("bone132");
        this.bone133 = this.bone132.getChild("bone133");
        this.bone37 = this.base_console.getChild("bone37");
        this.bone104 = this.bone37.getChild("bone104");
        this.bone105 = this.bone104.getChild("bone105");
        this.bone106 = this.bone105.getChild("bone106");
        this.bone107 = this.bone106.getChild("bone107");
        this.bone108 = this.bone107.getChild("bone108");
        this.bone31 = this.base_console.getChild("bone31");
        this.bone99 = this.bone31.getChild("bone99");
        this.bone100 = this.bone99.getChild("bone100");
        this.bone101 = this.bone100.getChild("bone101");
        this.bone102 = this.bone101.getChild("bone102");
        this.bone103 = this.bone102.getChild("bone103");
        this.components = root.getChild("components");
        this.south_west = this.components.getChild("south_west");
        this.bone174 = this.south_west.getChild("bone174");
        this.incrementmodifier_rotate_Y60 = this.bone174.getChild("incrementmodifier_rotate_Y60");
        this.randomiser = this.bone174.getChild("randomiser");
        this.randomiser_glow = this.randomiser.getChild("randomiser_glow");
        this.communicator = this.bone174.getChild("communicator");
        this.landtype_selector = this.bone174.getChild("landtype_selector");
        this.sonicport = this.bone174.getChild("sonicport");
        this.southwest_glow = this.bone174.getChild("southwest_glow");
        this.bone190 = this.bone174.getChild("bone190");
        this.bone212 = this.bone174.getChild("bone212");
        this.bone239 = this.bone174.getChild("bone239");
        this.bone215 = this.bone174.getChild("bone215");
        this.north_west = this.components.getChild("north_west");
        this.bone173 = this.north_west.getChild("bone173");
        this.dimensioncontrol = this.bone173.getChild("dimensioncontrol");
        this.dimensioncontrol_glow = this.dimensioncontrol.getChild("dimensioncontrol_glow");
        this.dimensionrotate_Y35 = this.dimensioncontrol.getChild("dimensionrotate_Y35");
        this.bone228 = this.dimensionrotate_Y35.getChild("bone228");
        this.dimensionrotate_Y65 = this.dimensioncontrol.getChild("dimensionrotate_Y65");
        this.dimensionrotate_Y50 = this.dimensioncontrol.getChild("dimensionrotate_Y50");
        this.directioncontrol_rotate_Y90 = this.bone173.getChild("directioncontrol_rotate_Y90");
        this.bone177 = this.bone173.getChild("bone177");
        this.bone227 = this.bone173.getChild("bone227");
        this.north = this.components.getChild("north");
        this.bone179 = this.north.getChild("bone179");
        this.door_rotate_x_100 = this.bone179.getChild("door_rotate_x_100");
        this.fastreturn_rotate_X65 = this.bone179.getChild("fastreturn_rotate_X65");
        this.landtype_rotate_Y70 = this.bone179.getChild("landtype_rotate_Y70");
        this.refuel = this.bone179.getChild("refuel");
        this.north_glow = this.bone179.getChild("north_glow");
        this.bone233 = this.bone179.getChild("bone233");
        this.bone234 = this.bone179.getChild("bone234");
        this.bone194 = this.bone179.getChild("bone194");
        this.bone183 = this.bone194.getChild("bone183");
        this.bone182 = this.bone179.getChild("bone182");
        this.bone225 = this.bone182.getChild("bone225");
        this.door2_rotate_x_100 = this.bone179.getChild("door2_rotate_x_100");
        this.north_east = this.components.getChild("north_east");
        this.bone180 = this.north_east.getChild("bone180");
        this.bone181 = this.bone180.getChild("bone181");
        this.bone184 = this.bone180.getChild("bone184");
        this.monitor_glow_optional = this.bone180.getChild("monitor_glow_optional");
        this.monitor_glow = this.bone180.getChild("monitor_glow");
        this.bone186 = this.bone180.getChild("bone186");
        this.bone185 = this.bone180.getChild("bone185");
        this.south_east = this.components.getChild("south_east");
        this.bone187 = this.south_east.getChild("bone187");
        this.telepathic_glow = this.bone187.getChild("telepathic_glow");
        this.south = this.components.getChild("south");
        this.bone188 = this.south.getChild("bone188");
        this.throttle_rotate_X80 = this.bone188.getChild("throttle_rotate_X80");
        this.bone220 = this.throttle_rotate_X80.getChild("bone220");
        this.bone221 = this.throttle_rotate_X80.getChild("bone221");
        this.handbrake_rotate_Y130 = this.bone188.getChild("handbrake_rotate_Y130");
        this.bone196 = this.handbrake_rotate_Y130.getChild("bone196");
        this.stabiliser = this.bone188.getChild("stabiliser");
        this.stabiliser_glow = this.stabiliser.getChild("stabiliser_glow");
        this.Xincrement = this.bone188.getChild("Xincrement");
        this.bone222 = this.Xincrement.getChild("bone222");
        this.Yincrement = this.bone188.getChild("Yincrement");
        this.bone223 = this.Yincrement.getChild("bone223");
        this.Zincrement = this.bone188.getChild("Zincrement");
        this.bone224 = this.Zincrement.getChild("bone224");
        this.south_glow = this.bone188.getChild("south_glow");
        this.bone235 = this.bone188.getChild("bone235");
        this.bone236 = this.bone188.getChild("bone236");
        this.bone237 = this.bone188.getChild("bone237");
        this.bone238 = this.bone188.getChild("bone238");
        this.bone219 = this.bone188.getChild("bone219");
        this.rotor_top_translate_8 = root.getChild("rotor_top_translate_8");
        this.rotortop_glow = this.rotor_top_translate_8.getChild("rotortop_glow");
        this.rotor_bottom_translate_14 = root.getChild("rotor_bottom_translate_14");
        this.rotorbottom_glow = this.rotor_bottom_translate_14.getChild("rotorbottom_glow");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition base_console = partdefinition.addOrReplaceChild(
                "base_console", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition centre_column = base_console.addOrReplaceChild(
                "centre_column",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-2.0F, -53.55F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 18)
                        .addBox(-2.0F, -86.55F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rotorbeam_glow = centre_column.addOrReplaceChild(
                "rotorbeam_glow",
                CubeListBuilder.create()
                        .texOffs(88, 124)
                        .addBox(-1.0F, -38.05F, 5.25F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -37.5F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone176 = rotorbeam_glow.addOrReplaceChild(
                "bone176",
                CubeListBuilder.create()
                        .texOffs(88, 124)
                        .addBox(-1.0F, -38.05F, 5.25F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone192 = bone176.addOrReplaceChild(
                "bone192",
                CubeListBuilder.create()
                        .texOffs(88, 124)
                        .addBox(-1.0F, -38.05F, 5.25F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone197 = bone192.addOrReplaceChild(
                "bone197",
                CubeListBuilder.create()
                        .texOffs(88, 124)
                        .addBox(-1.0F, -38.05F, 5.25F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone198 = bone197.addOrReplaceChild(
                "bone198",
                CubeListBuilder.create()
                        .texOffs(88, 124)
                        .addBox(-1.0F, -38.05F, 5.25F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone199 = bone198.addOrReplaceChild(
                "bone199",
                CubeListBuilder.create()
                        .texOffs(88, 124)
                        .addBox(-1.0F, -38.05F, 5.25F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone130 = centre_column.addOrReplaceChild(
                "bone130", CubeListBuilder.create(), PartPose.offset(0.0F, -1.5F, 0.0F));

        PartDefinition bone131 = bone130.addOrReplaceChild(
                "bone131",
                CubeListBuilder.create()
                        .texOffs(50, 79)
                        .addBox(-4.0F, -4.0F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -36.0F, 0.0F));

        PartDefinition bone42 = bone131.addOrReplaceChild(
                "bone42",
                CubeListBuilder.create()
                        .texOffs(50, 79)
                        .addBox(-4.0F, -4.0F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone44 = bone42.addOrReplaceChild(
                "bone44",
                CubeListBuilder.create()
                        .texOffs(50, 79)
                        .addBox(-4.0F, -4.0F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone45 = bone44.addOrReplaceChild(
                "bone45",
                CubeListBuilder.create()
                        .texOffs(50, 79)
                        .addBox(-4.0F, -4.0F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone46 = bone45.addOrReplaceChild(
                "bone46",
                CubeListBuilder.create()
                        .texOffs(50, 79)
                        .addBox(-4.0F, -4.0F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone47 = bone46.addOrReplaceChild(
                "bone47",
                CubeListBuilder.create()
                        .texOffs(50, 79)
                        .addBox(-4.0F, -4.0F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone137 = bone130.addOrReplaceChild(
                "bone137",
                CubeListBuilder.create()
                        .texOffs(74, 100)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone36 = bone137.addOrReplaceChild(
                "bone36",
                CubeListBuilder.create()
                        .texOffs(74, 100)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone38 = bone36.addOrReplaceChild(
                "bone38",
                CubeListBuilder.create()
                        .texOffs(74, 100)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone39 = bone38.addOrReplaceChild(
                "bone39",
                CubeListBuilder.create()
                        .texOffs(74, 100)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone40 = bone39.addOrReplaceChild(
                "bone40",
                CubeListBuilder.create()
                        .texOffs(74, 100)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone41 = bone40.addOrReplaceChild(
                "bone41",
                CubeListBuilder.create()
                        .texOffs(74, 100)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition top_column = centre_column.addOrReplaceChild(
                "top_column", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition bone145 =
                top_column.addOrReplaceChild("bone145", CubeListBuilder.create(), PartPose.offset(0.0F, -46.5F, 0.0F));

        PartDefinition bone146 = bone145.addOrReplaceChild(
                "bone146",
                CubeListBuilder.create()
                        .texOffs(32, 93)
                        .addBox(-4.0F, -4.05F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -36.0F, 0.0F));

        PartDefinition bone30 = bone146.addOrReplaceChild(
                "bone30",
                CubeListBuilder.create()
                        .texOffs(32, 93)
                        .addBox(-4.0F, -4.05F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone32 = bone30.addOrReplaceChild(
                "bone32",
                CubeListBuilder.create()
                        .texOffs(32, 93)
                        .addBox(-4.0F, -4.05F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone33 = bone32.addOrReplaceChild(
                "bone33",
                CubeListBuilder.create()
                        .texOffs(32, 93)
                        .addBox(-4.0F, -4.05F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone34 = bone33.addOrReplaceChild(
                "bone34",
                CubeListBuilder.create()
                        .texOffs(32, 93)
                        .addBox(-4.0F, -4.05F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone35 = bone34.addOrReplaceChild(
                "bone35",
                CubeListBuilder.create()
                        .texOffs(32, 93)
                        .addBox(-4.0F, -4.05F, 6.95F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone152 = bone145.addOrReplaceChild(
                "bone152",
                CubeListBuilder.create()
                        .texOffs(0, 110)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone25 = bone152.addOrReplaceChild(
                "bone25",
                CubeListBuilder.create()
                        .texOffs(0, 110)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone26 = bone25.addOrReplaceChild(
                "bone26",
                CubeListBuilder.create()
                        .texOffs(0, 110)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone27 = bone26.addOrReplaceChild(
                "bone27",
                CubeListBuilder.create()
                        .texOffs(0, 110)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone28 = bone27.addOrReplaceChild(
                "bone28",
                CubeListBuilder.create()
                        .texOffs(0, 110)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone29 = bone28.addOrReplaceChild(
                "bone29",
                CubeListBuilder.create()
                        .texOffs(0, 110)
                        .addBox(-1.0F, -4.05F, 7.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone158 =
                top_column.addOrReplaceChild("bone158", CubeListBuilder.create(), PartPose.offset(0.0F, -49.5F, 0.0F));

        PartDefinition bone159 = bone158.addOrReplaceChild(
                "bone159",
                CubeListBuilder.create()
                        .texOffs(68, 35)
                        .addBox(-6.0F, -11.05F, -1.6F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -36.0F, 0.0F));

        PartDefinition bone2 = bone159.addOrReplaceChild(
                "bone2",
                CubeListBuilder.create()
                        .texOffs(68, 35)
                        .addBox(-6.0F, -11.05F, -1.6F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone3 = bone2.addOrReplaceChild(
                "bone3",
                CubeListBuilder.create()
                        .texOffs(68, 35)
                        .addBox(-6.0F, -11.05F, -1.6F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone4 = bone3.addOrReplaceChild(
                "bone4",
                CubeListBuilder.create()
                        .texOffs(68, 35)
                        .addBox(-6.0F, -11.05F, -1.6F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone5 = bone4.addOrReplaceChild(
                "bone5",
                CubeListBuilder.create()
                        .texOffs(68, 35)
                        .addBox(-6.0F, -11.05F, -1.6F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone6 = bone5.addOrReplaceChild(
                "bone6",
                CubeListBuilder.create()
                        .texOffs(68, 35)
                        .addBox(-6.0F, -11.05F, -1.6F, 12.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone165 = bone158.addOrReplaceChild(
                "bone165",
                CubeListBuilder.create()
                        .texOffs(110, 0)
                        .addBox(-1.0F, -11.05F, 11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone8 = bone165.addOrReplaceChild(
                "bone8",
                CubeListBuilder.create()
                        .texOffs(110, 0)
                        .addBox(-1.0F, -11.05F, 11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone9 = bone8.addOrReplaceChild(
                "bone9",
                CubeListBuilder.create()
                        .texOffs(110, 0)
                        .addBox(-1.0F, -11.05F, 11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone10 = bone9.addOrReplaceChild(
                "bone10",
                CubeListBuilder.create()
                        .texOffs(110, 0)
                        .addBox(-1.0F, -11.05F, 11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone11 = bone10.addOrReplaceChild(
                "bone11",
                CubeListBuilder.create()
                        .texOffs(110, 0)
                        .addBox(-1.0F, -11.05F, 11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone12 = bone11.addOrReplaceChild(
                "bone12",
                CubeListBuilder.create()
                        .texOffs(110, 0)
                        .addBox(-1.0F, -11.05F, 11.75F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone171 =
                top_column.addOrReplaceChild("bone171", CubeListBuilder.create(), PartPose.offset(0.0F, -45.5F, 0.0F));

        PartDefinition bone172 = bone171.addOrReplaceChild(
                "bone172",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-5.0F, -11.05F, -1.35F, 10.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -36.0F, 0.0F));

        PartDefinition bone20 = bone172.addOrReplaceChild(
                "bone20",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-5.0F, -11.05F, -1.35F, 10.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone21 = bone20.addOrReplaceChild(
                "bone21",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-5.0F, -11.05F, -1.35F, 10.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone22 = bone21.addOrReplaceChild(
                "bone22",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-5.0F, -11.05F, -1.35F, 10.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone23 = bone22.addOrReplaceChild(
                "bone23",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-5.0F, -11.05F, -1.35F, 10.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone24 = bone23.addOrReplaceChild(
                "bone24",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-5.0F, -11.05F, -1.35F, 10.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone178 = bone171.addOrReplaceChild(
                "bone178",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-1.0F, -11.05F, 9.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone14 = bone178.addOrReplaceChild(
                "bone14",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-1.0F, -11.05F, 9.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone15 = bone14.addOrReplaceChild(
                "bone15",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-1.0F, -11.05F, 9.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone16 = bone15.addOrReplaceChild(
                "bone16",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-1.0F, -11.05F, 9.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone17 = bone16.addOrReplaceChild(
                "bone17",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-1.0F, -11.05F, 9.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone18 = bone17.addOrReplaceChild(
                "bone18",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-1.0F, -11.05F, 9.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone206 = centre_column.addOrReplaceChild(
                "bone206",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -74.5F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone207 = bone206.addOrReplaceChild(
                "bone207",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone208 = bone207.addOrReplaceChild(
                "bone208",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone209 = bone208.addOrReplaceChild(
                "bone209",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone210 = bone209.addOrReplaceChild(
                "bone210",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone211 = bone210.addOrReplaceChild(
                "bone211",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone200 = centre_column.addOrReplaceChild(
                "bone200",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -37.5F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone201 = bone200.addOrReplaceChild(
                "bone201",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone202 = bone201.addOrReplaceChild(
                "bone202",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone203 = bone202.addOrReplaceChild(
                "bone203",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone204 = bone203.addOrReplaceChild(
                "bone204",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone205 = bone204.addOrReplaceChild(
                "bone205",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-2.0F, -12.05F, 4.25F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition base =
                base_console.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition base_glow = base.addOrReplaceChild(
                "base_glow",
                CubeListBuilder.create()
                        .texOffs(114, 116)
                        .addBox(-6.0F, -14.0F, 9.9F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition bone153 = base_glow.addOrReplaceChild(
                "bone153",
                CubeListBuilder.create()
                        .texOffs(114, 116)
                        .addBox(-6.0F, -14.0F, 9.9F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone154 = bone153.addOrReplaceChild(
                "bone154",
                CubeListBuilder.create()
                        .texOffs(114, 116)
                        .addBox(-6.0F, -14.0F, 9.9F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone155 = bone154.addOrReplaceChild(
                "bone155",
                CubeListBuilder.create()
                        .texOffs(114, 116)
                        .addBox(-6.0F, -14.0F, 9.9F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone156 = bone155.addOrReplaceChild(
                "bone156",
                CubeListBuilder.create()
                        .texOffs(114, 116)
                        .addBox(-6.0F, -14.0F, 9.9F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone157 = bone156.addOrReplaceChild(
                "bone157",
                CubeListBuilder.create()
                        .texOffs(114, 116)
                        .addBox(-6.0F, -14.0F, 9.9F, 12.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone13 = base.addOrReplaceChild(
                "bone13",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-2.0F, -14.0F, 12.6F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone140 = bone13.addOrReplaceChild(
                "bone140",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-2.0F, -14.0F, 12.6F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone141 = bone140.addOrReplaceChild(
                "bone141",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-2.0F, -14.0F, 12.6F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone142 = bone141.addOrReplaceChild(
                "bone142",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-2.0F, -14.0F, 12.6F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone143 = bone142.addOrReplaceChild(
                "bone143",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-2.0F, -14.0F, 12.6F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone144 = bone143.addOrReplaceChild(
                "bone144",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-2.0F, -14.0F, 12.6F, 4.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone7 = base.addOrReplaceChild(
                "bone7",
                CubeListBuilder.create()
                        .texOffs(112, 24)
                        .addBox(-8.0F, -4.0F, -2.1F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -2.0F, 14.0F));

        PartDefinition bone134 = bone7.addOrReplaceChild(
                "bone134",
                CubeListBuilder.create()
                        .texOffs(112, 24)
                        .addBox(-8.0F, -4.0F, 11.9F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -14.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone135 = bone134.addOrReplaceChild(
                "bone135",
                CubeListBuilder.create()
                        .texOffs(112, 24)
                        .addBox(-8.0F, -4.0F, 11.9F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone136 = bone135.addOrReplaceChild(
                "bone136",
                CubeListBuilder.create()
                        .texOffs(112, 24)
                        .addBox(-8.0F, -4.0F, 11.9F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone138 = bone136.addOrReplaceChild(
                "bone138",
                CubeListBuilder.create()
                        .texOffs(112, 24)
                        .addBox(-8.0F, -4.0F, 11.9F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone139 = bone138.addOrReplaceChild(
                "bone139",
                CubeListBuilder.create()
                        .texOffs(112, 24)
                        .addBox(-8.0F, -4.0F, 11.9F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone = base.addOrReplaceChild(
                "bone",
                CubeListBuilder.create()
                        .texOffs(0, 18)
                        .addBox(-10.0F, -2.0F, -16.65F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 14.0F));

        PartDefinition bone147 = bone.addOrReplaceChild(
                "bone147",
                CubeListBuilder.create()
                        .texOffs(0, 18)
                        .addBox(-10.0F, -2.0F, -2.65F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -14.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone148 = bone147.addOrReplaceChild(
                "bone148",
                CubeListBuilder.create()
                        .texOffs(0, 18)
                        .addBox(-10.0F, -2.0F, -2.65F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone149 = bone148.addOrReplaceChild(
                "bone149",
                CubeListBuilder.create()
                        .texOffs(0, 18)
                        .addBox(-10.0F, -2.0F, -2.65F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone150 = bone149.addOrReplaceChild(
                "bone150",
                CubeListBuilder.create()
                        .texOffs(0, 18)
                        .addBox(-10.0F, -2.0F, -2.65F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone151 = bone150.addOrReplaceChild(
                "bone151",
                CubeListBuilder.create()
                        .texOffs(0, 18)
                        .addBox(-10.0F, -2.0F, -2.65F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone129 =
                base_console.addOrReplaceChild("bone129", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

        PartDefinition bone123 = bone129.addOrReplaceChild(
                "bone123",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-6.0F, -3.0F, -1.6F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -36.0F, 0.0F));

        PartDefinition bone54 = bone123.addOrReplaceChild(
                "bone54",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-6.0F, -3.0F, -1.6F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone57 = bone54.addOrReplaceChild(
                "bone57",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-6.0F, -3.0F, -1.6F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone58 = bone57.addOrReplaceChild(
                "bone58",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-6.0F, -3.0F, -1.6F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone59 = bone58.addOrReplaceChild(
                "bone59",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-6.0F, -3.0F, -1.6F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone60 = bone59.addOrReplaceChild(
                "bone60",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-6.0F, -3.0F, -1.6F, 12.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone117 = bone129.addOrReplaceChild(
                "bone117",
                CubeListBuilder.create()
                        .texOffs(0, 130)
                        .addBox(-1.0F, -2.95F, 11.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -36.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone48 = bone117.addOrReplaceChild(
                "bone48",
                CubeListBuilder.create()
                        .texOffs(0, 130)
                        .addBox(-1.0F, -2.95F, 11.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone50 = bone48.addOrReplaceChild(
                "bone50",
                CubeListBuilder.create()
                        .texOffs(0, 130)
                        .addBox(-1.0F, -2.95F, 11.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone51 = bone50.addOrReplaceChild(
                "bone51",
                CubeListBuilder.create()
                        .texOffs(0, 130)
                        .addBox(-1.0F, -2.95F, 11.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone52 = bone51.addOrReplaceChild(
                "bone52",
                CubeListBuilder.create()
                        .texOffs(0, 130)
                        .addBox(-1.0F, -2.95F, 11.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone53 = bone52.addOrReplaceChild(
                "bone53",
                CubeListBuilder.create()
                        .texOffs(0, 130)
                        .addBox(-1.0F, -2.95F, 11.75F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone85 =
                base_console.addOrReplaceChild("bone85", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.0F));

        PartDefinition bone86 = bone85.addOrReplaceChild(
                "bone86",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-13.0F, 1.25F, -18.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone109 = bone85.addOrReplaceChild(
                "bone109",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone110 = bone109.addOrReplaceChild(
                "bone110",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-13.0F, 1.25F, -18.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone111 = bone109.addOrReplaceChild(
                "bone111",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone112 = bone111.addOrReplaceChild(
                "bone112",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-13.0F, 1.25F, -18.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone113 = bone111.addOrReplaceChild(
                "bone113",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone114 = bone113.addOrReplaceChild(
                "bone114",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-13.0F, 1.25F, -18.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone115 = bone113.addOrReplaceChild(
                "bone115",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone116 = bone115.addOrReplaceChild(
                "bone116",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-13.0F, 1.25F, -18.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone118 = bone115.addOrReplaceChild(
                "bone118",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone119 = bone118.addOrReplaceChild(
                "bone119",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-13.0F, 1.25F, -18.0F, 26.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone81 =
                base_console.addOrReplaceChild("bone81", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.0F));

        PartDefinition bone82 = bone81.addOrReplaceChild(
                "bone82",
                CubeListBuilder.create()
                        .texOffs(60, 31)
                        .addBox(-16.0F, 0.275F, -2.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 53)
                        .addBox(-7.0F, 0.275F, -19.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone83 = bone82.addOrReplaceChild(
                "bone83",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(0.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.0F, 0.2F, -17.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition bone84 = bone82.addOrReplaceChild(
                "bone84",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(-2.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 0.2F, -17.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone61 = bone81.addOrReplaceChild(
                "bone61", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone62 = bone61.addOrReplaceChild(
                "bone62",
                CubeListBuilder.create()
                        .texOffs(60, 31)
                        .addBox(-16.0F, 0.275F, -2.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 53)
                        .addBox(-7.0F, 0.275F, -19.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone63 = bone62.addOrReplaceChild(
                "bone63",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(0.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.0F, 0.2F, -17.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition bone64 = bone62.addOrReplaceChild(
                "bone64",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(-2.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 0.2F, -17.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone65 = bone61.addOrReplaceChild(
                "bone65", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone66 = bone65.addOrReplaceChild(
                "bone66",
                CubeListBuilder.create()
                        .texOffs(60, 31)
                        .addBox(-16.0F, 0.275F, -2.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 53)
                        .addBox(-7.0F, 0.275F, -19.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone69 = bone66.addOrReplaceChild(
                "bone69",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(0.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.0F, 0.2F, -17.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition bone70 = bone66.addOrReplaceChild(
                "bone70",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(-2.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 0.2F, -17.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone71 = bone65.addOrReplaceChild(
                "bone71", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone72 = bone71.addOrReplaceChild(
                "bone72",
                CubeListBuilder.create()
                        .texOffs(60, 31)
                        .addBox(-16.0F, 0.275F, -2.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 53)
                        .addBox(-7.0F, 0.275F, -19.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone73 = bone72.addOrReplaceChild(
                "bone73",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(0.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.0F, 0.2F, -17.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition bone74 = bone72.addOrReplaceChild(
                "bone74",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(-2.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 0.2F, -17.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone75 = bone71.addOrReplaceChild(
                "bone75", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone76 = bone75.addOrReplaceChild(
                "bone76",
                CubeListBuilder.create()
                        .texOffs(60, 31)
                        .addBox(-16.0F, 0.275F, -2.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 53)
                        .addBox(-7.0F, 0.275F, -19.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone77 = bone76.addOrReplaceChild(
                "bone77",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(0.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.0F, 0.2F, -17.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition bone78 = bone76.addOrReplaceChild(
                "bone78",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(-2.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 0.2F, -17.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone79 = bone75.addOrReplaceChild(
                "bone79", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone80 = bone79.addOrReplaceChild(
                "bone80",
                CubeListBuilder.create()
                        .texOffs(60, 31)
                        .addBox(-16.0F, 0.275F, -2.0F, 32.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 53)
                        .addBox(-7.0F, 0.275F, -19.5F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone87 = bone80.addOrReplaceChild(
                "bone87",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(0.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.0F, 0.2F, -17.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition bone88 = bone80.addOrReplaceChild(
                "bone88",
                CubeListBuilder.create()
                        .texOffs(50, 73)
                        .addBox(-2.0F, 0.075F, -2.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 0.2F, -17.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone67 = base_console.addOrReplaceChild(
                "bone67",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -28.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone68 = bone67.addOrReplaceChild(
                "bone68",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-1.0F, 0.0F, -22.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone89 = bone67.addOrReplaceChild(
                "bone89", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone90 = bone89.addOrReplaceChild(
                "bone90",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-1.0F, 0.0F, -22.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone91 = bone89.addOrReplaceChild(
                "bone91", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone92 = bone91.addOrReplaceChild(
                "bone92",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-1.0F, 0.0F, -22.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone93 = bone91.addOrReplaceChild(
                "bone93", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone94 = bone93.addOrReplaceChild(
                "bone94",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-1.0F, 0.0F, -22.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone95 = bone93.addOrReplaceChild(
                "bone95", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone96 = bone95.addOrReplaceChild(
                "bone96",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-1.0F, 0.0F, -22.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone97 = bone95.addOrReplaceChild(
                "bone97", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone98 = bone97.addOrReplaceChild(
                "bone98",
                CubeListBuilder.create()
                        .texOffs(0, 68)
                        .addBox(-1.0F, 0.0F, -22.0F, 2.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone55 =
                base_console.addOrReplaceChild("bone55", CubeListBuilder.create(), PartPose.offset(0.0F, -22.0F, 0.0F));

        PartDefinition bone56 = bone55.addOrReplaceChild(
                "bone56",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-14.0F, -2.0F, -16.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 25.75F, 0.3054F, 0.0F, 0.0F));

        PartDefinition bone160 = bone55.addOrReplaceChild(
                "bone160",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone161 = bone160.addOrReplaceChild(
                "bone161",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-14.0F, -2.0F, -16.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 25.75F, 0.3054F, 0.0F, 0.0F));

        PartDefinition bone162 = bone160.addOrReplaceChild(
                "bone162",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone163 = bone162.addOrReplaceChild(
                "bone163",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-14.0F, -2.0F, -16.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 25.75F, 0.3054F, 0.0F, 0.0F));

        PartDefinition bone164 = bone162.addOrReplaceChild(
                "bone164",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone166 = bone164.addOrReplaceChild(
                "bone166",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-14.0F, -2.0F, -16.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 25.75F, 0.3054F, 0.0F, 0.0F));

        PartDefinition bone167 = bone164.addOrReplaceChild(
                "bone167",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone168 = bone167.addOrReplaceChild(
                "bone168",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-14.0F, -2.0F, -16.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 25.75F, 0.3054F, 0.0F, 0.0F));

        PartDefinition bone169 = bone167.addOrReplaceChild(
                "bone169",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone170 = bone169.addOrReplaceChild(
                "bone170",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-14.0F, -2.0F, -16.0F, 28.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 25.75F, 0.3054F, 0.0F, 0.0F));

        PartDefinition bone43 = base_console.addOrReplaceChild(
                "bone43",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -22.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone49 = bone43.addOrReplaceChild(
                "bone49",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-1.0F, -2.0F, -20.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone120 = bone43.addOrReplaceChild(
                "bone120",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone121 = bone120.addOrReplaceChild(
                "bone121",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-1.0F, -2.0F, -20.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone122 = bone120.addOrReplaceChild(
                "bone122",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone124 = bone122.addOrReplaceChild(
                "bone124",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-1.0F, -2.0F, -20.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone125 = bone122.addOrReplaceChild(
                "bone125",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone126 = bone125.addOrReplaceChild(
                "bone126",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-1.0F, -2.0F, -20.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone127 = bone125.addOrReplaceChild(
                "bone127",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone128 = bone127.addOrReplaceChild(
                "bone128",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-1.0F, -2.0F, -20.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone132 = bone127.addOrReplaceChild(
                "bone132",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone133 = bone132.addOrReplaceChild(
                "bone133",
                CubeListBuilder.create()
                        .texOffs(26, 68)
                        .addBox(-1.0F, -2.0F, -20.0F, 2.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 33.75F, 0.2618F, 0.0F, 0.0F));

        PartDefinition bone37 = base_console.addOrReplaceChild(
                "bone37",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-1.0F, -6.0F, 31.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -22.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone104 = bone37.addOrReplaceChild(
                "bone104",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-1.0F, -6.0F, 31.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone105 = bone104.addOrReplaceChild(
                "bone105",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-1.0F, -6.0F, 31.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone106 = bone105.addOrReplaceChild(
                "bone106",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-1.0F, -6.0F, 31.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone107 = bone106.addOrReplaceChild(
                "bone107",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-1.0F, -6.0F, 31.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone108 = bone107.addOrReplaceChild(
                "bone108",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-1.0F, -6.0F, 31.75F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone31 = base_console.addOrReplaceChild(
                "bone31",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-16.0F, -6.0F, 11.75F, 32.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -22.0F, 14.0F));

        PartDefinition bone99 = bone31.addOrReplaceChild(
                "bone99",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-16.0F, -6.0F, 25.75F, 32.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, -14.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone100 = bone99.addOrReplaceChild(
                "bone100",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-16.0F, -6.0F, 25.75F, 32.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone101 = bone100.addOrReplaceChild(
                "bone101",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-16.0F, -6.0F, 25.75F, 32.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone102 = bone101.addOrReplaceChild(
                "bone102",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-16.0F, -6.0F, 25.75F, 32.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone103 = bone102.addOrReplaceChild(
                "bone103",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-16.0F, -6.0F, 25.75F, 32.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition components = partdefinition.addOrReplaceChild(
                "components", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition south_west = components.addOrReplaceChild(
                "south_west",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone174 = south_west.addOrReplaceChild(
                "bone174",
                CubeListBuilder.create()
                        .texOffs(24, 110)
                        .addBox(4.0F, 0.5F, -10.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(24, 110)
                        .mirror()
                        .addBox(-8.0F, 0.5F, -10.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(110, 77)
                        .addBox(-7.0F, 0.25F, -9.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 73)
                        .addBox(4.0F, 0.5F, -6.5F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 73)
                        .mirror()
                        .addBox(-10.0F, 0.5F, -6.5F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(32, 116)
                        .addBox(5.0F, -0.5F, -9.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(112, 59)
                        .addBox(-3.5F, 0.75F, -9.5F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 114)
                        .addBox(-1.0F, 1.0F, -15.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(96, 129)
                        .addBox(-4.5F, 0.75F, -14.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition incrementmodifier_rotate_Y60 = bone174.addOrReplaceChild(
                "incrementmodifier_rotate_Y60",
                CubeListBuilder.create()
                        .texOffs(64, 120)
                        .addBox(-0.5F, -0.1667F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 0)
                        .addBox(-0.5F, -0.6667F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 0)
                        .addBox(-0.5F, -0.6667F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0F, 0.1667F, -8.5F, 0.0F, -0.5236F, 0.0F));

        PartDefinition randomiser = bone174.addOrReplaceChild(
                "randomiser",
                CubeListBuilder.create()
                        .texOffs(82, 57)
                        .addBox(-17.4604F, -0.3226F, -7.9077F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(21.9604F, 0.3226F, 1.6577F));

        PartDefinition randomiser_glow = randomiser.addOrReplaceChild(
                "randomiser_glow",
                CubeListBuilder.create()
                        .texOffs(36, 68)
                        .addBox(-13.9604F, -0.8226F, -10.4077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(36, 68)
                        .addBox(-15.9604F, -0.8226F, -10.4077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 84)
                        .addBox(-13.9604F, -0.8226F, -8.1577F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 84)
                        .addBox(-16.9604F, -0.8226F, -8.1577F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 0.0F, 2.5F));

        PartDefinition communicator = bone174.addOrReplaceChild(
                "communicator",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-17.4604F, -1.0726F, -7.6577F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offset(14.4604F, 0.3226F, -1.3423F));

        PartDefinition landtype_selector = bone174.addOrReplaceChild(
                "landtype_selector",
                CubeListBuilder.create()
                        .texOffs(142, 77)
                        .addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.25F, 1.0F, -12.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition sonicport = bone174.addOrReplaceChild(
                "sonicport",
                CubeListBuilder.create()
                        .texOffs(0, 92)
                        .addBox(-20.9604F, -1.5726F, -5.1577F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(24.4604F, 1.3226F, -8.8423F));

        PartDefinition southwest_glow = bone174.addOrReplaceChild(
                "southwest_glow",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-20.9604F, -0.8226F, -3.6577F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(66, 75)
                        .addBox(-20.9604F, -0.0726F, -4.9077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(66, 75)
                        .addBox(-20.9604F, -0.0726F, -6.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 35)
                        .addBox(-13.2104F, -0.5726F, -6.4077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 35)
                        .addBox(-14.4604F, -0.5726F, -6.4077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 35)
                        .addBox(-15.7104F, -0.5726F, -6.4077F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(78, 58)
                        .addBox(-20.4604F, -0.5726F, 4.3423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(78, 58)
                        .addBox(-20.4604F, -0.5726F, 2.3423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(78, 58)
                        .addBox(-24.4604F, -0.5726F, 2.3423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(78, 58)
                        .addBox(-24.4604F, -0.5726F, 4.3423F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(14.9604F, 0.5726F, -8.3423F));

        PartDefinition bone190 = bone174.addOrReplaceChild(
                "bone190",
                CubeListBuilder.create()
                        .texOffs(130, 100)
                        .addBox(-15.9604F, -0.3226F, -5.1577F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(7.9604F, -0.1774F, -0.3423F));

        PartDefinition bone212 = bone174.addOrReplaceChild(
                "bone212",
                CubeListBuilder.create()
                        .texOffs(96, 124)
                        .addBox(-18.2104F, -0.3226F, -7.1577F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(17.4604F, 0.3226F, -1.3423F));

        PartDefinition bone239 = bone174.addOrReplaceChild(
                "bone239",
                CubeListBuilder.create()
                        .texOffs(141, 5)
                        .addBox(0.125F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(141, 5)
                        .addBox(-1.125F, -0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.375F, 1.0F, -12.0F, -0.3054F, 0.0F, 0.0F));

        PartDefinition bone215 = bone174.addOrReplaceChild(
                "bone215",
                CubeListBuilder.create()
                        .texOffs(24, 130)
                        .addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-3.0F, -0.25F, -13.0F));

        PartDefinition north_west = components.addOrReplaceChild(
                "north_west",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone173 = north_west.addOrReplaceChild(
                "bone173",
                CubeListBuilder.create()
                        .texOffs(124, 12)
                        .addBox(7.0F, 0.25F, -6.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 76)
                        .addBox(8.0F, -0.5F, -5.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 18)
                        .addBox(6.0F, -0.75F, -9.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(82, 90)
                        .addBox(-4.0F, 0.75F, -17.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 90)
                        .addBox(2.0F, 0.75F, -17.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition dimensioncontrol = bone173.addOrReplaceChild(
                "dimensioncontrol", CubeListBuilder.create(), PartPose.offset(17.9604F, 0.8226F, -0.3423F));

        PartDefinition dimensioncontrol_glow = dimensioncontrol.addOrReplaceChild(
                "dimensioncontrol_glow",
                CubeListBuilder.create()
                        .texOffs(106, 35)
                        .addBox(-22.9604F, -0.8226F, -13.6577F, 10.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 73)
                        .addBox(-22.9604F, -0.5726F, -13.1577F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition dimensionrotate_Y35 = dimensioncontrol.addOrReplaceChild(
                "dimensionrotate_Y35",
                CubeListBuilder.create()
                        .texOffs(16, 25)
                        .addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-15.4604F, -0.8226F, -11.1577F, 0.0F, -0.6109F, 0.0F));

        PartDefinition bone228 = dimensionrotate_Y35.addOrReplaceChild(
                "bone228",
                CubeListBuilder.create()
                        .texOffs(68, 44)
                        .addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -1.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

        PartDefinition dimensionrotate_Y65 = dimensioncontrol.addOrReplaceChild(
                "dimensionrotate_Y65",
                CubeListBuilder.create()
                        .texOffs(38, 80)
                        .addBox(-0.5F, -1.25F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 18)
                        .addBox(-0.5F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-19.9604F, -1.0726F, -10.6577F, 0.0F, -0.5672F, 0.0F));

        PartDefinition dimensionrotate_Y50 = dimensioncontrol.addOrReplaceChild(
                "dimensionrotate_Y50",
                CubeListBuilder.create()
                        .texOffs(76, 35)
                        .addBox(-0.5F, -1.25F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 22)
                        .addBox(-0.5F, -0.25F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-19.9604F, -1.5726F, -6.6577F, 0.0F, -1.0908F, 0.0F));

        PartDefinition directioncontrol_rotate_Y90 = bone173.addOrReplaceChild(
                "directioncontrol_rotate_Y90",
                CubeListBuilder.create()
                        .texOffs(128, 30)
                        .addBox(-1.5F, -0.475F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 0)
                        .addBox(-1.5F, -1.475F, -1.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.0F, 0.75F, -5.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone177 = bone173.addOrReplaceChild(
                "bone177",
                CubeListBuilder.create()
                        .texOffs(68, 26)
                        .addBox(-0.5F, -0.1667F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(37, 84)
                        .addBox(-0.5F, 0.3333F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(68, 26)
                        .addBox(-0.5F, -0.1667F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 0.1667F, -16.0F, 0.0F, -0.7418F, 0.0F));

        PartDefinition bone227 = bone173.addOrReplaceChild(
                "bone227",
                CubeListBuilder.create()
                        .texOffs(76, 40)
                        .addBox(-0.5F, 0.3333F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(68, 24)
                        .addBox(-0.5F, -0.4167F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, 0.1667F, -16.0F, 0.0F, -0.7418F, 0.0F));

        PartDefinition north = components.addOrReplaceChild(
                "north", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone179 = north.addOrReplaceChild(
                "bone179",
                CubeListBuilder.create()
                        .texOffs(46, 90)
                        .addBox(-2.0F, 0.25F, -16.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 68)
                        .addBox(-4.0F, 0.25F, -11.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(58, 90)
                        .addBox(-8.0F, 0.25F, -10.75F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 79)
                        .addBox(2.0F, -0.25F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(76, 43)
                        .addBox(-4.0F, -0.25F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(76, 43)
                        .addBox(-1.0F, -0.25F, -13.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(105, 129)
                        .addBox(-1.0F, 0.25F, -7.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 88)
                        .addBox(-4.5F, 0.75F, -16.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(62, 85)
                        .addBox(2.5F, 0.75F, -16.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 31)
                        .addBox(8.25F, -0.75F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 31)
                        .addBox(10.25F, -0.75F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(104, 57)
                        .addBox(-10.0F, 0.25F, -7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition door_rotate_x_100 = bone179.addOrReplaceChild(
                "door_rotate_x_100",
                CubeListBuilder.create()
                        .texOffs(60, 24)
                        .addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(68, 40)
                        .addBox(-0.5F, -2.0F, 3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(6.5F, 1.2F, -6.5F));

        PartDefinition fastreturn_rotate_X65 = bone179.addOrReplaceChild(
                "fastreturn_rotate_X65",
                CubeListBuilder.create()
                        .texOffs(68, 60)
                        .addBox(-0.5F, -1.75F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 53)
                        .addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.5F, 0.5F, -9.75F, -0.5672F, 0.0F, 0.0F));

        PartDefinition landtype_rotate_Y70 = bone179.addOrReplaceChild(
                "landtype_rotate_Y70",
                CubeListBuilder.create()
                        .texOffs(16, 84)
                        .addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(96, 57)
                        .addBox(-1.0F, -0.25F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.5F, 0.5F, -10.25F, 0.0F, 0.6109F, 0.0F));

        PartDefinition refuel = bone179.addOrReplaceChild(
                "refuel",
                CubeListBuilder.create()
                        .texOffs(105, 129)
                        .addBox(-10.4604F, -0.4726F, -11.4077F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(105, 129)
                        .addBox(-12.9604F, -0.4726F, -11.4077F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(105, 129)
                        .addBox(-15.4604F, -0.5726F, -11.4077F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(105, 129)
                        .addBox(-17.9604F, -0.5726F, -11.4077F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(13.4604F, 0.8226F, 6.6577F));

        PartDefinition north_glow = bone179.addOrReplaceChild(
                "north_glow",
                CubeListBuilder.create()
                        .texOffs(106, 43)
                        .addBox(-9.7104F, -1.0726F, -9.9077F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 73)
                        .addBox(-28.7104F, -2.0726F, -7.6577F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(68, 58)
                        .addBox(-22.9604F, -0.5726F, -10.6577F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 12)
                        .addBox(-16.9604F, -0.5726F, -10.6577F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(17.9604F, 1.3226F, 3.6577F));

        PartDefinition bone233 = bone179.addOrReplaceChild(
                "bone233",
                CubeListBuilder.create()
                        .texOffs(65, 125)
                        .addBox(2.5F, -1.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 72)
                        .addBox(2.5F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(65, 125)
                        .addBox(0.5F, -1.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 72)
                        .addBox(0.5F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.25F, -9.5F, 0.6981F, 0.0F, 0.0F));

        PartDefinition bone234 = bone179.addOrReplaceChild(
                "bone234",
                CubeListBuilder.create()
                        .texOffs(65, 125)
                        .addBox(-1.5F, -1.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 72)
                        .addBox(-1.5F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(65, 125)
                        .addBox(-3.5F, -1.75F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 72)
                        .addBox(-3.5F, -1.75F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.25F, -9.5F));

        PartDefinition bone194 = bone179.addOrReplaceChild(
                "bone194",
                CubeListBuilder.create()
                        .texOffs(0, 70)
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.5F, 0.75F, -13.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone183 = bone194.addOrReplaceChild(
                "bone183",
                CubeListBuilder.create()
                        .texOffs(16, 82)
                        .addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3927F));

        PartDefinition bone182 = bone179.addOrReplaceChild(
                "bone182",
                CubeListBuilder.create()
                        .texOffs(0, 70)
                        .mirror()
                        .addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(5.5F, 0.75F, -13.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone225 = bone182.addOrReplaceChild(
                "bone225",
                CubeListBuilder.create()
                        .texOffs(16, 82)
                        .mirror()
                        .addBox(-1.0F, -1.0F, -0.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.3927F));

        PartDefinition door2_rotate_x_100 = bone179.addOrReplaceChild(
                "door2_rotate_x_100",
                CubeListBuilder.create()
                        .texOffs(60, 24)
                        .addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(68, 40)
                        .addBox(-0.5F, -2.0F, 3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-6.5F, 1.2F, -6.5F));

        PartDefinition north_east = components.addOrReplaceChild(
                "north_east",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone180 = north_east.addOrReplaceChild(
                "bone180",
                CubeListBuilder.create()
                        .texOffs(50, 85)
                        .addBox(-2.5F, 0.5F, -16.5F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 84)
                        .addBox(-1.0F, -0.5F, -16.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(14, 86)
                        .addBox(3.0F, -0.25F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(14, 86)
                        .mirror()
                        .addBox(-5.0F, -0.25F, -16.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(104, 106)
                        .addBox(-6.5F, 0.25F, -12.0F, 13.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition bone181 = bone180.addOrReplaceChild(
                "bone181",
                CubeListBuilder.create()
                        .texOffs(68, 40)
                        .addBox(-0.5F, -1.0F, 0.0607F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, 1.25F, -15.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition bone184 = bone180.addOrReplaceChild(
                "bone184",
                CubeListBuilder.create()
                        .texOffs(68, 40)
                        .mirror()
                        .addBox(-0.5F, -1.0F, 0.0607F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(4.0F, 1.25F, -15.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition monitor_glow_optional = bone180.addOrReplaceChild(
                "monitor_glow_optional",
                CubeListBuilder.create()
                        .texOffs(60, 12)
                        .addBox(-5.05F, -6.0F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(60, 12)
                        .addBox(5.05F, -6.0F, 0.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 2.75F, -7.5F, 0.7854F, 0.0F, 0.0F));

        PartDefinition monitor_glow = bone180.addOrReplaceChild(
                "monitor_glow",
                CubeListBuilder.create()
                        .texOffs(112, 16)
                        .addBox(-20.9604F, 0.9274F, -9.1577F, 11.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offset(15.4604F, -1.6774F, -1.8423F));

        PartDefinition bone186 = bone180.addOrReplaceChild(
                "bone186",
                CubeListBuilder.create()
                        .texOffs(72, 7)
                        .addBox(-1.5F, -1.5F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 130)
                        .addBox(-0.5F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.0F, 1.25F, -4.5F, 0.0F, 0.48F, 0.0F));

        PartDefinition bone185 = bone180.addOrReplaceChild(
                "bone185",
                CubeListBuilder.create()
                        .texOffs(72, 7)
                        .mirror()
                        .addBox(-1.5F, -1.5F, -1.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(8, 130)
                        .mirror()
                        .addBox(-1.5F, -1.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(-9.0F, 1.25F, -4.5F, 0.0F, -0.48F, 0.0F));

        PartDefinition south_east = components.addOrReplaceChild(
                "south_east",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -27.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone187 = south_east.addOrReplaceChild(
                "bone187",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition telepathic_glow = bone187.addOrReplaceChild(
                "telepathic_glow",
                CubeListBuilder.create()
                        .texOffs(60, 18)
                        .addBox(-26.9604F, -0.1226F, -14.6577F, 20.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                        .texOffs(60, 60)
                        .addBox(-26.9604F, -0.6226F, -15.1577F, 20.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offset(16.9604F, 0.3226F, 0.1577F));

        PartDefinition south =
                components.addOrReplaceChild("south", CubeListBuilder.create(), PartPose.offset(0.0F, -27.0F, 0.0F));

        PartDefinition bone188 = south.addOrReplaceChild(
                "bone188",
                CubeListBuilder.create()
                        .texOffs(112, 66)
                        .addBox(-9.25F, -0.25F, -7.5F, 5.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 95)
                        .addBox(-3.0F, 0.75F, -12.0F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 130)
                        .addBox(-6.75F, 0.25F, -12.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 68)
                        .addBox(4.5F, 0.25F, -13.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(60, 35)
                        .addBox(-3.0F, 0.75F, -15.5F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 29.75F, -0.4974F, 0.0F, 0.0F));

        PartDefinition throttle_rotate_X80 = bone188.addOrReplaceChild(
                "throttle_rotate_X80",
                CubeListBuilder.create()
                        .texOffs(16, 72)
                        .addBox(-2.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 72)
                        .addBox(1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(68, 53)
                        .addBox(-2.5F, -4.75F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 68)
                        .addBox(-0.5F, -4.75F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.75F, 0.25F, -5.5F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone220 = throttle_rotate_X80.addOrReplaceChild(
                "bone220",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-1.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.0F, -1.5F, 0.0F, 0.0F, 0.0F, -0.1309F));

        PartDefinition bone221 = throttle_rotate_X80.addOrReplaceChild(
                "bone221",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .mirror()
                        .addBox(0.0F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false),
                PartPose.offsetAndRotation(1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition handbrake_rotate_Y130 = bone188.addOrReplaceChild(
                "handbrake_rotate_Y130",
                CubeListBuilder.create()
                        .texOffs(0, 97)
                        .addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.0F, 1.25F, -5.5F, 0.0F, -2.2689F, 0.0F));

        PartDefinition bone196 = handbrake_rotate_Y130.addOrReplaceChild(
                "bone196",
                CubeListBuilder.create()
                        .texOffs(26, 84)
                        .addBox(-6.0F, -1.0F, -0.5F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.1309F));

        PartDefinition stabiliser = bone188.addOrReplaceChild(
                "stabiliser",
                CubeListBuilder.create()
                        .texOffs(32, 99)
                        .addBox(-29.7104F, 0.4274F, -15.6577F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 74)
                        .addBox(-28.7104F, -0.5726F, -15.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 74)
                        .addBox(-27.2104F, -0.5726F, -15.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 74)
                        .addBox(-25.7104F, -0.5726F, -15.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(26.7104F, -0.1774F, 8.1577F));

        PartDefinition stabiliser_glow = stabiliser.addOrReplaceChild(
                "stabiliser_glow",
                CubeListBuilder.create()
                        .texOffs(68, 47)
                        .addBox(-30.4604F, -0.5726F, -15.1577F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(1.25F, 0.5F, 2.0F));

        PartDefinition Xincrement = bone188.addOrReplaceChild(
                "Xincrement",
                CubeListBuilder.create()
                        .texOffs(60, 24)
                        .addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.0F, 1.25F, -14.5F, 0.48F, 0.0F, 0.0F));

        PartDefinition bone222 = Xincrement.addOrReplaceChild(
                "bone222",
                CubeListBuilder.create()
                        .texOffs(66, 73)
                        .addBox(-0.5F, -1.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Yincrement = bone188.addOrReplaceChild(
                "Yincrement",
                CubeListBuilder.create()
                        .texOffs(12, 40)
                        .addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.25F, -14.5F, 0.48F, 0.0F, 0.0F));

        PartDefinition bone223 = Yincrement.addOrReplaceChild(
                "bone223",
                CubeListBuilder.create()
                        .texOffs(66, 73)
                        .addBox(-0.5F, -1.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Zincrement = bone188.addOrReplaceChild(
                "Zincrement",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-0.5F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.0F, 1.25F, -14.5F));

        PartDefinition bone224 = Zincrement.addOrReplaceChild(
                "bone224",
                CubeListBuilder.create()
                        .texOffs(66, 73)
                        .addBox(-0.5F, -1.0F, -1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.025F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, 0.5F, 0.3927F, 0.0F, 0.0F));

        PartDefinition south_glow = bone188.addOrReplaceChild(
                "south_glow",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-34.9604F, -0.5726F, -13.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 0)
                        .addBox(-31.9604F, -0.5726F, -13.1577F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(26.2104F, 1.3226F, 4.1577F));

        PartDefinition bone235 = bone188.addOrReplaceChild(
                "bone235",
                CubeListBuilder.create()
                        .texOffs(55, 135)
                        .addBox(1.0F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(55, 135)
                        .addBox(-0.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.75F, -10.0F, -0.3054F, 0.0F, 0.0F));

        PartDefinition bone236 = bone188.addOrReplaceChild(
                "bone236",
                CubeListBuilder.create()
                        .texOffs(55, 135)
                        .addBox(-2.0F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.75F, -10.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition bone237 = bone188.addOrReplaceChild(
                "bone237",
                CubeListBuilder.create()
                        .texOffs(16, 34)
                        .addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.75F, 0.25F, -11.0F, 0.5236F, 0.0F, 0.0F));

        PartDefinition bone238 = bone188.addOrReplaceChild(
                "bone238",
                CubeListBuilder.create()
                        .texOffs(72, 2)
                        .addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.5F, 0.75F, -11.5F, 0.6109F, 0.0F, 0.0F));

        PartDefinition bone219 = bone188.addOrReplaceChild(
                "bone219",
                CubeListBuilder.create()
                        .texOffs(124, 66)
                        .addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(6.5F, 1.75F, -6.0F));

        PartDefinition rotor_top_translate_8 = partdefinition.addOrReplaceChild(
                "rotor_top_translate_8",
                CubeListBuilder.create()
                        .texOffs(110, 47)
                        .addBox(-5.0F, 57.5F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 110)
                        .addBox(-4.0F, 46.5F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 74)
                        .addBox(-6.0F, 49.5F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
                        .texOffs(44, 96)
                        .addBox(-5.0F, 38.5F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 74)
                        .addBox(-1.0F, 56.45F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -103.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition rotortop_glow = rotor_top_translate_8.addOrReplaceChild(
                "rotortop_glow",
                CubeListBuilder.create()
                        .texOffs(118, 84)
                        .addBox(-3.0F, 59.475F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rotor_bottom_translate_14 = partdefinition.addOrReplaceChild(
                "rotor_bottom_translate_14",
                CubeListBuilder.create()
                        .texOffs(110, 47)
                        .addBox(-5.0F, -59.5F, -5.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(32, 114)
                        .addBox(-4.0F, -58.5F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F))
                        .texOffs(82, 90)
                        .addBox(-6.0F, -53.5F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 106)
                        .addBox(-5.0F, -46.5F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(38, 68)
                        .addBox(-1.0F, -63.55F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition rotorbottom_glow = rotor_bottom_translate_14.addOrReplaceChild(
                "rotorbottom_glow",
                CubeListBuilder.create()
                        .texOffs(64, 124)
                        .addBox(-3.0F, -69.5F, -3.0F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 256, 256);
    }

    @Override
    public void setupAnimations(T t, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.animate(t.rotorAnimationState, ToyotaConsoleModelAnimation.ROTOR, ageInTicks);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent(tardis -> {
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.X.get()).getUseAnimationState(),
                    ToyotaConsoleModelAnimation.X,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.Y.get()).getUseAnimationState(),
                    ToyotaConsoleModelAnimation.Y,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.Z.get()).getUseAnimationState(),
                    ToyotaConsoleModelAnimation.Z,
                    ageInTicks);
            //            this.animate(
            //                    tardis.getControlDataOrCreate(ControlRegistry.DOOR.get()).getUseAnimationState(),
            //                    ToyotaConsoleModelAnimation.DOOR_SWITCH_UP,
            //                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.FACING.get()).getUseAnimationState(),
                    ToyotaConsoleModelAnimation.DIRECTIONAL,
                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.FAST_RETURN.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.FAST_RETURN,
                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.STABILIZERS.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.STABILIZER,
                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.STABILIZERS.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.STABILIZER,
                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.RANDOMIZER.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.RANDOMIZER,
                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.COMMUNICATOR.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.COMMUNICATOR,
                    ageInTicks);

            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.DIMENSIONS.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.DIMENSIONAL,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.REFUELER.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.REFUEL,
                    ageInTicks);
            this.animate(
                    tardis.getControlDataOrCreate(ControlRegistry.LANDING_TYPE.get())
                            .getUseAnimationState(),
                    ToyotaConsoleModelAnimation.LAND_TYPE,
                    ageInTicks);

            ToyotaConsoleModelAnimation.animateConditional(tardis, this, ageInTicks);
        });
    }

    @Override
    public void renderToBuffer(
            PoseStack poseStack,
            VertexConsumer vertexConsumer,
            int packedLight,
            int packedOverlay,
            float red,
            float green,
            float blue,
            float alpha) {
        poseStack.pushPose();
        poseStack.scale(0.6f, 0.6f, 0.6f);
        poseStack.translate(0, 1, 0);
        base_console.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        components.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rotor_top_translate_8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rotor_bottom_translate_14.render(
                poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.popPose();
    }

    public static class ToyotaConsoleModelAnimation {
        public static final AnimationDefinition ROTOR = AnimationDefinition.Builder.withLength(4.0F)
                .looping()
                .addAnimation(
                        "rotor_top_translate_8",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        2.0F,
                                        KeyframeAnimations.posVec(0.0F, 8.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        4.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "rotor_bottom_translate_14",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        2.0F,
                                        KeyframeAnimations.posVec(0.0F, -14.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        4.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();

        public static final AnimationDefinition DOOR_SWITCH_UP = AnimationDefinition.Builder.withLength(0.25F)
                .addAnimation(
                        "door2_rotate_x_100",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(100.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition DOOR_SWITCH_DOWN = AnimationDefinition.Builder.withLength(0.25F)
                .addAnimation(
                        "door2_rotate_x_100",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(100.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition LAND_TYPE = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "landtype_rotate_Y70",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, 70.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition HANDBRAKE_ON = AnimationDefinition.Builder.withLength(0.75F)
                .addAnimation(
                        "handbrake_rotate_Y130",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.75F,
                                        KeyframeAnimations.degreeVec(0.0F, 132.25F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition HANDBRAKE_OFF = AnimationDefinition.Builder.withLength(0.75F)
                .addAnimation(
                        "handbrake_rotate_Y130",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 132.25F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.75F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition FAST_RETURN = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "fastreturn_rotate_X65",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();

        public static final AnimationDefinition RANDOMIZER = AnimationDefinition.Builder.withLength(0.75F)
                .addAnimation(
                        "bone19",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "randomiser_glow2",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.125F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.375F,
                                        KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.625F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "randomiser_glow3",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.2083F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.4583F,
                                        KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.7083F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "randomiser_glow4",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0417F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.2917F,
                                        KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5417F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();

        public static final AnimationDefinition DIMENSIONAL = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "dimensionrotate_Y35",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "dimensionrotate_Y65",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, 65.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "dimensionrotate_Y50",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();

        public static final AnimationDefinition DIRECTIONAL = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "directioncontrol_rotate_Y90",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, -360.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition X = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "Xincrement",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition Y = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "Yincrement",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition Z = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "Zincrement",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "bone224",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition STABILIZER = AnimationDefinition.Builder.withLength(0.7083F)
                .addAnimation(
                        "stabiliser2",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "stabiliser3",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.2083F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.4583F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.7083F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .addAnimation(
                        "stabiliser4",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0833F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.3333F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR),
                                new Keyframe(
                                        0.5833F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.LINEAR)))
                .build();

        public static final AnimationDefinition COMMUNICATOR = AnimationDefinition.Builder.withLength(0.5F)
                .addAnimation(
                        "communicator",
                        new AnimationChannel(
                                AnimationChannel.Targets.ROTATION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.degreeVec(0.0F, 5.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "communicator",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.posVec(0.25F, 0.0F, -1.25F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();

        public static final AnimationDefinition REFUEL = AnimationDefinition.Builder.withLength(0.9167F)
                .addAnimation(
                        "refuel2",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.25F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.5F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "refuel3",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.2083F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.4583F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.7083F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "refuel4",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.375F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.625F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.875F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "refuel5",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.1667F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.4167F,
                                        KeyframeAnimations.posVec(0.0F, -0.75F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        0.6667F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();

        public static void animateConditional(ITardisLevel tardis, ToyotaConsoleModel<?> model, float ageInTicks) {
            final ControlDataFloat throttle = tardis.getControlDataOrCreate(ControlRegistry.THROTTLE.get());
            final ControlDataBool handbrake = tardis.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get());
            final ControlDataBool light =
                    tardis.getControlDataOrCreate(tama.Registries.ControlRegistry.LIGHT_SWITCH.get());
            final ControlDataNone door = (ControlDataNone) tardis.getControlDataOrCreate(ControlRegistry.DOOR.get());
            boolean doorBool =
                    tardis.getInteriorManager().getDoorHandler().getDoorState().isOpen();

            model.getAnyDescendantWithName("throttle_rotate_X80")
                    .ifPresent(control -> control.offsetRotation(AnimationHelper.getSteppedRotation(
                            throttle,
                            -80,
                            throttle.getPrevious(),
                            throttle.get(),
                            ageInTicks,
                            20,
                            new Vector3f(1, 0, 0))));

            model.getAnyDescendantWithName("handbrake_rotate_Y130")
                    .ifPresent(control -> control.offsetRotation(new Vector3f(AnimationHelper.getSteppedRotation(
                            handbrake,
                            130,
                            (!handbrake.get() ? 1 : 0),
                            (handbrake.get() ? 1 : 0),
                            ageInTicks,
                            20,
                            new Vector3f(0, 1, 0)))));

            model.getAnyDescendantWithName("door2_rotate_x_100")
                    .ifPresent(control -> control.offsetRotation(new Vector3f(AnimationHelper.getSteppedRotation(
                            door,
                            100,
                            (doorBool ? 2 : 0),
                            (!doorBool ? 2 : 0),
                            ageInTicks,
                            0,
                            new Vector3f(1, 0, 0)))));

            model.getAnyDescendantWithName("door_rotate_x_100")
                    .ifPresent(control -> control.offsetRotation(new Vector3f(AnimationHelper.getSteppedRotation(
                            light,
                            100,
                            (!light.get() ? 1 : 0),
                            (light.get() ? 1 : 0),
                            ageInTicks,
                            0,
                            new Vector3f(1, 0, 0)))));
        }
    }
}
