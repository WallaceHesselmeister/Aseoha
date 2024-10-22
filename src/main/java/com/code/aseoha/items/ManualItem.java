package com.code.aseoha.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.contexts.gui.GuiItemContext;
import net.tardis.mod.itemgroups.TItemGroups;
import net.tardis.mod.properties.Prop.Items;
import org.jetbrains.annotations.NotNull;

public class ManualItem extends Item {
    public ManualItem() {
        super(((Properties)Items.ONE.get()).tab(TItemGroups.MAINTENANCE));
    }

    @NotNull
    public ActionResult<ItemStack> use(World worldIn, @NotNull PlayerEntity playerIn, @NotNull Hand handIn) {
        if (worldIn.isClientSide && handIn == Hand.MAIN_HAND) {
            ClientHelper.openGUI(10, new GuiItemContext(playerIn.getItemInHand(handIn)));
        }

        return super.use(worldIn, playerIn, handIn);
    }
}
