package com.code.aseoha.block;

import net.minecraft.block.BeaconBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class MegaBeacon extends BeaconBlock {
    public MegaBeacon(Properties prop) {
        super(prop);
    }

    public DyeColor getColor() {
        return DyeColor.WHITE;
    }

    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
        return new BeaconTileEntity();
    }

    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult ray) {
        if (worldIn.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            TileEntity tile = worldIn.getBlockEntity(pos);
            if (tile instanceof BeaconTileEntity) {
                player.openMenu((BeaconTileEntity)tile);
                player.awardStat(Stats.INTERACT_WITH_BEACON);
            }

            return ActionResultType.CONSUME;
        }
    }

    public BlockRenderType getRenderShape(BlockState p_149645_1_) {
        return BlockRenderType.MODEL;
    }

    public void setPlacedBy(World p_180633_1_, BlockPos p_180633_2_, BlockState p_180633_3_, LivingEntity p_180633_4_, ItemStack p_180633_5_) {
        if (p_180633_5_.hasCustomHoverName()) {
            TileEntity lvt_6_1_ = p_180633_1_.getBlockEntity(p_180633_2_);
            if (lvt_6_1_ instanceof BeaconTileEntity) {
                ((BeaconTileEntity)lvt_6_1_).setCustomName(p_180633_5_.getHoverName());
            }
        }

    }
}
