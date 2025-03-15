package com.code.aseoha.block;

import com.code.aseoha.aseoha;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.WorkbenchTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class WorkbenchBlock extends Block {
    int size = 0;

    public WorkbenchBlock(Properties props) {
        super(props);
    }

    public void tickFunction(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, int timer) {

    }

    @Override
    public void onRemove(BlockState p_196243_1_, World p_196243_2_, BlockPos p_196243_3_, BlockState p_196243_4_, boolean p_196243_5_) {
        TileEntity tile = p_196243_2_.getBlockEntity(p_196243_3_);
        if ((WorkbenchTile) tile != null) {
            if (tile instanceof WorkbenchTile) {
                ((WorkbenchTile) tile).StoredItems.clear();
                tile.setRemoved();
            }
        }
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return AseohaTiles.WORKBENCH.get().create();
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState p_225533_1_, @NotNull World p_225533_2_, @NotNull BlockPos p_225533_3_, @NotNull PlayerEntity p_225533_4_, @NotNull Hand p_225533_5_, @NotNull BlockRayTraceResult p_225533_6_) {
        TileEntity tile = p_225533_2_.getBlockEntity(p_225533_3_);
        if ((WorkbenchTile) tile != null) {

            if (tile instanceof WorkbenchTile) {
                if (!((WorkbenchTile) tile).StoredItems.isEmpty())
                    for (int i = 0; i < ((WorkbenchTile) tile).StoredItems.size(); i++) {
                        if (!((WorkbenchTile) tile).StoredItems.get(i).equals(Items.AIR))
                            this.size++;
                    }
                if (!p_225533_4_.isCrouching() && !p_225533_4_.getMainHandItem().isEmpty() && p_225533_4_.getMainHandItem().getItem() != Items.AIR) {
                    if (this.size < 4) {
                        ((WorkbenchTile) tile).StoredItems.add(p_225533_4_.getMainHandItem().getItem());
                        p_225533_4_.getMainHandItem().shrink(1);
                        return ActionResultType.CONSUME;
                    }
                }
                if (p_225533_4_.isCrouching() && !((WorkbenchTile) tile).StoredItems.isEmpty()) {
                    ArrayList<Items> itemsArrayList = new ArrayList<>();
//                    for (int i = 0; i < 3; i++) {
//                        if (((WorkbenchTile) tile).StoredItems.get(i) == null) {
//                            ((WorkbenchTile) tile).StoredItems.add(i, Items.AIR);
//                        }
//                    }
                    for(int i = 0; i < 4; i++){
                        if(((WorkbenchTile) tile).StoredItems.size() < 4) ((WorkbenchTile) tile).StoredItems.add(Items.AIR);
                    }
                    if (aseoha.WorkBenchRecipeHandler.IsValidRecipeFromArrayList(((WorkbenchTile) tile).StoredItems)) {
                        p_225533_4_.inventory.add(aseoha.WorkBenchRecipeHandler.GetRecipeResult(((WorkbenchTile) tile).StoredItems).getDefaultInstance());
                        ((WorkbenchTile) tile).StoredItems.clear();
                        this.size = 0;
                        return ActionResultType.CONSUME;
                    }
                }
            }


        }
        return ActionResultType.FAIL;
    }
}