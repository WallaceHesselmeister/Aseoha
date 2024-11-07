package com.code.aseoha.DataGen;

import com.code.aseoha.block.AseohaBlocks;
import com.code.aseoha.items.AseohaItemGroups;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapelessRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipeGen extends RecipeProvider {
    public RecipeGen(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(@NotNull Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(AseohaItems.RED_JELLY_BABY.get()).pattern("ES")
                .define('E', Items.SUGAR)
                .define('S', Items.RED_DYE)
                .group(AseohaItemGroups.ASEOHA_FOOD_GROUP.getRecipeFolderName()).unlockedBy("has_crafting_table", has(Items.SUGAR)).save(consumer);

        ShapelessRecipeBuilder.shapeless(AseohaItems.MANUAL.get()).requires(Items.BOOK).requires(Items.GREEN_DYE).unlockedBy("has_crafting_table", has(Items.BOOK)).save(consumer);

        ShapedRecipeBuilder.shaped(AseohaBlocks.WORKBENCH.get()).pattern("fif").pattern("ere").pattern("e e")
                .define('f', Items.SPRUCE_SLAB)
                .define('i', Items.IRON_INGOT)
                .define('r', Items.GOLD_INGOT)
                .define('e', Items.STICK).group(AseohaItemGroups.ASEOHA_GROUP.getRecipeFolderName()).unlockedBy("has_crafting_table", has(Items.GOLD_INGOT));
    }
}
