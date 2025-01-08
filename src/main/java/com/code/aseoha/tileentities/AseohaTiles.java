package com.code.aseoha.tileentities;
//import com.google.common.base.Supplier;
//import com.mojang.datafixers.types.Type;
//import net.minecraft.block.Block;
//import net.minecraft.tileentity.TileEntity;
//import net.tardis.mod.blocks.TBlocks;
//import net.tardis.mod.blocks.TileBlock;
//import net.tardis.mod.tileentities.TTiles;
//import com.code.aseoha.aseoha;
//import com.code.aseoha.block.ModBlocks;
//import com.code.aseoha.tileentities.consoles.CopperConsoleTile;
//import net.minecraft.tileentity.TileEntityType;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
////import net.tardis.mod.tileentities.consoles.SteamConsoleTile;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class AseohaTiles {
//
//    public static List<TileEntityType<?>> TYPES = new ArrayList();
//    public static final DeferredRegister<TileEntityType<?>> TILES = TTiles.TILES;
//    public static final RegistryObject<TileEntityType<CopperConsoleTile>> CONSOLE_COPPER;
//
//
//    private static <T extends TileEntity> TileEntityType<T> registerTiles(Supplier<T> tile, Block... validBlock) {
//        TileEntityType<T> type = TileEntityType.Builder.of(tile, validBlock).build((Type) null);
//        Block[] var3 = validBlock;
//        int var4 = validBlock.length;
//
//        for (int var5 = 0; var5 < var4; ++var5) {
//            Block block = var3[var5];
//            if (block instanceof TileBlock) {
//                ((TileBlock) block).setTileEntity(type);
//            }
//        }
//
//        return type;
//    }
//
//    static {
//        CONSOLE_COPPER = TILES.register("console_copper", () -> {
//            return registerTiles(CopperConsoleTile::new, (Block) ModBlocks.console_copper.get());
//        });
////    public static final RegistryObject<TileEntityType<CopperConsoleTile>> console_copper =
////           TILES.register("console_copper", () -> TILES.register(CopperConsoleTile::new,
////                    ModBlocks.CONSOLE_COPPER.get()));
//    }
//}


import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import com.code.aseoha.tileentities.blocks.EOHTile;
import com.code.aseoha.tileentities.blocks.ExtrapolatorTile;
import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import com.code.aseoha.tileentities.blocks.WorkbenchTile;
import com.code.aseoha.tileentities.consoles.*;
import com.code.aseoha.tileentities.exteriors.*;
import com.google.common.base.Supplier;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.blocks.TileBlock;

public class AseohaTiles {
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, aseoha.MODID);

    public static final RegistryObject<TileEntityType<TardisCoralTile>> TARDIS_CORAL = TILES.register("tardis_coral",
            () -> TileEntityType.Builder.of(TardisCoralTile::new, AseohaBlocks.CORAL.get()).build(null));

    public static final RegistryObject<TileEntityType<ExtrapolatorTile>> TRIBOPHYSICAL_WAVEFORM_MACRO_KINETIC_EXTRAPOLATOR_TILE = TILES.register("tribophysical_waveform_macro_kinetic_extrapolator_tile",
            () -> TileEntityType.Builder.of(ExtrapolatorTile::new, AseohaBlocks.TRIBOPHYSICAL_WAVEFORM_MACRO_KINETIC_EXTRAPOLATOR.get()).build(null));

    public static final RegistryObject<TileEntityType<WorkbenchTile>> WORKBENCH = TILES.register("workbench",
            () -> TileEntityType.Builder.of(WorkbenchTile::new, AseohaBlocks.WORKBENCH.get()).build(null));

    public static final RegistryObject<TileEntityType<EOHTile>> EYE_OF_HARMONY = TILES.register("eye_of_harmony",
            () -> TileEntityType.Builder.of(EOHTile::new, AseohaBlocks.EYE_OF_HARMONY.get()).build(null));

//    public static final RegistryObject<TileEntityType<TardisEngineTile>> UPSIDEDOWN_ENGINE = TILES.register("upsidedown_engine",
//            () -> TileEntityType.Builder.of(TardisEngineTile::new, ModBlocks.UPSIDEDOWN_ENGINE.get()).build(null));

