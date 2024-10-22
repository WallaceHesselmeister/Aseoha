package com.code.aseoha.WorkBench;

import com.code.aseoha.aseoha;
import net.minecraft.item.Items;

public class WorkBenchRecipeReg {
    public void Register(){
        aseoha.WorkBenchRecipeHandler.AddRecipe(Items.RED_DYE, Items.BOOK, null, null, null);
    }
}
