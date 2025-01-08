package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports
import com.code.aseoha.enums.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class ColinRichmond_Exterior extends ExteriorModel {
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
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer Emmisive;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
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
	private final ModelRenderer phone;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer LeftEmmisives;
	private final ModelRenderer RightDoor;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer RightEmmisives;

	public ColinRichmond_Exterior() {
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
		Shell.texOffs(178, 231).addBox(-22.5F, -77.0F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
		Shell.texOffs(178, 231).addBox(-22.5F, -77.0F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
		Shell.texOffs(192, 278).addBox(-23.0F, -80.0F, -17.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(186, 278).addBox(-23.0F, -80.0F, 15.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Shell.texOffs(260, 284).addBox(-24.0F, -80.0F, 17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(186, 151).addBox(-24.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Shell.texOffs(256, 284).addBox(-24.0F, -80.0F, -18.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(279, 203).addBox(2.0F, -77.0F, 21.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		Shell.texOffs(279, 203).addBox(-15.0F, -77.0F, 21.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		Shell.texOffs(240, 55).addBox(-15.0F, -80.0F, 22.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
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
		Shell.texOffs(178, 231).addBox(21.5F, -77.0F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
		Shell.texOffs(178, 231).addBox(21.5F, -77.0F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
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
		Shell.texOffs(0, 0).addBox(-27.0F, -2.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, false);
		Shell.texOffs(0, 0).addBox(0.0F, -2.0F, -27.0F, 27.0F, 0.0F, 54.0F, 0.0F, true);
		Shell.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);
		Shell.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);

		boti_r1 = new ModelRenderer(this);
		boti_r1.setPos(0.5F, -44.25F, 0.0F);
		Shell.addChild(boti_r1);
		setRotationAngle(boti_r1, 0.0F, 3.1416F, 0.0F);
		boti_r1.texOffs(294, 196).addBox(-18.0F, -39.5F, 0.0F, 35.0F, 79.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r1.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 3.1416F, 0.0F);
		cube_r2.texOffs(108, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r2.texOffs(0, 54).addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 0.0F, 0.0F, false);
		cube_r2.texOffs(150, 129).addBox(-18.0F, -96.7F, -18.0F, 36.0F, 4.0F, 18.0F, 0.35F, true);

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
		cube_r7.setPos(0.0F, -84.0F, 24.5F);
		Shell.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, 0.0F, 3.1416F);
		cube_r7.texOffs(238, 11).addBox(-21.0F, -3.0F, -2.5F, 42.0F, 6.0F, 5.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.0F, -1.0F, 0.0F);
		Shell.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.7854F, 0.0F);
		cube_r8.texOffs(28, 74).addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

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

		Emmisive = new ModelRenderer(this);
		Emmisive.setPos(0.0F, 24.0F, 0.0F);
		Emmisive.texOffs(1, 251).addBox(-22.6F, -77.0F, 2.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);
		Emmisive.texOffs(1, 251).addBox(-22.6F, -77.0F, -15.0F, 1.0F, 15.0F, 13.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, -69.5F, 22.1F);
		Emmisive.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 3.1416F, 0.0F);
		cube_r9.texOffs(0, 263).addBox(2.0F, -7.5F, -0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		cube_r9.texOffs(0, 263).addBox(-15.0F, -7.5F, -0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(22.1F, -69.5F, -8.5F);
		Emmisive.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 3.1416F, 0.0F);
		cube_r10.texOffs(1, 251).addBox(-0.5F, -7.5F, -6.5F, 1.0F, 15.0F, 13.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(22.1F, -69.5F, 8.5F);
		Emmisive.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 3.1416F, 0.0F);
		cube_r11.texOffs(1, 251).addBox(-0.5F, -7.5F, -6.5F, 1.0F, 15.0F, 13.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, -1.0F, 0.0F);
		Emmisive.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, -0.7854F, 0.0F);
		cube_r12.texOffs(28, 17).addBox(-2.0F, -103.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		text_POLICE4 = new ModelRenderer(this);
		text_POLICE4.setPos(0.0F, 0.0F, 0.0F);
		Emmisive.addChild(text_POLICE4);
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
		Emmisive.addChild(text_POLICE3);
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
		Emmisive.addChild(text_POLICE);


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
		Emmisive.addChild(text_POLICE2);
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
		LeftDoor.setPos(-16.9167F, -18.2308F, -23.0167F);
		LeftDoor.texOffs(6, 284).addBox(-0.0833F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 139).addBox(1.9167F, 34.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 284).addBox(14.9167F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 127).addBox(1.9167F, 19.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 111).addBox(1.9167F, 1.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 135).addBox(1.9167F, 16.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 131).addBox(1.9167F, -1.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 74).addBox(1.9167F, -34.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 127).addBox(1.9167F, -19.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 127).addBox(1.9167F, -37.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(320, 289).addBox(14.9167F, -37.7692F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(320, 292).addBox(15.9167F, -37.7692F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(320, 289).addBox(-0.0833F, -37.7692F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(320, 292).addBox(0.9167F, -37.7692F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(340, 35).addBox(1.9167F, -37.7692F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(340, 35).addBox(1.9167F, 34.2308F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(340, 35).addBox(1.9167F, -19.7692F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(340, 35).addBox(1.9167F, 16.2308F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(340, 35).addBox(1.9167F, -1.7692F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(234, 281).addBox(15.9167F, -37.7692F, -0.9833F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -2.7692F, 1.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(173, 60).addBox(1.9167F, -15.7692F, 1.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -2.7692F, 2.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(173, 60).addBox(1.9167F, -15.7692F, 2.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(173, 60).addBox(1.9167F, -15.7692F, 3.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -2.7692F, 3.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(161, 61).addBox(2.9167F, -15.7692F, 7.6167F, 11.0F, 13.0F, 0.0F, 0.0F, false);
		LeftDoor.texOffs(171, 60).addBox(13.9167F, -15.7692F, 2.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(171, 60).addBox(13.9167F, -15.7692F, 3.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(171, 60).addBox(13.9167F, -15.7692F, 1.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -16.7692F, 3.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -16.7692F, 4.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(173, 60).addBox(1.9167F, -15.7692F, 4.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -2.7692F, 4.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(171, 60).addBox(13.9167F, -15.7692F, 4.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(171, 60).addBox(13.9167F, -15.7692F, 5.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -16.7692F, 5.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(173, 60).addBox(1.9167F, -15.7692F, 5.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -2.7692F, 5.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(171, 60).addBox(13.9167F, -15.7692F, 6.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -16.7692F, 6.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(173, 60).addBox(1.9167F, -15.7692F, 6.6167F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -2.7692F, 6.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -16.7692F, 2.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(157, 59).addBox(1.9167F, -16.7692F, 1.6167F, 13.0F, 1.0F, 1.0F, 0.0F, false);

		phone = new ModelRenderer(this);
		phone.setPos(2.0F, -1.75F, 0.5F);
		LeftDoor.addChild(phone);
		phone.texOffs(0, 90).addBox(-0.0833F, -15.0192F, 0.0167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		phone.texOffs(157, 76).addBox(1.9167F, -13.0192F, 0.4167F, 9.0F, 11.0F, 1.0F, 0.0F, false);
		phone.texOffs(178, 76).addBox(1.9167F, -11.0192F, 1.4167F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		phone.texOffs(178, 76).addBox(1.9167F, -11.0192F, 2.4167F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		phone.texOffs(186, 86).addBox(3.9167F, -10.0192F, 3.4167F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		phone.texOffs(186, 86).addBox(6.9167F, -10.0192F, 3.4167F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		phone.texOffs(28, 0).addBox(11.9167F, -9.0192F, -0.9833F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		phone.texOffs(28, 0).addBox(11.9167F, -10.0192F, -0.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		phone.texOffs(28, 0).addBox(11.9167F, -6.0192F, -0.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(14.4167F, 0.9808F, 1.4167F);
		phone.addChild(cube_r13);
		setRotationAngle(cube_r13, 3.1416F, 0.0F, 1.5708F);
		cube_r13.texOffs(28, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(14.4167F, 1.9808F, 1.4167F);
		phone.addChild(cube_r14);
		setRotationAngle(cube_r14, 3.1416F, 0.0F, 1.5708F);
		cube_r14.texOffs(28, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(14.4167F, 1.9808F, 1.4167F);
		phone.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 3.1416F, 0.0F);
		cube_r15.texOffs(28, 0).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r15.texOffs(28, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(3.9167F, -11.5192F, 2.4167F);
		phone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.7854F, 0.0F);
		cube_r16.texOffs(177, 86).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(8.9167F, -11.5192F, 2.4167F);
		phone.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.7854F, 0.0F);
		cube_r17.texOffs(177, 86).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(6.4167F, -5.5192F, 3.9167F);
		phone.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.texOffs(186, 90).addBox(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		LeftEmmisives = new ModelRenderer(this);
		LeftEmmisives.setPos(0.0F, 0.0F, 0.0F);
		LeftDoor.addChild(LeftEmmisives);
		LeftEmmisives.texOffs(0, 263).addBox(1.9167F, -34.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.9167F, -18.1667F, -23.0167F);
		RightDoor.texOffs(0, 284).addBox(-16.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(222, 281).addBox(-1.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 119).addBox(-14.9167F, 34.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 58).addBox(-14.9167F, 19.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 115).addBox(-14.9167F, 16.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 32).addBox(-14.9167F, 1.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 111).addBox(-14.9167F, -1.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.9167F, -16.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 106).addBox(-14.9167F, -19.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 106).addBox(-14.9167F, -37.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(290, 289).addBox(-15.9167F, -37.8333F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(290, 292).addBox(-16.9167F, -37.8333F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(290, 292).addBox(-1.9167F, -37.8333F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(290, 289).addBox(-0.9167F, -37.8333F, 0.9167F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(340, 35).addBox(-14.9167F, -37.8333F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, true);
		RightDoor.texOffs(340, 35).addBox(-14.9167F, 34.1667F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, true);
		RightDoor.texOffs(340, 35).addBox(-14.9167F, -19.8333F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, true);
		RightDoor.texOffs(340, 35).addBox(-14.9167F, 16.1667F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, true);
		RightDoor.texOffs(340, 43).addBox(-14.9167F, -1.8333F, 0.9167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 74).addBox(-14.9167F, -34.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 6).addBox(-15.9167F, -11.3333F, -0.9833F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 6).addBox(-15.9167F, -6.3333F, -0.0333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 6).addBox(-15.9167F, -12.3333F, -0.0333F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(-15.3167F, 0.1667F, 1.9667F);
		RightDoor.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 3.1416F, 0.0F);
		cube_r19.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r19.texOffs(28, 6).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(-16.3167F, -0.8333F, 1.9667F);
		RightDoor.addChild(cube_r20);
		setRotationAngle(cube_r20, 3.1416F, 0.0F, -1.5708F);
		cube_r20.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(-16.4167F, -0.3333F, 1.7167F);
		RightDoor.addChild(cube_r21);
		setRotationAngle(cube_r21, 3.1416F, 0.0F, -1.5708F);
		cube_r21.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(-16.3167F, 0.1667F, 1.9667F);
		RightDoor.addChild(cube_r22);
		setRotationAngle(cube_r22, 3.1416F, 0.0F, -1.5708F);
		cube_r22.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setPos(-15.3167F, 0.1667F, 1.9667F);
		RightDoor.addChild(cube_r23);
		setRotationAngle(cube_r23, 3.1416F, 0.0F, -1.5708F);
		cube_r23.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setPos(-15.3167F, -0.8333F, 1.9667F);
		RightDoor.addChild(cube_r24);
		setRotationAngle(cube_r24, 3.1416F, 0.0F, -1.5708F);
		cube_r24.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setPos(-15.5667F, -0.3333F, 2.2167F);
		RightDoor.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 3.1416F, 0.0F);
		cube_r25.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setPos(-16.3167F, 0.1667F, 1.9667F);
		RightDoor.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 3.1416F, 0.0F);
		cube_r26.texOffs(28, 6).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r26.texOffs(28, 6).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightEmmisives = new ModelRenderer(this);
		RightEmmisives.setPos(0.0F, 0.0F, 0.0F);
		RightDoor.addChild(RightEmmisives);
		RightEmmisives.texOffs(0, 263).addBox(-14.9167F, -34.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Emmisive.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}


	@Override
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.pushPose();
		EnumDoorState state = exterior.getOpen();
		matrixStack.translate(0.0D, 0.3D, 0.0D);
		matrixStack.scale(0.8F, 0.8F, 0.8F);
		switch (state) {
			case ONE:
				this.RightDoor.yRot = (float) -Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.yRot = (float) -Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
		}
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		matrixStack.translate(0, 1.5, 0);
		LeftDoor.y = (float) -42.2;
		RightDoor.y = (float) -42.2;
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		//BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}