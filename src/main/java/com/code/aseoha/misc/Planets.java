package com.code.aseoha.misc;

import org.lwjgl.system.CallbackI;

public class Planets {
    private final PlanetUVs sun = new PlanetUVs();
    private final PlanetUVs klom = new PlanetUVs();
    private final PlanetUVs mars = new PlanetUVs();

    public Planets(){}

    public PlanetUVs GetSun() {
        this.sun.SetHorizontalUVs(0, 0.1015625F, 0.03125F, 0.1328125F);
        this.sun.SetVerticleUVs(0, 0.1015625F, 0.03125F, 0.1328125F);
        return this.sun;
    }
    public PlanetUVs GetKlom() {
        this.klom.SetHorizontalUVs(0.80859375F, 0, 0.93359375F, 0.0859375F);
        this.klom.SetVerticleUVs(0.91015625F, 0, 1, 0.0859375F);
        return this.klom;
    }
    public PlanetUVs GetMars() {
        this.mars.SetHorizontalUVs(0.203125F, 0F, 0.29296875F, 0.08984375F);
        this.mars.SetVerticleUVs(0.3046875F, 0F, 0.39453125F, 0.08984375F);
        return this.mars;
    }

}
