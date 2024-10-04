package com.code.aseoha.client.renderers.sky;

import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

@OnlyIn(Dist.CLIENT)
public class RaxicoricofallapitoriusSkyProperty extends DimensionRenderInfo {
    private final float[] sunriseCol = new float[4];

    public RaxicoricofallapitoriusSkyProperty() {
        super(240F, true, FogType.NONE, true, false);
        this.setSkyRenderHandler(new RaxicoricofallapitoriusSkyRenderer());
    }

//    public GallifreySkyProperty(float cloudLevel, boolean hasGround, FogType skyType, boolean forceBrightLightmap,
//                                boolean constantAmbientLight) {
//        super(cloudLevel, hasGround, skyType, forceBrightLightmap, constantAmbientLight);
//    }

    //isFoggyAt
    @Override
    public boolean isFoggyAt(int camX, int camY) {
        return false;
    }

    @Nullable
    @Override
    public float[] getSunriseColor(float p_230492_1_, float p_230492_2_) {
//        return DimensionRenderInfo.Overworld

        float f1 = MathHelper.cos(p_230492_1_ * ((float)Math.PI * 2F)) - 0.0F;
        if (f1 >= -0.4F && f1 <= 0.4F) {
            float f3 = (f1 + 0.0F) / 0.4F * 0.5F + 0.5F;
            float f4 = 1.0F - (1.0F - MathHelper.sin(f3 * (float)Math.PI)) * 0.99F;
            f4 = f4 * f4;
            this.sunriseCol[0] = f3 * 0.3F + 0.7F;
            this.sunriseCol[1] = f3 * f3 * 0.7F + 0.2F;
            this.sunriseCol[2] = f3 * f3 * 0.0F + 0.2F;
            this.sunriseCol[3] = f4;
            return this.sunriseCol;
        } else {
            return null;
        }
    }

    @NotNull
    @Override
    public Vector3d getBrightnessDependentFogColor(@NotNull Vector3d Color, float SunHeight) {
            return Color.multiply((double)(SunHeight * 0.94F + 0.06F), (double)(SunHeight * 0.94F + 0.06F), (double)(SunHeight * 0.91F + 0.09F));
    }
//        public Vector3d getBrightnessDependentFogColor(Vector3d p_230494_1_, float p_230494_2_) {
//            return p_230494_1_.multiply((double)(p_230494_2_ * 0.94F + 0.06F), (double)(p_230494_2_ * 0.94F + 0.06F), (double)(p_230494_2_ * 0.91F + 0.09F));
//        }
}