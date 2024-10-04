package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.aseoha;
import com.code.aseoha.misc.TARDISHelper;
import com.code.aseoha.tileentities.AseohaTiles;
import com.google.gson.JsonElement;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.registries.ConsoleRegistry;
import net.tardis.mod.registries.ExteriorRegistry;

import java.util.List;
import java.util.Objects;

public class TardisCoralTile extends TileEntity implements ITickableTileEntity {
    public TardisCoralTile() {
        super(AseohaTiles.TARDIS_CORAL.get());
    }

    public static int timer = 0;
    boolean isActive = true;
//    private BlockPos pos = new BlockPos(this.worldPosition.getX(), this.worldPosition.getY(), this.worldPosition.getZ() - 1);
    @Override
    public void tick() {
        assert this.level != null;
        if (!this.level.isClientSide() && this.isActive){
            timer++;
//            aseoha.LOGGER.info(this.timer);
            if (timer == 12000){

                this.spawnTARDIS();
                this.level.removeBlock(getBlockPos(), true);
            }
        }
    }

    final int RANGE = 5;
    private void spawnTARDIS() {
//        BlockPos topCorner = this.worldPosition.offset(RANGE, RANGE, RANGE);
//        BlockPos bottomCorner = this.worldPosition.offset(-RANGE, -RANGE, -RANGE);
//        AxisAlignedBB box = new AxisAlignedBB(topCorner, bottomCorner);

        assert this.level != null;
        TARDISHelper.createTARDIS(this.worldPosition, Objects.requireNonNull(this.level.getServer()).getLevel(this.level.dimension()), ExteriorRegistry.TT_CAPSULE.get(), ConsoleRoom.ALABASTER, ConsoleRegistry.HARTNELL.get());
//
    }
}