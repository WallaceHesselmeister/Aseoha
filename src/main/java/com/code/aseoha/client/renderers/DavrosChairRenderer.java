package com.code.aseoha.client.renderers;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.DavrosChairModel;
import com.code.aseoha.entities.DavrosChair;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class DavrosChairRenderer extends EntityRenderer<DavrosChair> {

    private static final ResourceLocation BOAT_TEXTURE_LOCATIONS = new ResourceLocation(aseoha.MODID, "textures/entity/davroschair.png");
    protected final DavrosChairModel<DavrosChair> model = new DavrosChairModel<>();

    public DavrosChairRenderer(EntityRendererManager p_i46190_1_) {
        super(p_i46190_1_);
        this.shadowRadius = 0.8F;
    }

    public void render(@NotNull DavrosChair p_225623_1_, float p_225623_2_, float p_225623_3_, @NotNull MatrixStack p_225623_4_, @NotNull IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
        super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
    }

    @NotNull
    public ResourceLocation getTextureLocation(@NotNull DavrosChair p_110775_1_) {
        return BOAT_TEXTURE_LOCATIONS;
    }
}