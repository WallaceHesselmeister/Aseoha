/* (C) TAMA Studios 2025 */
package tama.TileEntities.Console;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.blockentities.consoles.ConsoleTile;

public class BaseConsoleTile<T extends ConsoleTile> extends ConsoleTile {
    public BaseConsoleTile(BlockPos pos, BlockState state, RegistryObject<BlockEntityType<T>> te) {
        super(te.get(), pos, state);
    }
}
