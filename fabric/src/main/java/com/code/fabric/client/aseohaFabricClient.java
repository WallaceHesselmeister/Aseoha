package com.code.fabric.client;

import com.code.common.client.models.DalekModel;
import com.code.common.client.models.K9mkIIModel;
import com.code.common.client.models.K9model;
import com.code.common.client.models.LazerModel;
import com.code.common.client.renderer.DalekRenderer;
import com.code.common.registries.AseohaBlocks;
import com.code.fabric.client.client.renderer.K9MkIIRenderer;
import com.code.fabric.client.client.renderer.K9Renderer;
import com.code.fabric.client.client.renderer.LazerRenderer;
import com.code.fabric.entities.DalekEntity;
import com.code.fabric.registries.AseohaEntities;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;

public final class aseohaFabricClient implements ClientModInitializer {
//    public static final ModelLayerLocation MODEL_CUBE_LAYER = new ModelLayerLocation(new ResourceLocation(MOD_ID, "k9"), "main");
    @Override
    public void onInitializeClient() {

        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        AseohaBlocks.BLUE_ROUNDELS.forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutoutMipped()));

        EntityRendererRegistry.register(AseohaEntities.K9.get(), K9Renderer::new);

        EntityRendererRegistry.register(AseohaEntities.K9MkII.get(), K9MkIIRenderer::new);

        EntityRendererRegistry.register(AseohaEntities.LAZER.get(), LazerRenderer::new);

        EntityRendererRegistry.register(AseohaEntities.DALEK.get(), DalekRenderer::new);

        ////////////////////////////////////////////////////////////////////////////////////////////

        EntityModelLayerRegistry.register(K9model.LAYER_LOCATION, K9model::createBodyLayer);

        EntityModelLayerRegistry.register(K9mkIIModel.LAYER_LOCATION, K9mkIIModel::createBodyLayer);

        EntityModelLayerRegistry.register(LazerModel.LAYER_LOCATION, LazerModel::createBodyLayer);

        EntityModelLayerRegistry.register(DalekModel.LAYER_LOCATION, DalekModel::createBodyLayer);
    }
}
