package com.code.aseoha.networking.Packets;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.network.PacketBuffer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.world.dimensions.TDimensions;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;

public class PlayerItemRemovePacket {
    public UUID player;
    /**
     * Used for removing the ItemStack in the players Main hand
     * @param player The UUID of the Player
     */
    public PlayerItemRemovePacket(UUID player) {
        this.player = player;

    }

    public static void encode(@NotNull PlayerItemRemovePacket mes, @NotNull PacketBuffer buffer) {
        buffer.writeUUID(mes.player);
    }

    @NotNull
    @Contract("_ -> new")
    public static PlayerItemRemovePacket decode(@NotNull PacketBuffer buffer) {
        return new PlayerItemRemovePacket(buffer.readUUID());
    }

    public static void handle(PlayerItemRemovePacket mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ((NetworkEvent.Context) ctx.get()).enqueueWork(() -> {
            ServerWorld world = ((NetworkEvent.Context) ctx.get()).getSender().getLevel();
            if(world != null && world.getPlayerByUUID(mes.player) != null)
                if(!world.getPlayerByUUID(mes.player).abilities.instabuild)
                    world.getPlayerByUUID(mes.player).getMainHandItem().shrink(1);
        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}