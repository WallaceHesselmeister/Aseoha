/* (C) TAMA Studios 2025 */
package tama.Blocks;

import static net.tardis.mod.registry.BlockRegistry.TUNGSTEN_PATTERN;
import static tama.aseoha.MODID;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tama.Items.AItems;

public class ABlocks {

    // Create a Deferred Register to hold Blocks which will all be registered under
    // the "aseoha"
    // namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static ToIntFunction<BlockState> maxLightLevel = BlockState -> 15;

    private static ToIntFunction<BlockState> litBlockEmission(int light) {
        return (p_lambda$litBlockEmission$34_1_) ->
                (Boolean) p_lambda$litBlockEmission$34_1_.getValue(BlockStateProperties.LIT) ? light : 0;
    }

    // public static final RegistryObject<Block> CORAL =
    // registerBlock("tardis_coral",
    // () -> new Coral(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    // public static final RegistryObject<Block> WORKBENCH =
    // registerBlock("workbench",
    // () -> new
    // WorkbenchBlock(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    // public static final RegistryObject<Block> EYE_OF_HARMONY =
    // registerBlock("eye_of_harmony",
    // () -> new EOH(Block.Properties.of(METAL).strength(1.25F,
    // 5.25F).lightLevel(BlockState ->
    // 15).noOcclusion()));

    // public static final RegistryObject<Block> HARMONIC_PILLAR =
    // registerBlock("harmonic_pillar",
    // () -> setUpBlock(new EOHPillar(Block.Properties.of(METAL).strength(1.25F,
    // 5.25F).lightLevel(BlockState
    // -> 2).noOcclusion())));

