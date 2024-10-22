package com.code.aseoha.block.control;
//package com.code.aseoha.block.control;
//
//import net.minecraft.block.*;
//import net.minecraft.util.Direction;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.util.math.MathHelper;
//import net.minecraft.world.IBlockReader;
//import net.minecraft.world.LightType;
//import net.minecraft.world.World;
//import net.tardis.mod.blocks.VortexDetectorBlock;
//import net.tardis.mod.helper.TardisHelper;
//import net.tardis.mod.tileentities.ConsoleTile;
//
//public class ClockBlock extends VortexDetectorBlock {
//    public ClockBlock(Properties p_i48350_1_) {
//        super();
//    }
//
//    public static void updateSignalStrength(BlockState p_196319_0_, World p_196319_1_, BlockPos p_196319_2_) {
//        if (p_196319_1_.dimensionType().hasSkyLight()) {
//            int lvt_3_1_ = p_196319_1_.getBrightness(LightType.SKY, p_196319_2_) - p_196319_1_.getSkyDarken();
//            float lvt_4_1_ = p_196319_1_.getSunAngle(1.0F);
//            boolean lvt_5_1_ = (Boolean)p_196319_0_.getValue(INVERTED);
//            if (lvt_5_1_) {
//                lvt_3_1_ = 15 - lvt_3_1_;
//            } else if (lvt_3_1_ > 0) {
//                float lvt_6_1_ = lvt_4_1_ < 3.1415927F ? 0.0F : 6.2831855F;
//                lvt_4_1_ += (lvt_6_1_ - lvt_4_1_) * 0.2F;
//                lvt_3_1_ = Math.round((float)lvt_3_1_ * MathHelper.cos(lvt_4_1_));
//            }
//
//            lvt_3_1_ = MathHelper.clamp(lvt_3_1_, 0, 15);
//            if ((Integer)p_196319_0_.getValue(POWER) != lvt_3_1_) {
//                p_196319_1_.setBlock(p_196319_2_, (BlockState)p_196319_0_.setValue(POWER, lvt_3_1_), 3);
//            }
//
//        }
//    }
//
//}