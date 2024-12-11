package com.code.common.entities;

import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;


/**
 * @author Me <br />
 * K9! The Entity Class
 */
public class K9MkIIEntity extends K9Entity {

    private static final int CONTAINER_SIZE = 81;
    private NonNullList<ItemStack> itemStacks;
    @Nullable
    private ResourceLocation lootTable;

    public K9MkIIEntity(EntityType<? extends Wolf> type, Level worldIn) {
        super(type, worldIn);
    }

    @Override
    public int getContainerSize() {
        return CONTAINER_SIZE;
    }
}