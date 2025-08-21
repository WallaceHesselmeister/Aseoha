/* (C) TAMA Studios 2025 */
package tama.mixin;

import net.minecraft.world.entity.Entity;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tama.Capabilities.Capabilities;
import tama.Capabilities.Interfaces.ITickrateCapability;
import tama.Misc.TickrateManager;

@Mixin(Entity.class)
public class EntityMixin {
    @Inject(method = "tick", at = @At("HEAD"))
    private void tick(CallbackInfo ci) {
        Entity entity = Entity.class.cast(this);
        entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).ifPresent(ITickrateCapability::tick);

        Pair<Boolean, Float> pair = TickrateManager.getArea(entity.level().dimension(), entity.getBoundingBox());
        if (pair.getLeft()) {
            if (entity.getCapability(tama.Capabilities.Capabilities.TICK_RATE).isPresent()) {
                if (!entity.getCapability(Capabilities.TICK_RATE).orElseGet(null).isExcluded())
                    TickrateManager.setTickrate(entity, pair.getRight());
            } else TickrateManager.setTickrate(entity, pair.getRight());
        }
    }
}
