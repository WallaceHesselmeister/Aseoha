package com.code.aseoha.networking.Packets.c2s;

import net.minecraft.network.PacketBuffer;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.function.Supplier;

public class PlayerItemRemovePacketC2S {
    public UUID player;
    /**
     * Used for removing the ItemStack in the players Main hand
     * @param player The UUID of the Player
     */
    public PlayerItemRemovePacketC2S(UUID player) {
        this.player = player;

    }

    public static void encode(@NotNull PlayerItemRemovePacketC2S mes, @NotNull PacketBuffer buffer) {
        buffer.writeUUID(mes.player);
    }

    @NotNull
    @Contract("_ -> new")
    public static PlayerItemRemovePacketC2S decode(@NotNull PacketBuffer buffer) {
        return new PlayerItemRemovePacketC2S(buffer.readUUID());
    }

    public static void handle(PlayerItemRemovePacketC2S mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ((NetworkEvent.Context) ctx.get()).enqueueWork(() -> {
            ServerWorld world = ((NetworkEvent.Context) ctx.get()).getSender().getLevel();
            if(world == null || world.getPlayerByUUID(mes.player) != null) return;
            world.getPlayerByUUID(mes.player).getMainHandItem().shrink(1);
        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}