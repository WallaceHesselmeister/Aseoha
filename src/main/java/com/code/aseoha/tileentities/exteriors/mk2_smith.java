package com.code.aseoha.tileentities.exteriors;

import com.code.aseoha.texturevariants.TextureVariants;
import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.AxisAlignedBB;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class mk2_smith extends ExteriorTile {

    public static final AxisAlignedBB RENDER = new AxisAlignedBB(-1, -1, -1, 2, 2, 2);
    public mk2_smith() {
        super(AseohaTiles.EXTERIOR_MK2_SMITH.get());
        this.setVariants(TextureVariants.MK2_SMITH);
    }

    @Override
    public AxisAlignedBB getDoorAABB() {
        if (level!= null && level.getBlockState(getBlockPos()).hasProperty(BlockStateProperties.HORIZONTAL_FACING)){
            switch(level.getBlockState(this.getBlockPos()).getValue(BlockStateProperties.HORIZONTAL_FACING)) {
                case EAST:
                    return new AxisAlignedBB(0.5, -1, 0, 1.1, 1, 1);
                case SOUTH:
                    return new AxisAlignedBB(0, -1, 0.5, 1, 1, 1.1);
                case WEST:
                    return new AxisAlignedBB(-0.1, -1, 0, 0.5, 1, 1);
                default:
                    return new AxisAlignedBB(0, 0, -0.1, 1, 2, 0.5);
            }
        }
        return new AxisAlignedBB(0, 0, 0, 0, 0, 0);
    }

//    @Override
//    public AxisAlignedBB getRenderBoundingBox() {
//        return RENDER.offset(this.getPos());
//    }
}