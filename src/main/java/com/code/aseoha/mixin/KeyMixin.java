package com.code.aseoha.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStack;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStackSimple;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.KeyItem;
import net.tardis.mod.items.TItems;
import net.tardis.mod.items.misc.ConsoleBoundWithTooltipItem;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import net.tardis.mod.upgrades.KeyFobUpgrade;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

import static net.tardis.mod.constants.TardisConstants.TARDIS_KEY_NBT_KEY;

@Mixin(KeyItem.class)
public abstract class KeyMixin extends ConsoleBoundWithTooltipItem {
    @Shadow(remap = false)
    public abstract void setTardis(ItemStack stack, ResourceLocation world);

    @Shadow(remap = false)
    public abstract ResourceLocation getTardis(ItemStack stack);

    public KeyMixin(Properties properties) {
        super(properties);
    }

    /**
     * @author Codiak540
     * @reason Shift R-Click disguises offhand item.
     */
    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    private void use(World worldIn, PlayerEntity playerIn, Hand handIn, CallbackInfoReturnable<ActionResult<ItemStack>> cir) {
        ItemStack stack = playerIn.getItemInHand(handIn);
        if (stack.getItem() instanceof KeyItem) {
            if (playerIn.isCrouching()) {
                if (handIn == Hand.MAIN_HAND) {
                    ItemStack offHandItem = playerIn.getOffhandItem();
                    if (!(playerIn.getOffhandItem() == Items.AIR.getDefaultInstance() &&
                            playerIn.getOffhandItem().getItem() instanceof BucketItem &&
                            playerIn.getOffhandItem().getItem() instanceof PotionItem &&
                            playerIn.getOffhandItem().getItem() instanceof SpawnEggItem &&
                            playerIn.getOffhandItem().getItem().equals(Items.SNOWBALL) &&
                            playerIn.getOffhandItem().getItem().equals(Items.ENDER_PEARL) &&
                            playerIn.getOffhandItem().getItem().equals(Items.EGG)
                            )) {
                        if (stack.hasTag()) {
                            this.setTardis(offHandItem, this.getTardis(stack));
                            playerIn.inventory.removeItem(stack);
                            cir.setReturnValue(ActionResult.success(stack));
                        }
                    }
                }
            }
        }
    }
}
