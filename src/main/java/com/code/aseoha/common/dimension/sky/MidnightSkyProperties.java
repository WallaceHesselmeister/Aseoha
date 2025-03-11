package com.code.aseoha.common.dimension.sky;

import blue.endless.jankson.annotation.Nullable;
import net.minecraft.client.render.DimensionEffects;
import net.minecraft.util.math.Vec3d;

public class MidnightSkyProperties extends DimensionEffects {
    public static final float[] SUNSET_COLORS = {0, 0, 0, 0};

    public MidnightSkyProperties() {
        super(Float.NaN, true, SkyType.NONE, true, false);
//            this.(new MoonSkyRenderer());
    }

    public MidnightSkyProperties(float cloudLevel, boolean hasGround, SkyType skyType, boolean forceBrightLightmap,
                                 boolean constantAmbientLight) {
        super(cloudLevel, hasGround, skyType, forceBrightLightmap, constantAmbientLight);
    }

    //adjustSkyColor
    @Override
    public Vec3d adjustFogColor(Vec3d color, float sunHeight) {
        return new Vec3d(0, 0, 0);
    }

    //isFoggyAt
    @Override
    public boolean useThickFog(int camX, int camY) {
        return false;
    }

    @Nullable
    @Override
    public float[] getFogColorOverride(float p_230492_1_, float p_230492_2_) {
        return SUNSET_COLORS;
    }
}
