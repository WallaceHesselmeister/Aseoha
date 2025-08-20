/* (C) TAMA Studios 2025 */
package tama.flight_event;

import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.datas.ControlData;
import net.tardis.mod.flight_event.FlightEvent;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.registry.ControlRegistry;
import net.tardis.mod.registry.SubsystemRegistry;

public class VortexScrapEvent extends FlightEvent {
    boolean facing;
    boolean random;

    public VortexScrapEvent(FlightEventType type, ITardisLevel level) {
        super(type, level);
    }

    @Override
    public boolean onControlUse(ControlData<?> control) {
        if (control.getType().equals(ControlRegistry.RANDOMIZER.get())) {
            random = true;
            if (facing) this.complete();
            return true;
        }

        if (control.getType().equals(ControlRegistry.FACING.get())) {
            facing = true;
            if (random) this.complete();
            return true;
        }

        return false;
    }

    @Override
    public void onStart() {}

    @Override
    public void onFail() {
        this.tardis
                .getSubsystem(SubsystemRegistry.SHIELD.get())
                .ifPresent(sys -> sys.damage(5 + tardis.getLevel().random.nextInt(5)));
        this.tardis
                .getSubsystem(SubsystemRegistry.FLIGHT_TYPE.get())
                .ifPresent(sys -> sys.damage(5 + tardis.getLevel().random.nextInt(5)));
        this.tardis
                .getSubsystem(SubsystemRegistry.FLUID_LINK_TYPE.get())
                .ifPresent(sys -> sys.damage(5 + tardis.getLevel().random.nextInt(5)));
        this.tardis
                .getSubsystem(SubsystemRegistry.STABILIZERS.get())
                .ifPresent(sys -> sys.damage(5 + tardis.getLevel().random.nextInt(5)));
        super.onFail();
    }
}
