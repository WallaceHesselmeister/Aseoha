package com.code.aseoha.block;

import com.code.aseoha.tileentities.AseohaTiles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.tileentities.ConsoleTile;

import java.util.List;

public class ArtronConverterFEAUBlock extends Block {

    private ConsoleTile console;

    public ArtronConverterFEAUBlock(Properties prop){
        super(prop);
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return AseohaTiles.ARTRON_CONVERTER_FE_AU.get().create();
    }

    @Override
    public void appendHoverText(ItemStack stack, IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
        tooltip.add(TardisConstants.Translations.TOOLTIP_HOLD_SHIFT);
        tooltip.add(TardisConstants.Translations.TOOLTIP_REDSTONE_REQUIRED);
        if (Screen.hasShiftDown()) {
            tooltip.clear();
            tooltip.add(0, stack.getDisplayName());
            tooltip.add(new TranslationTextComponent("tooltip.aseoha.acfeau.purpose"));
        }
    }
}