/* (C) TAMA Studios 2025 */
package tama.Registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataBool;
import tama.Controls.LightSwitchControl;
import tama.aseoha;

public class ControlRegistry {
    public static DeferredRegister<ControlType<?>> CONTROLS =
            DeferredRegister.create(new ResourceLocation("tardis", "control"), aseoha.MODID);
    public static final RegistryObject<ControlType<ControlDataBool>> LIGHT_SWITCH =
            CONTROLS.register("light_switch", () -> new ControlType<>(LightSwitchControl::new, ControlDataBool::new));
}
