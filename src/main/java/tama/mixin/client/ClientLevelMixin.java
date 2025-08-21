/* (C) TAMA Studios 2025 */
package tama.mixin.client;

import static tama.aseoha.EntityTickRateLimit;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.storage.WritableLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tama.Misc.IHelpWithTime;
import tama.Misc.TickrateManager;
import tama.Misc.TimerIMPL;

@Mixin(ClientLevel.class)
public abstract class ClientLevelMixin extends Level implements IHelpWithTime {
    private int time;
    private int normalTime;

    private final TimerIMPL dimensionTimer = new TimerIMPL(20.0F, 0L);

    protected ClientLevelMixin(
            WritableLevelData p_220352_,
            ResourceKey<Level> p_220353_,
            RegistryAccess p_270200_,
            Holder<DimensionType> p_220354_,
            Supplier<ProfilerFiller> p_220355_,
            boolean p_220356_,
            boolean p_220357_,
            long p_220358_,
            int p_220359_) {
        super(p_220352_, p_220353_, p_270200_, p_220354_, p_220355_, p_220356_, p_220357_, p_220358_, p_220359_);
    }

    @Inject(at = @At("TAIL"), method = "tick", cancellable = true)
    private void tick(BooleanSupplier supplier, CallbackInfo ci) {
        if (TickrateManager.hasDimensionTimer(this.dimension())
                && TickrateManager.isExcluded(Minecraft.getInstance().player)) {
            TimerIMPL timer = TickrateManager.getDimensionTimer(this.dimension());
            this.time = timer.advanceTime(Util.getMillis());
        }
        this.normalTime = this.dimensionTimer.advanceTime(Util.getMillis());
    }

    @Inject(at = @At("HEAD"), method = "tickNonPassenger", cancellable = true)
    private void tickNonPassenger(Entity p_104640_, CallbackInfo ci) {
        if (p_104640_ instanceof Player) return;
        Minecraft mc = Minecraft.getInstance();
        if (TickrateManager.hasTimer(p_104640_)) {
            ci.cancel();
            TimerIMPL timer = TickrateManager.getTimer(p_104640_);
            int j = timer.advanceTime(Util.getMillis());
            for (int k = 0; k < Math.min(EntityTickRateLimit ? 500 : 10, j); ++k) {
                this.tickEntities(p_104640_);
            }
        } else if (TickrateManager.hasDimensionTimer(this.dimension())) {
            if (!TickrateManager.isExcluded(p_104640_)) {
                if (TickrateManager.isExcluded(mc.player)) {
                    ci.cancel();
                    int j = this.time;
                    for (int k = 0; k < Math.min(EntityTickRateLimit ? 500 : 10, j); ++k) {
                        this.tickEntities(p_104640_);
                    }
                }
            } else {
                ci.cancel();
                int j = this.normalTime;
                for (int k = 0; k < Math.min(EntityTickRateLimit ? 500 : 10, j); ++k) {
                    this.tickEntities(p_104640_);
                }
            }
        }
    }

    @SuppressWarnings("deprecation")
    @Unique
    private void tickEntities(Entity p_104640_) {
        p_104640_.setOldPosAndRot();
        ++p_104640_.tickCount;
        this.getProfiler().push(() -> {
            return BuiltInRegistries.ENTITY_TYPE.getKey(p_104640_.getType()).toString();
        });
        if (p_104640_.canUpdate()) {
            p_104640_.tick();
        }
        this.getProfiler().pop();
        for (Entity entity : p_104640_.getPassengers()) {
            this.tickPassenger(p_104640_, entity);
        }
    }

    @Shadow
    private void tickPassenger(Entity p_104642_, Entity p_104643_) {}

    @Override
    public int getTime() {
        return this.time;
    }

    @Override
    public void setTime(int time) {
        this.time = time;
    }
}
