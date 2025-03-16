package com.code.aseoha.block;

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

@SuppressWarnings("deprecation")
public class WorkbenchBlock extends Block {
    @Getter
    private int size = 0;

    public WorkbenchBlock(Properties props) {
        super(props);
    }

    @Override
    public void onRemove(@NotNull BlockState state, World world, @NotNull BlockPos pos, @NotNull BlockState state1, boolean flag) {
        TileEntity tile = world.getBlockEntity(pos);
        if (tile != null) {
            if (tile instanceof WorkbenchTile) {
                for(Item item : ((WorkbenchTile) tile).StoredItems) {
                    ItemStack stack = item.getDefaultInstance();
                    ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), stack);
                    itemEntity.setDefaultPickUpDelay();
                    world.addFreshEntity(itemEntity);
                }
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
    public ActionResultType use(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult blockRayTraceResult) {
        TileEntity tile = world.getBlockEntity(pos);
        if (tile instanceof WorkbenchTile) {
                if (!((WorkbenchTile) tile).StoredItems.isEmpty())
                    for (int i = 0; i < ((WorkbenchTile) tile).StoredItems.size(); i++) {
                        if (!((WorkbenchTile) tile).StoredItems.get(i).equals(Items.AIR))
                            this.size++;
                    }
                if (!player.isCrouching() && !player.getMainHandItem().isEmpty() && player.getMainHandItem().getItem() != Items.AIR) {
                    if (this.size < 4) {
                        ((WorkbenchTile) tile).StoredItems.add(player.getMainHandItem().getItem());
                        player.getMainHandItem().shrink(1);
                        return ActionResultType.CONSUME;
                    }
                }
                if (player.isCrouching() && !((WorkbenchTile) tile).StoredItems.isEmpty()) {
                    ArrayList<Items> itemsArrayList = new ArrayList<>();
//                    for (int i = 0; i < 3; i++) {
//                        if (((WorkbenchTile) tile).StoredItems.get(i) == null) {
//                            ((WorkbenchTile) tile).StoredItems.add(i, Items.AIR);
//                        }
//                    }
                    for(int i = 0; i < 4; i++){
                        if(((WorkbenchTile) tile).StoredItems.size() < 4) ((WorkbenchTile) tile).StoredItems.add(Items.AIR);
                    }
                    if (aseoha.WorkBenchRecipeHandler.IsValidRecipe(((WorkbenchTile) tile).StoredItems)) {
                        player.inventory.add(aseoha.WorkBenchRecipeHandler.GetRecipeResult(((WorkbenchTile) tile).StoredItems).getDefaultInstance());
                        ((WorkbenchTile) tile).StoredItems.clear();
                        this.size = 0;
                        return ActionResultType.CONSUME;
                    }
                }
            }
        return ActionResultType.FAIL;
    }
}