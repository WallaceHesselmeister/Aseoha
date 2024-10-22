package com.code.aseoha.block;

import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class WorkbenchBlock extends Block {
    public WorkbenchBlock(Properties props) {
        super(props);
    }

    public void tickFunction(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, int timer) {

    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return AseohaTiles.WORKBENCH.get().create();
    }
}