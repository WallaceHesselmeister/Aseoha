package com.code.aseoha.backport.ntm;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.Property;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class WorldHelper {

    public static Direction getHorizontalFacing(BlockState state){
        if(state.hasProperty(BlockStateProperties.HORIZONTAL_FACING))
            return state.getValue(BlockStateProperties.HORIZONTAL_FACING);

        if(state.hasProperty(BlockStateProperties.FACING)){
            Direction dir = state.getValue(BlockStateProperties.FACING);
            return dir.getAxis().isHorizontal() ? dir : Direction.NORTH;
        }

        return Direction.NORTH;
    }

    public static Vector3d centerOfBlockPos(BlockPos pos){
        return centerOfBlockPos(pos, true);
    }

    public static Vector3d centerOfBlockPos(BlockPos pos, boolean centerY){
        return new Vector3d(pos.getX() + 0.5, pos.getY() + (centerY ? 0.5 : 0), pos.getZ() + 0.5);
    }

    public static BlockPos vecToBlockPos(Vector3d pos) {
        return new BlockPos((int)Math.floor(pos.x), (int)Math.floor(pos.y), (int)Math.floor(pos.z));
    }

    public static float getDegreeFromRotation(Direction dir) {
        switch(dir){
            default: return 0;
            case EAST: return 90;
            case SOUTH: return 180;
            case WEST: return 270;
        }
    }

    public static <T> LazyOptional<T> getCapabilityFromTile(@Nullable TileEntity blockEntity, Capability<T> cap) {
        if(blockEntity == null)
            return LazyOptional.empty();
        return blockEntity.getCapability(cap);
    }

    public static AxisAlignedBB getCenteredAxisAlignedBB(BlockPos pos, double radius) {
        return new AxisAlignedBB(
                WorldHelper.centerOfBlockPos(pos, true).subtract(radius, radius, radius),
                WorldHelper.centerOfBlockPos(pos, true).add(radius, radius, radius)
        );
    }

    public static BlockPos getRandomBlockPos(BlockPos pos, Random rand, int radiusHorizonal, int radiusVertical) {
        return pos.immutable().offset(
                rand.nextInt(radiusHorizonal * 2) - radiusHorizonal,
                rand.nextInt(radiusVertical * 2) - radiusVertical,
                rand.nextInt(radiusHorizonal * 2) - radiusHorizonal
        );
    }

    public static BlockPos getRandomBlockPos(BlockPos pos, Random rand, int radius) {
        return getRandomBlockPos(pos, rand, radius, radius);
    }

    public static <T extends TileEntity> Optional<T> getClosest(World level, BlockPos pos, int radius, TileEntityType<T> type) {

        pos = pos.immutable();

        T entity = null;
        double dist = Integer.MAX_VALUE;

        for(int x = -radius; x < radius; ++x){
            for(int y = -radius; y < radius; ++y){
                for(int z = -radius; z < radius; ++z){
                    final BlockPos testPos = pos.offset(x, y, z);
                    TileEntity te = level.getBlockEntity(testPos);
                    if(te != null && te.getType() == type){
                        double currDist = pos.distSqr(testPos);
                        if(currDist < dist){
                            dist = currDist;
                            entity = (T)te;
                        }
                    }
                }
            }
        }

        return entity == null ? Optional.empty() : Optional.of(entity);
    }

    public static void dropItems(World level, BlockPos pos, ItemStackHandler handler) {
        Vector3d p = WorldHelper.centerOfBlockPos(pos, true);
        for(int i = 0; i < handler.getSlots(); ++i){
            final ItemStack stack = handler.getStackInSlot(i);
            if(!stack.isEmpty()){
                level.addFreshEntity(new ItemEntity(level, p.x, p.y, p.z, stack));
            }
        }

    }

    /**
     * Gets all positions in circular radius
     * @param pos = center
     * @param radius
     * @return
     */
    public static List<BlockPos> blockInRadius(final BlockPos pos, int radius) {

        final List<BlockPos> positions = new ArrayList<>();
        final double radSqr = radius * radius;
        BlockPos.betweenClosed(pos.offset(-radius, -radius, -radius), pos.offset(radius, radius, radius)).forEach(p -> {
            if(p.distSqr(pos) < radSqr){
                positions.add(p.immutable());
            }
        });
        return positions;

    }

    public static <T extends Entity> Optional<T> rayTrace(Entity shooter, Class<T> entities, double range){

        final Vector3d end = shooter.position().add(0, shooter.getEyeHeight(), 0).add(shooter.getLookAngle().scale(range));
        T entity = null;
        double dist = Double.MAX_VALUE;

        for(T e : shooter.level.getEntitiesOfClass(entities, new AxisAlignedBB(shooter.position().subtract(range, range, range), shooter.position().add(range, range, range)))){
            final double d = shooter.distanceToSqr(e.position());
            if(d < dist){
                dist = d;
                entity = e;
            }
        }

        return entity == null ? Optional.empty() : Optional.of(entity);

    }

    public static AxisAlignedBB getBoundsFromBlocks(Collection<BlockPos> positions) {

        if(positions.isEmpty())
            return new AxisAlignedBB(BlockPos.ZERO);

        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE, minZ = Integer.MAX_VALUE,
                maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, maxZ = Integer.MIN_VALUE;

        for(BlockPos pos : positions){
            //mins
            minX = Math.min(pos.getX(), minX);
            minY = Math.min(pos.getY(), minY);
            minZ = Math.min(pos.getZ(), minZ);
            //maxes
            maxX = Math.max(pos.getX(), maxX);
            maxY = Math.max(pos.getY(), maxY);
            maxZ = Math.max(pos.getZ(), maxZ);
        }
        return new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ);
    }

    public static float getFacingAngle(BlockState blockState) {
        final Direction dir = WorldHelper.getHorizontalFacing(blockState);
        return dir.toYRot() + (dir.getAxis() == Direction.Axis.Z ? 180F : 0F);
    }

    public static BlockPos rotateBlockPos(BlockPos pos, Rotation rot){
        switch(rot){
            default: return pos;
            case CLOCKWISE_90: return new BlockPos(-pos.getZ(), pos.getY(), pos.getX());
            case CLOCKWISE_180: return new BlockPos(-pos.getX(), pos.getY(), -pos.getZ());
            case COUNTERCLOCKWISE_90: return new BlockPos(pos.getZ(), pos.getY(), -pos.getX());
        }
    }

    public static List<BlockPos> rotateBlockPositions(Collection<BlockPos> positions, Rotation rot){
        final List<BlockPos> newList = new ArrayList<>();
        for(BlockPos pos : positions){
            newList.add(rotateBlockPos(pos, rot));
        }
        return newList;
    }

    public static VoxelShape moveVoxelShapeTo(VoxelShape shape, BlockPos pos) {
        if(shape == null || shape.isEmpty())
            return VoxelShapes.empty();
        return shape.move(pos.getX(), pos.getY(), pos.getZ());
    }

    public static double getHorizonalSpeed(Entity car) {
        return Math.abs((car.getDeltaMovement().x + car.getDeltaMovement().z) / 2.0);
    }

    public static <T extends Comparable<T>> boolean stateValueEquals(BlockState state, Property<T> prop, T value, boolean fallback) {
        //If this state doesn't have this property, return the fallback
        if(!state.hasProperty(prop)){
            return fallback;
        }
        return state.getValue(prop) == value;
    }

    public static AxisAlignedBB centeredBB(Vector3d center, double radius) {
        return new AxisAlignedBB(
                center.subtract(radius, radius, radius),
                center.add(radius, radius, radius)
        );
    }
}
