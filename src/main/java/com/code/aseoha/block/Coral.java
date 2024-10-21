package com.code.aseoha.block;

import com.code.aseoha.aseoha;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.TardisCoralTile;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.Property;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Random;

@SuppressWarnings("deprecation")
public class Coral extends Block {
    public static final IntegerProperty STATE;
    public int State = 0;
    public int timer;
    boolean isTransitioning = false;

    public Coral(AbstractBlock.Properties props) {
        super(props);
        this.registerDefaultState((BlockState) this.stateDefinition.any().setValue(STATE, 0));

    }

    /**
     * @param p_225534_1_ This blocks blockstate
     * @param p_225534_2_ Current Serverworld
     * @param p_225534_3_ This blocks blockpos
     */
    public void tickFunction(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, int timer) {
        if(p_225534_2_.getBlockEntity(p_225534_3_) != null) {
            TileEntity tile = p_225534_2_.getBlockEntity(p_225534_3_);
            int prevState = this.State;
            if (tile != null) {
                this.timer = ((TardisCoralTile) tile).timer;
                if (this.timer <= ((TardisCoralTile) tile).Maxtimer / 5)
                    this.State = 0;
                if ((this.timer >= ((TardisCoralTile) tile).Maxtimer / 5)) {
                    if (this.timer <= ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5)
                        this.State = 1;
                    if (this.timer >= ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5) {
                        if (this.timer <= ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5)
                            this.State = 2;
                        if (this.timer >= ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5)
//                        if (this.timer <= ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer / 5 + ((TardisCoralTile) tile).Maxtimer + ((TardisCoralTile) tile).Maxtimer / 5)
                            this.State = 3;
                    }
                }
            }

            if (this.State != prevState) {
                this.isTransitioning = true;
                p_225534_1_.setValue(STATE, this.State);
                p_225534_2_.setBlock(p_225534_3_, (BlockState) p_225534_1_.setValue(STATE, this.State), 1);//.setValue(STATE, this.State), 1);
            }
        }
        else this.isTransitioning = false;
//        p_225534_1_.setValue(STATE, this.State);
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new Property[]{STATE});
    }

    public static VoxelShape SHAPE = createVoxelShape();

    public static VoxelShape createVoxelShape() {
      return Block.box(5, 0, 5, 11, 10, 11);
    }

    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return AseohaTiles.TARDIS_CORAL.get().create();
    }

    static {
        STATE = IntegerProperty.create("state", 0, 3);
    }
}