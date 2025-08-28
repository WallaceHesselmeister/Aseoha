/* (C) TAMA Studios 2025 */
package tama.Items;

import static tama.aseoha.MODID;

import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Sounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MODID);

    public static final RegistryObject<SoundEvent> LAVA_CHICKEN = SOUND_EVENTS.register(
            "lava_chicken",
            () -> SoundEvent.createVariableRangeEvent(
                    new net.minecraft.resources.ResourceLocation(MODID, "lava_chicken")));
}
