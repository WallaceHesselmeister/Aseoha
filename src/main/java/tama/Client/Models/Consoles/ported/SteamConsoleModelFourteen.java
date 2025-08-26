package tama.Client.Models.Consoles.ported;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.client.models.IAnimatableTileModel;
import net.tardis.mod.control.IncrementControl;
import net.tardis.mod.misc.enums.DoorState;
import net.tardis.mod.misc.enums.LandingType;
import net.tardis.mod.registry.ControlRegistry;
import net.tardis.mod.registry.SubsystemRegistry;
import org.jetbrains.annotations.NotNull;

public class SteamConsoleModelFourteen<T extends ConsoleTile> extends HierarchicalModel<Entity> implements IAnimatableTileModel<ConsoleTile> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "modelsteamconsole"), "main");
    private final ModelPart root;
    private final ModelPart glow;
    private final ModelPart glow_meterglass_a1;
    private final ModelPart glow_lamp_a1;
    private final ModelPart glow_lamp_a2;
    private final ModelPart glow_glass_b1;
    private final ModelPart glow_glass_b2;
    private final ModelPart glow_lamp_c1;
    private final ModelPart glow_lamp_c2;
    private final ModelPart glow_panel_e;
    private final ModelPart glow_glass_e2;
    private final ModelPart glow_glass_e3;
    private final ModelPart glow_glass_e1;
    private final ModelPart redlamp_e3;
    private final ModelPart redlamp_e4;
    private final ModelPart glow_core;
    private final ModelPart glow_radio;
    private final ModelPart rotor;
    private final ModelPart core;
    private final ModelPart underbit_1;
    private final ModelPart underbit_2;
    private final ModelPart underbit_3;
    private final ModelPart spinner_slide_y;
    private final ModelPart hourflip_rotate_x;
    private final ModelPart glass;
    private final ModelPart center;
    private final ModelPart top_ring;
    private final ModelPart under_ring;
    private final ModelPart strut_1;
    private final ModelPart strut_2;
    private final ModelPart controls;
    private final ModelPart contolset_a;
    private final ModelPart door_switch;
    private final ModelPart door_crank_rotate_y;
    private final ModelPart sonic_port;
    private final ModelPart meter_a1;
    private final ModelPart needle_a1_rotate_y;
    private final ModelPart button_set_a1;
    private final ModelPart baseplate_a1;
    private final ModelPart baseplate_a2;
    private final ModelPart baseplate_a3;
    private final ModelPart controlset_b;
    private final ModelPart throttle;
    private final ModelPart leaver_b1_rotate_z;
    private final ModelPart leaver_b1_jig;
    private final ModelPart x_switch;
    private final ModelPart y_switch;
    private final ModelPart z_switch;
    private final ModelPart cordselect_inc;
    private final ModelPart cord_slider_slide_x;
    private final ModelPart nixietube_b1;
    private final ModelPart nixietube_b2;
    private final ModelPart baseplate_b1;
    private final ModelPart baseplate_b2;
    private final ModelPart baseplate_b3;
    private final ModelPart readout_b1;
    private final ModelPart baseplate_b4;
    private final ModelPart readout_b2;
    private final ModelPart controlset_c;
    private final ModelPart communications;
    private final ModelPart radio;
    private final ModelPart radio_dial;
    private final ModelPart radio_dial_sub;
    private final ModelPart radio_needle;
    private final ModelPart speakers;
    private final ModelPart radio_body;
    private final ModelPart radio_dial_base;
    private final ModelPart refuler;
    private final ModelPart baseplate_c1;
    private final ModelPart baseplate_c2;
    private final ModelPart slider_c1;
    private final ModelPart sliderknob_c1_slide_x;
    private final ModelPart slider_track_c1;
    private final ModelPart slider_c2;
    private final ModelPart sliderknob_c2_slide_x;
    private final ModelPart slider_track_c2;
    private final ModelPart slider_c3;
    private final ModelPart sliderknob_c3_slide_x;
    private final ModelPart slider_track_c3;
    private final ModelPart switch_c1;
    private final ModelPart toggle_c1;
    private final ModelPart switch_c2;
    private final ModelPart toggle_c2;
    private final ModelPart switch_c3;
    private final ModelPart toggle_c3;
    private final ModelPart switch_c4;
    private final ModelPart toggle_c4;
    private final ModelPart controlset_d;
    private final ModelPart waypoint_selector;
    private final ModelPart type_arm_rotate_x;
    private final ModelPart keys;
    private final ModelPart type_body;
    private final ModelPart tumbler;
    private final ModelPart dimention_selector;
    private final ModelPart tilt_d1;
    private final ModelPart baseplate_d1;
    private final ModelPart baseplate_d2;
    private final ModelPart baseplate_d3;
    private final ModelPart controlset_e;
    private final ModelPart telepathic_circuits;
    private final ModelPart talking_board;
    private final ModelPart talkingboard_text;
    private final ModelPart talkingboard_corners;
    private final ModelPart scrying_glass;
    private final ModelPart frame;
    private final ModelPart scrying_glass_frame_e1;
    private final ModelPart scrying_glass_frame_e3;
    private final ModelPart scrying_glass_frame_e2;
    private final ModelPart post_e1;
    private final ModelPart nixietube_e1;
    private final ModelPart nixietube_e2;
    private final ModelPart nixietube_e3;
    private final ModelPart baseplate_e1;
    private final ModelPart baseplate_e2;
    private final ModelPart switch_e1;
    private final ModelPart toggle_e1;
    private final ModelPart switch_e2;
    private final ModelPart toggle_e2;
    private final ModelPart controlset_f;
    private final ModelPart baseplate_f1;
    private final ModelPart switch_f1;
    private final ModelPart toggle_f1;
    private final ModelPart switch_f2;
    private final ModelPart toggle_f2;
    private final ModelPart switch_f3;
    private final ModelPart toggle_f3;
    private final ModelPart switch_f4;
    private final ModelPart toggle_f4;
    private final ModelPart switch_f5;
    private final ModelPart toggle_f5;
    private final ModelPart switch_f6;
    private final ModelPart toggle_f6;
    private final ModelPart handbreak;
    private final ModelPart lever_f1_rotate_z;
    private final ModelPart barrel;
    private final ModelPart randomize_cords;
    private final ModelPart globe_rotate_y;
    private final ModelPart globe_mount;
    private final ModelPart rotation_selector;
    private final ModelPart rotation_crank_rotate_y;
    private final ModelPart structure;
    private final ModelPart side_001;
    private final ModelPart skin;
    private final ModelPart floor_skin;
    private final ModelPart floorboards;
    private final ModelPart leg_skin;
    private final ModelPart knee_skin;
    private final ModelPart thigh_skin;
    private final ModelPart belly_skin;
    private final ModelPart rimtop_skin;
    private final ModelPart panel_skin;
    private final ModelPart skelly;
    private final ModelPart rib;
    private final ModelPart rib_bolts_1;
    private final ModelPart foot;
    private final ModelPart leg;
    private final ModelPart thigh;
    private final ModelPart floorpipes;
    private final ModelPart front_rail;
    private final ModelPart front_railbolt;
    private final ModelPart rail_topbevel;
    private final ModelPart rail_underbevel;
    private final ModelPart rotor_gasket;
    private final ModelPart floor_trim;
    private final ModelPart side_002;
    private final ModelPart skin2;
    private final ModelPart floor_skin2;
    private final ModelPart floorboards2;
    private final ModelPart leg_skin2;
    private final ModelPart knee_skin2;
    private final ModelPart thigh_skin2;
    private final ModelPart belly_skin2;
    private final ModelPart rimtop_skin2;
    private final ModelPart panel_skin2;
    private final ModelPart skelly2;
    private final ModelPart rib2;
    private final ModelPart rib_bolts_2;
    private final ModelPart foot2;
    private final ModelPart leg2;
    private final ModelPart thigh2;
    private final ModelPart floorpipes2;
    private final ModelPart front_rail2;
    private final ModelPart front_railbolt2;
    private final ModelPart rail_topbevel2;
    private final ModelPart rail_underbevel2;
    private final ModelPart rotor_gasket2;
    private final ModelPart floor_trim2;
    private final ModelPart side_003;
    private final ModelPart skin3;
    private final ModelPart floor_skin3;
    private final ModelPart floorboards3;
    private final ModelPart leg_skin3;
    private final ModelPart knee_skin3;
    private final ModelPart thigh_skin3;
    private final ModelPart belly_skin3;
    private final ModelPart rimtop_skin3;
    private final ModelPart panel_skin3;
    private final ModelPart skelly3;
    private final ModelPart rib3;
    private final ModelPart rib_bolts_3;
    private final ModelPart foot3;
    private final ModelPart leg3;
    private final ModelPart thigh3;
    private final ModelPart floorpipes3;
    private final ModelPart front_rail3;
    private final ModelPart front_railbolt3;
    private final ModelPart rail_topbevel3;
    private final ModelPart rail_underbevel3;
    private final ModelPart rotor_gasket3;
    private final ModelPart floor_trim3;
    private final ModelPart side_004;
    private final ModelPart skin4;
    private final ModelPart floor_skin4;
    private final ModelPart floorboards4;
    private final ModelPart leg_skin4;
    private final ModelPart knee_skin4;
    private final ModelPart thigh_skin4;
    private final ModelPart belly_skin4;
    private final ModelPart rimtop_skin4;
    private final ModelPart panel_skin4;
    private final ModelPart skelly4;
    private final ModelPart rib4;
    private final ModelPart rib_bolts_4;
    private final ModelPart foot4;
    private final ModelPart leg4;
    private final ModelPart thigh4;
    private final ModelPart floorpipes4;
    private final ModelPart front_rail4;
    private final ModelPart front_railbolt4;
    private final ModelPart rail_topbevel4;
    private final ModelPart rail_underbevel4;
    private final ModelPart rotor_gasket4;
    private final ModelPart floor_trim4;
    private final ModelPart side_005;
    private final ModelPart skin5;
    private final ModelPart floor_skin5;
    private final ModelPart floorboards5;
    private final ModelPart leg_skin5;
    private final ModelPart knee_skin5;
    private final ModelPart thigh_skin5;
    private final ModelPart belly_skin5;
    private final ModelPart rimtop_skin5;
    private final ModelPart panel_skin5;
    private final ModelPart skelly5;
    private final ModelPart rib5;
    private final ModelPart rib_bolts_5;
    private final ModelPart foot5;
    private final ModelPart leg5;
    private final ModelPart thigh5;
    private final ModelPart floorpipes5;
    private final ModelPart front_rail5;
    private final ModelPart front_railbolt5;
    private final ModelPart rail_topbevel5;
    private final ModelPart rail_underbevel5;
    private final ModelPart rotor_gasket5;
    private final ModelPart floor_trim5;
    private final ModelPart side_006;
    private final ModelPart skin6;
    private final ModelPart floor_skin6;
    private final ModelPart floorboards6;
    private final ModelPart leg_skin6;
    private final ModelPart knee_skin6;
    private final ModelPart thigh_skin6;
    private final ModelPart belly_skin6;
    private final ModelPart rimtop_skin6;
    private final ModelPart panel_skin6;
    private final ModelPart skelly6;
    private final ModelPart rib6;
    private final ModelPart rib_bolts_6;
    private final ModelPart foot6;
    private final ModelPart leg6;
    private final ModelPart thigh6;
    private final ModelPart floorpipes6;
    private final ModelPart front_rail6;
    private final ModelPart front_railbolt6;
    private final ModelPart rail_topbevel6;
    private final ModelPart rail_underbevel6;
    private final ModelPart rotor_gasket6;
    private final ModelPart floor_trim6;

    public SteamConsoleModelFourteen(ModelPart root) {
        this.root = root;
        this.glow = root.getChild("glow");
        this.glow_meterglass_a1 = this.glow.getChild("glow_meterglass_a1");
        this.glow_lamp_a1 = this.glow.getChild("glow_lamp_a1");
        this.glow_lamp_a2 = this.glow.getChild("glow_lamp_a2");
        this.glow_glass_b1 = this.glow.getChild("glow_glass_b1");
        this.glow_glass_b2 = this.glow.getChild("glow_glass_b2");
        this.glow_lamp_c1 = this.glow.getChild("glow_lamp_c1");
        this.glow_lamp_c2 = this.glow.getChild("glow_lamp_c2");
        this.glow_panel_e = this.glow.getChild("glow_panel_e");
        this.glow_glass_e2 = this.glow_panel_e.getChild("glow_glass_e2");
        this.glow_glass_e3 = this.glow_panel_e.getChild("glow_glass_e3");
        this.glow_glass_e1 = this.glow_panel_e.getChild("glow_glass_e1");
        this.redlamp_e3 = this.glow_panel_e.getChild("redlamp_e3");
        this.redlamp_e4 = this.glow_panel_e.getChild("redlamp_e4");
        this.glow_core = this.glow.getChild("glow_core");
        this.glow_radio = this.glow.getChild("glow_radio");
        this.rotor = root.getChild("rotor");
        this.core = this.rotor.getChild("core");
        this.underbit_1 = this.core.getChild("underbit_1");
        this.underbit_2 = this.core.getChild("underbit_2");
        this.underbit_3 = this.core.getChild("underbit_3");
        this.spinner_slide_y = this.rotor.getChild("spinner_slide_y");
        this.hourflip_rotate_x = this.spinner_slide_y.getChild("hourflip_rotate_x");
        this.glass = this.hourflip_rotate_x.getChild("glass");
        this.center = this.hourflip_rotate_x.getChild("center");
        this.top_ring = this.hourflip_rotate_x.getChild("top_ring");
        this.under_ring = this.hourflip_rotate_x.getChild("under_ring");
        this.strut_1 = this.rotor.getChild("strut_1");
        this.strut_2 = this.rotor.getChild("strut_2");
        this.controls = root.getChild("controls");
        this.contolset_a = this.controls.getChild("contolset_a");
        this.door_switch = this.contolset_a.getChild("door_switch");
        this.door_crank_rotate_y = this.door_switch.getChild("door_crank_rotate_y");
        this.sonic_port = this.contolset_a.getChild("sonic_port");
        this.meter_a1 = this.contolset_a.getChild("meter_a1");
        this.needle_a1_rotate_y = this.meter_a1.getChild("needle_a1_rotate_y");
        this.button_set_a1 = this.contolset_a.getChild("button_set_a1");
        this.baseplate_a1 = this.contolset_a.getChild("baseplate_a1");
        this.baseplate_a2 = this.contolset_a.getChild("baseplate_a2");
        this.baseplate_a3 = this.contolset_a.getChild("baseplate_a3");
        this.controlset_b = this.controls.getChild("controlset_b");
        this.throttle = this.controlset_b.getChild("throttle");
        this.leaver_b1_rotate_z = this.throttle.getChild("leaver_b1_rotate_z");
        this.leaver_b1_jig = this.leaver_b1_rotate_z.getChild("leaver_b1_jig");
        this.x_switch = this.controlset_b.getChild("x_switch");
        this.y_switch = this.controlset_b.getChild("y_switch");
        this.z_switch = this.controlset_b.getChild("z_switch");
        this.cordselect_inc = this.controlset_b.getChild("cordselect_inc");
        this.cord_slider_slide_x = this.cordselect_inc.getChild("cord_slider_slide_x");
        this.nixietube_b1 = this.controlset_b.getChild("nixietube_b1");
        this.nixietube_b2 = this.controlset_b.getChild("nixietube_b2");
        this.baseplate_b1 = this.controlset_b.getChild("baseplate_b1");
        this.baseplate_b2 = this.controlset_b.getChild("baseplate_b2");
        this.baseplate_b3 = this.controlset_b.getChild("baseplate_b3");
        this.readout_b1 = this.baseplate_b3.getChild("readout_b1");
        this.baseplate_b4 = this.controlset_b.getChild("baseplate_b4");
        this.readout_b2 = this.baseplate_b4.getChild("readout_b2");
        this.controlset_c = this.controls.getChild("controlset_c");
        this.communications = this.controlset_c.getChild("communications");
        this.radio = this.communications.getChild("radio");
        this.radio_dial = this.radio.getChild("radio_dial");
        this.radio_dial_sub = this.radio_dial.getChild("radio_dial_sub");
        this.radio_needle = this.radio.getChild("radio_needle");
        this.speakers = this.radio.getChild("speakers");
        this.radio_body = this.radio.getChild("radio_body");
        this.radio_dial_base = this.radio.getChild("radio_dial_base");
        this.refuler = this.controlset_c.getChild("refuler");
        this.baseplate_c1 = this.controlset_c.getChild("baseplate_c1");
        this.baseplate_c2 = this.controlset_c.getChild("baseplate_c2");
        this.slider_c1 = this.controlset_c.getChild("slider_c1");
        this.sliderknob_c1_slide_x = this.slider_c1.getChild("sliderknob_c1_slide_x");
        this.slider_track_c1 = this.slider_c1.getChild("slider_track_c1");
        this.slider_c2 = this.controlset_c.getChild("slider_c2");
        this.sliderknob_c2_slide_x = this.slider_c2.getChild("sliderknob_c2_slide_x");
        this.slider_track_c2 = this.slider_c2.getChild("slider_track_c2");
        this.slider_c3 = this.controlset_c.getChild("slider_c3");
        this.sliderknob_c3_slide_x = this.slider_c3.getChild("sliderknob_c3_slide_x");
        this.slider_track_c3 = this.slider_c3.getChild("slider_track_c3");
        this.switch_c1 = this.controlset_c.getChild("switch_c1");
        this.toggle_c1 = this.switch_c1.getChild("toggle_c1");
        this.switch_c2 = this.controlset_c.getChild("switch_c2");
        this.toggle_c2 = this.switch_c2.getChild("toggle_c2");
        this.switch_c3 = this.controlset_c.getChild("switch_c3");
        this.toggle_c3 = this.switch_c3.getChild("toggle_c3");
        this.switch_c4 = this.controlset_c.getChild("switch_c4");
        this.toggle_c4 = this.switch_c4.getChild("toggle_c4");
        this.controlset_d = this.controls.getChild("controlset_d");
        this.waypoint_selector = this.controlset_d.getChild("waypoint_selector");
        this.type_arm_rotate_x = this.waypoint_selector.getChild("type_arm_rotate_x");
        this.keys = this.waypoint_selector.getChild("keys");
        this.type_body = this.waypoint_selector.getChild("type_body");
        this.tumbler = this.waypoint_selector.getChild("tumbler");
        this.dimention_selector = this.controlset_d.getChild("dimention_selector");
        this.tilt_d1 = this.dimention_selector.getChild("tilt_d1");
        this.baseplate_d1 = this.controlset_d.getChild("baseplate_d1");
        this.baseplate_d2 = this.controlset_d.getChild("baseplate_d2");
        this.baseplate_d3 = this.controlset_d.getChild("baseplate_d3");
        this.controlset_e = this.controls.getChild("controlset_e");
        this.telepathic_circuits = this.controlset_e.getChild("telepathic_circuits");
        this.talking_board = this.telepathic_circuits.getChild("talking_board");
        this.talkingboard_text = this.talking_board.getChild("talkingboard_text");
        this.talkingboard_corners = this.talking_board.getChild("talkingboard_corners");
        this.scrying_glass = this.telepathic_circuits.getChild("scrying_glass");
        this.frame = this.scrying_glass.getChild("frame");
        this.scrying_glass_frame_e1 = this.frame.getChild("scrying_glass_frame_e1");
        this.scrying_glass_frame_e3 = this.frame.getChild("scrying_glass_frame_e3");
        this.scrying_glass_frame_e2 = this.frame.getChild("scrying_glass_frame_e2");
        this.post_e1 = this.scrying_glass.getChild("post_e1");
        this.nixietube_e1 = this.controlset_e.getChild("nixietube_e1");
        this.nixietube_e2 = this.controlset_e.getChild("nixietube_e2");
        this.nixietube_e3 = this.controlset_e.getChild("nixietube_e3");
        this.baseplate_e1 = this.controlset_e.getChild("baseplate_e1");
        this.baseplate_e2 = this.controlset_e.getChild("baseplate_e2");
        this.switch_e1 = this.controlset_e.getChild("switch_e1");
        this.toggle_e1 = this.switch_e1.getChild("toggle_e1");
        this.switch_e2 = this.controlset_e.getChild("switch_e2");
        this.toggle_e2 = this.switch_e2.getChild("toggle_e2");
        this.controlset_f = this.controls.getChild("controlset_f");
        this.baseplate_f1 = this.controlset_f.getChild("baseplate_f1");
        this.switch_f1 = this.baseplate_f1.getChild("switch_f1");
        this.toggle_f1 = this.switch_f1.getChild("toggle_f1");
        this.switch_f2 = this.baseplate_f1.getChild("switch_f2");
        this.toggle_f2 = this.switch_f2.getChild("toggle_f2");
        this.switch_f3 = this.baseplate_f1.getChild("switch_f3");
        this.toggle_f3 = this.switch_f3.getChild("toggle_f3");
        this.switch_f4 = this.baseplate_f1.getChild("switch_f4");
        this.toggle_f4 = this.switch_f4.getChild("toggle_f4");
        this.switch_f5 = this.baseplate_f1.getChild("switch_f5");
        this.toggle_f5 = this.switch_f5.getChild("toggle_f5");
        this.switch_f6 = this.baseplate_f1.getChild("switch_f6");
        this.toggle_f6 = this.switch_f6.getChild("toggle_f6");
        this.handbreak = this.controlset_f.getChild("handbreak");
        this.lever_f1_rotate_z = this.handbreak.getChild("lever_f1_rotate_z");
        this.barrel = this.handbreak.getChild("barrel");
        this.randomize_cords = this.controlset_f.getChild("randomize_cords");
        this.globe_rotate_y = this.randomize_cords.getChild("globe_rotate_y");
        this.globe_mount = this.randomize_cords.getChild("globe_mount");
        this.rotation_selector = this.controlset_f.getChild("rotation_selector");
        this.rotation_crank_rotate_y = this.rotation_selector.getChild("rotation_crank_rotate_y");
        this.structure = root.getChild("structure");
        this.side_001 = this.structure.getChild("side_001");
        this.skin = this.side_001.getChild("skin");
        this.floor_skin = this.skin.getChild("floor_skin");
        this.floorboards = this.floor_skin.getChild("floorboards");
        this.leg_skin = this.floor_skin.getChild("leg_skin");
        this.knee_skin = this.leg_skin.getChild("knee_skin");
        this.thigh_skin = this.knee_skin.getChild("thigh_skin");
        this.belly_skin = this.thigh_skin.getChild("belly_skin");
        this.rimtop_skin = this.belly_skin.getChild("rimtop_skin");
        this.panel_skin = this.rimtop_skin.getChild("panel_skin");
        this.skelly = this.side_001.getChild("skelly");
        this.rib = this.skelly.getChild("rib");
        this.rib_bolts_1 = this.rib.getChild("rib_bolts_1");
        this.foot = this.skelly.getChild("foot");
        this.leg = this.foot.getChild("leg");
        this.thigh = this.foot.getChild("thigh");
        this.floorpipes = this.side_001.getChild("floorpipes");
        this.front_rail = this.side_001.getChild("front_rail");
        this.front_railbolt = this.front_rail.getChild("front_railbolt");
        this.rail_topbevel = this.front_rail.getChild("rail_topbevel");
        this.rail_underbevel = this.front_rail.getChild("rail_underbevel");
        this.rotor_gasket = this.side_001.getChild("rotor_gasket");
        this.floor_trim = this.side_001.getChild("floor_trim");
        this.side_002 = this.structure.getChild("side_002");
        this.skin2 = this.side_002.getChild("skin2");
        this.floor_skin2 = this.skin2.getChild("floor_skin2");
        this.floorboards2 = this.floor_skin2.getChild("floorboards2");
        this.leg_skin2 = this.floor_skin2.getChild("leg_skin2");
        this.knee_skin2 = this.leg_skin2.getChild("knee_skin2");
        this.thigh_skin2 = this.knee_skin2.getChild("thigh_skin2");
        this.belly_skin2 = this.thigh_skin2.getChild("belly_skin2");
        this.rimtop_skin2 = this.belly_skin2.getChild("rimtop_skin2");
        this.panel_skin2 = this.rimtop_skin2.getChild("panel_skin2");
        this.skelly2 = this.side_002.getChild("skelly2");
        this.rib2 = this.skelly2.getChild("rib2");
        this.rib_bolts_2 = this.rib2.getChild("rib_bolts_2");
        this.foot2 = this.skelly2.getChild("foot2");
        this.leg2 = this.foot2.getChild("leg2");
        this.thigh2 = this.foot2.getChild("thigh2");
        this.floorpipes2 = this.side_002.getChild("floorpipes2");
        this.front_rail2 = this.side_002.getChild("front_rail2");
        this.front_railbolt2 = this.front_rail2.getChild("front_railbolt2");
        this.rail_topbevel2 = this.front_rail2.getChild("rail_topbevel2");
        this.rail_underbevel2 = this.front_rail2.getChild("rail_underbevel2");
        this.rotor_gasket2 = this.side_002.getChild("rotor_gasket2");
        this.floor_trim2 = this.side_002.getChild("floor_trim2");
        this.side_003 = this.structure.getChild("side_003");
        this.skin3 = this.side_003.getChild("skin3");
        this.floor_skin3 = this.skin3.getChild("floor_skin3");
        this.floorboards3 = this.floor_skin3.getChild("floorboards3");
        this.leg_skin3 = this.floor_skin3.getChild("leg_skin3");
        this.knee_skin3 = this.leg_skin3.getChild("knee_skin3");
        this.thigh_skin3 = this.knee_skin3.getChild("thigh_skin3");
        this.belly_skin3 = this.thigh_skin3.getChild("belly_skin3");
        this.rimtop_skin3 = this.belly_skin3.getChild("rimtop_skin3");
        this.panel_skin3 = this.rimtop_skin3.getChild("panel_skin3");
        this.skelly3 = this.side_003.getChild("skelly3");
        this.rib3 = this.skelly3.getChild("rib3");
        this.rib_bolts_3 = this.rib3.getChild("rib_bolts_3");
        this.foot3 = this.skelly3.getChild("foot3");
        this.leg3 = this.foot3.getChild("leg3");
        this.thigh3 = this.foot3.getChild("thigh3");
        this.floorpipes3 = this.side_003.getChild("floorpipes3");
        this.front_rail3 = this.side_003.getChild("front_rail3");
        this.front_railbolt3 = this.front_rail3.getChild("front_railbolt3");
        this.rail_topbevel3 = this.front_rail3.getChild("rail_topbevel3");
        this.rail_underbevel3 = this.front_rail3.getChild("rail_underbevel3");
        this.rotor_gasket3 = this.side_003.getChild("rotor_gasket3");
        this.floor_trim3 = this.side_003.getChild("floor_trim3");
        this.side_004 = this.structure.getChild("side_004");
        this.skin4 = this.side_004.getChild("skin4");
        this.floor_skin4 = this.skin4.getChild("floor_skin4");
        this.floorboards4 = this.floor_skin4.getChild("floorboards4");
        this.leg_skin4 = this.floor_skin4.getChild("leg_skin4");
        this.knee_skin4 = this.leg_skin4.getChild("knee_skin4");
        this.thigh_skin4 = this.knee_skin4.getChild("thigh_skin4");
        this.belly_skin4 = this.thigh_skin4.getChild("belly_skin4");
        this.rimtop_skin4 = this.belly_skin4.getChild("rimtop_skin4");
        this.panel_skin4 = this.rimtop_skin4.getChild("panel_skin4");
        this.skelly4 = this.side_004.getChild("skelly4");
        this.rib4 = this.skelly4.getChild("rib4");
        this.rib_bolts_4 = this.rib4.getChild("rib_bolts_4");
        this.foot4 = this.skelly4.getChild("foot4");
        this.leg4 = this.foot4.getChild("leg4");
        this.thigh4 = this.foot4.getChild("thigh4");
        this.floorpipes4 = this.side_004.getChild("floorpipes4");
        this.front_rail4 = this.side_004.getChild("front_rail4");
        this.front_railbolt4 = this.front_rail4.getChild("front_railbolt4");
        this.rail_topbevel4 = this.front_rail4.getChild("rail_topbevel4");
        this.rail_underbevel4 = this.front_rail4.getChild("rail_underbevel4");
        this.rotor_gasket4 = this.side_004.getChild("rotor_gasket4");
        this.floor_trim4 = this.side_004.getChild("floor_trim4");
        this.side_005 = this.structure.getChild("side_005");
        this.skin5 = this.side_005.getChild("skin5");
        this.floor_skin5 = this.skin5.getChild("floor_skin5");
        this.floorboards5 = this.floor_skin5.getChild("floorboards5");
        this.leg_skin5 = this.floor_skin5.getChild("leg_skin5");
        this.knee_skin5 = this.leg_skin5.getChild("knee_skin5");
        this.thigh_skin5 = this.knee_skin5.getChild("thigh_skin5");
        this.belly_skin5 = this.thigh_skin5.getChild("belly_skin5");
        this.rimtop_skin5 = this.belly_skin5.getChild("rimtop_skin5");
        this.panel_skin5 = this.rimtop_skin5.getChild("panel_skin5");
        this.skelly5 = this.side_005.getChild("skelly5");
        this.rib5 = this.skelly5.getChild("rib5");
        this.rib_bolts_5 = this.rib5.getChild("rib_bolts_5");
        this.foot5 = this.skelly5.getChild("foot5");
        this.leg5 = this.foot5.getChild("leg5");
        this.thigh5 = this.foot5.getChild("thigh5");
        this.floorpipes5 = this.side_005.getChild("floorpipes5");
        this.front_rail5 = this.side_005.getChild("front_rail5");
        this.front_railbolt5 = this.front_rail5.getChild("front_railbolt5");
        this.rail_topbevel5 = this.front_rail5.getChild("rail_topbevel5");
        this.rail_underbevel5 = this.front_rail5.getChild("rail_underbevel5");
        this.rotor_gasket5 = this.side_005.getChild("rotor_gasket5");
        this.floor_trim5 = this.side_005.getChild("floor_trim5");
        this.side_006 = this.structure.getChild("side_006");
        this.skin6 = this.side_006.getChild("skin6");
        this.floor_skin6 = this.skin6.getChild("floor_skin6");
        this.floorboards6 = this.floor_skin6.getChild("floorboards6");
        this.leg_skin6 = this.floor_skin6.getChild("leg_skin6");
        this.knee_skin6 = this.leg_skin6.getChild("knee_skin6");
        this.thigh_skin6 = this.knee_skin6.getChild("thigh_skin6");
        this.belly_skin6 = this.thigh_skin6.getChild("belly_skin6");
        this.rimtop_skin6 = this.belly_skin6.getChild("rimtop_skin6");
        this.panel_skin6 = this.rimtop_skin6.getChild("panel_skin6");
        this.skelly6 = this.side_006.getChild("skelly6");
        this.rib6 = this.skelly6.getChild("rib6");
        this.rib_bolts_6 = this.rib6.getChild("rib_bolts_6");
        this.foot6 = this.skelly6.getChild("foot6");
        this.leg6 = this.foot6.getChild("leg6");
        this.thigh6 = this.foot6.getChild("thigh6");
        this.floorpipes6 = this.side_006.getChild("floorpipes6");
        this.front_rail6 = this.side_006.getChild("front_rail6");
        this.front_railbolt6 = this.front_rail6.getChild("front_railbolt6");
        this.rail_topbevel6 = this.front_rail6.getChild("rail_topbevel6");
        this.rail_underbevel6 = this.front_rail6.getChild("rail_underbevel6");
        this.rotor_gasket6 = this.side_006.getChild("rotor_gasket6");
        this.floor_trim6 = this.side_006.getChild("floor_trim6");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition glow = partdefinition.addOrReplaceChild("glow", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition glow_meterglass_a1 = glow.addOrReplaceChild("glow_meterglass_a1", CubeListBuilder.create().texOffs(426, 330).addBox(-3.0F, -2.4F, -2.6F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -58.0F, 26.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition glow_lamp_a1 = glow.addOrReplaceChild("glow_lamp_a1", CubeListBuilder.create().texOffs(490, 450).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -58.8F, 38.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition glow_lamp_a2 = glow.addOrReplaceChild("glow_lamp_a2", CubeListBuilder.create().texOffs(490, 450).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.0F, -59.0F, 37.0F, -0.3491F, 0.0F, 0.0F));

        PartDefinition glow_glass_b1 = glow.addOrReplaceChild("glow_glass_b1", CubeListBuilder.create().texOffs(240, 460).addBox(-0.0667F, 1.6F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-0.6667F, -2.4F, -0.9333F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-0.0667F, -3.4F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0667F, -64.0F, 14.5333F, -0.0873F, -0.5236F, 0.1745F));

        PartDefinition glow_glass_b2 = glow.addOrReplaceChild("glow_glass_b2", CubeListBuilder.create().texOffs(240, 460).addBox(-0.4667F, 2.0F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-1.0667F, -2.0F, -0.9333F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-0.4667F, -3.0F, -0.5333F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(22.0667F, -64.0F, 6.9333F, 0.1745F, -2.0944F, 0.0F));

        PartDefinition glow_lamp_c1 = glow.addOrReplaceChild("glow_lamp_c1", CubeListBuilder.create().texOffs(280, 420).addBox(-2.6F, -3.8F, -2.2F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-1.6F, -3.8F, -3.2F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-1.6F, -3.8F, -0.2F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-1.6F, -4.8F, -2.2F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(0.2F, -3.8F, -2.2F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(40.0F, -60.4F, -9.8F, 0.2618F, -1.0472F, 0.0F));

        PartDefinition glow_lamp_c2 = glow.addOrReplaceChild("glow_lamp_c2", CubeListBuilder.create().texOffs(280, 420).addBox(0.6F, -3.8F, -1.8F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-1.4F, -3.8F, -2.8F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-1.4F, -3.8F, 0.2F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-1.4F, -4.8F, -1.8F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(280, 420).addBox(-2.4F, -3.8F, -1.8F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(29.0F, -60.4F, -29.0F, 0.2618F, -1.0472F, 0.0F));

        PartDefinition glow_panel_e = glow.addOrReplaceChild("glow_panel_e", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition glow_glass_e2 = glow_panel_e.addOrReplaceChild("glow_glass_e2", CubeListBuilder.create().texOffs(240, 460).addBox(-57.8F, -5.2F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-58.4F, -9.2F, -4.4F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-57.8F, -10.2F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition glow_glass_e3 = glow_panel_e.addOrReplaceChild("glow_glass_e3", CubeListBuilder.create().texOffs(240, 460).addBox(-55.4F, -5.2F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-56.0F, -9.2F, 1.2F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-55.4F, -10.2F, 1.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition glow_glass_e1 = glow_panel_e.addOrReplaceChild("glow_glass_e1", CubeListBuilder.create().texOffs(240, 460).addBox(-57.8F, -5.2F, 6.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-58.4F, -9.2F, 6.4F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(240, 460).addBox(-57.8F, -10.2F, 6.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition redlamp_e3 = glow_panel_e.addOrReplaceChild("redlamp_e3", CubeListBuilder.create().texOffs(390, 440).addBox(-2.0F, 1.6F, -1.8F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-52.0F, -54.0F, -19.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition redlamp_e4 = glow_panel_e.addOrReplaceChild("redlamp_e4", CubeListBuilder.create().texOffs(390, 440).addBox(-2.0F, 1.6F, 35.2F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-52.0F, -54.0F, -19.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition glow_core = glow.addOrReplaceChild("glow_core", CubeListBuilder.create().texOffs(266, 327).addBox(-16.4F, -54.0F, -12.0F, 32.0F, 16.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

        PartDefinition glow_radio = glow.addOrReplaceChild("glow_radio", CubeListBuilder.create().texOffs(420, 340).addBox(-1.0F, -2.8F, -8.52F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.4F, -58.0F, -14.0F, -0.1047F, 0.5236F, -0.2094F));

        PartDefinition rotor = partdefinition.addOrReplaceChild("rotor", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition core = rotor.addOrReplaceChild("core", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition underbit_1 = core.addOrReplaceChild("underbit_1", CubeListBuilder.create().texOffs(80, 83).addBox(-20.4F, -9.0F, -12.0F, 40.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition underbit_2 = core.addOrReplaceChild("underbit_2", CubeListBuilder.create().texOffs(80, 83).addBox(-20.4F, -10.0F, -12.0F, 40.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition underbit_3 = core.addOrReplaceChild("underbit_3", CubeListBuilder.create().texOffs(80, 83).addBox(-20.4F, -10.4F, -12.0F, 40.0F, 4.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition spinner_slide_y = rotor.addOrReplaceChild("spinner_slide_y", CubeListBuilder.create(), PartPose.offset(0.0F, -97.4F, 0.0F));

        PartDefinition hourflip_rotate_x = spinner_slide_y.addOrReplaceChild("hourflip_rotate_x", CubeListBuilder.create(), PartPose.offset(0.0F, 0.15F, -0.25F));

        PartDefinition glass = hourflip_rotate_x.addOrReplaceChild("glass", CubeListBuilder.create().texOffs(296, 280).addBox(-6.0F, -119.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(295, 330).addBox(-4.0F, -109.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(295, 330).addBox(-3.0F, -107.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(295, 330).addBox(-2.0F, -104.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(295, 330).addBox(-3.0F, -100.0F, -3.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(295, 330).addBox(-4.0F, -98.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(291, 362).addBox(-6.0F, -96.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 101.25F, 0.25F));

        PartDefinition center = hourflip_rotate_x.addOrReplaceChild("center", CubeListBuilder.create().texOffs(377, 108).addBox(6.25F, -111.575F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 86).addBox(6.25F, -100.6F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(302, 78).addBox(6.0F, -102.6F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(348, 78).addBox(-7.25F, -111.6F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(317, 77).addBox(-7.25F, -100.6F, -1.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(302, 78).addBox(-12.0F, -102.6F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(140, 420).addBox(7.4F, -103.6F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(140, 420).addBox(-9.4F, -103.6F, -2.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 101.25F, 0.25F));

        PartDefinition top_ring = hourflip_rotate_x.addOrReplaceChild("top_ring", CubeListBuilder.create().texOffs(303, 170).addBox(-7.0F, -118.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(303, 84).addBox(6.0F, -112.2F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(318, 79).addBox(-7.0F, -112.2F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(331, 81).addBox(-6.0F, -112.2F, 6.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(306, 78).addBox(-6.0F, -112.2F, -7.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 101.25F, 0.25F));

        PartDefinition under_ring = hourflip_rotate_x.addOrReplaceChild("under_ring", CubeListBuilder.create().texOffs(306, 176).addBox(-7.0F, -87.0F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(351, 98).addBox(6.0F, -92.8F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(346, 78).addBox(-7.0F, -92.8F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(359, 90).addBox(-6.0F, -92.8F, 6.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(334, 89).addBox(-6.0F, -92.8F, -7.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 101.25F, 0.25F));

        PartDefinition strut_1 = rotor.addOrReplaceChild("strut_1", CubeListBuilder.create().texOffs(306, 37).addBox(-9.5F, -104.0F, -4.0F, 2.0F, 50.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(306, 37).addBox(-9.5F, -104.0F, 2.0F, 2.0F, 50.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(304, 43).addBox(-9.5F, -106.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

        PartDefinition strut_2 = rotor.addOrReplaceChild("strut_2", CubeListBuilder.create().texOffs(304, 44).addBox(7.5F, -104.0F, -4.0F, 2.0F, 50.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(304, 44).addBox(7.5F, -104.0F, 2.0F, 2.0F, 50.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(299, 46).addBox(7.5F, -106.0F, -4.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 4.0F, 0.0F));

        PartDefinition controls = partdefinition.addOrReplaceChild("controls", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

        PartDefinition contolset_a = controls.addOrReplaceChild("contolset_a", CubeListBuilder.create(), PartPose.offsetAndRotation(50.0F, -50.0F, 14.0F, 0.0F, 0.0F, -2.7925F));

        PartDefinition door_switch = contolset_a.addOrReplaceChild("door_switch", CubeListBuilder.create().texOffs(379, 60).addBox(-2.0F, -2.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition door_crank_rotate_y = door_switch.addOrReplaceChild("door_crank_rotate_y", CubeListBuilder.create().texOffs(149, 423).addBox(-1.0F, -7.1F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-1.0F, -2.1F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-1.0F, -2.1F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.0F, -2.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(1.0F, -2.1F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.0F, -2.1F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-5.0F, -2.1F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.0F, -2.1F, 3.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.0F, -2.1F, -5.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(86, 427).addBox(3.0F, -0.1F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.1F, 4.0F));

        PartDefinition sonic_port = contolset_a.addOrReplaceChild("sonic_port", CubeListBuilder.create().texOffs(379, 60).addBox(4.0F, -2.0F, -18.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(4.0F, -2.0F, -12.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(78, 441).addBox(6.0F, -3.0F, -16.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(10.0F, -2.0F, -16.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(4.0F, -2.0F, -16.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(2.0F, -3.0F, -16.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(12.0F, -3.0F, -16.0F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(6.0F, -3.0F, -10.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(6.0F, -3.0F, -20.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition meter_a1 = contolset_a.addOrReplaceChild("meter_a1", CubeListBuilder.create().texOffs(69, 431).addBox(21.0F, -19.3333F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.3333F, -14.0F));

        PartDefinition needle_a1_rotate_y = meter_a1.addOrReplaceChild("needle_a1_rotate_y", CubeListBuilder.create().texOffs(82, 433).addBox(-0.2F, -2.0F, -0.5F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.2F, -15.3333F, -0.1F, 0.0F, 0.5236F, 0.0F));

        PartDefinition button_set_a1 = contolset_a.addOrReplaceChild("button_set_a1", CubeListBuilder.create().texOffs(70, 420).addBox(17.0F, -3.0F, -19.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(17.0F, -3.0F, -11.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(17.0F, -3.0F, -15.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition baseplate_a1 = contolset_a.addOrReplaceChild("baseplate_a1", CubeListBuilder.create().texOffs(379, 60).addBox(30.0F, -4.0F, -20.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(18.0F, -4.0F, -22.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(16.0F, -4.0F, -20.0F, 2.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition baseplate_a2 = contolset_a.addOrReplaceChild("baseplate_a2", CubeListBuilder.create().texOffs(379, 60).addBox(-13.0F, 0.0F, 8.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(24.0F, -2.0F, -14.0F));

        PartDefinition baseplate_a3 = contolset_a.addOrReplaceChild("baseplate_a3", CubeListBuilder.create().texOffs(379, 60).addBox(-13.0F, 0.0F, -14.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-25.0F, -1.0F, -12.0F, 12.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-25.0F, -1.0F, -32.0F, 2.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(276, 93).addBox(-26.0F, -4.0F, -13.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(24.0F, -2.0F, -14.0F));

        PartDefinition controlset_b = controls.addOrReplaceChild("controlset_b", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition throttle = controlset_b.addOrReplaceChild("throttle", CubeListBuilder.create().texOffs(379, 60).addBox(-10.0F, 10.0F, 10.0F, 16.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(139, 427).addBox(-8.0F, 6.0F, 11.0F, 13.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(489, 415).addBox(-5.0F, 5.0F, 13.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(400, 411).addBox(1.0F, 5.0F, 13.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(450, 422).addBox(-2.0F, 5.0F, 13.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-0.8F, 11.6F, 18.0F, 2.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(52.0F, -62.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

        PartDefinition leaver_b1_rotate_z = throttle.addOrReplaceChild("leaver_b1_rotate_z", CubeListBuilder.create().texOffs(379, 60).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.0F, -6.0F, 3.0F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(145, 426).addBox(0.0F, -11.0F, -1.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.0F, -10.6F, 7.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 8.0F, 14.0F, 0.0F, 0.0F, 0.5236F));

        PartDefinition leaver_b1_jig = leaver_b1_rotate_z.addOrReplaceChild("leaver_b1_jig", CubeListBuilder.create().texOffs(379, 60).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -6.0F, 4.5F, -1.1345F, 0.0F, 0.0F));

        PartDefinition x_switch = controlset_b.addOrReplaceChild("x_switch", CubeListBuilder.create().texOffs(87, 436).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, -58.0F, -5.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition y_switch = controlset_b.addOrReplaceChild("y_switch", CubeListBuilder.create().texOffs(86, 436).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(363, 59).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, -58.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition z_switch = controlset_b.addOrReplaceChild("z_switch", CubeListBuilder.create().texOffs(95, 437).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.0F, -58.0F, 5.0F, 0.0F, 0.0F, 0.7854F));

        PartDefinition cordselect_inc = controlset_b.addOrReplaceChild("cordselect_inc", CubeListBuilder.create().texOffs(83, 431).addBox(11.0F, 2.0F, -12.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(11.0F, 2.0F, -14.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(11.0F, 2.0F, -11.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(19.0F, 2.0F, -14.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(9.0F, 2.0F, -14.0F, 2.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, -58.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition cord_slider_slide_x = cordselect_inc.addOrReplaceChild("cord_slider_slide_x", CubeListBuilder.create().texOffs(155, 438).addBox(18.0F, 1.0F, -13.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition nixietube_b1 = controlset_b.addOrReplaceChild("nixietube_b1", CubeListBuilder.create().texOffs(77, 428).addBox(-13.0F, -3.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition nixietube_b2 = controlset_b.addOrReplaceChild("nixietube_b2", CubeListBuilder.create().texOffs(78, 435).addBox(-13.0F, -3.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition baseplate_b1 = controlset_b.addOrReplaceChild("baseplate_b1", CubeListBuilder.create().texOffs(379, 60).addBox(-5.0F, 1.0F, -8.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-5.0F, 1.0F, 10.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 1.0F, -6.0F, 8.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, -58.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition baseplate_b2 = controlset_b.addOrReplaceChild("baseplate_b2", CubeListBuilder.create().texOffs(379, 60).addBox(-12.6F, 1.0F, -1.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-14.0F, 1.0F, -5.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-14.0F, 1.0F, 4.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, -58.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition baseplate_b3 = controlset_b.addOrReplaceChild("baseplate_b3", CubeListBuilder.create().texOffs(379, 60).addBox(7.0F, 2.0F, -3.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(7.0F, 1.0F, -4.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(7.0F, 1.0F, 7.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(8.0F, 2.0F, 8.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(8.0F, 2.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(34.0F, -58.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition readout_b1 = baseplate_b3.addOrReplaceChild("readout_b1", CubeListBuilder.create().texOffs(73, 435).addBox(-1.0F, -0.8F, -5.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(214, 438).addBox(-0.6F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(214, 438).addBox(-0.6F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(214, 438).addBox(-0.6F, -1.0F, -0.52F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition baseplate_b4 = controlset_b.addOrReplaceChild("baseplate_b4", CubeListBuilder.create().texOffs(379, 60).addBox(7.0F, 2.0F, -3.0F, 5.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(7.0F, 1.0F, -4.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(7.0F, 1.0F, 7.0F, 5.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(8.0F, 2.0F, 8.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(8.0F, 2.0F, -5.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(40.0F, -56.0F, -2.0F, 0.0F, 0.0F, 0.2618F));

        PartDefinition readout_b2 = baseplate_b4.addOrReplaceChild("readout_b2", CubeListBuilder.create().texOffs(75, 440).addBox(-1.0F, -0.8F, -5.0F, 4.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(208, 435).addBox(-0.6F, -1.0F, -5.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(208, 435).addBox(-0.6F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(208, 435).addBox(-0.6F, -1.0F, -0.52F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, 2.0F, 2.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition controlset_c = controls.addOrReplaceChild("controlset_c", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition communications = controlset_c.addOrReplaceChild("communications", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition radio = communications.addOrReplaceChild("radio", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, -64.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition radio_dial = radio.addOrReplaceChild("radio_dial", CubeListBuilder.create().texOffs(78, 430).addBox(-7.0F, -3.2F, -14.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(78, 430).addBox(-8.0F, -2.2F, -15.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, 15.0F, 13.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition radio_dial_sub = radio_dial.addOrReplaceChild("radio_dial_sub", CubeListBuilder.create().texOffs(78, 430).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0F, -3.0F, -13.0F, 0.0F, -0.7854F, 0.0F));

        PartDefinition radio_needle = radio.addOrReplaceChild("radio_needle", CubeListBuilder.create().texOffs(391, 411).addBox(-2.0F, 5.0F, -7.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition speakers = radio.addOrReplaceChild("speakers", CubeListBuilder.create().texOffs(77, 431).addBox(-2.6F, -4.0F, -2.0F, 8.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, -7.0F, -2.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, 0.0F, -5.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, -7.0F, -5.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, -7.0F, 3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, -4.0F, 3.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, 0.0F, 3.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(77, 431).addBox(-2.6F, -4.0F, -5.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition radio_body = radio.addOrReplaceChild("radio_body", CubeListBuilder.create().texOffs(161, 329).addBox(-5.0F, -3.0F, -10.0F, 10.0F, 12.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(161, 329).addBox(-5.0F, -7.0F, -8.0F, 10.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(161, 329).addBox(-5.0F, -9.0F, -6.0F, 10.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(71, 430).addBox(-2.2F, 6.0F, -7.6F, 8.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition radio_dial_base = radio.addOrReplaceChild("radio_dial_base", CubeListBuilder.create().texOffs(379, 60).addBox(-9.0F, -1.0F, -6.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, 15.0F, 3.0F, 0.0F, 0.0F, 0.6109F));

        PartDefinition refuler = controlset_c.addOrReplaceChild("refuler", CubeListBuilder.create().texOffs(390, 410).addBox(6.0F, 2.0F, -3.0F, 2.0F, 4.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(5.0F, 4.0F, -4.0F, 4.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(47.0F, -55.0F, -19.0F));

        PartDefinition baseplate_c1 = controlset_c.addOrReplaceChild("baseplate_c1", CubeListBuilder.create().texOffs(379, 60).addBox(-3.0F, -3.5F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(84, 431).addBox(-2.6F, -4.5F, -3.1F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(38.0F, -52.5F, -10.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition baseplate_c2 = controlset_c.addOrReplaceChild("baseplate_c2", CubeListBuilder.create().texOffs(379, 60).addBox(-3.0F, -3.5F, -3.5F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(85, 440).addBox(-2.6F, -4.5F, -3.1F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(38.0F, -52.5F, 11.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition slider_c1 = controlset_c.addOrReplaceChild("slider_c1", CubeListBuilder.create(), PartPose.offsetAndRotation(50.0F, -52.5F, -2.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition sliderknob_c1_slide_x = slider_c1.addOrReplaceChild("sliderknob_c1_slide_x", CubeListBuilder.create().texOffs(214, 105).addBox(1.0F, -0.5F, -2.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(1.4F, -0.9F, -3.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition slider_track_c1 = slider_c1.addOrReplaceChild("slider_track_c1", CubeListBuilder.create().texOffs(379, 60).addBox(-7.0F, 0.5F, -3.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 0.5F, -1.7F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 0.5F, -3.7F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(78, 431).addBox(-6.0F, 1.5F, -2.7F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.0F, 0.5F, -3.7F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition slider_c2 = controlset_c.addOrReplaceChild("slider_c2", CubeListBuilder.create(), PartPose.offsetAndRotation(50.0F, -52.5F, -2.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition sliderknob_c2_slide_x = slider_c2.addOrReplaceChild("sliderknob_c2_slide_x", CubeListBuilder.create().texOffs(203, 98).addBox(1.0F, -0.5F, 2.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(1.4F, -0.9F, 1.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition slider_track_c2 = slider_c2.addOrReplaceChild("slider_track_c2", CubeListBuilder.create().texOffs(379, 60).addBox(-7.0F, 0.5F, 1.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 0.5F, 3.1F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 0.5F, 1.1F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(79, 431).addBox(-6.0F, 1.5F, 2.1F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.0F, 0.5F, 1.1F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition slider_c3 = controlset_c.addOrReplaceChild("slider_c3", CubeListBuilder.create(), PartPose.offsetAndRotation(50.0F, -52.5F, -2.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition sliderknob_c3_slide_x = slider_c3.addOrReplaceChild("sliderknob_c3_slide_x", CubeListBuilder.create().texOffs(208, 106).addBox(1.0F, -0.5F, 6.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(1.4F, -0.9F, 5.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition slider_track_c3 = slider_c3.addOrReplaceChild("slider_track_c3", CubeListBuilder.create().texOffs(379, 60).addBox(-7.0F, 0.5F, 5.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 0.5F, 7.9F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.0F, 0.5F, 5.9F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(73, 443).addBox(-6.0F, 1.5F, 6.9F, 9.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.0F, 0.5F, 5.9F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition switch_c1 = controlset_c.addOrReplaceChild("switch_c1", CubeListBuilder.create().texOffs(379, 60).addBox(0.0F, 0.5F, 11.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(50.0F, -52.5F, -2.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition toggle_c1 = switch_c1.addOrReplaceChild("toggle_c1", CubeListBuilder.create().texOffs(400, 300).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.7F, 12.8F, 0.0F, 0.0F, -0.6109F));

        PartDefinition switch_c2 = controlset_c.addOrReplaceChild("switch_c2", CubeListBuilder.create().texOffs(379, 60).addBox(0.0F, 0.5F, 11.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(50.0F, -52.5F, 1.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition toggle_c2 = switch_c2.addOrReplaceChild("toggle_c2", CubeListBuilder.create().texOffs(400, 300).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.7F, 12.8F, 0.0F, 0.0F, -0.6109F));

        PartDefinition switch_c3 = controlset_c.addOrReplaceChild("switch_c3", CubeListBuilder.create().texOffs(379, 60).addBox(0.0F, 0.5F, 11.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(50.0F, -52.5F, 5.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition toggle_c3 = switch_c3.addOrReplaceChild("toggle_c3", CubeListBuilder.create().texOffs(400, 300).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.7F, 12.8F, 0.0F, 0.0F, -0.6109F));

        PartDefinition switch_c4 = controlset_c.addOrReplaceChild("switch_c4", CubeListBuilder.create().texOffs(379, 60).addBox(0.0F, 0.5F, 11.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(50.0F, -52.5F, 9.5F, 0.0F, 0.0F, 0.3491F));

        PartDefinition toggle_c4 = switch_c4.addOrReplaceChild("toggle_c4", CubeListBuilder.create().texOffs(400, 300).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7F, 0.7F, 12.8F, 0.0F, 0.0F, -0.6109F));

        PartDefinition controlset_d = controls.addOrReplaceChild("controlset_d", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition waypoint_selector = controlset_d.addOrReplaceChild("waypoint_selector", CubeListBuilder.create(), PartPose.offsetAndRotation(-38.0F, -53.0F, 0.0F, 0.0F, 0.0262F, -0.2618F));

        PartDefinition type_arm_rotate_x = waypoint_selector.addOrReplaceChild("type_arm_rotate_x", CubeListBuilder.create().texOffs(379, 60).addBox(-0.2F, -0.4F, -0.8F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(88, 439).addBox(-0.8F, 8.6F, -0.4F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, -10.0F, 12.0F, 0.6109F, 0.0F, 1.6581F));

        PartDefinition keys = waypoint_selector.addOrReplaceChild("keys", CubeListBuilder.create().texOffs(75, 429).addBox(-11.3775F, 1.0F, -7.8425F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-11.3775F, 1.0F, -10.4425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, -9.2425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, -6.8425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, -2.0425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, -4.4425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, 2.7575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, 0.3575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, 5.1575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, 9.9575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.3775F, 1.0F, 7.5575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-8.7775F, 1.0F, -12.4425F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, -10.0425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, -7.6425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, -2.8425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, -5.2425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, 1.9575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, -0.4425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, 4.3575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, 9.1575F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-5.7775F, 1.0F, 6.7575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, -11.6425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, -9.2425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, -6.8425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, -2.0425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, -4.4425F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, 2.7575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, 0.3575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, 5.1575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, 9.9575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(75, 429).addBox(-3.3775F, 1.0F, 7.5575F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.6225F, -6.0F, -0.1575F, 0.0F, 0.0F, -0.2618F));

        PartDefinition type_body = waypoint_selector.addOrReplaceChild("type_body", CubeListBuilder.create().texOffs(154, 315).addBox(-32.0F, -2.0F, -14.0F, 12.0F, 2.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(154, 315).addBox(-20.0F, -8.0F, -14.0F, 2.0F, 8.0F, 28.0F, new CubeDeformation(0.0F))
                .texOffs(154, 315).addBox(-18.0F, -8.0F, 10.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(154, 315).addBox(-18.0F, -8.0F, -14.0F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(154, 315).addBox(-12.0F, -8.0F, -10.2F, 2.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition tumbler = waypoint_selector.addOrReplaceChild("tumbler", CubeListBuilder.create().texOffs(379, 60).addBox(-5.05F, -9.05F, 10.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(198, 433).addBox(-6.05F, -8.05F, -10.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.05F, -7.05F, -11.0F, 3.0F, 3.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(194, 428).addBox(-2.05F, -4.05F, -10.0F, 7.0F, 0.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.95F, -6.95F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition dimention_selector = controlset_d.addOrReplaceChild("dimention_selector", CubeListBuilder.create().texOffs(379, 60).addBox(11.0F, -2.0F, -8.0F, 10.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -54.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition tilt_d1 = dimention_selector.addOrReplaceChild("tilt_d1", CubeListBuilder.create().texOffs(65, 428).addBox(-5.5F, 1.0F, -7.5F, 11.0F, 5.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(430, 360).addBox(-0.5F, -0.2F, -5.7F, 5.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.5F, -4.0F, -0.1F, 0.0F, 0.0F, -0.6109F));

        PartDefinition baseplate_d1 = controlset_d.addOrReplaceChild("baseplate_d1", CubeListBuilder.create().texOffs(379, 60).addBox(3.6F, -2.0F, 10.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.6F, -2.0F, 8.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.6F, -2.0F, 6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.6F, -2.0F, -8.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(6.6F, -2.0F, -8.0F, 2.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.6F, -2.0F, -10.0F, 8.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.6F, -2.0F, -12.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(272, 282).addBox(2.6F, -1.2F, -8.0F, 4.0F, 4.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-15.4F, -2.0F, 1.0F, 16.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-7.4F, -2.0F, -19.0F, 2.0F, 4.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-11.4F, -2.0F, -19.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-5.4F, -2.0F, -3.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -54.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition baseplate_d2 = controlset_d.addOrReplaceChild("baseplate_d2", CubeListBuilder.create().texOffs(379, 60).addBox(-19.4F, -2.0F, -22.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(146, 429).addBox(-18.4F, -4.0F, -21.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -54.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition baseplate_d3 = controlset_d.addOrReplaceChild("baseplate_d3", CubeListBuilder.create().texOffs(379, 60).addBox(-19.4F, -2.0F, 16.0F, 8.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(152, 433).addBox(-18.4F, -4.0F, 17.0F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -54.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition controlset_e = controls.addOrReplaceChild("controlset_e", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition telepathic_circuits = controlset_e.addOrReplaceChild("telepathic_circuits", CubeListBuilder.create(), PartPose.offsetAndRotation(-36.0F, -54.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition talking_board = telepathic_circuits.addOrReplaceChild("talking_board", CubeListBuilder.create().texOffs(37, 83).addBox(-15.6F, -2.0F, -14.0F, 19.0F, 4.0F, 27.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.0F, -2.0F, 11.8F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(6.0F, -2.0F, -0.2F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(7.0F, -2.0F, -0.4F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(281, 103).addBox(5.6F, -2.5F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(13.0F, -2.0F, -4.8F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(280, 109).addBox(12.6F, -2.6F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition talkingboard_text = talking_board.addOrReplaceChild("talkingboard_text", CubeListBuilder.create().texOffs(435, 332).addBox(-50.8F, -56.8F, 8.8F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-50.8F, -56.8F, -13.6F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-36.4F, -56.8F, -13.6F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-36.4F, -56.8F, 8.8F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-43.6F, -56.8F, 6.4F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-43.6F, -56.8F, -11.6F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-36.4F, -56.8F, -5.6F, 3.0F, 0.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-47.4F, -56.8F, -7.6F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-50.4F, -56.8F, -7.6F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-39.4F, -56.8F, -8.6F, 2.0F, 0.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-40.8F, -56.8F, 7.2F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-40.8F, -56.8F, -12.4F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(435, 332).addBox(-42.0F, -56.8F, -7.6F, 2.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(36.0F, 54.0F, 0.0F));

        PartDefinition talkingboard_corners = talking_board.addOrReplaceChild("talkingboard_corners", CubeListBuilder.create().texOffs(449, 88).addBox(-35.0F, -57.0F, 10.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(449, 88).addBox(-35.0F, -57.0F, -14.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(449, 88).addBox(-52.0F, -57.0F, -14.2F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(449, 88).addBox(-52.0F, -57.0F, 10.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(36.0F, 54.0F, 0.0F));

        PartDefinition scrying_glass = telepathic_circuits.addOrReplaceChild("scrying_glass", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, -5.0F, 2.0F, 0.0F, -1.309F, 0.0F));

        PartDefinition frame = scrying_glass.addOrReplaceChild("frame", CubeListBuilder.create(), PartPose.offset(44.0F, 59.0F, -7.0F));

        PartDefinition scrying_glass_frame_e1 = frame.addOrReplaceChild("scrying_glass_frame_e1", CubeListBuilder.create().texOffs(379, 60).addBox(-3.0F, -0.5F, -1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-43.6F, -58.9F, 9.4F));

        PartDefinition scrying_glass_frame_e3 = frame.addOrReplaceChild("scrying_glass_frame_e3", CubeListBuilder.create().texOffs(379, 60).addBox(-8.0F, -0.5F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.6F, -58.9F, 8.4F, 0.0F, -1.0996F, 0.0F));

        PartDefinition scrying_glass_frame_e2 = frame.addOrReplaceChild("scrying_glass_frame_e2", CubeListBuilder.create().texOffs(379, 60).addBox(0.0F, -0.5F, -1.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-47.6F, -58.9F, 8.4F, 0.0F, 1.117F, 0.0F));

        PartDefinition post_e1 = scrying_glass.addOrReplaceChild("post_e1", CubeListBuilder.create().texOffs(379, 60).addBox(-49.4F, -59.8F, 7.4F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-40.4F, -59.8F, 7.4F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-45.0F, -59.8F, -1.0F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(44.0F, 59.0F, -7.0F));

        PartDefinition nixietube_e1 = controlset_e.addOrReplaceChild("nixietube_e1", CubeListBuilder.create().texOffs(70, 420).addBox(-58.4F, -4.2F, 6.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-59.0F, -3.4F, 5.8F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition nixietube_e2 = controlset_e.addOrReplaceChild("nixietube_e2", CubeListBuilder.create().texOffs(70, 420).addBox(-58.4F, -4.2F, -4.4F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-59.0F, -3.4F, -5.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition nixietube_e3 = controlset_e.addOrReplaceChild("nixietube_e3", CubeListBuilder.create().texOffs(70, 420).addBox(-56.0F, -4.2F, 1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-56.6F, -3.4F, 0.6F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(34.0F, -58.0F, -2.0F));

        PartDefinition baseplate_e1 = controlset_e.addOrReplaceChild("baseplate_e1", CubeListBuilder.create().texOffs(379, 60).addBox(-2.6F, 3.0F, -2.4F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-52.0F, -54.0F, -19.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition baseplate_e2 = controlset_e.addOrReplaceChild("baseplate_e2", CubeListBuilder.create().texOffs(379, 60).addBox(-2.6F, 3.0F, 34.6F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-52.0F, -54.0F, -19.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition switch_e1 = controlset_e.addOrReplaceChild("switch_e1", CubeListBuilder.create().texOffs(379, 60).addBox(-15.75F, -30.0F, -4.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.25F, -26.0F, -6.85F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_e1 = switch_e1.addOrReplaceChild("toggle_e1", CubeListBuilder.create().texOffs(400, 300).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.05F, -29.8F, -3.45F, 0.0F, 0.0F, -0.6109F));

        PartDefinition switch_e2 = controlset_e.addOrReplaceChild("switch_e2", CubeListBuilder.create().texOffs(379, 60).addBox(-15.75F, -30.0F, -4.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.25F, -26.0F, -10.85F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_e2 = switch_e2.addOrReplaceChild("toggle_e2", CubeListBuilder.create().texOffs(400, 300).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.05F, -29.8F, -3.45F, 0.0F, 0.0F, -0.6109F));

        PartDefinition controlset_f = controls.addOrReplaceChild("controlset_f", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition baseplate_f1 = controlset_f.addOrReplaceChild("baseplate_f1", CubeListBuilder.create().texOffs(379, 60).addBox(-9.2F, 1.0F, -9.0F, 17.0F, 4.0F, 19.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-44.8F, -54.0F, 0.0F, -0.0087F, 0.0306F, -0.6109F));

        PartDefinition switch_f1 = baseplate_f1.addOrReplaceChild("switch_f1", CubeListBuilder.create().texOffs(379, 60).addBox(1.25F, -6.0F, -1.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.15F, 4.2F, -5.85F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_f1 = switch_f1.addOrReplaceChild("toggle_f1", CubeListBuilder.create().texOffs(464, 342).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -5.8F, -0.45F, 0.0F, 0.0F, -0.8727F));

        PartDefinition switch_f2 = baseplate_f1.addOrReplaceChild("switch_f2", CubeListBuilder.create().texOffs(379, 60).addBox(1.25F, -6.0F, -1.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.95F, 4.2F, -0.05F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_f2 = switch_f2.addOrReplaceChild("toggle_f2", CubeListBuilder.create().texOffs(461, 320).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -5.8F, -0.45F, 0.0F, 0.0F, -0.8727F));

        PartDefinition switch_f3 = baseplate_f1.addOrReplaceChild("switch_f3", CubeListBuilder.create().texOffs(379, 60).addBox(1.25F, -6.0F, -1.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.95F, 4.2F, 6.15F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_f3 = switch_f3.addOrReplaceChild("toggle_f3", CubeListBuilder.create().texOffs(440, 329).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -5.8F, -0.45F, 0.0F, 0.0F, -0.8727F));

        PartDefinition switch_f4 = baseplate_f1.addOrReplaceChild("switch_f4", CubeListBuilder.create().texOffs(379, 60).addBox(1.25F, -6.0F, -1.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.55F, 4.6F, -5.85F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_f4 = switch_f4.addOrReplaceChild("toggle_f4", CubeListBuilder.create().texOffs(429, 318).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -5.8F, -0.45F, 0.0F, 0.0F, -0.8727F));

        PartDefinition switch_f5 = baseplate_f1.addOrReplaceChild("switch_f5", CubeListBuilder.create().texOffs(379, 60).addBox(1.25F, -6.0F, -1.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.55F, 4.0F, -0.25F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_f5 = switch_f5.addOrReplaceChild("toggle_f5", CubeListBuilder.create().texOffs(439, 342).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -5.8F, -0.45F, 0.0F, 0.0F, -0.8727F));

        PartDefinition switch_f6 = baseplate_f1.addOrReplaceChild("switch_f6", CubeListBuilder.create().texOffs(379, 60).addBox(1.25F, -6.0F, -1.75F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.55F, 4.0F, 6.15F, 0.0F, 3.1416F, -0.3491F));

        PartDefinition toggle_f6 = switch_f6.addOrReplaceChild("toggle_f6", CubeListBuilder.create().texOffs(457, 345).addBox(-0.7F, -3.2F, -0.38F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 420).addBox(-1.1F, -1.2F, -0.78F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.95F, -5.8F, -0.45F, 0.0F, 0.0F, -0.8727F));

        PartDefinition handbreak = controlset_f.addOrReplaceChild("handbreak", CubeListBuilder.create().texOffs(379, 60).addBox(-15.4F, -2.0F, -20.0F, 7.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -54.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

        PartDefinition lever_f1_rotate_z = handbreak.addOrReplaceChild("lever_f1_rotate_z", CubeListBuilder.create().texOffs(379, 60).addBox(-1.5F, -0.6F, -3.4F, 2.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-5.5F, -0.6F, 4.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-5.5F, -0.6F, -3.2F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-6.5F, -0.6F, -3.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-7.5F, -0.6F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(363, 193).addBox(-13.5F, -0.6F, 0.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.9F, -3.2F, -17.0F, 0.0F, 0.0F, 3.0543F));

        PartDefinition barrel = handbreak.addOrReplaceChild("barrel", CubeListBuilder.create().texOffs(150, 427).addBox(-1.2F, -3.0F, -3.0F, 4.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-13.0F, -3.0F, -16.0F));

        PartDefinition randomize_cords = controlset_f.addOrReplaceChild("randomize_cords", CubeListBuilder.create().texOffs(379, 60).addBox(4.0F, -2.6F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.0F, -56.0F, 0.0F, 0.0F, 0.0349F, -0.0873F));

        PartDefinition globe_rotate_y = randomize_cords.addOrReplaceChild("globe_rotate_y", CubeListBuilder.create().texOffs(264, 384).addBox(-3.6F, -3.6F, -0.4F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.8F, -4.2F, -0.6F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-1.0F, -4.2F, 1.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-4.2F, -4.2F, 4.8F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.8F, 2.8F, 3.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-4.2F, -3.2F, 2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(0.8F, 2.8F, 1.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(2.8F, 2.8F, 4.8F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(2.2F, 3.2F, 4.2F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-2.2F, -1.4F, -0.8F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0F, -15.4F, 1.0F, -1.5708F, 2.0944F, 0.0F));

        PartDefinition globe_mount = randomize_cords.addOrReplaceChild("globe_mount", CubeListBuilder.create().texOffs(81, 431).addBox(5.0F, -3.8F, -3.8F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(9.0F, -19.0F, -8.0F, 1.0F, 12.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(9.0F, -7.0F, -8.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(9.0F, -19.0F, 0.0F, 1.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(9.0F, -19.0F, -6.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(190, 319).addBox(5.6F, -4.4F, -3.4F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rotation_selector = controlset_f.addOrReplaceChild("rotation_selector", CubeListBuilder.create().texOffs(379, 60).addBox(-103.0F, -1.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(50.0F, -50.0F, 14.0F));

        PartDefinition rotation_crank_rotate_y = rotation_selector.addOrReplaceChild("rotation_crank_rotate_y", CubeListBuilder.create().texOffs(146, 428).addBox(-1.0F, -2.1F, -0.8F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-1.0F, -1.1F, -2.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-1.0F, -1.1F, 1.2F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.0F, -1.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(1.0F, -1.1F, -0.8F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(3.0F, -1.1F, -2.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-5.0F, -1.1F, -2.8F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.0F, -1.1F, 3.2F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(379, 60).addBox(-3.0F, -1.1F, -4.8F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(90, 433).addBox(3.0F, -5.1F, -0.8F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-101.0F, -4.9F, 3.8F));

        PartDefinition structure = partdefinition.addOrReplaceChild("structure", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition side_001 = structure.addOrReplaceChild("side_001", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition skin = side_001.addOrReplaceChild("skin", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_skin = skin.addOrReplaceChild("floor_skin", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition floorboards = floor_skin.addOrReplaceChild("floorboards", CubeListBuilder.create().texOffs(125, 146).addBox(-74.0F, 0.25F, -40.0F, 10.0F, 1.0F, 78.0F, new CubeDeformation(0.0F))
                .texOffs(150, 150).addBox(-64.0F, 0.25F, -34.0F, 10.0F, 1.0F, 68.0F, new CubeDeformation(0.0F))
                .texOffs(176, 156).addBox(-54.0F, 0.25F, -28.0F, 10.0F, 1.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(214, 162).addBox(-44.0F, 0.25F, -23.0F, 10.0F, 1.0F, 45.0F, new CubeDeformation(0.0F))
                .texOffs(318, 76).addBox(-34.0F, 0.5F, -17.0F, 10.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
                .texOffs(285, 73).addBox(-24.25F, 1.5F, -13.0F, 3.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        PartDefinition leg_skin = floor_skin.addOrReplaceChild("leg_skin", CubeListBuilder.create().texOffs(319, 178).addBox(0.0F, 0.0F, -12.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        PartDefinition knee_skin = leg_skin.addOrReplaceChild("knee_skin", CubeListBuilder.create().texOffs(329, 88).addBox(1.0F, -16.0F, -9.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(3.0F, -17.0F, -10.0F, 1.0F, 20.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(320, 57).addBox(-2.0F, 12.0F, -13.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.2217F));

        PartDefinition thigh_skin = knee_skin.addOrReplaceChild("thigh_skin", CubeListBuilder.create().texOffs(35, 73).addBox(0.75F, -13.0F, -13.0F, 1.0F, 13.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition belly_skin = thigh_skin.addOrReplaceChild("belly_skin", CubeListBuilder.create().texOffs(319, 178).addBox(1.0F, -35.0F, -28.0F, 1.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
                .texOffs(305, 71).addBox(0.5F, -16.0F, -20.0F, 2.0F, 14.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

        PartDefinition rimtop_skin = belly_skin.addOrReplaceChild("rimtop_skin", CubeListBuilder.create().texOffs(319, 178).addBox(-1.5F, -8.0F, -34.0F, 1.0F, 8.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -34.0F, 0.0F, 0.0F, 0.0F, 2.9671F));

        PartDefinition panel_skin = rimtop_skin.addOrReplaceChild("panel_skin", CubeListBuilder.create().texOffs(319, 188).addBox(-6.55F, 3.0F, -27.0F, 1.0F, 14.0F, 51.0F, new CubeDeformation(0.0F))
                .texOffs(319, 184).addBox(-6.55F, 17.0F, -19.0F, 1.0F, 14.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(-6.55F, 31.0F, -13.0F, 1.0F, 12.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.0F, 1.0F, 0.0F, 0.0F, 3.0718F));

        PartDefinition skelly = side_001.addOrReplaceChild("skelly", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rib = skelly.addOrReplaceChild("rib", CubeListBuilder.create().texOffs(318, 238).addBox(1.0F, -1.0F, -2.0F, 54.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(325, 77).addBox(0.0F, -3.0F, 1.0F, 55.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-68.0F, -49.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition rib_bolts_1 = rib.addOrReplaceChild("rib_bolts_1", CubeListBuilder.create().texOffs(117, 104).addBox(-59.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-59.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(68.0F, 49.0F, 2.0F));

        PartDefinition foot = skelly.addOrReplaceChild("foot", CubeListBuilder.create().texOffs(288, 89).addBox(-76.0F, -8.0F, 1.0F, 60.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(334, 144).addBox(-69.0F, -4.0F, -1.0F, 53.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(419, 78).addBox(-81.0F, -6.0F, -2.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(302, 0).addBox(-16.0F, -40.0F, -0.5F, 4.0F, 33.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(333, 84).addBox(-59.0F, -46.0F, -2.0F, 40.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(349, 84).addBox(-63.5F, -50.25F, -2.5F, 19.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(353, 72).addBox(-7.75F, -80.0F, -3.0F, 4.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(339, 74).addBox(-65.0F, -52.0F, 0.5F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(160, 75).addBox(-9.0F, -77.4F, -4.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -2.0F));

        PartDefinition leg = foot.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(430, 61).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 93).addBox(-16.0F, -65.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition thigh = foot.addOrReplaceChild("thigh", CubeListBuilder.create().texOffs(419, 56).addBox(-4.0F, -20.0F, 0.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(406, 59).addBox(-11.0F, -26.0F, 1.0F, 4.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -32.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition floorpipes = side_001.addOrReplaceChild("floorpipes", CubeListBuilder.create().texOffs(384, 57).addBox(-31.6F, -4.0F, 0.4F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(309, 70).addBox(-31.0F, -43.0F, -2.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 69).addBox(-31.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(145, 435).addBox(-32.0F, -24.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(443, 91).addBox(-31.0F, -20.0F, 3.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(346, 42).addBox(-31.0F, -44.0F, 9.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(149, 430).addBox(-27.2F, -17.4F, -6.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(80, 429).addBox(-26.6F, -18.0F, -6.6F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(375, 82).addBox(-25.6F, -4.0F, -3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(345, 50).addBox(-25.0F, -10.0F, -3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_rail = side_001.addOrReplaceChild("front_rail", CubeListBuilder.create().texOffs(345, 32).addBox(14.7F, -46.85F, 11.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-88.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_railbolt = front_rail.addOrReplaceChild("front_railbolt", CubeListBuilder.create().texOffs(137, 109).addBox(-73.55F, -45.7F, 69.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 17.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 44.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 30.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 57.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(88.0F, 0.0F, -2.0F));

        PartDefinition rail_topbevel = front_rail.addOrReplaceChild("rail_topbevel", CubeListBuilder.create().texOffs(331, 39).addBox(1.6F, -1.0F, -32.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -50.0F, 43.0F, 0.0F, 0.0F, 0.8727F));

        PartDefinition rail_underbevel = front_rail.addOrReplaceChild("rail_underbevel", CubeListBuilder.create().texOffs(328, 37).addBox(-0.075F, -1.55F, -35.0F, 2.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -42.0F, 43.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition rotor_gasket = side_001.addOrReplaceChild("rotor_gasket", CubeListBuilder.create().texOffs(304, 52).addBox(-15.0F, -70.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(352, 63).addBox(-14.0F, -79.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(136, 96).addBox(-17.0F, -76.9F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(297, 77).addBox(-17.0F, -67.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_trim = side_001.addOrReplaceChild("floor_trim", CubeListBuilder.create().texOffs(292, 18).addBox(20.0F, -2.0F, -36.0F, 4.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.0F, -0.75F, 44.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition side_002 = structure.addOrReplaceChild("side_002", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

        PartDefinition skin2 = side_002.addOrReplaceChild("skin2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_skin2 = skin2.addOrReplaceChild("floor_skin2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition floorboards2 = floor_skin2.addOrReplaceChild("floorboards2", CubeListBuilder.create().texOffs(125, 146).addBox(-74.0F, 0.25F, -40.0F, 10.0F, 1.0F, 78.0F, new CubeDeformation(0.0F))
                .texOffs(150, 150).addBox(-64.0F, 0.25F, -34.0F, 10.0F, 1.0F, 68.0F, new CubeDeformation(0.0F))
                .texOffs(176, 156).addBox(-54.0F, 0.25F, -28.0F, 10.0F, 1.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(214, 162).addBox(-44.0F, 0.25F, -23.0F, 10.0F, 1.0F, 45.0F, new CubeDeformation(0.0F))
                .texOffs(318, 76).addBox(-34.0F, 0.5F, -17.0F, 10.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
                .texOffs(285, 73).addBox(-24.25F, 1.5F, -13.0F, 3.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        PartDefinition leg_skin2 = floor_skin2.addOrReplaceChild("leg_skin2", CubeListBuilder.create().texOffs(319, 178).addBox(0.0F, 0.0F, -12.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        PartDefinition knee_skin2 = leg_skin2.addOrReplaceChild("knee_skin2", CubeListBuilder.create().texOffs(329, 88).addBox(1.0F, -16.0F, -9.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(3.0F, -17.0F, -10.0F, 1.0F, 20.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(320, 57).addBox(-2.0F, 12.0F, -13.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.2217F));

        PartDefinition thigh_skin2 = knee_skin2.addOrReplaceChild("thigh_skin2", CubeListBuilder.create().texOffs(35, 73).addBox(0.75F, -13.0F, -13.0F, 1.0F, 13.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition belly_skin2 = thigh_skin2.addOrReplaceChild("belly_skin2", CubeListBuilder.create().texOffs(319, 178).addBox(1.0F, -35.0F, -28.0F, 1.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
                .texOffs(305, 71).addBox(0.5F, -16.0F, -20.0F, 2.0F, 14.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

        PartDefinition rimtop_skin2 = belly_skin2.addOrReplaceChild("rimtop_skin2", CubeListBuilder.create().texOffs(319, 178).addBox(-1.5F, -8.0F, -34.0F, 1.0F, 8.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -34.0F, 0.0F, 0.0F, 0.0F, 2.9671F));

        PartDefinition panel_skin2 = rimtop_skin2.addOrReplaceChild("panel_skin2", CubeListBuilder.create().texOffs(319, 188).addBox(-6.55F, 3.0F, -27.0F, 1.0F, 14.0F, 51.0F, new CubeDeformation(0.0F))
                .texOffs(319, 184).addBox(-6.55F, 17.0F, -19.0F, 1.0F, 14.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(-6.55F, 31.0F, -13.0F, 1.0F, 12.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.0F, 1.0F, 0.0F, 0.0F, 3.0718F));

        PartDefinition skelly2 = side_002.addOrReplaceChild("skelly2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rib2 = skelly2.addOrReplaceChild("rib2", CubeListBuilder.create().texOffs(318, 238).addBox(1.0F, -1.0F, -2.0F, 54.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(325, 77).addBox(0.0F, -3.0F, 1.0F, 55.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-68.0F, -49.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition rib_bolts_2 = rib2.addOrReplaceChild("rib_bolts_2", CubeListBuilder.create().texOffs(117, 104).addBox(-59.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-59.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(68.0F, 49.0F, 2.0F));

        PartDefinition foot2 = skelly2.addOrReplaceChild("foot2", CubeListBuilder.create().texOffs(288, 89).addBox(-76.0F, -8.0F, 1.0F, 60.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(334, 144).addBox(-69.0F, -4.0F, -1.0F, 53.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(419, 78).addBox(-81.0F, -6.0F, -2.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(302, 0).addBox(-16.0F, -40.0F, -0.5F, 4.0F, 33.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(333, 84).addBox(-59.0F, -46.0F, -2.0F, 40.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(349, 84).addBox(-63.5F, -50.25F, -2.5F, 19.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(353, 72).addBox(-7.75F, -80.0F, -3.0F, 4.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(339, 74).addBox(-65.0F, -52.0F, 0.5F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(160, 75).addBox(-9.0F, -77.4F, -4.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -2.0F));

        PartDefinition leg2 = foot2.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(430, 61).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 93).addBox(-16.0F, -65.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition thigh2 = foot2.addOrReplaceChild("thigh2", CubeListBuilder.create().texOffs(419, 56).addBox(-4.0F, -20.0F, 0.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(406, 59).addBox(-11.0F, -26.0F, 1.0F, 4.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -32.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition floorpipes2 = side_002.addOrReplaceChild("floorpipes2", CubeListBuilder.create().texOffs(384, 57).addBox(-31.6F, -4.0F, 0.4F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(309, 70).addBox(-31.0F, -43.0F, -2.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 69).addBox(-31.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(145, 435).addBox(-32.0F, -24.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(443, 91).addBox(-31.0F, -20.0F, 3.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(346, 42).addBox(-31.0F, -44.0F, 9.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_rail2 = side_002.addOrReplaceChild("front_rail2", CubeListBuilder.create().texOffs(345, 32).addBox(14.7F, -46.85F, 11.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-88.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_railbolt2 = front_rail2.addOrReplaceChild("front_railbolt2", CubeListBuilder.create().texOffs(137, 109).addBox(-73.55F, -45.7F, 69.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 17.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 44.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 30.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 57.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(88.0F, 0.0F, -2.0F));

        PartDefinition rail_topbevel2 = front_rail2.addOrReplaceChild("rail_topbevel2", CubeListBuilder.create().texOffs(331, 39).addBox(1.6F, -1.0F, -32.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -50.0F, 43.0F, 0.0F, 0.0F, 0.8727F));

        PartDefinition rail_underbevel2 = front_rail2.addOrReplaceChild("rail_underbevel2", CubeListBuilder.create().texOffs(328, 37).addBox(-0.075F, -1.55F, -35.0F, 2.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -42.0F, 43.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition rotor_gasket2 = side_002.addOrReplaceChild("rotor_gasket2", CubeListBuilder.create().texOffs(304, 52).addBox(-15.0F, -70.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(352, 63).addBox(-14.0F, -79.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(136, 96).addBox(-17.0F, -76.9F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(297, 77).addBox(-17.0F, -67.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_trim2 = side_002.addOrReplaceChild("floor_trim2", CubeListBuilder.create().texOffs(292, 18).addBox(20.0F, -2.0F, -36.0F, 4.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.0F, -0.75F, 44.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition side_003 = structure.addOrReplaceChild("side_003", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.0944F, 0.0F));

        PartDefinition skin3 = side_003.addOrReplaceChild("skin3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_skin3 = skin3.addOrReplaceChild("floor_skin3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition floorboards3 = floor_skin3.addOrReplaceChild("floorboards3", CubeListBuilder.create().texOffs(125, 146).addBox(-74.0F, 0.25F, -40.0F, 10.0F, 1.0F, 78.0F, new CubeDeformation(0.0F))
                .texOffs(150, 150).addBox(-64.0F, 0.25F, -34.0F, 10.0F, 1.0F, 68.0F, new CubeDeformation(0.0F))
                .texOffs(176, 156).addBox(-54.0F, 0.25F, -28.0F, 10.0F, 1.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(214, 162).addBox(-44.0F, 0.25F, -23.0F, 10.0F, 1.0F, 45.0F, new CubeDeformation(0.0F))
                .texOffs(318, 76).addBox(-34.0F, 0.5F, -17.0F, 10.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
                .texOffs(285, 73).addBox(-24.25F, 1.5F, -13.0F, 3.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        PartDefinition leg_skin3 = floor_skin3.addOrReplaceChild("leg_skin3", CubeListBuilder.create().texOffs(319, 178).addBox(0.0F, 0.0F, -12.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        PartDefinition knee_skin3 = leg_skin3.addOrReplaceChild("knee_skin3", CubeListBuilder.create().texOffs(329, 88).addBox(1.0F, -16.0F, -9.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(3.0F, -17.0F, -10.0F, 1.0F, 20.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(320, 57).addBox(-2.0F, 12.0F, -13.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.2217F));

        PartDefinition thigh_skin3 = knee_skin3.addOrReplaceChild("thigh_skin3", CubeListBuilder.create().texOffs(35, 73).addBox(0.75F, -13.0F, -13.0F, 1.0F, 13.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition belly_skin3 = thigh_skin3.addOrReplaceChild("belly_skin3", CubeListBuilder.create().texOffs(319, 178).addBox(1.0F, -35.0F, -28.0F, 1.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
                .texOffs(305, 71).addBox(0.5F, -16.0F, -20.0F, 2.0F, 14.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

        PartDefinition rimtop_skin3 = belly_skin3.addOrReplaceChild("rimtop_skin3", CubeListBuilder.create().texOffs(319, 178).addBox(-1.5F, -8.0F, -34.0F, 1.0F, 8.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -34.0F, 0.0F, 0.0F, 0.0F, 2.9671F));

        PartDefinition panel_skin3 = rimtop_skin3.addOrReplaceChild("panel_skin3", CubeListBuilder.create().texOffs(319, 188).addBox(-6.55F, 3.0F, -27.0F, 1.0F, 14.0F, 51.0F, new CubeDeformation(0.0F))
                .texOffs(319, 184).addBox(-6.55F, 17.0F, -19.0F, 1.0F, 14.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(-6.55F, 31.0F, -13.0F, 1.0F, 12.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.0F, 1.0F, 0.0F, 0.0F, 3.0718F));

        PartDefinition skelly3 = side_003.addOrReplaceChild("skelly3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rib3 = skelly3.addOrReplaceChild("rib3", CubeListBuilder.create().texOffs(318, 238).addBox(1.0F, -1.0F, -2.0F, 54.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(325, 77).addBox(0.0F, -3.0F, 1.0F, 55.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-68.0F, -49.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition rib_bolts_3 = rib3.addOrReplaceChild("rib_bolts_3", CubeListBuilder.create().texOffs(117, 104).addBox(-59.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-59.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(68.0F, 49.0F, 2.0F));

        PartDefinition foot3 = skelly3.addOrReplaceChild("foot3", CubeListBuilder.create().texOffs(288, 89).addBox(-76.0F, -8.0F, 1.0F, 60.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(334, 144).addBox(-69.0F, -4.0F, -1.0F, 53.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(419, 78).addBox(-81.0F, -6.0F, -2.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(302, 0).addBox(-16.0F, -40.0F, -0.5F, 4.0F, 33.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(333, 84).addBox(-59.0F, -46.0F, -2.0F, 40.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(349, 84).addBox(-63.5F, -50.25F, -2.5F, 19.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(353, 72).addBox(-7.75F, -80.0F, -3.0F, 4.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(339, 74).addBox(-65.0F, -52.0F, 0.5F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(160, 75).addBox(-9.0F, -77.4F, -4.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -2.0F));

        PartDefinition leg3 = foot3.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(430, 61).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 93).addBox(-16.0F, -65.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition thigh3 = foot3.addOrReplaceChild("thigh3", CubeListBuilder.create().texOffs(419, 56).addBox(-4.0F, -20.0F, 0.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(406, 59).addBox(-11.0F, -26.0F, 1.0F, 4.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -32.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition floorpipes3 = side_003.addOrReplaceChild("floorpipes3", CubeListBuilder.create().texOffs(384, 57).addBox(-31.6F, -4.0F, 0.4F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(309, 70).addBox(-31.0F, -43.0F, -2.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 69).addBox(-31.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(145, 435).addBox(-32.0F, -24.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(443, 91).addBox(-31.0F, -20.0F, 3.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(346, 42).addBox(-31.0F, -44.0F, 9.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(149, 430).addBox(-27.2F, -17.4F, -6.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(80, 429).addBox(-26.6F, -18.0F, -6.6F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(375, 82).addBox(-25.6F, -4.0F, -3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(345, 50).addBox(-25.0F, -10.0F, -3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_rail3 = side_003.addOrReplaceChild("front_rail3", CubeListBuilder.create().texOffs(345, 32).addBox(14.7F, -46.85F, 11.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-88.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_railbolt3 = front_rail3.addOrReplaceChild("front_railbolt3", CubeListBuilder.create().texOffs(137, 109).addBox(-73.55F, -45.7F, 69.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 17.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 44.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 30.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 57.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(88.0F, 0.0F, -2.0F));

        PartDefinition rail_topbevel3 = front_rail3.addOrReplaceChild("rail_topbevel3", CubeListBuilder.create().texOffs(331, 39).addBox(1.6F, -1.0F, -32.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -50.0F, 43.0F, 0.0F, 0.0F, 0.8727F));

        PartDefinition rail_underbevel3 = front_rail3.addOrReplaceChild("rail_underbevel3", CubeListBuilder.create().texOffs(328, 37).addBox(-0.075F, -1.55F, -35.0F, 2.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -42.0F, 43.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition rotor_gasket3 = side_003.addOrReplaceChild("rotor_gasket3", CubeListBuilder.create().texOffs(304, 52).addBox(-15.0F, -70.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(352, 63).addBox(-14.0F, -79.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(136, 96).addBox(-17.0F, -76.9F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(297, 77).addBox(-17.0F, -67.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_trim3 = side_003.addOrReplaceChild("floor_trim3", CubeListBuilder.create().texOffs(292, 18).addBox(20.0F, -2.0F, -36.0F, 4.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.0F, -0.75F, 44.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition side_004 = structure.addOrReplaceChild("side_004", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        PartDefinition skin4 = side_004.addOrReplaceChild("skin4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_skin4 = skin4.addOrReplaceChild("floor_skin4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition floorboards4 = floor_skin4.addOrReplaceChild("floorboards4", CubeListBuilder.create().texOffs(125, 146).addBox(-74.0F, 0.25F, -40.0F, 10.0F, 1.0F, 78.0F, new CubeDeformation(0.0F))
                .texOffs(150, 150).addBox(-64.0F, 0.25F, -34.0F, 10.0F, 1.0F, 68.0F, new CubeDeformation(0.0F))
                .texOffs(176, 156).addBox(-54.0F, 0.25F, -28.0F, 10.0F, 1.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(214, 162).addBox(-44.0F, 0.25F, -23.0F, 10.0F, 1.0F, 45.0F, new CubeDeformation(0.0F))
                .texOffs(318, 76).addBox(-34.0F, 0.5F, -17.0F, 10.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
                .texOffs(285, 73).addBox(-24.25F, 1.5F, -13.0F, 3.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        PartDefinition leg_skin4 = floor_skin4.addOrReplaceChild("leg_skin4", CubeListBuilder.create().texOffs(319, 178).addBox(0.0F, 0.0F, -12.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        PartDefinition knee_skin4 = leg_skin4.addOrReplaceChild("knee_skin4", CubeListBuilder.create().texOffs(329, 88).addBox(1.0F, -16.0F, -9.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(3.0F, -17.0F, -10.0F, 1.0F, 20.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(320, 57).addBox(-2.0F, 12.0F, -13.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.2217F));

        PartDefinition thigh_skin4 = knee_skin4.addOrReplaceChild("thigh_skin4", CubeListBuilder.create().texOffs(35, 73).addBox(0.75F, -13.0F, -13.0F, 1.0F, 13.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition belly_skin4 = thigh_skin4.addOrReplaceChild("belly_skin4", CubeListBuilder.create().texOffs(319, 178).addBox(1.0F, -35.0F, -28.0F, 1.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
                .texOffs(305, 71).addBox(0.5F, -16.0F, -20.0F, 2.0F, 14.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

        PartDefinition rimtop_skin4 = belly_skin4.addOrReplaceChild("rimtop_skin4", CubeListBuilder.create().texOffs(319, 178).addBox(-1.5F, -8.0F, -34.0F, 1.0F, 8.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -34.0F, 0.0F, 0.0F, 0.0F, 2.9671F));

        PartDefinition panel_skin4 = rimtop_skin4.addOrReplaceChild("panel_skin4", CubeListBuilder.create().texOffs(319, 188).addBox(-6.55F, 3.0F, -27.0F, 1.0F, 14.0F, 51.0F, new CubeDeformation(0.0F))
                .texOffs(319, 184).addBox(-6.55F, 17.0F, -19.0F, 1.0F, 14.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(-6.55F, 31.0F, -13.0F, 1.0F, 12.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.0F, 1.0F, 0.0F, 0.0F, 3.0718F));

        PartDefinition skelly4 = side_004.addOrReplaceChild("skelly4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rib4 = skelly4.addOrReplaceChild("rib4", CubeListBuilder.create().texOffs(318, 238).addBox(1.0F, -1.0F, -2.0F, 54.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(325, 77).addBox(0.0F, -3.0F, 1.0F, 55.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-68.0F, -49.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition rib_bolts_4 = rib4.addOrReplaceChild("rib_bolts_4", CubeListBuilder.create().texOffs(117, 104).addBox(-59.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-59.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(68.0F, 49.0F, 2.0F));

        PartDefinition foot4 = skelly4.addOrReplaceChild("foot4", CubeListBuilder.create().texOffs(288, 89).addBox(-76.0F, -8.0F, 1.0F, 60.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(334, 144).addBox(-69.0F, -4.0F, -1.0F, 53.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(419, 78).addBox(-81.0F, -6.0F, -2.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(302, 0).addBox(-16.0F, -40.0F, -0.5F, 4.0F, 33.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(333, 84).addBox(-59.0F, -46.0F, -2.0F, 40.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(349, 84).addBox(-63.5F, -50.25F, -2.5F, 19.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(353, 72).addBox(-7.75F, -80.0F, -3.0F, 4.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(339, 74).addBox(-65.0F, -52.0F, 0.5F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(160, 75).addBox(-9.0F, -77.4F, -4.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -2.0F));

        PartDefinition leg4 = foot4.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(430, 61).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 93).addBox(-16.0F, -65.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition thigh4 = foot4.addOrReplaceChild("thigh4", CubeListBuilder.create().texOffs(419, 56).addBox(-4.0F, -20.0F, 0.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(406, 59).addBox(-11.0F, -26.0F, 1.0F, 4.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -32.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition floorpipes4 = side_004.addOrReplaceChild("floorpipes4", CubeListBuilder.create().texOffs(384, 57).addBox(-31.6F, -4.0F, 0.4F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(309, 70).addBox(-31.0F, -43.0F, -2.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 69).addBox(-31.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(145, 435).addBox(-32.0F, -24.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(443, 91).addBox(-31.0F, -20.0F, 3.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(346, 42).addBox(-31.0F, -44.0F, 9.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_rail4 = side_004.addOrReplaceChild("front_rail4", CubeListBuilder.create().texOffs(345, 32).addBox(14.7F, -46.85F, 11.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-88.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_railbolt4 = front_rail4.addOrReplaceChild("front_railbolt4", CubeListBuilder.create().texOffs(137, 109).addBox(-73.55F, -45.7F, 69.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 17.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 44.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 30.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 57.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(88.0F, 0.0F, -2.0F));

        PartDefinition rail_topbevel4 = front_rail4.addOrReplaceChild("rail_topbevel4", CubeListBuilder.create().texOffs(331, 39).addBox(1.6F, -1.0F, -32.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -50.0F, 43.0F, 0.0F, 0.0F, 0.8727F));

        PartDefinition rail_underbevel4 = front_rail4.addOrReplaceChild("rail_underbevel4", CubeListBuilder.create().texOffs(328, 37).addBox(-0.075F, -1.55F, -35.0F, 2.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -42.0F, 43.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition rotor_gasket4 = side_004.addOrReplaceChild("rotor_gasket4", CubeListBuilder.create().texOffs(304, 52).addBox(-15.0F, -70.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(352, 63).addBox(-14.0F, -79.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(136, 96).addBox(-17.0F, -76.9F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(297, 77).addBox(-17.0F, -67.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_trim4 = side_004.addOrReplaceChild("floor_trim4", CubeListBuilder.create().texOffs(292, 18).addBox(20.0F, -2.0F, -36.0F, 4.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.0F, -0.75F, 44.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition side_005 = structure.addOrReplaceChild("side_005", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.0944F, 0.0F));

        PartDefinition skin5 = side_005.addOrReplaceChild("skin5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_skin5 = skin5.addOrReplaceChild("floor_skin5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition floorboards5 = floor_skin5.addOrReplaceChild("floorboards5", CubeListBuilder.create().texOffs(125, 146).addBox(-74.0F, 0.25F, -40.0F, 10.0F, 1.0F, 78.0F, new CubeDeformation(0.0F))
                .texOffs(150, 150).addBox(-64.0F, 0.25F, -34.0F, 10.0F, 1.0F, 68.0F, new CubeDeformation(0.0F))
                .texOffs(176, 156).addBox(-54.0F, 0.25F, -28.0F, 10.0F, 1.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(214, 162).addBox(-44.0F, 0.25F, -23.0F, 10.0F, 1.0F, 45.0F, new CubeDeformation(0.0F))
                .texOffs(318, 76).addBox(-34.0F, 0.5F, -17.0F, 10.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
                .texOffs(285, 73).addBox(-24.25F, 1.5F, -13.0F, 3.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        PartDefinition leg_skin5 = floor_skin5.addOrReplaceChild("leg_skin5", CubeListBuilder.create().texOffs(319, 178).addBox(0.0F, 0.0F, -12.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        PartDefinition knee_skin5 = leg_skin5.addOrReplaceChild("knee_skin5", CubeListBuilder.create().texOffs(329, 88).addBox(1.0F, -16.0F, -9.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(3.0F, -17.0F, -10.0F, 1.0F, 20.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(320, 57).addBox(-2.0F, 12.0F, -13.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.2217F));

        PartDefinition thigh_skin5 = knee_skin5.addOrReplaceChild("thigh_skin5", CubeListBuilder.create().texOffs(35, 73).addBox(0.75F, -13.0F, -13.0F, 1.0F, 13.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition belly_skin5 = thigh_skin5.addOrReplaceChild("belly_skin5", CubeListBuilder.create().texOffs(319, 178).addBox(1.0F, -35.0F, -28.0F, 1.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
                .texOffs(305, 71).addBox(0.5F, -16.0F, -20.0F, 2.0F, 14.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

        PartDefinition rimtop_skin5 = belly_skin5.addOrReplaceChild("rimtop_skin5", CubeListBuilder.create().texOffs(319, 178).addBox(-1.5F, -8.0F, -34.0F, 1.0F, 8.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -34.0F, 0.0F, 0.0F, 0.0F, 2.9671F));

        PartDefinition panel_skin5 = rimtop_skin5.addOrReplaceChild("panel_skin5", CubeListBuilder.create().texOffs(319, 188).addBox(-6.55F, 3.0F, -27.0F, 1.0F, 14.0F, 51.0F, new CubeDeformation(0.0F))
                .texOffs(319, 184).addBox(-6.55F, 17.0F, -19.0F, 1.0F, 14.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(-6.55F, 31.0F, -13.0F, 1.0F, 12.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.0F, 1.0F, 0.0F, 0.0F, 3.0718F));

        PartDefinition skelly5 = side_005.addOrReplaceChild("skelly5", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rib5 = skelly5.addOrReplaceChild("rib5", CubeListBuilder.create().texOffs(318, 238).addBox(1.0F, -1.0F, -2.0F, 54.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(325, 77).addBox(0.0F, -3.0F, 1.0F, 55.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-68.0F, -49.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition rib_bolts_5 = rib5.addOrReplaceChild("rib_bolts_5", CubeListBuilder.create().texOffs(117, 104).addBox(-59.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-59.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(68.0F, 49.0F, 2.0F));

        PartDefinition foot5 = skelly5.addOrReplaceChild("foot5", CubeListBuilder.create().texOffs(288, 89).addBox(-76.0F, -8.0F, 1.0F, 60.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(334, 144).addBox(-69.0F, -4.0F, -1.0F, 53.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(419, 78).addBox(-81.0F, -6.0F, -2.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(302, 0).addBox(-16.0F, -40.0F, -0.5F, 4.0F, 33.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(333, 84).addBox(-59.0F, -46.0F, -2.0F, 40.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(349, 84).addBox(-63.5F, -50.25F, -2.5F, 19.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(353, 72).addBox(-7.75F, -80.0F, -3.0F, 4.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(339, 74).addBox(-65.0F, -52.0F, 0.5F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(160, 75).addBox(-9.0F, -77.4F, -4.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -2.0F));

        PartDefinition leg5 = foot5.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(430, 61).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 93).addBox(-16.0F, -65.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition thigh5 = foot5.addOrReplaceChild("thigh5", CubeListBuilder.create().texOffs(419, 56).addBox(-4.0F, -20.0F, 0.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(406, 59).addBox(-11.0F, -26.0F, 1.0F, 4.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -32.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition floorpipes5 = side_005.addOrReplaceChild("floorpipes5", CubeListBuilder.create().texOffs(384, 57).addBox(-31.6F, -4.0F, 0.4F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(309, 70).addBox(-31.0F, -43.0F, -2.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 69).addBox(-31.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(145, 435).addBox(-32.0F, -24.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(443, 91).addBox(-31.0F, -20.0F, 3.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(346, 42).addBox(-31.0F, -44.0F, 9.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(149, 430).addBox(-27.2F, -17.4F, -6.0F, 4.0F, 7.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(80, 429).addBox(-26.6F, -18.0F, -6.6F, 4.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(375, 82).addBox(-25.6F, -4.0F, -3.6F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(345, 50).addBox(-25.0F, -10.0F, -3.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_rail5 = side_005.addOrReplaceChild("front_rail5", CubeListBuilder.create().texOffs(345, 32).addBox(14.7F, -46.85F, 11.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-88.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_railbolt5 = front_rail5.addOrReplaceChild("front_railbolt5", CubeListBuilder.create().texOffs(137, 109).addBox(-73.55F, -45.7F, 69.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 17.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 44.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 30.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 57.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(88.0F, 0.0F, -2.0F));

        PartDefinition rail_topbevel5 = front_rail5.addOrReplaceChild("rail_topbevel5", CubeListBuilder.create().texOffs(331, 39).addBox(1.6F, -1.0F, -32.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -50.0F, 43.0F, 0.0F, 0.0F, 0.8727F));

        PartDefinition rail_underbevel5 = front_rail5.addOrReplaceChild("rail_underbevel5", CubeListBuilder.create().texOffs(328, 37).addBox(-0.075F, -1.55F, -35.0F, 2.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -42.0F, 43.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition rotor_gasket5 = side_005.addOrReplaceChild("rotor_gasket5", CubeListBuilder.create().texOffs(304, 52).addBox(-15.0F, -70.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(352, 63).addBox(-14.0F, -79.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(136, 96).addBox(-17.0F, -76.9F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(297, 77).addBox(-17.0F, -67.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_trim5 = side_005.addOrReplaceChild("floor_trim5", CubeListBuilder.create().texOffs(292, 18).addBox(20.0F, -2.0F, -36.0F, 4.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.0F, -0.75F, 44.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition side_006 = structure.addOrReplaceChild("side_006", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

        PartDefinition skin6 = side_006.addOrReplaceChild("skin6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_skin6 = skin6.addOrReplaceChild("floor_skin6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition floorboards6 = floor_skin6.addOrReplaceChild("floorboards6", CubeListBuilder.create().texOffs(125, 146).addBox(-74.0F, 0.25F, -40.0F, 10.0F, 1.0F, 78.0F, new CubeDeformation(0.0F))
                .texOffs(150, 150).addBox(-64.0F, 0.25F, -34.0F, 10.0F, 1.0F, 68.0F, new CubeDeformation(0.0F))
                .texOffs(176, 156).addBox(-54.0F, 0.25F, -28.0F, 10.0F, 1.0F, 56.0F, new CubeDeformation(0.0F))
                .texOffs(214, 162).addBox(-44.0F, 0.25F, -23.0F, 10.0F, 1.0F, 45.0F, new CubeDeformation(0.0F))
                .texOffs(318, 76).addBox(-34.0F, 0.5F, -17.0F, 10.0F, 2.0F, 34.0F, new CubeDeformation(0.0F))
                .texOffs(285, 73).addBox(-24.25F, 1.5F, -13.0F, 3.0F, 4.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        PartDefinition leg_skin6 = floor_skin6.addOrReplaceChild("leg_skin6", CubeListBuilder.create().texOffs(319, 178).addBox(0.0F, 0.0F, -12.0F, 20.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.0F, -3.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        PartDefinition knee_skin6 = leg_skin6.addOrReplaceChild("knee_skin6", CubeListBuilder.create().texOffs(329, 88).addBox(1.0F, -16.0F, -9.0F, 4.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(3.0F, -17.0F, -10.0F, 1.0F, 20.0F, 22.0F, new CubeDeformation(0.0F))
                .texOffs(320, 57).addBox(-2.0F, 12.0F, -13.0F, 4.0F, 4.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -4.0F, 0.0F, 0.0F, 0.0F, 1.2217F));

        PartDefinition thigh_skin6 = knee_skin6.addOrReplaceChild("thigh_skin6", CubeListBuilder.create().texOffs(35, 73).addBox(0.75F, -13.0F, -13.0F, 1.0F, 13.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, -14.0F, 0.0F, 0.0F, 0.0F, -0.6981F));

        PartDefinition belly_skin6 = thigh_skin6.addOrReplaceChild("belly_skin6", CubeListBuilder.create().texOffs(319, 178).addBox(1.0F, -35.0F, -28.0F, 1.0F, 19.0F, 55.0F, new CubeDeformation(0.0F))
                .texOffs(305, 71).addBox(0.5F, -16.0F, -20.0F, 2.0F, 14.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -10.0F, 0.0F, 0.0F, 0.0F, -0.8727F));

        PartDefinition rimtop_skin6 = belly_skin6.addOrReplaceChild("rimtop_skin6", CubeListBuilder.create().texOffs(319, 178).addBox(-1.5F, -8.0F, -34.0F, 1.0F, 8.0F, 68.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.5F, -34.0F, 0.0F, 0.0F, 0.0F, 2.9671F));

        PartDefinition panel_skin6 = rimtop_skin6.addOrReplaceChild("panel_skin6", CubeListBuilder.create().texOffs(319, 188).addBox(-6.55F, 3.0F, -27.0F, 1.0F, 14.0F, 51.0F, new CubeDeformation(0.0F))
                .texOffs(319, 184).addBox(-6.55F, 17.0F, -19.0F, 1.0F, 14.0F, 36.0F, new CubeDeformation(0.0F))
                .texOffs(319, 178).addBox(-6.55F, 31.0F, -13.0F, 1.0F, 12.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.5F, -4.0F, 1.0F, 0.0F, 0.0F, 3.0718F));

        PartDefinition skelly6 = side_006.addOrReplaceChild("skelly6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition rib6 = skelly6.addOrReplaceChild("rib6", CubeListBuilder.create().texOffs(318, 238).addBox(1.0F, -1.0F, -2.0F, 54.0F, 5.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(325, 77).addBox(0.0F, -3.0F, 1.0F, 55.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-68.0F, -49.0F, -2.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition rib_bolts_6 = rib6.addOrReplaceChild("rib_bolts_6", CubeListBuilder.create().texOffs(117, 104).addBox(-59.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, 1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-59.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-19.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-39.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-29.75F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(117, 104).addBox(-49.5F, -50.25F, -3.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(68.0F, 49.0F, 2.0F));

        PartDefinition foot6 = skelly6.addOrReplaceChild("foot6", CubeListBuilder.create().texOffs(288, 89).addBox(-76.0F, -8.0F, 1.0F, 60.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(334, 144).addBox(-69.0F, -4.0F, -1.0F, 53.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(419, 78).addBox(-81.0F, -6.0F, -2.0F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(302, 0).addBox(-16.0F, -40.0F, -0.5F, 4.0F, 33.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(333, 84).addBox(-59.0F, -46.0F, -2.0F, 40.0F, 4.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(349, 84).addBox(-63.5F, -50.25F, -2.5F, 19.0F, 8.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(353, 72).addBox(-7.75F, -80.0F, -3.0F, 4.0F, 20.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(339, 74).addBox(-65.0F, -52.0F, 0.5F, 12.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(160, 75).addBox(-9.0F, -77.4F, -4.0F, 4.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, -2.0F));

        PartDefinition leg6 = foot6.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(430, 61).addBox(0.0F, -12.0F, 0.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(51, 93).addBox(-16.0F, -65.0F, 0.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-21.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

        PartDefinition thigh6 = foot6.addOrReplaceChild("thigh6", CubeListBuilder.create().texOffs(419, 56).addBox(-4.0F, -20.0F, 0.0F, 4.0F, 18.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(406, 59).addBox(-11.0F, -26.0F, 1.0F, 4.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, -32.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition floorpipes6 = side_006.addOrReplaceChild("floorpipes6", CubeListBuilder.create().texOffs(384, 57).addBox(-31.6F, -4.0F, 0.4F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(309, 70).addBox(-31.0F, -43.0F, -2.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(375, 69).addBox(-31.0F, -23.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(145, 435).addBox(-32.0F, -24.0F, 2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(443, 91).addBox(-31.0F, -20.0F, 3.0F, 2.0F, 20.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(346, 42).addBox(-31.0F, -44.0F, 9.0F, 2.0F, 40.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_rail6 = side_006.addOrReplaceChild("front_rail6", CubeListBuilder.create().texOffs(345, 32).addBox(14.7F, -46.85F, 11.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-88.0F, 0.0F, 2.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition front_railbolt6 = front_rail6.addOrReplaceChild("front_railbolt6", CubeListBuilder.create().texOffs(137, 109).addBox(-73.55F, -45.7F, 69.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 17.15F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 44.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 30.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(137, 109).addBox(-73.55F, -45.7F, 57.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(88.0F, 0.0F, -2.0F));

        PartDefinition rail_topbevel6 = front_rail6.addOrReplaceChild("rail_topbevel6", CubeListBuilder.create().texOffs(331, 39).addBox(1.6F, -1.0F, -32.0F, 2.0F, 4.0F, 64.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -50.0F, 43.0F, 0.0F, 0.0F, 0.8727F));

        PartDefinition rail_underbevel6 = front_rail6.addOrReplaceChild("rail_underbevel6", CubeListBuilder.create().texOffs(328, 37).addBox(-0.075F, -1.55F, -35.0F, 2.0F, 4.0F, 69.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.0F, -42.0F, 43.0F, 0.0F, 0.0F, -0.9599F));

        PartDefinition rotor_gasket6 = side_006.addOrReplaceChild("rotor_gasket6", CubeListBuilder.create().texOffs(304, 52).addBox(-15.0F, -70.0F, -4.0F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(352, 63).addBox(-14.0F, -79.0F, -4.0F, 2.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(136, 96).addBox(-17.0F, -76.9F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(297, 77).addBox(-17.0F, -67.0F, -5.0F, 2.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.5236F, 0.0F));

        PartDefinition floor_trim6 = side_006.addOrReplaceChild("floor_trim6", CubeListBuilder.create().texOffs(292, 18).addBox(20.0F, -2.0F, -36.0F, 4.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.0F, -0.75F, 44.0F, 0.0F, 0.5236F, 0.0F));

        return LayerDefinition.create(meshdefinition, 512, 512);
    }

    @Override
    public void setupAnim(@NotNull Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        poseStack.pushPose();
        poseStack.translate(0, 1, 0);
        poseStack.scale(0.3f, 0.3f, 0.3f);
        glow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rotor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        controls.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        structure.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        poseStack.popPose();
    }

    @Override
    public @NotNull ModelPart root() {
        return this.root;
    }

    @Override
    public void setupAnimations(ConsoleTile tile, float ageInTicks) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        Capabilities.getCap(Capabilities.TARDIS, Minecraft.getInstance().level).ifPresent(cap -> {
            this.lever_f1_rotate_z.zRot = (float)Math.toRadians(cap.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get()).get() ? 20 : 170);

            this.globe_rotate_y.zRot = (float)Math.toRadians((cap.getControlDataOrCreate(ControlRegistry.RANDOMIZER.get()).animationStartTime * 720) + 45);

            float facingRot = cap.getControlDataOrCreate(ControlRegistry.FACING.get()).get().toYRot();
            facingRot -= 360.0F * (cap.getControlDataOrCreate(ControlRegistry.FACING.get()).get().toYRot());
            this.rotation_crank_rotate_y.yRot = (float)Math.toRadians(facingRot);

            float doorRot = cap.getInteriorManager().getDoorHandler().getDoorState() == DoorState.CLOSED ? 0 : 180;
            doorRot += 180;
            this.door_crank_rotate_y.yRot = (float)Math.toRadians(doorRot);

            this.needle_a1_rotate_y.yRot = (float)Math.toRadians(cap.getSubsystem(SubsystemRegistry.STABILIZERS.get()).get().isActivated() ? 45 : -45);

            float throttleAmount = cap.getControlDataOrCreate(ControlRegistry.THROTTLE.get()).get();
            this.leaver_b1_rotate_z.zRot = (float)Math.toRadians(80 - (throttleAmount * 150));

            this.cord_slider_slide_x.x = (float)Math.toRadians(4 + (-9 * (cap.getControlDataOrCreate(ControlRegistry.INCREMENT.get()).get() / (float) IncrementControl.VALUES.length)));

            float landTypeRotMiddle = cap.getControlDataOrCreate(ControlRegistry.LANDING_TYPE.get()).get() == LandingType.UP ? -1 : 10;
            float landTypeRotSide = cap.getControlDataOrCreate(ControlRegistry.LANDING_TYPE.get()).get() == LandingType.UP ? 10 : -1;

            this.sliderknob_c3_slide_x.x = this.sliderknob_c1_slide_x.x = (float)Math.toRadians(landTypeRotSide);
            this.sliderknob_c2_slide_x.x = (float)Math.toRadians(landTypeRotMiddle);

            this.refuler.y = cap.getControlDataOrCreate(ControlRegistry.REFUELER.get()).get() ? 0.0f : (float) 0.0;

            this.radio_needle.zRot = (float)Math.toRadians(11.5 - Math.cos(cap.getControlDataOrCreate(ControlRegistry.COMMUNICATOR.get()).animationStartTime * 0.1) * 15);

            this.scrying_glass.yRot = (float)Math.toRadians(-80 + Math.cos(cap.getControlDataOrCreate(ControlRegistry.TELEPATHICS.get()).animationStartTime * 0.5) * -20);

            float timeToRotate = 10;
            float loopTime = 60;
            float rotTime = Minecraft.getInstance().level.getGameTime() % loopTime;
            float threshold = loopTime - timeToRotate;
            if(rotTime >= threshold) {

                float angle = ((threshold - rotTime) / timeToRotate) * 180;

                this.hourflip_rotate_x.xRot = (float)Math.toRadians(angle);
            }

        });

    }


}
