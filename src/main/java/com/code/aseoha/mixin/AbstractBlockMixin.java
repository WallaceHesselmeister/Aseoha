package com.code.aseoha.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.registries.ForgeRegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin({AbstractBlock.class})
public abstract class AbstractBlockMixin extends ForgeRegistryEntry<Block> {

    @Inject(
            at = {@At(
                    value = "INVOKE_ASSIGN",
                    shift = At.Shift.BY, by = 2,
                    target = "Lnet/minecraft/block/BlockState;getDestroySpeed(Lnet/minecraft/world/IBlockReader;Lnet/minecraft/util/math/BlockPos;)F"
            )},
            method = {"getDestroyProgress(Lnet/minecraft/block/BlockState;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/world/IBlockReader;Lnet/minecraft/util/math/BlockPos;)F"},
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILSOFT
    )
    //TODO: THIS!!!!
    /**
     * This Basically is just a copy of the normal block breaking calculation but put before the return of the bedrock block breaking calculation, if that makes sense.
     */
    public void Aseoha$AllowBedrockBreaking(BlockState p_180647_1_, PlayerEntity p_180647_2_, IBlockReader p_180647_3_, BlockPos p_180647_4_, CallbackInfoReturnable<Float> cir, float hardness) {
        ItemStack stackInHand = p_180647_2_.getItemInHand(p_180647_2_.getUsedItemHand());
        float f = p_180647_1_.getDestroySpeed(p_180647_3_, p_180647_4_);
        System.out.println(p_180647_2_.getItemInHand(p_180647_2_.getUsedItemHand()));
        if ((hardness == -1.0F || p_180647_1_.equals(Blocks.BEDROCK.defaultBlockState())) && p_180647_2_.getItemInHand(p_180647_2_.getUsedItemHand()).equals(Items.DIAMOND_PICKAXE.getDefaultInstance())) {
            int i = ForgeHooks.canHarvestBlock(p_180647_1_, p_180647_2_, p_180647_3_, p_180647_4_) ? 30 : 100;
            cir.setReturnValue(p_180647_2_.getDigSpeed(p_180647_1_, p_180647_4_) / f / (float)i);
//            cir.setReturnValue(p_180647_2_.(state) / this.effectiveHardness);
        }

    }
}