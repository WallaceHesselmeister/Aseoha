package com.code.aseoha.client.models.consoles;// Made with Blockbench 4.10.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.tileentities.consoles.BattleConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.consoles.AbstractConsoleEntityModel;
import net.tardis.mod.controls.*;

public class BattleConsoleModel extends AbstractConsoleEntityModel<BattleConsoleTile> {

    private final ModelRenderer Console;
    private final ModelRenderer Panels;
    private final ModelRenderer BasePanel1;
    private final ModelRenderer UpperMainPanel;
    private final ModelRenderer Monitor3;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer Panel1Screen_r1;
    private final ModelRenderer UpperPanelSupportsAndWiring;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer BasePanel2;
    private final ModelRenderer LowerMainPanel;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer Panel2Screen_r1;
    private final ModelRenderer LowerPanelSupportsAndWiring;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer BasePanel3;
    private final ModelRenderer UpperMainPanel2;
    private final ModelRenderer Monitor2;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer Panel1Screen_r2;
    private final ModelRenderer UpperPanelSupportsAndWiring2;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer BasePanel4;
    private final ModelRenderer LowerMainPanel2;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer Panel2Screen_r2;
    private final ModelRenderer LowerPanelSupportsAndWiring2;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer BasePanel5;
    private final ModelRenderer UpperMainPanel3;
    private final ModelRenderer Monitor4;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer Panel1Screen_r3;
    private final ModelRenderer ThottleSlider;
    private final ModelRenderer Panel1Screen_r4;
    private final ModelRenderer UpperPanelSupportsAndWiring3;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer BasePanel6;
    private final ModelRenderer LowerMainPanel3;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer Panel2Screen_r3;
    private final ModelRenderer DimensionCube;
    private final ModelRenderer cube_r29;
    private final ModelRenderer LowerPanelSupportsAndWiring3;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer TimeRotor;
    private final ModelRenderer RotorBase;
    private final ModelRenderer cube_r32;
    private final ModelRenderer cube_r33;
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
    private final ModelRenderer Rotor;
    private final ModelRenderer RotorCrystal;
    private final ModelRenderer cube_r60;
    private final ModelRenderer EnergyCrystal;
    private final ModelRenderer cube_r61;
    private final ModelRenderer Controls;

