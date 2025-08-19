/* (C) TAMA Studios 2025 */
package tama.flight_event;

import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.flight_event.SingleControlEvent;
import net.tardis.mod.misc.enums.DoorState;
import net.tardis.mod.registry.ControlRegistry;

public class ExteriorBulkheadEvent extends SingleControlEvent {
    public ExteriorBulkheadEvent(FlightEventType type, ITardisLevel level) {
        super(type, level, ControlRegistry.DOOR, true);
    }

    @Override
    public void onStart() {}

    @Override
    public void onFail() {
        super.onFail();
        this.tardis.getInteriorManager().getDoorHandler().setDoorState(DoorState.values(), DoorState.BOTH);
    }
}
