package com.code.aseoha;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.FlatGenerationSettings;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.StructureFeature;

public class STConfiguredStructures {
    /**
     * Static instance of our structure so we can reference it and add it to biomes easily.
     */
    public static StructureFeature<?, ?> CONFIGURED_ROAD = STStructures.ROAD.get().configured(IFeatureConfig.NONE);
    public static StructureFeature<?, ?> CONFIGURED_BARN_ONE = STStructures.BARN_ONE.get().configured(IFeatureConfig.NONE);
    public static StructureFeature<?, ?> CONFIGURED_CYBER_CONVERSION_SHIP = STStructures.CYBER_CONVERSION_SHIP.get().configured(IFeatureConfig.NONE);
//    public static StructureFeature<?, ?> CONFIGURED_CITADEL = STStructures.CITADEL.get().configured(IFeatureConfig.NONE);

    /**
     * Registers the configured structure which is what gets added to the biomes.
     * Noticed we are not using a forge registry because there is none for configured structures.
     * We can register configured structures at any time before a world is clicked on and made.
     * But the best time to register configured features by code is honestly to do it in FMLCommonSetupEvent.
     */
    public static void registerConfiguredStructures() {
        Registry<StructureFeature<?, ?>> registry = WorldGenRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new ResourceLocation(aseoha.MODID, "road"), CONFIGURED_ROAD);
        Registry.register(registry, new ResourceLocation(aseoha.MODID, "barn_one"), CONFIGURED_BARN_ONE);
        Registry.register(registry, new ResourceLocation(aseoha.MODID, "cyber_conversion_ship"), CONFIGURED_CYBER_CONVERSION_SHIP);
//        Registry.register(registry, new ResourceLocation(aseoha.MODID, "citadel"), CONFIGURED_CITADEL);

        /* Ok so, this part may be hard to grasp but basically, just add your structure to this to
         * prevent any sort of crash or issue with other mod's custom ChunkGenerators. If they use
         * FlatGenerationSettings.STRUCTURE_FEATURES in it and you don't add your structure to it, the game
         * could crash later when you attempt to add the StructureSeparationSettings to the dimension.
         *
         * (It would also crash with superflat worldtype if you omit the below line
         * and attempt to add the structure's StructureSeparationSettings to the world)
         *
         * Note: If you want your structure to spawn in superflat, remove the FlatChunkGenerator check
         * in StructureTutorialMain.addDimensionalSpacing and then create a superflat world, exit it,
         * and re-enter it and your structures will be spawning. I could not figure out why it needs
         * the restart but honestly, superflat is really buggy and shouldn't be your main focus in my opinion.
         *
         * Requires AccessTransformer ( see resources/META-INF/accesstransformer.cfg )
         */
        FlatGenerationSettings.STRUCTURE_FEATURES.put(STStructures.ROAD.get(), CONFIGURED_ROAD);
        FlatGenerationSettings.STRUCTURE_FEATURES.put(STStructures.BARN_ONE.get(), CONFIGURED_BARN_ONE);
        FlatGenerationSettings.STRUCTURE_FEATURES.put(STStructures.CYBER_CONVERSION_SHIP.get(), CONFIGURED_CYBER_CONVERSION_SHIP);
//        FlatGenerationSettings.STRUCTURE_FEATURES.put(STStructures.CITADEL.get(), CONFIGURED_CITADEL);
    }
}
