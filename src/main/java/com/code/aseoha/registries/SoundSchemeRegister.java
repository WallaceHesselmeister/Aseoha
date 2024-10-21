package com.code.aseoha.registries;

import com.code.aseoha.aseoha;
import com.code.aseoha.misc.soundSchemes.SilentSoundScheme;
import com.code.aseoha.misc.soundSchemes.SmithSoundScheme;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.registries.SoundSchemeRegistry;
import net.tardis.mod.sounds.*;

public class SoundSchemeRegister extends SoundSchemeRegistry {

    public static final DeferredRegister<AbstractSoundScheme> SOUND_SCHEMES = DeferredRegister.create(AbstractSoundScheme.class, aseoha.MODID);

    public static final RegistryObject<AbstractSoundScheme> STEALTH = SOUND_SCHEMES.register("stealth", SilentSoundScheme::new);

    public static final RegistryObject<AbstractSoundScheme> SMITH = SOUND_SCHEMES.register("smith", SmithSoundScheme::new);
}
