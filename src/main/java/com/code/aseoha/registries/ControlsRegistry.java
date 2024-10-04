package com.code.aseoha.registries;

import com.code.aseoha.Controls.WibblyLever;
import com.code.aseoha.aseoha;
import com.code.aseoha.Controls.CoffeePot;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.registries.ControlRegistry;

public class ControlsRegistry {
    public static final DeferredRegister<ControlRegistry.ControlEntry> CUSTOM_CONTROLS = DeferredRegister.create(ControlRegistry.ControlEntry.class, aseoha.MODID);

    public static final RegistryObject<ControlRegistry.ControlEntry> COFFEEPOT =
            CUSTOM_CONTROLS.register("coffeepot", () -> new ControlRegistry.ControlEntry(CoffeePot::new));

    public static final RegistryObject<ControlRegistry.ControlEntry> WIBBLY_LEVER =
            CUSTOM_CONTROLS.register("wibbly_lever", () -> new ControlRegistry.ControlEntry(WibblyLever::new));
}
