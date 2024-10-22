package com.code.aseoha.block;

//import net.minecraft.block.AbstractBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.tardis.mod.blocks.template.NotSolidTileBlock;
import net.tardis.mod.misc.IDontBreak;

public class ConsoleBlock extends NotSolidTileBlock implements IDontBreak {
    public ConsoleBlock() {
        super(Properties.of(Material.BARRIER).strength(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
    }
}
