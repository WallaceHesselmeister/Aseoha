package com.code.aseoha.client.renderers.exteriors;

import com.code.aseoha.client.models.exteriors.SutekhTardisModel;
import com.code.aseoha.tileentities.exteriors.SutekhTardisTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;

@OnlyIn(Dist.CLIENT)
public class SutekhTardisRenderer extends ExteriorRenderer<SutekhTardisTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/exteriors/mk2/mk2_capaldi.png");
    public static SutekhTardisModel MODEL = new SutekhTardisModel();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    public SutekhTardisRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    public void renderExterior(SutekhTardisTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int i, int i1, float v1) {
        matrixStack.pushPose();
        matrixStack.translate(0.0, -2.5, 0.0);
        ResourceLocation texture = TEXTURE;
        if (tile.getVariant() != null) {
            texture = tile.getVariant().getTexture();
        }

        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStack, ivertexbuilder, i, i1, v1);
        matrixStack.popPose();
    }
}
