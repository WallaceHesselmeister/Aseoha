package com.code.aseoha.client.models.blocks;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

@SuppressWarnings("deprecation")
public class FoodMachine extends Block {
    public static final DirectionProperty facing;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape east;
    protected static final VoxelShape west;
    protected static final VoxelShape south;
    protected static final VoxelShape north;

    public FoodMachine(AbstractBlock.Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(facing, Direction.NORTH)).setValue(WATERLOGGED, false));
    }

    @NotNull
    public VoxelShape getShape(BlockState p_220053_1_, @NotNull IBlockReader p_220053_2_, @NotNull BlockPos p_220053_3_, @NotNull ISelectionContext p_220053_4_) {
        switch ((Direction)p_220053_1_.getValue(facing)) {
            case NORTH:
                return north;
            case SOUTH:
                return south;
            case WEST:
                return west;
            case EAST:
            default:
                return east;
        }
    }

    private boolean canAttachTo(IBlockReader p_196471_1_, BlockPos p_196471_2_, Direction p_196471_3_) {
        BlockState lvt_4_1_ = p_196471_1_.getBlockState(p_196471_2_);
        return lvt_4_1_.isFaceSturdy(p_196471_1_, p_196471_2_, p_196471_3_);
    }

    public boolean isValidPosition(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
        Direction lvt_4_1_ = (Direction)p_196260_1_.getValue(facing);
        return this.canAttachTo(p_196260_2_, p_196260_3_.offset(lvt_4_1_.getOpposite().getNormal()), lvt_4_1_);
    }

    @NotNull
    public BlockState updateShape(BlockState p_196271_1_, Direction p_196271_2_, @NotNull BlockState p_196271_3_, @NotNull IWorld p_196271_4_, @NotNull BlockPos p_196271_5_, BlockPos p_196271_6_) {
        if (p_196271_2_.getOpposite() == p_196271_1_.getValue(facing) && !p_196271_1_.canSurvive(p_196271_4_, p_196271_5_)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            if ((Boolean)p_196271_1_.getValue(WATERLOGGED)) {
                p_196271_4_.getLiquidTicks().scheduleTick(p_196271_5_, Fluids.WATER, Fluids.WATER.getTickDelay(p_196271_4_));
            }

            return super.updateShape(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        BlockState lvt_2_2_;
        if (!p_196258_1_.replacingClickedOnBlock()) {
            lvt_2_2_ = p_196258_1_.getLevel().getBlockState(p_196258_1_.getClickedPos().offset(p_196258_1_.getNearestLookingDirection().getOpposite().getNormal()));
            if (lvt_2_2_.is(this) && lvt_2_2_.getValue(facing) == p_196258_1_.getNearestLookingDirection()) {
                return null;
            }
        }

        lvt_2_2_ = this.defaultBlockState();
        IWorldReader lvt_3_1_ = p_196258_1_.getLevel();
        BlockPos lvt_4_1_ = p_196258_1_.getClickedPos();
        FluidState lvt_5_1_ = p_196258_1_.getLevel().getFluidState(p_196258_1_.getClickedPos());
        Direction[] var6 = p_196258_1_.getNearestLookingDirections();
        int var7 = var6.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Direction lvt_9_1_ = var6[var8];
            if (lvt_9_1_.getAxis().isHorizontal()) {
                lvt_2_2_ = (BlockState)lvt_2_2_.setValue(facing, lvt_9_1_.getOpposite());
                if (lvt_2_2_.canSurvive(lvt_3_1_, lvt_4_1_)) {
                    return (BlockState)lvt_2_2_.setValue(WATERLOGGED, lvt_5_1_.getProperties() == Fluids.WATER);//lvt_5_1_.cycle() == Fluids.WATER);
                }
            }
        }

        return null;
    }

    @NotNull
    public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
        return (BlockState)p_185499_1_.setValue(facing, p_185499_2_.rotate((Direction)p_185499_1_.getValue(facing)));
    }

    @NotNull
    public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
        return p_185471_1_.rotate(p_185471_2_.getRotation((Direction)p_185471_1_.getValue(facing)));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new Property[]{facing, WATERLOGGED});
    }

    @NotNull
    public FluidState getFluidState(BlockState p_204507_1_) {
        return (Boolean)p_204507_1_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_204507_1_);
    }

    static {
        facing = HorizontalBlock.FACING;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
        east= Block.box(4, 0.0, 4, 10.0, 16, 10.0);
        west = Block.box(4, 0.0, 4, 10.0, 16.0, 10.0);
        south = Block.box(4, 0.0, 4, 10.0, 16.0, 10.0);
        north = Block.box(4, 0.0, 4, 10.0, 16.0, 10.0);
    }

    @Override
    public void destroy(@NotNull IWorld p_176206_1_, @NotNull BlockPos p_176206_2_, @NotNull BlockState p_176206_3_) {
        super.destroy(p_176206_1_, p_176206_2_, p_176206_3_);
    }
}