package com.code.aseoha.client.models.consoles;// Made with Blockbench 4.10.0-beta.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.tileentities.consoles.CustardConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.LightModelRenderer;
import net.tardis.mod.client.models.consoles.AbstractConsoleEntityModel;
import net.tardis.mod.controls.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class CustardConsoleModel extends AbstractConsoleEntityModel<CustardConsoleTile> {
    private final ModelRenderer Custard;
    private final ModelRenderer TimeRotor2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer RotorEdges;
    private final ModelRenderer RotorEdge1;
    private final ModelRenderer RotorEdge2;
    private final ModelRenderer RotorEdge3;
    private final ModelRenderer RotorEdge4;
    private final ModelRenderer RotorEdge5;
    private final ModelRenderer RotorEdge6;
    private final ModelRenderer EdgeDividers;
    private final ModelRenderer EdgeDividers1;
    private final LightModelRenderer EdgeLight6;
    private final ModelRenderer EdgeDividers2;
    private final LightModelRenderer EdgeLight1;
    private final ModelRenderer EdgeDividers3;
    private final ModelRenderer HoloTARDISPlatform;
    private final LightModelRenderer EdgeLight3;
    private final ModelRenderer EdgeDividers4;
    private final LightModelRenderer EdgeLight4;
    private final ModelRenderer EdgeDividers5;
    private final LightModelRenderer EdgeLight5;
    private final ModelRenderer EdgeDividers6;
    private final LightModelRenderer EdgeLight2;
    private final ModelRenderer Panels;
    private final ModelRenderer Panel1Upper;
    private final ModelRenderer P1Angle;
    private final ModelRenderer cube_r7;
    private final ModelRenderer Panel2Upper;
    private final ModelRenderer P2Angle;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Panel3Upper;
    private final ModelRenderer P3Angle;
    private final ModelRenderer Panel4Upper;
    private final ModelRenderer P4Angle;
    private final ModelRenderer Panel5Upper;
    private final ModelRenderer P5Angle;
    private final ModelRenderer cube_r9;
    private final ModelRenderer Panel6Upper;
    private final ModelRenderer P6Angle;
    private final ModelRenderer cube_r10;
    private final ModelRenderer Panel1Lower;
    private final ModelRenderer P1;
    private final ModelRenderer Panel2Lower;
    private final ModelRenderer P2;
    private final ModelRenderer Panel3Lower;
    private final ModelRenderer P3;
    private final ModelRenderer Panel4Lower;
    private final ModelRenderer P4;
    private final ModelRenderer Panel5Lower;
    private final ModelRenderer P5;
    private final ModelRenderer Panel6Lower;
    private final ModelRenderer P6;
    private final ModelRenderer Pipes;
    private final ModelRenderer Pipe1;
    private final ModelRenderer Pipe1Bend1;
    private final ModelRenderer Pipe1Bend2;
    private final ModelRenderer Pipe5;
    private final ModelRenderer Pipe1Bend3;
    private final ModelRenderer Pipe1Bend4;
    private final ModelRenderer Pipe9;
    private final ModelRenderer Pipe1Bend5;
    private final ModelRenderer Pipe1Bend6;
    private final ModelRenderer Pipe2;
    private final ModelRenderer Pipe6;
    private final ModelRenderer Pipe3;
    private final ModelRenderer Pipe4;
    private final ModelRenderer Pipe7;
    private final ModelRenderer Pipe8;
    private final ModelRenderer Controls;
    private final ModelRenderer BigLever1;
    private final ModelRenderer BL1Handle;
    private final ModelRenderer BigLever2;
    private final ModelRenderer BL1Handle2;
    private final ModelRenderer PanelRotations;
    private final ModelRenderer Panel1South;
    private final ModelRenderer P1Angle2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer ValveControl;
    private final ModelRenderer HourGlass1Stand;
    private final ModelRenderer HourGlassSpin;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer HourGlass2Stand;
    private final ModelRenderer HourGlassSpin2;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Panel2Upper2;
    private final ModelRenderer P2Angle2;
    private final ModelRenderer Panel3Upper2;
    private final ModelRenderer P3Angle2;
    private final ModelRenderer cube_r19;
    private final LightModelRenderer Light;
    private final ModelRenderer Panel4North;
    private final ModelRenderer P4Angle2;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer Panel5Upper2;
    private final ModelRenderer P5Angle2;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer DoorLockLever;
    private final ModelRenderer Panel6Upper2;
    private final ModelRenderer P6Angle2;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer EdgeWheel1Pos;
    private final ModelRenderer EdgeWheel1Rot;
    private final ModelRenderer EdgeWheel2Pos;
    private final ModelRenderer EdgeWheel2Rot;
    private final ModelRenderer EdgeWheel3and4Pos;
    private final ModelRenderer EdgeWheel3Rot;
    private final ModelRenderer EdgeWheel4Rot;

    public CustardConsoleModel() {

        texWidth = 256;
        texHeight = 256;

        Custard = new ModelRenderer(this);
        Custard.setPos(0.0F, 24.0F, 0.0F);


        TimeRotor2 = new ModelRenderer(this);
        TimeRotor2.setPos(0.0F, 0.0F, 0.0F);
        Custard.addChild(TimeRotor2);
        TimeRotor2.texOffs(34, 184).addBox(-3.0F, -13.0F, 4.7F, 6.0F, 24.0F, 1.0F, 0.7F, false);
        TimeRotor2.texOffs(150, 17).addBox(-3.5F, -2.0F, 4.5F, 7.0F, 27.0F, 2.0F, 0.7F, false);
        TimeRotor2.texOffs(17, 184).addBox(-2.5F, -29.0F, 1.9F, 5.0F, 20.0F, 3.0F, 0.7F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -17.0F, 0.0F);
        TimeRotor2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 1.0472F, 0.0F);
        cube_r1.texOffs(96, 187).addBox(-2.5F, -11.0F, 1.9F, 5.0F, 19.0F, 3.0F, 0.7F, false);
        cube_r1.texOffs(87, 160).addBox(-3.5F, 19.0F, 4.5F, 7.0F, 23.0F, 2.0F, 0.7F, false);
        cube_r1.texOffs(174, 183).addBox(-3.0F, 3.0F, 4.7F, 6.0F, 25.0F, 1.0F, 0.7F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -17.0F, 0.0F);
        TimeRotor2.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 2.0944F, 0.0F);
        cube_r2.texOffs(204, 201).addBox(-2.5F, -8.0F, 2.9F, 5.0F, 16.0F, 2.0F, 0.7F, false);
        cube_r2.texOffs(179, 142).addBox(-3.5F, 22.0F, 4.5F, 7.0F, 20.0F, 2.0F, 0.7F, false);
        cube_r2.texOffs(81, 186).addBox(-3.0F, 5.0F, 4.7F, 6.0F, 23.0F, 1.0F, 0.7F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, -26.0F, 0.0F);
        TimeRotor2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
        cube_r3.texOffs(189, 183).addBox(-2.5F, -6.0F, -2.5F, 5.0F, 12.0F, 5.0F, 0.7F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.0F, -17.0F, 0.0F);
        TimeRotor2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 3.1416F, 0.0F);
        cube_r4.texOffs(113, 187).addBox(-2.5F, -4.0F, -0.1F, 5.0F, 12.0F, 5.0F, 0.7F, false);
        cube_r4.texOffs(134, 202).addBox(-3.5F, 29.0F, 4.5F, 7.0F, 13.0F, 2.0F, 0.7F, false);
        cube_r4.texOffs(189, 201).addBox(-3.0F, 9.0F, 4.7F, 6.0F, 19.0F, 1.0F, 0.7F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, -17.0F, 0.0F);
        TimeRotor2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -2.0944F, 0.0F);
        cube_r5.texOffs(202, 54).addBox(-2.5F, -7.0F, 1.9F, 5.0F, 15.0F, 3.0F, 0.7F, false);
        cube_r5.texOffs(186, 25).addBox(-3.5F, 25.0F, 4.5F, 7.0F, 17.0F, 2.0F, 0.7F, false);
        cube_r5.texOffs(0, 195).addBox(-3.0F, 7.0F, 4.7F, 6.0F, 21.0F, 1.0F, 0.7F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, -17.0F, 0.0F);
        TimeRotor2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -1.0472F, 0.0F);
        cube_r6.texOffs(185, 56).addBox(-2.5F, -11.0F, 1.9F, 5.0F, 19.0F, 3.0F, 0.7F, false);
        cube_r6.texOffs(179, 80).addBox(-3.5F, 22.0F, 4.5F, 7.0F, 20.0F, 2.0F, 0.7F, false);
        cube_r6.texOffs(186, 0).addBox(-3.0F, 5.0F, 4.7F, 6.0F, 23.0F, 1.0F, 0.7F, false);

        RotorEdges = new ModelRenderer(this);
        RotorEdges.setPos(0.0F, 0.0F, 0.0F);
        Custard.addChild(RotorEdges);


        RotorEdge1 = new ModelRenderer(this);
        RotorEdge1.setPos(0.0F, 0.0F, 0.0F);
        RotorEdges.addChild(RotorEdge1);
        RotorEdge1.texOffs(179, 112).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge1.texOffs(226, 0).addBox(-4.0F, 5.75F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge1.texOffs(79, 211).addBox(-4.0F, 25.0F, -10.0F, 8.0F, 7.0F, 2.0F, 0.0F, false);

        RotorEdge2 = new ModelRenderer(this);
        RotorEdge2.setPos(0.0F, 0.0F, 0.0F);
        RotorEdges.addChild(RotorEdge2);
        setRotationAngle(RotorEdge2, 0.0F, -1.0472F, 0.0F);
        RotorEdge2.texOffs(223, 136).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge2.texOffs(225, 131).addBox(-4.0F, 5.75F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge2.texOffs(218, 39).addBox(-4.0F, 25.0F, -10.0F, 8.0F, 7.0F, 2.0F, 0.0F, false);

        RotorEdge3 = new ModelRenderer(this);
        RotorEdge3.setPos(0.0F, 0.0F, 0.0F);
        RotorEdges.addChild(RotorEdge3);
        setRotationAngle(RotorEdge3, 0.0F, -2.0944F, 0.0F);
        RotorEdge3.texOffs(223, 141).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge3.texOffs(225, 126).addBox(-4.0F, 5.75F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge3.texOffs(131, 218).addBox(-4.0F, 25.0F, -10.0F, 8.0F, 7.0F, 2.0F, 0.0F, false);

        RotorEdge4 = new ModelRenderer(this);
        RotorEdge4.setPos(0.0F, 0.0F, 0.0F);
        RotorEdges.addChild(RotorEdge4);
        setRotationAngle(RotorEdge4, 0.0F, 3.1416F, 0.0F);
        RotorEdge4.texOffs(223, 146).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge4.texOffs(225, 111).addBox(-4.0F, 5.75F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge4.texOffs(219, 49).addBox(-4.0F, 25.0F, -10.0F, 8.0F, 7.0F, 2.0F, 0.0F, false);

        RotorEdge5 = new ModelRenderer(this);
        RotorEdge5.setPos(0.0F, 0.0F, 0.0F);
        RotorEdges.addChild(RotorEdge5);
        setRotationAngle(RotorEdge5, 0.0F, 2.0944F, 0.0F);
        RotorEdge5.texOffs(223, 151).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge5.texOffs(225, 116).addBox(-4.0F, 5.75F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge5.texOffs(219, 59).addBox(-4.0F, 25.0F, -10.0F, 8.0F, 7.0F, 2.0F, 0.0F, false);

        RotorEdge6 = new ModelRenderer(this);
        RotorEdge6.setPos(0.0F, 0.0F, 0.0F);
        RotorEdges.addChild(RotorEdge6);
        setRotationAngle(RotorEdge6, 0.0F, 1.0472F, 0.0F);
        RotorEdge6.texOffs(223, 156).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge6.texOffs(225, 121).addBox(-4.0F, 5.75F, -10.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        RotorEdge6.texOffs(219, 69).addBox(-4.0F, 25.0F, -10.0F, 8.0F, 7.0F, 2.0F, 0.0F, false);

        EdgeDividers = new ModelRenderer(this);
        EdgeDividers.setPos(0.0F, 0.0F, 0.0F);
        Custard.addChild(EdgeDividers);


        EdgeDividers1 = new ModelRenderer(this);
        EdgeDividers1.setPos(0.0F, 0.0F, 0.0F);
        EdgeDividers.addChild(EdgeDividers1);
        setRotationAngle(EdgeDividers1, 0.0F, -1.5708F, 0.0F);
        EdgeDividers1.texOffs(198, 142).addBox(-1.5F, -2.0F, 9.0F, 3.0F, 2.0F, 9.0F, 0.01F, false);
        EdgeDividers1.texOffs(150, 56).addBox(-1.5F, 6.0F, 12.0F, 3.0F, 4.0F, 11.0F, 0.01F, false);
        EdgeDividers1.texOffs(51, 143).addBox(-2.0F, 28.0F, 13.0F, 4.0F, 4.0F, 12.0F, 0.01F, false);
        EdgeDividers1.texOffs(230, 31).addBox(-2.0F, 29.0F, 25.0F, 4.0F, 3.0F, 3.0F, 0.01F, false);
        EdgeDividers1.texOffs(217, 226).addBox(-1.5F, 7.0F, 23.0F, 3.0F, 4.0F, 4.0F, 0.01F, false);
        EdgeDividers1.texOffs(54, 220).addBox(-1.5F, 0.0F, 9.0F, 3.0F, 10.0F, 3.0F, 0.01F, false);
        EdgeDividers1.texOffs(106, 160).addBox(-2.0F, 10.0F, 9.0F, 4.0F, 22.0F, 4.0F, 0.01F, false);

        EdgeLight6 = new LightModelRenderer(this);
        EdgeLight6.setPos(0.0F, 9.75F, 11.0F);
        EdgeDividers1.addChild(EdgeLight6);
        EdgeLight6.texOffs(56, 211).addBox(-1.5F, -4.0F, 4.0F, 3.0F, 0.0F, 8.0F, 0.01F, false);

        EdgeDividers2 = new ModelRenderer(this);
        EdgeDividers2.setPos(0.0F, 0.0F, 0.0F);
        EdgeDividers.addChild(EdgeDividers2);
        setRotationAngle(EdgeDividers2, 0.0F, -0.5236F, 0.0F);
        EdgeDividers2.texOffs(49, 199).addBox(-1.5F, -2.0F, 9.0F, 3.0F, 2.0F, 9.0F, 0.01F, false);
        EdgeDividers2.texOffs(150, 143).addBox(-1.5F, 6.0F, 12.0F, 3.0F, 4.0F, 11.0F, 0.01F, false);
        EdgeDividers2.texOffs(84, 143).addBox(-2.0F, 28.0F, 13.0F, 4.0F, 4.0F, 12.0F, 0.01F, false);
        EdgeDividers2.texOffs(146, 230).addBox(-2.0F, 29.0F, 25.0F, 4.0F, 3.0F, 3.0F, 0.01F, false);
        EdgeDividers2.texOffs(33, 227).addBox(-1.5F, 7.0F, 23.0F, 3.0F, 4.0F, 4.0F, 0.01F, false);
        EdgeDividers2.texOffs(204, 220).addBox(-1.5F, 0.0F, 9.0F, 3.0F, 10.0F, 3.0F, 0.01F, false);
        EdgeDividers2.texOffs(123, 160).addBox(-2.0F, 10.0F, 9.0F, 4.0F, 22.0F, 4.0F, 0.01F, false);

        EdgeLight1 = new LightModelRenderer(this);
        EdgeLight1.setPos(0.0F, 9.75F, 11.0F);
        EdgeDividers2.addChild(EdgeLight1);
        EdgeLight1.texOffs(209, 171).addBox(-1.5F, -4.0F, 4.0F, 3.0F, 0.0F, 8.0F, 0.01F, false);

        EdgeDividers3 = new ModelRenderer(this);
        EdgeDividers3.setPos(0.0F, 0.0F, 0.0F);
        EdgeDividers.addChild(EdgeDividers3);
        setRotationAngle(EdgeDividers3, 0.0F, -2.618F, 0.0F);
        EdgeDividers3.texOffs(200, 112).addBox(-1.5F, -2.0F, 9.0F, 3.0F, 2.0F, 9.0F, 0.01F, false);
        EdgeDividers3.texOffs(0, 152).addBox(-1.5F, 6.0F, 12.0F, 3.0F, 4.0F, 11.0F, 0.01F, false);
        EdgeDividers3.texOffs(117, 143).addBox(-2.0F, 28.0F, 13.0F, 4.0F, 4.0F, 12.0F, 0.01F, false);
        EdgeDividers3.texOffs(231, 161).addBox(-2.0F, 29.0F, 25.0F, 4.0F, 3.0F, 3.0F, 0.01F, false);
        EdgeDividers3.texOffs(227, 79).addBox(-1.5F, 7.0F, 23.0F, 3.0F, 4.0F, 4.0F, 0.01F, false);
        EdgeDividers3.texOffs(67, 221).addBox(-1.5F, 0.0F, 9.0F, 3.0F, 10.0F, 3.0F, 0.01F, false);
        EdgeDividers3.texOffs(0, 168).addBox(-2.0F, 10.0F, 9.0F, 4.0F, 22.0F, 4.0F, 0.01F, false);

        HoloTARDISPlatform = new ModelRenderer(this);
        HoloTARDISPlatform.setPos(1.0F, -0.25F, 10.25F);
        EdgeDividers3.addChild(HoloTARDISPlatform);
        HoloTARDISPlatform.texOffs(242, 78).addBox(-1.0F, -2.5F, 1.5F, 2.0F, 2.0F, 2.0F, 0.21F, false);
        HoloTARDISPlatform.texOffs(205, 39).addBox(-1.5F, -2.0F, 1.0F, 3.0F, 2.0F, 3.0F, 0.01F, false);

        EdgeLight3 = new LightModelRenderer(this);
        EdgeLight3.setPos(0.0F, 9.75F, 11.0F);
        EdgeDividers3.addChild(EdgeLight3);
        EdgeLight3.texOffs(210, 180).addBox(-1.5F, -4.0F, 4.0F, 3.0F, 0.0F, 8.0F, 0.01F, false);

        EdgeDividers4 = new ModelRenderer(this);
        EdgeDividers4.setPos(0.0F, 0.0F, 0.0F);
        EdgeDividers.addChild(EdgeDividers4);
        setRotationAngle(EdgeDividers4, 0.0F, 2.618F, 0.0F);
        EdgeDividers4.texOffs(200, 124).addBox(-1.5F, -2.0F, 9.0F, 3.0F, 2.0F, 9.0F, 0.01F, false);
        EdgeDividers4.texOffs(150, 159).addBox(-1.5F, 6.0F, 12.0F, 3.0F, 4.0F, 11.0F, 0.01F, false);
        EdgeDividers4.texOffs(146, 84).addBox(-2.0F, 28.0F, 13.0F, 4.0F, 4.0F, 12.0F, 0.01F, false);
        EdgeDividers4.texOffs(13, 232).addBox(-2.0F, 29.0F, 25.0F, 4.0F, 3.0F, 3.0F, 0.01F, false);
        EdgeDividers4.texOffs(227, 88).addBox(-1.5F, 7.0F, 23.0F, 3.0F, 4.0F, 4.0F, 0.01F, false);
        EdgeDividers4.texOffs(80, 221).addBox(-1.5F, 0.0F, 9.0F, 3.0F, 10.0F, 3.0F, 0.01F, false);
        EdgeDividers4.texOffs(169, 17).addBox(-2.0F, 10.0F, 9.0F, 4.0F, 22.0F, 4.0F, 0.01F, false);

        EdgeLight4 = new LightModelRenderer(this);
        EdgeLight4.setPos(0.0F, 9.75F, 11.0F);
        EdgeDividers4.addChild(EdgeLight4);
        EdgeLight4.texOffs(210, 189).addBox(-1.5F, -4.0F, 4.0F, 3.0F, 0.0F, 8.0F, 0.01F, false);

        EdgeDividers5 = new ModelRenderer(this);
        EdgeDividers5.setPos(0.0F, 0.0F, 0.0F);
        EdgeDividers.addChild(EdgeDividers5);
        setRotationAngle(EdgeDividers5, 0.0F, 1.5708F, 0.0F);
        EdgeDividers5.texOffs(201, 0).addBox(-1.5F, -2.0F, 9.0F, 3.0F, 2.0F, 9.0F, 0.01F, false);
        EdgeDividers5.texOffs(29, 160).addBox(-1.5F, 6.0F, 12.0F, 3.0F, 4.0F, 11.0F, 0.01F, false);
        EdgeDividers5.texOffs(146, 101).addBox(-2.0F, 28.0F, 13.0F, 4.0F, 4.0F, 12.0F, 0.01F, false);
        EdgeDividers5.texOffs(232, 168).addBox(-2.0F, 29.0F, 25.0F, 4.0F, 3.0F, 3.0F, 0.01F, false);
        EdgeDividers5.texOffs(131, 228).addBox(-1.5F, 7.0F, 23.0F, 3.0F, 4.0F, 4.0F, 0.01F, false);
        EdgeDividers5.texOffs(169, 221).addBox(-1.5F, 0.0F, 9.0F, 3.0F, 10.0F, 3.0F, 0.01F, false);
        EdgeDividers5.texOffs(140, 175).addBox(-2.0F, 10.0F, 9.0F, 4.0F, 22.0F, 4.0F, 0.01F, false);

        EdgeLight5 = new LightModelRenderer(this);
        EdgeLight5.setPos(0.0F, 9.75F, 11.0F);
        EdgeDividers5.addChild(EdgeLight5);
        EdgeLight5.texOffs(33, 211).addBox(-1.5F, -4.0F, 4.0F, 3.0F, 0.0F, 8.0F, 0.01F, false);

        EdgeDividers6 = new ModelRenderer(this);
        EdgeDividers6.setPos(0.0F, 0.0F, 0.0F);
        EdgeDividers.addChild(EdgeDividers6);
        setRotationAngle(EdgeDividers6, 0.0F, 0.5236F, 0.0F);
        EdgeDividers6.texOffs(201, 12).addBox(-1.5F, -2.0F, 9.0F, 3.0F, 2.0F, 9.0F, 0.01F, false);
        EdgeDividers6.texOffs(58, 160).addBox(-1.5F, 6.0F, 12.0F, 3.0F, 4.0F, 11.0F, 0.01F, false);
        EdgeDividers6.texOffs(150, 0).addBox(-2.0F, 28.0F, 13.0F, 4.0F, 4.0F, 12.0F, 0.01F, false);
        EdgeDividers6.texOffs(232, 226).addBox(-2.0F, 29.0F, 25.0F, 4.0F, 3.0F, 3.0F, 0.01F, false);
        EdgeDividers6.texOffs(111, 229).addBox(-1.5F, 7.0F, 23.0F, 3.0F, 4.0F, 4.0F, 0.01F, false);
        EdgeDividers6.texOffs(182, 222).addBox(-1.5F, 0.0F, 9.0F, 3.0F, 10.0F, 3.0F, 0.01F, false);
        EdgeDividers6.texOffs(157, 175).addBox(-2.0F, 10.0F, 9.0F, 4.0F, 22.0F, 4.0F, 0.01F, false);

        EdgeLight2 = new LightModelRenderer(this);
        EdgeLight2.setPos(0.0F, 9.75F, 11.0F);
        EdgeDividers6.addChild(EdgeLight2);
        EdgeLight2.texOffs(208, 162).addBox(-1.5F, -4.0F, 4.0F, 3.0F, 0.0F, 8.0F, 0.01F, false);

        Panels = new ModelRenderer(this);
        Panels.setPos(0.0F, 0.0F, 0.0F);
        Custard.addChild(Panels);


        Panel1Upper = new ModelRenderer(this);
        Panel1Upper.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel1Upper);


        P1Angle = new ModelRenderer(this);
        P1Angle.setPos(-0.5F, 8.0F, 16.75F);
        Panel1Upper.addChild(P1Angle);
        setRotationAngle(P1Angle, -0.1309F, 0.0F, 0.0F);
        P1Angle.texOffs(0, 0).addBox(-12.0F, 0.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);
        P1Angle.texOffs(0, 123).addBox(-12.0F, -0.5F, 5.0F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P1Angle.texOffs(150, 72).addBox(-5.0F, -1.0F, -7.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        P1Angle.texOffs(179, 103).addBox(-3.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        P1Angle.texOffs(232, 175).addBox(-2.0F, -1.0F, 6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, 0.2F, 0.0F);
        P1Angle.addChild(cube_r7);
        setRotationAngle(cube_r7, -0.0698F, 0.0F, 0.0F);
        cube_r7.texOffs(75, 0).addBox(-12.0F, -1.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);

        Panel2Upper = new ModelRenderer(this);
        Panel2Upper.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel2Upper);
        setRotationAngle(Panel2Upper, 0.0F, -1.0472F, 0.0F);


        P2Angle = new ModelRenderer(this);
        P2Angle.setPos(-0.5F, 8.0F, 16.75F);
        Panel2Upper.addChild(P2Angle);
        setRotationAngle(P2Angle, -0.1309F, 0.0F, 0.0F);
        P2Angle.texOffs(0, 14).addBox(-12.0F, 0.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);
        P2Angle.texOffs(110, 123).addBox(-12.0F, -0.5F, 5.0F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P2Angle.texOffs(165, 118).addBox(-5.0F, -1.0F, -7.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        P2Angle.texOffs(179, 165).addBox(-3.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        P2Angle.texOffs(233, 97).addBox(-2.0F, -1.0F, 6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.5F, -0.25F, -1.0F);
        P2Angle.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        cube_r8.texOffs(75, 14).addBox(-12.5F, -0.5F, -6.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);

        Panel3Upper = new ModelRenderer(this);
        Panel3Upper.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel3Upper);
        setRotationAngle(Panel3Upper, 0.0F, -2.0944F, 0.0F);


        P3Angle = new ModelRenderer(this);
        P3Angle.setPos(-0.5F, 8.0F, 16.75F);
        Panel3Upper.addChild(P3Angle);
        setRotationAngle(P3Angle, -0.1309F, 0.0F, 0.0F);
        P3Angle.texOffs(0, 28).addBox(-12.0F, 0.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);
        P3Angle.texOffs(0, 128).addBox(-12.0F, -0.5F, 5.0F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P3Angle.texOffs(165, 126).addBox(-5.0F, -1.0F, -7.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        P3Angle.texOffs(189, 45).addBox(-3.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        P3Angle.texOffs(233, 180).addBox(-2.0F, -1.0F, 6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

        Panel4Upper = new ModelRenderer(this);
        Panel4Upper.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel4Upper);
        setRotationAngle(Panel4Upper, 0.0F, 3.1416F, 0.0F);


        P4Angle = new ModelRenderer(this);
        P4Angle.setPos(-0.5F, 8.0F, 16.75F);
        Panel4Upper.addChild(P4Angle);
        setRotationAngle(P4Angle, -0.1309F, 0.0F, 0.0F);
        P4Angle.texOffs(0, 42).addBox(-12.0F, 0.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);
        P4Angle.texOffs(55, 128).addBox(-12.0F, -0.5F, 5.0F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P4Angle.texOffs(165, 134).addBox(-5.0F, -1.0F, -7.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        P4Angle.texOffs(49, 190).addBox(-3.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        P4Angle.texOffs(233, 185).addBox(-2.0F, -1.0F, 6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

        Panel5Upper = new ModelRenderer(this);
        Panel5Upper.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel5Upper);
        setRotationAngle(Panel5Upper, 0.0F, 2.0944F, 0.0F);


        P5Angle = new ModelRenderer(this);
        P5Angle.setPos(-0.5F, 8.0F, 16.75F);
        Panel5Upper.addChild(P5Angle);
        setRotationAngle(P5Angle, -0.1309F, 0.0F, 0.0F);
        P5Angle.texOffs(0, 56).addBox(-12.0F, 0.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);
        P5Angle.texOffs(110, 128).addBox(-12.0F, -0.5F, 5.0F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P5Angle.texOffs(174, 175).addBox(-5.0F, -1.0F, -7.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        P5Angle.texOffs(198, 79).addBox(-3.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        P5Angle.texOffs(233, 190).addBox(-2.0F, -1.0F, 6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.2F, 0.0F);
        P5Angle.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.0698F, 0.0F, 0.0F);
        cube_r9.texOffs(75, 56).addBox(-12.0F, -1.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);

        Panel6Upper = new ModelRenderer(this);
        Panel6Upper.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel6Upper);
        setRotationAngle(Panel6Upper, 0.0F, 1.0472F, 0.0F);


        P6Angle = new ModelRenderer(this);
        P6Angle.setPos(-0.5F, 8.0F, 16.75F);
        Panel6Upper.addChild(P6Angle);
        setRotationAngle(P6Angle, -0.1309F, 0.0F, 0.0F);
        P6Angle.texOffs(0, 70).addBox(-12.0F, 0.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);
        P6Angle.texOffs(0, 133).addBox(-12.0F, -0.5F, 5.0F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P6Angle.texOffs(17, 176).addBox(-5.0F, -1.0F, -7.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        P6Angle.texOffs(198, 88).addBox(-3.0F, -1.0F, -1.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
        P6Angle.texOffs(232, 233).addBox(-2.0F, -1.0F, 6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.5F, -0.25F, -1.0F);
        P6Angle.addChild(cube_r10);
        setRotationAngle(cube_r10, -0.0436F, 0.0F, 0.0F);
        cube_r10.texOffs(75, 70).addBox(-12.5F, -0.5F, -6.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);

        Panel1Lower = new ModelRenderer(this);
        Panel1Lower.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel1Lower);


        P1 = new ModelRenderer(this);
        P1.setPos(-0.5F, 8.0F, 16.75F);
        Panel1Lower.addChild(P1);
        P1.texOffs(55, 123).addBox(-12.0F, 1.0F, 4.75F, 25.0F, 2.0F, 2.0F, 0.0F, false);
        P1.texOffs(0, 84).addBox(-12.0F, 1.0F, -6.25F, 25.0F, 1.0F, 11.0F, 0.0F, false);

        Panel2Lower = new ModelRenderer(this);
        Panel2Lower.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel2Lower);
        setRotationAngle(Panel2Lower, 0.0F, -1.0472F, 0.0F);


        P2 = new ModelRenderer(this);
        P2.setPos(-0.5F, 8.0F, 16.75F);
        Panel2Lower.addChild(P2);
        P2.texOffs(55, 133).addBox(-12.0F, 1.0F, 4.75F, 25.0F, 2.0F, 2.0F, -0.01F, false);
        P2.texOffs(73, 84).addBox(-12.0F, 1.0F, -6.25F, 25.0F, 1.0F, 11.0F, -0.01F, false);

        Panel3Lower = new ModelRenderer(this);
        Panel3Lower.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel3Lower);
        setRotationAngle(Panel3Lower, 0.0F, -2.0944F, 0.0F);


        P3 = new ModelRenderer(this);
        P3.setPos(-0.5F, 8.0F, 16.75F);
        Panel3Lower.addChild(P3);
        P3.texOffs(110, 133).addBox(-12.0F, 1.0F, 4.75F, 25.0F, 2.0F, 2.0F, -0.01F, false);
        P3.texOffs(0, 97).addBox(-12.0F, 1.0F, -6.25F, 25.0F, 1.0F, 11.0F, 0.0F, false);

        Panel4Lower = new ModelRenderer(this);
        Panel4Lower.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel4Lower);
        setRotationAngle(Panel4Lower, 0.0F, 3.1416F, 0.0F);


        P4 = new ModelRenderer(this);
        P4.setPos(-0.5F, 8.0F, 16.75F);
        Panel4Lower.addChild(P4);
        P4.texOffs(0, 138).addBox(-12.0F, 1.0F, 4.75F, 25.0F, 2.0F, 2.0F, -0.01F, false);
        P4.texOffs(73, 97).addBox(-12.0F, 1.0F, -6.25F, 25.0F, 1.0F, 11.0F, -0.01F, false);

        Panel5Lower = new ModelRenderer(this);
        Panel5Lower.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel5Lower);
        setRotationAngle(Panel5Lower, 0.0F, 2.0944F, 0.0F);


        P5 = new ModelRenderer(this);
        P5.setPos(-0.5F, 8.0F, 16.75F);
        Panel5Lower.addChild(P5);
        P5.texOffs(55, 138).addBox(-12.0F, 1.0F, 4.75F, 25.0F, 2.0F, 2.0F, -0.01F, false);
        P5.texOffs(0, 110).addBox(-12.0F, 1.0F, -6.25F, 25.0F, 1.0F, 11.0F, 0.0F, false);

        Panel6Lower = new ModelRenderer(this);
        Panel6Lower.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(Panel6Lower);
        setRotationAngle(Panel6Lower, 0.0F, 1.0472F, 0.0F);


        P6 = new ModelRenderer(this);
        P6.setPos(-0.5F, 8.0F, 16.75F);
        Panel6Lower.addChild(P6);
        P6.texOffs(110, 138).addBox(-12.0F, 1.0F, 4.75F, 25.0F, 2.0F, 2.0F, -0.01F, false);
        P6.texOffs(73, 110).addBox(-12.0F, 1.0F, -6.25F, 25.0F, 1.0F, 11.0F, -0.01F, false);

        Pipes = new ModelRenderer(this);
        Pipes.setPos(0.0F, 0.0F, 0.0F);
        Custard.addChild(Pipes);


        Pipe1 = new ModelRenderer(this);
        Pipe1.setPos(-1.0F, 0.0F, -1.5F);
        Pipes.addChild(Pipe1);
        Pipe1.texOffs(198, 154).addBox(2.0F, 31.1F, 17.0F, 6.0F, 1.0F, 6.0F, -0.1F, false);
        Pipe1.texOffs(205, 24).addBox(2.0F, 21.0F, 17.0F, 6.0F, 1.0F, 6.0F, -0.1F, false);
        Pipe1.texOffs(153, 202).addBox(3.0F, 19.5F, 18.0F, 4.0F, 12.0F, 4.0F, -0.1F, false);
        Pipe1.texOffs(240, 213).addBox(-1.75F, 28.0F, 20.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        Pipe1.texOffs(161, 230).addBox(-1.75F, 29.0F, 20.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Pipe1.texOffs(81, 183).addBox(-1.75F, 31.25F, 20.0F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        Pipe1.texOffs(150, 47).addBox(-3.25F, 16.0F, 18.0F, 15.0F, 4.0F, 4.0F, -0.1F, false);
        Pipe1.texOffs(230, 20).addBox(-4.0F, 15.5F, 17.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
        Pipe1.texOffs(48, 234).addBox(-8.0F, 16.5F, 18.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        Pipe1Bend1 = new ModelRenderer(this);
        Pipe1Bend1.setPos(-6.0F, 20.0F, 20.0F);
        Pipe1.addChild(Pipe1Bend1);
        setRotationAngle(Pipe1Bend1, 0.0F, -1.0472F, 0.0F);
        Pipe1Bend1.texOffs(29, 152).addBox(-6.701F, -3.5F, -0.5179F, 7.0F, 3.0F, 3.0F, 0.01F, false);
        Pipe1Bend1.texOffs(17, 168).addBox(-8.701F, -3.5F, -0.5179F, 2.0F, 3.0F, 3.0F, 0.25F, false);
        Pipe1Bend1.texOffs(226, 5).addBox(-16.701F, -3.0F, -0.0179F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        Pipe1Bend1.texOffs(195, 222).addBox(-16.701F, -1.0F, -0.0179F, 2.0F, 13.0F, 2.0F, 0.0F, false);
        Pipe1Bend1.texOffs(198, 97).addBox(-16.701F, 10.5F, -0.0179F, 2.0F, 2.0F, 2.0F, 0.25F, false);

        Pipe1Bend2 = new ModelRenderer(this);
        Pipe1Bend2.setPos(13.0F, 20.0F, 20.0F);
        Pipe1.addChild(Pipe1Bend2);
        setRotationAngle(Pipe1Bend2, 0.0F, 0.0F, 0.8727F);
        Pipe1Bend2.texOffs(0, 143).addBox(-3.957F, -1.5551F, -2.0F, 21.0F, 4.0F, 4.0F, -0.3F, false);

        Pipe5 = new ModelRenderer(this);
        Pipe5.setPos(1.0F, 0.0F, -1.5F);
        Pipes.addChild(Pipe5);
        setRotationAngle(Pipe5, 0.0F, 1.0472F, 0.0F);
        Pipe5.texOffs(208, 104).addBox(-7.0F, 31.0F, 17.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
        Pipe5.texOffs(219, 198).addBox(-7.0F, 21.0F, 17.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
        Pipe5.texOffs(100, 210).addBox(-6.0F, 20.0F, 18.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
        Pipe5.texOffs(240, 216).addBox(-3.0F, 28.0F, 19.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        Pipe5.texOffs(185, 241).addBox(1.0F, 29.0F, 19.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Pipe5.texOffs(24, 245).addBox(1.0F, 31.25F, 19.0F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        Pipe5.texOffs(205, 32).addBox(-6.0F, 17.0F, 18.0F, 9.0F, 3.0F, 3.0F, 0.0F, false);
        Pipe5.texOffs(0, 233).addBox(3.0F, 16.5F, 17.5F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        Pipe5.texOffs(63, 235).addBox(3.75F, 17.0F, 18.067F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        Pipe1Bend3 = new ModelRenderer(this);
        Pipe1Bend3.setPos(6.0F, 20.0F, 20.0F);
        Pipe5.addChild(Pipe1Bend3);
        setRotationAngle(Pipe1Bend3, 0.0F, 1.0472F, 0.0F);
        Pipe1Bend3.texOffs(219, 205).addBox(-0.049F, -3.0F, -0.951F, 7.0F, 3.0F, 3.0F, 0.0F, false);
        Pipe1Bend3.texOffs(165, 238).addBox(6.951F, -3.0F, -0.951F, 2.0F, 3.0F, 3.0F, 0.25F, false);
        Pipe1Bend3.texOffs(226, 10).addBox(8.951F, -2.5F, -0.451F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        Pipe1Bend3.texOffs(93, 225).addBox(14.951F, -0.5F, -0.451F, 2.0F, 13.0F, 2.0F, 0.0F, false);
        Pipe1Bend3.texOffs(149, 241).addBox(14.951F, 10.75F, -0.451F, 2.0F, 2.0F, 2.0F, 0.25F, false);

        Pipe1Bend4 = new ModelRenderer(this);
        Pipe1Bend4.setPos(-13.0F, 20.0F, 20.0F);
        Pipe5.addChild(Pipe1Bend4);
        setRotationAngle(Pipe1Bend4, 0.0F, 0.0F, -0.8727F);


        Pipe9 = new ModelRenderer(this);
        Pipe9.setPos(-5.0F, 0.0F, -1.5F);
        Pipes.addChild(Pipe9);
        setRotationAngle(Pipe9, 0.0F, -2.0944F, 0.0F);
        Pipe9.texOffs(219, 212).addBox(2.0F, 31.0F, 17.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
        Pipe9.texOffs(219, 219).addBox(2.0F, 21.0F, 17.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
        Pipe9.texOffs(0, 218).addBox(3.0F, 20.0F, 18.0F, 3.0F, 11.0F, 3.0F, 0.0F, false);
        Pipe9.texOffs(240, 219).addBox(-2.0F, 28.0F, 19.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        Pipe9.texOffs(81, 242).addBox(-2.0F, 29.0F, 19.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Pipe9.texOffs(245, 31).addBox(-2.0F, 31.25F, 19.0F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        Pipe9.texOffs(208, 97).addBox(-3.0F, 17.0F, 18.0F, 9.0F, 3.0F, 3.0F, 0.0F, false);
        Pipe9.texOffs(204, 234).addBox(-4.0F, 16.5F, 17.5F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        Pipe9.texOffs(78, 235).addBox(-7.75F, 17.0F, 18.067F, 4.0F, 3.0F, 3.0F, 0.0F, false);

        Pipe1Bend5 = new ModelRenderer(this);
        Pipe1Bend5.setPos(-6.0F, 20.0F, 20.0F);
        Pipe9.addChild(Pipe1Bend5);
        setRotationAngle(Pipe1Bend5, 0.0F, -1.0472F, 0.0F);
        Pipe1Bend5.texOffs(33, 220).addBox(-6.951F, -3.0F, -0.951F, 7.0F, 3.0F, 3.0F, 0.0F, false);
        Pipe1Bend5.texOffs(193, 238).addBox(-8.951F, -3.0F, -0.951F, 2.0F, 3.0F, 3.0F, 0.25F, false);
        Pipe1Bend5.texOffs(226, 15).addBox(-16.951F, -2.5F, -0.451F, 8.0F, 2.0F, 2.0F, 0.0F, false);
        Pipe1Bend5.texOffs(102, 225).addBox(-16.951F, -0.5F, -0.451F, 2.0F, 13.0F, 2.0F, 0.0F, false);
        Pipe1Bend5.texOffs(176, 241).addBox(-16.951F, 10.75F, -0.451F, 2.0F, 2.0F, 2.0F, 0.25F, false);

        Pipe1Bend6 = new ModelRenderer(this);
        Pipe1Bend6.setPos(13.0F, 20.0F, 20.0F);
        Pipe9.addChild(Pipe1Bend6);
        setRotationAngle(Pipe1Bend6, 0.0F, 0.0F, 0.8727F);


        Pipe2 = new ModelRenderer(this);
        Pipe2.setPos(0.0F, 0.0F, 0.0F);
        Pipes.addChild(Pipe2);
        Pipe2.texOffs(170, 210).addBox(-4.0F, 26.0F, 12.5F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        Pipe2.texOffs(28, 232).addBox(-2.0F, 24.0F, 14.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Pipe2.texOffs(198, 162).addBox(-4.0F, 23.0F, 14.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        Pipe2.texOffs(179, 56).addBox(-4.0F, 9.0F, 14.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);

        Pipe6 = new ModelRenderer(this);
        Pipe6.setPos(0.0F, 0.0F, 0.0F);
        Pipes.addChild(Pipe6);
        setRotationAngle(Pipe6, 0.0F, 3.1416F, 0.0F);
        Pipe6.texOffs(152, 219).addBox(-4.0F, 26.0F, 12.5F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        Pipe6.texOffs(225, 243).addBox(-2.0F, 24.0F, 14.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Pipe6.texOffs(210, 198).addBox(-4.0F, 23.0F, 14.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        Pipe6.texOffs(126, 229).addBox(-4.0F, 9.0F, 14.5F, 1.0F, 14.0F, 1.0F, 0.0F, false);

        Pipe3 = new ModelRenderer(this);
        Pipe3.setPos(0.0F, 0.0F, 0.0F);
        Pipes.addChild(Pipe3);
        setRotationAngle(Pipe3, 0.0F, -1.0472F, 0.0F);
        Pipe3.texOffs(180, 236).addBox(-1.5F, 31.0F, 17.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        Pipe3.texOffs(113, 205).addBox(-1.0F, 10.0F, 18.0F, 2.0F, 21.0F, 2.0F, 0.0F, false);

        Pipe4 = new ModelRenderer(this);
        Pipe4.setPos(0.0F, 0.0F, 0.0F);
        Pipes.addChild(Pipe4);
        setRotationAngle(Pipe4, 0.0F, -2.0944F, 0.0F);
        Pipe4.texOffs(111, 238).addBox(-1.5F, 31.0F, 17.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        Pipe4.texOffs(122, 205).addBox(-1.0F, 10.0F, 18.0F, 2.0F, 21.0F, 2.0F, 0.0F, false);

        Pipe7 = new ModelRenderer(this);
        Pipe7.setPos(0.0F, 0.0F, 0.0F);
        Pipes.addChild(Pipe7);
        setRotationAngle(Pipe7, 0.0F, 3.1416F, 0.0F);
        Pipe7.texOffs(215, 238).addBox(-1.5F, 31.0F, 17.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        Pipe7.texOffs(15, 208).addBox(-1.0F, 10.0F, 18.0F, 2.0F, 21.0F, 2.0F, 0.0F, false);

        Pipe8 = new ModelRenderer(this);
        Pipe8.setPos(0.0F, 0.0F, 0.0F);
        Pipes.addChild(Pipe8);
        setRotationAngle(Pipe8, 0.0F, 2.0944F, 0.0F);
        Pipe8.texOffs(228, 238).addBox(-1.5F, 31.0F, 19.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        Pipe8.texOffs(24, 208).addBox(-1.0F, 10.0F, 19.5F, 2.0F, 21.0F, 2.0F, 0.0F, false);

        Controls = new ModelRenderer(this);
        Controls.setPos(0.0F, 24.0F, 0.0F);


        BigLever1 = new ModelRenderer(this);
        BigLever1.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(BigLever1);
        BigLever1.texOffs(240, 201).addBox(9.5F, -4.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.01F, false);

        BL1Handle = new ModelRenderer(this);
        BL1Handle.setPos(10.5F, -3.0F, 0.0F);
        BigLever1.addChild(BL1Handle);
        setRotationAngle(BL1Handle, 0.0F, 0.0F, -0.6109F);
        BL1Handle.texOffs(11, 239).addBox(0.0F, -1.0F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        BL1Handle.texOffs(241, 238).addBox(6.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        BL1Handle.texOffs(26, 239).addBox(0.0F, -1.0F, 0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        BigLever2 = new ModelRenderer(this);
        BigLever2.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(BigLever2);
        setRotationAngle(BigLever2, 0.0F, 3.1416F, 0.0F);
        BigLever2.texOffs(240, 207).addBox(9.5F, -4.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.01F, false);

        BL1Handle2 = new ModelRenderer(this);
        BL1Handle2.setPos(10.5F, -3.0F, 0.0F);
        BigLever2.addChild(BL1Handle2);
        setRotationAngle(BL1Handle2, 0.0F, 0.0F, -0.6109F);
        BL1Handle2.texOffs(239, 38).addBox(0.0F, -1.0F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        BL1Handle2.texOffs(0, 242).addBox(6.0F, -1.0F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        BL1Handle2.texOffs(239, 41).addBox(0.0F, -1.0F, 0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);

        PanelRotations = new ModelRenderer(this);
        PanelRotations.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(PanelRotations);


        Panel1South = new ModelRenderer(this);
        Panel1South.setPos(0.0F, 0.0F, 0.0F);
        PanelRotations.addChild(Panel1South);


        P1Angle2 = new ModelRenderer(this);
        P1Angle2.setPos(-0.5F, 8.0F, 16.75F);
        Panel1South.addChild(P1Angle2);
        setRotationAngle(P1Angle2, -0.1309F, 0.0F, 0.0F);
        P1Angle2.texOffs(169, 44).addBox(-3.0F, -3.0F, -2.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
        P1Angle2.texOffs(245, 34).addBox(1.0F, -2.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        P1Angle2.texOffs(70, 245).addBox(1.75F, -2.0F, 4.75F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        P1Angle2.texOffs(93, 221).addBox(0.0F, -2.0F, 4.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        P1Angle2.texOffs(235, 243).addBox(-2.0F, -2.5F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        P1Angle2.texOffs(240, 243).addBox(-2.5F, -2.25F, -0.5F, 1.0F, 2.0F, 1.0F, -0.25F, false);
        P1Angle2.texOffs(242, 88).addBox(-1.0F, -2.0F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        P1Angle2.texOffs(229, 107).addBox(-3.5F, -3.0F, -2.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
        P1Angle2.texOffs(161, 235).addBox(-3.5F, -3.5F, -2.5F, 8.0F, 1.0F, 1.0F, -0.475F, false);
        P1Angle2.texOffs(146, 118).addBox(-3.5F, -3.5F, -1.5F, 8.0F, 1.0F, 1.0F, -0.475F, false);
        P1Angle2.texOffs(229, 104).addBox(-3.5F, -2.5F, -1.5F, 8.0F, 1.0F, 1.0F, -0.475F, false);
        P1Angle2.texOffs(233, 195).addBox(-3.5F, -2.5F, -2.5F, 8.0F, 1.0F, 1.0F, -0.475F, false);
        P1Angle2.texOffs(86, 242).addBox(-4.0F, -3.0F, -2.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
        P1Angle2.texOffs(240, 49).addBox(-1.0F, -1.5F, -6.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        P1Angle2.texOffs(230, 243).addBox(0.0F, -3.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(7.2185F, -1.0129F, 2.9253F);
        P1Angle2.addChild(cube_r11);
        setRotationAngle(cube_r11, -0.2431F, -0.9386F, 0.2982F);
        cube_r11.texOffs(242, 83).addBox(5.0F, -0.5F, -0.5F, 1.0F, 3.0F, 1.0F, -0.25F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(7.2683F, -1.5053F, 2.9964F);
        P1Angle2.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.2431F, -0.9386F, 0.2982F);
        cube_r12.texOffs(150, 80).addBox(-6.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, -0.25F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(0.5F, -3.5F, -4.5F);
        P1Angle2.addChild(cube_r13);
        setRotationAngle(cube_r13, -3.1416F, -0.7854F, 3.1416F);
        cube_r13.texOffs(242, 102).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 0.0F, 0.01F, false);
        cube_r13.texOffs(155, 121).addBox(-1.5F, -0.5F, 1.5F, 4.0F, 1.0F, 0.0F, 0.01F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(0.5F, -3.5F, -4.5F);
        P1Angle2.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, -0.7854F, 0.0F);
        cube_r14.texOffs(41, 239).addBox(-1.5F, -0.5F, 1.5F, 3.0F, 1.0F, 0.0F, 0.01F, false);
        cube_r14.texOffs(146, 121).addBox(-1.5F, -0.5F, -1.5F, 4.0F, 1.0F, 0.0F, 0.01F, false);

        ValveControl = new ModelRenderer(this);
        ValveControl.setPos(-2.0F, -2.25F, 0.0F);
        P1Angle2.addChild(ValveControl);
        ValveControl.texOffs(242, 91).addBox(-1.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.2F, false);

        HourGlass1Stand = new ModelRenderer(this);
        HourGlass1Stand.setPos(0.0F, 0.0F, 0.0F);
        Panel1South.addChild(HourGlass1Stand);
        setRotationAngle(HourGlass1Stand, 0.0F, -0.5236F, 0.0F);
        HourGlass1Stand.texOffs(19, 245).addBox(-0.5F, -4.0F, 10.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        HourGlass1Stand.texOffs(140, 169).addBox(-1.5F, -8.0F, 10.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

        HourGlassSpin = new ModelRenderer(this);
        HourGlassSpin.setPos(0.0F, -7.5F, 10.5F);
        HourGlass1Stand.addChild(HourGlassSpin);
        HourGlassSpin.texOffs(140, 160).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        HourGlassSpin.texOffs(131, 240).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, -0.3F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.0F, 0.0F, 0.0F);
        HourGlassSpin.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -1.5708F);
        cube_r15.texOffs(240, 75).addBox(-3.0F, 0.5F, -1.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);
        cube_r15.texOffs(240, 198).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);
        cube_r15.texOffs(240, 72).addBox(-3.0F, -1.5F, 0.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);
        cube_r15.texOffs(240, 54).addBox(-3.0F, 0.5F, 0.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(0.0F, 0.0F, 0.0F);
        HourGlassSpin.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, -3.1416F);
        cube_r16.texOffs(70, 242).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, -0.375F, false);

        HourGlass2Stand = new ModelRenderer(this);
        HourGlass2Stand.setPos(0.0F, 0.75F, 1.0F);
        Panel1South.addChild(HourGlass2Stand);
        setRotationAngle(HourGlass2Stand, 0.0F, 3.1416F, 0.0F);
        HourGlass2Stand.texOffs(19, 245).addBox(-0.5F, -4.0F, 10.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        HourGlass2Stand.texOffs(140, 169).addBox(-1.5F, -8.0F, 10.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

        HourGlassSpin2 = new ModelRenderer(this);
        HourGlassSpin2.setPos(0.0F, -7.5F, 10.5F);
        HourGlass2Stand.addChild(HourGlassSpin2);
        HourGlassSpin2.texOffs(140, 160).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
        HourGlassSpin2.texOffs(131, 240).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, -0.3F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(0.0F, 0.0F, 0.0F);
        HourGlassSpin2.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, -1.5708F);
        cube_r17.texOffs(240, 75).addBox(-3.0F, 0.5F, -1.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);
        cube_r17.texOffs(240, 198).addBox(-3.0F, -1.5F, -1.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);
        cube_r17.texOffs(240, 72).addBox(-3.0F, -1.5F, 0.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);
        cube_r17.texOffs(240, 54).addBox(-3.0F, 0.5F, 0.5F, 6.0F, 1.0F, 1.0F, -0.375F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(0.0F, 0.0F, 0.0F);
        HourGlassSpin2.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -3.1416F);
        cube_r18.texOffs(70, 242).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, -0.375F, false);

        Panel2Upper2 = new ModelRenderer(this);
        Panel2Upper2.setPos(0.0F, 0.0F, 0.0F);
        PanelRotations.addChild(Panel2Upper2);
        setRotationAngle(Panel2Upper2, 0.0F, -1.0472F, 0.0F);


        P2Angle2 = new ModelRenderer(this);
        P2Angle2.setPos(-0.5F, 8.0F, 16.75F);
        Panel2Upper2.addChild(P2Angle2);
        setRotationAngle(P2Angle2, -0.1309F, 0.0F, 0.0F);
        P2Angle2.texOffs(239, 44).addBox(-1.0F, -2.0F, 4.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        P2Angle2.texOffs(215, 235).addBox(-3.0F, -5.25F, -4.0F, 7.0F, 1.0F, 1.0F, -1.0F, false);
        P2Angle2.texOffs(244, 136).addBox(0.0F, -3.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.2F, false);
        P2Angle2.texOffs(163, 245).addBox(1.5F, -1.75F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        P2Angle2.texOffs(168, 245).addBox(-1.75F, -1.75F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        P2Angle2.texOffs(244, 144).addBox(-1.75F, -3.0F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        P2Angle2.texOffs(244, 140).addBox(1.5F, -3.0F, 1.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        P2Angle2.texOffs(75, 245).addBox(1.0F, -1.25F, -4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        P2Angle2.texOffs(125, 245).addBox(-1.0F, -1.25F, -4.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        P2Angle2.texOffs(81, 176).addBox(3.0F, -5.25F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        P2Angle2.texOffs(134, 187).addBox(-3.0F, -5.25F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        P2Angle2.texOffs(240, 57).addBox(-1.0F, -2.65F, 4.0F, 3.0F, 1.0F, 3.0F, -0.3F, false);

        Panel3Upper2 = new ModelRenderer(this);
        Panel3Upper2.setPos(0.0F, 0.0F, 0.0F);
        PanelRotations.addChild(Panel3Upper2);
        setRotationAngle(Panel3Upper2, 0.0F, -2.0944F, 0.0F);


        P3Angle2 = new ModelRenderer(this);
        P3Angle2.setPos(-0.5F, 8.0F, 16.75F);
        Panel3Upper2.addChild(P3Angle2);
        setRotationAngle(P3Angle2, -0.1309F, 0.0F, 0.0F);
        P3Angle2.texOffs(52, 176).addBox(-1.0F, -1.55F, -1.75F, 3.0F, 2.0F, 11.0F, 0.1F, false);
        P3Angle2.texOffs(200, 136).addBox(-4.0F, -3.05F, -3.5F, 9.0F, 2.0F, 2.0F, -1.6F, false);
        P3Angle2.texOffs(28, 236).addBox(-3.0F, -9.05F, -8.15F, 7.0F, 1.0F, 1.0F, -0.1F, false);
        P3Angle2.texOffs(202, 73).addBox(-1.5F, -8.8F, -7.4F, 4.0F, 1.0F, 4.0F, -0.1F, false);
        P3Angle2.texOffs(240, 222).addBox(-1.5F, -2.05F, 6.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        P3Angle2.texOffs(9, 242).addBox(-1.5F, -2.05F, 4.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        P3Angle2.texOffs(31, 242).addBox(0.0F, -2.05F, 3.5F, 1.0F, 1.0F, 3.0F, -0.01F, false);
        P3Angle2.texOffs(20, 242).addBox(-1.5F, -2.05F, 2.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(0.0F, 0.2F, 0.0F);
        P3Angle2.addChild(cube_r19);
        setRotationAngle(cube_r19, -0.0698F, 0.0F, 0.0F);
        cube_r19.texOffs(75, 28).addBox(-12.0F, -1.0F, -7.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);

        Light = new LightModelRenderer(this);
        Light.setPos(-1.0F, -7.05F, -1.9F);
        P3Angle2.addChild(Light);
        Light.texOffs(240, 62).addBox(0.0F, -2.0F, -5.0F, 3.0F, 1.0F, 3.0F, -0.1F, false);

        Panel4North = new ModelRenderer(this);
        Panel4North.setPos(0.0F, 0.0F, 0.0F);
        PanelRotations.addChild(Panel4North);
        setRotationAngle(Panel4North, 0.0F, 3.1416F, 0.0F);


        P4Angle2 = new ModelRenderer(this);
        P4Angle2.setPos(-0.5F, 8.0F, 16.75F);
        Panel4North.addChild(P4Angle2);
        setRotationAngle(P4Angle2, -0.1309F, 0.0F, 0.0F);
        P4Angle2.texOffs(74, 199).addBox(-3.0F, -5.25F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        P4Angle2.texOffs(131, 237).addBox(-3.0F, -5.25F, -4.0F, 7.0F, 1.0F, 1.0F, -1.0F, false);
        P4Angle2.texOffs(134, 194).addBox(3.0F, -5.25F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        P4Angle2.texOffs(50, 241).addBox(-1.0F, -3.1F, -2.5F, 3.0F, 2.0F, 2.0F, 0.2F, false);
        P4Angle2.texOffs(74, 206).addBox(0.0F, -2.0F, 1.5F, 1.0F, 1.0F, 2.0F, 0.1F, false);
        P4Angle2.texOffs(195, 245).addBox(1.5F, -2.0F, 6.75F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        P4Angle2.texOffs(243, 20).addBox(-0.25F, -2.0F, 6.75F, 2.0F, 1.0F, 1.0F, -0.01F, false);
        P4Angle2.texOffs(190, 245).addBox(0.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(0.5F, -1.5F, 7.0F);
        P4Angle2.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, -1.5708F, 0.0F);
        cube_r20.texOffs(243, 23).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(0.5F, -0.25F, -1.0F);
        P4Angle2.addChild(cube_r21);
        setRotationAngle(cube_r21, -0.0436F, 0.0F, 0.0F);
        cube_r21.texOffs(75, 42).addBox(-12.5F, -0.5F, -6.0F, 25.0F, 1.0F, 12.0F, 0.0F, false);

        Panel5Upper2 = new ModelRenderer(this);
        Panel5Upper2.setPos(0.0F, 0.0F, 0.0F);
        PanelRotations.addChild(Panel5Upper2);
        setRotationAngle(Panel5Upper2, 0.0F, 2.0944F, 0.0F);


        P5Angle2 = new ModelRenderer(this);
        P5Angle2.setPos(-0.5F, 8.0F, 16.75F);
        Panel5Upper2.addChild(P5Angle2);
        setRotationAngle(P5Angle2, -0.1309F, 0.0F, 0.0F);
        P5Angle2.texOffs(240, 67).addBox(-1.0F, -1.5F, -6.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        P5Angle2.texOffs(244, 148).addBox(0.0F, -3.5F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        P5Angle2.texOffs(243, 26).addBox(0.0F, -4.0F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(-0.1563F, -1.5353F, 1.8933F);
        P5Angle2.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, 0.0F);
        cube_r22.texOffs(111, 243).addBox(-0.6433F, -0.4647F, 0.0937F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(-0.1563F, -1.5353F, 1.8933F);
        P5Angle2.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 1.5708F, 0.0F);
        cube_r23.texOffs(118, 243).addBox(-1.3437F, -0.4647F, 0.1067F, 2.0F, 1.0F, 1.0F, -0.01F, false);
        cube_r23.texOffs(245, 243).addBox(0.4063F, -0.4647F, 0.1067F, 1.0F, 1.0F, 1.0F, 0.25F, false);
        cube_r23.texOffs(50, 246).addBox(-1.0937F, -0.4647F, -1.6433F, 1.0F, 1.0F, 1.0F, 0.25F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(0.5F, -3.5F, -4.5F);
        P5Angle2.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, -0.7854F, 0.0F);
        cube_r24.texOffs(233, 102).addBox(-1.5F, -0.5F, -1.5F, 4.0F, 1.0F, 0.0F, 0.01F, false);
        cube_r24.texOffs(244, 154).addBox(-1.5F, -0.5F, 1.5F, 3.0F, 1.0F, 0.0F, 0.01F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(0.5F, -3.5F, -4.5F);
        P5Angle2.addChild(cube_r25);
        setRotationAngle(cube_r25, -3.1416F, -0.7854F, 3.1416F);
        cube_r25.texOffs(244, 152).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 1.0F, 0.0F, 0.01F, false);
        cube_r25.texOffs(189, 54).addBox(-1.5F, -0.5F, 1.5F, 4.0F, 1.0F, 0.0F, 0.01F, false);

        DoorLockLever = new ModelRenderer(this);
        DoorLockLever.setPos(0.5F, -3.5F, 2.5F);
        P5Angle2.addChild(DoorLockLever);
        DoorLockLever.texOffs(61, 242).addBox(0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        Panel6Upper2 = new ModelRenderer(this);
        Panel6Upper2.setPos(0.0F, 0.0F, 0.0F);
        PanelRotations.addChild(Panel6Upper2);
        setRotationAngle(Panel6Upper2, 0.0F, 1.0472F, 0.0F);


        P6Angle2 = new ModelRenderer(this);
        P6Angle2.setPos(-0.5F, 8.0F, 16.75F);
        Panel6Upper2.addChild(P6Angle2);
        setRotationAngle(P6Angle2, -0.1309F, 0.0F, 0.0F);
        P6Angle2.texOffs(158, 241).addBox(-3.0F, -5.25F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        P6Angle2.texOffs(244, 156).addBox(-2.0F, -2.25F, -2.9F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        P6Angle2.texOffs(9, 245).addBox(2.0F, -2.25F, -2.9F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        P6Angle2.texOffs(48, 227).addBox(3.0F, -5.25F, -4.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        P6Angle2.texOffs(148, 238).addBox(-3.0F, -5.25F, -4.0F, 7.0F, 1.0F, 1.0F, -1.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(1.0F, -1.5F, 8.25F);
        P6Angle2.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, -1.5708F);
        cube_r26.texOffs(111, 246).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r26.texOffs(55, 246).addBox(-0.5F, 0.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(-1.0F, -1.5F, 6.75F);
        P6Angle2.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, -1.5708F);
        cube_r27.texOffs(246, 110).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(-1.0F, -1.25F, 2.5F);
        P6Angle2.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, -1.5708F);
        cube_r28.texOffs(14, 245).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        EdgeWheel1Pos = new ModelRenderer(this);
        EdgeWheel1Pos.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(EdgeWheel1Pos);
        setRotationAngle(EdgeWheel1Pos, 0.0F, -0.5236F, 0.0F);


        EdgeWheel1Rot = new ModelRenderer(this);
        EdgeWheel1Rot.setPos(-2.0F, 6.25F, 20.5F);
        EdgeWheel1Pos.addChild(EdgeWheel1Rot);
        setRotationAngle(EdgeWheel1Rot, -0.7854F, 0.0F, 0.0F);
        EdgeWheel1Rot.texOffs(41, 241).addBox(-0.25F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, -0.39F, false);
        EdgeWheel1Rot.texOffs(242, 94).addBox(-0.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.39F, false);

        EdgeWheel2Pos = new ModelRenderer(this);
        EdgeWheel2Pos.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(EdgeWheel2Pos);
        setRotationAngle(EdgeWheel2Pos, 0.0F, 1.5708F, 0.0F);


        EdgeWheel2Rot = new ModelRenderer(this);
        EdgeWheel2Rot.setPos(-2.0F, 6.25F, 20.5F);
        EdgeWheel2Pos.addChild(EdgeWheel2Rot);
        setRotationAngle(EdgeWheel2Rot, -0.7854F, 0.0F, 0.0F);
        EdgeWheel2Rot.texOffs(140, 241).addBox(-0.25F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, -0.39F, false);
        EdgeWheel2Rot.texOffs(218, 243).addBox(-0.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.39F, false);

        EdgeWheel3and4Pos = new ModelRenderer(this);
        EdgeWheel3and4Pos.setPos(0.0F, 0.0F, 0.0F);
        Controls.addChild(EdgeWheel3and4Pos);
        setRotationAngle(EdgeWheel3and4Pos, 0.0F, 2.618F, 0.0F);


        EdgeWheel3Rot = new ModelRenderer(this);
        EdgeWheel3Rot.setPos(-2.0F, 6.25F, 20.5F);
        EdgeWheel3and4Pos.addChild(EdgeWheel3Rot);
        setRotationAngle(EdgeWheel3Rot, -0.7854F, 0.0F, 0.0F);
        EdgeWheel3Rot.texOffs(93, 241).addBox(-0.25F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, -0.39F, false);
        EdgeWheel3Rot.texOffs(204, 243).addBox(-0.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.39F, false);

        EdgeWheel4Rot = new ModelRenderer(this);
        EdgeWheel4Rot.setPos(-2.0F, -0.75F, 13.5F);
        EdgeWheel3and4Pos.addChild(EdgeWheel4Rot);
        setRotationAngle(EdgeWheel4Rot, -0.7854F, 0.0F, 0.0F);
        EdgeWheel4Rot.texOffs(102, 241).addBox(-0.25F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, -0.39F, false);
        EdgeWheel4Rot.texOffs(211, 243).addBox(-0.1F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.39F, false);

    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

    }

    public void setRotationAngle(@NotNull ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void render(CustardConsoleTile custardConsoleTile, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int i, int noOverlay, float v, float v1, float v2, float v3) {
        matrixStack.pushPose();
        boolean lightState = ((Objects.requireNonNull(custardConsoleTile.getLevel()).getGameTime() % 100) >= 0) && ((Objects.requireNonNull(custardConsoleTile.getLevel()).getGameTime() % 100) <= 50);
        this.EdgeLight1.setBright(lightState ? 1 : 0);
        this.EdgeLight2.setBright(lightState ? 0 : 1);
        this.EdgeLight3.setBright(lightState ? 1 : 0);
        this.EdgeLight4.setBright(lightState ? 0 : 1);
        this.EdgeLight5.setBright(lightState ? 1 : 0);
        this.EdgeLight6.setBright(lightState ? 0 : 1);
        this.EdgeLight1.setBright(lightState ? 1 : 0);

        custardConsoleTile.getControl(RefuelerControl.class).ifPresent((ref) -> {
            this.Light.setBright(ref.isRefueling() ? 1 : 0);
        });

        custardConsoleTile.getControl(ThrottleControl.class).ifPresent((throttle) -> {
            this.BL1Handle2.zRot = (float) Math.toRadians(-(50.0F - throttle.getAmount() * 50.0F));
        });

        custardConsoleTile.getControl(HandbrakeControl.class).ifPresent((brake) -> {
            this.BL1Handle.zRot = (float) Math.toRadians(-(50.0F - (brake.isFree() ? 0 : 1) * 50.0F)); //100.0F - 75.0F
        });

        custardConsoleTile.getControl(DoorControl.class).ifPresent((door) -> {
            this.DoorLockLever.zRot = (float) (door.getAnimationProgress() != 0 ? Math.toRadians(180) : Math.toRadians(-180));
        });

        this.TimeRotor2.y =  4F + (0 - (float)Math.cos((double)custardConsoleTile.flightTicks * 0.1D) * 2F);

        matrixStack.translate(0, -.9, 0);
        matrixStack.scale((float) .6, (float) .6, (float) .6);

        Custard.render(matrixStack, buffer, i, noOverlay, v, v1, v2, v3);
        Controls.render(matrixStack, buffer, i, noOverlay, v, v1, v2, v3);
        matrixStack.popPose();
    }
}