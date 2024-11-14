package com.code.fabric.client.client.renderer;

import com.code.common.client.models.K9model;
import com.code.fabric.K9Entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.intellij.lang.annotations.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class K9Renderer extends MobRenderer<com.code.fabric.K9Entity, K9model<com.code.fabric.K9Entity>> {

        public K9Renderer(EntityRendererProvider.Context context) {
            super(context, new K9model<>(context.bakeLayer(K9model.LAYER_LOCATION)), 0.5f);
        }

    @Override
    public @NotNull ResourceLocation getTextureLocation(K9Entity entity) {
        return new ResourceLocation(MOD_ID, "textures/entity/k9.png");
    }

}