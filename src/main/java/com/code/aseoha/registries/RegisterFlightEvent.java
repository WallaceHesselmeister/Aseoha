package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.config;
import com.code.aseoha.flightevent.PowerFault;
import com.code.aseoha.flightevent.TakingOver;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.flight.*;
import net.tardis.mod.flight.FlightEventFactory.IFlightEventFactory;
import net.tardis.mod.registries.FlightEventRegistry;

import java.util.ArrayList;
import java.util.function.Supplier;

public class RegisterFlightEvent extends FlightEventRegistry{


    public static final DeferredRegister<FlightEventFactory> FLIGHT_EVENTS = DeferredRegister.create(FlightEventFactory.class, aseoha.MODID);

    public static final RegistryObject<FlightEventFactory> POWER_FAILURE = FLIGHT_EVENTS.register("power_fault", () -> setupFlightEvent(PowerFault::new, PowerFault.CONTROLS));
    public static final RegistryObject<FlightEventFactory> TAKING_OVER = FLIGHT_EVENTS.register("tardis_taking_over", () -> setupFlightEvent(TakingOver::new, TakingOver.CONTROLS));

    public static FlightEventFactory setupFlightEvent(IFlightEventFactory<FlightEvent> event, Supplier<ArrayList<ResourceLocation>> sequence){
        return new FlightEventFactory(event, sequence);
    }

    public static FlightEventFactory setupFlightEvent(IFlightEventFactory<FlightEvent> event, Supplier<ArrayList<ResourceLocation>> sequence, boolean normal) {
        FlightEventFactory fact = setupFlightEvent(event, sequence);
        fact.setNormal(false);
        return fact;
    }

    //Call in server setup or FMLStartupEvent
    public static void addRandomEvent(int weight, FlightEventFactory event){
        FlightEventRegistry.RANDOM_EVENTS.addChance(weight, event);
    }

    public static void registerRandomEntries() {
        addRandomEvent(config.COMMON.PowerFaultRarity.get(), POWER_FAILURE.get());
        addRandomEvent(config.COMMON.TakingOverRarity.get(), TAKING_OVER.get());
    }
}
