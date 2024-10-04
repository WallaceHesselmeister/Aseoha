package com.code.aseoha.block.control;

import com.code.aseoha.misc.TARDISHelper;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.controls.RefuelerControl;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.tileentities.ConsoleTile;

import net.minecraft.block.WoodButtonBlock;
import org.jetbrains.annotations.NotNull;

public class FlightButton extends WoodButtonBlock {
    public FlightButton(Properties prop) {
        super(prop);
//        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false));
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState state, @NotNull World worldIn, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
        if (!WorldHelper.isDimensionBlocked(worldIn)) {
            ConsoleTile console = (ConsoleTile)worldIn.getBlockEntity(TardisHelper.TARDIS_POS);
            if (!worldIn.isClientSide) {
                assert console != null;
                console.getControl(HandbrakeControl.class).ifPresent((handbreak) -> {handbreak.setFree(true);});
                TARDISHelper.setDoorState(console, 0);
                console.getControl(RefuelerControl.class).ifPresent((ref) -> {ref.setRefueling(false);});
                console.getSubsystem(StabilizerSubsystem.class).ifPresent((sys) -> {sys.setControlActivated(true);});
                console.takeoff();
            }
            if ((Boolean)state.getValue(POWERED)) {
                return ActionResultType.CONSUME;
            } else {
                this.press(state, worldIn, pos);
                this.playSound(player, worldIn, pos, true);
                return ActionResultType.sidedSuccess(worldIn.isClientSide);
            }
        } else if (WorldHelper.isDimensionBlocked(worldIn)) {
            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
        }

        return ActionResultType.SUCCESS;

    }}

//    private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.flightbutton.desc"));
//    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
//        super.appendHoverText(stack, worldIn, tooltip, flagIn);
//
//        tooltip.add(Translations.TOOLTIP_CONTROL);
//        if (Screen.hasControlDown()) {
//            tooltip.clear();
//            tooltip.add(0, stack.getHoverName());
//            tooltip.add(this.descriptionTooltip);
//        }
//
//    }}
//public class FlightButton extends Block {
//    public FlightButton(Properties prop) {
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
//    @Override
//    public void onPlace(BlockState blockState, World world, BlockPos blockpos, BlockState p_220082_4_, boolean p_220082_5_) {
//        super.onPlace(blockState, world, blockpos, p_220082_4_, p_220082_5_);
////        ConsoleTile console = (ConsoleTile)world.getBlockEntity(TardisHelper.TARDIS_POS);
//
////        console.setMaxArtron(console.getMaxArtron() + (float) 32);
//    }
//
//    //    private boolean Used = false;
//private float ArtronAmount = 0F;
//    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
//        if (!WorldHelper.isDimensionBlocked(worldIn)) {
//            ConsoleTile console = (ConsoleTile)worldIn.getBlockEntity(TardisHelper.TARDIS_POS);
//            if (!worldIn.isClientSide) {
//                console.getControl(HandbrakeControl.class).ifPresent((handbreak) -> {
//                    handbreak.setFree(true);
//                });
//                DoorEntity doorEntity;
//                for(Iterator i = console.getLevel().getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {
//                    doorEntity = (DoorEntity) i.next();
//
//                    doorEntity.setOpenState(EnumDoorState.CLOSED);
//                }
//                console.getControl(RefuelerControl.class).ifPresent((ref) -> {ref.setRefueling(false);});
//                console.getSubsystem(StabilizerSubsystem.class).ifPresent((sys) -> {sys.setControlActivated(true);});
//                console.takeoff();
//
////                console.setArtron(console.getArtron()/4F);
//                return ActionResultType.SUCCESS;
//            }
//        } else if (WorldHelper.isDimensionBlocked(worldIn)) {
//            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
//        }
//
//        return ActionResultType.SUCCESS;
//
//    }
//
////    public static class FlightButtonBlockItem extends BlockItem {
////        private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.artronbank.desc"));
////
////        public FlightButtonBlockItem(Block p_i48527_1_, Properties p_i48527_2_) {
////            super(p_i48527_1_, p_i48527_2_);
////        }
////
////        public FlightButtonBlockItem(Block blockIn, MultiblockPatterns.MultiblockPattern pattern, Properties builder) {
////            super(blockIn, pattern, builder);
////        }
//private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.flightbutton.desc"));
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



