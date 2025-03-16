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
        this.AddRecipe(Items.GREEN_DYE, Items.BOOK, null, null, AseohaItems.MANUAL.get());
    }

    /** Takes the provided ingredients + result and registers it as a recipe. <br />
     * If another recipe with the same ingredients already exists, it will <i><b>NOT</b></i> Register the recipe**/
    public void AddRecipe(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient, Item RecievedItem) {
        // Make sure if an ingredient is null it gets set to air
        FirstIngredient = FirstIngredient == null ? Items.AIR : FirstIngredient;
        SecondIngredient = SecondIngredient == null ? Items.AIR : SecondIngredient;
        ThirdIngredient = ThirdIngredient == null ? Items.AIR : ThirdIngredient;
        FourthIngredient = FourthIngredient == null ? Items.AIR : FourthIngredient;

        WorkBenchRecipe recipe = new WorkBenchRecipe(FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient).AddReceivingItem(RecievedItem);
        // Make sure we don't register the same recipe twice, or register a recipe with the same ingredients but different result as another recipe
        if(!this.ContainsIngredients(recipe))
            this.RecipeList.add(recipe);
    }

    /** Takes the provided recipe and registers it. <br />
     * If another recipe with the same ingredients already exists it will <i><b>NOT</b></i> Register the recipe**/
    public void AddRecipe(WorkBenchRecipe Recipe) {
        if(!this.ContainsIngredients(Recipe))
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
     * Checks if this handler contains the provided recipe <br />
     * It only checks the ingredients, that way if a recipe shares the same ingredients with a different result it won't be registered
     * @param recipe Recipe to check for
     */
    public boolean ContainsIngredients(WorkBenchRecipe recipe) {
        for (WorkBenchRecipe workBenchRecipe : this.RecipeList) {
            if (Arrays.asList(workBenchRecipe.Ingredients).contains(recipe.Ingredients[0]) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(recipe.Ingredients[1]) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(recipe.Ingredients[2]) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(recipe.Ingredients[3])
            ) return true;
        }
        return false;
    }

    /**
     * Checks if this handler contains the provided recipe <br />
     * @param Recipe Recipe to check for
     */
    public boolean Contains(WorkBenchRecipe Recipe) {
        for (WorkBenchRecipe workBenchRecipe : this.RecipeList) {
            if (Arrays.asList(workBenchRecipe.Ingredients).contains(Recipe.Ingredients[0]) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(Recipe.Ingredients[1]) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(Recipe.Ingredients[2]) &&
                    Arrays.asList(workBenchRecipe.Ingredients).contains(Recipe.Ingredients[3]) &&
                    workBenchRecipe.Result.equals(Recipe.Result)
            ) return true;
        }
        return false;
    }

    /**
     * Check if the four ingredients combined form a valid recipe
     *
     * @return whether it is valid, and registered
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