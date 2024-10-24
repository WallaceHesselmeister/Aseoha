package com.code.aseoha.WorkBench;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.item.Items;

public class WorkBenchRecipeReg {
    public void Register(){
        aseoha.WorkBenchRecipeHandler.AddRecipe(Items.RED_DYE, Items.BOOK, null, null, AseohaItems.MANUAL.get());
    }
}
