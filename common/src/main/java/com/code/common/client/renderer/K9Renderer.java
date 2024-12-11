package com.code.common.client.renderer;

import com.code.common.entities.K9Entity;
import com.code.common.client.models.K9model;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class K9Renderer extends MobRenderer<K9Entity, K9model<K9Entity>> {
    public K9Renderer(EntityRendererProvider.Context context) {
        super(context, new K9model<>(context.bakeLayer(K9model.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(K9Entity entity) {
        return new ResourceLocation(MOD_ID, "textures/entity/k9.png");
    }
}
