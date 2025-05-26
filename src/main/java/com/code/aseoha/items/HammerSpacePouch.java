package com.code.aseoha.items;

import com.code.aseoha.Helpers.IHelpWithTardisCap;
import com.code.aseoha.Helpers.KeyboardHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.misc.ConsoleBoundWithTooltipItem;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class HammerSpacePouch extends ConsoleBoundWithTooltipItem {
    public HammerSpacePouch() {
        super((new Properties()).stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP));
    }

    public ResourceLocation getTardis(ItemStack stack) {
        return stack.getTag() != null && stack.getTag().contains("tardis_key_linked_console") ? new ResourceLocation(stack.getTag().getString("tardis_key_linked_console")) : null;
    }

    public void setTardis(ItemStack stack, ResourceLocation world) {
        stack.getOrCreateTag().putString("tardis_key_linked_console", world.toString());
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = playerIn.getItemInHand(handIn);
        if (!(stack.getItem() instanceof HammerSpacePouch) || handIn.equals(Hand.MAIN_HAND)) return ActionResult.pass(stack);
        if (worldIn.isClientSide) return ActionResult.pass(stack);
        if (this.getTardis(stack) == null) {
            PlayerHelper.sendMessageToPlayer(playerIn, TardisConstants.Translations.ITEM_NOT_ATTUNED, true);
            return ActionResult.fail(stack);
        }

        TardisHelper.getConsole(Objects.requireNonNull(worldIn.getServer()), this.getTardis(stack)).ifPresent((tile) -> tile.getLevel().getCapability(Capabilities.TARDIS_DATA).ifPresent(cap -> {
            if (playerIn.isCrouching()) {
                if (playerIn.getMainHandItem() == null || playerIn.getMainHandItem().isEmpty() || playerIn.getMainHandItem().equals(Items.AIR.getDefaultInstance()))
                    playerIn.inventory.add(((IHelpWithTardisCap) cap).getAseoha$HammerSpaceBuffer().pullFullStack());
                else {
                    ((IHelpWithTardisCap) cap).getAseoha$HammerSpaceBuffer().addItemStack(playerIn.getMainHandItem());
                    playerIn.inventory.removeItem(playerIn.getMainHandItem());
                }
            } else {
                if (playerIn.getMainHandItem() == null || playerIn.getMainHandItem().isEmpty() || playerIn.getMainHandItem().equals(Items.AIR.getDefaultInstance()))
                    playerIn.inventory.add(((IHelpWithTardisCap) cap).getAseoha$HammerSpaceBuffer().pullItem());
                else {
                    ItemStack stack1 = playerIn.getMainHandItem().copy();
                    stack1.setCount(1);
                    ((IHelpWithTardisCap) cap).getAseoha$HammerSpaceBuffer().addItemStack(stack1);
                    playerIn.getMainHandItem().shrink(1);

                }
            }
        }));
        return ActionResult.fail(stack);
    }

    //    public deadLocker() {
//        super(new Properties().stacksTo(1).tab(ModItemGroup.ASEOHA_GROUP));
//    }
//
//    public ActionResultType useOn(ItemUseContext itemUseContext) {
//        World worldIn = itemUseContext.getLevel();
//        BlockPos blockpos = itemUseContext.getClickedPos();
//        TileEntity clicked = worldIn.getBlockEntity(blockpos);
//        if (clicked instanceof ExteriorTile && worldIn != null && blockpos != null) {
//            int additionalLockLevel;
//            if(((ExteriorTile) clicked).getAdditionalLockLevel() == 0) additionalLockLevel = 1;
//            else additionalLockLevel = 0;
//            ((ExteriorTile) clicked).setAdditionalLockLevel(additionalLockLevel);
//            ((ExteriorTile) clicked).setLocked(true);
//            ((ExteriorTile) clicked).setDoorState(EnumDoorState.CLOSED);
//            ((ExteriorTile) clicked).copyDoorStateToInteriorDoor();
//            return ActionResultType.SUCCESS;
//        }
//        else return ActionResultType.FAIL;
//    }
//
//
//
    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tooltip.aseoha.hammerspace_pouch"));
        tooltip.add(TardisConstants.Translations.TOOLTIP_HOLD_SHIFT);
        if(Minecraft.getInstance().player != null) {
            if (KeyboardHelper.isHoldingShift()) {
                tooltip.add(new TranslationTextComponent("tooltip.aseoha.hammerspace_pouch.second_line"));
                tooltip.add(new TranslationTextComponent("tooltip.aseoha.hammerspace_pouch.third_line"));
                tooltip.add(new TranslationTextComponent("tooltip.aseoha.hammerspace_pouch.fourth_line"));
                tooltip.add(new TranslationTextComponent("tooltip.aseoha.hammerspace_pouch.fifth_line"));
                tooltip.add(new TranslationTextComponent("tooltip.aseoha.hammerspace_pouch.sixth_line"));
            }
        }
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }


}