    public BattleConsoleModel() {
        texWidth = 128;
        texHeight = 128;

        Console = new ModelRenderer(this);
        Console.setPos(0.0F, 24.0F, 0.0F);


        Panels = new ModelRenderer(this);
        Panels.setPos(0.0F, 0.0F, 0.0F);
        Console.addChild(Panels);


        BasePanel1 = new ModelRenderer(this);
        BasePanel1.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(BasePanel1);


        UpperMainPanel = new ModelRenderer(this);
        UpperMainPanel.setPos(0.0F, -17.0F, -10.0F);
        BasePanel1.addChild(UpperMainPanel);
        UpperMainPanel.texOffs(30, 2).addBox(-5.5F, 2.0F, -5.725F, 11.0F, 2.0F, 8.0F, -0.001F, false);

        Monitor3 = new ModelRenderer(this);
        Monitor3.setPos(0.0F, 2.0F, -5.725F);
        UpperMainPanel.addChild(Monitor3);
        setRotationAngle(Monitor3, 0.1047F, 0.0F, 0.0F);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0F, -2.7116F, 9.1595F);
        Monitor3.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
        cube_r1.texOffs(97, 45).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0F, -4.0386F, 4.5238F);
        Monitor3.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
        cube_r2.texOffs(100, 8).addBox(-4.5F, 2.0F, -5.725F, 9.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(0.0F, -1.3722F, 5.926F);
        Monitor3.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
        cube_r3.texOffs(82, 65).addBox(4.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r3.texOffs(82, 77).addBox(-5.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        Panel1Screen_r1 = new ModelRenderer(this);
        Panel1Screen_r1.setPos(0.0F, -2.0F, 5.725F);
        Monitor3.addChild(Panel1Screen_r1);
        setRotationAngle(Panel1Screen_r1, 0.3927F, 0.0F, 0.0F);
        Panel1Screen_r1.texOffs(57, 23).addBox(-4.5F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        Panel1Screen_r1.texOffs(59, 13).addBox(-4.5F, 0.25F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        UpperPanelSupportsAndWiring = new ModelRenderer(this);
        UpperPanelSupportsAndWiring.setPos(0.0F, 0.0F, 0.0F);
        BasePanel1.addChild(UpperPanelSupportsAndWiring);
        UpperPanelSupportsAndWiring.texOffs(81, 53).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, -0.01F, false);
        UpperPanelSupportsAndWiring.texOffs(12, 70).addBox(-1.0F, -13.1271F, -15.7758F, 2.0F, 5.0F, 2.0F, -0.01F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.5F, -11.2053F, -12.0656F);
        UpperPanelSupportsAndWiring.addChild(cube_r4);
        setRotationAngle(cube_r4, 3.1416F, 0.0F, 0.0F);
        cube_r4.texOffs(30, 28).addBox(4.5F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);
        cube_r4.texOffs(12, 74).addBox(-2.5F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r4.texOffs(8, 94).addBox(2.25F, -1.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r4.texOffs(54, 43).addBox(-4.5F, -1.0F, -3.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r4.texOffs(97, 10).addBox(-4.5F, 1.0F, 2.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.5F, -3.6934F, -2.4588F);
        UpperPanelSupportsAndWiring.addChild(cube_r5);
        setRotationAngle(cube_r5, 1.1781F, 0.0F, 0.0F);
        cube_r5.texOffs(0, 100).addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

        BasePanel2 = new ModelRenderer(this);
        BasePanel2.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(BasePanel2);
        setRotationAngle(BasePanel2, 0.0F, -1.0472F, 0.0F);


        LowerMainPanel = new ModelRenderer(this);
        LowerMainPanel.setPos(0.0F, -17.7116F, -6.5655F);
        BasePanel2.addChild(LowerMainPanel);
        LowerMainPanel.texOffs(30, 12).addBox(-5.5F, 4.5594F, -8.3942F, 11.0F, 2.0F, 8.0F, -0.001F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.0F, 0.0F, 0.0F);
        LowerMainPanel.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.3927F, 0.0F, 0.0F);
        cube_r6.texOffs(99, 94).addBox(-4.5F, 1.0F, -0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.0F, -1.327F, -4.6357F);
        LowerMainPanel.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.3927F, 0.0F, 0.0F);
        cube_r7.texOffs(100, 25).addBox(-4.5F, 4.0F, -5.725F, 9.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, 1.3394F, -3.2336F);
        LowerMainPanel.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.3927F, 0.0F, 0.0F);
        cube_r8.texOffs(0, 36).addBox(-5.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r8.texOffs(4, 36).addBox(4.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r8.texOffs(58, 84).addBox(4.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r8.texOffs(85, 13).addBox(-5.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        Panel2Screen_r1 = new ModelRenderer(this);
        Panel2Screen_r1.setPos(0.0F, 0.7116F, -3.4345F);
        LowerMainPanel.addChild(Panel2Screen_r1);
        setRotationAngle(Panel2Screen_r1, 0.3927F, 0.0F, 0.0F);
        Panel2Screen_r1.texOffs(56, 33).addBox(-4.5F, 2.0F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        Panel2Screen_r1.texOffs(0, 60).addBox(-4.5F, 2.25F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        LowerPanelSupportsAndWiring = new ModelRenderer(this);
        LowerPanelSupportsAndWiring.setPos(0.0F, 0.0F, 0.0F);
        BasePanel2.addChild(LowerPanelSupportsAndWiring);
        LowerPanelSupportsAndWiring.texOffs(54, 53).addBox(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, -0.01F, false);
        LowerPanelSupportsAndWiring.texOffs(12, 82).addBox(-0.999F, -11.1277F, -15.7745F, 2.0F, 2.0F, 2.0F, -0.01F, false);
        LowerPanelSupportsAndWiring.texOffs(96, 89).addBox(-4.0F, -12.8164F, -15.8415F, 8.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.5F, -11.2053F, -12.0656F);
        LowerPanelSupportsAndWiring.addChild(cube_r9);
        setRotationAngle(cube_r9, 3.1416F, 0.0F, 0.0F);
        cube_r9.texOffs(54, 39).addBox(-3.0F, -3.0F, -7.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r9.texOffs(56, 63).addBox(-3.75F, -2.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r9.texOffs(70, 81).addBox(3.5F, -3.0F, -5.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r9.texOffs(30, 18).addBox(1.5F, -5.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(0.5F, -4.6934F, -2.4588F);
        LowerPanelSupportsAndWiring.addChild(cube_r10);
        setRotationAngle(cube_r10, 1.1781F, 0.0F, 0.0F);
        cube_r10.texOffs(84, 99).addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

        BasePanel3 = new ModelRenderer(this);
        BasePanel3.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(BasePanel3);
        setRotationAngle(BasePanel3, 0.0F, -2.0944F, 0.0F);


        UpperMainPanel2 = new ModelRenderer(this);
        UpperMainPanel2.setPos(0.0F, -17.0F, -10.0F);
        BasePanel3.addChild(UpperMainPanel2);
        UpperMainPanel2.texOffs(0, 30).addBox(-5.5F, 2.0F, -5.725F, 11.0F, 2.0F, 8.0F, -0.001F, false);

        Monitor2 = new ModelRenderer(this);
        Monitor2.setPos(0.0F, 2.0F, -5.725F);
        UpperMainPanel2.addChild(Monitor2);
        setRotationAngle(Monitor2, 0.1047F, 0.0F, 0.0F);


        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(0.0F, -2.7116F, 9.1595F);
        Monitor2.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.3927F, 0.0F, 0.0F);
        cube_r11.texOffs(97, 20).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(0.0F, -4.0386F, 4.5238F);
        Monitor2.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.3927F, 0.0F, 0.0F);
        cube_r12.texOffs(100, 6).addBox(-4.5F, 2.0F, -5.725F, 9.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(0.0F, -1.3722F, 5.926F);
        Monitor2.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.3927F, 0.0F, 0.0F);
        cube_r13.texOffs(82, 33).addBox(4.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r13.texOffs(46, 82).addBox(-5.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        Panel1Screen_r2 = new ModelRenderer(this);
        Panel1Screen_r2.setPos(0.0F, -2.0F, 5.725F);
        Monitor2.addChild(Panel1Screen_r2);
        setRotationAngle(Panel1Screen_r2, 0.3927F, 0.0F, 0.0F);
        Panel1Screen_r2.texOffs(54, 43).addBox(-4.5F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        Panel1Screen_r2.texOffs(54, 53).addBox(-4.5F, 0.25F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        UpperPanelSupportsAndWiring2 = new ModelRenderer(this);
        UpperPanelSupportsAndWiring2.setPos(0.0F, 0.0F, 0.0F);
        BasePanel3.addChild(UpperPanelSupportsAndWiring2);
        UpperPanelSupportsAndWiring2.texOffs(60, 12).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, -0.01F, false);
        UpperPanelSupportsAndWiring2.texOffs(0, 60).addBox(-1.0F, -13.1271F, -15.7758F, 2.0F, 5.0F, 2.0F, -0.01F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(0.5F, -11.2053F, -12.0656F);
        UpperPanelSupportsAndWiring2.addChild(cube_r14);
        setRotationAngle(cube_r14, 3.1416F, 0.0F, 0.0F);
        cube_r14.texOffs(30, 8).addBox(4.5F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);
        cube_r14.texOffs(27, 63).addBox(-2.5F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r14.texOffs(38, 81).addBox(2.25F, -1.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r14.texOffs(27, 48).addBox(-4.5F, -1.0F, -3.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r14.texOffs(58, 96).addBox(-4.5F, 1.0F, 2.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.5F, -3.6934F, -2.4588F);
        UpperPanelSupportsAndWiring2.addChild(cube_r15);
        setRotationAngle(cube_r15, 1.1781F, 0.0F, 0.0F);
        cube_r15.texOffs(76, 99).addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

        BasePanel4 = new ModelRenderer(this);
        BasePanel4.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(BasePanel4);
        setRotationAngle(BasePanel4, 0.0F, 3.1416F, 0.0F);


        LowerMainPanel2 = new ModelRenderer(this);
        LowerMainPanel2.setPos(0.0F, -17.7116F, -6.5655F);
        BasePanel4.addChild(LowerMainPanel2);
        LowerMainPanel2.texOffs(0, 20).addBox(-5.5F, 4.5594F, -8.3942F, 11.0F, 2.0F, 8.0F, -0.001F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(0.0F, 0.0F, 0.0F);
        LowerMainPanel2.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
        cube_r16.texOffs(97, 17).addBox(-4.5F, 1.0F, -0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(0.0F, -1.327F, -4.6357F);
        LowerMainPanel2.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
        cube_r17.texOffs(100, 4).addBox(-4.5F, 4.0F, -5.725F, 9.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(0.0F, 1.3394F, -3.2336F);
        LowerMainPanel2.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.3927F, 0.0F, 0.0F);
        cube_r18.texOffs(30, 2).addBox(-5.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r18.texOffs(34, 2).addBox(4.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r18.texOffs(80, 53).addBox(4.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r18.texOffs(12, 82).addBox(-5.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        Panel2Screen_r2 = new ModelRenderer(this);
        Panel2Screen_r2.setPos(0.0F, 0.7116F, -3.4345F);
        LowerMainPanel2.addChild(Panel2Screen_r2);
        setRotationAngle(Panel2Screen_r2, 0.3927F, 0.0F, 0.0F);
        Panel2Screen_r2.texOffs(30, 22).addBox(-4.5F, 2.0F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        Panel2Screen_r2.texOffs(27, 52).addBox(-4.5F, 2.25F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        LowerPanelSupportsAndWiring2 = new ModelRenderer(this);
        LowerPanelSupportsAndWiring2.setPos(0.0F, 0.0F, 0.0F);
        BasePanel4.addChild(LowerPanelSupportsAndWiring2);
        LowerPanelSupportsAndWiring2.texOffs(0, 50).addBox(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, -0.01F, false);
        LowerPanelSupportsAndWiring2.texOffs(24, 74).addBox(-0.999F, -11.1277F, -15.7745F, 2.0F, 2.0F, 2.0F, -0.01F, false);
        LowerPanelSupportsAndWiring2.texOffs(78, 95).addBox(-4.0F, -12.8164F, -15.8415F, 8.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(0.5F, -11.2053F, -12.0656F);
        LowerPanelSupportsAndWiring2.addChild(cube_r19);
        setRotationAngle(cube_r19, 3.1416F, 0.0F, 0.0F);
        cube_r19.texOffs(27, 38).addBox(-3.0F, -3.0F, -7.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r19.texOffs(51, 60).addBox(-3.75F, -2.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r19.texOffs(74, 59).addBox(3.5F, -3.0F, -5.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r19.texOffs(0, 26).addBox(1.5F, -5.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(0.5F, -4.6934F, -2.4588F);
        LowerPanelSupportsAndWiring2.addChild(cube_r20);
        setRotationAngle(cube_r20, 1.1781F, 0.0F, 0.0F);
        cube_r20.texOffs(46, 99).addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

        BasePanel5 = new ModelRenderer(this);
        BasePanel5.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(BasePanel5);
        setRotationAngle(BasePanel5, 0.0F, 2.0944F, 0.0F);


        UpperMainPanel3 = new ModelRenderer(this);
        UpperMainPanel3.setPos(0.0F, -17.0F, -10.0F);
        BasePanel5.addChild(UpperMainPanel3);
        UpperMainPanel3.texOffs(0, 10).addBox(-5.5F, 2.0F, -5.725F, 11.0F, 2.0F, 8.0F, -0.001F, false);

        Monitor4 = new ModelRenderer(this);
        Monitor4.setPos(0.0F, 2.0F, -5.725F);
        UpperMainPanel3.addChild(Monitor4);
        setRotationAngle(Monitor4, 0.1047F, 0.0F, 0.0F);


        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(0.0F, -2.7116F, 9.1595F);
        Monitor4.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.3927F, 0.0F, 0.0F);
        cube_r21.texOffs(97, 14).addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(0.0F, -4.0386F, 4.5238F);
        Monitor4.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
        cube_r22.texOffs(94, 41).addBox(-4.5F, 2.0F, -5.725F, 9.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(0.0F, -1.3722F, 5.926F);
        Monitor4.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.3927F, 0.0F, 0.0F);
        cube_r23.texOffs(70, 72).addBox(4.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r23.texOffs(24, 75).addBox(-5.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        Panel1Screen_r3 = new ModelRenderer(this);
        Panel1Screen_r3.setPos(0.0F, -2.0F, 5.725F);
        Monitor4.addChild(Panel1Screen_r3);
        setRotationAngle(Panel1Screen_r3, 0.3927F, 0.0F, 0.0F);
        Panel1Screen_r3.texOffs(27, 42).addBox(-4.5F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        Panel1Screen_r3.texOffs(0, 50).addBox(-4.5F, 0.25F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        ThottleSlider = new ModelRenderer(this);
        ThottleSlider.setPos(0.0F, -2.0F, 5.725F);
        Monitor4.addChild(ThottleSlider);


        Panel1Screen_r4 = new ModelRenderer(this);
        Panel1Screen_r4.setPos(0.0F, 0.0F, 0.0F);
        ThottleSlider.addChild(Panel1Screen_r4);
        setRotationAngle(Panel1Screen_r4, 0.3927F, 0.0F, 0.0F);
        Panel1Screen_r4.texOffs(0, 16).addBox(-3.5F, -0.25F, -4.0F, 2.0F, 0.0F, 2.0F, 0.0F, false);

        UpperPanelSupportsAndWiring3 = new ModelRenderer(this);
        UpperPanelSupportsAndWiring3.setPos(0.0F, 0.0F, 0.0F);
        BasePanel5.addChild(UpperPanelSupportsAndWiring3);
        UpperPanelSupportsAndWiring3.texOffs(57, 23).addBox(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, -0.01F, false);
        UpperPanelSupportsAndWiring3.texOffs(56, 33).addBox(-1.0F, -13.1271F, -15.7758F, 2.0F, 5.0F, 2.0F, -0.01F, false);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(0.5F, -11.2053F, -12.0656F);
        UpperPanelSupportsAndWiring3.addChild(cube_r24);
        setRotationAngle(cube_r24, 3.1416F, 0.0F, 0.0F);
        cube_r24.texOffs(0, 16).addBox(4.5F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);
        cube_r24.texOffs(27, 53).addBox(-2.5F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r24.texOffs(24, 64).addBox(2.25F, -1.0F, -7.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r24.texOffs(30, 0).addBox(-4.5F, -1.0F, -3.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r24.texOffs(95, 0).addBox(-4.5F, 1.0F, 2.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(0.5F, -3.6934F, -2.4588F);
        UpperPanelSupportsAndWiring3.addChild(cube_r25);
        setRotationAngle(cube_r25, 1.1781F, 0.0F, 0.0F);
        cube_r25.texOffs(38, 99).addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

        BasePanel6 = new ModelRenderer(this);
        BasePanel6.setPos(0.0F, 0.0F, 0.0F);
        Panels.addChild(BasePanel6);
        setRotationAngle(BasePanel6, 0.0F, 1.0472F, 0.0F);


        LowerMainPanel3 = new ModelRenderer(this);
        LowerMainPanel3.setPos(0.0F, -17.7116F, -6.5655F);
        BasePanel6.addChild(LowerMainPanel3);
        LowerMainPanel3.texOffs(0, 0).addBox(-5.5F, 4.5594F, -8.3942F, 11.0F, 2.0F, 8.0F, -0.001F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(0.0F, 0.0F, 0.0F);
        LowerMainPanel3.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.3927F, 0.0F, 0.0F);
        cube_r26.texOffs(70, 84).addBox(-4.5F, 1.0F, -0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(0.0F, -1.327F, -4.6357F);
        LowerMainPanel3.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.3927F, 0.0F, 0.0F);
        cube_r27.texOffs(30, 0).addBox(-4.5F, 4.0F, -5.725F, 9.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(0.0F, 1.3394F, -3.2336F);
        LowerMainPanel3.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.3927F, 0.0F, 0.0F);
        cube_r28.texOffs(0, 26).addBox(-5.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r28.texOffs(4, 26).addBox(4.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
        cube_r28.texOffs(68, 0).addBox(4.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);
        cube_r28.texOffs(12, 70).addBox(-5.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, 0.0F, false);

        Panel2Screen_r3 = new ModelRenderer(this);
        Panel2Screen_r3.setPos(0.0F, 0.7116F, -3.4345F);
        LowerMainPanel3.addChild(Panel2Screen_r3);
        setRotationAngle(Panel2Screen_r3, 0.3927F, 0.0F, 0.0F);
        Panel2Screen_r3.texOffs(29, 32).addBox(-4.5F, 2.0F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
        Panel2Screen_r3.texOffs(0, 40).addBox(-4.5F, 2.25F, -6.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);

        DimensionCube = new ModelRenderer(this);
        DimensionCube.setPos(0.0F, -0.5225F, -5.0281F);
        LowerMainPanel3.addChild(DimensionCube);


        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(0.0F, 0.0F, 0.0F);
        DimensionCube.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0873F, 0.0F, 0.0F);
        cube_r29.texOffs(80, 0).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, -1.0F, false);

        LowerPanelSupportsAndWiring3 = new ModelRenderer(this);
        LowerPanelSupportsAndWiring3.setPos(0.0F, 0.0F, 0.0F);
        BasePanel6.addChild(LowerPanelSupportsAndWiring3);
        LowerPanelSupportsAndWiring3.texOffs(0, 40).addBox(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, -0.01F, false);
        LowerPanelSupportsAndWiring3.texOffs(0, 0).addBox(-0.999F, -11.1277F, -15.7745F, 2.0F, 2.0F, 2.0F, -0.01F, false);
        LowerPanelSupportsAndWiring3.texOffs(94, 82).addBox(-4.0F, -12.8164F, -15.8415F, 8.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(0.5F, -11.2053F, -12.0656F);
        LowerPanelSupportsAndWiring3.addChild(cube_r30);
        setRotationAngle(cube_r30, 3.1416F, 0.0F, 0.0F);
        cube_r30.texOffs(0, 0).addBox(-3.0F, -3.0F, -7.0F, 0.0F, 4.0F, 4.0F, 0.0F, false);
        cube_r30.texOffs(27, 43).addBox(-3.75F, -2.0F, -1.0F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r30.texOffs(27, 56).addBox(3.5F, -3.0F, -5.0F, 0.0F, 4.0F, 6.0F, 0.0F, false);
        cube_r30.texOffs(0, 6).addBox(1.5F, -5.0F, -1.0F, 0.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(0.5F, -4.6934F, -2.4588F);
        LowerPanelSupportsAndWiring3.addChild(cube_r31);
        setRotationAngle(cube_r31, 1.1781F, 0.0F, 0.0F);
        cube_r31.texOffs(96, 97).addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);

        TimeRotor = new ModelRenderer(this);
        TimeRotor.setPos(0.0F, 0.0F, 0.0F);
        Console.addChild(TimeRotor);


        RotorBase = new ModelRenderer(this);
        RotorBase.setPos(0.0F, -6.0F, 0.0F);
        TimeRotor.addChild(RotorBase);


        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(0.0F, 0.0F, 0.0F);
        RotorBase.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, 0.0F, 0.0F);
        cube_r32.texOffs(94, 31).addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r32.texOffs(92, 99).addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r32.texOffs(89, 11).addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(0.0F, -18.0F, 0.0F);
        RotorBase.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.0F, 2.0944F, 0.0F);
        cube_r33.texOffs(8, 108).addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, -0.001F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(0.0F, -18.0F, 0.0F);
        RotorBase.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0F, 3.1416F, 0.0F);
        cube_r34.texOffs(19, 107).addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(0.0F, -18.0F, 0.0F);
        RotorBase.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 1.0472F, 0.0F);
        cube_r35.texOffs(104, 106).addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, 0.0002F, false);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(0.0F, -18.0F, 0.0F);
        RotorBase.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, 0.0F, 0.0F);
        cube_r36.texOffs(62, 104).addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, -0.001F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(0.0F, -18.0F, 0.0F);
        RotorBase.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.0F, -1.0472F, 0.0F);
        cube_r37.texOffs(8, 104).addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, 0.001F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(0.0F, -18.0F, 0.0F);
        RotorBase.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, -2.0944F, 0.0F);
        cube_r38.texOffs(62, 100).addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, -0.001F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, 0.0F);
        cube_r39.texOffs(101, 48).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, -0.001F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(0.0F, 0.0F, 0.0F);
        RotorBase.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 1.0472F, 0.0F);
        cube_r40.texOffs(94, 36).addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, -0.001F, false);
        cube_r40.texOffs(66, 108).addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r40.texOffs(62, 108).addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(0.0F, -9.5F, 0.0F);
        RotorBase.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, -1.0472F, 0.0F);
        cube_r41.texOffs(62, 82).addBox(-0.5F, -9.0F, -3.2F, 1.0F, 4.0F, 1.0F, 0.0002F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(0.0F, -9.5F, 0.0F);
        RotorBase.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.0F, 1.0472F, 0.0F);
        cube_r42.texOffs(58, 82).addBox(-0.5F, -9.0F, -3.2F, 1.0F, 4.0F, 1.0F, 0.0002F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(0.0F, -9.5F, 0.0F);
        RotorBase.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 3.1416F, 0.0F);
        cube_r43.texOffs(80, 0).addBox(-0.5F, -9.0F, -3.2F, 1.0F, 4.0F, 1.0F, 0.0002F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0F, 3.1416F, 0.0F);
        cube_r44.texOffs(60, 0).addBox(-0.5F, -5.0F, -4.2F, 1.0F, 3.0F, 1.0F, 0.0002F, false);
        cube_r44.texOffs(104, 97).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, -1.0472F, 0.0F);
        cube_r45.texOffs(72, 0).addBox(-0.5F, -5.0F, -4.2F, 1.0F, 3.0F, 1.0F, 0.0002F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0F, 1.0472F, 0.0F);
        cube_r46.texOffs(81, 45).addBox(-0.5F, -5.0F, -4.2F, 1.0F, 3.0F, 1.0F, 0.0002F, false);
        cube_r46.texOffs(104, 27).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, 0.0002F, false);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(0.0F, 0.0F, 0.0F);
        RotorBase.addChild(cube_r47);
        setRotationAngle(cube_r47, 0.0F, 2.0944F, 0.0F);
        cube_r47.texOffs(38, 94).addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r47.texOffs(32, 110).addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r47.texOffs(70, 108).addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 2.0944F, 0.0F);
        cube_r48.texOffs(104, 86).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, -0.001F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(0.0F, 0.0F, 0.0F);
        RotorBase.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 3.1416F, 0.0F);
        cube_r49.texOffs(94, 65).addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, -0.001F, false);
        cube_r49.texOffs(104, 110).addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r49.texOffs(92, 110).addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(0.0F, 0.0F, 0.0F);
        RotorBase.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, -2.0944F, 0.0F);
        cube_r50.texOffs(94, 70).addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
        cube_r50.texOffs(21, 111).addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r50.texOffs(108, 110).addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.0F, -2.0944F, 0.0F);
        cube_r51.texOffs(104, 100).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, -0.001F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setPos(0.0F, -10.0F, 0.0F);
        RotorBase.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, -1.0472F, 0.0F);
        cube_r52.texOffs(104, 103).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, 0.001F, false);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setPos(0.0F, 0.0F, 0.0F);
        RotorBase.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, -1.0472F, 0.0F);
        cube_r53.texOffs(25, 111).addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r53.texOffs(8, 112).addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, 0.0F, false);
        cube_r53.texOffs(94, 77).addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, -0.001F, false);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setPos(0.0F, 6.5F, 0.0F);
        RotorBase.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 1.5708F, 0.0F);
        cube_r54.texOffs(81, 45).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, -0.001F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setPos(0.0F, 6.5F, 0.0F);
        RotorBase.addChild(cube_r55);
        setRotationAngle(cube_r55, -3.1416F, 0.5236F, 3.1416F);
        cube_r55.texOffs(84, 25).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setPos(0.0F, 6.5F, 0.0F);
        RotorBase.addChild(cube_r56);
        setRotationAngle(cube_r56, -3.1416F, -0.5236F, 3.1416F);
        cube_r56.texOffs(80, 89).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, -0.001F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setPos(0.0F, 6.5F, 0.0F);
        RotorBase.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, -1.5708F, 0.0F);
        cube_r57.texOffs(92, 51).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setPos(0.0F, 6.5F, 0.0F);
        RotorBase.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, -0.5236F, 0.0F);
        cube_r58.texOffs(92, 57).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, -0.001F, false);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setPos(0.0F, 6.5F, 0.0F);
        RotorBase.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.5236F, 0.0F);
        cube_r59.texOffs(0, 94).addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, 0.0F, false);

        Rotor = new ModelRenderer(this);
        Rotor.setPos(0.0F, 0.0F, 0.0F);
        TimeRotor.addChild(Rotor);
        Rotor.texOffs(34, 87).addBox(-0.5F, -34.0F, -0.5F, 1.0F, 22.0F, 1.0F, 0.0F, false);

        RotorCrystal = new ModelRenderer(this);
        RotorCrystal.setPos(0.0F, -4.0F, 0.0F);
        Rotor.addChild(RotorCrystal);
        RotorCrystal.texOffs(0, 70).addBox(-1.5F, -43.5F, -1.5F, 3.0F, 21.0F, 3.0F, 0.0F, false);
        RotorCrystal.texOffs(56, 63).addBox(-3.0F, -39.5F, -3.0F, 6.0F, 13.0F, 6.0F, 0.0F, false);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setPos(0.0F, 0.0F, 0.0F);
        RotorCrystal.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, -0.7854F, 0.0F);
        cube_r60.texOffs(36, 62).addBox(-2.5F, -42.0F, -2.5F, 5.0F, 18.0F, 5.0F, 0.0F, false);

        EnergyCrystal = new ModelRenderer(this);
        EnergyCrystal.setPos(0.0F, 15.0F, 0.0F);
        Console.addChild(EnergyCrystal);
        EnergyCrystal.texOffs(54, 100).addBox(-1.0F, -34.5F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
        EnergyCrystal.texOffs(60, 0).addBox(-2.0F, -31.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setPos(0.0F, 0.0F, 0.0F);
        EnergyCrystal.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.7854F, 0.0F);
        cube_r61.texOffs(20, 94).addBox(-1.5F, -33.5F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

        Controls = new ModelRenderer(this);
        Controls.setPos(0.0F, 24.0F, 0.0F);

    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Console.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//        Controls.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    public void render(BattleConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {

//        tile.getControl(LandingTypeControl.class).ifPresent(landingTypeControl -> {
//            if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
//                this.VerticalLandTypeDown.setBright(2);
//                this.VerticalLandTypeUp.setBright(1);
//            } else {
//                this.VerticalLandTypeDown.setBright(1);
//                this.VerticalLandTypeUp.setBright(2);
//            }
//        });
//
//        tile.getControl(net.tardis.mod.controls.XControl.class).ifPresent(x -> {
//            this.XControl.setBright(x.getAnimationTicks() != 0 ? 2F : 1F);
//        });
//
//        tile.getControl(net.tardis.mod.controls.YControl.class).ifPresent(y -> {
//            this.YControl.setBright(y.getAnimationTicks() != 0 ? 2F : 1F);
//        });
//
//        tile.getControl(net.tardis.mod.controls.ZControl.class).ifPresent(z -> {
//            this.ZControl.setBright(z.getAnimationTicks() != 0 ? 2F : 1F);
//        });
//
//        tile.getControl(IncModControl.class).ifPresent(incModControl -> {
//            this.ControlIncMod.setBright(incModControl.getAnimationTicks() != 0 ? 2F : 1F);
//        });
//
//        tile.getControl(HandbrakeControl.class).ifPresent(control -> {
//            this.Handbrake.xRot = (float) Math.toRadians(control.isFree() ? -12 : 35);
//        });
//
//
//        //this.ExteriorFacingNorth.rotateAngleY = (float) Math.toRadians(WorldHelper.getAngleFromFacing(tile.getExteriorFacingDirection()));
//        tile.getControl(FacingControl.class).ifPresent(facingControl -> {
//            if (tile.getExteriorFacingDirection() == Direction.NORTH) {
//                this.ExteriorFacingNorth.setBright(2);
//                this.ExteriorFacingEast.setBright(1);
//                this.ExteriorFacingSouth.setBright(1);
//                this.ExteriorFacingWest.setBright(1);
//            } else if (tile.getExteriorFacingDirection() == Direction.EAST) {
//                this.ExteriorFacingNorth.setBright(1);
//                this.ExteriorFacingEast.setBright(2);
//                this.ExteriorFacingSouth.setBright(1);
//                this.ExteriorFacingWest.setBright(1);
//            } else if (tile.getExteriorFacingDirection() == Direction.SOUTH) {
//                this.ExteriorFacingNorth.setBright(1);
//                this.ExteriorFacingEast.setBright(1);
//                this.ExteriorFacingSouth.setBright(2);
//                this.ExteriorFacingWest.setBright(1);
//            }
//            else {
//                this.ExteriorFacingNorth.setBright(1);
//                this.ExteriorFacingEast.setBright(1);
//                this.ExteriorFacingSouth.setBright(1);
//                this.ExteriorFacingWest.setBright(2);
//            }
//        });
//
//
//
        this.TimeRotor.yRot = (float)Math.toRadians((double)(tile.flightTicks * -3 % 360));
        this.TimeRotor.y = - (float)Math.cos((double)tile.flightTicks * 0.1D) * 2F; //rotationPointY
//
//
//        tile.getControl(RandomiserControl.class).ifPresent(randomiserControl -> {
//            this.Randomiser.setBright(randomiserControl.getAnimationTicks() != 0 ? 2F: 1F);
//        });
//
//
//
        tile.getControl(ThrottleControl.class).ifPresent(ThrottleControl -> {
            this.ThottleSlider.z = (float) Math.toRadians(320 + ThrottleControl.getAmount() * 240); //100.0F - 75.0F
            this.ThottleSlider.y = (float) Math.toRadians(-(97 + ThrottleControl.getAmount() * 100)); //100.0F - 75.0F


//            this.ThottleSlider.z = (float)Math.toRadians(525 + (ThrottleControl.getAmount()) * 100);
//            this.ThottleSlider.z = (float) Math.toRadians((double) (4.0F + 115.0F * ((float) ThrottleControl.getAmount() / (float) IncModControl.COORD_MODS.length)));
//            this.Throttle.y = (float)Math.abs((float)-15.3) ;
//            this.Throttle.xRot = (float)Math.toRadians(1);
        });
//        tile.getControl(HandbrakeControl.class).ifPresent((handBreak) -> {
////            if (handBreak.isFree()) {
////                this.Panel2Screen_r2.setBright(1F);
////            } if(!handBreak.isFree()){
////                this.Panel2Screen_r2.setBright(0F);
////            }
//            this.Panel1Screen_r3.setBright((handBreak.isFree() ? 1F : 0F));
////            this.Panel2Screen_r2.setBright(2);
//        });

//        tile.getControl(ThrottleControl.class).ifPresent((throttleControl) -> {
//            aseoha.LOGGER.info(throttleControl.getAmount());
//            if (throttleControl.getAmount() == .0F) {
//                this.Panel2Screen_r2.setBright(.0F);
//            }
//            if (throttleControl.getAmount() == .1F) {
//                this.Panel2Screen_r2.setBright(.1F);
//            }
//            if (throttleControl.getAmount() == .2F) {
//                this.Panel2Screen_r2.setBright(0.2F);
//            }
//
//            if (throttleControl.getAmount() == .3F) {
//                this.Panel2Screen_r2.setBright(0.3F);
//            }
//
//            if (throttleControl.getAmount() == .4F) {
//                this.Panel2Screen_r2.setBright(0.4F);
//            }
//            if (throttleControl.getAmount() == .5F) {
//                this.Panel2Screen_r2.setBright(0.5F);
//            }
//            if (throttleControl.getAmount() == .6F) {
//                this.Panel2Screen_r2.setBright(0.6F);
//            }
//            if (throttleControl.getAmount() == .7F) {
//                this.Panel2Screen_r2.setBright(0.7F);
//            }
//            if (throttleControl.getAmount() == .8F) {
//                this.Panel2Screen_r2.setBright(0.8F);
//            }
//            if (throttleControl.getAmount() == .9F) {
//                this.Panel2Screen_r2.setBright(0.9F);
//            }
//            if (throttleControl.getAmount() == 1) {
//                this.Panel2Screen_r2.setBright(1F);
//            }
//            if (throttleControl.getAmount() == 11) {
//                this.Panel1Screen_r3.setBright(1.1F);
//            }
//
//        });

//        tile.getControl(HandbrakeControl.class).ifPresent(handbrake -> {
//            this.EmmisivePanel1Handbreak.setBright(handbrake.isFree() ? 0 : 1);
//        });

//        tile.getControl(RefuelerControl.class).ifPresent(handbrake -> {
//            this.EmmisivePanel1Refuel.setBright(handbrake.isRefueling() ? 1 : 0);
//        });

//        this.FuelGagueE.setBright(tile.getArtron() % tile.getMaxArtron() > 25 ? 1 : 0);
//        this.FuelGagueMid.setBright(tile.getArtron() % tile.getMaxArtron() > 50 ? 1 : 0);
//        this.FuelGagueF.setBright(tile.getArtron() % tile.getMaxArtron() > 75 ? 1 : 0);

        tile.getControl(DimensionControl.class).ifPresent((dimensionControl) -> {
            this.DimensionCube.yRot = (float) Math.toRadians((double) (360.0F * ((float) dimensionControl.getDimListIndex() / (float) dimensionControl.getAvailableDimensions())));
        });
//
//        tile.getDoor().ifPresent((door) -> {
//            this.DoorSwitch.xRot = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 0 : 60);
//            this.DoorSwitch2.xRot = (float)Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 60 : 0);
//        });
//
//        tile.getControl(FastReturnControl.class).ifPresent(fastReturnControl -> {
//            this.FastReturn.setBright(fastReturnControl.getAnimationTicks() != 0 ? 2F: 1F);
//        });
//
//        tile.getSubsystem(StabilizerSubsystem.class).ifPresent((sys) -> {
//            this.Lever.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
//            this.Lever2.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
//            this.Lever3.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
//            this.Lever4.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
//            this.Lever5.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
//            this.Lever6.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
//            this.Lever7.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
//            this.Lever8.xRot = (float) Math.toRadians(sys.isActivated() ? -45 : 45);
//            this.Lever9.xRot = (float) Math.toRadians(sys.isActivated() ? 45 : -45);
//        });
//
//        this.Lever10.xRot = (float) Math.toRadians( 45);
//        this.Lever11.xRot = (float) Math.toRadians( 45);
//        this.Lever12.xRot = (float) Math.toRadians(-45);
//        this.Lever13.xRot = (float) Math.toRadians( 45);
//        this.Lever14.xRot = (float) Math.toRadians(-45);
//        this.Lever15.xRot = (float) Math.toRadians( 45);
//        this.Lever16.xRot = (float) Math.toRadians(-45);


        matrixStack.pushPose();
        matrixStack.scale(0.95F,0.95F,0.95F);
        matrixStack.translate(0.0685F,0.275F,-0.07F);
        Console.render(matrixStack, iVertexBuilder,i,i1);
//        Controls.render(matrixStack,iVertexBuilder,i,i1);
        matrixStack.popPose();
    }
}