package tama.Registries;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.helpers.Helper;
import net.tardis.mod.registry.ControlRegistry;
import tama.aseoha;
import tama.flight_event.LowArtronEvent;
import tama.flight_event.VortexScrapEvent;

public class FlightEventRegistry {
    public static final DeferredRegister<FlightEventType> FLIGHT_EVENTS = DeferredRegister.create(Helper.createRL("flight_event"), aseoha.MODID);

    public static final RegistryObject<FlightEventType> LOW_ARTRON  = FLIGHT_EVENTS.register("low_artron", () -> new FlightEventType(1.0F, LowArtronEvent::new
    ));

    public static final RegistryObject<FlightEventType> VORTEX_SCRAP  = FLIGHT_EVENTS.register("vortex_scrap", () -> new FlightEventType(0.7F, VortexScrapEvent::new
    ));
}
