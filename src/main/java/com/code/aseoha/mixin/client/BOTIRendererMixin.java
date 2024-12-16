package com.code.aseoha.mixin.client;

import com.code.aseoha.aseoha;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.boti.WorldShell;
import net.tardis.mod.client.renderers.boti.BOTIRenderer;
import net.tardis.mod.config.TConfig;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.world.dimensions.TDimensions;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Iterator;
import java.util.List;


@Mixin(BOTIRenderer.class)
public abstract class BOTIRendererMixin {

    @Unique
    private static boolean Aseoha$IsInTARDIS;

    /**
     * @author Codiak
     * If the two if's passed then the shell AND the player are BOTH in a world they "can't" travel to, such as the TARDIS interior, so we set it so the shell DOESN'T need an update AND we clear the matrixstack.
     * This is done to keep the shell BOTI from updating and effectively destroy any data stored in the matrixstack
     * We erase the data inside the matrixstack so it doesn't show up as the last matrixstack (ex: the overworld/nether) and it doesn't crash because it can't render something inside the TARDIS
     * Call me paranoid all you want but this prevents an NPE with TARDIS in TARDIS
     */
    @Inject(method = "renderWorld(Lcom/mojang/blaze3d/matrix/MatrixStack;Lnet/tardis/mod/boti/WorldShell;IIF)V", at = @At("HEAD"), remap = false)
    private static void Aseoha$RenderWorld(MatrixStack matrixStack, WorldShell shell, int combinedLight, int combinedOverlay, float partialTicks, CallbackInfo ci) {
//        aseoha.LOGGER.info("IsInTardis {}", Aseoha$IsInTARDIS);
        if (shell.getWorld().dimension() == null) return;
//                    aseoha.LOGGER.info(!WorldHelper.areDimensionTypesSame(shell.getWorld(), TDimensions.DimensionTypes.TARDIS_TYPE));
        if (WorldHelper.canTravelToDimension(shell.getWorld())) return; //IF can't travel to shell world
        assert Minecraft.getInstance().level != null;
        if (WorldHelper.canTravelToDimension(Minecraft.getInstance().level))
            return; //IF can't also travel to client world
        ResourceLocation key = Minecraft.getInstance().level.dimension().location();


        List<? extends String> blacklist = (List) TConfig.SERVER.blacklistedDims.get(); //+ TDimensions.DimensionTypes.TARDIS_TYPE;
        Iterator<? extends String> var3 = blacklist.iterator();

        for (int i = 0; i < blacklist.size(); i++) { // Yeah IntelliJ Ik it can be replaced with an "enhanced" for but I don't give a single f
//            while (var3.hasNext()) {

            String s = blacklist.get(i);
            if (key.toString().contentEquals(s)) {
//
//                        if (!WorldHelper.areDimensionTypesSame(Minecraft.getInstance().level, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                aseoha.LOGGER.info(Minecraft.getInstance().level);
                shell.setNeedsUpdate(false);
                matrixStack.clear();
                matrixStack.popPose();
                matrixStack.pushPose();
//                        }
            }
        }
    }

    /**
     * @param original By default: <code>!TConfig.CLIENT.enableBoti.get()</code>
     * @return original && can you travel in the dimension being rendered
     */
    @ModifyExpressionValue(remap = false, method = "renderBOTI", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/common/ForgeConfigSpec$BooleanValue;get()Ljava/lang/Object;"))
    private static Object Aseoha$RenderBOTI(Object original) {
        if (!TConfig.CLIENT.enableBoti.get()) return false;
        if (Minecraft.getInstance().level != null)
            return WorldHelper.canTravelToDimension(Minecraft.getInstance().level);
        else return false;
    }

    /**
     * @author Codiak
     * @reason Keep BOTI from throwing nullpointer with TARDIS in TARDIS
     */
    @Overwrite(remap = false)
    public static <T extends AbstractClientPlayerEntity> void renderPlayer(T player, MatrixStack matrix, IRenderTypeBuffer buffer, WorldShell shell) {
        if (shell == null || shell.getWorld() == null || player == null || buffer == null || player.level == null)
            return;
        if (!WorldHelper.areDimensionTypesSame(shell.getWorld(), TDimensions.DimensionTypes.TARDIS_TYPE) ||
                WorldHelper.areDimensionTypesSame(player.level, TDimensions.DimensionTypes.TARDIS_TYPE) ||
                Minecraft.getInstance().level == null) return;
        try {
            EntityRenderer<T> renderer = (EntityRenderer<T>) Minecraft.getInstance().getEntityRenderDispatcher().getRenderer(player);
            if (renderer == null) return;
            renderer.render(player, player.getYHeadRot(), 0, matrix, buffer, LightTexture.pack(shell.getLightEmission(player.blockPosition()), 15));
        } catch (Exception e) {
            aseoha.LOGGER.info("There's been a potentially fatal error in the BOTI whilst Rendering a player, if you are seeing this, DM codiak540");
            e.printStackTrace();
        }

    }
}