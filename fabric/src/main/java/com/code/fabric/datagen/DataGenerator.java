package com.code.fabric.datagen;

import com.code.aseoha;
import com.code.common.enums.SonicInteractionType;
import com.code.common.misc.GrammarNazi;
import com.code.common.blocks.RoundelBlock;
import com.code.common.registries.AseohaBlocks;
import com.code.common.registries.AseohaItems;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.*;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import static net.minecraft.data.models.BlockModelGenerators.*;

public class DataGenerator implements DataGeneratorEntrypoint {
    EN_USLangProvider LangProvider;

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(RecipeGenerator::new);
        pack.addProvider(ModelGenerator::new);
        pack.addProvider(GenerateItemTags::new);
        this.GenLanguages(pack);
    }

    public void GenLanguages(FabricDataGenerator.Pack pack) {
        this.GenEN_USLang(pack);
    }
    public void GenEN_USLang(FabricDataGenerator.Pack pack) {
        pack.addProvider((output, registriesFuture) -> this.AddENUSTranslations(output, registriesFuture, "en_us"));
    }

    public EN_USLangProvider AddENUSTranslations(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture, String languageType) {
        EN_USLangProvider provider = new EN_USLangProvider(output, languageType);
        this.LangProvider = provider;
        add(SonicInteractionType.BLOCKS.Name().getString(), "Block Interaction Mode");
        add(SonicInteractionType.ENTITY.Name().getString(), "Entity Interaction Mode");
        add(SonicInteractionType.SCANNER.Name().getString(), "Scanner Mode");
        add("tooltip.aseoha.plasma_rifle", "Plasma Rifle");
        add("tooltip.aseoha.plasma_rifle_charge", "Charge");
        add("tooltip.aseoha.plasma_rifle.empty", "Empty");
        provider.addTranslation("desktop.aseoha.trenzaloremissy", "Missy Trenzalore");
        provider.addTranslation("dekstop.aseoha.paradox", "Paradox");
        provider.addTranslation("aseoha.k9.power.add", "Power added Master");
        provider.addTranslation("aseoha.k9.tame", "K-9 Mark III Powering on Master");
        provider.addTranslation(AseohaItems.GINGERBREAD_CYBERMAN.get().getDescriptionId(), "Gingerbread Cyber-Man");
        provider.addTranslation(AseohaItems.GINGERBREAD_MAN.get().getDescriptionId(), "Gingerbread Man");
        provider.addTranslation(AseohaItems.GINGERBREAD_DALEK.get().getDescriptionId(), "Gingerbread Dalek");
        provider.addTranslation(AseohaItems.STEEL_INGOT.get().getDescriptionId(), "Steel Ingot");
        provider.addTranslation(AseohaItems.STEEL_AXE.get().getDescriptionId(), "Steel Axe");
        provider.addTranslation(AseohaItems.STEEL_BOOTS.get().getDescriptionId(), "Steel Boots");
        provider.addTranslation(AseohaItems.STEEL_INGOT.get().getDescriptionId(), "Steel Ingot");
        provider.addTranslation(AseohaItems.STEEL_HOE.get().getDescriptionId(), "Steel Hoe");
        provider.addTranslation(AseohaItems.STEEL_CHESTPLATE.get().getDescriptionId(), "Steel Chestplate");
        provider.addTranslation(AseohaItems.STEEL_HELMET.get().getDescriptionId(), "Steel Helmet");
        provider.addTranslation(AseohaItems.STEEL_BOOTS.get().getDescriptionId(), "Steel Boots");
        provider.addTranslation(AseohaItems.STEEL_LEGGINGS.get().getDescriptionId(), "Steel Leggings");
        provider.addTranslation(AseohaItems.STEEL_PICKAXE.get().getDescriptionId(), "Steel Pickaxe");
        provider.addTranslation(AseohaItems.STEEL_SWORD.get().getDescriptionId(), "Steel Sword");
        provider.addTranslation(AseohaItems.DALEKANIUM_INGOT.get().getDescriptionId(), "Dalekanium Ingot");
        provider.addTranslation(AseohaItems.DALEKANIUM_AXE.get().getDescriptionId(), "Dalekanium Axe");
        provider.addTranslation(AseohaItems.DALEKANIUM_BOOTS.get().getDescriptionId(), "Dalekanium Boots");
        provider.addTranslation(AseohaItems.DALEKANIUM_INGOT.get().getDescriptionId(), "Dalekanium Ingot");
        provider.addTranslation(AseohaItems.DALEKANIUM_HOE.get().getDescriptionId(), "Dalekanium Hoe");
        provider.addTranslation(AseohaItems.DALEKANIUM_CHESTPLATE.get().getDescriptionId(), "Dalekanium Chestplate");
        provider.addTranslation(AseohaItems.DALEKANIUM_HELMET.get().getDescriptionId(), "Dalekanium Helmet");
        provider.addTranslation(AseohaItems.DALEKANIUM_BOOTS.get().getDescriptionId(), "Dalekanium Boots");
        provider.addTranslation(AseohaItems.DALEKANIUM_LEGGINGS.get().getDescriptionId(), "Dalekanium Leggings");
        provider.addTranslation(AseohaItems.DALEKANIUM_PICKAXE.get().getDescriptionId(), "Dalekanium Pickaxe");
        provider.addTranslation(AseohaItems.DALEKANIUM_SWORD.get().getDescriptionId(), "Dalekanium Sword");
        provider.addTranslation(AseohaItems.SONIC_FOURTEENTH.get().getDescriptionId(), "Fourteenth Sonic");
        provider.addTranslation(AseohaItems.RED_JELLY_BABY.get().getDescriptionId(), "Red Jelly Baby");
        provider.addTranslation(AseohaItems.PURPLE_JELLY_BABY.get().getDescriptionId(), "Purple Jelly Baby");
        provider.addTranslation(AseohaItems.BAG_OF_JELLY_BABIES.get().getDescriptionId(), "Bag of Jelly Babies");
        provider.addTranslation(AseohaItems.ORANGE_JELLY_BABY.get().getDescriptionId(), "Orange Jelly Baby");
        provider.addTranslation(AseohaItems.HANDFUL_OF_JELLY_BABIES.get().getDescriptionId(), "Handful of Jelly Babies");
        provider.addTranslation(AseohaItems.YELLOW_JELLY_BABY.get().getDescriptionId(), "Yellow Jelly Baby");
        add(AseohaItems.CANDY_CANE.get().getDescriptionId(), "Candy Cane");
        add(AseohaItems.CANDY_CANE_SONIC.get().getDescriptionId(), "Candy \"Cane\"");
        AseohaItems.ITEMS.forEach(item -> {
            if(!provider.translations.containsKey(item.get().getDescriptionId()))
                provider.addTranslation(item.get().getDescriptionId(), GrammarNazi.CleanItemString(item.toString()));
        });
        return provider;
    }

    private void add(String String1, String String2) {
        this.LangProvider.translations.put(String1, String2);
    }

        private static class RecipeGenerator extends FabricRecipeProvider {
        private RecipeGenerator(FabricDataOutput generator) {
            super(generator);
        }

        @Override
        public void buildRecipes(Consumer<FinishedRecipe> consumer) {
//            ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get()).requires(AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get()).unlockedBy(FabricRecipeProvider.has(AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get())),
//                    FabricRecipeProvider.conditionsFromItem(AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get()).criterion(FabricRecipeProvider.hasItem(AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get())),
//                    FabricRecipeProvider.insideOf(AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get()).matches(exporter);
            ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AseohaItems.BAG_OF_JELLY_BABIES.get())
                    .pattern("ee").pattern("je")
                            .define('e', AseohaItems.HANDFUL_OF_JELLY_BABIES.get())
                                    .define('j', Items.PAPER).unlockedBy("has_crafting_table", has(AseohaItems.JELLY_BABY)).save(consumer);

            ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AseohaItems.PURPLE_JELLY_BABY.get()).pattern("ES").define('E', Items.SUGAR).define('S', Items.PURPLE_DYE)
                    .unlockedBy("has_crafting_table", has(Items.SUGAR));
            ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AseohaItems.YELLOW_JELLY_BABY.get()).pattern("ES").define('E', Items.SUGAR).define('S', Items.YELLOW_DYE)
                    .unlockedBy("has_crafting_table", has(Items.SUGAR));
            ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AseohaItems.ORANGE_JELLY_BABY.get()).pattern("ES").define('E', Items.SUGAR).define('S', Items.ORANGE_DYE)
                    .unlockedBy("has_crafting_table", has(Items.SUGAR));
            ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, AseohaItems.HANDFUL_OF_JELLY_BABIES.get()).pattern("EF").pattern("SR").define('E', AseohaItems.RED_JELLY_BABY.get()).define('S', AseohaItems.YELLOW_JELLY_BABY.get()).define('F', AseohaItems.ORANGE_JELLY_BABY.get()).define('R', AseohaItems.PURPLE_JELLY_BABY.get())
                    .unlockedBy("has_crafting_table", has(AseohaItems.JELLY_BABY));

            ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, AseohaItems.HANDFUL_OF_JELLY_BABIES.get()).requires(AseohaItems.BAG_OF_JELLY_BABIES.get()).unlockedBy("has_crafting_table", has(AseohaItems.BAG_OF_JELLY_BABIES.get())).save(consumer);
            BuildRoundel(consumer, AseohaBlocks.ACACIA_PLANKS_ROUNDEL.get(), Items.ACACIA_PLANKS, Items.ACACIA_LOG);
            BuildRoundel(consumer, AseohaBlocks.BAMBOO_PLANKS_ROUNDEL.get(), Items.BAMBOO_PLANKS, Items.BAMBOO);
            BuildRoundel(consumer, AseohaBlocks.BIRCH_PLANKS_ROUNDEL.get(), Items.BIRCH_PLANKS, Items.BIRCH_LOG);
            BuildRoundel(consumer, AseohaBlocks.BLACK_CONCRETE_ROUNDEL.get(), Items.BLACK_CONCRETE, Items.BLACK_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.BLACK_WOOL_ROUNDEL.get(), Items.BLACK_WOOL, Items.BLACK_DYE);
            BuildRoundel(consumer, AseohaBlocks.BLUE_CONCRETE_ROUNDEL.get(), Items.BLUE_CONCRETE, Items.BLUE_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.BLUE_WOOL_ROUNDEL.get(), Items.BLUE_WOOL, Items.BLUE_DYE);
            BuildRoundel(consumer, AseohaBlocks.BROWN_WOOL_ROUNDEL.get(), Items.BROWN_WOOL, Items.BROWN_DYE);
            BuildRoundel(consumer, AseohaBlocks.BROWN_CONCRETE_ROUNDEL.get(), Items.BROWN_CONCRETE, Items.BROWN_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.CHERRY_PLANKS_ROUNDEL.get(), Items.CHERRY_PLANKS, Items.CHERRY_LOG);
            BuildRoundel(consumer, AseohaBlocks.CLAY_ROUNDEL.get(), Items.CLAY, Items.CLAY_BALL);
            BuildRoundel(consumer, AseohaBlocks.COBBLED_DEEPSLATE_ROUNDEL.get(), Items.COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE);
            BuildRoundel(consumer, AseohaBlocks.COBBLESTONE_ROUNDEL.get(), Items.COBBLESTONE, Items.COBBLESTONE);
            BuildRoundel(consumer, AseohaBlocks.COPPER_BLOCK_ROUNDEL.get(), Items.COPPER_BLOCK, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.CRIMSON_PLANKS_ROUNDEL.get(), Items.CRIMSON_PLANKS, Items.STRIPPED_CRIMSON_STEM);
            BuildRoundel(consumer, AseohaBlocks.CUT_COPPER_ROUNDEL.get(), Items.CUT_COPPER, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.JUNGLE_PLANKS_ROUNDEL.get(), Items.JUNGLE_PLANKS, Items.JUNGLE_LOG);
            BuildRoundel(consumer, AseohaBlocks.LIGHT_BLUE_CONCRETE_ROUNDEL.get(), Items.LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.LIGHT_BLUE_WOOL_ROUNDEL.get(), Items.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE);
            BuildRoundel(consumer, AseohaBlocks.LIGHT_GRAY_CONCRETE_ROUNDEL.get(), Items.LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.LIGHT_GRAY_WOOL_ROUNDEL.get(), Items.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE);
            BuildRoundel(consumer, AseohaBlocks.LIME_CONCRETE_ROUNDEL.get(), Items.LIME_CONCRETE, Items.LIME_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.LIME_WOOL_ROUNDEL.get(), Items.LIME_WOOL, Items.LIME_DYE);
            BuildRoundel(consumer, AseohaBlocks.MAGENTA_CONCRETE_ROUNDEL.get(), Items.MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.MAGENTA_WOOL_ROUNDEL.get(), Items.MAGENTA_WOOL, Items.MAGENTA_DYE);
            BuildRoundel(consumer, AseohaBlocks.MANGROVE_PLANKS_ROUNDEL.get(), Items.MANGROVE_PLANKS, Items.MANGROVE_LOG);
            BuildRoundel(consumer, AseohaBlocks.OAK_PLANKS_ROUNDEL.get(), Items.OAK_PLANKS, Items.OAK_LOG);
            BuildRoundel(consumer, AseohaBlocks.ORANGE_CONCRETE_ROUNDEL.get(), Items.ORANGE_CONCRETE, Items.ORANGE_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.ORANGE_WOOL_ROUNDEL.get(), Items.ORANGE_WOOL, Items.ORANGE_DYE);
            BuildRoundel(consumer, AseohaBlocks.OXIDIZED_COPPER_ROUNDEL.get(), Items.OXIDIZED_COPPER, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.OXIDIZED_CUT_COPPER_ROUNDEL.get(), Items.OXIDIZED_CUT_COPPER, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.PINK_CONCRETE_ROUNDEL.get(), Items.PINK_CONCRETE, Items.PINK_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.PINK_WOOL_ROUNDEL.get(), Items.PINK_WOOL, Items.PINK_DYE);
            BuildRoundel(consumer, AseohaBlocks.POLISHED_ANDESITE_ROUNDEL.get(), Items.POLISHED_ANDESITE, Items.ANDESITE);
            BuildRoundel(consumer, AseohaBlocks.POLISHED_BASALT_ROUNDEL.get(), Items.POLISHED_BASALT, Items.BASALT);
            BuildRoundel(consumer, AseohaBlocks.POLISHED_BLACKSTONE_ROUNDEL.get(), Items.POLISHED_BLACKSTONE, Items.BLACKSTONE);
            BuildRoundel(consumer, AseohaBlocks.POLISHED_DEEPSLATE_ROUNDEL.get(), Items.POLISHED_DEEPSLATE, Items.DEEPSLATE);
            BuildRoundel(consumer, AseohaBlocks.POLISHED_DIORITE_ROUNDEL.get(), Items.POLISHED_DIORITE, Items.DIORITE);
            BuildRoundel(consumer, AseohaBlocks.POLISHED_GRANITE_ROUNDEL.get(), Items.POLISHED_GRANITE, Items.GRANITE);
            BuildRoundel(consumer, AseohaBlocks.PURPLE_CONCRETE_ROUNDEL.get(), Items.PURPLE_CONCRETE, Items.PURPLE_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.PURPLE_WOOL_ROUNDEL.get(), Items.PURPLE_WOOL, Items.PURPLE_DYE);
            BuildRoundel(consumer, AseohaBlocks.QUARTZ_BLOCK_ROUNDEL.get(), Items.QUARTZ_BLOCK, Items.QUARTZ);
            BuildRoundel(consumer, AseohaBlocks.RED_CONCRETE_ROUNDEL.get(), Items.RED_CONCRETE, Items.RED_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.RED_WOOL_ROUNDEL.get(), Items.RED_WOOL, Items.RED_DYE);
            BuildRoundel(consumer, AseohaBlocks.SMOOTH_QUARTZ_BLOCK_ROUNDEL.get(), Items.SMOOTH_QUARTZ, Items.QUARTZ);
            BuildRoundel(consumer, AseohaBlocks.SMOOTH_RED_SANDSTONE_ROUNDEL.get(), Items.SMOOTH_RED_SANDSTONE, Items.RED_SANDSTONE);
            BuildRoundel(consumer, AseohaBlocks.SMOOTH_STONE_ROUNDEL.get(), Items.SMOOTH_STONE, Items.STONE);
            BuildRoundel(consumer, AseohaBlocks.SPRUCE_PLANKS_ROUNDEL.get(), Items.SPRUCE_PLANKS, Items.SPRUCE_LOG);
            BuildRoundel(consumer, AseohaBlocks.STONE_ROUNDEL.get(), Items.STONE, Items.COBBLESTONE);
            BuildRoundel(consumer, AseohaBlocks.WARPED_PLANKS_ROUNDEL.get(), Items.WARPED_PLANKS, Items.WARPED_ROOTS);
            BuildRoundel(consumer, AseohaBlocks.WEATHERED_COPPER_ROUNDEL.get(), Items.WEATHERED_COPPER, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.WEATHERED_CUT_COPPER_ROUNDEL.get(), Items.WEATHERED_CUT_COPPER, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.WHITE_CONCRETE_ROUNDEL.get(), Items.WHITE_CONCRETE, Items.WHITE_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.WHITE_WOOL_ROUNDEL.get(), Items.WHITE_WOOL, Items.WHITE_DYE);
            BuildRoundel(consumer, AseohaBlocks.YELLOW_CONCRETE_ROUNDEL.get(), Items.YELLOW_CONCRETE, Items.YELLOW_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.YELLOW_WOOL_ROUNDEL.get(), Items.YELLOW_WOOL, Items.YELLOW_DYE);