//    public static final RegistryObject<TileEntityType<ChiseledBookShelfBlockEntity>> CHISELED_BOOKSHELF = TILES.register("chiseled_bookshelf",
//            () -> TileEntityType.Builder.of(ChiseledBookShelfBlockEntity::new, ModBlocks.CHISELED_BOOKSHELF.get()).build(null));

    public static final RegistryObject<TileEntityType<BattleConsoleTile>> console_battle =
            TILES.register("console_battle", () -> registerTiles(BattleConsoleTile::new,
                    AseohaBlocks.console_battle.get()));

    public static final RegistryObject<TileEntityType<BlueMarbleTile>> console_bluemarble =
            TILES.register("console_bluemarble", () -> registerTiles(BlueMarbleTile::new,
                    AseohaBlocks.console_bluemarble.get()));

    public static final RegistryObject<TileEntityType<HartnellConsoleTile>> console_hartnell =
            TILES.register("console_hartnell", () -> registerTiles(HartnellConsoleTile::new,
                    AseohaBlocks.console_hartnell.get()));

    public static final RegistryObject<TileEntityType<McGannTile>> EXTERIOR_MCGANN =
            TILES.register("exterior_mcgann", () -> registerTiles(McGannTile::new,
                    AseohaBlocks.exterior_mcgann.get()));

    public static final RegistryObject<TileEntityType<ColinRichmondExteriorTile>> EXTERIOR_COLIN_RICHMOND =
            TILES.register("exterior_colin_richmond", () -> registerTiles(ColinRichmondExteriorTile::new,
                    AseohaBlocks.EXTERIOR_COLIN_RICHMOND.get()));

    public static final RegistryObject<TileEntityType<WhittakerTile>> EXTERIOR_WHITTAKER =
            TILES.register("exterior_whittaker", () -> registerTiles(WhittakerTile::new,
                    AseohaBlocks.EXTERIOR_WHITTAKER.get()));

    public static final RegistryObject<TileEntityType<SutekhTardisTile>> EXTERIOR_SUTEKH_TARDIS =
            TILES.register("exterior_sutekh_tardis", () -> registerTiles(SutekhTardisTile::new,
                    AseohaBlocks.EXTERIOR_SUTEKH_TARDIS.get()));

    public static final RegistryObject<TileEntityType<TakomakConsoleTile>> console_takomak =
            TILES.register("console_takomak", () -> registerTiles(TakomakConsoleTile::new,
                    AseohaBlocks.console_takomak.get()));

    public static final RegistryObject<TileEntityType<CopperConsoleTile>> console_copper =
            TILES.register("console_copper", () -> registerTiles(CopperConsoleTile::new,
                    AseohaBlocks.console_copper.get()));

    public static RegistryObject<TileEntityType<CoralTile>> EXTERIOR_CORAL =
            TILES.register("exterior_coral", () -> registerTiles(CoralTile::new,
                    AseohaBlocks.EXTERIOR_CORAL.get()));


    public static RegistryObject<TileEntityType<CapaldiTile>> exterior_capaldi =
            TILES.register("exterior_capaldi", () -> registerTiles(CapaldiTile::new,
                    AseohaBlocks.exterior_capaldi.get()));

    public static RegistryObject<TileEntityType<mk2_capaldi>> EXTERIOR_MK2_CAPALDI =
            TILES.register("exterior_mk2_capaldi", () -> registerTiles(mk2_capaldi::new,
                    AseohaBlocks.EXTERIOR_MK2_CAPALDI.get()));

    public static RegistryObject<TileEntityType<mk2_davidson>> EXTERIOR_MK2_DAVIDSON =
            TILES.register("exterior_mk2_davidson", () -> registerTiles(mk2_davidson::new,
                    AseohaBlocks.EXTERIOR_MK2_DAVIDSON.get()));

    public static RegistryObject<TileEntityType<mk2_hartnell>> EXTERIOR_MK2_HARTNELL =
            TILES.register("exterior_mk2_hartnell", () -> registerTiles(mk2_hartnell::new,
                    AseohaBlocks.EXTERIOR_MK2_HARTNELL.get()));

    public static RegistryObject<TileEntityType<mk2_pertwee>> EXTERIOR_MK2_PERTWEE =
            TILES.register("exterior_mk2_pertwee", () -> registerTiles(mk2_pertwee::new,
                    AseohaBlocks.EXTERIOR_MK2_PERTWEE.get()));

    public static RegistryObject<TileEntityType<mk2_smith>> EXTERIOR_MK2_SMITH =
            TILES.register("exterior_mk2_smith", () -> registerTiles(mk2_smith::new,
                    AseohaBlocks.EXTERIOR_MK2_SMITH.get()));

    public static RegistryObject<TileEntityType<mk2_tennant>> EXTERIOR_MK2_TENNANT =
            TILES.register("exterior_mk2_tennant", () -> registerTiles(mk2_tennant::new,
                    AseohaBlocks.EXTERIOR_MK2_TENNANT.get()));

    public static RegistryObject<TileEntityType<mk2_whittaker>> EXTERIOR_MK2_WHITTAKER =
            TILES.register("exterior_mk2_whittaker", () -> registerTiles(mk2_whittaker::new,
                    AseohaBlocks.EXTERIOR_MK2_WHITTAKER.get()));

    public static RegistryObject<TileEntityType<mk2_mcgann>> EXTERIOR_MK2_MCGANN =
            TILES.register("exterior_mk2_mcgann", () -> registerTiles(mk2_mcgann::new,
                    AseohaBlocks.EXTERIOR_MK2_MCGANN.get()));

    //WhoviansRest

    //Exteriors
    public static RegistryObject<TileEntityType<WardrobeTile>> exterior_wardrobe =
            TILES.register("exterior_wardrobe", () -> registerTiles(WardrobeTile::new,
                    AseohaBlocks.exterior_wardrobe.get()));

    public static RegistryObject<TileEntityType<RaniTile>> exterior_rani =
            TILES.register("exterior_rani", () -> registerTiles(RaniTile::new,
                    AseohaBlocks.exterior_rani.get()));

    public static RegistryObject<TileEntityType<OlwarriorTile>> exterior_olwarrior =
            TILES.register("exterior_olwarrior", () -> registerTiles(OlwarriorTile::new,
                    AseohaBlocks.exterior_olwarrior.get()));

    public static RegistryObject<TileEntityType<BlueDoctorTile>> exterior_bluedoctor =
            TILES.register("exterior_bluedoctor", () -> registerTiles(BlueDoctorTile::new,
                    AseohaBlocks.exterior_bluedoctor.get()));

    public static RegistryObject<TileEntityType<BrackolinTile>> exterior_brackolin =
            TILES.register("exterior_brackolin", () -> registerTiles(BrackolinTile::new,
                    AseohaBlocks.exterior_brackolin.get()));

    public static RegistryObject<TileEntityType<AlfieHudolinTile>> exterior_alfiehudolin =
            TILES.register("exterior_alfiehudolin", () -> registerTiles(AlfieHudolinTile::new,
                    AseohaBlocks.exterior_alfiehudolin.get()));

    public static RegistryObject<TileEntityType<Hartnell112Tile>> exterior_classic_hartnell =
            TILES.register("exterior_classic_hartnell", () -> registerTiles(Hartnell112Tile::new,
                    AseohaBlocks.exterior_classic_hartnell.get()));

    //Consoles
    public static final RegistryObject<TileEntityType<BrackolinConsoleTile>> console_brackolin =
            TILES.register("console_brackolin", () ->registerTiles(BrackolinConsoleTile::new,
                    AseohaBlocks.console_brackolin.get()));

    public static final RegistryObject<TileEntityType<CustardConsoleTile>> console_custard =
            TILES.register("console_custard", () ->registerTiles(CustardConsoleTile::new,
                    AseohaBlocks.console_custard.get()));

    private static <T extends TileEntity> TileEntityType<T> registerTiles(Supplier<T> tile, Block... validBlock) {
        TileEntityType<T> type = TileEntityType.Builder.of(tile, validBlock).build(null);

        for (Block block : validBlock) {
            if (block instanceof TileBlock) {
                ((TileBlock) block).setTileEntity(type);
            }
        }

        return type;
    }

}

