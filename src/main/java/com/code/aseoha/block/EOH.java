package com.code.aseoha.block;

import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.c2s.EOHInteractPacketC2S;
import com.code.aseoha.networking.Packets.c2s.PlayerItemRemovePacketC2S;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.EOHTile;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.tardis.mod.helper.TardisHelper;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

@SuppressWarnings("deprecation")
public class EOH extends Block {
    public PlayerEntity LastPlayerClick;

    @Getter @Setter
    private boolean hasStar = false;

    /**
     * DON'T USE IF UNINITIALIZED
     */
    @Getter
    private EOHTile Tile;

    public EOH(Properties props) {
        super(props);
    }

    @Getter
    private static final VoxelShape SHAPE = createVoxelShape().optimize();

    public static VoxelShape createVoxelShape() {
        return
                Stream.of(
                        Block.box(-15, 0, -15, 31, 2, 31),
                        Block.box(22, 13, -15, 31, 16, -6),
                        Block.box(22, 13, 22, 31, 16, 31),
                        Block.box(-15, 13, 22, -6, 16, 31),
                        Block.box(-15, 13, -15, -6, 16, -6),
                        Block.box(22.4, 2, 22.4, 30.4, 13, 30.4),
                        Block.box(-13.727409999999999, 2.07055, -13.75, 29.27259, 12.07055, 29.75),
                        Block.box(-16, 0, -16, -12, 4, -12),
                        Block.box(28, 0, -16, 32, 4, -12),
                        Block.box(28, 0, 28, 32, 4, 32),
                        Block.box(-16, 0, 28, -12, 4, 32),
                        Block.box(22.4, 2, -14.600000000000001, 30.4, 13, -6.6),
                        Block.box(-14.600000000000001, 2, -14.600000000000001, -6.6, 14, -6.6),
                        Block.box(3, 2, 3, 13, 10, 13),
                        Block.box(4, 3, 4, 12, 11, 12),
                        Block.box(-14.600000000000001, 2, 22.6, -6.6, 13, 30.6),
                        Block.box(6, 0, 29, 10, 13, 32),
                        Block.box(-16, 0, 6, -13, 13, 10),
                        Block.box(29, 0, 6, 32, 13, 10),
                        Block.box(6, 0, -16, 10, 13, -13),
                        Block.box(6.5, 12.509547956315945, -15.274649951547904, 9.5, 18.509547956315945, -12.274649951547904),
                        Block.box(6.5, 12.509547001418465, 28.274655777836973, 9.5, 18.509547001418465, 31.274655777836976),
                        Block.box(-15.274649951547904, 12.509547956315945, 6.5, -12.274649951547904, 18.509547956315945, 9.5),
                        Block.box(28.274655777836973, 12.509547001418465, 6.5, 31.274655777836976, 18.509547001418465, 9.5)
                ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();
    }

    @NotNull
    @Override
    public VoxelShape getShape(@NotNull BlockState p_220053_1_, @NotNull IBlockReader p_220053_2_, @NotNull BlockPos p_220053_3_, @NotNull ISelectionContext p_220053_4_) {
        return SHAPE;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        this.Tile = AseohaTiles.EYE_OF_HARMONY.get().create();
        return this.Tile;
    }

    @NotNull
    @Override
    public ActionResultType use(@NotNull BlockState state, @NotNull World world, @NotNull BlockPos pos, @NotNull PlayerEntity player, @NotNull Hand hand, @NotNull BlockRayTraceResult blockRayTraceResult) {

        if (!world.isClientSide) return ActionResultType.PASS;

        TileEntity tile = world.getBlockEntity(pos);

        if (!(tile instanceof EOHTile)) return ActionResultType.PASS;

        if (this.hasStar) {
            ((EOHTile) tile).Activate(); // ACTIVATE
            Networking.sendToServer(new EOHInteractPacketC2S(false));
            this.Mark();
            return ActionResultType.SUCCESS;
        }
        else {
            if (!player.getMainHandItem().getItem().equals(Items.NETHER_STAR)) return ActionResultType.FAIL;
            ((EOHTile) tile).setHasStar(true); // STAR
            this.LastPlayerClick = player;
            player.getMainHandItem().shrink(1);
            Networking.sendToServer(new EOHInteractPacketC2S(true));
            Networking.sendToServer(new PlayerItemRemovePacketC2S(player.getUUID()));
            this.hasStar = true;
            this.Mark();
            return ActionResultType.SUCCESS;
        }
    }

    public void Mark() {
        this.Tile.setChanged();
        this.Tile.Mark = true;
    }

    @Override
    public void destroy(@NotNull IWorld iWorld, @NotNull BlockPos pos, @NotNull BlockState state) {
        if (!TardisHelper.getConsoleInWorld((World) iWorld).isPresent()) return;
        if (((World) iWorld).getServer() == null) return;
        try {
            (((World) iWorld).getServer()).tell(new TickDelayedTask(20, () -> TardisHelper.getConsoleInWorld((World) iWorld).get().updateArtronValues()));
        } catch (Exception e) {
            throw new RuntimeException("Jeepers cripes alfrighty, you broke the game breaking the eoh, here's some data for ya\n" +
                    "Tile Data: \n" +
                    "Position: " + this.Tile != null ? this.Tile.getBlockPos().toString() : "Null" + "\n" +
                    "Level: " + this.Tile != null ? this.Tile.getLevel().dimension().toString() : "null");
        } finally {
            this.hasStar = false;
        }
    }
}
