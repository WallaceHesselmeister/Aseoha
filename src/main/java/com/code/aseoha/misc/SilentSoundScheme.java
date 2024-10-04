package com.code.aseoha.misc;

import com.code.aseoha.client.Sounds;
import net.tardis.mod.sounds.SoundSchemeBase;
import net.tardis.mod.sounds.TSounds;

public class SilentSoundScheme extends SoundSchemeBase {

    public SilentSoundScheme() {
        super(Sounds.EMPTY, Sounds.EMPTY, Sounds.EMPTY);
    }

    @Override
    public int getLandTime() {
        return 377;
    }

}
