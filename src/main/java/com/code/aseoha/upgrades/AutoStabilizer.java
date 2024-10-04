package com.code.aseoha.upgrades;

import net.tardis.mod.misc.ITickable;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

import java.util.Random;

public class AutoStabilizer extends Upgrade {
    public AutoStabilizer(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
    }

    public void onLand() {
    }

    public void onTakeoff() {
    }

    public void onFlightSecond() {
    }
}
