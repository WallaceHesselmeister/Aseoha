package com.code.aseoha.block;

import com.code.aseoha.backport.ntm.block.RailingBlock;
import com.code.aseoha.block.backport.AzaleaBlock;
import com.code.aseoha.block.control.*;
import com.code.aseoha.items.AseohaItemGroups;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.OakTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.ArsEggBlock;
import net.tardis.mod.blocks.RoundelBlock;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

import static com.code.aseoha.aseoha.MODID;
import static com.code.aseoha.items.AseohaItems.ITEMS;

@SuppressWarnings("deprecation")
public class AseohaBlocks {
    public static ToIntFunction<BlockState> maxLightLevel = BlockState -> 15;
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final Material IRON = (new Material.Builder(MaterialColor.METAL)).build();

    private static ToIntFunction<BlockState> litBlockEmission(int light) {
        return (p_lambda$litBlockEmission$34_1_) -> (Boolean)p_lambda$litBlockEmission$34_1_.getValue(BlockStateProperties.LIT) ? light : 0;
    }

    public static final RegistryObject<Block> TRIBOPHYSICAL_WAVEFORM_MACRO_KINETIC_EXTRAPOLATOR = registerBlock("tribophysical_waveform_macro_kinetic_extrapolator",
            () -> setUpBlock(new ExtrapolatorShieldBlock(AbstractBlock.Properties.of(Material.STONE))));

    /*****************************  ROUNDELS  **********************************/

