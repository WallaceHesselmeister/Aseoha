package com.code.aseoha.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.item.NameTagItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;
import net.tardis.mod.blocks.ConsoleBlock;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.TardisWorldCapability;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;

import static com.code.aseoha.misc.TARDISHelper.setTardisName;


@Mixin({NameTagItem.class})
public abstract class NameTagMixin extends Item {
    protected NameTagMixin(Properties properties) {
        super(properties);
    }

    @NotNull
    public ActionResultType useOn(ItemUseContext context) {
        World worldIn = context.getLevel();
        ItemStack itemStack = context.getItemInHand();
        BlockState blockState = worldIn.getBlockState(context.getClickedPos());
        if (itemStack.getItem() == Items.NAME_TAG && itemStack.hasCustomHoverName() && (blockState.getBlock() instanceof ConsoleBlock) || (blockState.getBlock() instanceof com.code.aseoha.block.ConsoleBlock)) {
            worldIn.getCapability(Capabilities.TARDIS_DATA).ifPresent((tdata) -> setTardisName((TardisWorldCapability) tdata, itemStack.getHoverName().getString()));
            itemStack.shrink(1);
        }

        return super.useOn(context);
    }
}
