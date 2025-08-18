package tama.flight_event;

import net.minecraft.core.Direction;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.flight_event.SingleControlEvent;
import net.tardis.mod.registry.ControlRegistry;
import net.tardis.mod.registry.SubsystemRegistry;

import java.util.function.Supplier;

public class LowArtronEvent extends SingleControlEvent {
    public LowArtronEvent(FlightEventType type, ITardisLevel level) {
        super(type, level, ControlRegistry.REFUELER, true);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onFail() {
        super.onFail();
        this.tardis.getSubsystem(SubsystemRegistry.FLUID_LINK_TYPE.get()).ifPresent(sys -> {
            sys.damage(3 + tardis.getLevel().random.nextInt(5));
        });
        tardis.getFuelHandler().takeArtron(5 + tardis.getLevel().random.nextInt(5), false);
    }
}
