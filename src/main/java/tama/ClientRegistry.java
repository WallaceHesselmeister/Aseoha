/* (C) TAMA Studios 2025 */
package tama;

import static tama.aseoha.MODID;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.client.ModelHolder;
import net.tardis.mod.client.renderers.SpecialItemRenderer;
import tama.Client.Models.Consoles.BrackolinConsoleModel;
import tama.Client.Models.Consoles.CopperConsoleModel;
import tama.Client.Models.Consoles.HartnellConsoleModel;
import tama.TileEntities.ConsoleRegistry;
import tama.TileEntities.ExteriorRegistry;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientRegistry {
    /** Setup rendering */
    @SubscribeEvent
    public static void registerModel(EntityRenderersEvent.RegisterLayerDefinitions event) {
        ExteriorRegistry.registerModels(event);
        ConsoleRegistry.registerModel(event);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        ExteriorRegistry.registerRenderers(event);
        ConsoleRegistry.registerRenderers(event);
    }

    @SubscribeEvent
    public static void ClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegistry::registerSpecialItemModels);
    }

    public static void registerSpecialItemModels() {
        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) -> stack.getItem()
                        == ForgeRegistries.ITEMS.getValue(ConsoleRegistry.BRACKOLIN_CONSOLE_BLOCK.getId()),
                (modelSet) -> new BrackolinConsoleModel<>(modelSet.bakeLayer(BrackolinConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/brackolin.png")));

        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) ->
                        stack.getItem() == ForgeRegistries.ITEMS.getValue(ConsoleRegistry.COPPER_CONSOLE_BLOCK.getId()),
                (modelSet) -> new CopperConsoleModel<>(modelSet.bakeLayer(CopperConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/copper.png")));

        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) -> stack.getItem()
                        == ForgeRegistries.ITEMS.getValue(ConsoleRegistry.HARTNELL_CONSOLE_BLOCK.getId()),
                (modelSet) -> new HartnellConsoleModel<>(modelSet.bakeLayer(HartnellConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/hartnell.png")));
    }
}
