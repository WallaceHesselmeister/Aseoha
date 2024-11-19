package com.code.aseoha.client.models.consoles;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.Helpers.TARDISHelper;
import com.code.aseoha.tileentities.consoles.BlueMarbleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.controls.*;

public class BlueMarbleConsoleModel extends EntityModel<Entity> implements TileModel<BlueMarbleTile> {
    private final ModelRenderer toolbox;
    private final ModelRenderer opener;
    private final ModelRenderer lever1;
    private final ModelRenderer lever0;
    private final ModelRenderer rotorup;
    private final ModelRenderer rotordown;
    private final ModelRenderer octagon2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer octagon_r1;
    private final ModelRenderer octagon_r2;
    private final ModelRenderer octagon_r3;
    private final ModelRenderer octagon_r4;
    private final ModelRenderer octagon_r5;
    private final ModelRenderer pump;
    private final ModelRenderer bone4;
    private final ModelRenderer clocky;
    private final ModelRenderer bone2;
    private final ModelRenderer octagon3;
    private final ModelRenderer octagon_r6;
    private final ModelRenderer octagon_r7;
    private final ModelRenderer octagon_r8;
    private final ModelRenderer octagon_r9;
    private final ModelRenderer octagon;
    private final ModelRenderer cube_r3;
    private final ModelRenderer light4_r1;
    private final ModelRenderer light3_r1;
    private final ModelRenderer cube_r4;
    private final ModelRenderer lightpanel_r1;
    private final ModelRenderer octagon_r10;
    private final ModelRenderer octagon_r11;
    private final ModelRenderer octagon_r12;
    private final ModelRenderer octagon_r13;
    private final ModelRenderer octagon_r14;
    private final ModelRenderer octagon_r15;
    private final ModelRenderer octagon_r16;
    private final ModelRenderer octagon_r17;
    private final ModelRenderer octagon_r18;
    private final ModelRenderer clock;
    private final ModelRenderer bone3;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer bfb;
    private final ModelRenderer cube_r8;
    private final ModelRenderer milr;
    private final ModelRenderer cube_r9;
    private final ModelRenderer bone;
    private final ModelRenderer octagon_r19;
    private final ModelRenderer octagon_r20;
    private final ModelRenderer circuit;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer controls;
    private final ModelRenderer butt1;
    private final ModelRenderer butt2;
    private final ModelRenderer butt3;
    private final ModelRenderer butt4;
    private final ModelRenderer butt8;
    private final ModelRenderer butt7;
    private final ModelRenderer butt7_r1;
    private final ModelRenderer butt5;
    private final ModelRenderer butt5_r1;
    private final ModelRenderer butt9;
    private final ModelRenderer butt6;
    private final ModelRenderer butt6_r1;
    private final ModelRenderer butt12;
    private final ModelRenderer butt11;
    private final ModelRenderer butt10;

