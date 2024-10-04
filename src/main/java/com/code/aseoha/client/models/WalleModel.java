package com.code.aseoha.client.models;// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.code.aseoha.aseoha;
import com.code.aseoha.entities.Walle;
import com.code.aseoha.entities.k9;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;

public class WalleModel <T extends Walle> extends EntityModel<T> {//WalleModel extends EntityModel<Entity> {
	private final ModelRenderer base;
	private final ModelRenderer Tracks;
	private final ModelRenderer RightTrack;
	private final ModelRenderer RTrackWheels;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer RightTrackPlates;
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
	private final ModelRenderer LeftTrack;
	private final ModelRenderer LTrackWheels;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer LeftTrackPlates;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer TrackSuspension;
	private final ModelRenderer RightTrackSus;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer LeftTrackSus;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer Body;
	private final ModelRenderer UpperHalf;
	private final ModelRenderer Arms;
	private final ModelRenderer Right;
	private final ModelRenderer RHand;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer Left;
	private final ModelRenderer LHand;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer Head;
	private final ModelRenderer Neck;
	private final ModelRenderer Eyesockets;
	private final ModelRenderer cube_r47;
	private final ModelRenderer bone;
	private final ModelRenderer LowerHinge;
	private final ModelRenderer UpperHing;
	private final ModelRenderer Eyes;
	private final ModelRenderer RightEye;
	private final ModelRenderer cube_r48;
	private final ModelRenderer LeftEye;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer LowerHalf;
	private final ModelRenderer Hatch;
	private final ModelRenderer Crusher;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;

