package com.code.aseoha.networking.Packets.c2s;

import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.world.dimensions.TDimensions;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

public class UpdateControlsPacketC2S {
//    public static void handle(MyMessage msg, Supplier<NetworkEvent.Context> ctx) {
//        ctx.get().enqueueWork(() -> {
//            // Work that needs to be thread-safe (most work)
//            ServerPlayerEntity sender = ctx.get().getSender(); // the client that sent this packet
//            // Do stuff
//        });
//        ctx.get().setPacketHandled(true);
//    }

    public ResourceLocation console;

    public UpdateControlsPacketC2S(ResourceLocation console) {
        this.console = console;
    }

    public static void encode(@NotNull UpdateControlsPacketC2S mes, @NotNull PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
    }

    @NotNull
    @Contract("_ -> new")
    public static UpdateControlsPacketC2S decode(@NotNull PacketBuffer buffer) {
        return new UpdateControlsPacketC2S(buffer.readResourceLocation());
    }

    public static void handle(UpdateControlsPacketC2S mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ((NetworkEvent.Context) ctx.get()).enqueueWork(() -> {
            ServerWorld world = Objects.requireNonNull(((NetworkEvent.Context) ctx.get()).getSender()).getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ((ConsoleTile) te).removeControls();
                    ((ConsoleTile) te).getOrCreateControls();
                    ((ConsoleTile) te).updateClient();
                }
            }

        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}