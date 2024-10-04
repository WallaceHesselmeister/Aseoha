package com.code.aseoha.client.models.consoles;
// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings

import com.code.aseoha.tileentities.consoles.HartnellConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;
import net.tardis.mod.client.models.LightModelRenderer;
import net.tardis.mod.client.models.consoles.AbstractConsoleEntityModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.subsystem.StabilizerSubsystem;

public class HartnellModel extends AbstractConsoleEntityModel<HartnellConsoleTile> {

    private final ModelRenderer Console;
    private final ModelRenderer BaseGrid;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer LowerBasePanels;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer LowerBaseSlants;
    private final ModelRenderer LowerSlant1;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer LowerSlant2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer LowerSlant3;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer LowerSlant4;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer LowerSlant5;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer LowerSlant6;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer UpperBaseSlant;
    private final ModelRenderer UpperSlant1;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer UpperSlant2;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer UpperSlant3;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer UpperSlant4;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer UpperSlant5;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer UpperSlant6;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer PanelDividers;
    private final ModelRenderer Part1;
    private final ModelRenderer cube_r35;
    private final ModelRenderer Part2;
    private final ModelRenderer cube_r36;
    private final ModelRenderer Part3;
    private final ModelRenderer cube_r37;
    private final ModelRenderer Part4;
    private final ModelRenderer cube_r38;
    private final ModelRenderer Part5;
    private final ModelRenderer cube_r39;
    private final ModelRenderer Part6;
    private final ModelRenderer cube_r40;
    private final ModelRenderer UnderconsoleBaseSlant;
    private final ModelRenderer Slant1;
    private final ModelRenderer cube_r41;
    private final ModelRenderer Slant2;
    private final ModelRenderer cube_r42;
    private final ModelRenderer Slant3;
    private final ModelRenderer cube_r43;
    private final ModelRenderer Slant4;
    private final ModelRenderer cube_r44;
    private final ModelRenderer Slant5;
    private final ModelRenderer cube_r45;
    private final ModelRenderer Slant6;
    private final ModelRenderer cube_r46;
    private final ModelRenderer ConsoleCover;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer TimeRotor;
    private final ModelRenderer Glass;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer Rotor;
    private final ModelRenderer RotorRing;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer RotorRing2;
    private final ModelRenderer cube_r66;
    private final ModelRenderer cube_r67;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer cube_r72;
    private final ModelRenderer Controls;
    private final ModelRenderer Throttle;
    private final ModelRenderer cube_r73;
    private final ModelRenderer DoorControl;
    private final ModelRenderer DoorControlTranslate;
    private final ModelRenderer cube_r74;
    private final ModelRenderer Handbrake;
    private final ModelRenderer cube_r75;
    private final ModelRenderer MiniLeversPanel1;
    private final ModelRenderer MiniLever1;
    private final ModelRenderer cube_r76;
    private final ModelRenderer MiniLever2;
    private final ModelRenderer cube_r77;
    private final ModelRenderer MiniLever3;
    private final ModelRenderer cube_r78;
    private final ModelRenderer MiniLever4;
    private final ModelRenderer cube_r79;
    private final ModelRenderer MiniLever5;
    private final ModelRenderer cube_r80;
    private final ModelRenderer MiniLeversPanel2;
    private final ModelRenderer Panel2Rot;
    private final ModelRenderer MiniLever6;
    private final ModelRenderer cube_r81;
    private final ModelRenderer MiniLever7;
    private final ModelRenderer cube_r82;
    private final ModelRenderer MiniLever8;
    private final ModelRenderer cube_r83;
    private final ModelRenderer MiniLever9;
    private final ModelRenderer cube_r84;
    private final ModelRenderer MiniLever10;
    private final ModelRenderer cube_r85;
    private final ModelRenderer MiniLever11;
    private final ModelRenderer cube_r86;
    private final ModelRenderer MiniLeversPanel5;
    private final ModelRenderer Panel5Rot;
    private final ModelRenderer MiniLever12;
    private final ModelRenderer cube_r87;
    private final ModelRenderer MiniLever13;
    private final ModelRenderer cube_r88;
    private final ModelRenderer MiniLever14;
    private final ModelRenderer cube_r89;
    private final ModelRenderer MiniLever15;
    private final ModelRenderer cube_r90;
    private final ModelRenderer MiniLeverPanel6;
    private final ModelRenderer Panel5Rot2;
    private final ModelRenderer MiniLever19;
    private final ModelRenderer cube_r91;
    private final ModelRenderer Random;
    private final ModelRenderer rando;
    private final ModelRenderer cube_r92;
    private final ModelRenderer cube_r93;
    private final ModelRenderer cube_r94;
    private final ModelRenderer cube_r95;
    private final ModelRenderer cube_r96;
    private final ModelRenderer cube_r97;
    private final LightModelRenderer randomizer;
    private final ModelRenderer cube_r98;
    private final LightModelRenderer dimensioncontrol;
    private final ModelRenderer cube_r99;
    private final LightModelRenderer fastret;
    private final ModelRenderer cube_r100;
    private final LightModelRenderer stabs;
    private final ModelRenderer cube_r101;
    private final ModelRenderer Swivelers;
    private final ModelRenderer Panel2;
    private final ModelRenderer Swiv1;
    private final ModelRenderer SwivCap1;
    private final ModelRenderer Swiv2;
    private final ModelRenderer SwivCap2;
    private final ModelRenderer Panel5;
    private final ModelRenderer Swiv3;
    private final ModelRenderer SwivCap3;
    private final ModelRenderer Swiv4;
    private final ModelRenderer SwivCap4;
    private final ModelRenderer Swiv5;
    private final ModelRenderer SwivCap5;
    private final ModelRenderer Swiv6;
    private final ModelRenderer SwivCap6;
    private final ModelRenderer Panel6;
    private final ModelRenderer Swiv8;
    private final ModelRenderer SwivCap8;
    private final ModelRenderer Swiv7;
    private final ModelRenderer SwivCap7;
    private final ModelRenderer Swiv9;
    private final ModelRenderer SwivCap9;

