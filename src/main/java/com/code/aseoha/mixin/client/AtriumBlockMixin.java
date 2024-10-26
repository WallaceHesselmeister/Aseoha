package com.code.aseoha.mixin.client;

import com.code.aseoha.Constants;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.IBlockReader;
import org.spongepowered.asm.mixin.*;

import java.util.List;


@Mixin(net.tardis.mod.blocks.AtriumBlock.class)
public class AtriumBlockMixin {

    /**
     * @author Codiak
     * @reason Re-Enabled Text
     */
    @Overwrite
    public void appendHoverText(ItemStack stack, IBlockReader worldIn, List<ITextComponent> tooltip,
                                ITooltipFlag flagIn) {
        tooltip.add(Constants.TOOLTIP_REENABLED);
    }
}
