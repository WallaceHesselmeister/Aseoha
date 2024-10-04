package com.code.aseoha.block.control;

import net.minecraft.block.BlockState;
import net.minecraft.block.ComparatorBlock;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.properties.ComparatorMode;
import net.minecraft.tileentity.ComparatorTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.controls.RandomiserControl;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.TextHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.List;

public class RandomizeButton extends ComparatorBlock {
    public RandomizeButton(Properties prop) {
        super(prop);
//        this.registerDefaultState((BlockState)this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false));
    }

    @NotNull
    public ActionResultType use(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos blockPos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult hit) {
        if (!WorldHelper.isDimensionBlocked(world)) {
            ConsoleTile console = (ConsoleTile) world.getBlockEntity(TardisHelper.TARDIS_POS);
            assert console != null;
            console.getControl(RandomiserControl.class).ifPresent((control) -> {
                control.onRightClicked(console, player);
            });
            console.updateClient();
            if (!player.abilities.mayBuild) {
                return ActionResultType.PASS;
            } else {
                state = (BlockState) state.cycle(MODE);
                float f = state.getValue(MODE) == ComparatorMode.SUBTRACT ? 0.55F : 0.5F;
                world.playSound(player, blockPos, SoundEvents.COMPARATOR_CLICK, SoundCategory.BLOCKS, 0.3F, f);
                world.setBlock(blockPos, state, 2);
                this.refreshOutputState(world, blockPos, state);
                return ActionResultType.sidedSuccess(world.isClientSide);
            }
        } else if (WorldHelper.isDimensionBlocked(world)) {
            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
        }
        return ActionResultType.SUCCESS;
    }

    private final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.flightbutton.desc"));

    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);

        tooltip.add(Translations.TOOLTIP_CONTROL);
        if (Screen.hasControlDown()) {
            tooltip.clear();
            tooltip.add(0, stack.getHoverName());
            tooltip.add(this.descriptionTooltip);
        }

    }

    private int calculateOutputSignal(World world, BlockPos pos, BlockState state) {
        return state.getValue(ComparatorBlock.MODE) == ComparatorMode.SUBTRACT ? Math.max(this.getInputSignal(world, pos, state) - this.getAlternateSignal(world, pos, state), 0) : this.getInputSignal(world, pos, state);
    }

    private void refreshOutputState(World world, BlockPos pos, BlockState state) {
        int i = this.calculateOutputSignal(world, pos, state);
        TileEntity tileentity = world.getBlockEntity(pos);
        int j = 0;
        if (tileentity instanceof ComparatorTileEntity) {
            ComparatorTileEntity comparatortileentity = (ComparatorTileEntity) tileentity;
            j = comparatortileentity.getOutputSignal();
            comparatortileentity.setOutputSignal(i);
        }

        if (j != i || state.getValue(ComparatorBlock.MODE) == ComparatorMode.COMPARE) {
            boolean flag1 = this.shouldTurnOn(world, pos, state);
            boolean flag = (Boolean) state.getValue(ComparatorBlock.POWERED);
            if (flag && !flag1) {
                world.setBlock(pos, (BlockState) state.setValue(ComparatorBlock.POWERED, false), 2);
            } else if (!flag && flag1) {
                world.setBlock(pos, (BlockState) state.setValue(ComparatorBlock.POWERED, true), 2);
            }

            this.updateNeighborsInFront(world, pos, state);
        }

    }

    protected int getInputSignal(@NotNull World world, @NotNull BlockPos pos, @NotNull BlockState state) {
        int i = super.getInputSignal(world, pos, state);
        Direction direction = (Direction) state.getValue(FACING);
        BlockPos blockpos = pos.relative(direction);
        BlockState blockstate = world.getBlockState(blockpos);
        if (blockstate.hasAnalogOutputSignal()) {
            i = blockstate.getAnalogOutputSignal(world, blockpos);
        } else if (i < 15 && blockstate.isRedstoneConductor(world, blockpos)) {
            blockpos = blockpos.relative(direction);
            blockstate = world.getBlockState(blockpos);
            ItemFrameEntity itemframeentity = this.getItemFrame(world, direction, blockpos);
            int j = Math.max(itemframeentity == null ? Integer.MIN_VALUE : itemframeentity.getAnalogOutput(), blockstate.hasAnalogOutputSignal() ? blockstate.getAnalogOutputSignal(world, blockpos) : Integer.MIN_VALUE);
            if (j != Integer.MIN_VALUE) {
                i = j;
            }
        }

        return i;
    }

    @Nullable
    private ItemFrameEntity getItemFrame(World world, Direction direction, BlockPos pos) {
        List<ItemFrameEntity> list = world.getEntitiesOfClass(ItemFrameEntity.class, new AxisAlignedBB((double) pos.getX(), (double) pos.getY(), (double) pos.getZ(), (double) (pos.getX() + 1), (double) (pos.getY() + 1), (double) (pos.getZ() + 1)), (p_210304_1_) -> {
            return p_210304_1_ != null && p_210304_1_.getDirection() == direction;
        });
        return list.size() == 1 ? (ItemFrameEntity) list.get(0) : null;
    }

    protected void updateNeighborsInFront(@NotNull World world, BlockPos pos, BlockState state) {
        Direction direction = (Direction) state.getValue(ComparatorBlock.FACING);
        BlockPos blockpos = pos.relative(direction.getOpposite());
        if (!ForgeEventFactory.onNeighborNotify(world, pos, world.getBlockState(pos), EnumSet.of(direction.getOpposite()), false).isCanceled()) {
            world.neighborChanged(blockpos, this, pos);
            world.updateNeighborsAtExceptFromFacing(blockpos, this, direction);
        }
    }

    protected boolean shouldTurnOn(@NotNull World world, @NotNull BlockPos pos, @NotNull BlockState state) {
        int i = this.getInputSignal(world, pos, state);
        if (i == 0) {
            return false;
        } else {
            int j = this.getAlternateSignal(world, pos, state);
            if (i > j) {
                return true;
            } else {
                return i == j && state.getValue(MODE) == ComparatorMode.COMPARE;
            }
        }
    }
}









