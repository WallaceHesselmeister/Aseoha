package com.code.aseoha.client.renderers.sky;

import javax.annotation.Nullable;

import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.world.dimensions.SpaceSkyProperty;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class KlomSkyProperty extends DimensionRenderInfo {

    public KlomSkyProperty() {
        super(Float.NaN, true, FogType.NONE, false, false);
        this.setSkyRenderHandler(new KlomSkyRenderer());
    }

    public KlomSkyProperty(float cloudLevel, boolean hasGround, FogType skyType, boolean forceBrightLightmap,
                           boolean constantAmbientLight) {
        super(cloudLevel, hasGround, skyType, forceBrightLightmap, constantAmbientLight);
    }

    //isFoggyAt
    @Override
    public boolean isFoggyAt(int camX, int camY) {
        return false;
    }

    @Nullable
    @Override
    public float[] getSunriseColor(float p_230492_1_, float p_230492_2_) {
        return SpaceSkyProperty.SUNSET_COLORS;
    }

    @NotNull
    @Override
    public Vector3d getBrightnessDependentFogColor(@NotNull Vector3d p_230494_1_, float p_230494_2_) {
        return new Vector3d(0, 0, 0);
    }
}