package com.code.aseoha.upgrades;

import net.minecraft.util.concurrent.TickDelayedTask;
import net.tardis.mod.misc.ITickable;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

import java.util.Random;

public class StandardSpeedUpgrade extends Upgrade {
    public Random random;

    public StandardSpeedUpgrade(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
        this.random = new Random();
    }

    public void BoostDemEngines() {
        this.getConsole().setDestinationReachedTick(this.getConsole().getReachDestinationTick() / 2);
        this.getConsole().updateClient();
    }

    public void onLand() {}

    public void onTakeoff() {
        if(!this.isUsable()) return;
        if(!this.isActivated()) return;
        if(!this.getConsole().getUpgrade(this.getClass()).isPresent()) return;
        this.getConsole().getLevel().getServer().tell(new TickDelayedTask(20, this::BoostDemEngines));
    }

    public void onFlightSecond() {}
}
