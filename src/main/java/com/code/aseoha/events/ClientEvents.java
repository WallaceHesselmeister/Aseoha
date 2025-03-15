package com.code.aseoha.events;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.KeyboardHelper;
import com.code.aseoha.Config;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.c2s.ExitRWFPacketC2S;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.sounds.TSounds;

@Mod.EventBusSubscriber(modid = "aseoha", value = Dist.CLIENT)
public class ClientEvents {

//    @SubscribeEvent
//    @OnlyIn(Dist.CLIENT)
//    public static void onJump(@NotNull InputUpdateEvent update) {
//        LivingEntity liv = update.getEntityLiving();
//
//        if(liv instanceof PlayerEntity && liv.equals(ClientHelper.getClientPlayer())) {
//            if(liv.getVehicle() != null) {
//                if (liv.getVehicle() instanceof TardisEntity) {
//                    TardisEntity entity = (TardisEntity) liv.getVehicle();
//
////                entity.setJumping(update.getMovementInput().jump);
//                    Networking.sendToServer(new TardisInputMessage(update.getMovementInput().jumping));
//                }
//            }
//        }
//    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onKey(InputEvent.KeyInputEvent e) {
        if (Minecraft.getInstance().level != null) {
            if (KeyboardHelper.isHoldingControl()) {
                PlayerEntity entity = ClientHelper.getClientPlayer();
                if (entity.getVehicle() != null && entity.getVehicle() instanceof TardisEntity)
                    if(((TardisEntity) entity.getVehicle()).getConsole() != null) {
                        if(((IHelpWithConsole) ((TardisEntity) entity.getVehicle()).getConsole()).Aseoha$IsRealWorldFlight())
                            Networking.sendToServer(new ExitRWFPacketC2S(((TardisEntity) entity.getVehicle()).getConsole().getLevel().dimension().getRegistryName()));
                    }
            }
        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onSoundPlayed(PlaySoundEvent event){
        if(!Config.COMMON.ShouldAmbientSoundsPlay.get() && event.getSound().getLocation() == TSounds.AMBIENT_CREAKS.getId()){
            ClientHelper.shutTheFuckUp(TSounds.AMBIENT_CREAKS.get(), event.getSound().getSource());
        }
    }



//    /**
//     * This keeps legs from displaying in the Davros Chair
    // (No it doesn't, don't work)
//     *
//     * @param event RenderPlayerEvent
//     */
//    @SubscribeEvent
//    public void playerRender(RenderPlayerEvent event) {
//        if (event.getPlayer().getVehicle() != null) {
//            if (event.getPlayer().getVehicle() instanceof DavrosChair) {
//                event.getRenderer().getModel().leftLeg.visible = false;
//                event.getRenderer().getModel().rightLeg.visible = false;
//                event.getRenderer().getModel().leftPants.visible = false;
//                event.getRenderer().getModel().rightPants.visible = false;
//            }
//        }
//    }

//    @SubscribeEvent
//    @OnlyIn(Dist.CLIENT)
//    public static void ClientSetup(FMLClientSetupEvent event){
//    }
}
