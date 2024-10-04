package com.code.aseoha.block.control;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.DaylightDetectorBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.controls.DimensionControl;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.TextHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("deprecation")
public class DimensionButton extends Block {
    public DimensionButton(Properties prop) {
        super(prop);
        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false));
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
        return (Boolean)state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        FluidState fluid = context.getLevel().getFluidState(context.getClickedPos());
        return (BlockState)((BlockState) Objects.requireNonNull(super.getStateForPlacement(context)).setValue(BlockStateProperties.HORIZONTAL_FACING, Objects.requireNonNull(context.getPlayer()).getDirection().getOpposite())).setValue(BlockStateProperties.WATERLOGGED, fluid.getFluidState().is(FluidTags.WATER));
    }


@NotNull
@Override
    public ActionResultType use(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult hit) {
        if(WorldHelper.isDimensionBlocked(world)){
            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
        } else {
            ConsoleTile console = (ConsoleTile) world.getBlockEntity(TardisHelper.TARDIS_POS);
            assert console != null;
            console.getControl(DimensionControl.class).ifPresent((dimensionControl) -> {
                dimensionControl.onRightClicked(console, player);
            });
            console.updateClient();
        }
        return ActionResultType.SUCCESS;
    }
}
