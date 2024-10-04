package com.code.aseoha.client.renderers.exteriors;

import com.code.aseoha.client.models.exteriors.Hartnell112;
import com.code.aseoha.tileentities.exteriors.Hartnell112Tile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;

public class Hartnell112Render extends ExteriorRenderer<Hartnell112Tile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/exteriors/convert/hartnell.png");
    public static Hartnell112 MODEL = new Hartnell112();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    public Hartnell112Render(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(Hartnell112Tile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int i, int i1, float v1) {
        matrixStack.pushPose();
        matrixStack.translate(0.0, -1.0, 0.0);
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
