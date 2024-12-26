package com.code.fabric.registries;

import com.code.common.registries.AseohaEntities;
import com.code.fabric.items.PlasmaRifle;
import com.code.fabric.items.magazines.nine_mil.NineMilMag;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import static com.code.aseoha.MOD_ID;

public class AseohaItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> K9_SPAWN_EGG = ITEMS.register("k9_spawn_egg", () -> new SpawnEggItem(AseohaEntities.K9.get(), 56063, 44543, new Item.Properties()));

    public static final RegistrySupplier<Item> PLASMA_RIFLE = ITEMS.register("plasma_rifle",
            () -> new PlasmaRifle(new Item.Properties()));

    public static final RegistrySupplier<Item> MAGAZINE_NINE_MIL = ITEMS.register("magazines/magazine_nine_mil",
            () -> new NineMilMag(new Item.Properties()));
}
