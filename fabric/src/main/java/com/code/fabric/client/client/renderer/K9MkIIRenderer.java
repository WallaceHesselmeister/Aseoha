package com.code.fabric.client.client.renderer;

import com.code.common.client.models.K9mkIIModel;
import com.code.common.client.models.K9model;
import com.code.fabric.entities.K9Entity;
import com.code.fabric.entities.K9MkIIEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class K9MkIIRenderer extends MobRenderer<K9MkIIEntity, K9mkIIModel<K9MkIIEntity>> {

        public K9MkIIRenderer(EntityRendererProvider.Context context) {
            super(context, new K9mkIIModel<>(context.bakeLayer(K9mkIIModel.LAYER_LOCATION)), 0.8f);
        }

    @Override
    public @NotNull ResourceLocation getTextureLocation(K9MkIIEntity entity) {
        return new ResourceLocation(MOD_ID, "textures/entity/k9mk2.png");
    }

}