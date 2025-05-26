package com.code.aseoha.client.models.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class ColinRichmondExteriorModel extends ExteriorModel {
    private final ModelRenderer Shell;
    private final ModelRenderer boti_r1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer windowframes;
    private final ModelRenderer bone30;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer bone21;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
    private final ModelRenderer bone29;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer panelframes;
    private final ModelRenderer bone23;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer bone31;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer bone18;
    private final ModelRenderer cube_r80;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer cube_r83;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bone12;
    private final ModelRenderer bone11;
    private final ModelRenderer cube_r98;
    private final ModelRenderer bone19;
    private final ModelRenderer cube_r99;
    private final ModelRenderer cube_r100;
    private final ModelRenderer cube_r101;
    private final ModelRenderer cube_r102;
    private final ModelRenderer cube_r103;
    private final ModelRenderer cube_r104;
    private final ModelRenderer cube_r105;
    private final ModelRenderer cube_r106;
    private final ModelRenderer bone20;
    private final ModelRenderer cube_r107;
    private final ModelRenderer cube_r108;
    private final ModelRenderer cube_r109;
    private final ModelRenderer cube_r110;
    private final ModelRenderer cube_r111;
    private final ModelRenderer cube_r112;
    private final ModelRenderer cube_r113;
    private final ModelRenderer cube_r114;
    private final ModelRenderer bone8;
    private final ModelRenderer cube_r115;
    private final ModelRenderer bone9;
    private final ModelRenderer cube_r116;
    private final ModelRenderer cube_r117;
    private final ModelRenderer cube_r118;
    private final ModelRenderer cube_r119;
    private final ModelRenderer cube_r120;
    private final ModelRenderer cube_r121;
    private final ModelRenderer cube_r122;
    private final ModelRenderer cube_r123;
    private final ModelRenderer bone10;
    private final ModelRenderer cube_r124;
    private final ModelRenderer cube_r125;
    private final ModelRenderer cube_r126;
    private final ModelRenderer cube_r127;
    private final ModelRenderer cube_r128;
    private final ModelRenderer cube_r129;
    private final ModelRenderer cube_r130;
    private final ModelRenderer cube_r131;
    private final ModelRenderer bone22;
    private final ModelRenderer cube_r132;
    private final ModelRenderer bone24;
    private final ModelRenderer cube_r133;
    private final ModelRenderer cube_r134;
    private final ModelRenderer cube_r135;
    private final ModelRenderer cube_r136;
    private final ModelRenderer cube_r137;
    private final ModelRenderer cube_r138;
    private final ModelRenderer cube_r139;
    private final ModelRenderer cube_r140;
    private final ModelRenderer bone25;
    private final ModelRenderer cube_r141;
    private final ModelRenderer cube_r142;
    private final ModelRenderer cube_r143;
    private final ModelRenderer cube_r144;
    private final ModelRenderer cube_r145;
    private final ModelRenderer cube_r146;
    private final ModelRenderer cube_r147;
    private final ModelRenderer cube_r148;
    private final ModelRenderer bone26;
    private final ModelRenderer cube_r149;
    private final ModelRenderer bone27;
    private final ModelRenderer cube_r150;
    private final ModelRenderer cube_r151;
    private final ModelRenderer cube_r152;
    private final ModelRenderer cube_r153;
    private final ModelRenderer cube_r154;
    private final ModelRenderer cube_r155;
    private final ModelRenderer cube_r156;
    private final ModelRenderer cube_r157;
    private final ModelRenderer bone28;
    private final ModelRenderer cube_r158;
    private final ModelRenderer cube_r159;
    private final ModelRenderer cube_r160;
    private final ModelRenderer cube_r161;
    private final ModelRenderer cube_r162;
    private final ModelRenderer cube_r163;
    private final ModelRenderer cube_r164;
    private final ModelRenderer cube_r165;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer Signagetext;
    private final ModelRenderer cube_r166;
    private final ModelRenderer text_POLICE4;
    private final ModelRenderer character_p7;
    private final ModelRenderer text_BOX4;
    private final ModelRenderer character_b7;
    private final ModelRenderer text_PUBLIC4;
    private final ModelRenderer character_p8;
    private final ModelRenderer text_CALL4;
    private final ModelRenderer character_c10;
    private final ModelRenderer character_a4;
    private final ModelRenderer character_l13;
    private final ModelRenderer character_l14;
    private final ModelRenderer character_u4;
    private final ModelRenderer character_b8;
    private final ModelRenderer character_l15;
    private final ModelRenderer character_i7;
    private final ModelRenderer character_c11;
    private final ModelRenderer character_o7;
    private final ModelRenderer character_x4;
    private final ModelRenderer character_o8;
    private final ModelRenderer character_l16;
    private final ModelRenderer character_i8;
    private final ModelRenderer character_c12;
    private final ModelRenderer character_e4;
    private final ModelRenderer text_POLICE3;
    private final ModelRenderer character_p5;
    private final ModelRenderer text_BOX3;
    private final ModelRenderer character_b5;
    private final ModelRenderer text_PUBLIC3;
    private final ModelRenderer character_p6;
    private final ModelRenderer text_CALL3;
    private final ModelRenderer character_c7;
    private final ModelRenderer character_a3;
    private final ModelRenderer character_l9;
    private final ModelRenderer character_l10;
    private final ModelRenderer character_u3;
    private final ModelRenderer character_b6;
    private final ModelRenderer character_l11;
    private final ModelRenderer character_i5;
    private final ModelRenderer character_c8;
    private final ModelRenderer character_o5;
    private final ModelRenderer character_x3;
    private final ModelRenderer character_o6;
    private final ModelRenderer character_l12;
    private final ModelRenderer character_i6;
    private final ModelRenderer character_c9;
    private final ModelRenderer character_e3;
    private final ModelRenderer text_POLICE;
    private final ModelRenderer character_p;
    private final ModelRenderer text_BOX;
    private final ModelRenderer character_b;
    private final ModelRenderer text_PUBLIC;
    private final ModelRenderer character_p2;
    private final ModelRenderer text_CALL;
    private final ModelRenderer character_c3;
    private final ModelRenderer character_a;
    private final ModelRenderer character_l3;
    private final ModelRenderer character_l4;
    private final ModelRenderer character_u;
    private final ModelRenderer character_b2;
    private final ModelRenderer character_l2;
    private final ModelRenderer character_i2;
    private final ModelRenderer character_c2;
    private final ModelRenderer character_o2;
    private final ModelRenderer character_x;
    private final ModelRenderer character_o;
    private final ModelRenderer character_l;
    private final ModelRenderer character_i;
    private final ModelRenderer character_c;
    private final ModelRenderer character_e;
    private final ModelRenderer text_POLICE2;
    private final ModelRenderer character_p3;
    private final ModelRenderer text_BOX2;
    private final ModelRenderer character_b3;
    private final ModelRenderer text_PUBLIC2;
    private final ModelRenderer character_p4;
    private final ModelRenderer text_CALL2;
    private final ModelRenderer character_c4;
    private final ModelRenderer character_a2;
    private final ModelRenderer character_l5;
    private final ModelRenderer character_l6;
    private final ModelRenderer character_u2;
    private final ModelRenderer character_b4;
    private final ModelRenderer character_l7;
    private final ModelRenderer character_i3;
    private final ModelRenderer character_c5;
    private final ModelRenderer character_o3;
    private final ModelRenderer character_x2;
    private final ModelRenderer character_o4;
    private final ModelRenderer character_l8;
    private final ModelRenderer character_i4;
    private final ModelRenderer character_c6;
    private final ModelRenderer character_e2;
    private final ModelRenderer LeftDoor;
    private final ModelRenderer cube_r167;
    private final ModelRenderer cube_r168;
    private final ModelRenderer cube_r169;
    private final ModelRenderer cube_r170;
    private final ModelRenderer cube_r171;
    private final ModelRenderer cube_r172;
    private final ModelRenderer cube_r173;
    private final ModelRenderer cube_r174;
    private final ModelRenderer cube_r175;
    private final ModelRenderer cube_r176;
    private final ModelRenderer cube_r177;
    private final ModelRenderer cube_r178;
    private final ModelRenderer cube_r179;
    private final ModelRenderer cube_r180;
    private final ModelRenderer cube_r181;
    private final ModelRenderer cube_r182;
    private final ModelRenderer cube_r183;
    private final ModelRenderer cube_r184;
    private final ModelRenderer cube_r185;
    private final ModelRenderer cube_r186;
    private final ModelRenderer cube_r187;
    private final ModelRenderer cube_r188;
    private final ModelRenderer cube_r189;
    private final ModelRenderer cube_r190;
    private final ModelRenderer cube_r191;
    private final ModelRenderer cube_r192;
    private final ModelRenderer cube_r193;
    private final ModelRenderer cube_r194;
    private final ModelRenderer cube_r195;
    private final ModelRenderer cube_r196;
    private final ModelRenderer cube_r197;
    private final ModelRenderer cube_r198;
    private final ModelRenderer phone;
    private final ModelRenderer cube_r199;
    private final ModelRenderer cube_r200;
    private final ModelRenderer phoneitem;
    private final ModelRenderer phonedoor;
    private final ModelRenderer cube_r201;
    private final ModelRenderer cube_r202;
    private final ModelRenderer cube_r203;
    private final ModelRenderer cube_r204;
    private final ModelRenderer cube_r205;
    private final ModelRenderer cube_r206;
    private final ModelRenderer doorphone;
    private final ModelRenderer cube_r207;
    private final ModelRenderer RightDoor;
    private final ModelRenderer cube_r208;
    private final ModelRenderer cube_r209;
    private final ModelRenderer cube_r210;
    private final ModelRenderer cube_r211;
    private final ModelRenderer cube_r212;
    private final ModelRenderer cube_r213;
    private final ModelRenderer cube_r214;
    private final ModelRenderer cube_r215;
    private final ModelRenderer cube_r216;
    private final ModelRenderer cube_r217;
    private final ModelRenderer cube_r218;
    private final ModelRenderer cube_r219;
    private final ModelRenderer cube_r220;
    private final ModelRenderer cube_r221;
    private final ModelRenderer cube_r222;
    private final ModelRenderer cube_r223;
    private final ModelRenderer cube_r224;
    private final ModelRenderer cube_r225;
    private final ModelRenderer cube_r226;
    private final ModelRenderer cube_r227;
    private final ModelRenderer cube_r228;
    private final ModelRenderer cube_r229;
    private final ModelRenderer cube_r230;
    private final ModelRenderer cube_r231;
    private final ModelRenderer cube_r232;
    private final ModelRenderer cube_r233;
    private final ModelRenderer cube_r234;
    private final ModelRenderer cube_r235;
    private final ModelRenderer cube_r236;
    private final ModelRenderer cube_r237;
    private final ModelRenderer cube_r238;
    private final ModelRenderer cube_r239;
    private final ModelRenderer cube_r240;
    private final ModelRenderer cube_r241;
    private final ModelRenderer cube_r242;
    private final ModelRenderer cube_r243;
    private final ModelRenderer cube_r244;
    private final ModelRenderer cube_r245;

    public ColinRichmondExteriorModel() {
        texWidth = 368;
        texHeight = 368;

        Shell = new ModelRenderer(this);
        Shell.setPos(0.0F, 24.0F, 0.0F);
        Shell.texOffs(0, 58).addBox(-26.0F, -5.0F, -26.0F, 52.0F, 1.0F, 52.0F, 0.0F, false);
        Shell.texOffs(28, 66).addBox(-23.0F, -92.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        Shell.texOffs(264, 284).addBox(17.0F, -80.0F, -24.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(264, 284).addBox(-18.0F, -80.0F, -24.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(156, 108).addBox(-18.0F, -81.0F, -24.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
        Shell.texOffs(238, 11).addBox(-21.0F, -87.0F, -27.0F, 42.0F, 6.0F, 5.0F, 0.0F, false);
        Shell.texOffs(0, 111).addBox(-22.0F, -92.7F, -22.0F, 44.0F, 6.0F, 44.0F, 0.25F, false);
        Shell.texOffs(150, 129).addBox(-18.0F, -96.7F, -18.0F, 36.0F, 4.0F, 18.0F, 0.35F, false);
        Shell.texOffs(104, 277).addBox(-23.0F, -80.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
        Shell.texOffs(210, 281).addBox(-24.0F, -80.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        Shell.texOffs(262, 133).addBox(-23.0F, -8.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(176, 233).addBox(-22.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        Shell.texOffs(114, 259).addBox(-23.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(230, 203).addBox(-22.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        Shell.texOffs(32, 254).addBox(-23.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(230, 158).addBox(-22.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        Shell.texOffs(240, 251).addBox(-23.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(0, 251).addBox(-23.0F, -80.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(1, 253).addBox(-22.5F, -77.0F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        Shell.texOffs(1, 238).addBox(-22.5F, -77.0F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        Shell.texOffs(192, 278).addBox(-23.0F, -80.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        Shell.texOffs(186, 278).addBox(-23.0F, -80.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        Shell.texOffs(260, 284).addBox(-24.0F, -80.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(186, 151).addBox(-24.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
        Shell.texOffs(256, 284).addBox(-24.0F, -80.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(224, 151).addBox(-15.0F, -80.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        Shell.texOffs(144, 207).addBox(-15.0F, -62.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        Shell.texOffs(262, 166).addBox(-15.0F, -59.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        Shell.texOffs(144, 207).addBox(-15.0F, -44.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        Shell.texOffs(112, 177).addBox(-15.0F, -41.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        Shell.texOffs(144, 203).addBox(-15.0F, -26.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        Shell.texOffs(112, 161).addBox(-15.0F, -23.0F, 21.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
        Shell.texOffs(144, 199).addBox(-15.0F, -8.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
        Shell.texOffs(24, 284).addBox(-1.0F, -80.0F, 23.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(176, 278).addBox(-2.0F, -80.0F, 22.0F, 4.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(192, 278).addBox(-17.0F, -80.0F, 22.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(186, 278).addBox(15.0F, -80.0F, 22.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(208, 248).addBox(22.0F, -80.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(82, 244).addBox(22.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(206, 7).addBox(21.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        Shell.texOffs(32, 254).addBox(22.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(112, 199).addBox(21.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        Shell.texOffs(114, 259).addBox(22.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(198, 188).addBox(21.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
        Shell.texOffs(262, 133).addBox(22.0F, -8.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        Shell.texOffs(198, 278).addBox(23.0F, -80.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        Shell.texOffs(94, 277).addBox(22.0F, -80.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
        Shell.texOffs(192, 278).addBox(22.0F, -80.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        Shell.texOffs(186, 278).addBox(22.0F, -80.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        Shell.texOffs(252, 284).addBox(-18.0F, -80.0F, 23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(156, 106).addBox(-18.0F, -81.0F, 23.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
        Shell.texOffs(248, 284).addBox(17.0F, -80.0F, 23.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(244, 284).addBox(23.0F, -80.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(162, 0).addBox(23.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
        Shell.texOffs(240, 284).addBox(23.0F, -80.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        Shell.texOffs(28, 161).addBox(18.1F, -88.0F, 18.1F, 7.0F, 83.0F, 7.0F, 0.0F, false);
        Shell.texOffs(0, 161).addBox(18.0F, -88.0F, -25.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);
        Shell.texOffs(28, 58).addBox(-23.0F, -92.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        Shell.texOffs(28, 41).addBox(19.0F, -92.0F, 19.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        Shell.texOffs(28, 33).addBox(19.0F, -92.0F, -23.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
        Shell.texOffs(156, 58).addBox(-27.0F, -87.0F, -21.0F, 5.0F, 6.0F, 42.0F, 0.0F, false);
        Shell.texOffs(134, 151).addBox(22.0F, -87.0F, -21.0F, 5.0F, 6.0F, 42.0F, 0.0F, false);
        Shell.texOffs(54, 0).addBox(0.0F, 0.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(54, 0).addBox(-27.0F, 0.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(0, 0).addBox(-27.0F, -4.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(0, 0).addBox(0.0F, -4.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(54, 0).addBox(0.0F, 0.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(54, 0).addBox(-27.0F, 0.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, false);
        Shell.texOffs(54, 0).addBox(0.0F, -4.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(54, 0).addBox(-27.0F, -4.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, false);
        Shell.texOffs(0, 0).addBox(-27.0F, -2.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, false);
        Shell.texOffs(0, 0).addBox(0.0F, -2.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
        Shell.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);
        Shell.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);

        boti_r1 = new ModelRenderer(this);
        boti_r1.setPos(-0.5F, -44.25F, -3.0F);
        Shell.addChild(boti_r1);
        setRotationAngle(boti_r1, 0.0F, 3.1416F, 0.0F);
        boti_r1.texOffs(294, 196).addBox(-18.0F, -39.5F, 0.0F, 35.0F, 79.0F, 2.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -0.001F, 0.0F);
        Shell.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
        cube_r1.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);
        cube_r1.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -0.001F, 0.0F);
        Shell.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 3.1416F, 0.0F);
        cube_r2.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);
        cube_r2.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.0F, 0.0F);
        Shell.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
        cube_r3.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);
        cube_r3.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -1.0F, 0.0F);
        Shell.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
        cube_r4.texOffs(40, 74).addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(29, 82).addBox(-2.0F, -100.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.05F, false);
        cube_r4.texOffs(29, 82).addBox(-2.0F, -102.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.05F, false);
        cube_r4.texOffs(28, 41).addBox(-2.0F, -105.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r4.texOffs(30, 162).addBox(-3.0F, -104.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r4.texOffs(30, 162).addBox(-3.0F, -98.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
        cube_r4.texOffs(32, 163).addBox(-2.5F, -97.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        Shell.addChild(cube_r5);
        setRotationAngle(cube_r5, -3.1416F, 0.0F, 3.1416F);
        cube_r5.texOffs(0, 161).addBox(18.0F, -88.0F, -25.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.1F, 0.0F, 0.1F);
        Shell.addChild(cube_r6);
        setRotationAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
        cube_r6.texOffs(28, 161).addBox(18.0F, -88.0F, 18.0F, 7.0F, 83.0F, 7.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(22.0F, -69.5F, 8.5F);
        Shell.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 3.1416F, 0.0F);
        cube_r7.texOffs(115, 231).addBox(-0.5F, -7.5F, -6.5F, 1.0F, 15.0F, 13.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(22.0F, -69.5F, -8.5F);
        Shell.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 3.1416F, 0.0F);
        cube_r8.texOffs(115, 246).addBox(-0.5F, -7.5F, -6.5F, 1.0F, 15.0F, 13.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-8.5F, -69.5F, 22.0F);
        Shell.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
        cube_r9.texOffs(32, 250).addBox(-6.5F, -7.5F, -0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(8.5F, -69.5F, 22.0F);
        Shell.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 3.1416F, 0.0F);
        cube_r10.texOffs(32, 265).addBox(-6.5F, -7.5F, -0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, -94.7F, 0.0F);
        Shell.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 3.1416F, 0.0F);
        cube_r11.texOffs(150, 129).addBox(-18.0F, -2.0F, -18.0F, 36.0F, 4.0F, 18.0F, 0.35F, true);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, -84.0F, 24.5F);
        Shell.addChild(cube_r12);
        setRotationAngle(cube_r12, -3.1416F, 0.0F, 3.1416F);
        cube_r12.texOffs(238, 11).addBox(-21.0F, -3.0F, -2.5F, 42.0F, 6.0F, 5.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(0.0F, -1.0F, 0.0F);
        Shell.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
        cube_r13.texOffs(28, 74).addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

        windowframes = new ModelRenderer(this);
        windowframes.setPos(-45.25F, -69.475F, 24.975F);
        Shell.addChild(windowframes);
        setRotationAngle(windowframes, 0.0F, 1.5708F, 0.0F);


        bone30 = new ModelRenderer(this);
        bone30.setPos(0.0F, 0.0F, 0.0F);
        windowframes.addChild(bone30);


        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(16.475F, 7.475F, 22.25F);
        bone30.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
        cube_r14.texOffs(342, 0).addBox(10.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r14.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(16.475F, 0.3285F, 22.6035F);
        bone30.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
        cube_r15.texOffs(342, 0).addBox(10.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r15.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(16.475F, -0.025F, 22.25F);
        bone30.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
        cube_r16.texOffs(342, 0).addBox(10.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r16.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(10.3285F, -0.025F, 22.6035F);
        bone30.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, -0.7854F, 0.0F);
        cube_r17.texOffs(366, 0).addBox(11.5208F, -7.5F, -12.0208F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r17.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(14.8286F, -0.025F, 22.6035F);
        bone30.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, -0.7854F, 0.0F);
        cube_r18.texOffs(366, 0).addBox(11.344F, -7.5F, -11.844F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r18.texOffs(366, 0).addBox(-0.6768F, -7.5F, 0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(14.1214F, -0.025F, 22.6035F);
        bone30.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.7854F, 0.0F);
        cube_r19.texOffs(366, 0).addBox(11.344F, -7.5F, 11.844F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r19.texOffs(366, 0).addBox(-0.6768F, -7.5F, -0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(18.1214F, -0.025F, 22.6035F);
        bone30.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.7854F, 0.0F);
        cube_r20.texOffs(366, 0).addBox(11.6976F, -7.5F, 12.1976F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r20.texOffs(366, 0).addBox(-0.3232F, -7.5F, 0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(18.8285F, -0.025F, 22.6035F);
        bone30.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, -0.7854F, 0.0F);
        cube_r21.texOffs(366, 0).addBox(11.6976F, -7.5F, -12.1976F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r21.texOffs(366, 0).addBox(-0.3232F, -7.5F, -0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(16.475F, -7.1715F, 22.6035F);
        bone30.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.7854F, 0.0F, 0.0F);
        cube_r22.texOffs(342, 0).addBox(10.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r22.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(22.6214F, -0.025F, 22.6035F);
        bone30.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.7854F, 0.0F);
        cube_r23.texOffs(366, 0).addBox(11.5208F, -7.5F, 12.0208F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r23.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        bone21 = new ModelRenderer(this);
        bone21.setPos(-21.0F, 0.0F, 0.0F);
        windowframes.addChild(bone21);
        setRotationAngle(bone21, 0.0F, 1.5708F, 0.0F);


        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(-53.75F, 7.475F, 22.975F);
        bone21.addChild(cube_r24);
        setRotationAngle(cube_r24, -0.7854F, 0.0F, 0.0F);
        cube_r24.texOffs(342, 0).addBox(10.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r24.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(-53.75F, 0.3285F, 23.3285F);
        bone21.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.7854F, 0.0F, 0.0F);
        cube_r25.texOffs(342, 0).addBox(10.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r25.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(-53.75F, -0.025F, 22.975F);
        bone21.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.7854F, 0.0F, 0.0F);
        cube_r26.texOffs(342, 0).addBox(10.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r26.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(-59.8965F, -0.025F, 23.3285F);
        bone21.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, -0.7854F, 0.0F);
        cube_r27.texOffs(366, 0).addBox(11.5208F, -7.5F, -12.0208F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r27.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(-55.3964F, -0.025F, 23.3285F);
        bone21.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, -0.7854F, 0.0F);
        cube_r28.texOffs(366, 0).addBox(11.344F, -7.5F, -11.844F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r28.texOffs(366, 0).addBox(-0.6768F, -7.5F, 0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(-56.1035F, -0.025F, 23.3285F);
        bone21.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
        cube_r29.texOffs(366, 0).addBox(11.344F, -7.5F, 11.844F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r29.texOffs(366, 0).addBox(-0.6768F, -7.5F, -0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(-52.1036F, -0.025F, 23.3285F);
        bone21.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.7854F, 0.0F);
        cube_r30.texOffs(366, 0).addBox(11.6976F, -7.5F, 12.1976F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r30.texOffs(366, 0).addBox(-0.3232F, -7.5F, 0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(-51.3965F, -0.025F, 23.3285F);
        bone21.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, -0.7854F, 0.0F);
        cube_r31.texOffs(366, 0).addBox(11.6976F, -7.5F, -12.1976F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r31.texOffs(366, 0).addBox(-0.3232F, -7.5F, -0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(-53.75F, -7.1715F, 23.3285F);
        bone21.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.7854F, 0.0F, 0.0F);
        cube_r32.texOffs(342, 0).addBox(10.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r32.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(-47.6035F, -0.025F, 23.3285F);
        bone21.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 0.7854F, 0.0F);
        cube_r33.texOffs(366, 0).addBox(11.5208F, -7.5F, 12.0208F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r33.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        bone29 = new ModelRenderer(this);
        bone29.setPos(0.0F, 0.0F, 78.0F);
        windowframes.addChild(bone29);
        setRotationAngle(bone29, 0.0F, 3.1416F, 0.0F);


        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(-33.475F, 7.475F, 9.75F);
        bone29.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.7854F, 0.0F, 0.0F);
        cube_r34.texOffs(342, 0).addBox(10.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r34.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(-33.475F, 0.3285F, 10.1036F);
        bone29.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.7854F, 0.0F, 0.0F);
        cube_r35.texOffs(342, 0).addBox(10.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r35.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(-33.475F, -0.025F, 9.75F);
        bone29.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.7854F, 0.0F, 0.0F);
        cube_r36.texOffs(342, 0).addBox(10.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r36.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(-39.6214F, -0.025F, 10.1036F);
        bone29.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, -0.7854F, 0.0F);
        cube_r37.texOffs(366, 0).addBox(11.5208F, -7.5F, -12.0208F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r37.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(-35.1214F, -0.025F, 10.1036F);
        bone29.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, -0.7854F, 0.0F);
        cube_r38.texOffs(366, 0).addBox(11.344F, -7.5F, -11.844F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r38.texOffs(366, 0).addBox(-0.6768F, -7.5F, 0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(-35.8286F, -0.025F, 10.1036F);
        bone29.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.7854F, 0.0F);
        cube_r39.texOffs(366, 0).addBox(11.344F, -7.5F, 11.844F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r39.texOffs(366, 0).addBox(-0.6768F, -7.5F, -0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(-31.8286F, -0.025F, 10.1036F);
        bone29.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 0.7854F, 0.0F);
        cube_r40.texOffs(366, 0).addBox(11.6976F, -7.5F, 12.1976F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r40.texOffs(366, 0).addBox(-0.3232F, -7.5F, 0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(-31.1214F, -0.025F, 10.1036F);
        bone29.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, -0.7854F, 0.0F);
        cube_r41.texOffs(366, 0).addBox(11.6976F, -7.5F, -12.1976F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r41.texOffs(366, 0).addBox(-0.3232F, -7.5F, -0.1768F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(-33.475F, -7.1715F, 10.1036F);
        bone29.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.7854F, 0.0F, 0.0F);
        cube_r42.texOffs(342, 0).addBox(10.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r42.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(-27.3286F, -0.025F, 10.1036F);
        bone29.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 0.7854F, 0.0F);
        cube_r43.texOffs(366, 0).addBox(11.5208F, -7.5F, 12.0208F, 1.0F, 15.0F, 0.0F, 0.0F, false);
        cube_r43.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        panelframes = new ModelRenderer(this);
        panelframes.setPos(-22.6318F, -49.8493F, -0.0234F);
        Shell.addChild(panelframes);
        setRotationAngle(panelframes, 0.0F, 1.5708F, 0.0F);


        bone23 = new ModelRenderer(this);
        bone23.setPos(-0.0453F, 16.3529F, 45.3252F);
        panelframes.addChild(bone23);


        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(0.0308F, 17.9679F, -0.0487F);
        bone23.addChild(cube_r44);
        setRotationAngle(cube_r44, 3.1416F, 0.7854F, 3.1416F);
        cube_r44.texOffs(197, 217).addBox(-10.8515F, -7.4715F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(0.0344F, 18.0F, -0.0451F);
        bone23.addChild(cube_r45);
        setRotationAngle(cube_r45, -2.3562F, 0.0F, 3.1416F);
        cube_r45.texOffs(197, 217).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r45.texOffs(214, 217).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(0.0129F, 17.9679F, -0.0487F);
        bone23.addChild(cube_r46);
        setRotationAngle(cube_r46, 3.1416F, -0.7854F, -3.1416F);
        cube_r46.texOffs(209, 217).addBox(-2.1693F, -7.4715F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(0.0344F, 17.9929F, -0.0451F);
        bone23.addChild(cube_r47);
        setRotationAngle(cube_r47, 2.3562F, 0.0F, 3.1416F);
        cube_r47.texOffs(197, 231).addBox(-14.9875F, 4.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r47.texOffs(214, 231).addBox(2.0125F, 4.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(0.0129F, 17.9679F, -0.0487F);
        bone23.addChild(cube_r48);
        setRotationAngle(cube_r48, 3.1416F, -0.7854F, -3.1416F);
        cube_r48.texOffs(226, 217).addBox(9.8515F, -7.4715F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(0.0308F, 17.9679F, -0.0487F);
        bone23.addChild(cube_r49);
        setRotationAngle(cube_r49, 3.1416F, 0.7854F, 3.1416F);
        cube_r49.texOffs(214, 217).addBox(1.1693F, -7.4715F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(0.0308F, -0.0321F, -0.0487F);
        bone23.addChild(cube_r50);
        setRotationAngle(cube_r50, 3.1416F, 0.7854F, 3.1416F);
        cube_r50.texOffs(142, 228).addBox(-10.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setPos(0.0344F, 0.0F, -0.0451F);
        bone23.addChild(cube_r51);
        setRotationAngle(cube_r51, -2.3562F, 0.0F, 3.1416F);
        cube_r51.texOffs(142, 228).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r51.texOffs(159, 228).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setPos(0.0129F, -0.0321F, -0.0487F);
        bone23.addChild(cube_r52);
        setRotationAngle(cube_r52, 3.1416F, -0.7854F, -3.1416F);
        cube_r52.texOffs(154, 228).addBox(-2.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setPos(0.0344F, -0.0071F, -0.0451F);
        bone23.addChild(cube_r53);
        setRotationAngle(cube_r53, 2.3562F, 0.0F, 3.1416F);
        cube_r53.texOffs(142, 242).addBox(-14.9875F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r53.texOffs(159, 242).addBox(2.0125F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setPos(0.0471F, -0.0321F, -0.146F);
        bone23.addChild(cube_r54);
        setRotationAngle(cube_r54, 3.1416F, -0.7854F, -3.1416F);
        cube_r54.texOffs(171, 228).addBox(9.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setPos(0.0308F, -0.0321F, -0.0487F);
        bone23.addChild(cube_r55);
        setRotationAngle(cube_r55, 3.1416F, 0.7854F, 3.1416F);
        cube_r55.texOffs(159, 228).addBox(1.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setPos(0.0308F, -18.0321F, -0.0487F);
        bone23.addChild(cube_r56);
        setRotationAngle(cube_r56, 3.1416F, 0.7854F, 3.1416F);
        cube_r56.texOffs(253, 36).addBox(1.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setPos(0.0308F, -18.0321F, -0.0487F);
        bone23.addChild(cube_r57);
        setRotationAngle(cube_r57, 3.1416F, 0.7854F, 3.1416F);
        cube_r57.texOffs(235, 36).addBox(-10.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setPos(0.0344F, -18.0F, -0.0451F);
        bone23.addChild(cube_r58);
        setRotationAngle(cube_r58, -2.3562F, 0.0F, 3.1416F);
        cube_r58.texOffs(235, 36).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r58.texOffs(253, 36).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setPos(0.0129F, -18.0321F, -0.0487F);
        bone23.addChild(cube_r59);
        setRotationAngle(cube_r59, 3.1416F, -0.7854F, -3.1416F);
        cube_r59.texOffs(248, 36).addBox(-2.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setPos(0.0344F, -18.0071F, -0.0451F);
        bone23.addChild(cube_r60);
        setRotationAngle(cube_r60, 2.3562F, 0.0F, 3.1416F);
        cube_r60.texOffs(236, 50).addBox(-14.9875F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r60.texOffs(253, 50).addBox(2.0125F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setPos(0.0129F, -18.0321F, -0.0487F);
        bone23.addChild(cube_r61);
        setRotationAngle(cube_r61, 3.1416F, -0.7854F, -3.1416F);
        cube_r61.texOffs(265, 36).addBox(9.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        bone31 = new ModelRenderer(this);
        bone31.setPos(-0.0453F, 16.3529F, 45.3252F);
        panelframes.addChild(bone31);
        setRotationAngle(bone31, 0.0F, -1.5708F, 0.0F);


        cube_r62 = new ModelRenderer(this);
        cube_r62.setPos(-22.6844F, 17.9679F, 22.6228F);
        bone31.addChild(cube_r62);
        setRotationAngle(cube_r62, 3.1416F, 0.7854F, 3.1416F);
        cube_r62.texOffs(197, 217).addBox(-10.8515F, -7.4715F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setPos(-22.6808F, 18.0F, 22.6263F);
        bone31.addChild(cube_r63);
        setRotationAngle(cube_r63, -2.3562F, 0.0F, 3.1416F);
        cube_r63.texOffs(197, 217).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r63.texOffs(214, 217).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setPos(-22.7023F, 17.9679F, 22.6228F);
        bone31.addChild(cube_r64);
        setRotationAngle(cube_r64, 3.1416F, -0.7854F, -3.1416F);
        cube_r64.texOffs(209, 217).addBox(-2.1693F, -7.4715F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setPos(-22.6808F, 17.9929F, 22.6264F);
        bone31.addChild(cube_r65);
        setRotationAngle(cube_r65, 2.3562F, 0.0F, 3.1416F);
        cube_r65.texOffs(197, 231).addBox(-14.9875F, 4.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r65.texOffs(214, 231).addBox(2.0125F, 4.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setPos(-22.7023F, 17.9679F, 22.6228F);
        bone31.addChild(cube_r66);
        setRotationAngle(cube_r66, 3.1416F, -0.7854F, -3.1416F);
        cube_r66.texOffs(226, 217).addBox(9.8515F, -7.4715F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setPos(-22.6844F, 17.9679F, 22.6228F);
        bone31.addChild(cube_r67);
        setRotationAngle(cube_r67, 3.1416F, 0.7854F, 3.1416F);
        cube_r67.texOffs(214, 217).addBox(1.1693F, -7.4715F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setPos(-22.6844F, -0.0321F, 22.6228F);
        bone31.addChild(cube_r68);
        setRotationAngle(cube_r68, 3.1416F, 0.7854F, 3.1416F);
        cube_r68.texOffs(142, 228).addBox(-10.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setPos(-22.6808F, 0.0F, 22.6263F);
        bone31.addChild(cube_r69);
        setRotationAngle(cube_r69, -2.3562F, 0.0F, 3.1416F);
        cube_r69.texOffs(142, 228).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r69.texOffs(159, 228).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setPos(-22.7023F, -0.0321F, 22.6228F);
        bone31.addChild(cube_r70);
        setRotationAngle(cube_r70, 3.1416F, -0.7854F, -3.1416F);
        cube_r70.texOffs(154, 228).addBox(-2.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setPos(-22.6808F, -0.0071F, 22.6264F);
        bone31.addChild(cube_r71);
        setRotationAngle(cube_r71, 2.3562F, 0.0F, 3.1416F);
        cube_r71.texOffs(142, 242).addBox(-14.9875F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r71.texOffs(159, 242).addBox(2.0125F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setPos(-22.6681F, -0.0321F, 22.5255F);
        bone31.addChild(cube_r72);
        setRotationAngle(cube_r72, 3.1416F, -0.7854F, -3.1416F);
        cube_r72.texOffs(171, 228).addBox(9.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setPos(-22.6844F, -0.0321F, 22.6228F);
        bone31.addChild(cube_r73);
        setRotationAngle(cube_r73, 3.1416F, 0.7854F, 3.1416F);
        cube_r73.texOffs(159, 228).addBox(1.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setPos(-22.6844F, -18.0321F, 22.6228F);
        bone31.addChild(cube_r74);
        setRotationAngle(cube_r74, 3.1416F, 0.7854F, 3.1416F);
        cube_r74.texOffs(253, 36).addBox(1.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setPos(-22.6844F, -18.0321F, 22.6228F);
        bone31.addChild(cube_r75);
        setRotationAngle(cube_r75, 3.1416F, 0.7854F, 3.1416F);
        cube_r75.texOffs(235, 36).addBox(-10.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setPos(-22.6808F, -18.0F, 22.6263F);
        bone31.addChild(cube_r76);
        setRotationAngle(cube_r76, -2.3562F, 0.0F, 3.1416F);
        cube_r76.texOffs(235, 36).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r76.texOffs(253, 36).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setPos(-22.7023F, -18.0321F, 22.6228F);
        bone31.addChild(cube_r77);
        setRotationAngle(cube_r77, 3.1416F, -0.7854F, -3.1416F);
        cube_r77.texOffs(248, 36).addBox(-2.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setPos(-22.6808F, -18.0071F, 22.6264F);
        bone31.addChild(cube_r78);
        setRotationAngle(cube_r78, 2.3562F, 0.0F, 3.1416F);
        cube_r78.texOffs(236, 50).addBox(-14.9875F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r78.texOffs(253, 50).addBox(2.0125F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setPos(-22.7023F, -18.0321F, 22.6228F);
        bone31.addChild(cube_r79);
        setRotationAngle(cube_r79, 3.1416F, -0.7854F, -3.1416F);
        cube_r79.texOffs(265, 36).addBox(9.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        bone18 = new ModelRenderer(this);
        bone18.setPos(-0.0453F, 16.3529F, 0.3252F);
        panelframes.addChild(bone18);
        setRotationAngle(bone18, 0.0F, 3.1416F, 0.0F);


        cube_r80 = new ModelRenderer(this);
        cube_r80.setPos(-0.0129F, 17.9679F, 0.338F);
        bone18.addChild(cube_r80);
        setRotationAngle(cube_r80, 3.1416F, 0.7854F, 3.1416F);
        cube_r80.texOffs(197, 217).addBox(-10.8515F, -7.4715F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setPos(-0.0094F, 18.0F, 0.3416F);
        bone18.addChild(cube_r81);
        setRotationAngle(cube_r81, -2.3562F, 0.0F, 3.1416F);
        cube_r81.texOffs(197, 217).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r81.texOffs(214, 217).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setPos(-0.0308F, 17.9679F, 0.338F);
        bone18.addChild(cube_r82);
        setRotationAngle(cube_r82, 3.1416F, -0.7854F, -3.1416F);
        cube_r82.texOffs(209, 217).addBox(-2.1693F, -7.4715F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setPos(-0.0094F, 17.9929F, 0.3416F);
        bone18.addChild(cube_r83);
        setRotationAngle(cube_r83, 2.3562F, 0.0F, 3.1416F);
        cube_r83.texOffs(197, 231).addBox(-14.9875F, 4.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r83.texOffs(214, 231).addBox(2.0125F, 4.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setPos(-0.0308F, 17.9679F, 0.338F);
        bone18.addChild(cube_r84);
        setRotationAngle(cube_r84, 3.1416F, -0.7854F, -3.1416F);
        cube_r84.texOffs(226, 217).addBox(9.8515F, -7.4715F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r85 = new ModelRenderer(this);
        cube_r85.setPos(-0.0129F, 17.9679F, 0.338F);
        bone18.addChild(cube_r85);
        setRotationAngle(cube_r85, 3.1416F, 0.7854F, 3.1416F);
        cube_r85.texOffs(214, 217).addBox(1.1693F, -7.4715F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setPos(-0.0129F, -0.0321F, 0.338F);
        bone18.addChild(cube_r86);
        setRotationAngle(cube_r86, 3.1416F, 0.7854F, 3.1416F);
        cube_r86.texOffs(142, 228).addBox(-10.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setPos(-0.0094F, 0.0F, 0.3416F);
        bone18.addChild(cube_r87);
        setRotationAngle(cube_r87, -2.3562F, 0.0F, 3.1416F);
        cube_r87.texOffs(142, 228).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r87.texOffs(159, 228).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setPos(-0.0308F, -0.0321F, 0.338F);
        bone18.addChild(cube_r88);
        setRotationAngle(cube_r88, 3.1416F, -0.7854F, -3.1416F);
        cube_r88.texOffs(154, 228).addBox(-2.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setPos(-0.0094F, -0.0071F, 0.3416F);
        bone18.addChild(cube_r89);
        setRotationAngle(cube_r89, 2.3562F, 0.0F, 3.1416F);
        cube_r89.texOffs(142, 242).addBox(-14.9875F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r89.texOffs(159, 242).addBox(2.0125F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setPos(0.0034F, -0.0321F, 0.2407F);
        bone18.addChild(cube_r90);
        setRotationAngle(cube_r90, 3.1416F, -0.7854F, -3.1416F);
        cube_r90.texOffs(171, 228).addBox(9.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setPos(-0.0129F, -0.0321F, 0.338F);
        bone18.addChild(cube_r91);
        setRotationAngle(cube_r91, 3.1416F, 0.7854F, 3.1416F);
        cube_r91.texOffs(159, 228).addBox(1.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r92 = new ModelRenderer(this);
        cube_r92.setPos(-0.0129F, -18.0321F, 0.338F);
        bone18.addChild(cube_r92);
        setRotationAngle(cube_r92, 3.1416F, 0.7854F, 3.1416F);
        cube_r92.texOffs(253, 36).addBox(1.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setPos(-0.0129F, -18.0321F, 0.338F);
        bone18.addChild(cube_r93);
        setRotationAngle(cube_r93, 3.1416F, 0.7854F, 3.1416F);
        cube_r93.texOffs(235, 36).addBox(-10.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setPos(-0.0094F, -18.0F, 0.3416F);
        bone18.addChild(cube_r94);
        setRotationAngle(cube_r94, -2.3562F, 0.0F, 3.1416F);
        cube_r94.texOffs(235, 36).addBox(-14.9875F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r94.texOffs(253, 36).addBox(2.0125F, -5.5546F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setPos(-0.0308F, -18.0321F, 0.338F);
        bone18.addChild(cube_r95);
        setRotationAngle(cube_r95, 3.1416F, -0.7854F, -3.1416F);
        cube_r95.texOffs(248, 36).addBox(-2.1693F, -7.4714F, -1.6718F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setPos(-0.0094F, -18.0071F, 0.3416F);
        bone18.addChild(cube_r96);
        setRotationAngle(cube_r96, 2.3562F, 0.0F, 3.1416F);
        cube_r96.texOffs(236, 50).addBox(-14.9875F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r96.texOffs(253, 50).addBox(2.0125F, 4.5545F, 5.0571F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setPos(-0.0308F, -18.0321F, 0.338F);
        bone18.addChild(cube_r97);
        setRotationAngle(cube_r97, 3.1416F, -0.7854F, -3.1416F);
        cube_r97.texOffs(265, 36).addBox(9.8515F, -7.4714F, 10.349F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(0.1F, 0.0F, 0.1F);
        Shell.addChild(bone4);
        bone4.texOffs(287, 285).addBox(-22.9F, -87.0F, -17.9F, 5.0F, 82.0F, 0.0F, 0.0F, false);
        bone4.texOffs(307, 280).addBox(-17.9F, -87.0F, -22.9F, 0.0F, 82.0F, 5.0F, 0.0F, false);

        bone5 = new ModelRenderer(this);
        bone5.setPos(0.1F, 0.0F, 0.1F);
        Shell.addChild(bone5);
        setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);
        bone5.texOffs(286, 285).addBox(-23.9F, -86.0F, -17.9F, 6.0F, 81.0F, 0.0F, 0.0F, false);
        bone5.texOffs(307, 280).addBox(-17.9F, -87.0F, -22.9F, 0.0F, 82.0F, 5.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setPos(0.1F, 0.0F, 0.1F);
        Shell.addChild(bone6);
        setRotationAngle(bone6, -3.1416F, 0.0F, 3.1416F);
        bone6.texOffs(286, 285).addBox(-23.9F, -86.0F, -17.9F, 6.0F, 81.0F, 0.0F, 0.0F, false);
        bone6.texOffs(306, 279).addBox(-17.9F, -86.0F, -23.9F, 0.0F, 81.0F, 6.0F, 0.0F, false);

        bone7 = new ModelRenderer(this);
        bone7.setPos(0.1F, 0.0F, 0.1F);
        Shell.addChild(bone7);
        setRotationAngle(bone7, 0.0F, 1.5708F, 0.0F);
        bone7.texOffs(287, 285).addBox(-22.8F, -87.0F, -17.8F, 5.0F, 82.0F, 0.0F, 0.0F, false);
        bone7.texOffs(306, 279).addBox(-17.8F, -86.0F, -23.8F, 0.0F, 81.0F, 6.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setPos(0.0F, -43.5556F, 0.0F);
        Shell.addChild(bone);
        bone.texOffs(130, 291).addBox(-22.0F, -36.4444F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        bone.texOffs(1, 115).addBox(-22.3F, 2.5556F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone.texOffs(1, 115).addBox(-22.3F, 2.5556F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone.texOffs(130, 289).addBox(-21.9F, -35.4444F, -2.0F, 1.0F, 74.0F, 4.0F, 0.0F, false);
        bone.texOffs(131, 291).addBox(-22.0F, -36.4444F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        bone.texOffs(275, 86).addBox(-22.0F, 17.5556F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone.texOffs(1, 115).addBox(-22.3F, 20.5556F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone.texOffs(1, 115).addBox(-22.3F, 20.5556F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone.texOffs(275, 86).addBox(-22.0F, 35.5556F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone.texOffs(364, 292).addBox(-22.8F, -36.4444F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        bone.texOffs(364, 292).addBox(-23.0F, -36.4444F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        bone.texOffs(275, 86).addBox(-22.0F, -0.4444F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone.texOffs(1, 115).addBox(-22.3F, -15.4444F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone.texOffs(1, 115).addBox(-22.3F, -15.4444F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone.texOffs(275, 86).addBox(-22.0F, -18.4444F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone.texOffs(275, 86).addBox(-22.0F, -35.3944F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
        bone.texOffs(290, 102).addBox(-22.0F, -36.2944F, -15.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
        bone.texOffs(290, 102).addBox(-22.0F, -36.2944F, 0.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(0.0F, -43.5556F, 0.0F);
        Shell.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 1.5708F, 0.0F);
        bone2.texOffs(130, 291).addBox(-22.0F, -36.4444F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        bone2.texOffs(1, 115).addBox(-22.3F, 2.5556F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone2.texOffs(1, 115).addBox(-22.3F, 2.5556F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone2.texOffs(130, 289).addBox(-21.9F, -35.4444F, -2.0F, 1.0F, 74.0F, 4.0F, 0.0F, false);
        bone2.texOffs(131, 291).addBox(-22.0F, -36.4444F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        bone2.texOffs(275, 86).addBox(-22.0F, 17.5556F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone2.texOffs(1, 115).addBox(-22.3F, 20.5556F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone2.texOffs(1, 115).addBox(-22.3F, 20.5556F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone2.texOffs(275, 86).addBox(-22.0F, 35.5556F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone2.texOffs(364, 292).addBox(-22.8F, -36.4444F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        bone2.texOffs(364, 292).addBox(-23.0F, -36.4444F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        bone2.texOffs(275, 86).addBox(-22.0F, -0.4444F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone2.texOffs(1, 115).addBox(-22.3F, -15.4444F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone2.texOffs(1, 115).addBox(-22.3F, -15.4444F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone2.texOffs(275, 86).addBox(-22.0F, -18.4444F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone2.texOffs(275, 86).addBox(-22.0F, -35.3944F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
        bone2.texOffs(290, 102).addBox(-22.0F, -36.2944F, -15.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
        bone2.texOffs(290, 102).addBox(-22.0F, -36.2944F, 0.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(0.0F, -43.5556F, 0.0F);
        Shell.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 3.1416F, 0.0F);
        bone3.texOffs(130, 291).addBox(-22.0F, -36.4444F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        bone3.texOffs(1, 115).addBox(-22.3F, 2.5556F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone3.texOffs(1, 115).addBox(-22.3F, 2.5556F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone3.texOffs(130, 289).addBox(-21.9F, -35.4444F, -2.0F, 1.0F, 74.0F, 4.0F, 0.0F, false);
        bone3.texOffs(131, 291).addBox(-22.0F, -36.4444F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
        bone3.texOffs(275, 86).addBox(-22.0F, 17.5556F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone3.texOffs(1, 115).addBox(-22.3F, 20.5556F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone3.texOffs(1, 115).addBox(-22.3F, 20.5556F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone3.texOffs(275, 86).addBox(-22.0F, 35.5556F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone3.texOffs(364, 292).addBox(-22.8F, -36.4444F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        bone3.texOffs(364, 292).addBox(-23.0F, -36.4444F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        bone3.texOffs(275, 86).addBox(-22.0F, -0.4444F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone3.texOffs(1, 115).addBox(-22.3F, -15.4444F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone3.texOffs(1, 115).addBox(-22.3F, -15.4444F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
        bone3.texOffs(275, 86).addBox(-22.0F, -18.4444F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
        bone3.texOffs(275, 86).addBox(-22.0F, -35.3944F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
        bone3.texOffs(290, 102).addBox(-22.0F, -36.2944F, -15.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);
        bone3.texOffs(290, 102).addBox(-22.0F, -36.2944F, 0.0F, 1.0F, 1.0F, 15.0F, 0.0F, false);

        bone12 = new ModelRenderer(this);
        bone12.setPos(-26.0F, -4.3F, -49.0F);
        Shell.addChild(bone12);


        bone11 = new ModelRenderer(this);
        bone11.setPos(26.0086F, 0.1418F, 75.1741F);
        bone12.addChild(bone11);
        setRotationAngle(bone11, 0.0F, 1.5708F, 0.0F);


        cube_r98 = new ModelRenderer(this);
        cube_r98.setPos(0.1741F, -0.1347F, -0.0086F);
        bone11.addChild(cube_r98);
        setRotationAngle(cube_r98, 0.0F, 0.0F, 0.7854F);
        cube_r98.texOffs(52, 57).addBox(-0.5F, -0.5F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);
        cube_r98.texOffs(52, 57).addBox(-0.5F, -0.1F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);

        bone19 = new ModelRenderer(this);
        bone19.setPos(-0.0806F, 0.12F, 25.9833F);
        bone11.addChild(bone19);


        cube_r99 = new ModelRenderer(this);
        cube_r99.setPos(0.0F, 0.0F, 0.0F);
        bone19.addChild(cube_r99);
        setRotationAngle(cube_r99, 0.6109F, 0.0F, 0.7854F);
        cube_r99.texOffs(103, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r100 = new ModelRenderer(this);
        cube_r100.setPos(-0.2892F, -0.0078F, 0.2916F);
        bone19.addChild(cube_r100);
        setRotationAngle(cube_r100, 0.0F, 0.0F, 0.7854F);
        cube_r100.texOffs(103, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r101 = new ModelRenderer(this);
        cube_r101.setPos(-0.4959F, 0.0717F, 0.6472F);
        bone19.addChild(cube_r101);
        setRotationAngle(cube_r101, 0.6109F, 0.0F, 0.7854F);
        cube_r101.texOffs(103, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r102 = new ModelRenderer(this);
        cube_r102.setPos(-0.5203F, 0.294F, 0.9037F);
        bone19.addChild(cube_r102);
        setRotationAngle(cube_r102, 0.6109F, 0.0F, 0.7854F);
        cube_r102.texOffs(103, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r103 = new ModelRenderer(this);
        cube_r103.setPos(-0.3441F, 0.1744F, 0.6811F);
        bone19.addChild(cube_r103);
        setRotationAngle(cube_r103, 0.0F, 0.0F, 0.7854F);
        cube_r103.texOffs(103, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r104 = new ModelRenderer(this);
        cube_r104.setPos(-0.2716F, 0.3564F, 0.8543F);
        bone19.addChild(cube_r104);
        setRotationAngle(cube_r104, 0.0F, 0.0F, 0.7854F);
        cube_r104.texOffs(103, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r105 = new ModelRenderer(this);
        cube_r105.setPos(-0.1411F, 0.53F, 0.9352F);
        bone19.addChild(cube_r105);
        setRotationAngle(cube_r105, 0.0F, 0.0F, 0.7854F);
        cube_r105.texOffs(103, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r106 = new ModelRenderer(this);
        cube_r106.setPos(-0.4339F, 0.4905F, 1.0192F);
        bone19.addChild(cube_r106);
        setRotationAngle(cube_r106, 0.6109F, 0.0F, 0.7854F);
        cube_r106.texOffs(103, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone20 = new ModelRenderer(this);
        bone20.setPos(-0.0806F, 0.12F, -27.5815F);
        bone11.addChild(bone20);


        cube_r107 = new ModelRenderer(this);
        cube_r107.setPos(0.0F, 0.0F, 1.581F);
        bone20.addChild(cube_r107);
        setRotationAngle(cube_r107, -0.6109F, 0.0F, 0.7854F);
        cube_r107.texOffs(97, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r108 = new ModelRenderer(this);
        cube_r108.setPos(-0.2892F, -0.0078F, 1.2893F);
        bone20.addChild(cube_r108);
        setRotationAngle(cube_r108, 0.0F, 0.0F, 0.7854F);
        cube_r108.texOffs(97, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r109 = new ModelRenderer(this);
        cube_r109.setPos(-0.4959F, 0.0717F, 0.9337F);
        bone20.addChild(cube_r109);
        setRotationAngle(cube_r109, -0.6109F, 0.0F, 0.7854F);
        cube_r109.texOffs(97, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r110 = new ModelRenderer(this);
        cube_r110.setPos(-0.5203F, 0.294F, 0.6773F);
        bone20.addChild(cube_r110);
        setRotationAngle(cube_r110, -0.6109F, 0.0F, 0.7854F);
        cube_r110.texOffs(97, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r111 = new ModelRenderer(this);
        cube_r111.setPos(-0.3441F, 0.1744F, 0.8999F);
        bone20.addChild(cube_r111);
        setRotationAngle(cube_r111, 0.0F, 0.0F, 0.7854F);
        cube_r111.texOffs(97, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r112 = new ModelRenderer(this);
        cube_r112.setPos(-0.2716F, 0.3564F, 0.7266F);
        bone20.addChild(cube_r112);
        setRotationAngle(cube_r112, 0.0F, 0.0F, 0.7854F);
        cube_r112.texOffs(97, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r113 = new ModelRenderer(this);
        cube_r113.setPos(-0.1411F, 0.53F, 0.6458F);
        bone20.addChild(cube_r113);
        setRotationAngle(cube_r113, 0.0F, 0.0F, 0.7854F);
        cube_r113.texOffs(97, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r114 = new ModelRenderer(this);
        cube_r114.setPos(-0.4339F, 0.4905F, 0.5617F);
        bone20.addChild(cube_r114);
        setRotationAngle(cube_r114, -0.6109F, 0.0F, 0.7854F);
        cube_r114.texOffs(97, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone8 = new ModelRenderer(this);
        bone8.setPos(26.0F, 0.1485F, 75.1414F);
        bone12.addChild(bone8);


        cube_r115 = new ModelRenderer(this);
        cube_r115.setPos(-26.0F, -0.1414F, -26.1414F);
        bone8.addChild(cube_r115);
        setRotationAngle(cube_r115, 0.0F, 0.0F, 0.7854F);
        cube_r115.texOffs(52, 57).addBox(-0.5F, -0.5F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);
        cube_r115.texOffs(52, 57).addBox(-0.5F, -0.1F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);

        bone9 = new ModelRenderer(this);
        bone9.setPos(-0.1133F, 0.1133F, 25.9919F);
        bone8.addChild(bone9);


        cube_r116 = new ModelRenderer(this);
        cube_r116.setPos(-26.1414F, 0.0F, -26.1414F);
        bone9.addChild(cube_r116);
        setRotationAngle(cube_r116, 0.6109F, 0.0F, 0.7854F);
        cube_r116.texOffs(52, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r117 = new ModelRenderer(this);
        cube_r117.setPos(-26.4306F, -0.0078F, -25.8498F);
        bone9.addChild(cube_r117);
        setRotationAngle(cube_r117, 0.0F, 0.0F, 0.7854F);
        cube_r117.texOffs(52, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r118 = new ModelRenderer(this);
        cube_r118.setPos(-26.6373F, 0.0717F, -25.4942F);
        bone9.addChild(cube_r118);
        setRotationAngle(cube_r118, 0.6109F, 0.0F, 0.7854F);
        cube_r118.texOffs(52, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r119 = new ModelRenderer(this);
        cube_r119.setPos(-26.6617F, 0.294F, -25.2377F);
        bone9.addChild(cube_r119);
        setRotationAngle(cube_r119, 0.6109F, 0.0F, 0.7854F);
        cube_r119.texOffs(52, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r120 = new ModelRenderer(this);
        cube_r120.setPos(-26.4855F, 0.1744F, -25.4603F);
        bone9.addChild(cube_r120);
        setRotationAngle(cube_r120, 0.0F, 0.0F, 0.7854F);
        cube_r120.texOffs(52, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r121 = new ModelRenderer(this);
        cube_r121.setPos(-26.413F, 0.3564F, -25.2871F);
        bone9.addChild(cube_r121);
        setRotationAngle(cube_r121, 0.0F, 0.0F, 0.7854F);
        cube_r121.texOffs(52, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r122 = new ModelRenderer(this);
        cube_r122.setPos(-26.2826F, 0.53F, -25.2062F);
        bone9.addChild(cube_r122);
        setRotationAngle(cube_r122, 0.0F, 0.0F, 0.7854F);
        cube_r122.texOffs(52, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r123 = new ModelRenderer(this);
        cube_r123.setPos(-26.5753F, 0.4905F, -25.1222F);
        bone9.addChild(cube_r123);
        setRotationAngle(cube_r123, 0.6109F, 0.0F, 0.7854F);
        cube_r123.texOffs(52, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone10 = new ModelRenderer(this);
        bone10.setPos(-0.1133F, 0.1133F, -27.5729F);
        bone8.addChild(bone10);


        cube_r124 = new ModelRenderer(this);
        cube_r124.setPos(-26.1414F, 0.0F, -24.5605F);
        bone10.addChild(cube_r124);
        setRotationAngle(cube_r124, -0.6109F, 0.0F, 0.7854F);
        cube_r124.texOffs(103, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r125 = new ModelRenderer(this);
        cube_r125.setPos(-26.4306F, -0.0078F, -24.8521F);
        bone10.addChild(cube_r125);
        setRotationAngle(cube_r125, 0.0F, 0.0F, 0.7854F);
        cube_r125.texOffs(103, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r126 = new ModelRenderer(this);
        cube_r126.setPos(-26.6373F, 0.0717F, -25.2077F);
        bone10.addChild(cube_r126);
        setRotationAngle(cube_r126, -0.6109F, 0.0F, 0.7854F);
        cube_r126.texOffs(103, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r127 = new ModelRenderer(this);
        cube_r127.setPos(-26.6617F, 0.294F, -25.4642F);
        bone10.addChild(cube_r127);
        setRotationAngle(cube_r127, -0.6109F, 0.0F, 0.7854F);
        cube_r127.texOffs(103, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r128 = new ModelRenderer(this);
        cube_r128.setPos(-26.4855F, 0.1744F, -25.2415F);
        bone10.addChild(cube_r128);
        setRotationAngle(cube_r128, 0.0F, 0.0F, 0.7854F);
        cube_r128.texOffs(103, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r129 = new ModelRenderer(this);
        cube_r129.setPos(-26.413F, 0.3564F, -25.4148F);
        bone10.addChild(cube_r129);
        setRotationAngle(cube_r129, 0.0F, 0.0F, 0.7854F);
        cube_r129.texOffs(103, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r130 = new ModelRenderer(this);
        cube_r130.setPos(-26.2826F, 0.53F, -25.4957F);
        bone10.addChild(cube_r130);
        setRotationAngle(cube_r130, 0.0F, 0.0F, 0.7854F);
        cube_r130.texOffs(103, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r131 = new ModelRenderer(this);
        cube_r131.setPos(-26.5753F, 0.4905F, -25.5797F);
        bone10.addChild(cube_r131);
        setRotationAngle(cube_r131, -0.6109F, 0.0F, 0.7854F);
        cube_r131.texOffs(103, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone22 = new ModelRenderer(this);
        bone22.setPos(26.0F, 0.1485F, 36.6414F);
        bone12.addChild(bone22);
        setRotationAngle(bone22, 0.0F, -1.5708F, 0.0F);


        cube_r132 = new ModelRenderer(this);
        cube_r132.setPos(-13.6414F, -0.1414F, 0.0F);
        bone22.addChild(cube_r132);
        setRotationAngle(cube_r132, 0.0F, 0.0F, 0.7854F);
        cube_r132.texOffs(52, 57).addBox(-0.5F, -0.5F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);
        cube_r132.texOffs(52, 57).addBox(-0.5F, -0.1F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);

        bone24 = new ModelRenderer(this);
        bone24.setPos(-0.1133F, 0.1133F, 25.9919F);
        bone22.addChild(bone24);


        cube_r133 = new ModelRenderer(this);
        cube_r133.setPos(-13.7828F, 0.0F, 0.0F);
        bone24.addChild(cube_r133);
        setRotationAngle(cube_r133, 0.6109F, 0.0F, 0.7854F);
        cube_r133.texOffs(52, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r134 = new ModelRenderer(this);
        cube_r134.setPos(-14.072F, -0.0078F, 0.2916F);
        bone24.addChild(cube_r134);
        setRotationAngle(cube_r134, 0.0F, 0.0F, 0.7854F);
        cube_r134.texOffs(52, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r135 = new ModelRenderer(this);
        cube_r135.setPos(-14.2788F, 0.0717F, 0.6472F);
        bone24.addChild(cube_r135);
        setRotationAngle(cube_r135, 0.6109F, 0.0F, 0.7854F);
        cube_r135.texOffs(52, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r136 = new ModelRenderer(this);
        cube_r136.setPos(-14.3031F, 0.294F, 0.9037F);
        bone24.addChild(cube_r136);
        setRotationAngle(cube_r136, 0.6109F, 0.0F, 0.7854F);
        cube_r136.texOffs(52, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r137 = new ModelRenderer(this);
        cube_r137.setPos(-14.1269F, 0.1744F, 0.6811F);
        bone24.addChild(cube_r137);
        setRotationAngle(cube_r137, 0.0F, 0.0F, 0.7854F);
        cube_r137.texOffs(52, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r138 = new ModelRenderer(this);
        cube_r138.setPos(-14.0544F, 0.3564F, 0.8543F);
        bone24.addChild(cube_r138);
        setRotationAngle(cube_r138, 0.0F, 0.0F, 0.7854F);
        cube_r138.texOffs(52, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r139 = new ModelRenderer(this);
        cube_r139.setPos(-13.924F, 0.53F, 0.9352F);
        bone24.addChild(cube_r139);
        setRotationAngle(cube_r139, 0.0F, 0.0F, 0.7854F);
        cube_r139.texOffs(52, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r140 = new ModelRenderer(this);
        cube_r140.setPos(-14.2167F, 0.4905F, 1.0192F);
        bone24.addChild(cube_r140);
        setRotationAngle(cube_r140, 0.6109F, 0.0F, 0.7854F);
        cube_r140.texOffs(52, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone25 = new ModelRenderer(this);
        bone25.setPos(-0.1133F, 0.1133F, -27.5729F);
        bone22.addChild(bone25);


        cube_r141 = new ModelRenderer(this);
        cube_r141.setPos(-13.7828F, 0.0F, 1.581F);
        bone25.addChild(cube_r141);
        setRotationAngle(cube_r141, -0.6109F, 0.0F, 0.7854F);
        cube_r141.texOffs(94, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r142 = new ModelRenderer(this);
        cube_r142.setPos(-14.072F, -0.0078F, 1.2893F);
        bone25.addChild(cube_r142);
        setRotationAngle(cube_r142, 0.0F, 0.0F, 0.7854F);
        cube_r142.texOffs(94, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r143 = new ModelRenderer(this);
        cube_r143.setPos(-14.2788F, 0.0717F, 0.9337F);
        bone25.addChild(cube_r143);
        setRotationAngle(cube_r143, -0.6109F, 0.0F, 0.7854F);
        cube_r143.texOffs(94, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r144 = new ModelRenderer(this);
        cube_r144.setPos(-14.3031F, 0.294F, 0.6773F);
        bone25.addChild(cube_r144);
        setRotationAngle(cube_r144, -0.6109F, 0.0F, 0.7854F);
        cube_r144.texOffs(94, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r145 = new ModelRenderer(this);
        cube_r145.setPos(-14.1269F, 0.1744F, 0.8999F);
        bone25.addChild(cube_r145);
        setRotationAngle(cube_r145, 0.0F, 0.0F, 0.7854F);
        cube_r145.texOffs(94, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r146 = new ModelRenderer(this);
        cube_r146.setPos(-14.0544F, 0.3564F, 0.7266F);
        bone25.addChild(cube_r146);
        setRotationAngle(cube_r146, 0.0F, 0.0F, 0.7854F);
        cube_r146.texOffs(94, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r147 = new ModelRenderer(this);
        cube_r147.setPos(-13.924F, 0.53F, 0.6458F);
        bone25.addChild(cube_r147);
        setRotationAngle(cube_r147, 0.0F, 0.0F, 0.7854F);
        cube_r147.texOffs(94, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r148 = new ModelRenderer(this);
        cube_r148.setPos(-14.2167F, 0.4905F, 0.5617F);
        bone25.addChild(cube_r148);
        setRotationAngle(cube_r148, -0.6109F, 0.0F, 0.7854F);
        cube_r148.texOffs(94, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone26 = new ModelRenderer(this);
        bone26.setPos(26.0F, 0.1485F, 36.6414F);
        bone12.addChild(bone26);
        setRotationAngle(bone26, 0.0F, 3.1416F, 0.0F);


        cube_r149 = new ModelRenderer(this);
        cube_r149.setPos(-26.0F, -0.1414F, -12.3586F);
        bone26.addChild(cube_r149);
        setRotationAngle(cube_r149, 0.0F, 0.0F, 0.7854F);
        cube_r149.texOffs(52, 57).addBox(-0.5F, -0.5F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);
        cube_r149.texOffs(52, 57).addBox(-0.5F, -0.1F, -26.0F, 1.0F, 1.0F, 52.0F, 0.0F, false);

        bone27 = new ModelRenderer(this);
        bone27.setPos(-0.1133F, 0.1133F, 25.9919F);
        bone26.addChild(bone27);


        cube_r150 = new ModelRenderer(this);
        cube_r150.setPos(-26.1414F, 0.0F, -12.3586F);
        bone27.addChild(cube_r150);
        setRotationAngle(cube_r150, 0.6109F, 0.0F, 0.7854F);
        cube_r150.texOffs(97, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r151 = new ModelRenderer(this);
        cube_r151.setPos(-26.4306F, -0.0078F, -12.0669F);
        bone27.addChild(cube_r151);
        setRotationAngle(cube_r151, 0.0F, 0.0F, 0.7854F);
        cube_r151.texOffs(97, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r152 = new ModelRenderer(this);
        cube_r152.setPos(-26.6373F, 0.0717F, -11.7113F);
        bone27.addChild(cube_r152);
        setRotationAngle(cube_r152, 0.6109F, 0.0F, 0.7854F);
        cube_r152.texOffs(97, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r153 = new ModelRenderer(this);
        cube_r153.setPos(-26.6617F, 0.294F, -11.4549F);
        bone27.addChild(cube_r153);
        setRotationAngle(cube_r153, 0.6109F, 0.0F, 0.7854F);
        cube_r153.texOffs(97, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r154 = new ModelRenderer(this);
        cube_r154.setPos(-26.4855F, 0.1744F, -11.6775F);
        bone27.addChild(cube_r154);
        setRotationAngle(cube_r154, 0.0F, 0.0F, 0.7854F);
        cube_r154.texOffs(97, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r155 = new ModelRenderer(this);
        cube_r155.setPos(-26.413F, 0.3564F, -11.5043F);
        bone27.addChild(cube_r155);
        setRotationAngle(cube_r155, 0.0F, 0.0F, 0.7854F);
        cube_r155.texOffs(97, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r156 = new ModelRenderer(this);
        cube_r156.setPos(-26.2826F, 0.53F, -11.4234F);
        bone27.addChild(cube_r156);
        setRotationAngle(cube_r156, 0.0F, 0.0F, 0.7854F);
        cube_r156.texOffs(97, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r157 = new ModelRenderer(this);
        cube_r157.setPos(-26.5753F, 0.4905F, -11.3394F);
        bone27.addChild(cube_r157);
        setRotationAngle(cube_r157, 0.6109F, 0.0F, 0.7854F);
        cube_r157.texOffs(97, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone28 = new ModelRenderer(this);
        bone28.setPos(-0.1133F, 0.1133F, -27.5729F);
        bone26.addChild(bone28);


        cube_r158 = new ModelRenderer(this);
        cube_r158.setPos(-26.1414F, 0.0F, -10.7776F);
        bone28.addChild(cube_r158);
        setRotationAngle(cube_r158, -0.6109F, 0.0F, 0.7854F);
        cube_r158.texOffs(103, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r159 = new ModelRenderer(this);
        cube_r159.setPos(-26.4306F, -0.0078F, -11.0693F);
        bone28.addChild(cube_r159);
        setRotationAngle(cube_r159, 0.0F, 0.0F, 0.7854F);
        cube_r159.texOffs(103, 108).addBox(-0.5F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.21F, false);

        cube_r160 = new ModelRenderer(this);
        cube_r160.setPos(-26.6373F, 0.0717F, -11.4249F);
        bone28.addChild(cube_r160);
        setRotationAngle(cube_r160, -0.6109F, 0.0F, 0.7854F);
        cube_r160.texOffs(103, 108).addBox(-0.5F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r161 = new ModelRenderer(this);
        cube_r161.setPos(-26.6617F, 0.294F, -11.6813F);
        bone28.addChild(cube_r161);
        setRotationAngle(cube_r161, -0.6109F, 0.0F, 0.7854F);
        cube_r161.texOffs(103, 108).addBox(-0.75F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.41F, false);

        cube_r162 = new ModelRenderer(this);
        cube_r162.setPos(-26.4855F, 0.1744F, -11.4587F);
        bone28.addChild(cube_r162);
        setRotationAngle(cube_r162, 0.0F, 0.0F, 0.7854F);
        cube_r162.texOffs(103, 108).addBox(-0.75F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.37F, false);

        cube_r163 = new ModelRenderer(this);
        cube_r163.setPos(-26.413F, 0.3564F, -11.6319F);
        bone28.addChild(cube_r163);
        setRotationAngle(cube_r163, 0.0F, 0.0F, 0.7854F);
        cube_r163.texOffs(103, 108).addBox(-1.0F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.44F, false);

        cube_r164 = new ModelRenderer(this);
        cube_r164.setPos(-26.2826F, 0.53F, -11.7128F);
        bone28.addChild(cube_r164);
        setRotationAngle(cube_r164, 0.0F, 0.0F, 0.7854F);
        cube_r164.texOffs(103, 108).addBox(-1.25F, -0.45F, -0.5F, 1.0F, 1.0F, 1.0F, -0.475F, false);

        cube_r165 = new ModelRenderer(this);
        cube_r165.setPos(-26.5753F, 0.4905F, -11.7968F);
        bone28.addChild(cube_r165);
        setRotationAngle(cube_r165, -0.6109F, 0.0F, 0.7854F);
        cube_r165.texOffs(103, 108).addBox(-1.0F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, -0.46F, false);

        bone13 = new ModelRenderer(this);
        bone13.setPos(-26.0F, -4.3F, -49.0F);
        Shell.addChild(bone13);


        bone14 = new ModelRenderer(this);
        bone14.setPos(0.0F, 0.0F, 0.0F);
        bone13.addChild(bone14);


        bone15 = new ModelRenderer(this);
        bone15.setPos(26.0086F, 0.1418F, 22.8741F);
        bone13.addChild(bone15);
        setRotationAngle(bone15, 0.0F, -1.5708F, 0.0F);


        bone16 = new ModelRenderer(this);
        bone16.setPos(52.1586F, 0.1418F, 48.9991F);
        bone13.addChild(bone16);
        setRotationAngle(bone16, -3.1416F, 0.0F, 3.1416F);


        bone17 = new ModelRenderer(this);
        bone17.setPos(26.0086F, 0.1418F, 75.1741F);
        bone13.addChild(bone17);
        setRotationAngle(bone17, 0.0F, 1.5708F, 0.0F);


        Signagetext = new ModelRenderer(this);
        Signagetext.setPos(0.0F, 24.0F, 0.0F);


        cube_r166 = new ModelRenderer(this);
        cube_r166.setPos(0.0F, -1.0F, 0.0F);
        Signagetext.addChild(cube_r166);
        setRotationAngle(cube_r166, 0.0F, -0.7854F, 0.0F);
        cube_r166.texOffs(28, 17).addBox(-2.0F, -103.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

        text_POLICE4 = new ModelRenderer(this);
        text_POLICE4.setPos(0.0F, 0.0F, 0.0F);
        Signagetext.addChild(text_POLICE4);
        setRotationAngle(text_POLICE4, 0.0F, 1.5708F, 0.0F);


        character_p7 = new ModelRenderer(this);
        character_p7.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE4.addChild(character_p7);
        character_p7.texOffs(346, 113).addBox(-12.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_p7.texOffs(346, 113).addBox(-11.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, 0.0F, false);
        character_p7.texOffs(346, 113).addBox(-11.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_p7.texOffs(346, 113).addBox(-11.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);

        text_BOX4 = new ModelRenderer(this);
        text_BOX4.setPos(12.8F, -48.0F, -18.0F);
        character_p7.addChild(text_BOX4);


        character_b7 = new ModelRenderer(this);
        character_b7.setPos(2.58F, -2.4F, 1.2F);
        text_BOX4.addChild(character_b7);
        character_b7.texOffs(346, 113).addBox(-6.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_b7.texOffs(346, 113).addBox(-5.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b7.texOffs(346, 113).addBox(-5.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b7.texOffs(346, 113).addBox(-5.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b7.texOffs(346, 113).addBox(-4.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, 0.0F, false);
        character_b7.texOffs(346, 113).addBox(-4.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);
        character_b7.texOffs(346, 113).addBox(-4.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);

        text_PUBLIC4 = new ModelRenderer(this);
        text_PUBLIC4.setPos(-13.78F, 0.9F, -1.2F);
        character_b7.addChild(text_PUBLIC4);


        character_p8 = new ModelRenderer(this);
        character_p8.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC4.addChild(character_p8);
        character_p8.texOffs(346, 113).addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_p8.texOffs(346, 113).addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, 0.0F, false);
        character_p8.texOffs(346, 113).addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_p8.texOffs(346, 113).addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        text_CALL4 = new ModelRenderer(this);
        text_CALL4.setPos(-7.35F, -61.7F, -24.8F);
        character_p8.addChild(text_CALL4);


        character_c10 = new ModelRenderer(this);
        character_c10.setPos(4.96F, 60.0F, 26.4F);
        text_CALL4.addChild(character_c10);
        character_c10.texOffs(346, 113).addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c10.texOffs(346, 113).addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c10.texOffs(346, 113).addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_a4 = new ModelRenderer(this);
        character_a4.setPos(4.96F, 60.0F, 26.4F);
        text_CALL4.addChild(character_a4);
        character_a4.texOffs(346, 113).addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a4.texOffs(346, 113).addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_a4.texOffs(346, 113).addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a4.texOffs(346, 113).addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        character_l13 = new ModelRenderer(this);
        character_l13.setPos(4.96F, 60.0F, 26.4F);
        text_CALL4.addChild(character_l13);
        character_l13.texOffs(346, 113).addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l13.texOffs(346, 113).addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_l14 = new ModelRenderer(this);
        character_l14.setPos(4.96F, 60.0F, 26.4F);
        text_CALL4.addChild(character_l14);
        character_l14.texOffs(346, 113).addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l14.texOffs(346, 113).addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_u4 = new ModelRenderer(this);
        character_u4.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC4.addChild(character_u4);
        character_u4.texOffs(346, 113).addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u4.texOffs(346, 113).addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u4.texOffs(346, 113).addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, 0.0F, false);

        character_b8 = new ModelRenderer(this);
        character_b8.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC4.addChild(character_b8);
        character_b8.texOffs(346, 113).addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_b8.texOffs(346, 113).addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b8.texOffs(346, 113).addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b8.texOffs(346, 113).addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b8.texOffs(346, 113).addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, 0.0F, false);
        character_b8.texOffs(346, 113).addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);
        character_b8.texOffs(346, 113).addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);

        character_l15 = new ModelRenderer(this);
        character_l15.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC4.addChild(character_l15);
        character_l15.texOffs(346, 113).addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l15.texOffs(346, 113).addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_i7 = new ModelRenderer(this);
        character_i7.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC4.addChild(character_i7);
        character_i7.texOffs(346, 113).addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);

        character_c11 = new ModelRenderer(this);
        character_c11.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC4.addChild(character_c11);
        character_c11.texOffs(346, 113).addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c11.texOffs(346, 113).addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c11.texOffs(346, 113).addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_o7 = new ModelRenderer(this);
        character_o7.setPos(2.58F, -2.4F, 1.2F);
        text_BOX4.addChild(character_o7);
        character_o7.texOffs(346, 113).addBox(-4.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o7.texOffs(346, 113).addBox(-3.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o7.texOffs(346, 113).addBox(-2.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o7.texOffs(346, 113).addBox(-3.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_x4 = new ModelRenderer(this);
        character_x4.setPos(2.58F, -2.4F, 1.2F);
        text_BOX4.addChild(character_x4);
        character_x4.texOffs(346, 113).addBox(-1.54F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x4.texOffs(346, 113).addBox(-1.54F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x4.texOffs(346, 113).addBox(-0.34F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x4.texOffs(346, 113).addBox(-0.34F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x4.texOffs(346, 113).addBox(-1.04F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, 0.0F, false);

        character_o8 = new ModelRenderer(this);
        character_o8.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE4.addChild(character_o8);
        character_o8.texOffs(346, 113).addBox(-10.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o8.texOffs(346, 113).addBox(-9.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o8.texOffs(346, 113).addBox(-8.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o8.texOffs(346, 113).addBox(-9.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_l16 = new ModelRenderer(this);
        character_l16.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE4.addChild(character_l16);
        character_l16.texOffs(346, 113).addBox(-7.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_l16.texOffs(346, 113).addBox(-7.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_i8 = new ModelRenderer(this);
        character_i8.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE4.addChild(character_i8);
        character_i8.texOffs(346, 113).addBox(-5.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);

        character_c12 = new ModelRenderer(this);
        character_c12.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE4.addChild(character_c12);
        character_c12.texOffs(346, 113).addBox(-4.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_c12.texOffs(346, 113).addBox(-4.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_c12.texOffs(346, 113).addBox(-4.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_e4 = new ModelRenderer(this);
        character_e4.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE4.addChild(character_e4);
        character_e4.texOffs(346, 113).addBox(-2.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_e4.texOffs(346, 113).addBox(-1.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_e4.texOffs(346, 113).addBox(-1.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_e4.texOffs(346, 113).addBox(-1.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        text_POLICE3 = new ModelRenderer(this);
        text_POLICE3.setPos(0.0F, 0.0F, 0.0F);
        Signagetext.addChild(text_POLICE3);
        setRotationAngle(text_POLICE3, 0.0F, 3.1416F, 0.0F);


        character_p5 = new ModelRenderer(this);
        character_p5.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE3.addChild(character_p5);
        character_p5.texOffs(346, 113).addBox(-12.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_p5.texOffs(346, 113).addBox(-11.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, 0.0F, false);
        character_p5.texOffs(346, 113).addBox(-11.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_p5.texOffs(346, 113).addBox(-11.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);

        text_BOX3 = new ModelRenderer(this);
        text_BOX3.setPos(12.8F, -48.0F, -18.0F);
        character_p5.addChild(text_BOX3);


        character_b5 = new ModelRenderer(this);
        character_b5.setPos(2.58F, -2.4F, 1.2F);
        text_BOX3.addChild(character_b5);
        character_b5.texOffs(346, 113).addBox(-6.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_b5.texOffs(346, 113).addBox(-5.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b5.texOffs(346, 113).addBox(-5.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b5.texOffs(346, 113).addBox(-5.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b5.texOffs(346, 113).addBox(-4.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, 0.0F, false);
        character_b5.texOffs(346, 113).addBox(-4.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);
        character_b5.texOffs(346, 113).addBox(-4.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);

        text_PUBLIC3 = new ModelRenderer(this);
        text_PUBLIC3.setPos(-13.78F, 0.9F, -1.2F);
        character_b5.addChild(text_PUBLIC3);


        character_p6 = new ModelRenderer(this);
        character_p6.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC3.addChild(character_p6);
        character_p6.texOffs(346, 113).addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_p6.texOffs(346, 113).addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, 0.0F, false);
        character_p6.texOffs(346, 113).addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_p6.texOffs(346, 113).addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        text_CALL3 = new ModelRenderer(this);
        text_CALL3.setPos(-7.35F, -61.7F, -24.8F);
        character_p6.addChild(text_CALL3);


        character_c7 = new ModelRenderer(this);
        character_c7.setPos(4.96F, 60.0F, 26.4F);
        text_CALL3.addChild(character_c7);
        character_c7.texOffs(346, 113).addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c7.texOffs(346, 113).addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c7.texOffs(346, 113).addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_a3 = new ModelRenderer(this);
        character_a3.setPos(4.96F, 60.0F, 26.4F);
        text_CALL3.addChild(character_a3);
        character_a3.texOffs(346, 113).addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a3.texOffs(346, 113).addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_a3.texOffs(346, 113).addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a3.texOffs(346, 113).addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        character_l9 = new ModelRenderer(this);
        character_l9.setPos(4.96F, 60.0F, 26.4F);
        text_CALL3.addChild(character_l9);
        character_l9.texOffs(346, 113).addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l9.texOffs(346, 113).addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_l10 = new ModelRenderer(this);
        character_l10.setPos(4.96F, 60.0F, 26.4F);
        text_CALL3.addChild(character_l10);
        character_l10.texOffs(346, 113).addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l10.texOffs(346, 113).addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_u3 = new ModelRenderer(this);
        character_u3.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC3.addChild(character_u3);
        character_u3.texOffs(346, 113).addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u3.texOffs(346, 113).addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u3.texOffs(346, 113).addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, 0.0F, false);

        character_b6 = new ModelRenderer(this);
        character_b6.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC3.addChild(character_b6);
        character_b6.texOffs(346, 113).addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_b6.texOffs(346, 113).addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b6.texOffs(346, 113).addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b6.texOffs(346, 113).addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b6.texOffs(346, 113).addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, 0.0F, false);
        character_b6.texOffs(346, 113).addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);
        character_b6.texOffs(346, 113).addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);

        character_l11 = new ModelRenderer(this);
        character_l11.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC3.addChild(character_l11);
        character_l11.texOffs(346, 113).addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l11.texOffs(346, 113).addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_i5 = new ModelRenderer(this);
        character_i5.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC3.addChild(character_i5);
        character_i5.texOffs(346, 113).addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);

        character_c8 = new ModelRenderer(this);
        character_c8.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC3.addChild(character_c8);
        character_c8.texOffs(346, 113).addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c8.texOffs(346, 113).addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c8.texOffs(346, 113).addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_o5 = new ModelRenderer(this);
        character_o5.setPos(2.58F, -2.4F, 1.2F);
        text_BOX3.addChild(character_o5);
        character_o5.texOffs(346, 113).addBox(-4.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o5.texOffs(346, 113).addBox(-3.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o5.texOffs(346, 113).addBox(-2.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o5.texOffs(346, 113).addBox(-3.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_x3 = new ModelRenderer(this);
        character_x3.setPos(2.58F, -2.4F, 1.2F);
        text_BOX3.addChild(character_x3);
        character_x3.texOffs(346, 113).addBox(-1.54F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x3.texOffs(346, 113).addBox(-1.54F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x3.texOffs(346, 113).addBox(-0.34F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x3.texOffs(346, 113).addBox(-0.34F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x3.texOffs(346, 113).addBox(-1.04F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, 0.0F, false);

        character_o6 = new ModelRenderer(this);
        character_o6.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE3.addChild(character_o6);
        character_o6.texOffs(346, 113).addBox(-10.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o6.texOffs(346, 113).addBox(-9.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o6.texOffs(346, 113).addBox(-8.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o6.texOffs(346, 113).addBox(-9.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_l12 = new ModelRenderer(this);
        character_l12.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE3.addChild(character_l12);
        character_l12.texOffs(346, 113).addBox(-7.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_l12.texOffs(346, 113).addBox(-7.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_i6 = new ModelRenderer(this);
        character_i6.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE3.addChild(character_i6);
        character_i6.texOffs(346, 113).addBox(-5.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);

        character_c9 = new ModelRenderer(this);
        character_c9.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE3.addChild(character_c9);
        character_c9.texOffs(346, 113).addBox(-4.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_c9.texOffs(346, 113).addBox(-4.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_c9.texOffs(346, 113).addBox(-4.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_e3 = new ModelRenderer(this);
        character_e3.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE3.addChild(character_e3);
        character_e3.texOffs(346, 113).addBox(-2.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_e3.texOffs(346, 113).addBox(-1.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_e3.texOffs(346, 113).addBox(-1.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_e3.texOffs(346, 113).addBox(-1.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        text_POLICE = new ModelRenderer(this);
        text_POLICE.setPos(0.0F, 0.0F, 0.0F);
        Signagetext.addChild(text_POLICE);


        character_p = new ModelRenderer(this);
        character_p.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE.addChild(character_p);
        character_p.texOffs(346, 113).addBox(-12.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_p.texOffs(346, 113).addBox(-11.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, 0.0F, false);
        character_p.texOffs(346, 113).addBox(-11.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_p.texOffs(346, 113).addBox(-11.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);

        text_BOX = new ModelRenderer(this);
        text_BOX.setPos(12.8F, -48.0F, -18.0F);
        character_p.addChild(text_BOX);


        character_b = new ModelRenderer(this);
        character_b.setPos(2.58F, -2.4F, 1.2F);
        text_BOX.addChild(character_b);
        character_b.texOffs(346, 113).addBox(-6.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_b.texOffs(346, 113).addBox(-5.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b.texOffs(346, 113).addBox(-5.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b.texOffs(346, 113).addBox(-5.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b.texOffs(346, 113).addBox(-4.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, 0.0F, false);
        character_b.texOffs(346, 113).addBox(-4.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);
        character_b.texOffs(346, 113).addBox(-4.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);

        text_PUBLIC = new ModelRenderer(this);
        text_PUBLIC.setPos(-13.78F, 0.9F, -1.2F);
        character_b.addChild(text_PUBLIC);


        character_p2 = new ModelRenderer(this);
        character_p2.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC.addChild(character_p2);
        character_p2.texOffs(346, 113).addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_p2.texOffs(346, 113).addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, 0.0F, false);
        character_p2.texOffs(346, 113).addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_p2.texOffs(346, 113).addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        text_CALL = new ModelRenderer(this);
        text_CALL.setPos(-7.35F, -61.7F, -24.8F);
        character_p2.addChild(text_CALL);


        character_c3 = new ModelRenderer(this);
        character_c3.setPos(4.96F, 60.0F, 26.4F);
        text_CALL.addChild(character_c3);
        character_c3.texOffs(346, 113).addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c3.texOffs(346, 113).addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c3.texOffs(346, 113).addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_a = new ModelRenderer(this);
        character_a.setPos(4.96F, 60.0F, 26.4F);
        text_CALL.addChild(character_a);
        character_a.texOffs(346, 113).addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a.texOffs(346, 113).addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_a.texOffs(346, 113).addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a.texOffs(346, 113).addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        character_l3 = new ModelRenderer(this);
        character_l3.setPos(4.96F, 60.0F, 26.4F);
        text_CALL.addChild(character_l3);
        character_l3.texOffs(346, 113).addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l3.texOffs(346, 113).addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_l4 = new ModelRenderer(this);
        character_l4.setPos(4.96F, 60.0F, 26.4F);
        text_CALL.addChild(character_l4);
        character_l4.texOffs(346, 113).addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l4.texOffs(346, 113).addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_u = new ModelRenderer(this);
        character_u.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC.addChild(character_u);
        character_u.texOffs(346, 113).addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u.texOffs(346, 113).addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u.texOffs(346, 113).addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, 0.0F, false);

        character_b2 = new ModelRenderer(this);
        character_b2.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC.addChild(character_b2);
        character_b2.texOffs(346, 113).addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_b2.texOffs(346, 113).addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b2.texOffs(346, 113).addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b2.texOffs(346, 113).addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b2.texOffs(346, 113).addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, 0.0F, false);
        character_b2.texOffs(346, 113).addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);
        character_b2.texOffs(346, 113).addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);

        character_l2 = new ModelRenderer(this);
        character_l2.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC.addChild(character_l2);
        character_l2.texOffs(346, 113).addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l2.texOffs(346, 113).addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_i2 = new ModelRenderer(this);
        character_i2.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC.addChild(character_i2);
        character_i2.texOffs(346, 113).addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);

        character_c2 = new ModelRenderer(this);
        character_c2.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC.addChild(character_c2);
        character_c2.texOffs(346, 113).addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c2.texOffs(346, 113).addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c2.texOffs(346, 113).addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_o2 = new ModelRenderer(this);
        character_o2.setPos(2.58F, -2.4F, 1.2F);
        text_BOX.addChild(character_o2);
        character_o2.texOffs(346, 113).addBox(-4.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o2.texOffs(346, 113).addBox(-3.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o2.texOffs(346, 113).addBox(-2.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o2.texOffs(346, 113).addBox(-3.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_x = new ModelRenderer(this);
        character_x.setPos(2.58F, -2.4F, 1.2F);
        text_BOX.addChild(character_x);
        character_x.texOffs(346, 113).addBox(-1.54F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x.texOffs(346, 113).addBox(-1.54F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x.texOffs(346, 113).addBox(-0.34F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x.texOffs(346, 113).addBox(-0.34F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x.texOffs(346, 113).addBox(-1.04F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, 0.0F, false);

        character_o = new ModelRenderer(this);
        character_o.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE.addChild(character_o);
        character_o.texOffs(346, 113).addBox(-10.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o.texOffs(346, 113).addBox(-9.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o.texOffs(346, 113).addBox(-8.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o.texOffs(346, 113).addBox(-9.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_l = new ModelRenderer(this);
        character_l.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE.addChild(character_l);
        character_l.texOffs(346, 113).addBox(-7.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_l.texOffs(346, 113).addBox(-7.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_i = new ModelRenderer(this);
        character_i.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE.addChild(character_i);
        character_i.texOffs(346, 113).addBox(-5.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);

        character_c = new ModelRenderer(this);
        character_c.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE.addChild(character_c);
        character_c.texOffs(346, 113).addBox(-4.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_c.texOffs(346, 113).addBox(-4.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_c.texOffs(346, 113).addBox(-4.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_e = new ModelRenderer(this);
        character_e.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE.addChild(character_e);
        character_e.texOffs(346, 113).addBox(-2.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_e.texOffs(346, 113).addBox(-1.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_e.texOffs(346, 113).addBox(-1.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_e.texOffs(346, 113).addBox(-1.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        text_POLICE2 = new ModelRenderer(this);
        text_POLICE2.setPos(0.0F, 0.0F, 0.0F);
        Signagetext.addChild(text_POLICE2);
        setRotationAngle(text_POLICE2, 0.0F, -1.5708F, 0.0F);


        character_p3 = new ModelRenderer(this);
        character_p3.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE2.addChild(character_p3);
        character_p3.texOffs(346, 113).addBox(-12.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_p3.texOffs(346, 113).addBox(-11.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, 0.0F, false);
        character_p3.texOffs(346, 113).addBox(-11.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_p3.texOffs(346, 113).addBox(-11.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, 0.0F, false);

        text_BOX2 = new ModelRenderer(this);
        text_BOX2.setPos(12.8F, -48.0F, -18.0F);
        character_p3.addChild(text_BOX2);


        character_b3 = new ModelRenderer(this);
        character_b3.setPos(2.58F, -2.4F, 1.2F);
        text_BOX2.addChild(character_b3);
        character_b3.texOffs(346, 113).addBox(-6.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_b3.texOffs(346, 113).addBox(-5.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b3.texOffs(346, 113).addBox(-5.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b3.texOffs(346, 113).addBox(-5.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, 0.0F, false);
        character_b3.texOffs(346, 113).addBox(-4.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, 0.0F, false);
        character_b3.texOffs(346, 113).addBox(-4.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);
        character_b3.texOffs(346, 113).addBox(-4.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, 0.0F, false);

        text_PUBLIC2 = new ModelRenderer(this);
        text_PUBLIC2.setPos(-13.78F, 0.9F, -1.2F);
        character_b3.addChild(text_PUBLIC2);


        character_p4 = new ModelRenderer(this);
        character_p4.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC2.addChild(character_p4);
        character_p4.texOffs(346, 113).addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_p4.texOffs(346, 113).addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, 0.0F, false);
        character_p4.texOffs(346, 113).addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_p4.texOffs(346, 113).addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        text_CALL2 = new ModelRenderer(this);
        text_CALL2.setPos(-7.35F, -61.7F, -24.8F);
        character_p4.addChild(text_CALL2);


        character_c4 = new ModelRenderer(this);
        character_c4.setPos(4.96F, 60.0F, 26.4F);
        text_CALL2.addChild(character_c4);
        character_c4.texOffs(346, 113).addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c4.texOffs(346, 113).addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c4.texOffs(346, 113).addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_a2 = new ModelRenderer(this);
        character_a2.setPos(4.96F, 60.0F, 26.4F);
        text_CALL2.addChild(character_a2);
        character_a2.texOffs(346, 113).addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a2.texOffs(346, 113).addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_a2.texOffs(346, 113).addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_a2.texOffs(346, 113).addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, 0.0F, false);

        character_l5 = new ModelRenderer(this);
        character_l5.setPos(4.96F, 60.0F, 26.4F);
        text_CALL2.addChild(character_l5);
        character_l5.texOffs(346, 113).addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l5.texOffs(346, 113).addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_l6 = new ModelRenderer(this);
        character_l6.setPos(4.96F, 60.0F, 26.4F);
        text_CALL2.addChild(character_l6);
        character_l6.texOffs(346, 113).addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l6.texOffs(346, 113).addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_u2 = new ModelRenderer(this);
        character_u2.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC2.addChild(character_u2);
        character_u2.texOffs(346, 113).addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u2.texOffs(346, 113).addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_u2.texOffs(346, 113).addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, 0.0F, false);

        character_b4 = new ModelRenderer(this);
        character_b4.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC2.addChild(character_b4);
        character_b4.texOffs(346, 113).addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_b4.texOffs(346, 113).addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b4.texOffs(346, 113).addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b4.texOffs(346, 113).addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, 0.0F, false);
        character_b4.texOffs(346, 113).addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, 0.0F, false);
        character_b4.texOffs(346, 113).addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);
        character_b4.texOffs(346, 113).addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, 0.0F, false);

        character_l7 = new ModelRenderer(this);
        character_l7.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC2.addChild(character_l7);
        character_l7.texOffs(346, 113).addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_l7.texOffs(346, 113).addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_i3 = new ModelRenderer(this);
        character_i3.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC2.addChild(character_i3);
        character_i3.texOffs(346, 113).addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);

        character_c5 = new ModelRenderer(this);
        character_c5.setPos(8.4F, 63.2F, 24.8F);
        text_PUBLIC2.addChild(character_c5);
        character_c5.texOffs(346, 113).addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, 0.0F, false);
        character_c5.texOffs(346, 113).addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);
        character_c5.texOffs(346, 113).addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, 0.0F, false);

        character_o3 = new ModelRenderer(this);
        character_o3.setPos(2.58F, -2.4F, 1.2F);
        text_BOX2.addChild(character_o3);
        character_o3.texOffs(346, 113).addBox(-4.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o3.texOffs(346, 113).addBox(-3.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o3.texOffs(346, 113).addBox(-2.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o3.texOffs(346, 113).addBox(-3.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_x2 = new ModelRenderer(this);
        character_x2.setPos(2.58F, -2.4F, 1.2F);
        text_BOX2.addChild(character_x2);
        character_x2.texOffs(346, 113).addBox(-1.54F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x2.texOffs(346, 113).addBox(-1.54F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x2.texOffs(346, 113).addBox(-0.34F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x2.texOffs(346, 113).addBox(-0.34F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, 0.0F, false);
        character_x2.texOffs(346, 113).addBox(-1.04F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, 0.0F, false);

        character_o4 = new ModelRenderer(this);
        character_o4.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE2.addChild(character_o4);
        character_o4.texOffs(346, 113).addBox(-10.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o4.texOffs(346, 113).addBox(-9.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_o4.texOffs(346, 113).addBox(-8.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_o4.texOffs(346, 113).addBox(-9.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);

        character_l8 = new ModelRenderer(this);
        character_l8.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE2.addChild(character_l8);
        character_l8.texOffs(346, 113).addBox(-7.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_l8.texOffs(346, 113).addBox(-7.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_i4 = new ModelRenderer(this);
        character_i4.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE2.addChild(character_i4);
        character_i4.texOffs(346, 113).addBox(-5.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);

        character_c6 = new ModelRenderer(this);
        character_c6.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE2.addChild(character_c6);
        character_c6.texOffs(346, 113).addBox(-4.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_c6.texOffs(346, 113).addBox(-4.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_c6.texOffs(346, 113).addBox(-4.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        character_e2 = new ModelRenderer(this);
        character_e2.setPos(-2.1F, -34.25F, -9.25F);
        text_POLICE2.addChild(character_e2);
        character_e2.texOffs(346, 113).addBox(-2.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, 0.0F, false);
        character_e2.texOffs(346, 113).addBox(-1.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);
        character_e2.texOffs(346, 113).addBox(-1.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, 0.0F, false);
        character_e2.texOffs(346, 113).addBox(-1.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, 0.0F, false);

        LeftDoor = new ModelRenderer(this);
        LeftDoor.setPos(-17.0028F, -26.4938F, -22.9327F);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, -8.5062F, 1.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, -8.5062F, 2.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, 5.4938F, 6.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(173, 60).addBox(2.0028F, -7.5062F, 6.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, -8.5062F, 6.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(171, 60).addBox(14.0028F, -7.5062F, 6.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, 5.4938F, 5.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(173, 60).addBox(2.0028F, -7.5062F, 5.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, -8.5062F, 5.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(171, 60).addBox(14.0028F, -7.5062F, 5.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(171, 60).addBox(14.0028F, -7.5062F, 4.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, 5.4938F, 4.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(173, 60).addBox(2.0028F, -7.5062F, 4.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, -8.5062F, 4.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, -8.5062F, 3.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(171, 60).addBox(14.0028F, -7.5062F, 1.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(171, 60).addBox(14.0028F, -7.5062F, 3.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(171, 60).addBox(14.0028F, -7.5062F, 2.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(161, 61).addBox(3.0028F, -7.5062F, 7.5327F, 11.0F, 13.0F, 0.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, 5.4938F, 3.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(173, 60).addBox(2.0028F, -7.5062F, 3.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(173, 60).addBox(2.0028F, -7.5062F, 2.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, 5.4938F, 2.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(173, 60).addBox(2.0028F, -7.5062F, 1.5327F, 1.0F, 13.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(157, 59).addBox(2.0028F, 5.4938F, 1.5327F, 13.0F, 1.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(234, 281).addBox(16.0028F, -29.5062F, -1.0673F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(340, 35).addBox(2.0028F, 6.4938F, 0.8327F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(340, 35).addBox(2.0028F, 24.4938F, 0.8327F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(340, 35).addBox(2.0028F, -11.5062F, 0.8327F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(340, 35).addBox(2.0028F, 42.4938F, 0.8327F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(340, 35).addBox(2.0028F, -29.5062F, 0.8327F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(320, 292).addBox(1.0028F, -29.5062F, 0.8327F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(320, 289).addBox(0.0028F, -29.5062F, 0.8327F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(320, 292).addBox(16.0028F, -29.5062F, 0.8327F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(320, 289).addBox(15.0028F, -29.5062F, 0.8327F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 127).addBox(2.0028F, -29.5062F, -0.0673F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 127).addBox(2.0028F, -11.5062F, -0.0673F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 74).addBox(2.0028F, -26.5062F, 0.4327F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 131).addBox(2.0028F, 6.4938F, -0.0673F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 135).addBox(2.0028F, 24.4938F, -0.0673F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 111).addBox(2.0028F, 9.4938F, 0.4327F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 127).addBox(2.0028F, 27.4938F, 0.4327F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(0, 284).addBox(15.0028F, -29.5062F, -0.0673F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(132, 139).addBox(2.0028F, 42.4938F, -0.0673F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        LeftDoor.texOffs(6, 284).addBox(0.0028F, -29.5062F, -0.0673F, 2.0F, 75.0F, 1.0F, 0.0F, false);

        cube_r167 = new ModelRenderer(this);
        cube_r167.setPos(16.5028F, 7.4938F, 1.8327F);
        LeftDoor.addChild(cube_r167);
        setRotationAngle(cube_r167, 3.1416F, 0.0F, 1.5708F);
        cube_r167.texOffs(29, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r168 = new ModelRenderer(this);
        cube_r168.setPos(16.5028F, 8.4938F, 1.8327F);
        LeftDoor.addChild(cube_r168);
        setRotationAngle(cube_r168, 3.1416F, 0.0F, 1.5708F);
        cube_r168.texOffs(29, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r169 = new ModelRenderer(this);
        cube_r169.setPos(16.5028F, 8.4938F, 1.8327F);
        LeftDoor.addChild(cube_r169);
        setRotationAngle(cube_r169, 0.0F, 3.1416F, 0.0F);
        cube_r169.texOffs(29, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r169.texOffs(29, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r170 = new ModelRenderer(this);
        cube_r170.setPos(8.5028F, -11.8597F, 1.4863F);
        LeftDoor.addChild(cube_r170);
        setRotationAngle(cube_r170, -2.3998F, 0.0F, 0.0F);
        cube_r170.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r171 = new ModelRenderer(this);
        cube_r171.setPos(14.6278F, -18.9812F, 1.4827F);
        LeftDoor.addChild(cube_r171);
        setRotationAngle(cube_r171, -3.1416F, 0.7854F, 3.1416F);
        cube_r171.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r172 = new ModelRenderer(this);
        cube_r172.setPos(8.5028F, -26.1597F, 1.4863F);
        LeftDoor.addChild(cube_r172);
        setRotationAngle(cube_r172, -0.7854F, 0.0F, 0.0F);
        cube_r172.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r173 = new ModelRenderer(this);
        cube_r173.setPos(10.3778F, -18.9812F, 1.4827F);
        LeftDoor.addChild(cube_r173);
        setRotationAngle(cube_r173, -3.1416F, 0.7854F, 3.1416F);
        cube_r173.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r174 = new ModelRenderer(this);
        cube_r174.setPos(11.1028F, -18.9812F, 1.4827F);
        LeftDoor.addChild(cube_r174);
        setRotationAngle(cube_r174, 0.0F, 0.7854F, 0.0F);
        cube_r174.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r175 = new ModelRenderer(this);
        cube_r175.setPos(5.8778F, -18.9812F, 1.4827F);
        LeftDoor.addChild(cube_r175);
        setRotationAngle(cube_r175, -3.1416F, 0.7854F, 3.1416F);
        cube_r175.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r176 = new ModelRenderer(this);
        cube_r176.setPos(6.6028F, -18.9812F, 1.4827F);
        LeftDoor.addChild(cube_r176);
        setRotationAngle(cube_r176, 0.0F, 0.7854F, 0.0F);
        cube_r176.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r177 = new ModelRenderer(this);
        cube_r177.setPos(17.0028F, -18.9847F, 1.4863F);
        LeftDoor.addChild(cube_r177);
        setRotationAngle(cube_r177, -2.3562F, 0.0F, 0.0F);
        cube_r177.texOffs(342, 0).addBox(-15.0F, -0.2525F, -0.2475F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r178 = new ModelRenderer(this);
        cube_r178.setPos(17.0028F, -18.9847F, 1.4863F);
        LeftDoor.addChild(cube_r178);
        setRotationAngle(cube_r178, 2.3562F, 0.0F, 0.0F);
        cube_r178.texOffs(342, 0).addBox(-15.0F, -0.7475F, -0.2475F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r179 = new ModelRenderer(this);
        cube_r179.setPos(2.3528F, -18.9812F, 1.4827F);
        LeftDoor.addChild(cube_r179);
        setRotationAngle(cube_r179, 0.0F, 0.7854F, 0.0F);
        cube_r179.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r180 = new ModelRenderer(this);
        cube_r180.setPos(8.5028F, -11.5062F, -0.0673F);
        LeftDoor.addChild(cube_r180);
        setRotationAngle(cube_r180, -0.7854F, 0.0F, 0.0F);
        cube_r180.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r181 = new ModelRenderer(this);
        cube_r181.setPos(8.5028F, -18.9883F, -0.0673F);
        LeftDoor.addChild(cube_r181);
        setRotationAngle(cube_r181, -0.7854F, 0.0F, 0.0F);
        cube_r181.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r182 = new ModelRenderer(this);
        cube_r182.setPos(2.3563F, -19.0062F, 0.2863F);
        LeftDoor.addChild(cube_r182);
        setRotationAngle(cube_r182, 0.0F, -0.7854F, 0.0F);
        cube_r182.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r183 = new ModelRenderer(this);
        cube_r183.setPos(6.6063F, -19.0062F, 0.2863F);
        LeftDoor.addChild(cube_r183);
        setRotationAngle(cube_r183, 0.0F, -0.7854F, 0.0F);
        cube_r183.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r184 = new ModelRenderer(this);
        cube_r184.setPos(14.6492F, -19.0062F, 0.2863F);
        LeftDoor.addChild(cube_r184);
        setRotationAngle(cube_r184, 0.0F, 0.7854F, 0.0F);
        cube_r184.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r185 = new ModelRenderer(this);
        cube_r185.setPos(5.8992F, -19.0062F, 0.2863F);
        LeftDoor.addChild(cube_r185);
        setRotationAngle(cube_r185, 0.0F, 0.7854F, 0.0F);
        cube_r185.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r186 = new ModelRenderer(this);
        cube_r186.setPos(10.3992F, -19.0062F, 0.2863F);
        LeftDoor.addChild(cube_r186);
        setRotationAngle(cube_r186, 0.0F, 0.7854F, 0.0F);
        cube_r186.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r187 = new ModelRenderer(this);
        cube_r187.setPos(11.1063F, -19.0062F, 0.2863F);
        LeftDoor.addChild(cube_r187);
        setRotationAngle(cube_r187, 0.0F, -0.7854F, 0.0F);
        cube_r187.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r188 = new ModelRenderer(this);
        cube_r188.setPos(8.5028F, -26.1526F, 0.2863F);
        LeftDoor.addChild(cube_r188);
        setRotationAngle(cube_r188, 0.7854F, 0.0F, 0.0F);
        cube_r188.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r189 = new ModelRenderer(this);
        cube_r189.setPos(2.066F, -0.9812F, 0.6923F);
        LeftDoor.addChild(cube_r189);
        setRotationAngle(cube_r189, 0.0F, 0.9599F, 0.0F);
        cube_r189.texOffs(-1, 90).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r190 = new ModelRenderer(this);
        cube_r190.setPos(8.5028F, -8.1597F, 0.2863F);
        LeftDoor.addChild(cube_r190);
        setRotationAngle(cube_r190, 0.7854F, 0.0F, 0.0F);
        cube_r190.texOffs(1, 91).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r191 = new ModelRenderer(this);
        cube_r191.setPos(14.6278F, -0.9812F, 0.2827F);
        LeftDoor.addChild(cube_r191);
        setRotationAngle(cube_r191, 0.0F, 0.7854F, 0.0F);
        cube_r191.texOffs(12, 90).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r191.texOffs(12, 111).addBox(-0.5F, 10.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r191.texOffs(12, 127).addBox(-0.5F, 28.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r192 = new ModelRenderer(this);
        cube_r192.setPos(8.5028F, 6.4938F, -0.0673F);
        LeftDoor.addChild(cube_r192);
        setRotationAngle(cube_r192, -0.7854F, 0.0F, 0.0F);
        cube_r192.texOffs(0, 104).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r193 = new ModelRenderer(this);
        cube_r193.setPos(2.3528F, 17.0188F, 0.2827F);
        LeftDoor.addChild(cube_r193);
        setRotationAngle(cube_r193, 0.0F, -0.7854F, 0.0F);
        cube_r193.texOffs(0, 111).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r193.texOffs(0, 127).addBox(-0.5F, 10.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r194 = new ModelRenderer(this);
        cube_r194.setPos(8.5028F, 9.8403F, 0.2863F);
        LeftDoor.addChild(cube_r194);
        setRotationAngle(cube_r194, 0.7854F, 0.0F, 0.0F);
        cube_r194.texOffs(1, 112).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r195 = new ModelRenderer(this);
        cube_r195.setPos(8.5028F, 24.4938F, -0.0673F);
        LeftDoor.addChild(cube_r195);
        setRotationAngle(cube_r195, -0.7854F, 0.0F, 0.0F);
        cube_r195.texOffs(0, 125).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r196 = new ModelRenderer(this);
        cube_r196.setPos(8.5028F, 27.8403F, 0.2863F);
        LeftDoor.addChild(cube_r196);
        setRotationAngle(cube_r196, 0.7854F, 0.0F, 0.0F);
        cube_r196.texOffs(1, 128).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r197 = new ModelRenderer(this);
        cube_r197.setPos(8.5028F, 42.4938F, -0.0673F);
        LeftDoor.addChild(cube_r197);
        setRotationAngle(cube_r197, -0.7854F, 0.0F, 0.0F);
        cube_r197.texOffs(0, 141).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r198 = new ModelRenderer(this);
        cube_r198.setPos(8.5028F, -18.6347F, 0.2863F);
        LeftDoor.addChild(cube_r198);
        setRotationAngle(cube_r198, 0.7854F, 0.0F, 0.0F);
        cube_r198.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        phone = new ModelRenderer(this);
        phone.setPos(18.0028F, 9.4938F, 26.9327F);
        LeftDoor.addChild(phone);
        phone.texOffs(160, 98).addBox(-12.0F, -7.25F, -20.4F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        phone.texOffs(167, 96).addBox(-10.75F, -8.25F, -20.425F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        phone.texOffs(167, 96).addBox(-8.75F, -8.25F, -20.425F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        phone.texOffs(159, 97).addBox(-12.0F, -6.25F, -21.4F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        phone.texOffs(158, 96).addBox(-12.0F, -5.75F, -22.4F, 5.0F, 1.0F, 3.0F, 0.0F, false);
        phone.texOffs(156, 94).addBox(-12.0F, -5.0F, -24.4F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        cube_r199 = new ModelRenderer(this);
        cube_r199.setPos(-9.5F, -6.9629F, -22.5569F);
        phone.addChild(cube_r199);
        setRotationAngle(cube_r199, -0.4363F, 0.0F, -3.1416F);
        cube_r199.texOffs(158, 80).addBox(-4.75F, -2.925F, -5.0F, 9.0F, 0.0F, 9.0F, -2.0F, true);

        cube_r200 = new ModelRenderer(this);
        cube_r200.setPos(-8.5F, -5.3921F, -22.3761F);
        phone.addChild(cube_r200);
        setRotationAngle(cube_r200, 0.4363F, 0.0F, 0.0F);
        cube_r200.texOffs(156, 94).addBox(-3.5F, -0.5F, -2.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);

        phoneitem = new ModelRenderer(this);
        phoneitem.setPos(0.0F, -1.25F, 0.0F);
        phone.addChild(phoneitem);
        phoneitem.texOffs(166, 96).addBox(-12.25F, -7.25F, -20.575F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        phoneitem.texOffs(160, 98).addBox(-11.5F, -7.5F, -20.575F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        phoneitem.texOffs(166, 96).addBox(-7.75F, -7.25F, -20.575F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        phonedoor = new ModelRenderer(this);
        phonedoor.setPos(2.0861F, 6.513F, 0.416F);
        LeftDoor.addChild(phonedoor);
        phonedoor.texOffs(0, 90).addBox(-0.0833F, -15.0192F, 0.0167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(166, 40).addBox(1.9167F, -13.0192F, 0.4167F, 9.0F, 11.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(186, 42).addBox(1.9167F, -11.0192F, 1.4167F, 9.0F, 9.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(186, 42).addBox(1.9167F, -11.0192F, 2.4167F, 9.0F, 9.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(190, 92).addBox(3.9167F, -10.0192F, 3.4167F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(190, 92).addBox(6.9167F, -10.0192F, 3.4167F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(29, 0).addBox(11.9167F, -9.0192F, -0.9833F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(29, 0).addBox(11.9167F, -10.0192F, -0.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        phonedoor.texOffs(29, 0).addBox(11.9167F, -6.0192F, -0.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r201 = new ModelRenderer(this);
        cube_r201.setPos(3.9167F, -11.5192F, 2.4167F);
        phonedoor.addChild(cube_r201);
        setRotationAngle(cube_r201, 0.0F, -0.7854F, 0.0F);
        cube_r201.texOffs(182, 97).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r202 = new ModelRenderer(this);
        cube_r202.setPos(11.9047F, -5.9034F, 2.1667F);
        phonedoor.addChild(cube_r202);
        setRotationAngle(cube_r202, 0.0F, -1.5708F, 1.789F);
        cube_r202.texOffs(192, 93).addBox(-0.5F, 0.075F, -1.775F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        cube_r202.texOffs(192, 93).addBox(-0.5F, -0.25F, -1.775F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        cube_r202.texOffs(192, 93).addBox(-0.5F, -0.5F, -1.775F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        cube_r202.texOffs(192, 93).addBox(-0.5F, -0.55F, -0.425F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r203 = new ModelRenderer(this);
        cube_r203.setPos(11.7667F, -6.7942F, 2.1667F);
        phonedoor.addChild(cube_r203);
        setRotationAngle(cube_r203, 0.0F, -1.5708F, 2.3998F);
        cube_r203.texOffs(192, 93).addBox(-0.5F, -2.05F, -1.85F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        cube_r203.texOffs(192, 93).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r204 = new ModelRenderer(this);
        cube_r204.setPos(11.7917F, -6.7692F, 2.1667F);
        phonedoor.addChild(cube_r204);
        setRotationAngle(cube_r204, 0.0F, -1.5708F, -1.3526F);
        cube_r204.texOffs(191, 92).addBox(-0.525F, 0.05F, 0.225F, 1.0F, 1.0F, 2.0F, -0.3F, false);
        cube_r204.texOffs(191, 92).addBox(-0.525F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, -0.3F, false);

        cube_r205 = new ModelRenderer(this);
        cube_r205.setPos(8.9167F, -11.5192F, 2.4167F);
        phonedoor.addChild(cube_r205);
        setRotationAngle(cube_r205, 0.0F, -0.7854F, 0.0F);
        cube_r205.texOffs(182, 97).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r206 = new ModelRenderer(this);
        cube_r206.setPos(6.4167F, -5.5192F, 3.9167F);
        phonedoor.addChild(cube_r206);
        setRotationAngle(cube_r206, 0.0F, 0.0F, 0.7854F);
        cube_r206.texOffs(190, 96).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

        doorphone = new ModelRenderer(this);
        doorphone.setPos(8.9167F, -11.5192F, 2.4167F);
        phonedoor.addChild(doorphone);


        cube_r207 = new ModelRenderer(this);
        cube_r207.setPos(0.0F, 0.0F, 0.0F);
        doorphone.addChild(cube_r207);
        setRotationAngle(cube_r207, 0.0F, -1.5708F, 0.0F);
        cube_r207.texOffs(182, 97).addBox(-1.25F, 0.5F, -3.875F, 2.0F, 1.0F, 2.0F, -0.15F, false);
        cube_r207.texOffs(182, 97).addBox(-1.25F, 1.0F, -3.875F, 2.0F, 1.0F, 2.0F, -0.25F, false);
        cube_r207.texOffs(190, 92).addBox(-1.25F, 1.5F, -3.875F, 2.0F, 1.0F, 2.0F, -0.25F, false);
        cube_r207.texOffs(190, 92).addBox(-1.25F, 2.0F, -3.875F, 2.0F, 1.0F, 2.0F, -0.25F, false);
        cube_r207.texOffs(190, 92).addBox(-1.25F, 2.5F, -3.875F, 2.0F, 1.0F, 2.0F, -0.25F, false);
        cube_r207.texOffs(190, 92).addBox(-1.25F, 2.875F, -3.875F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        cube_r207.texOffs(190, 92).addBox(-1.25F, 3.25F, -3.875F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        cube_r207.texOffs(190, 92).addBox(-1.25F, 3.5F, -3.875F, 2.0F, 1.0F, 2.0F, -0.3F, false);

        RightDoor = new ModelRenderer(this);
        RightDoor.setPos(17.0296F, -25.5308F, -23.0269F);
        RightDoor.texOffs(29, 6).addBox(-16.0296F, -4.9692F, -0.0231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(29, 6).addBox(-16.0296F, 1.0308F, -0.0231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(29, 6).addBox(-16.0296F, -3.9692F, -0.9731F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 74).addBox(-15.0296F, -27.4692F, 0.5269F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(340, 43).addBox(-15.0296F, 5.5308F, 0.9269F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(340, 35).addBox(-15.0296F, 23.5308F, 0.9269F, 13.0F, 3.0F, 1.0F, 0.0F, true);
        RightDoor.texOffs(340, 35).addBox(-15.0296F, -12.4692F, 0.9269F, 13.0F, 3.0F, 1.0F, 0.0F, true);
        RightDoor.texOffs(340, 35).addBox(-15.0296F, 41.5308F, 0.9269F, 13.0F, 3.0F, 1.0F, 0.0F, true);
        RightDoor.texOffs(340, 35).addBox(-15.0296F, -30.4692F, 0.9269F, 13.0F, 3.0F, 1.0F, 0.0F, true);
        RightDoor.texOffs(290, 289).addBox(-1.0296F, -30.4692F, 0.9269F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(290, 292).addBox(-2.0296F, -30.4692F, 0.9269F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(290, 292).addBox(-17.0296F, -30.4692F, 0.9269F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(290, 289).addBox(-16.0296F, -30.4692F, 0.9269F, 1.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 106).addBox(-15.0296F, -30.4692F, 0.0269F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 106).addBox(-15.0296F, -12.4692F, 0.0269F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 16).addBox(-15.0296F, -9.4692F, 0.5269F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 111).addBox(-15.0296F, 5.5308F, 0.0269F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 32).addBox(-15.0296F, 8.5308F, 0.5269F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 115).addBox(-15.0296F, 23.5308F, 0.0269F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 58).addBox(-15.0296F, 26.5308F, 0.5269F, 13.0F, 15.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(132, 119).addBox(-15.0296F, 41.5308F, 0.0269F, 13.0F, 3.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(222, 281).addBox(-2.0296F, -30.4692F, 0.0269F, 2.0F, 75.0F, 1.0F, 0.0F, false);
        RightDoor.texOffs(0, 284).addBox(-17.0296F, -30.4692F, 0.0269F, 2.0F, 75.0F, 1.0F, 0.0F, false);

        cube_r208 = new ModelRenderer(this);
        cube_r208.setPos(-15.4296F, 7.5308F, 1.9769F);
        RightDoor.addChild(cube_r208);
        setRotationAngle(cube_r208, -3.1416F, 0.0F, 3.1416F);
        cube_r208.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r209 = new ModelRenderer(this);
        cube_r209.setPos(-16.4296F, 6.5308F, 1.9769F);
        RightDoor.addChild(cube_r209);
        setRotationAngle(cube_r209, -3.1416F, 0.0F, 3.1416F);
        cube_r209.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r210 = new ModelRenderer(this);
        cube_r210.setPos(-16.4296F, 7.5308F, 1.9769F);
        RightDoor.addChild(cube_r210);
        setRotationAngle(cube_r210, -3.1416F, 0.0F, 3.1416F);
        cube_r210.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r211 = new ModelRenderer(this);
        cube_r211.setPos(-15.4296F, 6.5308F, 1.9769F);
        RightDoor.addChild(cube_r211);
        setRotationAngle(cube_r211, -3.1416F, 0.0F, 3.1416F);
        cube_r211.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r212 = new ModelRenderer(this);
        cube_r212.setPos(-15.6796F, 7.0308F, 2.2269F);
        RightDoor.addChild(cube_r212);
        setRotationAngle(cube_r212, -3.1416F, 0.0F, 3.1416F);
        cube_r212.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r213 = new ModelRenderer(this);
        cube_r213.setPos(-15.4296F, 6.5308F, 1.9769F);
        RightDoor.addChild(cube_r213);
        setRotationAngle(cube_r213, 3.1416F, 0.0F, -1.5708F);
        cube_r213.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r214 = new ModelRenderer(this);
        cube_r214.setPos(-15.4296F, 7.5308F, 1.9769F);
        RightDoor.addChild(cube_r214);
        setRotationAngle(cube_r214, 3.1416F, 0.0F, -1.5708F);
        cube_r214.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r215 = new ModelRenderer(this);
        cube_r215.setPos(-16.4296F, 7.5308F, 1.9769F);
        RightDoor.addChild(cube_r215);
        setRotationAngle(cube_r215, 3.1416F, 0.0F, -1.5708F);
        cube_r215.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r216 = new ModelRenderer(this);
        cube_r216.setPos(-16.5296F, 7.0308F, 1.7269F);
        RightDoor.addChild(cube_r216);
        setRotationAngle(cube_r216, 3.1416F, 0.0F, -1.5708F);
        cube_r216.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r217 = new ModelRenderer(this);
        cube_r217.setPos(-16.4296F, 6.5308F, 1.9769F);
        RightDoor.addChild(cube_r217);
        setRotationAngle(cube_r217, 3.1416F, 0.0F, -1.5708F);
        cube_r217.texOffs(29, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r218 = new ModelRenderer(this);
        cube_r218.setPos(-8.5296F, 41.5308F, 0.0269F);
        RightDoor.addChild(cube_r218);
        setRotationAngle(cube_r218, -0.7854F, 0.0F, 0.0F);
        cube_r218.texOffs(0, 72).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r219 = new ModelRenderer(this);
        cube_r219.setPos(-14.6796F, 34.0558F, 0.3769F);
        RightDoor.addChild(cube_r219);
        setRotationAngle(cube_r219, 0.0F, -0.7854F, 0.0F);
        cube_r219.texOffs(0, 58).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r219.texOffs(0, 32).addBox(-0.5F, -25.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r219.texOffs(0, 16).addBox(-0.5F, -43.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r220 = new ModelRenderer(this);
        cube_r220.setPos(-2.4046F, 34.0558F, 0.3769F);
        RightDoor.addChild(cube_r220);
        setRotationAngle(cube_r220, 0.0F, 0.7854F, 0.0F);
        cube_r220.texOffs(12, 58).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r220.texOffs(12, 32).addBox(-0.5F, -25.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);
        cube_r220.texOffs(12, 16).addBox(-0.5F, -43.5F, 0.0F, 1.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r221 = new ModelRenderer(this);
        cube_r221.setPos(-8.5296F, 26.8772F, 0.3805F);
        RightDoor.addChild(cube_r221);
        setRotationAngle(cube_r221, 0.7854F, 0.0F, 0.0F);
        cube_r221.texOffs(1, 59).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r222 = new ModelRenderer(this);
        cube_r222.setPos(-8.5296F, 23.5308F, 0.0269F);
        RightDoor.addChild(cube_r222);
        setRotationAngle(cube_r222, -0.7854F, 0.0F, 0.0F);
        cube_r222.texOffs(0, 46).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r223 = new ModelRenderer(this);
        cube_r223.setPos(-8.5296F, 8.8772F, 0.3805F);
        RightDoor.addChild(cube_r223);
        setRotationAngle(cube_r223, 0.7854F, 0.0F, 0.0F);
        cube_r223.texOffs(1, 33).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r224 = new ModelRenderer(this);
        cube_r224.setPos(-8.5296F, 5.5308F, 0.0269F);
        RightDoor.addChild(cube_r224);
        setRotationAngle(cube_r224, -0.7854F, 0.0F, 0.0F);
        cube_r224.texOffs(0, 30).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r225 = new ModelRenderer(this);
        cube_r225.setPos(-8.5296F, -9.1228F, 0.3805F);
        RightDoor.addChild(cube_r225);
        setRotationAngle(cube_r225, 0.7854F, 0.0F, 0.0F);
        cube_r225.texOffs(1, 17).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r226 = new ModelRenderer(this);
        cube_r226.setPos(-14.6796F, -19.9442F, 1.5769F);
        RightDoor.addChild(cube_r226);
        setRotationAngle(cube_r226, 0.0F, 0.7854F, 0.0F);
        cube_r226.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r227 = new ModelRenderer(this);
        cube_r227.setPos(-8.5296F, -27.1228F, 1.5805F);
        RightDoor.addChild(cube_r227);
        setRotationAngle(cube_r227, -0.7854F, 0.0F, 0.0F);
        cube_r227.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r228 = new ModelRenderer(this);
        cube_r228.setPos(-2.4046F, -19.9442F, 1.5769F);
        RightDoor.addChild(cube_r228);
        setRotationAngle(cube_r228, -3.1416F, 0.7854F, 3.1416F);
        cube_r228.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r229 = new ModelRenderer(this);
        cube_r229.setPos(-5.9296F, -19.9442F, 1.5769F);
        RightDoor.addChild(cube_r229);
        setRotationAngle(cube_r229, 0.0F, 0.7854F, 0.0F);
        cube_r229.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r230 = new ModelRenderer(this);
        cube_r230.setPos(-6.6546F, -19.9442F, 1.5769F);
        RightDoor.addChild(cube_r230);
        setRotationAngle(cube_r230, -3.1416F, 0.7854F, 3.1416F);
        cube_r230.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r231 = new ModelRenderer(this);
        cube_r231.setPos(-17.0296F, -19.9478F, 1.5805F);
        RightDoor.addChild(cube_r231);
        setRotationAngle(cube_r231, -2.3562F, 0.0F, 0.0F);
        cube_r231.texOffs(342, 0).addBox(2.0F, -0.2525F, -0.2475F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r232 = new ModelRenderer(this);
        cube_r232.setPos(-17.0296F, -19.9478F, 1.5805F);
        RightDoor.addChild(cube_r232);
        setRotationAngle(cube_r232, 2.3562F, 0.0F, 0.0F);
        cube_r232.texOffs(342, 0).addBox(2.0F, -0.7475F, -0.2475F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r233 = new ModelRenderer(this);
        cube_r233.setPos(-11.1546F, -19.9442F, 1.5769F);
        RightDoor.addChild(cube_r233);
        setRotationAngle(cube_r233, -3.1416F, 0.7854F, 3.1416F);
        cube_r233.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r234 = new ModelRenderer(this);
        cube_r234.setPos(-10.4296F, -19.9442F, 1.5769F);
        RightDoor.addChild(cube_r234);
        setRotationAngle(cube_r234, 0.0F, 0.7854F, 0.0F);
        cube_r234.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r235 = new ModelRenderer(this);
        cube_r235.setPos(-8.5296F, -12.8228F, 1.5805F);
        RightDoor.addChild(cube_r235);
        setRotationAngle(cube_r235, -2.3562F, 0.0F, 0.0F);
        cube_r235.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r236 = new ModelRenderer(this);
        cube_r236.setPos(-8.5296F, -12.4692F, 0.0269F);
        RightDoor.addChild(cube_r236);
        setRotationAngle(cube_r236, -0.7854F, 0.0F, 0.0F);
        cube_r236.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r237 = new ModelRenderer(this);
        cube_r237.setPos(-5.9261F, -19.9692F, 0.3805F);
        RightDoor.addChild(cube_r237);
        setRotationAngle(cube_r237, 0.0F, -0.7854F, 0.0F);
        cube_r237.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r238 = new ModelRenderer(this);
        cube_r238.setPos(-6.6332F, -19.9692F, 0.3805F);
        RightDoor.addChild(cube_r238);
        setRotationAngle(cube_r238, 0.0F, 0.7854F, 0.0F);
        cube_r238.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r239 = new ModelRenderer(this);
        cube_r239.setPos(-11.1332F, -19.9692F, 0.3805F);
        RightDoor.addChild(cube_r239);
        setRotationAngle(cube_r239, 0.0F, 0.7854F, 0.0F);
        cube_r239.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r240 = new ModelRenderer(this);
        cube_r240.setPos(-10.4261F, -19.9692F, 0.3805F);
        RightDoor.addChild(cube_r240);
        setRotationAngle(cube_r240, 0.0F, -0.7854F, 0.0F);
        cube_r240.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r241 = new ModelRenderer(this);
        cube_r241.setPos(-14.6761F, -19.9692F, 0.3805F);
        RightDoor.addChild(cube_r241);
        setRotationAngle(cube_r241, 0.0F, -0.7854F, 0.0F);
        cube_r241.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r242 = new ModelRenderer(this);
        cube_r242.setPos(-8.5296F, -19.9513F, 0.0269F);
        RightDoor.addChild(cube_r242);
        setRotationAngle(cube_r242, -0.7854F, 0.0F, 0.0F);
        cube_r242.texOffs(342, 0).addBox(-6.5F, -1.0F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r243 = new ModelRenderer(this);
        cube_r243.setPos(-8.5296F, -19.5978F, 0.3805F);
        RightDoor.addChild(cube_r243);
        setRotationAngle(cube_r243, 0.7854F, 0.0F, 0.0F);
        cube_r243.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r244 = new ModelRenderer(this);
        cube_r244.setPos(-2.3832F, -19.9692F, 0.3805F);
        RightDoor.addChild(cube_r244);
        setRotationAngle(cube_r244, 0.0F, 0.7854F, 0.0F);
        cube_r244.texOffs(366, 0).addBox(-0.5F, -7.5F, 0.0F, 1.0F, 15.0F, 0.0F, 0.0F, false);

        cube_r245 = new ModelRenderer(this);
        cube_r245.setPos(-8.5296F, -27.1157F, 0.3805F);
        RightDoor.addChild(cube_r245);
        setRotationAngle(cube_r245, 0.7854F, 0.0F, 0.0F);
        cube_r245.texOffs(342, 0).addBox(-6.5F, -0.5F, 0.0F, 13.0F, 1.0F, 0.0F, 0.0F, false);
    }

    @Override
    public void renderBones(ExteriorTile exteriorTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1) {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Signagetext.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}