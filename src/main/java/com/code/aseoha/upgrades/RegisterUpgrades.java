package com.code.aseoha.upgrades;

import com.code.aseoha.items.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.registries.UpgradeRegistry;
import net.tardis.mod.subsystem.FlightSubsystem;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

public class RegisterUpgrades extends UpgradeRegistry {
    public static final DeferredRegister<UpgradeEntry> UPGRADES = DeferredRegister.create(UpgradeEntry.class, "aseoha");


    public static final RegistryObject<UpgradeEntry> HADS = UPGRADES.register("hads", () -> {
        return setupUpgrade(HADS::new, (Item) ModItems.HADS.get(), FlightSubsystem.class);
    });

    public static final RegistryObject<UpgradeEntry> ENGINEBOOSTER = UPGRADES.register("engine_booster", () -> {
        return setupUpgrade(EngineBoost::new, (Item) ModItems.ENGINE_BOOSTER.get(), FlightSubsystem.class);
    });

    public RegisterUpgrades() {
    }

    public static UpgradeEntry setupUpgrade(UpgradeEntry.IConsoleSpawner<Upgrade> spawn, Item item, Class<? extends Subsystem> sys) {
        UpgradeEntry entry = new UpgradeEntry(spawn, item, sys);
        return entry;
    }

}