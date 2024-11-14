package com.code.common.items;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class SonicItem extends Item {
    public SonicItem(Properties properties) {
        super(properties);
    }

    public InteractionResult useOn(UseOnContext useOnContext) {
        BlockState State = useOnContext.getLevel().getBlockState(useOnContext.getClickedPos());
        Level Level = useOnContext.getLevel();
        BlockPos Pos = useOnContext.getClickedPos();
        if(State.equals(Blocks.REDSTONE_LAMP.defaultBlockState())){
            if (!Level.isClientSide) {
                boolean bl2 = (Boolean)State.getValue(RedstoneLampBlock.LIT);
//                if (bl2 != Level.hasNeighborSignal(Pos)) {
                    if (bl2) {
                        Level.scheduleTick(Pos, State.getBlock(), 4);
                    } else {
                        Level.setBlock(Pos, (BlockState)State.cycle(RedstoneLampBlock.LIT), 2);
                    }
//                }

            }
            return InteractionResult.SUCCESS;
        }
        if(State.equals(Blocks.IRON_TRAPDOOR.defaultBlockState())) {
            Level.setBlock(useOnContext.getClickedPos(), State.cycle(TrapDoorBlock.OPEN), 2);
            return InteractionResult.sidedSuccess(Level.isClientSide);
        }
        if(State.equals(Blocks.IRON_DOOR.defaultBlockState())) {
//            State = (BlockState)State.cycle(DoorBlock.OPEN);
//            Level.setBlock(Pos, State, 10);
//            Level.gameEvent(useOnContext.getPlayer(), ((DoorBlock) State.getBlock()).isOpen(State) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, useOnContext.getClickedPos());
//            return InteractionResult.sidedSuccess(Level.isClientSide);
            ((DoorBlock) State.getBlock()).setOpen(useOnContext.getPlayer(), Level, State, Pos, !((DoorBlock) State.getBlock()).isOpen(State));
        }
        if(State.equals(Blocks.TNT.defaultBlockState())) {
            TntBlock.explode(Level, useOnContext.getClickedPos());
            Level.removeBlock(Pos, false);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }
}
