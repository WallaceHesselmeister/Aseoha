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
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.tardis.mod.helper.TardisHelper;
import org.jetbrains.annotations.NotNull;

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
    public static VoxelShape SHAPE = createVoxelShape().optimize();

    public static VoxelShape createVoxelShape() {
        VoxelShape shape = VoxelShapes.box(0, 0, 0, 1, 1, 1);
        shape = VoxelShapes.join(shape, VoxelShapes.box(0, 0, 0, 1, 1, 1), IBooleanFunction.OR);
        return shape;
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
