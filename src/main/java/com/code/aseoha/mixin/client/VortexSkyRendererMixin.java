package com.code.aseoha.mixin.client;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.renderers.sky.VortexSkyRenderer;
import net.tardis.mod.helper.TRenderHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.code.aseoha.aseoha.MODID;

@Mixin(value = VortexSkyRenderer.class, remap = false)
public class VortexSkyRendererMixin {
    @Shadow
    @Final
    public static final ResourceLocation TEXTURE = new ResourceLocation(MODID, "textures/vortex/vortex.png");

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void onRender(int ticks, float partialTicks, MatrixStack matrixStack, ClientWorld world, Minecraft mc, CallbackInfo ci){
        matrixStack.pushPose();
        float time = world.getGameTime() + partialTicks;
        matrixStack.mulPose(Vector3f.XP.rotationDegrees(90));
        IVertexBuilder builder = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.beaconBeam(TEXTURE, false));

        float sin = (float) Math.sin(time / 10f);
        float cos = (float) Math.cos(time / 120f);

        for(int i = -45; i < 45; ++i) {
            matrixStack.mulPose(Vector3f.ZP.rotationDegrees(sin / 5));
            matrixStack.mulPose(Vector3f.XP.rotationDegrees(cos / 5));
            matrixStack.pushPose();
            TRenderHelper.renderInsideBox(matrixStack, builder, time, -10, -20 * i, -10, 10, -20 * i + 40, 10, 1.0F, 1.0F, 1.0F, 1.0F);
            matrixStack.mulPose(Vector3f.YP.rotationDegrees(45));
            TRenderHelper.renderInsideBox(matrixStack, builder, time, -10, -20 * i, -10, 10, -20 * i + 40, 10, 1.0F, 1.0F, 1.0F, 1.0F);
            matrixStack.popPose();
        }

        matrixStack.popPose();
        ci.cancel();
    }
}