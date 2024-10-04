package com.code.aseoha.client.renderers.exteriors;

import com.code.aseoha.client.models.exteriors.CoralExterior;
import com.code.aseoha.tileentities.exteriors.CoralTile;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;

public class CoralRenderer extends ExteriorRenderer<CoralTile> {
    public static ResourceLocation TEXTURE = new ResourceLocation("aseoha", "textures/exteriors/coral.png");
//    public static CoralExterior MODEL = new CoralExterior();
//    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0);

    private CoralExterior MODEL = new CoralExterior();

    public CoralRenderer(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    public void renderExterior(CoralTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int i, int i1, float v1) {
        matrixStack.pushPose();
        matrixStack.translate(0.0, -.28, 0.0);
        matrixStack.scale(.5F,.5F,.5F);
        matrixStack.mulPose(Vector3f.YN.rotationDegrees(0F));
        ResourceLocation texture = TEXTURE;
        if (tile.getVariant() != null) { //KEEP THIS HERE!! REMOVING BREAKS TEXTURES!!
            texture = tile.getVariant().getTexture();//tile.getVariant().getTexture();
        }

        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStack, ivertexbuilder, i, i1, v1);
//        MODEL.renderBoti(tile, 0.25F, matrixStack, ivertexbuilder, i, i1, v1);
        matrixStack.popPose();
    }
}
