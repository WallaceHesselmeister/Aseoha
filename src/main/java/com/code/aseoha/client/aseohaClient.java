package com.code.aseoha.client;

import com.code.aseoha.common.dimension.AseohaDimensions;

import dev.amble.ait.registry.impl.SequenceRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;



import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.fabricmc.fabric.mixin.registry.sync.RegistriesAccessor;


import net.minecraft.registry.*;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;

public class aseohaClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

    }
}
