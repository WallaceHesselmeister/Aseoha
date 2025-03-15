package com.code.aseoha.integration.jei;

import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.WorkBench.WorkBenchRecipeHandler;
import com.code.aseoha.aseoha;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkBenchRecipeWrapper {
    private final List<Ingredient> inputs;
    private final ItemStack output;

    public WorkBenchRecipeWrapper(List<Ingredient> inputs, ItemStack output) {
        this.inputs = inputs;
        this.output = output;
    }

    public List<Ingredient> getInputs() {
        return inputs;
    }

    public ItemStack getOutput() {
        return output;
    }

    public static List<WorkBenchRecipeWrapper> getAllRecipes() {
        List<WorkBenchRecipeWrapper> recipes = new ArrayList<>();
        WorkBenchRecipeHandler handler = aseoha.WorkBenchRecipeHandler;
        for(WorkBenchRecipe recipe : handler.RecipeList) {
            recipes.add(new WorkBenchRecipeWrapper(
                    Arrays.asList(
                            Ingredient.of(recipe.Get().GetList().get(0)),
                            Ingredient.of(recipe.Get().GetList().get(1)),
                            Ingredient.of(recipe.Get().GetList().get(2)),
                            Ingredient.of(recipe.Get().GetList().get(3))
                    ),
                    new ItemStack(recipe.GetOutput())
            ));
        }
        return recipes;
    }
}