package com.code.aseoha.client.renderers;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.WalleModel;
import com.code.aseoha.entities.Walle;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class wallerender extends MobRenderer<Walle, WalleModel<Walle>>
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(aseoha.MODID, "textures/entity/walle.png");

    public wallerender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WalleModel<>(), 0.7F);
    }


    @Override
    public ResourceLocation getTextureLocation(Walle walle) {
        return TEXTURE;
    }
}