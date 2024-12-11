package com.code.fabric.client.client.renderer;

import com.code.common.client.models.LazerModel;
import com.code.fabric.entities.Lazer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class LazerRenderer extends CustomAbstractArrowRenderer<Lazer, LazerModel<Lazer>> {

        public LazerRenderer(EntityRendererProvider.Context context) {
            super(context, new LazerModel<>(context.bakeLayer(LazerModel.LAYER_LOCATION)), 0.5f);
        }

    @Override
    public @NotNull ResourceLocation getTextureLocation(Lazer entity) {
        return new ResourceLocation(MOD_ID, "textures/entity/lazer.png");
    }

}