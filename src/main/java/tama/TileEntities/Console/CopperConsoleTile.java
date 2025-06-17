/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.TileRegistry;

public class CopperConsoleTile extends ConsoleTile {
    public CopperConsoleTile(BlockPos pos, BlockState state) {
        super(TileRegistry.COPPER_CONSOLE_TILE.get(), pos, state);
    }
}
