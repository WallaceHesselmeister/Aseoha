package com.code.aseoha.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import net.tardis.mod.blocks.template.NotSolidTileBlock;
import net.tardis.mod.helper.TInventoryHelper;
import net.tardis.mod.properties.Prop.Blocks;
import net.tardis.mod.tileentities.machines.QuantiscopeTile;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class SonicWorkbench extends NotSolidTileBlock {
    public SonicWorkbench() {
        super((Properties) Blocks.BASIC_TECH.get());
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState state, World worldIn, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand handIn, @NotNull BlockRayTraceResult hit) {
        final TileEntity te = worldIn.getBlockEntity(pos);
        if (!worldIn.isClientSide && te instanceof QuantiscopeTile) {
            NetworkHooks.openGui((ServerPlayerEntity) player, new INamedContainerProvider() {
                public Container createMenu(int id, @NotNull PlayerInventory inv, @NotNull PlayerEntity arg2) {
                    return ((QuantiscopeTile) te).createContainer(id, inv);
                }

                @NotNull
                public ITextComponent getDisplayName() {
                    return new TranslationTextComponent("container.tardis.quantiscope");
                }
            }, pos);
        }

        return ActionResultType.SUCCESS;
    }

    public BlockState getStateForPlacement(@NotNull BlockItemUseContext context) {
        return (BlockState) Objects.requireNonNull(super.getStateForPlacement(context)).setValue(BlockStateProperties.HORIZONTAL_FACING, Objects.requireNonNull(context.getPlayer()).getDirection().getOpposite());
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{BlockStateProperties.HORIZONTAL_FACING});
    }

    @Override
    public void onRemove(@NotNull BlockState state, World worldIn, @NotNull BlockPos pos, @NotNull BlockState newState, boolean isMoving) {
        QuantiscopeTile tileEntity = (QuantiscopeTile) worldIn.getBlockEntity(pos);
        if (tileEntity != null && state.getBlock() != newState.getBlock()) {
            TInventoryHelper.dropInventoryItems(worldIn, pos, tileEntity);
            worldIn.removeBlockEntity(pos);
        }

    }

    @NotNull
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation((Direction) state.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }

    @NotNull
    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState) state.setValue(BlockStateProperties.HORIZONTAL_FACING, rot.rotate((Direction) state.getValue(BlockStateProperties.HORIZONTAL_FACING)));
    }
}
