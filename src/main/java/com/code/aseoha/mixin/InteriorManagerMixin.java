package com.code.aseoha.mixin;

import com.code.aseoha.aseoha;
import com.code.aseoha.Helpers.IHelpWithExterior;
import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.common.util.INBTSerializable;
import net.tardis.mod.misc.ITickable;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.InteriorManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InteriorManager.class)
public abstract class InteriorManagerMixin implements INBTSerializable<CompoundNBT>, ITickable {
//    @Shadow(remap = false) private ConsoleTile console;

    @Shadow(remap = false) private ConsoleTile console;

    @Inject(method = "setLight(I)V", at = @At("TAIL"), remap = false)
    private void Aseoha$SetLight(int light, CallbackInfo ci){
        ((IHelpWithExterior) this.console.getExteriorType().getExteriorTile(this.console)).Aseoha$SetLight((byte) light);
        aseoha.LOGGER.info(((IHelpWithExterior) this.console.getExteriorType().getExteriorTile(this.console)).Aseoha$GetLight());
    }
}
