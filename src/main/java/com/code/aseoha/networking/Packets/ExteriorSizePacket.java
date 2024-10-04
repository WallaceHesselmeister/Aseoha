package com.code.aseoha.networking.Packets;

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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

public class ExteriorSizePacket {
    public ResourceLocation console;
    public int size;
    /**
     * Used for setting Exterior Size
     * @param console The ResourceLocation of the consoletile of the TARDIS that will have the coords set
     */
    public ExteriorSizePacket(ResourceLocation console, int size) {
        this.console = console;

    }

    public static void encode(@NotNull ExteriorSizePacket mes, @NotNull PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
        buffer.writeInt(mes.size);
    }

    @NotNull
    @Contract("_ -> new")
    public static ExteriorSizePacket decode(@NotNull PacketBuffer buffer) {
        return new ExteriorSizePacket(buffer.readResourceLocation(), buffer.readByte());
    }

    public static void handle(ExteriorSizePacket mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ((NetworkEvent.Context) ctx.get()).enqueueWork(() -> {
            ServerWorld world = Objects.requireNonNull(((NetworkEvent.Context) ctx.get()).getSender()).getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    if (((ConsoleTile) te) != null) {
                        ((IHelpWithConsole) (ConsoleTile) te).Aseoha$SetExteriorSize(mes.size);
                        ((ConsoleTile) te).updateClient();
                    }
                }
            }
        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}