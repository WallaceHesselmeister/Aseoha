package com.code.aseoha.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.SoundType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.tardis.mod.blocks.exteriors.TardisExteriorBottomBlock;
import net.tardis.mod.blocks.template.CubeBlock;
import net.tardis.mod.misc.IDontBreak;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(TardisExteriorBottomBlock.class)
public class TardisBottomBlockMixin extends CubeBlock implements IDontBreak, IWaterLoggable {
    public TardisBottomBlockMixin(Properties prop, SoundType sound, float hardness, float resistance) {
        super(prop, sound, hardness, resistance);
    }

    @Override
    public ActionResultType use(@NotNull BlockState state, World world, BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult ray) {
        if(world.getBlockEntity(pos.above()) != null)
            if(world.getBlockEntity(pos.above()) instanceof ExteriorTile){
                ((ExteriorTile)world.getBlockEntity(pos.above())).open(player);
                }
        return super.use(state, world, pos, player, hand, ray);
    }
}
