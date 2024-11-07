package com.code.aseoha.mixin;

import net.minecraft.advancements.criterion.AbstractCriterionTrigger;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.world.World;
import net.mistersecret312.temporal_api.triggers.TakeoffTardisTrigger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

/**
 * TA, keep from NPE
 */
@Mixin(TakeoffTardisTrigger.class)
public abstract class TakeoffTardisTriggerMixin extends AbstractCriterionTrigger<TakeoffTardisTrigger.Instance> {
    /**
     * @author Codiak540
     * @reason Prevent NPE
     */
    @Overwrite(remap = false)
    public void testForAll(ServerPlayerEntity player, RegistryKey<World> currentLocation) {
        if(player != null)
            this.trigger(player, (instance) -> instance.test(player, currentLocation));
    }
}
