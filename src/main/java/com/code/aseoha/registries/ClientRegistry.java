package com.code.aseoha.registries;

import com.code.aseoha.block.ModBlocks;
import com.code.aseoha.client.renderers.DavrosChairRenderer;
import com.code.aseoha.client.renderers.blocks.EOHRenderer;
import com.code.aseoha.client.renderers.blocks.TardisCoralRenderer;
import com.code.aseoha.client.renderers.console.*;
import com.code.aseoha.client.renderers.k9render;
import com.code.aseoha.client.renderers.sky.*;
import com.code.aseoha.client.renderers.wallerender;
import com.code.aseoha.entities.ModEntityTypes;
import com.code.aseoha.misc.AseohaDimensions;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientRegistry {
    public static void RegisterClientStuff(FMLClientSetupEvent event) {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// ROUNDELS/MISC
        RenderTypeLookup.setRenderLayer(ModBlocks.FAULTLOCATOR.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FAULTLOCATOR_S.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS01.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS02.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS03.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS04.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS05.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS06.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS07.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_GLASS08.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_HEX.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_VENT.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_FLOOR.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_ROUNDEL1.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_ROUNDEL2.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_ROUNDEL3.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_WALL.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_WALLSILVER.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.HELLBENT_POLE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.TOASTER.get(), RenderType.cutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_BLANK.get(), RenderType.solid());
//        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_BLANK_WALL.get(), RenderType.solid());
//        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_FLOOR.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_ROUNDEL1.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_ROUNDEL2.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_ROUNDEL3.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_ROUNDEL4.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.MEGLOS_ROUNDEL5.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.COATRACK.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_TERRACOTTA_ROUNDEL.get(), RenderType.solid());
        //RenderTypeLookup.setRenderLayer(ModBlocks.ORANGE_TERRACOTTA_ROUNDEL_HALF.get(), RenderType.solid());
//        RenderTypeLookup.setRenderLayer(ModBlocks.COPPER_COLUMN.get(), RenderType.translucent());
//        RenderTypeLookup.setRenderLayer(ModBlocks.COPPER_COLUMN_TOP.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.COPPER_ROUNDEL.get(), RenderType.solid());
//        RenderTypeLookup.setRenderLayer(ModBlocks.LOOTCRATE.get(), RenderType.cutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.LOOTCRATEX.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.BLUE_CRYSTAL.get(), RenderType.translucent());
        RenderTypeLookup.setRenderLayer(ModBlocks.OCHRE_FROGLIGHT.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.VERDANT_FROGLIGHT.get(), RenderType.solid());

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// COOL BLOCKS
        RenderTypeLookup.setRenderLayer(ModBlocks.foodmachine_old.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.DIMENSIONAL_BUTTON.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FACING_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.HANDBREAK_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.INC_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.RANDOMIZER_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.REFUELER_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.X_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.Y_CONTROL.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.Z_CONTROL.get(), RenderType.cutout());
//        RenderTypeLookup.setRenderLayer(ModBlocks.EOH.get(), RenderType.solid());
        RenderTypeLookup.setRenderLayer(ModBlocks.FLIGHT_BUTTON.get(), RenderType.solid());


        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWERING_AZALEA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.FLOWERING_AZALEA_LEAVES.get(), RenderType.cutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.AZALEA_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.HARMONIC_PILLAR.get(), RenderType.translucent());


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// CONSOLES

        RenderTypeLookup.setRenderLayer(ModBlocks.console_copper.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_copper.get(), CopperConsoleRenderer::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.console_brackolin.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_brackolin.get(), BrackolinConsoleRender::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.console_battle.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_battle.get(), BattleConsoleRender::new);

//        RenderTypeLookup.setRenderLayer(ModBlocks.console_takomak.get(), RenderType.translucent());
//        ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_takomak.get(), TakomakConsoleRender::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.console_bluemarble.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_bluemarble.get(), BlueMarbleRender::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.console_hartnell.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_hartnell.get(), HartnellConsoleRender::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.console_custard.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.console_custard.get(), CustardConsoleRenderer::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.CORAL.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.TARDIS_CORAL.get(), TardisCoralRenderer::new);

        RenderTypeLookup.setRenderLayer(ModBlocks.EYE_OF_HARMONY.get(), RenderType.translucent());
        net.minecraftforge.fml.client.registry.ClientRegistry.bindTileEntityRenderer(AseohaTiles.EYE_OF_HARMONY.get(), EOHRenderer::new);

//        RenderTypeLookup.setRenderLayer(ModBlocks.UPSIDEDOWN_ENGINE.get(), RenderType.translucent());
//        ClientRegistry.bindTileEntityRenderer(AseohaTiles.UPSIDEDOWN_ENGINE.get(), UpsideDownEngineRenderer::new);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// ENTITIES

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.K9.get(), k9render::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.WALLE.get(), wallerender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DAVROS_CHAIR.get(), DavrosChairRenderer::new);


        AseohaDimensions.registerNoiseSettings();
        DimensionRenderInfo.EFFECTS.put(AseohaDimensions.KLOM_SKY_PROPERTY_KEY, new KlomSkyProperty());
        DimensionRenderInfo.EFFECTS.put(AseohaDimensions.GALLIFREY_SKY_PROPERTY_KEY, new GallifreySkyProperty());
        DimensionRenderInfo.EFFECTS.put(AseohaDimensions.RAXICORICOFALLAPITORIUS_SKY_PROPERTY_KEY, new RaxicoricofallapitoriusSkyProperty());
        DimensionRenderInfo.EFFECTS.put(AseohaDimensions.BASIC_SKY_PROPERTY_KEY, new BasicSkyProperty());
//        RenderingRegistry.registerEntityRenderingHandler(ModItems.PRYDONIAN_HELM.get(), wallerender::new);

    }
}
