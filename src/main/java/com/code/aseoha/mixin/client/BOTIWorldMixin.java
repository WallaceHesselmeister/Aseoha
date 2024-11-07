package com.code.aseoha.mixin.client;

import com.code.aseoha.aseoha;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.BlockPos;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.blocks.exteriors.TardisExteriorBottomBlock;
import net.tardis.mod.boti.BotiWorld;
import net.tardis.mod.boti.WorldShell;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.world.dimensions.TDimensions;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Objects;
import java.util.logging.Level;

@Mixin(BotiWorld.class)
public abstract class BOTIWorldMixin {
    @Shadow(remap = false)
    private WorldShell shell;

    /**
     * @author Codiak
     * @reason BECAUSE I DID (prevent NPE with TARDIS in TARDIS)
     */
    @Overwrite(remap = false)
    public BlockState getBlockState(BlockPos pos) {
        try {
            return shell.getBlockState(pos);
        }
        catch (Exception e) {
            aseoha.LOGGER.info("Ruh Roh! SOMETHING HAPPENED IN THE BLOCKStaTE");
            return Blocks.AIR.defaultBlockState();
        }
    }
}