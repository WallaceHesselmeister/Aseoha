package com.code.aseoha.client.models.blocks;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.TileAnimation;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.tileentities.TardisEngineTile;

public class UpsideDownEngine extends EntityModel<Entity> implements TileModel<TardisEngineTile> {
    private final ModelRenderer glow;
    private final ModelRenderer rotorglow1;
    private final ModelRenderer rotorglow4_r1;
    private final ModelRenderer rotorglow3_r1;
    private final ModelRenderer rotorglow2_r1;
    private final ModelRenderer rotorglow1_r1;
    private final ModelRenderer rotorglow2;
    private final ModelRenderer rotorglow2_r2;
    private final ModelRenderer rotorglow3;
    private final ModelRenderer rotorglow3_r2;
    private final ModelRenderer basiccubes;
    private final ModelRenderer basiccubes_r1;
    private final ModelRenderer compartmentoutline;
    private final ModelRenderer compartmentoutline_r1;
    private final ModelRenderer cross;
    private final ModelRenderer rotorstand;
    private final ModelRenderer rotorstand1;
    private final ModelRenderer rotorstand4_r1;
    private final ModelRenderer rotorstand3_r1;
    private final ModelRenderer rotorstand2_r1;
    private final ModelRenderer rotorstand1_r1;
    private final ModelRenderer rotorstand2;
    private final ModelRenderer rotorstand2_r2;
    private final ModelRenderer rotorstand3;
    private final ModelRenderer rotorstand3_r2;
    private final ModelRenderer door1_rotate_y;
    private final ModelRenderer door1_rotate_y_r1;
    private final ModelRenderer door2_rotate_y;
    private final ModelRenderer door2_rotate_y_r1;
    private final ModelRenderer door3_rotate_y;
    private final ModelRenderer door3_rotate_y_r1;
    private final ModelRenderer door4_rotate_y;
    private final ModelRenderer door4_rotate_y_r1;

