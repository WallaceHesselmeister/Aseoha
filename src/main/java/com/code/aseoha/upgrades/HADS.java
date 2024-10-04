package com.code.aseoha.upgrades;

import java.util.Objects;
import java.util.Random;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.AxisAlignedBB;
import net.tardis.mod.misc.ITickable;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tags.TardisEntityTypeTags;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;


public class HADS extends Upgrade implements ITickable {
    public Random random;
private ExteriorTile tile;
    public HADS(UpgradeEntry entry, ConsoleTile tile, Class<? extends Subsystem> clazz) {
        super(entry, tile, clazz);
        tile.registerTicker(this);
//        this.random = new Random();
    }
//public boolean isActive = this.isActivated();
public static void hadsActivate(ConsoleTile console) {
                if (!Objects.requireNonNull(console.getLevel()).isClientSide) {
                    console.getSubsystem(StabilizerSubsystem.class).ifPresent(stabs -> stabs.setActivated(false));
                }
                if(((IHelpWithConsole) console).Aseoha$GetHads()) {
                    console.takeoff();
                    Objects.requireNonNull(console.getLevel().getServer()).tell(new TickDelayedTask(1, () -> {
                        console.setDestinationReachedTick(1);
                        console.setFlightTicks(1);

                    }));
                    console.updateClient();
                    if (console.flightTicks == 1200) {
                        console.initLand();
                    }
                }
}

    public void tick(ConsoleTile console) {
//        hadsActivate(console);

        if (!console.isInFlight() && this.isUsable() && this.isActivated()) {


            if (this.tile == null || this.tile.isRemoved()) {
                tile = console.getExteriorType().getExteriorTile(console);
                return;
            }

            if (tile.getLevel() != null) {
                for (LivingEntity liv : tile.getLevel().getEntitiesOfClass(LivingEntity.class, new AxisAlignedBB(tile.getBlockPos()).inflate(2))) {
                    if (liv instanceof IMob && !liv.getType().is(TardisEntityTypeTags.IGNORED_ALARM_ENTITIES)) {
                        hadsActivate(console);
                    }
                }
            }
        }
    }

    public void onLand() {
    }

    public void onTakeoff() {
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
