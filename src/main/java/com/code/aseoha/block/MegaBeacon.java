package com.code.aseoha.block;

import com.google.common.collect.Lists;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BeaconBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.Heightmap;

import java.util.Arrays;
import java.util.List;

public class MegaBeacon extends BeaconBlock {
    public MegaBeacon(Properties prop) {
        super(prop);
    }

    public DyeColor getColor() {
        return DyeColor.WHITE;
    }

    public TileEntity newBlockEntity(IBlockReader p_196283_1_) {
        return new BeaconTileEntity() {
            @Override
            public void tick() {
                if (this.level == null) return;

                int i = this.worldPosition.getX();
                int j = this.worldPosition.getY();
                int k = this.worldPosition.getZ();

                List<BeamSegment> checkingBeamSections = Lists.newArrayList();
                BeaconTileEntity.BeamSegment beacontileentity$beamsegment = checkingBeamSections.get(0);
                int l = this.level.getHeight(Heightmap.Type.WORLD_SURFACE, i, k);

                BlockState blockstate = this.level.getBlockState(this.worldPosition);
                Block block = blockstate.getBlock();
                float[] afloat = blockstate.getBeaconColorMultiplier(this.level, this.worldPosition, getBlockPos());
                if (afloat != null) {
                    if (checkingBeamSections.size() <= 1) {
                        beacontileentity$beamsegment = new BeaconTileEntity.BeamSegment(afloat);
                        checkingBeamSections.add(beacontileentity$beamsegment);
                    }
                    if (beacontileentity$beamsegment != null) {
                        beacontileentity$beamsegment = new BeaconTileEntity.BeamSegment(new float[]{(beacontileentity$beamsegment.getColor()[0] + afloat[0]) / 2.0F, (beacontileentity$beamsegment.getColor()[1] + afloat[1]) / 2.0F, (beacontileentity$beamsegment.getColor()[2] + afloat[2]) / 2.0F});
                        checkingBeamSections.add(beacontileentity$beamsegment);
                    }
                }

                this.playSound(SoundEvents.BEACON_ACTIVATE);

                for (ServerPlayerEntity serverplayerentity : this.level.getEntitiesOfClass(ServerPlayerEntity.class, (new AxisAlignedBB(i, j, k, i, j - 4, k)).inflate(10.0D, 5.0D, 10.0D))) {
                    CriteriaTriggers.CONSTRUCT_BEACON.trigger(serverplayerentity, this);
                }

            }
        };
    }

    public ActionResultType use(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult ray) {
        if (worldIn.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            TileEntity tile = worldIn.getBlockEntity(pos);
            if (tile instanceof BeaconTileEntity) {
                player.openMenu((BeaconTileEntity) tile);
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
                ((BeaconTileEntity) lvt_6_1_).setCustomName(p_180633_5_.getHoverName());
            }
        }

    }
}
