package com.code.aseoha.mixin;

import com.code.aseoha.texturevariants.TextureVariants;
import net.minecraft.tileentity.TileEntityType;
import net.tardis.mod.tileentities.exteriors.TTCapsuleExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TTCapsuleExteriorTile.class)
public abstract class TTExterior extends ExteriorTile {

    public TTExterior(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
        this.setVariants(TextureVariants.TT);
    }

    @Inject(method = "<init>(Lnet/minecraft/tileentity/TileEntityType;)V", at = @At("TAIL"), remap = false)
    public void Aseoha$Constructor(TileEntityType tileEntityTypeIn, CallbackInfo ci) {
        this.setVariants(TextureVariants.TT);
    }
}