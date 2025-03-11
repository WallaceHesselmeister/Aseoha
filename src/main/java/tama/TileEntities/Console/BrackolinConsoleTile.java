package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.consoles.ConsoleTile;
import tama.TileEntities.ConsoleRegistry;

public class BrackolinConsoleTile extends ConsoleTile {
    public BrackolinConsoleTile(BlockPos pos, BlockState state) {
        super(ConsoleRegistry.BRACKOLIN_CONSOLE_TILE.get(), pos, state);
    }
}
