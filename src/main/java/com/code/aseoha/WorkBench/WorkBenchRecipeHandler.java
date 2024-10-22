package com.code.aseoha.WorkBench;

import net.minecraft.client.gui.recipebook.RecipeList;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;

import java.util.ArrayList;

public class WorkBenchRecipeHandler {
    public ArrayList<WorkBenchRecipe> RecipeList;

    public void Init(){
        this.RecipeList.add(new WorkBenchRecipe(Items.BOOK, Items.RED_DYE, (Item) null, (Item) null, (Item) null));
    }
    public void AddRecipe(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient, Item RecievedItem){
        this.RecipeList.add(new WorkBenchRecipe(FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient, RecievedItem));
    }

    public boolean IsValidRecipe(Item FirstIngredient, Item SecondIngredient, Item ThirdIngredient, Item FourthIngredient, Item RecievedItem){
        return this.RecipeList.contains(new WorkBenchRecipe(FirstIngredient, SecondIngredient, ThirdIngredient, FourthIngredient, RecievedItem));
    }

    /**
     * Check if this handler has all the recipes as provided handler and add any missing recipes
     * This is mainly so external mods can add more recipes
     * @param Handler Handler with recipes to add to this
     */
    public void Sync(WorkBenchRecipeHandler Handler){
        for(int i = 0; i < Handler.RecipeList.size(); i++){
            if(!this.RecipeList.contains(Handler.RecipeList.get(i)))
                this.RecipeList.add(Handler.RecipeList.get(i));
        }
    }
}