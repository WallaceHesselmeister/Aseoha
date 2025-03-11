package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.TileRegistry;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.ConsoleRegistry;

public class CopperConsoleTile extends ConsoleTile {
    public CopperConsoleTile(BlockPos pos, BlockState state) {
        super(ConsoleRegistry.COPPER_CONSOLE_TILE.get(), pos, state);
    }
}
