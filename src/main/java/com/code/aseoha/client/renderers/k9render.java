package com.code.aseoha.client.renderers;
import com.code.aseoha.entities.k9;
import com.code.aseoha.client.models.k9model;
import com.code.aseoha.aseoha;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class k9render extends MobRenderer<k9, k9model<k9>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(aseoha.MODID, "textures/entity/k9.png");

    public k9render(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new k9model<>(), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(k9 k9) {
        return TEXTURE;
    }
}