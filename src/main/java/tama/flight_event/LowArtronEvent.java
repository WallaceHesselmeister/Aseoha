/* (C) TAMA Studios 2025 */
package tama.flight_event;

import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.flight_event.SingleControlEvent;
import net.tardis.mod.item.components.ArtronCapacitorItem;
import net.tardis.mod.misc.tardis.TardisEngine;
import net.tardis.mod.registry.ControlRegistry;
import net.tardis.mod.registry.ItemRegistry;
import net.tardis.mod.registry.SubsystemRegistry;

public class LowArtronEvent extends SingleControlEvent {
    public LowArtronEvent(FlightEventType type, ITardisLevel level) {
        super(type, level, ControlRegistry.REFUELER, true);
    }

    @Override
    public void onStart() {}

    @Override
    public void onFail() {
        super.onFail();
        this.tardis.getSubsystem(SubsystemRegistry.FLUID_LINK_TYPE.get()).ifPresent(sys -> {
            sys.damage(3 + tardis.getLevel().random.nextInt(5));
        });

        if (this.tardis.getLevel().random.nextInt(100) >= 2) { // 2% chance
            for (int i = 0; i < 8; i++) { // Check for a capacitor
                if (tardis.getEngine()
                                .getInventoryFor(TardisEngine.EngineSide.CAPACITORS)
                                .getStackInSlot(i)
                                .getItem()
                        instanceof ArtronCapacitorItem) {
                    tardis.getEngine()
                            .getInventoryFor(TardisEngine.EngineSide.CAPACITORS)
                            .setStackInSlot(
                                    i, ItemRegistry.ARTRON_CAP_LEAKY.get().getDefaultInstance()); // Turn it leaky
                    break;
                }
            }
        }
        tardis.getFuelHandler()
                .takeArtron(5 + tardis.getLevel().random.nextInt(5), false); // Send your artron to Detroit
    }
}
