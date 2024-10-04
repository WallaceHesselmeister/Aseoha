/*package com.code.aseoha.world.biome;

import com.code.aseoha.aseoha;
import net.minecraft.client.audio.BackgroundMusicTracks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.biome.*;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES
            = DeferredRegister.create(ForgeRegistries.BIOMES, aseoha.MODID);

    public static final RegistryObject<Biome> NEWEARTH = BIOMES.register("newearth",
            () -> makeNewEarthBiome(() -> ModConfiguredSurfaceBuilders.NEWEARTH_SURFACE, 0.125f, 0.05f));

    public static Biome makeNewEarthBiome(final Supplier<ConfiguredSurfaceBuilder<?>> surfaceBuilder, float depth, float scale){
        BiomeGenerationSettings.Builder biomegenerationsettings$builder =
                (new BiomeGenerationSettings.Builder()).surfaceBuilder(surfaceBuilder);
//        biomegenerationsettings$builder.addStructureStart(StructureFeatures.END_CITY);
        DefaultBiomeFeatures.addDefaultOres(biomegenerationsettings$builder);
        MobSpawnInfo.Builder mobspawninfo$builder = new MobSpawnInfo.Builder();
        mobspawninfo$builder.addSpawn(EntityClassification.CREATURE,
                new MobSpawnInfo.Spawners(EntityType.VILLAGER, 50, 4, 4));

        return (new Biome.Builder()).precipitation(Biome.RainType.NONE).biomeCategory(Biome.Category.OCEAN).depth(depth).scale(scale)
                .temperature(1.5F).downfall(0.9F).specialEffects((new BiomeAmbience.Builder()).waterColor(1329587).waterFogColor(329011)
                        .fogColor(12638463).skyColor(-3407872).foliageColorOverride(971008).grassColorOverride(65331)
                        .skyColor(5739263) //.ambientParticle(new ParticleEffectAmbience(ParticleTypes.LAVA, 0.003f))
                        .ambientLoopSound(SoundEvents.AMBIENT_CAVE)
                        .ambientMoodSound(new MoodSoundAmbience(SoundEvents.AMBIENT_WARPED_FOREST_MOOD, 6000, 8, 2.0D))
                        .ambientAdditionsSound(new SoundAdditionsAmbience(SoundEvents.AMBIENT_NETHER_WASTES_ADDITIONS, 0.0111D))
                        .backgroundMusic(BackgroundMusicTracks.createGameMusic(SoundEvents.MUSIC_CREATIVE))
                        .build())
                .mobSpawnSettings(mobspawninfo$builder.build()).generationSettings(biomegenerationsettings$builder.build()).build();

    };



    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}*/
