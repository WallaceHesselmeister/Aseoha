package com.code.aseoha.items;

import com.code.aseoha.block.AseohaBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class AseohaItemGroups {
    public static final ItemGroup ASEOHA_GROUP = new ItemGroup("aseoha") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AseohaBlocks.HELLBENT_ROUNDEL1.get());
        }
    };

    public static final ItemGroup ASEOHA_MODULAR_GROUP = new ItemGroup("aseoha_modular") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AseohaBlocks.FLIGHT_BUTTON.get());
        }
    };

    public static final ItemGroup ASEOHA_FOOD_GROUP = new ItemGroup("aseoha_food") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AseohaItems.GOLDEN_POTATO.get());
        }
    };
}