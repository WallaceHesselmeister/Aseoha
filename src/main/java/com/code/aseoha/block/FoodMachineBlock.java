package com.code.aseoha.block;

import java.util.List;
import java.util.Objects;

import com.code.aseoha.Helpers.KeyboardHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.*;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.TextHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class FoodMachineBlock extends Block implements IWaterLoggable {
VoxelShape voxel = Block.box(3, 0, 3.6999999999999997, 13, 22, 12.700000000000001);

    @NotNull
    @Override
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context){
        return voxel.optimize();
    }


    public FoodMachineBlock(Properties prop) {
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
    public ActionResultType use(@NotNull BlockState state, @NotNull World worldIn, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
        if (!WorldHelper.isDimensionBlocked(worldIn)) {
            ConsoleTile console = (ConsoleTile)worldIn.getBlockEntity(TardisHelper.TARDIS_POS);

            assert console != null;
            if (console.getArtron() >= (float) 16 && KeyboardHelper.isHoldingAlt() && !player.isCrouching()) {
                    player.addItem(new ItemStack(Items.CARROT, (int) 1));
                }
                if (console.getArtron() >= (float) 16 && player.isCrouching() && !KeyboardHelper.isHoldingAlt()) {
                    player.addItem(new ItemStack(Items.BONE_MEAL, (int) 1));
                }
                if (console.getArtron() >= (float) 16 && !KeyboardHelper.isHoldingAlt() && !player.isCrouching()) {
                    player.addItem(new ItemStack(Items.POTATO, (int) 1));
                }

//            if(console.getArtron() >= (float) (1 * 16)) {
                console.setArtron((console.getArtron() - (1 * 16)));
//            }
        } else if (!worldIn.isClientSide()) {
            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
        }

        return ActionResultType.SUCCESS;
    }

    public static class FoodMachineBlockItem extends BlockItem {
        private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.foodmachine.desc"));

        public FoodMachineBlockItem(Block blockIn, Properties builder) {
            super(blockIn, builder);
        }

        public void appendHoverText(@NotNull ItemStack stack, World worldIn, @NotNull List<ITextComponent> tooltip, @NotNull ITooltipFlag flagIn) {
            super.appendHoverText(stack, worldIn, tooltip, flagIn);
            tooltip.add(Translations.TOOLTIP_CONTROL);
            if (Screen.hasControlDown()) {
                tooltip.clear();
                tooltip.add(0, stack.getHoverName());
                tooltip.add(this.descriptionTooltip);
            }

        }
    }
}



//package com.code.aseoha.block;
//
//import java.util.List;
//import net.minecraft.block.AbstractBlock;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockRenderType;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.IWaterLoggable;
//import net.minecraft.client.gui.screen.Screen;
//import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.entity.player.ServerPlayerEntity;
//import net.minecraft.fluid.FluidState;
//import net.minecraft.fluid.Fluids;
//import net.minecraft.item.BlockItemUseContext;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.item.Items;
//import net.minecraft.state.Property;
//import net.minecraft.state.StateContainer;
//import net.minecraft.state.properties.BlockStateProperties;
//import net.minecraft.tags.FluidTags;
//import net.minecraft.util.ActionResultType;
//import net.minecraft.util.Hand;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.BlockRayTraceResult;
//import net.minecraft.util.text.IFormattableTextComponent;
//import net.minecraft.util.text.ITextComponent;
//import net.minecraft.util.text.TranslationTextComponent;
//import net.minecraft.world.World;
//import net.minecraftforge.fml.network.NetworkHooks;
//import net.tardis.mod.blocks.MultiblockBlock;
//import net.tardis.mod.blocks.multiblock.MultiblockPatterns;
//import net.tardis.mod.constants.TardisConstants;
//import net.tardis.mod.constants.TardisConstants.Translations;
//import net.tardis.mod.containers.WaypointBankContainer;
//import net.tardis.mod.helper.TextHelper;
//import net.tardis.mod.helper.WorldHelper;
//import net.tardis.mod.items.MultiblockBlockItem;
//import net.tardis.mod.misc.ContainerProvider;
//import net.tardis.mod.tileentities.WaypointBankTile;
//
//public class FoodMachineBlock extends MultiblockBlock implements IWaterLoggable {
//    public FoodMachineBlock(AbstractBlock.Properties prop) {
//        super(prop);
//        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false));
//    }
//
//    public BlockRenderType getRenderShape(BlockState state) {
//        return BlockRenderType.MODEL;
//    }
//
//    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
//        builder.add(new Property[]{BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.WATERLOGGED});
//    }
//
//    public FluidState getFluidState(BlockState state) {
//        return (Boolean)state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
//    }
//
//    public BlockState getStateForPlacement(BlockItemUseContext context) {
//        FluidState fluid = context.getLevel().getFluidState(context.getClickedPos());
//        return (BlockState)((BlockState)super.getStateForPlacement(context).setValue(BlockStateProperties.HORIZONTAL_FACING, context.getPlayer().getDirection().getOpposite())).setValue(BlockStateProperties.WATERLOGGED, fluid.getFluidState().is(FluidTags.WATER));
//    }
//
//    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
////        if (!worldIn.isClientSide) {
////            NetworkHooks.openGui((ServerPlayerEntity)player, new ContainerProvider("container.tardis.waypoint", (id, inv, player1) -> {
////                return new WaypointBankContainer(id, inv, (WaypointBankTile)worldIn.getBlockEntity(pos));
////            }), pos);
////        }
////
////        return ActionResultType.SUCCESS;
//
//        if (!WorldHelper.isDimensionBlocked(worldIn)) {
//            if (worldIn.isClientSide) {
//                if (player.isCrouching()) {
//                    player.addItem(new ItemStack(Items.COOKED_BEEF, 16));
//                }
//                else  {
//                    player.addItem(new ItemStack(Items.COOKED_BEEF, 1));
//                }
//            }
//        } else if (!worldIn.isClientSide()) {
//            player.displayClientMessage(TardisConstants.Translations.NO_USE_OUTSIDE_TARDIS, true);
//        }
//
//        return ActionResultType.SUCCESS;
//    }
//
//}
//
//public static class FoodMachineBlockItem extends MultiblockBlockItem {
//    private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.food_machine.desc"));
//
//    public FoodMachineBlockItem(Block blockIn, MultiblockPatterns.MultiblockPattern pattern, Item.Properties builder) {
//        super(blockIn, pattern, builder);
//    }
//
//    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
//        super.appendHoverText(stack, worldIn, tooltip, flagIn);
//        tooltip.add(Translations.TOOLTIP_CONTROL);
//        if (Screen.hasControlDown()) {
//            tooltip.clear();
//            tooltip.add(0, stack.getHoverName());
//            tooltip.add(this.descriptionTooltip);
//        }
//
//    }
//}
//}
