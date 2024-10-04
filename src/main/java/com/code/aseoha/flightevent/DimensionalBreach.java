package com.code.aseoha.flightevent;

import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.tardis.mod.flight.FlightEvent;
import net.tardis.mod.flight.FlightEventFactory;
import net.tardis.mod.misc.CrashTypes;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.List;

public class DimensionalBreach extends FlightEvent {
    public DimensionalBreach(FlightEventFactory entry, List < ResourceLocation > controls) {
        super(entry, controls);
    }

    public static final Supplier < ArrayList < ResourceLocation >> CONTROLS = () -> Lists.newArrayList(
            ControlRegistry.THROTTLE.get().getRegistryName(),
            ControlRegistry.DIMENSION.get().getRegistryName()
    );

    @Override
    public void onMiss(ConsoleTile tile) {
        super.onMiss(tile);
        Objects.requireNonNull(tile.getLevel()).playSound(null, tile.getBlockPos(), TSounds.CANT_START.get(), SoundCategory.PLAYERS, 1F, 1F);
        tile.crash(CrashTypes.DEFAULT);
        tile.getInteriorManager().setAlarmOn(true);
    }

}