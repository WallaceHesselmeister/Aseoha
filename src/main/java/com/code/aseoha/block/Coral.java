package com.code.aseoha.block;

import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class Coral extends Block {
    public Coral(AbstractBlock.Properties props) {
        super(props);
    }
    public static VoxelShape SHAPE = createVoxelShape();

    public static VoxelShape createVoxelShape() {
        VoxelShape shape = VoxelShapes.box(0.359375, 0.625, 0.359375, 0.640625, 0.6875, 0.640625);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.390625, 0.6875, 0.390625, 0.609375, 0.703125, 0.609375), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.4375, 0.953125, 0.4375, 0.5625, 0.96875, 0.5625), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.421875, 0.671875, 0.421875, 0.578125, 0.875, 0.578125), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.453125, 0.84375, 0.453125, 0.546875, 1.0, 0.546875), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.4375, 0.890625, 0.4375, 0.5625, 0.90625, 0.5625), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.4375, 0.921875, 0.4375, 0.5625, 0.9375, 0.5625), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.375, 0.5, 0.375, 0.625, 0.625, 0.625), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.3125, 0.0625, 0.3125, 0.6875, 0.5, 0.6875), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.375, 0.015625, 0.375, 0.625, 0.0625, 0.625), IBooleanFunction.OR);
//        shape = VoxelShapes.join(shape, VoxelShapes.box(0.34375, 0.03125, 0.34375, 0.65625, 0.59375, 0.65625), IBooleanFunction.OR);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0.328125, 0.046875, 0.328125, 0.671875, 0.546875, 0.671875), IBooleanFunction.OR);
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
        return AseohaTiles.TARDIS_CORAL.get().create();
    }
}
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
//        return (Boolean) state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
//    }
//
//    private static long prevTime = 0;
//
//    private static long setGetPrevTime(long curTime, boolean overwrite){
//    if (prevTime == 0 || overwrite) {
//        prevTime = curTime;
//    }
//
//    else{
//
//    }
//    return prevTime;
////        return flightFromSonic;
//    }
//
//    @Override
//    public void onPlace(BlockState blockState, World world, BlockPos blockpos, BlockState p_220082_4_, boolean p_220082_5_) {
//        super.onPlace(blockState, world, blockpos, p_220082_4_, p_220082_5_);
//        aseoha.LOGGER.info("PLACED");
//        setGetPrevTime(world.getGameTime(), false);
////        ConsoleTile console = (ConsoleTile)world.getBlockEntity(TardisHelper.TARDIS_POS);
//
////        console.setMaxArtron(console.getMaxArtron() + (float) 32);
//
//    }
//
//    public static void tick(BlockState blockState, World world, BlockPos blockpos, BlockState p_220082_4_, boolean p_220082_5_){
//        setGetPrevTime(world.getGameTime(), false);
//        aseoha.LOGGER.info("{}PREVTIME", setGetPrevTime(world.getGameTime(), false));
//        aseoha.LOGGER.info("{}MATHTIME", world.getGameTime() - setGetPrevTime(world.getGameTime(), false));
//        if(world.getGameTime() - setGetPrevTime(world.getGameTime(), false) == 100){
//            aseoha.LOGGER.info("DO SOMETHING");
//            TARDISHelper.createTARDIS(blockpos, Objects.requireNonNull(world.getServer()).getLevel(world.dimension()), ExteriorRegistry.TT_CAPSULE.get(), ConsoleRoom.IMPERIAL, ConsoleRegistry.HARTNELL.get());
//            world.removeBlock(blockpos, true);
            //            world.addBlockEntity(ChestTileEntity)
//        }
//    }
    //    private boolean Used = false;
//    private float ArtronAmount = 0F;
//
//    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
//        if (!WorldHelper.isDimensionBlocked(worldIn)) {
//            ConsoleTile console = (ConsoleTile) worldIn.getBlockEntity(TardisHelper.TARDIS_POS);
//            if (!worldIn.isClientSide) {
//                if (player.isCrouching()) {
//                    if ((console.getArtron() - 10F) >= 0F) {
//                        PlayerHelper.increaseExp(player, 1);
////                        aseoha.LOGGER.info(console.getArtron()-10F);
//                        ArtronAmount = -10;
//                    } else {
//                        return ActionResultType.FAIL;
//                    }
//                }
//                if (!player.isCrouching() && (console.getArtron() + 8) < console.getMaxArtron()) {
//                    if (player.totalExperience > 0) {
//                        PlayerHelper.decreaseExp(player, 1);
////                        aseoha.LOGGER.info(player.experienceLevel);
//                        ArtronAmount = 8;
//                    } else {
//                        return ActionResultType.FAIL;
//                    }
//                }
//                console.setArtron((console.getArtron() + (ArtronAmount)));
//                return ActionResultType.SUCCESS;
//            }
////            if(console.getArtron() >= (float) (ArtronAmount*16)) {
//
////            }
//        } else if (WorldHelper.isDimensionBlocked(worldIn)) {
//            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
//        }
//
//        return ActionResultType.SUCCESS;
//
//    }
//}
//
//    public static class ArtronBankItem extends BlockItem {
//        private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.artronbank.desc"));
//
//        public ArtronBankItem(Block p_i48527_1_, Properties p_i48527_2_) {
//            super(p_i48527_1_, p_i48527_2_);
//        }
//
//        public ArtronBankItem(Block blockIn, MultiblockPatterns.MultiblockPattern pattern, Properties builder) {
//            super(blockIn, pattern, builder);
//        }}
//private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.artronbank.desc"));
//        public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
//            super.appendHoverText(stack, worldIn, tooltip, flagIn);
//
//            tooltip.add(Translations.TOOLTIP_CONTROL);
//            if (Screen.hasControlDown()) {
//                tooltip.clear();
//                tooltip.add(0, stack.getHoverName());
//                tooltip.add(this.descriptionTooltip);
//            }
//
//        }}


//    public void onRemove(BlockState state, World worldIn, BlockPos pos, BlockState newState, boolean isMoving) {
//        QuantiscopeTile tileEntity = (QuantiscopeTile)worldIn.getBlockEntity(pos);
//        if (tileEntity != null && state.getBlock() != newState.getBlock()) {
//            TInventoryHelper.dropInventoryItems(worldIn, pos, tileEntity);
//            worldIn.removeBlockEntity(pos);
//        ConsoleTile console = (ConsoleTile) worldIn.getBlockEntity(TardisHelper.TARDIS_POS);
//        if (worldIn.isClientSide) {
//            if(Used==true){
//        console.setMaxArtron(console.getMaxArtron() - 64);
//        Used=false;
//    }
//        }}
//    }



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
