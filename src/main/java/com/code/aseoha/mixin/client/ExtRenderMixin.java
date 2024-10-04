package com.code.aseoha.mixin.client;

import com.code.aseoha.Helpers.IHelpWithExterior;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ExteriorRenderer.class)
public class ExtRenderMixin {


//    @Shadow(remap = false)public static void applyTransforms(MatrixStack matrixStack, ExteriorTile tile) {
//        matrixStack.translate(0.5, -0.5, 0.5);
//        matrixStack.rotate(Vector3f.ZN.rotationDegrees(180));
//
//        if (tile.getBlockState() != null && tile.getBlockState().getBlock() instanceof ExteriorBlock) {
//            Direction face = tile.getBlockState().get(BlockStateProperties.HORIZONTAL_FACING);
//            matrixStack.mulPose(Vector3f.YP.rotationDegrees(face.getHorizontalAngle() - 180));
//        }
//
//        if (isInverted(tile)) {
//            matrixStack.rotate(Vector3f.ZP.rotationDegrees(180));
//            matrixStack.translate(0, 1.75, 0);
//        }
//        if (tile.getWorld() != null && tile.getWorld().getBlockState(tile.getPos().down(2)).isAir()) {
//            double offY = Math.cos(Minecraft.getInstance().world.getGameTime() * 0.05) * 0.06;
//            double offX = Math.cos(Minecraft.getInstance().world.getGameTime() * 0.05) * 0.07;
//            double offZ = Math.cos(Minecraft.getInstance().world.getGameTime() * 0.05) * 0.07;
//            matrixStack.translate(offX, offY, offZ);
//        }
//    }
    @Inject(method = "applyTransforms(Lcom/mojang/blaze3d/matrix/MatrixStack;Lnet/tardis/mod/tileentities/exteriors/ExteriorTile;)V", at = @At("TAIL"), remap = false)
    private static void Aseoha$UpdateTransforms(MatrixStack matrixStack, ExteriorTile tile, CallbackInfo ci) {
//        ConsoleTile console = TardisHelper.getConsoleInWorld(Objects.requireNonNull(ServerLifecycleHooks.getCurrentServer().getLevel(tile.getInteriorDimensionKey()))).orElse(null);//.ifPresent((console) -> matrixStack.scale((float) ((IHelpWithConsole) console).Aseoha$GetExteriorSize() / 255,(float) ((IHelpWithConsole) console).Aseoha$GetExteriorSize() / 255, (float) ((IHelpWithConsole) console).Aseoha$GetExteriorSize() / 255));
//        ConsoleTile console = TardisHelper.getConsoleInWorld(((IHelpWithExterior) tile).Aseoha$GetInteriorDim());
        if (tile != null) {
                    float scale;
                    if (((IHelpWithExterior) tile).Aseoha$GetScale() == 1)
                        scale = 1;
                    else if (((IHelpWithExterior) tile).Aseoha$GetScale() == 0)
                        scale = 0.3F;
                    else
                        scale = 0;
                    matrixStack.scale(scale, scale, scale);
                    if(scale != 1) matrixStack.translate(0, 1F, 0);
                }
    }

}
