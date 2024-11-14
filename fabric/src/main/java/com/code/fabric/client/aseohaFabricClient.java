package com.code.fabric.client;

import com.code.common.client.models.K9model;
import com.code.common.registries.AseohaBlocks;
import com.code.fabric.client.client.renderer.K9Renderer;
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

        AseohaBlocks.BLUE_ROUNDELS.forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutout()));

        EntityRendererRegistry.register(AseohaEntities.K9.get(), K9Renderer::new);

        EntityModelLayerRegistry.register(K9model.LAYER_LOCATION, K9model::createBodyLayer);
    }
}
