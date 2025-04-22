package com.code.aseoha.backport.ntm.block;

import com.code.aseoha.backport.ntm.Helper;
import com.code.aseoha.backport.ntm.WorldHelper;
import com.code.aseoha.backport.ntm.block.misc.DirectionalVoxelShape;
import com.code.aseoha.backport.ntm.block.misc.SimpleHorizonalBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.Half;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.tardis.mod.blocks.TBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RailingBlock extends SimpleHorizonalBlock {

    public static final DirectionalVoxelShape LEFT_SHAPE = new DirectionalVoxelShape(Helper.blockShapePixels(14, 0, 0, 16, 16, 16));
    public static final DirectionalVoxelShape RIGHT_SHAPE = new DirectionalVoxelShape(Helper.blockShapePixels(0, 0, 0, 2, 16, 16));


    public static final BooleanProperty IS_ANGLED = BooleanProperty.create("is_angled");
    public static final BooleanProperty RIGHT = BooleanProperty.create("right");

    public RailingBlock(Properties pProperties) {
        super(pProperties);
    }

    public static RailingBlock create(){
        return new RailingBlock(Properties.copy(TBlocks.tungsten.get()).noOcclusion());
    }

    
    @Override
    public @Nullable BlockState getStateForPlacement(@NotNull BlockItemUseContext pContext) {
        return setRightFromPlacement(stateBasedOnWorld(super.getStateForPlacement(pContext), pContext.getLevel(), pContext.getClickedPos()), pContext);
    }

    @Override
    protected void createBlockStateDefinition(@NotNull StateContainer.Builder<Block, BlockState> pBuilder) {
        super.createBlockStateDefinition(pBuilder);
        pBuilder.add(IS_ANGLED, RIGHT);
    }

    public BlockState stateBasedOnWorld(BlockState original, World level, BlockPos pos){
        final BlockState below = level.getBlockState(pos.below());
        if(below.is(BlockTags.STAIRS)){
            if(
                    WorldHelper.stateValueEquals(below, StairsBlock.HALF, Half.BOTTOM, false) &&
                            WorldHelper.stateValueEquals(below, BlockStateProperties.HORIZONTAL_FACING, original.getValue(BlockStateProperties.HORIZONTAL_FACING).getOpposite(), false)
            ){
                return original.setValue(IS_ANGLED, true);
            }
        }
        return original.setValue(IS_ANGLED, false);
    }

    @NotNull
    @Override
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        return state.getValue(RIGHT) ?
                RIGHT_SHAPE.getShapeFor(state.getValue(BlockStateProperties.HORIZONTAL_FACING)) :
                LEFT_SHAPE.getShapeFor(state.getValue(BlockStateProperties.HORIZONTAL_FACING));
    }

    @SuppressWarnings("deprecation")
    @Override
    public void neighborChanged(@NotNull BlockState pState, @NotNull World pLevel, @NotNull BlockPos pPos, @NotNull Block pNeighborBlock, @NotNull BlockPos pNeighborPos, boolean pMovedByPiston) {
        super.neighborChanged(pState, pLevel, pPos, pNeighborBlock, pNeighborPos, pMovedByPiston);
        BlockState newState = stateBasedOnWorld(pState, pLevel, pPos);
        if(!newState.equals(pState))
            pLevel.setBlock(pPos, newState, 3);
    }

    public static BlockState setRightFromPlacement(BlockState state, BlockItemUseContext context){
        Vector3d vec = context.getClickLocation().subtract(WorldHelper.centerOfBlockPos(context.getClickedPos()))
                .yRot(state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot());
        return state.setValue(RIGHT, vec.x() > 0);
    }
}
