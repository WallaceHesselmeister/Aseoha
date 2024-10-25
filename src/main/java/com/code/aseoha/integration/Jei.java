package com.code.aseoha.integration;

import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.aseoha;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.util.ResourceLocation;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

@JeiPlugin
public class Jei implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(aseoha.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(
                new WorkbenchRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        Collection<WorkBenchRecipe> collection = aseoha.WorkBenchRecipeHandler.RecipeList;
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        registration.addRecipes(collection.stream()
                        .filter(r -> r instanceof WorkBenchRecipe).collect(Collectors.toList()),
                WorkbenchRecipeCategory.UID);
    }
}