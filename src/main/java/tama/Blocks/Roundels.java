/* (C) TAMA Studios 2025 */
package tama.Blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.block.RoundelBlock;
import org.jetbrains.annotations.NotNull;

import static tama.aseoha.MODID;

public class Roundels {
    public static final DeferredRegister<Block> ROUNDELS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static RegistryObject<Block> TOYOTA_ROOF_ROUNDEL = register("toyota_roof_roundel");

    public static RegistryObject<Block> meglos_FULL_ROUNDEL = register("meglos_full_roundel");

    public static RegistryObject<Block> meglos_HALF_ROUNDEL = register("meglos_half_roundel");

    public static RegistryObject<Block> meglos_HALF_ROUNDEL_BOTTOM_EDGE = register("meglos_half_roundel_bottom_edge");

    public static RegistryObject<Block> meglos_HALF_ROUNDEL_TOP_EDGE = register("meglos_half_roundel_top_edge");

    public static RegistryObject<Block> meglos_WHITE_FULL_ROUNDEL = register("meglos_white_full_roundel");

    public static RegistryObject<Block> meglos_WHITE_HALF_ROUNDEL = register("meglos_white_half_roundel");

    public static RegistryObject<Block> meglos_WHITE_HALF_ROUNDEL_BOTTOM_EDGE =
            register("meglos_white_half_roundel_bottom_edge");

    public static RegistryObject<Block> meglos_WHITE_HALF_ROUNDEL_TOP_EDGE =
            register("meglos_white_half_roundel_top_edge");

    public static RegistryObject<Block> meglos_WHITE_HALF_ROUNDEL_TOP = register("meglos_white_half_roundel_top");

    public static RegistryObject<Block> meglos_WHITE_HALF_ROUNDEL_BOTTOM = register("meglos_white_half_roundel_bottom");

    // public static final RegistryObject<Block> MEGLOS_ROUNDEL1 =
    // register("mg_roundel1");
    //
    // public static final RegistryObject<Block> MEGLOS_ROUNDEL2 =
    // register("mg_roundel2");
    //
    // public static final RegistryObject<Block> MEGLOS_ROUNDEL3 =
    // register("mg_roundel3");
    //
    // public static final RegistryObject<Block> MEGLOS_ROUNDEL4 =
    // register("mg_roundel4");
    //
    // public static final RegistryObject<Block> MEGLOS_ROUNDEL5 =
    // register("mg_roundel5");

    public static final RegistryObject<Block> HELLBENT_ROUNDEL1 = register("hb_roundel01");

    public static final RegistryObject<Block> HELLBENT_ROUNDEL2 = register("hb_roundel02");

    public static final RegistryObject<Block> HELLBENT_ROUNDEL3 = register("hb_roundel03");

    public static final RegistryObject<Block> COPPER_ROUNDEL = register("copper_roundel");

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL = register("orange_terracotta_roundel");

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_ROUNDEL_HALF =
            register("orange_terracotta_roundel_half");

    public static void register(IEventBus modEventBus) {
        ROUNDELS.register(modEventBus);
    }

    public static void registerBoth(String name, @NotNull BlockBehaviour.Properties prop) {
        register(name, prop);
        register(name + "_offset", prop);
    }

    public static void register(String name, @NotNull BlockBehaviour.Properties prop) {
        RegistryObject<Block> reg = ABlocks.BLOCKS.register(name, () -> new RoundelBlock(prop));
        ABlocks.registerBlockItem(name, reg);
    }

    public static RegistryObject<Block> register(String name) {
        RegistryObject<Block> reg = ABlocks.BLOCKS.register(
                name,
                () -> new RoundelBlock(BlockBehaviour.Properties.copy(Blocks.CLAY)
                        .sound(SoundType.STONE)
                        .strength(0.5F)
                        .noOcclusion()));
        ABlocks.registerBlockItem(name, reg);
        return reg;
    }
}
