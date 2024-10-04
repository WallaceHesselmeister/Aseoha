package com.code.aseoha.client.models.consoles;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.tileentities.consoles.BrackolinConsoleTile;
import com.code.aseoha.tileentities.consoles.CopperConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.client.models.LightModelRenderer;

public class BrackolinConsole extends EntityModel<Entity> implements TileModel<BrackolinConsoleTile> {
    private final ModelRenderer Console;
    private final ModelRenderer BaseConsole;
    private final ModelRenderer Feet;
    private final ModelRenderer Foot1;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Foot2;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer Foot3;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer ConsolePillar;
    private final ModelRenderer Part1;
    private final ModelRenderer hexadecagon_r1;
    private final ModelRenderer hexadecagon_r2;
    private final ModelRenderer hexadecagon_r3;
    private final ModelRenderer hexadecagon_r4;
    private final ModelRenderer Part2;
    private final ModelRenderer hexadecagon_r5;
    private final ModelRenderer hexadecagon_r6;
    private final ModelRenderer hexadecagon_r7;
    private final ModelRenderer hexadecagon_r8;
    private final ModelRenderer Part3;
    private final ModelRenderer hexadecagon_r9;
    private final ModelRenderer hexadecagon_r10;
    private final ModelRenderer hexadecagon_r11;
    private final ModelRenderer hexadecagon_r12;
    private final ModelRenderer Part4;
    private final ModelRenderer hexadecagon_r13;
    private final ModelRenderer hexadecagon_r14;
    private final ModelRenderer hexadecagon_r15;
    private final ModelRenderer hexadecagon_r16;
    private final ModelRenderer Part5;
    private final ModelRenderer hexadecagon_r17;
    private final ModelRenderer hexadecagon_r18;
    private final ModelRenderer hexadecagon_r19;
    private final ModelRenderer hexadecagon_r20;
    private final ModelRenderer PanelBase;
    private final ModelRenderer P1;
    private final ModelRenderer PanelSplitters;
    private final ModelRenderer Rotation;
    private final ModelRenderer Angle;
    private final ModelRenderer cube_r10;
    private final ModelRenderer PanelBaseSlant;
    private final ModelRenderer bone19;
    private final ModelRenderer bone18;
    private final ModelRenderer P2;
    private final ModelRenderer PanelSplitters2;
    private final ModelRenderer Rotation2;
    private final ModelRenderer Angle2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer PanelBaseSlant2;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer P3;
    private final ModelRenderer PanelSplitters3;
    private final ModelRenderer Rotation3;
    private final ModelRenderer Angle3;
    private final ModelRenderer cube_r12;
    private final ModelRenderer PanelBaseSlant3;
    private final ModelRenderer P4;
    private final ModelRenderer PanelSplitters4;
    private final ModelRenderer Rotation4;
    private final ModelRenderer Angle4;
    private final ModelRenderer cube_r13;
    private final ModelRenderer PanelBaseSlant4;
    private final ModelRenderer cube_r14;
    private final ModelRenderer bone20;
    private final ModelRenderer bone21;
    private final ModelRenderer P5;
    private final ModelRenderer PanelSplitters5;
    private final ModelRenderer Rotation5;
    private final ModelRenderer Angle5;
    private final ModelRenderer cube_r15;
    private final ModelRenderer PanelBaseSlant5;
    private final ModelRenderer Monitor;
    private final ModelRenderer P6;
    private final ModelRenderer PanelSplitters6;
    private final ModelRenderer Rotation6;
    private final ModelRenderer Angle6;
    private final ModelRenderer cube_r16;
    private final ModelRenderer PanelBaseSlant6;
    private final ModelRenderer SupportStruts;
    private final ModelRenderer Strut1;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer Strut2;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer Strut3;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer TimeRotor;
    private final ModelRenderer Part6;
    private final ModelRenderer hexadecagon_r21;
    private final ModelRenderer hexadecagon_r22;
    private final ModelRenderer hexadecagon_r23;
    private final ModelRenderer hexadecagon_r24;
    private final ModelRenderer Part7;
    private final ModelRenderer hexadecagon_r25;
    private final ModelRenderer hexadecagon_r26;
    private final ModelRenderer hexadecagon_r27;
    private final ModelRenderer hexadecagon_r28;
    private final ModelRenderer Part8;
    private final ModelRenderer hexadecagon_r29;
    private final ModelRenderer hexadecagon_r30;
    private final ModelRenderer hexadecagon_r31;
    private final ModelRenderer hexadecagon_r32;
    private final ModelRenderer Controls;
    private final ModelRenderer Panel1;
    private final ModelRenderer PanelBaseSlant7;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer Refuel;
    private final ModelRenderer DimensionalShifter;
    private final ModelRenderer cube_r31;
    private final LightModelRenderer XControl;
    private final ModelRenderer bone9;
    private final ModelRenderer bone10;
    private final LightModelRenderer YControl;
    private final LightModelRenderer ZControl;
    private final LightModelRenderer ControlIncMod;
    private final ModelRenderer Panel2;
    private final ModelRenderer PanelBaseSlant8;
    private final ModelRenderer cube_r32;
    private final ModelRenderer DoorSwitch;
    private final ModelRenderer cube_r33;
    private final ModelRenderer DoorSwitch2;
    private final ModelRenderer cube_r34;
    private final ModelRenderer Panel3;
    private final ModelRenderer PanelBaseSlant9;
    private final LightModelRenderer Randomiser;
    private final ModelRenderer VerticalLandType;
    private final LightModelRenderer VerticalLandTypeUp;
    private final LightModelRenderer VerticalLandTypeDown;
    private final ModelRenderer ExteriorFacing;
    private final ModelRenderer bone15;
    private final LightModelRenderer ExteriorFacingNorth;
    private final LightModelRenderer ExteriorFacingEast;
    private final LightModelRenderer ExteriorFacingSouth;
    private final LightModelRenderer ExteriorFacingWest;
    private final ModelRenderer RandomLevers;
    private final ModelRenderer Lever;
    private final ModelRenderer Lever2;
    private final ModelRenderer Lever3;
    private final ModelRenderer Lever4;
    private final ModelRenderer Lever6;
    private final ModelRenderer Lever7;
    private final ModelRenderer Lever8;
    private final ModelRenderer Lever9;
    private final ModelRenderer Lights2;
    private final ModelRenderer Lamp2;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone7;
    private final ModelRenderer bone8;
    private final ModelRenderer Panel4;
    private final ModelRenderer PanelBaseSlant10;
    private final ModelRenderer Handbrake;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer Throttle;
    private final ModelRenderer Lights3;
    private final ModelRenderer Lamp3;
    private final ModelRenderer Lights5;
    private final ModelRenderer Lamp5;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone3;
    private final ModelRenderer Panel6;
    private final ModelRenderer PanelBaseSlant11;
    private final LightModelRenderer FastReturn;
    private final ModelRenderer Lights4;
    private final ModelRenderer Lamp4;
    private final ModelRenderer bone13;
    private final ModelRenderer bone14;
    private final ModelRenderer bone12;
    private final ModelRenderer bone11;
    private final ModelRenderer RandomLevers2;
    private final ModelRenderer Lever5;
    private final ModelRenderer Lever10;
    private final ModelRenderer Lever11;
    private final ModelRenderer Lever12;
    private final ModelRenderer Lever13;
    private final ModelRenderer Lever14;
    private final ModelRenderer Lever15;
    private final ModelRenderer Lever16;

