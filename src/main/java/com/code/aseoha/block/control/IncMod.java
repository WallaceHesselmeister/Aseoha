package com.code.aseoha.block.control;

import com.google.common.collect.Lists;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.controls.IncModControl;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

@SuppressWarnings("deprecation")
public class IncMod extends TorchBlock {

    public static final BooleanProperty LIT;
    private static final Map<IBlockReader, List<IncMod.Toggle>> RECENT_TOGGLES;

    public IncMod(AbstractBlock.Properties properties) {
        super(properties, RedstoneParticleData.REDSTONE);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(LIT, true));
    }

    @NotNull
    public ActionResultType use(@NotNull BlockState state, @NotNull World worldIn, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
        if (!WorldHelper.isDimensionBlocked(worldIn)) {
            ConsoleTile console = (ConsoleTile)worldIn.getBlockEntity(TardisHelper.TARDIS_POS);
            if (!worldIn.isClientSide) {
                assert console != null;
                console.getControl(IncModControl.class).ifPresent((Control) -> {
                    Control.onRightClicked(console, player);
                });
                console.updateClient();
                return ActionResultType.SUCCESS;
            }
        } else if (WorldHelper.isDimensionBlocked(worldIn)) {
            player.displayClientMessage(Translations.NO_USE_OUTSIDE_TARDIS, true);
        }

        return ActionResultType.SUCCESS;

    }
    public void onPlace(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos pos, @NotNull BlockState blockState, boolean x) {
        Direction[] var6 = Direction.values();
        int var7 = var6.length;

        for (Direction direction : var6) {
            world.updateNeighborsAt(pos.relative(direction), this);
        }

    }

    public void onRemove(@NotNull BlockState p_196243_1_, @NotNull World p_196243_2_, @NotNull BlockPos p_196243_3_, @NotNull BlockState p_196243_4_, boolean p_196243_5_) {
        if (!p_196243_5_) {
            Direction[] var6 = Direction.values();
            int var7 = var6.length;

            for (Direction lvt_9_1_ : var6) {
                p_196243_2_.updateNeighborsAt(p_196243_3_.relative(lvt_9_1_), this);
            }

        }
    }

    public int getSignal(BlockState p_180656_1_, @NotNull IBlockReader p_180656_2_, @NotNull BlockPos p_180656_3_, @NotNull Direction p_180656_4_) {
        return (Boolean)p_180656_1_.getValue(LIT) && Direction.UP != p_180656_4_ ? 15 : 0;
    }

    protected boolean hasNeighborSignal(World p_176597_1_, BlockPos p_176597_2_, BlockState p_176597_3_) {
        return p_176597_1_.hasSignal(p_176597_2_.below(), Direction.DOWN);
    }

    public void tick(@NotNull BlockState p_225534_1_, @NotNull ServerWorld p_225534_2_, @NotNull BlockPos p_225534_3_, @NotNull Random p_225534_4_) {
        boolean lvt_5_1_ = this.hasNeighborSignal(p_225534_2_, p_225534_3_, p_225534_1_);
        List<Toggle> lvt_6_1_ = RECENT_TOGGLES.get(p_225534_2_);

        while(lvt_6_1_ != null && !lvt_6_1_.isEmpty() && p_225534_2_.getGameTime() - ((IncMod.Toggle)lvt_6_1_.get(0)).when > 60L) {
            lvt_6_1_.remove(0);
        }

        if ((Boolean)p_225534_1_.getValue(LIT)) {
            if (lvt_5_1_) {
                p_225534_2_.setBlock(p_225534_3_, (BlockState)p_225534_1_.setValue(LIT, false), 3);
                if (isToggledTooFrequently(p_225534_2_, p_225534_3_, true)) {
                    p_225534_2_.levelEvent(1502, p_225534_3_, 0);
                    p_225534_2_.getBlockTicks().scheduleTick(p_225534_3_, p_225534_2_.getBlockState(p_225534_3_).getBlock(), 160);
                }
            }
        } else if (!lvt_5_1_ && !isToggledTooFrequently(p_225534_2_, p_225534_3_, false)) {
            p_225534_2_.setBlock(p_225534_3_, (BlockState)p_225534_1_.setValue(LIT, true), 3);
        }

    }

    public void neighborChanged(BlockState p_220069_1_, @NotNull World p_220069_2_, @NotNull BlockPos p_220069_3_, @NotNull Block p_220069_4_, @NotNull BlockPos p_220069_5_, boolean p_220069_6_) {
        if ((Boolean)p_220069_1_.getValue(LIT) == this.hasNeighborSignal(p_220069_2_, p_220069_3_, p_220069_1_) && !p_220069_2_.getBlockTicks().willTickThisTick(p_220069_3_, this)) {
            p_220069_2_.getBlockTicks().scheduleTick(p_220069_3_, this, 2);
        }

    }

    public int getDirectSignal(@NotNull BlockState p_176211_1_, @NotNull IBlockReader p_176211_2_, @NotNull BlockPos p_176211_3_, @NotNull Direction p_176211_4_) {
        return p_176211_4_ == Direction.DOWN ? p_176211_1_.getSignal(p_176211_2_, p_176211_3_, p_176211_4_) : 0;
    }

    public boolean isSignalSource(@NotNull BlockState p_149744_1_) {
        return true;
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState p_180655_1_, @NotNull World p_180655_2_, @NotNull BlockPos p_180655_3_, @NotNull Random p_180655_4_) {
        if ((Boolean)p_180655_1_.getValue(LIT)) {
            double lvt_5_1_ = (double)p_180655_3_.getX() + 0.5 + (p_180655_4_.nextDouble() - 0.5) * 0.2;
            double lvt_7_1_ = (double)p_180655_3_.getY() + 0.7 + (p_180655_4_.nextDouble() - 0.5) * 0.2;
            double lvt_9_1_ = (double)p_180655_3_.getZ() + 0.5 + (p_180655_4_.nextDouble() - 0.5) * 0.2;
            p_180655_2_.addParticle(this.flameParticle, lvt_5_1_, lvt_7_1_, lvt_9_1_, 0.0, 0.0, 0.0);
        }
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new Property[]{LIT});
    }

    private static boolean isToggledTooFrequently(World p_176598_0_, BlockPos p_176598_1_, boolean p_176598_2_) {
        List<Toggle> lvt_3_1_ = RECENT_TOGGLES.computeIfAbsent(p_176598_0_, (p_220288_0_) -> {
            return Lists.newArrayList();
        });
        if (p_176598_2_) {
            lvt_3_1_.add(new IncMod.Toggle(p_176598_1_.immutable(), p_176598_0_.getGameTime()));
        }

        int lvt_4_1_ = 0;

        for (Toggle o : lvt_3_1_) {
            if (o.pos.equals(p_176598_1_)) {
                ++lvt_4_1_;
                if (lvt_4_1_ >= 8) {
                    return true;
                }
            }
        }

        return false;
    }

    static {
        LIT = BlockStateProperties.LIT;
        RECENT_TOGGLES = new WeakHashMap<>();
    }

    public static class Toggle {
        private final BlockPos pos;
        private final long when;

        public Toggle(BlockPos p_i45688_1_, long p_i45688_2_) {
            this.pos = p_i45688_1_;
            this.when = p_i45688_2_;
        }
    }
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
