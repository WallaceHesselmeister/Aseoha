package com.code.aseoha.upgrades;

import net.minecraft.util.concurrent.TickDelayedTask;
import net.tardis.mod.misc.ITickable;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

import java.util.Random;

public class EngineBoost extends Upgrade implements ITickable {
    public Random random;

    public EngineBoost(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
        tile.registerTicker(this);
        this.random = new Random();
    }

//    @SubscribeEvent
    public static void BoostDemEngines(ConsoleTile console) {
        console.setDestinationReachedTick(console.getReachDestinationTick() / 2);
        console.updateClient();
    }


    public void tick(ConsoleTile console) {


    }

    public void onLand() {
    }

    public void onTakeoff() {
        if(!this.isUsable()) return;
        if(!this.isActivated()) return;
        if(!this.getConsole().getUpgrade(this.getClass()).isPresent()) return;
        this.getConsole().getLevel().getServer().tell(new TickDelayedTask(20, () -> BoostDemEngines(this.getConsole())));
//        BoostDemEngines(this.getConsole());
    }

    public void onFlightSecond() {
//        if (this.random.nextInt(100) == 90) {
//            this.getConsole().func_145831_w().func_184133_a((PlayerEntity)null, this.getConsole().func_174877_v(), (SoundEvent)RegSoundEvents.VORTEX_AMBIENT_LOOP2.get(), SoundCategory.PLAYERS, 0.5F, 1.0F);
//        }
//
    }
}
