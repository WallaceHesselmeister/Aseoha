/* (C) TAMA Studios 2025 */
package tama.Client.Models.Consoles;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import java.util.Optional;
import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.control.ControlType;
import tama.Misc.IHelpWithConsole;
import tama.aseoha;

public class BattleConsoleModel<T extends ConsoleTile> extends BaseTileHierarchicalModel<ConsoleTile>
        implements IAdditionalConsoleRenderData {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation(aseoha.MODID, "battleconsolemodel"), "main");
    private final ModelPart Console;
    private final ModelPart Panels;
    private final ModelPart BasePanel1;
    private final ModelPart UpperMainPanel;
    private final ModelPart Monitor3;
    private final ModelPart UpperPanelSupportsAndWiring;
    private final ModelPart BasePanel2;
    private final ModelPart LowerMainPanel;
    private final ModelPart LowerPanelSupportsAndWiring;
    private final ModelPart BasePanel3;
    private final ModelPart UpperMainPanel2;
    private final ModelPart Monitor2;
    private final ModelPart UpperPanelSupportsAndWiring2;
    private final ModelPart BasePanel4;
    private final ModelPart LowerMainPanel2;
    private final ModelPart LowerPanelSupportsAndWiring2;
    private final ModelPart BasePanel5;
    private final ModelPart UpperMainPanel3;
    private final ModelPart Monitor4;
    private final ModelPart ThottleSlider;
    private final ModelPart UpperPanelSupportsAndWiring3;
    private final ModelPart BasePanel6;
    private final ModelPart LowerMainPanel3;
    private final ModelPart DimensionCube;
    private final ModelPart LowerPanelSupportsAndWiring3;
    private final ModelPart TimeRotor;
    private final ModelPart RotorBase;
    private final ModelPart Rotor;
    private final ModelPart RotorCrystal;
    private final ModelPart EnergyCrystal;

    public BattleConsoleModel(ModelPart root) {
        super(root);
        this.Console = root.getChild("Console");
        this.Panels = this.Console.getChild("Panels");
        this.BasePanel1 = this.Panels.getChild("BasePanel1");
        this.UpperMainPanel = this.BasePanel1.getChild("UpperMainPanel");
        this.Monitor3 = this.UpperMainPanel.getChild("Monitor3");
        this.UpperPanelSupportsAndWiring = this.BasePanel1.getChild("UpperPanelSupportsAndWiring");
        this.BasePanel2 = this.Panels.getChild("BasePanel2");
        this.LowerMainPanel = this.BasePanel2.getChild("LowerMainPanel");
        this.LowerPanelSupportsAndWiring = this.BasePanel2.getChild("LowerPanelSupportsAndWiring");
        this.BasePanel3 = this.Panels.getChild("BasePanel3");
        this.UpperMainPanel2 = this.BasePanel3.getChild("UpperMainPanel2");
        this.Monitor2 = this.UpperMainPanel2.getChild("Monitor2");
        this.UpperPanelSupportsAndWiring2 = this.BasePanel3.getChild("UpperPanelSupportsAndWiring2");
        this.BasePanel4 = this.Panels.getChild("BasePanel4");
        this.LowerMainPanel2 = this.BasePanel4.getChild("LowerMainPanel2");
        this.LowerPanelSupportsAndWiring2 = this.BasePanel4.getChild("LowerPanelSupportsAndWiring2");
        this.BasePanel5 = this.Panels.getChild("BasePanel5");
        this.UpperMainPanel3 = this.BasePanel5.getChild("UpperMainPanel3");
        this.Monitor4 = this.UpperMainPanel3.getChild("Monitor4");
        this.ThottleSlider = this.Monitor4.getChild("ThottleSlider");
        this.UpperPanelSupportsAndWiring3 = this.BasePanel5.getChild("UpperPanelSupportsAndWiring3");
        this.BasePanel6 = this.Panels.getChild("BasePanel6");
        this.LowerMainPanel3 = this.BasePanel6.getChild("LowerMainPanel3");
        this.DimensionCube = this.LowerMainPanel3.getChild("DimensionCube");
        this.LowerPanelSupportsAndWiring3 = this.BasePanel6.getChild("LowerPanelSupportsAndWiring3");
        this.TimeRotor = this.Console.getChild("TimeRotor");
        this.RotorBase = this.TimeRotor.getChild("RotorBase");
        this.Rotor = this.TimeRotor.getChild("Rotor");
        this.RotorCrystal = this.Rotor.getChild("RotorCrystal");
        this.EnergyCrystal = this.Console.getChild("EnergyCrystal");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Console = partdefinition.addOrReplaceChild(
                "Console", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Panels =
                Console.addOrReplaceChild("Panels", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition BasePanel1 =
                Panels.addOrReplaceChild("BasePanel1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition UpperMainPanel = BasePanel1.addOrReplaceChild(
                "UpperMainPanel",
                CubeListBuilder.create()
                        .texOffs(30, 2)
                        .addBox(-5.5F, 2.0F, -5.725F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)),
                PartPose.offset(0.0F, -17.0F, -10.0F));

        PartDefinition Monitor3 = UpperMainPanel.addOrReplaceChild(
                "Monitor3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 2.0F, -5.725F, 0.1047F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Monitor3.addOrReplaceChild(
                "cube_r1",
                CubeListBuilder.create()
                        .texOffs(97, 45)
                        .addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.7116F, 9.1595F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r2 = Monitor3.addOrReplaceChild(
                "cube_r2",
                CubeListBuilder.create()
                        .texOffs(100, 8)
                        .addBox(-4.5F, 2.0F, -5.725F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0386F, 4.5238F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r3 = Monitor3.addOrReplaceChild(
                "cube_r3",
                CubeListBuilder.create()
                        .texOffs(82, 65)
                        .addBox(4.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(82, 77)
                        .addBox(-5.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.3722F, 5.926F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Panel1Screen_r1 = Monitor3.addOrReplaceChild(
                "Panel1Screen_r1",
                CubeListBuilder.create()
                        .texOffs(57, 23)
                        .addBox(-4.5F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(59, 13)
                        .addBox(-4.5F, 0.25F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, 5.725F, 0.3927F, 0.0F, 0.0F));

        PartDefinition UpperPanelSupportsAndWiring = BasePanel1.addOrReplaceChild(
                "UpperPanelSupportsAndWiring",
                CubeListBuilder.create()
                        .texOffs(81, 53)
                        .addBox(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(12, 70)
                        .addBox(-1.0F, -13.1271F, -15.7758F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r4 = UpperPanelSupportsAndWiring.addOrReplaceChild(
                "cube_r4",
                CubeListBuilder.create()
                        .texOffs(30, 28)
                        .addBox(4.5F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 74)
                        .addBox(-2.5F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 94)
                        .addBox(2.25F, -1.0F, -7.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(54, 43)
                        .addBox(-4.5F, -1.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(97, 10)
                        .addBox(-4.5F, 1.0F, 2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -11.2053F, -12.0656F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r5 = UpperPanelSupportsAndWiring.addOrReplaceChild(
                "cube_r5",
                CubeListBuilder.create()
                        .texOffs(0, 100)
                        .addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -3.6934F, -2.4588F, 1.1781F, 0.0F, 0.0F));

        PartDefinition BasePanel2 = Panels.addOrReplaceChild(
                "BasePanel2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition LowerMainPanel = BasePanel2.addOrReplaceChild(
                "LowerMainPanel",
                CubeListBuilder.create()
                        .texOffs(30, 12)
                        .addBox(-5.5F, 4.5594F, -8.3942F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)),
                PartPose.offset(0.0F, -17.7116F, -6.5655F));

        PartDefinition cube_r6 = LowerMainPanel.addOrReplaceChild(
                "cube_r6",
                CubeListBuilder.create()
                        .texOffs(99, 94)
                        .addBox(-4.5F, 1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r7 = LowerMainPanel.addOrReplaceChild(
                "cube_r7",
                CubeListBuilder.create()
                        .texOffs(100, 25)
                        .addBox(-4.5F, 4.0F, -5.725F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.327F, -4.6357F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r8 = LowerMainPanel.addOrReplaceChild(
                "cube_r8",
                CubeListBuilder.create()
                        .texOffs(0, 36)
                        .addBox(-5.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(4, 36)
                        .addBox(4.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(58, 84)
                        .addBox(4.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(85, 13)
                        .addBox(-5.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.3394F, -3.2336F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Panel2Screen_r1 = LowerMainPanel.addOrReplaceChild(
                "Panel2Screen_r1",
                CubeListBuilder.create()
                        .texOffs(56, 33)
                        .addBox(-4.5F, 2.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 60)
                        .addBox(-4.5F, 2.25F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.7116F, -3.4345F, 0.3927F, 0.0F, 0.0F));

        PartDefinition LowerPanelSupportsAndWiring = BasePanel2.addOrReplaceChild(
                "LowerPanelSupportsAndWiring",
                CubeListBuilder.create()
                        .texOffs(54, 53)
                        .addBox(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(12, 82)
                        .addBox(-0.999F, -11.1277F, -15.7745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(96, 89)
                        .addBox(-4.0F, -12.8164F, -15.8415F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r9 = LowerPanelSupportsAndWiring.addOrReplaceChild(
                "cube_r9",
                CubeListBuilder.create()
                        .texOffs(54, 39)
                        .addBox(-3.0F, -3.0F, -7.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 63)
                        .addBox(-3.75F, -2.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(70, 81)
                        .addBox(3.5F, -3.0F, -5.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(30, 18)
                        .addBox(1.5F, -5.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -11.2053F, -12.0656F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r10 = LowerPanelSupportsAndWiring.addOrReplaceChild(
                "cube_r10",
                CubeListBuilder.create()
                        .texOffs(84, 99)
                        .addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -4.6934F, -2.4588F, 1.1781F, 0.0F, 0.0F));

        PartDefinition BasePanel3 = Panels.addOrReplaceChild(
                "BasePanel3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition UpperMainPanel2 = BasePanel3.addOrReplaceChild(
                "UpperMainPanel2",
                CubeListBuilder.create()
                        .texOffs(0, 30)
                        .addBox(-5.5F, 2.0F, -5.725F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)),
                PartPose.offset(0.0F, -17.0F, -10.0F));

        PartDefinition Monitor2 = UpperMainPanel2.addOrReplaceChild(
                "Monitor2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 2.0F, -5.725F, 0.1047F, 0.0F, 0.0F));

        PartDefinition cube_r11 = Monitor2.addOrReplaceChild(
                "cube_r11",
                CubeListBuilder.create()
                        .texOffs(97, 20)
                        .addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.7116F, 9.1595F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r12 = Monitor2.addOrReplaceChild(
                "cube_r12",
                CubeListBuilder.create()
                        .texOffs(100, 6)
                        .addBox(-4.5F, 2.0F, -5.725F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0386F, 4.5238F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r13 = Monitor2.addOrReplaceChild(
                "cube_r13",
                CubeListBuilder.create()
                        .texOffs(82, 33)
                        .addBox(4.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(46, 82)
                        .addBox(-5.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.3722F, 5.926F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Panel1Screen_r2 = Monitor2.addOrReplaceChild(
                "Panel1Screen_r2",
                CubeListBuilder.create()
                        .texOffs(54, 43)
                        .addBox(-4.5F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(54, 53)
                        .addBox(-4.5F, 0.25F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, 5.725F, 0.3927F, 0.0F, 0.0F));

        PartDefinition UpperPanelSupportsAndWiring2 = BasePanel3.addOrReplaceChild(
                "UpperPanelSupportsAndWiring2",
                CubeListBuilder.create()
                        .texOffs(60, 12)
                        .addBox(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(0, 60)
                        .addBox(-1.0F, -13.1271F, -15.7758F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r14 = UpperPanelSupportsAndWiring2.addOrReplaceChild(
                "cube_r14",
                CubeListBuilder.create()
                        .texOffs(30, 8)
                        .addBox(4.5F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 63)
                        .addBox(-2.5F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(38, 81)
                        .addBox(2.25F, -1.0F, -7.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 48)
                        .addBox(-4.5F, -1.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(58, 96)
                        .addBox(-4.5F, 1.0F, 2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -11.2053F, -12.0656F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r15 = UpperPanelSupportsAndWiring2.addOrReplaceChild(
                "cube_r15",
                CubeListBuilder.create()
                        .texOffs(76, 99)
                        .addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -3.6934F, -2.4588F, 1.1781F, 0.0F, 0.0F));

        PartDefinition BasePanel4 = Panels.addOrReplaceChild(
                "BasePanel4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition LowerMainPanel2 = BasePanel4.addOrReplaceChild(
                "LowerMainPanel2",
                CubeListBuilder.create()
                        .texOffs(0, 20)
                        .addBox(-5.5F, 4.5594F, -8.3942F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)),
                PartPose.offset(0.0F, -17.7116F, -6.5655F));

        PartDefinition cube_r16 = LowerMainPanel2.addOrReplaceChild(
                "cube_r16",
                CubeListBuilder.create()
                        .texOffs(97, 17)
                        .addBox(-4.5F, 1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r17 = LowerMainPanel2.addOrReplaceChild(
                "cube_r17",
                CubeListBuilder.create()
                        .texOffs(100, 4)
                        .addBox(-4.5F, 4.0F, -5.725F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.327F, -4.6357F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r18 = LowerMainPanel2.addOrReplaceChild(
                "cube_r18",
                CubeListBuilder.create()
                        .texOffs(30, 2)
                        .addBox(-5.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(34, 2)
                        .addBox(4.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(80, 53)
                        .addBox(4.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 82)
                        .addBox(-5.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.3394F, -3.2336F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Panel2Screen_r2 = LowerMainPanel2.addOrReplaceChild(
                "Panel2Screen_r2",
                CubeListBuilder.create()
                        .texOffs(30, 22)
                        .addBox(-4.5F, 2.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 52)
                        .addBox(-4.5F, 2.25F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.7116F, -3.4345F, 0.3927F, 0.0F, 0.0F));

        PartDefinition LowerPanelSupportsAndWiring2 = BasePanel4.addOrReplaceChild(
                "LowerPanelSupportsAndWiring2",
                CubeListBuilder.create()
                        .texOffs(0, 50)
                        .addBox(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(24, 74)
                        .addBox(-0.999F, -11.1277F, -15.7745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(78, 95)
                        .addBox(-4.0F, -12.8164F, -15.8415F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r19 = LowerPanelSupportsAndWiring2.addOrReplaceChild(
                "cube_r19",
                CubeListBuilder.create()
                        .texOffs(27, 38)
                        .addBox(-3.0F, -3.0F, -7.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(51, 60)
                        .addBox(-3.75F, -2.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 59)
                        .addBox(3.5F, -3.0F, -5.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 26)
                        .addBox(1.5F, -5.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -11.2053F, -12.0656F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r20 = LowerPanelSupportsAndWiring2.addOrReplaceChild(
                "cube_r20",
                CubeListBuilder.create()
                        .texOffs(46, 99)
                        .addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -4.6934F, -2.4588F, 1.1781F, 0.0F, 0.0F));

        PartDefinition BasePanel5 = Panels.addOrReplaceChild(
                "BasePanel5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition UpperMainPanel3 = BasePanel5.addOrReplaceChild(
                "UpperMainPanel3",
                CubeListBuilder.create()
                        .texOffs(0, 10)
                        .addBox(-5.5F, 2.0F, -5.725F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)),
                PartPose.offset(0.0F, -17.0F, -10.0F));

        PartDefinition Monitor4 = UpperMainPanel3.addOrReplaceChild(
                "Monitor4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 2.0F, -5.725F, 0.1047F, 0.0F, 0.0F));

        PartDefinition cube_r21 = Monitor4.addOrReplaceChild(
                "cube_r21",
                CubeListBuilder.create()
                        .texOffs(97, 14)
                        .addBox(-4.5F, -1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.7116F, 9.1595F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r22 = Monitor4.addOrReplaceChild(
                "cube_r22",
                CubeListBuilder.create()
                        .texOffs(94, 41)
                        .addBox(-4.5F, 2.0F, -5.725F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0386F, 4.5238F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r23 = Monitor4.addOrReplaceChild(
                "cube_r23",
                CubeListBuilder.create()
                        .texOffs(70, 72)
                        .addBox(4.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(24, 75)
                        .addBox(-5.5F, -1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.3722F, 5.926F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Panel1Screen_r3 = Monitor4.addOrReplaceChild(
                "Panel1Screen_r3",
                CubeListBuilder.create()
                        .texOffs(27, 42)
                        .addBox(-4.5F, 0.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 50)
                        .addBox(-4.5F, 0.25F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -2.0F, 5.725F, 0.3927F, 0.0F, 0.0F));

        PartDefinition ThottleSlider = Monitor4.addOrReplaceChild(
                "ThottleSlider", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 5.725F));

        PartDefinition Panel1Screen_r4 = ThottleSlider.addOrReplaceChild(
                "Panel1Screen_r4",
                CubeListBuilder.create()
                        .texOffs(0, 16)
                        .addBox(-3.5F, -0.25F, -4.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition UpperPanelSupportsAndWiring3 = BasePanel5.addOrReplaceChild(
                "UpperPanelSupportsAndWiring3",
                CubeListBuilder.create()
                        .texOffs(57, 23)
                        .addBox(-1.0F, -5.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(56, 33)
                        .addBox(-1.0F, -13.1271F, -15.7758F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.01F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r24 = UpperPanelSupportsAndWiring3.addOrReplaceChild(
                "cube_r24",
                CubeListBuilder.create()
                        .texOffs(0, 16)
                        .addBox(4.5F, -3.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 53)
                        .addBox(-2.5F, 0.0F, 0.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(24, 64)
                        .addBox(2.25F, -1.0F, -7.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(30, 0)
                        .addBox(-4.5F, -1.0F, -3.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(95, 0)
                        .addBox(-4.5F, 1.0F, 2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -11.2053F, -12.0656F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r25 = UpperPanelSupportsAndWiring3.addOrReplaceChild(
                "cube_r25",
                CubeListBuilder.create()
                        .texOffs(38, 99)
                        .addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -3.6934F, -2.4588F, 1.1781F, 0.0F, 0.0F));

        PartDefinition BasePanel6 = Panels.addOrReplaceChild(
                "BasePanel6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition LowerMainPanel3 = BasePanel6.addOrReplaceChild(
                "LowerMainPanel3",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-5.5F, 4.5594F, -8.3942F, 11.0F, 2.0F, 8.0F, new CubeDeformation(-0.001F)),
                PartPose.offset(0.0F, -17.7116F, -6.5655F));

        PartDefinition cube_r26 = LowerMainPanel3.addOrReplaceChild(
                "cube_r26",
                CubeListBuilder.create()
                        .texOffs(70, 84)
                        .addBox(-4.5F, 1.0F, -0.5F, 9.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r27 = LowerMainPanel3.addOrReplaceChild(
                "cube_r27",
                CubeListBuilder.create()
                        .texOffs(30, 0)
                        .addBox(-4.5F, 4.0F, -5.725F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -1.327F, -4.6357F, 0.3927F, 0.0F, 0.0F));

        PartDefinition cube_r28 = LowerMainPanel3.addOrReplaceChild(
                "cube_r28",
                CubeListBuilder.create()
                        .texOffs(0, 26)
                        .addBox(-5.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(4, 26)
                        .addBox(4.5F, 0.25F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
                        .texOffs(68, 0)
                        .addBox(4.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 70)
                        .addBox(-5.5F, 1.0F, -6.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 1.3394F, -3.2336F, 0.3927F, 0.0F, 0.0F));

        PartDefinition Panel2Screen_r3 = LowerMainPanel3.addOrReplaceChild(
                "Panel2Screen_r3",
                CubeListBuilder.create()
                        .texOffs(29, 32)
                        .addBox(-4.5F, 2.0F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 40)
                        .addBox(-4.5F, 2.25F, -6.0F, 9.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.7116F, -3.4345F, 0.3927F, 0.0F, 0.0F));

        PartDefinition DimensionCube = LowerMainPanel3.addOrReplaceChild(
                "DimensionCube", CubeListBuilder.create(), PartPose.offset(0.0F, -0.5225F, -5.0281F));

        PartDefinition cube_r29 = DimensionCube.addOrReplaceChild(
                "cube_r29",
                CubeListBuilder.create()
                        .texOffs(80, 0)
                        .addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

        PartDefinition LowerPanelSupportsAndWiring3 = BasePanel6.addOrReplaceChild(
                "LowerPanelSupportsAndWiring3",
                CubeListBuilder.create()
                        .texOffs(0, 40)
                        .addBox(-1.0F, -6.0F, -5.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(0, 0)
                        .addBox(-0.999F, -11.1277F, -15.7745F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.01F))
                        .texOffs(94, 82)
                        .addBox(-4.0F, -12.8164F, -15.8415F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r30 = LowerPanelSupportsAndWiring3.addOrReplaceChild(
                "cube_r30",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-3.0F, -3.0F, -7.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 43)
                        .addBox(-3.75F, -2.0F, -1.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(27, 56)
                        .addBox(3.5F, -3.0F, -5.0F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 6)
                        .addBox(1.5F, -5.0F, -1.0F, 0.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -11.2053F, -12.0656F, 3.1416F, 0.0F, 0.0F));

        PartDefinition cube_r31 = LowerPanelSupportsAndWiring3.addOrReplaceChild(
                "cube_r31",
                CubeListBuilder.create()
                        .texOffs(96, 97)
                        .addBox(-1.5F, -14.0F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, -4.6934F, -2.4588F, 1.1781F, 0.0F, 0.0F));

        PartDefinition TimeRotor =
                Console.addOrReplaceChild("TimeRotor", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RotorBase =
                TimeRotor.addOrReplaceChild("RotorBase", CubeListBuilder.create(), PartPose.offset(0.0F, -6.0F, 0.0F));

        PartDefinition cube_r32 = RotorBase.addOrReplaceChild(
                "cube_r32",
                CubeListBuilder.create()
                        .texOffs(94, 31)
                        .addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 99)
                        .addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(89, 11)
                        .addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r33 = RotorBase.addOrReplaceChild(
                "cube_r33",
                CubeListBuilder.create()
                        .texOffs(8, 108)
                        .addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r34 = RotorBase.addOrReplaceChild(
                "cube_r34",
                CubeListBuilder.create()
                        .texOffs(19, 107)
                        .addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r35 = RotorBase.addOrReplaceChild(
                "cube_r35",
                CubeListBuilder.create()
                        .texOffs(104, 106)
                        .addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0002F)),
                PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r36 = RotorBase.addOrReplaceChild(
                "cube_r36",
                CubeListBuilder.create()
                        .texOffs(62, 104)
                        .addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r37 = RotorBase.addOrReplaceChild(
                "cube_r37",
                CubeListBuilder.create()
                        .texOffs(8, 104)
                        .addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r38 = RotorBase.addOrReplaceChild(
                "cube_r38",
                CubeListBuilder.create()
                        .texOffs(62, 100)
                        .addBox(-2.0F, -1.0F, -3.46F, 4.0F, 1.0F, 3.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r39 = RotorBase.addOrReplaceChild(
                "cube_r39",
                CubeListBuilder.create()
                        .texOffs(101, 48)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        PartDefinition cube_r40 = RotorBase.addOrReplaceChild(
                "cube_r40",
                CubeListBuilder.create()
                        .texOffs(94, 36)
                        .addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
                        .texOffs(66, 108)
                        .addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(62, 108)
                        .addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r41 = RotorBase.addOrReplaceChild(
                "cube_r41",
                CubeListBuilder.create()
                        .texOffs(62, 82)
                        .addBox(-0.5F, -9.0F, -3.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0002F)),
                PartPose.offsetAndRotation(0.0F, -9.5F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r42 = RotorBase.addOrReplaceChild(
                "cube_r42",
                CubeListBuilder.create()
                        .texOffs(58, 82)
                        .addBox(-0.5F, -9.0F, -3.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0002F)),
                PartPose.offsetAndRotation(0.0F, -9.5F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r43 = RotorBase.addOrReplaceChild(
                "cube_r43",
                CubeListBuilder.create()
                        .texOffs(80, 0)
                        .addBox(-0.5F, -9.0F, -3.2F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0002F)),
                PartPose.offsetAndRotation(0.0F, -9.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r44 = RotorBase.addOrReplaceChild(
                "cube_r44",
                CubeListBuilder.create()
                        .texOffs(60, 0)
                        .addBox(-0.5F, -5.0F, -4.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0002F))
                        .texOffs(104, 97)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r45 = RotorBase.addOrReplaceChild(
                "cube_r45",
                CubeListBuilder.create()
                        .texOffs(72, 0)
                        .addBox(-0.5F, -5.0F, -4.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0002F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r46 = RotorBase.addOrReplaceChild(
                "cube_r46",
                CubeListBuilder.create()
                        .texOffs(81, 45)
                        .addBox(-0.5F, -5.0F, -4.2F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0002F))
                        .texOffs(104, 27)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0002F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition cube_r47 = RotorBase.addOrReplaceChild(
                "cube_r47",
                CubeListBuilder.create()
                        .texOffs(38, 94)
                        .addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(32, 110)
                        .addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(70, 108)
                        .addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r48 = RotorBase.addOrReplaceChild(
                "cube_r48",
                CubeListBuilder.create()
                        .texOffs(104, 86)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition cube_r49 = RotorBase.addOrReplaceChild(
                "cube_r49",
                CubeListBuilder.create()
                        .texOffs(94, 65)
                        .addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F))
                        .texOffs(104, 110)
                        .addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(92, 110)
                        .addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition cube_r50 = RotorBase.addOrReplaceChild(
                "cube_r50",
                CubeListBuilder.create()
                        .texOffs(94, 70)
                        .addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(21, 111)
                        .addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(108, 110)
                        .addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r51 = RotorBase.addOrReplaceChild(
                "cube_r51",
                CubeListBuilder.create()
                        .texOffs(104, 100)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition cube_r52 = RotorBase.addOrReplaceChild(
                "cube_r52",
                CubeListBuilder.create()
                        .texOffs(104, 103)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)),
                PartPose.offsetAndRotation(0.0F, -10.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r53 = RotorBase.addOrReplaceChild(
                "cube_r53",
                CubeListBuilder.create()
                        .texOffs(25, 111)
                        .addBox(-3.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(8, 112)
                        .addBox(2.0F, -11.0F, -5.2F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(94, 77)
                        .addBox(-3.0F, -1.0F, -5.2F, 6.0F, 1.0F, 4.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition cube_r54 = RotorBase.addOrReplaceChild(
                "cube_r54",
                CubeListBuilder.create()
                        .texOffs(81, 45)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition cube_r55 = RotorBase.addOrReplaceChild(
                "cube_r55",
                CubeListBuilder.create()
                        .texOffs(84, 25)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, -3.1416F, 0.5236F, 3.1416F));

        PartDefinition cube_r56 = RotorBase.addOrReplaceChild(
                "cube_r56",
                CubeListBuilder.create()
                        .texOffs(80, 89)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, -3.1416F, -0.5236F, 3.1416F));

        PartDefinition cube_r57 = RotorBase.addOrReplaceChild(
                "cube_r57",
                CubeListBuilder.create()
                        .texOffs(92, 51)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition cube_r58 = RotorBase.addOrReplaceChild(
                "cube_r58",
                CubeListBuilder.create()
                        .texOffs(92, 57)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(-0.001F)),
                PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition cube_r59 = RotorBase.addOrReplaceChild(
                "cube_r59",
                CubeListBuilder.create()
                        .texOffs(0, 94)
                        .addBox(-3.0F, -2.0F, -5.2F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 6.5F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition Rotor = TimeRotor.addOrReplaceChild(
                "Rotor",
                CubeListBuilder.create()
                        .texOffs(34, 87)
                        .addBox(-0.5F, -34.0F, -0.5F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition RotorCrystal = Rotor.addOrReplaceChild(
                "RotorCrystal",
                CubeListBuilder.create()
                        .texOffs(0, 70)
                        .addBox(-1.5F, -43.5F, -1.5F, 3.0F, 21.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(56, 63)
                        .addBox(-3.0F, -39.5F, -3.0F, 6.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -4.0F, 0.0F));

        PartDefinition cube_r60 = RotorCrystal.addOrReplaceChild(
                "cube_r60",
                CubeListBuilder.create()
                        .texOffs(36, 62)
                        .addBox(-2.5F, -42.0F, -2.5F, 5.0F, 18.0F, 5.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition EnergyCrystal = Console.addOrReplaceChild(
                "EnergyCrystal",
                CubeListBuilder.create()
                        .texOffs(54, 100)
                        .addBox(-1.0F, -34.5F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(60, 0)
                        .addBox(-2.0F, -31.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 15.0F, 0.0F));

        PartDefinition cube_r61 = EnergyCrystal.addOrReplaceChild(
                "cube_r61",
                CubeListBuilder.create()
                        .texOffs(20, 94)
                        .addBox(-1.5F, -33.5F, -1.5F, 3.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(
            Entity entity,
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
        Console.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnimations(ConsoleTile tile, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.animate(tile.rotorAnimationState, BattleConsoleAnimations.FLIGHT, ageInTicks);
//        ((IHelpWithConsole) tile).getAseoha$idleAnimationState().animateWhen(true, (int) tile.getLevel().getCapability(Capabilities.TARDIS).orElse(null).getAnimationTicks());
        this.animate(((IHelpWithConsole) tile).getAseoha$idleAnimationState(), BattleConsoleAnimations.IDLE, ageInTicks);
    }

    @Override
    public Optional<String> getPartForControl(ControlType<?> type) {
        return Optional.empty();
    }

    public static class BattleConsoleAnimations {
        public static final AnimationDefinition FLIGHT = AnimationDefinition.Builder.withLength(32.0F).looping()
                .addAnimation("DimensionCube", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(32.0F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("DimensionCube", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(14.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(16.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(18.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(20.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(22.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(24.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(26.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(28.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(30.0F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(32.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("Rotor", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(16.0F, KeyframeAnimations.degreeVec(0.0F, 1440.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("Rotor", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(6.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(10.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(14.0F, KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(16.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        public static final AnimationDefinition IDLE = AnimationDefinition.Builder.withLength(64.375F)
                .addAnimation("DimensionCube", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(64.375F, KeyframeAnimations.degreeVec(0.0F, 360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("DimensionCube", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(4.0833F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(8.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(12.0833F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(16.0833F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(20.1667F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(24.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(28.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(32.1667F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(36.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(40.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(44.25F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(48.2083F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(52.2917F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(56.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(60.375F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(64.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("EnergyCrystal", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(64.375F, KeyframeAnimations.degreeVec(0.0F, -360.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("EnergyCrystal", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(8.5417F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(17.0417F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(25.6667F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(34.0833F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(42.625F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(50.9583F, KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(59.6667F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(64.375F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();
    }
}
