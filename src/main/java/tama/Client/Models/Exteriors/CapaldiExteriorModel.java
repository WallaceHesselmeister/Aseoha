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

public class CapaldiExteriorModel<T extends ExteriorTile> extends BaseTileHierarchicalModel<T>
        implements IExteriorModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(MODID, "capaldi"), "main");
    private final ModelPart Shell;
    private final ModelPart LeftDoor;
    private final ModelPart RightDoor;
    private final ModelPart text_POLICE;
    private final ModelPart character_p;
    private final ModelPart text_BOX;
    private final ModelPart character_b;
    private final ModelPart text_PUBLIC;
    private final ModelPart character_p2;
    private final ModelPart text_CALL;
    private final ModelPart character_c3;
    private final ModelPart character_a;
    private final ModelPart character_l3;
    private final ModelPart character_l4;
    private final ModelPart character_u;
    private final ModelPart character_b2;
    private final ModelPart character_l2;
    private final ModelPart character_i2;
    private final ModelPart character_c2;
    private final ModelPart character_o2;
    private final ModelPart character_x;
    private final ModelPart character_o;
    private final ModelPart character_l;
    private final ModelPart character_i;
    private final ModelPart character_c;
    private final ModelPart character_e;
    private final ModelPart text_POLICE2;
    private final ModelPart character_p3;
    private final ModelPart text_BOX2;
    private final ModelPart character_b3;
    private final ModelPart text_PUBLIC2;
    private final ModelPart character_p4;
    private final ModelPart text_CALL2;
    private final ModelPart character_c4;
    private final ModelPart character_a2;
    private final ModelPart character_l5;
    private final ModelPart character_l6;
    private final ModelPart character_u2;
    private final ModelPart character_b4;
    private final ModelPart character_l7;
    private final ModelPart character_i3;
    private final ModelPart character_c5;
    private final ModelPart character_o3;
    private final ModelPart character_x2;
    private final ModelPart character_o4;
    private final ModelPart character_l8;
    private final ModelPart character_i4;
    private final ModelPart character_c6;
    private final ModelPart character_e2;
    private final ModelPart text_POLICE3;
    private final ModelPart character_p5;
    private final ModelPart text_BOX3;
    private final ModelPart character_b5;
    private final ModelPart text_PUBLIC3;
    private final ModelPart character_p6;
    private final ModelPart text_CALL3;
    private final ModelPart character_c7;
    private final ModelPart character_a3;
    private final ModelPart character_l9;
    private final ModelPart character_l10;
    private final ModelPart character_u3;
    private final ModelPart character_b6;
    private final ModelPart character_l11;
    private final ModelPart character_i5;
    private final ModelPart character_c8;
    private final ModelPart character_o5;
    private final ModelPart character_x3;
    private final ModelPart character_o6;
    private final ModelPart character_l12;
    private final ModelPart character_i6;
    private final ModelPart character_c9;
    private final ModelPart character_e3;
    private final ModelPart text_POLICE4;
    private final ModelPart character_p7;
    private final ModelPart text_BOX4;
    private final ModelPart character_b7;
    private final ModelPart text_PUBLIC4;
    private final ModelPart character_p8;
    private final ModelPart text_CALL4;
    private final ModelPart character_c10;
    private final ModelPart character_a4;
    private final ModelPart character_l13;
    private final ModelPart character_l14;
    private final ModelPart character_u4;
    private final ModelPart character_b8;
    private final ModelPart character_l15;
    private final ModelPart character_i7;
    private final ModelPart character_c11;
    private final ModelPart character_o7;
    private final ModelPart character_x4;
    private final ModelPart character_o8;
    private final ModelPart character_l16;
    private final ModelPart character_i8;
    private final ModelPart character_c12;
    private final ModelPart character_e4;

    public CapaldiExteriorModel(ModelPart root) {
        super(root);
        this.Shell = root.getChild("Shell");
        this.LeftDoor = root.getChild("LeftDoor");
        this.RightDoor = root.getChild("RightDoor");
        this.text_POLICE = root.getChild("text_POLICE");
        this.character_p = this.text_POLICE.getChild("character_p");
        this.text_BOX = this.character_p.getChild("text_BOX");
        this.character_b = this.text_BOX.getChild("character_b");
        this.text_PUBLIC = this.character_b.getChild("text_PUBLIC");
        this.character_p2 = this.text_PUBLIC.getChild("character_p2");
        this.text_CALL = this.character_p2.getChild("text_CALL");
        this.character_c3 = this.text_CALL.getChild("character_c3");
        this.character_a = this.text_CALL.getChild("character_a");
        this.character_l3 = this.text_CALL.getChild("character_l3");
        this.character_l4 = this.text_CALL.getChild("character_l4");
        this.character_u = this.text_PUBLIC.getChild("character_u");
        this.character_b2 = this.text_PUBLIC.getChild("character_b2");
        this.character_l2 = this.text_PUBLIC.getChild("character_l2");
        this.character_i2 = this.text_PUBLIC.getChild("character_i2");
        this.character_c2 = this.text_PUBLIC.getChild("character_c2");
        this.character_o2 = this.text_BOX.getChild("character_o2");
        this.character_x = this.text_BOX.getChild("character_x");
        this.character_o = this.text_POLICE.getChild("character_o");
        this.character_l = this.text_POLICE.getChild("character_l");
        this.character_i = this.text_POLICE.getChild("character_i");
        this.character_c = this.text_POLICE.getChild("character_c");
        this.character_e = this.text_POLICE.getChild("character_e");
        this.text_POLICE2 = root.getChild("text_POLICE2");
        this.character_p3 = this.text_POLICE2.getChild("character_p3");
        this.text_BOX2 = this.character_p3.getChild("text_BOX2");
        this.character_b3 = this.text_BOX2.getChild("character_b3");
        this.text_PUBLIC2 = this.character_b3.getChild("text_PUBLIC2");
        this.character_p4 = this.text_PUBLIC2.getChild("character_p4");
        this.text_CALL2 = this.character_p4.getChild("text_CALL2");
        this.character_c4 = this.text_CALL2.getChild("character_c4");
        this.character_a2 = this.text_CALL2.getChild("character_a2");
        this.character_l5 = this.text_CALL2.getChild("character_l5");
        this.character_l6 = this.text_CALL2.getChild("character_l6");
        this.character_u2 = this.text_PUBLIC2.getChild("character_u2");
        this.character_b4 = this.text_PUBLIC2.getChild("character_b4");
        this.character_l7 = this.text_PUBLIC2.getChild("character_l7");
        this.character_i3 = this.text_PUBLIC2.getChild("character_i3");
        this.character_c5 = this.text_PUBLIC2.getChild("character_c5");
        this.character_o3 = this.text_BOX2.getChild("character_o3");
        this.character_x2 = this.text_BOX2.getChild("character_x2");
        this.character_o4 = this.text_POLICE2.getChild("character_o4");
        this.character_l8 = this.text_POLICE2.getChild("character_l8");
        this.character_i4 = this.text_POLICE2.getChild("character_i4");
        this.character_c6 = this.text_POLICE2.getChild("character_c6");
        this.character_e2 = this.text_POLICE2.getChild("character_e2");
        this.text_POLICE3 = root.getChild("text_POLICE3");
        this.character_p5 = this.text_POLICE3.getChild("character_p5");
        this.text_BOX3 = this.character_p5.getChild("text_BOX3");
        this.character_b5 = this.text_BOX3.getChild("character_b5");
        this.text_PUBLIC3 = this.character_b5.getChild("text_PUBLIC3");
        this.character_p6 = this.text_PUBLIC3.getChild("character_p6");
        this.text_CALL3 = this.character_p6.getChild("text_CALL3");
        this.character_c7 = this.text_CALL3.getChild("character_c7");
        this.character_a3 = this.text_CALL3.getChild("character_a3");
        this.character_l9 = this.text_CALL3.getChild("character_l9");
        this.character_l10 = this.text_CALL3.getChild("character_l10");
        this.character_u3 = this.text_PUBLIC3.getChild("character_u3");
        this.character_b6 = this.text_PUBLIC3.getChild("character_b6");
        this.character_l11 = this.text_PUBLIC3.getChild("character_l11");
        this.character_i5 = this.text_PUBLIC3.getChild("character_i5");
        this.character_c8 = this.text_PUBLIC3.getChild("character_c8");
        this.character_o5 = this.text_BOX3.getChild("character_o5");
        this.character_x3 = this.text_BOX3.getChild("character_x3");
        this.character_o6 = this.text_POLICE3.getChild("character_o6");
        this.character_l12 = this.text_POLICE3.getChild("character_l12");
        this.character_i6 = this.text_POLICE3.getChild("character_i6");
        this.character_c9 = this.text_POLICE3.getChild("character_c9");
        this.character_e3 = this.text_POLICE3.getChild("character_e3");
        this.text_POLICE4 = root.getChild("text_POLICE4");
        this.character_p7 = this.text_POLICE4.getChild("character_p7");
        this.text_BOX4 = this.character_p7.getChild("text_BOX4");
        this.character_b7 = this.text_BOX4.getChild("character_b7");
        this.text_PUBLIC4 = this.character_b7.getChild("text_PUBLIC4");
        this.character_p8 = this.text_PUBLIC4.getChild("character_p8");
        this.text_CALL4 = this.character_p8.getChild("text_CALL4");
        this.character_c10 = this.text_CALL4.getChild("character_c10");
        this.character_a4 = this.text_CALL4.getChild("character_a4");
        this.character_l13 = this.text_CALL4.getChild("character_l13");
        this.character_l14 = this.text_CALL4.getChild("character_l14");
        this.character_u4 = this.text_PUBLIC4.getChild("character_u4");
        this.character_b8 = this.text_PUBLIC4.getChild("character_b8");
        this.character_l15 = this.text_PUBLIC4.getChild("character_l15");
        this.character_i7 = this.text_PUBLIC4.getChild("character_i7");
        this.character_c11 = this.text_PUBLIC4.getChild("character_c11");
        this.character_o7 = this.text_BOX4.getChild("character_o7");
        this.character_x4 = this.text_BOX4.getChild("character_x4");
        this.character_o8 = this.text_POLICE4.getChild("character_o8");
        this.character_l16 = this.text_POLICE4.getChild("character_l16");
        this.character_i8 = this.text_POLICE4.getChild("character_i8");
        this.character_c12 = this.text_POLICE4.getChild("character_c12");
        this.character_e4 = this.text_POLICE4.getChild("character_e4");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Shell = partdefinition.addOrReplaceChild(
                "Shell",
                CubeListBuilder.create()
                        .texOffs(0, 58)
                        .addBox(-26.0F, -5.0F, -26.0F, 52.0F, 1.0F, 52.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 66)
                        .addBox(-23.0F, -92.0F, -23.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 161)
                        .addBox(-25.0F, -88.0F, -25.0F, 7.0F, 83.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(268, 284)
                        .addBox(17.0F, -80.0F, -24.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(264, 284)
                        .addBox(-18.0F, -80.0F, -24.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(156, 108)
                        .addBox(-18.0F, -81.0F, -24.0F, 36.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(238, 11)
                        .addBox(-21.0F, -87.0F, -27.0F, 42.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 111)
                        .addBox(-22.0F, -93.0F, -22.0F, 44.0F, 6.0F, 44.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 111)
                        .addBox(-18.0F, -97.0F, -18.0F, 36.0F, 4.0F, 36.0F, new CubeDeformation(0.0F))
                        .texOffs(216, 281)
                        .addBox(-23.0F, -80.0F, 15.0F, 1.0F, 75.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(104, 277)
                        .addBox(-23.0F, -80.0F, -2.0F, 1.0F, 75.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(210, 281)
                        .addBox(-24.0F, -80.0F, -1.0F, 1.0F, 75.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(262, 133)
                        .addBox(-23.0F, -8.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(176, 233)
                        .addBox(-22.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(114, 259)
                        .addBox(-23.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(230, 203)
                        .addBox(-22.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(32, 254)
                        .addBox(-23.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(230, 158)
                        .addBox(-22.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(240, 251)
                        .addBox(-23.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 251)
                        .addBox(-23.0F, -80.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 214)
                        .addBox(-22.5F, -77.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(204, 279)
                        .addBox(-23.0F, -80.0F, -17.0F, 1.0F, 75.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(260, 284)
                        .addBox(-24.0F, -80.0F, 17.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(186, 151)
                        .addBox(-24.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F))
                        .texOffs(256, 284)
                        .addBox(-24.0F, -80.0F, -18.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(262, 203)
                        .addBox(-15.0F, -77.0F, 21.5F, 30.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(240, 55)
                        .addBox(-15.0F, -80.0F, 22.0F, 30.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(224, 151)
                        .addBox(-15.0F, -62.0F, 22.0F, 30.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(262, 166)
                        .addBox(-15.0F, -59.0F, 21.5F, 30.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 207)
                        .addBox(-15.0F, -44.0F, 22.0F, 30.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(112, 177)
                        .addBox(-15.0F, -41.0F, 21.5F, 30.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 203)
                        .addBox(-15.0F, -26.0F, 22.0F, 30.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(112, 161)
                        .addBox(-15.0F, -23.0F, 21.5F, 30.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 199)
                        .addBox(-15.0F, -8.0F, 22.0F, 30.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(24, 284)
                        .addBox(-1.0F, -80.0F, 23.0F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(176, 278)
                        .addBox(-2.0F, -80.0F, 22.0F, 4.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(18, 284)
                        .addBox(-17.0F, -80.0F, 22.0F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 284)
                        .addBox(15.0F, -80.0F, 22.0F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(208, 52)
                        .addBox(21.5F, -77.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(208, 248)
                        .addBox(22.0F, -80.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(82, 244)
                        .addBox(22.0F, -62.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(206, 7)
                        .addBox(21.5F, -59.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(240, 100)
                        .addBox(22.0F, -44.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(112, 199)
                        .addBox(21.5F, -41.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(240, 67)
                        .addBox(22.0F, -26.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(198, 188)
                        .addBox(21.5F, -23.0F, -15.0F, 1.0F, 15.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(240, 22)
                        .addBox(22.0F, -8.0F, -15.0F, 1.0F, 3.0F, 30.0F, new CubeDeformation(0.0F))
                        .texOffs(198, 278)
                        .addBox(23.0F, -80.0F, -1.0F, 1.0F, 75.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(94, 277)
                        .addBox(22.0F, -80.0F, -2.0F, 1.0F, 75.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(192, 278)
                        .addBox(22.0F, -80.0F, 15.0F, 1.0F, 75.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(186, 278)
                        .addBox(22.0F, -80.0F, -17.0F, 1.0F, 75.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(252, 284)
                        .addBox(-18.0F, -80.0F, 23.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(156, 106)
                        .addBox(-18.0F, -81.0F, 23.0F, 36.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(248, 284)
                        .addBox(17.0F, -80.0F, 23.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(244, 284)
                        .addBox(23.0F, -80.0F, 17.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(162, 0)
                        .addBox(23.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F))
                        .texOffs(240, 284)
                        .addBox(23.0F, -80.0F, -18.0F, 1.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 161)
                        .addBox(-25.0F, -88.0F, 18.0F, 7.0F, 83.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 161)
                        .addBox(18.0F, -88.0F, 18.0F, 7.0F, 83.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 161)
                        .addBox(18.0F, -88.0F, -25.0F, 7.0F, 83.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 58)
                        .addBox(-23.0F, -92.0F, 19.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 41)
                        .addBox(19.0F, -92.0F, 19.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 33)
                        .addBox(19.0F, -92.0F, -23.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(156, 58)
                        .addBox(-27.0F, -87.0F, -21.0F, 5.0F, 6.0F, 42.0F, new CubeDeformation(0.0F))
                        .texOffs(238, 0)
                        .addBox(-21.0F, -87.0F, 22.0F, 42.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                        .texOffs(134, 151)
                        .addBox(22.0F, -87.0F, -21.0F, 5.0F, 6.0F, 42.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-27.0F, -4.0F, -27.0F, 54.0F, 4.0F, 54.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r1 = Shell.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(40, 74)
                        .addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 17)
                        .addBox(-2.0F, -103.0F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(24, 49)
                        .addBox(-2.0F, -105.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 10)
                        .addBox(-3.0F, -104.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 26)
                        .addBox(-3.0F, -98.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 0)
                        .addBox(-2.5F, -97.0F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition cube_r2 = Shell.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(28, 74)
                        .addBox(-2.5F, -103.0F, -0.5F, 5.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        PartDefinition LeftDoor = partdefinition.addOrReplaceChild(
                "LeftDoor",
                CubeListBuilder.create()
                        .texOffs(6, 284)
                        .addBox(-0.0833F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 139)
                        .addBox(1.9167F, 34.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 284)
                        .addBox(14.9167F, -37.7692F, 0.0167F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 127)
                        .addBox(1.9167F, 19.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 111)
                        .addBox(1.9167F, 1.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 135)
                        .addBox(1.9167F, 16.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 90)
                        .addBox(1.9167F, -16.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 131)
                        .addBox(1.9167F, -1.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 74)
                        .addBox(1.9167F, -34.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 127)
                        .addBox(1.9167F, -19.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 123)
                        .addBox(1.9167F, -37.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(234, 281)
                        .addBox(15.9167F, -37.7692F, -0.9833F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 0)
                        .addBox(13.9167F, -11.2692F, -0.4833F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-16.9167F, -18.2308F, -23.0167F));

        PartDefinition RightDoor = partdefinition.addOrReplaceChild(
                "RightDoor",
                CubeListBuilder.create()
                        .texOffs(228, 281)
                        .addBox(-16.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(222, 281)
                        .addBox(-1.9167F, -37.8333F, 0.0167F, 2.0F, 75.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 119)
                        .addBox(-14.9167F, 34.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 58)
                        .addBox(-14.9167F, 19.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 115)
                        .addBox(-14.9167F, 16.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 32)
                        .addBox(-14.9167F, 1.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 111)
                        .addBox(-14.9167F, -1.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 16)
                        .addBox(-14.9167F, -16.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 106)
                        .addBox(-14.9167F, -19.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 48)
                        .addBox(-14.9167F, -37.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-14.9167F, -34.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(28, 6)
                        .addBox(-15.9167F, -11.3333F, -0.9833F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(16.9167F, -18.1667F, -23.0167F));

        PartDefinition text_POLICE = partdefinition.addOrReplaceChild(
                "text_POLICE", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition character_p = text_POLICE.addOrReplaceChild(
                "character_p",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-14.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_BOX = character_p.addOrReplaceChild(
                "text_BOX", CubeListBuilder.create(), PartPose.offset(12.8F, -48.0F, -18.0F));

        PartDefinition character_b = text_BOX.addOrReplaceChild(
                "character_b",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition text_PUBLIC = character_b.addOrReplaceChild(
                "text_PUBLIC", CubeListBuilder.create(), PartPose.offset(-13.78F, 0.9F, -1.2F));

        PartDefinition character_p2 = text_PUBLIC.addOrReplaceChild(
                "character_p2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition text_CALL = character_p2.addOrReplaceChild(
                "text_CALL", CubeListBuilder.create(), PartPose.offset(-7.35F, -61.7F, -24.8F));

        PartDefinition character_c3 = text_CALL.addOrReplaceChild(
                "character_c3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_a = text_CALL.addOrReplaceChild(
                "character_a",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l3 = text_CALL.addOrReplaceChild(
                "character_l3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l4 = text_CALL.addOrReplaceChild(
                "character_l4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_u = text_PUBLIC.addOrReplaceChild(
                "character_u",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_b2 = text_PUBLIC.addOrReplaceChild(
                "character_b2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_l2 = text_PUBLIC.addOrReplaceChild(
                "character_l2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_i2 = text_PUBLIC.addOrReplaceChild(
                "character_i2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_c2 = text_PUBLIC.addOrReplaceChild(
                "character_c2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_o2 = text_BOX.addOrReplaceChild(
                "character_o2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-0.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_x = text_BOX.addOrReplaceChild(
                "character_x",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(0.46F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.46F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.96F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_o = text_POLICE.addOrReplaceChild(
                "character_o",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-12.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-10.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_l = text_POLICE.addOrReplaceChild(
                "character_l",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-9.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_i = text_POLICE.addOrReplaceChild(
                "character_i",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-7.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_c = text_POLICE.addOrReplaceChild(
                "character_c",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_e = text_POLICE.addOrReplaceChild(
                "character_e",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_POLICE2 = partdefinition.addOrReplaceChild(
                "text_POLICE2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition character_p3 = text_POLICE2.addOrReplaceChild(
                "character_p3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-14.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_BOX2 = character_p3.addOrReplaceChild(
                "text_BOX2", CubeListBuilder.create(), PartPose.offset(12.8F, -48.0F, -18.0F));

        PartDefinition character_b3 = text_BOX2.addOrReplaceChild(
                "character_b3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition text_PUBLIC2 = character_b3.addOrReplaceChild(
                "text_PUBLIC2", CubeListBuilder.create(), PartPose.offset(-13.78F, 0.9F, -1.2F));

        PartDefinition character_p4 = text_PUBLIC2.addOrReplaceChild(
                "character_p4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition text_CALL2 = character_p4.addOrReplaceChild(
                "text_CALL2", CubeListBuilder.create(), PartPose.offset(-7.35F, -61.7F, -24.8F));

        PartDefinition character_c4 = text_CALL2.addOrReplaceChild(
                "character_c4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_a2 = text_CALL2.addOrReplaceChild(
                "character_a2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l5 = text_CALL2.addOrReplaceChild(
                "character_l5",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l6 = text_CALL2.addOrReplaceChild(
                "character_l6",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_u2 = text_PUBLIC2.addOrReplaceChild(
                "character_u2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_b4 = text_PUBLIC2.addOrReplaceChild(
                "character_b4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_l7 = text_PUBLIC2.addOrReplaceChild(
                "character_l7",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_i3 = text_PUBLIC2.addOrReplaceChild(
                "character_i3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_c5 = text_PUBLIC2.addOrReplaceChild(
                "character_c5",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_o3 = text_BOX2.addOrReplaceChild(
                "character_o3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-0.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_x2 = text_BOX2.addOrReplaceChild(
                "character_x2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(0.46F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.46F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.96F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_o4 = text_POLICE2.addOrReplaceChild(
                "character_o4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-12.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-10.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_l8 = text_POLICE2.addOrReplaceChild(
                "character_l8",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-9.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_i4 = text_POLICE2.addOrReplaceChild(
                "character_i4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-7.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_c6 = text_POLICE2.addOrReplaceChild(
                "character_c6",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_e2 = text_POLICE2.addOrReplaceChild(
                "character_e2",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_POLICE3 = partdefinition.addOrReplaceChild(
                "text_POLICE3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition character_p5 = text_POLICE3.addOrReplaceChild(
                "character_p5",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-14.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_BOX3 = character_p5.addOrReplaceChild(
                "text_BOX3", CubeListBuilder.create(), PartPose.offset(12.8F, -48.0F, -18.0F));

        PartDefinition character_b5 = text_BOX3.addOrReplaceChild(
                "character_b5",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition text_PUBLIC3 = character_b5.addOrReplaceChild(
                "text_PUBLIC3", CubeListBuilder.create(), PartPose.offset(-13.78F, 0.9F, -1.2F));

        PartDefinition character_p6 = text_PUBLIC3.addOrReplaceChild(
                "character_p6",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition text_CALL3 = character_p6.addOrReplaceChild(
                "text_CALL3", CubeListBuilder.create(), PartPose.offset(-7.35F, -61.7F, -24.8F));

        PartDefinition character_c7 = text_CALL3.addOrReplaceChild(
                "character_c7",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_a3 = text_CALL3.addOrReplaceChild(
                "character_a3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l9 = text_CALL3.addOrReplaceChild(
                "character_l9",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l10 = text_CALL3.addOrReplaceChild(
                "character_l10",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_u3 = text_PUBLIC3.addOrReplaceChild(
                "character_u3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_b6 = text_PUBLIC3.addOrReplaceChild(
                "character_b6",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_l11 = text_PUBLIC3.addOrReplaceChild(
                "character_l11",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_i5 = text_PUBLIC3.addOrReplaceChild(
                "character_i5",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_c8 = text_PUBLIC3.addOrReplaceChild(
                "character_c8",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_o5 = text_BOX3.addOrReplaceChild(
                "character_o5",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-0.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_x3 = text_BOX3.addOrReplaceChild(
                "character_x3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(0.46F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.46F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.96F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_o6 = text_POLICE3.addOrReplaceChild(
                "character_o6",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-12.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-10.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_l12 = text_POLICE3.addOrReplaceChild(
                "character_l12",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-9.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_i6 = text_POLICE3.addOrReplaceChild(
                "character_i6",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-7.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_c9 = text_POLICE3.addOrReplaceChild(
                "character_c9",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_e3 = text_POLICE3.addOrReplaceChild(
                "character_e3",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_POLICE4 = partdefinition.addOrReplaceChild(
                "text_POLICE4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition character_p7 = text_POLICE4.addOrReplaceChild(
                "character_p7",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-14.5F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.3F, -51.2F, -18.0F, 0.8F, 2.0F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -51.2F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-13.7F, -50.0F, -18.0F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition text_BOX4 = character_p7.addOrReplaceChild(
                "text_BOX4", CubeListBuilder.create(), PartPose.offset(12.8F, -48.0F, -18.0F));

        PartDefinition character_b7 = text_BOX4.addOrReplaceChild(
                "character_b7",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.18F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, -0.8F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 1.6F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.38F, 0.4F, -1.2F, 0.4F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 0.6F, -1.2F, 0.4F, 0.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, 1.0F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.98F, -0.8F, -1.2F, 0.8F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition text_PUBLIC4 = character_b7.addOrReplaceChild(
                "text_PUBLIC4", CubeListBuilder.create(), PartPose.offset(-13.78F, 0.9F, -1.2F));

        PartDefinition character_p8 = text_PUBLIC4.addOrReplaceChild(
                "character_p8",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.2F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.6F, -64.8F, -24.8F, 0.4F, 1.0F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-8.8F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition text_CALL4 = character_p8.addOrReplaceChild(
                "text_CALL4", CubeListBuilder.create(), PartPose.offset(-7.35F, -61.7F, -24.8F));

        PartDefinition character_c10 = text_CALL4.addOrReplaceChild(
                "character_c10",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.76F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -61.6F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.36F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_a4 = text_CALL4.addOrReplaceChild(
                "character_a4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.6F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.1F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-4.3F, -61.0F, -26.4F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l13 = text_CALL4.addOrReplaceChild(
                "character_l13",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-3.64F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.24F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_l14 = text_CALL4.addOrReplaceChild(
                "character_l14",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.58F, -61.6F, -26.4F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-2.18F, -60.4F, -26.4F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(4.96F, 60.0F, 26.4F));

        PartDefinition character_u4 = text_PUBLIC4.addOrReplaceChild(
                "character_u4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-8.14F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.34F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-7.74F, -63.6F, -24.8F, 0.4F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_b8 = text_PUBLIC4.addOrReplaceChild(
                "character_b8",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.88F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.8F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -63.6F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.48F, -64.2F, -24.8F, 0.2F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.1F, -24.8F, 0.2F, 0.2F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -63.9F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.28F, -64.8F, -24.8F, 0.4F, 0.7F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_l15 = text_PUBLIC4.addOrReplaceChild(
                "character_l15",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-5.82F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-5.42F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_i7 = text_PUBLIC4.addOrReplaceChild(
                "character_i7",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.76F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_c11 = text_PUBLIC4.addOrReplaceChild(
                "character_c11",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.3F, -64.8F, -24.8F, 0.4F, 1.6F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -64.8F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -63.6F, -24.8F, 0.6F, 0.4F, 5.55F, new CubeDeformation(0.0F)),
                PartPose.offset(8.4F, 63.2F, 24.8F));

        PartDefinition character_o7 = text_BOX4.addOrReplaceChild(
                "character_o7",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-2.06F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, -0.8F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-0.46F, -0.8F, -1.2F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-1.26F, 1.6F, -1.2F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_x4 = text_BOX4.addOrReplaceChild(
                "character_x4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(0.46F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.46F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, -0.8F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(1.66F, 1.3F, -1.2F, 0.8F, 1.1F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(0.96F, 0.1F, -1.2F, 1.0F, 1.4F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(2.58F, -2.4F, 1.2F));

        PartDefinition character_o8 = text_POLICE4.addOrReplaceChild(
                "character_o8",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-12.38F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -51.2F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-10.78F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-11.58F, -48.8F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_l16 = text_POLICE4.addOrReplaceChild(
                "character_l16",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-9.86F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-9.06F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_i8 = text_POLICE4.addOrReplaceChild(
                "character_i8",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-7.74F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_c12 = text_POLICE4.addOrReplaceChild(
                "character_c12",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-6.82F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-6.02F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        PartDefinition character_e4 = text_POLICE4.addOrReplaceChild(
                "character_e4",
                CubeListBuilder.create()
                        .texOffs(346, 113)
                        .addBox(-4.7F, -51.2F, -18.0F, 0.8F, 3.2F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -51.2F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -50.0F, -18.0F, 0.8F, 0.8F, 5.6F, new CubeDeformation(0.0F))
                        .texOffs(346, 113)
                        .addBox(-3.9F, -48.8F, -18.0F, 1.2F, 0.8F, 5.6F, new CubeDeformation(0.0F)),
                PartPose.offset(-2.1F, -34.25F, -9.25F));

        return LayerDefinition.create(meshdefinition, 368, 368);
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
            PoseStack matrixStack,
            VertexConsumer buffer,
            int packedLight,
            int packedOverlay,
            float red,
            float green,
            float blue,
            float alpha) {
        matrixStack.pushPose();
        matrixStack.translate(0, 0.75f, 0);
        matrixStack.scale(0.5f, 0.5f, 0.5f);
        LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        RightDoor.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        Shell.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        text_POLICE.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        text_POLICE2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        text_POLICE3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        text_POLICE4.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        matrixStack.popPose();
    }

    public void setRotationAngle(ModelPart modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }

    @Override
    public ModelPart root() {
        return super.root();
    }

    @Override
    public void setupAnim(Entity entity, float v, float v1, float v2, float v3, float v4) {}
}
