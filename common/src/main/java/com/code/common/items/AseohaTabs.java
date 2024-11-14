package com.code.common.items;

import com.code.aseoha;
import com.code.common.registries.AseohaBlocks;
import com.code.common.registries.AseohaItems;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;

public class AseohaTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(aseoha.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> MAIN_TAB = TABS.register(
            "aseoha_main_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("aseoha.creative_tab.main"),
                    () -> AseohaItems.GOLDEN_POTATO.get().getDefaultInstance()
            )
    );

    public static final RegistrySupplier<CreativeModeTab> FOOD_TAB = TABS.register(
            "aseoha_food_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("aseoha.creative_tab.food"),
                    () -> AseohaItems.GOLDEN_POTATO.get().getDefaultInstance()
            )
    );

    public static final RegistrySupplier<CreativeModeTab> GENERATED_ROUNDEL_TAB = TABS.register(
            "aseoha_roundel_genned_tab", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("aseoha.creative_tab.roundel"),
                    () -> AseohaBlocks.COPPER_BLOCK_ROUNDEL.get().asItem().getDefaultInstance()
            )
    );
}