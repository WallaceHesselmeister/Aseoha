/* (C) TAMA Studios 2025 */
package tama.Client.Models.Exteriors;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.tardis.mod.blockentities.exteriors.ExteriorTile;
import net.tardis.mod.client.animations.exterior.PoliceBoxExteriorAnimation;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import net.tardis.mod.client.models.exteriors.IExteriorModel;
import org.jetbrains.annotations.NotNull;
import tama.aseoha;

public class WardrobeExteriorModel<T extends ExteriorTile> extends BaseTileHierarchicalModel<T>
        implements IExteriorModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in
    // the entity renderer
    // and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(aseoha.MODID, "wardrobeexteriormodel"), "main");
    private final ModelPart Shell;
    private final ModelPart BOTI;
    private final ModelPart Clothes;
    private final ModelPart Doors;
    private final ModelPart RightDoor;
    private final ModelPart LeftDoor;

    public WardrobeExteriorModel(ModelPart root) {
        super(root);
        this.Shell = root.getChild("Shell");
        this.BOTI = root.getChild("BOTI");
        this.Clothes = root.getChild("Clothes");
        this.Doors = root.getChild("Doors");
        this.RightDoor = this.Doors.getChild("RightDoor");
        this.LeftDoor = this.Doors.getChild("LeftDoor");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Shell = partdefinition.addOrReplaceChild(
                "Shell",
                CubeListBuilder.create()
                        .texOffs(0, 6)
                        .addBox(13.0F, -2.0F, 8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 28)
                        .addBox(-17.0F, -5.0F, -12.0F, 34.0F, 3.0F, 24.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-17.0F, -47.0F, -12.0F, 34.0F, 3.0F, 24.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 0)
                        .addBox(-12.0F, -44.0F, -10.0F, 24.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 9)
                        .addBox(13.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(97, 112)
                        .addBox(12.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 112)
                        .addBox(-15.0F, -44.0F, -11.0F, 3.0F, 39.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(58, 112)
                        .addBox(-15.0F, -44.0F, 8.0F, 3.0F, 39.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(71, 112)
                        .addBox(12.0F, -44.0F, 8.0F, 3.0F, 39.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 3)
                        .addBox(-16.0F, -2.0F, -11.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-16.0F, -2.0F, 8.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(90, 56)
                        .addBox(12.0F, -44.0F, -8.0F, 2.0F, 39.0F, 16.0F, new CubeDeformation(0.0F))
                        .texOffs(53, 56)
                        .addBox(-14.0F, -44.0F, -8.0F, 2.0F, 39.0F, 16.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 56)
                        .addBox(-12.0F, -44.0F, 8.0F, 24.0F, 39.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition BOTI = partdefinition.addOrReplaceChild(
                "BOTI",
                CubeListBuilder.create()
                        .texOffs(92, 3)
                        .addBox(2.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 3)
                        .addBox(-12.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 3)
                        .addBox(2.0F, -42.0F, -11.0F, 10.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 3)
                        .addBox(-2.0F, -42.0F, -11.0F, 4.0F, 18.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 3)
                        .addBox(-2.0F, -24.0F, -11.0F, 4.0F, 19.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 3)
                        .addBox(-12.0F, -24.0F, -11.0F, 10.0F, 19.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 2.0F));

        PartDefinition Clothes = partdefinition.addOrReplaceChild(
                "Clothes",
                CubeListBuilder.create()
                        .texOffs(0, 156)
                        .addBox(-12.0F, -41.0F, -1.0F, 24.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(-10.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(-8.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(-6.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(-4.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(-2.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(0.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(2.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(4.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(6.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(8.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 156)
                        .addBox(10.0F, -39.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(-8.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(-10.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(-4.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 117)
                        .addBox(-6.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 117)
                        .addBox(0.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(-2.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(4.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(2.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(4.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(2.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(6.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 111)
                        .addBox(10.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(8.0F, -37.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(-10.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(-8.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 117)
                        .addBox(-6.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(-4.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(-2.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 117)
                        .addBox(0.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(2.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(4.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 138)
                        .addBox(6.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 138)
                        .addBox(8.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 111)
                        .addBox(10.0F, -25.0F, -3.0F, 1.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Doors =
                partdefinition.addOrReplaceChild("Doors", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition RightDoor = Doors.addOrReplaceChild(
                "RightDoor",
                CubeListBuilder.create()
                        .texOffs(0, 98)
                        .addBox(-12.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(7, 15)
                        .addBox(-12.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(12.0F, -24.25F, -10.0F));

        PartDefinition LeftDoor = Doors.addOrReplaceChild(
                "LeftDoor",
                CubeListBuilder.create()
                        .texOffs(0, 12)
                        .addBox(11.0F, -2.75F, -1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(29, 112)
                        .addBox(0.0F, -17.75F, 0.0F, 12.0F, 37.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-12.0F, -24.25F, -10.0F));

        return LayerDefinition.create(meshdefinition, 160, 160);
    }

    public void setupAnimations(T tile, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        PoliceBoxExteriorAnimation.animateDoors(tile.getDoorHandler().getDoorState(), this.LeftDoor, this.RightDoor);
    }

    public void animateDemat(T exterior, float age) {}

    public void animateRemat(T exterior, float age) {}

    public void animateSolid(T exterior, float age) {}

    @Override
    public void renderToBuffer(
            @NotNull PoseStack poseStack,
            @NotNull VertexConsumer vertexConsumer,
            int packedLight,
            int packedOverlay,
            float red,
            float green,
            float blue,
            float alpha) {
        poseStack.pushPose();
        poseStack.scale(0.8f, 0.8f, 0.8f);
        poseStack.translate(0.0f, 0.377f, 0.0f);
        Shell.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        // BOTI.render(poseStack, vertexConsumer, packedLight, packedOverlay, red,
        // green, blue,
        // alpha);
        Clothes.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Doors.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.popPose();
    }
}
