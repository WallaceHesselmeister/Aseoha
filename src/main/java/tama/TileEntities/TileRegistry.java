/* (C) TAMA Studios 2025 */
package tama.TileEntities;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import tama.TileEntities.Console.*;
import tama.TileEntities.Exterior.CapaldiExteriorTile;
import tama.TileEntities.Exterior.Hartnell112ExteriorTile;
import tama.TileEntities.Exterior.RTD9ExteriorTile;
import tama.TileEntities.Exterior.WardrobeExteriorTile;
import tama.aseoha;

public class TileRegistry {
    public static final DeferredRegister<BlockEntityType<?>> TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, aseoha.MODID);

    // Exteriors
    public static final RegistryObject<BlockEntityType<WardrobeExteriorTile>> WARDROBE_EXTERIOR_TILE = TYPES.register(
            "exterior/wardrobe", () -> create(WardrobeExteriorTile::new, ExteriorBlocks.WARDROBE_EXTERIOR_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<RTD9ExteriorTile>> RTD_9_EXTERIOR_TILE = TYPES.register(
            "exterior/rtd_9", () -> create(RTD9ExteriorTile::new, ExteriorBlocks.RTD_9_EXTERIOR_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<CapaldiExteriorTile>> CAPALDI_EXTERIOR_TILE = TYPES.register(
            "exterior/capaldi", () -> create(CapaldiExteriorTile::new, ExteriorBlocks.CAPALDI_EXTERIOR_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<Hartnell112ExteriorTile>> HARTNELL112_EXTERIOR_TILE =
            TYPES.register(
                    "exterior/hartnell112",
                    () -> create(Hartnell112ExteriorTile::new, ExteriorBlocks.HARTNELL112_EXTERIOR_BLOCK.get()));

    // Consoles
    public static final RegistryObject<BlockEntityType<CopperConsoleTile>> COPPER_CONSOLE_TILE = TYPES.register(
            "console/copper", () -> create(CopperConsoleTile::new, ConsoleBlocks.COPPER_CONSOLE_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<SteamConsoleTile>> STEAM_CONSOLE_TILE = TYPES.register(
            "console/steam", () -> create(SteamConsoleTile::new, ConsoleBlocks.STEAM_CONSOLE_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<ToyotaConsoleTile>> TOYOTA_CONSOLE_TILE = TYPES.register(
            "console/toyota", () -> create(ToyotaConsoleTile::new, ConsoleBlocks.TOYOTA_CONSOLE_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<BrackolinConsoleTile>> BRACKOLIN_CONSOLE_TILE = TYPES.register(
            "console/brackolin", () -> create(BrackolinConsoleTile::new, ConsoleBlocks.BRACKOLIN_CONSOLE_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<TokamakConsoleTile>> TOKAMAK_CONSOLE_TILE = TYPES.register(
            "console/tokamak", () -> create(TokamakConsoleTile::new, ConsoleBlocks.TOKAMAK_CONSOLE_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<HartnellConsoleTile>> HARTNELL_CONSOLE_TILE = TYPES.register(
            "console/hartnell", () -> create(HartnellConsoleTile::new, ConsoleBlocks.HARTNELL_CONSOLE_BLOCK.get()));

    public static final RegistryObject<BlockEntityType<CoralConsoleTile>> CORAL_CONSOLE_TILE = TYPES.register(
            "console/coral", () -> create(CoralConsoleTile::new, ConsoleBlocks.CORAL_CONSOLE_BLOCK.get()));

    @Contract("_, _ -> new")
    public static <T extends BlockEntity> @NotNull BlockEntityType<T> create(
            BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks) {
        return BlockEntityType.Builder.of(factory, blocks).build(null);
    }
}
