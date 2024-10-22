package com.code.aseoha.world.biome;/*package com.code.aseoha.world.biome;

import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import com.code.aseoha.aseoha;
import org.spongepowered.asm.mixin.transformer.Config;

public class ModConfiguredSurfaceBuilders {


    public static ConfiguredSurfaceBuilder<?> NEWEARTH_SURFACE = register("newearth",
            SurfaceBuilder.FROZEN_OCEAN.configured(new SurfaceBuilderConfig(
                    Blocks.WATER.defaultBlockState(),
                    Blocks.WATER.defaultBlockState(),
                    Blocks.STONE.defaultBlockState()
            )));

    /*public static ConfiguredSurfaceBuilder<?> NEWEARTH_SURFACE = register("newearth",
            SurfaceBuilder.DEFAULT.configured(new SurfaceBuilderConfig(
                    Blocks.WATER.defaultBlockState(),
                    Blocks.GRAVEL.defaultBlockState(),
                    Blocks.BEDROCK.defaultBlockState()
            )));*/

 /*   private static <SC extends ISurfaceBuilderConfig>ConfiguredSurfaceBuilder<SC> register(String name,
                                                                                           ConfiguredSurfaceBuilder<SC> csb){
        return WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER,
                new ResourceLocation(aseoha.MODID, name), csb);
    }
}*/