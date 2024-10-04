package com.code.aseoha.client.renderers.console;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.consoles.CustardConsoleModel;
import com.code.aseoha.tileentities.consoles.CustardConsoleTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.misc.WorldText;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class CustardConsoleRenderer extends TileEntityRenderer<CustardConsoleTile> {

    public static final WorldText TEXT = new WorldText(0.31F, 0.26F, 0.003F, 16777215);
    public static CustardConsoleModel MODEL = new CustardConsoleModel();

    public CustardConsoleRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void render(CustardConsoleTile custardConsoleTile, float v, MatrixStack matrixStack, @NotNull IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
        matrixStack.pushPose();
        float scale = 0.0625F;
        matrixStack.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
        matrixStack.translate(-0.5, -1.5, 0.5);
        matrixStack.scale((float) 1.15, (float) 1.255, (float) 1.15);
//        custardConsoleTile.getControl(MonitorControl.class).ifPresent((monitor) -> {
//            matrixStack.pushPose();
//
//            if (custardConsoleTile.getControl(MonitorControl.class).isPresent()) {
//                float angle1 = ((IHelpWithMonitor) monitor).Aseoha$GetRot();
//                matrixStack.translate(-.15F, 0F, -.15F);
//                switch ((int) angle1) {
//                    //make default lil - on Z
//                    case 60:
//                    case 120:
//                        matrixStack.mulPose(Vector3f.YN.rotationDegrees(60));
//                        matrixStack.translate(0.0, -0.96, -0.95);
//                        break;
//                    case 0:
//                        matrixStack.mulPose(Vector3f.YN.rotationDegrees(180));
//                        matrixStack.translate(-0.43, -0.96, -0.88); //
//                        break;
//                    case -120:
//                        matrixStack.mulPose(Vector3f.YP.rotationDegrees(60));
//                        matrixStack.translate(-.18, -0.96, -0.58);
//                        break;
//                    case -60:
//                        matrixStack.translate(-0.38, -0.96, .61);
//                        matrixStack.mulPose(Vector3f.YP.rotationDegrees(120));
//                        break;
//                    case 180:
//                        matrixStack.translate(-.0, -0.96, -0.70); //- Z
//                        break;
//                }
//            }
//            TEXT.renderText(matrixStack, iRenderTypeBuffer, i, Helper.getConsoleText(custardConsoleTile));
//            matrixStack.popPose();
//        });
        ResourceLocation texture = new ResourceLocation(aseoha.MODID, "textures/consoles/custard.png");
        if (custardConsoleTile.getVariant() != null) {
            texture = custardConsoleTile.getVariant().getTexture();
        }
//        @Nonnull ResourceLocation texture = Objects.requireNonNull(custardConsoleTile.getVariant()).getTexture();
        MODEL.render(custardConsoleTile, scale, matrixStack, iRenderTypeBuffer.getBuffer(RenderType.entityTranslucent(texture)), i, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        matrixStack.popPose();
        matrixStack.pushPose();
        matrixStack.translate(-.34, 1.4, 1.2);
        matrixStack.scale((float) 0.5, (float) 0.5, (float) 0.5);
//        matrixStack.mulPose(Vector3f.ZN.rotationDegrees(180.0F));
        matrixStack.mulPose(Vector3f.ZP.rotationDegrees(10.0F));
        matrixStack.mulPose(Vector3f.XP.rotationDegrees(10.0F));
        Minecraft.getInstance().getItemRenderer().renderStatic(custardConsoleTile.getSonicItem(), ItemCameraTransforms.TransformType.NONE, i, i1, matrixStack, iRenderTypeBuffer);
        matrixStack.popPose();
    }
}
