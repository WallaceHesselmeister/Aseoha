/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.ConsoleRegistry;

public class ToyotaConsoleTile extends ConsoleTile {
    public ToyotaConsoleTile(BlockPos pos, BlockState state) {
        super(ConsoleRegistry.TOYOTA_CONSOLE_TILE.get(), pos, state);
    }
}
