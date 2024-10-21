package com.code.aseoha.client.models.consoles;// Made with Blockbench 4.10.0-beta.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.Helpers.IHelpWithMonitor;
import com.code.aseoha.tileentities.consoles.CopperConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.consoles.AbstractConsoleEntityModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;

public class CopperConsoleModel extends AbstractConsoleEntityModel<CopperConsoleTile> {
    private final ModelRenderer base;
    private final ModelRenderer side;
    private final ModelRenderer bone;
    private final ModelRenderer bone14;
    private final ModelRenderer bone15;
    private final ModelRenderer bone4;
    private final ModelRenderer bone13;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer throttle;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer fastreturn;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer bone12;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final ModelRenderer bone11;
    private final ModelRenderer side2;
    private final ModelRenderer bone16;
    private final ModelRenderer bone23_r1;
    private final ModelRenderer bone22_r1;
    private final ModelRenderer bone21_r1;
    private final ModelRenderer bone23_r2;
    private final ModelRenderer bone22_r2;
    private final ModelRenderer bone21_r2;
    private final ModelRenderer bone23_r3;
    private final ModelRenderer bone22_r3;
    private final ModelRenderer bone21_r3;
    private final ModelRenderer bone20_r1;
    private final ModelRenderer bone21_r4;
    private final ModelRenderer bone20_r2;
    private final ModelRenderer bone19_r1;
    private final ModelRenderer bone18_r1;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone19;
    private final ModelRenderer bone151;
    private final ModelRenderer yswitch;
    private final ModelRenderer xswitch;
    private final ModelRenderer zswitch;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer bone22;
    private final ModelRenderer bone154;
    private final ModelRenderer bone23;
    private final ModelRenderer doorcontrol;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone26;
    private final ModelRenderer bone27;
    private final ModelRenderer bone28;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer side3;
    private final ModelRenderer bone31;
    private final ModelRenderer bone31_r1;
    private final ModelRenderer telepathic;
    private final ModelRenderer telepathic_r1;
    private final ModelRenderer bone32;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone34_r1;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer verticallanding;
    private final ModelRenderer verticallanding_r1;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone40;
    private final ModelRenderer bone41;
    private final ModelRenderer bone42;
    private final ModelRenderer bone43;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer side4;
    private final ModelRenderer bone46;
    private final ModelRenderer phone;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer randomiser;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone52;
    private final ModelRenderer bone53_r1;
    private final ModelRenderer bone53;
    private final ModelRenderer bone54;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer bone60;
    private final ModelRenderer side5;
    private final ModelRenderer bone61;
    private final ModelRenderer bone62;
    private final ModelRenderer bone63;
    private final ModelRenderer bone64;
    private final ModelRenderer bone64_r1;
    private final ModelRenderer bone64_r2;
    private final ModelRenderer sonicport;
    private final ModelRenderer bluestab;
    private final ModelRenderer bone65;
    private final ModelRenderer bone66;
    private final ModelRenderer bone67;
    private final ModelRenderer bone67_r1;
    private final ModelRenderer incrementincrease;
    private final ModelRenderer bone68;
    private final ModelRenderer bone69;
    private final ModelRenderer handbreak;
    private final ModelRenderer handbreak_r1;
    private final ModelRenderer bone70;
    private final ModelRenderer bone71;
    private final ModelRenderer bone72;
    private final ModelRenderer bone73;
    private final ModelRenderer bone74;
    private final ModelRenderer bone75;
    private final ModelRenderer side6;
    private final ModelRenderer bone76;
    private final ModelRenderer bone82_r1;
    private final ModelRenderer bone78_r1;
    private final ModelRenderer bone80_r1;
    private final ModelRenderer bone79_r1;
    private final ModelRenderer bone80_r2;
    private final ModelRenderer bone79_r2;
    private final ModelRenderer bone82_r2;
    private final ModelRenderer bone81_r1;
    private final ModelRenderer bone79_r3;
    private final ModelRenderer bone81_r2;
    private final ModelRenderer bone80_r3;
    private final ModelRenderer bone79_r4;
    private final ModelRenderer bone147;
    private final ModelRenderer bone147_r1;
    private final ModelRenderer bone147_r2;
    private final ModelRenderer bone147_r3;
    private final ModelRenderer facingcontrol;
    private final ModelRenderer bone77;
    private final ModelRenderer bone78;
    private final ModelRenderer bone79;
    private final ModelRenderer bone149;
    private final ModelRenderer bone80;
    private final ModelRenderer bone81;
    private final ModelRenderer bone82;
    private final ModelRenderer bone83;
    private final ModelRenderer bone84;
    private final ModelRenderer refuel;
    private final ModelRenderer bone85;
    private final ModelRenderer bone86;
    private final ModelRenderer bone87;
    private final ModelRenderer bone88;
    private final ModelRenderer bone89;
    private final ModelRenderer bone90;
    private final ModelRenderer bone95;
    private final ModelRenderer bone94;
    private final ModelRenderer bone93;
    private final ModelRenderer bone92;
    private final ModelRenderer bone91;
    private final ModelRenderer bone92_r1;
    private final ModelRenderer bone91_r1;
    private final ModelRenderer bone96;
    private final ModelRenderer bone97;
    private final ModelRenderer bone98;
    private final ModelRenderer bone99;
    private final ModelRenderer bone100;
    private final ModelRenderer bone101;
    private final ModelRenderer bone102;
    private final ModelRenderer bone103;
    private final ModelRenderer bone104;
    private final ModelRenderer bone105;
    private final ModelRenderer bone106;
    private final ModelRenderer bone107;
    private final ModelRenderer bone108;
    private final ModelRenderer bone109;
    private final ModelRenderer bone110;
    private final ModelRenderer bone111;
    private final ModelRenderer bone112;
    private final ModelRenderer bone113;
    private final ModelRenderer bone114;
    private final ModelRenderer bone115;
    private final ModelRenderer bone116;
    private final ModelRenderer bone117;
    private final ModelRenderer bone118;
    private final ModelRenderer bone119;
    private final ModelRenderer bone120;
    private final ModelRenderer circle;
    private final ModelRenderer bone128;
    private final ModelRenderer bone129;
    private final ModelRenderer bone130;
    private final ModelRenderer bone131;
    private final ModelRenderer circle2;
    private final ModelRenderer bone132;
    private final ModelRenderer bone133;
    private final ModelRenderer bone134;
    private final ModelRenderer bone135;
    private final ModelRenderer circle3;
    private final ModelRenderer bone136;
    private final ModelRenderer bone137;
    private final ModelRenderer bone138;
    private final ModelRenderer bone139;
    private final ModelRenderer circle4;
    private final ModelRenderer bone142;
    private final ModelRenderer bone143;
    private final ModelRenderer bone144;
    private final ModelRenderer bone145;
    private final ModelRenderer rotar3;
    private final ModelRenderer bone121;
    private final ModelRenderer bone122;
    private final ModelRenderer bone123;
    private final ModelRenderer rotar2;
    private final ModelRenderer bone124;
    private final ModelRenderer bone125;
    private final ModelRenderer bone126;
    private final ModelRenderer bone127;
    private final ModelRenderer bone141;
    private final ModelRenderer bone140;
    private final ModelRenderer monitor;
    private final ModelRenderer bone140_r1;
    private final ModelRenderer hammer;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer rotor;
    private final ModelRenderer rotortop;
    private final ModelRenderer rotorbottom;

