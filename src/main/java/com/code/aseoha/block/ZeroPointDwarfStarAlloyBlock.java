package com.code.aseoha.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ZeroPointDwarfStarAlloyBlock extends Block {
    public ZeroPointDwarfStarAlloyBlock() {
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(1200.0F, 2400.0F)
                .requiresCorrectToolForDrops());
    }

}
