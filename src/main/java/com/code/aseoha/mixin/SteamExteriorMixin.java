package com.code.aseoha.mixin;

import net.minecraft.tileentity.TileEntityType;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import net.tardis.mod.tileentities.exteriors.SteampunkExteriorTile;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(SteampunkExteriorTile.class)
public abstract class SteamExteriorMixin extends ExteriorTile {
    public SteamExteriorMixin(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

//    @Inject(method = "<init>", at = @At("TAIL"))
//    private void SteamExteriorInit(CallbackInfo ci) {
//        TardisHelper.getConsoleInWorld(ServerLifecycleHooks.getCurrentServer().getLevel(this.getInteriorDimensionKey())).ifPresent((console) -> {
//            console.getExteriorType().getExteriorTile(console).setVariants(aseoha.SteamVariants.toArray(new TexVariant[0]));
//        });
//    }
}
