package com.code.aseoha.block;

import com.code.aseoha.entities.ModEntityTypes;
import com.code.aseoha.items.ModItemGroup;
import com.code.aseoha.items.ModItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.item.Item;
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
import static com.code.aseoha.items.ModItems.ITEMS;

public class ModBlocks {
    public static ToIntFunction<BlockState> maxLightLevel = BlockState -> 15;
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final Material IRON = (new Material.Builder(MaterialColor.METAL)).build();



//    public static final RegistryObject<ModSpawnEggItem> PIGEON_SPAWN_EGG = ITEMS.register("pigeon_spawn_egg",
//            () -> new ModSpawnEggItem(ModEntityTypes.PIGEON, 0x879995, 0x576ABC,
//                    new Item.Properties().tab(ModItemGroup.ASEOHA_GROUP)));



    /*****************************  ROUNDELS  **********************************/

    public static final RegistryObject<Block> HELLBENT_ROUNDEL1 = registerBlock("hb_roundel01",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> HELLBENT_ROUNDEL2 = registerBlock("hb_roundel02",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> HELLBENT_ROUNDEL3 = registerBlock("hb_roundel03",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> COPPER_ROUNDEL = registerBlock("copper_roundel",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL = registerBlock("orange_terracotta_roundel",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL_HALF = registerBlock("orange_terracotta_roundel_half",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });


    /**********************************  LEGACY NTM ROUNDELS  ********************************/


    public static final RegistryObject<Block> MEGLOS_ROUNDEL1 = registerBlock("mg_roundel1",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> MEGLOS_ROUNDEL2 = registerBlock("mg_roundel2",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> MEGLOS_ROUNDEL3 = registerBlock("mg_roundel3",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> MEGLOS_ROUNDEL4 = registerBlock("mg_roundel4",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> MEGLOS_ROUNDEL5 = registerBlock("mg_roundel5",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });


    /*****************************  MISC  *************************************/
    public static final RegistryObject<Block> FAULTLOCATOR = registerBlock("faultlocator",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> FAULTLOCATOR_S = registerBlock("faultlocator_s",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> COATRACK = registerBlock("coatrack",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
                    .noCollission()));

    public static RegistryObject<Block> EOH = registerBlock("eoh",
            () -> setUpBlock(new EyeOfHarmonyBlock(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

    public static RegistryObject<Block> FLIGHT_BUTTON = registerBlock("flight_button",
            () -> setUpBlock(new FlightButton(AbstractBlock.Properties.of(Material.HEAVY_METAL).strength(1.25F, 5.25F).noOcclusion())));

//    public static final RegistryObject<Block> LOOTCRATE = registerBlock("lootcrate",
//            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
//                    .noOcclusion()));
//
//    public static final RegistryObject<Block> LOOTCRATEX = registerBlock("lootcratex",
//            () -> new Block(AbstractBlock.Properties.of(Material.WOOD)
//                    .noOcclusion()));


    public static final RegistryObject<Block> COPPER_COLUMN = registerBlock("copper_column",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
                    .noOcclusion()));

    public static final RegistryObject<Block> COPPER_COLUMN_TOP = registerBlock("copper_column_top",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
                    .noOcclusion()));



    public static final RegistryObject<Block> TOASTER = registerBlock("toaster",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
                    .noOcclusion()));

    /*****************************  LEGACY NTM  *************************/

    public static final RegistryObject<Block> HELLBENT_POLE = registerBlock("hb_pole",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)
                    .noOcclusion()
                    .noCollission()));

    public static final RegistryObject<Block> HELLBENT_HEX = registerBlock("hb_hex",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

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

    public static final RegistryObject<Block> HELLBENT_VENT = registerBlock("hb_vent",
            () -> {
                return (net.tardis.mod.blocks.RoundelBlock) setUpBlock(new RoundelBlock(AbstractBlock.Properties.of(Material.STONE), SoundType.STONE, 1.25F, 4.2F));
            });

    public static final RegistryObject<Block> HELLBENT_FLOOR = registerBlock("hb_floor",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_WALL = registerBlock("hb_wall",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    public static final RegistryObject<Block> HELLBENT_WALLSILVER = registerBlock("hb_wallsilver",
            () -> new Block(AbstractBlock.Properties.of(Material.STONE).strength(1.25F, 5.25F)));

    /************************CONSOLES**********************/


    public static final RegistryObject<Block> console_copper = registerNoItemBlock("console_copper", () -> {
        return setUpBlock(new ConsoleBlock());//return (ConsoleBlock) setUpBlock(new ConsoleBlock());
    });
            //registerBlock("console_copper",
//            () -> new net.tardis.mod.blocks.ConsoleBlock());

    /************************EXTERIORS********************/
    public static RegistryObject<Block> EXTERIOR_CORAL = registerNoItemBlock("exterior_coral",
            () -> setUpBlock(new ExteriorBlock()));

    public static RegistryObject<Block> exterior_capaldi = registerNoItemBlock("exterior_capaldi",
            () -> setUpBlock(new ExteriorBlock()));


    /************************WhoviansRest****************/

    ////////////////////////EXTERIORS
    public static RegistryObject<Block> exterior_wardrobe = registerNoItemBlock("exterior_wardrobe",
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


    public static RegistryObject<Block> console_vale = registerNoItemBlock("console_vale",
            () -> setUpBlock(new ConsoleBlock()));
    //public static RegistryObject<Block> console_smith = registerNoItemBlock("console_smith",
    //        () -> setUpBlock(new ConsoleBlock()));
    public static RegistryObject<Block> console_brackolin = registerNoItemBlock("console_brackolin",
            () -> setUpBlock(new ConsoleBlock()));





    //Blocks
    //1.12 Port
    public static final RegistryObject<Block> ars_egg_old = registerBlock("ars_egg_old",
            ArsEggBlock::new);
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
            () -> new RedstoneLampBlock(AbstractBlock.Properties.of(Material.GLASS).strength(1.25F, 5.25F)));

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







    private static Block setUpBlock(Block block){return block;}


    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
                RegistryObject<T> toReturn = BLOCKS.register(name, block);
                registerBlockItem(name, toReturn);
                return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.ASEOHA_GROUP)));
    }

    private static <T extends Block>RegistryObject<T> registerNoItemBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
    }
}
