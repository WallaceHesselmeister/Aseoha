package com.code.aseoha.mixin;

import com.code.aseoha.texturevariants.TextureVariants;
import net.minecraft.tileentity.TileEntityType;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.exteriors.TTCapsuleExteriorTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;

@Mixin(TTCapsuleExteriorTile.class)
public abstract class TTTile extends ExteriorTile {
    public TTTile(TileEntityType<?> p_i48289_1_) {
        super(p_i48289_1_);
        ((TTCapsuleExteriorTile) (Object) this).setVariants(TextureVariants.TT);
    }
//private List<TexVariant> variants = new ArrayList<TexVariant>();
//    @Shadow(aliases = "<clinit>") abstract void _clinit_();

    @Inject(at = @At(value = "TAIL"), method = "<init>()V", remap = false)
    private void Aseoha$TTCapsuleExteriorTile(CallbackInfo info) {
//        this.setVariants(TextureVariants.TT);
        ((TTCapsuleExteriorTile) (Object) this).setVariants(TextureVariants.TT);
    }
}
