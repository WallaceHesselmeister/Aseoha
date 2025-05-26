package com.code.aseoha.networking.Packets.c2s;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.world.dimensions.TDimensions;

import java.util.Objects;
import java.util.function.Supplier;

public class ExitRWFPacketC2S {
    public ResourceLocation console;

    public ExitRWFPacketC2S(ResourceLocation console) {
        this.console = console;
    }

    public static void encode(ExitRWFPacketC2S mes, PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
    }

    public static ExitRWFPacketC2S decode(PacketBuffer buffer) {
        return new ExitRWFPacketC2S(buffer.readResourceLocation());
    }

    public static void handle(ExitRWFPacketC2S mes, Supplier<NetworkEvent.Context> ctx) {
        ((NetworkEvent.Context) ctx.get()).enqueueWork(() -> {
            ServerWorld world = Objects.requireNonNull(((NetworkEvent.Context) ctx.get()).getSender()).getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ConsoleTile consoleTile = (ConsoleTile) te;
//                    Console console = (Console)((IForgeRegistry) ConsoleRegistry.CONSOLE_REGISTRY.get()).getValue(mes.console);
                    ((IHelpWithConsole) consoleTile).Aseoha$CleanupRide();
                    ctx.get().getSender().setLevel(consoleTile.getLevel());
                    ctx.get().getSender().setPos(3, 128, 0);

                }
            }

        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}