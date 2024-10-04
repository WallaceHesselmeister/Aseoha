package com.code.aseoha.mixin;

import com.code.aseoha.misc.ICapPlayer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import net.tardis.mod.cap.entity.PlayerDataCapability;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerDataCapability.class)
public class PlayerDataCapMixin implements ICapPlayer {

    private boolean Aseoha$hasFlyedInTardis;
    private RegistryKey<World> Aseoha$interiorDimension;

    @Inject(method = "serializeNBT()Lnet/minecraft/nbt/CompoundNBT;", at = @At("HEAD"), remap = false)
    private void Aseoha$SerializeNBT(CallbackInfoReturnable<CompoundNBT> cir) {
        CompoundNBT Aseoha$Tag = new CompoundNBT();
        //
        Aseoha$Tag.putBoolean("hasFlyedInTardis", this.Aseoha$hasFlyedInTardis);
        if (this.Aseoha$hasFlyedInTardis && this.Aseoha$interiorDimension != null) {
            Aseoha$Tag.putString("flyingTardisInterior", this.getInteriorDimension().toString());
        }
    }

    @Inject(method = "deserializeNBT(Lnet/minecraft/nbt/CompoundNBT;)V", at = @At("HEAD"), remap = false)
    private void Aseoha$DeserializeNBT(CompoundNBT nbt, CallbackInfo ci){
        this.Aseoha$hasFlyedInTardis = nbt.getBoolean("hasFlyedInTardis");
        if(this.Aseoha$hasFlyedInTardis && nbt.contains("flyingTardisInterior") && !nbt.getString("flyingTardisInterior").isEmpty()) {
            this.Aseoha$interiorDimension = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(nbt.getString("flyingTardisInterior")));
        }
    }


    @Override
    public void setFlyingInTardis(boolean flying) {
        this.Aseoha$hasFlyedInTardis = flying;
    }

    @Override
    public boolean hasFlyedInTardis() {
        return this.Aseoha$hasFlyedInTardis;
    }

    @Override
    public void setInteriorDimension(RegistryKey<World> type) {
        this.Aseoha$interiorDimension = type;
    }

    @Override
    public RegistryKey<World> getInteriorDimension() {
        return this.Aseoha$interiorDimension;
    }
}
