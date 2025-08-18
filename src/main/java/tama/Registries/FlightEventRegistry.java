/* (C) TAMA Studios 2025 */
package tama.Registries;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.helpers.Helper;
import tama.aseoha;
import tama.flight_event.*;

public class FlightEventRegistry {
    public static final DeferredRegister<FlightEventType> FLIGHT_EVENTS =
            DeferredRegister.create(Helper.createRL("flight_event"), aseoha.MODID);

    public static final RegistryObject<FlightEventType> LOW_ARTRON =
            FLIGHT_EVENTS.register("low_artron", () -> new FlightEventType(0.6F, LowArtronEvent::new));

    public static final RegistryObject<FlightEventType> VORTEX_SCRAP =
            FLIGHT_EVENTS.register("vortex_scrap", () -> new FlightEventType(0.6F, VortexScrapEvent::new));

    public static final RegistryObject<FlightEventType> EXTERIOR_BULKHEAD =
            FLIGHT_EVENTS.register("exterior_bulkhead", () -> new FlightEventType(0.6F, ExteriorBulkheadEvent::new));

    public static final RegistryObject<FlightEventType> VERTICAL_DISPLACEMENT =
            FLIGHT_EVENTS.register("vertical_displacement", () -> new FlightEventType(0.8F, VerticalDisplacementEvent::new));

    public static final RegistryObject<FlightEventType> DIMENSIONAL_DRIFT =
            FLIGHT_EVENTS.register("dimensional_drift", () -> new FlightEventType(0.6F, DimensionalDriftEvent::new));
}
