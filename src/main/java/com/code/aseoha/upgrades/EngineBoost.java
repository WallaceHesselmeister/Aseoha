package com.code.aseoha.upgrades;

import com.code.aseoha.aseoha;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
//        aseoha.LOGGER.info(console.getReachDestinationTick());
        console.setDestinationReachedTick(console.getReachDestinationTick() / 2);
        console.updateClient();
//        aseoha.LOGGER.info(console.getReachDestinationTick());
    }


    public void tick(ConsoleTile console) {
        if(console.flightTicks == 100)
            if(this.isUsable())
                BoostDemEngines(console);
//        FlightEventEvent event;
//        BoostThemEngines();
//        if (console.isInFlight()) {
//            console.setCurrentLocation(console.getCurrentDimension(), console.getPositionInFlight().getPos());
//        }


    }

    public void onLand() {
    }

    public void onTakeoff() {
//        BoostDemEngines(this.getConsole());
//        this.getConsole().getControl(ThrottleControl.class).ifPresent((control) -> {
//            if (control.getAmount() == 1.0F && this.isUsable() && this.isActivated()) {
//                this.getConsole().func_145831_w().func_184133_a((PlayerEntity)null, this.getConsole().func_174877_v(), (SoundEvent)RegSoundEvents.ENGINE_BOOST_START.get(), SoundCategory.PLAYERS, 0.5F, 1.0F);
//            }
//
//        });
    }

    public void onFlightSecond() {
//        if (this.random.nextInt(100) == 90) {
//            this.getConsole().func_145831_w().func_184133_a((PlayerEntity)null, this.getConsole().func_174877_v(), (SoundEvent)RegSoundEvents.VORTEX_AMBIENT_LOOP2.get(), SoundCategory.PLAYERS, 0.5F, 1.0F);
//        }
//
    }
}
