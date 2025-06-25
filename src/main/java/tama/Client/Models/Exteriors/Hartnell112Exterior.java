/* (C) TAMA Studios 2025 */
package tama.Client.Models.Exteriors;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.tardis.mod.blockentities.exteriors.ExteriorTile;
import net.tardis.mod.client.animations.exterior.PoliceBoxExteriorAnimation;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import net.tardis.mod.client.models.exteriors.IExteriorModel;

import static tama.aseoha.MODID;

public class Hartnell112Exterior<T extends ExteriorTile> extends BaseTileHierarchicalModel<T>
        implements IExteriorModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(MODID, "hartnell112"), "main");
    private final ModelPart Shell;
    private final ModelPart BOTI;
    private final ModelPart Doors;
    private final ModelPart Right;
    private final ModelPart Left;

    public Hartnell112Exterior(ModelPart root) {
        super(root);
        this.Shell = root.getChild("Shell");
        this.BOTI = root.getChild("BOTI");
        this.Doors = root.getChild("Doors");
        this.Right = this.Doors.getChild("Right");
        this.Left = this.Doors.getChild("Left");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Shell = partdefinition.addOrReplaceChild(
                "Shell",
                CubeListBuilder.create()
                        .texOffs(0, 23)
                        .addBox(-10.5F, -1.5F, -10.5F, 21.0F, 1.0F, 21.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 133)
                        .addBox(-10.6F, -35.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 177)
                        .addBox(-7.5F, -32.5F, 7.75F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(174, 112)
                        .addBox(-8.65F, -32.5F, -0.5F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 46)
                        .addBox(-10.5F, -36.0F, -8.5F, 21.0F, 2.0F, 17.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 2)
                        .addBox(-8.4F, -25.5F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 9)
                        .addBox(-8.4F, -25.5F, -6.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 16)
                        .addBox(1.5F, -25.5F, 7.65F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 32)
                        .addBox(-6.5F, -25.5F, 7.65F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(7.65F, -25.5F, -6.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 7)
                        .addBox(7.65F, -25.5F, 1.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(168, 80)
                        .addBox(-1.5F, -32.5F, 7.75F, 3.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(165, 35)
                        .addBox(-8.5F, -32.5F, -1.5F, 1.0F, 30.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(177, 0)
                        .addBox(-7.5F, -25.0F, 7.75F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(174, 66)
                        .addBox(-7.5F, -17.5F, 7.75F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(174, 63)
                        .addBox(-7.5F, -10.0F, 7.75F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 70)
                        .addBox(-8.2F, -31.5F, -6.5F, 0.0F, 29.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 46)
                        .addBox(-8.5F, -36.0F, -10.5F, 17.0F, 2.0F, 21.0F, new CubeDeformation(0.0F))
                        .texOffs(116, 56)
                        .addBox(-6.5F, -35.5F, -10.6F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(116, 53)
                        .addBox(-6.5F, -35.5F, 9.6F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 116)
                        .addBox(9.6F, -35.5F, -6.5F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(160, 76)
                        .addBox(-7.5F, -32.5F, 7.75F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(160, 73)
                        .addBox(-7.5F, -2.5F, 7.75F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(96, 133)
                        .addBox(-8.5F, -17.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(63, 133)
                        .addBox(-8.5F, -25.0F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 53)
                        .addBox(-8.5F, -32.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(129, 83)
                        .addBox(-8.5F, -2.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(107, 116)
                        .addBox(7.75F, -2.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 130)
                        .addBox(-8.5F, -10.0F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(45, 177)
                        .addBox(6.5F, -32.5F, 7.75F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(155, 175)
                        .addBox(-8.5F, -32.5F, 6.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(174, 30)
                        .addBox(-0.5F, -32.5F, 7.95F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(150, 175)
                        .addBox(-8.5F, -32.5F, -7.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 175)
                        .addBox(7.75F, -32.5F, 6.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(145, 175)
                        .addBox(7.75F, -32.5F, -7.5F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(45, 122)
                        .addBox(7.75F, -17.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(125, 103)
                        .addBox(7.75F, -25.0F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(125, 120)
                        .addBox(7.75F, -32.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(150, 34)
                        .addBox(7.75F, -32.5F, -1.5F, 1.0F, 30.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 70)
                        .addBox(8.45F, -31.5F, -6.5F, 0.0F, 29.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(128, 17)
                        .addBox(7.75F, -10.0F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(169, 145)
                        .addBox(7.9F, -32.5F, -0.5F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 113)
                        .addBox(-6.5F, -31.5F, 8.45F, 13.0F, 29.0F, 0.0F, new CubeDeformation(0.0F))
                        .texOffs(164, 157)
                        .addBox(9.0F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(164, 119)
                        .addBox(9.0F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(163, 81)
                        .addBox(9.2F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(161, 0)
                        .addBox(9.2F, -37.5F, -9.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(159, 138)
                        .addBox(9.2F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(158, 100)
                        .addBox(9.2F, -37.5F, 8.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(154, 137)
                        .addBox(8.5F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(120, 150)
                        .addBox(8.0F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(115, 150)
                        .addBox(8.0F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 150)
                        .addBox(8.5F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(105, 150)
                        .addBox(-9.5F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(100, 150)
                        .addBox(-9.0F, -37.5F, -10.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(95, 150)
                        .addBox(-10.0F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(90, 150)
                        .addBox(-10.2F, -37.5F, -9.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 150)
                        .addBox(-10.2F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 150)
                        .addBox(7.5F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(75, 150)
                        .addBox(-8.5F, -37.5F, -10.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(129, 137)
                        .addBox(-8.5F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(134, 137)
                        .addBox(7.5F, -37.5F, -9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(70, 150)
                        .addBox(7.5F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(139, 137)
                        .addBox(-8.5F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(55, 139)
                        .addBox(-8.5F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 143)
                        .addBox(7.5F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(65, 150)
                        .addBox(9.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(60, 150)
                        .addBox(9.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(45, 139)
                        .addBox(8.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(50, 139)
                        .addBox(8.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(149, 137)
                        .addBox(-10.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 147)
                        .addBox(-9.0F, -37.5F, -8.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(40, 147)
                        .addBox(-9.0F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(5, 143)
                        .addBox(-9.0F, -37.5F, 8.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(35, 147)
                        .addBox(-10.2F, -37.5F, 8.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(30, 147)
                        .addBox(-10.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 137)
                        .addBox(-9.0F, -37.5F, 7.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(25, 147)
                        .addBox(-10.2F, -37.5F, 8.5F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(20, 147)
                        .addBox(-9.5F, -37.5F, 9.2F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 70)
                        .addBox(-1.0F, -43.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(116, 0)
                        .addBox(-1.0F, -45.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 0)
                        .addBox(-1.5F, -44.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 58)
                        .addBox(-1.5F, -40.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 30)
                        .addBox(7.75F, -38.5F, -9.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(89, 96)
                        .addBox(-9.75F, -38.5F, -9.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(23, 78)
                        .addBox(7.75F, -38.5F, 7.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 147)
                        .addBox(-10.0F, -37.5F, 9.0F, 1.0F, 36.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-10.5F, -1.0F, -10.5F, 21.0F, 1.0F, 21.0F, new CubeDeformation(0.0F))
                        .texOffs(41, 70)
                        .addBox(-3.5F, -40.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 70)
                        .addBox(-4.5F, -39.9F, -4.5F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(89, 103)
                        .addBox(-5.5F, -39.8F, -5.5F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(89, 88)
                        .addBox(-6.5F, -39.7F, -6.5F, 13.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 23)
                        .addBox(-7.5F, -39.6F, -7.5F, 15.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 0)
                        .addBox(-8.5F, -39.5F, -8.5F, 17.0F, 1.0F, 17.0F, new CubeDeformation(0.0F))
                        .texOffs(59, 66)
                        .addBox(-9.0F, -38.5F, -9.0F, 18.0F, 3.0F, 18.0F, new CubeDeformation(0.0F))
                        .texOffs(14, 78)
                        .addBox(-9.75F, -38.5F, 7.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(160, 70)
                        .addBox(-7.5F, -34.5F, -8.9F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(97, 40)
                        .addBox(-7.5F, -34.0F, -8.8F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 43)
                        .addBox(-7.5F, -33.5F, -8.7F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(116, 0)
                        .addBox(-8.7F, -33.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(116, 36)
                        .addBox(-8.8F, -34.0F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 116)
                        .addBox(-8.9F, -34.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 40)
                        .addBox(-7.5F, -33.5F, 7.95F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(41, 79)
                        .addBox(-7.5F, -34.0F, 8.05F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 19)
                        .addBox(-7.5F, -34.5F, 8.15F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 19)
                        .addBox(7.95F, -33.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 113)
                        .addBox(8.05F, -34.0F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F))
                        .texOffs(114, 66)
                        .addBox(8.15F, -34.5F, -7.5F, 1.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = Shell.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(11, 58)
                        .addBox(0.0F, -19.5F, -2.0F, 0.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(114, 74)
                        .addBox(-2.0F, -19.5F, 0.0F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -24.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r2 = Shell.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(0, 23)
                        .addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 14)
                        .addBox(-0.5F, -0.5F, -10.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.95F, -28.5F, 4.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cube_r3 = Shell.addOrReplaceChild(
                "cube_r3",
                CubeListBuilder.create()
                        .texOffs(29, 70)
                        .addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.95F, -28.5F, -5.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r4 = Shell.addOrReplaceChild(
                "cube_r4",
                CubeListBuilder.create()
                        .texOffs(24, 70)
                        .addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.95F, -28.5F, -3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r5 = Shell.addOrReplaceChild(
                "cube_r5",
                CubeListBuilder.create()
                        .texOffs(19, 70)
                        .addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.95F, -28.5F, 3.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r6 = Shell.addOrReplaceChild(
                "cube_r6",
                CubeListBuilder.create()
                        .texOffs(14, 70)
                        .addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(7.95F, -28.5F, 5.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r7 = Shell.addOrReplaceChild(
                "cube_r7",
                CubeListBuilder.create()
                        .texOffs(64, 8)
                        .addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 5)
                        .addBox(5.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.0F, -28.5F, 7.95F, -0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r8 = Shell.addOrReplaceChild(
                "cube_r8",
                CubeListBuilder.create()
                        .texOffs(89, 88)
                        .addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.0F, -28.5F, 7.95F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r9 = Shell.addOrReplaceChild(
                "cube_r9",
                CubeListBuilder.create()
                        .texOffs(8, 75)
                        .addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.0F, -28.5F, 7.95F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r10 = Shell.addOrReplaceChild(
                "cube_r10",
                CubeListBuilder.create()
                        .texOffs(70, 70)
                        .addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, -28.5F, 7.95F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r11 = Shell.addOrReplaceChild(
                "cube_r11",
                CubeListBuilder.create()
                        .texOffs(34, 70)
                        .addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.0F, -28.5F, 7.95F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r12 = Shell.addOrReplaceChild(
                "cube_r12",
                CubeListBuilder.create()
                        .texOffs(0, 30)
                        .addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 25)
                        .addBox(-0.5F, -0.5F, 5.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.7F, -28.5F, -4.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition cube_r13 = Shell.addOrReplaceChild(
                "cube_r13",
                CubeListBuilder.create()
                        .texOffs(89, 103)
                        .addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.7F, -28.5F, -3.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r14 = Shell.addOrReplaceChild(
                "cube_r14",
                CubeListBuilder.create()
                        .texOffs(94, 88)
                        .addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.7F, -28.5F, -5.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r15 = Shell.addOrReplaceChild(
                "cube_r15",
                CubeListBuilder.create()
                        .texOffs(110, 22)
                        .addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.7F, -28.5F, 5.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r16 = Shell.addOrReplaceChild(
                "cube_r16",
                CubeListBuilder.create()
                        .texOffs(94, 103)
                        .addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-7.7F, -28.5F, 3.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition BOTI = partdefinition.addOrReplaceChild(
                "BOTI",
                CubeListBuilder.create()
                        .texOffs(54, 88)
                        .addBox(-7.5F, -32.5F, -8.0F, 15.0F, 31.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Doors =
                partdefinition.addOrReplaceChild("Doors", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Right = Doors.addOrReplaceChild(
                "Right",
                CubeListBuilder.create()
                        .texOffs(0, 49)
                        .addBox(-7.0F, -11.875F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(174, 145)
                        .addBox(-1.0F, -11.875F, 0.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(149, 0)
                        .addBox(-6.0F, -10.875F, 0.3F, 5.0F, 29.0F, 0.0F, new CubeDeformation(0.0F))
                        .texOffs(125, 174)
                        .addBox(-7.0F, -11.875F, 0.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 37)
                        .addBox(-7.0F, 10.625F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 40)
                        .addBox(-7.0F, 3.125F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 46)
                        .addBox(-7.0F, -4.375F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 52)
                        .addBox(-7.0F, 18.125F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 23)
                        .addBox(-6.0F, -4.875F, 0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(41, 70)
                        .addBox(-4.5F, -1.125F, 0.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(8, 0)
                        .addBox(-4.0F, -0.625F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 7)
                        .addBox(-4.0F, -0.625F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.2F)),
                PartPose.offset(7.5F, -20.625F, -8.5F));

        PartDefinition cube_r17 = Right.addOrReplaceChild(
                "cube_r17",
                CubeListBuilder.create()
                        .texOffs(64, 11)
                        .addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.5F, -7.875F, 0.8F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r18 = Right.addOrReplaceChild(
                "cube_r18",
                CubeListBuilder.create()
                        .texOffs(27, 113)
                        .addBox(-0.6F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.5F, -7.875F, 0.8F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r19 = Right.addOrReplaceChild(
                "cube_r19",
                CubeListBuilder.create()
                        .texOffs(32, 113)
                        .addBox(-0.4F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.5F, -7.875F, 0.8F, 0.0F, -0.7854F, 0.0F));

        PartDefinition Left = Doors.addOrReplaceChild(
                "Left",
                CubeListBuilder.create()
                        .texOffs(0, 55)
                        .addBox(0.0F, -12.1591F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(130, 175)
                        .addBox(0.0F, -12.1591F, 0.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(166, 0)
                        .addBox(1.0F, -11.1591F, 0.3F, 5.0F, 29.0F, 0.0F, new CubeDeformation(0.0F))
                        .texOffs(135, 175)
                        .addBox(6.0F, -12.1591F, 0.0F, 1.0F, 30.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(6.0F, 2.8409F, -0.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 46)
                        .addBox(0.0F, -4.6591F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 49)
                        .addBox(0.0F, 2.8409F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 32)
                        .addBox(1.0F, 2.3409F, 0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 29)
                        .addBox(1.0F, -4.1591F, 0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(64, 26)
                        .addBox(1.0F, -5.1591F, 0.1F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(115, 22)
                        .addBox(0.5F, -3.4091F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(114, 66)
                        .addBox(5.5F, -3.4091F, 0.1F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 58)
                        .addBox(1.5F, -3.4091F, 0.2F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 52)
                        .addBox(0.0F, 10.3409F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 55)
                        .addBox(0.0F, 17.8409F, 0.0F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(169, 112)
                        .addBox(7.0F, -12.1591F, -0.2F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-7.5F, -20.3409F, -8.5F));

        PartDefinition cube_r20 = Left.addOrReplaceChild(
                "cube_r20",
                CubeListBuilder.create()
                        .texOffs(64, 14)
                        .addBox(-2.5F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.5F, -8.1591F, 0.8F, 0.7854F, 0.0F, 0.0F));

        PartDefinition cube_r21 = Left.addOrReplaceChild(
                "cube_r21",
                CubeListBuilder.create()
                        .texOffs(37, 113)
                        .addBox(-0.6F, -3.0F, -0.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.5F, -8.1591F, 0.8F, 0.0F, 0.7854F, 0.0F));

        PartDefinition cube_r22 = Left.addOrReplaceChild(
                "cube_r22",
                CubeListBuilder.create()
                        .texOffs(45, 113)
                        .addBox(-0.4F, -3.0F, -0.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.5F, -8.1591F, 0.8F, 0.0F, 0.7854F, 0.0F));

        return LayerDefinition.create(meshdefinition, 224, 224);
    }

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
        Shell.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        BOTI.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        Doors.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnimations(T tile, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        PoliceBoxExteriorAnimation.animateDoors(tile.getDoorHandler().getDoorState(), this.Left, this.Right);
    }

    public void animateDemat(T exterior, float age) {}

    public void animateRemat(T exterior, float age) {}

    public void animateSolid(T exterior, float age) {}

    @Override
    public ModelPart root() {
        return super.root();
    }

    @Override
    public void setupAnim(Entity entity, float v, float v1, float v2, float v3, float v4) {}
}
