package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithExterior;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.blocks.template.NotSolidTileBlock;
import net.tardis.mod.misc.IDontBreak;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

import java.util.Random;

@Mixin(ExteriorBlock.class)
@SuppressWarnings("deprecation")
public abstract class TardisTopBlockMixin extends NotSolidTileBlock implements IDontBreak {
    public TardisTopBlockMixin(Properties prop) {
        super(prop);
    }

    @Unique
    private World Level;
    @Unique
    private BlockPos pos;

//
    @NotNull
    @Override
    public VoxelShape getShape(@NotNull BlockState state, @NotNull IBlockReader worldIn, @NotNull BlockPos pos, @NotNull ISelectionContext context) {
        VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);
        if(this.Level != null && this.pos != null) {
            TileEntity te = this.Level.getBlockEntity(this.pos);
            if (te != null && te instanceof ExteriorTile) {
                if (!((IHelpWithExterior) (ExteriorTile) te).Aseoha$GetScale())
                    SHAPE = VoxelShapes.empty();
            }
        }
        return SHAPE;
    }

    @NotNull
    @Override
    public VoxelShape getCollisionShape(@NotNull BlockState p_220071_1_, @NotNull IBlockReader p_220071_2_, @NotNull BlockPos p_220071_3_, @NotNull ISelectionContext p_220071_4_) {
        if(this.Level != null && this.pos != null) {
            TileEntity te = this.Level.getBlockEntity(this.pos);

            assert te != null;
            return ((IHelpWithExterior) te).Aseoha$GetScale() ? Block.box(0, 0, 0, 16, 16, 16) : VoxelShapes.empty();
        }
        else return Block.box(0, 0, 0, 16, 16, 16);
    }

    @Override
    public void tick(@NotNull BlockState p_225534_1_, @NotNull ServerWorld p_225534_2_, @NotNull BlockPos p_225534_3_, @NotNull Random p_225534_4_) {
        super.tick(p_225534_1_, p_225534_2_, p_225534_3_, p_225534_4_);
        if(this.Level != (World) p_225534_2_ || this.pos != p_225534_3_) {
            this.Level = (World) p_225534_2_;
            this.pos = p_225534_3_;
        }
    }
}
