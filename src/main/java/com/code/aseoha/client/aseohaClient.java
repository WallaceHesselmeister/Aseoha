package com.code.aseoha.client;

import com.code.aseoha.common.dimension.AseohaDimensions;
import com.code.aseoha.common.dimension.sky.*;
import loqor.ait.registry.impl.SequenceRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.client.rendering.v1.DimensionRenderingRegistry;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.fabricmc.fabric.mixin.registry.sync.RegistriesAccessor;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.registry.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class aseohaClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        DimensionEffects.BY_IDENTIFIER.put(AseohaDimensions.MIDNIGHT_SKY_PROPERTY_KEY, new MidnightSkyProperties()).getSkyType();
        new Identifier("aseohait", "");
        DimensionRenderingRegistry.registerSkyRenderer(AseohaDimensions.GALLIFREY, new GallifreySkyRenderer());
//        DimensionEffects.BY_IDENTIFIER.put;
        // Assuming you have a custom sky property
        MarsSkyProperties customSkyProperties = new MarsSkyProperties();
//        MinecraftClient.getInstance().worldRenderer.setWorld(DimensionEffects.).(new MarsSkyRenderer());
//        Registry.register(DimensionRenderingRegistry.)
        // Register your custom sky renderer
//        ((ClientWorld) MinecraftClient.getInstance().world).getLevelProperties().worldRenderer(new MarsSkyRenderer());
//        Registries.
//        C2SPlayChannelEvents.Register

//        DimensionRenderInfo.EFFECTS.put(AseohaDimensions.KLOM_SKY_PROPERTY_KEY, new KlomSkyProperty());
    }
}
