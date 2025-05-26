package com.code.aseoha.upgrades;

import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

public class HostileEjection extends Upgrade {

    public HostileEjection(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
    }

    public void onLand() {}

    public void onTakeoff() {}

    public void onFlightSecond() {}
}
