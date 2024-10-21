package com.code.aseoha.misc.soundSchemes;

import com.code.aseoha.client.Sounds;
import net.tardis.mod.sounds.SoundSchemeBase;

public class SilentSoundScheme extends SoundSchemeBase {

    public SilentSoundScheme() {
        super(Sounds.EMPTY, Sounds.EMPTY, Sounds.EMPTY);
    }

    @Override
    public int getLandTime() {
        return 377;
    }

}
