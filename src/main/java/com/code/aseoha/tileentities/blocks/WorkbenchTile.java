package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;

public class WorkbenchTile extends TileEntity implements ITickableTileEntity {
    public ArrayList<Item> StoredItems = new ArrayList<Item>(4) {
        /**
         * Returns the element at the specified position in this list, if that element is null, return the Air Item.
         *
         * @param index index of the element to return (Or Air if it's out of bounds)
         * @return the element at the specified position in this list
         * @throws IndexOutOfBoundsException {@inheritDoc}
         */
        @Override
        public Item get(int index) {
            if(index >= size()) return Items.AIR;
            return super.get(index) == null ? Items.AIR : super.get(index);
        }



    };
    public WorkbenchTile() {
        super(AseohaTiles.WORKBENCH.get());
    }

    @Override
    public void tick() {

    }
}