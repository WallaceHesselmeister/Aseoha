package com.code.aseoha.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.blocks.template.NotSolidTileBlock;
import net.tardis.mod.misc.IDontBreak;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.stream.Stream;

@Mixin(ExteriorBlock.class)
public abstract class TardisTopBlockMixin extends NotSolidTileBlock implements IDontBreak {
    public TardisTopBlockMixin(Properties prop) {
        super(prop);
    }

//    private static VoxelShape SHAPE = createVoxelshape();
//
//private static VoxelShape createVoxelshape(){
//        return Stream.of(
//                Block.box(0, 16, -0.5000000000000001, 16, 32, 0.5),
//                Block.box(0, 16, 15.499999999999998, 16, 32, 16.500000000000004),
//                Block.box(15, 16, 0.5, 16, 32, 15.499999999999998),
//                Block.box(0, 31, 0.5, 15, 32, 15.500000000000002)
//        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
//}
//
//    @Override
//    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
//        return SHAPE;
//    }

}
