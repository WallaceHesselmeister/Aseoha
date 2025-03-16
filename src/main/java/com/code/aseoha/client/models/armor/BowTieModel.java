package com.code.aseoha.client.models.armor;

import com.code.aseoha.interfaces.IAmBoringBipedModelStuff;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3f;
import org.jetbrains.annotations.NotNull;

public class BowTieModel extends BipedModel<LivingEntity> implements IAmBoringBipedModelStuff {
        private final ModelRenderer bone;
        private final ModelRenderer cube_r1;
        private final ModelRenderer cube_r2;
        private final ModelRenderer cube_r3;
        private final ModelRenderer cube_r4;
        private final ModelRenderer steve;

        public BowTieModel() {
            super(1.0F);
            texWidth = 16;
            texHeight = 16;

            bone = new ModelRenderer(this);
            bone.setPos(0.01F, 2.5F, 2.7243F);
            setRotationAngle(bone, 0.0F, -1.5708F, 0.0F);
            bone.texOffs(8, 0).addBox(-0.46F, -1.0F, -1.0743F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r1 = new ModelRenderer(this);
            cube_r1.setPos(-0.56F, 0.7F, -0.7743F);
            bone.addChild(cube_r1);
            setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
            cube_r1.texOffs(8, 4).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r2 = new ModelRenderer(this);
            cube_r2.setPos(-0.46F, 0.5071F, 3.5186F);
            bone.addChild(cube_r2);
            setRotationAngle(cube_r2, 1.5708F, 0.0F, 0.0F);
            cube_r2.texOffs(0, 0).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            cube_r3 = new ModelRenderer(this);
            cube_r3.setPos(-0.56F, 0.7F, 2.2257F);
            bone.addChild(cube_r3);
            setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
            cube_r3.texOffs(8, 8).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

            cube_r4 = new ModelRenderer(this);
            cube_r4.setPos(-0.46F, 0.5071F, -1.4814F);
            bone.addChild(cube_r4);
            setRotationAngle(cube_r4, 1.5708F, 0.0F, 0.0F);
            cube_r4.texOffs(0, 5).addBox(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

            steve = new ModelRenderer(this);
            steve.setPos(0.0F, 16.0F, 0.25F);
            steve.texOffs(32, 48).addBox(-4.0F, -23.5F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
            steve.texOffs(32, 48).addBox(-4.0F, -15.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
            steve.texOffs(32, 48).addBox(-8.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            steve.texOffs(32, 48).addBox(4.0F, -15.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            steve.texOffs(32, 48).addBox(-4.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
            steve.texOffs(32, 48).addBox(0.0F, -3.5F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        }

        @Override
        public void renderToBuffer(@NotNull MatrixStack matrixStack, @NotNull IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            matrixStack.pushPose();
            matrixStack.mulPose(Vector3f.YP.rotationDegrees(180));
            matrixStack.translate(0, -0.05, 0);
            bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
            matrixStack.popPose();
        }
    }