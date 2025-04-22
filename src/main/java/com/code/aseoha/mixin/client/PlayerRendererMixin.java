package com.code.aseoha.mixin.client;

import com.code.aseoha.entities.DavrosChair;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerRenderer.class)
public abstract class PlayerRendererMixin extends LivingRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {

    public PlayerRendererMixin(EntityRendererManager p_i50965_1_, PlayerModel<AbstractClientPlayerEntity> p_i50965_2_, float p_i50965_3_) {
        super(p_i50965_1_, p_i50965_2_, p_i50965_3_);
    }

    @Inject(method = "setModelProperties(Lnet/minecraft/client/entity/player/AbstractClientPlayerEntity;)V", at = @At("TAIL"))
    public void Aseoha$SetModelProps(AbstractClientPlayerEntity p_177137_1_, CallbackInfo ci) {
        PlayerModel<AbstractClientPlayerEntity> playermodel = this.getModel();
        if (p_177137_1_.getVehicle() instanceof DavrosChair) {
            playermodel.leftLeg.visible = false;
            playermodel.leftPants.visible = false;
            playermodel.rightLeg.visible = false;
            playermodel.rightPants.visible = false;
        }
    }
}
