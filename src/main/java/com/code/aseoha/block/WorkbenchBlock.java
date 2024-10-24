package com.code.aseoha.block;

import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.WorkBench.WorkBenchRecipeHandler;
import com.code.aseoha.aseoha;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.EOHInteractPacket;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.EOHTile;
import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import com.code.aseoha.tileentities.blocks.WorkbenchTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class WorkbenchBlock extends Block {
    public WorkbenchBlock(Properties props) {
        super(props);
    }

    public void tickFunction(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, int timer) {

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
        if (!p_225533_4_.getMainHandItem().isEmpty() && p_225533_4_.getMainHandItem().getItem() != Items.AIR) {
            if (tile instanceof WorkbenchTile) {
                if (((WorkbenchTile) tile).StoredItems.size() < 3) {
                    ((WorkbenchTile) tile).StoredItems.add(p_225533_4_.getMainHandItem().getItem());
                    p_225533_4_.getMainHandItem().shrink(1);
                    return ActionResultType.CONSUME;
                }
            }
        }
        if(p_225533_4_.isCrouching() && tile instanceof WorkbenchTile){
            if(aseoha.WorkBenchRecipeHandler.IsValidRecipeFromArrayList(((WorkbenchTile) tile).StoredItems)){
                p_225533_4_.inventory.add(aseoha.WorkBenchRecipeHandler.GetRecipeResultFromArrayList(((WorkbenchTile) tile).StoredItems).getDefaultInstance());
            }
        }

        return ActionResultType.FAIL;
    }
}