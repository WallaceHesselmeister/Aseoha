package com.code.common.blocks;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;

public class NESWBlock extends Block implements IAmARoundel {
    // [From Fabric Wiki] the codec is required since 1.20.5 however not actually used in Minecraft yet.
    //public static final MapCodec<VerticalSlabBlock> CODEC = Block.createCodec(VerticalSlabBlock::new);

    private String ID;
    private boolean Alternating = false;
    private Block NormalRoundel;
    private boolean Auto = false;

    public NESWBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public NESWBlock(BlockBehaviour.Properties properties, Block Normal, String ID, boolean IsAlt) {
        super(properties);
        this.NormalRoundel = Normal;
        this.Alternating = IsAlt;
        this.ID = ID;
    }

    public NESWBlock(BlockBehaviour.Properties properties, ResourceKey<Block> key, String ID, boolean IsAlt) {
        super(properties);
        this.NormalRoundel = BuiltInRegistries.BLOCK.get(key);
        this.Alternating = IsAlt;
        this.ID = ID;
    }

//    This is for the CODEC needed in 1.20.5
//    @Override
//    protected MapCodec<? extends VerticalSlabBlock> getCodec() {
//        return CODEC;
//    }

//    @Override
//    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
//        builder.add(Properties.HORIZONTAL_FACING);
//    }


    @Override
    public void SetID(String ID) {
        this.ID = ID;
    }

    @Override
    public String GetID() {
        return this.ID;
    }

    @Override
    public Boolean IsAlternating() {
        return this.Alternating;
    }

    @Override
    public void SetAlternating(Boolean bl) {
        this.Alternating = bl;
    }

    @Override
    public Block GetAverage(){
        return this.NormalRoundel;
    }

    @Override
    public void SetAverage(Block Average){
        this.NormalRoundel = Average;
    }

    @Override
    public void SetIsAutomatic(boolean AutoYesOrNo) {
        this.Auto = AutoYesOrNo;
    }

    @Override
    public boolean IsAutoGenned(){
        return this.Auto;
    }
}