//
//package com.code.aseoha.block.control;
//
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockRenderType;
//import net.minecraft.block.BlockState;
//import net.minecraft.client.gui.screen.Screen;
//import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.fluid.FluidState;
//import net.minecraft.fluid.Fluids;
//import net.minecraft.item.BlockItemUseContext;
//import net.minecraft.item.ItemStack;
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
//import net.tardis.mod.constants.TardisConstants.Translations;
//import net.tardis.mod.controls.RandomiserControl;
//import net.tardis.mod.helper.TardisHelper;
//import net.tardis.mod.helper.TextHelper;
//import net.tardis.mod.helper.WorldHelper;
//import net.tardis.mod.tileentities.ConsoleTile;
//
//import java.util.List;
//
//public class RandomizeButton extends Block {
//    public RandomizeButton(Properties prop) {
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
////                console.getControl(HandbrakeControl.class).ifPresent((handbreak) -> {
////                    handbreak.setFree(true);
////                });
////                DoorEntity doorEntity;
////                for(Iterator var4 = console.getLevel().getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); var4.hasNext(); doorEntity.updateExteriorDoorData()) {
////                    doorEntity = (DoorEntity) var4.next();
////
////                    doorEntity.setOpenState(EnumDoorState.CLOSED);
////                }
////                console.getControl(RefuelerControl.class).ifPresent((ref) -> {ref.setRefueling(false);});
////                console.getSubsystem(StabilizerSubsystem.class).ifPresent((sys) -> {sys.setControlActivated(true);});
////                console.takeoff();
////
////                console.setArtron(console.getArtron()/4F);
////                console.getControl(DimensionControl.class).ifPresent((dimensionControl) -> {
////                    dimensionControl.onRightClicked(console, player);
////                });
//
//                console.getControl(RandomiserControl.class).ifPresent((randomiserControl) -> {
//                    randomiserControl.onRightClicked(console, player);
//                });
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
//
//
//
//
//
////package net.tardis.mod.controls;
////
////import net.minecraft.entity.EntitySize;
////import net.minecraft.entity.player.PlayerEntity;
////import net.minecraft.nbt.CompoundNBT;
////import net.minecraft.util.ResourceLocation;
////import net.minecraft.util.SoundEvent;
////import net.minecraft.util.math.vector.Vector3d;
////import net.tardis.mod.entity.ControlEntity;
////import net.tardis.mod.misc.CrashTypes;
////import net.tardis.mod.registries.ControlRegistry;
////import net.tardis.mod.sounds.TSounds;
////import net.tardis.mod.tileentities.ConsoleTile;
////import net.tardis.mod.tileentities.consoles.CoralConsoleTile;
////import net.tardis.mod.tileentities.consoles.GalvanicConsoleTile;
////import net.tardis.mod.tileentities.consoles.HartnellConsoleTile;
////import net.tardis.mod.tileentities.consoles.KeltConsoleTile;
////import net.tardis.mod.tileentities.consoles.NemoConsoleTile;
////import net.tardis.mod.tileentities.consoles.NeutronConsoleTile;
////import net.tardis.mod.tileentities.consoles.ToyotaConsoleTile;
////import net.tardis.mod.tileentities.consoles.XionConsoleTile;
////
////public class HandbrakeControl extends BaseControl {
////    public static final ResourceLocation SAVE_KEY = new ResourceLocation("tardis", "handbrake_data");
////    private boolean isFree = false;
////
////    public HandbrakeControl(ControlRegistry.ControlEntry entry, ConsoleTile console, ControlEntity entity) {
////        super(entry, console, entity);
////    }
////
////    public EntitySize getSize() {
////        if (this.getConsole() instanceof NemoConsoleTile) {
////            return EntitySize.scalable(0.1875F, 0.1875F);
////        } else if (this.getConsole() instanceof GalvanicConsoleTile) {
////            return EntitySize.scalable(0.1875F, 0.1875F);
////        } else if (this.getConsole() instanceof CoralConsoleTile) {
////            return EntitySize.scalable(0.1875F, 0.1875F);
////        } else if (this.getConsole() instanceof HartnellConsoleTile) {
////            return EntitySize.scalable(0.1875F, 0.1875F);
////        } else if (this.getConsole() instanceof XionConsoleTile) {
////            return EntitySize.scalable(0.1875F, 0.1875F);
////        } else if (this.getConsole() instanceof ToyotaConsoleTile) {
////            return EntitySize.scalable(0.1875F, 0.1875F);
////        } else if (this.getConsole() instanceof NeutronConsoleTile) {
////            return EntitySize.scalable(0.25F, 0.25F);
////        } else {
////            return this.getConsole() instanceof KeltConsoleTile ? EntitySize.scalable(0.1875F, 0.1875F) : EntitySize.scalable(0.1875F, 0.1875F);
////        }
////    }
////
////    public Vector3d getPos() {
////        if (this.getConsole() instanceof NemoConsoleTile) {
////            return new Vector3d(-0.125, 0.5, -0.8125);
////        } else if (this.getConsole() instanceof GalvanicConsoleTile) {
////            return new Vector3d(-0.2982304929003854, 0.375, 0.8465142260574359);
////        } else if (this.getConsole() instanceof CoralConsoleTile) {
////            return new Vector3d(-0.7203601993321677, 0.5625, -0.3625);
////        } else if (this.getConsole() instanceof HartnellConsoleTile) {
////            return new Vector3d(-0.059, 0.375, 0.774);
////        } else if (this.getConsole() instanceof ToyotaConsoleTile) {
////            return new Vector3d(-0.206, 0.375, 0.768);
////        } else if (this.getConsole() instanceof XionConsoleTile) {
////            return new Vector3d(-1.127392157437948, 0.1875, -0.0012375564178497278);
////        } else if (this.getConsole() instanceof NeutronConsoleTile) {
////            return new Vector3d(-1.1546022251848151, 0.59375, -0.00377360907123081);
////        } else {
////            return this.getConsole() instanceof KeltConsoleTile ? new Vector3d(0.4691775280536088, 0.375, 1.0251364745327698) : new Vector3d(0.31798977635472236, 0.48749999701976776, 0.9024203281819716);
////        }
////    }
////
////    public void deserializeNBT(CompoundNBT tag) {
////        this.isFree = tag.getBoolean("free");
////    }
////
////    public CompoundNBT serializeNBT() {
////        CompoundNBT tag = new CompoundNBT();
////        tag.putBoolean("free", this.isFree);
////        return tag;
////    }
////
////    public boolean onRightClicked(ConsoleTile console, PlayerEntity player) {
////        if (console != null && console.hasLevel()) {
////            if (!console.getLevel().isClientSide()) {
////                this.isFree = !this.isFree;
////                if (console.isInFlight() && !this.isFree) {
////                    console.crash(CrashTypes.DEFAULT);
////                }
////
////                console.getControl(ThrottleControl.class).ifPresent((throttle) -> {
////                    if (throttle.getAmount() > 0.0F && this.isFree()) {
////                        console.takeoff();
////                    }
////
////                });
////                this.markDirty();
////            }
////
////            return true;
////        } else {
////            return false;
////        }
////    }
////
////    public SoundEvent getFailSound(ConsoleTile console) {
////        return (SoundEvent)TSounds.SINGLE_CLOISTER.get();
////    }
////
////    public SoundEvent getSuccessSound(ConsoleTile console) {
////        return this.isFree() ? (SoundEvent)TSounds.HANDBRAKE_RELEASE.get() : (SoundEvent)TSounds.HANDBRAKE_ENGAGE.get();
////    }
////
////    public boolean isFree() {
////        return this.isFree;
////    }
////
////    public void setFree(boolean free) {
////        this.isFree = free;
////        this.markDirty();
////    }
////
////    public ResourceLocation getAdditionalDataSaveKey() {
////        return SAVE_KEY;
////    }
////
////    public void setConsole(ConsoleTile console, ControlEntity entity) {
////        super.setConsole(console, entity);
////        console.registerDataHandler(SAVE_KEY, this);
////    }
////}
