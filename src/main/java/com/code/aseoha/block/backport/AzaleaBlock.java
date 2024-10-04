package com.code.aseoha.block.backport;
import net.minecraft.block.*;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

@SuppressWarnings("deprecation")
public class AzaleaBlock extends BushBlock implements IGrowable {
    private final Tree treeGrower;
    //    public static final MapCodec<AzaleaBlock> CODEC = Codec(AzaleaBlock::new);
    private static final VoxelShape SHAPE = VoxelShapes.or(Block.box(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), Block.box(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

//    public MapCodec<AzaleaBlock> codec() {
//        return CODEC;
//    }

    public AzaleaBlock(Tree tree, AbstractBlock.Properties prop) {
        super(prop);
        this.treeGrower = tree;
    }

    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader reader, @NotNull BlockPos pos, @NotNull ISelectionContext selectionContext) {
        return SHAPE;
    }

    protected boolean mayPlaceOn(BlockState state, @NotNull IBlockReader reader, @NotNull BlockPos pos) {
        return state.is(Blocks.CLAY) || super.mayPlaceOn(state, reader, pos);
    }

    @Override
    public boolean isValidBonemealTarget(@NotNull IBlockReader iBlockReader, @NotNull BlockPos blockPos, @NotNull BlockState blockState, boolean b) {
        return false;
    }

    public boolean isBonemealSuccess(World worldIn, @NotNull Random rand, @NotNull BlockPos pos, @NotNull BlockState state) {
        return (double)worldIn.random.nextFloat() < 0.45;
    }

    public void performBonemeal(@NotNull ServerWorld serverWorld, @NotNull Random random, @NotNull BlockPos pos, @NotNull BlockState state) {
        this.treeGrower.growTree(serverWorld, serverWorld.getChunkSource().getGenerator(), pos, state, random);
    }

}
