/* (C) TAMA Studios 2025 */
package tama.TileEntities;

import static tama.TileEntities.TileRegistry.TYPES;
import static tama.aseoha.MODID;

import com.mojang.datafixers.types.Type;
import java.util.function.Supplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;
import net.tardis.mod.block.ExteriorBlock;
import net.tardis.mod.client.ModelHolder;
import net.tardis.mod.client.renderers.tiles.BrokenExteriorRenderer;
import net.tardis.mod.entity.CarExteriorEntity;
import net.tardis.mod.exterior.EntityExterior;
import net.tardis.mod.exterior.ExteriorType;
import net.tardis.mod.exterior.TileExterior;
import net.tardis.mod.helpers.Helper;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import tama.Client.Models.Exteriors.DeLoreanExteriorModel;
import tama.Client.Models.Exteriors.RTD9ExteriorModel;
import tama.Client.Models.Exteriors.WardrobeExteriorModel;
import tama.Client.Renderers.Exteriors.DeLoreanExteriorRenderer;
import tama.Client.Renderers.Exteriors.RTD9ExteriorRenderer;
import tama.Client.Renderers.Exteriors.WardrobeExteriorRenderer;
import tama.Registries.Entities;
import tama.TileEntities.Exterior.RTD9ExteriorTile;
import tama.TileEntities.Exterior.WardrobeExteriorTile;
import tama.aseoha;

public class ExteriorRegistry {

    public ExteriorRegistry() {}

    // Deferred Registers
    /** Exterior Deferred Register */
    public static final DeferredRegister<ExteriorType> EXTERIORS =
            DeferredRegister.create(Helper.createRL("exterior"), aseoha.MODID);

    /** Block deferred register for exteriors */
    public static final DeferredRegister<Block> EXTERIOR_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final Supplier<IForgeRegistry<ExteriorType>> REGISTRY = EXTERIORS.makeRegistry(RegistryBuilder::new);

    // Blocks, Tiles, and Exteriors

    public static final RegistryObject<ExteriorBlock> RTD_9_EXTERIOR_BLOCK;
    public static final RegistryObject<BlockEntityType<RTD9ExteriorTile>> RTD_9_EXTERIOR_TILE;
    public static final RegistryObject<ExteriorType> RTD_9_EXTERIOR;

    public static final RegistryObject<ExteriorBlock> WARDROBE_EXTERIOR_BLOCK;
    public static final RegistryObject<BlockEntityType<WardrobeExteriorTile>> WARDROBE_EXTERIOR_TILE;
    public static final RegistryObject<ExteriorType> WARDROBE_EXTERIOR;

    public static final RegistryObject<ExteriorType> DELOREAN_TIME_MACHINE;

    // Define everything

    static {
        RTD_9_EXTERIOR_BLOCK = EXTERIOR_BLOCKS.register(
                "exterior/rtd_9", () -> new ExteriorBlock(ExteriorRegistry.RTD_9_EXTERIOR_TILE));
        RTD_9_EXTERIOR_TILE =
                TYPES.register("exterior/rtd_9", () -> create(RTD9ExteriorTile::new, RTD_9_EXTERIOR_BLOCK.get()));
        RTD_9_EXTERIOR = EXTERIORS.register(
                "rtd_9",
                () -> new ExteriorType((type, tardis) -> new TileExterior(
                        type, tardis, RTD_9_EXTERIOR_BLOCK.get().defaultBlockState())));

        WARDROBE_EXTERIOR_BLOCK = EXTERIOR_BLOCKS.register(
                "exterior/wardrobe", () -> new ExteriorBlock(ExteriorRegistry.WARDROBE_EXTERIOR_TILE));
        WARDROBE_EXTERIOR_TILE = TYPES.register(
                "exterior/wardrobe", () -> create(WardrobeExteriorTile::new, WARDROBE_EXTERIOR_BLOCK.get()));
        WARDROBE_EXTERIOR = EXTERIORS.register(
                "wardrobe",
                () -> new ExteriorType((type, tardis) -> new TileExterior(
                        type, tardis, WARDROBE_EXTERIOR_BLOCK.get().defaultBlockState())));

        DELOREAN_TIME_MACHINE = EXTERIORS.register(
                "delorean",
                () -> new ExteriorType((type, tardis) -> new EntityExterior(
                        type, tardis, level -> new CarExteriorEntity(Entities.DELOREAN_TIME_MACHINE.get(), level))));
    }

    @Contract("_, _ -> new")
    public static <T extends BlockEntity> @NotNull BlockEntityType<T> create(
            BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks) {
        return BlockEntityType.Builder.of(factory, blocks).build((Type) null);
    }

    public static void registerModels(EntityRenderersEvent.@NotNull RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RTD9ExteriorModel.LAYER_LOCATION, RTD9ExteriorModel::createBodyLayer);

        event.registerLayerDefinition(WardrobeExteriorModel.LAYER_LOCATION, WardrobeExteriorModel::createBodyLayer);

        event.registerLayerDefinition(DeLoreanExteriorModel.LAYER_LOCATION, DeLoreanExteriorModel::createBodyLayer);
    }

    public static void registerRenderers(EntityRenderersEvent.@NotNull RegisterRenderers event) {
        event.registerBlockEntityRenderer(ExteriorRegistry.RTD_9_EXTERIOR_TILE.get(), RTD9ExteriorRenderer::new);
        event.registerBlockEntityRenderer(ExteriorRegistry.WARDROBE_EXTERIOR_TILE.get(), WardrobeExteriorRenderer::new);

        event.registerEntityRenderer(
                Entities.DELOREAN_TIME_MACHINE.get(),
                context -> new DeLoreanExteriorRenderer<>(
                        context, new DeLoreanExteriorModel<>(context.bakeLayer(DeLoreanExteriorModel.LAYER_LOCATION))));
    }

    public static void RegisterBrokenExteriorRenderers() {
        BrokenExteriorRenderer.register(new ModelHolder<>(
                type -> type == RTD_9_EXTERIOR.get(),
                set -> new RTD9ExteriorModel<>(set.bakeLayer(RTD9ExteriorModel.LAYER_LOCATION)),
                new ResourceLocation(aseoha.MODID, "textures/exteriors/colin_richmond/rtd_9.png")));

        BrokenExteriorRenderer.register(new ModelHolder<>(
                type -> type == WARDROBE_EXTERIOR.get(),
                set -> new WardrobeExteriorModel<>(set.bakeLayer(WardrobeExteriorModel.LAYER_LOCATION)),
                new ResourceLocation(aseoha.MODID, "textures/exteriors/wardrobe/oak_exterior.png")));

        BrokenExteriorRenderer.register(new ModelHolder<>(
                type -> type == DELOREAN_TIME_MACHINE.get(),
                set -> new DeLoreanExteriorModel<>(set.bakeLayer(DeLoreanExteriorModel.LAYER_LOCATION)),
                new ResourceLocation(aseoha.MODID, "textures/entity/delorean.png")));
    }

    public static void RegisterAll(IEventBus ModBus) {
        EXTERIOR_BLOCKS.register(ModBus);
        EXTERIORS.register(ModBus);
    }
}
