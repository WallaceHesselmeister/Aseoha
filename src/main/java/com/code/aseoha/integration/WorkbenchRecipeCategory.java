package com.code.aseoha.integration;

import com.code.aseoha.WorkBench.WorkBenchRecipe;
import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import com.mojang.blaze3d.matrix.MatrixStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class WorkbenchRecipeCategory implements IRecipeCategory<WorkBenchRecipe> {
    public final static ResourceLocation UID = new ResourceLocation(aseoha.MODID, "lightning");
    public final static ResourceLocation TEXTURE =
            new ResourceLocation(aseoha.MODID, "textures/gui/lightning_channeler_gui.png");

    private final IDrawable background;
    private final IDrawable icon;
    private final IDrawableStatic lightningBolt;

    public WorkbenchRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(new ItemStack(AseohaBlocks.WORKBENCH.get()));
        this.lightningBolt = helper.createDrawable(TEXTURE, 176, 0, 13, 17);
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends WorkBenchRecipe> getRecipeClass() {
        return WorkBenchRecipe.class;
    }

    @Override
    public String getTitle() {
        return AseohaBlocks.WORKBENCH.get().getName().getString();
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setIngredients(WorkBenchRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.GetIngredientList());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.GetOutput().getDefaultInstance());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, WorkBenchRecipe recipe, IIngredients ingredients) {
        recipeLayout.getItemStacks().init(0, true, 79, 30);
        recipeLayout.getItemStacks().init(1, true, 79, 52);

        recipeLayout.getItemStacks().init(2, false, 102, 42);
        recipeLayout.getItemStacks().set(ingredients);
    }

    @Override
    public void draw(WorkBenchRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
//        if(recipe.getWeather() == LightningChannelerRecipe.Weather.THUNDERING) {
//            this.lightningBolt.draw(matrixStack, 82, 9);
//        }
    }
}