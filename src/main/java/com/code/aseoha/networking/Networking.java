package com.code.aseoha.networking;

import com.code.aseoha.aseoha;
import com.code.aseoha.networking.Packets.*;
import com.code.aseoha.networking.Packets.c2s.*;
import com.code.aseoha.networking.Packets.s2c.ExteriorSizePacketS2C;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.Dimension;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
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
        INSTANCE.registerMessage(iterator(), TakeOffFromClientPacketC2S.class, TakeOffFromClientPacketC2S::encode, TakeOffFromClientPacketC2S::decode, TakeOffFromClientPacketC2S::handle);
        INSTANCE.registerMessage(iterator(), ToggleLocksPacketC2S.class, ToggleLocksPacketC2S::encode, ToggleLocksPacketC2S::decode, ToggleLocksPacketC2S::handle);
        INSTANCE.registerMessage(iterator(), SetCoordsPacketC2S.class, SetCoordsPacketC2S::encode, SetCoordsPacketC2S::decode, SetCoordsPacketC2S::handle);
        INSTANCE.registerMessage(iterator(), ExitRWFPacketC2S.class, ExitRWFPacketC2S::encode, ExitRWFPacketC2S::decode, ExitRWFPacketC2S::handle);
        INSTANCE.registerMessage(iterator(), UpdateControlsPacketC2S.class, UpdateControlsPacketC2S::encode, UpdateControlsPacketC2S::decode, UpdateControlsPacketC2S::handle);
        INSTANCE.registerMessage(iterator(), UpdateClientPacket.class, UpdateClientPacket::encode, UpdateClientPacket::decode, UpdateClientPacket::handle);
        INSTANCE.registerMessage(iterator(), ExteriorSizePacketS2C.class, ExteriorSizePacketS2C::encode, ExteriorSizePacketS2C::decode, ExteriorSizePacketS2C::handle);
        INSTANCE.registerMessage(iterator(), TardisInputMessagePacket.class, TardisInputMessagePacket::encode, TardisInputMessagePacket::decode, TardisInputMessagePacket::handle);
        INSTANCE.registerMessage(iterator(), EOHInteractPacketC2S.class, EOHInteractPacketC2S::encode, EOHInteractPacketC2S::decode, EOHInteractPacketC2S::handle);
        INSTANCE.registerMessage(iterator(), PlayerItemRemovePacketC2S.class, PlayerItemRemovePacketC2S::encode, PlayerItemRemovePacketC2S::decode, PlayerItemRemovePacketC2S::handle);
        INSTANCE.registerMessage(iterator(), EnterRWFPacket.class, EnterRWFPacket::encode, EnterRWFPacket::decode, EnterRWFPacket::handle);
    }

    public static void sendToServer(Object msg) {
        INSTANCE.sendToServer(msg);
    }

    public static void sendToClient(ServerPlayerEntity Player, Object msg) {
        INSTANCE.sendTo(msg, Player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
    }

    public static void sendToDimension(RegistryKey<World> dimension, Object msg) {
        INSTANCE.send(
                PacketDistributor.DIMENSION.with(() -> dimension),
                msg
        );}

    /**
     * @return This returns the current id+1, that way we always get a unique ID
     */
    private static int iterator() {
        return i++;
    }
}