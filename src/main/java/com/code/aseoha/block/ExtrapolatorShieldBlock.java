package com.code.aseoha.block;

import com.code.aseoha.aseoha;
import com.code.aseoha.tileentities.AseohaTiles;
import com.code.aseoha.tileentities.blocks.ExtrapolatorTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.entity.projectiles.LaserEntity;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.subsystem.ShieldGeneratorSubsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ExtrapolatorShieldBlock extends Block {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public ExtrapolatorShieldBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.valueOf(false)));
    }

    private ExtrapolatorTile Tile;

public static VoxelShape SHAPE = createVoxelShape();

    public static VoxelShape createVoxelShape() {
        return Block.box(2.25, 0, 0.75, 30, 2.5, 14.75);
    }

    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public void destroy(IWorld p_176206_1_, BlockPos p_176206_2_, BlockState p_176206_3_) {
        super.destroy(p_176206_1_, p_176206_2_, p_176206_3_);
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        this.Tile = AseohaTiles.TRIBOPHYSICAL_WAVEFORM_MACRO_KINETIC_EXTRAPOLATOR_TILE.get().create();
        return this.Tile;
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }


    @Override
    public void onPlace(BlockState p_220082_1_, World p_220082_2_, BlockPos p_220082_3_, BlockState p_220082_4_, boolean p_220082_5_) {
        super.onPlace(p_220082_1_, p_220082_2_, p_220082_3_, p_220082_4_, p_220082_5_);
        if(p_220082_2_.getServer() == null) return;
        WorldHelper.forceChunkVanillaIfNotLoaded(p_220082_2_.getServer().getLevel(p_220082_2_.dimension()), new ChunkPos(p_220082_3_));
        aseoha.SendDebugToAll("Extrapolator Shielding Placed in TARDIS " + p_220082_2_);
    }

    @Override
    public void neighborChanged(BlockState blockState, World world, BlockPos blockPos, Block block, BlockPos blockPos1, boolean b) {
        if (!world.isClientSide) {
            boolean flag = blockState.getValue(LIT);
            if (flag != world.hasNeighborSignal(blockPos)) {
                if (flag) {
                    world.getBlockTicks().scheduleTick(blockPos, this, 4);
                } else {
                    world.setBlock(blockPos, blockState.cycle(LIT), 2);
                }
            }

        }
    }


    @Override
    public void tick(BlockState blockState, ServerWorld serverWorld, BlockPos blockPos, Random random) {

        super.tick(blockState, serverWorld, blockPos, random);

        if (!blockState.getValue(LIT)) return;
        if (!serverWorld.hasNeighborSignal(blockPos))
            serverWorld.setBlock(blockPos, blockState.cycle(LIT), 2);


        ConsoleTile tardisTile = TardisHelper.getConsoleInWorld(serverWorld).orElse(null);
        if (tardisTile != null) {
            ExteriorTile exteriorBlock = tardisTile.getExteriorType().getExteriorTile(tardisTile);

            tardisTile.getSubsystem(ShieldGeneratorSubsystem.class).ifPresent((shieldGeneratorSubsystem -> {
                if (shieldGeneratorSubsystem.isForceFieldActivated()) {
                    AxisAlignedBB AABB = new AxisAlignedBB(exteriorBlock.getBlockPos()).inflate(3);
                    for (MonsterEntity liv : exteriorBlock.getLevel().getEntitiesOfClass(MonsterEntity.class, AABB)) {

                        Vector3d LivPos = liv.position();

                        Vector3d AABBVec = AABB.getCenter();

                        Vector3d Normalized = AABBVec.add(LivPos).normalize();

                        double X, Z;

                        if(LivPos.z > AABB.getCenter().z)
                            Z = Normalized.z;
                        else Z = - Normalized.z;

                        if(LivPos.x > AABB.getCenter().x)
                            X = Normalized.x;
                        else X = - Normalized.x;

                        liv.push(X, 0, Z);
                    }

                    for (ArrowEntity liv : exteriorBlock.getLevel().getEntitiesOfClass(ArrowEntity.class, AABB)) {
                        /** If the entity whom shot the arrow is inside the AABB DON'T block it **/
                        if (liv != null && liv.getOwner() != null) {
                            if (!AABB.contains(liv.getOwner().position())) {
                                Vector3d LivPos = liv.position();
                                Vector3d AABBVec = AABB.getCenter();

                                Vector3d Normalized = AABBVec.add(LivPos).normalize();


                                double X, Z;

                                if(LivPos.z > AABB.getCenter().z)
                                    Z = Normalized.z;
                                else Z = - Normalized.z;

                                if(LivPos.x > AABB.getCenter().x)
                                    X = Normalized.x;
                                else X = - Normalized.x;

                                liv.push(X, 0, Z);}
                        }
                    }

                    for (LaserEntity liv : exteriorBlock.getLevel().getEntitiesOfClass(LaserEntity.class, AABB)) {
                        /** If the entity whom shot the arrow is inside the AABB DON'T block it **/
                        if (liv != null && liv.getOwner() != null) {
                            if (!AABB.contains(liv.getOwner().position())) {
                                Vector3d LivPos = liv.position();
                                Vector3d AABBVec = AABB.getCenter();

                                Vector3d Normalized = AABBVec.add(LivPos).normalize();

                                liv.push(Normalized.x, -30, Normalized.z);
                            }
                        }
                    }
                }
            }));
        }


        else {

            AxisAlignedBB AABB = new AxisAlignedBB(blockPos).inflate(3);
            for (MonsterEntity liv : serverWorld.getLevel().getEntitiesOfClass(MonsterEntity.class, AABB)) {

                Vector3d LivPos = liv.position();

                Vector3d AABBVec = AABB.getCenter();

                Vector3d Normalized = AABBVec.add(LivPos).normalize();

                double X, Z;

                if(LivPos.z > AABB.getCenter().z)
                    Z = Normalized.z;
                else Z = - Normalized.z;

                if(LivPos.x > AABB.getCenter().x)
                    X = Normalized.x;
                else X = - Normalized.x;

                liv.push(X, 0, Z);
            }

            for (ArrowEntity liv : serverWorld.getLevel().getEntitiesOfClass(ArrowEntity.class, AABB)) {
                /** If the entity whom shot the arrow is inside the AABB DON'T block it **/
                if (liv != null && liv.getOwner() != null) {
                    if (!AABB.contains(liv.getOwner().position())) {
                        Vector3d LivPos = liv.position();
                        Vector3d AABBVec = AABB.getCenter();

                        Vector3d Normalized = AABBVec.add(LivPos).normalize();

                        liv.push(0, -10, 0);
                    }
                }
            }

            for (LaserEntity liv : serverWorld.getLevel().getEntitiesOfClass(LaserEntity.class, AABB)) {
                /** If the entity whom shot the arrow is inside the AABB DON'T block it **/
                if (liv != null && liv.getOwner() != null) {
                    if (!AABB.contains(liv.getOwner().position())) {
                        Vector3d LivPos = liv.position();
                        Vector3d AABBVec = AABB.getCenter();

                        Vector3d Normalized = AABBVec.add(LivPos).normalize();

                        liv.push(Normalized.x, -30, Normalized.z);
                    }
                }
            }


        }
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(LIT);
    }
}
