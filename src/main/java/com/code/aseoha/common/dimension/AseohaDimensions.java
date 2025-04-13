package com.code.aseoha.common.dimension;

import com.code.aseoha.ResourceLocation;
import com.code.aseoha.aseoha;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class AseohaDimensions {
    public static final Identifier MIDNIGHT_SKY_PROPERTY_KEY = new Identifier(aseoha.MOD_ID, "midnight_sky_property");
    public static RegistryKey<World> GALLIFREY = RegistryKey.of(RegistryKeys.WORLD, new ResourceLocation(aseoha.MOD_ID, "gallifrey"));
}