    public BlueMarbleConsoleModel() {
        texWidth = 352;
        texHeight = 352;

        toolbox = new ModelRenderer(this);
        toolbox.setPos(-10.0F, 12.429F, 8.0F);
        toolbox.texOffs(112, 257).addBox(32.8584F, -3.6895F, -12.4234F, 2.0F, 3.0F, 9.0F, 0.0F, false);
        toolbox.texOffs(253, 265).addBox(23.8584F, -3.6895F, -3.4239F, 11.0F, 3.0F, 2.0F, 0.0F, false);
        toolbox.texOffs(106, 263).addBox(23.8584F, -3.6895F, -14.3839F, 11.0F, 3.0F, 2.0F, 0.0F, false);
        toolbox.texOffs(0, 120).addBox(23.8884F, -3.6895F, -12.4234F, 2.0F, 3.0F, 9.0F, 0.0F, false);

        opener = new ModelRenderer(this);
        opener.setPos(27.104F, -1.279F, -7.98F);
        toolbox.addChild(opener);


        lever1 = new ModelRenderer(this);
        lever1.setPos(-3.161F, 1.972F, 23.6669F);
        lever1.texOffs(0, 210).addBox(-0.525F, -4.4346F, -0.6309F, 1.0F, 6.0F, 1.0F, -0.15F, false);
        lever1.texOffs(52, 210).addBox(-1.025F, -5.6846F, -1.1309F, 2.0F, 2.0F, 2.0F, -0.2F, false);

        lever0 = new ModelRenderer(this);
        lever0.setPos(3.161F, 1.9691F, 23.536F);
        lever0.texOffs(118, 205).addBox(-0.025F, -4.4375F, -0.5F, 1.0F, 6.0F, 1.0F, -0.15F, false);
        lever0.texOffs(210, 0).addBox(-0.525F, -5.6875F, -1.0F, 2.0F, 2.0F, 2.0F, -0.2F, false);

        rotorup = new ModelRenderer(this);
        rotorup.setPos(0.0F, -33.9636F, 0.0798F);
        rotorup.texOffs(156, 265).addBox(-4.9471F, 0.6583F, -4.9028F, 10.0F, 3.0F, 10.0F, 0.0F, false);
        rotorup.texOffs(268, 208).addBox(-4.9471F, -4.0917F, -4.9028F, 10.0F, 3.0F, 10.0F, 0.0F, false);
        rotorup.texOffs(0, 106).addBox(-4.9471F, -1.2417F, -2.9028F, 10.0F, 2.0F, 6.0F, 0.0F, false);
        rotorup.texOffs(52, 205).addBox(-3.0972F, -1.2417F, -4.9529F, 6.0F, 2.0F, 10.0F, 0.0F, false);

        rotordown = new ModelRenderer(this);
        rotordown.setPos(0.0F, -16.9636F, 0.0798F);
        rotordown.texOffs(125, 261).addBox(-4.9471F, 0.6583F, -4.9028F, 10.0F, 3.0F, 10.0F, 0.0F, false);
        rotordown.texOffs(58, 261).addBox(-4.9471F, -4.0917F, -4.9028F, 10.0F, 3.0F, 10.0F, 0.0F, false);
        rotordown.texOffs(0, 46).addBox(-4.9471F, -1.2417F, -2.9028F, 10.0F, 2.0F, 6.0F, 0.0F, false);
        rotordown.texOffs(123, 187).addBox(-3.0972F, -1.2417F, -4.9529F, 6.0F, 2.0F, 10.0F, 0.0F, false);

        octagon2 = new ModelRenderer(this);
        octagon2.setPos(-25.536F, 22.0316F, 25.536F);
        octagon2.texOffs(139, 100).addBox(15.3924F, -18.2416F, -20.7644F, 21.0F, 6.0F, 20.0F, 0.0F, false);
        octagon2.texOffs(144, 105).addBox(15.3924F, -18.2416F, -51.4629F, 21.0F, 6.0F, 15.0F, 0.0F, false);
        octagon2.texOffs(202, 0).addBox(0.5432F, -18.2416F, -36.6136F, 23.0F, 6.0F, 21.0F, 0.0F, false);
        octagon2.texOffs(232, 0).addBox(30.2417F, -18.2416F, -36.6136F, 21.0F, 6.0F, 21.0F, 0.0F, false);
        octagon2.texOffs(0, 133).addBox(35.318F, -25.7416F, -41.6085F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(0, 120).addBox(44.0912F, -25.7416F, -41.6792F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(103, 0).addBox(39.74F, -25.7416F, -37.2572F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(103, 18).addBox(39.6693F, -25.7416F, -46.0304F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(147, 24).addBox(43.5912F, -27.6416F, -41.6792F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(202, 16).addBox(39.74F, -27.6416F, -38.0072F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(203, 177).addBox(36.068F, -27.6416F, -41.6085F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(0, 205).addBox(39.6693F, -27.6416F, -45.5304F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(45, 8).addBox(52.0F, -17.6F, -32.65F, 2.0F, 4.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(45, 23).addBox(53.0F, -17.1F, -32.65F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(80, 160).addBox(52.0F, -16.975F, -33.125F, 2.0F, 3.0F, 4.0F, 0.0F, false);
        octagon2.texOffs(126, 110).addBox(-0.9F, -18.75F, -31.036F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(39, 91).addBox(49.072F, -18.75F, -24.072F, 3.0F, 2.0F, 5.0F, 0.0F, false);
        octagon2.texOffs(161, 0).addBox(51.072F, -17.75F, -16.272F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        octagon2.texOffs(34, 160).addBox(51.072F, -18.5F, -16.272F, 2.0F, 1.0F, 2.0F, -0.2F, false);
        octagon2.texOffs(95, 120).addBox(-0.9F, -18.75F, -23.036F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(82, 120).addBox(-0.9F, -18.75F, -27.036F, 3.0F, 2.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(203, 157).addBox(2.4F, -20.0F, -36.45F, 3.0F, 4.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(139, 110).addBox(2.4F, -19.25F, -39.475F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(2, 107).addBox(4.55F, -19.5F, -38.475F, 1.0F, 3.0F, 1.0F, -0.2F, false);
        octagon2.texOffs(2, 107).addBox(2.15F, -19.5F, -38.475F, 1.0F, 3.0F, 1.0F, -0.2F, false);
        octagon2.texOffs(13, 120).addBox(3.4F, -19.5F, -37.225F, 1.0F, 3.0F, 1.0F, -0.2F, false);
        octagon2.texOffs(26, 120).addBox(3.3F, -19.5F, -39.625F, 1.0F, 3.0F, 1.0F, -0.2F, false);
        octagon2.texOffs(161, 126).addBox(2.4F, -20.0F, -40.45F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(202, 54).addBox(1.4F, -20.0F, -39.45F, 1.0F, 2.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(148, 76).addBox(5.4F, -20.0F, -39.45F, 1.0F, 4.0F, 3.0F, 0.0F, false);
        octagon2.texOffs(33, 52).addBox(10.0F, -20.0F, -45.0F, 7.0F, 2.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(147, 7).addBox(13.0F, -22.0F, -45.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(9, 161).addBox(14.0F, -21.0F, -46.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(45, 42).addBox(10.0F, -19.0F, -46.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(134, 76).addBox(13.0F, -22.0F, -47.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        octagon2.texOffs(31, 120).addBox(10.0F, -20.0F, -47.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(46.572F, -10.875F, -27.072F);
        octagon2.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
        cube_r1.texOffs(131, 319).addBox(-13.85F, -13.475F, -6.35F, 16.0F, 16.0F, 16.0F, -6.3F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(46.572F, -19.875F, -17.572F);
        octagon2.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
        cube_r2.texOffs(152, 110).addBox(-0.75F, -0.875F, -6.25F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(140, 209).addBox(-0.75F, -0.875F, -10.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(131, 319).addBox(-8.0F, -7.375F, -21.0F, 16.0F, 16.0F, 16.0F, -6.5F, false);
        cube_r2.texOffs(131, 319).addBox(-8.0F, -7.175F, -11.0F, 16.0F, 16.0F, 16.0F, -6.5F, false);

        octagon_r1 = new ModelRenderer(this);
        octagon_r1.setPos(25.536F, -30.605F, -25.536F);
        octagon2.addChild(octagon_r1);
        setRotationAngle(octagon_r1, 0.0F, -0.7854F, 0.0F);
        octagon_r1.texOffs(177, 209).addBox(-3.3436F, 7.8634F, -25.2269F, 7.0F, 5.0F, 7.0F, 0.0F, false);
        octagon_r1.texOffs(269, 268).addBox(-4.3436F, 9.8634F, -26.2269F, 9.0F, 5.0F, 9.0F, 0.0F, false);

        octagon_r2 = new ModelRenderer(this);
        octagon_r2.setPos(25.728F, -25.605F, -26.1704F);
        octagon2.addChild(octagon_r2);
        setRotationAngle(octagon_r2, 0.0F, -0.7854F, 0.0F);
        octagon_r2.texOffs(148, 109).addBox(-10.3436F, 7.3634F, 14.2731F, 21.0F, 6.0F, 11.0F, 0.0F, false);

        octagon_r3 = new ModelRenderer(this);
        octagon_r3.setPos(25.5148F, -25.605F, -25.9572F);
        octagon2.addChild(octagon_r3);
        setRotationAngle(octagon_r3, 0.0F, -0.7854F, 0.0F);
        octagon_r3.texOffs(136, 37).addBox(-10.3436F, 7.3634F, -25.7269F, 21.0F, 6.0F, 23.0F, 0.0F, false);

        octagon_r4 = new ModelRenderer(this);
        octagon_r4.setPos(25.5148F, -25.105F, -26.2701F);
        octagon2.addChild(octagon_r4);
        setRotationAngle(octagon_r4, 0.0F, -0.7854F, 0.0F);
        octagon_r4.texOffs(231, 27).addBox(3.7269F, 6.8634F, -10.6564F, 22.0F, 6.0F, 21.0F, 0.0F, false);

        octagon_r5 = new ModelRenderer(this);
        octagon_r5.setPos(25.728F, -25.105F, -26.0569F);
        octagon2.addChild(octagon_r5);
        setRotationAngle(octagon_r5, 0.0F, -0.7854F, 0.0F);
        octagon_r5.texOffs(202, 0).addBox(-25.2731F, 6.8634F, -10.6564F, 31.0F, 6.0F, 21.0F, 0.0F, false);

        pump = new ModelRenderer(this);
        pump.setPos(55.25F, -15.5F, -31.125F);
        octagon2.addChild(pump);
        pump.texOffs(45, 16).addBox(1.75F, -1.6F, -1.275F, 2.0F, 3.0F, 3.0F, 0.0F, false);
        pump.texOffs(103, 110).addBox(-7.25F, -1.1F, -1.025F, 9.0F, 2.0F, 2.0F, 0.0F, false);

        bone4 = new ModelRenderer(this);
        bone4.setPos(51.072F, -16.75F, -30.572F);
        octagon2.addChild(bone4);
        bone4.texOffs(39, 83).addBox(-2.0F, -2.0F, -1.5F, 3.0F, 2.0F, 5.0F, 0.0F, false);

        clocky = new ModelRenderer(this);
        clocky.setPos(3.9875F, -18.1F, -38.0875F);
        octagon2.addChild(clocky);
        clocky.texOffs(198, 343).addBox(-1.5875F, -3.0F, -1.1375F, 3.0F, 4.0F, 4.0F, -1.3F, false);

        bone2 = new ModelRenderer(this);
        bone2.setPos(44.114F, -15.0F, -7.1151F);
        octagon2.addChild(bone2);


        octagon3 = new ModelRenderer(this);
        octagon3.setPos(-25.536F, 22.0316F, 25.536F);
        octagon3.texOffs(30, 90).addBox(14.1515F, -17.094F, -24.0514F, 23.0F, 3.0F, 26.0F, 0.0F, false);
        octagon3.texOffs(41, 101).addBox(14.1515F, -17.094F, -53.5783F, 23.0F, 3.0F, 15.0F, 0.0F, false);
        octagon3.texOffs(38, 126).addBox(35.415F, -17.094F, -37.3148F, 18.0F, 3.0F, 23.0F, 0.0F, false);
        octagon3.texOffs(0, 126).addBox(-2.112F, -17.094F, -37.3148F, 20.0F, 3.0F, 23.0F, 0.0F, false);

        octagon_r6 = new ModelRenderer(this);
        octagon_r6.setPos(25.7072F, -26.5192F, -26.0339F);
        octagon3.addChild(octagon_r6);
        setRotationAngle(octagon_r6, 0.0F, -0.7854F, 0.0F);
        octagon_r6.texOffs(36, 36).addBox(-11.3845F, 9.4251F, 7.9577F, 23.0F, 3.0F, 20.0F, 0.0F, false);

        octagon_r7 = new ModelRenderer(this);
        octagon_r7.setPos(25.3727F, -26.5192F, -25.6993F);
        octagon3.addChild(octagon_r7);
        setRotationAngle(octagon_r7, 0.0F, -0.7854F, 0.0F);
        octagon_r7.texOffs(28, 28).addBox(-11.3845F, 9.4251F, -28.0423F, 23.0F, 3.0F, 28.0F, 0.0F, false);

        octagon_r8 = new ModelRenderer(this);
        octagon_r8.setPos(25.7072F, -26.5192F, -25.5958F);
        octagon3.addChild(octagon_r8);
        setRotationAngle(octagon_r8, 0.0F, -0.7854F, 0.0F);
        octagon_r8.texOffs(136, 130).addBox(-27.9577F, 9.4251F, -11.6155F, 11.0F, 3.0F, 23.0F, 0.0F, false);

        octagon_r9 = new ModelRenderer(this);
        octagon_r9.setPos(25.3727F, -26.5192F, -25.9303F);
        octagon3.addChild(octagon_r9);
        setRotationAngle(octagon_r9, 0.0F, -0.7854F, 0.0F);
        octagon_r9.texOffs(170, 130).addBox(6.0423F, 9.4251F, -11.6155F, 22.0F, 3.0F, 23.0F, 0.0F, false);

        octagon = new ModelRenderer(this);
        octagon.setPos(-25.536F, 22.0316F, 25.536F);
        octagon.texOffs(123, 157).addBox(16.3808F, -19.9249F, -46.8893F, 18.0F, 8.0F, 43.0F, 0.0F, false);
        octagon.texOffs(0, 153).addBox(16.4208F, -22.3289F, -47.3893F, 2.0F, 12.0F, 18.0F, 0.002F, false);
        octagon.texOffs(278, 225).addBox(15.6708F, -31.3289F, -26.1393F, 2.0F, 8.0F, 2.0F, 0.0F, false);
        octagon.texOffs(26, 250).addBox(13.1958F, -36.3289F, -32.1393F, 1.0F, 8.0F, 14.0F, 0.0F, false);
        octagon.texOffs(28, 252).addBox(12.1958F, -29.3289F, -31.1393F, 1.0F, 1.0F, 12.0F, 0.0F, false);
        octagon.texOffs(39, 263).addBox(12.1958F, -36.3289F, -32.1393F, 1.0F, 8.0F, 1.0F, 0.0F, false);
        octagon.texOffs(28, 252).addBox(12.1958F, -36.3289F, -31.1393F, 1.0F, 1.0F, 12.0F, 0.0F, false);
        octagon.texOffs(39, 263).addBox(12.1958F, -36.3289F, -19.1393F, 1.0F, 8.0F, 1.0F, 0.0F, false);
        octagon.texOffs(203, 157).addBox(12.6458F, -35.2789F, -31.1893F, 1.0F, 6.0F, 12.0F, 0.0F, false);
        octagon.texOffs(208, 6).addBox(13.9208F, -32.3289F, -26.1393F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(229, 192).addBox(16.4208F, -22.3289F, -20.4533F, 2.0F, 12.0F, 17.0F, 0.001F, false);
        octagon.texOffs(0, 322).addBox(32.3808F, -22.3289F, -47.3893F, 2.0F, 12.0F, 18.0F, 0.001F, false);
        octagon.texOffs(237, 236).addBox(16.4208F, -19.6249F, -52.4753F, 2.0F, 8.0F, 17.0F, 0.0F, false);
        octagon.texOffs(45, 327).addBox(32.3808F, -19.6249F, -52.4753F, 2.0F, 8.0F, 17.0F, 0.0F, false);
        octagon.texOffs(96, 230).addBox(32.3808F, -19.6249F, -15.7673F, 2.0F, 8.0F, 17.0F, 0.0F, false);
        octagon.texOffs(135, 230).addBox(16.4208F, -19.6249F, -15.7673F, 2.0F, 8.0F, 17.0F, 0.0F, false);
        octagon.texOffs(237, 262).addBox(35.4753F, -19.6249F, -34.3808F, 17.0F, 8.0F, 2.0F, 0.0F, false);
        octagon.texOffs(203, 189).addBox(35.4753F, -19.6249F, -18.4208F, 17.0F, 8.0F, 2.0F, 0.0F, false);
        octagon.texOffs(253, 54).addBox(-1.2327F, -19.7249F, -18.4208F, 17.0F, 8.0F, 2.0F, 0.0F, false);
        octagon.texOffs(272, 134).addBox(-1.2327F, -19.6249F, -34.3808F, 17.0F, 8.0F, 2.0F, 0.0F, false);
        octagon.texOffs(215, 223).addBox(32.3808F, -22.3289F, -20.7533F, 2.0F, 12.0F, 17.0F, 0.002F, false);
        octagon.texOffs(94, 256).addBox(3.3533F, -22.3289F, -18.4208F, 18.0F, 12.0F, 2.0F, 0.002F, false);
        octagon.texOffs(259, 222).addBox(3.3533F, -22.3289F, -34.3808F, 18.0F, 12.0F, 2.0F, 0.001F, false);
        octagon.texOffs(103, 93).addBox(19.006F, -32.3889F, -31.907F, 13.0F, 3.0F, 13.0F, -0.37F, false);
        octagon.texOffs(103, 36).addBox(18.8869F, -66.2889F, -31.907F, 13.0F, 3.0F, 13.0F, 0.0F, false);
        octagon.texOffs(0, 205).addBox(16.9869F, -30.4777F, -33.907F, 17.0F, 15.0F, 17.0F, -0.5F, false);
        octagon.texOffs(80, 153).addBox(16.8869F, -82.1889F, -33.907F, 17.0F, 16.0F, 17.0F, 0.0F, false);
        octagon.texOffs(0, 0).addBox(20.0889F, -64.3369F, -31.109F, 11.0F, 34.0F, 11.0F, 0.0F, false);
        octagon.texOffs(197, 272).addBox(20.8389F, -64.0869F, -29.609F, 4.0F, 33.0F, 3.0F, 0.0F, false);
        octagon.texOffs(99, 271).addBox(25.5889F, -64.0869F, -29.609F, 4.0F, 33.0F, 3.0F, 0.0F, false);
        octagon.texOffs(149, 157).addBox(25.5889F, -64.0869F, -24.609F, 4.0F, 33.0F, 3.0F, 0.0F, false);
        octagon.texOffs(0, 264).addBox(20.8389F, -64.0869F, -24.609F, 4.0F, 33.0F, 3.0F, 0.0F, false);
        octagon.texOffs(134, 209).addBox(18.6849F, -25.9049F, -32.705F, 14.0F, 6.0F, 14.0F, 0.0F, false);
        octagon.texOffs(69, 205).addBox(17.4829F, -27.8949F, -33.503F, 16.0F, 8.0F, 16.0F, 0.0F, false);
        octagon.texOffs(259, 237).addBox(29.3893F, -22.3289F, -18.4208F, 18.0F, 12.0F, 2.0F, 0.001F, false);
        octagon.texOffs(237, 262).addBox(29.3893F, -22.3289F, -34.3808F, 18.0F, 12.0F, 2.0F, 0.002F, false);
        octagon.texOffs(157, 239).addBox(28.4358F, -19.7229F, -43.5604F, 2.0F, 7.0F, 17.0F, 0.0F, false);
        octagon.texOffs(202, 66).addBox(3.8893F, -19.9249F, -34.3808F, 43.0F, 8.0F, 18.0F, 0.0F, false);
        octagon.texOffs(272, 120).addBox(41.9969F, -12.1826F, -31.2349F, 6.0F, 1.0F, 12.0F, 0.0F, false);
        octagon.texOffs(103, 66).addBox(30.104F, -13.084F, -32.718F, 8.0F, 12.0F, 14.0F, 0.0F, false);
        octagon.texOffs(55, 230).addBox(13.104F, -13.084F, -32.618F, 6.0F, 12.0F, 14.0F, 0.0F, false);
        octagon.texOffs(203, 157).addBox(11.102F, -1.392F, -40.102F, 29.0F, 2.0F, 29.0F, 0.0F, false);
        octagon.texOffs(196, 253).addBox(18.718F, -13.084F, -19.104F, 14.0F, 12.0F, 6.0F, 0.0F, false);
        octagon.texOffs(251, 189).addBox(18.718F, -13.084F, -38.104F, 14.0F, 12.0F, 6.0F, 0.0F, false);
        octagon.texOffs(75, 210).addBox(20.0F, -18.9874F, -0.409F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(143, 88).addBox(20.0F, -21.8159F, -6.2374F, 2.0F, 4.0F, 5.0F, 0.0F, false);
        octagon.texOffs(118, 209).addBox(21.5F, -19.5F, -4.5F, 8.0F, 4.0F, 5.0F, 0.0F, false);
        octagon.texOffs(209, 105).addBox(19.5F, -18.0F, -53.572F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(103, 101).addBox(23.411F, -22.5F, -45.322F, 4.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(202, 75).addBox(24.411F, -26.25F, -45.322F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        octagon.texOffs(103, 44).addBox(23.411F, -28.3F, -45.322F, 4.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(202, 66).addBox(22.461F, -33.5F, -45.322F, 1.0F, 6.0F, 2.0F, 0.0F, false);
        octagon.texOffs(103, 36).addBox(23.361F, -33.25F, -45.072F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        octagon.texOffs(10, 93).addBox(26.411F, -33.25F, -45.072F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        octagon.texOffs(202, 35).addBox(27.361F, -33.5F, -45.322F, 1.0F, 6.0F, 2.0F, 0.0F, false);
        octagon.texOffs(80, 187).addBox(24.411F, -22.5F, -46.322F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        octagon.texOffs(209, 71).addBox(22.5F, -18.0F, -53.572F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(209, 33).addBox(25.5F, -18.0F, -53.572F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(132, 164).addBox(28.5F, -18.0F, -53.572F, 4.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(202, 100).addBox(21.7F, -20.5F, -3.65F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        octagon.texOffs(202, 27).addBox(22.7F, -21.5F, -3.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);
        octagon.texOffs(199, 209).addBox(29.572F, -18.9874F, -0.409F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        octagon.texOffs(202, 8).addBox(27.822F, -21.5F, -3.5F, 1.0F, 4.0F, 3.0F, 0.0F, false);
        octagon.texOffs(202, 93).addBox(28.822F, -20.5F, -3.75F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        octagon.texOffs(143, 36).addBox(29.572F, -21.8159F, -6.2374F, 2.0F, 4.0F, 5.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(30.072F, -17.75F, 0.0F);
        octagon.addChild(cube_r3);
        setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
        cube_r3.texOffs(0, 161).addBox(-0.5F, -2.0F, -3.75F, 2.0F, 3.0F, 4.0F, 0.0F, false);
        cube_r3.texOffs(166, 0).addBox(-10.072F, -2.0F, -3.75F, 2.0F, 3.0F, 4.0F, 0.0F, false);

        light4_r1 = new ModelRenderer(this);
        light4_r1.setPos(31.5F, -17.0F, -48.822F);
        octagon.addChild(light4_r1);
        setRotationAngle(light4_r1, 0.7854F, 0.0F, 0.0F);
        light4_r1.texOffs(111, 66).addBox(-0.75F, -3.0F, -0.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        light4_r1.texOffs(92, 120).addBox(-11.5F, -3.0F, -0.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        light3_r1 = new ModelRenderer(this);
        light3_r1.setPos(31.5F, -18.75F, -47.322F);
        octagon.addChild(light3_r1);
        setRotationAngle(light3_r1, 0.7854F, 0.0F, 0.0F);
        light3_r1.texOffs(111, 36).addBox(-0.75F, -3.0F, -0.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        light3_r1.texOffs(123, 53).addBox(-11.5F, -3.0F, -0.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(31.5F, -17.5F, -47.822F);
        octagon.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
        cube_r4.texOffs(0, 60).addBox(-1.25F, -3.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);
        cube_r4.texOffs(0, 83).addBox(-12.0F, -3.0F, -2.0F, 2.0F, 4.0F, 5.0F, 0.0F, false);
        cube_r4.texOffs(48, 120).addBox(-9.25F, -3.0F, -2.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(192, 0).addBox(-3.25F, -3.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
        cube_r4.texOffs(201, 0).addBox(-9.25F, -3.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
        cube_r4.texOffs(65, 120).addBox(-9.25F, -3.0F, 2.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);

        lightpanel_r1 = new ModelRenderer(this);
        lightpanel_r1.setPos(24.5F, -18.0F, -48.322F);
        octagon.addChild(lightpanel_r1);
        setRotationAngle(lightpanel_r1, 0.7854F, 0.0F, 0.0F);
        lightpanel_r1.texOffs(80, 153).addBox(-1.25F, -3.5F, -1.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);

        octagon_r10 = new ModelRenderer(this);
        octagon_r10.setPos(25.536F, -28.9855F, -25.536F);
        octagon.addChild(octagon_r10);
        setRotationAngle(octagon_r10, 0.0F, -0.7854F, 0.0F);
        octagon_r10.texOffs(0, 153).addBox(-9.1552F, 9.0607F, -21.3533F, 18.0F, 8.0F, 43.0F, 0.0F, false);
        octagon_r10.texOffs(202, 93).addBox(-21.6467F, 9.0607F, -8.8448F, 43.0F, 8.0F, 18.0F, 0.0F, false);

        octagon_r11 = new ModelRenderer(this);
        octagon_r11.setPos(25.536F, -21.7209F, -25.536F);
        octagon.addChild(octagon_r11);
        setRotationAngle(octagon_r11, -0.7854F, 0.0F, 0.0F);
        octagon_r11.texOffs(103, 18).addBox(-8.033F, -9.912F, 1.5116F, 16.0F, 6.0F, 11.0F, 0.0F, false);

        octagon_r12 = new ModelRenderer(this);
        octagon_r12.setPos(25.536F, -21.7209F, -25.536F);
        octagon.addChild(octagon_r12);
        setRotationAngle(octagon_r12, 0.7854F, 0.0F, 0.0F);
        octagon_r12.texOffs(103, 0).addBox(-7.8734F, -9.912F, -12.2063F, 16.0F, 6.0F, 11.0F, 0.0F, false);

        octagon_r13 = new ModelRenderer(this);
        octagon_r13.setPos(15.836F, -23.8422F, -25.6158F);
        octagon.addChild(octagon_r13);
        setRotationAngle(octagon_r13, 0.0F, 0.0F, -0.7854F);
        octagon_r13.texOffs(0, 60).addBox(-7.1527F, -1.5531F, -8.0468F, 11.0F, 6.0F, 16.0F, 0.0F, false);

        octagon_r14 = new ModelRenderer(this);
        octagon_r14.setPos(41.136F, -21.3422F, -11.0562F);
        octagon.addChild(octagon_r14);
        setRotationAngle(octagon_r14, 0.0F, -0.7854F, 0.0F);
        octagon_r14.texOffs(34, 0).addBox(0.8473F, 2.4469F, -1.6468F, 5.0F, 2.0F, 5.0F, 0.0F, false);

        octagon_r15 = new ModelRenderer(this);
        octagon_r15.setPos(39.586F, -31.8422F, -12.6062F);
        octagon.addChild(octagon_r15);
        setRotationAngle(octagon_r15, 0.0F, -0.7854F, 0.0F);
        octagon_r15.texOffs(215, 346).addBox(2.5973F, 1.7469F, -0.6468F, 4.0F, 3.0F, 3.0F, -0.4F, false);

        octagon_r16 = new ModelRenderer(this);
        octagon_r16.setPos(38.886F, -29.8422F, -13.3062F);
        octagon.addChild(octagon_r16);
        setRotationAngle(octagon_r16, 0.0F, -0.7854F, 0.0F);
        octagon_r16.texOffs(156, 194).addBox(2.0973F, 1.8469F, -0.1468F, 2.0F, 1.0F, 2.0F, 0.0001F, false);
        octagon_r16.texOffs(156, 194).addBox(2.0973F, 2.2469F, -0.1468F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        octagon_r17 = new ModelRenderer(this);
        octagon_r17.setPos(38.136F, -25.0922F, -14.0562F);
        octagon.addChild(octagon_r17);
        setRotationAngle(octagon_r17, 0.0F, -0.7854F, 0.0F);
        octagon_r17.texOffs(14, 133).addBox(2.3473F, -0.5531F, -0.1468F, 2.0F, 5.0F, 2.0F, 0.0F, false);
        octagon_r17.texOffs(179, 0).addBox(1.8473F, 4.1969F, -0.6468F, 3.0F, 3.0F, 3.0F, 0.0F, false);

        octagon_r18 = new ModelRenderer(this);
        octagon_r18.setPos(35.236F, -23.8422F, -25.4562F);
        octagon.addChild(octagon_r18);
        setRotationAngle(octagon_r18, 0.0F, 0.0F, 0.7854F);
        octagon_r18.texOffs(0, 83).addBox(-4.1527F, -1.5531F, -8.0468F, 11.0F, 6.0F, 16.0F, 0.0F, false);

        clock = new ModelRenderer(this);
        clock.setPos(25.3539F, -32.8205F, -44.6434F);
        octagon.addChild(clock);
        setRotationAngle(clock, 3.1416F, 0.0F, 0.0F);
        clock.texOffs(89, 337).addBox(-1.3429F, -2.5143F, -1.0214F, 1.0F, 5.0F, 2.0F, -0.3F, false);
        clock.texOffs(88, 337).addBox(-1.0179F, 1.4857F, -1.0214F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        clock.texOffs(90, 336).addBox(-0.9679F, -2.5143F, -1.0214F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        clock.texOffs(51, 36).addBox(-0.4929F, -1.0143F, -0.4714F, 1.0F, 2.0F, 1.0F, -0.1F, false);
        clock.texOffs(39, 91).addBox(-0.5179F, -1.7643F, -0.4714F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        clock.texOffs(88, 337).addBox(0.3571F, -2.5143F, -1.0214F, 1.0F, 5.0F, 2.0F, -0.3F, false);
        clock.texOffs(51, 91).addBox(-0.5179F, 0.8357F, -0.4714F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        bone3 = new ModelRenderer(this);
        bone3.setPos(-14.75F, 4.5F, 20.25F);


        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.0F, 0.0F, 0.0F);
        bone3.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
        cube_r5.texOffs(137, 133).addBox(-2.55F, -1.0F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r5.texOffs(23, 153).addBox(-2.55F, -3.0F, -0.05F, 5.0F, 3.0F, 3.0F, -0.2F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-3.0F, -1.0F, -2.9F);
        bone3.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
        cube_r6.texOffs(135, 67).addBox(-1.95F, -1.0F, -2.7F, 5.0F, 3.0F, 5.0F, -0.1F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(-8.0F, 0.0F, -9.0F);
        bone3.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.7854F, 0.0F);
        cube_r7.texOffs(136, 140).addBox(-3.25F, -1.0F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
        cube_r7.texOffs(39, 69).addBox(-3.25F, -3.0F, -0.05F, 5.0F, 3.0F, 3.0F, -0.2F, false);

        bfb = new ModelRenderer(this);
        bfb.setPos(-17.75F, -0.5F, 17.25F);


        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.0F, 0.0F, 0.0F);
        bfb.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
        cube_r8.texOffs(136, 126).addBox(-2.05F, 1.5F, -2.6F, 5.0F, 1.0F, 5.0F, -0.2F, false);
        cube_r8.texOffs(148, 1).addBox(-1.6F, 0.9F, -2.05F, 4.0F, 1.0F, 4.0F, -0.2F, false);
        cube_r8.texOffs(132, 157).addBox(-1.55F, 2.0F, -2.0F, 4.0F, 2.0F, 4.0F, -0.2F, false);

        milr = new ModelRenderer(this);
        milr.setPos(-12.036F, 2.7816F, -19.964F);
        setRotationAngle(milr, 0.0F, 0.0F, -0.0873F);


        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(0.0F, 0.0F, 0.0F);
        milr.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, 0.3927F);
        cube_r9.texOffs(93, 187).addBox(-1.25F, -7.5F, -1.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);
        cube_r9.texOffs(103, 60).addBox(-0.5F, -5.75F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

        bone = new ModelRenderer(this);
        bone.setPos(17.2241F, -5.0939F, 17.4705F);


        octagon_r19 = new ModelRenderer(this);
        octagon_r19.setPos(-1.7241F, -2.7167F, -3.1407F);
        bone.addChild(octagon_r19);
        setRotationAngle(octagon_r19, 0.0F, -0.7854F, 0.0F);
        octagon_r19.texOffs(52, 205).addBox(2.2473F, 1.2469F, -0.0968F, 2.0F, 3.0F, 2.0F, -0.3F, false);

        octagon_r20 = new ModelRenderer(this);
        octagon_r20.setPos(-1.9241F, 1.5333F, -3.2907F);
        bone.addChild(octagon_r20);
        setRotationAngle(octagon_r20, 0.0F, -0.7854F, 0.0F);
        octagon_r20.texOffs(14, 120).addBox(1.4473F, 3.4469F, -1.1468F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        octagon_r20.texOffs(103, 93).addBox(1.9473F, -0.3031F, -0.6468F, 3.0F, 4.0F, 3.0F, 0.0F, false);

        circuit = new ModelRenderer(this);
        circuit.setPos(0.0F, 24.0F, 0.0F);
        circuit.texOffs(321, 328).addBox(17.04F, -10.665F, -3.09F, 4.0F, 1.0F, 5.0F, -1.4F, false);
        circuit.texOffs(321, 328).addBox(17.44F, -10.665F, -3.09F, 4.0F, 1.0F, 5.0F, -1.4F, false);
        circuit.texOffs(329, 337).addBox(19.2F, -11.075F, -2.11F, 2.0F, 2.0F, 4.0F, -0.6F, false);
        circuit.texOffs(335, 344).addBox(17.815F, -11.405F, 0.95F, 1.0F, 2.0F, 2.0F, -0.27F, false);
        circuit.texOffs(348, 332).addBox(18.76F, -10.455F, 1.315F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        circuit.texOffs(332, 347).addBox(18.77F, -10.675F, 1.515F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        circuit.texOffs(321, 331).addBox(18.21F, -10.055F, -1.84F, 0.0F, 1.0F, 2.0F, -0.2F, false);
        circuit.texOffs(321, 332).addBox(18.19F, -10.055F, -1.81F, 2.0F, 1.0F, 0.0F, -0.2F, false);
        circuit.texOffs(331, 324).addBox(18.29F, -10.675F, -2.38F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        circuit.texOffs(337, 337).addBox(19.2F, -11.075F, -2.66F, 2.0F, 2.0F, 2.0F, -0.6F, false);
        circuit.texOffs(321, 334).addBox(17.3F, -11.075F, -2.11F, 2.0F, 2.0F, 4.0F, -0.6F, false);
        circuit.texOffs(331, 320).addBox(17.3F, -11.075F, -2.66F, 2.0F, 2.0F, 2.0F, -0.6F, false);
        circuit.texOffs(321, 320).addBox(19.715F, -11.405F, 0.95F, 1.0F, 2.0F, 2.0F, -0.27F, false);
        circuit.texOffs(321, 320).addBox(19.29F, -10.055F, -1.81F, 1.0F, 1.0F, 0.0F, -0.2001F, false);
        circuit.texOffs(321, 331).addBox(18.21F, -10.055F, -0.34F, 0.0F, 1.0F, 1.0F, -0.2F, false);
        circuit.texOffs(321, 331).addBox(20.26F, -10.055F, -1.84F, 0.0F, 1.0F, 2.0F, -0.2F, false);
        circuit.texOffs(321, 320).addBox(20.26F, -10.055F, -0.34F, 0.0F, 1.0F, 1.0F, -0.2001F, false);
        circuit.texOffs(321, 320).addBox(19.29F, -10.055F, 0.59F, 1.0F, 1.0F, 0.0F, -0.2001F, false);
        circuit.texOffs(321, 332).addBox(18.19F, -10.055F, 0.59F, 2.0F, 1.0F, 0.0F, -0.2F, false);
        circuit.texOffs(329, 343).addBox(18.227F, -10.885F, 0.827F, 2.0F, 1.0F, 2.0F, -0.2F, false);
        circuit.texOffs(321, 324).addBox(18.09F, -10.885F, 0.065F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        circuit.texOffs(348, 325).addBox(18.77F, -10.675F, 1.115F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        circuit.texOffs(334, 330).addBox(19.825F, -12.095F, -2.48F, 1.0F, 2.0F, 5.0F, 0.0F, false);
        circuit.texOffs(321, 320).addBox(18.19F, -12.095F, -2.9F, 2.0F, 2.0F, 6.0F, 0.0F, false);
        circuit.texOffs(334, 323).addBox(17.41F, -12.095F, -2.48F, 1.0F, 2.0F, 5.0F, 0.0F, false);
        circuit.texOffs(329, 346).addBox(16.76F, -11.625F, 1.41F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        circuit.texOffs(341, 344).addBox(15.94F, -13.465F, 1.41F, 1.0F, 2.0F, 1.0F, -0.05F, false);
        circuit.texOffs(345, 339).addBox(15.94F, -13.465F, -0.27F, 1.0F, 2.0F, 1.0F, -0.05F, false);
        circuit.texOffs(325, 346).addBox(16.78F, -11.625F, -0.27F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        circuit.texOffs(321, 343).addBox(15.45F, -13.825F, -2.46F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        circuit.texOffs(329, 334).addBox(15.94F, -13.465F, -1.95F, 1.0F, 2.0F, 1.0F, -0.05F, false);
        circuit.texOffs(347, 322).addBox(16.78F, -11.625F, -1.95F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        circuit.texOffs(321, 346).addBox(17.14F, -11.62F, -1.955F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        circuit.texOffs(346, 328).addBox(17.14F, -11.62F, 1.405F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        circuit.texOffs(345, 333).addBox(17.14F, -11.62F, -0.275F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        circuit.texOffs(339, 341).addBox(15.45F, -13.825F, -0.76F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        circuit.texOffs(341, 330).addBox(15.45F, -13.825F, 0.94F, 2.0F, 1.0F, 2.0F, -0.3F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(17.04F, -12.2225F, 0.24F);
        circuit.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 3.1416F, 0.0F);
        cube_r10.texOffs(337, 320).addBox(-4.38F, 0.5975F, 1.17F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        cube_r10.texOffs(321, 328).addBox(-5.2F, -1.2425F, 1.17F, 1.0F, 2.0F, 1.0F, -0.05F, false);
        cube_r10.texOffs(334, 330).addBox(-5.2F, -1.2425F, -0.51F, 1.0F, 2.0F, 1.0F, -0.05F, false);
        cube_r10.texOffs(341, 326).addBox(-4.36F, 0.5975F, -0.51F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        cube_r10.texOffs(339, 320).addBox(-5.69F, -1.6025F, -2.7F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        cube_r10.texOffs(321, 334).addBox(-5.2F, -1.2425F, -2.19F, 1.0F, 2.0F, 1.0F, -0.05F, false);
        cube_r10.texOffs(341, 333).addBox(-4.36F, 0.5975F, -2.19F, 1.0F, 1.0F, 1.0F, -0.05F, false);
        cube_r10.texOffs(321, 340).addBox(-5.69F, -1.6025F, -1.0F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        cube_r10.texOffs(341, 323).addBox(-5.69F, -1.6025F, 0.7F, 2.0F, 1.0F, 2.0F, -0.3F, false);
        cube_r10.texOffs(327, 343).addBox(-4.0F, 0.6025F, 1.165F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r10.texOffs(345, 320).addBox(-4.0F, 0.6025F, -2.195F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r10.texOffs(345, 326).addBox(-4.0F, 0.6025F, -0.515F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(19.27F, -10.175F, 1.815F);
        circuit.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, -1.5708F, 0.0F);
        cube_r11.texOffs(347, 330).addBox(-0.5F, -0.5F, -0.7F, 1.0F, 1.0F, 1.0F, -0.3F, false);
        cube_r11.texOffs(347, 342).addBox(-0.5F, -0.5F, -0.3F, 1.0F, 1.0F, 1.0F, -0.3F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(18.315F, -10.405F, 1.95F);
        circuit.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.0F, 1.5708F, 0.0F);
        cube_r12.texOffs(345, 344).addBox(-1.3F, -0.965F, 1.1F, 1.0F, 2.0F, 1.0F, -0.3F, false);
        cube_r12.texOffs(344, 335).addBox(-1.3F, -0.965F, -0.2F, 1.0F, 2.0F, 2.0F, -0.3F, false);

        controls = new ModelRenderer(this);
        controls.setPos(0.0F, 24.0F, 0.0F);


        butt1 = new ModelRenderer(this);
        butt1.setPos(-5.161F, -18.3434F, -26.286F);
        controls.addChild(butt1);
        butt1.texOffs(209, 98).addBox(-0.875F, -2.125F, -1.75F, 2.0F, 2.0F, 2.0F, -0.3F, false);

        butt2 = new ModelRenderer(this);
        butt2.setPos(-2.161F, -18.3434F, -26.286F);
        controls.addChild(butt2);
        butt2.texOffs(209, 66).addBox(-0.875F, -2.125F, -1.75F, 2.0F, 2.0F, 2.0F, -0.3F, false);

        butt3 = new ModelRenderer(this);
        butt3.setPos(0.839F, -18.3434F, -26.286F);
        controls.addChild(butt3);
        butt3.texOffs(7, 208).addBox(-0.875F, -2.125F, -1.75F, 2.0F, 2.0F, 2.0F, -0.3F, false);

        butt4 = new ModelRenderer(this);
        butt4.setPos(5.839F, -18.8434F, -26.286F);
        controls.addChild(butt4);
        butt4.texOffs(33, 112).addBox(-2.925F, -1.525F, -1.7F, 4.0F, 1.0F, 2.0F, -0.2F, false);

        butt8 = new ModelRenderer(this);
        butt8.setPos(25.536F, -19.2184F, 2.964F);
        controls.addChild(butt8);
        butt8.texOffs(23, 160).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 4.0F, -0.2F, false);

        butt7 = new ModelRenderer(this);
        butt7.setPos(21.4779F, -22.2853F, 4.964F);
        controls.addChild(butt7);


        butt7_r1 = new ModelRenderer(this);
        butt7_r1.setPos(0.0F, 0.0F, 0.0F);
        butt7.addChild(butt7_r1);
        setRotationAngle(butt7_r1, 0.0F, 0.0F, 0.7854F);
        butt7_r1.texOffs(207, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        butt5 = new ModelRenderer(this);
        butt5.setPos(21.4779F, -22.2853F, -5.036F);
        controls.addChild(butt5);


        butt5_r1 = new ModelRenderer(this);
        butt5_r1.setPos(0.0F, 0.0F, 0.0F);
        butt5.addChild(butt5_r1);
        setRotationAngle(butt5_r1, 0.0F, 0.0F, 0.7854F);
        butt5_r1.texOffs(75, 205).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        butt9 = new ModelRenderer(this);
        butt9.setPos(25.536F, -19.2184F, -5.036F);
        controls.addChild(butt9);
        butt9.texOffs(143, 98).addBox(-2.0F, -2.0F, -1.0F, 3.0F, 2.0F, 4.0F, -0.2F, false);

        butt6 = new ModelRenderer(this);
        butt6.setPos(22.089F, -22.1893F, 0.164F);
        controls.addChild(butt6);


        butt6_r1 = new ModelRenderer(this);
        butt6_r1.setPos(0.0F, 0.0F, 0.0F);
        butt6.addChild(butt6_r1);
        setRotationAngle(butt6_r1, 0.0F, 0.0F, 0.7854F);
        butt6_r1.texOffs(203, 163).addBox(-1.0F, -1.2F, -1.1F, 2.0F, 3.0F, 2.0F, 0.0F, false);

        butt12 = new ModelRenderer(this);
        butt12.setPos(-25.036F, -20.0934F, 0.0F);
        controls.addChild(butt12);
        butt12.texOffs(103, 74).addBox(-1.4F, -1.375F, -5.5F, 3.0F, 2.0F, 3.0F, -0.2F, false);

        butt11 = new ModelRenderer(this);
        butt11.setPos(-25.036F, -20.0934F, 0.0F);
        controls.addChild(butt11);
        butt11.texOffs(0, 93).addBox(-1.4F, -1.375F, -1.5F, 3.0F, 2.0F, 3.0F, -0.2F, false);

        butt10 = new ModelRenderer(this);
        butt10.setPos(-25.036F, -20.0934F, 0.0F);
        controls.addChild(butt10);
        butt10.texOffs(0, 70).addBox(-1.4F, -1.375F, 2.5F, 3.0F, 2.0F, 3.0F, -0.2F, false);
}

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        toolbox.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        lever1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        lever0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        rotorup.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        rotordown.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        octagon2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        octagon3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        octagon.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        bone3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        bfb.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        milr.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        circuit.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void render(BlueMarbleTile blueMarbleTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
        this.rotordown.y = -16.9636F + (0 - (float)Math.cos((double)blueMarbleTile.flightTicks * 0.2D) * 1.2F); //rotationPointY
        this.rotorup.y = -33.9636F + (float)Math.cos((double)blueMarbleTile.flightTicks * 0.2D) * 1.2F; //rotationPointY

        blueMarbleTile.getControl(FacingControl.class).ifPresent((facingControl)-> {
            if(facingControl.getDirection() == Direction.NORTH) clocky.yRot = (float) Math.toRadians(0);
            else if(facingControl.getDirection() == Direction.EAST) clocky.yRot = (float) Math.toRadians(90);
            else if(facingControl.getDirection() == Direction.SOUTH) clocky.yRot = (float) Math.toRadians(180);
            else clocky.yRot = (float) Math.toRadians(-90);
        });
        blueMarbleTile.getControl(ThrottleControl.class).ifPresent((throt)-> this.milr.zRot = (float) Math.toRadians((throt.getAmount() * -70) + -5F));
        blueMarbleTile.getControl(RefuelerControl.class).ifPresent((ref) -> this.bfb.y = ref.isRefueling() ? -0.1F : -0.5F);
        blueMarbleTile.getControl(LandingTypeControl.class).ifPresent((landtype)-> {
            this.clock.xRot = (float) landtype.getAnimationProgress() * 3; // 2.5F;
//            if(landtype.getAnimationTicks() != 0) aseoha.LOGGER.info(landtype.getAnimationTicks() * 9);
                });
        blueMarbleTile.getControl(HandbrakeControl.class).ifPresent((handbrake) -> {
            if(!(handbrake.isFree())){
                this.lever0.xRot = handbrake.getAnimationProgress() - 1F;
            }
            if((handbrake.isFree())){
                this.lever0.xRot = (-handbrake.getAnimationProgress());
            }
        });
        blueMarbleTile.getControl(DoorControl.class).ifPresent((door) -> {
            if((TARDISHelper.areDoorsOpen(blueMarbleTile) || TARDISHelper.isOneDoorOpen(blueMarbleTile))){
                this.lever1.xRot = door.getAnimationProgress() - 1F;
            }
            if((TARDISHelper.areDoorsClosed(blueMarbleTile))){
                this.lever1.xRot = (-door.getAnimationProgress());
            }
        });
        blueMarbleTile.getControl(YControl.class).ifPresent((y)->{
//            if(y.getAnimationTicks() <= 10 && y.getAnimationTicks() >= 5) this.butt6.y = -20.0009F;
//            else if(y.getAnimationTicks() >= 0 && y.getAnimationTicks() < 5) this.butt6.y = -20.2209F;
//            else this.butt6.y = -20.2209F;
//
//            if(y.getAnimationTicks() <= 10 && y.getAnimationTicks() >= 5) this.butt6.x = 47.405F;
//            if(y.getAnimationTicks() >= 0 && y.getAnimationTicks() < 5) this.butt6.x = 47.625F;

        });

        blueMarbleTile.getControl(XControl.class).ifPresent((x)->{
//            if(x.getAnimationTicks() <= 10 && x.getAnimationTicks() >= 5) this.butt5.y = -20.0009F;
//            else if(x.getAnimationTicks() >= 0 && x.getAnimationTicks() < 5) this.butt5.y = -20.2209F;
//            else this.butt5.y = -20.2209F;
//
//            if(x.getAnimationTicks() <= 10 && x.getAnimationTicks() >= 5) this.butt5.x = 21.2279F;
//            else if(x.getAnimationTicks() >= 0 && x.getAnimationTicks() < 5) this.butt5.x = 21.4779F;
//            else this.butt5.x = 21.4779F;
        });

        blueMarbleTile.getControl(ZControl.class).ifPresent((z)->{
//            if(z.getAnimationTicks() <= 10 && z.getAnimationTicks() >= 5) this.butt5.y = -20.0009F;
//            else if(z.getAnimationTicks() >= 0 && z.getAnimationTicks() < 5) this.butt5.y = -20.2209F;
//            else this.butt5.y = -20.2209F;
//
//            if(z.getAnimationTicks() <= 10 && z.getAnimationTicks() >= 5) this.butt7.x = 47.405F;
//            if(z.getAnimationTicks() >= 0 && z.getAnimationTicks() < 5) this.butt7.x = 47.625F;

        });
        matrixStack.pushPose();
        matrixStack.scale(0.95F,0.95F,0.95F);
        matrixStack.translate(0.0685F,0.275F,-0.07F);
        toolbox.render(matrixStack, iVertexBuilder,i,i1);
        lever1.render(matrixStack, iVertexBuilder,i,i1);
        lever0.render(matrixStack, iVertexBuilder,i,i1);
        rotorup.render(matrixStack, iVertexBuilder,i,i1);
        rotordown.render(matrixStack, iVertexBuilder,i,i1);
        octagon2.render(matrixStack, iVertexBuilder,i,i1);
        octagon3.render(matrixStack, iVertexBuilder,i,i1);
        octagon.render(matrixStack, iVertexBuilder,i,i1);
        bone3.render(matrixStack, iVertexBuilder,i,i1);
        bfb.render(matrixStack, iVertexBuilder,i,i1);
        milr.render(matrixStack, iVertexBuilder,i,i1);
        bone.render(matrixStack, iVertexBuilder,i,i1);
        circuit.render(matrixStack, iVertexBuilder,i,i1);
        controls.render(matrixStack, iVertexBuilder,i,i1);
        matrixStack.popPose();
    }
}