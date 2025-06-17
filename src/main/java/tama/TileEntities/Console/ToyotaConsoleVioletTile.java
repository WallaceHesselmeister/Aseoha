/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.TileRegistry;

public class ToyotaConsoleVioletTile extends ConsoleTile {
    public ToyotaConsoleVioletTile(BlockPos pos, BlockState state) {
        super(TileRegistry.TOYOTA_CONSOLE_TILE_VIOLET.get(), pos, state);
    }
}
