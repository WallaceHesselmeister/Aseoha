package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;

import java.util.ArrayList;

public class WorkbenchTile extends TileEntity implements ITickableTileEntity {
    public ArrayList<Item> StoredItems = new ArrayList<>();
    public WorkbenchTile() {
        super(AseohaTiles.WORKBENCH.get());
    }

    @Override
    public void tick() {

    }
}