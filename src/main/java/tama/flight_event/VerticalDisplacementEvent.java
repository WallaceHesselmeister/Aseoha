/* (C) TAMA Studios 2025 */
package tama.flight_event;

import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.flight_event.SingleControlEvent;
import net.tardis.mod.misc.enums.LandingType;
import net.tardis.mod.registry.ControlRegistry;

public class VerticalDisplacementEvent extends SingleControlEvent {
    public VerticalDisplacementEvent(FlightEventType type, ITardisLevel level) {
        super(type, level, ControlRegistry.LANDING_TYPE, true);
    }

    @Override
    public void onStart() {}

    @Override
    public void onFail() {
        super.onFail();
        this.tardis
                .getControlDataOrCreate(ControlRegistry.LANDING_TYPE.get())
                .set(this.tardis.getLevel().random.nextBoolean() ? LandingType.UP : LandingType.DOWN);
    }
}
