/* (C) TAMA Studios 2025 */
package tama;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.client.ModelHolder;
import net.tardis.mod.client.renderers.SpecialItemRenderer;
import net.tardis.mod.client.renderers.tiles.BrokenExteriorRenderer;
import org.jetbrains.annotations.NotNull;
import tama.Client.Models.Consoles.BrackolinConsoleModel;
import tama.Client.Models.Consoles.CopperConsoleModel;
import tama.Client.Models.Consoles.HartnellConsoleModel;
import tama.Client.Models.Consoles.ported.ToyotaConsoleModel;
import tama.Client.Models.Exteriors.DeLoreanExteriorModel;
import tama.Client.Models.Exteriors.RTD9ExteriorModel;
import tama.Client.Models.Exteriors.WardrobeExteriorModel;
import tama.Client.Renderers.Consoles.BrackolinConsoleRenderer;
import tama.Client.Renderers.Consoles.CopperConsoleRenderer;
import tama.Client.Renderers.Consoles.HartnellConsoleRenderer;
import tama.Client.Renderers.Consoles.ToyotaConsoleRenderer;
import tama.Client.Renderers.Exteriors.DeLoreanExteriorRenderer;
import tama.Client.Renderers.Exteriors.RTD9ExteriorRenderer;
import tama.Client.Renderers.Exteriors.WardrobeExteriorRenderer;
import tama.Items.AItems;
import tama.Registries.Entities;
import tama.TileEntities.ConsoleBlocks;
import tama.TileEntities.ExteriorRegistry;
import tama.TileEntities.TileRegistry;

