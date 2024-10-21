package com.code.aseoha.misc;

import com.code.aseoha.aseoha;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.minecraft.world.gen.DimensionSettings;
import net.tardis.mod.Tardis;
import net.tardis.mod.world.dimensions.TardisChunkGenerator;
import net.tardis.mod.world.dimensions.VortexChunkGenerator;

import java.util.ArrayList;
import java.util.List;

public class AseohaDimensions {
//    public static List<RegistryKey<World>> TARDIS_DIMENSIONS = new ArrayList<RegistryKey<World>>();

    public static final RegistryKey<World> KLOM_DIM = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(aseoha.MODID, "klom"));
    public static final RegistryKey<World> GALLIFREY_DIM = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(aseoha.MODID, "gallifrey"));
    public static final ResourceLocation KLOM_SKY_PROPERTY_KEY = new ResourceLocation(aseoha.MODID, "klom_sky_property");
    public static final ResourceLocation GALLIFREY_SKY_PROPERTY_KEY = new ResourceLocation(aseoha.MODID, "gallifrey_sky_property");
    public static final ResourceLocation RAXICORICOFALLAPITORIUS_SKY_PROPERTY_KEY = new ResourceLocation(aseoha.MODID, "raxicoricofallapitorius_sky_property");
    public static final ResourceLocation BASIC_SKY_PROPERTY_KEY = new ResourceLocation(aseoha.MODID, "basic_sky_property");

    public static RegistryKey<DimensionSettings> KLOM_NOISE_SETTINGS;

    public static class DimensionTypes {
        //This is the DimensionType we use for the Tardis Dimension
        //It's statically initialised because we don't want users to be able to modify it via datapacks
        public static final RegistryKey<DimensionType> KLOM_TYPE = RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(aseoha.MODID, "klom"));
    }

    public static void registerNoiseSettings() {
        KLOM_NOISE_SETTINGS = RegistryKey.create(Registry.NOISE_GENERATOR_SETTINGS_REGISTRY, new ResourceLocation(aseoha.MODID, "klom"));
    }

//    public static void registerChunkGenerators() {
//        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(aseoha.MODID, "klom"), VortexChunkGenerator.providerCodec);
//    }
}
