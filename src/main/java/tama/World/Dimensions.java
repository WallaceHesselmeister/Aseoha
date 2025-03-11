package tama.World;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import tama.aseoha;

public class Dimensions {
    public final static ResourceKey<DimensionType> RAXICORICOFALLAPITORIUS_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "raxicoricofallapatorious"));
    public final static ResourceKey<DimensionType> TRENZALORE_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "trenzalore"));
    public final static ResourceKey<DimensionType> GALLIFREY_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "gallifrey"));
    public final static ResourceKey<DimensionType> MONDAS_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, new ResourceLocation(aseoha.MODID, "mondas_type"));

    public final static ResourceKey<Level> TRENZALORE = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(aseoha.MODID, "trenzalore"));
}
