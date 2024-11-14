//package com.code.fabric.ait;
//
//import com.mojang.serialization.Codec;
//import net.minecraft.core.BlockPos;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.levelgen.feature.Feature;
//import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
//import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
//
//import java.util.Random;
//
//public class Crator extends Feature<ProbabilityFeatureConfiguration> {
//
//    public Crator(Codec<ProbabilityFeatureConfiguration> codec) {
//        super(codec);
//    }
//    @Override
//    public boolean generate(FeaturePlaceContext<ProbabilityFeatureConfiguration> context) {
//        int radius = 20 + (new Random(context.level().getSeed())).nextInt(10);
//        BlockPos pos = context.level().getServer().getTopPosition(Heightmap.Type.WORLD_SURFACE_WG, context.getOrigin()).up(radius / 3);
//        if (context.level().getServer().isClient()) {
//            for (BlockPos p : BlockPos.iterate(pos.add(-radius, -radius, -radius), pos.add(radius, radius, radius))) {
//                if (p.isWithinDistance(pos, radius)) {
//                    if (!context.level().toServerWorld().getBlockState(p).isAir())
//                        context.level().toServerWorld().setBlockState(p, Blocks.AIR.getDefaultState(), 2);
//                }
//            }
//            return true;
//        }
//        else return false;
//    }
//
//}