package com.code.aseoha.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import javax.annotation.Nullable;
import java.util.List;

public class unDeadLocker extends Item {


    public unDeadLocker() {
        super(new Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP));
    }
    
    public ActionResultType useOn(ItemUseContext context) {
        World worldIn = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        TileEntity clicked = worldIn.getBlockEntity(blockpos);
//        TileEntity clickedEnt = worldIn.get
        if (clicked instanceof ExteriorTile && worldIn != null && blockpos != null) {
            ((ExteriorTile) clicked).setAdditionalLockLevel(0);
            ((ExteriorTile) clicked).setLocked(false);
            ((ExteriorTile) clicked).setDoorState(EnumDoorState.ONE);
            ((ExteriorTile) clicked).copyDoorStateToInteriorDoor();
            return ActionResultType.SUCCESS;
        }
//        if (clicked instanceof Interior && worldIn != null && blockpos != null) {
//            ((ExteriorTile) clicked).setAdditionalLockLevel(0);
//            ((ExteriorTile) clicked).setLocked(false);
//            ((ExteriorTile) clicked).setDoorState(EnumDoorState.ONE);
//            ((ExteriorTile) clicked).copyDoorStateToInteriorDoor();
//            return ActionResultType.SUCCESS;
//        }
        else return ActionResultType.FAIL;
    }



    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {

            tooltip.add(new TranslationTextComponent("tooltip.aseoha.undeadlocker"));

            super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
