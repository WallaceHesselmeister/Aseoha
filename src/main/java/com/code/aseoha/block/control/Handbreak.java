package com.code.aseoha.block.control;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeverBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.controls.HandbrakeControl;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

public class Handbreak extends LeverBlock {
    public Handbreak(Properties prop) {
        super(prop);
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState state, @NotNull World worldIn, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
        if (!WorldHelper.isDimensionBlocked(worldIn)) {
            ConsoleTile console = (ConsoleTile)worldIn.getBlockEntity(TardisHelper.TARDIS_POS);

            BlockState blockState;
            if (worldIn.isClientSide) {
                blockState = (BlockState)state.cycle(POWERED);
                if ((Boolean)blockState.getValue(POWERED)) {
                    makeParticle(blockState, worldIn, pos, 1.0F);
                }

                return ActionResultType.SUCCESS;
            } else {
                assert console != null;
                console.getControl(HandbrakeControl.class).ifPresent((Control) -> {Control.onRightClicked(console, player);});
                console.updateClient();
                blockState = this.pull(state, worldIn, pos);
                float lvt_8_1_ = (Boolean)blockState.getValue(POWERED) ? 0.6F : 0.5F;
                worldIn.playSound((PlayerEntity)null, pos, SoundEvents.LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, lvt_8_1_);
                return ActionResultType.CONSUME;
            }
        } else if (WorldHelper.isDimensionBlocked(worldIn)) {
            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
        }

        return ActionResultType.SUCCESS;

    }

    private static void makeParticle(BlockState state, IWorld iWorld, BlockPos blockPos, float v) {
        Direction direction = ((Direction)state.getValue(FACING)).getOpposite();
        Direction opposite = getConnectedDirection(state).getOpposite();
        double v1 = (double)blockPos.getX() + 0.5 + 0.1 * (double)direction.getStepX() + 0.2 * (double)opposite.getStepX();
        double v2 = (double)blockPos.getY() + 0.5 + 0.1 * (double)direction.getStepY() + 0.2 * (double)opposite.getStepY();
        double v3 = (double)blockPos.getZ() + 0.5 + 0.1 * (double)direction.getStepZ() + 0.2 * (double)opposite.getStepZ();
        iWorld.addParticle(new RedstoneParticleData(1.0F, 0.0F, 0.0F, v), v1, v2, v3, 0.0, 0.0, 0.0);
    }

    @Override
    public void onRemove(@NotNull BlockState blockState, @NotNull World world, @NotNull BlockPos blockPos, @NotNull BlockState state, boolean p_196243_5_) {
        if (!p_196243_5_ && !blockState.is(state.getBlock())) {
            if ((Boolean)blockState.getValue(POWERED)) {
                this.updateNeighbours(blockState, world, blockPos);
            }

            super.onRemove(blockState, world, blockPos, state, p_196243_5_);
        }
    }

    private void updateNeighbours(BlockState blockState, World world, BlockPos blockPos) {
        world.updateNeighborsAt(blockPos, this);
        world.updateNeighborsAt(blockPos.relative(getConnectedDirection(blockState).getOpposite()), this);
    }
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
//        }
}





