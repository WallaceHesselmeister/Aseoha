/* (C) TAMA Studios 2025 */
package tama.TileEntities;

import static tama.TileEntities.TileRegistry.RTD_9_EXTERIOR_TILE;
import static tama.aseoha.MODID;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.block.ExteriorBlock;

public class ExteriorBlocks {
    /** Block deferred register for exteriors */
    public static final DeferredRegister<Block> EXTERIOR_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<ExteriorBlock> RTD_9_EXTERIOR_BLOCK =
            ExteriorBlocks.EXTERIOR_BLOCKS.register("exterior/rtd_9", () -> new ExteriorBlock(RTD_9_EXTERIOR_TILE));

    public static final RegistryObject<ExteriorBlock> WARDROBE_EXTERIOR_BLOCK = ExteriorBlocks.EXTERIOR_BLOCKS.register(
            "exterior/wardrobe", () -> new ExteriorBlock(TileRegistry.WARDROBE_EXTERIOR_TILE));

    public static final RegistryObject<ExteriorBlock> CAPALDI_EXTERIOR_BLOCK = ExteriorBlocks.EXTERIOR_BLOCKS.register(
            "exterior/capaldi", () -> new ExteriorBlock(TileRegistry.CAPALDI_EXTERIOR_TILE));

    public static final RegistryObject<ExteriorBlock> HARTNELL112_EXTERIOR_BLOCK =
            ExteriorBlocks.EXTERIOR_BLOCKS.register(
                    "exterior/hartnell112", () -> new ExteriorBlock(TileRegistry.HARTNELL112_EXTERIOR_TILE));
}
