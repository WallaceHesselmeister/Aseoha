package com.code.fabric;

import com.code.aseoha;
import com.code.common.K9Entity;
import com.code.common.registries.AseohaBlocks;
import com.code.fabric.registries.AseohaEntities;
import com.mojang.blaze3d.systems.RenderSystem;
import dev.architectury.event.events.common.TickEvent;
import loqor.ait.AITMod;
import loqor.ait.client.renderers.AITRenderLayers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.level.block.Blocks;

public final class aseohaFabric implements ModInitializer {
    MidnightTickThread TickThread = new MidnightTickThread();

    @Override
    public void onInitialize() {
        aseoha.init();

        AseohaEntities.ENTITY_TYPES.register();

        FabricDefaultAttributeRegistry.register(AseohaEntities.K9.get(), K9Entity.createMobAttributes());

        TickEvent.SERVER_PRE.register((MinecraftServer server) -> this.TickThread.SetServer(server).run());
    }
}
