//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.common.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.projectile.Projectile;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public abstract class CustomAbstractArrowRenderer<T extends Projectile, M extends EntityModel<T>> extends CustomLivingEntityRendererForArrows<T, M> {

    public CustomAbstractArrowRenderer(EntityRendererProvider.Context context, M entityModel, float f) {
        super(context, entityModel, f);
    }

    public boolean shouldRender(T mob, Frustum frustum, double d, double e, double f) {
        if (super.shouldRender(mob, frustum, d, e, f)) {
            return true;
        } else {
            Entity entity = mob.getOwner();
            return entity != null && frustum.isVisible(entity.getBoundingBoxForCulling());
        }
    }

    public void render(T mob, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        super.render(mob, f, g, poseStack, multiBufferSource, i);
    }

    private static void addVertexPair(VertexConsumer vertexConsumer, Matrix4f matrix4f, float f, float g, float h, int i, int j, int k, int l, float m, float n, float o, float p, int q, boolean bl) {
        float r = (float)q / 24.0F;
        int s = (int)Mth.lerp(r, (float)i, (float)j);
        int t = (int)Mth.lerp(r, (float)k, (float)l);
        int u = LightTexture.pack(s, t);
        float v = q % 2 == (bl ? 1 : 0) ? 0.7F : 1.0F;
        float w = 0.5F * v;
        float x = 0.4F * v;
        float y = 0.3F * v;
        float z = f * r;
        float aa = g > 0.0F ? g * r * r : g - g * (1.0F - r) * (1.0F - r);
        float ab = h * r;
        vertexConsumer.vertex(matrix4f, z - o, aa + n, ab + p).color(w, x, y, 1.0F).uv2(u).endVertex();
        vertexConsumer.vertex(matrix4f, z + o, aa + m - n, ab - p).color(w, x, y, 1.0F).uv2(u).endVertex();
    }
}
