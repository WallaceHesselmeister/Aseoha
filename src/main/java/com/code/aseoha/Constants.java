package com.code.aseoha;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class Constants {
    public final static RegistryKey<World> NEWEARTH = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aseoha", "newearth"));
    public final static RegistryKey<World> GALLIFREY = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aseoha", "gallifrey"));
    public final static RegistryKey<Biome> REDLANDS_BIOME = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("aseoha", "redlands"));
    public final static RegistryKey<Biome> REDLANDS_CLIFFS_BIOME = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("aseoha", "redlands_cliffs"));
    public final static RegistryKey<Biome> GALLIFREY_BIOME = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("aseoha", "gallifrey_biome"));
    public final static RegistryKey<Biome> GALLIFREY_DESERT_BIOME = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("aseoha", "gallifrey_desert"));

    public final static TranslationTextComponent WORKBENCH_CATEGORY = new TranslationTextComponent("aseoha.jei.category.workbench");
    public final static RegistryKey<Biome> REDLANDS_TAIGA_BIOME = RegistryKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("aseoha", "redlands_taiga"));
    public final static RegistryKey<World> MIDNIGHT = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aseoha", "midnight"));
    public final static ITextComponent AffirmativeK9 = new StringTextComponent("[K9] Affirmative, Master!");
    public final static ITextComponent DoesNotComputeK9 = new StringTextComponent("[K9] Error, Statement Does Not Compute, Aborting!");
    public final static ITextComponent InsufficientDataK9 = new StringTextComponent("[K9] Insufficient Data!");
    public static final TranslationTextComponent TOOLTIP_REENABLED = new TranslationTextComponent("tooltip.item.info.reenabled");
//    public static final ITag.INamedTag<Item> BOOKSHELF_BOOKS = bind("bookshelf_books");
    public final static String waysOfSayingK9[] = {"k9", "k-9", "k 9"};
}
