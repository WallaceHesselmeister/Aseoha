/* (C) TAMA Studios 2025 */
package tama.Capabilities;

import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tama.Capabilities.Interfaces.IControlDiscCapability;

import static tama.aseoha.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Capabilities {

    public static final Capability<IControlDiscCapability> CONTROL_DISC =
            CapabilityManager.get(new CapabilityToken<>() {});

    @SubscribeEvent
    public static void register(RegisterCapabilitiesEvent event) {
        event.register(IControlDiscCapability.class);
    }

    public static <T, O extends ICapabilityProvider> LazyOptional<T> getCap(Capability<T> cap, O object) {
        if (object == null) return LazyOptional.empty();

        return object.getCapability(cap);
    }
}
