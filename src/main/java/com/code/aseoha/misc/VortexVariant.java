package com.code.aseoha.misc;

import net.minecraft.util.ResourceLocation;

public class VortexVariant {
    private final ResourceLocation Texture;
    private final String Translation;

    public VortexVariant(ResourceLocation Texture, String Translation) {
        this.Texture = Texture;
        this.Translation = Translation;
    }

    public ResourceLocation GetTexture() {
        return this.Texture;
    }

    public String GetTranslation() {
        return this.Translation;
    }
}
