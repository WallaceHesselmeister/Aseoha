package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.block.ExtrapolatorShieldBlock;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.helper.WorldHelper;

public class ExtrapolatorTile extends TileEntity implements ITickableTileEntity {
    public ExtrapolatorTile() {
        super(AseohaTiles.TRIBOPHYSICAL_WAVEFORM_MACRO_KINETIC_EXTRAPOLATOR_TILE.get());
    }

    boolean isActive = true;

    @Override
    public void tick() {
        assert this.level != null;
        if (!this.level.isClientSide)
            ((ExtrapolatorShieldBlock) this.getBlockState().getBlock()).tick(this.getBlockState(), (ServerWorld) this.getLevel(), this.worldPosition, this.level.getRandom());
    }

    @Override
    public void setRemoved() {
        if(this.getLevel() instanceof ServerWorld)
            WorldHelper.unForceChunkIfLoaded(((ServerWorld) this.getLevel()), new ChunkPos(this.worldPosition), this.worldPosition);
        super.setRemoved();
    }
}