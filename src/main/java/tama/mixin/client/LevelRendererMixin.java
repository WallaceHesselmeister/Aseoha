/* (C) TAMA Studios 2025 */
package tama.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tama.Misc.TickrateManager;
import tama.Misc.TimerIMPL;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {
    @Shadow
    private ClientLevel level;

    @Final
    @Shadow
    private Minecraft minecraft;

    @Final
    @Shadow
    private EntityRenderDispatcher entityRenderDispatcher;

    @Inject(at = @At("HEAD"), method = "renderEntity", cancellable = true)
    private void renderEntity(
            Entity entity,
            double v,
            double v1,
            double v2,
            float v3,
            PoseStack stack,
            MultiBufferSource multiBufferSource,
            CallbackInfo ci) {
        if (TickrateManager.hasTimer(entity)) {
            ci.cancel();
            TimerIMPL timer = TickrateManager.getTimer(entity);
            float partialTick = timer.partialTick;
            double d0 = Mth.lerp(partialTick, entity.xOld, entity.getX());
            double d1 = Mth.lerp(partialTick, entity.yOld, entity.getY());
            double d2 = Mth.lerp(partialTick, entity.zOld, entity.getZ());
            float f = Mth.lerp(partialTick, entity.yRotO, entity.getYRot());
            this.entityRenderDispatcher.render(
                    entity,
                    d0 - v,
                    d1 - v1,
                    d2 - v2,
                    f,
                    partialTick,
                    stack,
                    multiBufferSource,
                    this.entityRenderDispatcher.getPackedLightCoords(entity, partialTick));
        } else if (TickrateManager.hasDimensionTimer(this.level.dimension())) {
            if (entity instanceof Player) return;
            if (!TickrateManager.isExcluded(entity)) {
                if (TickrateManager.isExcluded(this.minecraft.player)) {
                    ci.cancel();
                    TimerIMPL timer =
                            TickrateManager.getDimensionTimer(entity.level().dimension());
                    float partialTick = timer.partialTick;
                    double d0 = Mth.lerp(partialTick, entity.xOld, entity.getX());
                    double d1 = Mth.lerp(partialTick, entity.yOld, entity.getY());
                    double d2 = Mth.lerp(partialTick, entity.zOld, entity.getZ());
                    float f = Mth.lerp(partialTick, entity.yRotO, entity.getYRot());
                    this.entityRenderDispatcher.render(
                            entity,
                            d0 - v,
                            d1 - v1,
                            d2 - v2,
                            f,
                            partialTick,
                            stack,
                            multiBufferSource,
                            this.entityRenderDispatcher.getPackedLightCoords(entity, partialTick));
                }
            } else {
                ci.cancel();
                double d0 = Mth.lerp(v3, entity.xOld, entity.getX());
                double d1 = Mth.lerp(v3, entity.yOld, entity.getY());
                double d2 = Mth.lerp(v3, entity.zOld, entity.getZ());
                float f = Mth.lerp(v3, entity.yRotO, entity.getYRot());
                this.entityRenderDispatcher.render(
                        entity,
                        d0 - v,
                        d1 - v1,
                        d2 - v2,
                        f,
                        v3,
                        stack,
                        multiBufferSource,
                        this.entityRenderDispatcher.getPackedLightCoords(entity, v3));
            }
        }
    }
}