    public HartnellModel() {
        texWidth = 128;
        texHeight = 128;

        Console = new ModelRenderer(this);
        Console.setPos(0.25F, 16.0F, 0.0F);


        BaseGrid = new ModelRenderer(this);
        BaseGrid.setPos(8.0F, 8.0F, -8.0F);
        Console.addChild(BaseGrid);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-8.25F, -9.8F, 8.0F);
        BaseGrid.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
        cube_r1.texOffs(0, 0).addBox(-16.25F, -8.5F, -0.5F, 32.5F, 18.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-8.25F, -9.8F, 8.0F);
        BaseGrid.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, -2.0944F, 0.0F);
        cube_r2.texOffs(0, 0).addBox(-16.25F, -8.5F, -0.5F, 32.5F, 18.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-8.25F, -9.8F, 8.0F);
        BaseGrid.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -1.0472F, 0.0F);
        cube_r3.texOffs(0, 0).addBox(-16.25F, -8.5F, -0.5F, 32.5F, 18.0F, 1.0F, 0.0F, false);

        LowerBasePanels = new ModelRenderer(this);
        LowerBasePanels.setPos(-0.25F, 8.0F, 0.0F);
        Console.addChild(LowerBasePanels);
        LowerBasePanels.texOffs(0, 60).addBox(-3.5F, -18.05F, -7.125F, 7.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -16.8F, 0.0F);
        LowerBasePanels.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 1.0472F, 0.0F);
        cube_r4.texOffs(0, 60).addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, -16.8F, 0.0F);
        LowerBasePanels.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 2.0944F, 0.0F);
        cube_r5.texOffs(0, 60).addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, -16.8F, 0.0F);
        LowerBasePanels.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 3.1416F, 0.0F);
        cube_r6.texOffs(0, 60).addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, -16.8F, 0.0F);
        LowerBasePanels.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, -2.0944F, 0.0F);
        cube_r7.texOffs(0, 60).addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, -16.8F, 0.0F);
        LowerBasePanels.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, -1.0472F, 0.0F);
        cube_r8.texOffs(0, 60).addBox(-4.5F, -1.25F, -7.125F, 8.0F, 15.0F, 1.0F, 0.0F, false);

        LowerBaseSlants = new ModelRenderer(this);
        LowerBaseSlants.setPos(-0.25F, 8.0F, 0.0F);
        Console.addChild(LowerBaseSlants);


        LowerSlant1 = new ModelRenderer(this);
        LowerSlant1.setPos(0.0F, 0.0F, 0.0F);
        LowerBaseSlants.addChild(LowerSlant1);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, -0.6435F, -16.9752F);
        LowerSlant1.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.0436F, 0.0F, 0.0F);
        cube_r9.texOffs(24, 67).addBox(-8.5F, -0.5F, 2.25F, 17.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.0F, -3.05F, -7.125F);
        LowerSlant1.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.3054F, 0.0F, 0.0F);
        cube_r10.texOffs(36, 20).addBox(-8.0F, 0.0F, -7.0F, 16.0F, 1.0F, 7.0F, 0.0F, false);

        LowerSlant2 = new ModelRenderer(this);
        LowerSlant2.setPos(0.0F, 0.0F, 0.0F);
        LowerBaseSlants.addChild(LowerSlant2);
        setRotationAngle(LowerSlant2, 0.0F, -1.0472F, 0.0F);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, 16.1565F, -16.9752F);
        LowerSlant2.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        cube_r11.texOffs(24, 67).addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, 13.75F, -7.125F);
        LowerSlant2.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.3054F, 0.0F, 0.0F);
        cube_r12.texOffs(36, 20).addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, 0.0F, false);

        LowerSlant3 = new ModelRenderer(this);
        LowerSlant3.setPos(0.0F, 0.0F, 0.0F);
        LowerBaseSlants.addChild(LowerSlant3);
        setRotationAngle(LowerSlant3, 0.0F, -2.0944F, 0.0F);
        LowerSlant3.texOffs(24, 82).addBox(-8.0F, -0.3935F, -14.25F, 16.0F, 0.0F, 14.0F, 0.001F, false);
        LowerSlant3.texOffs(24, 82).addBox(-8.0F, -0.3935F, -0.25F, 16.0F, 0.0F, 14.0F, 0.001F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(0.0F, 16.1565F, 0.0F);
        LowerSlant3.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, -2.0944F, 0.0F);
        cube_r13.texOffs(24, 82).addBox(-8.0F, -16.55F, -14.25F, 16.0F, 0.0F, 14.0F, 0.002F, false);
        cube_r13.texOffs(24, 82).addBox(-8.0F, -16.55F, -0.25F, 16.0F, 0.0F, 14.0F, 0.002F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(0.0F, 16.1565F, 0.0F);
        LowerSlant3.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, -1.0472F, 0.0F);
        cube_r14.texOffs(24, 82).addBox(-8.0F, -16.55F, -14.25F, 16.0F, 0.0F, 14.0F, 0.0F, false);
        cube_r14.texOffs(24, 82).addBox(-8.0F, -16.55F, -0.25F, 16.0F, 0.0F, 14.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.0F, 16.1565F, -16.9752F);
        LowerSlant3.addChild(cube_r15);
        setRotationAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        cube_r15.texOffs(24, 67).addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(0.0F, 13.75F, -7.125F);
        LowerSlant3.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.3054F, 0.0F, 0.0F);
        cube_r16.texOffs(36, 20).addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, 0.0F, false);

        LowerSlant4 = new ModelRenderer(this);
        LowerSlant4.setPos(0.0F, 0.0F, 0.0F);
        LowerBaseSlants.addChild(LowerSlant4);
        setRotationAngle(LowerSlant4, 0.0F, 3.1416F, 0.0F);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(0.0F, 16.1565F, -16.9752F);
        LowerSlant4.addChild(cube_r17);
        setRotationAngle(cube_r17, -0.0436F, 0.0F, 0.0F);
        cube_r17.texOffs(24, 67).addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(0.0F, 13.75F, -7.125F);
        LowerSlant4.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.3054F, 0.0F, 0.0F);
        cube_r18.texOffs(36, 20).addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, 0.0F, false);

        LowerSlant5 = new ModelRenderer(this);
        LowerSlant5.setPos(0.0F, 0.0F, 0.0F);
        LowerBaseSlants.addChild(LowerSlant5);
        setRotationAngle(LowerSlant5, 0.0F, 2.0944F, 0.0F);


        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(0.0F, 16.1565F, -16.9752F);
        LowerSlant5.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.0436F, 0.0F, 0.0F);
        cube_r19.texOffs(24, 67).addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(0.0F, 13.75F, -7.125F);
        LowerSlant5.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.3054F, 0.0F, 0.0F);
        cube_r20.texOffs(36, 20).addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, 0.0F, false);

        LowerSlant6 = new ModelRenderer(this);
        LowerSlant6.setPos(0.0F, 0.0F, 0.0F);
        LowerBaseSlants.addChild(LowerSlant6);
        setRotationAngle(LowerSlant6, 0.0F, 1.0472F, 0.0F);


        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(0.0F, 16.1565F, -16.9752F);
        LowerSlant6.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        cube_r21.texOffs(24, 67).addBox(-8.5F, -17.284F, 1.5172F, 17.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(0.0F, 13.75F, -7.125F);
        LowerSlant6.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.3054F, 0.0F, 0.0F);
        cube_r22.texOffs(36, 20).addBox(-8.0F, -16.0224F, -1.9481F, 16.0F, 1.0F, 7.0F, 0.0F, false);

        UpperBaseSlant = new ModelRenderer(this);
        UpperBaseSlant.setPos(-0.25F, 8.0F, 0.0F);
        Console.addChild(UpperBaseSlant);


        UpperSlant1 = new ModelRenderer(this);
        UpperSlant1.setPos(0.0F, 0.0F, 0.0F);
        UpperBaseSlant.addChild(UpperSlant1);
        UpperSlant1.texOffs(0, 57).addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, 0.0F, false);
        UpperSlant1.texOffs(29, 69).addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(0.0F, -22.5662F, -22.9736F);
        UpperSlant1.addChild(cube_r23);
        setRotationAngle(cube_r23, 1.946F, 0.0F, 0.0F);
        cube_r23.texOffs(70, 0).addBox(-14.0F, 0.0F, -0.5F, 28.0F, 14.0F, 1.0F, 0.0F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(0.0F, -21.8684F, -22.7088F);
        UpperSlant1.addChild(cube_r24);
        setRotationAngle(cube_r24, 1.3003F, 0.0F, 0.0F);
        cube_r24.texOffs(0, 19).addBox(-14.0F, -1.0F, 0.0F, 28.0F, 18.0F, 1.0F, 0.0F, false);

        UpperSlant2 = new ModelRenderer(this);
        UpperSlant2.setPos(0.0F, 0.0F, 0.0F);
        UpperBaseSlant.addChild(UpperSlant2);
        setRotationAngle(UpperSlant2, 0.0F, -1.0472F, 0.0F);
        UpperSlant2.texOffs(0, 57).addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, 0.0F, false);
        UpperSlant2.texOffs(29, 69).addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(0.0F, -5.7662F, -22.9736F);
        UpperSlant2.addChild(cube_r25);
        setRotationAngle(cube_r25, 1.946F, 0.0F, 0.0F);
        cube_r25.texOffs(70, 15).addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(0.0F, -5.0684F, -22.7088F);
        UpperSlant2.addChild(cube_r26);
        setRotationAngle(cube_r26, 1.3003F, 0.0F, 0.0F);
        cube_r26.texOffs(0, 19).addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, 0.0F, false);

        UpperSlant3 = new ModelRenderer(this);
        UpperSlant3.setPos(0.0F, 0.0F, 0.0F);
        UpperBaseSlant.addChild(UpperSlant3);
        setRotationAngle(UpperSlant3, 0.0F, -2.0944F, 0.0F);
        UpperSlant3.texOffs(0, 57).addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, 0.0F, false);
        UpperSlant3.texOffs(29, 69).addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, 0.0F, false);
        UpperSlant3.texOffs(69, 106).addBox(-8.0F, -25.3162F, -21.9736F, 5.0F, 3.0F, 5.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(0.0F, -5.7662F, -22.9736F);
        UpperSlant3.addChild(cube_r27);
        setRotationAngle(cube_r27, 1.946F, 0.0F, 0.0F);
        cube_r27.texOffs(70, 30).addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(0.0F, -5.0684F, -22.7088F);
        UpperSlant3.addChild(cube_r28);
        setRotationAngle(cube_r28, 1.3003F, 0.0F, 0.0F);
        cube_r28.texOffs(0, 19).addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, 0.0F, false);

        UpperSlant4 = new ModelRenderer(this);
        UpperSlant4.setPos(0.0F, 0.0F, 0.0F);
        UpperBaseSlant.addChild(UpperSlant4);
        setRotationAngle(UpperSlant4, 0.0F, 3.1416F, 0.0F);
        UpperSlant4.texOffs(0, 57).addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, 0.0F, false);
        UpperSlant4.texOffs(29, 69).addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(0.0F, -5.7662F, -22.9736F);
        UpperSlant4.addChild(cube_r29);
        setRotationAngle(cube_r29, 1.946F, 0.0F, 0.0F);
        cube_r29.texOffs(70, 45).addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(0.0F, -5.0684F, -22.7088F);
        UpperSlant4.addChild(cube_r30);
        setRotationAngle(cube_r30, 1.3003F, 0.0F, 0.0F);
        cube_r30.texOffs(0, 19).addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, 0.0F, false);

        UpperSlant5 = new ModelRenderer(this);
        UpperSlant5.setPos(0.0F, 0.0F, 0.0F);
        UpperBaseSlant.addChild(UpperSlant5);
        setRotationAngle(UpperSlant5, 0.0F, 2.0944F, 0.0F);
        UpperSlant5.texOffs(0, 57).addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, 0.0F, false);
        UpperSlant5.texOffs(29, 69).addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(0.0F, -5.7662F, -22.9736F);
        UpperSlant5.addChild(cube_r31);
        setRotationAngle(cube_r31, 1.946F, 0.0F, 0.0F);
        cube_r31.texOffs(70, 60).addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(0.0F, -5.0684F, -22.7088F);
        UpperSlant5.addChild(cube_r32);
        setRotationAngle(cube_r32, 1.3003F, 0.0F, 0.0F);
        cube_r32.texOffs(0, 19).addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, 0.0F, false);

        UpperSlant6 = new ModelRenderer(this);
        UpperSlant6.setPos(0.0F, 0.0F, 0.0F);
        UpperBaseSlant.addChild(UpperSlant6);
        setRotationAngle(UpperSlant6, 0.0F, 1.0472F, 0.0F);
        UpperSlant6.texOffs(0, 57).addBox(-14.0F, -23.425F, -24.125F, 28.0F, 2.0F, 1.0F, 0.0F, false);
        UpperSlant6.texOffs(29, 69).addBox(-6.0F, -29.925F, -10.5F, 12.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(0.0F, -5.7662F, -22.9736F);
        UpperSlant6.addChild(cube_r33);
        setRotationAngle(cube_r33, 1.946F, 0.0F, 0.0F);
        cube_r33.texOffs(70, 75).addBox(-14.0F, 6.1572F, 15.131F, 28.0F, 14.0F, 1.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(0.0F, -5.0684F, -22.7088F);
        UpperSlant6.addChild(cube_r34);
        setRotationAngle(cube_r34, 1.3003F, 0.0F, 0.0F);
        cube_r34.texOffs(0, 19).addBox(-14.0F, -5.4896F, 16.189F, 28.0F, 18.0F, 1.0F, 0.0F, false);

        PanelDividers = new ModelRenderer(this);
        PanelDividers.setPos(-0.25F, 8.0F, 0.0F);
        Console.addChild(PanelDividers);


        Part1 = new ModelRenderer(this);
        Part1.setPos(0.0F, -7.0478F, 0.0F);
        PanelDividers.addChild(Part1);


        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(-13.8539F, -17.3F, -23.9757F);
        Part1.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.3054F, 0.5236F, 0.0F);
        cube_r35.texOffs(43, 43).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 3.0F, 17.0F, 0.001F, false);

        Part2 = new ModelRenderer(this);
        Part2.setPos(0.0F, -7.0478F, 0.0F);
        PanelDividers.addChild(Part2);
        setRotationAngle(Part2, 0.0F, -1.0472F, 0.0F);


        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(-13.8539F, -0.5F, -23.9757F);
        Part2.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.3054F, 0.5236F, 0.0F);
        cube_r36.texOffs(43, 43).addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, 0.001F, false);

        Part3 = new ModelRenderer(this);
        Part3.setPos(0.0F, -7.0478F, 0.0F);
        PanelDividers.addChild(Part3);
        setRotationAngle(Part3, 0.0F, -2.0944F, 0.0F);


        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(-13.8539F, -0.5F, -23.9757F);
        Part3.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.3054F, 0.5236F, 0.0F);
        cube_r37.texOffs(43, 43).addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, 0.001F, false);

        Part4 = new ModelRenderer(this);
        Part4.setPos(0.0F, -7.0478F, 0.0F);
        PanelDividers.addChild(Part4);
        setRotationAngle(Part4, 0.0F, 3.1416F, 0.0F);


        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(-13.8539F, -0.5F, -23.9757F);
        Part4.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.3054F, 0.5236F, 0.0F);
        cube_r38.texOffs(43, 43).addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, 0.001F, false);

        Part5 = new ModelRenderer(this);
        Part5.setPos(0.0F, -7.0478F, 0.0F);
        PanelDividers.addChild(Part5);
        setRotationAngle(Part5, 0.0F, 2.0944F, 0.0F);


        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(-13.8539F, -0.5F, -23.9757F);
        Part5.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.3054F, 0.5236F, 0.0F);
        cube_r39.texOffs(43, 43).addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, 0.001F, false);

        Part6 = new ModelRenderer(this);
        Part6.setPos(0.0F, -7.0478F, 0.0F);
        PanelDividers.addChild(Part6);
        setRotationAngle(Part6, 0.0F, 1.0472F, 0.0F);


        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(-13.8539F, -0.5F, -23.9757F);
        Part6.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.3054F, 0.5236F, 0.0F);
        cube_r40.texOffs(43, 43).addBox(-0.5F, -16.0224F, 5.0519F, 1.0F, 3.0F, 17.0F, 0.001F, false);

        UnderconsoleBaseSlant = new ModelRenderer(this);
        UnderconsoleBaseSlant.setPos(-0.25F, 15.5F, 0.0F);
        Console.addChild(UnderconsoleBaseSlant);


        Slant1 = new ModelRenderer(this);
        Slant1.setPos(0.0F, -7.5F, 0.0F);
        UnderconsoleBaseSlant.addChild(Slant1);


        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(10.9864F, -22.5434F, -19.029F);
        Slant1.addChild(cube_r41);
        setRotationAngle(cube_r41, -2.6068F, -0.9507F, 2.5124F);
        cube_r41.texOffs(0, 53).addBox(-6.0F, 0.25F, -0.5F, 29.0F, 3.0F, 1.0F, -0.01F, false);

        Slant2 = new ModelRenderer(this);
        Slant2.setPos(0.0F, -7.5F, 0.0F);
        UnderconsoleBaseSlant.addChild(Slant2);
        setRotationAngle(Slant2, 0.0F, -1.0472F, 0.0F);


        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(10.9864F, -5.7434F, -19.029F);
        Slant2.addChild(cube_r42);
        setRotationAngle(cube_r42, -2.6068F, -0.9507F, 2.5124F);
        cube_r42.texOffs(0, 53).addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, -0.01F, false);

        Slant3 = new ModelRenderer(this);
        Slant3.setPos(0.0F, -7.5F, 0.0F);
        UnderconsoleBaseSlant.addChild(Slant3);
        setRotationAngle(Slant3, 0.0F, -2.0944F, 0.0F);


        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(10.9864F, -5.7434F, -19.029F);
        Slant3.addChild(cube_r43);
        setRotationAngle(cube_r43, -2.6068F, -0.9507F, 2.5124F);
        cube_r43.texOffs(0, 53).addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, -0.01F, false);

        Slant4 = new ModelRenderer(this);
        Slant4.setPos(0.0F, -7.5F, 0.0F);
        UnderconsoleBaseSlant.addChild(Slant4);
        setRotationAngle(Slant4, 0.0F, 3.1416F, 0.0F);


        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(10.9864F, -5.7434F, -19.029F);
        Slant4.addChild(cube_r44);
        setRotationAngle(cube_r44, -2.6068F, -0.9507F, 2.5124F);
        cube_r44.texOffs(0, 53).addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, -0.01F, false);

        Slant5 = new ModelRenderer(this);
        Slant5.setPos(0.0F, -7.5F, 0.0F);
        UnderconsoleBaseSlant.addChild(Slant5);
        setRotationAngle(Slant5, 0.0F, 2.0944F, 0.0F);


        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(10.9864F, -5.7434F, -19.029F);
        Slant5.addChild(cube_r45);
        setRotationAngle(cube_r45, -2.6068F, -0.9507F, 2.5124F);
        cube_r45.texOffs(0, 53).addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, -0.01F, false);

        Slant6 = new ModelRenderer(this);
        Slant6.setPos(0.0F, -7.5F, 0.0F);
        UnderconsoleBaseSlant.addChild(Slant6);
        setRotationAngle(Slant6, 0.0F, 1.0472F, 0.0F);


        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(10.9864F, -5.7434F, -19.029F);
        Slant6.addChild(cube_r46);
        setRotationAngle(cube_r46, -2.6068F, -0.9507F, 2.5124F);
        cube_r46.texOffs(0, 53).addBox(-11.7459F, -15.5368F, -0.5F, 29.0F, 3.0F, 1.0F, -0.01F, false);

        ConsoleCover = new ModelRenderer(this);
        ConsoleCover.setPos(-0.25F, 8.0F, 0.0F);
        Console.addChild(ConsoleCover);
        ConsoleCover.texOffs(8, 97).addBox(-15.0F, -23.8F, -15.0F, 30.0F, 1.0F, 30.0F, 0.0F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(0.0F, -16.8F, 0.0F);
        ConsoleCover.addChild(cube_r47);
        setRotationAngle(cube_r47, -1.5708F, 1.0472F, 0.0F);
        cube_r47.texOffs(33, 106).addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(0.0F, -16.8F, 0.0F);
        ConsoleCover.addChild(cube_r48);
        setRotationAngle(cube_r48, -1.5708F, 2.0944F, 0.0F);
        cube_r48.texOffs(33, 106).addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(0.0F, -16.8F, 0.0F);
        ConsoleCover.addChild(cube_r49);
        setRotationAngle(cube_r49, -1.5708F, 3.1416F, 0.0F);
        cube_r49.texOffs(33, 106).addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(0.0F, -16.8F, 0.0F);
        ConsoleCover.addChild(cube_r50);
        setRotationAngle(cube_r50, -1.5708F, -2.0944F, 0.0F);
        cube_r50.texOffs(33, 106).addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setPos(0.0F, -16.8F, 0.0F);
        ConsoleCover.addChild(cube_r51);
        setRotationAngle(cube_r51, -1.5708F, -1.0472F, 0.0F);
        cube_r51.texOffs(33, 106).addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setPos(0.0F, -16.8F, 0.0F);
        ConsoleCover.addChild(cube_r52);
        setRotationAngle(cube_r52, -1.5708F, 0.0F, 0.0F);
        cube_r52.texOffs(33, 106).addBox(-6.0F, 9.0F, -12.0F, 12.0F, 1.0F, 9.0F, 0.0F, false);

        TimeRotor = new ModelRenderer(this);
        TimeRotor.setPos(0.0F, 24.75F, 0.0F);


        Glass = new ModelRenderer(this);
        Glass.setPos(0.0F, 0.0F, 0.0F);
        TimeRotor.addChild(Glass);


        cube_r53 = new ModelRenderer(this);
        cube_r53.setPos(0.0F, -16.8F, 0.0F);
        Glass.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 0.5236F, 0.0F);
        cube_r53.texOffs(0, 61).addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, 0.011F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setPos(0.0F, -16.8F, 0.0F);
        Glass.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 1.0472F, 0.0F);
        cube_r54.texOffs(0, 61).addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, 0.01F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setPos(0.0F, -16.8F, 0.0F);
        Glass.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 1.5708F, 0.0F);
        cube_r55.texOffs(0, 61).addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, 0.011F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setPos(0.0F, -16.8F, 0.0F);
        Glass.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 2.0944F, 0.0F);
        cube_r56.texOffs(0, 61).addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, 0.01F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setPos(0.0F, -16.8F, 0.0F);
        Glass.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, 3.1416F, 0.0F);
        cube_r57.texOffs(0, 61).addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, 0.01F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setPos(0.0F, -16.8F, 0.0F);
        Glass.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, -0.5236F, 0.0F);
        cube_r58.texOffs(0, 61).addBox(-2.0F, -28.0F, -7.5F, 4.0F, 26.0F, 15.0F, 0.011F, false);

        Rotor = new ModelRenderer(this);
        Rotor.setPos(0.0F, 0.0F, 0.0F);
        TimeRotor.addChild(Rotor);
        Rotor.texOffs(0, 103).addBox(-3.0F, -31.8F, -3.0F, 6.0F, 3.0F, 6.0F, 0.5F, false);
        Rotor.texOffs(0, 112).addBox(-3.0F, -33.8F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        Rotor.texOffs(124, 99).addBox(-0.5F, -41.8F, -0.5F, 1.0F, 28.0F, 1.0F, -0.125F, false);
        Rotor.texOffs(18, 112).addBox(0.0F, -40.8F, -2.5F, 0.0F, 6.0F, 5.0F, 0.0F, false);
        Rotor.texOffs(10, 114).addBox(-4.0F, -42.8F, -4.0F, 1.0F, 11.0F, 1.0F, -0.125F, false);
        Rotor.texOffs(10, 114).addBox(3.0F, -42.8F, -4.0F, 1.0F, 11.0F, 1.0F, -0.125F, false);
        Rotor.texOffs(10, 114).addBox(-0.5F, -42.8F, 3.0F, 1.0F, 11.0F, 1.0F, -0.125F, false);
        Rotor.texOffs(0, 114).addBox(-4.0F, -33.8F, -0.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        Rotor.texOffs(0, 114).addBox(3.0F, -33.8F, -0.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);

        RotorRing = new ModelRenderer(this);
        RotorRing.setPos(0.0F, -1.0F, 0.0F);
        Rotor.addChild(RotorRing);
        RotorRing.texOffs(0, 126).addBox(-2.0F, -34.8F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.7854F, 0.0F);
        cube_r59.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, 1.5708F, 0.0F);
        cube_r60.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 2.3562F, 0.0F);
        cube_r61.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 3.1416F, 0.0F);
        cube_r62.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, -2.3562F, 0.0F);
        cube_r63.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, -1.5708F, 0.0F);
        cube_r64.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setPos(0.0F, -16.8F, 0.0F);
        RotorRing.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, -0.7854F, 0.0F);
        cube_r65.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        RotorRing2 = new ModelRenderer(this);
        RotorRing2.setPos(0.0F, -8.0F, 0.0F);
        Rotor.addChild(RotorRing2);
        RotorRing2.texOffs(0, 126).addBox(-2.0F, -34.8F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r66);
        setRotationAngle(cube_r66, 0.0F, 0.7854F, 0.0F);
        cube_r66.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, 1.5708F, 0.0F);
        cube_r67.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r68);
        setRotationAngle(cube_r68, 0.0F, 2.3562F, 0.0F);
        cube_r68.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r69);
        setRotationAngle(cube_r69, 0.0F, 3.1416F, 0.0F);
        cube_r69.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r70);
        setRotationAngle(cube_r70, 0.0F, -2.3562F, 0.0F);
        cube_r70.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r71);
        setRotationAngle(cube_r71, 0.0F, -1.5708F, 0.0F);
        cube_r71.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setPos(0.0F, -16.8F, 0.0F);
        RotorRing2.addChild(cube_r72);
        setRotationAngle(cube_r72, 0.0F, -0.7854F, 0.0F);
        cube_r72.texOffs(0, 126).addBox(-2.0F, -18.0F, 3.875F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        Controls = new ModelRenderer(this);
        Controls.setPos(0.0F, 24.0F, 0.0F);


        Throttle = new ModelRenderer(this);
        Throttle.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(Throttle);


        cube_r73 = new ModelRenderer(this);
        cube_r73.setPos(0.25F, -22.5662F, -22.9736F);
        Throttle.addChild(cube_r73);
        setRotationAngle(cube_r73, 1.946F, 0.0F, 0.0F);
        cube_r73.texOffs(68, 108).addBox(-8.25F, 5.75F, -0.25F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        DoorControl = new ModelRenderer(this);
        DoorControl.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(DoorControl);
        setRotationAngle(DoorControl, 0.0F, -1.0472F, 0.0F);


        DoorControlTranslate = new ModelRenderer(this);
        DoorControlTranslate.setPos(0.0F, -5.7662F, -22.9736F);
        DoorControl.addChild(DoorControlTranslate);


        cube_r74 = new ModelRenderer(this);
        cube_r74.setPos(0.0F, 0.0F, 0.0F);
        DoorControlTranslate.addChild(cube_r74);
        setRotationAngle(cube_r74, 1.946F, 0.0F, 0.0F);
        cube_r74.texOffs(68, 108).addBox(-0.5F, 10.6572F, 15.381F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        Handbrake = new ModelRenderer(this);
        Handbrake.setPos(0.0F, -5.7662F, -22.9736F);
        Controls.addChild(Handbrake);


        cube_r75 = new ModelRenderer(this);
        cube_r75.setPos(0.25F, -16.8F, 0.0F);
        Handbrake.addChild(cube_r75);
        setRotationAngle(cube_r75, 1.946F, 0.0F, 0.0F);
        cube_r75.texOffs(68, 105).addBox(-3.25F, 5.75F, -0.25F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        MiniLeversPanel1 = new ModelRenderer(this);
        MiniLeversPanel1.setPos(3.875F, -8.0162F, -18.5361F);
        Controls.addChild(MiniLeversPanel1);


        MiniLever1 = new ModelRenderer(this);
        MiniLever1.setPos(0.0F, 0.0F, 0.125F);
        MiniLeversPanel1.addChild(MiniLever1);
        setRotationAngle(MiniLever1, -0.7418F, 0.0F, 0.0F);


        cube_r76 = new ModelRenderer(this);
        cube_r76.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever1.addChild(cube_r76);
        setRotationAngle(cube_r76, 1.946F, 0.0F, 0.0F);
        cube_r76.texOffs(68, 108).addBox(-0.875F, -1.5206F, 15.4342F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r76.texOffs(68, 105).addBox(-0.875F, -1.5206F, 16.8092F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever2 = new ModelRenderer(this);
        MiniLever2.setPos(1.0F, 0.0F, 0.125F);
        MiniLeversPanel1.addChild(MiniLever2);
        setRotationAngle(MiniLever2, 0.9163F, 0.0F, 0.0F);


        cube_r77 = new ModelRenderer(this);
        cube_r77.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever2.addChild(cube_r77);
        setRotationAngle(cube_r77, 1.946F, 0.0F, 0.0F);
        cube_r77.texOffs(68, 108).addBox(-0.875F, 20.6492F, 4.3807F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r77.texOffs(68, 105).addBox(-0.875F, 20.6492F, 5.7557F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever3 = new ModelRenderer(this);
        MiniLever3.setPos(2.0F, 0.0F, 0.125F);
        MiniLeversPanel1.addChild(MiniLever3);
        setRotationAngle(MiniLever3, 0.6109F, 0.0F, 0.0F);


        cube_r78 = new ModelRenderer(this);
        cube_r78.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever3.addChild(cube_r78);
        setRotationAngle(cube_r78, 1.946F, 0.0F, 0.0F);
        cube_r78.texOffs(68, 108).addBox(-0.875F, 18.5093F, 9.0225F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r78.texOffs(68, 105).addBox(-0.875F, 18.5093F, 10.3975F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever4 = new ModelRenderer(this);
        MiniLever4.setPos(3.0F, 0.0F, 0.125F);
        MiniLeversPanel1.addChild(MiniLever4);
        setRotationAngle(MiniLever4, -0.3927F, 0.0F, 0.0F);


        cube_r79 = new ModelRenderer(this);
        cube_r79.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever4.addChild(cube_r79);
        setRotationAngle(cube_r79, 1.946F, 0.0F, 0.0F);
        cube_r79.texOffs(68, 108).addBox(-0.875F, 4.2068F, 16.5474F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r79.texOffs(68, 105).addBox(-0.875F, 4.2068F, 17.9224F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever5 = new ModelRenderer(this);
        MiniLever5.setPos(4.0F, 0.0F, 0.125F);
        MiniLeversPanel1.addChild(MiniLever5);
        setRotationAngle(MiniLever5, -0.8727F, 0.0F, 0.0F);


        cube_r80 = new ModelRenderer(this);
        cube_r80.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever5.addChild(cube_r80);
        setRotationAngle(cube_r80, 1.946F, 0.0F, 0.0F);
        cube_r80.texOffs(68, 108).addBox(-0.875F, -3.5163F, 14.5141F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r80.texOffs(68, 105).addBox(-0.875F, -3.5163F, 15.8891F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLeversPanel2 = new ModelRenderer(this);
        MiniLeversPanel2.setPos(3.625F, -8.0162F, -18.5361F);
        Controls.addChild(MiniLeversPanel2);


        Panel2Rot = new ModelRenderer(this);
        Panel2Rot.setPos(-9.625F, 6.5162F, 15.5361F);
        MiniLeversPanel2.addChild(Panel2Rot);
        setRotationAngle(Panel2Rot, 0.0F, -1.0472F, 0.0F);


        MiniLever6 = new ModelRenderer(this);
        MiniLever6.setPos(3.625F, -8.0162F, -18.4111F);
        Panel2Rot.addChild(MiniLever6);
        setRotationAngle(MiniLever6, -0.7418F, 0.0F, 0.0F);


        cube_r81 = new ModelRenderer(this);
        cube_r81.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever6.addChild(cube_r81);
        setRotationAngle(cube_r81, 1.946F, 0.0F, 0.0F);
        cube_r81.texOffs(68, 108).addBox(-0.75F, -1.5206F, 15.4342F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r81.texOffs(68, 105).addBox(-0.75F, -1.5206F, 16.8092F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever7 = new ModelRenderer(this);
        MiniLever7.setPos(4.625F, -8.0162F, -18.4111F);
        Panel2Rot.addChild(MiniLever7);
        setRotationAngle(MiniLever7, 0.9163F, 0.0F, 0.0F);


        cube_r82 = new ModelRenderer(this);
        cube_r82.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever7.addChild(cube_r82);
        setRotationAngle(cube_r82, 1.946F, 0.0F, 0.0F);
        cube_r82.texOffs(68, 108).addBox(-1.0F, 20.6492F, 4.3807F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r82.texOffs(68, 105).addBox(-1.0F, 20.6492F, 5.7557F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever8 = new ModelRenderer(this);
        MiniLever8.setPos(5.625F, -8.0162F, -18.4111F);
        Panel2Rot.addChild(MiniLever8);
        setRotationAngle(MiniLever8, 0.6109F, 0.0F, 0.0F);


        cube_r83 = new ModelRenderer(this);
        cube_r83.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever8.addChild(cube_r83);
        setRotationAngle(cube_r83, 1.946F, 0.0F, 0.0F);
        cube_r83.texOffs(68, 108).addBox(-1.25F, 18.5093F, 9.0225F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r83.texOffs(68, 105).addBox(-1.25F, 18.5093F, 10.3975F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever9 = new ModelRenderer(this);
        MiniLever9.setPos(6.625F, -8.0162F, -18.4111F);
        Panel2Rot.addChild(MiniLever9);
        setRotationAngle(MiniLever9, -0.3927F, 0.0F, 0.0F);


        cube_r84 = new ModelRenderer(this);
        cube_r84.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever9.addChild(cube_r84);
        setRotationAngle(cube_r84, 1.946F, 0.0F, 0.0F);
        cube_r84.texOffs(68, 108).addBox(-1.5F, 4.2068F, 16.5474F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r84.texOffs(68, 105).addBox(-1.5F, 4.2068F, 17.9224F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever10 = new ModelRenderer(this);
        MiniLever10.setPos(7.625F, -8.0162F, -18.4111F);
        Panel2Rot.addChild(MiniLever10);
        setRotationAngle(MiniLever10, -0.8727F, 0.0F, 0.0F);


        cube_r85 = new ModelRenderer(this);
        cube_r85.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever10.addChild(cube_r85);
        setRotationAngle(cube_r85, 1.946F, 0.0F, 0.0F);
        cube_r85.texOffs(68, 108).addBox(-1.75F, -3.5163F, 14.5141F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r85.texOffs(68, 105).addBox(-1.75F, -3.5163F, 15.8891F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever11 = new ModelRenderer(this);
        MiniLever11.setPos(8.375F, -8.0162F, -18.4111F);
        Panel2Rot.addChild(MiniLever11);
        setRotationAngle(MiniLever11, -0.8727F, 0.0F, 0.0F);


        cube_r86 = new ModelRenderer(this);
        cube_r86.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever11.addChild(cube_r86);
        setRotationAngle(cube_r86, 1.946F, 0.0F, 0.0F);
        cube_r86.texOffs(68, 108).addBox(-1.75F, -3.5163F, 14.5141F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r86.texOffs(68, 105).addBox(-1.75F, -3.5163F, 15.8891F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLeversPanel5 = new ModelRenderer(this);
        MiniLeversPanel5.setPos(3.625F, -8.0162F, -18.5361F);
        Controls.addChild(MiniLeversPanel5);


        Panel5Rot = new ModelRenderer(this);
        Panel5Rot.setPos(3.375F, 6.2662F, 22.2861F);
        MiniLeversPanel5.addChild(Panel5Rot);
        setRotationAngle(Panel5Rot, 0.0F, 2.0944F, 0.0F);


        MiniLever12 = new ModelRenderer(this);
        MiniLever12.setPos(3.75F, -8.0162F, -18.4111F);
        Panel5Rot.addChild(MiniLever12);
        setRotationAngle(MiniLever12, -0.7418F, 0.0F, 0.0F);


        cube_r87 = new ModelRenderer(this);
        cube_r87.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever12.addChild(cube_r87);
        setRotationAngle(cube_r87, 1.946F, 0.0F, 0.0F);
        cube_r87.texOffs(68, 108).addBox(-0.75F, -1.5206F, 15.4342F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r87.texOffs(68, 105).addBox(-0.75F, -1.5206F, 16.8092F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever13 = new ModelRenderer(this);
        MiniLever13.setPos(4.0F, -6.6412F, -21.7861F);
        Panel5Rot.addChild(MiniLever13);
        setRotationAngle(MiniLever13, 0.9163F, 0.0F, 0.0F);


        cube_r88 = new ModelRenderer(this);
        cube_r88.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever13.addChild(cube_r88);
        setRotationAngle(cube_r88, 1.946F, 0.0F, 0.0F);
        cube_r88.texOffs(68, 108).addBox(-1.0F, 20.6492F, 4.3807F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r88.texOffs(68, 105).addBox(-1.0F, 20.6492F, 5.7557F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever14 = new ModelRenderer(this);
        MiniLever14.setPos(4.25F, -5.5162F, -25.0361F);
        Panel5Rot.addChild(MiniLever14);
        setRotationAngle(MiniLever14, 0.6109F, 0.0F, 0.0F);


        cube_r89 = new ModelRenderer(this);
        cube_r89.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever14.addChild(cube_r89);
        setRotationAngle(cube_r89, 1.946F, 0.0F, 0.0F);
        cube_r89.texOffs(68, 108).addBox(-1.25F, 18.5093F, 9.0225F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r89.texOffs(68, 105).addBox(-1.25F, 18.5093F, 10.3975F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLever15 = new ModelRenderer(this);
        MiniLever15.setPos(6.0F, -5.3912F, -24.7861F);
        Panel5Rot.addChild(MiniLever15);
        setRotationAngle(MiniLever15, -0.7854F, 0.0F, 0.0F);


        cube_r90 = new ModelRenderer(this);
        cube_r90.setPos(0.375F, 2.25F, -4.5625F);
        MiniLever15.addChild(cube_r90);
        setRotationAngle(cube_r90, 1.946F, 0.0F, 0.0F);
        cube_r90.texOffs(68, 108).addBox(-1.5F, -2.199F, 15.1566F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r90.texOffs(68, 105).addBox(-1.5F, -2.199F, 16.5316F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        MiniLeverPanel6 = new ModelRenderer(this);
        MiniLeverPanel6.setPos(3.625F, -8.0162F, -18.5361F);
        Controls.addChild(MiniLeverPanel6);


        Panel5Rot2 = new ModelRenderer(this);
        Panel5Rot2.setPos(3.375F, 3.0162F, 22.2861F);
        MiniLeverPanel6.addChild(Panel5Rot2);
        setRotationAngle(Panel5Rot2, 0.0F, 1.0472F, 0.0F);


        MiniLever19 = new ModelRenderer(this);
        MiniLever19.setPos(-5.25F, -21.3466F, -22.4944F);
        Panel5Rot2.addChild(MiniLever19);
        setRotationAngle(MiniLever19, -0.7854F, 0.0F, 0.0F);


        cube_r91 = new ModelRenderer(this);
        cube_r91.setPos(1.0F, 14.1804F, 7.309F);
        MiniLever19.addChild(cube_r91);
        setRotationAngle(cube_r91, 1.946F, 0.0F, 0.0F);
        cube_r91.texOffs(68, 108).addBox(-1.5F, -2.199F, 15.1566F, 1.0F, 1.0F, 2.0F, -0.35F, false);
        cube_r91.texOffs(68, 105).addBox(-1.5F, -2.199F, 16.5316F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        Random = new ModelRenderer(this);
        Random.setPos(0.0F, -5.7662F, -22.9736F);
        Controls.addChild(Random);


        rando = new ModelRenderer(this);
        rando.setPos(0.0F, 0.0F, 0.0F);
        Random.addChild(rando);


        cube_r92 = new ModelRenderer(this);
        cube_r92.setPos(0.0F, -16.8F, 0.0F);
        rando.addChild(cube_r92);
        setRotationAngle(cube_r92, 1.946F, 0.0F, 0.0F);
        cube_r92.texOffs(68, 101).addBox(5.875F, 6.5F, -0.25F, 1.0F, 3.0F, 1.0F, 0.125F, false);
        cube_r92.texOffs(68, 108).addBox(3.875F, 1.875F, -0.125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r92.texOffs(68, 108).addBox(1.875F, 1.75F, -0.125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r92.texOffs(68, 108).addBox(2.875F, 2.375F, -0.125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r92.texOffs(68, 108).addBox(0.875F, 2.0F, -0.125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r92.texOffs(68, 105).addBox(-0.125F, 2.625F, -0.125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r92.texOffs(68, 105).addBox(-5.5F, 5.25F, -0.375F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        cube_r93 = new ModelRenderer(this);
        cube_r93.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(cube_r93);
        setRotationAngle(cube_r93, -1.1956F, -2.0944F, 0.0F);
        cube_r93.texOffs(68, 108).addBox(5.5F, 14.375F, -9.0986F, 2.0F, 2.0F, 1.0F, 0.125F, false);
        cube_r93.texOffs(68, 105).addBox(0.75F, 18.625F, -9.0986F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        cube_r94 = new ModelRenderer(this);
        cube_r94.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(cube_r94);
        setRotationAngle(cube_r94, -1.1956F, 3.1416F, 0.0F);
        cube_r94.texOffs(70, 112).addBox(1.625F, 14.5F, -8.8486F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        cube_r94.texOffs(70, 112).addBox(-2.625F, 14.5F, -8.8486F, 1.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r95 = new ModelRenderer(this);
        cube_r95.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(cube_r95);
        setRotationAngle(cube_r95, -1.1956F, 2.0944F, 0.0F);
        cube_r95.texOffs(69, 108).addBox(8.25F, 18.5F, -9.3486F, 1.0F, 2.0F, 1.0F, -0.125F, false);
        cube_r95.texOffs(69, 108).addBox(7.0F, 18.5F, -9.3486F, 1.0F, 2.0F, 1.0F, -0.125F, false);
        cube_r95.texOffs(68, 105).addBox(2.625F, 18.75F, -9.0986F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        cube_r96 = new ModelRenderer(this);
        cube_r96.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(cube_r96);
        setRotationAngle(cube_r96, -1.1956F, 1.0472F, 0.0F);
        cube_r96.texOffs(69, 108).addBox(6.625F, 16.5F, -9.3486F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        cube_r96.texOffs(69, 108).addBox(8.625F, 16.5F, -9.3486F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        cube_r96.texOffs(69, 108).addBox(7.625F, 16.5F, -9.3486F, 1.0F, 2.0F, 1.0F, -0.25F, false);

        cube_r97 = new ModelRenderer(this);
        cube_r97.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(cube_r97);
        setRotationAngle(cube_r97, -1.1956F, -1.0472F, 0.0F);
        cube_r97.texOffs(68, 105).addBox(4.125F, 19.0F, -9.0986F, 1.0F, 1.0F, 1.0F, 0.125F, false);
        cube_r97.texOffs(68, 105).addBox(-5.125F, 19.0F, -9.0986F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        randomizer = new LightModelRenderer(this);
        randomizer.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(randomizer);


        cube_r98 = new ModelRenderer(this);
        cube_r98.setPos(0.0F, 0.0F, 0.0F);
        randomizer.addChild(cube_r98);
        setRotationAngle(cube_r98, -1.1956F, -2.0944F, 0.0F);
        cube_r98.texOffs(68, 105).addBox(6.75F, 18.625F, -9.0986F, 1.0F, 1.0F, 1.0F, 0.125F, false);

        dimensioncontrol = new LightModelRenderer(this);
        dimensioncontrol.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(dimensioncontrol);


        cube_r99 = new ModelRenderer(this);
        cube_r99.setPos(0.0F, 0.0F, 0.0F);
        dimensioncontrol.addChild(cube_r99);
        setRotationAngle(cube_r99, -1.1956F, -2.0944F, 0.0F);
        cube_r99.texOffs(68, 108).addBox(1.0F, 14.375F, -9.0986F, 2.0F, 2.0F, 1.0F, 0.125F, false);

        fastret = new LightModelRenderer(this);
        fastret.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(fastret);


        cube_r100 = new ModelRenderer(this);
        cube_r100.setPos(0.0F, 0.0F, 0.0F);
        fastret.addChild(cube_r100);
        setRotationAngle(cube_r100, -1.1956F, 3.1416F, 0.0F);
        cube_r100.texOffs(68, 108).addBox(-6.75F, 13.5F, -9.0986F, 2.0F, 2.0F, 1.0F, 0.125F, false);

        stabs = new LightModelRenderer(this);
        stabs.setPos(0.0F, -16.8F, 22.9736F);
        rando.addChild(stabs);


        cube_r101 = new ModelRenderer(this);
        cube_r101.setPos(0.0F, 0.0F, 0.0F);
        stabs.addChild(cube_r101);
        setRotationAngle(cube_r101, -1.1956F, 3.1416F, 0.0F);
        cube_r101.texOffs(68, 108).addBox(4.75F, 13.5F, -9.0986F, 2.0F, 2.0F, 1.0F, 0.125F, false);

        Swivelers = new ModelRenderer(this);
        Swivelers.setPos(3.625F, -2.25F, 4.4375F);
        Random.addChild(Swivelers);


        Panel2 = new ModelRenderer(this);
        Panel2.setPos(-3.625F, 1.0F, 18.5361F);
        Swivelers.addChild(Panel2);
        setRotationAngle(Panel2, 0.0F, -1.0472F, 0.0F);


        Swiv1 = new ModelRenderer(this);
        Swiv1.setPos(-4.75F, -1.25F, -18.0361F);
        Panel2.addChild(Swiv1);
        Swiv1.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap1 = new ModelRenderer(this);
        SwivCap1.setPos(0.0F, -0.875F, -0.0625F);
        Swiv1.addChild(SwivCap1);
        SwivCap1.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap1.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Swiv2 = new ModelRenderer(this);
        Swiv2.setPos(4.75F, -1.25F, -18.0361F);
        Panel2.addChild(Swiv2);
        Swiv2.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap2 = new ModelRenderer(this);
        SwivCap2.setPos(0.0F, -0.875F, -0.0625F);
        Swiv2.addChild(SwivCap2);
        SwivCap2.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap2.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Panel5 = new ModelRenderer(this);
        Panel5.setPos(-3.625F, 1.0F, 18.5361F);
        Swivelers.addChild(Panel5);
        setRotationAngle(Panel5, 0.0F, 2.0944F, 0.0F);


        Swiv3 = new ModelRenderer(this);
        Swiv3.setPos(-8.125F, 0.0F, -20.6611F);
        Panel5.addChild(Swiv3);
        Swiv3.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap3 = new ModelRenderer(this);
        SwivCap3.setPos(0.0F, -0.875F, -0.0625F);
        Swiv3.addChild(SwivCap3);
        setRotationAngle(SwivCap3, 0.0F, -0.6109F, 0.0F);
        SwivCap3.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap3.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Swiv4 = new ModelRenderer(this);
        Swiv4.setPos(-9.625F, 0.125F, -21.4111F);
        Panel5.addChild(Swiv4);
        Swiv4.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap4 = new ModelRenderer(this);
        SwivCap4.setPos(0.0F, -0.875F, -0.0625F);
        Swiv4.addChild(SwivCap4);
        setRotationAngle(SwivCap4, 0.0F, 1.0472F, 0.0F);
        SwivCap4.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap4.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Swiv5 = new ModelRenderer(this);
        Swiv5.setPos(-0.875F, -1.875F, -16.7861F);
        Panel5.addChild(Swiv5);
        Swiv5.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap5 = new ModelRenderer(this);
        SwivCap5.setPos(0.0F, -0.875F, -0.0625F);
        Swiv5.addChild(SwivCap5);
        setRotationAngle(SwivCap5, 0.0F, 1.0472F, 0.0F);
        SwivCap5.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap5.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Swiv6 = new ModelRenderer(this);
        Swiv6.setPos(0.875F, -1.875F, -16.7861F);
        Panel5.addChild(Swiv6);
        Swiv6.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap6 = new ModelRenderer(this);
        SwivCap6.setPos(0.0F, -0.875F, -0.0625F);
        Swiv6.addChild(SwivCap6);
        setRotationAngle(SwivCap6, 0.0F, -0.4363F, 0.0F);
        SwivCap6.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap6.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Panel6 = new ModelRenderer(this);
        Panel6.setPos(-3.625F, 1.0F, 18.5361F);
        Swivelers.addChild(Panel6);
        setRotationAngle(Panel6, 0.0F, 1.0472F, 0.0F);


        Swiv8 = new ModelRenderer(this);
        Swiv8.setPos(-9.375F, 0.125F, -21.1611F);
        Panel6.addChild(Swiv8);
        Swiv8.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap8 = new ModelRenderer(this);
        SwivCap8.setPos(0.0F, -0.875F, -0.0625F);
        Swiv8.addChild(SwivCap8);
        setRotationAngle(SwivCap8, 0.0F, 0.0436F, 0.0F);
        SwivCap8.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap8.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Swiv7 = new ModelRenderer(this);
        Swiv7.setPos(-7.375F, 0.125F, -21.1611F);
        Panel6.addChild(Swiv7);
        Swiv7.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap7 = new ModelRenderer(this);
        SwivCap7.setPos(0.0F, -0.875F, -0.0625F);
        Swiv7.addChild(SwivCap7);
        setRotationAngle(SwivCap7, 0.0F, -0.4363F, 0.0F);
        SwivCap7.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap7.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);

        Swiv9 = new ModelRenderer(this);
        Swiv9.setPos(0.0F, -2.25F, -15.2861F);
        Panel6.addChild(Swiv9);
        Swiv9.texOffs(69, 113).addBox(-0.5F, -17.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        SwivCap9 = new ModelRenderer(this);
        SwivCap9.setPos(0.0F, -0.875F, -0.0625F);
        Swiv9.addChild(SwivCap9);
        setRotationAngle(SwivCap9, 0.0F, 1.0472F, 0.0F);
        SwivCap9.texOffs(69, 115).addBox(-0.5F, -17.3F, -0.4375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
        SwivCap9.texOffs(69, 115).addBox(-0.5F, -17.3F, -1.8125F, 1.0F, 1.0F, 2.0F, -0.25F, false);
}

    @Override
    public void render(HartnellConsoleTile hartnellTile, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Console.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Controls.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        TimeRotor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        hartnellTile.getControl(ThrottleControl.class).ifPresent((throt) -> {
//            this.Throttle.z = this.Throttle.z -(throt.getAmount()*.14F);
//            this.Throttle.z = (float) Math.toRadians((double) (320 + throt.getAmount() * 240)); //100.0F - 75.0F
            this.Throttle.z = (float) Math.toRadians(-220 + (throt.getAmount() * 220)); //100.0F - 75.0F
            this.Throttle.y = (float) Math.toRadians(-220 + (throt.getAmount() * 220)); //100.0F - 75.0F
        });
        hartnellTile.getControl(HandbrakeControl.class).ifPresent((brake) -> {
            this.Handbrake.z = (float) Math.toRadians(-220 + ((brake.isFree() ? 1 : 0) * 220)); //100.0F - 75.0F
            this.Handbrake.y = (float) Math.toRadians(-220 + ((brake.isFree() ? 1 : 0) * 220)); //100.0F - 75.0F
        });
        hartnellTile.getControl(DoorControl.class).ifPresent((door) -> {
//            this.Throttle.z = this.Throttle.z -(throt.getAmount()*.14F);
//            this.Throttle.z = (float) Math.toRadians((double) (320 + throt.getAmount() * 240)); //100.0F - 75.0F
            this.Throttle.y = (float) Math.toRadians((double) -(97 + (door.getAnimationProgress() != 0 ? 1 : 0) * 100)); //100.0F - 75.0F
        });
        hartnellTile.getControl(LandingTypeControl.class).ifPresent((LandType) -> {
            this.MiniLever19.xRot = LandType.getLandType().equals(LandingTypeControl.EnumLandType.UP) ? (float) Math.toRadians(-37F) : (float) Math.toRadians(26F);
        });
//        hartnellTile.getControl(LandingTypeControl.class).ifPresent((LandType) -> {
//            this.MiniLever19.xRot = LandType.getLandType().equals(LandingTypeControl.EnumLandType.UP) ? 45F : -37F;
//        });
        hartnellTile.getControl(RandomiserControl.class).ifPresent((rand) -> {
            this.randomizer.setBright(rand.getAnimationTicks() != 0 ? 1F : 0F);
        });
        hartnellTile.getControl(DimensionControl.class).ifPresent((dim) -> {
            this.dimensioncontrol.setBright(dim.getAnimationTicks() != 0 ? 1F : 0F);
        });
        hartnellTile.getControl(FastReturnControl.class).ifPresent((fastReturnControl) -> {
            this.fastret.setBright(fastReturnControl.getAnimationTicks() != 0 ? 1F : 0F);
        });
        hartnellTile.getSubsystem(StabilizerSubsystem.class).ifPresent((stabsus) -> {
            this.stabs.setBright(stabsus.isControlActivated() ? 1F : 0F);
        });
        hartnellTile.getControl(XControl.class).ifPresent((X) -> {
            this.MiniLever12.xRot = (float) Math.toRadians(X.getAnimationTicks() != 0 ? 1F : 0F);
        });
        hartnellTile.getControl(YControl.class).ifPresent((Y) -> {
            this.MiniLever13.xRot = (float) Math.toRadians(Y.getAnimationProgress() != 0 ? 1F : 0F);
        });
        hartnellTile.getControl(ZControl.class).ifPresent((Z) -> {
            this.MiniLever14.xRot = (float) Math.toRadians(Z.getAnimationProgress() != 0 ? 1F : 0F);
        });

    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}