    public static final RegistryObject<Block> QUANTISCOPE = registerBlock(
            "quantiscope",
            () -> new QuantiscopeBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .sound(SoundType.STONE)
                    .strength(1.25F, 4.2F)));

    public static final RegistryObject<Block> FAULTLOCATOR = registerBlock(
            "faultlocator",
            () -> new Block(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .sound(SoundType.STONE)
                    .strength(1.25F, 4.2F)));

    public static final RegistryObject<Block> FAULTLOCATOR_S = registerBlock(
            "faultlocator_s",
            () -> new Block(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .sound(SoundType.STONE)
                    .strength(1.25F, 4.2F)));

    // public static final RegistryObject<Block> COATRACK =
    // registerBlock("coatrack",
    // () -> new CoatRack(BlockBehaviour.Properties.of().strength(1.25F,
    // 5.25F).noOcclusion()));

    public static final RegistryObject<Block> BLUE_CRYSTAL = registerBlock(
            "blue_crystal",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(50.0F, 1200.0F)
                    .sound(SoundType.GLASS)));

    // public static final RegistryObject<Block> CRYSTALLINE_WALL =
    // registerBlock("crystalline_wall",
    // () -> new WallBlock(BlockBehaviour.Properties.of().strength(1.25F,
    // 5.25F).sound(SoundType.)));

    public static final RegistryObject<Block> GALLIFREY_SAND = registerBlock(
            "gallifrey_sand",
            () -> new SandBlock(
                    14406560, BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> SKARO_SAND = registerBlock(
            "skaro_sand",
            () -> new SandBlock(
                    14406560, BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> FAT_BLOCK = registerBlock(
            "fat_block",
            () -> new Block(
                    BlockBehaviour.Properties.of().sound(SoundType.SLIME_BLOCK).strength(0.3F)));

    public static final RegistryObject<Block> TRENZALORE_SAND = registerBlock(
            "trenzalore_sand",
            () -> new SandBlock(
                    14406560, BlockBehaviour.Properties.of().strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> TOASTER = registerBlock(
            "toaster",
            () -> new Block(
                    BlockBehaviour.Properties.of().strength(1.25F, 5.25F).noOcclusion()));

    /***************************** LEGACY NTM *************************/

    // public static final RegistryObject<Block> HELLBENT_POLE =
    // registerBlock("hb_pole",
    // () -> new HBPillar(BlockBehaviour.Properties.of().strength(1.25F,
    // 5.25F).noOcclusion()));

    public static final RegistryObject<Block> HELLBENT_HEX = registerBlock(
            "hb_hex",
            () -> new Block(
                    BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));

    public static final RegistryObject<Block> HELLBENT_01 = registerBlock(
            "hb_glass01", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_02 = registerBlock(
            "hb_glass02", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_03 = registerBlock(
            "hb_glass03", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_04 = registerBlock(
            "hb_glass04", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_05 = registerBlock(
            "hb_glass05", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_06 = registerBlock(
            "hb_glass06", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_07 = registerBlock(
            "hb_glass07", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_08 = registerBlock(
            "hb_glass08", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_VENT = registerBlock(
            "hb_vent",
            () -> new Block(
                    BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1.25F, 4.2F)));

    public static final RegistryObject<Block> HELLBENT_FLOOR = registerBlock(
            "hb_floor", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_WALL = registerBlock(
            "hb_wall", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_WALLSILVER = registerBlock(
            "hb_wallsilver", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> ANTIGRAV = registerBlock(
            "antigrav", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> ANTIGRAV_OFF = registerBlock(
            "antigrav_off", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<SlabBlock> TUNGSTEN_PATTERN_SLAB = registerBlock(
            "tungsten_pattern_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<SlabBlock> TUNGSTEN_PIPES_SLAB = registerBlock(
            "tungsten_pipes_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<StairBlock> TUNGSTEN_PATTERN_STAIR = registerBlock(
            "tungsten_pattern_stair",
            () -> new StairBlock(
                    () -> TUNGSTEN_PATTERN.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    /************************ CONSOLES **********************/

    // public static RegistryObject<Block> console_copper =
    // registerNoItemBlock("console_copper",
    // () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_takomak =
    // registerNoItemBlock("console_takomak",
    // () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_battle =
    // registerNoItemBlock("console_battle",
    // () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_brackolin =
    // registerNoItemBlock("console_brackolin", () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_custard =
    // registerNoItemBlock("console_custard",
    // () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_bluemarble =
    // registerNoItemBlock("console_bluemarble", () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_hartnell =
    // registerNoItemBlock("console_hartnell", () ->
    // setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> UPSIDEDOWN_ENGINE =
    // registerBlock("upsidedown_engine",
    // () ->
    // setUpBlock(new TardisEngineBlock()));

    /************************ EXTERIORS ********************/

    // public static RegistryObject<Block> EXTERIOR_CORAL =
    // registerNoItemBlock("exterior_coral",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_capaldi =
    // registerNoItemBlock("exterior_capaldi",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_mcgann =
    // registerNoItemBlock("exterior_mcgann",
    // () -> setUpBlock(new ExteriorBlock()));

    /************************ WhoviansRest ****************/

    //////////////////////// EXTERIORS
    // public static RegistryObject<Block> exterior_wardrobe =
    // registerNoItemBlock("exterior_wardrobe",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_brackolin =
    // registerNoItemBlock("exterior_brackolin",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_rani =
    // registerNoItemBlock("exterior_rani",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_olwarrior =
    // registerNoItemBlock("exterior_olwarrior",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_bluedoctor =
    // registerNoItemBlock("exterior_bluedoctor",
    // () -> setUpBlock(new ExteriorBlock()));
    //
    // public static RegistryObject<Block> exterior_classic_hartnell =
    // registerNoItemBlock("exterior_classic_hartnell",
    // () -> setUpBlock(new ExteriorBlock()));

    // public static RegistryObject<Block> exterior_streetside =
    // registerNoItemBlock("exterior_streetside",
    // () -> setUpBlock(new ExteriorBlock()));

    // public static RegistryObject<Block> exterior_alfiehudolin =
    // registerNoItemBlock("exterior_alfiehudolin",
    // () -> setUpBlock(new ExteriorBlock()));

    //////////////// CONSOLES

    // public static RegistryObject<Block> console_vale =
    // registerNoItemBlock("console_vale",
    // () -> setUpBlock(new ConsoleBlock()));
    // public static RegistryObject<Block> console_smith =
    // registerNoItemBlock("console_smith",
    // () -> setUpBlock(new ConsoleBlock()));

    // Blocks
    // 1.12 Port
    // public static final RegistryObject<Block> ars_egg_old =
    // registerBlock("ars_egg_old",
    // () -> new
    // Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F,
    // 6.0F)));

    public static final RegistryObject<Block> SONIC_WORKBENCH = registerBlock(
            "sonic_workbench",
            () -> new Block(
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(2.0F, 6.0F)));

    public static final RegistryObject<Block> ARTRON_BANK_OLD = registerBlock(
            "artron_bank_old",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(1.25F, 5.25F)
                    .noOcclusion()));

    public static RegistryObject<Block> FOODMACHINE_OLD = registerBlock(
            "foodmachine_old",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(1.25F, 5.25F)
                    .noOcclusion()));

    public static RegistryObject<Block> STRUCTURE_PANEL_OLD = registerBlock(
            "structure_panel_old",
            () -> new Block(
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> STRUCTURE_SPAWN_OLD = registerBlock(
            "structure_spawn_old",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> STRUCTURE_REMOVE_OLD = registerBlock(
            "structure_remove_old",
            () -> new Block(
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> STRUCTURE_PANEL_OPEN_OLD = registerBlock(
            "structure_panel_open_old",
            () -> new Block(
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.25F, 5.25F)));

    public static RegistryObject<SlabBlock> meglos_SLAB = registerBlock(
            "meglos_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.of().mapColor(MapColor.STONE).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> meglos_BLOCK = registerBlock(
            "meglos", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> meglos_STRIPE = registerBlock(
            "meglos_stripe", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> meglos_FLOOR = registerBlock(
            "meglos_floor", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> meglos_PILLAR =
            registerBlock("meglos_pillar", () -> new Block(BlockBehaviour.Properties.of()));

    public static RegistryObject<Block> meglos_PILLAR_TOP = registerBlock(
            "meglos_pillar_top", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_FULL = registerBlock(
            "toyota_lower_hexagon_full",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_FULL_LIT = registerBlock(
            "toyota_lower_hexagon_full_lit",
            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_LEFT = registerBlock(
            "toyota_lower_hexagon_left",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_LEFT_BLANK = registerBlock(
            "toyota_lower_hexagon_left_blank",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_LEFT_LIT = registerBlock(
            "toyota_lower_hexagon_left_lit",
            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_RIGHT = registerBlock(
            "toyota_lower_hexagon_right",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_RIGHT_BLANK = registerBlock(
            "toyota_lower_hexagon_right_blank",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_HEXAGON_RIGHT_LIT = registerBlock(
            "toyota_lower_hexagon_right_lit",
            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));

    public static RegistryObject<Block> TOYOTA_LOWER_LIGHTSTRIP = registerBlock(
            "toyota_lower_lightstrip",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_LIGHTSTRIP_BLANK = registerBlock(
            "toyota_lower_lightstrip_blank",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_LOWER_LIGHTSTRIP_LIT = registerBlock(
            "toyota_lower_lightstrip_lit",
            () -> new Block(BlockBehaviour.Properties.of().strength(1, 1)));

    public static RegistryObject<Block> TOYOTA_PLATFORM_BLOCK = registerBlock(
            "toyota_platform_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_PLATFORM_EDGE = registerBlock(
            "toyota_platform_edge",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_ROOF = registerBlock(
            "toyota_roof", () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_UPPER_DIVIDER = registerBlock(
            "toyota_upper_divider",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<RedstoneLampBlock> TOYOTA_UPPER_LIGHT_EMERGENCY = registerBlock(
            "toyota_upper_light_emergency",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static final RegistryObject<RedstoneLampBlock> TOYOTA_UPPER_LIGHT = registerBlock(
            "toyota_upper_light",
            () -> new RedstoneLampBlock(
                    BlockBehaviour.Properties.of().strength(1.25F, 5.25F).lightLevel(BlockState -> 15)));

    public static RegistryObject<Block> TOYOTA_UPPER_WALL_PATTERN_BOTTOM_LEFT = registerBlock(
            "toyota_upper_wall_pattern_bottom_left",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_UPPER_WALL_PATTERN_BOTTOM_MIDDLE = registerBlock(
            "toyota_upper_wall_pattern_bottom_middle",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_UPPER_WALL_PATTERN_BOTTOM_RIGHT = registerBlock(
            "toyota_upper_wall_pattern_bottom_right",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_UPPER_WALL_PATTERN_TOP_LEFT = registerBlock(
            "toyota_upper_wall_pattern_top_left",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_UPPER_WALL_PATTERN_TOP_MIDDLE = registerBlock(
            "toyota_upper_wall_pattern_top_middle",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> TOYOTA_UPPER_WALL_PATTERN_TOP_RIGHT = registerBlock(
            "toyota_upper_wall_pattern_top_right",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.25F, 5.25F)));

    public static RegistryObject<Block> CRYSTALLINE_BLOCK = registerBlock(
            "crystalline/crystalline_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)
                    .sound(SoundType.GLASS)
                    .strength(0.5F, 0.25F)));

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        AItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
