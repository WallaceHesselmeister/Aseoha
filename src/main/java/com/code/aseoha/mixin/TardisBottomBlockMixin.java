package com.code.aseoha.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.World;
import net.tardis.mod.blocks.exteriors.TardisExteriorBottomBlock;
import net.tardis.mod.blocks.template.CubeBlock;
import net.tardis.mod.misc.IDontBreak;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.stream.Stream;

@Mixin(TardisExteriorBottomBlock.class)
@SuppressWarnings("deprecation")
public class TardisBottomBlockMixin extends CubeBlock implements IDontBreak, IWaterLoggable {
    public TardisBottomBlockMixin(Properties prop, SoundType sound, float hardness, float resistance) {
        super(prop, sound, hardness, resistance);
    }

    @Unique
    private static VoxelShape aseoha$getSHAPE() {
        return aseoha$SHAPE;
    }

    @Unique
    private static void aseoha$setSHAPE(VoxelShape SHAPE) {
        TardisBottomBlockMixin.aseoha$SHAPE = SHAPE;
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState state, World world, BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult ray) {
        if(world.getBlockEntity(pos.above()) != null)
            if(world.getBlockEntity(pos.above()) instanceof ExteriorTile){
                ((ExteriorTile)world.getBlockEntity(pos.above())).open(player);

                }
        return super.use(state, world, pos, player, hand, ray);
    }

    @Unique
    private static VoxelShape aseoha$SHAPE = aseoha$createVoxelShape();

    @Unique
    private static VoxelShape aseoha$createVoxelShape(){
        return Stream.of(
                Block.box(0, -1, -0.5, 16, 0, 16.500000000000007),
                Block.box(0, 0, -0.5000000000000001, 16, 32, 0.5),
                Block.box(0, 0, 15.499999999999998, 16, 32, 16.500000000000004),
                Block.box(15, 0, 0.5, 16, 32, 15.499999999999998),
                Block.box(0, 31, 0.5, 15, 32, 15.500000000000002)
        ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
    }

//    @Override
//    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
//        return SHAPE;
//    }
}