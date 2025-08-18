/* (C) TAMA Studios 2025 */
package tama.flight_event;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.DimensionControl;
import net.tardis.mod.flight_event.FlightEventType;
import net.tardis.mod.flight_event.SingleControlEvent;
import net.tardis.mod.misc.SpaceTimeCoord;
import net.tardis.mod.misc.enums.LandingType;
import net.tardis.mod.registry.ControlRegistry;

import java.util.List;

import static net.tardis.mod.control.DimensionControl.getIndexFrom;
import static net.tardis.mod.control.DimensionControl.getPossibleDimensions;

public class DimensionalDriftEvent extends SingleControlEvent {
    public DimensionalDriftEvent(FlightEventType type, ITardisLevel level) {
        super(type, level, ControlRegistry.DIMENSIONS, true);
    }

    @Override
    public void onStart() {}

    @Override
    public void onFail() {
        super.onFail();
        if(!this.tardis.getLevel().isClientSide){ // Randomize destination level
            List<Level> levels = getPossibleDimensions(this.tardis.getLevel().getServer(), this.tardis);

            int index = 0;
            //change index and make sure it's in bounds
            index = this.tardis.getLevel().random.nextInt(levels.size() - 1);
            if(index >= levels.size()){
                index = levels.size() - 1;
            }

            final Level targetLevel = levels.get(index);
            final ResourceKey<Level> targetDim = targetLevel.dimension();

            this.tardis.setDestination(new SpaceTimeCoord(targetDim, this.tardis.getDestination().getPos()));
            this.tardis.getControlDataOrCreate(ControlRegistry.DIMENSIONS.get()).set(targetDim.location());
        }
    }
}