package com.code.aseoha.client.renderers;
import com.code.aseoha.entities.K9Entity;
import com.code.aseoha.client.models.k9model;
import com.code.aseoha.aseoha;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class k9render extends MobRenderer<K9Entity, k9model<K9Entity>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(aseoha.MODID, "textures/entity/k9.png");

    public k9render(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new k9model<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(K9Entity k9) {
        return TEXTURE;
    }
}