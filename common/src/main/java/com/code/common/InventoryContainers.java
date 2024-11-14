package com.code.common;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;

public class InventoryContainers extends ChestMenu {
    public InventoryContainers(int i, Inventory playerInventory, Container inventory) {
        super(MenuType.GENERIC_9x4, i, playerInventory, inventory, 4);
    }
}
