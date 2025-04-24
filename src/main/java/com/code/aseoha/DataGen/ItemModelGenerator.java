package com.code.aseoha.DataGen;

import com.code.aseoha.block.AseohaBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemModelGenerator extends ItemModelProvider {


    public ItemModelGenerator(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
        super(generator, modid, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Block block = AseohaBlocks.FAT_BLOCK.get();
        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        // Generate item model with block model as parent
        withExistingParent(blockName, modLoc("block/" + blockName));
    }
}