package com.code.aseoha.client.renderers.exteriors;

import com.code.aseoha.client.models.exteriors.CapaldiExterior;
import com.code.aseoha.client.models.exteriors.McGannModel;
import com.code.aseoha.tileentities.exteriors.CapaldiTile;
import com.code.aseoha.tileentities.exteriors.McGannTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;

public class McGannRender extends ExteriorRenderer<McGannTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/exteriors/mcgann.png");
    public static ResourceLocation INT_TEXTURE = new ResourceLocation("aseoha", "textures/interiordoors/mcgann.png");
    public static McGannModel MODEL = new McGannModel();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    public McGannRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(McGannTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int i, int i1, float v1) {
        matrixStack.pushPose();
        matrixStack.translate(0.0, -1, 0.0);
        matrixStack.scale(.5F,.5F,.5F);
        ResourceLocation texture = TEXTURE;
        if (tile.getVariant() != null) {
            texture = tile.getVariant().getTexture();
        }

        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStack, ivertexbuilder, i, i1, v1);
        matrixStack.popPose();
    }

    public boolean floatInAir() {
        return true;
    }

}
