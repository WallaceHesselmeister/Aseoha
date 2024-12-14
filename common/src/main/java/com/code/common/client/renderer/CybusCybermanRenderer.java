package com.code.common.client.renderer;

import com.code.common.client.models.CybusCybermanModel;
import com.code.common.client.models.DalekModel;
import com.code.common.entities.CybermanEntity;
import com.code.common.entities.DalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class CybusCybermanRenderer extends MobRenderer<CybermanEntity, CybusCybermanModel<CybermanEntity>> {
    public CybusCybermanRenderer(EntityRendererProvider.Context context) {
        super(context, new CybusCybermanModel<>(context.bakeLayer(CybusCybermanModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(CybermanEntity entity) {
        return new ResourceLocation(MOD_ID, "textures/entity/cyberman/cybus.png");
    }
}
