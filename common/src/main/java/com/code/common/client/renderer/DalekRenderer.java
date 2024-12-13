package com.code.common.client.renderer;

import com.code.common.client.models.DalekModel;
import com.code.common.entities.DalekEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static com.code.aseoha.MOD_ID;

public class DalekRenderer extends MobRenderer<DalekEntity, DalekModel<DalekEntity>> {
    public DalekRenderer(EntityRendererProvider.Context context) {
        super(context, new DalekModel<>(context.bakeLayer(DalekModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(DalekEntity entity) {
        ResourceLocation TEXTURE;
            switch (entity.GetVariant()) {
                case 1 -> TEXTURE = new ResourceLocation(MOD_ID, "textures/entity/daleks/rtd_supreme.png");
                case 2 -> TEXTURE = new ResourceLocation(MOD_ID, "textures/entity/daleks/rtd_time_war_drone.png");
                case 3 -> TEXTURE = new ResourceLocation(MOD_ID, "textures/entity/daleks/rtd_sec.png");
                default -> TEXTURE = new ResourceLocation(MOD_ID, "textures/entity/daleks/rtd_time_war_drone.png");
            }
        return TEXTURE;
    }
}
