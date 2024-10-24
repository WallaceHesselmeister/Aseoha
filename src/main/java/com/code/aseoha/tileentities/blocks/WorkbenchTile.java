package com.code.aseoha.tileentities.blocks;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.Coral;
import com.code.aseoha.misc.PassNotNull;
import com.code.aseoha.misc.TARDISHelper;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.registries.ConsoleRegistry;
import net.tardis.mod.registries.ExteriorRegistry;

import java.util.ArrayList;

public class WorkbenchTile extends TileEntity implements ITickableTileEntity {
    public WorkbenchTile() {
        super(AseohaTiles.WORKBENCH.get());
    }
    public ArrayList<Item> StoredItems;

    @Override
    public void tick() {

    }
}