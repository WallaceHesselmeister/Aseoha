package com.code.aseoha.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.tardis.mod.ars.IARS;
import net.tardis.mod.properties.TardisBlockProperties;

public class RoundelBlock extends Block implements IARS {
    public RoundelBlock(AbstractBlock.Properties prop, SoundType sound, float hardness, float resistance) {
        super(prop.sound(sound).strength(hardness, resistance));
        this.registerDefaultState((BlockState) this.defaultBlockState().setValue(TardisBlockProperties.LIGHT, 0));
    }
}