//            BuildOffsetRoundel(consumer, AseohaBlocks.ACACIA_ROUNDEL_OFFSET.get(), Items.ACACIA_PLANKS, Items.ACACIA_LOG);
            BuildRoundel(consumer, AseohaBlocks.CYAN_CONCRETE_ROUNDEL.get(), Items.CYAN_CONCRETE, Items.CYAN_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.CYAN_WOOL_ROUNDEL.get(), Items.CYAN_WOOL, Items.CYAN_DYE);
            BuildRoundel(consumer, AseohaBlocks.DARK_OAK_PLANKS_ROUNDEL.get(), Items.DARK_OAK_PLANKS, Items.DARK_OAK_LOG);
            BuildRoundel(consumer, AseohaBlocks.DEEPSLATE_ROUNDEL.get(), Items.DEEPSLATE, Items.DEEPSLATE);
            BuildRoundel(consumer, AseohaBlocks.EXPOSED_COPPER_ROUNDEL.get(), Items.EXPOSED_COPPER, Items.COPPER_INGOT);
            BuildRoundel(consumer, AseohaBlocks.EXPOSED_CUT_COPPER_ROUNDEL.get(), Items.EXPOSED_CUT_COPPER, Items.COPPER_INGOT);
            BuildHexRoundel(consumer, AseohaBlocks.GRAY_CONCRETE_HEX_ROUNDEL.get(), Items.GRAY_CONCRETE, Items.GRAY_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.GRAY_CONCRETE_ROUNDEL.get(), Items.GRAY_CONCRETE, Items.GRAY_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.GRAY_WOOL_ROUNDEL.get(), Items.GRAY_WOOL, Items.GRAY_DYE);
            BuildRoundel(consumer, AseohaBlocks.GREEN_CONCRETE_ROUNDEL.get(), Items.GREEN_CONCRETE, Items.GREEN_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.GREEN_WOOL_ROUNDEL.get(), Items.GREEN_WOOL, Items.GREEN_DYE);
            BuildHexRoundel(consumer, AseohaBlocks.BLACK_CONCRETE_HEX_ROUNDEL.get(), Items.BLACK_CONCRETE, Items.BLACK_CONCRETE_POWDER);
            BuildRoundel(consumer, AseohaBlocks.BLUE_CONCRETE_HEX_ROUNDEL.get(), Items.BLUE_CONCRETE, Items.BLUE_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.BROWN_CONCRETE_HEX_ROUNDEL.get(), Items.BROWN_CONCRETE, Items.BROWN_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.CYAN_CONCRETE_HEX_ROUNDEL.get(), Items.CYAN_CONCRETE, Items.CYAN_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.GREEN_CONCRETE_HEX_ROUNDEL.get(), Items.GREEN_CONCRETE, Items.GREEN_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.LIGHT_BLUE_CONCRETE_HEX_ROUNDEL.get(), Items.LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.LIGHT_GRAY_CONCRETE_HEX_ROUNDEL.get(), Items.LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.LIME_CONCRETE_HEX_ROUNDEL.get(), Items.LIME_CONCRETE, Items.LIME_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.MAGENTA_CONCRETE_HEX_ROUNDEL.get(), Items.MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.ORANGE_CONCRETE_HEX_ROUNDEL.get(), Items.ORANGE_CONCRETE, Items.ORANGE_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.PINK_CONCRETE_HEX_ROUNDEL.get(), Items.PINK_CONCRETE, Items.PINK_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.PURPLE_CONCRETE_HEX_ROUNDEL.get(), Items.PURPLE_CONCRETE, Items.PURPLE_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.RED_CONCRETE_HEX_ROUNDEL.get(), Items.RED_CONCRETE, Items.RED_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.WHITE_CONCRETE_HEX_ROUNDEL.get(), Items.WHITE_CONCRETE, Items.WHITE_CONCRETE_POWDER);
            BuildHexRoundel(consumer, AseohaBlocks.YELLOW_CONCRETE_HEX_ROUNDEL.get(), Items.YELLOW_CONCRETE, Items.YELLOW_CONCRETE_POWDER);

            AseohaBlocks.BLUE_ROUNDELS.forEach(roundel -> BuildBlueRoundel(consumer, roundel.get(), RoundelBlock.GetNormalRoundelForVariant((RoundelBlock) roundel.get())));
        }
            private void BuildBlueRoundel(Consumer<FinishedRecipe> consumer, Block Result, Block One) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, Result).requires(One.asItem()).requires(Items.BLUE_DYE).unlockedBy("has_crafting_table", has(One.asItem())).save(consumer);
            }
            private void BuildRoundel(Consumer<FinishedRecipe> consumer, Block Result, Item Corners, Item Sides){
                ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Result, 8)
                        .showNotification(true)
                        .pattern("eoe")
                        .pattern("opo")
                        .pattern("eoe")
                        .define('e', Corners)
                        .define('o', Sides)
                        .define('p', AseohaItems.ROUNDEL_MOLD.get())
                        .unlockedBy("has_crafting_table", has(AseohaItems.ROUNDEL_MOLD.get())).save(consumer);
            }
        private void BuildHexRoundel(Consumer<FinishedRecipe> consumer, Block Result, Item Corners, Item Sides){
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Result, 8)
                    .showNotification(true)
                    .pattern("eoe")
                    .pattern("opo")
                    .pattern("eoe")
                    .define('e', Corners)
                    .define('o', Sides)
                    .define('p', AseohaItems.HEXAGONAL_ROUNDEL_MOLD.get())
                    .unlockedBy("has_crafting_table", has(AseohaItems.HEXAGONAL_ROUNDEL_MOLD.get())).save(consumer);
        }
        private void BuildOffsetRoundel(Consumer<FinishedRecipe> consumer, Block Result, Item Corners, Item Sides){
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Result, 8)
                    .showNotification(true)
                    .pattern("epe")
                    .pattern("eoe")
                    .define('e', Corners)
                    .define('o', Sides)
                    .define('p', AseohaItems.ROUNDEL_MOLD.get())
                    .unlockedBy("has_crafting_table", has(AseohaItems.ROUNDEL_MOLD.get())).save(consumer);
        }
    }


    private static class ModelGenerator extends FabricModelProvider {
        private ModelGenerator(FabricDataOutput generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
            AseohaBlocks.BLOCKS.forEach(block -> {
                this.AllModel(block.get(), blockStateModelGenerator);
            });
            AseohaBlocks.ALTERNATING_ROUNDELS.forEach(block -> {
                this.AlternatingModel(block.get(), blockStateModelGenerator);
            });
            AseohaBlocks.ROUNDELS_LIT.forEach(block -> {
                this.LitModel(block.get(), blockStateModelGenerator);
            });
            AseohaBlocks.BLUE_ROUNDELS.forEach(block -> {
                this.GeneratedRoundelModel(block.get(), blockStateModelGenerator);
            });
        }

        public static MultiVariantGenerator createRotatedVariant(Block block, ResourceLocation resourceLocation, ResourceLocation resourceLocation2) {
            return multiVariant(block, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R0), Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90));
        }

        public static MultiVariantGenerator multiVariant(Block block, Variant... variants) {
            return MultiVariantGenerator.multiVariant(block, variants);
        }


        ModelTemplate CUBE = create(TextureSlot.ALL);

        ModelTemplate CUBE_GENNED = createGenned(TextureSlot.ALL);

        public void AllModel(Block block, @NotNull BlockModelGenerators blockModelGenerators) {
            TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(block)).put(TextureSlot.DOWN, TextureMapping.getBlockTexture(block)).put(TextureSlot.UP, TextureMapping.getBlockTexture(block)).put(TextureSlot.NORTH, TextureMapping.getBlockTexture(block)).put(TextureSlot.SOUTH, TextureMapping.getBlockTexture(block)).put(TextureSlot.EAST, TextureMapping.getBlockTexture(block)).put(TextureSlot.WEST, TextureMapping.getBlockTexture(block));
            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(block, ModelTemplates.CUBE.create(block, textureMapping, blockModelGenerators.modelOutput)));
        }

        public void LitModel(Block block, @NotNull BlockModelGenerators blockModelGenerators) {
            Block Roundel = RoundelBlock.GetNormalRoundelUnsafe(block);
            TextureMapping texMap = (new TextureMapping()).put(TextureSlot.PARTICLE, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.DOWN, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.UP, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.NORTH, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.SOUTH, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.EAST, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.WEST, TextureMapping.getBlockTexture(Roundel)).put(TextureSlot.ALL, TextureMapping.getBlockTexture(Roundel));
            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(block, ModelTemplates.CUBE.create(new ResourceLocation("aseoha", "block/" + GrammarNazi.IDFromBlock(block)), texMap, blockModelGenerators.modelOutput)));
        }

        public void AlternatingModel(Block block, @NotNull BlockModelGenerators blockModelGenerators) {
            RoundelBlock PlaceHolder = ((RoundelBlock) block);
            RoundelBlock Roundel = RoundelBlock.GetNormalRoundelForVariant(PlaceHolder);
            TextureMapping textureMappingAlt = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(Roundel));
            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(block, TextureMapping.getBlockTexture(PlaceHolder)));
            CUBE.create(new ResourceLocation("aseoha", "block/" + GrammarNazi.IDFromBlock(block)), textureMappingAlt, blockModelGenerators.modelOutput);
        }

        public void AlternatingItemModel(Item item, @NotNull ItemModelGenerators blockModelGenerators) {
            Block block = RoundelBlock.GetNormalRoundelUnsafe(Block.byItem(item));
            TextureMapping textureMappingAlt = new TextureMapping().put(TextureSlot.ALL, TextureMapping.getBlockTexture(block));
            CUBE.create(new ResourceLocation("aseoha", "item/" + GrammarNazi.IDFromItem(item)), textureMappingAlt, blockModelGenerators.output);
        }

        public void GeneratedRoundelModel(Block block, @NotNull BlockModelGenerators blockModelGenerators) {
            RoundelBlock Roundel = ((RoundelBlock) block);
            TextureMapping textureMappingAlt = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(RoundelBlock.GetNormalRoundelForVariant(Roundel).GetAverage()));
            blockModelGenerators.blockStateOutput.accept(createSimpleBlock(block, TextureMapping.getBlockTexture(block)));
            CUBE_GENNED.create(new ResourceLocation("aseoha", "block/" + GrammarNazi.IDFromBlock(block)), textureMappingAlt, blockModelGenerators.modelOutput);
        }

        public void CreateGennedItemModel(Item item, @NotNull ItemModelGenerators blockModelGenerators) {
            Block block = Block.byItem(item);
            TextureMapping textureMappingAlt = new TextureMapping().put(TextureSlot.ALL, TextureMapping.getBlockTexture(RoundelBlock.GetNormalRoundelForVariant((RoundelBlock) (Block.byItem(item))).GetAverage()));
            CUBE_GENNED.create(new ResourceLocation("aseoha", "item/" + GrammarNazi.IDFromItem(item)), textureMappingAlt, blockModelGenerators.output);
        }

        public void AllItemModel(Item item, @NotNull ItemModelGenerators blockModelGenerators) {
            Block block = Block.byItem(item);
            TextureMapping textureMappingAlt = new TextureMapping().put(TextureSlot.ALL, BuiltInRegistries.BLOCK.getKey(((RoundelBlock) block).GetAverage()));
            CUBE.create(new ResourceLocation("aseoha", "item/" + GrammarNazi.IDFromItem(item)), textureMappingAlt, blockModelGenerators.output);
        }

        public void LitItemModel(Item item, @NotNull ItemModelGenerators blockModelGenerators) {
//            Block block = Block.byItem(item);
//            TextureMapping textureMappingAlt = new TextureMapping().put(TextureSlot.ALL, BuiltInRegistries.BLOCK.getKey(RoundelBlock.GetNormalRoundelUnsafe(block)));
//            CUBE.create(new ResourceLocation("aseoha", "item/" + GrammarNazi.IDFromItem(item)), textureMappingAlt, blockModelGenerators.output);


//            TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(block));
//
//            ModelTemplates.CUBE_ALL.create(ModelLocationUtils.getModelLocation(item), textureMapping, blockModelGenerators.output);

        }

        @Contract("_ -> new")
        private static @NotNull ModelTemplate create(TextureSlot... textureSlots) {
            return new ModelTemplate(Optional.of(new ResourceLocation("aseoha", "block/alternating_nesw")), Optional.empty(), textureSlots);
        }

        @Contract("_ -> new")
        private static @NotNull ModelTemplate createGenned(TextureSlot... textureSlots) {
            return new ModelTemplate(Optional.of(new ResourceLocation("aseoha", "block/roundel_template")), Optional.empty(), textureSlots);
        }

        @Contract("_ -> new")
        private static @NotNull ModelTemplate createCubeItem(TextureSlot... textureSlots) {
            return new ModelTemplate(Optional.of(new ResourceLocation("minecraft", "block/cube_all")), Optional.empty(), textureSlots);
        }

        @Override
        public void generateItemModels(ItemModelGenerators itemModelGenerator) {
            AseohaItems.ITEMS.forEach(item -> {
                aseoha.LOGGER.info(item.toString());
                Block block = Block.byItem(item.get());
                aseoha.LOGGER.info(block.toString());
                if (GrammarNazi.IDFromBlock(block).contains("alternating") && block.toString().contains("roundel")) {
                    AlternatingItemModel(item.get(), itemModelGenerator);
                } else {
                    if (GrammarNazi.IDFromBlock(block).contains("roundel_lit")) {

//                        LitItemModel(item.get(), itemModelGenerator);

                        TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(RoundelBlock.GetNormalRoundelUnsafe(block)));

                        ModelTemplates.CUBE_ALL.create(ModelLocationUtils.getModelLocation(item.get()), textureMapping, itemModelGenerator.output);


                    } else if (GrammarNazi.IDFromBlock(block).contains("blue_roundel")) {

                        CreateGennedItemModel(item.get(), itemModelGenerator);

                    } else if (block != Blocks.AIR) {

                        TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.ALL, TextureMapping.getBlockTexture(block));

                        ModelTemplates.CUBE_ALL.create(ModelLocationUtils.getModelLocation(item.get()), textureMapping, itemModelGenerator.output);
                    }
                    //                        itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.CUBE);
                    else
                        itemModelGenerator.generateFlatItem(item.get(), ModelTemplates.FLAT_ITEM);
                }
            });
        }
    }


    public static class GenerateItemTags extends FabricTagProvider<Item> {
        public GenerateItemTags(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, Registries.ITEM, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                    .add(AseohaItems.LATINUM_BOOTS.get(), AseohaItems.LATINUM_CHESTPLATE.get(), AseohaItems.LATINUM_LEGGINGS.get(), AseohaItems.LATINUM_HELMET.get());

            getOrCreateTagBuilder(AseohaItems.JELLY_BABY)
                    .add(AseohaItems.RED_JELLY_BABY.get())
                    .add(AseohaItems.PURPLE_JELLY_BABY.get())
                    .add(AseohaItems.ORANGE_JELLY_BABY.get())
                    .add(AseohaItems.YELLOW_JELLY_BABY.get());
        }
    }
}