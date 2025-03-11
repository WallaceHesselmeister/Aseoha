package com.code.aseoha;

import com.code.aseoha.common.Blocks;
import com.code.aseoha.common.ItemGroup;
import com.code.aseoha.common.Items;
import com.code.aseoha.common.dimension.features.Crater;
import com.code.aseoha.common.dimension.features.Features;
import com.code.aseoha.common.misc.DFU;
import com.code.aseoha.common.structures.Structures;
import com.code.aseoha.common.threads.CraterGeneratorThread;
import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class aseoha implements ModInitializer {
    public static String MOD_ID = "aseoha";
    //    public static final RegistryKey<Identifier> MARS_BIOME = new RegistryKey<Identifier>(MOD_ID, "mars_biome")
    public static final RegistryKey<Biome> MARS_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier(MOD_ID, "mars_biome"));
    //    public static final RegistryKey<ConfiguredFeature> CRATER_KEY = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MOD_ID, "crater"));
    public static final ResourceLocation CRATER_ID = new ResourceLocation("aseoha", "crater");
    public static final Crater CRATER = new Crater(ProbabilityConfig.CODEC);

    public static final ConfiguredFeature<ProbabilityConfig, Crater> CRATER_CONFIGURED = new ConfiguredFeature<>(
            CRATER,
            new ProbabilityConfig(10)
    );

    public static PlacedFeature CRATER_PLACED = new PlacedFeature(
            RegistryEntry.of(
                    CRATER_CONFIGURED
            ), List.of(SquarePlacementModifier.of())
    );

    @Override
    public void onInitialize() {
        DFU.init();
        ItemGroup.aseohaGroup.initialize();
        FieldRegistrationHandler.register(Items.class, MOD_ID, false);
        FieldRegistrationHandler.register(Blocks.class, MOD_ID, false);
        Registry.register(Registries.FEATURE, CRATER_ID, CRATER);

        Structures.registerStructureFeatures();
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(MARS_BIOME_KEY), GenerationStep.Feature.TOP_LAYER_MODIFICATION, Crater.CRATER_KEY);
    }
}