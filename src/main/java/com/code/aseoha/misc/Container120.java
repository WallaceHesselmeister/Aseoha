package com.code.aseoha.misc;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IClearable;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;
import java.util.function.Predicate;

/**
 * Backported 1.20 Container code
 */
public interface Container120 extends IClearable {
    int LARGE_MAX_STACK_SIZE = 64;
    int DEFAULT_DISTANCE_LIMIT = 8;

    int getContainerSize();

    boolean isEmpty();

    ItemStack getItem(int var1);

    ItemStack removeItem(int var1, int var2);

    ItemStack removeItemNoUpdate(int var1);

    void setItem(int var1, ItemStack var2);

    default int getMaxStackSize() {
        return 64;
    }

    void setChanged();

    boolean stillValid(PlayerEntity var1);

    default void startOpen(PlayerEntity pPlayer) {
    }

    default void stopOpen(PlayerEntity pPlayer) {
    }

    default boolean canPlaceItem(int pSlot, ItemStack pStack) {
        return true;
    }

    default boolean canTakeItem(Container pTarget, int pSlot, ItemStack pStack) {
        return true;
    }

    default int countItem(Item pItem) {
        int $$1 = 0;

        for(int $$2 = 0; $$2 < this.getContainerSize(); ++$$2) {
            ItemStack $$3 = this.getItem($$2);
            if ($$3.getItem().equals(pItem)) {
                $$1 += $$3.getCount();
            }
        }

        return $$1;
    }

    default boolean hasAnyOf(Set<Item> pSet) {
        return this.hasAnyMatching((p_216873_) -> {
            return !p_216873_.isEmpty() && pSet.contains(p_216873_.getItem());
        });
    }

    default boolean hasAnyMatching(Predicate<ItemStack> pPredicate) {
        for(int $$1 = 0; $$1 < this.getContainerSize(); ++$$1) {
            ItemStack $$2 = this.getItem($$1);
            if (pPredicate.test($$2)) {
                return true;
            }
        }

        return false;
    }

    static boolean stillValidBlockEntity(TileEntity pBlockEntity, PlayerEntity pPlayer) {
        return stillValidBlockEntity(pBlockEntity, pPlayer, 8);
    }

    static boolean stillValidBlockEntity(TileEntity pBlockEntity, PlayerEntity pPlayer, int pMaxDistance) {
        World $$3 = pBlockEntity.getLevel();
        BlockPos $$4 = pBlockEntity.getBlockPos();
        if ($$3 == null) {
            return false;
        } else if ($$3.getBlockEntity($$4) != pBlockEntity) {
            return false;
        } else {
            return pPlayer.distanceToSqr((double)$$4.getX() + 0.5, (double)$$4.getY() + 0.5, (double)$$4.getZ() + 0.5) <= (double)(pMaxDistance * pMaxDistance);
        }
    }
}
