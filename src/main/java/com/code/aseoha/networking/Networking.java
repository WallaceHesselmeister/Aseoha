package com.code.aseoha.networking;

import com.code.aseoha.aseoha;
import com.code.aseoha.networking.Packets.*;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkDirection;
import net.minecraftforge.fml.network.NetworkRegistry;
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
        INSTANCE.registerMessage(iterator(), TakeOffFromClientPacket.class, TakeOffFromClientPacket::encode, TakeOffFromClientPacket::decode, TakeOffFromClientPacket::handle);
        INSTANCE.registerMessage(iterator(), ToggleLocksPacket.class, ToggleLocksPacket::encode, ToggleLocksPacket::decode, ToggleLocksPacket::handle);
        INSTANCE.registerMessage(iterator(), SetCoordsPacket.class, SetCoordsPacket::encode, SetCoordsPacket::decode, SetCoordsPacket::handle);
        INSTANCE.registerMessage(iterator(), ExitRWFPacket.class, ExitRWFPacket::encode, ExitRWFPacket::decode, ExitRWFPacket::handle);
        INSTANCE.registerMessage(iterator(), UpdateControlsPacket.class, UpdateControlsPacket::encode, UpdateControlsPacket::decode, UpdateControlsPacket::handle);
        INSTANCE.registerMessage(iterator(), UpdateClientPacket.class, UpdateClientPacket::encode, UpdateClientPacket::decode, UpdateClientPacket::handle);
        INSTANCE.registerMessage(iterator(), ExteriorSizePacket.class, ExteriorSizePacket::encode, ExteriorSizePacket::decode, ExteriorSizePacket::handle);
        INSTANCE.registerMessage(iterator(), TardisInputMessagePacket.class, TardisInputMessagePacket::encode, TardisInputMessagePacket::decode, TardisInputMessagePacket::handle);
        INSTANCE.registerMessage(iterator(), EOHInteractPacket.class, EOHInteractPacket::encode, EOHInteractPacket::decode, EOHInteractPacket::handle);
        INSTANCE.registerMessage(iterator(), PlayerItemRemovePacket.class, PlayerItemRemovePacket::encode, PlayerItemRemovePacket::decode, PlayerItemRemovePacket::handle);
        INSTANCE.registerMessage(iterator(), EnterRWFPacket.class, EnterRWFPacket::encode, EnterRWFPacket::decode, EnterRWFPacket::handle);
    }

    public static void sendToServer(Object msg) {
        INSTANCE.sendToServer(msg);
    }

    public static void sendToClient(ServerPlayerEntity Player, Object msg) {
        INSTANCE.sendTo(msg, Player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
    }

    /**
     * @return This returns the current id+1, that way we always get a unique ID
     */
    private static int iterator() {
        return i++;
    }
}