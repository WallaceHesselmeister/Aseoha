/* (C) TAMA Studios 2025 */
package tama;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import tama.Blocks.Roundels;
import tama.Registries.Entities;
import tama.TileEntities.ConsoleRegistry;
import tama.TileEntities.ExteriorRegistry;

import static tama.Blocks.ABlocks.BLOCKS;
import static tama.Items.AItems.FOOD_ITEMS;
import static tama.Items.AItems.ITEMS;
import static tama.Items.ATabs.TABS;
import static tama.TileEntities.TileRegistry.TYPES;

@Mod(aseoha.MODID)
@SuppressWarnings("removal")
public class aseoha {

    public static final String MODID = "aseoha";

    private static final Logger LOGGER = LogUtils.getLogger();

    public aseoha() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        TABS.register(modEventBus);
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        FOOD_ITEMS.register(modEventBus);
        TYPES.register(modEventBus);
        Roundels.register(modEventBus);
        Entities.TYPES.register(modEventBus);
        ExteriorRegistry.RegisterAll(modEventBus);
        ConsoleRegistry.Register(modEventBus);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> ExteriorRegistry::RegisterBrokenExteriorRenderers);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
