/* (C) TAMA Studios 2025 */
package tama.networking;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.server.ServerLifecycleHooks;
import tama.aseoha;
import tama.networking.s2c.UpdateAreaTickratePacket;
import tama.networking.s2c.UpdateDimensionTickratePacket;
import tama.networking.s2c.UpdateTickratePacket;

public class Networking {
    public static int ID;
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(aseoha.MODID, "aseoha"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals);

    public static void registerMessages() {
        CHANNEL.registerMessage(
                ID++,
                UpdateTickratePacket.class,
                UpdateTickratePacket::encode,
                UpdateTickratePacket::new,
                UpdateTickratePacket.Handler::onMessage);
        CHANNEL.registerMessage(
                ID++,
                UpdateDimensionTickratePacket.class,
                UpdateDimensionTickratePacket::encode,
                UpdateDimensionTickratePacket::new,
                UpdateDimensionTickratePacket.Handler::onMessage);
        CHANNEL.registerMessage(
                ID++,
                UpdateAreaTickratePacket.class,
                UpdateAreaTickratePacket::encode,
                UpdateAreaTickratePacket::new,
                UpdateAreaTickratePacket.Handler::onMessage);
    }

    public static <MSG> void sendToServer(MSG message) {
        CHANNEL.sendToServer(message);
    }

    public static <MSG> void sendToAll(MSG message) {
        for (ServerPlayer player :
                ServerLifecycleHooks.getCurrentServer().getPlayerList().getPlayers()) {
            CHANNEL.sendTo(message, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
        }
    }
}
