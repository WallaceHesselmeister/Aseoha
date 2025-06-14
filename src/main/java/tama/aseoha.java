/* (C) TAMA Studios 2025 */
package tama;

import static tama.Blocks.ABlocks.BLOCKS;
import static tama.Items.AItems.FOOD_ITEMS;
import static tama.Items.AItems.ITEMS;
import static tama.TileEntities.TileRegistry.TYPES;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import tama.Blocks.Roundels;
import tama.Registries.Entities;
import tama.TileEntities.ConsoleRegistry;
import tama.TileEntities.ExteriorRegistry;

@Mod(aseoha.MODID)
@SuppressWarnings("removal")
public class aseoha {

    public static final String MODID = "aseoha";

    private static final Logger LOGGER = LogUtils.getLogger();

    public aseoha() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        FOOD_ITEMS.register(modEventBus);
        TYPES.register(modEventBus);
        Roundels.register(modEventBus);
        Entities.TYPES.register(modEventBus);
        ExteriorRegistry.RegisterAll(modEventBus);
        ConsoleRegistry.Register(modEventBus);
        ExteriorRegistry.RegisterBrokenExteriorRenderers();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("You've got ASEOHA!");
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("Server started");
    }
}
