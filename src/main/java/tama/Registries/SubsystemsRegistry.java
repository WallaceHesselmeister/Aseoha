package tama.Registries;

import net.minecraftforge.eventbus.api.IEventBus;
import net.tardis.mod.registry.SubsystemRegistry;
import tama.Items.AItems;
import tama.subsystems.Type40NavCom;

public class SubsystemsRegistry {
    public static void register(IEventBus bus){
    }

    public static void registerSubsystems(){
        SubsystemRegistry.NAV_COM.get().registerSubsystem(stack -> stack.getItem() == AItems.TYPE_40_NAV_COM.get(), Type40NavCom::new);
    }
}