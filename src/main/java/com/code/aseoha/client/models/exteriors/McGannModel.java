package com.code.aseoha.client.models.exteriors;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.BrackolinRender;
import com.code.aseoha.client.renderers.exteriors.McGannRender;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.LightModelRenderer;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class McGannModel extends ExteriorModel {
	private final ModelRenderer Base;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer phone;
	private final LightModelRenderer LeftDoorEmmisive;
	private final LightModelRenderer Emmisives;
	private final ModelRenderer text_PPCB;
	private final ModelRenderer text_POLICE;
	private final ModelRenderer character_p;
	private final ModelRenderer character_o;
	private final ModelRenderer character_l;
	private final ModelRenderer character_i;
	private final ModelRenderer character_c;
	private final ModelRenderer character_e;
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
	private final ModelRenderer text_CALL2;
	private final ModelRenderer text_BOX;
	private final ModelRenderer character_b;
	private final ModelRenderer character_o2;
	private final ModelRenderer character_x;
	private final ModelRenderer text_PPCB2;
	private final ModelRenderer text_POLICE2;
	private final ModelRenderer character_p3;
	private final ModelRenderer character_o3;
	private final ModelRenderer character_l5;
	private final ModelRenderer character_i3;
	private final ModelRenderer character_c4;
	private final ModelRenderer character_e2;
	private final ModelRenderer text_PUBLIC2;
	private final ModelRenderer character_p4;
	private final ModelRenderer text_CALL3;
	private final ModelRenderer character_c5;
	private final ModelRenderer character_a2;
	private final ModelRenderer character_l6;
	private final ModelRenderer character_l7;
	private final ModelRenderer character_u2;
	private final ModelRenderer character_b3;
	private final ModelRenderer character_l8;
	private final ModelRenderer character_i4;
	private final ModelRenderer character_c6;
	private final ModelRenderer text_CALL4;
	private final ModelRenderer text_BOX2;
	private final ModelRenderer character_b4;
	private final ModelRenderer character_o4;
	private final ModelRenderer character_x2;
	private final ModelRenderer text_PPCB3;
	private final ModelRenderer text_POLICE3;
	private final ModelRenderer character_p5;
	private final ModelRenderer character_o5;
	private final ModelRenderer character_l9;
	private final ModelRenderer character_i5;
	private final ModelRenderer character_c7;
	private final ModelRenderer character_e3;
	private final ModelRenderer text_PUBLIC3;
	private final ModelRenderer character_p6;
	private final ModelRenderer text_CALL5;
	private final ModelRenderer character_c8;
	private final ModelRenderer character_a3;
	private final ModelRenderer character_l10;
	private final ModelRenderer character_l11;
	private final ModelRenderer character_u3;
	private final ModelRenderer character_b5;
	private final ModelRenderer character_l12;
	private final ModelRenderer character_i6;
	private final ModelRenderer character_c9;
	private final ModelRenderer text_CALL6;
	private final ModelRenderer text_BOX3;
	private final ModelRenderer character_b6;
	private final ModelRenderer character_o6;
	private final ModelRenderer character_x3;
	private final ModelRenderer text_PPCB4;
	private final ModelRenderer text_POLICE4;
	private final ModelRenderer character_p7;
	private final ModelRenderer character_o7;
	private final ModelRenderer character_l13;
	private final ModelRenderer character_i7;
	private final ModelRenderer character_c10;
	private final ModelRenderer character_e4;
	private final ModelRenderer text_PUBLIC4;
	private final ModelRenderer character_p8;
	private final ModelRenderer text_CALL7;
	private final ModelRenderer character_c11;
	private final ModelRenderer character_a4;
	private final ModelRenderer character_l14;
	private final ModelRenderer character_l15;
	private final ModelRenderer character_u4;
	private final ModelRenderer character_b7;
	private final ModelRenderer character_l16;
	private final ModelRenderer character_i8;
	private final ModelRenderer character_c12;
	private final ModelRenderer text_CALL8;
	private final ModelRenderer text_BOX4;
	private final ModelRenderer character_b8;
	private final ModelRenderer character_o8;
	private final ModelRenderer character_x4;
	private final ModelRenderer RightDoor;
	private final LightModelRenderer RightDoorEmmisives;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer BOTI;

	public McGannModel() {
		texWidth = 512;
		texHeight = 512;

		Base = new ModelRenderer(this);
		Base.setPos(0.0F, 24.0F, 0.0F);
		Base.texOffs(62, 238).addBox(-21.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		Base.texOffs(28, 271).addBox(-21.0F, -79.0F, -16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(24, 271).addBox(-21.0F, -79.0F, 15.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(242, 267).addBox(-2.0F, -79.0F, 20.0F, 4.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(264, 267).addBox(-1.0F, -79.0F, 21.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(150, 45).addBox(-15.0F, -8.0F, 20.0F, 30.0F, 4.0F, 1.0F, 0.0F, false);
		Base.texOffs(182, 11).addBox(-15.0F, -26.0F, 20.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(193, 69).addBox(-15.0F, -23.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(220, 149).addBox(-15.0F, -41.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(182, 15).addBox(-15.0F, -44.0F, 20.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(252, 165).addBox(-15.0F, -59.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(182, 19).addBox(-15.0F, -62.0F, 20.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		Base.texOffs(187, 183).addBox(-15.0F, -77.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Base.texOffs(194, 85).addBox(-15.0F, -79.0F, 20.0F, 30.0F, 2.0F, 1.0F, 0.0F, false);
		Base.texOffs(16, 271).addBox(-16.0F, -79.0F, 20.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(20, 271).addBox(15.0F, -79.0F, 20.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(222, 267).addBox(20.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Base.texOffs(252, 267).addBox(21.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Base.texOffs(224, 200).addBox(20.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		Base.texOffs(228, 103).addBox(20.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(150, 0).addBox(19.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(96, 154).addBox(19.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(128, 229).addBox(20.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(128, 184).addBox(19.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(224, 234).addBox(20.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(188, 154).addBox(19.5F, -77.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(0, 238).addBox(20.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		Base.texOffs(156, 262).addBox(20.0F, -79.0F, 15.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(12, 271).addBox(20.0F, -79.0F, -16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(0, 53).addBox(-24.0F, -4.0F, -24.0F, 48.0F, 1.0F, 48.0F, 0.0F, false);
		Base.texOffs(72, 149).addBox(-23.0F, -87.0F, -23.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		Base.texOffs(68, 271).addBox(-17.0F, -79.0F, -22.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(64, 271).addBox(16.0F, -79.0F, -22.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(90, 149).addBox(-17.0F, -80.0F, -22.0F, 34.0F, 1.0F, 1.0F, 0.0F, false);
		Base.texOffs(182, 0).addBox(-20.0F, -86.0F, -26.0F, 40.0F, 6.0F, 5.0F, 0.0F, false);
		Base.texOffs(0, 102).addBox(-21.0F, -91.0F, -21.0F, 42.0F, 5.0F, 42.0F, 0.0F, false);
		Base.texOffs(116, 350).addBox(-21.0F, -79.0F, -21.0F, 42.0F, 0.0F, 42.0F, 0.0F, false);
		Base.texOffs(116, 350).addBox(-21.0F, -4.05F, -21.0F, 42.0F, 0.0F, 42.0F, 0.0F, false);
		Base.texOffs(126, 102).addBox(-17.0F, -93.0F, -17.0F, 34.0F, 2.0F, 34.0F, 0.0F, false);
		Base.texOffs(28, 0).addBox(-2.5F, -95.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Base.texOffs(28, 0).addBox(-2.5F, -100.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Base.texOffs(126, 111).addBox(-4.0F, -94.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Base.texOffs(126, 102).addBox(-4.0F, -101.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		Base.texOffs(40, 38).addBox(-3.0F, -100.0F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Base.texOffs(36, 38).addBox(-3.0F, -100.0F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Base.texOffs(28, 38).addBox(2.0F, -100.0F, 2.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Base.texOffs(32, 38).addBox(2.0F, -100.0F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		Base.texOffs(28, 31).addBox(-22.0F, -90.0F, -22.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(28, 24).addBox(18.0F, -90.0F, -22.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(28, 10).addBox(18.0F, -90.0F, 18.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(28, 17).addBox(-22.0F, -90.0F, 18.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Base.texOffs(144, 53).addBox(-26.0F, -86.0F, -20.0F, 5.0F, 6.0F, 40.0F, 0.0F, false);
		Base.texOffs(178, 138).addBox(-20.0F, -86.0F, 21.0F, 40.0F, 6.0F, 5.0F, 0.0F, false);
		Base.texOffs(128, 138).addBox(21.0F, -86.0F, -20.0F, 5.0F, 6.0F, 40.0F, 0.0F, false);
		Base.texOffs(222, 34).addBox(-22.0F, -80.0F, -17.0F, 1.0F, 1.0F, 34.0F, 0.0F, false);
		Base.texOffs(56, 271).addBox(-22.0F, -79.0F, -17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(60, 271).addBox(-22.0F, -79.0F, 16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(144, 99).addBox(-17.0F, -80.0F, 21.0F, 34.0F, 1.0F, 1.0F, 0.0F, false);
		Base.texOffs(48, 271).addBox(-17.0F, -79.0F, 21.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(52, 271).addBox(16.0F, -79.0F, 21.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(216, 165).addBox(21.0F, -80.0F, -17.0F, 1.0F, 1.0F, 34.0F, 0.0F, false);
		Base.texOffs(40, 271).addBox(21.0F, -79.0F, 16.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(44, 271).addBox(21.0F, -79.0F, -17.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Base.texOffs(48, 149).addBox(17.0F, -87.0F, -23.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		Base.texOffs(0, 149).addBox(17.0F, -87.0F, 17.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		Base.texOffs(24, 149).addBox(-23.0F, -87.0F, 17.0F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		Base.texOffs(232, 267).addBox(-21.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Base.texOffs(258, 267).addBox(-22.0F, -79.0F, -1.0F, 1.0F, 75.0F, 2.0F, 0.0F, false);
		Base.texOffs(228, 69).addBox(-21.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		Base.texOffs(160, 244).addBox(-21.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(192, 214).addBox(-20.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(160, 199).addBox(-20.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(94, 244).addBox(-21.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(96, 199).addBox(-20.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(242, 0).addBox(-21.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		Base.texOffs(188, 154).addBox(-20.5F, -77.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Base.texOffs(0, 0).addBox(-25.0F, -3.0F, -25.0F, 50.0F, 3.0F, 50.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -101.5F, 0.0F);
		Base.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(31, 2).addBox(-1.5F, 4.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(31, 2).addBox(-1.5F, 5.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(31, 2).addBox(-1.5F, 3.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r1.texOffs(31, 2).addBox(-1.5F, 2.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 1.5708F, 0.0F);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-24.0F, -3.3F, -24.0F);
		bone7.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.7854F);
		cube_r2.texOffs(48, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-24.0F, -3.3F, 24.0F);
		bone7.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.7854F);
		cube_r3.texOffs(1, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-24.0F, -3.3F, 0.0F);
		bone7.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.texOffs(1, 2).addBox(-0.5F, -0.5F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);
		cube_r4.texOffs(1, 2).addBox(-0.5F, -0.1F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.0F, -42.7692F, -21.0F);
		Base.addChild(LeftDoor);
		LeftDoor.texOffs(270, 267).addBox(15.0F, -36.2308F, -1.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(6, 271).addBox(14.0F, -36.2308F, 0.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(36, 271).addBox(0.0F, -36.2308F, 0.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(126, 125).addBox(1.0F, 34.7692F, 0.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(144, 61).addBox(1.0F, 16.7692F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 118).addBox(1.0F, 19.7692F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 69).addBox(1.0F, 1.7692F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(144, 57).addBox(1.0F, -1.2308F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, 1.7692F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -16.2308F, 4.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -15.2308F, 2.6F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -15.2308F, 1.6F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(139, 327).addBox(13.0F, -15.2308F, 2.6F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(139, 327).addBox(13.0F, -15.2308F, 1.6F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -2.2308F, 2.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -2.2308F, 1.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -16.2308F, 2.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(139, 327).addBox(13.0F, -15.2308F, 3.6F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -2.2308F, 3.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -15.2308F, 3.6F, 1.0F, 13.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -16.2308F, 3.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, -16.2308F, 1.6F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(127, 327).addBox(1.0F, 19.7692F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(126, 138).addBox(1.0F, -19.2308F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 0).addBox(1.0F, -34.2308F, 0.45F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 134).addBox(1.0F, -36.2308F, 0.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, -19.2308F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(86, 273).addBox(14.0F, -36.2308F, 1.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, -36.2308F, 1.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(86, 273).addBox(0.0F, -36.2308F, 1.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, 16.7692F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, -1.2308F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, 34.7692F, 1.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);

		phone = new ModelRenderer(this);
		phone.setPos(14.0F, -1.2308F, 0.5F);
		LeftDoor.addChild(phone);
		phone.texOffs(0, 32).addBox(-13.0F, -15.0F, 0.0F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		phone.texOffs(44, 14).addBox(-13.0F, -9.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		phone.texOffs(129, 328).addBox(-13.0F, -15.0F, 1.0F, 13.0F, 15.0F, 0.0F, 0.0F, false);
		phone.texOffs(40, 6).addBox(-1.0F, -9.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		LeftDoorEmmisive = new LightModelRenderer(this);
		LeftDoorEmmisive.setPos(16.0F, -15.2308F, 22.0F);
		LeftDoor.addChild(LeftDoorEmmisive);
		LeftDoorEmmisive.texOffs(0, 480).addBox(-15.0F, -19.0F, -21.56F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		Emmisives = new LightModelRenderer(this);
		Emmisives.setPos(1.0F, -57.0F, 0.0F);
		Base.addChild(Emmisives);
		Emmisives.texOffs(35, 466).addBox(18.5F, -20.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		Emmisives.texOffs(28, 53).addBox(-3.0F, -43.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		Emmisives.texOffs(34, 495).addBox(-16.0F, -20.0F, 19.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		Emmisives.texOffs(35, 466).addBox(-21.5F, -20.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);

		text_PPCB = new ModelRenderer(this);
		text_PPCB.setPos(-1.0F, 57.0F, 0.0F);
		Emmisives.addChild(text_PPCB);


		text_POLICE = new ModelRenderer(this);
		text_POLICE.setPos(0.9F, -38.45F, -9.25F);
		text_PPCB.addChild(text_POLICE);


		character_p = new ModelRenderer(this);
		character_p.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE.addChild(character_p);
		character_p.texOffs(292, 53).addBox(1.2F, -3.2F, 0.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		character_p.texOffs(292, 53).addBox(0.8F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p.texOffs(292, 53).addBox(0.8F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p.texOffs(292, 53).addBox(0.0F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_o = new ModelRenderer(this);
		character_o.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE.addChild(character_o);
		character_o.texOffs(292, 53).addBox(-12.38F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o.texOffs(292, 53).addBox(-11.58F, -46.2F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o.texOffs(292, 53).addBox(-10.78F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o.texOffs(292, 53).addBox(-11.58F, -43.8F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);

		character_l = new ModelRenderer(this);
		character_l.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE.addChild(character_l);
		character_l.texOffs(292, 53).addBox(-9.86F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_l.texOffs(292, 53).addBox(-9.06F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_i = new ModelRenderer(this);
		character_i.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE.addChild(character_i);
		character_i.texOffs(292, 53).addBox(-7.74F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_c = new ModelRenderer(this);
		character_c.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE.addChild(character_c);
		character_c.texOffs(292, 53).addBox(7.68F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_c.texOffs(292, 53).addBox(8.48F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_c.texOffs(292, 53).addBox(8.48F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_e = new ModelRenderer(this);
		character_e.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE.addChild(character_e);
		character_e.texOffs(292, 53).addBox(-4.7F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_e.texOffs(292, 53).addBox(-3.9F, -46.2F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_e.texOffs(292, 53).addBox(-3.9F, -45.0F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_e.texOffs(292, 53).addBox(-3.9F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		text_PUBLIC = new ModelRenderer(this);
		text_PUBLIC.setPos(-0.5F, -87.95F, -27.25F);
		text_PPCB.addChild(text_PUBLIC);
		text_PUBLIC.texOffs(292, 53).addBox(5.5F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(5.5F, 3.4F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(5.1F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(4.64F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(3.98F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(3.58F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(3.12F, 3.4F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(3.12F, 4.3F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(3.12F, 4.1F, 1.2F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(2.92F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(2.92F, 4.6F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(2.92F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(2.52F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(1.66F, 4.6F, 1.2F, 0.4F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(2.06F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(1.26F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(0.6F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(0.6F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(0.8F, 3.4F, 1.2F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		text_PUBLIC.texOffs(292, 53).addBox(0.2F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);

		character_p2 = new ModelRenderer(this);
		character_p2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_p2);


		text_CALL = new ModelRenderer(this);
		text_CALL.setPos(-7.35F, -61.7F, -24.8F);
		character_p2.addChild(text_CALL);


		character_c3 = new ModelRenderer(this);
		character_c3.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_c3);


		character_a = new ModelRenderer(this);
		character_a.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_a);


		character_l3 = new ModelRenderer(this);
		character_l3.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_l3);


		character_l4 = new ModelRenderer(this);
		character_l4.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_l4);


		character_u = new ModelRenderer(this);
		character_u.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_u);


		character_b2 = new ModelRenderer(this);
		character_b2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_b2);


		character_l2 = new ModelRenderer(this);
		character_l2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_l2);


		character_i2 = new ModelRenderer(this);
		character_i2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_i2);


		character_c2 = new ModelRenderer(this);
		character_c2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_c2);


		text_CALL2 = new ModelRenderer(this);
		text_CALL2.setPos(-0.25F, -81.45F, -26.05F);
		text_PPCB.addChild(text_CALL2);
		text_CALL2.texOffs(292, 53).addBox(4.18F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(1.0F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(1.4F, -1.6F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(1.4F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(2.06F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(2.46F, -1.6F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(2.66F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(2.46F, -1.0F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(3.12F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(3.52F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL2.texOffs(292, 53).addBox(4.58F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		text_BOX = new ModelRenderer(this);
		text_BOX.setPos(8.7F, -86.45F, -27.25F);
		text_PPCB.addChild(text_BOX);


		character_b = new ModelRenderer(this);
		character_b.setPos(2.58F, -2.4F, 1.2F);
		text_BOX.addChild(character_b);
		character_b.texOffs(292, 53).addBox(-4.18F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_b.texOffs(292, 53).addBox(-3.38F, 4.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b.texOffs(292, 53).addBox(-3.38F, 6.6F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b.texOffs(292, 53).addBox(-3.38F, 5.4F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b.texOffs(292, 53).addBox(-2.98F, 5.6F, 0.0F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		character_b.texOffs(292, 53).addBox(-2.98F, 6.0F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		character_b.texOffs(292, 53).addBox(-2.98F, 4.2F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);

		character_o2 = new ModelRenderer(this);
		character_o2.setPos(2.58F, -2.4F, 1.2F);
		text_BOX.addChild(character_o2);
		character_o2.texOffs(292, 53).addBox(-1.26F, 6.6F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o2.texOffs(292, 53).addBox(-0.46F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o2.texOffs(292, 53).addBox(-1.26F, 4.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o2.texOffs(292, 53).addBox(-2.06F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_x = new ModelRenderer(this);
		character_x.setPos(2.58F, -2.4F, 1.2F);
		text_BOX.addChild(character_x);
		character_x.texOffs(292, 53).addBox(0.46F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(292, 53).addBox(0.46F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(292, 53).addBox(1.66F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(292, 53).addBox(1.66F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(292, 53).addBox(0.96F, 5.1F, 0.0F, 1.0F, 1.4F, 9.6F, 0.0F, false);

		text_PPCB2 = new ModelRenderer(this);
		text_PPCB2.setPos(-1.0F, 57.0F, 0.0F);
		Emmisives.addChild(text_PPCB2);
		setRotationAngle(text_PPCB2, 0.0F, -1.5708F, 0.0F);


		text_POLICE2 = new ModelRenderer(this);
		text_POLICE2.setPos(0.9F, -38.45F, -9.25F);
		text_PPCB2.addChild(text_POLICE2);


		character_p3 = new ModelRenderer(this);
		character_p3.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE2.addChild(character_p3);
		character_p3.texOffs(292, 53).addBox(1.2F, -3.2F, 0.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		character_p3.texOffs(292, 53).addBox(0.8F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p3.texOffs(292, 53).addBox(0.8F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p3.texOffs(292, 53).addBox(0.0F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_o3 = new ModelRenderer(this);
		character_o3.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE2.addChild(character_o3);
		character_o3.texOffs(292, 53).addBox(-12.38F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o3.texOffs(292, 53).addBox(-11.58F, -46.2F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o3.texOffs(292, 53).addBox(-10.78F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o3.texOffs(292, 53).addBox(-11.58F, -43.8F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);

		character_l5 = new ModelRenderer(this);
		character_l5.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE2.addChild(character_l5);
		character_l5.texOffs(292, 53).addBox(-9.86F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_l5.texOffs(292, 53).addBox(-9.06F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_i3 = new ModelRenderer(this);
		character_i3.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE2.addChild(character_i3);
		character_i3.texOffs(292, 53).addBox(-7.74F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_c4 = new ModelRenderer(this);
		character_c4.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE2.addChild(character_c4);
		character_c4.texOffs(292, 53).addBox(7.68F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_c4.texOffs(292, 53).addBox(8.48F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_c4.texOffs(292, 53).addBox(8.48F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_e2 = new ModelRenderer(this);
		character_e2.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE2.addChild(character_e2);
		character_e2.texOffs(292, 53).addBox(-4.7F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_e2.texOffs(292, 53).addBox(-3.9F, -46.2F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_e2.texOffs(292, 53).addBox(-3.9F, -45.0F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_e2.texOffs(292, 53).addBox(-3.9F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		text_PUBLIC2 = new ModelRenderer(this);
		text_PUBLIC2.setPos(-0.5F, -87.95F, -27.25F);
		text_PPCB2.addChild(text_PUBLIC2);
		text_PUBLIC2.texOffs(292, 53).addBox(5.5F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(5.5F, 3.4F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(5.1F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(4.64F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(3.98F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(3.58F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(3.12F, 3.4F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(3.12F, 4.3F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(3.12F, 4.1F, 1.2F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(2.92F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(2.92F, 4.6F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(2.92F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(2.52F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(1.66F, 4.6F, 1.2F, 0.4F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(2.06F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(1.26F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(0.6F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(0.6F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(0.8F, 3.4F, 1.2F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		text_PUBLIC2.texOffs(292, 53).addBox(0.2F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);

		character_p4 = new ModelRenderer(this);
		character_p4.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC2.addChild(character_p4);


		text_CALL3 = new ModelRenderer(this);
		text_CALL3.setPos(-7.35F, -61.7F, -24.8F);
		character_p4.addChild(text_CALL3);


		character_c5 = new ModelRenderer(this);
		character_c5.setPos(4.96F, 60.0F, 26.4F);
		text_CALL3.addChild(character_c5);


		character_a2 = new ModelRenderer(this);
		character_a2.setPos(4.96F, 60.0F, 26.4F);
		text_CALL3.addChild(character_a2);


		character_l6 = new ModelRenderer(this);
		character_l6.setPos(4.96F, 60.0F, 26.4F);
		text_CALL3.addChild(character_l6);


		character_l7 = new ModelRenderer(this);
		character_l7.setPos(4.96F, 60.0F, 26.4F);
		text_CALL3.addChild(character_l7);


		character_u2 = new ModelRenderer(this);
		character_u2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC2.addChild(character_u2);


		character_b3 = new ModelRenderer(this);
		character_b3.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC2.addChild(character_b3);


		character_l8 = new ModelRenderer(this);
		character_l8.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC2.addChild(character_l8);


		character_i4 = new ModelRenderer(this);
		character_i4.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC2.addChild(character_i4);


		character_c6 = new ModelRenderer(this);
		character_c6.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC2.addChild(character_c6);


		text_CALL4 = new ModelRenderer(this);
		text_CALL4.setPos(-0.25F, -81.45F, -26.05F);
		text_PPCB2.addChild(text_CALL4);
		text_CALL4.texOffs(292, 53).addBox(4.18F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(1.0F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(1.4F, -1.6F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(1.4F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(2.06F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(2.46F, -1.6F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(2.66F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(2.46F, -1.0F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(3.12F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(3.52F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL4.texOffs(292, 53).addBox(4.58F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		text_BOX2 = new ModelRenderer(this);
		text_BOX2.setPos(8.7F, -86.45F, -27.25F);
		text_PPCB2.addChild(text_BOX2);


		character_b4 = new ModelRenderer(this);
		character_b4.setPos(2.58F, -2.4F, 1.2F);
		text_BOX2.addChild(character_b4);
		character_b4.texOffs(292, 53).addBox(-4.18F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_b4.texOffs(292, 53).addBox(-3.38F, 4.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b4.texOffs(292, 53).addBox(-3.38F, 6.6F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b4.texOffs(292, 53).addBox(-3.38F, 5.4F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b4.texOffs(292, 53).addBox(-2.98F, 5.6F, 0.0F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		character_b4.texOffs(292, 53).addBox(-2.98F, 6.0F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		character_b4.texOffs(292, 53).addBox(-2.98F, 4.2F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);

		character_o4 = new ModelRenderer(this);
		character_o4.setPos(2.58F, -2.4F, 1.2F);
		text_BOX2.addChild(character_o4);
		character_o4.texOffs(292, 53).addBox(-1.26F, 6.6F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o4.texOffs(292, 53).addBox(-0.46F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o4.texOffs(292, 53).addBox(-1.26F, 4.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o4.texOffs(292, 53).addBox(-2.06F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_x2 = new ModelRenderer(this);
		character_x2.setPos(2.58F, -2.4F, 1.2F);
		text_BOX2.addChild(character_x2);
		character_x2.texOffs(292, 53).addBox(0.46F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x2.texOffs(292, 53).addBox(0.46F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x2.texOffs(292, 53).addBox(1.66F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x2.texOffs(292, 53).addBox(1.66F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x2.texOffs(292, 53).addBox(0.96F, 5.1F, 0.0F, 1.0F, 1.4F, 9.6F, 0.0F, false);

		text_PPCB3 = new ModelRenderer(this);
		text_PPCB3.setPos(-1.0F, 57.0F, 0.0F);
		Emmisives.addChild(text_PPCB3);
		setRotationAngle(text_PPCB3, 0.0F, 3.1416F, 0.0F);


		text_POLICE3 = new ModelRenderer(this);
		text_POLICE3.setPos(0.9F, -38.45F, -9.25F);
		text_PPCB3.addChild(text_POLICE3);


		character_p5 = new ModelRenderer(this);
		character_p5.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE3.addChild(character_p5);
		character_p5.texOffs(292, 53).addBox(1.2F, -3.2F, 0.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		character_p5.texOffs(292, 53).addBox(0.8F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p5.texOffs(292, 53).addBox(0.8F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p5.texOffs(292, 53).addBox(0.0F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_o5 = new ModelRenderer(this);
		character_o5.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE3.addChild(character_o5);
		character_o5.texOffs(292, 53).addBox(-12.38F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o5.texOffs(292, 53).addBox(-11.58F, -46.2F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o5.texOffs(292, 53).addBox(-10.78F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o5.texOffs(292, 53).addBox(-11.58F, -43.8F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);

		character_l9 = new ModelRenderer(this);
		character_l9.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE3.addChild(character_l9);
		character_l9.texOffs(292, 53).addBox(-9.86F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_l9.texOffs(292, 53).addBox(-9.06F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_i5 = new ModelRenderer(this);
		character_i5.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE3.addChild(character_i5);
		character_i5.texOffs(292, 53).addBox(-7.74F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_c7 = new ModelRenderer(this);
		character_c7.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE3.addChild(character_c7);
		character_c7.texOffs(292, 53).addBox(7.68F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_c7.texOffs(292, 53).addBox(8.48F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_c7.texOffs(292, 53).addBox(8.48F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_e3 = new ModelRenderer(this);
		character_e3.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE3.addChild(character_e3);
		character_e3.texOffs(292, 53).addBox(-4.7F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_e3.texOffs(292, 53).addBox(-3.9F, -46.2F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_e3.texOffs(292, 53).addBox(-3.9F, -45.0F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_e3.texOffs(292, 53).addBox(-3.9F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		text_PUBLIC3 = new ModelRenderer(this);
		text_PUBLIC3.setPos(-0.5F, -87.95F, -27.25F);
		text_PPCB3.addChild(text_PUBLIC3);
		text_PUBLIC3.texOffs(292, 53).addBox(5.5F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(5.5F, 3.4F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(5.1F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(4.64F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(3.98F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(3.58F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(3.12F, 3.4F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(3.12F, 4.3F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(3.12F, 4.1F, 1.2F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(2.92F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(2.92F, 4.6F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(2.92F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(2.52F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(1.66F, 4.6F, 1.2F, 0.4F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(2.06F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(1.26F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(0.6F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(0.6F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(0.8F, 3.4F, 1.2F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		text_PUBLIC3.texOffs(292, 53).addBox(0.2F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);

		character_p6 = new ModelRenderer(this);
		character_p6.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC3.addChild(character_p6);


		text_CALL5 = new ModelRenderer(this);
		text_CALL5.setPos(-7.35F, -61.7F, -24.8F);
		character_p6.addChild(text_CALL5);


		character_c8 = new ModelRenderer(this);
		character_c8.setPos(4.96F, 60.0F, 26.4F);
		text_CALL5.addChild(character_c8);


		character_a3 = new ModelRenderer(this);
		character_a3.setPos(4.96F, 60.0F, 26.4F);
		text_CALL5.addChild(character_a3);


		character_l10 = new ModelRenderer(this);
		character_l10.setPos(4.96F, 60.0F, 26.4F);
		text_CALL5.addChild(character_l10);


		character_l11 = new ModelRenderer(this);
		character_l11.setPos(4.96F, 60.0F, 26.4F);
		text_CALL5.addChild(character_l11);


		character_u3 = new ModelRenderer(this);
		character_u3.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC3.addChild(character_u3);


		character_b5 = new ModelRenderer(this);
		character_b5.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC3.addChild(character_b5);


		character_l12 = new ModelRenderer(this);
		character_l12.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC3.addChild(character_l12);


		character_i6 = new ModelRenderer(this);
		character_i6.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC3.addChild(character_i6);


		character_c9 = new ModelRenderer(this);
		character_c9.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC3.addChild(character_c9);


		text_CALL6 = new ModelRenderer(this);
		text_CALL6.setPos(-0.25F, -81.45F, -26.05F);
		text_PPCB3.addChild(text_CALL6);
		text_CALL6.texOffs(292, 53).addBox(4.18F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(1.0F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(1.4F, -1.6F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(1.4F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(2.06F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(2.46F, -1.6F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(2.66F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(2.46F, -1.0F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(3.12F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(3.52F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL6.texOffs(292, 53).addBox(4.58F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		text_BOX3 = new ModelRenderer(this);
		text_BOX3.setPos(8.7F, -86.45F, -27.25F);
		text_PPCB3.addChild(text_BOX3);


		character_b6 = new ModelRenderer(this);
		character_b6.setPos(2.58F, -2.4F, 1.2F);
		text_BOX3.addChild(character_b6);
		character_b6.texOffs(292, 53).addBox(-4.18F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_b6.texOffs(292, 53).addBox(-3.38F, 4.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b6.texOffs(292, 53).addBox(-3.38F, 6.6F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b6.texOffs(292, 53).addBox(-3.38F, 5.4F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b6.texOffs(292, 53).addBox(-2.98F, 5.6F, 0.0F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		character_b6.texOffs(292, 53).addBox(-2.98F, 6.0F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		character_b6.texOffs(292, 53).addBox(-2.98F, 4.2F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);

		character_o6 = new ModelRenderer(this);
		character_o6.setPos(2.58F, -2.4F, 1.2F);
		text_BOX3.addChild(character_o6);
		character_o6.texOffs(292, 53).addBox(-1.26F, 6.6F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o6.texOffs(292, 53).addBox(-0.46F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o6.texOffs(292, 53).addBox(-1.26F, 4.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o6.texOffs(292, 53).addBox(-2.06F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_x3 = new ModelRenderer(this);
		character_x3.setPos(2.58F, -2.4F, 1.2F);
		text_BOX3.addChild(character_x3);
		character_x3.texOffs(292, 53).addBox(0.46F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x3.texOffs(292, 53).addBox(0.46F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x3.texOffs(292, 53).addBox(1.66F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x3.texOffs(292, 53).addBox(1.66F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x3.texOffs(292, 53).addBox(0.96F, 5.1F, 0.0F, 1.0F, 1.4F, 9.6F, 0.0F, false);

		text_PPCB4 = new ModelRenderer(this);
		text_PPCB4.setPos(-1.0F, 57.0F, 0.0F);
		Emmisives.addChild(text_PPCB4);
		setRotationAngle(text_PPCB4, 0.0F, 1.5708F, 0.0F);


		text_POLICE4 = new ModelRenderer(this);
		text_POLICE4.setPos(0.9F, -38.45F, -9.25F);
		text_PPCB4.addChild(text_POLICE4);


		character_p7 = new ModelRenderer(this);
		character_p7.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE4.addChild(character_p7);
		character_p7.texOffs(292, 53).addBox(1.2F, -3.2F, 0.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		character_p7.texOffs(292, 53).addBox(0.8F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p7.texOffs(292, 53).addBox(0.8F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p7.texOffs(292, 53).addBox(0.0F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_o7 = new ModelRenderer(this);
		character_o7.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE4.addChild(character_o7);
		character_o7.texOffs(292, 53).addBox(-12.38F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o7.texOffs(292, 53).addBox(-11.58F, -46.2F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o7.texOffs(292, 53).addBox(-10.78F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o7.texOffs(292, 53).addBox(-11.58F, -43.8F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);

		character_l13 = new ModelRenderer(this);
		character_l13.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE4.addChild(character_l13);
		character_l13.texOffs(292, 53).addBox(-9.86F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_l13.texOffs(292, 53).addBox(-9.06F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_i7 = new ModelRenderer(this);
		character_i7.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE4.addChild(character_i7);
		character_i7.texOffs(292, 53).addBox(-7.74F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_c10 = new ModelRenderer(this);
		character_c10.setPos(-14.5F, -43.0F, -16.8F);
		text_POLICE4.addChild(character_c10);
		character_c10.texOffs(292, 53).addBox(7.68F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_c10.texOffs(292, 53).addBox(8.48F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_c10.texOffs(292, 53).addBox(8.48F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_e4 = new ModelRenderer(this);
		character_e4.setPos(0.0F, 0.0F, 0.0F);
		text_POLICE4.addChild(character_e4);
		character_e4.texOffs(292, 53).addBox(-4.7F, -46.2F, -16.8F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_e4.texOffs(292, 53).addBox(-3.9F, -46.2F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_e4.texOffs(292, 53).addBox(-3.9F, -45.0F, -16.8F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_e4.texOffs(292, 53).addBox(-3.9F, -43.8F, -16.8F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		text_PUBLIC4 = new ModelRenderer(this);
		text_PUBLIC4.setPos(-0.5F, -87.95F, -27.25F);
		text_PPCB4.addChild(text_PUBLIC4);
		text_PUBLIC4.texOffs(292, 53).addBox(5.5F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(5.5F, 3.4F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(5.1F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(4.64F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(3.98F, 4.6F, 1.2F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(3.58F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(3.12F, 3.4F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(3.12F, 4.3F, 1.2F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(3.12F, 4.1F, 1.2F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(2.92F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(2.92F, 4.6F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(2.92F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(2.52F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(1.66F, 4.6F, 1.2F, 0.4F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(2.06F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(1.26F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(0.6F, 4.0F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(0.6F, 3.4F, 1.2F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(0.8F, 3.4F, 1.2F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		text_PUBLIC4.texOffs(292, 53).addBox(0.2F, 3.4F, 1.2F, 0.4F, 1.6F, 9.55F, 0.0F, false);

		character_p8 = new ModelRenderer(this);
		character_p8.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC4.addChild(character_p8);


		text_CALL7 = new ModelRenderer(this);
		text_CALL7.setPos(-7.35F, -61.7F, -24.8F);
		character_p8.addChild(text_CALL7);


		character_c11 = new ModelRenderer(this);
		character_c11.setPos(4.96F, 60.0F, 26.4F);
		text_CALL7.addChild(character_c11);


		character_a4 = new ModelRenderer(this);
		character_a4.setPos(4.96F, 60.0F, 26.4F);
		text_CALL7.addChild(character_a4);


		character_l14 = new ModelRenderer(this);
		character_l14.setPos(4.96F, 60.0F, 26.4F);
		text_CALL7.addChild(character_l14);


		character_l15 = new ModelRenderer(this);
		character_l15.setPos(4.96F, 60.0F, 26.4F);
		text_CALL7.addChild(character_l15);


		character_u4 = new ModelRenderer(this);
		character_u4.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC4.addChild(character_u4);


		character_b7 = new ModelRenderer(this);
		character_b7.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC4.addChild(character_b7);


		character_l16 = new ModelRenderer(this);
		character_l16.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC4.addChild(character_l16);


		character_i8 = new ModelRenderer(this);
		character_i8.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC4.addChild(character_i8);


		character_c12 = new ModelRenderer(this);
		character_c12.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC4.addChild(character_c12);


		text_CALL8 = new ModelRenderer(this);
		text_CALL8.setPos(-0.25F, -81.45F, -26.05F);
		text_PPCB4.addChild(text_CALL8);
		text_CALL8.texOffs(292, 53).addBox(4.18F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(1.0F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(1.4F, -1.6F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(1.4F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(2.06F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(2.46F, -1.6F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(2.66F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(2.46F, -1.0F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(3.12F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(3.52F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text_CALL8.texOffs(292, 53).addBox(4.58F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		text_BOX4 = new ModelRenderer(this);
		text_BOX4.setPos(8.7F, -86.45F, -27.25F);
		text_PPCB4.addChild(text_BOX4);


		character_b8 = new ModelRenderer(this);
		character_b8.setPos(2.58F, -2.4F, 1.2F);
		text_BOX4.addChild(character_b8);
		character_b8.texOffs(292, 53).addBox(-4.18F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_b8.texOffs(292, 53).addBox(-3.38F, 4.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b8.texOffs(292, 53).addBox(-3.38F, 6.6F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b8.texOffs(292, 53).addBox(-3.38F, 5.4F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b8.texOffs(292, 53).addBox(-2.98F, 5.6F, 0.0F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		character_b8.texOffs(292, 53).addBox(-2.98F, 6.0F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		character_b8.texOffs(292, 53).addBox(-2.98F, 4.2F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);

		character_o8 = new ModelRenderer(this);
		character_o8.setPos(2.58F, -2.4F, 1.2F);
		text_BOX4.addChild(character_o8);
		character_o8.texOffs(292, 53).addBox(-1.26F, 6.6F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o8.texOffs(292, 53).addBox(-0.46F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o8.texOffs(292, 53).addBox(-1.26F, 4.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o8.texOffs(292, 53).addBox(-2.06F, 4.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_x4 = new ModelRenderer(this);
		character_x4.setPos(2.58F, -2.4F, 1.2F);
		text_BOX4.addChild(character_x4);
		character_x4.texOffs(292, 53).addBox(0.46F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x4.texOffs(292, 53).addBox(0.46F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x4.texOffs(292, 53).addBox(1.66F, 4.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x4.texOffs(292, 53).addBox(1.66F, 6.3F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x4.texOffs(292, 53).addBox(0.96F, 5.1F, 0.0F, 1.0F, 1.4F, 9.6F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.0F, -42.8333F, -21.0F);
		Base.addChild(RightDoor);
		RightDoor.texOffs(0, 271).addBox(-16.0F, -36.1667F, 0.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(126, 120).addBox(-14.0F, 34.8333F, 0.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(144, 65).addBox(-14.0F, 16.8333F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 102).addBox(-14.0F, 19.8333F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 85).addBox(-14.0F, 1.8333F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(43, 9).addBox(-15.0F, -7.1667F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(44, 18).addBox(-15.0F, -11.1667F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(144, 53).addBox(-14.0F, -1.1667F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 53).addBox(-14.0F, -16.1667F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(127, 327).addBox(-14.0F, -16.1667F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(127, 327).addBox(-14.0F, 1.8333F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(127, 327).addBox(-14.0F, 19.8333F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 138).addBox(-14.0F, -19.1667F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.0F, -34.1667F, 0.45F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(126, 130).addBox(-14.0F, -36.1667F, 0.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(32, 271).addBox(-1.0F, -36.1667F, 0.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, 34.8333F, 1.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(86, 273).addBox(-16.0F, -36.1667F, 1.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(86, 273).addBox(-1.0F, -36.1667F, 1.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, 16.8333F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, -1.1667F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, -19.1667F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, -36.1667F, 1.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);

		RightDoorEmmisives = new LightModelRenderer(this);
		RightDoorEmmisives.setPos(-16.0F, -15.1667F, 22.0F);
		RightDoor.addChild(RightDoorEmmisives);
		RightDoorEmmisives.texOffs(0, 496).addBox(2.0F, -19.0F, -21.56F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone6);
		setRotationAngle(bone6, -3.1416F, 0.0F, 3.1416F);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-24.0F, -3.3F, -24.0F);
		bone6.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.7854F);
		cube_r5.texOffs(48, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-24.0F, -3.3F, 24.0F);
		bone6.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, 0.7854F);
		cube_r6.texOffs(1, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-24.0F, -3.3F, 0.0F);
		bone6.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.texOffs(1, 2).addBox(-0.5F, -0.5F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);
		cube_r7.texOffs(1, 2).addBox(-0.5F, -0.1F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.5708F, 0.0F);


		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-24.0F, -3.3F, -24.0F);
		bone5.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.7854F, 0.0F, 0.7854F);
		cube_r8.texOffs(48, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-24.0F, -3.3F, 24.0F);
		bone5.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.7854F);
		cube_r9.texOffs(1, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(-24.0F, -3.3F, 0.0F);
		bone5.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.texOffs(1, 2).addBox(-0.5F, -0.5F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);
		cube_r10.texOffs(1, 2).addBox(-0.5F, -0.1F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone3);
		setRotationAngle(bone3, -3.1416F, 0.0F, -3.1416F);
		bone3.texOffs(94, 277).addBox(-20.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		bone3.texOffs(94, 315).addBox(-20.4F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone3.texOffs(94, 277).addBox(-20.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone3.texOffs(83, 270).addBox(-20.0F, -79.0F, -19.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone3.texOffs(83, 270).addBox(-17.9F, -79.0F, -21.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone3.texOffs(83, 270).addBox(-17.9F, -79.0F, 17.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone3.texOffs(94, 277).addBox(-20.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone3.texOffs(94, 315).addBox(-20.4F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone3.texOffs(83, 270).addBox(-20.0F, -79.0F, 15.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone3.texOffs(94, 315).addBox(-20.4F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone3.texOffs(94, 277).addBox(-20.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone3.texOffs(83, 270).addBox(-20.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone3.texOffs(94, 277).addBox(-20.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 1.5708F, 0.0F);
		bone2.texOffs(94, 277).addBox(-20.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		bone2.texOffs(94, 315).addBox(-20.4F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone2.texOffs(94, 277).addBox(-20.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(-20.0F, -79.0F, -19.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(-17.9F, -79.0F, -21.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(16.9F, -79.0F, -21.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(94, 277).addBox(-20.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone2.texOffs(94, 315).addBox(-20.4F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(-20.0F, -79.0F, 15.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(16.9F, -79.0F, 17.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(-17.9F, -79.0F, 17.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(94, 315).addBox(-20.4F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone2.texOffs(94, 277).addBox(-20.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone2.texOffs(83, 270).addBox(-20.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone2.texOffs(94, 277).addBox(-20.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone);
		bone.texOffs(94, 277).addBox(-20.0F, -8.0F, -15.0F, 1.0F, 4.0F, 30.0F, 0.0F, false);
		bone.texOffs(94, 315).addBox(-20.4F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone.texOffs(94, 277).addBox(-20.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone.texOffs(83, 270).addBox(-20.0F, -79.0F, -19.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone.texOffs(94, 277).addBox(-20.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone.texOffs(94, 315).addBox(-20.4F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone.texOffs(83, 270).addBox(-20.0F, -79.0F, 15.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone.texOffs(83, 270).addBox(-17.9F, -79.0F, 17.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone.texOffs(83, 270).addBox(-17.9F, -79.0F, -21.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone.texOffs(94, 315).addBox(-20.4F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bone.texOffs(94, 277).addBox(-20.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bone.texOffs(83, 270).addBox(-20.0F, -79.0F, -2.0F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		bone.texOffs(94, 277).addBox(-20.0F, -79.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.0F, 0.0F, 0.0F);
		Base.addChild(bone4);


		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(-24.0F, -3.3F, -24.0F);
		bone4.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.7854F);
		cube_r11.texOffs(48, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(-24.0F, -3.3F, 24.0F);
		bone4.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.7854F);
		cube_r12.texOffs(1, 49).addBox(-0.5F, -0.35F, -0.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-24.0F, -3.3F, 0.0F);
		bone4.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.texOffs(1, 2).addBox(-0.5F, -0.5F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);
		cube_r13.texOffs(1, 2).addBox(-0.5F, -0.1F, -24.0F, 1.0F, 1.0F, 48.0F, 0.0F, false);

		BOTI = new ModelRenderer(this);
		BOTI.setPos(0.0F, 21.0F, -18.75F);
		BOTI.texOffs(442, 436).addBox(-17.0F, -76.0F, -0.25F, 34.0F, 76.0F, 0.0F, 0.0F, false);}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
//		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		Base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
//		BOTI.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	@Override
	public void renderBones(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		matrixStack.pushPose();
		EnumDoorState state = exterior.getOpen();
//		matrixStack.translate(0.0D, 0.3D, 0.0D);
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
//		LeftDoor.y = 2.25F;
//		Shell.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.translate(0, 2.25, 0);
		this.LeftDoor.y = (float) -18.85;
		this.RightDoor.y = (float) -18.85;
		this.Emmisives.setBright(exterior.getLightLevel());
		this.LeftDoorEmmisive.setBright(exterior.getLightLevel());
		this.RightDoorEmmisives.setBright(exterior.getLightLevel());
		this.Base.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		this.Emmisives.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		this.LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
		this.RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, alpha);
//		BOTI.render(matrixStack, buffer, packedLight, packedOverlay,1,1,1, alpha);
		matrixStack.popPose();
	}

	public void renderBoti(ExteriorTile exterior, float scale, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float alpha) {
		if(exterior.getBotiWorld() != null && exterior.getOpen() != EnumDoorState.CLOSED) {
			PortalInfo info = new PortalInfo();
			info.setPosition(exterior.getBlockPos());
			info.setWorldShell(exterior.getBotiWorld());

			info.setTranslate(matrix -> {
				matrix.translate(-0.5, 0.1, -0.5);
				ExteriorRenderer.applyTransforms(matrix, exterior);
			});
			//Interior Portal Position
			info.setTranslatePortal(matrix -> {
				matrixStack.scale(1,1,1);
				matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
				matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(exterior.getBotiWorld().getPortalDirection())));
				matrix.translate(-0.5, -0.4, -0.5);
			});
			//Exterior Portal Location
			info.setRenderPortal((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(0.3f, 0.4f, 0.3f);
				this.BOTI.render(matrix, buf.getBuffer(RenderType.entityCutout(BrackolinRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});
			//Interior Doors Location
			info.setRenderDoor((matrix, buf) -> {
				matrix.pushPose();
				matrix.scale(0.8F, 0.8F, 0.8F);
				this.LeftDoor.render(matrix, buf.getBuffer(RenderType.entityCutout(McGannRender.TEXTURE)), packedLight, packedOverlay);
				this.RightDoor.render(matrix, buf.getBuffer(RenderType.entityCutout(McGannRender.TEXTURE)), packedLight, packedOverlay);
				matrix.popPose();
			});

			BOTIRenderer.addPortal(info);
		}

	}
}