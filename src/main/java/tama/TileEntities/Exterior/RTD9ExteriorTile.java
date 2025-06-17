/* (C) TAMA Studios 2025 */
package tama.TileEntities.Exterior;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.exteriors.ExteriorTile;
import tama.TileEntities.TileRegistry;

public class RTD9ExteriorTile extends ExteriorTile {
    public RTD9ExteriorTile(BlockPos pos, BlockState state) {
        super(TileRegistry.RTD_9_EXTERIOR_TILE.get(), pos, state);
    }
}