    public CopperConsoleModel() {
        texWidth = 256;
        texHeight = 256;

        base = new ModelRenderer(this);
        base.setPos(1.35F, 23.0F, 1.5F);
        base.texOffs(232, 250).addBox(-4.5F, -26.0F, -5.8F, 7.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(236, 253).addBox(-4.5F, -38.0F, -5.2F, 7.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(236, 253).addBox(-5.5F, -48.0F, -5.2F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(236, 253).addBox(-5.4F, -53.7F, -5.2F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(232, 253).addBox(-6.7F, -75.1F, -5.2F, 11.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(232, 253).addBox(-6.6F, -75.1F, 1.8244F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(236, 248).addBox(-5.1F, -53.7F, 1.8244F, 8.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(236, 248).addBox(-5.5F, -48.0F, 1.5244F, 9.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(240, 253).addBox(-4.5F, -38.0F, 1.5244F, 7.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(240, 253).addBox(-4.5F, -26.0F, 1.8244F, 7.0F, 2.0F, 1.0F, 0.0F, false);
        base.texOffs(239, 2).addBox(-4.5F, -49.0F, 2.5F, 7.0F, 32.0F, 0.0F, 0.0F, false);
        base.texOffs(237, 2).addBox(-5.3F, -79.0F, 2.5F, 8.0F, 31.0F, 0.0F, 0.0F, false);
        base.texOffs(237, 2).addBox(-5.4F, -79.0F, -4.6F, 8.0F, 31.0F, 0.0F, 0.0F, false);
        base.texOffs(237, 2).addBox(-5.0F, -49.0F, -4.6F, 8.0F, 32.0F, 0.0F, 0.0F, false);

        side = new ModelRenderer(this);
        side.setPos(0.0F, 3.0F, -8.0F);
        base.addChild(side);


        bone = new ModelRenderer(this);
        bone.setPos(0.0F, 0.0F, 0.0F);
        side.addChild(bone);
        bone.texOffs(45, 82).addBox(-7.0F, -15.15F, -11.45F, 12.0F, 3.0F, 1.0F, 0.2F, false);
        bone.texOffs(62, 47).addBox(-3.0F, -14.25F, -11.75F, 4.0F, 1.0F, 1.0F, 0.2F, false);
        bone.texOffs(95, 104).addBox(-4.0F, -23.1F, -2.7F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        bone.texOffs(30, 14).addBox(-4.0F, -20.1F, -0.7F, 6.0F, 1.0F, 13.0F, 0.0F, false);
        bone.texOffs(30, 14).addBox(-4.0F, -6.1F, -0.7F, 6.0F, 1.0F, 13.0F, 0.0F, false);
        bone.texOffs(0, 131).addBox(-0.6F, -22.3F, -2.9F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone.texOffs(118, 124).addBox(-2.1F, -22.3F, -3.2F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        bone.texOffs(108, 124).addBox(-3.1F, -23.3F, -3.2F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        bone.texOffs(130, 78).addBox(-2.0F, -25.4F, -2.7F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone.texOffs(1, 138).addBox(-2.9739F, -25.5191F, -2.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone.texOffs(11, 104).addBox(-2.0261F, -25.5191F, -2.7F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        bone.texOffs(14, 131).addBox(-9.0F, -15.65F, -11.75F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone.texOffs(127, 25).addBox(-10.7F, -15.65F, -10.45F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        bone.texOffs(112, 130).addBox(5.0F, -15.65F, -11.75F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone.texOffs(127, 19).addBox(5.4F, -15.65F, -10.05F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        bone14 = new ModelRenderer(this);
        bone14.setPos(-4.0F, -23.1F, -2.7F);
        bone.addChild(bone14);
        setRotationAngle(bone14, 0.0F, 0.0F, 0.3491F);
        bone14.texOffs(130, 78).addBox(0.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone15 = new ModelRenderer(this);
        bone15.setPos(2.0F, -23.1F, -2.7F);
        bone.addChild(bone15);
        setRotationAngle(bone15, 0.0F, 0.0F, -0.3491F);
        bone15.texOffs(130, 78).addBox(-2.0F, -3.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(-1.1F, -20.4268F, -2.6F);
        bone.addChild(bone4);
        setRotationAngle(bone4, 0.5236F, 0.0F, 0.0F);
        bone4.texOffs(78, 55).addBox(-2.4F, 0.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(128, 12).addBox(-2.4F, -0.45F, -0.625F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(70, 81).addBox(-2.9F, 0.0F, -2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(38, 78).addBox(-4.9F, 0.0F, -5.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        bone4.texOffs(10, 67).addBox(-3.9F, 14.5F, -11.6F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        bone4.texOffs(78, 29).addBox(-5.9F, 0.0F, -7.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        bone4.texOffs(124, 19).addBox(-2.9F, -0.2F, -8.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(124, 70).addBox(1.8F, -0.4F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(124, 70).addBox(1.8F, -0.9F, -7.9F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        bone4.texOffs(124, 70).addBox(0.6F, -0.4F, -8.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(124, 70).addBox(0.6F, -0.9F, -8.8F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        bone4.texOffs(124, 70).addBox(3.1F, -0.4F, -8.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone4.texOffs(124, 70).addBox(3.1F, -0.9F, -8.8F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        bone4.texOffs(124, 19).addBox(-2.9F, -0.5F, -8.3F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(124, 19).addBox(-4.9F, -0.4F, -8.3F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(128, 14).addBox(-1.5F, -0.7F, -2.3F, 2.0F, 1.0F, 1.0F, -0.35F, false);
        bone4.texOffs(128, 14).addBox(-3.0F, -0.7F, -3.3F, 2.0F, 1.0F, 1.0F, -0.35F, false);
        bone4.texOffs(128, 14).addBox(-2.3F, -0.7F, -4.9F, 2.0F, 1.0F, 1.0F, -0.35F, false);
        bone4.texOffs(128, 14).addBox(0.9F, -0.7F, -3.3F, 2.0F, 1.0F, 1.0F, -0.35F, false);
        bone4.texOffs(128, 14).addBox(0.2F, -0.7F, -4.9F, 2.0F, 1.0F, 1.0F, -0.35F, false);
        bone4.texOffs(88, 123).addBox(-0.5F, -0.5F, -2.3F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(98, 123).addBox(-0.5F, -0.3F, -2.3F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        bone4.texOffs(98, 123).addBox(-2.0F, -0.3F, -3.3F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        bone4.texOffs(98, 123).addBox(-1.3F, -0.3F, -4.9F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        bone4.texOffs(98, 123).addBox(0.9F, -0.3F, -3.3F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        bone4.texOffs(98, 123).addBox(0.2F, -0.3F, -4.9F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        bone4.texOffs(88, 123).addBox(-2.0F, -0.5F, -3.3F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(88, 123).addBox(-1.3F, -0.5F, -4.9F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(88, 123).addBox(0.9F, -0.5F, -3.3F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(88, 123).addBox(0.2F, -0.5F, -4.9F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        bone4.texOffs(63, 4).addBox(-5.9F, 0.0F, -10.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone13 = new ModelRenderer(this);
        bone13.setPos(-1.1F, -12.1499F, -0.5857F);
        bone.addChild(bone13);
        setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
        bone13.texOffs(30, 14).addBox(-2.4F, 0.0F, -1.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);
        bone13.texOffs(50, 101).addBox(-2.9F, 0.0F, -2.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone13.texOffs(19, 88).addBox(-4.4F, 0.0F, -5.0F, 9.0F, 1.0F, 3.0F, 0.0F, false);
        bone13.texOffs(0, 76).addBox(-5.9F, 0.0F, -8.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone13.texOffs(54, 74).addBox(-5.9F, 0.0F, -10.0F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(5.0F, -15.5F, -11.5F);
        side.addChild(bone2);
        setRotationAngle(bone2, -1.0472F, 0.0F, 0.0F);
        bone2.texOffs(136, 103).addBox(0.0F, -1.8585F, -0.2549F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(2.0F, -2.0F, 0.0F);
        bone2.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -0.4363F);
        bone3.texOffs(122, 112).addBox(-2.0598F, -9.8718F, -0.2549F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone3.texOffs(130, 111).addBox(-2.0598F, -6.8718F, -1.9549F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone3.texOffs(59, 119).addBox(-2.0598F, -6.3718F, -2.9549F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        bone3.texOffs(59, 119).addBox(-2.0598F, -5.3718F, -3.3549F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        bone3.texOffs(136, 31).addBox(-2.0598F, -6.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-2.0598F, -5.3718F, -3.8549F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-2.0598F, -4.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-2.0598F, -3.6718F, -2.7049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-2.0598F, -7.0718F, -2.7049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-1.0598F, -6.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-1.0598F, -5.3718F, -3.8549F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-1.0598F, -4.3718F, -3.6049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-1.0598F, -3.6718F, -2.7049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(136, 31).addBox(-1.0598F, -7.0718F, -2.7049F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        bone3.texOffs(59, 115).addBox(-2.3598F, -5.8718F, -2.7549F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        bone3.texOffs(59, 115).addBox(-0.7598F, -5.8718F, -2.7549F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        throttle = new ModelRenderer(this);
        throttle.setPos(-2.6F, -4.9F, -1.8F);
        bone3.addChild(throttle);
        setRotationAngle(throttle, -0.9599F, 0.0F, 0.0F);
        throttle.texOffs(59, 123).addBox(-0.4848F, -0.4718F, -3.4549F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        throttle.texOffs(51, 127).addBox(-0.4848F, -0.4718F, -3.4549F, 1.0F, 1.0F, 4.0F, -0.25F, false);
        throttle.texOffs(123, 39).addBox(-0.4848F, -0.4718F, -0.4549F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        throttle.texOffs(59, 123).addBox(1.5152F, -0.4718F, -3.4549F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        throttle.texOffs(51, 127).addBox(2.5152F, -0.4718F, -3.4549F, 1.0F, 1.0F, 4.0F, -0.25F, false);
        throttle.texOffs(123, 39).addBox(2.5152F, -0.4718F, -0.4549F, 1.0F, 1.0F, 1.0F, -0.15F, false);

        bone5 = new ModelRenderer(this);
        bone5.setPos(-9.0F, -15.5F, -11.5F);
        side.addChild(bone5);
        setRotationAngle(bone5, -1.0472F, 0.0F, 0.0F);
        bone5.texOffs(103, 136).addBox(0.0F, -1.8585F, -0.2549F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone6 = new ModelRenderer(this);
        bone6.setPos(0.0F, -2.0F, 0.0F);
        bone5.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, 0.4363F);
        bone6.texOffs(122, 100).addBox(0.0598F, -9.8718F, -0.2549F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone6.texOffs(8, 0).addBox(0.1598F, -6.5718F, -1.7549F, 1.0F, 4.0F, 2.0F, -0.25F, false);
        bone6.texOffs(95, 136).addBox(0.0598F, -2.2718F, -1.4549F, 2.0F, 2.0F, 2.0F, -0.45F, false);
        bone6.texOffs(95, 136).addBox(0.0598F, -8.8718F, -1.4549F, 2.0F, 2.0F, 2.0F, -0.45F, false);
        bone6.texOffs(95, 136).addBox(0.0598F, -2.2718F, -2.1549F, 2.0F, 2.0F, 2.0F, -0.7F, false);
        bone6.texOffs(95, 136).addBox(0.0598F, -8.8718F, -2.1549F, 2.0F, 2.0F, 2.0F, -0.7F, false);
        bone6.texOffs(47, 92).addBox(0.5598F, -6.0718F, -1.5549F, 1.0F, 3.0F, 2.0F, -0.25F, false);
        bone6.texOffs(121, 84).addBox(-0.9402F, -7.0718F, -0.6549F, 2.0F, 1.0F, 1.0F, -0.2F, false);
        bone6.texOffs(47, 92).addBox(-0.1402F, -6.0718F, -1.5549F, 1.0F, 3.0F, 2.0F, -0.25F, false);

        fastreturn = new ModelRenderer(this);
        fastreturn.setPos(1.3F, -4.5F, -0.9F);
        bone6.addChild(fastreturn);
        setRotationAngle(fastreturn, 0.0F, 0.0F, 0.4363F);
        fastreturn.texOffs(88, 34).addBox(-1.2402F, -0.5718F, -0.2549F, 3.0F, 1.0F, 1.0F, -0.25F, false);
        fastreturn.texOffs(32, 101).addBox(1.2598F, -0.5718F, -0.2549F, 1.0F, 1.0F, 1.0F, -0.15F, false);

        bone7 = new ModelRenderer(this);
        bone7.setPos(5.0F, -15.5F, -11.5F);
        side.addChild(bone7);
        setRotationAngle(bone7, -1.6581F, 0.0F, 0.0F);
        bone7.texOffs(74, 136).addBox(0.0F, -2.0865F, 1.8571F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone8 = new ModelRenderer(this);
        bone8.setPos(2.0F, -2.0F, 0.0F);
        bone7.addChild(bone8);
        setRotationAngle(bone8, 0.0F, 0.0F, -0.4363F);
        bone8.texOffs(114, 111).addBox(-1.9634F, -11.0784F, 1.8571F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone8.texOffs(97, 38).addBox(-1.9634F, -11.0784F, 3.8571F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone12 = new ModelRenderer(this);
        bone12.setPos(2.0F, -2.0F, 0.0F);
        bone7.addChild(bone12);
        setRotationAngle(bone12, 0.4363F, 0.0F, -0.4363F);
        bone12.texOffs(126, 70).addBox(-1.9634F, -5.452F, 12.5218F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        bone9 = new ModelRenderer(this);
        bone9.setPos(-9.0F, -15.5F, -11.5F);
        side.addChild(bone9);
        setRotationAngle(bone9, -1.6581F, 0.0F, 0.0F);
        bone9.texOffs(66, 136).addBox(0.0F, -2.0865F, 1.8571F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone10 = new ModelRenderer(this);
        bone10.setPos(0.0F, -2.0F, 0.0F);
        bone9.addChild(bone10);
        setRotationAngle(bone10, 0.0F, 0.0F, 0.4363F);
        bone10.texOffs(74, 114).addBox(-0.0366F, -11.0784F, 1.8571F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone10.texOffs(96, 81).addBox(-0.0366F, -11.0784F, 3.8571F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone11 = new ModelRenderer(this);
        bone11.setPos(1.9634F, -11.0784F, 10.8321F);
        bone10.addChild(bone11);
        setRotationAngle(bone11, -1.1345F, 0.0F, 0.0F);
        bone11.texOffs(79, 102).addBox(-2.0F, -0.0235F, 0.0086F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        side2 = new ModelRenderer(this);
        side2.setPos(-20.0F, 3.0F, -8.0F);
        base.addChild(side2);
        setRotationAngle(side2, 0.0F, 1.0472F, 0.0F);


        bone16 = new ModelRenderer(this);
        bone16.setPos(0.0F, 0.0F, 0.0F);
        side2.addChild(bone16);
        bone16.texOffs(81, 65).addBox(-2.1902F, -15.15F, 1.7192F, 12.0F, 3.0F, 1.0F, 0.2F, false);
        bone16.texOffs(95, 104).addBox(0.8098F, -23.1F, 10.4692F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        bone16.texOffs(94, 34).addBox(-1.1902F, -20.1F, 12.4692F, 10.0F, 1.0F, 2.0F, 0.0F, false);
        bone16.texOffs(79, 62).addBox(-1.1902F, -6.1F, 12.4692F, 10.0F, 1.0F, 2.0F, 0.0F, false);
        bone16.texOffs(123, 0).addBox(1.6098F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone16.texOffs(121, 37).addBox(1.3098F, -24.2F, 10.0692F, 2.0F, 1.0F, 1.0F, -0.1F, false);
        bone16.texOffs(123, 0).addBox(5.3098F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone16.texOffs(122, 2).addBox(4.7098F, -23.5F, 10.1692F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone16.texOffs(122, 2).addBox(4.7098F, -25.7F, 10.1692F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone16.texOffs(52, 62).addBox(4.7098F, -25.6F, 10.0692F, 1.0F, 3.0F, 0.0F, 0.1F, false);
        bone16.texOffs(30, 39).addBox(1.8098F, -24.7F, 10.4692F, 1.0F, 2.0F, 0.0F, 0.1F, false);
        bone16.texOffs(30, 39).addBox(3.2098F, -24.7F, 13.6692F, 1.0F, 2.0F, 0.0F, 0.1F, false);
        bone16.texOffs(30, 39).addBox(1.8098F, -24.7F, 10.4692F, 1.0F, 2.0F, 0.0F, 0.1F, false);
        bone16.texOffs(14, 1).addBox(5.8098F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, -0.1F, false);
        bone16.texOffs(14, 1).addBox(4.5598F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, -0.1F, false);
        bone16.texOffs(123, 0).addBox(4.0598F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone16.texOffs(14, 1).addBox(2.1098F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, -0.1F, false);
        bone16.texOffs(123, 0).addBox(2.8598F, -22.3F, 10.1692F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone16.texOffs(14, 1).addBox(3.3598F, -22.25F, 9.8692F, 0.0F, 1.0F, 1.0F, -0.1F, false);
        bone16.texOffs(130, 78).addBox(2.8098F, -25.7F, 10.4692F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone16.texOffs(11, 104).addBox(1.8358F, -25.9191F, 10.4692F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone16.texOffs(11, 104).addBox(3.7837F, -25.9191F, 10.4692F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone16.texOffs(130, 105).addBox(-4.1902F, -15.65F, 1.4192F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone16.texOffs(119, 137).addBox(-4.1902F, -15.65F, 0.8192F, 2.0F, 2.0F, 1.0F, -0.1F, false);
        bone16.texOffs(68, 107).addBox(-4.0902F, -15.55F, 0.3192F, 1.0F, 3.0F, 1.0F, -0.3F, false);
        bone16.texOffs(121, 59).addBox(-3.6902F, -13.55F, 0.3192F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone16.texOffs(114, 88).addBox(-4.6902F, -15.55F, 0.3192F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone16.texOffs(107, 65).addBox(-3.2902F, -15.55F, 0.3192F, 1.0F, 4.0F, 1.0F, -0.3F, false);
        bone16.texOffs(82, 137).addBox(-3.2902F, -12.55F, -1.0808F, 1.0F, 1.0F, 2.0F, -0.3F, false);
        bone16.texOffs(32, 126).addBox(-5.9902F, -15.65F, 2.7656F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        bone16.texOffs(104, 130).addBox(9.8098F, -15.65F, 1.4192F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone16.texOffs(126, 0).addBox(10.7F, -15.65F, 2.829F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        bone23_r1 = new ModelRenderer(this);
        bone23_r1.setPos(2.3875F, -28.8495F, 10.9577F);
        bone16.addChild(bone23_r1);
        setRotationAngle(bone23_r1, 2.4199F, -0.7009F, -1.2691F);
        bone23_r1.texOffs(172, 115).addBox(-0.9F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        bone22_r1 = new ModelRenderer(this);
        bone22_r1.setPos(2.3875F, -28.8495F, 10.9577F);
        bone16.addChild(bone22_r1);
        setRotationAngle(bone22_r1, 2.1337F, -0.931F, -0.881F);
        bone22_r1.texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        bone21_r1 = new ModelRenderer(this);
        bone21_r1.setPos(2.3875F, -28.8495F, 10.9577F);
        bone16.addChild(bone21_r1);
        setRotationAngle(bone21_r1, 1.6202F, -1.0408F, -0.2718F);
        bone21_r1.texOffs(170, 113).addBox(-1.9F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        bone23_r2 = new ModelRenderer(this);
        bone23_r2.setPos(6.2927F, -28.5534F, 11.7712F);
        bone16.addChild(bone23_r2);
        setRotationAngle(bone23_r2, 1.4495F, 0.6462F, 0.293F);
        bone23_r2.texOffs(172, 113).addBox(0.9F, -0.5F, -2.1F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        bone22_r2 = new ModelRenderer(this);
        bone22_r2.setPos(6.2927F, -28.5534F, 11.7712F);
        bone16.addChild(bone22_r2);
        setRotationAngle(bone22_r2, 1.7151F, 0.6421F, 0.7308F);
        bone22_r2.texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        bone21_r2 = new ModelRenderer(this);
        bone21_r2.setPos(6.2927F, -28.5534F, 11.7712F);
        bone16.addChild(bone21_r2);
        setRotationAngle(bone21_r2, 1.947F, 0.5508F, 1.1392F);
        bone21_r2.texOffs(172, 115).addBox(-2.1F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        bone23_r3 = new ModelRenderer(this);
        bone23_r3.setPos(4.3401F, -26.822F, 10.6804F);
        bone16.addChild(bone23_r3);
        setRotationAngle(bone23_r3, 0.4275F, 0.1932F, 0.2556F);
        bone23_r3.texOffs(172, 115).addBox(-2.2F, -0.5F, -1.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        bone22_r3 = new ModelRenderer(this);
        bone22_r3.setPos(4.3401F, -26.822F, 10.6804F);
        bone16.addChild(bone22_r3);
        setRotationAngle(bone22_r3, 0.4842F, 0.5074F, 0.4186F);
        bone22_r3.texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        bone21_r3 = new ModelRenderer(this);
        bone21_r3.setPos(4.3401F, -26.822F, 10.6804F);
        bone16.addChild(bone21_r3);
        setRotationAngle(bone21_r3, 0.6277F, 0.8055F, 0.6505F);
        bone21_r3.texOffs(172, 113).addBox(0.9F, -0.5F, -0.8F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        bone20_r1 = new ModelRenderer(this);
        bone20_r1.setPos(4.1072F, -28.2336F, 12.3993F);
        bone16.addChild(bone20_r1);
        setRotationAngle(bone20_r1, 1.2139F, -0.2048F, 0.0757F);
        bone20_r1.texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        bone21_r4 = new ModelRenderer(this);
        bone21_r4.setPos(4.3401F, -30.5808F, 12.0485F);
        bone16.addChild(bone21_r4);
        setRotationAngle(bone21_r4, 1.731F, -0.4462F, 0.8694F);
        bone21_r4.texOffs(170, 113).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

        bone20_r2 = new ModelRenderer(this);
        bone20_r2.setPos(4.3401F, -30.5808F, 12.0485F);
        bone16.addChild(bone20_r2);
        setRotationAngle(bone20_r2, 1.5569F, -0.472F, 1.2582F);
        bone20_r2.texOffs(170, 113).addBox(-1.9F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        bone19_r1 = new ModelRenderer(this);
        bone19_r1.setPos(4.3401F, -30.5808F, 12.0485F);
        bone16.addChild(bone19_r1);
        setRotationAngle(bone19_r1, 1.8783F, -0.3643F, 0.4997F);
        bone19_r1.texOffs(172, 115).addBox(-0.9F, -0.5F, 0.9F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        bone18_r1 = new ModelRenderer(this);
        bone18_r1.setPos(18.65F, -2.0F, 6.5F);
        bone16.addChild(bone18_r1);
        setRotationAngle(bone18_r1, 0.1745F, 0.0F, 0.0F);
        bone18_r1.texOffs(173, 115).addBox(-15.4402F, -24.7F, 10.1692F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        bone17 = new ModelRenderer(this);
        bone17.setPos(-4.0F, -23.1F, -2.7F);
        bone16.addChild(bone17);
        setRotationAngle(bone17, 0.0F, 0.0F, 0.3491F);
        bone17.texOffs(130, 78).addBox(4.5197F, -4.645F, 13.1692F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone18 = new ModelRenderer(this);
        bone18.setPos(2.0F, -23.1F, -2.7F);
        bone16.addChild(bone18);
        setRotationAngle(bone18, 0.0F, 0.0F, -0.3491F);
        bone18.texOffs(130, 78).addBox(2.5197F, -1.355F, 13.1692F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone19 = new ModelRenderer(this);
        bone19.setPos(-1.1F, -20.4268F, -2.6F);
        bone16.addChild(bone19);
        setRotationAngle(bone19, 0.5236F, 0.0F, 0.0F);
        bone19.texOffs(78, 55).addBox(2.4098F, 6.5846F, 10.4049F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone19.texOffs(125, 67).addBox(2.4098F, 6.1346F, 10.7799F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone19.texOffs(70, 81).addBox(1.9098F, 6.5846F, 9.4049F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone19.texOffs(10, 67).addBox(0.9098F, 21.1846F, -0.0951F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        bone19.texOffs(38, 78).addBox(-0.0902F, 6.5846F, 6.4049F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        bone19.texOffs(58, 136).addBox(0.7098F, 5.7846F, 2.4049F, 2.0F, 2.0F, 2.0F, -0.4F, false);
        bone19.texOffs(22, 119).addBox(1.1098F, 5.7846F, 2.9049F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        bone19.texOffs(77, 110).addBox(-0.1902F, 5.6846F, 2.9049F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone19.texOffs(78, 29).addBox(-1.0902F, 6.5846F, 4.4049F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        bone19.texOffs(63, 4).addBox(-1.0902F, 6.5846F, 1.4049F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone19.texOffs(40, 103).addBox(6.9098F, 5.9846F, 3.9049F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone19.texOffs(40, 103).addBox(6.0098F, 5.9846F, 5.5049F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone19.texOffs(40, 103).addBox(6.0098F, 5.9846F, 2.2049F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone151 = new ModelRenderer(this);
        bone151.setPos(4.8098F, 5.2846F, 7.4049F);
        bone19.addChild(bone151);
        bone151.texOffs(58, 136).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, false);
        bone151.texOffs(58, 136).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 2.0F, 2.0F, -0.4F, false);
        bone151.texOffs(111, 136).addBox(-1.0F, -1.3F, -1.0F, 2.0F, 1.0F, 2.0F, -0.3F, false);

        yswitch = new ModelRenderer(this);
        yswitch.setPos(0.0F, 0.0F, 0.0F);
        bone19.addChild(yswitch);
        yswitch.texOffs(118, 65).addBox(7.0848F, 5.0846F, 3.9049F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        yswitch.texOffs(116, 71).addBox(7.0848F, 4.9846F, 3.9049F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        xswitch = new ModelRenderer(this);
        xswitch.setPos(0.0F, 0.0F, 0.0F);
        bone19.addChild(xswitch);
        xswitch.texOffs(118, 65).addBox(6.4098F, 5.0846F, 5.5049F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        xswitch.texOffs(116, 71).addBox(6.4098F, 4.9846F, 5.5049F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        zswitch = new ModelRenderer(this);
        zswitch.setPos(0.0F, 0.0F, 0.0F);
        bone19.addChild(zswitch);
        zswitch.texOffs(118, 65).addBox(6.9848F, 4.9846F, 2.2049F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        zswitch.texOffs(116, 71).addBox(6.9848F, 4.9846F, 2.2049F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        bone20 = new ModelRenderer(this);
        bone20.setPos(-1.1F, -12.1499F, -0.5857F);
        bone16.addChild(bone20);
        setRotationAngle(bone20, -0.0873F, 0.0F, 0.0F);
        bone20.texOffs(30, 13).addBox(2.4098F, -2.1478F, 12.1191F, 5.0F, 10.0F, 1.0F, 0.0F, false);
        bone20.texOffs(101, 6).addBox(1.9098F, -1.1478F, 11.1191F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone20.texOffs(86, 77).addBox(0.4098F, -1.1478F, 8.1191F, 9.0F, 1.0F, 3.0F, 0.0F, false);
        bone20.texOffs(27, 73).addBox(-1.0902F, -1.1478F, 5.1191F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone20.texOffs(72, 58).addBox(-1.0902F, -1.1478F, 3.1191F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone21 = new ModelRenderer(this);
        bone21.setPos(5.0F, -15.5F, -11.5F);
        side2.addChild(bone21);
        setRotationAngle(bone21, -1.0472F, 0.0F, 0.0F);
        bone21.texOffs(50, 136).addBox(4.8098F, -13.2634F, 6.3297F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone22 = new ModelRenderer(this);
        bone22.setPos(2.0F, -2.0F, 0.0F);
        bone21.addChild(bone22);
        setRotationAngle(bone22, 0.0F, 0.0F, -0.4363F);
        bone22.texOffs(43, 122).addBox(7.1192F, -18.1754F, 6.3297F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone22.texOffs(137, 66).addBox(7.6192F, -12.1754F, 5.5297F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        bone22.texOffs(108, 41).addBox(7.6192F, -13.9754F, 5.5297F, 1.0F, 2.0F, 2.0F, -0.1F, false);
        bone22.texOffs(108, 37).addBox(7.6192F, -15.3754F, 5.5297F, 1.0F, 2.0F, 2.0F, -0.2F, false);
        bone22.texOffs(136, 109).addBox(7.6192F, -15.3754F, 5.5297F, 2.0F, 1.0F, 2.0F, -0.2F, false);

        bone154 = new ModelRenderer(this);
        bone154.setPos(7.9692F, -11.6754F, 5.4297F);
        bone22.addChild(bone154);
        setRotationAngle(bone154, 0.0F, 0.0F, 0.1745F);
        bone154.texOffs(49, 109).addBox(-2.65F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.175F, false);
        bone154.texOffs(38, 109).addBox(-1.35F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.2F, false);

        bone23 = new ModelRenderer(this);
        bone23.setPos(-9.0F, -15.5F, -11.5F);
        side2.addChild(bone23);
        setRotationAngle(bone23, -1.0472F, 0.0F, 0.0F);
        bone23.texOffs(42, 136).addBox(4.8098F, -13.2634F, 6.3297F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        bone23.texOffs(131, 38).addBox(7.0098F, -17.7634F, 6.0297F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        bone23.texOffs(131, 38).addBox(7.0098F, -17.7634F, 5.7297F, 1.0F, 2.0F, 1.0F, -0.1F, false);

        doorcontrol = new ModelRenderer(this);
        doorcontrol.setPos(7.5098F, -15.7634F, 6.3297F);
        bone23.addChild(doorcontrol);
        setRotationAngle(doorcontrol, -0.9599F, 0.0F, 0.0F);
        doorcontrol.texOffs(51, 127).addBox(-0.5F, -0.2739F, -0.6011F, 1.0F, 2.0F, 1.0F, -0.175F, false);
        doorcontrol.texOffs(123, 42).addBox(-0.5F, 1.3261F, -0.6011F, 1.0F, 2.0F, 1.0F, -0.2F, false);

        bone24 = new ModelRenderer(this);
        bone24.setPos(0.0F, -2.0F, 0.0F);
        bone23.addChild(bone24);
        setRotationAngle(bone24, 0.0F, 0.0F, 0.4363F);
        bone24.texOffs(121, 47).addBox(-0.401F, -22.2408F, 6.3297F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone24.texOffs(28, 136).addBox(-0.401F, -20.9408F, 5.9297F, 2.0F, 2.0F, 2.0F, -0.1F, false);
        bone24.texOffs(136, 8).addBox(-0.401F, -14.9408F, 5.8297F, 2.0F, 2.0F, 2.0F, -0.4F, false);
        bone24.texOffs(137, 51).addBox(0.099F, -14.4408F, 5.8297F, 1.0F, 1.0F, 2.0F, -0.3F, false);
        bone24.texOffs(126, 120).addBox(0.099F, -20.4408F, 3.2297F, 1.0F, 1.0F, 4.0F, -0.3F, false);
        bone24.texOffs(117, 108).addBox(0.099F, -20.4408F, 3.2297F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone24.texOffs(117, 108).addBox(0.099F, -20.4408F, 5.5297F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        bone25 = new ModelRenderer(this);
        bone25.setPos(5.0F, -15.5F, -11.5F);
        side2.addChild(bone25);
        setRotationAngle(bone25, -1.6581F, 0.0F, 0.0F);
        bone25.texOffs(126, 135).addBox(4.8098F, -15.2056F, 0.7094F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone26 = new ModelRenderer(this);
        bone26.setPos(2.0F, -2.0F, 0.0F);
        bone25.addChild(bone26);
        setRotationAngle(bone26, 0.0F, 0.0F, -0.4363F);
        bone26.texOffs(66, 114).addBox(7.9401F, -20.9357F, 0.7094F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone26.texOffs(92, 95).addBox(7.9401F, -20.9357F, 2.7094F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone27 = new ModelRenderer(this);
        bone27.setPos(2.0F, -2.0F, 0.0F);
        bone25.addChild(bone27);
        setRotationAngle(bone27, 0.4363F, 0.0F, -0.4363F);
        bone27.texOffs(24, 126).addBox(7.9401F, -14.8708F, 15.6475F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        bone28 = new ModelRenderer(this);
        bone28.setPos(-9.0F, -15.5F, -11.5F);
        side2.addChild(bone28);
        setRotationAngle(bone28, -1.6581F, 0.0F, 0.0F);
        bone28.texOffs(126, 135).addBox(4.8098F, -15.2056F, 0.7094F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone29 = new ModelRenderer(this);
        bone29.setPos(0.0F, -2.0F, 0.0F);
        bone28.addChild(bone29);
        setRotationAngle(bone29, 0.0F, 0.0F, 0.4363F);
        bone29.texOffs(74, 114).addBox(-1.2218F, -25.0011F, 0.7094F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone29.texOffs(81, 93).addBox(-1.2218F, -25.0011F, 2.7094F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone30 = new ModelRenderer(this);
        bone30.setPos(1.9634F, -11.0784F, 10.8321F);
        bone29.addChild(bone30);
        setRotationAngle(bone30, -1.1345F, 0.0F, 0.0F);
        bone30.texOffs(40, 101).addBox(-3.1852F, -4.8672F, -13.0947F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        side3 = new ModelRenderer(this);
        side3.setPos(-32.0F, 3.0F, -8.0F);
        base.addChild(side3);
        setRotationAngle(side3, 0.0F, 2.0944F, 0.0F);


        bone31 = new ModelRenderer(this);
        bone31.setPos(0.0F, 0.0F, 0.0F);
        side3.addChild(bone31);
        bone31.texOffs(0, 80).addBox(-27.1902F, -15.15F, 5.541F, 12.0F, 3.0F, 1.0F, 0.2F, false);
        bone31.texOffs(95, 104).addBox(-24.1902F, -23.1F, 14.291F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        bone31.texOffs(118, 61).addBox(-24.1902F, -20.1F, 16.291F, 6.0F, 1.0F, 2.0F, 0.0F, false);
        bone31.texOffs(118, 34).addBox(-24.1902F, -6.1F, 16.291F, 6.0F, 1.0F, 2.0F, 0.0F, false);
        bone31.texOffs(130, 78).addBox(-22.1902F, -25.6F, 14.291F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone31.texOffs(11, 104).addBox(-23.1642F, -25.6191F, 14.291F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone31.texOffs(11, 104).addBox(-21.2163F, -25.6191F, 14.291F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone31.texOffs(130, 99).addBox(-29.1902F, -15.65F, 5.241F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone31.texOffs(125, 84).addBox(-31.0304F, -15.65F, 6.5642F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        bone31.texOffs(96, 130).addBox(-15.1902F, -15.65F, 5.241F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone31.texOffs(57, 125).addBox(-14.3902F, -15.65F, 6.5874F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        bone31_r1 = new ModelRenderer(this);
        bone31_r1.setPos(29.65F, -3.25F, 5.0F);
        bone31.addChild(bone31_r1);
        setRotationAngle(bone31_r1, 0.0F, 0.0436F, 0.0F);
        bone31_r1.texOffs(30, 27).addBox(-51.7402F, -24.2F, 6.891F, 0.0F, 2.0F, 1.0F, -0.2F, false);
        bone31_r1.texOffs(137, 48).addBox(-52.7402F, -24.4F, 7.291F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        telepathic = new ModelRenderer(this);
        telepathic.setPos(-4.0F, -12.0F, -11.0F);
        bone31.addChild(telepathic);


        telepathic_r1 = new ModelRenderer(this);
        telepathic_r1.setPos(34.65F, 10.0F, 17.5F);
        telepathic.addChild(telepathic_r1);
        setRotationAngle(telepathic_r1, -0.3927F, 0.0F, 0.0F);
        telepathic_r1.texOffs(29, 92).addBox(-54.3402F, -21.7F, -1.959F, 5.0F, 2.0F, 2.0F, 0.0F, false);
        telepathic_r1.texOffs(127, 96).addBox(-53.7402F, -22.1F, -1.959F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        telepathic_r1.texOffs(122, 79).addBox(-52.9402F, -21.5F, -3.459F, 2.0F, 1.0F, 4.0F, 0.0F, false);
        telepathic_r1.texOffs(123, 37).addBox(-52.9402F, -21.1F, -3.459F, 2.0F, 1.0F, 4.0F, -0.1F, false);
        telepathic_r1.texOffs(123, 37).addBox(-52.9402F, -21.8F, -3.459F, 2.0F, 1.0F, 4.0F, -0.1F, false);

        bone32 = new ModelRenderer(this);
        bone32.setPos(-4.0F, -23.1F, -2.7F);
        bone31.addChild(bone32);
        setRotationAngle(bone32, 0.0F, 0.0F, 0.3491F);
        bone32.texOffs(130, 78).addBox(-18.9726F, 3.9055F, 16.991F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone33 = new ModelRenderer(this);
        bone33.setPos(2.0F, -23.1F, -2.7F);
        bone31.addChild(bone33);
        setRotationAngle(bone33, 0.0F, 0.0F, -0.3491F);
        bone33.texOffs(130, 78).addBox(-20.9726F, -9.9055F, 16.991F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone34 = new ModelRenderer(this);
        bone34.setPos(-1.1F, -20.4268F, -2.6F);
        bone31.addChild(bone34);
        setRotationAngle(bone34, 0.5236F, 0.0F, 0.0F);
        bone34.texOffs(78, 55).addBox(-22.5902F, 8.4955F, 13.7147F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone34.texOffs(108, 8).addBox(-22.5902F, 8.0455F, 14.0897F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone34.texOffs(70, 81).addBox(-23.0902F, 8.4955F, 12.7147F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone34.texOffs(38, 78).addBox(-25.0902F, 8.4955F, 9.7147F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        bone34.texOffs(10, 67).addBox(-24.0902F, 23.0205F, 3.1147F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        bone34.texOffs(78, 29).addBox(-26.0902F, 8.4955F, 7.7147F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        bone34.texOffs(0, 0).addBox(-20.0902F, 6.5955F, 9.8147F, 0.0F, 2.0F, 0.0F, -0.2F, false);
        bone34.texOffs(87, 135).addBox(-21.0902F, 5.0955F, 9.2147F, 2.0F, 2.0F, 2.0F, -0.3F, false);
        bone34.texOffs(135, 83).addBox(-21.0902F, 7.9955F, 9.3397F, 2.0F, 2.0F, 2.0F, -0.2F, false);
        bone34.texOffs(94, 37).addBox(-21.5902F, 5.0955F, 9.2147F, 3.0F, 2.0F, 2.0F, -0.4F, false);
        bone34.texOffs(0, 0).addBox(-20.0902F, 6.5955F, 10.7147F, 0.0F, 2.0F, 0.0F, -0.2F, false);
        bone34.texOffs(63, 4).addBox(-26.0902F, 8.4955F, 4.7147F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone34.texOffs(135, 87).addBox(-23.8902F, 7.9955F, 7.6147F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone34.texOffs(136, 77).addBox(-23.8902F, 7.7955F, 7.6147F, 2.0F, 1.0F, 2.0F, -0.1F, false);
        bone34.texOffs(136, 77).addBox(-21.1402F, 7.7955F, 5.3647F, 2.0F, 1.0F, 2.0F, -0.1F, false);
        bone34.texOffs(135, 87).addBox(-21.1402F, 7.9955F, 5.3647F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone34.texOffs(8, 1).addBox(-22.8902F, 7.6955F, 8.5147F, 0.0F, 1.0F, 1.0F, -0.1F, false);
        bone34.texOffs(116, 71).addBox(-16.6902F, 6.9846F, 6.9049F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone34.texOffs(116, 71).addBox(-16.6902F, 6.9846F, 5.6049F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone34.texOffs(118, 65).addBox(-16.6902F, 6.9846F, 6.9049F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        bone34.texOffs(118, 65).addBox(-16.6902F, 6.9846F, 5.6049F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        bone34.texOffs(40, 103).addBox(-17.6902F, 7.9846F, 6.9049F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone34.texOffs(40, 103).addBox(-16.6902F, 7.9846F, 5.6049F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone34_r1 = new ModelRenderer(this);
        bone34_r1.setPos(-20.8902F, 8.1955F, 6.0147F);
        bone34.addChild(bone34_r1);
        setRotationAngle(bone34_r1, 0.0F, -0.9599F, 0.0F);


        bone35 = new ModelRenderer(this);
        bone35.setPos(-1.1F, -12.1499F, -0.5857F);
        bone31.addChild(bone35);
        setRotationAngle(bone35, -0.0873F, 0.0F, 0.0F);
        bone35.texOffs(30, 14).addBox(-22.5902F, -1.4809F, 15.9264F, 5.0F, 9.0F, 1.0F, 0.0F, false);
        bone35.texOffs(104, 53).addBox(-23.0902F, -1.4809F, 14.9264F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone35.texOffs(86, 73).addBox(-24.5902F, -1.4809F, 11.9264F, 9.0F, 1.0F, 3.0F, 0.0F, false);
        bone35.texOffs(0, 72).addBox(-26.0902F, -1.4809F, 8.9264F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone35.texOffs(71, 18).addBox(-26.0902F, -1.4809F, 6.9264F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone36 = new ModelRenderer(this);
        bone36.setPos(5.0F, -15.5F, -11.5F);
        side3.addChild(bone36);
        setRotationAngle(bone36, -1.0472F, 0.0F, 0.0F);
        bone36.texOffs(135, 62).addBox(-20.1902F, -16.5732F, 8.2406F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone37 = new ModelRenderer(this);
        bone37.setPos(2.0F, -2.0F, 0.0F);
        bone36.addChild(bone37);
        setRotationAngle(bone37, 0.0F, 0.0F, -0.4363F);
        bone37.texOffs(120, 4).addBox(-14.1397F, -31.7405F, 8.2406F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone37.texOffs(0, 0).addBox(-14.1165F, -29.9663F, 7.9438F, 2.0F, 5.0F, 1.0F, -0.025F, false);
        bone37.texOffs(96, 110).addBox(-13.6165F, -25.9163F, 7.4938F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone37.texOffs(114, 26).addBox(-14.1165F, -28.7163F, 6.9938F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        bone37.texOffs(104, 47).addBox(-13.5165F, -29.7163F, 6.9938F, 1.0F, 4.0F, 1.0F, -0.3F, false);
        bone37.texOffs(104, 47).addBox(-13.0165F, -29.7163F, 6.9938F, 1.0F, 4.0F, 1.0F, -0.3F, false);
        bone37.texOffs(0, 91).addBox(-14.1165F, -29.7163F, 7.3938F, 2.0F, 4.0F, 1.0F, -0.1F, false);

        verticallanding = new ModelRenderer(this);
        verticallanding.setPos(-13.6102F, -27.6163F, 7.4438F);
        bone37.addChild(verticallanding);
        setRotationAngle(verticallanding, -0.9599F, 0.0F, 0.0F);
        verticallanding.texOffs(105, 30).addBox(-0.1563F, 0.0F, -2.95F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        verticallanding.texOffs(0, 0).addBox(-0.2062F, 0.0F, -2.95F, 0.0F, 0.0F, 3.0F, -0.125F, false);
        verticallanding.texOffs(0, 0).addBox(0.1938F, 0.0F, -2.95F, 0.0F, 0.0F, 3.0F, -0.125F, false);
        verticallanding.texOffs(105, 30).addBox(-0.8313F, 0.0F, -2.95F, 1.0F, 0.0F, 0.0F, -0.2F, false);

        verticallanding_r1 = new ModelRenderer(this);
        verticallanding_r1.setPos(38.1102F, -10.8837F, 43.0562F);
        verticallanding.addChild(verticallanding_r1);
        setRotationAngle(verticallanding_r1, 1.5708F, 0.0F, 0.0F);
        verticallanding_r1.texOffs(105, 49).addBox(-37.4165F, -43.1163F, -13.5062F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        verticallanding_r1.texOffs(0, 0).addBox(-37.0664F, -43.1163F, -13.5062F, 0.0F, 0.0F, 3.0F, -0.125F, false);
        verticallanding_r1.texOffs(105, 49).addBox(-38.0915F, -43.1163F, -13.5062F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        verticallanding_r1.texOffs(0, 0).addBox(-37.4664F, -43.1163F, -13.5062F, 0.0F, 0.0F, 3.0F, -0.125F, false);

        bone38 = new ModelRenderer(this);
        bone38.setPos(-9.0F, -15.5F, -11.5F);
        side3.addChild(bone38);
        setRotationAngle(bone38, -1.0472F, 0.0F, 0.0F);
        bone38.texOffs(135, 44).addBox(-20.1902F, -16.5732F, 8.2406F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone39 = new ModelRenderer(this);
        bone39.setPos(0.0F, -2.0F, 0.0F);
        bone38.addChild(bone39);
        setRotationAngle(bone39, 0.0F, 0.0F, 0.4363F);
        bone39.texOffs(119, 88).addBox(-24.4574F, -14.675F, 8.2406F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone39.texOffs(89, 104).addBox(-24.0586F, -8.5361F, 7.0496F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        bone39.texOffs(81, 91).addBox(-24.0586F, -11.1361F, 7.0246F, 1.0F, 3.0F, 2.0F, -0.1F, false);
        bone39.texOffs(50, 103).addBox(-24.0586F, -7.8361F, 7.0496F, 1.0F, 2.0F, 2.0F, 0.1F, false);
        bone39.texOffs(69, 99).addBox(-24.0586F, -6.5361F, 6.9246F, 1.0F, 2.0F, 2.0F, 0.125F, false);

        bone40 = new ModelRenderer(this);
        bone40.setPos(5.0F, -15.5F, -11.5F);
        side3.addChild(bone40);
        setRotationAngle(bone40, -1.6581F, 0.0F, 0.0F);
        bone40.texOffs(135, 38).addBox(-20.1902F, -19.0129F, 0.3763F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone41 = new ModelRenderer(this);
        bone41.setPos(2.0F, -2.0F, 0.0F);
        bone40.addChild(bone41);
        setRotationAngle(bone41, 0.0F, 0.0F, -0.4363F);
        bone41.texOffs(27, 113).addBox(-13.1086F, -34.9517F, 0.3763F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone41.texOffs(47, 92).addBox(-13.1086F, -34.9517F, 2.3763F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone42 = new ModelRenderer(this);
        bone42.setPos(2.0F, -2.0F, 0.0F);
        bone40.addChild(bone42);
        setRotationAngle(bone42, 0.4363F, 0.0F, -0.4363F);
        bone42.texOffs(120, 124).addBox(-13.1086F, -27.7144F, 21.269F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        bone43 = new ModelRenderer(this);
        bone43.setPos(-9.0F, -15.5F, -11.5F);
        side3.addChild(bone43);
        setRotationAngle(bone43, -1.6581F, 0.0F, 0.0F);
        bone43.texOffs(135, 23).addBox(-20.1902F, -19.0129F, 0.3763F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone44 = new ModelRenderer(this);
        bone44.setPos(0.0F, -2.0F, 0.0F);
        bone43.addChild(bone44);
        setRotationAngle(bone44, 0.0F, 0.0F, 0.4363F);
        bone44.texOffs(106, 111).addBox(-25.4885F, -17.8861F, 0.3763F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone44.texOffs(18, 92).addBox(-25.4885F, -17.8861F, 2.3763F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone45 = new ModelRenderer(this);
        bone45.setPos(1.9634F, -11.0784F, 10.8321F);
        bone44.addChild(bone45);
        setRotationAngle(bone45, -1.1345F, 0.0F, 0.0F);
        bone45.texOffs(16, 101).addBox(-27.452F, -1.5584F, -6.7872F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        side4 = new ModelRenderer(this);
        side4.setPos(-32.0F, 3.0F, -8.0F);
        base.addChild(side4);
        setRotationAngle(side4, 0.0F, 3.1416F, 0.0F);


        bone46 = new ModelRenderer(this);
        bone46.setPos(0.0F, 0.0F, 0.0F);
        side4.addChild(bone46);
        bone46.texOffs(134, 4).addBox(-32.0F, -4.15F, -18.591F, 2.0F, 2.0F, 2.0F, 0.2F, false);
        bone46.texOffs(78, 51).addBox(-37.0F, -15.15F, -24.591F, 12.0F, 3.0F, 1.0F, 0.2F, false);
        bone46.texOffs(95, 104).addBox(-34.0F, -23.1F, -15.841F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        bone46.texOffs(40, 99).addBox(-29.8F, -24.7F, -16.041F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        bone46.texOffs(40, 99).addBox(-29.8F, -24.7F, -16.241F, 1.0F, 2.0F, 2.0F, -0.1F, false);
        bone46.texOffs(88, 55).addBox(-36.0F, -20.1F, -13.841F, 10.0F, 1.0F, 2.0F, 0.0F, false);
        bone46.texOffs(79, 62).addBox(-36.0F, -6.1F, -13.841F, 10.0F, 1.0F, 2.0F, 0.0F, false);
        bone46.texOffs(130, 78).addBox(-32.0F, -25.7F, -15.841F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone46.texOffs(11, 104).addBox(-32.9739F, -25.9191F, -15.841F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone46.texOffs(11, 104).addBox(-31.0261F, -25.9191F, -15.841F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone46.texOffs(73, 130).addBox(-39.0F, -15.65F, -24.891F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone46.texOffs(110, 124).addBox(-40.8F, -15.65F, -23.491F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        bone46.texOffs(65, 130).addBox(-25.0F, -15.65F, -24.891F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone46.texOffs(100, 124).addBox(-24.2F, -15.65F, -23.591F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        phone = new ModelRenderer(this);
        phone.setPos(-4.0F, -12.0F, -11.0F);
        bone46.addChild(phone);
        phone.texOffs(90, 123).addBox(-29.0F, -12.7F, -5.041F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        phone.texOffs(1, 1).addBox(-27.1F, -11.4F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-26.5F, -11.4F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-27.1F, -10.9F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-26.5F, -10.9F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-27.1F, -10.4F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-26.5F, -10.4F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-27.1F, -9.925F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);
        phone.texOffs(1, 1).addBox(-26.5F, -9.925F, -5.041F, 0.0F, 0.0F, 1.0F, 0.2F, false);

        bone47 = new ModelRenderer(this);
        bone47.setPos(-4.0F, -23.1F, -2.7F);
        bone46.addChild(bone47);
        setRotationAngle(bone47, 0.0F, 0.0F, 0.3491F);
        bone47.texOffs(130, 78).addBox(-28.1908F, 7.2606F, -13.141F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone48 = new ModelRenderer(this);
        bone48.setPos(2.0F, -23.1F, -2.7F);
        bone46.addChild(bone48);
        setRotationAngle(bone48, 0.0F, 0.0F, -0.3491F);
        bone48.texOffs(130, 78).addBox(-30.1908F, -13.2606F, -13.141F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone49 = new ModelRenderer(this);
        bone49.setPos(-1.1F, -20.4268F, -2.6F);
        bone46.addChild(bone49);
        setRotationAngle(bone49, 0.5236F, 0.0F, 0.0F);
        bone49.texOffs(78, 55).addBox(-32.4F, -6.5705F, -12.3805F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone49.texOffs(107, 24).addBox(-32.4F, -7.0205F, -12.0055F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone49.texOffs(70, 81).addBox(-32.9F, -6.5705F, -13.3805F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone49.texOffs(38, 78).addBox(-34.9F, -6.5705F, -16.3805F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        bone49.texOffs(103, 97).addBox(-32.8F, -7.8705F, -16.0805F, 6.0F, 2.0F, 3.0F, -0.3F, false);
        bone49.texOffs(10, 67).addBox(-33.9F, 7.9045F, -22.9555F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        bone49.texOffs(78, 29).addBox(-35.9F, -6.5705F, -18.3805F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        bone49.texOffs(63, 4).addBox(-35.9F, -6.5705F, -21.3805F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        randomiser = new ModelRenderer(this);
        randomiser.setPos(0.0F, 0.0F, 0.0F);
        bone49.addChild(randomiser);
        randomiser.texOffs(119, 16).addBox(-32.8F, -8.4705F, -18.1805F, 6.0F, 2.0F, 1.0F, -0.3F, false);
        randomiser.texOffs(0, 84).addBox(-32.8F, -8.0705F, -22.3805F, 6.0F, 2.0F, 5.0F, -0.3F, false);
        randomiser.texOffs(127, 93).addBox(-32.3F, -9.6705F, -19.0805F, 5.0F, 2.0F, 1.0F, -0.3F, false);
        randomiser.texOffs(107, 84).addBox(-32.8F, -8.4705F, -20.3805F, 6.0F, 2.0F, 2.0F, -0.3F, false);
        randomiser.texOffs(117, 105).addBox(-32.5F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-31.85F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-31.2F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-30.6F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-29.95F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-29.3F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-28.7F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-28.1F, -8.2455F, -20.9805F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-32.5F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-32.5F, -8.2455F, -22.2305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-31.85F, -8.2455F, -22.2305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-31.85F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-31.2F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-30.6F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-29.95F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-29.3F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-28.7F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-28.1F, -8.2455F, -21.6305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-28.1F, -8.2455F, -22.2305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(117, 105).addBox(-28.7F, -8.2455F, -22.2305F, 1.0F, 2.0F, 1.0F, -0.275F, false);
        randomiser.texOffs(137, 27).addBox(-31.2F, -8.2455F, -22.2305F, 3.0F, 2.0F, 1.0F, -0.275F, false);

        bone50 = new ModelRenderer(this);
        bone50.setPos(-1.1F, -12.1499F, -0.5857F);
        bone46.addChild(bone50);
        setRotationAngle(bone50, -0.0873F, 0.0F, 0.0F);
        bone50.texOffs(30, 14).addBox(-32.4F, 1.1453F, -14.091F, 5.0F, 9.0F, 1.0F, 0.0F, false);
        bone50.texOffs(47, 90).addBox(-32.9F, 1.1453F, -15.091F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone50.texOffs(86, 69).addBox(-34.4F, 1.1453F, -18.091F, 9.0F, 1.0F, 3.0F, 0.0F, false);
        bone50.texOffs(71, 14).addBox(-35.9F, 1.1453F, -21.091F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone50.texOffs(59, 70).addBox(-35.9F, 1.1453F, -23.091F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone51 = new ModelRenderer(this);
        bone51.setPos(5.0F, -15.5F, -11.5F);
        side4.addChild(bone51);
        setRotationAngle(bone51, -1.0472F, 0.0F, 0.0F);
        bone51.texOffs(6, 135).addBox(-30.0F, 9.522F, -6.8254F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone52 = new ModelRenderer(this);
        bone52.setPos(2.0F, -2.0F, 0.0F);
        bone51.addChild(bone52);
        setRotationAngle(bone52, 0.0F, 0.0F, -0.4363F);
        bone52.texOffs(119, 22).addBox(-34.0586F, -12.2361F, -6.8254F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone52.texOffs(57, 115).addBox(-34.2586F, -11.1361F, -7.1254F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone52.texOffs(62, 36).addBox(-36.2586F, -8.7361F, -7.8004F, 4.0F, 1.0F, 1.0F, -0.1F, false);
        bone52.texOffs(116, 33).addBox(-36.2586F, -9.7111F, -7.8004F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        bone52.texOffs(58, 97).addBox(-37.2586F, -9.8361F, -7.8004F, 2.0F, 1.0F, 1.0F, -0.1F, false);
        bone52.texOffs(57, 115).addBox(-37.2586F, -10.6361F, -7.8004F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone52.texOffs(55, 25).addBox(-37.2586F, -11.1361F, -7.8004F, 6.0F, 1.0F, 1.0F, -0.1F, false);

        bone53_r1 = new ModelRenderer(this);
        bone53_r1.setPos(-31.2586F, -10.6361F, -7.3004F);
        bone52.addChild(bone53_r1);
        setRotationAngle(bone53_r1, 0.0F, -0.9163F, 0.0F);
        bone53_r1.texOffs(55, 25).addBox(-0.5F, -0.5F, -0.25F, 6.0F, 1.0F, 1.0F, -0.1F, false);

        bone53 = new ModelRenderer(this);
        bone53.setPos(-9.0F, -15.5F, -11.5F);
        side4.addChild(bone53);
        setRotationAngle(bone53, -1.0472F, 0.0F, 0.0F);
        bone53.texOffs(134, 129).addBox(-30.0F, 9.522F, -6.8254F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone54 = new ModelRenderer(this);
        bone54.setPos(0.0F, -2.0F, 0.0F);
        bone53.addChild(bone54);
        setRotationAngle(bone54, 0.0F, 0.0F, 0.4363F);
        bone54.texOffs(16, 119).addBox(-22.3198F, 13.121F, -6.8254F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone54.texOffs(18, 137).addBox(-21.8198F, 18.921F, -7.1254F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        bone54.texOffs(18, 137).addBox(-21.8198F, 20.821F, -7.1254F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        bone55 = new ModelRenderer(this);
        bone55.setPos(5.0F, -15.5F, -11.5F);
        side4.addChild(bone55);
        setRotationAngle(bone55, -1.6581F, 0.0F, 0.0F);
        bone55.texOffs(134, 123).addBox(-30.0F, 11.0045F, 3.0025F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone56 = new ModelRenderer(this);
        bone56.setPos(2.0F, -2.0F, 0.0F);
        bone55.addChild(bone56);
        setRotationAngle(bone56, 0.0F, 0.0F, -0.4363F);
        bone56.texOffs(98, 110).addBox(-34.6852F, -11.8925F, 3.0025F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone56.texOffs(0, 91).addBox(-34.6852F, -11.8925F, 5.0025F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone57 = new ModelRenderer(this);
        bone57.setPos(2.0F, -2.0F, 0.0F);
        bone55.addChild(bone57);
        setRotationAngle(bone57, 0.4363F, 0.0F, -0.4363F);
        bone57.texOffs(82, 123).addBox(-34.6852F, -5.7058F, 13.9039F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        bone58 = new ModelRenderer(this);
        bone58.setPos(-9.0F, -15.5F, -11.5F);
        side4.addChild(bone58);
        setRotationAngle(bone58, -1.6581F, 0.0F, 0.0F);
        bone58.texOffs(134, 73).addBox(-30.0F, 11.0045F, 3.0025F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone59 = new ModelRenderer(this);
        bone59.setPos(0.0F, -2.0F, 0.0F);
        bone58.addChild(bone59);
        setRotationAngle(bone59, 0.0F, 0.0F, 0.4363F);
        bone59.texOffs(90, 110).addBox(-21.6933F, 13.4646F, 3.0025F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone59.texOffs(70, 90).addBox(-21.6933F, 13.4646F, 5.0025F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone60 = new ModelRenderer(this);
        bone60.setPos(1.9634F, -11.0784F, 10.8321F);
        bone59.addChild(bone60);
        setRotationAngle(bone60, -1.1345F, 0.0F, 0.0F);
        bone60.texOffs(69, 99).addBox(-23.6567F, 9.3108F, 22.7361F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        side5 = new ModelRenderer(this);
        side5.setPos(-32.0F, 3.0F, -8.0F);
        base.addChild(side5);
        setRotationAngle(side5, 0.0F, -2.0944F, 0.0F);


        bone61 = new ModelRenderer(this);
        bone61.setPos(0.0F, 0.0F, 0.0F);
        side5.addChild(bone61);
        bone61.texOffs(78, 47).addBox(-15.8098F, -15.15F, -48.1525F, 12.0F, 3.0F, 1.0F, 0.2F, false);
        bone61.texOffs(95, 104).addBox(-12.8098F, -23.1F, -39.4025F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        bone61.texOffs(38, 28).addBox(-12.6098F, -23.6F, -40.3025F, 1.0F, 2.0F, 0.0F, 0.1F, false);
        bone61.texOffs(38, 28).addBox(-8.3098F, -23.4F, -40.3025F, 1.0F, 2.0F, 0.0F, 0.1F, false);
        bone61.texOffs(72, 114).addBox(-12.6098F, -23.0F, -40.3025F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone61.texOffs(114, 29).addBox(-10.5098F, -24.0F, -39.7025F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        bone61.texOffs(115, 6).addBox(-10.5098F, -23.6F, -39.9025F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone61.texOffs(72, 114).addBox(-8.3098F, -22.8F, -40.3025F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone61.texOffs(54, 41).addBox(-8.5098F, -23.1F, -39.4025F, 0.0F, 4.0F, 1.0F, 0.1F, false);
        bone61.texOffs(254, 241).addBox(-8.5098F, -25.2F, -39.4025F, 0.0F, 2.0F, 1.0F, 0.1F, false);
        bone61.texOffs(252, 239).addBox(-8.5098F, -25.8F, -39.4025F, 0.0F, 2.0F, 2.0F, 0.1F, false);
        bone61.texOffs(30, 14).addBox(-12.8098F, -20.1F, -37.4025F, 6.0F, 1.0F, 13.0F, 0.0F, false);
        bone61.texOffs(30, 14).addBox(-12.8098F, -6.1F, -37.4025F, 6.0F, 1.0F, 13.0F, 0.0F, false);
        bone61.texOffs(130, 78).addBox(-10.8098F, -25.6F, -39.4025F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone61.texOffs(11, 104).addBox(-11.7837F, -25.6191F, -39.4025F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone61.texOffs(11, 104).addBox(-9.8358F, -25.6191F, -39.4025F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone61.texOffs(88, 129).addBox(-17.8098F, -15.65F, -48.4525F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone61.texOffs(134, 69).addBox(-17.8098F, -14.85F, -49.1525F, 2.0F, 2.0F, 2.0F, -0.4F, false);
        bone61.texOffs(62, 51).addBox(-19.3598F, -15.65F, -46.6731F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        bone61.texOffs(129, 47).addBox(-3.8098F, -15.65F, -48.4525F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone61.texOffs(62, 40).addBox(-3.0562F, -15.65F, -47.0793F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        bone62 = new ModelRenderer(this);
        bone62.setPos(-4.0F, -23.1F, -2.7F);
        bone61.addChild(bone62);
        setRotationAngle(bone62, 0.0F, 0.0F, 0.3491F);
        bone62.texOffs(130, 78).addBox(-8.2785F, 0.0131F, -36.7025F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone63 = new ModelRenderer(this);
        bone63.setPos(2.0F, -23.1F, -2.7F);
        bone61.addChild(bone63);
        setRotationAngle(bone63, 0.0F, 0.0F, -0.3491F);
        bone63.texOffs(130, 78).addBox(-10.2785F, -6.0131F, -36.7025F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone64 = new ModelRenderer(this);
        bone64.setPos(-1.1F, -20.4268F, -2.6F);
        bone61.addChild(bone64);
        setRotationAngle(bone64, 0.5236F, 0.0F, 0.0F);
        bone64.texOffs(78, 55).addBox(-11.2098F, -18.3513F, -32.7853F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone64.texOffs(106, 12).addBox(-11.2098F, -18.8013F, -32.4103F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone64.texOffs(70, 81).addBox(-11.7098F, -18.3513F, -33.7853F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone64.texOffs(38, 78).addBox(-13.7098F, -18.3513F, -36.7853F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        bone64.texOffs(9, 66).addBox(-12.7098F, -3.7763F, -43.2853F, 8.0F, 1.0F, 5.0F, 0.0F, false);
        bone64.texOffs(78, 29).addBox(-14.7098F, -18.3513F, -38.7853F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        bone64.texOffs(33, 113).addBox(-6.8848F, -18.7513F, -35.9853F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone64.texOffs(33, 113).addBox(-7.0848F, -18.7513F, -35.9853F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone64.texOffs(33, 113).addBox(-6.6848F, -18.7513F, -35.9853F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone64.texOffs(254, 242).addBox(-6.4098F, -18.5513F, -34.9853F, 0.0F, 0.0F, 1.0F, 0.1F, false);
        bone64.texOffs(63, 4).addBox(-14.7098F, -18.3513F, -41.7853F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone64_r1 = new ModelRenderer(this);
        bone64_r1.setPos(-6.4098F, -18.7513F, -32.1853F);
        bone64.addChild(bone64_r1);
        setRotationAngle(bone64_r1, 0.0F, -0.5236F, 0.0F);
        bone64_r1.texOffs(254, 242).addBox(-0.6F, 0.0F, -0.2F, 0.0F, 0.0F, 1.0F, 0.1F, false);

        bone64_r2 = new ModelRenderer(this);
        bone64_r2.setPos(-6.4098F, -18.5513F, -32.9853F);
        bone64.addChild(bone64_r2);
        setRotationAngle(bone64_r2, 0.0F, -0.3054F, 0.0F);
        bone64_r2.texOffs(253, 241).addBox(-0.3F, 0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 0.1F, false);

        sonicport = new ModelRenderer(this);
        sonicport.setPos(-10.9398F, -18.2313F, -36.5853F);
        bone64.addChild(sonicport);
        sonicport.texOffs(12, 137).addBox(0.18F, -0.5201F, -1.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);
        sonicport.texOffs(112, 55).addBox(-1.07F, -0.42F, -1.0F, 2.0F, 1.0F, 2.0F, -0.25F, false);
        sonicport.texOffs(18, 97).addBox(-0.97F, -0.52F, -1.175F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        sonicport.texOffs(12, 137).addBox(-1.17F, -0.5201F, -1.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);
        sonicport.texOffs(18, 97).addBox(-0.97F, -0.52F, 0.175F, 2.0F, 1.0F, 1.0F, -0.25F, false);

        bluestab = new ModelRenderer(this);
        bluestab.setPos(0.0F, 0.0F, 0.0F);
        bone64.addChild(bluestab);
        bluestab.texOffs(26, 82).addBox(-13.4848F, -19.9513F, -39.4603F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        bluestab.texOffs(26, 82).addBox(-12.5848F, -19.9513F, -39.7103F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        bluestab.texOffs(26, 82).addBox(-13.3348F, -19.7013F, -40.4603F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        bluestab.texOffs(1, 1).addBox(-12.6F, -20.2F, -39.7F, 1.0F, 3.0F, 1.0F, -0.3F, false);
        bluestab.texOffs(1, 1).addBox(-13.5F, -20.1F, -39.45F, 1.0F, 3.0F, 1.0F, -0.3F, false);
        bluestab.texOffs(1, 1).addBox(-13.35F, -19.9F, -40.45F, 1.0F, 3.0F, 1.0F, -0.3F, false);

        bone65 = new ModelRenderer(this);
        bone65.setPos(-1.1F, -12.1499F, -0.5857F);
        bone61.addChild(bone65);
        setRotationAngle(bone65, -0.0873F, 0.0F, 0.0F);
        bone65.texOffs(30, 14).addBox(-11.2098F, 3.1988F, -37.5629F, 5.0F, 9.0F, 1.0F, 0.0F, false);
        bone65.texOffs(70, 88).addBox(-11.7098F, 3.1988F, -38.5629F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone65.texOffs(42, 86).addBox(-13.2098F, 3.1988F, -41.5629F, 9.0F, 1.0F, 3.0F, 0.0F, false);
        bone65.texOffs(52, 66).addBox(-14.7098F, 3.1988F, -44.5629F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone65.texOffs(63, 8).addBox(-14.7098F, 3.1988F, -46.5629F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone66 = new ModelRenderer(this);
        bone66.setPos(5.0F, -15.5F, -11.5F);
        side5.addChild(bone66);
        setRotationAngle(bone66, -1.0472F, 0.0F, 0.0F);
        bone66.texOffs(36, 134).addBox(-8.8098F, 29.9268F, -18.6062F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone67 = new ModelRenderer(this);
        bone67.setPos(2.0F, -2.0F, 0.0F);
        bone66.addChild(bone67);
        setRotationAngle(bone67, 0.0F, 0.0F, -0.4363F);
        bone67.texOffs(118, 71).addBox(-23.4772F, 15.2124F, -18.6062F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone67.texOffs(22, 134).addBox(-23.4772F, 16.2124F, -19.0062F, 2.0F, 2.0F, 2.0F, -0.1F, false);
        bone67.texOffs(131, 53).addBox(-23.4772F, 18.6124F, -19.0062F, 2.0F, 3.0F, 2.0F, -0.1F, false);
        bone67.texOffs(91, 2).addBox(-23.4772F, 21.9124F, -19.0062F, 1.0F, 3.0F, 2.0F, -0.1F, false);
        bone67.texOffs(91, 2).addBox(-22.4772F, 21.9124F, -19.0062F, 1.0F, 3.0F, 2.0F, -0.1F, false);
        bone67.texOffs(120, 19).addBox(-23.4772F, 18.6124F, -19.4062F, 1.0F, 1.0F, 2.0F, -0.1F, false);
        bone67.texOffs(120, 19).addBox(-23.4772F, 20.5124F, -19.4062F, 1.0F, 1.0F, 2.0F, -0.1F, false);
        bone67.texOffs(96, 83).addBox(-23.4772F, 19.0124F, -19.9062F, 1.0F, 2.0F, 2.0F, -0.1F, false);
        bone67.texOffs(120, 19).addBox(-22.4772F, 18.6124F, -19.4062F, 1.0F, 1.0F, 2.0F, -0.1F, false);
        bone67.texOffs(120, 19).addBox(-22.4772F, 20.5124F, -19.4062F, 1.0F, 1.0F, 2.0F, -0.1F, false);
        bone67.texOffs(96, 83).addBox(-22.4772F, 19.0124F, -19.9062F, 1.0F, 2.0F, 2.0F, -0.1F, false);
        bone67.texOffs(134, 4).addBox(-23.4772F, 16.2124F, -19.2062F, 2.0F, 2.0F, 2.0F, -0.2F, false);

        bone67_r1 = new ModelRenderer(this);
        bone67_r1.setPos(-26.0315F, 21.6931F, -18.0723F);
        bone67.addChild(bone67_r1);
        setRotationAngle(bone67_r1, 0.0F, 0.0F, -0.0873F);
        bone67_r1.texOffs(133, 58).addBox(-0.6457F, -1.7807F, -1.2339F, 2.0F, 2.0F, 2.0F, -0.6F, false);
        bone67_r1.texOffs(81, 133).addBox(-0.6457F, -1.7807F, -1.0339F, 2.0F, 2.0F, 2.0F, -0.5F, false);
        bone67_r1.texOffs(120, 133).addBox(-0.2457F, -0.3807F, -1.3339F, 2.0F, 2.0F, 2.0F, -0.5F, false);
        bone67_r1.texOffs(132, 133).addBox(-0.2457F, -0.3807F, -1.0339F, 2.0F, 2.0F, 2.0F, -0.4F, false);
        bone67_r1.texOffs(132, 133).addBox(-2.5457F, -0.9807F, -0.6339F, 2.0F, 2.0F, 2.0F, -0.1F, false);
        bone67_r1.texOffs(127, 90).addBox(-1.7457F, -1.7807F, -0.4339F, 4.0F, 1.0F, 2.0F, -0.1F, false);
        bone67_r1.texOffs(11, 92).addBox(-2.7457F, -1.2807F, -0.4339F, 5.0F, 3.0F, 2.0F, -0.1F, false);

        incrementincrease = new ModelRenderer(this);
        incrementincrease.setPos(-1.0F, 2.0F, 1.0F);
        bone67.addChild(incrementincrease);
        incrementincrease.texOffs(96, 93).addBox(-22.5022F, 22.0124F, -20.5062F, 2.0F, 1.0F, 1.0F, -0.25F, false);

        bone68 = new ModelRenderer(this);
        bone68.setPos(-9.0F, -15.5F, -11.5F);
        side5.addChild(bone68);
        setRotationAngle(bone68, -1.0472F, 0.0F, 0.0F);
        bone68.texOffs(133, 14).addBox(-8.8098F, 29.9268F, -18.6062F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone69 = new ModelRenderer(this);
        bone69.setPos(0.0F, -2.0F, 0.0F);
        bone68.addChild(bone69);
        setRotationAngle(bone69, 0.0F, 0.0F, 0.4363F);
        bone69.texOffs(8, 117).addBox(5.5085F, 22.6587F, -18.6062F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone69.texOffs(0, 91).addBox(5.5085F, 26.6587F, -19.3062F, 2.0F, 4.0F, 1.0F, -0.1F, false);
        bone69.texOffs(0, 91).addBox(5.5085F, 26.6587F, -19.3062F, 2.0F, 4.0F, 1.0F, -0.1F, false);
        bone69.texOffs(115, 49).addBox(5.5085F, 23.6587F, -19.2062F, 2.0F, 2.0F, 1.0F, -0.1F, false);
        bone69.texOffs(115, 49).addBox(5.5085F, 23.6587F, -19.6062F, 2.0F, 2.0F, 1.0F, -0.2F, false);
        bone69.texOffs(112, 37).addBox(6.0085F, 24.2587F, -20.1062F, 1.0F, 1.0F, 1.0F, -0.2F, false);
        bone69.texOffs(96, 110).addBox(6.0085F, 30.4587F, -19.2062F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone69.texOffs(0, 0).addBox(5.5085F, 26.4087F, -18.7562F, 2.0F, 5.0F, 1.0F, -0.025F, false);
        bone69.texOffs(114, 26).addBox(5.5085F, 27.6587F, -19.7062F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        bone69.texOffs(104, 47).addBox(6.1085F, 26.6587F, -19.7062F, 1.0F, 4.0F, 1.0F, -0.3F, false);
        bone69.texOffs(104, 47).addBox(6.6085F, 26.6587F, -19.7062F, 1.0F, 4.0F, 1.0F, -0.3F, false);
        bone69.texOffs(68, 26).addBox(6.2585F, 29.4587F, -19.8562F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone69.texOffs(68, 26).addBox(6.4585F, 29.4587F, -19.8562F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        handbreak = new ModelRenderer(this);
        handbreak.setPos(6.0335F, 28.7587F, -19.4562F);
        bone69.addChild(handbreak);
        setRotationAngle(handbreak, -0.6109F, 0.0F, 0.0F);
        handbreak.texOffs(105, 30).addBox(-0.85F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        handbreak.texOffs(105, 30).addBox(-0.175F, 0.0F, -2.75F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        handbreak.texOffs(0, 0).addBox(0.175F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, -0.125F, false);
        handbreak.texOffs(0, 0).addBox(-0.225F, 0.0F, -2.75F, 0.0F, 0.0F, 3.0F, -0.125F, false);

        handbreak_r1 = new ModelRenderer(this);
        handbreak_r1.setPos(34.4665F, -38.2587F, -13.0438F);
        handbreak.addChild(handbreak_r1);
        setRotationAngle(handbreak_r1, 1.5708F, 0.0F, 0.0F);
        handbreak_r1.texOffs(0, 0).addBox(-33.8415F, 13.2587F, -40.2062F, 0.0F, 0.0F, 3.0F, -0.125F, false);
        handbreak_r1.texOffs(105, 49).addBox(-34.4665F, 13.2587F, -40.2062F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        handbreak_r1.texOffs(105, 49).addBox(-33.7915F, 13.2587F, -40.2062F, 1.0F, 0.0F, 0.0F, -0.2F, false);
        handbreak_r1.texOffs(0, 0).addBox(-33.4415F, 13.2587F, -40.2062F, 0.0F, 0.0F, 3.0F, -0.125F, false);

        bone70 = new ModelRenderer(this);
        bone70.setPos(5.0F, -15.5F, -11.5F);
        side5.addChild(bone70);
        setRotationAngle(bone70, -1.6581F, 0.0F, 0.0F);


        bone71 = new ModelRenderer(this);
        bone71.setPos(2.0F, -2.0F, 0.0F);
        bone70.addChild(bone71);
        setRotationAngle(bone71, 0.0F, 0.0F, -0.4363F);
        bone71.texOffs(82, 110).addBox(-25.4F, 18.3357F, 5.056F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone71.texOffs(36, 90).addBox(-25.4F, 18.3357F, 7.056F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone72 = new ModelRenderer(this);
        bone72.setPos(2.0F, -2.0F, 0.0F);
        bone70.addChild(bone72);
        setRotationAngle(bone72, 0.4363F, 0.0F, -0.4363F);
        bone72.texOffs(0, 123).addBox(-25.4F, 22.5581F, 2.9901F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        bone73 = new ModelRenderer(this);
        bone73.setPos(-9.0F, -15.5F, -11.5F);
        side5.addChild(bone73);
        setRotationAngle(bone73, -1.6581F, 0.0F, 0.0F);


        bone74 = new ModelRenderer(this);
        bone74.setPos(0.0F, -2.0F, 0.0F);
        bone73.addChild(bone74);
        setRotationAngle(bone74, 0.0F, 0.0F, 0.4363F);
        bone74.texOffs(106, 111).addBox(7.4312F, 25.782F, 5.056F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone74.texOffs(70, 90).addBox(7.4312F, 25.782F, 7.056F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone75 = new ModelRenderer(this);
        bone75.setPos(1.9634F, -11.0784F, 10.8321F);
        bone74.addChild(bone75);
        setRotationAngle(bone75, -1.1345F, 0.0F, 0.0F);
        bone75.texOffs(59, 97).addBox(5.4678F, 12.6553F, 34.7673F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        side6 = new ModelRenderer(this);
        side6.setPos(-32.0F, 3.0F, -8.0F);
        base.addChild(side6);
        setRotationAngle(side6, 0.0F, -1.0472F, 0.0F);


        bone76 = new ModelRenderer(this);
        bone76.setPos(0.0F, 0.0F, 0.0F);
        side6.addChild(bone76);
        bone76.texOffs(78, 41).addBox(15.1902F, -15.15F, -41.582F, 12.0F, 3.0F, 1.0F, 0.2F, false);
        bone76.texOffs(88, 110).addBox(15.3902F, -14.65F, -42.082F, 1.0F, 1.0F, 1.0F, 0.2F, false);
        bone76.texOffs(110, 55).addBox(15.3902F, -14.65F, -42.482F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone76.texOffs(88, 110).addBox(25.9902F, -14.65F, -42.082F, 1.0F, 1.0F, 1.0F, 0.2F, false);
        bone76.texOffs(110, 55).addBox(25.9902F, -14.65F, -42.482F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone76.texOffs(95, 104).addBox(18.1902F, -23.1F, -32.832F, 6.0F, 4.0F, 2.0F, 0.0F, false);
        bone76.texOffs(86, 81).addBox(18.2652F, -23.3F, -33.932F, 6.0F, 1.0F, 1.0F, -0.2F, false);
        bone76.texOffs(88, 45).addBox(21.2652F, -25.0F, -33.932F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone76.texOffs(88, 45).addBox(19.2652F, -24.0F, -33.932F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone76.texOffs(86, 81).addBox(18.2652F, -22.9F, -33.932F, 6.0F, 1.0F, 1.0F, -0.3F, false);
        bone76.texOffs(86, 81).addBox(18.2652F, -21.5F, -33.932F, 6.0F, 1.0F, 1.0F, -0.3F, false);
        bone76.texOffs(0, 104).addBox(18.1902F, -23.2F, -33.932F, 1.0F, 4.0F, 1.0F, -0.2F, false);
        bone76.texOffs(0, 104).addBox(23.2902F, -23.2F, -33.932F, 1.0F, 4.0F, 1.0F, -0.2F, false);
        bone76.texOffs(30, 0).addBox(16.1902F, -20.1F, -30.832F, 10.0F, 1.0F, 13.0F, 0.0F, false);
        bone76.texOffs(30, 0).addBox(16.1902F, -6.1F, -30.832F, 10.0F, 1.0F, 13.0F, 0.0F, false);
        bone76.texOffs(130, 78).addBox(20.1902F, -25.7F, -32.832F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        bone76.texOffs(11, 104).addBox(19.2163F, -25.9191F, -32.832F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone76.texOffs(11, 104).addBox(21.1642F, -25.9191F, -32.832F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        bone76.texOffs(6, 129).addBox(13.1902F, -15.65F, -41.882F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone76.texOffs(62, 28).addBox(11.4964F, -15.65F, -40.0124F, 3.0F, 4.0F, 2.0F, 0.0F, false);
        bone76.texOffs(128, 125).addBox(27.1902F, -15.65F, -41.882F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        bone76.texOffs(46, 51).addBox(27.7402F, -15.65F, -40.1026F, 3.0F, 4.0F, 2.0F, 0.0F, false);

        bone82_r1 = new ModelRenderer(this);
        bone82_r1.setPos(21.7733F, -25.5F, -33.1438F);
        bone76.addChild(bone82_r1);
        setRotationAngle(bone82_r1, 0.0F, -1.6144F, 0.5236F);
        bone82_r1.texOffs(88, 45).addBox(-0.9622F, -0.5F, -0.5098F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone78_r1 = new ModelRenderer(this);
        bone78_r1.setPos(21.7733F, -25.5F, -33.1438F);
        bone76.addChild(bone78_r1);
        setRotationAngle(bone78_r1, 0.0F, 0.0F, 0.5236F);
        bone78_r1.texOffs(88, 45).addBox(-1.0081F, -0.5F, -0.5382F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone80_r1 = new ModelRenderer(this);
        bone80_r1.setPos(21.7733F, -25.5F, -33.1438F);
        bone76.addChild(bone80_r1);
        setRotationAngle(bone80_r1, 0.0F, 0.0F, 2.618F);
        bone80_r1.texOffs(88, 45).addBox(-0.9959F, -0.4929F, -0.5382F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone79_r1 = new ModelRenderer(this);
        bone79_r1.setPos(21.7733F, -25.5F, -33.1438F);
        bone76.addChild(bone79_r1);
        setRotationAngle(bone79_r1, 0.0F, 0.0F, 1.4835F);
        bone79_r1.texOffs(88, 45).addBox(-1.0047F, -0.4933F, -0.5382F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone80_r2 = new ModelRenderer(this);
        bone80_r2.setPos(20.2652F, -23.5F, -33.432F);
        bone76.addChild(bone80_r2);
        setRotationAngle(bone80_r2, 0.0F, 0.0F, 2.0944F);
        bone80_r2.texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone79_r2 = new ModelRenderer(this);
        bone79_r2.setPos(20.2652F, -23.5F, -33.432F);
        bone76.addChild(bone79_r2);
        setRotationAngle(bone79_r2, 0.0F, 0.0F, 0.9599F);
        bone79_r2.texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone82_r2 = new ModelRenderer(this);
        bone82_r2.setPos(18.5331F, -24.5F, -33.432F);
        bone76.addChild(bone82_r2);
        setRotationAngle(bone82_r2, 0.0F, -1.6144F, 0.0F);
        bone82_r2.texOffs(88, 45).addBox(-1.0F, 0.5F, -2.25F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone81_r1 = new ModelRenderer(this);
        bone81_r1.setPos(20.5331F, -25.5F, -33.432F);
        bone76.addChild(bone81_r1);
        setRotationAngle(bone81_r1, 0.0F, -1.6144F, 0.0F);
        bone81_r1.texOffs(88, 45).addBox(-1.0F, 0.5F, -2.25F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone81_r1.texOffs(88, 45).addBox(-0.5F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone79_r3 = new ModelRenderer(this);
        bone79_r3.setPos(22.2652F, -24.5F, -33.432F);
        bone76.addChild(bone79_r3);
        setRotationAngle(bone79_r3, 0.0F, 0.0F, 2.0944F);
        bone79_r3.texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone81_r2 = new ModelRenderer(this);
        bone81_r2.setPos(20.5365F, -25.4869F, -32.932F);
        bone76.addChild(bone81_r2);
        setRotationAngle(bone81_r2, 0.0F, 0.0F, -3.098F);
        bone81_r2.texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone80_r3 = new ModelRenderer(this);
        bone80_r3.setPos(20.5365F, -25.4869F, -32.932F);
        bone76.addChild(bone80_r3);
        setRotationAngle(bone80_r3, 0.0F, 0.0F, 2.0071F);
        bone80_r3.texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone79_r4 = new ModelRenderer(this);
        bone79_r4.setPos(22.2652F, -24.5F, -33.432F);
        bone76.addChild(bone79_r4);
        setRotationAngle(bone79_r4, 0.0F, 0.0F, 0.9599F);
        bone79_r4.texOffs(88, 45).addBox(-2.8F, 0.35F, 0.0F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone79_r4.texOffs(88, 45).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3F, false);

        bone147 = new ModelRenderer(this);
        bone147.setPos(24.2733F, -16.6497F, -40.4036F);
        bone76.addChild(bone147);


        bone147_r1 = new ModelRenderer(this);
        bone147_r1.setPos(-2.0F, -7.8503F, -0.9902F);
        bone147.addChild(bone147_r1);
        setRotationAngle(bone147_r1, 0.0F, 0.0F, 1.5708F);
        bone147_r1.texOffs(88, 45).addBox(7.0378F, -2.5F, 0.4902F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone147_r1.texOffs(101, 61).addBox(7.2878F, -3.0F, 0.4902F, 1.0F, 2.0F, 1.0F, -0.3F, false);

        bone147_r2 = new ModelRenderer(this);
        bone147_r2.setPos(0.0F, -0.0625F, 0.0F);
        bone147.addChild(bone147_r2);
        setRotationAngle(bone147_r2, 0.8727F, 0.0F, 1.5708F);
        bone147_r2.texOffs(101, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3F, false);

        bone147_r3 = new ModelRenderer(this);
        bone147_r3.setPos(0.0F, -0.0625F, 0.0F);
        bone147.addChild(bone147_r3);
        setRotationAngle(bone147_r3, 2.0508F, 0.0F, 1.5708F);
        bone147_r3.texOffs(101, 61).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3F, false);

        facingcontrol = new ModelRenderer(this);
        facingcontrol.setPos(21.3652F, -24.2F, -33.4654F);
        bone76.addChild(facingcontrol);


        bone77 = new ModelRenderer(this);
        bone77.setPos(-4.0F, -23.1F, -2.7F);
        bone76.addChild(bone77);
        setRotationAngle(bone77, 0.0F, 0.0F, 0.3491F);
        bone77.texOffs(130, 78).addBox(20.852F, -10.5895F, -30.132F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone78 = new ModelRenderer(this);
        bone78.setPos(2.0F, -23.1F, -2.7F);
        bone76.addChild(bone78);
        setRotationAngle(bone78, 0.0F, 0.0F, -0.3491F);
        bone78.texOffs(130, 78).addBox(18.852F, 4.5895F, -30.132F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        bone79 = new ModelRenderer(this);
        bone79.setPos(-1.1F, -20.4268F, -2.6F);
        bone76.addChild(bone79);
        setRotationAngle(bone79, 0.5236F, 0.0F, 0.0F);
        bone79.texOffs(78, 55).addBox(19.7902F, -15.066F, -27.0951F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone79.texOffs(30, 11).addBox(19.7902F, -15.516F, -26.7201F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        bone79.texOffs(70, 81).addBox(19.2902F, -15.066F, -28.0951F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone79.texOffs(38, 78).addBox(17.2902F, -15.066F, -31.0951F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        bone79.texOffs(10, 67).addBox(18.2902F, -0.566F, -37.6951F, 8.0F, 1.0F, 4.0F, 0.0F, false);
        bone79.texOffs(78, 29).addBox(16.2902F, -15.066F, -33.0951F, 12.0F, 1.0F, 2.0F, 0.0F, false);
        bone79.texOffs(63, 4).addBox(16.2902F, -15.066F, -36.0951F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone79.texOffs(63, 4).addBox(16.2902F, -15.066F, -36.0951F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone79.texOffs(103, 61).addBox(19.2902F, -15.066F, -39.3951F, 6.0F, 1.0F, 3.0F, -0.2F, false);
        bone79.texOffs(68, 26).addBox(19.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(19.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(88, 88).addBox(20.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(20.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(20.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(88, 88).addBox(21.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(21.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(21.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(22.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(22.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(11, 107).addBox(23.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(23.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(23.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(88, 88).addBox(19.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(88, 88).addBox(19.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(88, 88).addBox(24.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(19.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(19.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(88, 88).addBox(20.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(20.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(20.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(21.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(21.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(11, 107).addBox(22.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(11, 107).addBox(22.2902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(11, 107).addBox(21.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(22.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(22.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(11, 107).addBox(23.7902F, -15.266F, -37.4951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(23.7902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(23.7902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(24.2902F, -15.266F, -38.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(24.2902F, -15.266F, -38.6951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(19.7902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(20.2902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(38, 82).addBox(20.7902F, -15.266F, -39.1951F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(22.7902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(22.2902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(23.2902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        bone79.texOffs(68, 26).addBox(23.7902F, -15.266F, -39.1951F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        bone149 = new ModelRenderer(this);
        bone149.setPos(22.3281F, -16.1554F, -31.8778F);
        bone79.addChild(bone149);
        setRotationAngle(bone149, 0.0F, -0.6109F, 0.0F);
        bone149.texOffs(57, 132).addBox(-1.0385F, -0.0538F, -0.9615F, 2.0F, 2.0F, 2.0F, -0.3F, false);
        bone149.texOffs(26, 105).addBox(0.8615F, 0.2462F, -0.3615F, 1.0F, 1.0F, 1.0F, -0.275F, false);
        bone149.texOffs(79, 102).addBox(-0.4385F, 0.2462F, -1.4615F, 1.0F, 1.0F, 2.0F, -0.3F, false);
        bone149.texOffs(63, 86).addBox(-0.4385F, 0.2462F, -1.7615F, 1.0F, 1.0F, 1.0F, -0.275F, false);
        bone149.texOffs(0, 96).addBox(-0.1385F, 0.2462F, -0.3615F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone149.texOffs(26, 105).addBox(-0.9385F, -0.9538F, -0.8615F, 1.0F, 1.0F, 1.0F, -0.275F, false);
        bone149.texOffs(27, 109).addBox(-0.9385F, -0.7538F, -0.8615F, 1.0F, 2.0F, 1.0F, -0.3F, false);
        bone149.texOffs(27, 109).addBox(-0.1385F, -0.7538F, -0.3615F, 1.0F, 2.0F, 1.0F, -0.3F, false);
        bone149.texOffs(93, 104).addBox(-0.1385F, -0.9538F, -0.3615F, 1.0F, 1.0F, 1.0F, -0.275F, false);
        bone149.texOffs(93, 104).addBox(-1.7385F, 0.2462F, -0.5615F, 1.0F, 1.0F, 1.0F, -0.275F, false);
        bone149.texOffs(0, 96).addBox(-1.6385F, 0.2462F, -0.5615F, 2.0F, 1.0F, 1.0F, -0.3F, false);
        bone149.texOffs(63, 86).addBox(-0.6385F, 0.2462F, 0.8385F, 1.0F, 1.0F, 1.0F, -0.275F, false);
        bone149.texOffs(79, 102).addBox(-0.6385F, 0.2462F, -0.3615F, 1.0F, 1.0F, 2.0F, -0.3F, false);

        bone80 = new ModelRenderer(this);
        bone80.setPos(-1.1F, -12.1499F, -0.5857F);
        bone76.addChild(bone80);
        setRotationAngle(bone80, -0.0873F, 0.0F, 0.0F);
        bone80.texOffs(30, 14).addBox(19.7902F, 2.6262F, -31.0174F, 5.0F, 9.0F, 1.0F, 0.0F, false);
        bone80.texOffs(0, 70).addBox(19.2902F, 2.6262F, -32.0174F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        bone80.texOffs(68, 84).addBox(17.7902F, 2.6262F, -35.0174F, 9.0F, 1.0F, 3.0F, 0.0F, false);
        bone80.texOffs(63, 0).addBox(16.2902F, 2.6262F, -38.0174F, 12.0F, 1.0F, 3.0F, 0.0F, false);
        bone80.texOffs(52, 62).addBox(16.2902F, 2.6262F, -40.0174F, 12.0F, 1.0F, 3.0F, 0.0F, false);

        bone81 = new ModelRenderer(this);
        bone81.setPos(5.0F, -15.5F, -11.5F);
        side6.addChild(bone81);
        setRotationAngle(bone81, -1.0472F, 0.0F, 0.0F);
        bone81.texOffs(49, 132).addBox(22.1902F, 24.2366F, -15.3209F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone82 = new ModelRenderer(this);
        bone82.setPos(2.0F, -2.0F, 0.0F);
        bone81.addChild(bone82);
        setRotationAngle(bone82, 0.0F, 0.0F, -0.4363F);
        bone82.texOffs(51, 115).addBox(7.0231F, 23.1564F, -15.3209F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone82.texOffs(128, 6).addBox(7.0231F, 26.9564F, -15.7209F, 2.0F, 4.0F, 2.0F, -0.1F, false);
        bone82.texOffs(52, 38).addBox(7.6231F, 24.1564F, -15.7209F, 0.0F, 2.0F, 2.0F, -0.1F, false);
        bone82.texOffs(52, 38).addBox(8.0231F, 24.1564F, -15.7209F, 0.0F, 2.0F, 2.0F, -0.1F, false);
        bone82.texOffs(46, 46).addBox(8.6231F, 24.1564F, -15.7209F, 0.0F, 1.0F, 2.0F, -0.2F, false);
        bone82.texOffs(46, 46).addBox(8.6231F, 25.1564F, -15.7209F, 0.0F, 1.0F, 2.0F, -0.2F, false);
        bone82.texOffs(46, 46).addBox(8.6231F, 24.1564F, -15.7209F, 0.0F, 1.0F, 2.0F, -0.2F, false);
        bone82.texOffs(30, 132).addBox(7.0231F, 26.9564F, -16.1209F, 2.0F, 2.0F, 2.0F, -0.3F, false);
        bone82.texOffs(30, 132).addBox(7.0231F, 28.9564F, -16.1209F, 2.0F, 2.0F, 2.0F, -0.3F, false);
        bone82.texOffs(17, 84).addBox(7.5231F, 29.4314F, -16.3209F, 1.0F, 1.0F, 2.0F, -0.4F, false);
        bone82.texOffs(82, 88).addBox(7.5231F, 27.4064F, -16.3209F, 1.0F, 1.0F, 2.0F, -0.4F, false);

        bone83 = new ModelRenderer(this);
        bone83.setPos(-9.0F, -15.5F, -11.5F);
        side6.addChild(bone83);
        setRotationAngle(bone83, -1.0472F, 0.0F, 0.0F);
        bone83.texOffs(126, 131).addBox(22.1902F, 24.2366F, -15.3209F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        bone84 = new ModelRenderer(this);
        bone84.setPos(0.0F, -2.0F, 0.0F);
        bone83.addChild(bone84);
        setRotationAngle(bone84, 0.0F, 0.0F, 0.4363F);
        bone84.texOffs(115, 37).addBox(31.1993F, 4.4005F, -15.3209F, 2.0F, 10.0F, 2.0F, 0.0F, false);
        bone84.texOffs(70, 90).addBox(31.1993F, 10.3005F, -16.3209F, 2.0F, 4.0F, 1.0F, 0.0F, false);
        bone84.texOffs(27, 0).addBox(33.2993F, 12.3005F, -16.3209F, 0.0F, 2.0F, 1.0F, -0.1F, false);
        bone84.texOffs(27, 0).addBox(31.0993F, 12.3005F, -16.3209F, 0.0F, 2.0F, 1.0F, -0.1F, false);
        bone84.texOffs(0, 84).addBox(31.2993F, 10.4005F, -16.9209F, 1.0F, 4.0F, 1.0F, -0.2F, false);
        bone84.texOffs(0, 84).addBox(32.0993F, 10.4005F, -16.9209F, 1.0F, 4.0F, 1.0F, -0.2F, false);
        bone84.texOffs(90, 0).addBox(31.1993F, 6.3005F, -15.8209F, 2.0F, 1.0F, 1.0F, -0.1F, false);
        bone84.texOffs(104, 29).addBox(31.1993F, 7.8005F, -15.5209F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone84.texOffs(17, 104).addBox(32.1993F, 7.8005F, -15.5209F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone84.texOffs(54, 103).addBox(31.0993F, 6.3005F, -16.3209F, 1.0F, 1.0F, 1.0F, -0.1F, false);
        bone84.texOffs(54, 103).addBox(32.2993F, 6.3005F, -16.3209F, 1.0F, 1.0F, 1.0F, -0.1F, false);

        refuel = new ModelRenderer(this);
        refuel.setPos(32.2493F, 13.4005F, -16.0209F);
        bone84.addChild(refuel);
        setRotationAngle(refuel, 0.4363F, 0.0F, 0.0F);
        refuel.texOffs(32, 101).addBox(0.35F, -0.5F, -2.8F, 1.0F, 1.0F, 1.0F, -0.15F, false);
        refuel.texOffs(131, 34).addBox(0.35F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        refuel.texOffs(131, 34).addBox(-1.35F, -0.5F, -2.2F, 1.0F, 1.0F, 3.0F, -0.25F, false);
        refuel.texOffs(32, 101).addBox(-1.35F, -0.5F, -2.8F, 1.0F, 1.0F, 1.0F, -0.15F, false);

        bone85 = new ModelRenderer(this);
        bone85.setPos(5.0F, -15.5F, -11.5F);
        side6.addChild(bone85);
        setRotationAngle(bone85, -1.6581F, 0.0F, 0.0F);


        bone86 = new ModelRenderer(this);
        bone86.setPos(2.0F, -2.0F, 0.0F);
        bone85.addChild(bone86);
        setRotationAngle(bone86, 0.0F, 0.0F, -0.4363F);
        bone86.texOffs(0, 110).addBox(5.4618F, 25.5046F, 4.4833F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone86.texOffs(59, 88).addBox(5.4618F, 25.5046F, 6.4833F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone87 = new ModelRenderer(this);
        bone87.setPos(2.0F, -2.0F, 0.0F);
        bone85.addChild(bone87);
        setRotationAngle(bone87, 0.4363F, 0.0F, -0.4363F);
        bone87.texOffs(46, 40).addBox(5.4618F, 28.8133F, -0.5587F, 2.0F, 6.0F, 2.0F, 0.0F, false);

        bone88 = new ModelRenderer(this);
        bone88.setPos(-9.0F, -15.5F, -11.5F);
        side6.addChild(bone88);
        setRotationAngle(bone88, -1.6581F, 0.0F, 0.0F);


        bone89 = new ModelRenderer(this);
        bone89.setPos(0.0F, -2.0F, 0.0F);
        bone88.addChild(bone89);
        setRotationAngle(bone89, 0.0F, 0.0F, 0.4363F);
        bone89.texOffs(74, 114).addBox(32.7605F, 6.7486F, 4.4833F, 2.0F, 11.0F, 2.0F, 0.0F, false);
        bone89.texOffs(85, 84).addBox(32.7605F, 6.7486F, 6.4833F, 2.0F, 2.0F, 7.0F, 0.0F, false);

        bone90 = new ModelRenderer(this);
        bone90.setPos(1.9634F, -11.0784F, 10.8321F);
        bone89.addChild(bone90);
        setRotationAngle(bone90, -1.1345F, 0.0F, 0.0F);
        bone90.texOffs(30, 99).addBox(30.7971F, 5.1304F, 17.2752F, 2.0F, 2.0F, 6.0F, 0.0F, false);

        bone95 = new ModelRenderer(this);
        bone95.setPos(0.0F, 1.0F, -1.0F);
        base.addChild(bone95);


        bone94 = new ModelRenderer(this);
        bone94.setPos(5.5726F, 6.8804F, 8.652F);
        bone95.addChild(bone94);
        setRotationAngle(bone94, -0.3491F, 0.5236F, 0.0F);
        bone94.texOffs(104, 47).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        bone93 = new ModelRenderer(this);
        bone93.setPos(4.2239F, -1.0891F, 6.3161F);
        bone95.addChild(bone93);
        setRotationAngle(bone93, 0.0F, 0.5236F, 0.0F);
        bone93.texOffs(36, 61).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        bone92 = new ModelRenderer(this);
        bone92.setPos(5.2239F, -1.0891F, 8.0481F);
        bone95.addChild(bone92);
        setRotationAngle(bone92, 0.0873F, 0.5236F, 0.0F);
        bone92.texOffs(30, 28).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        bone91 = new ModelRenderer(this);
        bone91.setPos(0.0F, 0.0F, 0.0F);
        bone95.addChild(bone91);
        setRotationAngle(bone91, -0.5236F, 0.5236F, 0.0F);
        bone91.texOffs(62, 47).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);
        bone91.texOffs(67, 127).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, 0.0F, false);

        bone92_r1 = new ModelRenderer(this);
        bone92_r1.setPos(-0.5999F, -21.3182F, 8.4414F);
        bone91.addChild(bone92_r1);
        setRotationAngle(bone92_r1, 2.0071F, 0.0F, 0.0F);
        bone92_r1.texOffs(21, 1).addBox(-1.0392F, -1.5531F, 1.0054F, 1.0F, 1.0F, 0.0F, -0.15F, false);
        bone92_r1.texOffs(12, 0).addBox(-1.0392F, -1.5531F, -1.4946F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone92_r1.texOffs(118, 64).addBox(-0.9892F, -1.5531F, -3.6946F, 1.0F, 1.0F, 5.0F, -0.25F, false);

        bone91_r1 = new ModelRenderer(this);
        bone91_r1.setPos(-0.1309F, -21.6141F, 8.4707F);
        bone91.addChild(bone91_r1);
        setRotationAngle(bone91_r1, 2.0071F, 0.2618F, 0.0F);
        bone91_r1.texOffs(95, 98).addBox(-0.1082F, -1.0047F, 0.7496F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        bone91_r1.texOffs(23, 77).addBox(-1.5582F, -2.4047F, -3.9504F, 4.0F, 4.0F, 7.0F, -2.25F, false);
        bone91_r1.texOffs(12, 0).addBox(-0.1082F, -1.0047F, -1.7504F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        bone96 = new ModelRenderer(this);
        bone96.setPos(-0.95F, 1.0F, -0.4F);
        base.addChild(bone96);
        setRotationAngle(bone96, 0.0F, -1.0472F, 0.0F);


        bone97 = new ModelRenderer(this);
        bone97.setPos(5.5726F, 6.8804F, 8.652F);
        bone96.addChild(bone97);
        setRotationAngle(bone97, -0.3491F, 0.5236F, 0.0F);
        bone97.texOffs(107, 65).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        bone98 = new ModelRenderer(this);
        bone98.setPos(4.2239F, -1.0891F, 6.3161F);
        bone96.addChild(bone98);
        setRotationAngle(bone98, 0.0F, 0.5236F, 0.0F);
        bone98.texOffs(55, 14).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        bone99 = new ModelRenderer(this);
        bone99.setPos(5.2239F, -1.0891F, 8.0481F);
        bone96.addChild(bone99);
        setRotationAngle(bone99, 0.0873F, 0.5236F, 0.0F);
        bone99.texOffs(62, 36).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        bone100 = new ModelRenderer(this);
        bone100.setPos(0.0F, 0.0F, 0.0F);
        bone96.addChild(bone100);
        setRotationAngle(bone100, -0.5236F, 0.5236F, 0.0F);
        bone100.texOffs(36, 62).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);
        bone100.texOffs(29, 96).addBox(-1.5891F, -22.3713F, 2.0468F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone100.texOffs(46, 57).addBox(-2.731F, -22.0101F, 1.2854F, 4.0F, 1.0F, 1.0F, -0.1F, false);
        bone100.texOffs(68, 107).addBox(-1.5891F, -22.3713F, 2.5468F, 2.0F, 2.0F, 5.0F, -0.1F, false);
        bone100.texOffs(29, 96).addBox(-1.5891F, -22.3713F, 7.0468F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone100.texOffs(118, 64).addBox(-0.9891F, -21.9713F, 4.8468F, 1.0F, 1.0F, 5.0F, -0.25F, false);
        bone100.texOffs(19, 0).addBox(-1.4891F, -22.5713F, 9.2468F, 2.0F, 2.0F, 1.0F, -0.15F, false);
        bone100.texOffs(127, 31).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, 0.0F, false);

        bone101 = new ModelRenderer(this);
        bone101.setPos(-1.9F, 1.0F, -0.6F);
        base.addChild(bone101);
        setRotationAngle(bone101, 0.0F, -2.0944F, 0.0F);


        bone102 = new ModelRenderer(this);
        bone102.setPos(5.5726F, 6.8804F, 8.652F);
        bone101.addChild(bone102);
        setRotationAngle(bone102, -0.3491F, 0.5236F, 0.0F);
        bone102.texOffs(27, 107).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        bone103 = new ModelRenderer(this);
        bone103.setPos(4.2239F, -1.0891F, 6.3161F);
        bone101.addChild(bone103);
        setRotationAngle(bone103, 0.0F, 0.5236F, 0.0F);
        bone103.texOffs(30, 50).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        bone104 = new ModelRenderer(this);
        bone104.setPos(5.2239F, -1.0891F, 8.0481F);
        bone101.addChild(bone104);
        setRotationAngle(bone104, 0.0873F, 0.5236F, 0.0F);
        bone104.texOffs(62, 25).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        bone105 = new ModelRenderer(this);
        bone105.setPos(0.0F, 0.0F, 0.0F);
        bone101.addChild(bone105);
        setRotationAngle(bone105, -0.5236F, 0.5236F, 0.0F);
        bone105.texOffs(20, 61).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);
        bone105.texOffs(125, 64).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        bone105.texOffs(19, 0).addBox(-1.7391F, -22.4713F, 9.1468F, 2.0F, 2.0F, 1.0F, -0.15F, false);
        bone105.texOffs(118, 64).addBox(-1.2391F, -21.8713F, 4.7468F, 1.0F, 1.0F, 5.0F, -0.25F, false);
        bone105.texOffs(29, 96).addBox(-1.8391F, -22.2713F, 6.9468F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone105.texOffs(68, 107).addBox(-1.8391F, -22.2713F, 2.4468F, 2.0F, 2.0F, 5.0F, -0.1F, false);
        bone105.texOffs(29, 96).addBox(-1.8391F, -22.2713F, 1.9468F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        bone106 = new ModelRenderer(this);
        bone106.setPos(-2.0F, 1.0F, -1.9F);
        base.addChild(bone106);
        setRotationAngle(bone106, 0.0F, 3.1416F, 0.0F);


        bone107 = new ModelRenderer(this);
        bone107.setPos(5.5726F, 6.8804F, 8.652F);
        bone106.addChild(bone107);
        setRotationAngle(bone107, -0.3491F, 0.5236F, 0.0F);
        bone107.texOffs(106, 105).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        bone108 = new ModelRenderer(this);
        bone108.setPos(4.2239F, -1.0891F, 6.3161F);
        bone106.addChild(bone108);
        setRotationAngle(bone108, 0.0F, 0.5236F, 0.0F);
        bone108.texOffs(46, 28).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        bone109 = new ModelRenderer(this);
        bone109.setPos(5.2239F, -1.0891F, 8.0481F);
        bone106.addChild(bone109);
        setRotationAngle(bone109, 0.0873F, 0.5236F, 0.0F);
        bone109.texOffs(55, 14).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        bone110 = new ModelRenderer(this);
        bone110.setPos(0.0F, 0.0F, 0.0F);
        bone106.addChild(bone110);
        setRotationAngle(bone110, -0.5236F, 0.5236F, 0.0F);
        bone110.texOffs(46, 51).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);
        bone110.texOffs(52, 70).addBox(-2.2141F, -21.0713F, 0.6468F, 3.0F, 1.0F, 1.0F, -0.2F, false);
        bone110.texOffs(109, 102).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, 0.0F, false);
        bone110.texOffs(19, 0).addBox(-1.6391F, -22.5713F, 9.3468F, 2.0F, 2.0F, 1.0F, -0.15F, false);
        bone110.texOffs(118, 64).addBox(-1.0391F, -22.0713F, 4.9468F, 1.0F, 1.0F, 5.0F, -0.25F, false);
        bone110.texOffs(29, 96).addBox(-1.6391F, -22.4713F, 7.1468F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone110.texOffs(68, 107).addBox(-1.6391F, -22.4713F, 2.6468F, 2.0F, 2.0F, 5.0F, -0.1F, false);
        bone110.texOffs(29, 96).addBox(-1.6391F, -22.4713F, 2.1468F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        bone111 = new ModelRenderer(this);
        bone111.setPos(-0.925F, 1.0F, -2.4F);
        base.addChild(bone111);
        setRotationAngle(bone111, 0.0F, 2.0944F, 0.0F);


        bone112 = new ModelRenderer(this);
        bone112.setPos(5.5726F, 6.8804F, 8.652F);
        bone111.addChild(bone112);
        setRotationAngle(bone112, -0.3491F, 0.5236F, 0.0F);
        bone112.texOffs(0, 104).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        bone113 = new ModelRenderer(this);
        bone113.setPos(4.2239F, -1.0891F, 6.3161F);
        bone111.addChild(bone113);
        setRotationAngle(bone113, 0.0F, 0.5236F, 0.0F);
        bone113.texOffs(30, 39).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        bone114 = new ModelRenderer(this);
        bone114.setPos(5.2239F, -1.0891F, 8.0481F);
        bone111.addChild(bone114);
        setRotationAngle(bone114, 0.0873F, 0.5236F, 0.0F);
        bone114.texOffs(30, 50).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        bone115 = new ModelRenderer(this);
        bone115.setPos(0.0F, 0.0F, 0.0F);
        bone111.addChild(bone115);
        setRotationAngle(bone115, -0.5236F, 0.5236F, 0.0F);
        bone115.texOffs(46, 40).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);
        bone115.texOffs(68, 107).addBox(-1.6141F, -22.4445F, 2.3468F, 2.0F, 2.0F, 5.0F, -0.1F, false);
        bone115.texOffs(118, 64).addBox(-1.0141F, -21.8713F, 4.7468F, 1.0F, 1.0F, 5.0F, -0.25F, false);
        bone115.texOffs(29, 96).addBox(-1.6141F, -22.4445F, 1.8468F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone115.texOffs(29, 96).addBox(-1.6141F, -22.4445F, 6.8468F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone115.texOffs(19, 0).addBox(-1.6141F, -22.4445F, 9.0468F, 2.0F, 2.0F, 1.0F, -0.15F, false);
        bone115.texOffs(62, 58).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, 0.0F, false);

        bone116 = new ModelRenderer(this);
        bone116.setPos(-0.225F, 1.0F, -2.325F);
        base.addChild(bone116);
        setRotationAngle(bone116, 0.0F, 1.0472F, 0.0F);


        bone117 = new ModelRenderer(this);
        bone117.setPos(5.5726F, 6.8804F, 8.652F);
        bone116.addChild(bone117);
        setRotationAngle(bone117, -0.3491F, 0.5236F, 0.0F);
        bone117.texOffs(103, 27).addBox(-2.6141F, -7.8713F, -5.2282F, 3.0F, 1.0F, 5.0F, 0.0F, false);

        bone118 = new ModelRenderer(this);
        bone118.setPos(4.2239F, -1.0891F, 6.3161F);
        bone116.addChild(bone118);
        setRotationAngle(bone118, 0.0F, 0.5236F, 0.0F);
        bone118.texOffs(30, 28).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 8.0F, 2.0F, 0.0F, false);

        bone119 = new ModelRenderer(this);
        bone119.setPos(5.2239F, -1.0891F, 8.0481F);
        bone116.addChild(bone119);
        setRotationAngle(bone119, 0.0873F, 0.5236F, 0.0F);
        bone119.texOffs(46, 29).addBox(-2.6141F, -8.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);

        bone120 = new ModelRenderer(this);
        bone120.setPos(0.0F, 0.0F, 0.0F);
        bone116.addChild(bone120);
        setRotationAngle(bone120, -0.5236F, 0.5236F, 0.0F);
        bone120.texOffs(30, 39).addBox(-2.6141F, -19.8713F, -1.5532F, 3.0F, 1.0F, 10.0F, 0.0F, false);
        bone120.texOffs(29, 96).addBox(-1.8141F, -22.2713F, 1.8718F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone120.texOffs(68, 107).addBox(-1.8141F, -22.2713F, 2.3718F, 2.0F, 2.0F, 5.0F, -0.1F, false);
        bone120.texOffs(29, 96).addBox(-1.8141F, -22.2713F, 6.8718F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        bone120.texOffs(118, 64).addBox(-1.2141F, -21.8713F, 4.6718F, 1.0F, 1.0F, 5.0F, -0.25F, false);
        bone120.texOffs(19, 0).addBox(-1.8141F, -22.3713F, 9.0718F, 2.0F, 2.0F, 1.0F, -0.15F, false);
        bone120.texOffs(30, 24).addBox(-2.6141F, -19.8713F, -3.5532F, 4.0F, 1.0F, 2.0F, 0.0F, false);

        circle = new ModelRenderer(this);
        circle.setPos(2.5F, -25.0F, -57.5F);
        base.addChild(circle);


        bone128 = new ModelRenderer(this);
        bone128.setPos(0.0F, 0.0F, 50.0F);
        circle.addChild(bone128);


        bone129 = new ModelRenderer(this);
        bone129.setPos(0.0F, 0.0F, 50.0F);
        circle.addChild(bone129);
        setRotationAngle(bone129, 0.0F, -1.0472F, 0.0F);


        bone130 = new ModelRenderer(this);
        bone130.setPos(0.0F, 0.0F, 50.0F);
        circle.addChild(bone130);
        setRotationAngle(bone130, 0.0F, -2.0944F, 0.0F);


        bone131 = new ModelRenderer(this);
        bone131.setPos(0.0F, 0.0F, 50.0F);
        circle.addChild(bone131);


        circle2 = new ModelRenderer(this);
        circle2.setPos(2.5F, -37.0F, -57.5F);
        base.addChild(circle2);


        bone132 = new ModelRenderer(this);
        bone132.setPos(0.0F, 0.0F, 50.0F);
        circle2.addChild(bone132);
        bone132.texOffs(101, 21).addBox(-8.0F, -11.0F, 2.3F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        bone133 = new ModelRenderer(this);
        bone133.setPos(0.0F, 0.0F, 50.0F);
        circle2.addChild(bone133);
        setRotationAngle(bone133, 0.0F, -1.0472F, 0.0F);


        bone134 = new ModelRenderer(this);
        bone134.setPos(0.0F, 0.0F, 50.0F);
        circle2.addChild(bone134);
        setRotationAngle(bone134, 0.0F, -2.0944F, 0.0F);


        bone135 = new ModelRenderer(this);
        bone135.setPos(0.0F, 0.0F, 50.0F);
        circle2.addChild(bone135);
        bone135.texOffs(101, 3).addBox(-8.0F, -11.0F, 9.0244F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        circle3 = new ModelRenderer(this);
        circle3.setPos(2.5F, -49.0F, -57.5F);
        base.addChild(circle3);


        bone136 = new ModelRenderer(this);
        bone136.setPos(0.0F, 0.0F, 50.0F);
        circle3.addChild(bone136);


        bone137 = new ModelRenderer(this);
        bone137.setPos(0.0F, 0.0F, 50.0F);
        circle3.addChild(bone137);
        setRotationAngle(bone137, 0.0F, -1.0472F, 0.0F);


        bone138 = new ModelRenderer(this);
        bone138.setPos(0.0F, 0.0F, 50.0F);
        circle3.addChild(bone138);
        setRotationAngle(bone138, 0.0F, -2.0944F, 0.0F);


        bone139 = new ModelRenderer(this);
        bone139.setPos(0.0F, 0.0F, 50.0F);
        circle3.addChild(bone139);


        circle4 = new ModelRenderer(this);
        circle4.setPos(2.5F, -41.0F, -57.5F);
        base.addChild(circle4);


        bone142 = new ModelRenderer(this);
        bone142.setPos(0.0F, 0.0F, 50.0F);
        circle4.addChild(bone142);


        bone143 = new ModelRenderer(this);
        bone143.setPos(0.0F, 0.0F, 50.0F);
        circle4.addChild(bone143);
        setRotationAngle(bone143, 0.0F, -1.0472F, 0.0F);


        bone144 = new ModelRenderer(this);
        bone144.setPos(0.0F, 0.0F, 50.0F);
        circle4.addChild(bone144);
        setRotationAngle(bone144, 0.0F, -2.0944F, 0.0F);


        bone145 = new ModelRenderer(this);
        bone145.setPos(0.0F, 0.0F, 50.0F);
        circle4.addChild(bone145);


        rotar3 = new ModelRenderer(this);
        rotar3.setPos(5.1F, -16.0F, -1.5F);
        base.addChild(rotar3);
        setRotationAngle(rotar3, 0.0F, 0.0F, 0.0349F);


        bone121 = new ModelRenderer(this);
        bone121.setPos(1.1F, 20.0F, 2.0F);
        rotar3.addChild(bone121);
        bone121.texOffs(0, 0).addBox(-3.5983F, -83.9058F, -5.0F, 1.0F, 64.0F, 6.0F, 0.0F, false);

        bone122 = new ModelRenderer(this);
        bone122.setPos(1.1F, 20.0F, 2.0F);
        rotar3.addChild(bone122);
        setRotationAngle(bone122, 0.0F, -0.7854F, 0.0F);
        bone122.texOffs(14, 0).addBox(-2.1301F, -83.9058F, 2.5444F, 1.0F, 64.0F, 3.0F, 0.0F, false);

        bone123 = new ModelRenderer(this);
        bone123.setPos(1.1F, 20.0F, 2.0F);
        rotar3.addChild(bone123);
        setRotationAngle(bone123, 0.0F, 0.7854F, 0.0F);
        bone123.texOffs(14, 0).addBox(0.6983F, -83.9058F, -8.3728F, 1.0F, 64.0F, 3.0F, 0.0F, false);

        rotar2 = new ModelRenderer(this);
        rotar2.setPos(-5.9F, -16.0F, -1.5F);
        base.addChild(rotar2);
        setRotationAngle(rotar2, 0.0F, 3.1416F, -0.0349F);


        bone124 = new ModelRenderer(this);
        bone124.setPos(1.1F, 20.0F, 2.0F);
        rotar2.addChild(bone124);
        bone124.texOffs(0, 0).addBox(-1.8993F, -83.9651F, -5.0F, 1.0F, 64.0F, 6.0F, 0.0F, false);

        bone125 = new ModelRenderer(this);
        bone125.setPos(1.1F, 20.0F, 2.0F);
        rotar2.addChild(bone125);
        setRotationAngle(bone125, 0.0F, -0.7854F, 0.0F);
        bone125.texOffs(22, 0).addBox(-0.9288F, -83.9651F, 1.343F, 1.0F, 64.0F, 3.0F, 0.0F, false);

        bone126 = new ModelRenderer(this);
        bone126.setPos(1.1F, 20.0F, 2.0F);
        rotar2.addChild(bone126);
        setRotationAngle(bone126, 0.0F, 0.7854F, 0.0F);
        bone126.texOffs(14, 0).addBox(1.8996F, -83.9651F, -7.1714F, 1.0F, 64.0F, 3.0F, 0.0F, false);

        bone127 = new ModelRenderer(this);
        bone127.setPos(-0.95F, 1.0F, 24.5F);
        base.addChild(bone127);
        bone127.texOffs(101, 0).addBox(-5.0F, -49.0F, -34.6F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        bone127.texOffs(78, 27).addBox(-7.1301F, -48.5F, -38.1641F, 14.0F, 1.0F, 1.0F, 0.0F, false);
        bone127.texOffs(0, 101).addBox(-5.0F, -49.0F, -18.2795F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        bone127.texOffs(93, 10).addBox(-7.1301F, -48.5F, -14.9154F, 11.0F, 1.0F, 1.0F, 0.0F, false);
        bone127.texOffs(75, 74).addBox(1.7699F, -48.5F, -22.9154F, 1.0F, 1.0F, 9.0F, -0.25F, false);

        bone141 = new ModelRenderer(this);
        bone141.setPos(-0.95F, 1.0F, 24.5F);
        base.addChild(bone141);
        setRotationAngle(bone141, 0.0F, -2.0944F, 0.0F);
        bone141.texOffs(99, 58).addBox(-27.4645F, -49.0F, 4.3096F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        bone141.texOffs(98, 18).addBox(-27.4645F, -49.0F, 20.6301F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        bone141.texOffs(78, 25).addBox(-29.486F, -48.5F, 24.2569F, 14.0F, 1.0F, 1.0F, 0.0F, false);

        bone140 = new ModelRenderer(this);
        bone140.setPos(-0.95F, 1.0F, 24.5F);
        base.addChild(bone140);
        setRotationAngle(bone140, 0.0F, -1.0472F, 0.0F);
        bone140.texOffs(98, 14).addBox(-27.4645F, -49.0F, -21.6301F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        bone140.texOffs(61, 78).addBox(-27.4645F, -49.0F, -5.3096F, 10.0F, 2.0F, 1.0F, 0.0F, false);
        bone140.texOffs(76, 12).addBox(-29.6161F, -48.5F, -1.7828F, 14.0F, 1.0F, 1.0F, 0.0F, false);
        bone140.texOffs(78, 32).addBox(-29.6161F, -48.5F, -25.0315F, 12.0F, 1.0F, 1.0F, 0.0F, false);
        bone140.texOffs(125, 55).addBox(-18.6161F, -48.5F, -25.0315F, 1.0F, 1.0F, 4.0F, -0.25F, false);
        bone140.texOffs(123, 42).addBox(-27.6161F, -48.5F, -4.7828F, 1.0F, 1.0F, 4.0F, -0.25F, false);

        monitor = new ModelRenderer(this);
        monitor.setPos(-1.35F, -32.0F, -1.5F);
        base.addChild(monitor);
        setRotationAngle(monitor, 0.0F, 3.1416F, 0.0F);


        bone140_r1 = new ModelRenderer(this);
        bone140_r1.setPos(-10.8161F, -1.05F, 6.0684F);
        monitor.addChild(bone140_r1);
        setRotationAngle(bone140_r1, 0.0F, 2.0944F, 0.0F);
        bone140_r1.texOffs(164, 87).addBox(6.0F, -5.75F, 0.0F, 1.0F, 12.0F, 1.0F, -0.1F, false);
        bone140_r1.texOffs(103, 90).addBox(-4.0F, -13.45F, 0.5F, 8.0F, 7.0F, 0.0F, 0.0F, false);
        bone140_r1.texOffs(71, 22).addBox(-7.0F, -6.55F, 0.0F, 14.0F, 1.0F, 1.0F, -0.1F, false);
        bone140_r1.texOffs(160, 6).addBox(-7.0F, 5.55F, 0.0F, 14.0F, 1.0F, 1.0F, -0.1F, false);
        bone140_r1.texOffs(166, 92).addBox(-7.0F, -5.75F, 0.0F, 1.0F, 12.0F, 1.0F, -0.101F, false);
        bone140_r1.texOffs(192, 183).addBox(4.8F, 1.55F, -1.2F, 1.0F, 1.0F, 2.0F, -0.05F, false);
        bone140_r1.texOffs(190, 182).addBox(4.8F, 1.55F, -1.5F, 1.0F, 1.0F, 2.0F, -0.15F, false);
        bone140_r1.texOffs(190, 182).addBox(4.8F, -2.45F, -1.2F, 1.0F, 1.0F, 2.0F, -0.05F, false);
        bone140_r1.texOffs(201, 10).addBox(-0.5F, 3.15F, -1.5F, 1.0F, 1.0F, 2.0F, -0.15F, false);
        bone140_r1.texOffs(192, 183).addBox(4.8F, -2.45F, -1.5F, 1.0F, 1.0F, 2.0F, -0.15F, false);
        bone140_r1.texOffs(186, 182).addBox(-1.5F, -4.45F, -1.5F, 3.0F, 2.0F, 2.0F, -0.15F, false);
        bone140_r1.texOffs(168, 110).addBox(-5.0F, 2.55F, -1.0F, 10.0F, 2.0F, 3.0F, 0.0F, false);
        bone140_r1.texOffs(159, 11).addBox(-5.0F, -3.45F, -0.6F, 10.0F, 7.0F, 2.0F, 0.0F, false);
        bone140_r1.texOffs(168, 110).addBox(-5.0F, -4.45F, -1.0F, 10.0F, 2.0F, 3.0F, 0.0F, false);
        bone140_r1.texOffs(168, 110).addBox(-6.0F, -3.95F, -1.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        bone140_r1.texOffs(168, 110).addBox(4.0F, -3.95F, -1.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);

        hammer = new ModelRenderer(this);
        hammer.setPos(-1.35F, 1.0F, -1.5F);
        base.addChild(hammer);
        hammer.texOffs(92, 93).addBox(19.0F, -8.0F, 2.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        hammer.texOffs(58, 90).addBox(19.0F, -3.0F, 1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(19.5F, -8.5F, 3.0F);
        hammer.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, -0.48F, 0.0F);
        cube_r1.texOffs(54, 45).addBox(0.0F, -1.5F, -0.5F, 0.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(19.5F, -2.0F, 3.0F);
        hammer.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -3.1416F);


        rotor = new ModelRenderer(this);
        rotor.setPos(0.0F, 1.0F, -1.0F);
        base.addChild(rotor);


        rotortop = new ModelRenderer(this);
        rotortop.setPos(-0.2F, 0.0F, 0.0F);
        rotor.addChild(rotortop);
        rotortop.texOffs(0, 193).addBox(-2.5F, -57.0F, -1.5F, 3.0F, 3.0F, 3.0F, 1.5F, false);
        rotortop.texOffs(0, 151).addBox(-2.5F, -66.0F, -1.5F, 3.0F, 3.0F, 3.0F, 2.0F, false);
        rotortop.texOffs(0, 151).addBox(-2.5F, -77.0F, -1.5F, 3.0F, 3.0F, 3.0F, 2.0F, false);
        rotortop.texOffs(0, 143).addBox(-2.5F, -71.5F, -1.5F, 3.0F, 3.0F, 3.0F, 1.0F, false);
        rotortop.texOffs(0, 143).addBox(-2.5F, -61.5F, -1.5F, 3.0F, 3.0F, 3.0F, 1.0F, false);
        rotortop.texOffs(0, 143).addBox(-2.5F, -52.5F, -1.5F, 3.0F, 3.0F, 3.0F, 1.0F, false);
        rotortop.texOffs(0, 205).addBox(-2.5F, -52.2F, -1.5F, 3.0F, 6.0F, 3.0F, -0.6F, false);
        rotortop.texOffs(0, 205).addBox(-2.5F, -50.9F, -1.5F, 3.0F, 6.0F, 3.0F, -0.6F, false);

        rotorbottom = new ModelRenderer(this);
        rotorbottom.setPos(-0.2F, 0.0F, 0.0F);
        rotor.addChild(rotorbottom);
        rotorbottom.texOffs(0, 166).addBox(-2.5F, -32.5F, -1.5F, 3.0F, 3.0F, 3.0F, 1.0F, false);
        rotorbottom.texOffs(0, 159).addBox(-2.5F, -27.0F, -1.5F, 3.0F, 3.0F, 3.0F, 1.5F, false);
        rotorbottom.texOffs(0, 159).addBox(-2.5F, -21.4F, -1.5F, 3.0F, 3.0F, 3.0F, 1.7F, false);
        rotorbottom.texOffs(0, 185).addBox(-2.5F, -35.8F, -1.5F, 3.0F, 3.0F, 3.0F, 0.5F, false);
        rotorbottom.texOffs(0, 173).addBox(-2.5F, -38.8F, -1.5F, 3.0F, 4.0F, 3.0F, -0.6F, false);
        rotorbottom.texOffs(0, 173).addBox(-2.5F, -40.8F, -1.5F, 3.0F, 4.0F, 3.0F, -0.6F, false);
        rotorbottom.texOffs(0, 173).addBox(-2.5F, -42.6F, -1.5F, 3.0F, 3.0F, 3.0F, -0.5F, false);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        rotor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        bone128.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        bone132.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        bone135.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        bone131.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        bone146.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void render(CopperConsoleTile copperConsoleTile, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int i, int noOverlay, float v, float v1, float v2, float v3) {
        copperConsoleTile.getDoor().ifPresent((doorcontrol) -> this.doorcontrol.xRot = (float)Math.toRadians((doorcontrol.getOpenState() == EnumDoorState.CLOSED) ? -60 : -90));
//        copperConsoleTile.getSubsystem(StabilizerSubsystem.class).ifPresent(bluestab -> {
//            this.bluestab.setPos(0.0F, -0.1F, 0.0F);
//        });
//        copperConsoleTile.getControl(FacingControl.class).ifPresent(bone83 -> {
//            //82 - 85
//        });

        this.bone147.yRot = (float)Math.toRadians(WorldHelper.getAngleFromFacing(copperConsoleTile.getExteriorFacingDirection()));

        copperConsoleTile.getControl(HandbrakeControl.class).ifPresent((handbreak) -> this.handbreak.xRot = (float) Math.toRadians(handbreak.isFree() ? 25 : -60));

        copperConsoleTile.getControl(LandingTypeControl.class).ifPresent((verticallanding) -> this.verticallanding.xRot = verticallanding.getLandType() == LandingTypeControl.EnumLandType.UP ? -120 : 120);

        copperConsoleTile.getControl(RefuelerControl.class).ifPresent((refuel) -> this.refuel.xRot = (float) Math.toRadians(refuel.isRefueling() ? -50 : 40));

//        copperConsoleTile.getControl(FastReturnControl.class).ifPresent((fastreturn) -> {
//            this.fastreturn.zRot = (float) Math.toRadians(player.interactOn(FastReturnControl.class, 0) ? -60 : 0);
//        });

        copperConsoleTile.getControl(ThrottleControl.class).ifPresent((throttle) -> {
            this.throttle.xRot = (float) Math.toRadians(-(80.0F - throttle.getAmount() * 150.0F)); //100.0F - 75.0F
        });

        copperConsoleTile.getControl(IncModControl.class).ifPresent((incrementincrease) -> this.incrementincrease.y = (float) Math.toRadians(4.0F + 115.0F * ((float) incrementincrease.index / (float) IncModControl.COORD_MODS.length)));

        copperConsoleTile.getControl(DimensionControl.class).ifPresent((bone149) -> this.bone149.yRot = (float) Math.toRadians(360.0F * ((float) bone149.getDimListIndex() / (float) bone149.getAvailableDimensions())));

//        this.TimeRotor.yRot = (float)Math.toRadians((double)(tile.flightTicks * -3 % 360));
        this.rotorbottom.y =  4F + (0 - (float)Math.cos((double)copperConsoleTile.flightTicks * 0.1D) * 2F); //rotationPointY
        this.rotortop.y = 1F + (float)Math.cos((double)copperConsoleTile.flightTicks * 0.1D) * 2F; //rotationPointY
        if(copperConsoleTile.getControl(MonitorControl.class).isPresent()) {
            MonitorControl control = copperConsoleTile.getControl(MonitorControl.class).get();

            float rot = (((IHelpWithMonitor) control).Aseoha$GetRot() == 60) ? 180 : ((IHelpWithMonitor) control).Aseoha$GetRot() + 60;
            this.monitor.yRot = (float) Math.toRadians(rot);
        }
//        matrixStack.pushPose();
//		matrixStack.scale(0.95F, 0.95F, 0.95F);
//		matrixStack.translate(0.0685F,0.275F,-0.07F);
//		base.render(matrixStack, buffer, i, noOverlay);
//		matrixStack.popPose();
        matrixStack.pushPose();
//        matrixStack.mulPose(Vector3f.YP.rotationDegrees(-180));
        matrixStack.scale(0.95F, 0.95F, 0.95F);
        matrixStack.translate(0.0685F,-0.27F,-0.07F);
        //matrixStack.rotate(Vector3f.YP.rotationDegrees(180))

        base.render(matrixStack, buffer, i, noOverlay);
//        this.monitor.setBright(1.0F);
        matrixStack.popPose();
    }
//public void render(CopperConsoleTile copperConsoleTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
//    matrixStack.pushPose();
//    matrixStack.scale(-1F, -1F, -1F);
//    matrixStack.translate(0.0685F,0.275F,-0.07F);
//    side.render(matrixStack, iVertexBuilder, i, i1);
//    matrixStack.popPose();
//}

}