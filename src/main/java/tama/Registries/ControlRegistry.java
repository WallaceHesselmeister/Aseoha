/* (C) TAMA Studios 2025 */
package tama.Registries;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataBool;
import net.tardis.mod.control.datas.ControlDataNone;
import tama.Controls.CoffeePotControl;
import tama.Controls.CollisionControl;
import tama.Controls.LightSwitchControl;
import tama.aseoha;

public class ControlRegistry {
    public static DeferredRegister<ControlType<?>> CONTROLS =
            DeferredRegister.create(new ResourceLocation("tardis", "control"), aseoha.MODID);

    public static final RegistryObject<ControlType<ControlDataBool>> LIGHT_SWITCH =
            CONTROLS.register("light_switch", () -> new ControlType<>(LightSwitchControl::new, ControlDataBool::new));

    public static final RegistryObject<ControlType<ControlDataNone>> COFFEE_POT =
            CONTROLS.register("coffee_pot", () -> new ControlType<>(CoffeePotControl::new, ControlDataNone::new));

    public static final RegistryObject<ControlType<ControlDataNone>> COLLISION =
            CONTROLS.register("collision", () -> new ControlType<>(CollisionControl::new, ControlDataNone::new));

    public static final RegistryObject<ControlType<ControlDataNone>> COLLISION_TWO =
            CONTROLS.register("collision_two", () -> new ControlType<>(CollisionControl::new, ControlDataNone::new));

    public static final RegistryObject<ControlType<ControlDataNone>> COLLISION_THREE =
            CONTROLS.register("collision_three", () -> new ControlType<>(CollisionControl::new, ControlDataNone::new));

    public static final RegistryObject<ControlType<ControlDataNone>> COLLISION_FOUR =
            CONTROLS.register("collision_four", () -> new ControlType<>(CollisionControl::new, ControlDataNone::new));
}
