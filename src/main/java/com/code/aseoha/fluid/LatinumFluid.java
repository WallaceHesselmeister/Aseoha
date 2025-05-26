package com.code.aseoha.fluid;

import com.code.aseoha.items.AseohaItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidAttributes;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class LatinumFluid extends FlowingFluid {

    public static final ResourceLocation STILL_TEXTURE = new ResourceLocation("block/water_still");
    public static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation("block/water_flow");


    @NotNull
    public Fluid getFlowing() {
        return ModFluids.LATINUM_FLOWING.get();
    }

    @NotNull
    public Fluid getSource() {
        return ModFluids.LATINUM.get();
    }

    @NotNull
    public Item getBucket() {
        return AseohaItems.LATINUM_BUCKET.get();
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(World world, BlockPos pos, FluidState p_204522_3_, Random random) {
        if (!p_204522_3_.isSource() && !p_204522_3_.getValue(FALLING)) {
            if (random.nextInt(64) == 0) {
                world.playLocalSound((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, SoundEvents.WATER_AMBIENT, SoundCategory.BLOCKS, random.nextFloat() * 0.25F + 0.75F, random.nextFloat() + 0.5F, false);
            }
        } else if (random.nextInt(10) == 0) {
            world.addParticle(ParticleTypes.UNDERWATER, (double)pos.getX() + random.nextDouble(), (double)pos.getY() + random.nextDouble(), (double)pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
        }

    }

    @Nullable
    @OnlyIn(Dist.CLIENT)
    public IParticleData getDripParticle() {
        return ParticleTypes.DRIPPING_WATER;
    }

    protected boolean canConvertToSource() {
        return true;
    }

    protected void beforeDestroyingBlock(IWorld iWorld, BlockPos pos, BlockState p_205580_3_) {
        TileEntity tileentity = p_205580_3_.hasTileEntity() ? iWorld.getBlockEntity(pos) : null;
        Block.dropResources(p_205580_3_, iWorld, pos, tileentity);
    }

    public int getSlopeFindDistance(IWorldReader iWorldReader) {
        return 4;
    }

    public BlockState createLegacyBlock(FluidState state) {
        return ModFluids.LATINUM_BLOCK.get().defaultBlockState().setValue(FlowingFluidBlock.LEVEL, getLegacyLevel(state));
    }

    public boolean isSame(Fluid fluid) {
        return fluid == ModFluids.LATINUM.get() || fluid == ModFluids.LATINUM_FLOWING.get();
    }

    public int getDropOff(IWorldReader iWorldReader) {
        return 1;
    }

    public int getTickDelay(IWorldReader iWorldReader) {
        return 5;
    }

    public boolean canBeReplacedWith(FluidState state, IBlockReader iBlockReader, BlockPos pos, Fluid fluid, Direction direction) {
        return direction == Direction.DOWN && !fluid.is(FluidTags.WATER);
    }

    protected float getExplosionResistance() {
        return 100.0F;
    }

    @NotNull
    public FluidAttributes createAttributes() {
        return FluidAttributes.builder(STILL_TEXTURE, FLOWING_TEXTURE)
                .density(1000)
                .viscosity(1000)
                .sound(SoundEvents.BUCKET_FILL, SoundEvents.BUCKET_EMPTY)
                .color(0xECC902).build(this);
    }

    public static class Flowing extends LatinumFluid {
        protected void createFluidStateDefinition(@NotNull StateContainer.Builder<Fluid, FluidState> state) {
            super.createFluidStateDefinition(state);
            state.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Source extends LatinumFluid {
        @Override
        protected void createFluidStateDefinition(StateContainer.Builder<Fluid, FluidState> stateBuilder) {
            super.createFluidStateDefinition(stateBuilder);
            stateBuilder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
