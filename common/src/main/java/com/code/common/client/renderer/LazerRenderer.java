package com.code.common.client.renderer;

import com.code.common.entities.Lazer;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

import static com.code.aseoha.MOD_ID;

public class LazerRenderer extends EntityRenderer<Lazer> {

    public LazerRenderer(EntityRendererProvider.Context manager) {
        super(manager);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Lazer entity) {
        return new ResourceLocation(MOD_ID, "textures/entity/lazer.png");
    }

    public void vertex(Matrix4f matrix4f, Matrix3f matrix3f, VertexConsumer vertexConsumer, int i, int j, int k, float f, float g, int l, int m, int n, int o) {
        vertexConsumer.vertex(matrix4f, (float) i, (float) j, (float) k).color(255, 255, 255, 255).uv(f, g).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(o).normal(matrix3f, (float) l, (float) n, (float) m).endVertex();
    }
}