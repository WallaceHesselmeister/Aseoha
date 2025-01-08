package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithExteriorTexVariants;
import com.code.aseoha.aseoha;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.texturevariants.TextureVariants;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TextureVariants.class)
public class ExteriorTexVariantsMixin implements IHelpWithExteriorTexVariants {
    @Shadow(remap = false)
    public static TexVariant[] STEAM = aseoha.SteamVariants.toArray(new TexVariant[0]);

    @Override
    public void aseoha$SetSteamTex() {
        STEAM = aseoha.SteamVariants.toArray(new TexVariant[0]);
    }
}