	public WalleModel() {
		texWidth = 128;
		texHeight = 128;

		base = new ModelRenderer(this);
		base.setPos(0.0F, 24.0F, 0.0F);


		Tracks = new ModelRenderer(this);
		Tracks.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(Tracks);


		RightTrack = new ModelRenderer(this);
		RightTrack.setPos(0.0F, 0.0F, 0.0F);
		Tracks.addChild(RightTrack);
		RightTrack.texOffs(20, 30).addBox(9.75F, -13.75F, -7.0F, 1.0F, 13.0F, 17.0F, 0.0F, false);

		RTrackWheels = new ModelRenderer(this);
		RTrackWheels.setPos(11.5F, 0.0F, 0.0F);
		RightTrack.addChild(RTrackWheels);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, -11.5F, 3.0F);
		RTrackWheels.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.texOffs(7, 108).addBox(-1.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, -7.0F, -2.0F);
		RTrackWheels.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.8762F, 0.0F, 0.0F);
		cube_r2.texOffs(0, 108).addBox(-1.0F, -1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -3.15F, -4.85F);
		RTrackWheels.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.3927F, 0.0F, 0.0F);
		cube_r3.texOffs(56, 63).addBox(-1.0F, -1.2338F, -1.7246F, 1.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-0.5F, -4.25F, 7.0F);
		RTrackWheels.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3503F, 0.0F, 0.0F);
		cube_r4.texOffs(39, 0).addBox(-0.5019F, -2.6122F, -2.5807F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -4.4F, 6.0F);
		RTrackWheels.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
		cube_r5.texOffs(70, 15).addBox(-1.5F, -2.5456F, -8.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		RightTrackPlates = new ModelRenderer(this);
		RightTrackPlates.setPos(0.0F, 0.0F, 0.0F);
		RightTrack.addChild(RightTrackPlates);
		RightTrackPlates.texOffs(18, 61).addBox(8.0F, -1.0F, -5.0F, 5.0F, 1.0F, 13.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.0F, -8.8284F, 10.8284F);
		RightTrackPlates.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.5708F, 0.0F, 0.0F);
		cube_r6.texOffs(28, 105).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.0F, -13.8121F, -2.3841F);
		RightTrackPlates.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.098F, 0.0F, 0.0F);
		cube_r7.texOffs(56, 9).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(10.5F, -0.737F, -5.6181F);
		RightTrackPlates.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3054F, 0.0F, 0.0F);
		cube_r8.texOffs(104, 44).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.0F, 3.1346F, -5.1914F);
		RightTrackPlates.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1781F, 0.0F, 0.0F);
		cube_r9.texOffs(104, 91).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.0F, 1.5571F, -8.0096F);
		RightTrackPlates.addChild(cube_r10);
		setRotationAngle(cube_r10, -1.7017F, 0.0F, 0.0F);
		cube_r10.texOffs(92, 104).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.0F, -1.018F, -9.3756F);
		RightTrackPlates.addChild(cube_r11);
		setRotationAngle(cube_r11, -2.138F, 0.0F, 0.0F);
		cube_r11.texOffs(105, 25).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.0F, -9.6139F, -2.6163F);
		RightTrackPlates.addChild(cube_r12);
		setRotationAngle(cube_r12, -2.3562F, 0.0F, 0.0F);
		cube_r12.texOffs(74, 60).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 11.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(0.0F, -12.9883F, -3.2977F);
		RightTrackPlates.addChild(cube_r13);
		setRotationAngle(cube_r13, -2.9671F, 0.0F, 0.0F);
		cube_r13.texOffs(40, 36).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(0.0F, -15.5773F, -1.1584F);
		RightTrackPlates.addChild(cube_r14);
		setRotationAngle(cube_r14, 2.8362F, 0.0F, 0.0F);
		cube_r14.texOffs(63, 36).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(0.0F, -15.2476F, 3.2127F);
		RightTrackPlates.addChild(cube_r15);
		setRotationAngle(cube_r15, 2.3126F, 0.0F, 0.0F);
		cube_r15.texOffs(96, 38).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.0F, -12.4623F, 6.1191F);
		RightTrackPlates.addChild(cube_r16);
		setRotationAngle(cube_r16, 2.1817F, 0.0F, 0.0F);
		cube_r16.texOffs(96, 56).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(0.0F, -10.2663F, 8.2927F);
		RightTrackPlates.addChild(cube_r17);
		setRotationAngle(cube_r17, 2.0071F, 0.0F, 0.0F);
		cube_r17.texOffs(97, 86).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(0.0F, -4.2426F, 12.2426F);
		RightTrackPlates.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
		cube_r18.texOffs(61, 96).addBox(8.0F, -1.0F, -6.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		LeftTrack = new ModelRenderer(this);
		LeftTrack.setPos(0.0F, 0.0F, 0.0F);
		Tracks.addChild(LeftTrack);
		LeftTrack.texOffs(0, 16).addBox(-10.75F, -13.75F, -7.0F, 1.0F, 13.0F, 17.0F, 0.0F, false);

		LTrackWheels = new ModelRenderer(this);
		LTrackWheels.setPos(-11.5F, 0.0F, 0.0F);
		LeftTrack.addChild(LTrackWheels);


		cube_r19 = new ModelRenderer(this);
		cube_r19.setPos(0.0F, -11.5F, 3.0F);
		LTrackWheels.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.2618F, 0.0F, 0.0F);
		cube_r19.texOffs(7, 108).addBox(0.0F, -1.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setPos(0.0F, -7.0F, -2.0F);
		LTrackWheels.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.8762F, 0.0F, 0.0F);
		cube_r20.texOffs(0, 108).addBox(0.0F, -1.0F, -0.75F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setPos(0.5F, -4.25F, 7.0F);
		LTrackWheels.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3503F, 0.0F, 0.0F);
		cube_r21.texOffs(39, 0).addBox(-0.7481F, -2.6122F, -2.5807F, 1.0F, 5.0F, 5.0F, 0.0F, true);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setPos(0.0F, -3.15F, -4.85F);
		LTrackWheels.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
		cube_r22.texOffs(56, 63).addBox(0.0F, -1.2796F, -1.7553F, 1.0F, 3.0F, 3.0F, 0.0F, true);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setPos(0.0F, -4.4F, 6.0F);
		LTrackWheels.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.7854F, 0.0F, 0.0F);
		cube_r23.texOffs(9, 53).addBox(0.5F, -2.5456F, -8.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		LeftTrackPlates = new ModelRenderer(this);
		LeftTrackPlates.setPos(0.0F, 0.0F, 0.0F);
		LeftTrack.addChild(LeftTrackPlates);
		LeftTrackPlates.texOffs(56, 0).addBox(-13.0F, -1.0F, -5.0F, 5.0F, 1.0F, 13.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setPos(0.0F, -8.8284F, 10.8284F);
		LeftTrackPlates.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.5708F, 0.0F, 0.0F);
		cube_r24.texOffs(84, 38).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setPos(0.0F, -13.8121F, -2.3841F);
		LeftTrackPlates.addChild(cube_r25);
		setRotationAngle(cube_r25, -3.098F, 0.0F, 0.0F);
		cube_r25.texOffs(0, 11).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setPos(-10.5F, -0.737F, -5.6181F);
		LeftTrackPlates.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.3054F, 0.0F, 0.0F);
		cube_r26.texOffs(64, 102).addBox(-2.5F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setPos(0.0F, 3.1346F, -5.1914F);
		LeftTrackPlates.addChild(cube_r27);
		setRotationAngle(cube_r27, -1.1781F, 0.0F, 0.0F);
		cube_r27.texOffs(79, 102).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setPos(0.0F, 1.5571F, -8.0096F);
		LeftTrackPlates.addChild(cube_r28);
		setRotationAngle(cube_r28, -1.7017F, 0.0F, 0.0F);
		cube_r28.texOffs(15, 103).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setPos(0.0F, -1.018F, -9.3756F);
		LeftTrackPlates.addChild(cube_r29);
		setRotationAngle(cube_r29, -2.138F, 0.0F, 0.0F);
		cube_r29.texOffs(0, 104).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setPos(0.0F, -9.6139F, -2.6163F);
		LeftTrackPlates.addChild(cube_r30);
		setRotationAngle(cube_r30, -2.3562F, 0.0F, 0.0F);
		cube_r30.texOffs(66, 47).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 11.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setPos(0.0F, -12.9883F, -3.2977F);
		LeftTrackPlates.addChild(cube_r31);
		setRotationAngle(cube_r31, -2.9671F, 0.0F, 0.0F);
		cube_r31.texOffs(20, 30).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setPos(0.0F, -15.5773F, -1.1584F);
		LeftTrackPlates.addChild(cube_r32);
		setRotationAngle(cube_r32, 2.8362F, 0.0F, 0.0F);
		cube_r32.texOffs(39, 11).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setPos(0.0F, -15.2476F, 3.2127F);
		LeftTrackPlates.addChild(cube_r33);
		setRotationAngle(cube_r33, 2.3126F, 0.0F, 0.0F);
		cube_r33.texOffs(17, 76).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setPos(0.0F, -12.4623F, 6.1191F);
		LeftTrackPlates.addChild(cube_r34);
		setRotationAngle(cube_r34, 2.1817F, 0.0F, 0.0F);
		cube_r34.texOffs(56, 80).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setPos(0.0F, -10.2663F, 8.2927F);
		LeftTrackPlates.addChild(cube_r35);
		setRotationAngle(cube_r35, 2.0071F, 0.0F, 0.0F);
		cube_r35.texOffs(80, 97).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setPos(0.0F, -4.2426F, 12.2426F);
		LeftTrackPlates.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.7854F, 0.0F, 0.0F);
		cube_r36.texOffs(93, 9).addBox(-13.0F, -1.0F, -6.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		TrackSuspension = new ModelRenderer(this);
		TrackSuspension.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(TrackSuspension);


		RightTrackSus = new ModelRenderer(this);
		RightTrackSus.setPos(0.0F, 0.0F, 0.0F);
		TrackSuspension.addChild(RightTrackSus);
		RightTrackSus.texOffs(88, 22).addBox(4.0F, -6.0F, 0.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		RightTrackSus.texOffs(43, 106).addBox(9.0F, -4.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r37 = new ModelRenderer(this);
		cube_r37.setPos(6.366F, -8.0981F, 0.5F);
		RightTrackSus.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -1.789F);
		cube_r37.texOffs(52, 106).addBox(-3.0F, -0.8F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r38 = new ModelRenderer(this);
		cube_r38.setPos(6.366F, -8.0981F, 0.5F);
		RightTrackSus.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, -1.0472F);
		cube_r38.texOffs(63, 106).addBox(-3.0F, -1.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setPos(10.0F, -3.3652F, -1.0567F);
		RightTrackSus.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.1309F, 0.0F, 0.0F);
		cube_r39.texOffs(0, 71).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 12.0F, 0.001F, false);

		LeftTrackSus = new ModelRenderer(this);
		LeftTrackSus.setPos(0.0F, 0.0F, 0.0F);
		TrackSuspension.addChild(LeftTrackSus);
		LeftTrackSus.texOffs(40, 42).addBox(-11.0F, -6.0F, 0.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		LeftTrackSus.texOffs(0, 75).addBox(-11.0F, -4.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setPos(-6.366F, -8.0981F, 0.5F);
		LeftTrackSus.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, 1.789F);
		cube_r40.texOffs(0, 71).addBox(0.0F, -0.8F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r41 = new ModelRenderer(this);
		cube_r41.setPos(-6.366F, -8.0981F, 0.5F);
		LeftTrackSus.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, 1.0472F);
		cube_r41.texOffs(74, 63).addBox(0.0F, -1.0F, -0.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r42 = new ModelRenderer(this);
		cube_r42.setPos(-10.0F, -3.3652F, -1.0567F);
		LeftTrackSus.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.1309F, 0.0F, 0.0F);
		cube_r42.texOffs(20, 16).addBox(-1.0F, -0.5F, -4.0F, 2.0F, 1.0F, 12.0F, 0.001F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(Body);


		UpperHalf = new ModelRenderer(this);
		UpperHalf.setPos(0.0F, -16.5F, 8.0F);
		Body.addChild(UpperHalf);
		UpperHalf.texOffs(88, 15).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 5.0F, 1.0F, 0.0F, false);
		UpperHalf.texOffs(63, 15).addBox(-3.0F, -5.0F, -13.0F, 6.0F, 1.0F, 12.0F, 0.0F, false);
		UpperHalf.texOffs(97, 97).addBox(-3.0F, -5.0F, -14.0F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		UpperHalf.texOffs(40, 26).addBox(-7.0F, -5.0F, -14.0F, 4.0F, 1.0F, 14.0F, 0.0F, false);
		UpperHalf.texOffs(65, 30).addBox(-6.0F, -4.0F, -13.0F, 3.0F, 4.0F, 12.0F, 0.0F, false);
		UpperHalf.texOffs(55, 63).addBox(3.0F, -4.0F, -13.0F, 3.0F, 4.0F, 12.0F, 0.0F, false);
		UpperHalf.texOffs(43, 47).addBox(3.0F, -5.0F, -14.0F, 4.0F, 1.0F, 14.0F, 0.0F, false);
		UpperHalf.texOffs(11, 16).addBox(6.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		UpperHalf.texOffs(0, 16).addBox(-7.0F, -4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		Arms = new ModelRenderer(this);
		Arms.setPos(0.0F, 16.5F, -8.0F);
		UpperHalf.addChild(Arms);


		Right = new ModelRenderer(this);
		Right.setPos(8.0F, -18.5F, 5.5F);
		Arms.addChild(Right);
		Right.texOffs(43, 112).addBox(-1.0F, -1.0F, -13.5F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		Right.texOffs(83, 86).addBox(-1.5F, -1.5F, -7.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);
		Right.texOffs(96, 62).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		RHand = new ModelRenderer(this);
		RHand.setPos(-0.5F, -1.0F, -13.5F);
		Right.addChild(RHand);
		setRotationAngle(RHand, -0.2182F, 0.0F, 0.0F);


		cube_r43 = new ModelRenderer(this);
		cube_r43.setPos(0.5F, 0.0F, 0.0F);
		RHand.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, -0.0436F);
		cube_r43.texOffs(14, 107).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r44 = new ModelRenderer(this);
		cube_r44.setPos(0.5F, 0.0F, 0.0F);
		RHand.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, 0.0436F);
		cube_r44.texOffs(21, 107).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		Left = new ModelRenderer(this);
		Left.setPos(-8.0F, -18.5F, 5.5F);
		Arms.addChild(Left);
		Left.texOffs(77, 112).addBox(-1.0F, -1.0F, -13.5F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		Left.texOffs(42, 63).addBox(-1.5F, -1.5F, -7.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);
		Left.texOffs(17, 95).addBox(-2.0F, -2.0F, -1.5F, 4.0F, 4.0F, 3.0F, 0.0F, false);

		LHand = new ModelRenderer(this);
		LHand.setPos(0.5F, -1.0F, -13.5F);
		Left.addChild(LHand);
		setRotationAngle(LHand, -0.2182F, 0.0F, 0.0F);


		cube_r45 = new ModelRenderer(this);
		cube_r45.setPos(-0.5F, 0.0F, 0.0F);
		LHand.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, 0.0436F);
		cube_r45.texOffs(42, 63).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r46 = new ModelRenderer(this);
		cube_r46.setPos(-0.5F, 0.0F, 0.0F);
		LHand.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.0436F);
		cube_r46.texOffs(83, 86).addBox(0.0F, 0.0F, 0.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 16.5F, -8.0F);
		UpperHalf.addChild(Head);


		Neck = new ModelRenderer(this);
		Neck.setPos(0.0F, 0.0F, 0.0F);
		Head.addChild(Neck);


		Eyesockets = new ModelRenderer(this);
		Eyesockets.setPos(0.0F, -29.75F, 4.4393F);
		Neck.addChild(Eyesockets);
		Eyesockets.texOffs(66, 52).addBox(-1.5F, 6.75F, -1.9393F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		Eyesockets.texOffs(0, 47).addBox(-1.5F, 2.0F, -3.9393F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		Eyesockets.texOffs(0, 25).addBox(-1.5F, 1.0F, -5.9393F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		Eyesockets.texOffs(74, 67).addBox(-1.5F, 0.0F, -2.9393F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		Eyesockets.texOffs(0, 95).addBox(-1.5F, -1.75F, -6.1893F, 3.0F, 3.0F, 5.0F, -0.25F, false);
		Eyesockets.texOffs(40, 30).addBox(-1.5F, -1.75F, -1.6893F, 3.0F, 2.0F, 3.0F, -0.25F, false);

		cube_r47 = new ModelRenderer(this);
		cube_r47.setPos(0.0F, 0.0F, 0.0F);
		Eyesockets.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.7854F, 0.0F, 0.0F);
		cube_r47.texOffs(20, 16).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 2.0F, -0.25F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 0.0F, 0.0F);
		Eyesockets.addChild(bone);


		LowerHinge = new ModelRenderer(this);
		LowerHinge.setPos(0.0F, -22.5F, 3.5F);
		Neck.addChild(LowerHinge);
		setRotationAngle(LowerHinge, 1.1345F, 0.0F, 0.0F);
		LowerHinge.texOffs(56, 0).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		UpperHing = new ModelRenderer(this);
		UpperHing.setPos(0.0F, -5.0091F, -1.0421F);
		LowerHinge.addChild(UpperHing);
		setRotationAngle(UpperHing, -2.2689F, 0.0F, 0.0F);
		UpperHing.texOffs(0, 53).addBox(-1.0F, -5.0381F, -2.0201F, 2.0F, 5.0F, 2.0F, 0.01F, false);

		Eyes = new ModelRenderer(this);
		Eyes.setPos(0.0F, 0.0F, 0.0F);
		Head.addChild(Eyes);


		RightEye = new ModelRenderer(this);
		RightEye.setPos(0.75F, 0.0F, 0.0F);
		Eyes.addChild(RightEye);


		cube_r48 = new ModelRenderer(this);
		cube_r48.setPos(3.0F, -29.5F, -3.5F);
		RightEye.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, 0.0873F);
		cube_r48.texOffs(79, 73).addBox(-3.5F, -2.0F, 2.0F, 6.0F, 5.0F, 7.0F, -0.5F, false);
		cube_r48.texOffs(30, 101).addBox(-3.0F, 2.0F, -2.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r48.texOffs(47, 102).addBox(-3.0F, -2.0F, -2.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r48.texOffs(81, 106).addBox(2.0F, -1.0F, -2.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r48.texOffs(105, 106).addBox(-3.0F, -1.0F, -2.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r48.texOffs(66, 47).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r48.texOffs(31, 89).addBox(-3.0F, -2.0F, -0.5F, 6.0F, 5.0F, 3.0F, 0.0F, false);

		LeftEye = new ModelRenderer(this);
		LeftEye.setPos(-0.75F, 0.0F, 0.0F);
		Eyes.addChild(LeftEye);


		cube_r49 = new ModelRenderer(this);
		cube_r49.setPos(-3.0F, -29.5F, -3.5F);
		LeftEye.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, -0.0873F);
		cube_r49.texOffs(29, 76).addBox(-2.5F, -2.0F, 2.0F, 6.0F, 5.0F, 7.0F, -0.5F, false);
		cube_r49.texOffs(80, 9).addBox(-3.0F, 2.0F, -2.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r49.texOffs(99, 73).addBox(-3.0F, -2.0F, -2.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r49.texOffs(74, 106).addBox(-3.0F, -1.0F, -2.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r49.texOffs(106, 77).addBox(2.0F, -1.0F, -2.5F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r49.texOffs(30, 124).addBox(-1.0F, -1.0F, -1.6F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		cube_r49.texOffs(20, 23).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r49.texOffs(88, 47).addBox(-3.0F, -2.0F, -0.5F, 6.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r50 = new ModelRenderer(this);
		cube_r50.setPos(4.5F, -29.5F, -3.5F);
		LeftEye.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.0873F);
		cube_r50.texOffs(19, 124).addBox(-2.0F, -1.0F, -1.6F, 3.0F, 3.0F, 0.0F, 0.0F, true);

		LowerHalf = new ModelRenderer(this);
		LowerHalf.setPos(0.0F, -16.5F, 8.0F);
		Body.addChild(LowerHalf);
		LowerHalf.texOffs(39, 2).addBox(6.0F, 0.0F, -14.0F, 1.0F, 9.0F, 14.0F, 0.0F, false);
		LowerHalf.texOffs(0, 0).addBox(-6.0F, 8.0F, -14.0F, 12.0F, 1.0F, 14.0F, 0.0F, false);
		LowerHalf.texOffs(0, 47).addBox(-7.0F, 0.0F, -14.0F, 1.0F, 9.0F, 14.0F, 0.0F, false);

		Hatch = new ModelRenderer(this);
		Hatch.setPos(0.0F, 8.0F, -14.0F);
		LowerHalf.addChild(Hatch);
		Hatch.texOffs(56, 86).addBox(-6.0F, -8.0F, -0.001F, 12.0F, 8.0F, 1.0F, 0.0F, false);

		Crusher = new ModelRenderer(this);
		Crusher.setPos(0.0F, 0.0F, 0.0F);
		Body.addChild(Crusher);
		Crusher.texOffs(80, 0).addBox(-6.0F, -16.8301F, 7.5F, 12.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r51 = new ModelRenderer(this);
		cube_r51.setPos(0.0F, -16.1471F, 2.0228F);
		Crusher.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.5236F, 0.0F, 0.0F);
		cube_r51.texOffs(84, 29).addBox(-6.0F, -0.5F, 6.5F, 12.0F, 5.0F, 3.0F, -0.001F, false);

		cube_r52 = new ModelRenderer(this);
		cube_r52.setPos(0.0F, -18.9772F, 5.2189F);
		Crusher.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.5236F, 0.0F, 0.0F);
		cube_r52.texOffs(0, 86).addBox(-6.0F, -0.5F, 0.5F, 12.0F, 5.0F, 3.0F, -0.001F, false);
	}

	@Override
	public void setupAnim(T t, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
//		aseoha.LOGGER.info("Inside the setupAnim function!!");
		if(t.isSprinting()){moveAnim();};
		moveAnim();
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		base.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

		//		TrackSuspension.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		// 		Tracks.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
//		matrixStack.pushPose();
//		matrixStack.mulPose(Vector3f.ZN.rotation(180));
//
//		base.render(matrixStack, buffer, packedLight, packedOverlay);
//		matrixStack.popPose();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setPos(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.x = x;
		modelRenderer.y = y;
		modelRenderer.z = z;
	}
	public void moveAnim() {
		RightTrack.y += 1F;
		RightTrack.y -= 1F;

	}



}