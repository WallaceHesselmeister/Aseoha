/* (C) TAMA Studios 2025 */
package tama.mixin;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.storage.WritableLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tama.Misc.TickrateManager;
import tama.Misc.TimerIMPL;

@Mixin(ServerLevel.class)
public abstract class ServerLevelMixin extends Level {
    protected ServerLevelMixin(
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

    @Inject(at = @At("HEAD"), method = "addFreshEntity")
    private void addFreshEntity(Entity p_8837_, CallbackInfoReturnable<Boolean> ci) {
        MySecurityManager manager = new MySecurityManager();
        Class<?>[] ctx = manager.getContext();
        for (Class<?> clazz : ctx) {
            if (TickrateManager.ENTITY_MAP.containsKey(clazz.hashCode())) {
                Entity entity = TickrateManager.ENTITY_MAP.get(clazz.hashCode());
                if (entity != null) {
                    if (TickrateManager.hasTimer(entity) && TickrateManager.shouldChangeSubEntities(entity)) {
                        TickrateManager.setBaseTickrate(p_8837_, TickrateManager.getTickrate(entity));
                    }
                    if (TickrateManager.isExcluded(entity) && TickrateManager.shouldExcludeSubEntities(entity)) {
                        TickrateManager.excludeEntity(p_8837_);
                    }
                }
            } else if (TickrateManager.ENTITY_MAP2.containsKey(clazz.hashCode())) {
                Entity entity = TickrateManager.ENTITY_MAP2.get(clazz.hashCode());
                if (entity != null) {
                    if (TickrateManager.hasTimer(entity) && TickrateManager.shouldChangeSubEntities(entity)) {
                        TickrateManager.setBaseTickrate(p_8837_, TickrateManager.getTickrate(entity));
                    }
                    if (TickrateManager.isExcluded(entity) && TickrateManager.shouldExcludeSubEntities(entity)) {
                        TickrateManager.excludeEntity(p_8837_);
                    }
                }
            }
        }
    }

    @SuppressWarnings("removal")
    private static class MySecurityManager extends SecurityManager {
        public Class<?>[] getContext() {
            return this.getClassContext();
        }
    }

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(BooleanSupplier supplier, CallbackInfo ci) {
        if (TickrateManager.hasDimensionTimer(this.dimension())) {
            this.aseoha$tickDimensionTimer();
        }
    }

    @Unique
    public void aseoha$tickEntityTimer(TimerIMPL timer, Entity entity) {
        float tickrate = timer.tickrate;
        if (tickrate < 0.0F) {
            tickrate = 0.0F;
        }
        timer.accumulator += tickrate / 20.0F;
        int logicTicks = (int) timer.accumulator;
        if (logicTicks >= 1) {
            timer.canTick = true;
            timer.accumulator -= logicTicks;
            timer.pendingTicks = logicTicks;
        } else {
            timer.canTick = false;
        }
    }

    @Unique
    public void aseoha$tickDimensionTimer() {
        TimerIMPL timer = TickrateManager.getDimensionTimer(this.dimension());
        float tickrate = timer.tickrate;
        if (tickrate < 0.0F) {
            tickrate = 0.0F;
        }
        timer.accumulator += tickrate / 20.0F;
        int logicTicks = (int) timer.accumulator;
        if (logicTicks >= 1) {
            timer.canTick = true;
            timer.accumulator -= logicTicks;
            timer.pendingTicks = logicTicks;
        } else {
            timer.canTick = false;
        }
    }

    @Inject(at = @At("HEAD"), method = "tickNonPassenger", cancellable = true)
    private void tickNonPassenger(Entity p_8648_, CallbackInfo ci) {
        if (TickrateManager.hasTimer(p_8648_)) {
            ci.cancel();
            TimerIMPL timer = TickrateManager.getTimer(p_8648_);
            this.aseoha$tickEntityTimer(timer, p_8648_);
            if (timer.canTick) {
                int tick = timer.pendingTicks;
                for (int i = 0; i < tick; i++) {
                    this.aseoha$tickEntities(p_8648_);
                }
            }
        } else if (TickrateManager.hasDimensionTimer(this.dimension()) && !TickrateManager.isExcluded(p_8648_)) {
            ci.cancel();
            TimerIMPL timer = TickrateManager.getDimensionTimer(this.dimension());
            if (timer.canTick) {
                int tick = timer.pendingTicks;
                for (int i = 0; i < tick; i++) {
                    this.aseoha$tickEntities(p_8648_);
                }
            }
        }
    }

    @SuppressWarnings("deprecation")
    @Unique
    private void aseoha$tickEntities(Entity p_8648_) {
        p_8648_.setOldPosAndRot();
        ProfilerFiller profilerfiller = this.getProfiler();
        ++p_8648_.tickCount;
        this.getProfiler()
                .push(() ->
                        BuiltInRegistries.ENTITY_TYPE.getKey(p_8648_.getType()).toString());
        profilerfiller.incrementCounter("tickNonPassenger");
        p_8648_.tick();
        this.getProfiler().pop();
        for (Entity entity : p_8648_.getPassengers()) {
            this.tickPassenger(p_8648_, entity);
        }
    }

    @Shadow
    private void tickPassenger(Entity p_104642_, Entity p_104643_) {}
}