    public UpsideDownEngine() {
        texWidth = 128;
        texHeight = 128;

        glow = new ModelRenderer(this);
        glow.setPos(0.0F, -2.0F, 0.0F);


        rotorglow1 = new ModelRenderer(this);
        rotorglow1.setPos(0.0F, 26.0F, 0.0F);
        glow.addChild(rotorglow1);


        rotorglow4_r1 = new ModelRenderer(this);
        rotorglow4_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorglow1.addChild(rotorglow4_r1);
        setRotationAngle(rotorglow4_r1, 3.1416F, -0.7854F, 0.0F);
        rotorglow4_r1.texOffs(12, 22).addBox(-0.5F, -11.875F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        rotorglow4_r1.texOffs(48, 22).addBox(-0.5F, -11.875F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        rotorglow3_r1 = new ModelRenderer(this);
        rotorglow3_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorglow1.addChild(rotorglow3_r1);
        setRotationAngle(rotorglow3_r1, 3.1416F, 0.7854F, 0.0F);
        rotorglow3_r1.texOffs(12, 22).addBox(-0.5F, -11.875F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        rotorglow3_r1.texOffs(48, 22).addBox(-0.5F, -11.875F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        rotorglow2_r1 = new ModelRenderer(this);
        rotorglow2_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorglow1.addChild(rotorglow2_r1);
        setRotationAngle(rotorglow2_r1, 3.1416F, 1.5708F, 0.0F);
        rotorglow2_r1.texOffs(12, 22).addBox(-0.5F, -11.875F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        rotorglow2_r1.texOffs(48, 22).addBox(-0.5F, -11.875F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        rotorglow1_r1 = new ModelRenderer(this);
        rotorglow1_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorglow1.addChild(rotorglow1_r1);
        setRotationAngle(rotorglow1_r1, 3.1416F, 3.1416F, 0.0F);
        rotorglow1_r1.texOffs(48, 22).addBox(-0.5F, -11.875F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        rotorglow1_r1.texOffs(12, 22).addBox(-0.5F, -11.875F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        rotorglow2 = new ModelRenderer(this);
        rotorglow2.setPos(0.0F, 26.0F, 0.0F);
        glow.addChild(rotorglow2);


        rotorglow2_r2 = new ModelRenderer(this);
        rotorglow2_r2.setPos(0.0F, 1.375F, 0.0F);
        rotorglow2.addChild(rotorglow2_r2);
        setRotationAngle(rotorglow2_r2, 3.1416F, 3.1416F, 0.0F);
        rotorglow2_r2.texOffs(48, 22).addBox(-0.5F, -11.875F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        rotorglow2_r2.texOffs(12, 22).addBox(-0.5F, -11.875F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        rotorglow3 = new ModelRenderer(this);
        rotorglow3.setPos(0.0F, 26.0F, 0.0F);
        glow.addChild(rotorglow3);


        rotorglow3_r2 = new ModelRenderer(this);
        rotorglow3_r2.setPos(0.0F, 1.375F, 0.0F);
        rotorglow3.addChild(rotorglow3_r2);
        setRotationAngle(rotorglow3_r2, 3.1416F, 3.1416F, 0.0F);
        rotorglow3_r2.texOffs(48, 22).addBox(-0.5F, -11.875F, 4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
        rotorglow3_r2.texOffs(12, 22).addBox(-0.5F, -11.875F, -5.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);

        basiccubes = new ModelRenderer(this);
        basiccubes.setPos(0.0F, 24.0F, 0.0F);


        basiccubes_r1 = new ModelRenderer(this);
        basiccubes_r1.setPos(0.0F, 1.375F, 0.0F);
        basiccubes.addChild(basiccubes_r1);
        setRotationAngle(basiccubes_r1, 3.1416F, 3.1416F, 0.0F);
        basiccubes_r1.texOffs(0, 22).addBox(-8.0F, 11.625F, -8.0F, 16.0F, 6.0F, 16.0F, 0.0F, false);

        compartmentoutline = new ModelRenderer(this);
        compartmentoutline.setPos(0.0F, 24.0F, 0.0F);


        compartmentoutline_r1 = new ModelRenderer(this);
        compartmentoutline_r1.setPos(0.0F, 1.375F, 0.0F);
        compartmentoutline.addChild(compartmentoutline_r1);
        setRotationAngle(compartmentoutline_r1, 3.1416F, 3.1416F, 0.0F);
        compartmentoutline_r1.texOffs(65, 65).addBox(-6.5F, 1.625F, -6.5F, 13.0F, 1.0F, 13.0F, 0.1F, false);
        compartmentoutline_r1.texOffs(39, 79).addBox(-4.5F, 1.625F, -4.5F, 9.0F, 10.0F, 9.0F, 0.0F, false);
        compartmentoutline_r1.texOffs(58, 37).addBox(-7.0F, 10.625F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
        compartmentoutline_r1.texOffs(0, 44).addBox(3.5F, 2.625F, 3.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        compartmentoutline_r1.texOffs(42, 44).addBox(3.5F, 2.625F, -6.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        compartmentoutline_r1.texOffs(0, 22).addBox(-6.5F, 2.625F, 3.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
        compartmentoutline_r1.texOffs(48, 0).addBox(-6.5F, 2.625F, -6.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);

        cross = new ModelRenderer(this);
        cross.setPos(0.0F, -11.0F, 0.0F);
        compartmentoutline.addChild(cross);


        rotorstand = new ModelRenderer(this);
        rotorstand.setPos(0.0F, 24.0F, 0.0F);


        rotorstand1 = new ModelRenderer(this);
        rotorstand1.setPos(0.0F, 0.0F, 0.0F);
        rotorstand.addChild(rotorstand1);


        rotorstand4_r1 = new ModelRenderer(this);
        rotorstand4_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorstand1.addChild(rotorstand4_r1);
        setRotationAngle(rotorstand4_r1, 3.1416F, -0.7854F, 0.0F);
        rotorstand4_r1.texOffs(8, 9).addBox(-1.0F, -16.125F, -5.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand4_r1.texOffs(48, 11).addBox(-0.5F, -12.875F, -5.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand4_r1.texOffs(8, 33).addBox(-1.0F, 0.625F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        rotorstand4_r1.texOffs(52, 22).addBox(-0.5F, -2.625F, -5.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand4_r1.texOffs(9, 44).addBox(-0.5F, -12.875F, 4.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand4_r1.texOffs(0, 9).addBox(-1.0F, -16.125F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand4_r1.texOffs(48, 32).addBox(-0.5F, -2.625F, 4.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand4_r1.texOffs(0, 33).addBox(-1.0F, 0.625F, 3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        rotorstand3_r1 = new ModelRenderer(this);
        rotorstand3_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorstand1.addChild(rotorstand3_r1);
        setRotationAngle(rotorstand3_r1, 3.1416F, 0.7854F, 0.0F);
        rotorstand3_r1.texOffs(8, 9).addBox(-1.0F, -16.125F, -5.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand3_r1.texOffs(48, 11).addBox(-0.5F, -12.875F, -5.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand3_r1.texOffs(8, 33).addBox(-1.0F, 0.625F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        rotorstand3_r1.texOffs(52, 22).addBox(-0.5F, -2.625F, -5.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand3_r1.texOffs(9, 44).addBox(-0.5F, -12.875F, 4.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand3_r1.texOffs(0, 9).addBox(-1.0F, -16.125F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand3_r1.texOffs(48, 32).addBox(-0.5F, -2.625F, 4.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand3_r1.texOffs(0, 33).addBox(-1.0F, 0.625F, 3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        rotorstand2_r1 = new ModelRenderer(this);
        rotorstand2_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorstand1.addChild(rotorstand2_r1);
        setRotationAngle(rotorstand2_r1, 3.1416F, 1.5708F, 0.0F);
        rotorstand2_r1.texOffs(8, 9).addBox(-1.0F, -16.125F, -5.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand2_r1.texOffs(48, 11).addBox(-0.5F, -12.875F, -5.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand2_r1.texOffs(8, 33).addBox(-1.0F, 0.625F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        rotorstand2_r1.texOffs(52, 22).addBox(-0.5F, -2.625F, -5.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand2_r1.texOffs(9, 44).addBox(-0.5F, -12.875F, 4.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand2_r1.texOffs(0, 9).addBox(-1.0F, -16.125F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand2_r1.texOffs(48, 32).addBox(-0.5F, -2.625F, 4.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand2_r1.texOffs(0, 33).addBox(-1.0F, 0.625F, 3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        rotorstand1_r1 = new ModelRenderer(this);
        rotorstand1_r1.setPos(0.0F, 1.375F, 0.0F);
        rotorstand1.addChild(rotorstand1_r1);
        setRotationAngle(rotorstand1_r1, 3.1416F, 3.1416F, 0.0F);
        rotorstand1_r1.texOffs(9, 44).addBox(-0.5F, -12.875F, 4.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand1_r1.texOffs(48, 11).addBox(-0.5F, -12.875F, -5.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand1_r1.texOffs(48, 32).addBox(-0.5F, -2.625F, 4.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand1_r1.texOffs(52, 22).addBox(-0.5F, -2.625F, -5.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand1_r1.texOffs(0, 9).addBox(-1.0F, -16.125F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand1_r1.texOffs(8, 9).addBox(-1.0F, -16.125F, -5.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand1_r1.texOffs(0, 33).addBox(-1.0F, 0.625F, 3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        rotorstand1_r1.texOffs(8, 33).addBox(-1.0F, 0.625F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        rotorstand2 = new ModelRenderer(this);
        rotorstand2.setPos(0.0F, 0.0F, 0.0F);
        rotorstand.addChild(rotorstand2);


        rotorstand2_r2 = new ModelRenderer(this);
        rotorstand2_r2.setPos(0.0F, 1.375F, 0.0F);
        rotorstand2.addChild(rotorstand2_r2);
        setRotationAngle(rotorstand2_r2, 3.1416F, 3.1416F, 0.0F);
        rotorstand2_r2.texOffs(9, 44).addBox(-0.5F, -12.875F, 4.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand2_r2.texOffs(48, 11).addBox(-0.5F, -12.875F, -5.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand2_r2.texOffs(48, 32).addBox(-0.5F, -2.625F, 4.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand2_r2.texOffs(52, 22).addBox(-0.5F, -2.625F, -5.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand2_r2.texOffs(0, 9).addBox(-1.0F, -16.125F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand2_r2.texOffs(8, 9).addBox(-1.0F, -16.125F, -5.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand2_r2.texOffs(0, 33).addBox(-1.0F, 0.625F, 3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        rotorstand2_r2.texOffs(8, 33).addBox(-1.0F, 0.625F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        rotorstand3 = new ModelRenderer(this);
        rotorstand3.setPos(0.0F, 0.0F, 0.0F);
        rotorstand.addChild(rotorstand3);


        rotorstand3_r2 = new ModelRenderer(this);
        rotorstand3_r2.setPos(0.0F, 1.375F, 0.0F);
        rotorstand3.addChild(rotorstand3_r2);
        setRotationAngle(rotorstand3_r2, 3.1416F, 3.1416F, 0.0F);
        rotorstand3_r2.texOffs(9, 44).addBox(-0.5F, -12.875F, 4.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand3_r2.texOffs(48, 11).addBox(-0.5F, -12.875F, -5.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);
        rotorstand3_r2.texOffs(48, 32).addBox(-0.5F, -2.625F, 4.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand3_r2.texOffs(52, 22).addBox(-0.5F, -2.625F, -5.0F, 1.0F, 3.0F, 1.0F, 0.25F, false);
        rotorstand3_r2.texOffs(0, 9).addBox(-1.0F, -16.125F, 3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand3_r2.texOffs(8, 9).addBox(-1.0F, -16.125F, -5.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
        rotorstand3_r2.texOffs(0, 33).addBox(-1.0F, 0.625F, 3.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        rotorstand3_r2.texOffs(8, 33).addBox(-1.0F, 0.625F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        door1_rotate_y = new ModelRenderer(this);
        door1_rotate_y.setPos(-3.5F, 13.0F, -6.25F);


        door1_rotate_y_r1 = new ModelRenderer(this);
        door1_rotate_y_r1.setPos(3.5F, 12.375F, 6.25F);
        door1_rotate_y.addChild(door1_rotate_y_r1);
        setRotationAngle(door1_rotate_y_r1, 3.1416F, 3.1416F, 0.0F);
        door1_rotate_y_r1.texOffs(7, 105).addBox(-3.5F, 2.625F, -6.75F, 7.0F, 8.0F, 1.0F, 0.0F, false);

        door2_rotate_y = new ModelRenderer(this);
        door2_rotate_y.setPos(6.25F, 13.0F, -3.5F);


        door2_rotate_y_r1 = new ModelRenderer(this);
        door2_rotate_y_r1.setPos(-6.25F, 12.375F, 3.5F);
        door2_rotate_y.addChild(door2_rotate_y_r1);
        setRotationAngle(door2_rotate_y_r1, 3.1416F, 3.1416F, 0.0F);
        door2_rotate_y_r1.texOffs(25, 99).addBox(5.75F, 2.625F, -3.5F, 1.0F, 8.0F, 7.0F, 0.0F, false);

        door3_rotate_y = new ModelRenderer(this);
        door3_rotate_y.setPos(3.5F, 13.0F, 6.25F);


        door3_rotate_y_r1 = new ModelRenderer(this);
        door3_rotate_y_r1.setPos(-3.5F, 12.375F, -6.25F);
        door3_rotate_y.addChild(door3_rotate_y_r1);
        setRotationAngle(door3_rotate_y_r1, 3.1416F, 3.1416F, 0.0F);
        door3_rotate_y_r1.texOffs(43, 105).addBox(-3.5F, 2.625F, 5.75F, 7.0F, 8.0F, 1.0F, 0.0F, false);

        door4_rotate_y = new ModelRenderer(this);
        door4_rotate_y.setPos(-6.25F, 13.0F, 3.5F);


        door4_rotate_y_r1 = new ModelRenderer(this);
        door4_rotate_y_r1.setPos(6.25F, 12.375F, -3.5F);
        door4_rotate_y.addChild(door4_rotate_y_r1);
        setRotationAngle(door4_rotate_y_r1, 3.1416F, 3.1416F, 0.0F);
        door4_rotate_y_r1.texOffs(61, 99).addBox(-6.75F, 2.625F, -3.5F, 1.0F, 8.0F, 7.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        glow.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        basiccubes.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        compartmentoutline.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        rotorstand.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        door1_rotate_y.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        door2_rotate_y.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        door3_rotate_y.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        door4_rotate_y.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public void render(TardisEngineTile tardisEngineTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
        matrixStack.pushPose();
        glow.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        basiccubes.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        compartmentoutline.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        rotorstand.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        door1_rotate_y.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        door2_rotate_y.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        door3_rotate_y.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        door4_rotate_y.render(matrixStack, iVertexBuilder, i, i1, v1, v2, v3, v4);
        matrixStack.popPose();
    }
}