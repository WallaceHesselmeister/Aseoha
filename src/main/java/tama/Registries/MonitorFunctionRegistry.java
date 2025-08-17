package tama.Registries;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.helpers.Helper;
import net.tardis.mod.misc.tardis.montior.MonitorFunction;
import net.tardis.mod.misc.tardis.montior.security.ScanForLifeFunction;
import tama.Client.gui.MonitorColorPickerScreen;
import tama.aseoha;

public class MonitorFunctionRegistry {

    public static final DeferredRegister<MonitorFunction> FUNCTIONS = DeferredRegister.create(Helper.createRL("monitor_functions"), aseoha.MODID);

    public static final RegistryObject<MonitorColorPickerScreen> CUSTOMIZATION = FUNCTIONS.register("interior/customization", MonitorColorPickerScreen::new);
}
