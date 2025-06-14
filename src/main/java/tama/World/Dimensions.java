/* (C) TAMA Studios 2025 */
package tama.World;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import tama.aseoha;

public class Dimensions {
    public static final ResourceKey<DimensionType> RAXICORICOFALLAPITORIUS_TYPE = ResourceKey.create(
            Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "raxicoricofallapatorious"));
    public static final ResourceKey<DimensionType> TRENZALORE_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "trenzalore"));
    public static final ResourceKey<DimensionType> GALLIFREY_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "gallifrey"));
    public static final ResourceKey<DimensionType> MONDAS_TYPE =
            ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "mondas_type"));

    public static final ResourceKey<Level> TRENZALORE =
            ResourceKey.create(Registries.DIMENSION, new ResourceLocation(aseoha.MODID, "trenzalore"));
}
