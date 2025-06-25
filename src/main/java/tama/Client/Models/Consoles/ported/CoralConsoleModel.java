/* (C) TAMA Studios 2025 */
package tama.Client.Models.Consoles.ported; // Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
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
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.models.BaseTileHierarchicalModel;
import net.tardis.mod.client.models.consoles.IAdditionalConsoleRenderData;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.registry.ControlRegistry;
import tama.TileEntities.Console.CoralConsoleTile;

import java.util.Optional;

public class CoralConsoleModel<T extends CoralConsoleTile> extends BaseTileHierarchicalModel<T>
        implements IAdditionalConsoleRenderData {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into
    // this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(new ResourceLocation("modid", "coralconsolemodel"), "main");
    private final ModelPart all;
    private final ModelPart rotor_orig;
    private final ModelPart rotarcase2;
    private final ModelPart block;
    private final ModelPart lever6;
    private final ModelPart wires8;
    private final ModelPart wires7;
    private final ModelPart mirror;
    private final ModelPart wires6;
    private final ModelPart wires5;
    private final ModelPart wires4;
    private final ModelPart buttons;
    private final ModelPart wires3;
    private final ModelPart wires2;
    private final ModelPart wires;
    private final ModelPart bone112;
    private final ModelPart bone111;
    private final ModelPart bone106;
    private final ModelPart land_type;
    private final ModelPart bone103;
    private final ModelPart important_controls;
    private final ModelPart fastreturn;
    private final ModelPart lever;
    private final ModelPart refuel;
    private final ModelPart doorcontrol;
    private final ModelPart keyboardxyz;
    private final ModelPart throttle;
    private final ModelPart lever3;
    private final ModelPart Sonicport;
    private final ModelPart Incrementincrease;
    private final ModelPart lever2;
    private final ModelPart monitor;
    private final ModelPart handbreak;
    private final ModelPart lever4;
    private final ModelPart lever5;
    private final ModelPart wheel;
    private final ModelPart randomiser_and_facingcontrol;
    private final ModelPart throttle3;
    private final ModelPart facing_control;
    private final ModelPart randomiser;
    private final ModelPart Comuni_Phone;
    private final ModelPart telepathic_circuit;
    private final ModelPart crystal;
    private final ModelPart lever8;
    private final ModelPart nope;
    private final ModelPart keyboard_behind_monitor;
    private final ModelPart keyboard_by_monitor;
    private final ModelPart bone100;
    private final ModelPart bone101;
    private final ModelPart bone102;
    private final ModelPart bone99;
    private final ModelPart bone92;
    private final ModelPart control6;
    private final ModelPart control4;
    private final ModelPart control2;
    private final ModelPart Shell;
    private final ModelPart Shellone;
    private final ModelPart bone;
    private final ModelPart bone2;
    private final ModelPart bone3;
    private final ModelPart bone4;
    private final ModelPart bone5;
    private final ModelPart bone7;
    private final ModelPart bone6;
    private final ModelPart Shellone2;
    private final ModelPart bone8;
    private final ModelPart bone9;
    private final ModelPart bone10;
    private final ModelPart bone11;
    private final ModelPart bone12;
    private final ModelPart bone13;
    private final ModelPart bone14;
    private final ModelPart Shellone3;
    private final ModelPart bone15;
    private final ModelPart bone16;
    private final ModelPart bone17;
    private final ModelPart bone18;
    private final ModelPart bone19;
    private final ModelPart bone20;
    private final ModelPart bone21;
    private final ModelPart Shellone4;
    private final ModelPart bone22;
    private final ModelPart bone23;
    private final ModelPart bone24;
    private final ModelPart bone25;
    private final ModelPart bone26;
    private final ModelPart bone27;
    private final ModelPart bone28;
    private final ModelPart Shellone5;
    private final ModelPart bone29;
    private final ModelPart bone30;
    private final ModelPart bone31;
    private final ModelPart bone32;
    private final ModelPart bone33;
    private final ModelPart bone34;
    private final ModelPart bone35;
    private final ModelPart Shellone6;
    private final ModelPart bone36;
    private final ModelPart bone37;
    private final ModelPart bone38;
    private final ModelPart bone39;
    private final ModelPart bone40;
    private final ModelPart bone41;
    private final ModelPart bone42;
    private final ModelPart bone50;
    private final ModelPart bone51;
    private final ModelPart bone52;
    private final ModelPart bone53;
    private final ModelPart bone54;
    private final ModelPart bone55;
    private final ModelPart bone56;
    private final ModelPart bone57;
    private final ModelPart bone58;
    private final ModelPart bone59;
    private final ModelPart bone60;
    private final ModelPart bone61;
    private final ModelPart bone62;
    private final ModelPart bone63;
    private final ModelPart bone64;
    private final ModelPart bone65;
    private final ModelPart bone66;
    private final ModelPart bone67;
    private final ModelPart bone68;
    private final ModelPart bone69;
    private final ModelPart bone70;
    private final ModelPart bone71;
    private final ModelPart bone72;
    private final ModelPart bone73;
    private final ModelPart bone74;
    private final ModelPart bone75;
    private final ModelPart bone76;
    private final ModelPart bone77;
    private final ModelPart bone78;
    private final ModelPart bone79;
    private final ModelPart bone80;
    private final ModelPart bone81;
    private final ModelPart bone82;
    private final ModelPart bone83;
    private final ModelPart bone84;
    private final ModelPart bone85;
    private final ModelPart bone43;
    private final ModelPart bone86;
    private final ModelPart bone87;
    private final ModelPart bone88;
    private final ModelPart bone89;
    private final ModelPart bone90;
    private final ModelPart bone91;
    private final ModelPart bone93;
    private final ModelPart bone94;
    private final ModelPart bone95;
    private final ModelPart bone96;
    private final ModelPart bone97;
    private final ModelPart bone98;
    private final ModelPart bone105;
    private final ModelPart x;
    private final ModelPart y;
    private final ModelPart z;
    private final ModelPart glow;
    private final ModelPart keyboard_behind_monitor_glow;
    private final ModelPart keyboard_by_monitor_glow;
    private final ModelPart bone44;
    private final ModelPart refuel2;
    private final ModelPart doorcontrol2;
    private final ModelPart land_type_red;
    private final ModelPart monitor_screen;
    private final ModelPart throttle_glow;
    private final ModelPart throttle_glow_red;
    private final ModelPart throttle_glow_yellow;
    private final ModelPart throttle_glow_green;
    private final ModelPart shell_glow;
    private final ModelPart bone150;
    private final ModelPart bone151;
    private final ModelPart bone152;
    private final ModelPart bone153;
    private final ModelPart bone154;
    private final ModelPart bone155;
    private final ModelPart phone;
    private final ModelPart land_type_glow;
    private final ModelPart telepathic_circuit_glow;
    private final ModelPart crystal2;
    private final ModelPart lever7;
    private final ModelPart nope2;
    private final ModelPart block2_glow;
    private final ModelPart lever9;
    private final ModelPart bone45_glow;
    private final ModelPart rotartop;
    private final ModelPart rotarbottom;
    private final ModelPart bb_main;

    public CoralConsoleModel(ModelPart root) {
        super(root);
        this.all = root.getChild("all");
        this.rotor_orig = this.all.getChild("rotor_orig");
        this.rotarcase2 = this.rotor_orig.getChild("rotarcase2");
        this.block = this.all.getChild("block");
        this.lever6 = this.block.getChild("lever6");
        this.wires8 = this.all.getChild("wires8");
        this.wires7 = this.all.getChild("wires7");
        this.mirror = this.all.getChild("mirror");
        this.wires6 = this.all.getChild("wires6");
        this.wires5 = this.all.getChild("wires5");
        this.wires4 = this.all.getChild("wires4");
        this.buttons = this.all.getChild("buttons");
        this.wires3 = this.all.getChild("wires3");
        this.wires2 = this.all.getChild("wires2");
        this.wires = this.all.getChild("wires");
        this.bone112 = this.all.getChild("bone112");
        this.bone111 = this.all.getChild("bone111");
        this.bone106 = this.all.getChild("bone106");
        this.land_type = this.bone106.getChild("land_type");
        this.bone103 = this.all.getChild("bone103");
        this.important_controls = this.all.getChild("important_controls");
        this.fastreturn = this.important_controls.getChild("fastreturn");
        this.lever = this.fastreturn.getChild("lever");
        this.refuel = this.important_controls.getChild("refuel");
        this.doorcontrol = this.important_controls.getChild("doorcontrol");
        this.keyboardxyz = this.important_controls.getChild("keyboardxyz");
        this.throttle = this.important_controls.getChild("throttle");
        this.lever3 = this.throttle.getChild("lever3");
        this.Sonicport = this.important_controls.getChild("Sonicport");
        this.Incrementincrease = this.important_controls.getChild("Incrementincrease");
        this.lever2 = this.Incrementincrease.getChild("lever2");
        this.monitor = this.important_controls.getChild("monitor");
        this.handbreak = this.important_controls.getChild("handbreak");
        this.lever4 = this.handbreak.getChild("lever4");
        this.lever5 = this.handbreak.getChild("lever5");
        this.wheel = this.handbreak.getChild("wheel");
        this.randomiser_and_facingcontrol = this.important_controls.getChild("randomiser_and_facingcontrol");
        this.throttle3 = this.randomiser_and_facingcontrol.getChild("throttle3");
        this.facing_control = this.randomiser_and_facingcontrol.getChild("facing_control");
        this.randomiser = this.randomiser_and_facingcontrol.getChild("randomiser");
        this.Comuni_Phone = this.important_controls.getChild("Comuni_Phone");
        this.telepathic_circuit = this.important_controls.getChild("telepathic_circuit");
        this.crystal = this.telepathic_circuit.getChild("crystal");
        this.lever8 = this.telepathic_circuit.getChild("lever8");
        this.nope = this.telepathic_circuit.getChild("nope");
        this.keyboard_behind_monitor = this.all.getChild("keyboard_behind_monitor");
        this.keyboard_by_monitor = this.all.getChild("keyboard_by_monitor");
        this.bone100 = this.all.getChild("bone100");
        this.bone101 = this.bone100.getChild("bone101");
        this.bone102 = this.bone100.getChild("bone102");
        this.bone99 = this.all.getChild("bone99");
        this.bone92 = this.all.getChild("bone92");
        this.control6 = this.all.getChild("control6");
        this.control4 = this.all.getChild("control4");
        this.control2 = this.all.getChild("control2");
        this.Shell = this.all.getChild("Shell");
        this.Shellone = this.Shell.getChild("Shellone");
        this.bone = this.Shellone.getChild("bone");
        this.bone2 = this.Shellone.getChild("bone2");
        this.bone3 = this.bone2.getChild("bone3");
        this.bone4 = this.bone3.getChild("bone4");
        this.bone5 = this.bone4.getChild("bone5");
        this.bone7 = this.Shellone.getChild("bone7");
        this.bone6 = this.Shellone.getChild("bone6");
        this.Shellone2 = this.Shell.getChild("Shellone2");
        this.bone8 = this.Shellone2.getChild("bone8");
        this.bone9 = this.Shellone2.getChild("bone9");
        this.bone10 = this.bone9.getChild("bone10");
        this.bone11 = this.bone10.getChild("bone11");
        this.bone12 = this.bone11.getChild("bone12");
        this.bone13 = this.Shellone2.getChild("bone13");
        this.bone14 = this.Shellone2.getChild("bone14");
        this.Shellone3 = this.Shell.getChild("Shellone3");
        this.bone15 = this.Shellone3.getChild("bone15");
        this.bone16 = this.Shellone3.getChild("bone16");
        this.bone17 = this.bone16.getChild("bone17");
        this.bone18 = this.bone17.getChild("bone18");
        this.bone19 = this.bone18.getChild("bone19");
        this.bone20 = this.Shellone3.getChild("bone20");
        this.bone21 = this.Shellone3.getChild("bone21");
        this.Shellone4 = this.Shell.getChild("Shellone4");
        this.bone22 = this.Shellone4.getChild("bone22");
        this.bone23 = this.Shellone4.getChild("bone23");
        this.bone24 = this.bone23.getChild("bone24");
        this.bone25 = this.bone24.getChild("bone25");
        this.bone26 = this.bone25.getChild("bone26");
        this.bone27 = this.Shellone4.getChild("bone27");
        this.bone28 = this.Shellone4.getChild("bone28");
        this.Shellone5 = this.Shell.getChild("Shellone5");
        this.bone29 = this.Shellone5.getChild("bone29");
        this.bone30 = this.Shellone5.getChild("bone30");
        this.bone31 = this.bone30.getChild("bone31");
        this.bone32 = this.bone31.getChild("bone32");
        this.bone33 = this.bone32.getChild("bone33");
        this.bone34 = this.Shellone5.getChild("bone34");
        this.bone35 = this.Shellone5.getChild("bone35");
        this.Shellone6 = this.Shell.getChild("Shellone6");
        this.bone36 = this.Shellone6.getChild("bone36");
        this.bone37 = this.Shellone6.getChild("bone37");
        this.bone38 = this.bone37.getChild("bone38");
        this.bone39 = this.bone38.getChild("bone39");
        this.bone40 = this.bone39.getChild("bone40");
        this.bone41 = this.Shellone6.getChild("bone41");
        this.bone42 = this.Shellone6.getChild("bone42");
        this.bone50 = this.Shell.getChild("bone50");
        this.bone51 = this.bone50.getChild("bone51");
        this.bone52 = this.bone50.getChild("bone52");
        this.bone53 = this.Shell.getChild("bone53");
        this.bone54 = this.bone53.getChild("bone54");
        this.bone55 = this.bone53.getChild("bone55");
        this.bone56 = this.Shell.getChild("bone56");
        this.bone57 = this.bone56.getChild("bone57");
        this.bone58 = this.bone56.getChild("bone58");
        this.bone59 = this.Shell.getChild("bone59");
        this.bone60 = this.bone59.getChild("bone60");
        this.bone61 = this.bone59.getChild("bone61");
        this.bone62 = this.Shell.getChild("bone62");
        this.bone63 = this.bone62.getChild("bone63");
        this.bone64 = this.bone62.getChild("bone64");
        this.bone65 = this.Shell.getChild("bone65");
        this.bone66 = this.bone65.getChild("bone66");
        this.bone67 = this.bone65.getChild("bone67");
        this.bone68 = this.Shell.getChild("bone68");
        this.bone69 = this.bone68.getChild("bone69");
        this.bone70 = this.bone68.getChild("bone70");
        this.bone71 = this.Shell.getChild("bone71");
        this.bone72 = this.bone71.getChild("bone72");
        this.bone73 = this.bone71.getChild("bone73");
        this.bone74 = this.Shell.getChild("bone74");
        this.bone75 = this.bone74.getChild("bone75");
        this.bone76 = this.bone74.getChild("bone76");
        this.bone77 = this.Shell.getChild("bone77");
        this.bone78 = this.bone77.getChild("bone78");
        this.bone79 = this.bone77.getChild("bone79");
        this.bone80 = this.Shell.getChild("bone80");
        this.bone81 = this.bone80.getChild("bone81");
        this.bone82 = this.bone80.getChild("bone82");
        this.bone83 = this.Shell.getChild("bone83");
        this.bone84 = this.bone83.getChild("bone84");
        this.bone85 = this.bone83.getChild("bone85");
        this.bone43 = this.Shell.getChild("bone43");
        this.bone86 = this.Shell.getChild("bone86");
        this.bone87 = this.Shell.getChild("bone87");
        this.bone88 = this.Shell.getChild("bone88");
        this.bone89 = this.Shell.getChild("bone89");
        this.bone90 = this.Shell.getChild("bone90");
        this.bone91 = this.Shell.getChild("bone91");
        this.bone93 = this.Shell.getChild("bone93");
        this.bone94 = this.Shell.getChild("bone94");
        this.bone95 = this.Shell.getChild("bone95");
        this.bone96 = this.Shell.getChild("bone96");
        this.bone97 = this.Shell.getChild("bone97");
        this.bone98 = this.Shell.getChild("bone98");
        this.bone105 = this.all.getChild("bone105");
        this.x = root.getChild("x");
        this.y = root.getChild("y");
        this.z = root.getChild("z");
        this.glow = root.getChild("glow");
        this.keyboard_behind_monitor_glow = this.glow.getChild("keyboard_behind_monitor_glow");
        this.keyboard_by_monitor_glow = this.glow.getChild("keyboard_by_monitor_glow");
        this.bone44 = this.glow.getChild("bone44");
        this.refuel2 = this.glow.getChild("refuel2");
        this.doorcontrol2 = this.glow.getChild("doorcontrol2");
        this.land_type_red = this.glow.getChild("land_type_red");
        this.monitor_screen = this.glow.getChild("monitor_screen");
        this.throttle_glow = this.glow.getChild("throttle_glow");
        this.throttle_glow_red = this.throttle_glow.getChild("throttle_glow_red");
        this.throttle_glow_yellow = this.throttle_glow.getChild("throttle_glow_yellow");
        this.throttle_glow_green = this.throttle_glow.getChild("throttle_glow_green");
        this.shell_glow = this.glow.getChild("shell_glow");
        this.bone150 = this.shell_glow.getChild("bone150");
        this.bone151 = this.shell_glow.getChild("bone151");
        this.bone152 = this.shell_glow.getChild("bone152");
        this.bone153 = this.shell_glow.getChild("bone153");
        this.bone154 = this.shell_glow.getChild("bone154");
        this.bone155 = this.shell_glow.getChild("bone155");
        this.phone = this.glow.getChild("phone");
        this.land_type_glow = this.glow.getChild("land_type_glow");
        this.telepathic_circuit_glow = this.glow.getChild("telepathic_circuit_glow");
        this.crystal2 = this.telepathic_circuit_glow.getChild("crystal2");
        this.lever7 = this.telepathic_circuit_glow.getChild("lever7");
        this.nope2 = this.telepathic_circuit_glow.getChild("nope2");
        this.block2_glow = this.glow.getChild("block2_glow");
        this.lever9 = this.block2_glow.getChild("lever9");
        this.bone45_glow = this.glow.getChild("bone45_glow");
        this.rotartop = root.getChild("rotartop");
        this.rotarbottom = root.getChild("rotarbottom");
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition all =
                partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offset(-0.2F, 24.0F, 0.0F));

        PartDefinition rotor_orig =
                all.addOrReplaceChild("rotor_orig", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rotarcase2 = rotor_orig.addOrReplaceChild(
                "rotarcase2",
                CubeListBuilder.create()
                        .texOffs(147, 16)
                        .addBox(-1.5F, -27.0F, 7.7F, 2.0F, 42.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(147, 16)
                        .addBox(-1.5F, -27.0F, -4.3F, 2.0F, 42.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(147, 16)
                        .addBox(-6.6F, -27.0F, 1.1F, 1.0F, 42.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(147, 16)
                        .addBox(5.0F, -27.0F, 1.1F, 1.0F, 42.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.5F, -47.2F, -2.0F));

        PartDefinition block = all.addOrReplaceChild(
                "block",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(6.9F, -27.5F, 1.4F, -0.0524F, -1.0472F, -0.0873F));

        PartDefinition lever6 = block.addOrReplaceChild(
                "lever6",
                CubeListBuilder.create()
                        .texOffs(140, 180)
                        .addBox(-2.7968F, 0.7509F, -0.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(140, 180)
                        .addBox(-2.5976F, 2.2172F, 7.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(145, 142)
                        .addBox(-1.7935F, -0.3712F, 1.5765F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(145, 142)
                        .addBox(-2.5944F, 1.6028F, 3.9886F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
                        .texOffs(149, 173)
                        .addBox(-2.589F, 1.0077F, 3.9121F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F))
                        .texOffs(145, 142)
                        .addBox(-1.7935F, -0.3712F, -5.4235F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(140, 180)
                        .addBox(-3.7968F, 0.7509F, -1.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(140, 180)
                        .addBox(-1.4887F, 2.2419F, 6.3644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(140, 180)
                        .addBox(-3.5976F, 2.2172F, 6.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-2.9869F, -0.7455F, 16.8686F, 0.0F, 0.0F, 0.0349F));

        PartDefinition wires8 = all.addOrReplaceChild(
                "wires8",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-0.6984F, 7.1499F, 13.4498F, 8.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(0.3016F, 7.1499F, 13.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(48, 32)
                        .addBox(3.3016F, 7.1499F, 13.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.3984F, 7.1499F, 8.4498F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(-1.3984F, 7.1499F, 12.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(170, 173)
                        .addBox(-1.3984F, 7.1499F, 9.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(178, 190)
                        .addBox(-5.0843F, 8.0173F, 18.5024F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(148, 140)
                        .addBox(-4.9843F, 7.6173F, 20.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-4.0843F, 7.6173F, 20.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-3.1843F, 7.6173F, 20.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-3.1843F, 7.6173F, 19.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(0.4134F, 7.6475F, 19.2662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(178, 169)
                        .addBox(1.7855F, 7.5573F, 16.0213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 140)
                        .addBox(-4.0843F, 7.6173F, 19.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 140)
                        .addBox(-0.4866F, 7.6475F, 19.2662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 140)
                        .addBox(0.8855F, 7.5573F, 16.0213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(153, 97)
                        .addBox(-4.9843F, 7.6173F, 19.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-4.9843F, 7.6173F, 18.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 140)
                        .addBox(-3.1843F, 7.6173F, 18.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 140)
                        .addBox(0.4134F, 7.6475F, 18.2662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 140)
                        .addBox(1.7855F, 7.5573F, 15.0213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-4.0843F, 7.6173F, 18.5024F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-0.4866F, 7.6475F, 18.2662F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(178, 169)
                        .addBox(0.8855F, 7.5573F, 15.0213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-0.4F, -33.9F, 2.6F, -0.3491F, 0.5236F, 0.0175F));

        PartDefinition wires7 = all.addOrReplaceChild(
                "wires7",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-0.6984F, 7.1499F, 13.4498F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(0.3016F, 7.1499F, 13.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(48, 32)
                        .addBox(3.3016F, 7.1499F, 13.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.3984F, 7.1499F, 8.4498F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(-1.3984F, 7.1499F, 12.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(170, 173)
                        .addBox(-1.3984F, 7.1499F, 9.4498F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.3F, -30.7F, 8.1F, -0.3491F, 0.5236F, 0.0175F));

        PartDefinition mirror = all.addOrReplaceChild(
                "mirror",
                CubeListBuilder.create()
                        .texOffs(143, 139)
                        .addBox(-1.916F, 0.1712F, 8.0863F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(145, 173)
                        .addBox(-1.916F, -0.4084F, 7.931F, 4.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-0.4F, -28.6F, 0.5F, -0.2618F, 2.0944F, 0.0F));

        PartDefinition wires6 = all.addOrReplaceChild(
                "wires6",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(0.715F, 6.241F, 15.9368F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(1.715F, 6.241F, 15.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(153, 180)
                        .addBox(4.715F, 6.241F, 15.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(0.015F, 6.241F, 11.9368F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(0.015F, 6.241F, 14.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(170, 173)
                        .addBox(0.015F, 6.241F, 11.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(6.1F, -31.3F, 1.4F, -0.3491F, 1.5708F, 0.0524F));

        PartDefinition wires5 = all.addOrReplaceChild(
                "wires5",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(0.715F, 6.241F, 15.9368F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(1.715F, 6.241F, 15.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(48, 32)
                        .addBox(4.715F, 6.241F, 15.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(0.015F, 6.241F, 10.9368F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(0.015F, 6.241F, 14.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(170, 173)
                        .addBox(0.015F, 6.241F, 11.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.3F, -33.0F, 7.0F, -0.3491F, 1.5708F, 0.0524F));

        PartDefinition wires4 = all.addOrReplaceChild(
                "wires4",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(0.715F, 6.241F, 15.9368F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(1.715F, 6.241F, 15.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(48, 32)
                        .addBox(4.715F, 6.241F, 15.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(0.015F, 6.241F, 10.9368F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(0.015F, 6.241F, 14.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(170, 173)
                        .addBox(0.015F, 6.241F, 11.9368F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.7F, -35.0F, 1.4F, -0.3491F, 1.5708F, 0.0524F));

        PartDefinition buttons = all.addOrReplaceChild(
                "buttons",
                CubeListBuilder.create()
                        .texOffs(0, 101)
                        .addBox(2.1221F, -6.2642F, 15.7892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(5, 98)
                        .addBox(0.1221F, -6.2642F, 15.7892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(148, 126)
                        .addBox(2.7221F, -6.2642F, 15.7892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F))
                        .texOffs(148, 126)
                        .addBox(-0.4779F, -6.2642F, 15.7892F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.1F)),
                PartPose.offsetAndRotation(0.7F, -19.8F, 2.1F, -0.2269F, 1.0472F, -0.0349F));

        PartDefinition wires3 = all.addOrReplaceChild(
                "wires3",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-1.2538F, 5.265F, 18.4746F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(-0.2538F, 5.265F, 18.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(6, 88)
                        .addBox(2.7462F, 5.265F, 18.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.9538F, 5.265F, 13.4746F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(170, 173)
                        .addBox(-1.9538F, 5.265F, 17.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(170, 173)
                        .addBox(-1.9538F, 5.265F, 14.4746F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.7F, -35.3F, 5.4F, -0.3665F, 2.7576F, 0.0524F));

        PartDefinition wires2 = all.addOrReplaceChild(
                "wires2",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-1.012F, 5.301F, 18.3807F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(10, 110)
                        .addBox(-0.012F, 5.301F, 18.3807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 110)
                        .addBox(2.988F, 5.301F, 18.3807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.712F, 5.301F, 13.3807F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(10, 110)
                        .addBox(-1.712F, 5.301F, 17.3807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(13, 75)
                        .addBox(-1.712F, 5.301F, 14.3807F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -34.6F, 4.4F, -0.3665F, 2.6704F, 0.0524F));

        PartDefinition wires = all.addOrReplaceChild(
                "wires",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-3.7361F, 5.0583F, 18.1904F, 6.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(10, 110)
                        .addBox(-2.7361F, 5.0583F, 18.1904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(10, 110)
                        .addBox(0.2639F, 5.0583F, 18.1904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-4.4361F, 5.0583F, 13.1904F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(10, 110)
                        .addBox(-4.4361F, 5.0583F, 17.1904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(13, 75)
                        .addBox(-4.4361F, 5.0583F, 14.1904F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -33.2F, 3.1F, -0.3665F, -2.6704F, 0.0F));

        PartDefinition bone112 = all.addOrReplaceChild(
                "bone112",
                CubeListBuilder.create()
                        .texOffs(156, 133)
                        .addBox(-3.2F, 1.3492F, 21.1647F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.4F, -32.7F, -12.2F, -0.2618F, 0.0F, 0.0F));

        PartDefinition bone111 = all.addOrReplaceChild(
                "bone111",
                CubeListBuilder.create()
                        .texOffs(138, 142)
                        .addBox(-3.2F, 1.3492F, 20.1647F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(134, 167)
                        .addBox(-3.2F, 0.8145F, 20.2285F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(3.6F, -32.8F, -12.2F, -0.2618F, 0.0F, 0.0F));

        PartDefinition bone106 = all.addOrReplaceChild(
                "bone106",
                CubeListBuilder.create()
                        .texOffs(10, 110)
                        .addBox(-4.483F, -1.7618F, -3.3971F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(15, 111)
                        .addBox(-4.483F, -2.215F, -3.1858F, 2.0F, 2.0F, 4.0F, new CubeDeformation(-0.2F))
                        .texOffs(10, 110)
                        .addBox(-6.3187F, -4.472F, 0.8894F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(13.7F, -19.0F, -10.2F, 0.4363F, -0.5236F, 0.0F));

        PartDefinition land_type = bone106.addOrReplaceChild(
                "land_type",
                CubeListBuilder.create()
                        .texOffs(157, 182)
                        .addBox(-0.2589F, -6.4945F, -0.1653F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(157, 182)
                        .addBox(-0.2625F, -6.382F, -1.1073F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(157, 182)
                        .addBox(0.3473F, -6.6424F, -0.4825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(157, 182)
                        .addBox(-0.8187F, -6.6507F, -0.5002F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-6.0F, 0.0F, 1.45F));

        PartDefinition bone103 = all.addOrReplaceChild(
                "bone103",
                CubeListBuilder.create()
                        .texOffs(144, 171)
                        .addBox(-1.0049F, -2.2733F, -2.7182F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.5049F, -2.7733F, -3.7182F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.5049F, -2.7733F, 3.2818F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-1.4278F, -2.7021F, -0.6249F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.4F, -19.0F, -15.5F, 0.4363F, -0.0349F, 0.0524F));

        PartDefinition important_controls = all.addOrReplaceChild(
                "important_controls", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition fastreturn = important_controls.addOrReplaceChild(
                "fastreturn",
                CubeListBuilder.create()
                        .texOffs(14, 77)
                        .addBox(-0.7038F, 9.1768F, -26.4935F, 7.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(14, 77)
                        .addBox(2.2962F, 13.1768F, -26.3935F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.2F, -26.2F, 3.0F));

        PartDefinition lever = fastreturn.addOrReplaceChild(
                "lever",
                CubeListBuilder.create()
                        .texOffs(123, 174)
                        .addBox(-1.2374F, -0.5149F, -0.5935F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(141, 140)
                        .addBox(4.1626F, -1.0149F, -1.0935F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(5.0F, 11.1F, -25.4F, 0.0F, 0.0F, -0.6981F));

        PartDefinition refuel = important_controls.addOrReplaceChild(
                "refuel",
                CubeListBuilder.create()
                        .texOffs(17, 102)
                        .addBox(-16.5571F, -2.2346F, -0.0542F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.7F, -24.3F, 4.4F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition doorcontrol = important_controls.addOrReplaceChild(
                "doorcontrol",
                CubeListBuilder.create()
                        .texOffs(16, 109)
                        .addBox(-18.2891F, -1.3017F, 3.777F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.2F, -22.3F, 0.0F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition keyboardxyz = important_controls.addOrReplaceChild(
                "keyboardxyz",
                CubeListBuilder.create()
                        .texOffs(30, 189)
                        .addBox(-19.5528F, -1.5521F, -6.4794F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-17.5528F, -1.7521F, 2.3206F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-17.5528F, -1.7521F, -0.0794F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-17.5528F, -1.7521F, -2.5794F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-19.2528F, -1.7521F, 2.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-19.2528F, -1.7521F, 0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-19.2528F, -1.7521F, -1.9794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-19.2528F, -1.7521F, -3.9794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-19.2528F, -1.7521F, -5.9794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 178)
                        .addBox(-17.5528F, -1.7521F, -6.2794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-17.5528F, -1.7521F, -5.0794F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-17.5528F, -1.7521F, 1.1206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-17.5528F, -1.7521F, -3.7794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-17.5528F, -1.7521F, -1.3794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.2F, -22.3F, 0.0F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition throttle = important_controls.addOrReplaceChild(
                "throttle",
                CubeListBuilder.create()
                        .texOffs(105, 136)
                        .addBox(-1.9F, -0.7235F, 11.1022F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(74, 177)
                        .addBox(-1.9F, -1.0235F, 11.1022F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(79, 167)
                        .addBox(-2.4F, -0.2235F, 11.6022F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(108, 16)
                        .addBox(-2.4F, -0.7235F, 10.1022F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(84, 163)
                        .addBox(-0.2F, -1.2235F, 11.1022F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(110, 19)
                        .addBox(-2.6F, -1.2235F, 11.1022F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 104)
                        .addBox(-3.9F, 0.7765F, 11.1022F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(12, 104)
                        .addBox(-3.4F, 0.3901F, 10.9987F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(100, 8)
                        .addBox(-4.1F, -0.0235F, 11.1022F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(1.9F, -29.0F, 0.4F, -0.2618F, 0.0F, 0.0F));

        PartDefinition lever3 = throttle.addOrReplaceChild(
                "lever3",
                CubeListBuilder.create()
                        .texOffs(141, 171)
                        .addBox(-0.5F, -4.3119F, -0.715F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(0, 0)
                        .addBox(-0.5F, -5.1119F, -0.715F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-3.0F, 0.5518F, 14.9068F, 1.1345F, 0.0F, 0.0F));

        PartDefinition Sonicport = important_controls.addOrReplaceChild(
                "Sonicport",
                CubeListBuilder.create()
                        .texOffs(136, 175)
                        .addBox(-3.3F, 1.2526F, 19.1389F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(136, 175)
                        .addBox(-1.1F, 1.2526F, 19.1389F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(136, 175)
                        .addBox(-2.7F, 1.2267F, 21.2354F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(136, 175)
                        .addBox(-2.7F, 1.2166F, 18.9551F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(136, 131)
                        .addBox(-3.2F, 1.4458F, 19.1906F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(1.9F, -29.0F, 0.4F, -0.2618F, 0.0F, 0.0F));

        PartDefinition Incrementincrease = important_controls.addOrReplaceChild(
                "Incrementincrease",
                CubeListBuilder.create()
                        .texOffs(132, 176)
                        .addBox(1.9462F, -7.6683F, 13.7385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 176)
                        .addBox(-0.0538F, -7.6683F, 13.7385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(148, 126)
                        .addBox(2.5462F, -7.6683F, 13.7385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.1F))
                        .texOffs(148, 126)
                        .addBox(0.9462F, -7.6683F, 13.7385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.1F))
                        .texOffs(148, 126)
                        .addBox(-0.6538F, -7.6683F, 13.7385F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.1F))
                        .texOffs(132, 176)
                        .addBox(0.9462F, -7.6683F, 19.7385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-5.3F, -21.3F, -2.0F, -0.2269F, 1.0297F, -0.0349F));

        PartDefinition lever2 = Incrementincrease.addOrReplaceChild(
                "lever2",
                CubeListBuilder.create()
                        .texOffs(136, 10)
                        .addBox(-0.498F, -1.4443F, -0.385F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(136, 23)
                        .addBox(-0.498F, -1.4443F, -0.385F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(1.475F, -7.2F, 20.9F));

        PartDefinition monitor = important_controls.addOrReplaceChild(
                "monitor",
                CubeListBuilder.create()
                        .texOffs(132, 176)
                        .addBox(-4.6261F, 3.0F, 12.7797F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 176)
                        .addBox(-4.6261F, 4.0F, 12.7797F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 176)
                        .addBox(-4.6261F, -4.0F, 11.7797F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(184, 115)
                        .addBox(-3.8065F, -3.7F, 14.9993F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 176)
                        .addBox(-3.6261F, -3.0F, 12.7797F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(138, 138)
                        .addBox(-1.0261F, -1.0F, 1.7797F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
                        .texOffs(138, 138)
                        .addBox(-1.0261F, 1.5F, 2.7797F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 176)
                        .addBox(-4.6261F, -3.0F, 12.7797F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(132, 176)
                        .addBox(3.3739F, -3.0F, 12.7797F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, -28.0F, 0.4F, 0.0F, -0.5236F, 0.0F));

        PartDefinition handbreak = important_controls.addOrReplaceChild(
                "handbreak",
                CubeListBuilder.create()
                        .texOffs(145, 173)
                        .addBox(-1.4519F, -0.5427F, 15.4909F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 129)
                        .addBox(-0.5349F, -1.546F, 15.5001F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(115, 140)
                        .addBox(-1.1519F, -2.0427F, 15.4909F, 2.0F, 2.0F, 6.0F, new CubeDeformation(-0.2F))
                        .texOffs(115, 140)
                        .addBox(-1.9519F, -1.5427F, 16.4909F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.1F, -29.7F, 0.8F, -0.3491F, 2.0944F, 0.0F));

        PartDefinition lever4 = handbreak.addOrReplaceChild(
                "lever4",
                CubeListBuilder.create()
                        .texOffs(144, 129)
                        .addBox(-0.6019F, -4.3604F, -0.5778F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(13, 106)
                        .addBox(-2.6019F, -5.1604F, -0.5778F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.05F, -0.3F, 20.2F, 0.7854F, 0.0F, 0.0F));

        PartDefinition lever5 = handbreak.addOrReplaceChild(
                "lever5",
                CubeListBuilder.create()
                        .texOffs(144, 129)
                        .addBox(-0.5019F, -4.3518F, -0.4028F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(13, 106)
                        .addBox(-1.5019F, -5.2122F, -0.4028F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.05F, -0.4482F, 17.025F, 0.7854F, 0.0F, 0.0F));

        PartDefinition wheel = handbreak.addOrReplaceChild(
                "wheel",
                CubeListBuilder.create()
                        .texOffs(83, 171)
                        .addBox(1.6481F, -2.1265F, 1.9841F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(83, 171)
                        .addBox(1.6481F, -2.1265F, -0.0159F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(83, 171)
                        .addBox(1.8481F, -1.5265F, 0.3841F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(83, 171)
                        .addBox(1.6481F, -2.1265F, -0.0159F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
                        .texOffs(83, 171)
                        .addBox(1.6481F, -0.1265F, -0.0159F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)),
                PartPose.offset(-4.4F, -0.4482F, 17.1068F));

        PartDefinition randomiser_and_facingcontrol = important_controls.addOrReplaceChild(
                "randomiser_and_facingcontrol",
                CubeListBuilder.create()
                        .texOffs(5, 108)
                        .addBox(3.166F, 1.4211F, 15.5757F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(108, 68)
                        .addBox(6.1892F, 2.1355F, 10.689F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 81)
                        .addBox(9.2595F, 2.6188F, 15.2089F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(5, 108)
                        .addBox(3.166F, 1.0211F, 15.5757F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-7.1F, -29.0F, 3.4F, -0.3491F, 0.5236F, 0.0F));

        PartDefinition throttle3 = randomiser_and_facingcontrol.addOrReplaceChild(
                "throttle3",
                CubeListBuilder.create()
                        .texOffs(5, 108)
                        .addBox(5.0883F, 2.0547F, 15.8814F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(5, 108)
                        .addBox(5.0883F, 1.6547F, 15.8814F, 3.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(4.0F, 0.0F, 4.0F));

        PartDefinition facing_control = randomiser_and_facingcontrol.addOrReplaceChild(
                "facing_control",
                CubeListBuilder.create()
                        .texOffs(9, 148)
                        .addBox(-1.5866F, -1.7285F, -1.547F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F))
                        .texOffs(186, 86)
                        .addBox(-1.5866F, -2.0285F, -1.547F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(178, 91)
                        .addBox(-1.5866F, -1.4285F, -1.297F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(186, 86)
                        .addBox(-1.8366F, -1.7285F, -1.547F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(186, 86)
                        .addBox(-1.5866F, -1.7285F, -1.797F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(178, 91)
                        .addBox(-1.5866F, -1.7285F, -1.547F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(178, 91)
                        .addBox(-1.3366F, -1.7285F, -1.547F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(7.6F, 1.2877F, 12.1F, 0.0F, 3.1416F, 0.0F));

        PartDefinition randomiser = randomiser_and_facingcontrol.addOrReplaceChild(
                "randomiser",
                CubeListBuilder.create()
                        .texOffs(9, 144)
                        .addBox(-1.4315F, -1.7356F, -1.453F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F))
                        .texOffs(181, 97)
                        .addBox(-1.4315F, -2.0356F, -1.453F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(181, 97)
                        .addBox(-1.4315F, -1.4356F, -1.453F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(181, 97)
                        .addBox(-1.1315F, -1.7356F, -1.453F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(181, 97)
                        .addBox(-1.4315F, -1.7356F, -1.203F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(181, 97)
                        .addBox(-1.4315F, -1.7356F, -1.703F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(181, 97)
                        .addBox(-1.7315F, -1.7356F, -1.453F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offset(10.725F, 1.5F, 16.85F));

        PartDefinition Comuni_Phone = important_controls.addOrReplaceChild(
                "Comuni_Phone",
                CubeListBuilder.create()
                        .texOffs(4, 145)
                        .addBox(-1.6F, 4.9314F, 8.3125F, 5.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(178, 190)
                        .addBox(-6.1F, 5.5629F, 13.6707F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(108, 161)
                        .addBox(-5.1F, 5.3335F, 9.3305F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(108, 161)
                        .addBox(-5.1F, 4.8892F, 9.3816F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
                        .texOffs(108, 161)
                        .addBox(3.1F, 5.5287F, 13.7647F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F))
                        .texOffs(108, 161)
                        .addBox(-5.1F, 4.4449F, 9.4327F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F))
                        .texOffs(108, 161)
                        .addBox(3.1F, 5.0844F, 13.8158F, 3.0F, 1.0F, 3.0F, new CubeDeformation(-0.4F))
                        .texOffs(101, 19)
                        .addBox(1.4F, 3.5314F, 8.3125F, 2.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F))
                        .texOffs(114, 11)
                        .addBox(1.4F, 4.1314F, 12.3125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 130)
                        .addBox(1.9F, 4.1314F, 13.8125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 130)
                        .addBox(0.9F, 4.7314F, 14.8125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 130)
                        .addBox(-0.7F, 4.7314F, 15.0125F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(148, 130)
                        .addBox(-1.3F, 4.8314F, 14.0125F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(114, 11)
                        .addBox(1.4F, 4.1314F, 8.3125F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-6.0F, 5.1629F, 13.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(160, 100)
                        .addBox(-4.5F, 4.9936F, 8.2882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(72, 178)
                        .addBox(-0.7F, 4.5314F, 11.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-5.1F, 5.1629F, 13.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(72, 178)
                        .addBox(-1.6F, 4.5314F, 12.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(153, 97)
                        .addBox(-6.0F, 5.1629F, 14.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(72, 178)
                        .addBox(0.2F, 4.5314F, 12.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-4.2F, 5.1629F, 14.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(72, 178)
                        .addBox(-0.7F, 4.5314F, 13.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-5.1F, 5.1629F, 15.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(158, 136)
                        .addBox(-4.2F, 5.1629F, 15.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(5.9F, -30.0F, -1.1F, 0.0F, 1.5708F, 0.3491F));

        PartDefinition telepathic_circuit = important_controls.addOrReplaceChild(
                "telepathic_circuit",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(3.9F, -20.4F, 4.3F, 0.0F, -1.5708F, 0.0F));

        PartDefinition crystal = telepathic_circuit.addOrReplaceChild(
                "crystal",
                CubeListBuilder.create()
                        .texOffs(105, 136)
                        .addBox(-1.0F, -0.2253F, -2.0453F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(140, 172)
                        .addBox(-1.0F, -0.2253F, 0.9547F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(0.6F, -0.316F, 0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(0.6F, -0.316F, -1.4876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(140, 172)
                        .addBox(-1.5F, -0.316F, 0.5124F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(-1.5F, -0.316F, -1.4876F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(1.0F, -0.2253F, -1.0453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
                        .texOffs(140, 172)
                        .addBox(-2.0F, -0.2253F, -1.0453F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(-4.0F, 0.5518F, 20.9068F, -0.4363F, 0.0F, 0.0F));

        PartDefinition lever8 = telepathic_circuit.addOrReplaceChild(
                "lever8",
                CubeListBuilder.create()
                        .texOffs(105, 136)
                        .addBox(-2.0F, -0.979F, 6.1202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(153, 180)
                        .addBox(-5.8F, -1.1744F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-5.8F, -1.1988F, -1.9267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(0.0F, -0.5258F, 6.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(-0.9F, -0.5563F, 5.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(1.0F, -0.5258F, 6.3315F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(0.1F, -0.5563F, 5.2139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(105, 136)
                        .addBox(-2.0F, -1.1194F, 0.9791F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F))
                        .texOffs(153, 180)
                        .addBox(-8.0F, -0.7569F, 1.1482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-8.0F, -0.8654F, 2.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(153, 180)
                        .addBox(-10.0F, -0.8654F, 2.0906F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(153, 180)
                        .addBox(-6.8F, -0.818F, -3.0871F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(153, 180)
                        .addBox(-4.8F, -1.1744F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-4.8F, -1.1988F, -1.9267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-4.8F, -1.1387F, -3.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-6.8F, -1.1744F, -1.0326F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-6.8F, -1.1988F, -1.9267F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-6.8F, -1.1387F, -3.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-5.8F, -1.1387F, -3.002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-8.0F, -0.6174F, 2.9786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-10.0F, -0.7569F, 1.1482F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 180)
                        .addBox(-10.0F, -0.6174F, 2.9786F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(141, 138)
                        .addBox(-12.8F, -0.4183F, 2.0784F, 9.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(141, 138)
                        .addBox(-5.8F, -0.6484F, -4.7943F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.1F))
                        .texOffs(141, 138)
                        .addBox(-5.1F, -0.7344F, -6.5789F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(1.0F, -1.4482F, 14.9068F, -0.4363F, 0.0F, 0.0F));

        PartDefinition nope = telepathic_circuit.addOrReplaceChild(
                "nope",
                CubeListBuilder.create()
                        .texOffs(155, 184)
                        .addBox(-1.5F, -1.8577F, -1.4094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(155, 184)
                        .addBox(-1.5F, -1.2577F, -1.4094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(155, 184)
                        .addBox(-1.2F, -1.5577F, -1.4094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(155, 184)
                        .addBox(-1.5F, -1.5577F, -1.1094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(155, 184)
                        .addBox(-1.5F, -1.5577F, -1.7094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(155, 184)
                        .addBox(-1.8F, -1.5577F, -1.4094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F)),
                PartPose.offsetAndRotation(-4.0124F, -1.8123F, 17.5686F, 0.4363F, 3.1416F, 0.0F));

        PartDefinition keyboard_behind_monitor = all.addOrReplaceChild(
                "keyboard_behind_monitor",
                CubeListBuilder.create()
                        .texOffs(30, 189)
                        .addBox(-14.4986F, 0.0036F, -6.3213F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(30, 189)
                        .addBox(-14.4986F, 0.0036F, -6.3213F, 4.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.4986F, -0.1964F, -4.9213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.4986F, -0.1964F, -4.9213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-12.4986F, -0.1964F, 1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-12.4986F, -0.1964F, 1.2787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.4986F, -0.1964F, 0.0787F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.4986F, -0.1964F, 0.0787F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-12.4986F, -0.1964F, -3.6213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-12.4986F, -0.1964F, -3.6213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.4986F, -0.1964F, -2.4213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.4986F, -0.1964F, -2.4213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-12.4986F, -0.1964F, -1.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 188)
                        .addBox(-12.4986F, -0.1964F, -1.2213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.9F, -26.6F, 0.5F, -0.6109F, 0.9599F, -0.6981F));

        PartDefinition keyboard_by_monitor = all.addOrReplaceChild(
                "keyboard_by_monitor",
                CubeListBuilder.create()
                        .texOffs(30, 189)
                        .addBox(-14.5034F, 0.6849F, -6.4929F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(30, 189)
                        .addBox(-14.5034F, 0.6849F, -6.4929F, 4.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, 2.3071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, 2.3071F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, 2.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, 2.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, 0.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, 0.0071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, -1.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, -1.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, -3.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, -3.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, -5.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-14.2034F, 0.4849F, -5.9929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, -5.0929F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, -5.0929F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 182)
                        .addBox(-9.9174F, 1.399F, -4.6268F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 182)
                        .addBox(-9.9174F, 1.399F, -4.6268F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, -0.0929F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, -0.0929F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 182)
                        .addBox(-9.9174F, 1.399F, 0.3732F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(144, 182)
                        .addBox(-9.9174F, 1.399F, 0.3732F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, -2.5929F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 180)
                        .addBox(-12.5034F, 0.4849F, -2.5929F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-2.2F, -25.3F, 6.7F, -0.6109F, 0.9425F, -0.6981F));

        PartDefinition bone100 = all.addOrReplaceChild(
                "bone100",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(0.2F, -26.2F, 3.0F, 0.1222F, -0.4712F, -0.3491F));

        PartDefinition bone101 = bone100.addOrReplaceChild(
                "bone101",
                CubeListBuilder.create()
                        .texOffs(141, 185)
                        .addBox(-17.8455F, 1.9164F, -1.2631F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(141, 185)
                        .addBox(-18.8177F, 1.7146F, -1.7493F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 176)
                        .addBox(-24.513F, 2.0962F, -1.1586F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 176)
                        .addBox(-24.5416F, 1.0896F, -2.1651F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 176)
                        .addBox(-24.4952F, 1.0699F, 0.8345F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(3.084F, -4.4256F, 3.9995F, 0.4363F, -1.0472F, -0.1745F));

        PartDefinition bone102 = bone100.addOrReplaceChild(
                "bone102",
                CubeListBuilder.create()
                        .texOffs(74, 190)
                        .addBox(-17.9423F, 2.1886F, -0.9521F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 190)
                        .addBox(-18.9146F, 1.9868F, -1.4383F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.2583F, -4.3874F, -5.0836F, 0.6109F, -0.9948F, -0.3491F));

        PartDefinition bone99 = all.addOrReplaceChild(
                "bone99",
                CubeListBuilder.create()
                        .texOffs(143, 179)
                        .addBox(-23.6375F, 2.6065F, -4.0702F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-24.4597F, 2.3356F, -4.5597F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(147, 174)
                        .addBox(-27.4263F, 3.6628F, -5.098F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                        .texOffs(146, 177)
                        .addBox(-27.1999F, 2.6888F, -5.1048F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.5F))
                        .texOffs(0, 0)
                        .addBox(-17.4421F, 2.2219F, -4.5422F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.2F, -31.8F, 5.3F, 0.1222F, -0.5061F, -0.2618F));

        PartDefinition bone92 = all.addOrReplaceChild(
                "bone92",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-16.4147F, 2.7866F, -3.6388F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(126, 192)
                        .addBox(-20.4147F, 2.7866F, -4.6388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(5.2F, -31.2F, 6.0F, 0.0873F, -0.5236F, -0.1745F));

        PartDefinition control6 = all.addOrReplaceChild(
                "control6",
                CubeListBuilder.create()
                        .texOffs(192, 174)
                        .addBox(-15.9698F, -0.7775F, 1.6328F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.3F, -24.3F, 2.4F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition control4 = all.addOrReplaceChild(
                "control4",
                CubeListBuilder.create()
                        .texOffs(153, 177)
                        .addBox(-17.7883F, 1.215F, 3.8865F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 140)
                        .addBox(-14.4072F, 0.5995F, 5.4355F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 140)
                        .addBox(-5.9111F, -0.9408F, 9.7778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(140, 140)
                        .addBox(-11.3542F, -0.1671F, 13.199F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(81, 178)
                        .addBox(-14.4206F, 0.7391F, 15.3264F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(8.0F, -25.0F, -6.4F, 0.4363F, -1.0472F, -0.5236F));

        PartDefinition control2 = all.addOrReplaceChild(
                "control2",
                CubeListBuilder.create()
                        .texOffs(148, 174)
                        .addBox(-19.5528F, -1.5521F, -4.4794F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                        .texOffs(149, 183)
                        .addBox(-19.2528F, -1.7521F, 2.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(149, 183)
                        .addBox(-19.2528F, -1.7521F, 0.0206F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(149, 183)
                        .addBox(-19.2528F, -1.7521F, -1.9794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(149, 183)
                        .addBox(-19.2528F, -1.7521F, -3.9794F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.7F, -24.0F, 3.4F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition Shell =
                all.addOrReplaceChild("Shell", CubeListBuilder.create(), PartPose.offset(-1.0F, 2.0F, -13.0F));

        PartDefinition Shellone =
                Shell.addOrReplaceChild("Shellone", CubeListBuilder.create(), PartPose.offset(1.2F, -28.2F, 16.0F));

        PartDefinition bone = Shellone.addOrReplaceChild(
                "bone",
                CubeListBuilder.create()
                        .texOffs(8, 53)
                        .addBox(-1.9F, -7.8284F, -5.8284F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, -12.0F));

        PartDefinition bone2 = Shellone.addOrReplaceChild(
                "bone2",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-2.9F, -18.1213F, -4.1213F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, 26.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone3 = bone2.addOrReplaceChild(
                "bone3",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-2.9F, -5.0261F, -2.8191F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone4 = bone3.addOrReplaceChild(
                "bone4",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-2.9F, -3.7385F, -2.9886F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone5 = bone4.addOrReplaceChild(
                "bone5",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-2.9F, -6.1252F, -4.2885F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone7 = Shellone.addOrReplaceChild(
                "bone7",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-1.9F, -29.4869F, 0.843F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone6 = Shellone.addOrReplaceChild(
                "bone6",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-1.9F, -28.8926F, -3.0494F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition Shellone2 = Shell.addOrReplaceChild(
                "Shellone2",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone8 = Shellone2.addOrReplaceChild(
                "bone8",
                CubeListBuilder.create()
                        .texOffs(8, 53)
                        .addBox(-4.5481F, -7.8284F, -4.415F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, -12.0F));

        PartDefinition bone9 = Shellone2.addOrReplaceChild(
                "bone9",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.5481F, -17.1219F, -3.1219F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, 26.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone10 = bone9.addOrReplaceChild(
                "bone10",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.5481F, -4.5427F, -1.4909F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone11 = bone10.addOrReplaceChild(
                "bone11",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.5481F, -3.8617F, -1.5806F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone12 = bone11.addOrReplaceChild(
                "bone12",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.5481F, -6.8319F, -3.0645F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone13 = Shellone2.addOrReplaceChild(
                "bone13",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-4.5481F, -29.2415F, 2.2349F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone14 = Shellone2.addOrReplaceChild(
                "bone14",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-4.5481F, -28.4091F, -1.7213F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition Shellone3 = Shell.addOrReplaceChild(
                "Shellone3",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone15 = Shellone3.addOrReplaceChild(
                "bone15",
                CubeListBuilder.create()
                        .texOffs(8, 53)
                        .addBox(-4.6481F, -7.8284F, -1.415F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, -12.0F));

        PartDefinition bone16 = Shellone3.addOrReplaceChild(
                "bone16",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.6481F, -15.0006F, -1.0006F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, 26.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone17 = bone16.addOrReplaceChild(
                "bone17",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.6481F, -3.5166F, 1.3282F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone18 = bone17.addOrReplaceChild(
                "bone18",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-5.6481F, -4.1232F, 1.408F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone19 = bone18.addOrReplaceChild(
                "bone19",
                CubeListBuilder.create()
                        .texOffs(8, 71)
                        .addBox(-5.6481F, -8.3319F, -0.4664F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone20 = Shellone3.addOrReplaceChild(
                "bone20",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-4.6481F, -28.7205F, 5.1894F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone21 = Shellone3.addOrReplaceChild(
                "bone21",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-4.6481F, -27.3831F, 1.0978F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition Shellone4 = Shell.addOrReplaceChild(
                "Shellone4",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone22 = Shellone4.addOrReplaceChild(
                "bone22",
                CubeListBuilder.create()
                        .texOffs(8, 53)
                        .addBox(-2.1F, -7.8284F, 0.1716F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, -12.0F));

        PartDefinition bone23 = Shellone4.addOrReplaceChild(
                "bone23",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-3.1F, -13.8787F, 0.1213F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, 26.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone24 = bone23.addOrReplaceChild(
                "bone24",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-3.1F, -2.9739F, 2.8191F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone25 = bone24.addOrReplaceChild(
                "bone25",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-3.1F, -4.2615F, 2.9886F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone26 = bone25.addOrReplaceChild(
                "bone26",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-3.1F, -9.1252F, 0.9076F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone27 = Shellone4.addOrReplaceChild(
                "bone27",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-2.1F, -28.445F, 6.7519F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone28 = Shellone4.addOrReplaceChild(
                "bone28",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-2.1F, -26.8404F, 2.5887F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition Shellone5 = Shell.addOrReplaceChild(
                "Shellone5",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone29 = Shellone5.addOrReplaceChild(
                "bone29",
                CubeListBuilder.create()
                        .texOffs(8, 53)
                        .addBox(0.6481F, -7.8284F, -4.2418F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, -12.0F));

        PartDefinition bone30 = Shellone5.addOrReplaceChild(
                "bone30",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-0.3519F, -16.9994F, -2.9994F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, 26.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone31 = bone30.addOrReplaceChild(
                "bone31",
                CubeListBuilder.create()
                        .texOffs(8, 71)
                        .addBox(-0.3519F, -4.4834F, -1.3282F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone32 = bone31.addOrReplaceChild(
                "bone32",
                CubeListBuilder.create()
                        .texOffs(8, 71)
                        .addBox(-0.3519F, -3.8768F, -1.408F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone33 = bone32.addOrReplaceChild(
                "bone33",
                CubeListBuilder.create()
                        .texOffs(8, 71)
                        .addBox(-0.3519F, -6.9185F, -2.9145F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone34 = Shellone5.addOrReplaceChild(
                "bone34",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(0.6481F, -29.2114F, 2.4055F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone35 = Shellone5.addOrReplaceChild(
                "bone35",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(0.6481F, -28.3499F, -1.5585F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition Shellone6 = Shell.addOrReplaceChild(
                "Shellone6",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone36 = Shellone6.addOrReplaceChild(
                "bone36",
                CubeListBuilder.create()
                        .texOffs(8, 53)
                        .addBox(0.5481F, -7.8284F, -1.2418F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, -12.0F));

        PartDefinition bone37 = Shellone6.addOrReplaceChild(
                "bone37",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-0.4519F, -14.8781F, -0.8781F, 5.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.5F, 26.0F, -10.0F, 0.7854F, 0.0F, 0.0F));

        PartDefinition bone38 = bone37.addOrReplaceChild(
                "bone38",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-0.4519F, -3.4573F, 1.4909F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -16.0F, -2.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone39 = bone38.addOrReplaceChild(
                "bone39",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-0.4519F, -4.1383F, 1.5806F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone40 = bone39.addOrReplaceChild(
                "bone40",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(-0.4519F, -8.4185F, -0.3164F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

        PartDefinition bone41 = Shellone6.addOrReplaceChild(
                "bone41",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(0.5481F, -28.6905F, 5.3599F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.1745F, 0.0F, 0.0F));

        PartDefinition bone42 = Shellone6.addOrReplaceChild(
                "bone42",
                CubeListBuilder.create()
                        .texOffs(9, 71)
                        .addBox(0.5481F, -27.3238F, 1.2605F, 5.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.5F, 31.0F, -12.0F, 0.3491F, 0.0F, 0.0F));

        PartDefinition bone50 = Shell.addOrReplaceChild(
                "bone50",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-6.4003F, 7.4F, 17.9631F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone51 = bone50.addOrReplaceChild(
                "bone51",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-5.3638F, 7.4F, 18.7976F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone52 = bone50.addOrReplaceChild(
                "bone52",
                CubeListBuilder.create()
                        .texOffs(100, 3)
                        .addBox(-21.4879F, 7.4F, 10.0069F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone53 = Shell.addOrReplaceChild(
                "bone53",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-7.9869F, 7.4F, 20.5112F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition bone54 = bone53.addOrReplaceChild(
                "bone54",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-5.7249F, 7.4F, 21.7775F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone55 = bone53.addOrReplaceChild(
                "bone55",
                CubeListBuilder.create()
                        .texOffs(100, 3)
                        .addBox(-24.0027F, 7.4F, 11.6458F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone56 = Shell.addOrReplaceChild(
                "bone56",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-6.5735F, 7.4F, 23.1593F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -2.618F, 0.0F));

        PartDefinition bone57 = bone56.addOrReplaceChild(
                "bone57",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-3.3248F, 7.4F, 23.5801F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone58 = bone56.addOrReplaceChild(
                "bone58",
                CubeListBuilder.create()
                        .texOffs(100, 3)
                        .addBox(-23.8408F, 7.4F, 14.6431F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone59 = Shell.addOrReplaceChild(
                "bone59",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-3.5735F, 7.4F, 23.2593F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 2.618F, 0.0F));

        PartDefinition bone60 = bone59.addOrReplaceChild(
                "bone60",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-0.5636F, 7.4F, 22.4029F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone61 = bone59.addOrReplaceChild(
                "bone61",
                CubeListBuilder.create()
                        .texOffs(100, 3)
                        .addBox(-21.1642F, 7.4F, 16.0015F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone62 = Shell.addOrReplaceChild(
                "bone62",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-1.9869F, 7.4F, 20.7112F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone63 = bone62.addOrReplaceChild(
                "bone63",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-0.2025F, 7.4F, 19.423F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone64 = bone62.addOrReplaceChild(
                "bone64",
                CubeListBuilder.create()
                        .texOffs(100, 3)
                        .addBox(-18.6493F, 7.4F, 14.3627F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone65 = Shell.addOrReplaceChild(
                "bone65",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-3.4003F, 7.4F, 18.0631F, 10.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone66 = bone65.addOrReplaceChild(
                "bone66",
                CubeListBuilder.create()
                        .texOffs(98, 3)
                        .addBox(-2.6026F, 7.4F, 17.6204F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone67 = bone65.addOrReplaceChild(
                "bone67",
                CubeListBuilder.create()
                        .texOffs(100, 2)
                        .addBox(-18.8112F, 7.4F, 11.3654F, 8.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone68 = Shell.addOrReplaceChild(
                "bone68",
                CubeListBuilder.create()
                        .texOffs(4, 15)
                        .addBox(-7.9869F, 7.4F, 10.5112F, 10.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.2F, -23.2F, 16.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition bone69 = bone68.addOrReplaceChild(
                "bone69",
                CubeListBuilder.create()
                        .texOffs(4, 15)
                        .addBox(-5.7249F, 7.4F, 11.7775F, 8.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone70 = bone68.addOrReplaceChild(
                "bone70",
                CubeListBuilder.create()
                        .texOffs(4, 15)
                        .addBox(-24.0027F, 7.4F, 1.6458F, 8.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone71 = Shell.addOrReplaceChild(
                "bone71",
                CubeListBuilder.create()
                        .texOffs(6, 14)
                        .addBox(-6.5735F, 7.4F, 15.1593F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.2F, -23.2F, 17.0F, 0.0F, -2.618F, 0.0F));

        PartDefinition bone72 = bone71.addOrReplaceChild(
                "bone72",
                CubeListBuilder.create()
                        .texOffs(6, 14)
                        .addBox(-3.3248F, 7.4F, 15.5801F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone73 = bone71.addOrReplaceChild(
                "bone73",
                CubeListBuilder.create()
                        .texOffs(6, 14)
                        .addBox(-23.8408F, 7.4F, 6.6431F, 8.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone74 = Shell.addOrReplaceChild(
                "bone74",
                CubeListBuilder.create()
                        .texOffs(5, 18)
                        .addBox(-3.5735F, 7.4F, 12.2593F, 10.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, -23.2F, 17.0F, 0.0F, 2.618F, 0.0F));

        PartDefinition bone75 = bone74.addOrReplaceChild(
                "bone75",
                CubeListBuilder.create()
                        .texOffs(5, 18)
                        .addBox(-0.5636F, 7.4F, 11.4029F, 8.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone76 = bone74.addOrReplaceChild(
                "bone76",
                CubeListBuilder.create()
                        .texOffs(5, 18)
                        .addBox(-21.1642F, 7.4F, 5.0015F, 8.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone77 = Shell.addOrReplaceChild(
                "bone77",
                CubeListBuilder.create()
                        .texOffs(10, 16)
                        .addBox(-1.9869F, 7.4F, 9.7112F, 10.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, -23.2F, 16.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition bone78 = bone77.addOrReplaceChild(
                "bone78",
                CubeListBuilder.create()
                        .texOffs(10, 16)
                        .addBox(-0.2025F, 7.4F, 8.423F, 8.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone79 = bone77.addOrReplaceChild(
                "bone79",
                CubeListBuilder.create()
                        .texOffs(10, 16)
                        .addBox(-18.6493F, 7.4F, 3.3627F, 8.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone80 = Shell.addOrReplaceChild(
                "bone80",
                CubeListBuilder.create()
                        .texOffs(6, 19)
                        .addBox(-3.4003F, 7.4F, 9.0631F, 10.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.2F, -23.2F, 15.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition bone81 = bone80.addOrReplaceChild(
                "bone81",
                CubeListBuilder.create()
                        .texOffs(6, 19)
                        .addBox(-2.6026F, 7.4F, 8.6204F, 8.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone82 = bone80.addOrReplaceChild(
                "bone82",
                CubeListBuilder.create()
                        .texOffs(6, 19)
                        .addBox(-18.8112F, 7.4F, 2.3654F, 8.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone83 = Shell.addOrReplaceChild(
                "bone83",
                CubeListBuilder.create()
                        .texOffs(7, 11)
                        .addBox(-6.4003F, 7.4F, 8.9631F, 10.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(2.2F, -23.2F, 15.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition bone84 = bone83.addOrReplaceChild(
                "bone84",
                CubeListBuilder.create()
                        .texOffs(7, 11)
                        .addBox(-5.3638F, 7.4F, 9.7976F, 8.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

        PartDefinition bone85 = bone83.addOrReplaceChild(
                "bone85",
                CubeListBuilder.create()
                        .texOffs(7, 11)
                        .addBox(-21.4879F, 7.4F, 1.0069F, 8.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(18.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

        PartDefinition bone43 = Shell.addOrReplaceChild(
                "bone43",
                CubeListBuilder.create()
                        .texOffs(0, 8)
                        .addBox(-8.9F, 8.0F, -13.0F, 18.0F, 13.0F, 20.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 11)
                        .addBox(-10.9F, 10.0F, -15.0F, 22.0F, 7.0F, 24.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 18)
                        .addBox(-8.9F, 23.0F, -13.0F, 18.0F, 2.0F, 20.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 0)
                        .addBox(-7.9F, 19.0F, -12.0F, 16.0F, 5.0F, 18.0F, new CubeDeformation(0.0F))
                        .texOffs(0, 15)
                        .addBox(-9.9F, 19.0F, -14.0F, 20.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)),
                PartPose.offset(1.2F, -28.2F, 16.0F));

        PartDefinition bone86 = Shell.addOrReplaceChild(
                "bone86",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.4F, -5.0F, 0.4F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(1.2F, -28.2F, 16.0F));

        PartDefinition bone87 = Shell.addOrReplaceChild(
                "bone87",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-4.9876F, -5.0F, 1.7785F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone88 = Shell.addOrReplaceChild(
                "bone88",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-5.0876F, -5.0F, 4.7086F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone89 = Shell.addOrReplaceChild(
                "bone89",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-2.6F, -5.0F, 6.2603F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone90 = Shell.addOrReplaceChild(
                "bone90",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(0.0876F, -5.0F, 1.9517F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone91 = Shell.addOrReplaceChild(
                "bone91",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-0.0124F, -5.0F, 4.8818F, 5.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone93 = Shell.addOrReplaceChild(
                "bone93",
                CubeListBuilder.create()
                        .texOffs(88, 20)
                        .addBox(-4.0605F, 5.6F, 2.9952F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(97, 24)
                        .addBox(-4.0605F, -42.4F, 2.9952F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 20)
                        .addBox(-4.0605F, 3.0F, 2.9952F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(1.2F, -37.2F, 16.0F));

        PartDefinition bone94 = Shell.addOrReplaceChild(
                "bone94",
                CubeListBuilder.create()
                        .texOffs(88, 20)
                        .addBox(-6.5703F, 5.6F, 4.5141F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(101, 25)
                        .mirror()
                        .addBox(-6.5703F, -42.4F, 4.5141F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(88, 20)
                        .addBox(-6.5703F, 3.0F, 4.5141F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -37.2F, 16.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition bone95 = Shell.addOrReplaceChild(
                "bone95",
                CubeListBuilder.create()
                        .texOffs(88, 20)
                        .addBox(-6.5098F, 5.6F, -4.5529F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(90, 16)
                        .mirror()
                        .addBox(-6.5098F, -42.4F, -4.5529F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
                        .mirror(false)
                        .texOffs(88, 20)
                        .addBox(-6.5098F, 3.0F, -4.5529F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -37.2F, 16.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition bone96 = Shell.addOrReplaceChild(
                "bone96",
                CubeListBuilder.create()
                        .texOffs(88, 20)
                        .addBox(-3.9395F, 5.6F, -3.1388F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 16)
                        .addBox(-3.9395F, -42.4F, -3.1388F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 20)
                        .addBox(-3.9395F, 3.0F, -3.1388F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -37.2F, 16.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition bone97 = Shell.addOrReplaceChild(
                "bone97",
                CubeListBuilder.create()
                        .texOffs(88, 20)
                        .addBox(-1.4902F, 5.6F, 4.4093F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 23)
                        .addBox(-1.4902F, -42.4F, 4.4093F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 20)
                        .addBox(-1.4902F, 3.0F, 4.4093F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -37.2F, 16.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition bone98 = Shell.addOrReplaceChild(
                "bone98",
                CubeListBuilder.create()
                        .texOffs(88, 20)
                        .addBox(-1.4297F, 5.6F, -4.6577F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 16)
                        .addBox(-1.4297F, -42.4F, -4.6577F, 8.0F, 6.0F, 13.0F, new CubeDeformation(0.0F))
                        .texOffs(88, 20)
                        .addBox(-1.4297F, 3.0F, -4.6577F, 8.0F, 1.0F, 13.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -37.2F, 16.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition bone105 = all.addOrReplaceChild(
                "bone105",
                CubeListBuilder.create()
                        .texOffs(10, 110)
                        .addBox(-4.683F, -1.9082F, -3.7111F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(67, 185)
                        .addBox(-4.1768F, -2.22F, -3.143F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(9.7F, -19.0F, -12.2F, 0.4363F, -0.5236F, 0.0F));

        PartDefinition x =
                partdefinition.addOrReplaceChild("x", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition y =
                partdefinition.addOrReplaceChild("y", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition z =
                partdefinition.addOrReplaceChild("z", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition glow =
                partdefinition.addOrReplaceChild("glow", CubeListBuilder.create(), PartPose.offset(9.5F, 5.0F, -12.2F));

        PartDefinition keyboard_behind_monitor_glow = glow.addOrReplaceChild(
                "keyboard_behind_monitor_glow",
                CubeListBuilder.create()
                        .texOffs(185, 145)
                        .addBox(-14.1986F, -0.1964F, 2.1787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(182, 124)
                        .addBox(-14.1986F, -0.1964F, 0.1787F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(185, 145)
                        .addBox(-14.1986F, -0.1964F, -1.8213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(185, 145)
                        .addBox(-14.1986F, -0.1964F, -3.8213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(185, 145)
                        .addBox(-14.1986F, -0.1964F, -5.8213F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-8.8F, -7.6F, 12.7F, -0.6109F, 0.9599F, -0.6981F));

        PartDefinition keyboard_by_monitor_glow = glow.addOrReplaceChild(
                "keyboard_by_monitor_glow",
                CubeListBuilder.create()
                        .texOffs(186, 142)
                        .addBox(-12.5034F, 0.4849F, 1.1071F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(186, 142)
                        .addBox(-12.5034F, 0.4849F, -1.3929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(186, 142)
                        .addBox(-12.5034F, 0.4849F, -3.7929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(186, 142)
                        .addBox(-12.5034F, 0.4849F, -6.2929F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.9F, -6.3F, 18.9F, -0.6109F, 0.9425F, -0.6981F));

        PartDefinition bone44 = glow.addOrReplaceChild(
                "bone44",
                CubeListBuilder.create()
                        .texOffs(188, 140)
                        .addBox(-18.4147F, 2.7866F, -4.6388F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-4.5F, -12.2F, 18.2F, 0.0873F, -0.5236F, -0.1745F));

        PartDefinition refuel2 = glow.addOrReplaceChild(
                "refuel2",
                CubeListBuilder.create()
                        .texOffs(107, 17)
                        .addBox(-16.0486F, -2.4317F, 0.507F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-6.0F, -5.3F, 16.6F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition doorcontrol2 = glow.addOrReplaceChild(
                "doorcontrol2",
                CubeListBuilder.create()
                        .texOffs(100, 9)
                        .addBox(-17.8461F, -1.6152F, 4.2918F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-11.9F, -3.3F, 12.2F, 0.384F, -1.0472F, -0.4363F));

        PartDefinition land_type_red = glow.addOrReplaceChild(
                "land_type_red",
                CubeListBuilder.create()
                        .texOffs(182, 142)
                        .addBox(-3.734F, -3.1158F, -2.6444F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, -0.5236F, 0.0F));

        PartDefinition monitor_screen = glow.addOrReplaceChild(
                "monitor_screen",
                CubeListBuilder.create()
                        .texOffs(71, 142)
                        .addBox(-3.6261F, -3.0F, 12.9797F, 7.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-9.8F, -9.0F, 12.6F, 0.0F, -0.5236F, 0.0F));

        PartDefinition throttle_glow = glow.addOrReplaceChild(
                "throttle_glow",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-7.8F, -10.0F, 12.6F, -0.2618F, 0.0F, 0.0F));

        PartDefinition throttle_glow_red = throttle_glow.addOrReplaceChild(
                "throttle_glow_red",
                CubeListBuilder.create()
                        .texOffs(186, 142)
                        .addBox(-1.1F, -1.3235F, 11.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition throttle_glow_yellow = throttle_glow.addOrReplaceChild(
                "throttle_glow_yellow",
                CubeListBuilder.create()
                        .texOffs(195, 117)
                        .addBox(-1.1F, -1.3235F, 13.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition throttle_glow_green = throttle_glow.addOrReplaceChild(
                "throttle_glow_green",
                CubeListBuilder.create()
                        .texOffs(190, 99)
                        .addBox(-1.1F, -0.9235F, 15.6022F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition shell_glow =
                glow.addOrReplaceChild("shell_glow", CubeListBuilder.create(), PartPose.offset(-10.7F, 21.0F, -0.8F));

        PartDefinition bone150 = shell_glow.addOrReplaceChild(
                "bone150",
                CubeListBuilder.create()
                        .texOffs(96, 75)
                        .addBox(-5.0134F, -2.1191F, -9.8F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(96, 75)
                        .addBox(-7.0134F, -2.1191F, -11.8F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 75)
                        .addBox(-9.0134F, -2.1191F, -17.8F, 15.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 85)
                        .addBox(-11.0134F, -2.1191F, -24.8F, 19.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.4363F, -0.5236F, 0.0F));

        PartDefinition bone151 = shell_glow.addOrReplaceChild(
                "bone151",
                CubeListBuilder.create()
                        .texOffs(93, 79)
                        .addBox(-6.6F, -1.0423F, -7.4906F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(93, 79)
                        .addBox(-8.6F, -1.0423F, -9.4906F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 75)
                        .addBox(-10.6F, -1.0423F, -15.4906F, 15.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 85)
                        .addBox(-12.6F, -1.0423F, -22.4906F, 19.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.4363F, -1.5708F, 0.0F));

        PartDefinition bone152 = shell_glow.addOrReplaceChild(
                "bone152",
                CubeListBuilder.create()
                        .texOffs(86, 77)
                        .addBox(-5.1866F, 0.0769F, -5.0907F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(86, 77)
                        .addBox(-7.1866F, 0.0769F, -7.0907F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 75)
                        .addBox(-9.1866F, 0.0769F, -13.0907F, 15.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 85)
                        .addBox(-11.1866F, 0.0769F, -20.0907F, 19.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.4363F, -2.618F, 0.0F));

        PartDefinition bone153 = shell_glow.addOrReplaceChild(
                "bone153",
                CubeListBuilder.create()
                        .texOffs(78, 75)
                        .addBox(-2.1866F, 0.1191F, -5.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(78, 75)
                        .addBox(-4.1866F, 0.1191F, -7.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 75)
                        .addBox(-6.1866F, 0.1191F, -13.0F, 15.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 85)
                        .addBox(-8.1866F, 0.1191F, -20.0F, 19.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.4363F, 2.618F, 0.0F));

        PartDefinition bone154 = shell_glow.addOrReplaceChild(
                "bone154",
                CubeListBuilder.create()
                        .texOffs(79, 77)
                        .addBox(-0.6F, -0.9577F, -7.3094F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(79, 77)
                        .addBox(-2.6F, -0.9577F, -9.3094F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 75)
                        .addBox(-4.6F, -0.9577F, -15.3094F, 15.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 85)
                        .addBox(-6.6F, -0.9577F, -22.3094F, 19.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.4363F, 1.5708F, 0.0F));

        PartDefinition bone155 = shell_glow.addOrReplaceChild(
                "bone155",
                CubeListBuilder.create()
                        .texOffs(74, 63)
                        .addBox(-2.0134F, -2.0769F, -9.7093F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(74, 63)
                        .addBox(-4.0134F, -2.0769F, -11.7093F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(80, 75)
                        .addBox(-6.0134F, -2.0769F, -17.7093F, 15.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(72, 85)
                        .addBox(-8.0134F, -2.0769F, -24.7093F, 19.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(1.2F, -28.2F, 16.0F, 0.4363F, 0.5236F, 0.0F));

        PartDefinition phone = glow.addOrReplaceChild(
                "phone",
                CubeListBuilder.create()
                        .texOffs(112, 20)
                        .addBox(-1.6F, 4.5314F, 11.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(186, 142)
                        .addBox(-8.0F, 5.6327F, 13.8417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(186, 142)
                        .addBox(-4.5F, 4.9597F, 7.2117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(188, 97)
                        .addBox(-3.5F, 4.9597F, 7.2117F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(96, 18)
                        .addBox(-8.0F, 5.6666F, 14.9182F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(187, 121)
                        .addBox(-3.5F, 4.9936F, 8.2882F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(110, 17)
                        .addBox(0.2F, 4.5314F, 11.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(184, 95)
                        .addBox(-4.2F, 5.1629F, 13.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(110, 17)
                        .addBox(-0.7F, 4.5314F, 12.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(179, 123)
                        .addBox(-5.1F, 5.1629F, 14.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(110, 17)
                        .addBox(-1.6F, 4.5314F, 13.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(187, 140)
                        .addBox(-6.0F, 5.1629F, 15.6707F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(110, 17)
                        .addBox(0.2F, 4.5314F, 13.3125F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-3.8F, -11.0F, 11.1F, 0.0F, 1.5708F, 0.3491F));

        PartDefinition land_type_glow = glow.addOrReplaceChild(
                "land_type_glow",
                CubeListBuilder.create()
                        .texOffs(104, 13)
                        .addBox(-5.0821F, -1.5669F, 1.6773F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(192, 130)
                        .addBox(-2.367F, -1.2394F, 1.1965F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(187, 116)
                        .addBox(-1.535F, -1.5051F, -1.503F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(94, 22)
                        .addBox(-1.6421F, -1.4441F, -3.5017F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(4.0F, 0.0F, 2.0F, 0.4363F, -0.5236F, 0.0F));

        PartDefinition telepathic_circuit_glow = glow.addOrReplaceChild(
                "telepathic_circuit_glow",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-5.8F, -1.4F, 16.5F, 0.0F, -1.5708F, 0.0F));

        PartDefinition crystal2 = telepathic_circuit_glow.addOrReplaceChild(
                "crystal2",
                CubeListBuilder.create()
                        .texOffs(109, 109)
                        .addBox(-0.4F, -2.2253F, -0.5453F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                        .texOffs(109, 109)
                        .addBox(-0.4F, -2.2253F, -0.1453F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(109, 109)
                        .addBox(-0.1F, -1.7253F, -0.3453F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(109, 109)
                        .addBox(-0.7F, -1.7253F, -0.7453F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(109, 109)
                        .addBox(-0.4F, -3.0253F, -0.4453F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-4.0F, 0.5518F, 20.9068F, -0.4363F, 0.0F, 0.0F));

        PartDefinition lever7 = telepathic_circuit_glow.addOrReplaceChild(
                "lever7",
                CubeListBuilder.create()
                        .texOffs(8, 146)
                        .addBox(-2.0F, -1.0095F, 2.0026F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                        .texOffs(188, 119)
                        .addBox(-8.2F, -0.6892F, 5.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(152, 141)
                        .addBox(-8.2F, -0.5498F, 7.0927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(152, 141)
                        .addBox(-10.0F, -0.6892F, 5.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(183, 91)
                        .addBox(-11.9F, -0.6892F, 5.2622F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 184)
                        .addBox(-10.0F, -0.5498F, 7.0927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F))
                        .texOffs(153, 184)
                        .addBox(-11.9F, -0.5498F, 7.0927F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)),
                PartPose.offsetAndRotation(1.0F, -1.4482F, 14.9068F, -0.4363F, 0.0F, 0.0F));

        PartDefinition nope2 = telepathic_circuit_glow.addOrReplaceChild(
                "nope2",
                CubeListBuilder.create()
                        .texOffs(106, 112)
                        .addBox(-1.5F, -1.5577F, -1.4094F, 3.0F, 3.0F, 3.0F, new CubeDeformation(-0.4F)),
                PartPose.offsetAndRotation(-4.0124F, -1.8123F, 17.5686F, 0.4363F, 3.1416F, 0.0F));

        PartDefinition block2_glow = glow.addOrReplaceChild(
                "block2_glow",
                CubeListBuilder.create(),
                PartPose.offsetAndRotation(-2.8F, -8.5F, 13.6F, -0.0524F, -1.0472F, -0.0873F));

        PartDefinition lever9 = block2_glow.addOrReplaceChild(
                "lever9",
                CubeListBuilder.create()
                        .texOffs(7, 146)
                        .addBox(-1.7935F, -0.3712F, -4.4235F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                        .texOffs(7, 146)
                        .addBox(-2.7968F, 0.7509F, -1.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(7, 146)
                        .addBox(-0.4887F, 2.2419F, 6.3644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(7, 146)
                        .addBox(-2.5976F, 2.2172F, 6.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(174, 140)
                        .addBox(-0.4887F, 2.2419F, 7.3644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(185, 101)
                        .addBox(-3.7968F, 0.7509F, -0.0227F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(185, 101)
                        .addBox(-1.4887F, 2.2419F, 7.3644F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
                        .texOffs(187, 119)
                        .addBox(-3.5976F, 2.2172F, 7.4084F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-2.9869F, -0.7455F, 16.8686F, 0.0F, 0.0F, 0.0349F));

        PartDefinition bone45_glow = glow.addOrReplaceChild(
                "bone45_glow",
                CubeListBuilder.create()
                        .texOffs(189, 141)
                        .addBox(-3.2F, 0.8145F, 21.2285F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.2F)),
                PartPose.offsetAndRotation(-8.3F, -13.7F, 0.0F, -0.2618F, 0.0F, 0.0F));

        PartDefinition rotartop = partdefinition.addOrReplaceChild(
                "rotartop",
                CubeListBuilder.create()
                        .texOffs(164, 32)
                        .addBox(-3.9F, 1.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(164, 32)
                        .addBox(-3.9F, -5.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(169, 36)
                        .addBox(0.2F, -9.0F, -3.2F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(169, 36)
                        .addBox(0.2F, -9.0F, 1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(169, 36)
                        .addBox(-3.1F, -9.0F, -3.2F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F))
                        .texOffs(169, 36)
                        .addBox(-3.1F, -9.0F, 1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.3F, -44.2F, 0.0F));

        PartDefinition rotarbottom = partdefinition.addOrReplaceChild(
                "rotarbottom",
                CubeListBuilder.create()
                        .texOffs(164, 32)
                        .addBox(-3.9F, 14.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(164, 32)
                        .addBox(-3.9F, 8.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
                        .texOffs(182, 14)
                        .addBox(0.2F, -8.0F, -3.2F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.125F))
                        .texOffs(182, 14)
                        .addBox(0.2F, -8.0F, 1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.125F))
                        .texOffs(182, 14)
                        .addBox(-3.1F, -8.0F, -3.2F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.125F))
                        .texOffs(182, 14)
                        .addBox(-3.1F, -8.0F, 1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.125F)),
                PartPose.offset(0.3F, -23.2F, 0.0F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild(
                "bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition Activator_r1 = bb_main.addOrReplaceChild(
                "Activator_r1",
                CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0.0F, -22.25F, 20.0F, -0.2618F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 200, 200);
    }

    @Override
    public ModelPart root() {
        return super.root();
    }

    @Override
    public void setupAnim(Entity entity, float v, float v1, float v2, float v3, float v4) {}

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
        poseStack.translate(0, 0.15, 0);
        poseStack.scale(0.9f, 0.9f, 0.9f);
        all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        x.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        y.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        z.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        glow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rotartop.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rotarbottom.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnimations(T t, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent(tardis -> {
            this.animate(t.rotorAnimationState, CoralConsoleModelAnimation.ROTOR, ageInTicks);
        });
    }

    @Override
    public Optional<String> getPartForControl(ControlType<?> controlType) {
        if (controlType == ControlRegistry.SONIC_PORT.get()) {
            return Optional.of("important_controls/Sonicport");
        }
        return Optional.empty();
    }

    public static class CoralConsoleModelAnimation {
        public static final AnimationDefinition ROTOR = AnimationDefinition.Builder.withLength(8.0F)
                .looping()
                .addAnimation(
                        "rotartop",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        4.0F,
                                        KeyframeAnimations.posVec(0.0F, -5.5F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        8.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .addAnimation(
                        "rotarbottom",
                        new AnimationChannel(
                                AnimationChannel.Targets.POSITION,
                                new Keyframe(
                                        0.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        4.0F,
                                        KeyframeAnimations.posVec(0.0F, 5.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM),
                                new Keyframe(
                                        8.0F,
                                        KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                                        AnimationChannel.Interpolations.CATMULLROM)))
                .build();
    }
}
