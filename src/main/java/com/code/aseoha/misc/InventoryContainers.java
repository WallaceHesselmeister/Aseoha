package com.code.aseoha.misc;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.container.ChestContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;

public class InventoryContainers extends ChestContainer {
    public InventoryContainers(int i, PlayerInventory playerInventory, IInventory inventory) {
        super(ContainerType.GENERIC_9x4, i, playerInventory, inventory, 4);
    }
}
