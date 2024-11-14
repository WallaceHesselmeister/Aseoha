package com.code.common.world;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.world.level.Level;

import java.rmi.registry.RegistryHandler;

import static com.code.aseoha.MOD_ID;

public class AseohaDimensions {
    public static ResourceLocation MIDNIGHT_LOCATION = new ResourceLocation(MOD_ID, "midnight");
    public static ResourceKey<Level> MIDNIGHT = ResourceKey.create(Registries.DIMENSION, MIDNIGHT_LOCATION);
}
