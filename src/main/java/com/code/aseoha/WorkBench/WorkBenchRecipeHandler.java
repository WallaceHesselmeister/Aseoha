package com.code.aseoha.WorkBench;

import com.code.aseoha.items.AseohaItems;
import lombok.Getter;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkBenchRecipeHandler {
    @Getter
    private ArrayList<WorkBenchRecipe> RecipeList = new ArrayList<>();

    public void Init() {
        this.AddRecipe(Items.GREEN_DYE, Items.BOOK, Items.AIR, Items.AIR, AseohaItems.MANUAL.get());
    }

    public void AddRecipe(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient, Item RecievedItem) {
        this.RecipeList.add(new WorkBenchRecipe(FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient).AddReceivingItem(RecievedItem));
    }

    public void AddRecipe(WorkBenchRecipe Recipe) {
        this.RecipeList.add(Recipe);
    }

    /**
     * Check if the four ingredients combined form a valid recipe
     *
     * @return whether it is valid
     */
    public boolean IsValidRecipe(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient) {
        for (WorkBenchRecipe workBenchRecipe : this.RecipeList) {
            if (Arrays.asList(workBenchRecipe.Ingredients).contains(FirstIngredient) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(SecondIngredient) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(ThirdIngredient) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(FourthIngredient)
            )
                return true;
        }
        return false;
    }


    /**
     * Check if the four ingredients combined form a valid recipe
     *
     * @return wether it is valid
     */
    public boolean IsValidRecipe(ArrayList<Item> Ingredients) {
        while (Ingredients.size() < 4) {
            Ingredients.add(Items.AIR);
        }
        for (WorkBenchRecipe workBenchRecipe : this.RecipeList) {
            if (Arrays.asList(workBenchRecipe.Ingredients).contains(Ingredients.get(0)) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(Ingredients.get(1)) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(Ingredients.get(2)) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(Ingredients.get(3))
            )
                return true;
        }
        return false;


//        return this.RecipeList.contains(new WorkBenchRecipe(Ingredients.get(0), Ingredients.get(1), Ingredients.get(2), Ingredients.get(3)));
    }

    /**
     * Takes 4 items and if the recipe is valid returns the result of the recipe
     *
     * @return The result of the recipe or dirt if it doesn't exist
     */
    public Item GetRecipeResult(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient) {
        if (this.IsValidRecipe(FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient)) {
            for (WorkBenchRecipe workBenchRecipe : this.RecipeList) {
                if (Arrays.equals(workBenchRecipe.Ingredients, new Item[]{FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient})) {
                    return workBenchRecipe.Result;
                }
            }
        }
        return Items.DIRT;
    }

    /**
     * Takes 4 items and if the recipe is valid returns the result of the recipe
     * @return The result of the recipe or dirt if it doesn't exist
     */
    public Item GetRecipeResult(ArrayList<Item> Ingredient) {
        Item FirstIngredient = Ingredient.get(0), SecondIngredient = Ingredient.get(1), ThirdIngredient = Ingredient.get(2), FourthIngredient = Ingredient.get(3);
        if (this.IsValidRecipe(FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient)) {
            for (WorkBenchRecipe workBenchRecipe : this.RecipeList) {
                if (Arrays.equals(workBenchRecipe.Ingredients, new Item[]{FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient})) {
                    return workBenchRecipe.Result;
                }
            }
        }
        return Items.DIRT;
    }

    /**
     * Check if this handler has all the recipes as provided handler and add any missing recipes, <br />
     * This is so external mods can add more recipes using their own custom handler
     * @param Handler Handler with recipes to add to this handler
     */
    public void Sync(WorkBenchRecipeHandler Handler) {
        for (int i = 0; i < Handler.RecipeList.size(); i++) {
            if (!this.RecipeList.contains(Handler.RecipeList.get(i)))
                this.RecipeList.add(Handler.RecipeList.get(i));
        }
    }
}