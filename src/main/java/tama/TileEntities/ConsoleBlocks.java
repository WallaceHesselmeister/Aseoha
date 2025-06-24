/* (C) TAMA Studios 2025 */
package tama.TileEntities;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.block.ConsoleBlock;
import net.tardis.mod.item.SpecialBlockItem;

import java.util.function.Supplier;

import static tama.Items.AItems.ITEMS;
import static tama.aseoha.MODID;

public class ConsoleBlocks {
    /**
     * Block deferred register for exteriors
     */
    public static final DeferredRegister<Block> CONSOLE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static final RegistryObject<ConsoleBlock> COPPER_CONSOLE_BLOCK =
            registerWithItemSpecial("console/copper", () -> new ConsoleBlock(TileRegistry.COPPER_CONSOLE_TILE));
    public static final RegistryObject<ConsoleBlock> TOYOTA_CONSOLE_BLOCK =
            registerWithItemSpecial("console/toyota", () -> new ConsoleBlock(TileRegistry.TOYOTA_CONSOLE_TILE));
    public static final RegistryObject<ConsoleBlock> BRACKOLIN_CONSOLE_BLOCK =
            registerWithItemSpecial("console/brackolin", () -> new ConsoleBlock(TileRegistry.BRACKOLIN_CONSOLE_TILE));
    public static final RegistryObject<ConsoleBlock> TOKAMAK_CONSOLE_BLOCK =
            registerWithItemSpecial("console/tokamak", () -> new ConsoleBlock(TileRegistry.TOKAMAK_CONSOLE_TILE));
    public static final RegistryObject<ConsoleBlock> HARTNELL_CONSOLE_BLOCK =
            registerWithItemSpecial("console/hartnell", () -> new ConsoleBlock(TileRegistry.HARTNELL_CONSOLE_TILE));
    public static final RegistryObject<ConsoleBlock> CORAL_CONSOLE_BLOCK =
            registerWithItemSpecial("console/coral", () -> new ConsoleBlock(TileRegistry.CORAL_CONSOLE_TILE));

    public static <T extends Block> RegistryObject<T> registerWithItemSpecial(String name, final Supplier<T> block) {

        final RegistryObject<T> reg = ConsoleBlocks.CONSOLE_BLOCKS.register(name, block);

        ITEMS.register(name, () -> new SpecialBlockItem(reg.get(), new Item.Properties()));

        return reg;
    }

    public static void Register(IEventBus ModBus) {
        ConsoleBlocks.CONSOLE_BLOCKS.register(ModBus);
    }
}
