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

public class EOHInteractPacketC2S {

    public boolean intType;

    public EOHInteractPacketC2S(boolean intType) {
        this.intType = intType;
    }

    public static void encode(@NotNull EOHInteractPacketC2S mes, @NotNull PacketBuffer buffer) {
        buffer.writeBoolean(mes.intType);
    }

    @NotNull
    @Contract("_ -> new")
    public static EOHInteractPacketC2S decode(@NotNull PacketBuffer buffer) {
        return new EOHInteractPacketC2S(buffer.readBoolean());
    }

    public static void handle(EOHInteractPacketC2S mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerWorld world = ctx.get().getSender().getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ConsoleTile consoleTile = (ConsoleTile) te;
                    EOH eoh = ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().getBlockState().getBlock() instanceof EOH ? (EOH) ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().getBlockState().getBlock() : null;
                    if (eoh == null) return;
                    if (mes.intType) {
                        eoh.setHasStar(true);
                        eoh.Mark();
                        eoh.LastPlayerClick.getMainHandItem().shrink(1);
                    } else ((IHelpWithConsole) consoleTile).Aseoha$GetEOH().Activate();
                    eoh.Mark();
                }
            }

        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}