    public BrackolinConsole() {
        texWidth = 160;
        texHeight = 160;

        Console = new ModelRenderer(this);
        Console.setPos(0.0F, 24.0F, 0.0F);


        BaseConsole = new ModelRenderer(this);
        BaseConsole.setPos(0.0F, 0.0F, 0.0F);
        Console.addChild(BaseConsole);


        Feet = new ModelRenderer(this);
        Feet.setPos(0.0F, 0.0F, 0.0F);
        BaseConsole.addChild(Feet);


        Foot1 = new ModelRenderer(this);
        Foot1.setPos(0.0F, 0.0F, 0.0F);
        Feet.addChild(Foot1);
        setRotationAngle(Foot1, 0.0F, -1.0472F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -0.7119F, -8.1283F);
        Foot1.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
        cube_r1.texOffs(46, 92).addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r1.texOffs(0, 99).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -0.4775F, -6.0761F);
        Foot1.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.0436F, 0.0F, 0.0F);
        cube_r2.texOffs(26, 124).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.249F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, 0.1736F, -3.9923F);
        Foot1.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
        cube_r3.texOffs(94, 86).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

        Foot2 = new ModelRenderer(this);
        Foot2.setPos(0.0F, 0.0F, 0.0F);
        Feet.addChild(Foot2);
        setRotationAngle(Foot2, 0.0F, 3.1416F, 0.0F);


        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -0.7119F, -8.1283F);
        Foot2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.2618F, 0.0F, 0.0F);
        cube_r4.texOffs(86, 6).addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r4.texOffs(75, 29).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, -0.4775F, -6.0761F);
        Foot2.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.0436F, 0.0F, 0.0F);
        cube_r5.texOffs(80, 66).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.249F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.1736F, -3.9923F);
        Foot2.addChild(cube_r6);
        setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
        cube_r6.texOffs(86, 21).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

        Foot3 = new ModelRenderer(this);
        Foot3.setPos(0.0F, 0.0F, 0.0F);
        Feet.addChild(Foot3);
        setRotationAngle(Foot3, 0.0F, 1.0472F, 0.0F);


        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, -0.7119F, -8.1283F);
        Foot3.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.2618F, 0.0F, 0.0F);
        cube_r7.texOffs(42, 70).addBox(-1.0F, -1.75F, -4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r7.texOffs(0, 67).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, -0.4775F, -6.0761F);
        Foot3.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        cube_r8.texOffs(16, 70).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 3.0F, -0.249F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.1736F, -3.9923F);
        Foot3.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.2618F, 0.0F, 0.0F);
        cube_r9.texOffs(66, 78).addBox(-1.0F, -1.75F, -3.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

        ConsolePillar = new ModelRenderer(this);
        ConsolePillar.setPos(0.0F, 0.0F, 0.0F);
        BaseConsole.addChild(ConsolePillar);


        Part1 = new ModelRenderer(this);
        Part1.setPos(0.0F, -10.75F, 0.0F);
        ConsolePillar.addChild(Part1);
        Part1.texOffs(39, 135).addBox(-0.9946F, -9.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
        Part1.texOffs(53, 103).addBox(-0.9946F, -9.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
        Part1.texOffs(43, 39).addBox(-5.0F, -9.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
        Part1.texOffs(0, 13).addBox(4.0F, -9.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);

        hexadecagon_r1 = new ModelRenderer(this);
        hexadecagon_r1.setPos(0.0F, -7.0F, 0.0F);
        Part1.addChild(hexadecagon_r1);
        setRotationAngle(hexadecagon_r1, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r1.texOffs(0, 26).addBox(4.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
        hexadecagon_r1.texOffs(0, 39).addBox(-5.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
        hexadecagon_r1.texOffs(104, 105).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
        hexadecagon_r1.texOffs(78, 133).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

        hexadecagon_r2 = new ModelRenderer(this);
        hexadecagon_r2.setPos(0.0F, -7.0F, 0.0F);
        Part1.addChild(hexadecagon_r2);
        setRotationAngle(hexadecagon_r2, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r2.texOffs(0, 0).addBox(4.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
        hexadecagon_r2.texOffs(34, 52).addBox(-5.0F, -2.0F, -0.9946F, 1.0F, 7.0F, 1.9891F, 0.0F, false);
        hexadecagon_r2.texOffs(39, 102).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
        hexadecagon_r2.texOffs(110, 135).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

        hexadecagon_r3 = new ModelRenderer(this);
        hexadecagon_r3.setPos(0.0F, -7.0F, 0.0F);
        Part1.addChild(hexadecagon_r3);
        setRotationAngle(hexadecagon_r3, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r3.texOffs(48, 55).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
        hexadecagon_r3.texOffs(107, 86).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

        hexadecagon_r4 = new ModelRenderer(this);
        hexadecagon_r4.setPos(0.0F, -7.0F, 0.0F);
        Part1.addChild(hexadecagon_r4);
        setRotationAngle(hexadecagon_r4, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r4.texOffs(0, 81).addBox(-0.9946F, -2.0F, 4.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);
        hexadecagon_r4.texOffs(117, 135).addBox(-0.9946F, -2.0F, -5.0F, 1.9891F, 7.0F, 1.0F, 0.0F, false);

        Part2 = new ModelRenderer(this);
        Part2.setPos(0.0F, -3.0F, 0.0F);
        ConsolePillar.addChild(Part2);
        Part2.texOffs(0, 81).addBox(-0.8951F, -11.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);
        Part2.texOffs(0, 112).addBox(-4.5F, -11.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, 0.0F, false);

        hexadecagon_r5 = new ModelRenderer(this);
        hexadecagon_r5.setPos(0.0F, -8.0F, 0.0F);
        Part2.addChild(hexadecagon_r5);
        setRotationAngle(hexadecagon_r5, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r5.texOffs(108, 73).addBox(-4.5F, -3.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, 0.0F, false);
        hexadecagon_r5.texOffs(66, 75).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

        hexadecagon_r6 = new ModelRenderer(this);
        hexadecagon_r6.setPos(0.0F, -8.0F, 0.0F);
        Part2.addChild(hexadecagon_r6);
        setRotationAngle(hexadecagon_r6, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r6.texOffs(113, 105).addBox(-4.5F, -3.0F, -0.8951F, 9.0F, 8.0F, 1.7902F, 0.0F, false);
        hexadecagon_r6.texOffs(82, 66).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

        hexadecagon_r7 = new ModelRenderer(this);
        hexadecagon_r7.setPos(0.0F, -8.0F, 0.0F);
        Part2.addChild(hexadecagon_r7);
        setRotationAngle(hexadecagon_r7, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r7.texOffs(43, 70).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

        hexadecagon_r8 = new ModelRenderer(this);
        hexadecagon_r8.setPos(0.0F, -8.0F, 0.0F);
        Part2.addChild(hexadecagon_r8);
        setRotationAngle(hexadecagon_r8, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r8.texOffs(23, 84).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 8.0F, 9.0F, 0.0F, false);

        Part3 = new ModelRenderer(this);
        Part3.setPos(0.0F, 1.0F, 0.0F);
        ConsolePillar.addChild(Part3);
        Part3.texOffs(86, 6).addBox(-0.9946F, -7.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);
        Part3.texOffs(111, 116).addBox(-5.0F, -7.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, 0.0F, false);

        hexadecagon_r9 = new ModelRenderer(this);
        hexadecagon_r9.setPos(0.0F, -8.0F, 0.0F);
        Part3.addChild(hexadecagon_r9);
        setRotationAngle(hexadecagon_r9, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r9.texOffs(114, 26).addBox(-5.0F, 1.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, 0.0F, false);
        hexadecagon_r9.texOffs(85, 40).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

        hexadecagon_r10 = new ModelRenderer(this);
        hexadecagon_r10.setPos(0.0F, -8.0F, 0.0F);
        Part3.addChild(hexadecagon_r10);
        setRotationAngle(hexadecagon_r10, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r10.texOffs(23, 117).addBox(-5.0F, 1.0F, -0.9946F, 10.0F, 4.0F, 1.9891F, 0.0F, false);
        hexadecagon_r10.texOffs(86, 21).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

        hexadecagon_r11 = new ModelRenderer(this);
        hexadecagon_r11.setPos(0.0F, -8.0F, 0.0F);
        Part3.addChild(hexadecagon_r11);
        setRotationAngle(hexadecagon_r11, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r11.texOffs(79, 84).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

        hexadecagon_r12 = new ModelRenderer(this);
        hexadecagon_r12.setPos(0.0F, -8.0F, 0.0F);
        Part3.addChild(hexadecagon_r12);
        setRotationAngle(hexadecagon_r12, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r12.texOffs(46, 88).addBox(-0.9946F, 1.0F, -5.0F, 1.9891F, 4.0F, 10.0F, 0.0F, false);

        Part4 = new ModelRenderer(this);
        Part4.setPos(0.0F, 3.0F, 0.0F);
        ConsolePillar.addChild(Part4);
        Part4.texOffs(17, 55).addBox(-1.1935F, -5.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);
        Part4.texOffs(101, 11).addBox(-6.0F, -5.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, 0.0F, false);

        hexadecagon_r13 = new ModelRenderer(this);
        hexadecagon_r13.setPos(0.0F, -8.0F, 0.0F);
        Part4.addChild(hexadecagon_r13);
        setRotationAngle(hexadecagon_r13, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r13.texOffs(101, 6).addBox(-6.0F, 3.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, 0.0F, false);
        hexadecagon_r13.texOffs(0, 52).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

        hexadecagon_r14 = new ModelRenderer(this);
        hexadecagon_r14.setPos(0.0F, -8.0F, 0.0F);
        Part4.addChild(hexadecagon_r14);
        setRotationAngle(hexadecagon_r14, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r14.texOffs(101, 21).addBox(-6.0F, 3.0F, -1.1935F, 12.0F, 2.0F, 2.3869F, 0.0F, false);
        hexadecagon_r14.texOffs(46, 55).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

        hexadecagon_r15 = new ModelRenderer(this);
        hexadecagon_r15.setPos(0.0F, -8.0F, 0.0F);
        Part4.addChild(hexadecagon_r15);
        setRotationAngle(hexadecagon_r15, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r15.texOffs(41, 40).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

        hexadecagon_r16 = new ModelRenderer(this);
        hexadecagon_r16.setPos(0.0F, -8.0F, 0.0F);
        Part4.addChild(hexadecagon_r16);
        setRotationAngle(hexadecagon_r16, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r16.texOffs(58, 29).addBox(-1.1935F, 3.0F, -6.0F, 2.3869F, 2.0F, 12.0F, 0.0F, false);

        Part5 = new ModelRenderer(this);
        Part5.setPos(0.0F, -17.0F, 0.0F);
        ConsolePillar.addChild(Part5);
        Part5.texOffs(133, 139).addBox(-0.8951F, -3.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
        Part5.texOffs(139, 6).addBox(-0.8951F, -3.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
        Part5.texOffs(99, 120).addBox(3.5F, -3.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
        Part5.texOffs(25, 84).addBox(-4.5F, -3.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);

        hexadecagon_r17 = new ModelRenderer(this);
        hexadecagon_r17.setPos(0.0F, -7.0F, 0.0F);
        Part5.addChild(hexadecagon_r17);
        setRotationAngle(hexadecagon_r17, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r17.texOffs(57, 70).addBox(-4.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
        hexadecagon_r17.texOffs(53, 120).addBox(3.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
        hexadecagon_r17.texOffs(139, 0).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
        hexadecagon_r17.texOffs(139, 126).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

        hexadecagon_r18 = new ModelRenderer(this);
        hexadecagon_r18.setPos(0.0F, -7.0F, 0.0F);
        Part5.addChild(hexadecagon_r18);
        setRotationAngle(hexadecagon_r18, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r18.texOffs(87, 39).addBox(-4.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
        hexadecagon_r18.texOffs(73, 125).addBox(3.5F, 4.0F, -0.8951F, 1.0F, 1.0F, 1.7902F, 0.0F, false);
        hexadecagon_r18.texOffs(139, 28).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
        hexadecagon_r18.texOffs(140, 13).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

        hexadecagon_r19 = new ModelRenderer(this);
        hexadecagon_r19.setPos(0.0F, -7.0F, 0.0F);
        Part5.addChild(hexadecagon_r19);
        setRotationAngle(hexadecagon_r19, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r19.texOffs(137, 98).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
        hexadecagon_r19.texOffs(139, 90).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

        hexadecagon_r20 = new ModelRenderer(this);
        hexadecagon_r20.setPos(0.0F, -7.0F, 0.0F);
        Part5.addChild(hexadecagon_r20);
        setRotationAngle(hexadecagon_r20, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r20.texOffs(139, 84).addBox(-0.8951F, 4.0F, 3.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);
        hexadecagon_r20.texOffs(140, 66).addBox(-0.8951F, 4.0F, -4.5F, 1.7902F, 1.0F, 1.0F, 0.0F, false);

        PanelBase = new ModelRenderer(this);
        PanelBase.setPos(0.0F, 0.0F, 0.0F);
        BaseConsole.addChild(PanelBase);


        P1 = new ModelRenderer(this);
        P1.setPos(0.0F, 0.0F, 0.0F);
        PanelBase.addChild(P1);
        P1.texOffs(96, 66).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
        P1.texOffs(43, 16).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

        PanelSplitters = new ModelRenderer(this);
        PanelSplitters.setPos(0.0F, 0.0F, 0.0F);
        P1.addChild(PanelSplitters);


        Rotation = new ModelRenderer(this);
        Rotation.setPos(0.0F, 0.0F, 0.0F);
        PanelSplitters.addChild(Rotation);
        setRotationAngle(Rotation, 0.0F, -0.5236F, 0.0F);


        Angle = new ModelRenderer(this);
        Angle.setPos(0.0F, -16.25F, -10.5F);
        Rotation.addChild(Angle);
        setRotationAngle(Angle, 0.4625F, 0.0F, 0.0F);


        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.0F, -0.5F, 2.5F);
        Angle.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
        cube_r10.texOffs(100, 28).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

        PanelBaseSlant = new ModelRenderer(this);
        PanelBaseSlant.setPos(0.0F, -15.75F, -8.65F);
        P1.addChild(PanelBaseSlant);
        setRotationAngle(PanelBaseSlant, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant.texOffs(100, 45).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, -0.25F, false);
        PanelBaseSlant.texOffs(98, 129).addBox(3.0F, -0.634F, -1.0F, 3.0F, 3.0F, 3.0F, -0.25F, false);
        PanelBaseSlant.texOffs(10, 123).addBox(-6.0F, -0.634F, -1.0F, 3.0F, 3.0F, 3.0F, -0.25F, false);
        PanelBaseSlant.texOffs(23, 90).addBox(-5.0F, -0.634F, 1.5F, 3.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant.texOffs(94, 91).addBox(2.0F, -0.634F, 1.5F, 3.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant.texOffs(114, 33).addBox(-4.0F, -0.634F, 2.0F, 8.0F, 1.0F, 4.0F, -0.25F, false);

        bone19 = new ModelRenderer(this);
        bone19.setPos(0.0F, 0.2075F, -0.2255F);
        PanelBaseSlant.addChild(bone19);
        setRotationAngle(bone19, -0.5236F, 0.0F, 0.0F);
        bone19.texOffs(116, 123).addBox(-3.5F, -0.5F, -1.0F, 7.0F, 1.0F, 3.0F, -0.25F, false);

        bone18 = new ModelRenderer(this);
        bone18.setPos(0.0F, -0.0308F, 2.2654F);
        PanelBaseSlant.addChild(bone18);
        setRotationAngle(bone18, 0.829F, 0.0F, 0.0F);
        bone18.texOffs(121, 90).addBox(-3.5F, -0.5F, -2.5F, 7.0F, 1.0F, 3.0F, -0.25F, false);

        P2 = new ModelRenderer(this);
        P2.setPos(0.0F, 0.0F, 0.0F);
        PanelBase.addChild(P2);
        setRotationAngle(P2, 0.0F, -1.0472F, 0.0F);
        P2.texOffs(86, 3).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
        P2.texOffs(43, 3).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

        PanelSplitters2 = new ModelRenderer(this);
        PanelSplitters2.setPos(0.0F, 0.0F, 0.0F);
        P2.addChild(PanelSplitters2);


        Rotation2 = new ModelRenderer(this);
        Rotation2.setPos(0.0F, 0.0F, 0.0F);
        PanelSplitters2.addChild(Rotation2);
        setRotationAngle(Rotation2, 0.0F, -0.5236F, 0.0F);


        Angle2 = new ModelRenderer(this);
        Angle2.setPos(0.0F, -16.25F, -10.5F);
        Rotation2.addChild(Angle2);
        setRotationAngle(Angle2, 0.4625F, 0.0F, 0.0F);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, -0.5F, 2.5F);
        Angle2.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
        cube_r11.texOffs(74, 99).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

        PanelBaseSlant2 = new ModelRenderer(this);
        PanelBaseSlant2.setPos(0.0F, -15.75F, -8.65F);
        P2.addChild(PanelBaseSlant2);
        setRotationAngle(PanelBaseSlant2, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant2.texOffs(100, 41).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, -0.25F, false);
        PanelBaseSlant2.texOffs(0, 58).addBox(3.5F, -0.634F, -1.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);
        PanelBaseSlant2.texOffs(121, 84).addBox(-5.5F, -0.634F, -1.0F, 7.0F, 2.0F, 3.0F, -0.25F, false);
        PanelBaseSlant2.texOffs(110, 49).addBox(-4.5F, -0.634F, 1.5F, 9.0F, 1.0F, 4.0F, -0.25F, false);

        bone16 = new ModelRenderer(this);
        bone16.setPos(3.0F, 0.7075F, 0.6405F);
        PanelBaseSlant2.addChild(bone16);
        setRotationAngle(bone16, -0.5236F, 0.0F, 0.0F);
        bone16.texOffs(130, 20).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, -0.25F, false);

        bone17 = new ModelRenderer(this);
        bone17.setPos(3.0F, 0.3905F, 1.5915F);
        PanelBaseSlant2.addChild(bone17);
        setRotationAngle(bone17, 1.0472F, 0.0F, 0.0F);
        bone17.texOffs(129, 55).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, -0.25F, false);

        P3 = new ModelRenderer(this);
        P3.setPos(0.0F, 0.0F, 0.0F);
        PanelBase.addChild(P3);
        setRotationAngle(P3, 0.0F, -2.0944F, 0.0F);
        P3.texOffs(80, 63).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
        P3.texOffs(0, 39).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

        PanelSplitters3 = new ModelRenderer(this);
        PanelSplitters3.setPos(0.0F, 0.0F, 0.0F);
        P3.addChild(PanelSplitters3);


        Rotation3 = new ModelRenderer(this);
        Rotation3.setPos(0.0F, 0.0F, 0.0F);
        PanelSplitters3.addChild(Rotation3);
        setRotationAngle(Rotation3, 0.0F, -0.5236F, 0.0F);


        Angle3 = new ModelRenderer(this);
        Angle3.setPos(0.0F, -16.25F, -10.5F);
        Rotation3.addChild(Angle3);
        setRotationAngle(Angle3, 0.4625F, 0.0F, 0.0F);


        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, -0.5F, 2.5F);
        Angle3.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
        cube_r12.texOffs(0, 99).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

        PanelBaseSlant3 = new ModelRenderer(this);
        PanelBaseSlant3.setPos(0.0F, -15.75F, -8.65F);
        P3.addChild(PanelBaseSlant3);
        setRotationAngle(PanelBaseSlant3, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant3.texOffs(63, 55).addBox(-6.5F, -0.634F, -2.5F, 13.0F, 1.0F, 4.0F, -0.25F, false);
        PanelBaseSlant3.texOffs(111, 16).addBox(-5.0F, -0.634F, 1.0F, 10.0F, 1.0F, 2.0F, -0.25F, false);
        PanelBaseSlant3.texOffs(117, 98).addBox(-4.0F, -0.634F, 2.5F, 8.0F, 1.0F, 3.0F, -0.25F, false);

        P4 = new ModelRenderer(this);
        P4.setPos(0.0F, 0.0F, 0.0F);
        PanelBase.addChild(P4);
        setRotationAngle(P4, 0.0F, 3.1416F, 0.0F);
        P4.texOffs(43, 0).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
        P4.texOffs(0, 0).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

        PanelSplitters4 = new ModelRenderer(this);
        PanelSplitters4.setPos(0.0F, 0.0F, 0.0F);
        P4.addChild(PanelSplitters4);


        Rotation4 = new ModelRenderer(this);
        Rotation4.setPos(0.0F, 0.0F, 0.0F);
        PanelSplitters4.addChild(Rotation4);
        setRotationAngle(Rotation4, 0.0F, -0.5236F, 0.0F);


        Angle4 = new ModelRenderer(this);
        Angle4.setPos(0.0F, -16.25F, -10.5F);
        Rotation4.addChild(Angle4);
        setRotationAngle(Angle4, 0.4625F, 0.0F, 0.0F);


        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(0.0F, -0.5F, 2.5F);
        Angle4.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
        cube_r13.texOffs(60, 93).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

        PanelBaseSlant4 = new ModelRenderer(this);
        PanelBaseSlant4.setPos(0.0F, -15.75F, -8.65F);
        P4.addChild(PanelBaseSlant4);
        setRotationAngle(PanelBaseSlant4, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant4.texOffs(96, 69).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 2.0F, -0.25F, false);
        PanelBaseSlant4.texOffs(63, 61).addBox(-5.4F, -0.634F, -1.0F, 2.0F, 2.0F, 3.0F, -0.25F, false);
        PanelBaseSlant4.texOffs(121, 0).addBox(-1.4F, -0.634F, -1.0F, 7.0F, 2.0F, 3.0F, -0.25F, false);
        PanelBaseSlant4.texOffs(43, 29).addBox(-4.5F, -0.634F, 1.5F, 9.0F, 1.0F, 4.0F, -0.25F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(-3.0F, 0.7075F, 0.6405F);
        PanelBaseSlant4.addChild(cube_r14);
        setRotationAngle(cube_r14, -0.5236F, 0.0F, 0.0F);
        cube_r14.texOffs(0, 73).addBox(-0.5F, -0.65F, -2.0F, 2.0F, 1.0F, 3.0F, -0.25F, false);

        bone20 = new ModelRenderer(this);
        bone20.setPos(-3.0F, 0.7075F, 0.6405F);
        PanelBaseSlant4.addChild(bone20);
        setRotationAngle(bone20, -0.5236F, 0.0F, 0.0F);
        bone20.texOffs(133, 47).addBox(-0.9F, -0.5F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);

        bone21 = new ModelRenderer(this);
        bone21.setPos(-3.0F, 0.3905F, 1.5915F);
        PanelBaseSlant4.addChild(bone21);
        setRotationAngle(bone21, 1.0472F, 0.0F, 0.0F);
        bone21.texOffs(127, 128).addBox(-1.9F, -0.5F, -2.0F, 4.0F, 1.0F, 3.0F, -0.25F, false);

        P5 = new ModelRenderer(this);
        P5.setPos(0.0F, 0.0F, 0.0F);
        PanelBase.addChild(P5);
        setRotationAngle(P5, 0.0F, 2.0944F, 0.0F);
        P5.texOffs(78, 0).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
        P5.texOffs(0, 26).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

        PanelSplitters5 = new ModelRenderer(this);
        PanelSplitters5.setPos(0.0F, 0.0F, 0.0F);
        P5.addChild(PanelSplitters5);


        Rotation5 = new ModelRenderer(this);
        Rotation5.setPos(0.0F, 0.0F, 0.0F);
        PanelSplitters5.addChild(Rotation5);
        setRotationAngle(Rotation5, 0.0F, -0.5236F, 0.0F);


        Angle5 = new ModelRenderer(this);
        Angle5.setPos(0.0F, -16.25F, -10.5F);
        Rotation5.addChild(Angle5);
        setRotationAngle(Angle5, 0.4625F, 0.0F, 0.0F);


        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.0F, -0.5F, 2.5F);
        Angle5.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
        cube_r15.texOffs(94, 73).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

        PanelBaseSlant5 = new ModelRenderer(this);
        PanelBaseSlant5.setPos(0.0F, -15.75F, -8.65F);
        P5.addChild(PanelBaseSlant5);
        setRotationAngle(PanelBaseSlant5, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant5.texOffs(88, 101).addBox(-6.5F, -0.634F, -2.5F, 13.0F, 1.0F, 2.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(129, 60).addBox(-2.5F, -0.734F, -1.25F, 5.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(0, 105).addBox(1.5F, -0.634F, -1.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(23, 102).addBox(-5.5F, -0.634F, -1.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(58, 38).addBox(-5.5F, -0.634F, 3.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(17, 61).addBox(1.5F, -0.634F, 3.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(108, 129).addBox(1.3F, -0.734F, 2.9F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(123, 128).addBox(-3.3F, -0.734F, 2.9F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(32, 74).addBox(-3.3F, -0.734F, -0.75F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(82, 112).addBox(1.3F, -0.734F, -0.75F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(17, 55).addBox(2.3F, -0.734F, -0.5F, 1.0F, 1.0F, 4.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(0, 52).addBox(-3.3F, -0.734F, -0.5F, 1.0F, 1.0F, 4.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(37, 88).addBox(-3.5F, -0.634F, 3.5F, 7.0F, 1.0F, 2.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(73, 122).addBox(-2.5F, -0.734F, 3.25F, 5.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(128, 7).addBox(2.5F, -0.634F, -0.5F, 3.0F, 1.0F, 4.0F, -0.25F, false);
        PanelBaseSlant5.texOffs(14, 84).addBox(-5.5F, -0.634F, -0.5F, 3.0F, 1.0F, 4.0F, -0.25F, false);

        Monitor = new ModelRenderer(this);
        Monitor.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant5.addChild(Monitor);
        Monitor.texOffs(71, 115).addBox(-3.0F, -0.384F, -1.0F, 6.0F, 1.0F, 5.0F, -0.25F, false);

        P6 = new ModelRenderer(this);
        P6.setPos(0.0F, 0.0F, 0.0F);
        PanelBase.addChild(P6);
        setRotationAngle(P6, 0.0F, 1.0472F, 0.0F);
        P6.texOffs(75, 36).addBox(-8.0F, -13.75F, -13.65F, 16.0F, 1.0F, 1.0F, -0.25F, false);
        P6.texOffs(0, 13).addBox(-8.0F, -15.25F, -13.65F, 16.0F, 2.0F, 10.0F, -0.25F, false);

        PanelSplitters6 = new ModelRenderer(this);
        PanelSplitters6.setPos(0.0F, 0.0F, 0.0F);
        P6.addChild(PanelSplitters6);


        Rotation6 = new ModelRenderer(this);
        Rotation6.setPos(0.0F, 0.0F, 0.0F);
        PanelSplitters6.addChild(Rotation6);
        setRotationAngle(Rotation6, 0.0F, -0.5236F, 0.0F);


        Angle6 = new ModelRenderer(this);
        Angle6.setPos(0.0F, -16.25F, -10.5F);
        Rotation6.addChild(Angle6);
        setRotationAngle(Angle6, 0.4625F, 0.0F, 0.0F);


        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(0.0F, -0.5F, 2.5F);
        Angle6.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
        cube_r16.texOffs(93, 88).addBox(0.1328F, 0.1328F, -5.4462F, 1.0F, 1.0F, 11.0F, -0.25F, false);

        PanelBaseSlant6 = new ModelRenderer(this);
        PanelBaseSlant6.setPos(0.0F, -15.75F, -8.65F);
        P6.addChild(PanelBaseSlant6);
        setRotationAngle(PanelBaseSlant6, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant6.texOffs(58, 44).addBox(-7.0F, -0.634F, -2.5F, 14.0F, 1.0F, 4.0F, -0.25F, false);
        PanelBaseSlant6.texOffs(93, 56).addBox(-5.0F, -0.634F, 1.0F, 10.0F, 1.0F, 5.0F, -0.25F, false);

        SupportStruts = new ModelRenderer(this);
        SupportStruts.setPos(0.0F, 0.0F, 0.0F);
        BaseConsole.addChild(SupportStruts);


        Strut1 = new ModelRenderer(this);
        Strut1.setPos(0.0F, 0.0F, 0.0F);
        SupportStruts.addChild(Strut1);
        setRotationAngle(Strut1, 0.0F, -1.0472F, 0.0F);


        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(0.0F, -12.3986F, -9.7876F);
        Strut1.addChild(cube_r17);
        setRotationAngle(cube_r17, 1.7453F, 0.0F, 0.0F);
        cube_r17.texOffs(131, 71).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, -0.5F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(0.0F, -5.7953F, -6.5822F);
        Strut1.addChild(cube_r18);
        setRotationAngle(cube_r18, 2.0508F, 0.0F, 0.0F);
        cube_r18.texOffs(107, 86).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(0.0F, -5.7953F, -6.5822F);
        Strut1.addChild(cube_r19);
        setRotationAngle(cube_r19, 1.6144F, 0.0F, 0.0F);
        cube_r19.texOffs(53, 108).addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(0.0F, -2.0F, -9.0F);
        Strut1.addChild(cube_r20);
        setRotationAngle(cube_r20, 1.0036F, 0.0F, 0.0F);
        cube_r20.texOffs(87, 117).addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, -0.7F, false);
        cube_r20.texOffs(16, 70).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, -0.5F, false);

        Strut2 = new ModelRenderer(this);
        Strut2.setPos(0.0F, 0.0F, 0.0F);
        SupportStruts.addChild(Strut2);
        setRotationAngle(Strut2, 0.0F, 3.1416F, 0.0F);


        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(0.0F, -12.3986F, -9.7876F);
        Strut2.addChild(cube_r21);
        setRotationAngle(cube_r21, 1.7453F, 0.0F, 0.0F);
        cube_r21.texOffs(65, 131).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, -0.5F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(0.0F, -5.7953F, -6.5822F);
        Strut2.addChild(cube_r22);
        setRotationAngle(cube_r22, 2.0508F, 0.0F, 0.0F);
        cube_r22.texOffs(39, 105).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(0.0F, -5.7953F, -6.5822F);
        Strut2.addChild(cube_r23);
        setRotationAngle(cube_r23, 1.6144F, 0.0F, 0.0F);
        cube_r23.texOffs(90, 105).addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(0.0F, -2.0F, -9.0F);
        Strut2.addChild(cube_r24);
        setRotationAngle(cube_r24, 1.0036F, 0.0F, 0.0F);
        cube_r24.texOffs(117, 56).addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, -0.7F, false);
        cube_r24.texOffs(0, 67).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, -0.5F, false);

        Strut3 = new ModelRenderer(this);
        Strut3.setPos(0.0F, 0.0F, 0.0F);
        SupportStruts.addChild(Strut3);
        setRotationAngle(Strut3, 0.0F, 1.0472F, 0.0F);


        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(0.0F, -12.3986F, -9.7876F);
        Strut3.addChild(cube_r25);
        setRotationAngle(cube_r25, 1.7453F, 0.0F, 0.0F);
        cube_r25.texOffs(52, 131).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 4.0F, -0.5F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(0.0F, -5.7953F, -6.5822F);
        Strut3.addChild(cube_r26);
        setRotationAngle(cube_r26, 2.0508F, 0.0F, 0.0F);
        cube_r26.texOffs(34, 55).addBox(-1.0F, -2.0F, -1.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(0.0F, -5.7953F, -6.5822F);
        Strut3.addChild(cube_r27);
        setRotationAngle(cube_r27, 1.6144F, 0.0F, 0.0F);
        cube_r27.texOffs(25, 102).addBox(-1.0F, 0.0F, 0.5F, 2.0F, 2.0F, 9.0F, -0.6F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(0.0F, -2.0F, -9.0F);
        Strut3.addChild(cube_r28);
        setRotationAngle(cube_r28, 1.0036F, 0.0F, 0.0F);
        cube_r28.texOffs(41, 117).addBox(-1.0F, -4.0F, 4.25F, 2.0F, 2.0F, 7.0F, -0.7F, false);
        cube_r28.texOffs(64, 61).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 11.0F, -0.5F, false);

        TimeRotor = new ModelRenderer(this);
        TimeRotor.setPos(0.0F, 0.0F, 0.0F);
        Console.addChild(TimeRotor);
        TimeRotor.texOffs(89, 127).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

        Part6 = new ModelRenderer(this);
        Part6.setPos(0.0F, -16.75F, 0.0F);
        TimeRotor.addChild(Part6);
        Part6.texOffs(99, 120).addBox(-0.6962F, -3.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);
        Part6.texOffs(53, 35).addBox(-3.5F, -3.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, 0.0F, false);

        hexadecagon_r21 = new ModelRenderer(this);
        hexadecagon_r21.setPos(0.0F, -7.0F, 0.0F);
        Part6.addChild(hexadecagon_r21);
        setRotationAngle(hexadecagon_r21, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r21.texOffs(17, 52).addBox(-3.5F, 4.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, 0.0F, false);
        hexadecagon_r21.texOffs(53, 120).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

        hexadecagon_r22 = new ModelRenderer(this);
        hexadecagon_r22.setPos(0.0F, -7.0F, 0.0F);
        Part6.addChild(hexadecagon_r22);
        setRotationAngle(hexadecagon_r22, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r22.texOffs(57, 75).addBox(-3.5F, 4.0F, -0.6962F, 7.0F, 1.0F, 1.3924F, 0.0F, false);
        hexadecagon_r22.texOffs(63, 122).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

        hexadecagon_r23 = new ModelRenderer(this);
        hexadecagon_r23.setPos(0.0F, -7.0F, 0.0F);
        Part6.addChild(hexadecagon_r23);
        setRotationAngle(hexadecagon_r23, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r23.texOffs(32, 70).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

        hexadecagon_r24 = new ModelRenderer(this);
        hexadecagon_r24.setPos(0.0F, -7.0F, 0.0F);
        Part6.addChild(hexadecagon_r24);
        setRotationAngle(hexadecagon_r24, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r24.texOffs(0, 123).addBox(-0.6962F, 4.0F, -3.5F, 1.3924F, 1.0F, 7.0F, 0.0F, false);

        Part7 = new ModelRenderer(this);
        Part7.setPos(0.0F, -16.0F, 0.0F);
        TimeRotor.addChild(Part7);
        Part7.texOffs(32, 124).addBox(-0.5967F, -7.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);
        Part7.texOffs(67, 112).addBox(-3.0F, -7.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, 0.0F, false);

        hexadecagon_r25 = new ModelRenderer(this);
        hexadecagon_r25.setPos(0.0F, -7.0F, 0.0F);
        Part7.addChild(hexadecagon_r25);
        setRotationAngle(hexadecagon_r25, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r25.texOffs(14, 107).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, 0.0F, false);
        hexadecagon_r25.texOffs(17, 124).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

        hexadecagon_r26 = new ModelRenderer(this);
        hexadecagon_r26.setPos(0.0F, -7.0F, 0.0F);
        Part7.addChild(hexadecagon_r26);
        setRotationAngle(hexadecagon_r26, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r26.texOffs(23, 114).addBox(-3.0F, -0.5F, -0.5967F, 6.0F, 1.0F, 1.1935F, 0.0F, false);
        hexadecagon_r26.texOffs(74, 125).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

        hexadecagon_r27 = new ModelRenderer(this);
        hexadecagon_r27.setPos(0.0F, -7.0F, 0.0F);
        Part7.addChild(hexadecagon_r27);
        setRotationAngle(hexadecagon_r27, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r27.texOffs(14, 99).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

        hexadecagon_r28 = new ModelRenderer(this);
        hexadecagon_r28.setPos(0.0F, -7.0F, 0.0F);
        Part7.addChild(hexadecagon_r28);
        setRotationAngle(hexadecagon_r28, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r28.texOffs(41, 127).addBox(-0.5967F, -0.5F, -3.0F, 1.1935F, 1.0F, 6.0F, 0.0F, false);

        Part8 = new ModelRenderer(this);
        Part8.setPos(0.0F, -13.25F, 0.0F);
        TimeRotor.addChild(Part8);
        Part8.texOffs(69, 138).addBox(-0.5027F, -10.5F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        Part8.texOffs(119, 55).addBox(-0.5027F, -10.5F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        Part8.texOffs(14, 99).addBox(1.5F, -10.5F, -0.4973F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        Part8.texOffs(74, 93).addBox(-2.5F, -10.5F, -0.4973F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        hexadecagon_r29 = new ModelRenderer(this);
        hexadecagon_r29.setPos(0.0F, -10.75F, 0.0F);
        Part8.addChild(hexadecagon_r29);
        setRotationAngle(hexadecagon_r29, 0.0F, -0.3927F, 0.0F);
        hexadecagon_r29.texOffs(61, 88).addBox(-2.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
        hexadecagon_r29.texOffs(98, 136).addBox(1.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
        hexadecagon_r29.texOffs(136, 103).addBox(-0.5027F, -2.5F, 1.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);
        hexadecagon_r29.texOffs(0, 137).addBox(-0.5027F, -2.5F, -2.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);

        hexadecagon_r30 = new ModelRenderer(this);
        hexadecagon_r30.setPos(0.0F, -10.75F, 0.0F);
        Part8.addChild(hexadecagon_r30);
        setRotationAngle(hexadecagon_r30, 0.0F, 0.3927F, 0.0F);
        hexadecagon_r30.texOffs(46, 135).addBox(-2.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
        hexadecagon_r30.texOffs(103, 136).addBox(1.0F, -2.5F, -0.4973F, 1.0F, 7.0F, 1.0F, -0.2F, false);
        hexadecagon_r30.texOffs(136, 112).addBox(-0.5027F, -2.5F, 1.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);
        hexadecagon_r30.texOffs(5, 137).addBox(-0.5027F, -2.5F, -2.0F, 1.0F, 7.0F, 1.0F, -0.2F, false);

        hexadecagon_r31 = new ModelRenderer(this);
        hexadecagon_r31.setPos(0.0F, -7.0F, 0.0F);
        Part8.addChild(hexadecagon_r31);
        setRotationAngle(hexadecagon_r31, 0.0F, -0.7854F, 0.0F);
        hexadecagon_r31.texOffs(29, 105).addBox(-0.5027F, -3.5F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        hexadecagon_r31.texOffs(0, 123).addBox(-0.5027F, -3.5F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        hexadecagon_r32 = new ModelRenderer(this);
        hexadecagon_r32.setPos(0.0F, -7.0F, 0.0F);
        Part8.addChild(hexadecagon_r32);
        setRotationAngle(hexadecagon_r32, 0.0F, 0.7854F, 0.0F);
        hexadecagon_r32.texOffs(63, 120).addBox(-0.5027F, -3.5F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        hexadecagon_r32.texOffs(85, 139).addBox(-0.5027F, -3.5F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

        Controls = new ModelRenderer(this);
        Controls.setPos(0.0F, 24.0F, 0.0F);


        Panel1 = new ModelRenderer(this);
        Panel1.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(Panel1);


        PanelBaseSlant7 = new ModelRenderer(this);
        PanelBaseSlant7.setPos(0.0F, -15.75F, -8.65F);
        Panel1.addChild(PanelBaseSlant7);
        setRotationAngle(PanelBaseSlant7, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant7.texOffs(125, 133).addBox(-4.75F, -0.884F, -2.5F, 4.0F, 1.0F, 2.0F, -0.45F, false);
        PanelBaseSlant7.texOffs(60, 138).addBox(-1.25F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);
        PanelBaseSlant7.texOffs(51, 138).addBox(0.0F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);
        PanelBaseSlant7.texOffs(124, 137).addBox(1.25F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);
        PanelBaseSlant7.texOffs(28, 137).addBox(2.5F, -0.884F, -2.5F, 2.0F, 1.0F, 2.0F, -0.45F, false);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(1.2F, -0.584F, 3.4F);
        PanelBaseSlant7.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.7854F, 0.0F);
        cube_r29.texOffs(135, 33).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.4F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(-1.2F, -0.584F, 3.4F);
        PanelBaseSlant7.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, -0.7854F, 0.0F);
        cube_r30.texOffs(10, 137).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.4F, false);

        Refuel = new ModelRenderer(this);
        Refuel.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant7.addChild(Refuel);
        Refuel.texOffs(137, 25).addBox(-4.25F, -0.884F, -2.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

        DimensionalShifter = new ModelRenderer(this);
        DimensionalShifter.setPos(0.0F, 0.2075F, -0.2255F);
        PanelBaseSlant7.addChild(DimensionalShifter);


        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(0.0F, 0.0F, 0.0F);
        DimensionalShifter.addChild(cube_r31);
        setRotationAngle(cube_r31, -0.5236F, 0.0F, 0.0F);
        cube_r31.texOffs(44, 147).addBox(-1.05F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(39, 147).addBox(-1.05F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(147, 18).addBox(-0.5F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(147, 11).addBox(-0.5F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(64, 147).addBox(0.05F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(147, 60).addBox(0.05F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(147, 128).addBox(0.6F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(128, 147).addBox(0.6F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(69, 147).addBox(-1.6F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(147, 66).addBox(-1.6F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(95, 147).addBox(-2.15F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(90, 147).addBox(-2.15F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(103, 147).addBox(1.15F, -0.8F, -0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(108, 147).addBox(1.15F, -0.8F, 0.35F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r31.texOffs(67, 106).addBox(-2.5F, -0.65F, -0.5F, 5.0F, 1.0F, 2.0F, -0.25F, false);

        XControl = new LightModelRenderer(this);
        XControl.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant7.addChild(XControl);
        XControl.texOffs(80, 145).addBox(-0.75F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        bone9 = new ModelRenderer(this);
        bone9.setPos(-1.2F, -0.584F, 3.4F);
        PanelBaseSlant7.addChild(bone9);
        setRotationAngle(bone9, 0.0F, -0.7854F, 0.0F);
        bone9.texOffs(19, 137).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.3F, false);

        bone10 = new ModelRenderer(this);
        bone10.setPos(1.2F, -0.584F, 3.4F);
        PanelBaseSlant7.addChild(bone10);
        setRotationAngle(bone10, 0.0F, 0.7854F, 0.0F);
        bone10.texOffs(136, 135).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.3F, false);

        YControl = new LightModelRenderer(this);
        YControl.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant7.addChild(YControl);
        YControl.texOffs(75, 145).addBox(0.5F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        ZControl = new LightModelRenderer(this);
        ZControl.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant7.addChild(ZControl);
        ZControl.texOffs(145, 63).addBox(1.75F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        ControlIncMod = new LightModelRenderer(this);
        ControlIncMod.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant7.addChild(ControlIncMod);
        ControlIncMod.texOffs(60, 145).addBox(3.0F, -0.884F, -2.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        Panel2 = new ModelRenderer(this);
        Panel2.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(Panel2);
        setRotationAngle(Panel2, 0.0F, -1.0472F, 0.0F);


        PanelBaseSlant8 = new ModelRenderer(this);
        PanelBaseSlant8.setPos(0.0F, -15.75F, -8.65F);
        Panel2.addChild(PanelBaseSlant8);
        setRotationAngle(PanelBaseSlant8, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant8.texOffs(128, 66).addBox(-3.4F, -0.884F, -1.1F, 4.0F, 1.0F, 3.0F, -0.25F, false);
        PanelBaseSlant8.texOffs(88, 105).addBox(-3.4F, -1.384F, 1.0F, 4.0F, 1.0F, 1.0F, -0.25F, false);
        PanelBaseSlant8.texOffs(45, 144).addBox(-3.3F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(79, 142).addBox(-2.95F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(107, 144).addBox(-2.25F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(61, 142).addBox(-2.6F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(55, 145).addBox(-0.85F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(145, 57).addBox(-1.2F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(40, 144).addBox(-1.9F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 98).addBox(-1.55F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(139, 143).addBox(-1.9F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(94, 144).addBox(-1.55F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(145, 39).addBox(-1.2F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(50, 145).addBox(-0.85F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 34).addBox(-2.25F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(51, 142).addBox(-2.6F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(56, 142).addBox(-3.3F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 60).addBox(-2.95F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(29, 145).addBox(-0.5F, -1.134F, 0.5F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(89, 144).addBox(-0.5F, -1.134F, 0.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 69).addBox(-0.5F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(134, 142).addBox(-3.3F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(141, 132).addBox(-3.3F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 3).addBox(-2.95F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 17).addBox(-2.95F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 20).addBox(-2.6F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(70, 144).addBox(-2.25F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(143, 9).addBox(-2.25F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 31).addBox(-2.6F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(35, 143).addBox(-1.9F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(143, 46).addBox(-1.9F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 74).addBox(-1.55F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 81).addBox(-1.55F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(9, 145).addBox(-1.2F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(14, 145).addBox(-1.2F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(19, 145).addBox(-0.85F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(145, 23).addBox(-0.85F, -1.134F, -0.7F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(141, 117).addBox(-3.3F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(124, 141).addBox(-2.95F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(129, 141).addBox(-2.6F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 87).addBox(-2.25F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(142, 129).addBox(-1.9F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 52).addBox(-1.55F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(127, 144).addBox(-1.2F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(144, 142).addBox(-0.85F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(65, 144).addBox(-0.5F, -1.134F, -1.1F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant8.texOffs(24, 145).addBox(-0.5F, -1.134F, -0.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(3.0F, 0.7075F, 0.6405F);
        PanelBaseSlant8.addChild(cube_r32);
        setRotationAngle(cube_r32, -0.5236F, 0.0F, 0.0F);
        cube_r32.texOffs(32, 70).addBox(-1.0F, -0.35F, -1.65F, 1.0F, 1.0F, 2.0F, 0.1F, false);

        DoorSwitch = new ModelRenderer(this);
        DoorSwitch.setPos(2.25F, -15.5634F, -8.584F);
        Panel2.addChild(DoorSwitch);
        setRotationAngle(DoorSwitch, 0.5236F, 0.0F, 0.0F);


        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(0.4F, 0.5209F, 0.5745F);
        DoorSwitch.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.5236F, 0.0F, 0.0F);
        cube_r33.texOffs(122, 144).addBox(-1.0F, -1.95F, -1.25F, 1.0F, 1.0F, 1.0F, -0.32F, false);
        cube_r33.texOffs(141, 101).addBox(-1.0F, -1.85F, -1.25F, 1.0F, 2.0F, 1.0F, -0.35F, false);

        DoorSwitch2 = new ModelRenderer(this);
        DoorSwitch2.setPos(2.9F, -15.5634F, -8.584F);
        Panel2.addChild(DoorSwitch2);
        setRotationAngle(DoorSwitch2, 0.5236F, 0.0F, 0.0F);


        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(0.4F, 0.5209F, 0.5745F);
        DoorSwitch2.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.5236F, 0.0F, 0.0F);
        cube_r34.texOffs(117, 144).addBox(-1.0F, -1.95F, -1.25F, 1.0F, 1.0F, 1.0F, -0.32F, false);
        cube_r34.texOffs(141, 94).addBox(-1.0F, -1.85F, -1.25F, 1.0F, 2.0F, 1.0F, -0.35F, false);

        Panel3 = new ModelRenderer(this);
        Panel3.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(Panel3);
        setRotationAngle(Panel3, 0.0F, -2.0944F, 0.0F);


        PanelBaseSlant9 = new ModelRenderer(this);
        PanelBaseSlant9.setPos(0.0F, -15.75F, -8.65F);
        Panel3.addChild(PanelBaseSlant9);
        setRotationAngle(PanelBaseSlant9, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant9.texOffs(26, 132).addBox(-4.25F, -0.884F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);

        Randomiser = new LightModelRenderer(this);
        Randomiser.setPos(-2.75F, -0.284F, -0.5F);
        PanelBaseSlant9.addChild(Randomiser);
        Randomiser.texOffs(131, 78).addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F, -0.45F, false);

        VerticalLandType = new ModelRenderer(this);
        VerticalLandType.setPos(0.0F, 15.75F, 8.65F);
        PanelBaseSlant9.addChild(VerticalLandType);
        VerticalLandType.texOffs(74, 99).addBox(2.5F, -16.634F, -10.65F, 2.0F, 1.0F, 3.0F, -0.25F, false);

        VerticalLandTypeUp = new LightModelRenderer(this);
        VerticalLandTypeUp.setPos(0.0F, -15.75F, -8.65F);
        VerticalLandType.addChild(VerticalLandTypeUp);
        VerticalLandTypeUp.texOffs(43, 3).addBox(2.5F, -1.384F, -1.0F, 2.0F, 2.0F, 2.0F, -0.55F, false);

        VerticalLandTypeDown = new LightModelRenderer(this);
        VerticalLandTypeDown.setPos(0.0F, -15.75F, -8.65F);
        VerticalLandType.addChild(VerticalLandTypeDown);
        VerticalLandTypeDown.texOffs(43, 16).addBox(2.5F, -1.384F, -2.0F, 2.0F, 2.0F, 2.0F, -0.55F, false);

        ExteriorFacing = new ModelRenderer(this);
        ExteriorFacing.setPos(0.0F, 15.75F, 8.65F);
        PanelBaseSlant9.addChild(ExteriorFacing);
        ExteriorFacing.texOffs(146, 116).addBox(-2.0F, -16.334F, -6.4F, 1.0F, 1.0F, 1.0F, 0.15F, false);

        bone15 = new ModelRenderer(this);
        bone15.setPos(-1.5F, -16.134F, -5.9F);
        ExteriorFacing.addChild(bone15);
        setRotationAngle(bone15, 0.0F, -0.7854F, 0.0F);
        bone15.texOffs(13, 132).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 3.0F, -0.35F, false);

        ExteriorFacingNorth = new LightModelRenderer(this);
        ExteriorFacingNorth.setPos(0.0F, -15.75F, -8.65F);
        ExteriorFacing.addChild(ExteriorFacingNorth);
        ExteriorFacingNorth.texOffs(5, 147).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        ExteriorFacingEast = new LightModelRenderer(this);
        ExteriorFacingEast.setPos(0.75F, -15.75F, -9.4F);
        ExteriorFacing.addChild(ExteriorFacingEast);
        ExteriorFacingEast.texOffs(137, 146).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        ExteriorFacingSouth = new LightModelRenderer(this);
        ExteriorFacingSouth.setPos(0.0F, -15.75F, -10.15F);
        ExteriorFacing.addChild(ExteriorFacingSouth);
        ExteriorFacingSouth.texOffs(146, 131).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        ExteriorFacingWest = new LightModelRenderer(this);
        ExteriorFacingWest.setPos(-0.75F, -15.75F, -9.4F);
        ExteriorFacing.addChild(ExteriorFacingWest);
        ExteriorFacingWest.texOffs(146, 125).addBox(-2.0F, -0.934F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);

        RandomLevers = new ModelRenderer(this);
        RandomLevers.setPos(-0.25F, 15.75F, 8.4F);
        PanelBaseSlant9.addChild(RandomLevers);
        RandomLevers.texOffs(136, 63).addBox(0.1F, -16.284F, -7.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        Lever = new ModelRenderer(this);
        Lever.setPos(0.35F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever);
        Lever.texOffs(74, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever.texOffs(146, 101).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever2 = new ModelRenderer(this);
        Lever2.setPos(0.65F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever2);
        Lever2.texOffs(141, 41).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever2.texOffs(146, 95).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever3 = new ModelRenderer(this);
        Lever3.setPos(0.95F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever3);
        Lever3.texOffs(30, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever3.texOffs(146, 89).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever4 = new ModelRenderer(this);
        Lever4.setPos(1.25F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever4);
        Lever4.texOffs(25, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever4.texOffs(85, 146).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever6 = new ModelRenderer(this);
        Lever6.setPos(1.95F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever6);
        Lever6.texOffs(20, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever6.texOffs(146, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever7 = new ModelRenderer(this);
        Lever7.setPos(2.25F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever7);
        Lever7.texOffs(15, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever7.texOffs(146, 77).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever8 = new ModelRenderer(this);
        Lever8.setPos(2.55F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever8);
        Lever8.texOffs(10, 141).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever8.texOffs(146, 49).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever9 = new ModelRenderer(this);
        Lever9.setPos(2.85F, -16.234F, -6.65F);
        RandomLevers.addChild(Lever9);
        Lever9.texOffs(140, 139).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever9.texOffs(146, 42).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lights2 = new ModelRenderer(this);
        Lights2.setPos(0.0F, 15.75F, 8.65F);
        PanelBaseSlant9.addChild(Lights2);
        Lights2.texOffs(146, 5).addBox(-1.35F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights2.texOffs(146, 5).addBox(-1.35F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights2.texOffs(146, 5).addBox(1.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Lights2.texOffs(146, 5).addBox(1.6F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        Lamp2 = new ModelRenderer(this);
        Lamp2.setPos(0.0F, -15.75F, -8.65F);
        Lights2.addChild(Lamp2);


        bone5 = new ModelRenderer(this);
        bone5.setPos(2.1F, -0.334F, 0.0F);
        Lamp2.addChild(bone5);
        setRotationAngle(bone5, 0.0F, -0.7854F, 0.0F);
        bone5.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        bone6 = new ModelRenderer(this);
        bone6.setPos(2.1F, -0.334F, -1.25F);
        Lamp2.addChild(bone6);
        setRotationAngle(bone6, 0.0F, -0.7854F, 0.0F);
        bone6.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        bone7 = new ModelRenderer(this);
        bone7.setPos(-0.85F, -0.334F, 0.0F);
        Lamp2.addChild(bone7);
        setRotationAngle(bone7, 0.0F, -0.7854F, 0.0F);
        bone7.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        bone8 = new ModelRenderer(this);
        bone8.setPos(-0.85F, -0.334F, -1.25F);
        Lamp2.addChild(bone8);
        setRotationAngle(bone8, 0.0F, -0.7854F, 0.0F);
        bone8.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        Panel4 = new ModelRenderer(this);
        Panel4.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(Panel4);
        setRotationAngle(Panel4, 0.0F, 3.1416F, 0.0F);


        PanelBaseSlant10 = new ModelRenderer(this);
        PanelBaseSlant10.setPos(0.0F, -15.75F, -8.65F);
        Panel4.addChild(PanelBaseSlant10);
        setRotationAngle(PanelBaseSlant10, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant10.texOffs(112, 128).addBox(0.75F, -1.134F, -2.25F, 3.0F, 2.0F, 4.0F, -0.45F, false);

        Handbrake = new ModelRenderer(this);
        Handbrake.setPos(-2.5F, -0.3925F, -1.5425F);
        PanelBaseSlant10.addChild(Handbrake);


        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(0.0F, -0.4352F, 2.419F);
        Handbrake.addChild(cube_r35);
        setRotationAngle(cube_r35, -0.2182F, 0.0F, 0.0F);
        cube_r35.texOffs(130, 13).addBox(-1.0F, -0.25F, -0.75F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r35.texOffs(112, 144).addBox(-0.5F, 0.0F, -0.75F, 1.0F, 1.0F, 1.0F, -0.26F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(0.0F, 0.85F, 1.25F);
        Handbrake.addChild(cube_r36);
        setRotationAngle(cube_r36, -0.7418F, 0.0F, 0.0F);
        cube_r36.texOffs(7, 52).addBox(-0.5F, -1.3378F, -0.3814F, 1.0F, 2.0F, 1.0F, -0.26F, false);

        Throttle = new ModelRenderer(this);
        Throttle.setPos(2.25F, -0.884F, -1.25F);
        PanelBaseSlant10.addChild(Throttle);
        Throttle.texOffs(61, 131).addBox(-1.0F, -0.75F, -0.5F, 2.0F, 1.0F, 1.0F, -0.25F, false);
        Throttle.texOffs(34, 146).addBox(-0.5F, -0.25F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        Lights3 = new ModelRenderer(this);
        Lights3.setPos(0.0F, 15.75F, 8.65F);
        PanelBaseSlant10.addChild(Lights3);


        Lamp3 = new ModelRenderer(this);
        Lamp3.setPos(0.0F, -15.75F, -8.65F);
        Lights3.addChild(Lamp3);


        Lights5 = new ModelRenderer(this);
        Lights5.setPos(0.0F, 15.75F, 8.65F);
        PanelBaseSlant10.addChild(Lights5);
        Lights5.texOffs(146, 5).addBox(0.15F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights5.texOffs(146, 5).addBox(0.15F, -16.284F, -9.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights5.texOffs(146, 5).addBox(1.4F, -16.284F, -7.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights5.texOffs(146, 5).addBox(0.15F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        Lamp5 = new ModelRenderer(this);
        Lamp5.setPos(0.0F, -15.75F, -8.65F);
        Lights5.addChild(Lamp5);


        bone = new ModelRenderer(this);
        bone.setPos(0.65F, -0.334F, -1.25F);
        Lamp5.addChild(bone);
        setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
        bone.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(0.65F, -0.334F, 0.0F);
        Lamp5.addChild(bone2);
        setRotationAngle(bone2, 0.0F, -0.7854F, 0.0F);
        bone2.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(1.9F, -0.334F, 2.0F);
        Lamp5.addChild(bone4);
        setRotationAngle(bone4, 0.0F, -0.7854F, 0.0F);
        bone4.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(0.65F, -0.334F, 1.25F);
        Lamp5.addChild(bone3);
        setRotationAngle(bone3, 0.0F, -0.7854F, 0.0F);
        bone3.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        Panel6 = new ModelRenderer(this);
        Panel6.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(Panel6);
        setRotationAngle(Panel6, 0.0F, 1.0472F, 0.0F);


        PanelBaseSlant11 = new ModelRenderer(this);
        PanelBaseSlant11.setPos(0.0F, -15.75F, -8.65F);
        Panel6.addChild(PanelBaseSlant11);
        setRotationAngle(PanelBaseSlant11, 0.5236F, 0.0F, 0.0F);
        PanelBaseSlant11.texOffs(0, 132).addBox(-1.5F, -0.784F, -2.25F, 3.0F, 1.0F, 3.0F, -0.25F, false);
        PanelBaseSlant11.texOffs(70, 50).addBox(-2.0F, -0.684F, 1.55F, 4.0F, 1.0F, 3.0F, -0.25F, false);
        PanelBaseSlant11.texOffs(134, 123).addBox(-2.0F, -0.884F, 3.55F, 4.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(131, 39).addBox(-2.0F, -0.884F, 1.55F, 4.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(130, 95).addBox(-2.0F, -0.884F, 2.05F, 4.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(134, 13).addBox(-2.0F, -0.884F, 1.55F, 1.0F, 1.0F, 3.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(101, 26).addBox(1.0F, -0.884F, 1.55F, 1.0F, 1.0F, 3.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(148, 8).addBox(-1.0F, -0.884F, 3.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(147, 147).addBox(0.0F, -0.884F, 3.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(148, 8).addBox(-1.0F, -0.884F, 1.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(147, 147).addBox(0.0F, -0.884F, 1.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(10, 148).addBox(-1.2F, -0.884F, 2.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(123, 147).addBox(0.2F, -0.884F, 2.3F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(118, 147).addBox(-0.2F, -0.884F, 2.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(113, 147).addBox(-0.8F, -0.884F, 2.8F, 1.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(99, 117).addBox(-2.0F, -0.884F, 2.55F, 4.0F, 1.0F, 1.0F, -0.35F, false);
        PanelBaseSlant11.texOffs(113, 0).addBox(-2.0F, -0.884F, 3.05F, 4.0F, 1.0F, 1.0F, -0.35F, false);

        FastReturn = new LightModelRenderer(this);
        FastReturn.setPos(0.0F, 0.0F, 0.0F);
        PanelBaseSlant11.addChild(FastReturn);
        FastReturn.texOffs(131, 42).addBox(-1.5F, -1.084F, -2.25F, 3.0F, 1.0F, 3.0F, -0.35F, false);

        Lights4 = new ModelRenderer(this);
        Lights4.setPos(0.0F, 15.75F, 8.65F);
        PanelBaseSlant11.addChild(Lights4);
        Lights4.texOffs(146, 5).addBox(-2.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights4.texOffs(146, 5).addBox(-2.6F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Lights4.texOffs(146, 5).addBox(1.6F, -16.284F, -10.4F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        Lights4.texOffs(146, 5).addBox(1.6F, -16.284F, -7.9F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        Lamp4 = new ModelRenderer(this);
        Lamp4.setPos(0.0F, -15.75F, -8.65F);
        Lights4.addChild(Lamp4);


        bone13 = new ModelRenderer(this);
        bone13.setPos(-2.1F, -0.334F, 1.25F);
        Lamp4.addChild(bone13);
        setRotationAngle(bone13, 0.0F, -0.7854F, 0.0F);
        bone13.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        bone14 = new ModelRenderer(this);
        bone14.setPos(-2.1F, -0.334F, -1.25F);
        Lamp4.addChild(bone14);
        setRotationAngle(bone14, 0.0F, -0.7854F, 0.0F);
        bone14.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

        bone12 = new ModelRenderer(this);
        bone12.setPos(2.1F, -0.334F, 1.25F);
        Lamp4.addChild(bone12);
        setRotationAngle(bone12, 0.0F, -0.7854F, 0.0F);
        bone12.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        bone11 = new ModelRenderer(this);
        bone11.setPos(2.1F, -0.334F, -1.25F);
        Lamp4.addChild(bone11);
        setRotationAngle(bone11, 0.0F, -0.7854F, 0.0F);
        bone11.texOffs(23, 132).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, true);

        RandomLevers2 = new ModelRenderer(this);
        RandomLevers2.setPos(-1.6F, 15.75F, 7.9F);
        PanelBaseSlant11.addChild(RandomLevers2);
        RandomLevers2.texOffs(109, 123).addBox(0.1F, -16.284F, -7.15F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        Lever5 = new ModelRenderer(this);
        Lever5.setPos(0.35F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever5);
        Lever5.texOffs(90, 140).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever5.texOffs(146, 0).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever10 = new ModelRenderer(this);
        Lever10.setPos(0.65F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever10);
        Lever10.texOffs(140, 71).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever10.texOffs(0, 146).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever11 = new ModelRenderer(this);
        Lever11.setPos(0.95F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever11);
        Lever11.texOffs(129, 71).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever11.texOffs(143, 145).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever12 = new ModelRenderer(this);
        Lever12.setPos(1.25F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever12);
        Lever12.texOffs(50, 129).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever12.texOffs(145, 137).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever13 = new ModelRenderer(this);
        Lever13.setPos(1.95F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever13);
        Lever13.texOffs(83, 126).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever13.texOffs(145, 134).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever14 = new ModelRenderer(this);
        Lever14.setPos(2.25F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever14);
        Lever14.texOffs(66, 93).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever14.texOffs(132, 145).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever15 = new ModelRenderer(this);
        Lever15.setPos(2.55F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever15);
        Lever15.texOffs(37, 84).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever15.texOffs(145, 122).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);

        Lever16 = new ModelRenderer(this);
        Lever16.setPos(2.85F, -16.234F, -6.65F);
        RandomLevers2.addChild(Lever16);
        Lever16.texOffs(24, 55).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4F, false);
        Lever16.texOffs(145, 119).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.38F, false);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Console.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Controls.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void render(BrackolinConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {

        tile.getControl(LandingTypeControl.class).ifPresent(landingTypeControl -> {
            if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
                this.VerticalLandTypeDown.setBright(2);
                this.VerticalLandTypeUp.setBright(1);
            } else {
                this.VerticalLandTypeDown.setBright(1);
                this.VerticalLandTypeUp.setBright(2);
            }
        });

        tile.getControl(net.tardis.mod.controls.XControl.class).ifPresent(x -> {
            this.XControl.setBright(x.getAnimationTicks() != 0 ? 2F : 1F);
        });

        tile.getControl(net.tardis.mod.controls.YControl.class).ifPresent(y -> {
            this.YControl.setBright(y.getAnimationTicks() != 0 ? 2F : 1F);
        });

        tile.getControl(net.tardis.mod.controls.ZControl.class).ifPresent(z -> {
            this.ZControl.setBright(z.getAnimationTicks() != 0 ? 2F : 1F);
        });

        tile.getControl(IncModControl.class).ifPresent(incModControl -> {
            this.ControlIncMod.setBright(incModControl.getAnimationTicks() != 0 ? 2F : 1F);
        });

        tile.getControl(HandbrakeControl.class).ifPresent(control -> {
            this.Handbrake.xRot = (float) Math.toRadians(control.isFree() ? -12 : 35);
        });


        //this.ExteriorFacingNorth.rotateAngleY = (float) Math.toRadians(WorldHelper.getAngleFromFacing(tile.getExteriorFacingDirection()));
        tile.getControl(FacingControl.class).ifPresent(facingControl -> {
            if (tile.getExteriorFacingDirection() == Direction.NORTH) {
                this.ExteriorFacingNorth.setBright(2);
                this.ExteriorFacingEast.setBright(1);
                this.ExteriorFacingSouth.setBright(1);
                this.ExteriorFacingWest.setBright(1);
            } else if (tile.getExteriorFacingDirection() == Direction.EAST) {
                this.ExteriorFacingNorth.setBright(1);
                this.ExteriorFacingEast.setBright(2);
                this.ExteriorFacingSouth.setBright(1);
                this.ExteriorFacingWest.setBright(1);
            } else if (tile.getExteriorFacingDirection() == Direction.SOUTH) {
                this.ExteriorFacingNorth.setBright(1);
                this.ExteriorFacingEast.setBright(1);
                this.ExteriorFacingSouth.setBright(2);
                this.ExteriorFacingWest.setBright(1);
            }
            else {
                this.ExteriorFacingNorth.setBright(1);
                this.ExteriorFacingEast.setBright(1);
                this.ExteriorFacingSouth.setBright(1);
                this.ExteriorFacingWest.setBright(2);
            }
        });



        this.TimeRotor.yRot = (float)Math.toRadians((double)(tile.flightTicks * -3 % 360));
        this.TimeRotor.y = - (float)Math.cos((double)tile.flightTicks * 0.1D) * 2F; //rotationPointY


        tile.getControl(RandomiserControl.class).ifPresent(randomiserControl -> {
            this.Randomiser.setBright(randomiserControl.getAnimationTicks() != 0 ? 2F: 1F);
        });



        tile.getControl(ThrottleControl.class).ifPresent(throttleControl -> {
//            this.Throttle.z = (float)Math.toRadians((throttleControl.getAmount()));
//            this.Throttle.y = (float)Math.abs((float)-15.3);
//            this.Throttle.xRot = (float)Math.toRadians(1);
        });

        tile.getDoor().ifPresent((door) -> {
            this.DoorSwitch.xRot = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 0 : 60);
            this.DoorSwitch2.xRot = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 60 : 0);
        });

        tile.getControl(FastReturnControl.class).ifPresent(fastReturnControl -> {
            this.FastReturn.setBright(fastReturnControl.getAnimationTicks() != 0 ? 2F: 1F);
        });

        tile.getSubsystem(StabilizerSubsystem.class).ifPresent((sys) -> {
            this.Lever.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
            this.Lever2.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
            this.Lever3.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
            this.Lever4.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
            this.Lever5.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
            this.Lever6.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
            this.Lever7.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
            this.Lever8.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
            this.Lever9.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
        });

        this.Lever10.xRot = (float) Math.toRadians( 45);
        this.Lever11.xRot = (float) Math.toRadians( 45);
        this.Lever12.xRot = (float) Math.toRadians(-45);
        this.Lever13.xRot = (float) Math.toRadians( 45);
        this.Lever14.xRot = (float) Math.toRadians(-45);
        this.Lever15.xRot = (float) Math.toRadians( 45);
        this.Lever16.xRot = (float) Math.toRadians(-45);


        matrixStack.pushPose();
        matrixStack.scale(0.95F,0.95F,0.95F);
        matrixStack.translate(0.0685F,0.275F,-0.07F);
        Console.render(matrixStack, iVertexBuilder,i,i1);
        Controls.render(matrixStack,iVertexBuilder,i,i1);

        matrixStack.popPose();
    }
}