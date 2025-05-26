package com.code.aseoha.backport.ntm.block.misc;


import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;

public class DirectionalVoxelShape {

    public final VoxelShape north;
    public final VoxelShape east;
    public final VoxelShape south;
    public final VoxelShape west;

    public DirectionalVoxelShape(VoxelShape shape){
        this.north = shape;
        this.east = rotateVoxelShape(shape, Direction.EAST);
        this.south = rotateVoxelShape(shape, Direction.SOUTH);
        this.west = rotateVoxelShape(shape, Direction.WEST);
    }

    public VoxelShape getShapeFor(Direction dir){
        switch(dir){
            default: return this.north;
            case EAST: return this.east;
            case SOUTH: return this.south;
            case WEST: return this.west;
        }
    }

    public static VoxelShape rotateVoxelShape(VoxelShape shape, Direction dir){
        VoxelShape newShape = VoxelShapes.empty();

        for(AxisAlignedBB bb : shape.toAabbs()){
            newShape = VoxelShapes.join(newShape, VoxelShapes.create(rotateAABB(bb.move(-0.5, 0, -0.5), dir).move(0.5, 0, 0.5)), IBooleanFunction.OR);
        }

        return newShape;
    }

    public static AxisAlignedBB rotateAABB(AxisAlignedBB aabb, Direction dir){
        return new AxisAlignedBB(rotatePoint(new Vector3d((float) aabb.minX, (float) aabb.minY, (float) aabb.minZ), dir), rotatePoint(new Vector3d((float) aabb.maxX, (float) aabb.maxY, (float) aabb.maxZ), dir));
    }

    public static Vector3d rotatePoint(Vector3d point, Direction dir){
        switch(dir){
            default: return point;
            case EAST: return new Vector3d(-point.z, point.y, point.x);
            case SOUTH: return new Vector3d(-point.x, point.y, -point.z);
            case WEST: return new Vector3d(point.z, point.y, -point.x);
        }
    }

}
