package com.code.aseoha.client.models.exteriors;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class SutekhTardisModel extends ExteriorModel {
    private final ModelRenderer BOX;
    private final ModelRenderer backing;
    private final ModelRenderer boti;
    private final ModelRenderer lamp;
    private final ModelRenderer glow9;
    private final ModelRenderer roof;
    private final ModelRenderer side3;
    private final ModelRenderer left4;
    private final ModelRenderer window7;
    private final ModelRenderer frame7;
    private final ModelRenderer glow8;
    private final ModelRenderer right4;
    private final ModelRenderer window8;
    private final ModelRenderer frame8;
    private final ModelRenderer glow10;
    private final ModelRenderer side2;
    private final ModelRenderer left3;
    private final ModelRenderer window5;
    private final ModelRenderer frame5;
    private final ModelRenderer glow6;
    private final ModelRenderer right3;
    private final ModelRenderer window6;
    private final ModelRenderer frame6;
    private final ModelRenderer glow7;
    private final ModelRenderer side;
    private final ModelRenderer left;
    private final ModelRenderer window;
    private final ModelRenderer frame;
    private final ModelRenderer glow3;
    private final ModelRenderer right;
    private final ModelRenderer window2;
    private final ModelRenderer frame2;
    private final ModelRenderer glow4;
    private final ModelRenderer doors;
    private final ModelRenderer left2;
    private final ModelRenderer window3;
    private final ModelRenderer frame3;
    private final ModelRenderer glow2;
    private final ModelRenderer right2;
    private final ModelRenderer window4;
    private final ModelRenderer frame4;
    private final ModelRenderer glow5;
    private final ModelRenderer base;
    private final ModelRenderer SUTEKH;
    private final ModelRenderer head;
    private final ModelRenderer Body;
    private final ModelRenderer head_r1;
    private final ModelRenderer head_r2;
    private final ModelRenderer head_r3;
    private final ModelRenderer Arm;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer Arm2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer Cloak;
    private final ModelRenderer bone;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;

    public SutekhTardisModel() {
        texWidth = 272;
        texHeight = 272;

        BOX = new ModelRenderer(this);
        BOX.setPos(0.0F, 24.0F, 0.0F);


        backing = new ModelRenderer(this);
        backing.setPos(0.0F, 0.0F, 0.0F);
        BOX.addChild(backing);
        backing.texOffs(37, 85).addBox(7.75F, -34.0F, -8.0F, 0.0F, 32.0F, 16.0F, 0.0F, false);
        backing.texOffs(70, 103).addBox(-7.75F, -34.0F, -8.0F, 0.0F, 32.0F, 16.0F, 0.0F, false);

        boti = new ModelRenderer(this);
        boti.setPos(1.0F, -2.0F, -8.75F);
        BOX.addChild(boti);
        boti.texOffs(140, 156).addBox(-9.0F, -32.0F, 1.0F, 16.0F, 32.0F, 0.0F, 0.0F, false);
        boti.texOffs(97, 159).addBox(-9.0F, -32.0F, 16.5F, 16.0F, 32.0F, 0.0F, 0.0F, false);

        lamp = new ModelRenderer(this);
        lamp.setPos(0.0F, 0.0F, 0.0F);
        BOX.addChild(lamp);
        lamp.texOffs(179, 30).addBox(-1.5F, -40.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        lamp.texOffs(89, 58).addBox(-0.5F, -45.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        lamp.texOffs(142, 25).addBox(-1.0F, -44.0F, -1.25F, 2.0F, 4.0F, 0.0F, 0.0F, false);
        lamp.texOffs(142, 30).addBox(-1.0F, -44.0F, 1.25F, 2.0F, 4.0F, 0.0F, 0.0F, false);
        lamp.texOffs(70, 85).addBox(1.25F, -44.0F, -1.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);
        lamp.texOffs(70, 92).addBox(-1.25F, -44.0F, -1.0F, 0.0F, 4.0F, 2.0F, 0.0F, false);

        glow9 = new ModelRenderer(this);
        glow9.setPos(0.0F, 0.0F, 0.0F);
        lamp.addChild(glow9);
        glow9.texOffs(79, 19).addBox(-1.0F, -44.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

        roof = new ModelRenderer(this);
        roof.setPos(0.0F, 0.75F, 0.0F);
        BOX.addChild(roof);
        roof.texOffs(0, 61).addBox(-9.5F, -38.25F, -9.5F, 19.0F, 4.0F, 19.0F, 0.0F, false);
        roof.texOffs(79, 0).addBox(-8.5F, -39.25F, -8.5F, 17.0F, 1.0F, 17.0F, 0.0F, false);
        roof.texOffs(103, 103).addBox(-7.5F, -40.25F, -7.5F, 15.0F, 1.0F, 15.0F, 0.0F, false);

        side3 = new ModelRenderer(this);
        side3.setPos(0.0F, -1.0F, 0.0F);
        BOX.addChild(side3);
        setRotationAngle(side3, 0.0F, 3.1416F, 0.0F);
        side3.texOffs(194, 212).addBox(8.0F, -36.0F, 8.0F, 2.0F, 35.0F, 2.0F, 0.0F, false);
        side3.texOffs(88, 221).addBox(8.25F, -32.0F, -0.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        side3.texOffs(132, 207).addBox(8.5F, -32.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
        side3.texOffs(204, 194).addBox(7.75F, -33.0F, -8.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
        side3.texOffs(0, 175).addBox(8.75F, -35.5F, -9.0F, 2.0F, 3.0F, 18.0F, 0.0F, false);
        side3.texOffs(214, 98).addBox(11.0F, -35.0F, -7.0F, 0.0F, 2.0F, 14.0F, 0.0F, false);

        left4 = new ModelRenderer(this);
        left4.setPos(0.0F, 0.0F, 0.25F);
        side3.addChild(left4);
        left4.texOffs(113, 238).addBox(8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left4.texOffs(93, 225).addBox(8.0F, -32.0F, 6.75F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left4.texOffs(98, 225).addBox(8.0F, -32.0F, 0.25F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left4.texOffs(128, 238).addBox(8.0F, -32.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left4.texOffs(243, 91).addBox(8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left4.texOffs(243, 99).addBox(8.0F, -17.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left4.texOffs(243, 107).addBox(8.0F, -24.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        window7 = new ModelRenderer(this);
        window7.setPos(-0.25F, 0.0F, 0.0F);
        left4.addChild(window7);


        frame7 = new ModelRenderer(this);
        frame7.setPos(0.0F, 0.0F, 0.0F);
        window7.addChild(frame7);
        frame7.texOffs(227, 115).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow8 = new ModelRenderer(this);
        glow8.setPos(0.0F, 0.0F, 0.0F);
        window7.addChild(glow8);
        glow8.texOffs(208, 74).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(37, 209).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(210, 98).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(210, 102).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(211, 74).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(38, 213).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(214, 74).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(217, 74).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(220, 74).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(93, 221).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(223, 74).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(226, 74).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow8.texOffs(33, 248).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(158, 248).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(161, 248).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(164, 248).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 220).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 223).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 226).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 229).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 232).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 235).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 238).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow8.texOffs(248, 241).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        right4 = new ModelRenderer(this);
        right4.setPos(0.0F, 0.0F, -8.25F);
        side3.addChild(right4);
        right4.texOffs(143, 238).addBox(8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right4.texOffs(103, 225).addBox(8.0F, -32.0F, 6.75F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right4.texOffs(108, 225).addBox(8.0F, -32.0F, 0.25F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right4.texOffs(203, 238).addBox(8.0F, -32.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right4.texOffs(244, 42).addBox(8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right4.texOffs(244, 50).addBox(8.0F, -17.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right4.texOffs(244, 58).addBox(8.0F, -24.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right4.texOffs(66, 152).addBox(8.75F, -23.0F, 0.75F, 0.0F, 20.0F, 15.0F, 0.0F, false);

        window8 = new ModelRenderer(this);
        window8.setPos(-0.25F, 0.0F, 0.0F);
        right4.addChild(window8);


        frame8 = new ModelRenderer(this);
        frame8.setPos(0.0F, 0.0F, 0.0F);
        window8.addChild(frame8);
        frame8.texOffs(227, 145).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow10 = new ModelRenderer(this);
        glow10.setPos(0.0F, 0.0F, 0.0F);
        window8.addChild(glow10);
        glow10.texOffs(229, 75).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(229, 187).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(232, 75).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(232, 187).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(235, 75).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(235, 187).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(238, 26).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(238, 75).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(158, 238).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(161, 238).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(164, 238).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(238, 187).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow10.texOffs(248, 244).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(248, 247).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(218, 249).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(221, 249).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(224, 249).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(227, 249).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(230, 249).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(250, 66).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(250, 69).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(250, 72).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(113, 250).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow10.texOffs(116, 250).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        side2 = new ModelRenderer(this);
        side2.setPos(0.0F, -1.0F, 0.0F);
        BOX.addChild(side2);
        setRotationAngle(side2, 0.0F, -1.5708F, 0.0F);
        side2.texOffs(185, 212).addBox(8.0F, -36.0F, 8.0F, 2.0F, 35.0F, 2.0F, 0.0F, false);
        side2.texOffs(63, 218).addBox(8.25F, -32.0F, -0.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        side2.texOffs(97, 207).addBox(8.5F, -32.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
        side2.texOffs(0, 197).addBox(7.75F, -33.0F, -8.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
        side2.texOffs(173, 172).addBox(8.75F, -35.5F, -9.0F, 2.0F, 3.0F, 18.0F, 0.0F, false);
        side2.texOffs(203, 212).addBox(11.0F, -35.0F, -7.0F, 0.0F, 2.0F, 14.0F, 0.0F, false);

        left3 = new ModelRenderer(this);
        left3.setPos(0.0F, 0.0F, 0.25F);
        side2.addChild(left3);
        left3.texOffs(232, 212).addBox(8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left3.texOffs(68, 218).addBox(8.0F, -32.0F, 6.75F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left3.texOffs(73, 221).addBox(8.0F, -32.0F, 0.25F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left3.texOffs(233, 221).addBox(8.0F, -32.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left3.texOffs(241, 203).addBox(8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left3.texOffs(242, 75).addBox(8.0F, -17.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left3.texOffs(242, 83).addBox(8.0F, -24.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        window5 = new ModelRenderer(this);
        window5.setPos(-0.25F, 0.0F, 0.0F);
        left3.addChild(window5);


        frame5 = new ModelRenderer(this);
        frame5.setPos(0.0F, 0.0F, 0.0F);
        window5.addChild(frame5);
        frame5.texOffs(139, 225).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow6 = new ModelRenderer(this);
        glow6.setPos(0.0F, 0.0F, 0.0F);
        window5.addChild(glow6);
        glow6.texOffs(189, 80).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(167, 189).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(170, 189).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(192, 30).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(192, 80).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(123, 192).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(126, 192).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(195, 30).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(195, 80).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(123, 196).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(126, 196).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(37, 197).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow6.texOffs(203, 247).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(206, 247).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(209, 247).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(247, 211).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(212, 247).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(247, 214).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(215, 247).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(247, 217).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(233, 247).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(236, 247).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(239, 247).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow6.texOffs(242, 247).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        right3 = new ModelRenderer(this);
        right3.setPos(0.0F, 0.0F, -8.25F);
        side2.addChild(right3);
        right3.texOffs(233, 230).addBox(8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right3.texOffs(78, 221).addBox(8.0F, -32.0F, 6.75F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right3.texOffs(83, 221).addBox(8.0F, -32.0F, 0.25F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right3.texOffs(238, 17).addBox(8.0F, -32.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right3.texOffs(242, 153).addBox(8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right3.texOffs(242, 161).addBox(8.0F, -17.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right3.texOffs(242, 169).addBox(8.0F, -24.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right3.texOffs(148, 0).addBox(8.75F, -23.0F, 0.75F, 0.0F, 20.0F, 15.0F, 0.0F, false);

        window6 = new ModelRenderer(this);
        window6.setPos(-0.25F, 0.0F, 0.0F);
        right3.addChild(window6);


        frame6 = new ModelRenderer(this);
        frame6.setPos(0.0F, 0.0F, 0.0F);
        window6.addChild(frame6);
        frame6.texOffs(152, 225).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow7 = new ModelRenderer(this);
        glow7.setPos(0.0F, 0.0F, 0.0F);
        window6.addChild(glow7);
        glow7.texOffs(198, 30).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(198, 80).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(123, 200).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(126, 200).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(201, 30).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(37, 201).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(201, 80).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(204, 30).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(204, 80).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(37, 205).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(207, 98).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(207, 102).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow7.texOffs(245, 247).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(0, 248).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(3, 248).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(6, 248).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(9, 248).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(12, 248).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(15, 248).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(18, 248).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(21, 248).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(24, 248).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(27, 248).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow7.texOffs(30, 248).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        side = new ModelRenderer(this);
        side.setPos(0.0F, -1.0F, 0.0F);
        BOX.addChild(side);
        side.texOffs(176, 212).addBox(8.0F, -36.0F, 8.0F, 2.0F, 35.0F, 2.0F, 0.0F, false);
        side.texOffs(38, 218).addBox(8.25F, -32.0F, -0.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        side.texOffs(207, 80).addBox(8.5F, -32.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
        side.texOffs(167, 194).addBox(7.75F, -33.0F, -8.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
        side.texOffs(173, 150).addBox(8.75F, -35.5F, -9.0F, 2.0F, 3.0F, 18.0F, 0.0F, false);
        side.texOffs(212, 128).addBox(11.0F, -35.0F, -7.0F, 0.0F, 2.0F, 14.0F, 0.0F, false);

        left = new ModelRenderer(this);
        left.setPos(0.0F, 0.0F, 0.25F);
        side.addChild(left);
        left.texOffs(229, 66).addBox(8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left.texOffs(43, 218).addBox(8.0F, -32.0F, 6.75F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left.texOffs(48, 218).addBox(8.0F, -32.0F, 0.25F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left.texOffs(229, 178).addBox(8.0F, -32.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left.texOffs(241, 26).addBox(8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left.texOffs(241, 34).addBox(8.0F, -17.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left.texOffs(241, 123).addBox(8.0F, -24.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);

        window = new ModelRenderer(this);
        window.setPos(-0.25F, 0.0F, 0.0F);
        left.addChild(window);


        frame = new ModelRenderer(this);
        frame.setPos(0.0F, 0.0F, 0.0F);
        window.addChild(frame);
        frame.texOffs(113, 225).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow3 = new ModelRenderer(this);
        glow3.setPos(0.0F, 0.0F, 0.0F);
        window.addChild(glow3);
        glow3.texOffs(57, 175).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(60, 175).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(63, 175).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(130, 175).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(133, 175).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(136, 175).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(177, 80).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(54, 179).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(57, 179).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(60, 179).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(63, 179).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(130, 179).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow3.texOffs(230, 246).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(247, 66).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(247, 69).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(247, 72).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(113, 247).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(116, 247).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(119, 247).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(122, 247).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(125, 247).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(128, 247).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(131, 247).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow3.texOffs(134, 247).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        right = new ModelRenderer(this);
        right.setPos(0.0F, 0.0F, -8.25F);
        side.addChild(right);
        right.texOffs(203, 229).addBox(8.0F, -3.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right.texOffs(53, 218).addBox(8.0F, -32.0F, 6.75F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right.texOffs(58, 218).addBox(8.0F, -32.0F, 0.25F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right.texOffs(218, 229).addBox(8.0F, -32.0F, 1.0F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right.texOffs(241, 131).addBox(8.0F, -10.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right.texOffs(241, 187).addBox(8.0F, -17.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right.texOffs(241, 195).addBox(8.0F, -24.0F, 1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right.texOffs(140, 120).addBox(8.75F, -23.0F, 0.75F, 0.0F, 20.0F, 15.0F, 0.0F, false);

        window2 = new ModelRenderer(this);
        window2.setPos(-0.25F, 0.0F, 0.0F);
        right.addChild(window2);


        frame2 = new ModelRenderer(this);
        frame2.setPos(0.0F, 0.0F, 0.0F);
        window2.addChild(frame2);
        frame2.texOffs(126, 225).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow4 = new ModelRenderer(this);
        glow4.setPos(0.0F, 0.0F, 0.0F);
        window2.addChild(glow4);
        glow4.texOffs(133, 179).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(136, 179).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(180, 80).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(54, 183).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(57, 183).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(60, 183).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(63, 183).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(183, 80).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(130, 183).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(133, 183).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(136, 183).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(186, 80).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow4.texOffs(137, 247).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(247, 139).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(140, 247).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(247, 142).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(143, 247).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(146, 247).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(149, 247).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(152, 247).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(155, 247).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(247, 177).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(247, 180).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow4.texOffs(247, 183).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        doors = new ModelRenderer(this);
        doors.setPos(0.0F, -1.0F, 0.0F);
        BOX.addChild(doors);
        setRotationAngle(doors, 0.0F, 1.5708F, 0.0F);
        doors.texOffs(128, 84).addBox(8.5F, -32.5F, -8.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
        doors.texOffs(130, 189).addBox(7.75F, -33.0F, -8.0F, 2.0F, 1.0F, 16.0F, 0.0F, false);
        doors.texOffs(171, 128).addBox(8.75F, -35.5F, -9.0F, 2.0F, 3.0F, 18.0F, 0.0F, false);
        doors.texOffs(167, 212).addBox(8.0F, -36.0F, 8.0F, 2.0F, 35.0F, 2.0F, 0.0F, false);
        doors.texOffs(212, 0).addBox(11.0F, -35.0F, -7.0F, 0.0F, 2.0F, 14.0F, 0.0F, false);

        left2 = new ModelRenderer(this);
        left2.setPos(8.0F, -1.0F, 8.0F);
        doors.addChild(left2);
        left2.texOffs(142, 36).addBox(0.0F, -2.0F, -6.75F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left2.texOffs(13, 215).addBox(0.0F, -31.0F, -1.0F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left2.texOffs(18, 215).addBox(0.0F, -31.0F, -7.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        left2.texOffs(214, 185).addBox(0.0F, -31.0F, -6.75F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        left2.texOffs(218, 238).addBox(0.0F, -9.0F, -6.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left2.texOffs(233, 239).addBox(0.0F, -16.0F, -6.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left2.texOffs(240, 115).addBox(0.0F, -23.0F, -6.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        left2.texOffs(214, 145).addBox(0.75F, -22.0F, -6.75F, 0.0F, 20.0F, 6.0F, 0.0F, false);
        left2.texOffs(89, 45).addBox(0.25F, -8.0F, -6.75F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        left2.texOffs(102, 45).addBox(0.25F, -15.0F, -6.75F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        left2.texOffs(115, 45).addBox(0.25F, -22.0F, -6.75F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        left2.texOffs(86, 27).addBox(0.5F, -17.0F, -7.0F, 1.0F, 3.0F, 0.0F, 0.0F, false);

        window3 = new ModelRenderer(this);
        window3.setPos(-8.25F, 1.0F, -7.75F);
        left2.addChild(window3);


        frame3 = new ModelRenderer(this);
        frame3.setPos(0.0F, 0.0F, 0.0F);
        window3.addChild(frame3);
        frame3.texOffs(41, 175).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        frame3.texOffs(97, 192).addBox(8.5F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow2 = new ModelRenderer(this);
        glow2.setPos(0.0F, 0.0F, 0.0F);
        window3.addChild(glow2);
        glow2.texOffs(86, 31).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(70, 99).addBox(8.375F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(73, 99).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(66, 134).addBox(8.375F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(66, 138).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(66, 142).addBox(8.375F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(66, 146).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(97, 152).addBox(8.375F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(100, 152).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(157, 36).addBox(8.375F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(157, 40).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(130, 159).addBox(8.375F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(133, 159).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(136, 159).addBox(8.375F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(160, 36).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(160, 40).addBox(8.375F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(130, 163).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(133, 163).addBox(8.375F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(136, 163).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(164, 106).addBox(8.375F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(164, 110).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(164, 114).addBox(8.375F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(165, 80).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(167, 106).addBox(8.375F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow2.texOffs(94, 58).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(97, 58).addBox(8.375F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(100, 58).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(103, 58).addBox(8.375F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(106, 58).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(109, 58).addBox(8.375F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(112, 58).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(115, 58).addBox(8.375F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(118, 58).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(121, 58).addBox(8.375F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(124, 58).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(97, 156).addBox(8.375F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(100, 156).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(123, 204).addBox(8.375F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(126, 204).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(229, 191).addBox(8.375F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(232, 191).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(235, 191).addBox(8.375F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(238, 191).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(241, 42).addBox(8.375F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(241, 45).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(241, 139).addBox(8.375F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(241, 142).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow2.texOffs(0, 242).addBox(8.375F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        right2 = new ModelRenderer(this);
        right2.setPos(8.0F, -1.0F, -8.0F);
        doors.addChild(right2);
        right2.texOffs(229, 48).addBox(0.0F, -2.0F, 0.75F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right2.texOffs(23, 215).addBox(0.0F, -31.0F, 6.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right2.texOffs(28, 215).addBox(0.0F, -31.0F, 0.0F, 1.0F, 31.0F, 1.0F, 0.0F, false);
        right2.texOffs(229, 57).addBox(0.0F, -31.0F, 0.75F, 1.0F, 2.0F, 6.0F, 0.0F, false);
        right2.texOffs(240, 145).addBox(0.0F, -9.0F, 0.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right2.texOffs(241, 0).addBox(0.0F, -16.0F, 0.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right2.texOffs(241, 8).addBox(0.0F, -23.0F, 0.75F, 1.0F, 1.0F, 6.0F, 0.0F, false);
        right2.texOffs(0, 215).addBox(0.75F, -22.0F, 0.75F, 0.0F, 20.0F, 6.0F, 0.0F, false);
        right2.texOffs(110, 192).addBox(0.25F, -8.0F, 0.75F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        right2.texOffs(212, 17).addBox(0.25F, -15.0F, 0.75F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        right2.texOffs(214, 115).addBox(0.25F, -22.0F, 0.75F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        right2.texOffs(79, 27).addBox(1.0F, -21.0F, 2.25F, 0.0F, 3.0F, 3.0F, 0.0F, false);
        right2.texOffs(142, 19).addBox(1.0F, -20.0F, 2.75F, 0.0F, 3.0F, 2.0F, 0.0F, false);
        right2.texOffs(3, 242).addBox(0.25F, -20.0F, 1.25F, 1.0F, 2.0F, 0.0F, 0.0F, false);
        right2.texOffs(33, 215).addBox(0.25F, -31.0F, 7.5F, 1.0F, 31.0F, 1.0F, 0.0F, false);

        window4 = new ModelRenderer(this);
        window4.setPos(-8.25F, 1.0F, -0.25F);
        right2.addChild(window4);


        frame4 = new ModelRenderer(this);
        frame4.setPos(0.0F, 0.0F, 0.0F);
        window4.addChild(frame4);
        frame4.texOffs(214, 172).addBox(9.0F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);
        frame4.texOffs(225, 17).addBox(8.5F, -30.0F, 1.0F, 0.0F, 6.0F, 6.0F, 0.0F, false);

        glow5 = new ModelRenderer(this);
        glow5.setPos(0.0F, 0.0F, 0.0F);
        window4.addChild(glow5);
        glow5.texOffs(167, 110).addBox(9.125F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(167, 114).addBox(8.375F, -29.5F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(130, 167).addBox(9.125F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(133, 167).addBox(8.375F, -29.5F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(136, 167).addBox(9.125F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(168, 80).addBox(8.375F, -29.5F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(0, 171).addBox(9.125F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(3, 171).addBox(8.375F, -29.5F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(6, 171).addBox(9.125F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(9, 171).addBox(8.375F, -29.5F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(12, 171).addBox(9.125F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(15, 171).addBox(8.375F, -29.5F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(18, 171).addBox(9.125F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(21, 171).addBox(8.375F, -26.75F, 1.75F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(24, 171).addBox(9.125F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(27, 171).addBox(8.375F, -26.75F, 1.92F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(30, 171).addBox(9.125F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(33, 171).addBox(8.375F, -26.75F, 5.25F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(171, 80).addBox(9.125F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(130, 171).addBox(8.375F, -26.75F, 5.08F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(133, 171).addBox(9.125F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(136, 171).addBox(8.375F, -26.75F, 3.415F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(174, 80).addBox(9.125F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(54, 175).addBox(8.375F, -26.75F, 3.585F, 0.0F, 2.0F, 1.0F, 0.0F, false);
        glow5.texOffs(6, 242).addBox(9.125F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(9, 242).addBox(8.375F, -28.25F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(158, 242).addBox(9.125F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(161, 242).addBox(8.375F, -28.25F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(164, 242).addBox(9.125F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 66).addBox(8.375F, -28.25F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 69).addBox(9.125F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 72).addBox(8.375F, -28.25F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 139).addBox(9.125F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 142).addBox(8.375F, -28.25F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 177).addBox(9.125F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 180).addBox(8.375F, -28.25F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(244, 183).addBox(9.125F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(0, 245).addBox(8.375F, -25.5F, 1.75F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(3, 245).addBox(9.125F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(6, 245).addBox(8.375F, -25.5F, 1.92F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(9, 245).addBox(9.125F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(158, 245).addBox(8.375F, -25.5F, 5.25F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(161, 245).addBox(9.125F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(164, 245).addBox(8.375F, -25.5F, 5.08F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(218, 246).addBox(9.125F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(221, 246).addBox(8.375F, -25.5F, 3.415F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(224, 246).addBox(9.125F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        glow5.texOffs(227, 246).addBox(8.375F, -25.5F, 3.585F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        base = new ModelRenderer(this);
        base.setPos(0.0F, 0.0F, 0.0F);
        BOX.addChild(base);
        base.texOffs(0, 36).addBox(-11.0F, -2.0F, -11.0F, 22.0F, 2.0F, 22.0F, 0.0F, false);

        SUTEKH = new ModelRenderer(this);
        SUTEKH.setPos(0.0F, 24.0F, 0.0F);


        head = new ModelRenderer(this);
        head.setPos(0.0F, -54.0F, -7.0F);
        SUTEKH.addChild(head);
        setRotationAngle(head, 0.4189F, 0.0F, 0.0F);
        head.texOffs(89, 19).addBox(-7.0F, -9.1205F, -12.1962F, 13.0F, 12.0F, 13.0F, 0.0F, false);
        head.texOffs(227, 158).addBox(-6.0F, -13.1205F, -8.1962F, 2.0F, 4.0F, 5.0F, 0.0F, false);
        head.texOffs(227, 168).addBox(3.0F, -13.1205F, -8.1962F, 2.0F, 4.0F, 5.0F, 0.0F, false);
        head.texOffs(208, 30).addBox(-4.0F, -5.1205F, -21.1962F, 7.0F, 8.0F, 9.0F, 0.0F, false);

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, -54.0F, -7.0F);
        SUTEKH.addChild(Body);


        head_r1 = new ModelRenderer(this);
        head_r1.setPos(1.5F, 40.6378F, 21.9398F);
        Body.addChild(head_r1);
        setRotationAngle(head_r1, -0.3491F, 0.0F, 0.0F);
        head_r1.texOffs(41, 188).addBox(-10.5F, -7.0F, -5.5F, 8.0F, 21.0F, 8.0F, -0.99F, false);
        head_r1.texOffs(179, 0).addBox(-1.5F, -7.0F, -5.5F, 8.0F, 21.0F, 8.0F, -0.99F, false);

        head_r2 = new ModelRenderer(this);
        head_r2.setPos(-0.5F, 15.8795F, 21.3038F);
        Body.addChild(head_r2);
        setRotationAngle(head_r2, 0.1309F, 0.0F, 0.0F);
        head_r2.texOffs(77, 61).addBox(-8.5F, -12.0F, -5.5F, 17.0F, 33.0F, 8.0F, -1.0F, false);

        head_r3 = new ModelRenderer(this);
        head_r3.setPos(-0.5F, 2.8795F, 0.3038F);
        Body.addChild(head_r3);
        setRotationAngle(head_r3, -0.3927F, 0.0F, 0.0F);
        head_r3.texOffs(0, 0).addBox(-6.5F, -6.0F, -5.5F, 13.0F, 9.0F, 26.0F, -1.0F, false);

        Arm = new ModelRenderer(this);
        Arm.setPos(0.0F, 0.0F, 0.0F);
        Body.addChild(Arm);


        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(12.536F, 14.5759F, 1.6053F);
        Arm.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.349F, 0.3364F, 0.3385F);
        cube_r1.texOffs(165, 36).addBox(-3.0F, -3.0F, -7.5F, 6.0F, 6.0F, 15.0F, -0.001F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(12.0F, 11.0F, 11.5F);
        Arm.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.3927F, -0.5672F, 0.0F);
        cube_r2.texOffs(164, 84).addBox(-3.0F, -3.0F, -7.5F, 6.0F, 6.0F, 15.0F, 0.0F, false);

        Arm2 = new ModelRenderer(this);
        Arm2.setPos(0.0F, 0.0F, 0.0F);
        Body.addChild(Arm2);


        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-12.536F, 14.5759F, 1.6053F);
        Arm2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.349F, -0.3364F, -0.3385F);
        cube_r3.texOffs(171, 106).addBox(-3.0F, -3.0F, -7.5F, 6.0F, 6.0F, 15.0F, -0.001F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-12.0F, 11.0F, 11.5F);
        Arm2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.3927F, 0.5672F, 0.0F);
        cube_r4.texOffs(165, 58).addBox(-3.0F, -3.0F, -7.5F, 6.0F, 6.0F, 15.0F, 0.0F, false);

        Cloak = new ModelRenderer(this);
        Cloak.setPos(0.0F, -5.1205F, -13.1962F);


        bone = new ModelRenderer(this);
        bone.setPos(0.0F, -20.0F, 23.0F);
        Cloak.addChild(bone);
        setRotationAngle(bone, 0.5236F, 0.0F, 0.0F);
        bone.texOffs(103, 120).addBox(-16.0F, -4.0F, -2.0F, 14.0F, 34.0F, 4.0F, 0.0F, false);
        bone.texOffs(128, 45).addBox(2.0F, -7.0F, -2.0F, 14.0F, 34.0F, 4.0F, 0.0F, false);
        bone.texOffs(0, 85).addBox(-7.0F, -1.0F, -2.0F, 14.0F, 43.0F, 4.0F, 0.01F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-23.9528F, 11.0F, -22.774F);
        bone.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -1.2217F, 0.0F);
        cube_r5.texOffs(74, 188).addBox(9.0F, -14.0F, -3.0F, 7.0F, 28.0F, 4.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-20.5326F, 11.0F, -13.3771F);
        bone.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, -1.2217F, 0.0F);
        cube_r6.texOffs(37, 134).addBox(6.0F, -14.0F, -3.0F, 10.0F, 36.0F, 4.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(25.3209F, 11.0F, -26.5328F);
        bone.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 1.2217F, 0.0F);
        cube_r7.texOffs(208, 48).addBox(-16.0F, -1.0F, -3.0F, 6.0F, 21.0F, 4.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(20.5326F, 11.0F, -13.3771F);
        bone.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 1.2217F, 0.0F);
        cube_r8.texOffs(0, 133).addBox(-16.0F, -13.0F, -3.0F, 14.0F, 33.0F, 4.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        BOX.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        SUTEKH.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Cloak.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
        this.BOX.render(matrixStack, buffer, packedLight, packedOverlay);
        this.SUTEKH.render(matrixStack, buffer, packedLight, packedOverlay);
        this.Cloak.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}