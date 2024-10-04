package com.code.aseoha;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.Tag;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import static net.minecraft.tags.ItemTags.bind;

public class Constants {
    public final static RegistryKey<World> NEWEARTH = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aseoha", "newearth"));
    public final static RegistryKey<World> GALLIFREY = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aseoha", "gallifrey"));
    public final static RegistryKey<World> MIDNIGHT = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("aseoha", "midnight"));
    public final static ITextComponent AffirmativeK9 = new StringTextComponent("[K9] Affirmative, Master!");
    public final static ITextComponent DoesNotComputeK9 = new StringTextComponent("[K9] Error, Statement Does Not Compute, Aborting!");
    public final static ITextComponent InsufficientDataK9 = new StringTextComponent("[K9] Insufficient Data!");
    public static final TranslationTextComponent TOOLTIP_REENABLED = new TranslationTextComponent("tooltip.item.info.reenabled");
//    public static final ITag.INamedTag<Item> BOOKSHELF_BOOKS = bind("bookshelf_books");
//    public final static String waysOfSayingK9 =
}
