package com.code.aseoha.mixin.client;

import com.code.aseoha.client.renderers.sky.TardisSkyRenderer;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraftforge.client.ISkyRenderHandler;
import net.tardis.mod.world.dimensions.TardisSkyProperty;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Objects;

@Mixin(TardisSkyProperty.class)
public abstract class TardisSkyPropertyMixin extends DimensionRenderInfo {

//        private final float[] eveningColors = new float[]{0, 0, 0, 0};

//        public TardisSkyProperty() {
//            this(Float.NaN, false, FogType.NONE, false, false); //Set forceBrightLightmap to false so the color isn't lerped in LightTexture
//        }
@Inject(method = "<init>(FZLnet/minecraft/client/world/DimensionRenderInfo$FogType;ZZ)V", at = @At(value = "TAIL"), remap = false)
        public void Aseoha$TardisSkyProperty(float cloudLevel, boolean hasGround, FogType skyType, boolean forceBrightLightmap, boolean constantAmbientLight, CallbackInfo ci) {
//            super(cloudLevel, hasGround, skyType, forceBrightLightmap, constantAmbientLight);
//            this.setCloudRenderHandler(new EmptyCloudRenderer());
//            this.setSkyRenderHandler(new EmptyRenderer());
//            this.setWeatherRenderHandler(new EmptyWeatherRenderer());
            this.setSkyRenderHandler(Objects.requireNonNull(Aseoha$getSkyRenderHandler()));
        }

    public TardisSkyPropertyMixin(float p_i241259_1_, boolean p_i241259_2_, FogType p_i241259_3_, boolean p_i241259_4_, boolean p_i241259_5_) {
        super(p_i241259_1_, p_i241259_2_, p_i241259_3_, p_i241259_4_, p_i241259_5_);
    }

    @Unique
    public ISkyRenderHandler Aseoha$getSkyRenderHandler() {
        return new TardisSkyRenderer();
    }

//        //getBrightnessDependentFogColor
//        @Override
//        public Vector3d func_230494_a_(Vector3d color, float sunHeight) {
//            return new Vector3d(0, 0, 0);
//        }
//
//        //isFoggyAt
//        @Override
//        public boolean func_230493_a_(int camX, int camY) {
//            return false;
//        }
//
//        @Nullable
//        @Override
//        public float[] func_230492_a_(float p_230492_1_, float p_230492_2_) {
//            return this.eveningColors;
//        }
    }
