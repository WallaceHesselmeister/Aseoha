package com.code.aseoha.mixin;

import com.code.aseoha.Helpers.IHelpWithMonitor;
import com.code.aseoha.tileentities.consoles.CopperConsoleTile;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.MonitorControl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MonitorControl.class)
public abstract class MonitorMixin implements IHelpWithMonitor {

    @Unique
    float Aseoha$Rot;

    @Override
    public float Aseoha$GetRot(){
        return this.Aseoha$Rot;
    }

    @Override
    public void Aseoha$SetRot(float rot){
        this.Aseoha$Rot = rot;
    }

    @Inject(at = @At("TAIL"), method = "serializeNBT()Lnet/minecraft/nbt/CompoundNBT;", remap = false)
    public void Aseoha$Serialize(CallbackInfoReturnable<CompoundNBT> cir){
        cir.getReturnValue().putFloat("aseoha_monitor_rot", this.Aseoha$Rot);
    }

    @Inject(at = @At("TAIL"), method = "deserializeNBT(Lnet/minecraft/nbt/CompoundNBT;)V", remap = false)
    public void Aseoha$Deserialize(CompoundNBT nbt, CallbackInfo ci){
        this.Aseoha$Rot = nbt.getFloat("aseoha_monitor_rot");
    }

    @Inject(at = @At("HEAD"), method = "getPos()Lnet/minecraft/util/math/vector/Vector3d;", remap = false, cancellable = true)
    public void Aseoha$GetPos(CallbackInfoReturnable<Vector3d> cir){
        if(((MonitorControl) (Object) this).getConsole() instanceof CopperConsoleTile) {
            cir.setReturnValue(new Vector3d(.8, 1.6, .8));
        }
    }

}