import static tama.Items.ATabs.FOOD;
import static tama.Items.ATabs.MAIN;
import static tama.aseoha.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientRegistry {
    /**
     * Setup rendering
     */
    @SubscribeEvent
    public static void registerModel(EntityRenderersEvent.RegisterLayerDefinitions event) {
        registerExteriorModels(event);
        registerConsoleModels(event);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        registerExteriorRenderers(event);
        registerConsoleRenderers(event);
    }

    @SubscribeEvent
    public static void ClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientRegistry::registerSpecialItemModels);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerSpecialItemModels() {
        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) -> stack.getItem()
                        == ForgeRegistries.ITEMS.getValue(ConsoleBlocks.BRACKOLIN_CONSOLE_BLOCK.getId()),
                (modelSet) -> new BrackolinConsoleModel<>(modelSet.bakeLayer(BrackolinConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/brackolin.png")));

        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) ->
                        stack.getItem() == ForgeRegistries.ITEMS.getValue(ConsoleBlocks.COPPER_CONSOLE_BLOCK.getId()),
                (modelSet) -> new CopperConsoleModel<>(modelSet.bakeLayer(CopperConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/copper.png")));

        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) ->
                        stack.getItem() == ForgeRegistries.ITEMS.getValue(ConsoleBlocks.TOYOTA_CONSOLE_BLOCK.getId()),
                (modelSet) -> new ToyotaConsoleModel<>(modelSet.bakeLayer(ToyotaConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/toyota.png")));

        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) -> stack.getItem()
                        == ForgeRegistries.ITEMS.getValue(ConsoleBlocks.TOYOTA_CONSOLE_BLOCK_VIOLET.getId()),
                (modelSet) -> new ToyotaConsoleModel<>(modelSet.bakeLayer(ToyotaConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/toyota_violet.png")));

        SpecialItemRenderer.register(new ModelHolder<>(
                (stack) ->
                        stack.getItem() == ForgeRegistries.ITEMS.getValue(ConsoleBlocks.HARTNELL_CONSOLE_BLOCK.getId()),
                (modelSet) -> new HartnellConsoleModel<>(modelSet.bakeLayer(HartnellConsoleModel.LAYER_LOCATION)),
                new ResourceLocation(MODID, "textures/consoles/hartnell.png")));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerExteriorRenderers(EntityRenderersEvent.@NotNull RegisterRenderers event) {
        event.registerBlockEntityRenderer(TileRegistry.RTD_9_EXTERIOR_TILE.get(), RTD9ExteriorRenderer::new);
        event.registerBlockEntityRenderer(TileRegistry.WARDROBE_EXTERIOR_TILE.get(), WardrobeExteriorRenderer::new);

        event.registerEntityRenderer(
                Entities.DELOREAN_TIME_MACHINE.get(),
                context -> new DeLoreanExteriorRenderer<>(
                        context, new DeLoreanExteriorModel<>(context.bakeLayer(DeLoreanExteriorModel.LAYER_LOCATION))));
    }

    @OnlyIn(Dist.CLIENT)
    public static void RegisterBrokenExteriorRenderers() {
        BrokenExteriorRenderer.register(new ModelHolder<>(
                type -> type == ExteriorRegistry.RTD_9_EXTERIOR.get(),
                set -> new RTD9ExteriorModel<>(set.bakeLayer(RTD9ExteriorModel.LAYER_LOCATION)),
                new ResourceLocation(aseoha.MODID, "textures/exteriors/colin_richmond/rtd_9.png")));

        BrokenExteriorRenderer.register(new ModelHolder<>(
                type -> type == ExteriorRegistry.WARDROBE_EXTERIOR.get(),
                set -> new WardrobeExteriorModel<>(set.bakeLayer(WardrobeExteriorModel.LAYER_LOCATION)),
                new ResourceLocation(aseoha.MODID, "textures/exteriors/wardrobe/oak_exterior.png")));

        BrokenExteriorRenderer.register(new ModelHolder<>(
                type -> type == ExteriorRegistry.DELOREAN_TIME_MACHINE.get(),
                set -> new DeLoreanExteriorModel<>(set.bakeLayer(DeLoreanExteriorModel.LAYER_LOCATION)),
                new ResourceLocation(aseoha.MODID, "textures/entity/delorean.png")));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerExteriorModels(EntityRenderersEvent.@NotNull RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RTD9ExteriorModel.LAYER_LOCATION, RTD9ExteriorModel::createBodyLayer);

        event.registerLayerDefinition(WardrobeExteriorModel.LAYER_LOCATION, WardrobeExteriorModel::createBodyLayer);

        event.registerLayerDefinition(DeLoreanExteriorModel.LAYER_LOCATION, DeLoreanExteriorModel::createBodyLayer);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerConsoleModels(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CopperConsoleModel.LAYER_LOCATION, CopperConsoleModel::createBodyLayer);
        event.registerLayerDefinition(ToyotaConsoleModel.LAYER_LOCATION, ToyotaConsoleModel::createBodyLayer);
        event.registerLayerDefinition(BrackolinConsoleModel.LAYER_LOCATION, BrackolinConsoleModel::createBodyLayer);
        event.registerLayerDefinition(HartnellConsoleModel.LAYER_LOCATION, HartnellConsoleModel::createBodyLayer);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerConsoleRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(
                TileRegistry.COPPER_CONSOLE_TILE.get(),
                context -> new CopperConsoleRenderer(
                        context,
                        new CopperConsoleModel<>(context.bakeLayer(CopperConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/copper.png")));

        event.registerBlockEntityRenderer(
                TileRegistry.TOYOTA_CONSOLE_TILE.get(),
                context -> new ToyotaConsoleRenderer(
                        context,
                        new ToyotaConsoleModel<>(context.bakeLayer(ToyotaConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/toyota.png")));

        event.registerBlockEntityRenderer(
                TileRegistry.TOYOTA_CONSOLE_TILE_VIOLET.get(),
                context -> new ToyotaConsoleRenderer(
                        context,
                        new ToyotaConsoleModel<>(context.bakeLayer(ToyotaConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/toyota_violet.png")));

        event.registerBlockEntityRenderer(
                TileRegistry.BRACKOLIN_CONSOLE_TILE.get(),
                context -> new BrackolinConsoleRenderer(
                        context,
                        new BrackolinConsoleModel<>(context.bakeLayer(BrackolinConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/brackolin.png")));

        event.registerBlockEntityRenderer(
                TileRegistry.HARTNELL_CONSOLE_TILE.get(),
                context -> new HartnellConsoleRenderer(
                        context,
                        new HartnellConsoleModel<>(context.bakeLayer(HartnellConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/hartnell.png")));
    }

    @SubscribeEvent
    public static void addTabItemsEvent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == MAIN.get()) AItems.ITEMS.getEntries().forEach(event::accept);
        else if (event.getTab() == FOOD.get()) AItems.FOOD_ITEMS.getEntries().forEach(event::accept);
    }
}
