package com.code.aseoha.flightevent;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Supplier;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.tardis.mod.flight.FlightEvent;
import net.tardis.mod.flight.FlightEventFactory;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;


public class PowerFault extends FlightEvent {

    public PowerFault(FlightEventFactory entry, ArrayList<ResourceLocation> loc) {
        super(entry, loc);
    }

    public static final Supplier<ArrayList<ResourceLocation>> CONTROLS = () -> Lists.newArrayList(
            ControlRegistry.THROTTLE.get().getRegistryName(),
            ControlRegistry.REFUELER.get().getRegistryName()
    );
    @Override
    public void onMiss(ConsoleTile tile) {
        super.onMiss(tile);
        Objects.requireNonNull(tile.getLevel()).playSound(null, tile.getBlockPos(), TSounds.POWER_DOWN.get(), SoundCategory.PLAYERS, 3.0F, 1.0F);
        tile.setArtron(tile.getArtron() * 0.5F);
        if(tile.getInteriorManager() != null)
            tile.onPowerDown(true);
    }
}
