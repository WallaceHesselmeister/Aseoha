package com.code.aseoha.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.tardis.mod.damagesources.TDamageSources;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.entity.projectiles.LaserEntity;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.sounds.TSounds;

public class LaserSonic extends SonicItem {

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if(!worldIn.isClientSide) {
            LaserEntity lazer = new LaserEntity(TEntities.LASER.get(), playerIn, playerIn.getCommandSenderWorld(), 4.0F, TDamageSources.causeTardisMobDamage("laser", playerIn));
            lazer.setColor(new Vector3d(1.0, 1.0, 0.0));
            lazer.setDamage(10);
            lazer.setRayLength(5);
            lazer.shootFromRotation(lazer, playerIn.xRot, playerIn.yHeadRot, 0.0F, 1.5F, 0.0F);
            worldIn.addFreshEntity(lazer);
            worldIn.playSound(null, playerIn.blockPosition(), TSounds.LASER_GUN_FIRE.get(), SoundCategory.HOSTILE, 1.0F, 1.0F);

        }
        return super.use(worldIn, playerIn, handIn);
    }
}
