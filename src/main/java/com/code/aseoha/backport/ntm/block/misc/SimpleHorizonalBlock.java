package com.code.aseoha.backport.ntm.block.misc;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("deprecation")
public class SimpleHorizonalBlock extends Block {

    public static DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    private DirectionalVoxelShape shape;

    public SimpleHorizonalBlock(Properties pProperties) {
        super(pProperties);
    }

    public SimpleHorizonalBlock withShape(VoxelShape defaultShape){
        this.shape = new DirectionalVoxelShape(defaultShape);
        return this;
    }
    @NotNull
    @Override
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        if(this.shape == null)
            return super.getShape(state, worldIn, pos, context);
        return this.shape.getShapeFor(state.getValue(FACING));
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(@NotNull BlockItemUseContext pContext) {
        return super.getStateForPlacement(pContext)
                .setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }


    @Override
    protected void createBlockStateDefinition(@NotNull StateContainer.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(FACING);
    }

    @NotNull
    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(BlockStateProperties.HORIZONTAL_FACING, pRotation.rotate(pState.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }

    @NotNull
    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.setValue(BlockStateProperties.HORIZONTAL_FACING, mirror.mirror(state.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }
}
