/* (C) TAMA Studios 2025 */
package tama.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.misc.tardis.FuelHandler;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(FuelHandler.class)
public abstract class FuelHandlerMixin {
    @Mutable
    @Final
    @Shadow(remap = false)
    public static float AU_PER_BLOCK;

    @Shadow(remap = false)
    @Final
    ITardisLevel tardis;

    @Shadow(remap = false)
    public abstract float calculateMPG();

    @Shadow(remap = false)
    public abstract float takeArtron(float artronToRecieve, boolean simulate);

    @Shadow(remap = false)
    float artron;

    @Shadow(remap = false)
    public abstract float getMaxArtron();

    @Shadow(remap = false)
    public abstract void update();

    @Inject(remap = false, method = "<init>", at = @At(value = "TAIL"))
    public void init(ITardisLevel tardis, CallbackInfo ci) {
        AU_PER_BLOCK = (float) 1 / 4096;
    }

    @ModifyReturnValue(remap = false, method = "calculateMPG", at = @At(value = "RETURN"))
    public float calcMPG(float original) {
        return (float) 1 / 4096;
    }

    /**
     * @author Codiak
     * @reason update monitor every TICK
     */
    @Overwrite(remap = false)
    public boolean flightTick(float distTraveled) {
        this.takeArtron(this.calculateMPG() * distTraveled, false);
        this.update();
        return this.artron > 0 && this.getMaxArtron() > 0;
    }
}
