/* (C) TAMA Studios 2025 */
package tama.TileEntities;

import com.mojang.datafixers.types.Type;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.block.ConsoleBlock;
import net.tardis.mod.item.SpecialBlockItem;
import tama.Client.Models.Consoles.BrackolinConsoleModel;
import tama.Client.Models.Consoles.CopperConsoleModel;
import tama.Client.Models.Consoles.HartnellConsoleModel;
import tama.Client.Renderers.Consoles.BrackolinConsoleRenderer;
import tama.Client.Renderers.Consoles.CopperConsoleRenderer;
import tama.Client.Renderers.Consoles.HartnellConsoleRenderer;
import tama.TileEntities.Console.BrackolinConsoleTile;
import tama.TileEntities.Console.CopperConsoleTile;
import tama.TileEntities.Console.HartnellConsoleTile;

import java.util.function.Supplier;

import static tama.Items.AItems.ITEMS;
import static tama.TileEntities.TileRegistry.TYPES;
import static tama.aseoha.MODID;

public class ConsoleRegistry {

    public ConsoleRegistry() {}

    // Deferred Register
    /** Block deferred register for exteriors */
    public static final DeferredRegister<Block> CONSOLE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    // Blocks, Tiles, and Exteriors

    public static final RegistryObject<ConsoleBlock> COPPER_CONSOLE_BLOCK;
    public static final RegistryObject<BlockEntityType<CopperConsoleTile>> COPPER_CONSOLE_TILE;

    public static final RegistryObject<ConsoleBlock> BRACKOLIN_CONSOLE_BLOCK;
    public static final RegistryObject<BlockEntityType<BrackolinConsoleTile>> BRACKOLIN_CONSOLE_TILE;

    public static final RegistryObject<ConsoleBlock> HARTNELL_CONSOLE_BLOCK;
    public static final RegistryObject<BlockEntityType<HartnellConsoleTile>> HARTNELL_CONSOLE_TILE;

    // Define everything

    static {
        COPPER_CONSOLE_BLOCK =
                registerWithItemSpecial("console/copper", () -> new ConsoleBlock(ConsoleRegistry.COPPER_CONSOLE_TILE));
        COPPER_CONSOLE_TILE =
                TYPES.register("console/copper", () -> create(CopperConsoleTile::new, COPPER_CONSOLE_BLOCK.get()));

        BRACKOLIN_CONSOLE_BLOCK = registerWithItemSpecial(
                "console/brackolin", () -> new ConsoleBlock(ConsoleRegistry.BRACKOLIN_CONSOLE_TILE));
        BRACKOLIN_CONSOLE_TILE = TYPES.register(
                "console/brackolin", () -> create(BrackolinConsoleTile::new, BRACKOLIN_CONSOLE_BLOCK.get()));

        HARTNELL_CONSOLE_BLOCK = registerWithItemSpecial(
                "console/hartnell", () -> new ConsoleBlock(ConsoleRegistry.HARTNELL_CONSOLE_TILE));
        HARTNELL_CONSOLE_TILE = TYPES.register(
                "console/hartnell", () -> create(HartnellConsoleTile::new, HARTNELL_CONSOLE_BLOCK.get()));
    }

    public static <T extends BlockEntity> BlockEntityType<T> create(
            BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks) {
        return BlockEntityType.Builder.of(factory, blocks).build((Type) null);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerModel(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CopperConsoleModel.LAYER_LOCATION, CopperConsoleModel::createBodyLayer);
        event.registerLayerDefinition(BrackolinConsoleModel.LAYER_LOCATION, BrackolinConsoleModel::createBodyLayer);
        event.registerLayerDefinition(HartnellConsoleModel.LAYER_LOCATION, HartnellConsoleModel::createBodyLayer);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(
                COPPER_CONSOLE_TILE.get(),
                context -> new CopperConsoleRenderer(
                        context,
                        new CopperConsoleModel<>(context.bakeLayer(CopperConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/copper.png")));

        event.registerBlockEntityRenderer(
                BRACKOLIN_CONSOLE_TILE.get(),
                context -> new BrackolinConsoleRenderer(
                        context,
                        new BrackolinConsoleModel<>(context.bakeLayer(BrackolinConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/brackolin.png")));

        event.registerBlockEntityRenderer(
                HARTNELL_CONSOLE_TILE.get(),
                context -> new HartnellConsoleRenderer(
                        context,
                        new HartnellConsoleModel<>(context.bakeLayer(HartnellConsoleModel.LAYER_LOCATION)),
                        new ResourceLocation(MODID, "textures/consoles/hartnell.png")));
    }

    public static <T extends Block> RegistryObject<T> registerWithItemSpecial(String name, final Supplier<T> block) {

        final RegistryObject<T> reg = CONSOLE_BLOCKS.register(name, block);

        ITEMS.register(name, () -> new SpecialBlockItem(reg.get(), new Item.Properties()));

        return reg;
    }

    public static void Register(IEventBus ModBus) {
        CONSOLE_BLOCKS.register(ModBus);
    }
}
