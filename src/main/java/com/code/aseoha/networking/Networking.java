package com.code.aseoha.networking;

import com.code.aseoha.aseoha;
import com.code.aseoha.networking.Packets.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.simple.SimpleChannel;

/**
 * Important stuff.
 */
public class Networking {
    private static final String PROTOCOL_VERSION = "1";
    private static int i = 0;
    public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(aseoha.MODID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static void init() {
        INSTANCE.registerMessage(iterator(), TakeOffFromClient.class, TakeOffFromClient::encode, TakeOffFromClient::decode, TakeOffFromClient::handle);
        INSTANCE.registerMessage(iterator(), ToggleLocks.class, ToggleLocks::encode, ToggleLocks::decode, ToggleLocks::handle);
        INSTANCE.registerMessage(iterator(), SetCoords.class, SetCoords::encode, SetCoords::decode, SetCoords::handle);
        INSTANCE.registerMessage(iterator(), UpdateControls.class, UpdateControls::encode, UpdateControls::decode, UpdateControls::handle);
        INSTANCE.registerMessage(iterator(), UpdateClientPacket.class, UpdateClientPacket::encode, UpdateClientPacket::decode, UpdateClientPacket::handle);
        INSTANCE.registerMessage(iterator(), ExteriorSizePacket.class, ExteriorSizePacket::encode, ExteriorSizePacket::decode, ExteriorSizePacket::handle);
        INSTANCE.registerMessage(iterator(), RWFPacket.class, RWFPacket::encode, RWFPacket::decode, RWFPacket::handle);
        INSTANCE.registerMessage(iterator(), RWFToggle.class, RWFToggle::encode, RWFToggle::decode, RWFToggle::handle);
        INSTANCE.registerMessage(iterator(), TardisInputMessage.class, TardisInputMessage::encode, TardisInputMessage::decode, TardisInputMessage::handle);
        INSTANCE.registerMessage(iterator(), EOHInteractPacket.class, EOHInteractPacket::encode, EOHInteractPacket::decode, EOHInteractPacket::handle);
        //INSTANCE.registerMessage(iterator(), .class, ::encode, ::decode, ::handle);
        //DistExecutor.safeRunWhenOn(Dist.CLIENT, () ->
    }

    public static void sendToServer(Object msg) {
        INSTANCE.sendToServer(msg);
    }
//    public static void SendToClientTracking(Object Msg) {INSTANCE.send(}

    /**
     * @return This returns the current id+1, that way we always get a unique ID
     */
    private static int iterator() {
        return i++;
    }
}