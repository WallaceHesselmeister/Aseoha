package com.code.aseoha.DataGen;

import com.code.aseoha.items.AseohaItemGroups;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class RecipeGen extends RecipeProvider {
    public RecipeGen(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildShapelessRecipes(@NotNull Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(AseohaItems.RED_JELLY_BABY.get()).pattern("ES").define('E', Items.SUGAR).define('S', Items.RED_DYE).group(AseohaItemGroups.ASEOHA_FOOD_GROUP.getRecipeFolderName()).unlockedBy("has_crafting_table", has(Items.SUGAR)).save(consumer);

    }
}
