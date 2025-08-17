/* (C) TAMA Studios 2025 */
package tama;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import tama.Blocks.Roundels;
import tama.Registries.Entities;
import tama.Registries.MonitorFunctionRegistry;
import tama.Registries.SubsystemsRegistry;
import tama.TileEntities.ConsoleBlocks;
import tama.TileEntities.ExteriorBlocks;
import tama.TileEntities.ExteriorRegistry;
import tama.TileEntities.TileRegistry;

import static tama.Blocks.ABlocks.BLOCKS;
import static tama.Items.AItems.FOOD_ITEMS;
import static tama.Items.AItems.ITEMS;
import static tama.Items.ATabs.TABS;
import static tama.Registries.ControlRegistry.CONTROLS;

@Mod(aseoha.MODID)
@SuppressWarnings("removal")
public class aseoha {

    public static final String MODID = "aseoha";

    public static final Logger LOGGER = LogUtils.getLogger();

    public aseoha() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FOOD_ITEMS.register(modEventBus);
        BLOCKS.register(modEventBus);
        Roundels.register(modEventBus);
        Entities.TYPES.register(modEventBus);
        ConsoleBlocks.Register(modEventBus);
        ExteriorBlocks.EXTERIOR_BLOCKS.register(modEventBus);
        TileRegistry.TYPES.register(modEventBus);
        MonitorFunctionRegistry.FUNCTIONS.register(modEventBus);
        ExteriorRegistry.EXTERIORS.register(modEventBus);
        CONTROLS.register(modEventBus);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> ClientRegistry::RegisterBrokenExteriorRenderers);
        ITEMS.register(modEventBus);
        SubsystemsRegistry.register(modEventBus);
        TABS.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
    }

    public void commonSetup(FMLCommonSetupEvent event){
        SubsystemsRegistry.registerSubsystems();
    }
}
