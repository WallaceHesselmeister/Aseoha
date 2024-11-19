package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.TARDISHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.tardis.mod.items.KeyItem;
import net.tardis.mod.items.misc.ConsoleBoundWithTooltipItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

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
    @Inject(method = "use", at = @At("HEAD"))
    private void use(World worldIn, PlayerEntity playerIn, Hand handIn, CallbackInfoReturnable<ActionResult<ItemStack>> cir) {
        TARDISHelper.MakeItemKey(playerIn, handIn, this.Aseoha$getKey());
    }

    @Unique
    private KeyItem Aseoha$getKey() {
        return (KeyItem) this.getItem();
    }
}