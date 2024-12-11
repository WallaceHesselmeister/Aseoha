//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.common.client.renderer;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.logging.LogUtils;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.projectile.Projectile;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;

import java.util.List;

@Environment(EnvType.CLIENT)
public abstract class CustomLivingEntityRendererForArrows<T extends Projectile, M extends EntityModel<T>> extends EntityRenderer<T> implements RenderLayerParent<T, M> {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final float EYE_BED_OFFSET = 0.1F;
    protected M model;
    protected final List<RenderLayer<T, M>> layers = Lists.newArrayList();

    public CustomLivingEntityRendererForArrows(EntityRendererProvider.Context context, M entityModel, float f) {
        super(context);
        this.model = entityModel;
        this.shadowRadius = f;
    }

    protected final boolean addLayer(RenderLayer<T, M> renderLayer) {
        return this.layers.add(renderLayer);
    }

    public M getModel() {
        return this.model;
    }

    public void render(T livingEntity, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i) {
        poseStack.pushPose();
        this.model.attackTime = 0;
        this.model.riding = false;
        this.model.young = false;
        float h = Mth.rotLerp(g, livingEntity.yRotO, livingEntity.getYRot());
        float j = Mth.rotLerp(g, livingEntity.yRotO, livingEntity.getYRot());
        float k = j - h;
        float l;

        float m = Mth.lerp(g, livingEntity.xRotO, livingEntity.getXRot());

        float n;

        l = this.getBob(livingEntity, g);
        this.setupRotations(livingEntity, poseStack, l, h, g);
        poseStack.scale(-1.0F, -1.0F, 1.0F);
        this.scale(livingEntity, poseStack, g);
        poseStack.translate(0.0F, -1.501F, 0.0F);
        n = 0.0F;
        float o = 0.0F;

        this.model.prepareMobModel(livingEntity, o, n, g);
        this.model.setupAnim(livingEntity, o, n, l, k, m);
        Minecraft minecraft = Minecraft.getInstance();
        boolean bl = this.isBodyVisible(livingEntity);
        boolean bl2 = !bl && !livingEntity.isInvisibleTo(minecraft.player);
        boolean bl3 = minecraft.shouldEntityAppearGlowing(livingEntity);
        RenderType renderType = this.getRenderType(livingEntity, bl, bl2, bl3);
        if (renderType != null) {
            VertexConsumer vertexConsumer = multiBufferSource.getBuffer(renderType);
            int p = getOverlayCoords(this.getWhiteOverlayProgress(livingEntity, g));
            this.model.renderToBuffer(poseStack, vertexConsumer, i, p, 1.0F, 1.0F, 1.0F, bl2 ? 0.15F : 1.0F);
        }

        poseStack.popPose();
        super.render(livingEntity, f, g, poseStack, multiBufferSource, i);
    }

    @Nullable
    protected RenderType getRenderType(T livingEntity, boolean bl, boolean bl2, boolean bl3) {
        ResourceLocation resourceLocation = this.getTextureLocation(livingEntity);
        if (bl2) {
            return RenderType.itemEntityTranslucentCull(resourceLocation);
        } else if (bl) {
            return this.model.renderType(resourceLocation);
        } else {
            return bl3 ? RenderType.outline(resourceLocation) : null;
        }
    }

    public static int getOverlayCoords(float f) {
        return OverlayTexture.pack(OverlayTexture.u(f), OverlayTexture.v(false));
    }

    protected boolean isBodyVisible(T livingEntity) {
        return !livingEntity.isInvisible();
    }

    protected void setupRotations(T livingEntity, PoseStack poseStack, float f, float g, float h) {


    }


    protected float getBob(T livingEntity, float f) {
        return (float)livingEntity.tickCount + f;
    }

    protected float getWhiteOverlayProgress(T livingEntity, float f) {
        return 0.0F;
    }

    protected void scale(T livingEntity, PoseStack poseStack, float f) {
    }

    protected boolean shouldShowName(T livingEntity) {
        return false;
    }

}
