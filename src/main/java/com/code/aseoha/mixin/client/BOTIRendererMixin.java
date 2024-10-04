package com.code.aseoha.mixin.client;

import com.code.aseoha.aseoha;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.tardis.mod.boti.WorldShell;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.config.TConfig;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.world.dimensions.TDimensions;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;


@Mixin(BOTIRenderer.class)
public abstract class BOTIRendererMixin {

    @Unique
    private static boolean Aseoha$IsInTARDIS;

    @Inject(method = "Lnet/tardis/mod/client/renderers/boti/BOTIRenderer;renderWorld(Lcom/mojang/blaze3d/matrix/MatrixStack;Lnet/tardis/mod/boti/WorldShell;IIF)V", at = @At("HEAD"), remap = false)
    private static void Aseoha$RenderWorld(MatrixStack matrixStack, WorldShell shell, int combinedLight, int combinedOverlay, float partialTicks, CallbackInfo ci) {
//        aseoha.LOGGER.info("IsInTardis {}", Aseoha$IsInTARDIS);
        if (Objects.requireNonNull(shell.getWorld()).dimension() != null) {
//                    aseoha.LOGGER.info(!WorldHelper.areDimensionTypesSame(shell.getWorld(), TDimensions.DimensionTypes.TARDIS_TYPE));
            if (WorldHelper.areDimensionTypesSame(shell.getWorld(), TDimensions.DimensionTypes.TARDIS_TYPE)) {
                if (Minecraft.getInstance().level != null)
                    if (!WorldHelper.areDimensionTypesSame(Minecraft.getInstance().level, TDimensions.DimensionTypes.TARDIS_TYPE))
                        if (!WorldHelper.canTravelToDimension(Objects.requireNonNull(shell.getWorld()))) {
                            shell.setNeedsUpdate(false);
                            matrixStack.clear();
                        }
            }
        }
    }

    @ModifyExpressionValue(remap = false, method = "renderBOTI", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/common/ForgeConfigSpec$BooleanValue;get()Ljava/lang/Object;"))
    private static Object Aseoha$RenderBOTI(Object original) {
        if (!TConfig.CLIENT.enableBoti.get()) return false;
        if (Minecraft.getInstance().level != null)
            return WorldHelper.canTravelInDimensionType(Minecraft.getInstance().level, Minecraft.getInstance().level.dimensionType());
        else return false;
    }

    /**
     * @author Codiak
     * @reason Keep BOTI from throwing nullpointer with TARDIS in TARDIS
     */
    @Overwrite(remap = false)
    public static <T extends AbstractClientPlayerEntity> void renderPlayer(T player, MatrixStack matrix, IRenderTypeBuffer buffer, WorldShell shell) {
        if (player.level != null) {
            if (WorldHelper.areDimensionTypesSame(shell.getWorld(), TDimensions.DimensionTypes.TARDIS_TYPE)) {
                if (Minecraft.getInstance().level != null)
                    if (!WorldHelper.areDimensionTypesSame(player.level, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                        try {
                            EntityRenderer<T> renderer = (EntityRenderer<T>) Minecraft.getInstance().getEntityRenderDispatcher().getRenderer(player);
                            if (renderer != null) {
                                renderer.render(player, player.getYHeadRot(), 0, matrix, buffer, LightTexture.pack(shell.getLightEmission(player.blockPosition()), 15));
                            }
                        } catch (Exception e) {
                            aseoha.LOGGER.info("There's been a potentially fatal error in the BOTI whilst Rendering a player");
                            e.printStackTrace();
                        }
                    }
            }
        }
    }
}