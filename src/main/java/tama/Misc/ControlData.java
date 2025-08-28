package tama.Misc;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.core.Direction;
import net.tardis.mod.cap.level.TardisCap;
import net.tardis.mod.control.datas.*;
import net.tardis.mod.misc.enums.LandingType;
import net.tardis.mod.registry.ControlRegistry;

@Getter @Setter
public class ControlData {
    public ControlData(TardisCap cap) {
        ControlDataNone randomizer = cap.getControlDataOrCreate(ControlRegistry.RANDOMIZER.get());
        net.tardis.mod.control.datas.ControlData<?> door = cap.getControlDataOrCreate(ControlRegistry.DOOR.get());
        ControlDataBool handBrake = cap.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get());
        ControlDataEnum<Direction> facing = cap.getControlDataOrCreate(ControlRegistry.FACING.get());
        ControlDataFloat throttle = cap.getControlDataOrCreate(ControlRegistry.THROTTLE.get());
        net.tardis.mod.control.datas.ControlData<?> telepathics = cap.getControlDataOrCreate(ControlRegistry.TELEPATHICS.get());
        net.tardis.mod.control.datas.ControlData<?> comms = cap.getControlDataOrCreate(ControlRegistry.COMMUNICATOR.get());
        ControlDataEnum<LandingType> verticalLandingType = cap.getControlDataOrCreate(ControlRegistry.LANDING_TYPE.get());
        ControlDataInt incMod = cap.getControlDataOrCreate(ControlRegistry.INCREMENT.get());
    }
}
