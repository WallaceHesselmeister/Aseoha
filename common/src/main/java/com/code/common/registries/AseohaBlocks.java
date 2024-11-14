package com.code.common.registries;

import com.code.common.GrammarNazi;
import com.code.common.blocks.IAmARoundel;
import com.code.common.blocks.RoundelBlock;
import com.code.common.items.AseohaTabs;
import com.code.common.blocks.RoundelBlock;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static com.code.aseoha.MOD_ID;
import static net.minecraft.world.level.material.MapColor.METAL;

public class AseohaBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    /** Need this so I can use a foreach from the BLOCKS to register more blocks without getting a ConcurrentModifierException **/
    public static final DeferredRegister<Block> ROUNDELS_LIT = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    /** Need this for alternating roundels to automatically generate **/
    public static final DeferredRegister<Block> ALTERNATING_ROUNDELS = DeferredRegister.create(MOD_ID, Registries.BLOCK);

    /** This is used for Blue Roundels (Duh) **/
    public static final DeferredRegister<Block> BLUE_ROUNDELS = DeferredRegister.create(MOD_ID, Registries.BLOCK);
    //    Registrar<Item> items = MANAGER.get().get(Registries.ITEM);

//    public static final RegistrySupplier<Block> EXAMPLE = registerBlock("golden_potato", () -> new Block(BlockBehaviour.Properties.of()));


    public static ToIntFunction<BlockState> maxLightLevel = BlockState -> 15;
    public static final MapColor IRON = (METAL);

    private static ToIntFunction<BlockState> litBlockEmission(int light) {
        return (p_lambda$litBlockEmission$34_1_) -> (Boolean) p_lambda$litBlockEmission$34_1_.getValue(BlockStateProperties.LIT) ? light : 0;
    }

    /*****************************  ROUNDELS  **********************************/

//    public static final RegistrySupplier<Block> HELLBENT_ROUNDEL1 = registerBlock("hb_roundel01",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_ROUNDEL2 = registerBlock("hb_roundel02",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_ROUNDEL3 = registerBlock("hb_roundel03",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));

//    public static final RegistrySupplier<Block> COPPER_ROUNDEL = registerBlock("copper_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));

//    public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_ROUNDEL = registerBlock("orange_terracotta_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> ORANGE_TERRACOTTA_ROUNDEL_HALF = registerBlock("orange_terracotta_roundel_half",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));


    /**********************************  LEGACY NTM ROUNDELS  ********************************/


//    public static final RegistrySupplier<Block> MEGLOS_ROUNDEL1 = registerBlock("mg_roundel1",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> MEGLOS_ROUNDEL2 = registerBlock("mg_roundel2",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> MEGLOS_ROUNDEL3 = registerBlock("mg_roundel3",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> MEGLOS_ROUNDEL4 = registerBlock("mg_roundel4",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> MEGLOS_ROUNDEL5 = registerBlock("mg_roundel5",
//            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));

//    public static final RegistrySupplier<Block> CORAL = registerBlock("tardis_coral",
//            () -> new Coral(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

//    public static final RegistrySupplier<Block> WORKBENCH = registerBlock("workbench",
//            () -> new WorkbenchBlock(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

//    public static final RegistrySupplier<Block> EYE_OF_HARMONY = registerBlock("eye_of_harmony",
//            () -> new EOH(Block.Properties.of(METAL).strength(1.25F, 5.25F).lightLevel(BlockState -> 15).noOcclusion()));

//    public static final RegistrySupplier<Block> HARMONIC_PILLAR = registerBlock("harmonic_pillar",
//            () -> setUpBlock(new EOHPillar(Block.Properties.of(METAL).strength(1.25F, 5.25F).lightLevel(BlockState -> 2).noOcclusion())));

    public static final RegistrySupplier<Block> FAULTLOCATOR = registerBlock("faultlocator", () -> new Block(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.STONE).strength(1.25F, 4.2F)));

    public static final RegistrySupplier<Block> FAULTLOCATOR_S = registerBlock("faultlocator_s", () -> new Block(BlockBehaviour.Properties.of().noOcclusion().sound(SoundType.STONE).strength(1.25F, 4.2F)));

