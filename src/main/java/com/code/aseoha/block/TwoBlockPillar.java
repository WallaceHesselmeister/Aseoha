package com.code.aseoha.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class TwoBlockPillar extends Block {
    public TwoBlockPillar(Properties props) {
        super(props);
    }

    public static VoxelShape SHAPE = createVoxelShape();

    public static VoxelShape createVoxelShape() {
        VoxelShape shape = VoxelShapes.box(0.4, 0, 0.4, 0.6, 2, 0.6);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.4, 0, 0.4, 0.6, 2, 0.6), IBooleanFunction.OR);
        return shape;
    }

    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        return SHAPE;
    }
}