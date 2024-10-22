package com.code.aseoha.WorkBench;

import net.minecraft.item.Item;

public class WorkBenchRecipe {
    Item Ingredients[] = new Item[5];

    /**
     * Specifies 4 ingredients, if you want only say, 2 Ingredients, leave the rest null
     * @param FirstIngredient 1st Ingredient
     * @param SecondIngredient 2nd Ingredient
     * @param ThirdIngredient 3rd Ingredient
     * @param FourthIngredient 4th Ingredient
     * @param ReceivedItem The Item Received
     */
    public WorkBenchRecipe(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient, Item ReceivedItem) {
        this.Ingredients[0] = FirstIngredient;
        this.Ingredients[1] = SecondIngredient;
        this.Ingredients[2] = ThirdIngredient;
        this.Ingredients[3] = FourthIngredient;
        this.Ingredients[4] = ReceivedItem;
    }
}