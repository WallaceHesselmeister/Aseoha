/* (C) TAMA Studios 2025 */
package tama.TileEntities;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.entity.CarExteriorEntity;
import net.tardis.mod.exterior.EntityExterior;
import net.tardis.mod.exterior.ExteriorType;
import net.tardis.mod.exterior.TileExterior;
import net.tardis.mod.helpers.Helper;
import tama.Registries.Entities;
import tama.aseoha;

import java.util.function.Supplier;

public class ExteriorRegistry {

    public ExteriorRegistry() {}

    // Deferred Registers
    /** Exterior Deferred Register */
    public static final DeferredRegister<ExteriorType> EXTERIORS =
            DeferredRegister.create(Helper.createRL("exterior"), aseoha.MODID);

    public static final Supplier<IForgeRegistry<ExteriorType>> REGISTRY = EXTERIORS.makeRegistry(RegistryBuilder::new);

    // Blocks, Tiles, and Exteriors

    public static final RegistryObject<ExteriorType> RTD_9_EXTERIOR;

    public static final RegistryObject<ExteriorType> WARDROBE_EXTERIOR;

    public static final RegistryObject<ExteriorType> DELOREAN_TIME_MACHINE;

    // Define everything

    static {
        RTD_9_EXTERIOR = EXTERIORS.register(
                "rtd_9",
                () -> new ExteriorType((type, tardis) -> new TileExterior(
                        type, tardis, ExteriorBlocks.RTD_9_EXTERIOR_BLOCK.get().defaultBlockState())));

        WARDROBE_EXTERIOR = EXTERIORS.register(
                "wardrobe",
                () -> new ExteriorType((type, tardis) -> new TileExterior(
                        type,
                        tardis,
                        ExteriorBlocks.WARDROBE_EXTERIOR_BLOCK.get().defaultBlockState())));

        DELOREAN_TIME_MACHINE = EXTERIORS.register(
                "delorean",
                () -> new ExteriorType((type, tardis) -> new EntityExterior(
                        type, tardis, level -> new CarExteriorEntity(Entities.DELOREAN_TIME_MACHINE.get(), level))));
    }
}
