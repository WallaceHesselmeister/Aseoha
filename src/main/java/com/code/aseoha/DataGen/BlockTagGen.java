package com.code.aseoha.DataGen;

import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockTagGen extends BlockTagsProvider {

    public BlockTagGen(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, aseoha.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        add(Tags.Blocks.SAND, AseohaBlocks.GALLIFREY_SAND.get(), AseohaBlocks.TRENZALORE_SAND.get(), AseohaBlocks.SKARO_SAND.get());
    }

    public void add(ITag.INamedTag<Block> branch, Block block) {
        this.tag(branch).add(block);
    }

    public void add(ITag.INamedTag<Block> branch, Block... block) {
        this.tag(branch).add(block);
    }
}