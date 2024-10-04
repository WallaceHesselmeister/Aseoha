package com.code.aseoha.block;

import com.code.aseoha.misc.TARDISHelper;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.EOHTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.tardis.mod.helper.Helper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class EOH extends Block {
    private boolean hasStar= false;

    public EOH(Properties props) {
        super(props);
    }

    public static VoxelShape SHAPE = createVoxelShape();

    public static VoxelShape createVoxelShape() {
        VoxelShape shape = VoxelShapes.box(0, 0, 0, 1, 1, 1);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0, 0, 0, 1, 1, 1), IBooleanFunction.OR);
        return shape;
    }

    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return AseohaTiles.EYE_OF_HARMONY.get().create();
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState p_225533_1_, @NotNull World p_225533_2_, @NotNull BlockPos p_225533_3_, @NotNull PlayerEntity p_225533_4_, @NotNull Hand p_225533_5_, @NotNull BlockRayTraceResult p_225533_6_) {
        if(!this.hasStar){
            if(p_225533_4_.getMainHandItem().getItem().equals(Items.NETHER_STAR)){
                TileEntity tile = p_225533_2_.getBlockEntity(p_225533_3_);
                if(tile instanceof EOHTile) {
                    ((EOHTile) tile).setHasStar(true);
                    p_225533_4_.getMainHandItem().setCount(p_225533_4_.getMainHandItem().getCount() - 1);
                    this.hasStar = true;
                    return ActionResultType.CONSUME;
                }
                return ActionResultType.FAIL;
            }
            return ActionResultType.FAIL;
        }
        else {
            TileEntity tile = p_225533_2_.getBlockEntity(p_225533_3_);
            if (tile instanceof EOHTile) {
                ((EOHTile) tile).Activate();
                return ActionResultType.SUCCESS;
            }
        }
        return ActionResultType.PASS;
    }

    @Override
    public void destroy(@NotNull IWorld p_176206_1_, @NotNull BlockPos p_176206_2_, @NotNull BlockState p_176206_3_) {
        if(TardisHelper.getConsoleInWorld((World) p_176206_1_).isPresent())
            TardisHelper.getConsoleInWorld((World) p_176206_1_).get().updateArtronValues();
    }
}