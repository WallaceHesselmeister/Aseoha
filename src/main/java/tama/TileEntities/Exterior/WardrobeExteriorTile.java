package tama.TileEntities.Exterior;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.blockentities.exteriors.ExteriorTile;
import tama.TileEntities.ExteriorRegistry;

public class WardrobeExteriorTile extends ExteriorTile {
    public WardrobeExteriorTile(BlockPos pos, BlockState state) {
        super(ExteriorRegistry.WARDROBE_EXTERIOR_TILE.get(), pos, state);
    }
}
