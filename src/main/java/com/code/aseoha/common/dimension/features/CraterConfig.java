//package com.code.aseoha.common.dimension.features;
//
//import com.mojang.serialization.Codec;
//import com.mojang.serialization.codecs.RecordCodecBuilder;
//import net.minecraft.util.Identifier;
//import net.minecraft.util.dynamic.Codecs;
//import net.minecraft.world.gen.feature.FeatureConfig;
//
//public class CraterConfig(int number, Identifier blockId) implements FeatureConfig {
//        public static final Codec<CraterConfig> CODEC = RecordCodecBuilder.create(
//                instance -> instance.group(
//                                // you can add as many of these as you want, one for each parameter
//                                Codecs.POSITIVE_INT.fieldOf("number").forGetter(Crater::number))
//                        .apply(instance, CraterConfig::new));
//    }
//}