    public static final RegistryObject<Block> HELLBENT_ROUNDEL1 = registerBlock("hb_roundel01",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> HELLBENT_ROUNDEL2 = registerBlock("hb_roundel02",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> HELLBENT_ROUNDEL3 = registerBlock("hb_roundel03",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> COPPER_ROUNDEL = registerBlock("copper_roundel",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL = registerBlock("orange_terracotta_roundel",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL_HALF = registerBlock("orange_terracotta_roundel_half",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));


    /**********************************  LEGACY NTM ROUNDELS  ********************************/


//    public static final RegistryObject<Block> MEGLOS_ROUNDEL1 = registerNoItemBlock("mg_roundel1",
//            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));
//
//    public static final RegistryObject<Block> MEGLOS_ROUNDEL2 = registerNoItemBlock("mg_roundel2",
//            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));
//
//    public static final RegistryObject<Block> MEGLOS_ROUNDEL3 = registerNoItemBlock("mg_roundel3",
//            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));
//
//    public static final RegistryObject<Block> MEGLOS_ROUNDEL4 = registerNoItemBlock("mg_roundel4",
//            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));
//
//    public static final RegistryObject<Block> MEGLOS_ROUNDEL5 = registerNoItemBlock("mg_roundel5",
//            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> WORKBENCH = registerBlock("workbench",
            () -> new WorkbenchBlock(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> MOLECULAR_ASSEMBLER = registerBlock("molecular_assembler",
            () -> new WorkbenchBlock(Block.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    /** Eye Of Harmony Blocks **/

    public static final RegistryObject<Block> ZERO_POINT_DWARF_STAR_ALLOY = registerBlock("zero_point_dwarf_star_alloy",
            () -> setUpBlock(new ZeroPointDwarfStarAlloyBlock()));

    public static final RegistryObject<Block> EYE_OF_HARMONY = registerBlock("eye_of_harmony",
            () -> new EOHLink(Block.Properties.of(Material.METAL).strength(12f).lightLevel(BlockState -> 15).noOcclusion()));

    public static final RegistryObject<Block> HARMONIC_PILLAR = registerBlock("harmonic_pillar",
            () -> setUpBlock(new EOHPillar(Block.Properties.of(Material.METAL).strength(1.25F, 5.25F).lightLevel(BlockState -> 2).noOcclusion())));

    /*********************************************** MODULAR CONSOLES **********************************************************/
    public static RegistryObject<Block> FLIGHT_BUTTON = registerModularBlock("flight_button",
            () -> setUpBlock(new FlightButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> FACING_CONTROL = registerModularBlock("facing_control",
            () -> setUpBlock(new Facing(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    //P.S Yes I know it is spelt Handbrake not Handbreak.
    public static RegistryObject<Block> HANDBRAKE_CONTROL = registerModularBlock("handbreak_control",
            () -> setUpBlock(new Handbreak(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> INC_CONTROL = registerModularBlock("inc_control",
            () -> setUpBlock(new IncMod(AbstractBlock.Properties.of(Material.DECORATION).lightLevel(litBlockEmission(7)).strength(1.25F, 5.25F).noCollission())));

    public static RegistryObject<Block> RANDOMIZER_CONTROL = registerModularBlock("randomizer_control",
            () -> setUpBlock(new RandomizeButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> REFUELER_CONTROL = registerModularBlock("refueler_control",
            () -> setUpBlock(new Refueller(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> X_CONTROL = registerModularBlock("x_control",
            () -> setUpBlock(new XButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> Y_CONTROL = registerModularBlock("y_control",
            () -> setUpBlock(new YButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> Z_CONTROL = registerModularBlock("z_control",
            () -> setUpBlock(new ZButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> DIMENSIONAL_BUTTON = registerModularBlock("dimensional_button",
            () -> setUpBlock(new DimensionButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));







//    public static RegistryObject<Block> COOL_FLIGHT_BUTTON = registerModularBlock("cool_flight_button",
//            () -> setUpBlock(new FlightButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));
//
//    public static RegistryObject<Block> COOL_FACING_CONTROL = registerModularBlock("cool_facing_control",
//            () -> setUpBlock(new Facing(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));
//
//    //P.S Yes I know it is spelled Handbrake not Handbreak.
//    public static RegistryObject<Block> COOL_HANDBREAK_CONTROL = registerModularBlock("cool_handbreak_control",
//            () -> setUpBlock(new Handbreak(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));
//
//    public static RegistryObject<Block> COOL_INC_CONTROL = registerModularBlock("cool_inc_control",
//            () -> setUpBlock(new IncMod(AbstractBlock.Properties.of(Material.DECORATION).lightLevel(litBlockEmission(7)).strength(1.25F, 5.25F).noCollission())));
//
//    public static RegistryObject<Block> COOL_RANDOMIZER_CONTROL = registerModularBlock("cool_randomizer_control",
//            () -> setUpBlock(new RandomizeButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));
//
//    public static RegistryObject<Block> COOL_REFUELER_CONTROL = registerModularBlock("cool_refueler_control",
//            () -> setUpBlock(new Refueller(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));
//
////    public static RegistryObject<Block> THROTTLE_CONTROL = registerBlock("throttle_control",
////            () -> setUpBlock(new Throttle(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> COOL_X_CONTROL = registerModularBlock("cool_x_control",
            () -> setUpBlock(new XButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> COOL_Y_CONTROL = registerModularBlock("cool_y_control",
            () -> setUpBlock(new YButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> COOL_Z_CONTROL = registerModularBlock("cool_z_control",
            () -> setUpBlock(new ZButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static final RegistryObject<Block> FAULTLOCATOR = registerBlock("faultlocator", () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE).noOcclusion(), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> FAULTLOCATOR_S = registerBlock("faultlocator_s", () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE).noOcclusion(), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> COATRACK = registerBlock("coatrack",
            () -> new CoatRack(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F).noOcclusion()));

    public static final RegistryObject<Block> BLUE_CRYSTAL = registerBlock("blue_crystal",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F).sound(SoundType.GLASS)));

//    public static final RegistryObject<Block> CRYSTALLINE_WALL = registerBlock("crystalline_wall",
//            () -> new WallBlock(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F).sound(SoundType.GLASS)));

    public static final RegistryObject<Block> GALLIFREY_SAND = registerBlock("gallifrey_sand",
            () -> new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> SKARO_SAND = registerBlock("skaro_sand",
            () -> new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> TRENZALORE_SAND = registerBlock("trenzalore_sand",
            () -> new SandBlock(14406560, AbstractBlock.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> FAT_BLOCK = registerBlock("fat_block",
            () -> new Block(AbstractBlock.Properties.of(Material.CLAY, MaterialColor.CLAY).strength(0.3F).sound(SoundType.SAND)));

    /****************************  1.20 BACKPORTED  *************************/
    public static final RegistryObject<Block> OCHRE_FROGLIGHT = registerBlock("ochre_froglight",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE).strength(0.3F).lightLevel(maxLightLevel).noOcclusion()));

    public static final RegistryObject<Block> VERDANT_FROGLIGHT = registerBlock("verdant_froglight",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE).strength(0.3F).lightLevel(maxLightLevel).noOcclusion()));

    public static final RegistryObject<Block> PEARLESENT_FROGLIGHT = registerBlock("pearlescent_froglight",
            () -> new RotatedPillarBlock(AbstractBlock.Properties.of(Material.STONE).strength(0.3F).lightLevel(maxLightLevel).noOcclusion()));

    public static final RegistryObject<Block> MANGROVE_PLANKS = registerBlock("mangrove_planks",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> MANGROVE_STAIRS = registerBlock("mangrove_stairs", () -> new StairsBlock(MANGROVE_PLANKS.get().defaultBlockState(), AbstractBlock.Properties.copy(MANGROVE_PLANKS.get()).noOcclusion()));

    public static final RegistryObject<Block> AZALEA = registerBlock("azalea",() -> new AzaleaBlock(new OakTree(), AbstractBlock.Properties.of(Material.LEAVES).instabreak().noOcclusion()));

    public static final RegistryObject<Block> FLOWERING_AZALEA = registerBlock("flowering_azalea",() -> new AzaleaBlock(new OakTree(), AbstractBlock.Properties.of(Material.LEAVES).instabreak().noOcclusion()));

    public static final RegistryObject<Block> AZALEA_LEAVES = registerBlock("azalea_leaves", () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).noOcclusion()));

    public static final RegistryObject<Block> FLOWERING_AZALEA_LEAVES = registerBlock("flowering_azalea_leaves", () -> new LeavesBlock(AbstractBlock.Properties.of(Material.LEAVES).noOcclusion()));

//    public static final RegistryObject<Block> CHISELED_BOOKSHELF = registerBlock((String)"chiseled_bookshelf", () -> new ChiseledBookShelfBlock(AbstractBlock.Properties.of(Material.DECORATION).strength(1.5F)));

    //    FLOWERING_AZALEA = register((String)"flowering_azalea", new AzaleaBlock(Properties.of().mapColor(MapColor.PLANT).forceSolidOff().instabreak().sound(SoundType.FLOWERING_AZALEA).noOcclusion().pushReaction(PushReaction.DESTROY)));

//    public static RegistryObject<Block> EOH = registerBlock("eoh",
//            () -> setUpBlock(new EyeOfHarmonyBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));


//    public static RegistryObject<Block> PORTAL_BLOCK = registerBlock("portal_block",
//            () -> setUpBlock(new NetherPortalBlock(AbstractBlock.Properties.of(Material.PORTAL).strength(1.25F, 5.25F).noOcclusion())));

//    public static final RegistryObject<Block> LOOTCRATE = registerBlock("lootcrate",
//            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
//                    .noOcclusion()));
//
//    public static final RegistryObject<Block> LOOTCRATEX = registerBlock("lootcratex",
//            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
//                    .noOcclusion()));


//    public static final RegistryObject<Block> COPPER_COLUMN = registerBlock("copper_column",
//            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
//                    .noOcclusion()));
//
//    public static final RegistryObject<Block> COPPER_COLUMN_TOP = registerBlock("copper_column_top",
//            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
//                    .noOcclusion()));



    public static final RegistryObject<Block> TOASTER = registerBlock("toaster",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F).noOcclusion()));

    /*****************************  LEGACY NTM  *************************/

    public static final RegistryObject<Block> HELLBENT_POLE = registerBlock("hb_pole",
            () -> new HBPillar(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F).noOcclusion()));

    public static final RegistryObject<Block> HELLBENT_HEX = registerBlock("hb_hex",
            () -> setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> HELLBENT_GLASS01 = registerBlock("hb_glass01",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS02 = registerBlock("hb_glass02",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS03 = registerBlock("hb_glass03",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS04 = registerBlock("hb_glass04",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS05 = registerBlock("hb_glass05",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS06 = registerBlock("hb_glass06",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS07 = registerBlock("hb_glass07",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_GLASS08 = registerBlock("hb_glass08",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_VENT = registerBlock("hb_vent", () ->
            setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F)));

    public static final RegistryObject<Block> HELLBENT_FLOOR = registerBlock("hb_floor",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_WALL = registerBlock("hb_wall",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_WALLSILVER = registerBlock("hb_wallsilver",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    /************************CONSOLES**********************/

    public static RegistryObject<Block> console_copper = registerNoItemBlock("console_copper", () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_takomak = registerNoItemBlock("console_takomak", () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_battle = registerNoItemBlock("console_battle", () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_brackolin = registerNoItemBlock("console_brackolin", () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_custard = registerNoItemBlock("console_custard", () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_bluemarble = registerNoItemBlock("console_bluemarble", () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_hartnell = registerNoItemBlock("console_hartnell", () -> setUpBlock(new ConsoleBlock()));
//    public static RegistryObject<Block> UPSIDEDOWN_ENGINE = registerBlock("upsidedown_engine", () -> setUpBlock(new TardisEngineBlock()));

    /************************EXTERIORS********************/
    public static RegistryObject<Block> EXTERIOR_CORAL = registerNoItemBlock("exterior_coral",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_COLIN_RICHMOND = registerNoItemBlock("exterior_colin_richmond",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_capaldi = registerNoItemBlock("exterior_capaldi",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_mcgann = registerNoItemBlock("exterior_mcgann",
            () -> setUpBlock(new ExteriorBlock()));


    /************************WhoviansRest****************/

    ////////////////////////EXTERIORS
    public static RegistryObject<Block> exterior_wardrobe = registerNoItemBlock("exterior_wardrobe",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_CAPALDI = registerNoItemBlock("exterior_mk2_capaldi",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_DAVIDSON = registerNoItemBlock("exterior_mk2_davidson",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_HARTNELL = registerNoItemBlock("exterior_mk2_hartnell",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_MCGANN = registerNoItemBlock("exterior_mk2_mcgann",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_PERTWEE = registerNoItemBlock("exterior_mk2_pertwee",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_SMITH = registerNoItemBlock("exterior_mk2_smith",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_TENNANT = registerNoItemBlock("exterior_mk2_tennant",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_MK2_WHITTAKER = registerNoItemBlock("exterior_mk2_whittaker",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_WHITTAKER = registerNoItemBlock("exterior_whittaker",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> EXTERIOR_SUTEKH_TARDIS = registerNoItemBlock("exterior_sutekh_tardis",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_brackolin = registerNoItemBlock("exterior_brackolin",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_rani = registerNoItemBlock("exterior_rani",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_olwarrior = registerNoItemBlock("exterior_olwarrior",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_bluedoctor = registerNoItemBlock("exterior_bluedoctor",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_classic_hartnell = registerNoItemBlock("exterior_classic_hartnell",
            () -> setUpBlock(new ExteriorBlock()));

//    public static RegistryObject<Block> exterior_streetside = registerNoItemBlock("exterior_streetside",
//            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_alfiehudolin = registerNoItemBlock("exterior_alfiehudolin",
            () -> setUpBlock(new ExteriorBlock()));

    ////////////////CONSOLES


//    public static RegistryObject<Block> console_vale = registerNoItemBlock("console_vale",
//            () -> setUpBlock(new ConsoleBlock()));
    //public static RegistryObject<Block> console_smith = registerNoItemBlock("console_smith",
    //        () -> setUpBlock(new ConsoleBlock()));






    //Blocks
    //1.12 Port
    public static final RegistryObject<Block> ars_egg_old = registerBlock("ars_egg_old",
            ArsEggBlock::new);

    public static final RegistryObject<Block> SONIC_WORKBENCH = registerBlock("sonic_workbench",
            SonicWorkbench::new);

    public static final RegistryObject<Block> artron_bank_old = registerBlock("artron_bank_old",
            () -> setUpBlock(new ArtronBank(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));//AbstractBlock.Properties.of(Material.HEAVY_METAL).harvestLevel(3).harvestTool(ToolType.PICKAXE).noOcclusion()));

    public static RegistryObject<Block> foodmachine_old = registerBlock("foodmachine_old",
            () -> setUpBlock(new FoodMachineBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> structure_panel_old = registerBlock("structure_panel_old",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> structure_spawn_old = registerBlock("structure_spawn_old",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> structure_remove_old = registerBlock("structure_remove_old",
            () -> new Block(AbstractBlock.Properties.of(IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> structure_panel_open_old = registerBlock("structure_panel_open_old",
            () -> new Block(AbstractBlock.Properties.of(IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2).strength(1.25F, 5.25F)));

    public static RegistryObject<SlabBlock> megalos_slab = registerBlock("megalos_slab",
            () -> new SlabBlock(AbstractBlock.Properties.of(Material.WOOD)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2).strength(1.25F, 5.25F)
                    .noOcclusion()));

    public static RegistryObject<Block> megalos_block = registerBlock("megalos",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(1.25F, 5.25F)));
    public static RegistryObject<Block> megalos_stripe = registerBlock("megalos_stripe",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> megalos_floor = registerBlock("megalos_floor",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOD).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> megalos_white_full_roundel = registerBlock("megalos_white_full_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel = registerBlock("megalos_white_half_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel_bottom_edge = registerBlock("megalos_white_half_roundel_bottom_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));
    public static RegistryObject<Block> megalos_white_half_roundel_top_edge = registerBlock("megalos_white_half_roundel_top_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel_top = registerBlock("megalos_white_half_roundel_top",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_white_half_roundel_bottom = registerBlock("megalos_white_half_roundel_bottom",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_pillar = registerBlock("megalos_pillar",
            () -> new Block(AbstractBlock.Properties.of(IRON)));

    public static RegistryObject<Block> megalos__full_rouundel = registerBlock("megalos_full_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_half_roundel = registerBlock("megalos_half_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_half_roundel_bottom_edge = registerBlock("megalos_half_roundel_bottom_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_half_roundel_top_edge = registerBlock("megalos_half_roundel_top_edge",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> megalos_pillar_top = registerBlock("megalos_pillar_top",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));



    public static RegistryObject<Block> toyota_lower_hexagon_full = registerBlock("toyota_lower_hexagon_full",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_hexagon_full_lit = registerBlock("toyota_lower_hexagon_full_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> toyota_lower_hexagon_left = registerBlock("toyota_lower_hexagon_left",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_hexagon_left_blank = registerBlock("toyota_lower_hexagon_left_blank",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_hexagon_left_lit = registerBlock("toyota_lower_hexagon_left_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> toyota_lower_hexagon_right = registerBlock("toyota_lower_hexagon_right",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_hexagon_right_blank = registerBlock("toyota_lower_hexagon_right_blank",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_hexagon_right_lit = registerBlock("toyota_lower_hexagon_right_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> toyota_lower_lightstrip = registerBlock("toyota_lower_lightstrip",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_lightstrip_blank = registerBlock("toyota_lower_lightstrip_blank",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_lower_lightstrip_lit = registerBlock("toyota_lower_lightstrip_lit",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> toyota_platform_block = registerBlock("toyota_platform_block",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_platform_edge = registerBlock("toyota_platform_edge",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_roof = registerBlock("toyota_roof",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_roof_roundel = registerBlock("toyota_roof_roundel",
            () -> new RoundelBlock(AbstractBlock.Properties.of(IRON), SoundType.METAL,1,1));

    public static RegistryObject<Block> toyota_upper_divider = registerBlock("toyota_upper_divider",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static final RegistryObject<RedstoneLampBlock> toyota_upper_light_emergency = registerBlock("toyota_upper_light_emergency",
            () -> new RedstoneLampBlock(AbstractBlock.Properties.of(Material.GLASS).strength(1.25F, 5.25F)));

    public static final RegistryObject<RedstoneLampBlock> toyota_upper_light = registerBlock("toyota_upper_light",
            () -> new RedstoneLampBlock(AbstractBlock.Properties.of(Material.GLASS).strength(1.25F, 5.25F).lightLevel(BlockState -> 15)));

    public static RegistryObject<Block> toyota_upper_wall_pattern_bottom_left = registerBlock("toyota_upper_wall_pattern_bottom_left",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_upper_wall_pattern_bottom_middle = registerBlock("toyota_upper_wall_pattern_bottom_middle",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_upper_wall_pattern_bottom_right = registerBlock("toyota_upper_wall_pattern_bottom_right",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_upper_wall_pattern_top_left = registerBlock("toyota_upper_wall_pattern_top_left",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_upper_wall_pattern_top_middle = registerBlock("toyota_upper_wall_pattern_top_middle",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));

    public static RegistryObject<Block> toyota_upper_wall_pattern_top_right = registerBlock("toyota_upper_wall_pattern_top_right",
            () -> new Block(AbstractBlock.Properties.of(IRON).strength(1.25F, 5.25F)));



    // 1.20 NTM BACKPORT

    public static final RegistryObject<RailingBlock> RAILING_STEAM = registerBlock("decoration/railing_steam", RailingBlock::create);
    public static final RegistryObject<RailingBlock> RAILING_TUNGSTEN = registerBlock("decoration/railing_tungsten", RailingBlock::create);
    public static final RegistryObject<RailingBlock> RAILING_ALABASTER = registerBlock("decoration/railing_alabaster", RailingBlock::create);





    private static Block setUpBlock(Block block){return block;}


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn);
                return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));
    }

    private static <T extends Block>RegistryObject<T> registerModularBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerModularBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerModularBlockItem(String name, RegistryObject<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(AseohaItemGroups.ASEOHA_MODULAR_GROUP)));
    }

    private static <T extends Block>RegistryObject<T> registerNoItemBlock(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }



    public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
    }
}
