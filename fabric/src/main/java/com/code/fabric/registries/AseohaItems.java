package com.code.fabric.registries;

import com.code.fabric.items.PlasmaRifle;
import com.code.fabric.items.PlasmaBoltMagazine;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

import static com.code.aseoha.MOD_ID;

public class AseohaItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> PLASMA_RIFLE = ITEMS.register("plasma_rifle",
            () -> new PlasmaRifle(new Item.Properties()));

    public static final RegistrySupplier<Item> PLASMA_BOLT_MAGAZINE = ITEMS.register("plasma_bolt_magazine",
            () -> new PlasmaBoltMagazine(new Item.Properties()));
}
