package com.code.aseoha.block;

import com.code.aseoha.enums.EnumConnectionTypes;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ConstantConditions")
public class ZeroPointDwarfStarAlloyBlock extends Block {
    public static final EnumProperty<EnumConnectionTypes> CONNECTION_TYPE = EnumProperty.create("type", EnumConnectionTypes.class);

    public ZeroPointDwarfStarAlloyBlock() {
        super(AbstractBlock.Properties.of(Material.METAL)
                .strength(5.0F, 10.0F)
                .requiresCorrectToolForDrops());
        this.registerDefaultState(this.defaultBlockState().setValue(CONNECTION_TYPE, EnumConnectionTypes.SINGLE));
    }

    @NotNull
    @SuppressWarnings("deprecation")
    public BlockRenderType getRenderShape(@NotNull BlockState state) {
        return BlockRenderType.MODEL;
    }

    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(CONNECTION_TYPE);
    }

    @NotNull
    @SuppressWarnings("deprecation")
    public FluidState getFluidState(BlockState state) {
        return state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
    public BlockState getStateForPlacement(@NotNull BlockItemUseContext context) {
        return super.getStateForPlacement(context).setValue(BlockStateProperties.HORIZONTAL_FACING, context.getPlayer().getDirection().getOpposite()).setValue(CONNECTION_TYPE, EnumConnectionTypes.SINGLE);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void neighborChanged(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos pos, @NotNull Block neighborBlock, @NotNull BlockPos neighborPos, boolean neighborMoving) {
        super.neighborChanged(state, world, pos, neighborBlock, neighborPos, neighborMoving);
        ArrayList<Direction> touchingDirections = new ArrayList<>();
        for (Direction direction : Direction.values()) {
            if (!world.getBlockState(pos.relative(direction)).getBlock().defaultBlockState().isAir()) {
                touchingDirections.add(direction);
            }
        }

        world.setBlock(pos, updateConnectionType(state, touchingDirections), 3);
    }

    public BlockState updateConnectionType(BlockState state, List<Direction> touchingDirections) {
        if (touchingDirections.isEmpty()) {
            return state.setValue(CONNECTION_TYPE, EnumConnectionTypes.SINGLE);
        }

        // Sort directions alphabetically to match the enum naming
        List<String> sortedDirections = touchingDirections.stream()
                .map(Direction::getName)
                .sorted()
                .collect(Collectors.toList());

        // Join them into a single key
        String connectionKey = String.join("_", sortedDirections);

        // Try to find the matching EnumConnectionTypes
        for (EnumConnectionTypes type : EnumConnectionTypes.values()) {
            if (type.getSerializedName().equals(connectionKey)) {
                return state.setValue(CONNECTION_TYPE, type);
            }
        }

        // Fallback to SINGLE if no match is found
        return state.setValue(CONNECTION_TYPE, EnumConnectionTypes.SINGLE);
    }

}
