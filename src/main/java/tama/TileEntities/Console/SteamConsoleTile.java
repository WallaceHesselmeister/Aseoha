/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.ConsoleBlocks;
import tama.TileEntities.TileRegistry;

public class SteamConsoleTile<T extends ConsoleTile> extends ConsoleTile {
    public SteamConsoleTile(BlockPos pos, BlockState state, RegistryObject<BlockEntityType<T>> te) {
        super(te.get(), pos, state);
    }
}
