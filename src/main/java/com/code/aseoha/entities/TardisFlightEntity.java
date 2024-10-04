package com.code.aseoha.entities;


import net.minecraft.entity.EntityType;
import net.minecraft.world.World;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.entity.TardisEntity;

public class TardisFlightEntity extends TardisEntity {

    public TardisFlightEntity(EntityType<?> entityTypeIn, World worldIn) {
        super(worldIn);
    }

    public TardisFlightEntity(World worldIn) {
        this(TEntities.TARDIS.get(), worldIn);
    }

    @Override
    public void tick() {

    }

    @Override
    public void rideTick() {
        super.rideTick();
    }

}