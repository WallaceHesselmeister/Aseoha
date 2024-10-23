package com.code.aseoha.items;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.contexts.gui.GuiItemContext;
import net.tardis.mod.helper.TextHelper;
import net.tardis.mod.itemgroups.TItemGroups;
import net.tardis.mod.properties.Prop.Items;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ManualItem extends Item {
    public ManualItem() {
        super(new Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP));
    }


    @NotNull
    @Override
    public ActionResult<ItemStack> use(World worldIn, @NotNull PlayerEntity playerIn, @NotNull Hand handIn) {
        if (!worldIn.isClientSide) {
            if (handIn == Hand.MAIN_HAND)
                com.code.aseoha.misc.AClientHelper.openGUI(0, new GuiItemContext(playerIn.getItemInHand(handIn)));
        }
        return super.use(worldIn, playerIn, handIn);
    }

    protected final IFormattableTextComponent descriptionTooltip = TextHelper.createDescriptionItemTooltip(new TranslationTextComponent("tooltip.upgrades_manual.info"));

    @Override
    public void appendHoverText(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);


        tooltip.add(TardisConstants.Translations.TOOLTIP_CONTROL);
        if (Screen.hasControlDown()) {
            tooltip.clear();
            tooltip.add(0, this.getName(stack));
            tooltip.add(descriptionTooltip);
        }
    }
}
