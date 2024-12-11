package com.code.common.blocks;

import com.code.common.GrammarNazi;
import com.code.common.registries.AseohaBlocks;
import io.netty.util.internal.UnstableApi;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.atomic.AtomicReference;

public class RoundelBlock extends Block implements IAmARoundel{
    private boolean Alternating;
    private Block OriginalBlock;
    private String NormalName;
    private boolean Auto = false;
    public RoundelBlock(Properties properties) {
        super(properties);
    }

    public RoundelBlock(Properties properties, Block NormalRoundel) {
        super(properties);
        this.OriginalBlock = NormalRoundel;
        this.NormalName = GrammarNazi.IDFromBlock(NormalRoundel);
    }

    public RoundelBlock(Properties properties, Block NormalRoundel, String ID) {
        super(properties);
        this.OriginalBlock = NormalRoundel;
        this.NormalName = ID;
    }

    public RoundelBlock(Properties properties, Block NormalRoundel, String ID, boolean Alternating) {
        super(properties);
        this.OriginalBlock = NormalRoundel;
        this.NormalName = ID;
        this.Alternating = Alternating;
    }

    @Override
    public Block GetAverage(){
        return this.OriginalBlock;
    }

    @Override
    public void SetAverage(Block Average){
        this.OriginalBlock = Average;
    }

    @Override
    public void SetID(String ID) {
        this.NormalName = ID;
    }

    @Override
    public String GetID() {
        return this.NormalName;
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
    public void SetIsAutomatic(boolean AutoYesOrNo) {
        this.Auto = AutoYesOrNo;
    }

    @Override
    public boolean IsAutoGenned(){
        return this.Auto;
    }

    public static RoundelBlock GetNormalRoundelForVariant(RoundelBlock variant){
        AtomicReference<RoundelBlock> result = new AtomicReference<>();
        AseohaBlocks.BLOCKS.forEach(block -> {
            if(GrammarNazi.IDFromBlock(block.get()).equals(GrammarNazi.IDFromBlock(variant)
                    .replace("blue_roundel", "roundel").replace("roundel_lit", "roundel").replace("roundel_alternating", "roundel"))){
                result.set((RoundelBlock) block.get());
            }
        });
        return result.get();
    }

    /**
     * This takes a block, not knowing if it's a roundel or not, and does some comparing to the blocks looking for a real roundel
     * @param variant
     * @return
     */
    @Deprecated
    public static Block GetNormalRoundelUnsafe(Block variant){
        AtomicReference<Block> result = new AtomicReference<>();
        AseohaBlocks.BLOCKS.forEach(block -> {
            if(GrammarNazi.IDFromBlock(block.get()).equals(GrammarNazi.IDFromBlock(variant)
                    .replace("blue_roundel", "roundel").replace("roundel_lit", "roundel").replace("roundel_alternating", "roundel"))){
                result.set(block.get());
            }
        });
        return result.get();
    }
}
