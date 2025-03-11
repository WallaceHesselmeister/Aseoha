package com.code.aseoha.common.dimension.sky;

public class PlanetUVs {

    public float MinimumHU, MaximumHU, MinimumHV, MaximumHV;

    public float MinimumVU, MaximumVU, MinimumVV, MaximumVV;

    public float HorizontalUVs[] = {MinimumHU, MaximumHU, MinimumHV, MaximumHV};

    public float VerticalUVs[] = {MinimumVU, MaximumVU, MinimumVV, MaximumVV};

    public void SetHorizontalUVs(float minU, float minV, float maxU, float maxV) {
        this.MinimumHU = minU;
        this.MinimumHV = minV;
        this.MaximumHU = maxU;
        this.MaximumHV = maxV;
    }

    public void SetVerticleUVs(float minU, float minV, float maxU, float maxV) {
        this.MinimumVU = minU;
        this.MinimumVV = minV;
        this.MaximumVU = maxU;
        this.MaximumVV = maxV;
    }
}
