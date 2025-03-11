package com.code.aseoha.common.threads;

import com.code.aseoha.common.dimension.AseohaDimensions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.ModifiableWorld;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class CraterGeneratorThread extends Thread {
    private FeatureContext<ProbabilityConfig> Context;
    int Radius;

    BlockState MarsCraterPattern[] = {Blocks.COBBLESTONE.getDefaultState(), Blocks.ORANGE_TERRACOTTA.getDefaultState(), Blocks.ORANGE_CONCRETE_POWDER.getDefaultState()};
    BlockState MoonCraterPattern[] = {Blocks.GRAY_TERRACOTTA.getDefaultState(), Blocks.GRAY_CONCRETE.getDefaultState(), Blocks.GRAY_CONCRETE_POWDER.getDefaultState()};

    public CraterGeneratorThread(FeatureContext<ProbabilityConfig> context) {
        this.Context = context;
    }

    public CraterGeneratorThread(){}

    @Override
    public void run() {
        super.run();
        int block;
        this.Radius = 5 + (new Random(System.currentTimeMillis())).nextInt(11);
        BlockPos pos = this.Context.getWorld().getTopPosition(Heightmap.Type.WORLD_SURFACE_WG, this.Context.getOrigin()).up(Radius / 2).add(0, new Random(System.currentTimeMillis()).nextInt(3), 0);

        for (BlockPos p : BlockPos.iterate(pos.add(
                        -Radius + (new Random(System.currentTimeMillis() + 38564271).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 5489).nextInt(4) : -new Random(System.currentTimeMillis() + 9843).nextInt(4)),
                        -Radius,// + (new Random(System.currentTimeMillis() + 3462).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 642433568).nextInt(2) : -new Random(System.currentTimeMillis() + 25322).nextInt(2)),
                        -Radius + (new Random(System.currentTimeMillis() + 4583762).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 64568).nextInt(4) : -new Random(System.currentTimeMillis() + 642).nextInt(4))),
                pos.add(
                        Radius + (new Random(System.currentTimeMillis() + 236476483).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 6435).nextInt(4) : -new Random(System.currentTimeMillis() + 48614).nextInt(4)),
                        Radius,// + (new Random(System.currentTimeMillis() + 2465).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 445642353).nextInt(2) : -new Random(System.currentTimeMillis() + 8946).nextInt(2)),
                        Radius + (new Random(System.currentTimeMillis() + 875467564).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 864).nextInt(4) : -new Random(System.currentTimeMillis() + 4453).nextInt(4))))) {

            block = new Random(System.currentTimeMillis()).nextInt(4);
            p.add((new Random(System.currentTimeMillis() + 236476483).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 6435).nextInt(4) : -new Random(System.currentTimeMillis() + 48614).nextInt(4)),
                    0, //(new Random(System.currentTimeMillis() + 2465).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 445642353).nextInt(5) : -new Random(System.currentTimeMillis() + 8946).nextInt(5)),
                    (new Random(System.currentTimeMillis() + 875467564).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 864).nextInt(4) : -new Random(System.currentTimeMillis() + 4453).nextInt(4)));
            int oldRadius = Radius;
            Radius +=
                    new Random(System.currentTimeMillis()).nextInt(4) == 2 ?
                            new Random(System.currentTimeMillis()).nextInt(4) :
                            -new Random(System.currentTimeMillis()).nextInt(4);
            BlockState blockToPlace = Blocks.AIR.getDefaultState();
            if(block != 3) {
                if (this.Context.getWorld().toServerWorld().toString().equals("ServerLevel[Mars]"))
                    blockToPlace = MarsCraterPattern[block];
                else blockToPlace = MoonCraterPattern[block];
            }
            BlockPos positionToPlace = p.add(
                    (new Random(System.currentTimeMillis() + 87675453).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 435346244).nextInt(5) : 0),
                    0,//(new Random(System.currentTimeMillis() + 87542242).nextInt(6) == 1 ? new Random(System.currentTimeMillis() + 354335454).nextInt(1) : 0),
                    (new Random(System.currentTimeMillis() + 36423523).nextInt(2) == 1 ? new Random(System.currentTimeMillis() + 345345344).nextInt(5) : 0));

            if (p.isWithinDistance(pos, Radius)) {
                if (!this.Context.getWorld().getBlockState(p).isAir())
                    setBlockState(this.Context.getWorld(),
                            positionToPlace,
                            (p.getY() <= pos.getY() - (Radius / 2) ? blockToPlace : Blocks.AIR.getDefaultState()));
            }

            if (p.isWithinDistance(pos, Radius - 1)) {
                if (!this.Context.getWorld().getBlockState(p).isAir())
                    setBlockState(this.Context.getWorld(), p, Blocks.AIR.getDefaultState());
            }
            Radius = oldRadius;
        }

    }

    protected void setBlockState(@NotNull ModifiableWorld world, BlockPos pos, BlockState state) {
        world.setBlockState(pos, state, Block.NOTIFY_ALL);
    }
}
