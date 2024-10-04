package com.code.aseoha.mixin;

import java.util.ArrayList;
import java.util.Objects;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.tardis.mod.config.TConfig;
import net.tardis.mod.constants.TardisConstants.Translations;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.items.TItems;
import net.tardis.mod.sonic.AbstractSonicMode;
import net.tardis.mod.sonic.interactions.SonicTardisDestinationInteraction;
import net.tardis.mod.tileentities.ConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SonicTardisDestinationInteraction.class)
public class SonicTardisDestinationInteractionMixin extends AbstractSonicMode {
    public SonicTardisDestinationInteractionMixin() {
    }


//    @Unique
//    private static boolean aseoha$flightFromSonic = false;

//    @Unique
//    private void aseoha$FlightFromSonic(ConsoleTile console, BlockState blockState, BlockPos blockPos){
//        aseoha.LOGGER.info(blockPos);
//        aseoha.LOGGER.info(console.getCurrentLocation());
//        if(blockState.is(TBlocks.bottom_exterior.get()) && console.getCurrentLocation() == ){
//        aseoha.LOGGER.info(console.getCurrentLocation() + "curr loc");
//        aseoha.LOGGER.info(console.getCurrentLocation().getX() == blockPos.getX());
//        if(console.getCurrentLocation() == blockPos){
//            aseoha$flightFromSonic = true;
//        }
//        if (console.getCurrentLocation() == blockPos) {
//            console.getSubsystem(StabilizerSubsystem.class).ifPresent(stab -> stab.setControlActivated(true));
//            console.takeoff();
//            console.setDestinationReachedTick(console.flightTicks);
//            aseoha.LOGGER.info(console.getReachDestinationTick());
//            console.getSubsystem(StabilizerSubsystem.class).ifPresent(stab -> stab.setControlActivated(false));
//            this.handleDischarge(player, sonic, 25.0F)
//        }
//        if(console.isInFlight())
//            console.initLand();
//        if (!aseoha$flightFromSonic && console.isInFlight())
//            console.initLand();
//
////        return flightFromSonic;
//    }

    /**
     * @author Codiak
     * @reason HADS & Stuff
     */
    @Inject(remap = false, method = "processBlock", at = @At("HEAD"))
    public void processBlock(PlayerEntity player, BlockState blockState, ItemStack sonic, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (TConfig.SERVER.coordinateTardis.get()) {
            if (sonic.getItem() instanceof SonicItem) {
                SonicItem sonicItem = (SonicItem) sonic.getItem();
                if (sonicItem.getTardis(sonic) != null) {
                    if (sonicItem.getTardis(sonic) == null) {
                        PlayerHelper.sendMessageToPlayer(player, Translations.ITEM_NOT_ATTUNED, true);
                    }
                    ConsoleTile console = TardisHelper.getConsole(Objects.requireNonNull(player.getServer()), sonicItem.getTardis(sonic)).orElse(null);
                    if (console != null) {
                        if (console.getInteriorManager().isAlarmOn()) {
                            console.getInteriorManager().setAlarmOn(false);
                        }
                        if (console.isInFlight()) {
                            console.initLand();
                        }
                    }
                }
            }
        }
    }

    @Shadow(remap = false)
    public boolean processEntity(PlayerEntity user, Entity targeted, ItemStack sonic) {
        return false;
    }

    /**
     * @author Codiak
     * @reason info
     */
    @Overwrite(remap = false)
    public ArrayList<TranslationTextComponent> getAdditionalInfo() {
        ArrayList<TranslationTextComponent> list = new ArrayList<>();
        list.add(new TranslationTextComponent("mixin.sonic.modes.info.set_coords"));
        return list;
    }

    @Shadow(remap = false)
    public boolean hasAdditionalInfo() {
        return true;
    }

    @Shadow(remap = false)
    public void updateHeld(PlayerEntity playerEntity, ItemStack stack) {
    }

    @Shadow(remap = false)
    public ItemStack getItemDisplayIcon() {
        return new ItemStack((IItemProvider) TItems.BROKEN_EXTERIOR.get());
    }
}