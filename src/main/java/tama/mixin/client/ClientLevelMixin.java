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
    @Unique
    private int aseoha$time;

    @Unique
    private int aseoha$normalTime;

    @Unique
    private final TimerIMPL aseoha$dimensionTimer = new TimerIMPL(20.0F, 0L);

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
        if (TickrateManager.hasDimensionTimer(this.dimension())) {
            assert Minecraft.getInstance().player != null;
            if (TickrateManager.isExcluded(Minecraft.getInstance().player)) {
                TimerIMPL timer = TickrateManager.getDimensionTimer(this.dimension());
                this.aseoha$time = timer.advanceTime(Util.getMillis());
            }
        }
        this.aseoha$normalTime = this.aseoha$dimensionTimer.advanceTime(Util.getMillis());
    }

    @Inject(at = @At("HEAD"), method = "tickNonPassenger", cancellable = true)
    private void tickNonPassenger(Entity entity, CallbackInfo ci) {
        if (entity instanceof Player) return;
        Minecraft mc = Minecraft.getInstance();
        if (TickrateManager.hasTimer(entity)) {
            ci.cancel();
            TimerIMPL timer = TickrateManager.getTimer(entity);
            int j = timer.advanceTime(Util.getMillis());
            for (int k = 0; k < Math.min(EntityTickRateLimit ? 0x1F4 : 0xA, j); ++k) {
                this.aseoha$tickEntities(entity);
            }
        } else if (TickrateManager.hasDimensionTimer(this.dimension())) {
            if (!TickrateManager.isExcluded(entity)) {
                assert mc.player != null;
                if (TickrateManager.isExcluded(mc.player)) {
                    ci.cancel();
                    int j = this.aseoha$time;
                    for (int k = 0; k < Math.min(EntityTickRateLimit ? 0x1F4 : 0xA, j); ++k) {
                        this.aseoha$tickEntities(entity);
                    }
                }
            } else {
                ci.cancel();
                int j = this.aseoha$normalTime;
                for (int k = 0; k < Math.min(EntityTickRateLimit ? 0x1F4 : 0xA, j); ++k) {
                    this.aseoha$tickEntities(entity);
                }
            }
        }
    }

    @SuppressWarnings("deprecation")
    @Unique
    private void aseoha$tickEntities(Entity entity) {
        entity.setOldPosAndRot();
        ++entity.tickCount;
        this.getProfiler()
                .push(() ->
                        BuiltInRegistries.ENTITY_TYPE.getKey(entity.getType()).toString());
        if (entity.canUpdate()) {
            entity.tick();
        }
        this.getProfiler().pop();
        for (Entity entity1 : entity.getPassengers()) {
            this.tickPassenger(entity, entity1);
        }
    }

    @Shadow
    private void tickPassenger(Entity entity, Entity entity1) {}

    @Override
    public int aseoha$getTime() {
        return this.aseoha$time;
    }

    @Override
    public void aseoha$setTime(int time) {
        this.aseoha$time = time;
    }
}
