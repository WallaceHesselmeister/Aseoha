package com.code.aseoha.networking.Packets.s2c;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.block.EOHLink;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.world.dimensions.TDimensions;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class EOHSyncPacketS2C {

    public EOHSyncPacketS2C() {}

    public static void encode(@NotNull EOHSyncPacketS2C mes, @NotNull PacketBuffer buffer) {
    }

    @NotNull
    @Contract("_ -> new")
    public static EOHSyncPacketS2C decode(@NotNull PacketBuffer buffer) {
        return new EOHSyncPacketS2C();
    }

    public static void handle(EOHSyncPacketS2C mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerWorld world = ctx.get().getSender().getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ConsoleTile consoleTile = (ConsoleTile) te;
                    EOHLink eoh = ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().getBlockState().getBlock() instanceof EOHLink ? (EOHLink) ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().getBlockState().getBlock() : null;
                    if (eoh == null) return;
                    eoh.Mark();
                }
            }
//            else if (ServerWorld.OVERWORLD.equals(world.dimension())) {
//                world.getCapability(OverworldCapabilityProvider.CAPABILITY).ifPresent(cap -> {
//                    IChunk chunk = world.getWorldServer().getChunk(new BlockPos(0, 60, 0));
//                    if (chunk.getBlockState())
//                });
//
//            }

        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}