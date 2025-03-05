package com.code.aseoha.upgrades;

import net.minecraft.util.SoundCategory;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

import java.util.Random;

public class LightspeedDrive extends Upgrade {
    public Random random;

    public LightspeedDrive(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
        this.random = new Random();
    }

    public void BoostDemEngines() {
        this.getConsole().setDestinationReachedTick(this.getConsole().getReachDestinationTick() / 4);
        this.getConsole().getLevel().playSound(null, this.getConsole().getBlockPos(), TSounds.ELECTRIC_ARC.get(), SoundCategory.PLAYERS, 0.5F, 1.0F);
        this.getConsole().updateClient();
    }

    public void onLand() {}

    public void onTakeoff() {
        if (!this.isUsable()) return;
        if (!this.isActivated()) return;
        if (!this.getConsole().getUpgrade(this.getClass()).isPresent()) return;
        this.getConsole().getLevel().getServer().tell(new TickDelayedTask(20, this::BoostDemEngines));
    }

    public void onFlightSecond() {}
}
