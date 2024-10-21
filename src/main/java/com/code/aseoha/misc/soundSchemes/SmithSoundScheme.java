package com.code.aseoha.misc.soundSchemes;

import com.code.aseoha.client.Sounds;
import net.tardis.mod.sounds.SoundSchemeBase;

public class SmithSoundScheme extends SoundSchemeBase {

    public SmithSoundScheme() {
        super(Sounds.SMITH_TAKEOFF, Sounds.SMITH_LAND, Sounds.SMITH_FLIGHT_LOOP);
    }

    @Override
    public int getLandTime() {
        return 180;
    }

}
