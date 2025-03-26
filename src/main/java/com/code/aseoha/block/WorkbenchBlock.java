package com.code.aseoha.block;

import com.code.aseoha.Helpers.MiscHelper;
import com.code.aseoha.WorkBench.WorkBenchRecipeHandler;
import com.code.aseoha.aseoha;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.WorkbenchTile;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@Getter
@SuppressWarnings("deprecation")
public class WorkbenchBlock extends Block {
    private int size = 0;

    public WorkbenchBlock(Properties props) {
        super(props);
    }

    public void DropStored(World world, BlockPos pos, WorkbenchTile tile) {
        for (Item item : tile.StoredItems) {
            MiscHelper.DropItem(item, world, pos);
        }
        tile.StoredItems.clear();
        this.size = 0;
    }

    @Override
    public void onRemove(@NotNull BlockState state, World world, @NotNull BlockPos pos, @NotNull BlockState state1, boolean flag) {
        TileEntity tile = world.getBlockEntity(pos);
        if (tile != null) {
            if (tile instanceof WorkbenchTile) {
                this.DropStored(world, pos, (WorkbenchTile) tile);
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
    public ActionResultType use(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult blockRayTraceResult) {
        if (hand.equals(Hand.OFF_HAND)) return ActionResultType.PASS;

        TileEntity tile = world.getBlockEntity(pos);
        if (tile instanceof WorkbenchTile) {
            if (!player.isCrouching() && !player.getMainHandItem().isEmpty() && player.getMainHandItem().getItem() != Items.AIR) {
                if (this.size < 4) {
                    ((WorkbenchTile) tile).StoredItems.add(player.getMainHandItem().getItem());
                    player.getMainHandItem().shrink(1);
                    if(!world.isClientSide)
                        this.size++;
                    return ActionResultType.CONSUME;
                }
            }
            if (player.isCrouching() && !((WorkbenchTile) tile).StoredItems.isEmpty()) {
                if (aseoha.WorkBenchRecipeHandler.IsValidRecipe(((WorkbenchTile) tile).StoredItems)) {
//                     Before it used to just give you the item, now it drops it above the table
//                    player.inventory.add(aseoha.WorkBenchRecipeHandler.GetRecipeResult(((WorkbenchTile) tile).StoredItems).getDefaultInstance());
                    Item result = WorkBenchRecipeHandler.GetDefault().GetRecipeResult(((WorkbenchTile) tile).StoredItems);
                    MiscHelper.DropItem(result, world, pos.above());
                    ((WorkbenchTile) tile).StoredItems.clear();
                    this.size = 0;
                    return ActionResultType.CONSUME;
                }
                else {
                    this.DropStored(world, pos, (WorkbenchTile) tile);
                }
            }
        }
        return ActionResultType.FAIL;
    }
}