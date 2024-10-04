package com.code.aseoha.items;
import com.code.aseoha.misc.Translations;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.misc.ConsoleBoundWithTooltipItem;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class deadLocker extends ConsoleBoundWithTooltipItem {
    public deadLocker() {
        super((new Item.Properties()).stacksTo(1).tab(ModItemGroup.ASEOHA_GROUP));
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
        if (stack.getItem() instanceof deadLocker) {
            if (!worldIn.isClientSide) {
                if (this.getTardis(stack) != null) {
                    TardisHelper.getConsole(Objects.requireNonNull(worldIn.getServer()), this.getTardis(stack)).ifPresent((tile) -> {
                                    ExteriorTile ext = tile.getExteriorType().getExteriorTile(tile);
                                    if (ext != null) {
                                        BlockPos TARDISPos = ext.getBlockPos();
                                        if(playerIn.blockPosition().closerThan(TARDISPos, 6.0)) {
                                            if (ext.getAdditionalLockLevel() != 0) ext.setAdditionalLockLevel(0);
                                            else ext.setAdditionalLockLevel(1);
                                            playerIn.displayClientMessage(ext.getAdditionalLockLevel() == 1 ? Translations.DeadLocked : Translations.UnDeadLocked, true);

                                        }

                                        if (ext.getAdditionalLockLevel() == 1) {
                                            ext.setDoorState(EnumDoorState.CLOSED);
                                        }

                                        ext.copyDoorStateToInteriorDoor();
//                                        worldIn.playSound((PlayerEntity)null, playerIn.blockPosition(), (SoundEvent) TSounds.CAR_LOCK.get(), SoundCategory.BLOCKS, 1.0F, 1.0F);
                                    }
                    });
                }

                if (this.getTardis(stack) == null) {
                    PlayerHelper.sendMessageToPlayer(playerIn, TardisConstants.Translations.ITEM_NOT_ATTUNED, true);
                }
            }

            return ActionResult.success(stack);
        } else {
            return super.use(worldIn, playerIn, handIn);
        }
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

            tooltip.add(new TranslationTextComponent("tooltip.aseoha.deadlocker"));

            super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
