//package com.code.aseoha.common.blocks;
//
//import com.mojang.serialization.MapCodec;
//import net.minecraft.block.BlockRenderType;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.BlockWithEntity;
//import net.minecraft.block.entity.BlockEntity;
//import net.minecraft.util.math.BlockPos;
//
//import static net.minecraft.registry.RegistryKey.createCodec;
//
//
//public class RoundelCastBlock extends BlockWithEntity {
//
//    protected RoundelCastBlock(Settings settings) {
//        super(settings);
//    }
//
//    @Override
//    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
//        return new RoundelCastEntity(pos, state);
//    }
//
//    @Override
//    public BlockRenderType getRenderType(BlockState state) {
//        return BlockRenderType.MODEL;
//    }
//}
