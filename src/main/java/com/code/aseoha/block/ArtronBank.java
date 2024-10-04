package com.code.aseoha.block;

import com.code.aseoha.misc.PlayerHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class ArtronBank extends Block {
    public ArtronBank(Properties prop) {
        super(prop);
        this.registerDefaultState((BlockState) this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false));
    }

    @NotNull
    public BlockRenderType getRenderShape(@NotNull BlockState state) {
        return BlockRenderType.MODEL;
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.WATERLOGGED});
    }

    @NotNull
    public FluidState getFluidState(BlockState state) {
        return (Boolean) state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public void onPlace(@NotNull BlockState blockState, @NotNull World world, @NotNull BlockPos blockpos, @NotNull BlockState p_220082_4_, boolean p_220082_5_) {
        super.onPlace(blockState, world, blockpos, p_220082_4_, p_220082_5_);
//        ConsoleTile console = (ConsoleTile)world.getBlockEntity(TardisHelper.TARDIS_POS);

//        console.setMaxArtron(console.getMaxArtron() + (float) 32);
    }

    //    private boolean Used = false;
    private float ArtronAmount = 0F;

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState state, @NotNull World worldIn, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
        if (!WorldHelper.isDimensionBlocked(worldIn)) {
            ConsoleTile console = (ConsoleTile) worldIn.getBlockEntity(TardisHelper.TARDIS_POS);
            if (!worldIn.isClientSide) {
                if (player.isCrouching()) {
                    assert console != null;
                    if ((console.getArtron() - 10F) >= 0F) {
                        PlayerHelper.increaseExp(player, 1);
//                        aseoha.LOGGER.info(console.getArtron()-10F);
                        ArtronAmount = -10;
                    } else {
                        return ActionResultType.FAIL;
                    }
                }
                if (!player.isCrouching()) {
                    assert console != null;
                    if ((console.getArtron() + 8) < console.getMaxArtron()) {
                        if (player.totalExperience > 0) {
                            PlayerHelper.decreaseExp(player, 1);
    //                        aseoha.LOGGER.info(player.experienceLevel);
                            ArtronAmount = 8;
                        } else {
                            return ActionResultType.FAIL;
                        }
                    }
                }
                assert console != null;
                console.setArtron((console.getArtron() + (ArtronAmount)));
                return ActionResultType.SUCCESS;
            }
        } else if (WorldHelper.isDimensionBlocked(worldIn)) {
            player.displayClientMessage(TardisConstants.Translations.NO_USE_OUTSIDE_TARDIS, true);
        }

        return ActionResultType.SUCCESS;

    }
}