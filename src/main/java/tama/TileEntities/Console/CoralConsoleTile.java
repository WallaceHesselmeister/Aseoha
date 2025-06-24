/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.TileRegistry;

public class CoralConsoleTile extends ConsoleTile {
    public CoralConsoleTile(BlockPos pos, BlockState state) {
        super(TileRegistry.CORAL_CONSOLE_TILE.get(), pos, state);
    }
}
