package com.code.aseoha.common.dimension.features;


import java.util.Random;

import com.code.aseoha.common.threads.CraterGeneratorThread;
import com.mojang.serialization.Codec;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.ProbabilityConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.util.FeatureContext;

import static com.code.aseoha.aseoha.MOD_ID;

public class Crater extends Feature<ProbabilityConfig> {
    public Crater(Codec<ProbabilityConfig> codec) {
        super(codec);
    }

    public static final RegistryKey<PlacedFeature> CRATER_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MOD_ID, "crater"));

    @Override
    public boolean generate(FeatureContext<ProbabilityConfig> context) {
        if (new Random(System.currentTimeMillis()).nextInt((int) Math.abs((int) ((context.getConfig().probability * 15) - 15))) == 1) {
            new CraterGeneratorThread(context).run();
            return true;
        }
        return false;
    }

}