//    public static final RegistrySupplier<Block> COATRACK = registerBlock("coatrack",
//            () -> new CoatRack(BlockBehaviour.Properties.of().strength(1.25F, 5.25F).noOcclusion()));

    public static final RegistrySupplier<Block> BLUE_CRYSTAL = registerBlock("blue_crystal",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.GLASS)));

//    public static final RegistrySupplier<Block> CRYSTALLINE_WALL = registerBlock("crystalline_wall",
//            () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F).sound(SoundType.)));

    public static final RegistrySupplier<Block> GALLIFREY_SAND = registerBlock("gallifrey_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    public static final RegistrySupplier<Block> SKARO_SAND = registerBlock("skaro_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    public static final RegistrySupplier<Block> TRENZALORE_SAND = registerBlock("trenzalore_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    public static final RegistrySupplier<Block> TOASTER = registerBlock("toaster",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F).noOcclusion()));

    /*****************************  LEGACY NTM  *************************/

//    public static final RegistrySupplier<Block> HELLBENT_POLE = registerBlock("hb_pole",
//            () -> new HBPillar(BlockBehaviour.Properties.of().strength(1.25F, 5.25F).noOcclusion()));

    public static final RegistrySupplier<Block> HELLBENT_HEX = registerBlock("hb_hex",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));

//    public static final RegistrySupplier<Block> HELLBENT_01 = registerBlock("hb_glass01",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_02 = registerBlock("hb_glass02",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_03 = registerBlock("hb_glass03",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_04 = registerBlock("hb_glass04",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_05 = registerBlock("hb_glass05",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_06 = registerBlock("hb_glass06",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_07 = registerBlock("hb_glass07",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_08 = registerBlock("hb_glass08",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_VENT = registerBlock("hb_vent", () ->
//            new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_FLOOR = registerBlock("hb_floor",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_WALL = registerBlock("hb_wall",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<Block> HELLBENT_WALLSILVER = registerBlock("hb_wallsilver",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    /************************CONSOLES**********************/

//    public static RegistrySupplier<Block> console_copper = registerNoItemBlock("console_copper", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> console_takomak = registerNoItemBlock("console_takomak", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> console_battle = registerNoItemBlock("console_battle", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> console_brackolin = registerNoItemBlock("console_brackolin", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> console_custard = registerNoItemBlock("console_custard", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> console_bluemarble = registerNoItemBlock("console_bluemarble", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> console_hartnell = registerNoItemBlock("console_hartnell", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistrySupplier<Block> UPSIDEDOWN_ENGINE = registerBlock("upsidedown_engine", () -> setUpBlock(new TardisEngineBlock()));

    /************************EXTERIORS********************/
//    public static RegistrySupplier<Block> EXTERIOR_CORAL = registerNoItemBlock("exterior_coral",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_capaldi = registerNoItemBlock("exterior_capaldi",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_mcgann = registerNoItemBlock("exterior_mcgann",
//            () -> setUpBlock(new ExteriorBlock()));


    /************************WhoviansRest****************/

    ////////////////////////EXTERIORS
//    public static RegistrySupplier<Block> exterior_wardrobe = registerNoItemBlock("exterior_wardrobe",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_brackolin = registerNoItemBlock("exterior_brackolin",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_rani = registerNoItemBlock("exterior_rani",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_olwarrior = registerNoItemBlock("exterior_olwarrior",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_bluedoctor = registerNoItemBlock("exterior_bluedoctor",
//            () -> setUpBlock(new ExteriorBlock()));
//
//    public static RegistrySupplier<Block> exterior_classic_hartnell = registerNoItemBlock("exterior_classic_hartnell",
//            () -> setUpBlock(new ExteriorBlock()));

//    public static RegistrySupplier<Block> exterior_streetside = registerNoItemBlock("exterior_streetside",
//            () -> setUpBlock(new ExteriorBlock()));

//    public static RegistrySupplier<Block> exterior_alfiehudolin = registerNoItemBlock("exterior_alfiehudolin",
//            () -> setUpBlock(new ExteriorBlock()));

    ////////////////CONSOLES


//    public static RegistrySupplier<Block> console_vale = registerNoItemBlock("console_vale",
//            () -> setUpBlock(new ConsoleBlock()));
    //public static RegistrySupplier<Block> console_smith = registerNoItemBlock("console_smith",
    //        () -> setUpBlock(new ConsoleBlock()));


    //Blocks
    //1.12 Port
//    public static final RegistrySupplier<Block> ars_egg_old = registerBlock("ars_egg_old",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(2.0F, 6.0F)));

//    public static final RegistrySupplier<Block> SONIC_WORKBENCH = registerBlock("sonic_workbench",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(2.0F, 6.0F)));
//
//
//    public static final RegistrySupplier<Block> artron_bank_old = registerBlock("artron_bank_old",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.25F, 5.25F).noOcclusion()));
//
//    public static RegistrySupplier<Block> foodmachine_old = registerBlock("foodmachine_old",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.25F, 5.25F).noOcclusion()));
//
//    public static RegistrySupplier<Block> structure_panel_old = registerBlock("structure_panel_old",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.25F, 5.25F)));
//
//
//    public static RegistrySupplier<Block> structure_spawn_old = registerBlock("structure_spawn_old",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> structure_remove_old = registerBlock("structure_remove_old",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.25F, 5.25F)));
//
//
//    public static RegistrySupplier<Block> structure_panel_open_old = registerBlock("structure_panel_open_old",
//            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.25F, 5.25F)));
//
//
//    public static RegistrySupplier<SlabBlock> megalos_slab = registerBlock("megalos_slab",
//            () -> new SlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).strength(1.25F, 5.25F)));
//
//
//    public static RegistrySupplier<Block> megalos_block = registerBlock("megalos",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> megalos_stripe = registerBlock("megalos_stripe",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> megalos_floor = registerBlock("megalos_floor",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> megalos_white_full_roundel = registerBlock("megalos_white_full_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_white_half_roundel = registerBlock("megalos_white_half_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_white_half_roundel_bottom_edge = registerBlock("megalos_white_half_roundel_bottom_edge",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//    public static RegistrySupplier<Block> megalos_white_half_roundel_top_edge = registerBlock("megalos_white_half_roundel_top_edge",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_white_half_roundel_top = registerBlock("megalos_white_half_roundel_top",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_white_half_roundel_bottom = registerBlock("megalos_white_half_roundel_bottom",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_pillar = registerBlock("megalos_pillar",
//            () -> new Block(BlockBehaviour.Properties.of()));
//
//    public static RegistrySupplier<Block> megalos__full_rouundel = registerBlock("megalos_full_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_half_roundel = registerBlock("megalos_half_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_half_roundel_bottom_edge = registerBlock("megalos_half_roundel_bottom_edge",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_half_roundel_top_edge = registerBlock("megalos_half_roundel_top_edge",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> megalos_pillar_top = registerBlock("megalos_pillar_top",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_full = registerBlock("toyota_lower_hexagon_full",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_full_lit = registerBlock("toyota_lower_hexagon_full_lit",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_left = registerBlock("toyota_lower_hexagon_left",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_left_blank = registerBlock("toyota_lower_hexagon_left_blank",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_left_lit = registerBlock("toyota_lower_hexagon_left_lit",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_right = registerBlock("toyota_lower_hexagon_right",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_right_blank = registerBlock("toyota_lower_hexagon_right_blank",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_hexagon_right_lit = registerBlock("toyota_lower_hexagon_right_lit",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> toyota_lower_lightstrip = registerBlock("toyota_lower_lightstrip",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_lightstrip_blank = registerBlock("toyota_lower_lightstrip_blank",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_lower_lightstrip_lit = registerBlock("toyota_lower_lightstrip_lit",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> toyota_platform_block = registerBlock("toyota_platform_block",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_platform_edge = registerBlock("toyota_platform_edge",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_roof = registerBlock("toyota_roof",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_roof_roundel = registerBlock("toyota_roof_roundel",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));
//
//    public static RegistrySupplier<Block> toyota_upper_divider = registerBlock("toyota_upper_divider",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<RedstoneLampBlock> toyota_upper_light_emergency = registerBlock("toyota_upper_light_emergency",
//            () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static final RegistrySupplier<RedstoneLampBlock> toyota_upper_light = registerBlock("toyota_upper_light",
//            () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F).lightLevel(BlockState -> 15)));
//
//    public static RegistrySupplier<Block> toyota_upper_wall_pattern_bottom_left = registerBlock("toyota_upper_wall_pattern_bottom_left",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_upper_wall_pattern_bottom_middle = registerBlock("toyota_upper_wall_pattern_bottom_middle",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_upper_wall_pattern_bottom_right = registerBlock("toyota_upper_wall_pattern_bottom_right",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_upper_wall_pattern_top_left = registerBlock("toyota_upper_wall_pattern_top_left",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_upper_wall_pattern_top_middle = registerBlock("toyota_upper_wall_pattern_top_middle",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));
//
//    public static RegistrySupplier<Block> toyota_upper_wall_pattern_top_right = registerBlock("toyota_upper_wall_pattern_top_right",
//            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistrySupplier<Block> LATINUM_BLOCK = registerBlock("latinum_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistrySupplier<Block> ACACIA_PLANKS_ROUNDEL = registerBlock("acacia_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.ACACIA_PLANKS));

    public static final RegistrySupplier<Block> BAMBOO_PLANKS_ROUNDEL = registerBlock("bamboo_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BAMBOO_PLANKS));

    public static final RegistrySupplier<Block> BIRCH_PLANKS_ROUNDEL = registerBlock("birch_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BIRCH_PLANKS));

    public static final RegistrySupplier<Block> BLACK_CONCRETE_ROUNDEL = registerBlock("black_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BLACK_CONCRETE));

    public static final RegistrySupplier<Block> BLACK_WOOL_ROUNDEL = registerBlock("black_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BLACK_WOOL));

    public static final RegistrySupplier<Block> BLUE_CONCRETE_ROUNDEL = registerBlock("blue_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BLUE_CONCRETE));

    public static final RegistrySupplier<Block> BLUE_WOOL_ROUNDEL = registerBlock("blue_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BLUE_WOOL));

    public static final RegistrySupplier<Block> BROWN_WOOL_ROUNDEL = registerBlock("brown_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BROWN_WOOL));

    public static final RegistrySupplier<Block> BROWN_CONCRETE_ROUNDEL = registerBlock("brown_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BROWN_CONCRETE));

    public static final RegistrySupplier<Block> CHERRY_PLANKS_ROUNDEL = registerBlock("cherry_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CHERRY_PLANKS));

    public static final RegistrySupplier<Block> CLAY_ROUNDEL = registerBlock("clay_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CLAY));

    public static final RegistrySupplier<Block> COBBLED_DEEPSLATE_ROUNDEL = registerBlock("cobbled_deepslate_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.COBBLED_DEEPSLATE));

    public static final RegistrySupplier<Block> COBBLESTONE_ROUNDEL = registerBlock("cobblestone_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.COBBLESTONE));

    public static final RegistrySupplier<Block> COPPER_BLOCK_ROUNDEL = registerBlock("copper_block_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.COPPER_BLOCK));

    public static final RegistrySupplier<Block> CRIMSON_PLANKS_ROUNDEL = registerBlock("crimson_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CRIMSON_PLANKS));

    public static final RegistrySupplier<Block> CUT_COPPER_ROUNDEL = registerBlock("cut_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CUT_COPPER));

    public static final RegistrySupplier<Block> JUNGLE_PLANKS_ROUNDEL = registerBlock("jungle_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.JUNGLE_PLANKS));

    public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_ROUNDEL = registerBlock("light_blue_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIGHT_BLUE_CONCRETE));

    public static final RegistrySupplier<Block> LIGHT_BLUE_WOOL_ROUNDEL = registerBlock("light_blue_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIGHT_BLUE_WOOL));

    public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_ROUNDEL = registerBlock("light_gray_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIGHT_GRAY_CONCRETE));

    public static final RegistrySupplier<Block> LIGHT_GRAY_WOOL_ROUNDEL = registerBlock("light_gray_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIGHT_GRAY_WOOL));

    public static final RegistrySupplier<Block> LIME_CONCRETE_ROUNDEL = registerBlock("lime_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIME_CONCRETE));

    public static final RegistrySupplier<Block> LIME_WOOL_ROUNDEL = registerBlock("lime_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIME_WOOL));

    public static final RegistrySupplier<Block> MAGENTA_CONCRETE_ROUNDEL = registerBlock("magenta_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.MAGENTA_CONCRETE));

    public static final RegistrySupplier<Block> MAGENTA_WOOL_ROUNDEL = registerBlock("magenta_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.MAGENTA_WOOL));

    public static final RegistrySupplier<Block> MANGROVE_PLANKS_ROUNDEL = registerBlock("mangrove_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.MANGROVE_PLANKS));

    public static final RegistrySupplier<Block> OAK_PLANKS_ROUNDEL = registerBlock("oak_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.OAK_PLANKS));

    public static final RegistrySupplier<Block> ORANGE_CONCRETE_ROUNDEL = registerBlock("orange_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.ORANGE_CONCRETE));

    public static final RegistrySupplier<Block> ORANGE_WOOL_ROUNDEL = registerBlock("orange_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.ORANGE_CONCRETE));

    public static final RegistrySupplier<Block> OXIDIZED_COPPER_ROUNDEL = registerBlock("oxidized_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.OXIDIZED_COPPER));

    public static final RegistrySupplier<Block> OXIDIZED_CUT_COPPER_ROUNDEL = registerBlock("oxidized_cut_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.OXIDIZED_CUT_COPPER));

    public static final RegistrySupplier<Block> PINK_CONCRETE_ROUNDEL = registerBlock("pink_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.PINK_CONCRETE));

    public static final RegistrySupplier<Block> PINK_WOOL_ROUNDEL = registerBlock("pink_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.PINK_WOOL));

    public static final RegistrySupplier<Block> POLISHED_ANDESITE_ROUNDEL = registerBlock("polished_andesite_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.POLISHED_ANDESITE));

    public static final RegistrySupplier<Block> POLISHED_BASALT_ROUNDEL = registerBlock("polished_basalt_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.POLISHED_BASALT));

    public static final RegistrySupplier<Block> POLISHED_BLACKSTONE_ROUNDEL = registerBlock("polished_blackstone_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.POLISHED_BLACKSTONE));

    public static final RegistrySupplier<Block> POLISHED_DEEPSLATE_ROUNDEL = registerBlock("polished_deepslate_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.POLISHED_DEEPSLATE));

    public static final RegistrySupplier<Block> POLISHED_DIORITE_ROUNDEL = registerBlock("polished_diorite_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.POLISHED_DIORITE));

    public static final RegistrySupplier<Block> POLISHED_GRANITE_ROUNDEL = registerBlock("polished_granite_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.POLISHED_GRANITE));

    public static final RegistrySupplier<Block> PURPLE_CONCRETE_ROUNDEL = registerBlock("purple_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.PURPLE_CONCRETE));

    public static final RegistrySupplier<Block> PURPLE_WOOL_ROUNDEL = registerBlock("purple_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.PURPLE_WOOL));

    public static final RegistrySupplier<Block> QUARTZ_BLOCK_ROUNDEL = registerBlock("quartz_block_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.QUARTZ_BLOCK));

    public static final RegistrySupplier<Block> RED_CONCRETE_ROUNDEL = registerBlock("red_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.RED_CONCRETE));

    public static final RegistrySupplier<Block> RED_WOOL_ROUNDEL = registerBlock("red_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.RED_WOOL));

    public static final RegistrySupplier<Block> SMOOTH_QUARTZ_BLOCK_ROUNDEL = registerBlock("smooth_quartz_block_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.SMOOTH_QUARTZ));

    public static final RegistrySupplier<Block> SMOOTH_RED_SANDSTONE_ROUNDEL = registerBlock("smooth_red_sandstone_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.SMOOTH_RED_SANDSTONE));

    public static final RegistrySupplier<Block> SMOOTH_STONE_ROUNDEL = registerBlock("smooth_stone_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.SMOOTH_STONE));

    public static final RegistrySupplier<Block> SPRUCE_PLANKS_ROUNDEL = registerBlock("spruce_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.SPRUCE_PLANKS));

    public static final RegistrySupplier<Block> STONE_ROUNDEL = registerBlock("stone_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.STONE));

    public static final RegistrySupplier<Block> WARPED_PLANKS_ROUNDEL = registerBlock("warped_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.WARPED_PLANKS));

    public static final RegistrySupplier<Block> WEATHERED_COPPER_ROUNDEL = registerBlock("weathered_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.WEATHERED_COPPER));

    public static final RegistrySupplier<Block> WEATHERED_CUT_COPPER_ROUNDEL = registerBlock("weathered_cut_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.WEATHERED_CUT_COPPER));

    public static final RegistrySupplier<Block> WHITE_CONCRETE_ROUNDEL = registerBlock("white_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.WHITE_CONCRETE));

    public static final RegistrySupplier<Block> WHITE_WOOL_ROUNDEL = registerBlock("white_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.WHITE_WOOL));

    public static final RegistrySupplier<Block> YELLOW_CONCRETE_ROUNDEL = registerBlock("yellow_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.YELLOW_CONCRETE));

    public static final RegistrySupplier<Block> YELLOW_WOOL_ROUNDEL = registerBlock("yellow_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.YELLOW_WOOL));

//    public static final RegistrySupplier<Block> ACACIA_ROUNDEL_OFFSET = registerBlock("acacia_planks_roundel_offset",
//            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistrySupplier<Block> CYAN_CONCRETE_ROUNDEL = registerBlock("cyan_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CYAN_CONCRETE));

    public static final RegistrySupplier<Block> CYAN_WOOL_ROUNDEL = registerBlock("cyan_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CYAN_WOOL));

    public static final RegistrySupplier<Block> DARK_OAK_PLANKS_ROUNDEL = registerBlock("dark_oak_planks_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.DARK_OAK_PLANKS));

    public static final RegistrySupplier<Block> DEEPSLATE_ROUNDEL = registerBlock("deepslate_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.DEEPSLATE));

    public static final RegistrySupplier<Block> EXPOSED_COPPER_ROUNDEL = registerBlock("exposed_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.EXPOSED_COPPER));

    public static final RegistrySupplier<Block> EXPOSED_CUT_COPPER_ROUNDEL = registerBlock("exposed_cut_copper_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.EXPOSED_CUT_COPPER));

    public static final RegistrySupplier<Block> GRAY_CONCRETE_HEX_ROUNDEL = registerBlock("gray_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.GRAY_CONCRETE));

    public static final RegistrySupplier<Block> GRAY_CONCRETE_ROUNDEL = registerBlock("gray_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.GRAY_CONCRETE));

    public static final RegistrySupplier<Block> GRAY_WOOL_ROUNDEL = registerBlock("gray_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.GRAY_WOOL));

    public static final RegistrySupplier<Block> GREEN_CONCRETE_ROUNDEL = registerBlock("green_concrete_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.GREEN_CONCRETE));

    public static final RegistrySupplier<Block> GREEN_WOOL_ROUNDEL = registerBlock("green_wool_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.GREEN_WOOL));

    public static final RegistrySupplier<Block> BLACK_CONCRETE_HEX_ROUNDEL = registerBlock("black_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BLACK_CONCRETE));

    public static final RegistrySupplier<Block> BLUE_CONCRETE_HEX_ROUNDEL = registerBlock("blue_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BLUE_CONCRETE));

    public static final RegistrySupplier<Block> BROWN_CONCRETE_HEX_ROUNDEL = registerBlock("brown_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.BROWN_CONCRETE));

    public static final RegistrySupplier<Block> CYAN_CONCRETE_HEX_ROUNDEL = registerBlock("cyan_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.CYAN_CONCRETE));

    public static final RegistrySupplier<Block> GREEN_CONCRETE_HEX_ROUNDEL = registerBlock("green_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.GREEN_CONCRETE));

    public static final RegistrySupplier<Block> LIGHT_BLUE_CONCRETE_HEX_ROUNDEL = registerBlock("light_blue_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIGHT_BLUE_CONCRETE));

    public static final RegistrySupplier<Block> LIGHT_GRAY_CONCRETE_HEX_ROUNDEL = registerBlock("light_gray_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIGHT_GRAY_CONCRETE));

    public static final RegistrySupplier<Block> LIME_CONCRETE_HEX_ROUNDEL = registerBlock("lime_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.LIME_CONCRETE));

    public static final RegistrySupplier<Block> MAGENTA_CONCRETE_HEX_ROUNDEL = registerBlock("magenta_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.MAGENTA_CONCRETE));

    public static final RegistrySupplier<Block> ORANGE_CONCRETE_HEX_ROUNDEL = registerBlock("orange_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.ORANGE_CONCRETE));

    public static final RegistrySupplier<Block> PINK_CONCRETE_HEX_ROUNDEL = registerBlock("pink_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.PINK_CONCRETE));

    public static final RegistrySupplier<Block> PURPLE_CONCRETE_HEX_ROUNDEL = registerBlock("purple_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.PURPLE_CONCRETE));

    public static final RegistrySupplier<Block> RED_CONCRETE_HEX_ROUNDEL = registerBlock("red_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.RED_CONCRETE));

    public static final RegistrySupplier<Block> WHITE_CONCRETE_HEX_ROUNDEL = registerBlock("white_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.WHITE_CONCRETE));

    public static final RegistrySupplier<Block> YELLOW_CONCRETE_HEX_ROUNDEL = registerBlock("yellow_concrete_hex_roundel",
            () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F), Blocks.YELLOW_CONCRETE));


    private static <T extends Block>RegistrySupplier<T> registerBlock(String name, Supplier<T> block){
        RegistrySupplier<T> toReturn = BLOCKS.register(name, block);
        if(Platform.isForge()) {
            registerBlockItem(name, toReturn);
        }
            if (name.contains("roundel") && !name.contains("hex")) {
                registerAltBlock(name + "_alternating", block);
                registerLitBlock(name + "_lit", () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25f, 5.25f).mapColor(MapColor.SAND).lightLevel((blockStatex) -> 15)));
                registerBlueRoundel(name, () -> new RoundelBlock(BlockBehaviour.Properties.of().strength(1.25f, 5.25f)));
        }
        return toReturn;
    }

    private static <T extends Block>RegistrySupplier<T> registerBlueRoundel(String name, @NotNull Supplier<T> block) {
        name = name.replace("roundel", "blue_roundel");
        RegistrySupplier<T> toReturn = BLUE_ROUNDELS.register(name, block);
        if(Platform.isForge()){
            registerBlockItem(name, toReturn);
        }
        return toReturn;
    }

    private static <T extends Block>RegistrySupplier<T> registerAltBlock(String name, Supplier<T> block){
        RegistrySupplier<T> toReturn = ALTERNATING_ROUNDELS.register(name, block);
        if(Platform.isForge()) {
            registerBlockItem(name, toReturn);
        }
        return toReturn;
    }

    private static <T extends Block>RegistrySupplier<T> registerLitBlock(String name, Supplier<T> block) {
        RegistrySupplier<T> toReturn = ROUNDELS_LIT.register(name, block);
        if (Platform.isForge()) {
            registerBlockItem(name, toReturn);
        }
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistrySupplier<T> block) {
        AseohaItems.ITEMS.register(
                name,
                () -> new BlockItem(block.get(), new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB))
        );
    }

    public static void register(){
        BLOCKS.register();
        ROUNDELS_LIT.register();
        ALTERNATING_ROUNDELS.register();
        BLUE_ROUNDELS.register();
    }
}