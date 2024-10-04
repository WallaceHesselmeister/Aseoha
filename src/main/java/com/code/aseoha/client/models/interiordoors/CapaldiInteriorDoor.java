package com.code.aseoha.client.models.interiordoors;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.CapaldiRender;
import com.code.aseoha.client.renderers.exteriors.CoralRenderer;
import com.code.aseoha.enums.EnumDoorTypes;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.models.interiordoors.AbstractInteriorDoorModel;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.client.renderers.boti.PortalInfo;
import net.tardis.mod.client.renderers.entity.DoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class CapaldiInteriorDoor extends AbstractInteriorDoorModel {
	private final ModelRenderer Shell;
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
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer soto;

	public CapaldiInteriorDoor() {
		texWidth = 368;
		texHeight = 368;

		Shell = new ModelRenderer(this);
		Shell.setPos(0.0F, 23.0F, 0.0F);
		Shell.texOffs(47, 47).addBox(-27.0F, -3.0F, -27.0F, 54.0F, 4.0F, 7.0F, 0.0F, false);
		Shell.texOffs(46, 104).addBox(-26.0F, -4.0F, -26.0F, 52.0F, 1.0F, 6.0F, 0.0F, false);
		Shell.texOffs(63, 97).addBox(-18.0F, -87.0F, -25.0F, 36.0F, 1.0F, 5.0F, 0.0F, false);
		Shell.texOffs(86, 163).addBox(-25.0F, -87.0F, -25.0F, 7.0F, 83.0F, 5.0F, 0.0F, false);
		Shell.texOffs(268, 284).addBox(17.0F, -79.0F, -24.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(264, 284).addBox(-18.0F, -79.0F, -24.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(156, 108).addBox(-18.0F, -80.0F, -24.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(234, 7).addBox(-21.0F, -86.0F, -27.0F, 42.0F, 6.0F, 9.0F, 0.0F, false);
		Shell.texOffs(2, 163).addBox(18.0F, -87.0F, -25.0F, 7.0F, 83.0F, 5.0F, 0.0F, false);

		text_POLICE = new ModelRenderer(this);
		text_POLICE.setPos(0.0F, 1.0F, 0.0F);
		Shell.addChild(text_POLICE);
		

		character_p = new ModelRenderer(this);
		character_p.setPos(-2.1F, -34.25F, -9.25F);
		text_POLICE.addChild(character_p);
		character_p.texOffs(342, 109).addBox(-14.5F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_p.texOffs(342, 109).addBox(-13.3F, -51.2F, -18.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		character_p.texOffs(342, 109).addBox(-13.7F, -51.2F, -18.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_p.texOffs(342, 109).addBox(-13.7F, -50.0F, -18.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);

		text_BOX = new ModelRenderer(this);
		text_BOX.setPos(12.8F, -48.0F, -18.0F);
		character_p.addChild(text_BOX);
		

		character_b = new ModelRenderer(this);
		character_b.setPos(2.58F, -2.4F, 1.2F);
		text_BOX.addChild(character_b);
		character_b.texOffs(342, 109).addBox(-4.18F, -0.8F, -1.2F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_b.texOffs(342, 109).addBox(-3.38F, -0.8F, -1.2F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b.texOffs(342, 109).addBox(-3.38F, 1.6F, -1.2F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b.texOffs(342, 109).addBox(-3.38F, 0.4F, -1.2F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		character_b.texOffs(342, 109).addBox(-2.98F, 0.6F, -1.2F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		character_b.texOffs(342, 109).addBox(-2.98F, 1.0F, -1.2F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		character_b.texOffs(342, 109).addBox(-2.98F, -0.8F, -1.2F, 0.8F, 1.4F, 9.6F, 0.0F, false);

		text_PUBLIC = new ModelRenderer(this);
		text_PUBLIC.setPos(-13.78F, 0.9F, -1.2F);
		character_b.addChild(text_PUBLIC);
		

		character_p2 = new ModelRenderer(this);
		character_p2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_p2);
		character_p2.texOffs(342, 109).addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_p2.texOffs(342, 109).addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		character_p2.texOffs(342, 109).addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		character_p2.texOffs(342, 109).addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 9.55F, 0.0F, false);

		text_CALL = new ModelRenderer(this);
		text_CALL.setPos(-7.35F, -61.7F, -24.8F);
		character_p2.addChild(text_CALL);
		

		character_c3 = new ModelRenderer(this);
		character_c3.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_c3);
		character_c3.texOffs(342, 109).addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_c3.texOffs(342, 109).addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		character_c3.texOffs(342, 109).addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		character_a = new ModelRenderer(this);
		character_a.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_a);
		character_a.texOffs(342, 109).addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_a.texOffs(342, 109).addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		character_a.texOffs(342, 109).addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_a.texOffs(342, 109).addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 9.55F, 0.0F, false);

		character_l3 = new ModelRenderer(this);
		character_l3.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_l3);
		character_l3.texOffs(342, 109).addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_l3.texOffs(342, 109).addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		character_l4 = new ModelRenderer(this);
		character_l4.setPos(4.96F, 60.0F, 26.4F);
		text_CALL.addChild(character_l4);
		character_l4.texOffs(342, 109).addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_l4.texOffs(342, 109).addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		character_u = new ModelRenderer(this);
		character_u.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_u);
		character_u.texOffs(342, 109).addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_u.texOffs(342, 109).addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_u.texOffs(342, 109).addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 9.55F, 0.0F, false);

		character_b2 = new ModelRenderer(this);
		character_b2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_b2);
		character_b2.texOffs(342, 109).addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_b2.texOffs(342, 109).addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		character_b2.texOffs(342, 109).addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		character_b2.texOffs(342, 109).addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		character_b2.texOffs(342, 109).addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		character_b2.texOffs(342, 109).addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		character_b2.texOffs(342, 109).addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 9.55F, 0.0F, false);

		character_l2 = new ModelRenderer(this);
		character_l2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_l2);
		character_l2.texOffs(342, 109).addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_l2.texOffs(342, 109).addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		character_i2 = new ModelRenderer(this);
		character_i2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_i2);
		character_i2.texOffs(342, 109).addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);

		character_c2 = new ModelRenderer(this);
		character_c2.setPos(8.4F, 63.2F, 24.8F);
		text_PUBLIC.addChild(character_c2);
		character_c2.texOffs(342, 109).addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		character_c2.texOffs(342, 109).addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		character_c2.texOffs(342, 109).addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 9.55F, 0.0F, false);

		character_o2 = new ModelRenderer(this);
		character_o2.setPos(2.58F, -2.4F, 1.2F);
		text_BOX.addChild(character_o2);
		character_o2.texOffs(342, 109).addBox(-2.06F, -0.8F, -1.2F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o2.texOffs(342, 109).addBox(-1.26F, -0.8F, -1.2F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o2.texOffs(342, 109).addBox(-0.46F, -0.8F, -1.2F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o2.texOffs(342, 109).addBox(-1.26F, 1.6F, -1.2F, 0.8F, 0.8F, 9.6F, 0.0F, false);

		character_x = new ModelRenderer(this);
		character_x.setPos(2.58F, -2.4F, 1.2F);
		text_BOX.addChild(character_x);
		character_x.texOffs(342, 109).addBox(0.46F, 1.3F, -1.2F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(342, 109).addBox(0.46F, -0.8F, -1.2F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(342, 109).addBox(1.66F, -0.8F, -1.2F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(342, 109).addBox(1.66F, 1.3F, -1.2F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		character_x.texOffs(342, 109).addBox(0.96F, 0.1F, -1.2F, 1.0F, 1.4F, 9.6F, 0.0F, false);

		character_o = new ModelRenderer(this);
		character_o.setPos(-2.1F, -34.25F, -9.25F);
		text_POLICE.addChild(character_o);
		character_o.texOffs(342, 109).addBox(-12.38F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o.texOffs(342, 109).addBox(-11.58F, -51.2F, -18.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_o.texOffs(342, 109).addBox(-10.78F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_o.texOffs(342, 109).addBox(-11.58F, -48.8F, -18.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);

		character_l = new ModelRenderer(this);
		character_l.setPos(-2.1F, -34.25F, -9.25F);
		text_POLICE.addChild(character_l);
		character_l.texOffs(342, 109).addBox(-9.86F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_l.texOffs(342, 109).addBox(-9.06F, -48.8F, -18.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_i = new ModelRenderer(this);
		character_i.setPos(-2.1F, -34.25F, -9.25F);
		text_POLICE.addChild(character_i);
		character_i.texOffs(342, 109).addBox(-7.74F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		character_c = new ModelRenderer(this);
		character_c.setPos(-2.1F, -34.25F, -9.25F);
		text_POLICE.addChild(character_c);
		character_c.texOffs(342, 109).addBox(-6.82F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_c.texOffs(342, 109).addBox(-6.02F, -51.2F, -18.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_c.texOffs(342, 109).addBox(-6.02F, -48.8F, -18.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		character_e = new ModelRenderer(this);
		character_e.setPos(-2.1F, -34.25F, -9.25F);
		text_POLICE.addChild(character_e);
		character_e.texOffs(342, 109).addBox(-4.7F, -51.2F, -18.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		character_e.texOffs(342, 109).addBox(-3.9F, -51.2F, -18.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		character_e.texOffs(342, 109).addBox(-3.9F, -50.0F, -18.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		character_e.texOffs(342, 109).addBox(-3.9F, -48.8F, -18.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.9167F, -18.2308F, -23.0167F);
		LeftDoor.texOffs(6, 284).addBox(-0.0833F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 139).addBox(1.9167F, 34.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 284).addBox(14.9167F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 127).addBox(1.9167F, 19.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 111).addBox(1.9167F, 1.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 135).addBox(1.9167F, 16.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(28, 68).addBox(1.9167F, -16.7692F, 0.5167F, 13.0F, 15.0F, 7.0F, 0.0F, false);
		LeftDoor.texOffs(132, 131).addBox(1.9167F, -1.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 74).addBox(1.9167F, -34.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 127).addBox(1.9167F, -19.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(132, 123).addBox(1.9167F, -37.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(234, 281).addBox(15.9167F, -37.7692F, -0.9833F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(28, 0).addBox(13.9167F, -11.2692F, -0.4833F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.9167F, -18.1667F, -23.0167F);
		RightDoor.texOffs(228, 281).addBox(-16.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(222, 281).addBox(-1.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 119).addBox(-14.9167F, 34.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 58).addBox(-14.9167F, 19.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 115).addBox(-14.9167F, 16.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 32).addBox(-14.9167F, 1.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(132, 111).addBox(-14.9167F, -1.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.9167F, -16.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 106).addBox(-14.9167F, -19.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 48).addBox(-14.9167F, -37.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 0).addBox(-14.9167F, -34.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(28, 6).addBox(-15.9167F, -11.3333F, -0.9833F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		soto = new ModelRenderer(this);
		soto.setPos(0.0F, 24.0F, -25.0F);
		soto.texOffs(290, 289).addBox(-19.0F, -82.0F, -1.0F, 37.0F, 77.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		soto.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}


	@Override
	public void renderBones(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		matrixStack.pushPose();
		matrixStack.translate(0.0, 0.9, 0.0);
		matrixStack.scale(0.4F, 0.4F, 0.4F);
		matrixStack.mulPose(Vector3f.YP.rotationDegrees(90));
		EnumDoorState state = door.getOpenState();
		switch (state) {
			case ONE:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.ONE));
				break;
			case BOTH:
				this.RightDoor.yRot = (float) -Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.CAPALDI.getRotationForState(EnumDoorState.CLOSED));
		}
		matrixStack.mulPose(Vector3f.YN.rotationDegrees(90));
		this.LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.popPose();
	}


	@Override
	public void renderBoti(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {
		if(Minecraft.getInstance().level != null && doorEntity.getOpenState() != EnumDoorState.CLOSED){
			Minecraft.getInstance().level.getCapability(Capabilities.TARDIS_DATA).ifPresent(data -> {
				matrixStack.pushPose();
				PortalInfo info = new PortalInfo();
				info.setPosition(doorEntity.position());
				info.setWorldShell(data.getBotiWorld());

				info.setTranslate(matrix -> {
					matrix.scale(1.0f, 1.1f, 1.0f);
					matrix.translate(0.0, 0, -0.125);
					DoorRenderer.applyTranslations(matrix, doorEntity.yRot - 180, doorEntity.getDirection());
				});
				info.setTranslatePortal(matrix -> {
					matrix.mulPose(Vector3f.ZN.rotationDegrees(180));
					matrix.mulPose(Vector3f.YP.rotationDegrees(WorldHelper.getAngleFromFacing(data.getBotiWorld().getPortalDirection())));
					matrix.translate(-0.5, -1.75, -0.5);
				});

				info.setRenderPortal((matrix, impl) -> {
					matrix.pushPose();
					matrix.translate(-0.0, 1.0, 0.5f);
					matrix.scale(0.45F, 0.4F, 0.6F);
					this.soto.render(matrix, impl.getBuffer(RenderType.entityCutout(this.getTexture())), i, i1);
					matrix.popPose();
				});

				BOTIRenderer.addPortal(info);
				matrixStack.popPose();
			});
		}
	}

	public ResourceLocation getTexture(){return CapaldiRender.INT_TEXTURE;}
	}