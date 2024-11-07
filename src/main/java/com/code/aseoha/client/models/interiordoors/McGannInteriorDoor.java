package com.code.aseoha.client.models.interiordoors;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.client.renderers.exteriors.CapaldiRender;
import com.code.aseoha.client.renderers.exteriors.McGannRender;
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
import net.tardis.mod.helper.WorldHelper;

public class McGannInteriorDoor extends AbstractInteriorDoorModel {

	private final ModelRenderer Shell;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer text2;
	private final ModelRenderer text;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer phone;
	private final ModelRenderer LeftDoorEmmisive;
	private final ModelRenderer RightDoor;
	private final ModelRenderer RightDoorEmmisives;
	private final ModelRenderer bone;
	private final ModelRenderer soto;

	public McGannInteriorDoor() {
		texWidth = 512;
		texHeight = 512;

		Shell = new ModelRenderer(this);
		Shell.setPos(-17.0F, -47.05F, -2.05F);
		Shell.texOffs(83, 270).addBox(-0.9F, -3.95F, -19.95F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(-0.9F, -3.95F, -18.95F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(-6.1F, -3.95F, -18.95F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(-6.1F, -11.95F, -18.95F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(-6.05F, -12.0F, -18.95F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(39.1F, -11.95F, -18.95F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(39.05F, -12.0F, -18.95F, 1.0F, 8.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(33.9F, -3.95F, -18.95F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(33.9F, -4.95F, -18.95F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(-0.9F, -4.95F, -18.95F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		Shell.texOffs(83, 270).addBox(39.1F, -3.95F, -18.95F, 1.0F, 75.0F, 4.0F, 0.0F, false);
		Shell.texOffs(476, 0).addBox(17.0F, -11.95F, -21.05F, 18.0F, 83.0F, 0.0F, 0.0F, false);
		Shell.texOffs(476, 0).addBox(-1.0F, -11.95F, -21.05F, 18.0F, 83.0F, 0.0F, 0.0F, false);
		Shell.texOffs(72, 149).addBox(-6.0F, -11.95F, -20.95F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		Shell.texOffs(48, 149).addBox(34.0F, -11.95F, -20.95F, 6.0F, 83.0F, 6.0F, 0.0F, false);
		Shell.texOffs(68, 271).addBox(0.0F, -3.95F, -19.95F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(90, 149).addBox(0.0F, -4.95F, -19.95F, 34.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(64, 271).addBox(33.0F, -3.95F, -19.95F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		Shell.texOffs(182, 0).addBox(-3.0F, -10.95F, -23.95F, 40.0F, 6.0F, 5.0F, 0.0F, false);
		Shell.texOffs(182, 0).addBox(-3.0F, -10.95F, -18.95F, 40.0F, 6.0F, 5.0F, 0.0F, false);
		Shell.texOffs(39, 141).addBox(-4.0F, -15.95F, -18.95F, 42.0F, 5.0F, 3.0F, 0.0F, false);
		Shell.texOffs(73, 390).addBox(-4.0F, -4.95F, -16.95F, 42.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(74, 389).addBox(-4.0F, -15.95F, -15.8F, 42.0F, 5.0F, 0.0F, 0.0F, false);
		Shell.texOffs(116, 389).addBox(38.0F, -14.95F, -15.8F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Shell.texOffs(116, 389).addBox(-5.0F, -14.95F, -15.8F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		Shell.texOffs(73, 390).addBox(-4.0F, -4.95F, -18.95F, 42.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(73, 390).addBox(-4.0F, -4.95F, -17.95F, 42.0F, 1.0F, 1.0F, 0.0F, false);
		Shell.texOffs(28, 31).addBox(-5.0F, -14.95F, -19.95F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Shell.texOffs(28, 24).addBox(35.0F, -14.95F, -19.95F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.texOffs(84, 271).addBox(14.9F, -12.0F, -3.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-3.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.texOffs(84, 271).addBox(14.9F, -12.0F, -3.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(41.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 1.5708F, 0.0F);
		cube_r3.texOffs(84, 271).addBox(14.9F, -12.0F, -4.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(38.0F, 0.0F, 0.0F);
		Shell.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
		cube_r4.texOffs(84, 271).addBox(14.9F, -12.0F, -4.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(-3.0F, 0.05F, 0.05F);
		Shell.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 1.5708F, 0.0F);
		cube_r5.texOffs(84, 271).addBox(14.9F, -12.0F, -3.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r5.texOffs(84, 271).addBox(14.9F, -4.0F, -3.0F, 1.0F, 75.0F, 3.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, 0.05F, 0.05F);
		Shell.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
		cube_r6.texOffs(84, 271).addBox(14.9F, -12.0F, -3.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r6.texOffs(84, 271).addBox(14.9F, -4.0F, -3.0F, 1.0F, 75.0F, 3.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(41.0F, 0.05F, 0.05F);
		Shell.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 1.5708F, 0.0F);
		cube_r7.texOffs(84, 271).addBox(14.9F, -12.0F, -4.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r7.texOffs(84, 271).addBox(14.9F, -4.0F, -4.0F, 1.0F, 75.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(33.55F, 5.1F, 0.05F);
		Shell.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 1.5708F, 0.0F);
		cube_r8.texOffs(92, 361).addBox(13.9F, -11.0F, -32.0F, 2.0F, 1.0F, 31.0F, 0.0F, false);
		cube_r8.texOffs(92, 361).addBox(13.9F, -16.1F, -32.0F, 2.0F, 1.0F, 31.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(37.2F, 0.0F, 0.05F);
		Shell.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 1.5708F, 0.0F);
		cube_r9.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r9.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(38.1F, 0.0F, 0.05F);
		Shell.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 1.5708F, 0.0F);
		cube_r10.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r10.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(36.2F, 0.0F, 0.05F);
		Shell.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 1.5708F, 0.0F);
		cube_r11.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r11.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(34.2F, 0.0F, 0.05F);
		Shell.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 1.5708F, 0.0F);
		cube_r12.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r12.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(35.2F, 0.0F, 0.05F);
		Shell.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 1.5708F, 0.0F);
		cube_r13.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r13.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(-1.1F, 0.0F, 0.05F);
		Shell.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 1.5708F, 0.0F);
		cube_r14.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r14.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-0.1F, 0.0F, 0.05F);
		Shell.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 1.5708F, 0.0F);
		cube_r15.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r15.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.9F, 0.0F, 0.05F);
		Shell.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 1.5708F, 0.0F);
		cube_r16.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r16.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(1.9F, 0.0F, 0.05F);
		Shell.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 1.5708F, 0.0F);
		cube_r17.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r17.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(2.9F, 0.0F, 0.05F);
		Shell.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 1.5708F, 0.0F);
		cube_r18.texOffs(85, 274).addBox(13.9F, -11.0F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r18.texOffs(85, 274).addBox(13.9F, -10.9F, -2.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(38.0F, 0.05F, 0.05F);
		Shell.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 1.5708F, 0.0F);
		cube_r19.texOffs(84, 271).addBox(14.9F, -12.0F, -4.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r19.texOffs(84, 271).addBox(14.9F, -4.0F, -4.0F, 1.0F, 75.0F, 3.0F, 0.0F, false);

		text2 = new ModelRenderer(this);
		text2.setPos(3.4F, -6.4F, -23.4F);
		Shell.addChild(text2);
		text2.texOffs(292, 53).addBox(10.6F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(20.7F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(13.3F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(14.35F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(14.75F, -1.6F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(14.75F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(15.41F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(15.81F, -1.6F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.01F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(15.81F, -1.0F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.47F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.87F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(17.53F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(17.93F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(13.9F, -3.1F, 0.0F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(13.7F, -3.1F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(13.7F, -2.5F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(14.36F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(15.16F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(14.76F, -1.9F, 0.0F, 0.4F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(15.62F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.02F, -3.1F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.02F, -1.9F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.02F, -2.5F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.22F, -2.4F, 0.0F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.22F, -2.2F, 0.0F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.22F, -3.1F, 0.0F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(16.68F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(17.08F, -1.9F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(17.74F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(18.2F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(18.6F, -3.1F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(18.6F, -1.9F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text2.texOffs(292, 53).addBox(21.5F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(21.5F, -0.8F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(21.5F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(21.9F, -1.8F, 0.0F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(21.9F, -1.4F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(21.9F, -3.2F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(22.82F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(23.62F, -3.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(24.42F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(23.62F, -0.8F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(25.34F, -1.1F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(25.34F, -3.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(26.54F, -3.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(26.54F, -1.1F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(25.84F, -2.3F, 0.0F, 1.0F, 1.4F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(1.2F, -3.2F, 0.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(0.8F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(0.8F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(2.12F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(2.92F, -3.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(3.72F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(2.92F, -0.8F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(4.64F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(5.44F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(6.76F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(7.68F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(8.48F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(8.48F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(9.8F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(10.6F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(10.6F, -2.0F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text2.texOffs(292, 53).addBox(0.0F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		text = new ModelRenderer(this);
		text.setPos(3.4F, -6.4F, -24.0F);
		Shell.addChild(text);
		text.texOffs(292, 53).addBox(10.6F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(20.7F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(13.3F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(14.35F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(14.75F, -1.6F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(14.75F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(15.41F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(15.81F, -1.6F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.01F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(15.81F, -1.0F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.47F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.87F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(17.53F, -1.6F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(17.93F, -0.4F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(13.9F, -3.1F, 0.0F, 0.4F, 1.0F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(13.7F, -3.1F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(13.7F, -2.5F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(14.36F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(15.16F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(14.76F, -1.9F, 0.0F, 0.4F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(15.62F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.02F, -3.1F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.02F, -1.9F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.02F, -2.5F, 0.0F, 0.2F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.22F, -2.4F, 0.0F, 0.2F, 0.2F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.22F, -2.2F, 0.0F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.22F, -3.1F, 0.0F, 0.4F, 0.7F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(16.68F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(17.08F, -1.9F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(17.74F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(18.2F, -3.1F, 0.0F, 0.4F, 1.6F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(18.6F, -3.1F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(18.6F, -1.9F, 0.0F, 0.6F, 0.4F, 9.55F, 0.0F, false);
		text.texOffs(292, 53).addBox(21.5F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(21.5F, -0.8F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(21.5F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(21.9F, -1.8F, 0.0F, 0.4F, 0.4F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(21.9F, -1.4F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(21.9F, -3.2F, 0.0F, 0.8F, 1.4F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(22.82F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(23.62F, -3.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(24.42F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(23.62F, -0.8F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(25.34F, -1.1F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(25.34F, -3.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(26.54F, -3.2F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(26.54F, -1.1F, 0.0F, 0.8F, 1.1F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(25.84F, -2.3F, 0.0F, 1.0F, 1.4F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(1.2F, -3.2F, 0.0F, 0.8F, 2.0F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(0.8F, -3.2F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(0.8F, -2.0F, 0.0F, 0.4F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(2.12F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(2.92F, -3.2F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(3.72F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(2.92F, -0.8F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(4.64F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(5.44F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(6.76F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(7.68F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(8.48F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(8.48F, -0.8F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(9.8F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(10.6F, -3.2F, 0.0F, 1.2F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(10.6F, -2.0F, 0.0F, 0.8F, 0.8F, 9.6F, 0.0F, false);
		text.texOffs(292, 53).addBox(0.0F, -3.2F, 0.0F, 0.8F, 3.2F, 9.6F, 0.0F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setPos(-16.0F, -14.7692F, -21.0F);
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
		LeftDoor.texOffs(0, 0).addBox(1.0F, -34.2308F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(94, 327).addBox(1.0F, -34.2308F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(0, 134).addBox(1.0F, -36.2308F, 0.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, -19.2308F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(86, 273).addBox(14.0F, -36.2308F, 1.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, -36.2308F, 1.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(86, 273).addBox(0.0F, -36.2308F, 1.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, 16.7692F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, -1.2308F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(110, 306).addBox(1.0F, 34.7692F, 1.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		LeftDoor.texOffs(87, 274).addBox(-0.9F, -36.2308F, 2.05F, 1.0F, 75.0F, 0.0F, 0.0F, false);

		phone = new ModelRenderer(this);
		phone.setPos(14.0F, -1.2308F, 0.5F);
		LeftDoor.addChild(phone);
		phone.texOffs(0, 32).addBox(-13.0F, -15.0F, 0.0F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		phone.texOffs(44, 14).addBox(-13.0F, -9.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		phone.texOffs(129, 328).addBox(-13.0F, -15.0F, 1.0F, 13.0F, 15.0F, 0.0F, 0.0F, false);
		phone.texOffs(40, 6).addBox(-1.0F, -9.5F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		LeftDoorEmmisive = new ModelRenderer(this);
		LeftDoorEmmisive.setPos(16.0F, -15.2308F, 22.0F);
		LeftDoor.addChild(LeftDoorEmmisive);
		LeftDoorEmmisive.texOffs(0, 480).addBox(-15.0F, -19.0F, -21.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setPos(16.0F, -14.7692F, -21.0F);
		RightDoor.texOffs(0, 271).addBox(-16.0F, -36.2308F, 0.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(126, 120).addBox(-14.0F, 34.7692F, 0.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(144, 65).addBox(-14.0F, 16.7692F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 102).addBox(-14.0F, 19.7692F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 85).addBox(-14.0F, 1.7692F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(43, 9).addBox(-15.0F, -7.2308F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(44, 18).addBox(-15.0F, -11.2308F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(144, 53).addBox(-14.0F, -1.2308F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 53).addBox(-14.0F, -16.2308F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(127, 327).addBox(-14.0F, -16.2308F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(127, 327).addBox(-14.0F, 1.7692F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(127, 327).addBox(-14.0F, 19.7692F, 0.6F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 138).addBox(-14.0F, -19.2308F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(0, 16).addBox(-14.0F, -34.2308F, 0.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(94, 327).addBox(-14.0F, -34.2308F, 0.7F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(126, 130).addBox(-14.0F, -36.2308F, 0.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(32, 271).addBox(-1.0F, -36.2308F, 0.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, 34.7692F, 1.0F, 13.0F, 4.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(86, 273).addBox(-16.0F, -36.2308F, 1.0F, 2.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(86, 273).addBox(-1.0F, -36.2308F, 1.0F, 1.0F, 75.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, 16.7692F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, -1.2308F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, -19.2308F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(110, 306).addBox(-14.0F, -36.2308F, 1.0F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		RightDoor.texOffs(87, 274).addBox(-0.1F, -36.2308F, 2.05F, 1.0F, 75.0F, 0.0F, 0.0F, false);

		RightDoorEmmisives = new ModelRenderer(this);
		RightDoorEmmisives.setPos(-16.0F, -15.2308F, 74.0F);
		RightDoor.addChild(RightDoorEmmisives);
		RightDoorEmmisives.texOffs(0, 496).addBox(2.0F, -19.0F, -73.5F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, -0.0641F, 52.0F);
		RightDoor.addChild(bone);


		soto = new ModelRenderer(this);
		soto.setPos(0.0F, 24.0F, -23.0F);
		soto.texOffs(440, 434).addBox(-17.0F, -76.0F, -1.0F, 34.0F, 76.0F, 2.0F, 0.0F, false);
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
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.MCGANN.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.MCGANN.getRotationForState(EnumDoorState.ONE));
				break;
			case BOTH:
				this.RightDoor.yRot = (float) -Math.toRadians(EnumDoorTypes.MCGANN.getRotationForState(EnumDoorState.BOTH));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.MCGANN.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.yRot = (float) Math.toRadians(EnumDoorTypes.MCGANN.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.yRot = (float) Math.toRadians(EnumDoorTypes.MCGANN.getRotationForState(EnumDoorState.CLOSED));
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

	public ResourceLocation getTexture(){return McGannRender.INT_TEXTURE;}

	}