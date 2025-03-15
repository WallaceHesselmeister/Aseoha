package com.code.aseoha.integration.jei;

import com.code.aseoha.Constants;
import com.code.aseoha.aseoha;
import com.code.aseoha.block.AseohaBlocks;
import com.mojang.blaze3d.matrix.MatrixStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import org.jetbrains.annotations.NotNull;

public class WorkbenchRecipeCategory implements IRecipeCategory<WorkBenchRecipeWrapper> {
    public static final ResourceLocation UID = new ResourceLocation(aseoha.MODID, "workbench_category");
    private final IDrawable background;
    private final IDrawable icon;
    private final String title;

    public WorkbenchRecipeCategory(IGuiHelper guiHelper) {
        ResourceLocation texture = new ResourceLocation(aseoha.MODID, "textures/gui/workbench.png");
        this.background = guiHelper.createDrawable(texture, 0, 0, 255, 255);

        this.icon = guiHelper.createDrawableIngredient(new ItemStack(AseohaBlocks.WORKBENCH.get()));
        this.title = Constants.WORKBENCH_CATEGORY.getString();
    }

    @NotNull
    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @NotNull
    @Override
    public Class<? extends WorkBenchRecipeWrapper> getRecipeClass() {
        return WorkBenchRecipeWrapper.class;
    }

    @NotNull
    @Override
    @SuppressWarnings("deprecation")
    public String getTitle() {
        return title;
    }

    @NotNull
    @Override
    public IDrawable getBackground() {
        return background;
    }

    @NotNull
    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setIngredients(WorkBenchRecipeWrapper recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getInputs());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getOutput());
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, WorkBenchRecipeWrapper recipe, IIngredients ingredients) {
        IGuiItemStackGroup stacks = recipeLayout.getItemStacks();

        // Define slot positions based on your custom texture
        stacks.init(0, true, 30, 34);
        stacks.init(1, true, 48, 34);
        stacks.init(2, true, 66, 34);
        stacks.init(3, false, 116, 34); // Output slot

        // Set the items into the slots
        stacks.set(0, ingredients.getInputs(VanillaTypes.ITEM).get(0));
        stacks.set(1, ingredients.getInputs(VanillaTypes.ITEM).get(1));
        stacks.set(2, ingredients.getInputs(VanillaTypes.ITEM).get(2));
        stacks.set(3, ingredients.getOutputs(VanillaTypes.ITEM).get(0));
    }

    @Override
    public void draw(WorkBenchRecipeWrapper recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        FontRenderer fr = Minecraft.getInstance().font;
        String text = recipe.toString();
        float scale = 40.0F / (float)fr.width(text);
        matrixStack.pushPose();
        matrixStack.translate(125.0, 10.0, 0.0);
        if (scale < 1.0F) {
            matrixStack.scale(scale, scale, scale);
        }

        fr.draw(matrixStack, new StringTextComponent(text), 0.0F, 0.0F, 4516674);
        matrixStack.popPose();
    }
}