package com.code.aseoha.flightevent;

import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.tardis.mod.config.TConfig;
import net.tardis.mod.controls.ThrottleControl;
import net.tardis.mod.flight.FlightEvent;
import net.tardis.mod.flight.FlightEventFactory;
import net.tardis.mod.misc.ObjectWrapper;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

import static net.tardis.mod.helper.Helper.rand;


public class TakingOver extends FlightEvent {

    public TakingOver(FlightEventFactory entry, List<ResourceLocation> controls) {
        super(entry, controls);
    }

    public static final Supplier<ArrayList<ResourceLocation>> CONTROLS = () -> Lists.newArrayList(
            ControlRegistry.RANDOM.get().getRegistryName(),
            ControlRegistry.THROTTLE.get().getRegistryName(),
            ControlRegistry.LAND_TYPE.get().getRegistryName()
    );
@Override
public int calcTime(ConsoleTile console) {
    ObjectWrapper<Float> wrapper = new ObjectWrapper<>(0.0F);
    console.getControl(ThrottleControl.class).ifPresent((throt) -> {
        wrapper.setValue(throt.getAmount());
    });
    float amt = (Float) wrapper.getValue();
    int seconds = (Integer) 6 * 20;
    return this.timeUntilMiss = console.flightTicks + seconds + (int) Math.floor((double) ((1.0F - amt) * (float) seconds));
}

//    @Override
//    public boolean onComplete(ConsoleTile tile) {
//        boolean success = super.onComplete(tile);
////        if(success) {
////            tile.setDestinationReachedTick(tile.getReachDestinationTick() / 2);
////            tile.updateClient();
////        }
//        return super.onComplete(tile);
//    }


    @Override
    public void onMiss(ConsoleTile tile) {
//        Random rand;
        super.onMiss(tile);
        Objects.requireNonNull(tile.getLevel()).playSound(null, tile.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.PLAYERS, 1F, 1F);
//        tile.damage(150F);
//        tile.crash(CrashTypes.DEFAULT);
        tile.randomizeCoords(tile.getDestinationPosition(), 1000);//rand.nextInt() % 1000);
//        tile.getControl(TelepathicControl.class).ifPresent(telepathic -> telepathic.);

        tile.updateClient();
//        tile.getInteriorManager().setAlarmOn(true);
    }

}
