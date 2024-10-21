package com.code.aseoha.upgrades;

import net.minecraft.util.concurrent.TickDelayedTask;
import net.tardis.mod.misc.ITickable;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

import java.util.Random;

public class DynamicCoordinates extends Upgrade implements ITickable {

    public DynamicCoordinates(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
        tile.registerTicker(this);
    }



    public void onLand() {
    }

    @Override
    public void onTakeoff() {

    }


    public void onFlightSecond() {
    }

    @Override
    public void tick(ConsoleTile console) {
        if(this.isUsable())
            if(this.isActivated())
                if(this.getConsole().isInFlight())
                    if(this.getConsole().getCurrentLocation() != this.getConsole().getPositionInFlight().getPos())
                        this.getConsole().setCurrentLocation(this.getConsole().getPositionInFlight().getDim(), this.getConsole().getPositionInFlight().getPos());
    }
}
