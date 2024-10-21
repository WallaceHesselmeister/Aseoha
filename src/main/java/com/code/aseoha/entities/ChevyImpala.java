package com.code.aseoha.entities;


import net.minecraft.block.BlockState;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.tardis.api.space.entities.ISpaceImmuneEntity;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.entity.BessieEntity;
import net.tardis.mod.items.TItems;
import net.tardis.mod.sounds.TSounds;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;


/**
 * @author Codiak <br />
 * This is a 67' Chevy Impala
 */
public class ChevyImpala extends BessieEntity implements ISpaceImmuneEntity {
    public ChevyImpala(EntityType<? extends CreatureEntity> p_i50129_1_, World p_i50129_2_) {
        super(p_i50129_1_, p_i50129_2_);
    }

    @NotNull
    @Override
    public AxisAlignedBB getBoundingBox() {
        return new AxisAlignedBB(-0.5D, 0.0D, -0.5D, 0.5D, 1D, 0.5D);
    }

//    private static int MAX_PASSENGERS = 4;


//    protected DavrosChair(EntityType<? extends MobEntity> p_i48576_1_, World p_i48576_2_) {
//        super(p_i48576_1_, p_i48576_2_);
//    }
    @Override
    public boolean shouldTakeSpaceDamage() {
        return false;
    }
}
