package com.code.aseoha.mixin;

import net.minecraft.advancements.criterion.AbstractCriterionTrigger;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.mistersecret312.temporal_api.triggers.SucceedFlightEventTrigger;
import net.tardis.mod.flight.FlightEventFactory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * TAPI, prevent NPE
 */
@Mixin(SucceedFlightEventTrigger.class)
public abstract class SucceedFlightEventTriggerMixin extends AbstractCriterionTrigger<SucceedFlightEventTrigger.Instance> {
    /**
     * @author Codiak540
     * @reason Prevent NPE
     */
    @Overwrite(remap = false)
    public void testForAll(ServerPlayerEntity player, FlightEventFactory flightEvent, Boolean success) {
        if(player != null)
            this.trigger(player, (instance) -> instance.test(flightEvent, success));
    }
}
