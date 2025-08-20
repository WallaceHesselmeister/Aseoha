/* (C) TAMA Studios 2025 */
package tama.Client.Models.Armor;

import static tama.aseoha.MODID;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;

public class ScarfModel extends EntityModel<LivingEntity> {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer
    // and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(MODID, "scarfmodel"), "main");
    public final ModelPart Body;
    private final ModelPart ScarfModel;

    public ScarfModel(ModelPart root) {
        this.Body = root.getChild("Body");
        this.ScarfModel = this.Body.getChild("ScarfModel");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Body =
                partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition ScarfModel = Body.addOrReplaceChild(
                "ScarfModel",
                CubeListBuilder.create()
                        .texOffs(12, 0)
                        .addBox(-4.0F, 1.0F, 1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 18)
                        .addBox(-5.0F, 0.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(18, 18)
                        .addBox(3.0F, 0.0F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 3)
                        .addBox(3.0F, -1.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(6, 0)
                        .addBox(3.0F, 0.0F, -3.0F, 2.0F, 23.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 9)
                        .addBox(-5.0F, -1.0F, -3.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(20, 20)
                        .addBox(-5.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
                        .texOffs(20, 20)
                        .addBox(3.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.5F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-5.0F, 0.0F, -3.0F, 2.0F, 23.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 20)
                        .addBox(2.0F, 0.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(16, 20)
                        .addBox(-3.0F, 0.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 15)
                        .addBox(-2.0F, 1.0F, -2.5F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(
            LivingEntity entity,
            float limbSwing,
            float limbSwingAmount,
            float ageInTicks,
            float netHeadYaw,
            float headPitch) {}

    @Override
    public void renderToBuffer(
            PoseStack poseStack,
            VertexConsumer vertexConsumer,
            int packedLight,
            int packedOverlay,
            float red,
            float green,
            float blue,
            float alpha) {
        Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void makeInvisible(boolean invisible) {
        Body.visible = !invisible;
    }
}
