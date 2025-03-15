package com.code.aseoha.networking.Packets.c2s;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.block.EOH;
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

public class EOHSyncPacketC2S {

    public EOHSyncPacketC2S() {}

    public static void encode(@NotNull EOHSyncPacketC2S mes, @NotNull PacketBuffer buffer) {
    }

    @NotNull
    @Contract("_ -> new")
    public static EOHSyncPacketC2S decode(@NotNull PacketBuffer buffer) {
        return new EOHSyncPacketC2S();
    }

    public static void handle(EOHSyncPacketC2S mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerWorld world = ctx.get().getSender().getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ConsoleTile consoleTile = (ConsoleTile) te;
                    EOH eoh = ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().getBlockState().getBlock() instanceof EOH ? (EOH) ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().getBlockState().getBlock() : null;
                    if (eoh == null) return;
                    eoh.Mark();
                }
            }

        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}