//package net.tardis.mod.controls;
//
//import net.minecraft.entity.EntitySize;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.nbt.CompoundNBT;
//import net.minecraft.util.ResourceLocation;
//import net.minecraft.util.SoundEvent;
//import net.minecraft.util.math.vector.Vector3d;
//import net.tardis.mod.entity.ControlEntity;
//import net.tardis.mod.misc.CrashTypes;
//import net.tardis.mod.registries.ControlRegistry;
//import net.tardis.mod.sounds.TSounds;
//import net.tardis.mod.tileentities.ConsoleTile;
//import net.tardis.mod.tileentities.consoles.CoralConsoleTile;
//import net.tardis.mod.tileentities.consoles.GalvanicConsoleTile;
//import net.tardis.mod.tileentities.consoles.HartnellConsoleTile;
//import net.tardis.mod.tileentities.consoles.KeltConsoleTile;
//import net.tardis.mod.tileentities.consoles.NemoConsoleTile;
//import net.tardis.mod.tileentities.consoles.NeutronConsoleTile;
//import net.tardis.mod.tileentities.consoles.ToyotaConsoleTile;
//import net.tardis.mod.tileentities.consoles.XionConsoleTile;
//
//public class HandbrakeControl extends BaseControl {
//    public static final ResourceLocation SAVE_KEY = new ResourceLocation("tardis", "handbrake_data");
//    private boolean isFree = false;
//
//    public HandbrakeControl(ControlRegistry.ControlEntry entry, ConsoleTile console, ControlEntity entity) {
//        super(entry, console, entity);
//    }
//
//    public EntitySize getSize() {
//        if (this.getConsole() instanceof NemoConsoleTile) {
//            return EntitySize.scalable(0.1875F, 0.1875F);
//        } else if (this.getConsole() instanceof GalvanicConsoleTile) {
//            return EntitySize.scalable(0.1875F, 0.1875F);
//        } else if (this.getConsole() instanceof CoralConsoleTile) {
//            return EntitySize.scalable(0.1875F, 0.1875F);
//        } else if (this.getConsole() instanceof HartnellConsoleTile) {
//            return EntitySize.scalable(0.1875F, 0.1875F);
//        } else if (this.getConsole() instanceof XionConsoleTile) {
//            return EntitySize.scalable(0.1875F, 0.1875F);
//        } else if (this.getConsole() instanceof ToyotaConsoleTile) {
//            return EntitySize.scalable(0.1875F, 0.1875F);
//        } else if (this.getConsole() instanceof NeutronConsoleTile) {
//            return EntitySize.scalable(0.25F, 0.25F);
//        } else {
//            return this.getConsole() instanceof KeltConsoleTile ? EntitySize.scalable(0.1875F, 0.1875F) : EntitySize.scalable(0.1875F, 0.1875F);
//        }
//    }
//
//    public Vector3d getPos() {
//        if (this.getConsole() instanceof NemoConsoleTile) {
//            return new Vector3d(-0.125, 0.5, -0.8125);
//        } else if (this.getConsole() instanceof GalvanicConsoleTile) {
//            return new Vector3d(-0.2982304929003854, 0.375, 0.8465142260574359);
//        } else if (this.getConsole() instanceof CoralConsoleTile) {
//            return new Vector3d(-0.7203601993321677, 0.5625, -0.3625);
//        } else if (this.getConsole() instanceof HartnellConsoleTile) {
//            return new Vector3d(-0.059, 0.375, 0.774);
//        } else if (this.getConsole() instanceof ToyotaConsoleTile) {
//            return new Vector3d(-0.206, 0.375, 0.768);
//        } else if (this.getConsole() instanceof XionConsoleTile) {
//            return new Vector3d(-1.127392157437948, 0.1875, -0.0012375564178497278);
//        } else if (this.getConsole() instanceof NeutronConsoleTile) {
//            return new Vector3d(-1.1546022251848151, 0.59375, -0.00377360907123081);
//        } else {
//            return this.getConsole() instanceof KeltConsoleTile ? new Vector3d(0.4691775280536088, 0.375, 1.0251364745327698) : new Vector3d(0.31798977635472236, 0.48749999701976776, 0.9024203281819716);
//        }
//    }
//
//    public void deserializeNBT(CompoundNBT tag) {
//        this.isFree = tag.getBoolean("free");
//    }
//
//    public CompoundNBT serializeNBT() {
//        CompoundNBT tag = new CompoundNBT();
//        tag.putBoolean("free", this.isFree);
//        return tag;
//    }
//
//    public boolean onRightClicked(ConsoleTile console, PlayerEntity player) {
//        if (console != null && console.hasLevel()) {
//            if (!console.getLevel().isClientSide()) {
//                this.isFree = !this.isFree;
//                if (console.isInFlight() && !this.isFree) {
//                    console.crash(CrashTypes.DEFAULT);
//                }
//
//                console.getControl(ThrottleControl.class).ifPresent((throttle) -> {
//                    if (throttle.getAmount() > 0.0F && this.isFree()) {
//                        console.takeoff();
//                    }
//
//                });
//                this.markDirty();
//            }
//
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public SoundEvent getFailSound(ConsoleTile console) {
//        return (SoundEvent)TSounds.SINGLE_CLOISTER.get();
//    }
//
//    public SoundEvent getSuccessSound(ConsoleTile console) {
//        return this.isFree() ? (SoundEvent)TSounds.HANDBRAKE_RELEASE.get() : (SoundEvent)TSounds.HANDBRAKE_ENGAGE.get();
//    }
//
//    public boolean isFree() {
//        return this.isFree;
//    }
//
//    public void setFree(boolean free) {
//        this.isFree = free;
//        this.markDirty();
//    }
//
//    public ResourceLocation getAdditionalDataSaveKey() {
//        return SAVE_KEY;
//    }
//
//    public void setConsole(ConsoleTile console, ControlEntity entity) {
//        super.setConsole(console, entity);
//        console.registerDataHandler(SAVE_KEY, this);
//    }
//}
