/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.ConsoleRegistry;

public class HartnellConsoleTile extends ConsoleTile {
    public HartnellConsoleTile(BlockPos pos, BlockState state) {
        super(ConsoleRegistry.HARTNELL_CONSOLE_TILE.get(), pos, state);
    }
}
