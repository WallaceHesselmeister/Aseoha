package com.code.aseoha.networking.Packets;

import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
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

public class SetCoordsPacket {
    public ResourceLocation console;
    public int Coord;
    public Byte Axis;

    /**
     * Used for setting X, Y, or Z coord
     * @param console The ResourceLocation of the consoletile of the TARDIS that will have the coords set
     * @param axis Byte, 1 = X, 2 = Y, 3 = Z
     * @param coord An Integer value, the coord to be set
     */
    public SetCoordsPacket(ResourceLocation console, byte axis, int coord) {
        this.console = console;
        this.Coord = coord;
        this.Axis = axis;
    }

    public static void encode(@NotNull SetCoordsPacket mes, @NotNull PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
        buffer.writeByte(mes.Axis);
        buffer.writeInt(mes.Coord);
    }

    @NotNull
    @Contract("_ -> new")
    public static SetCoordsPacket decode(@NotNull PacketBuffer buffer) {
        return new SetCoordsPacket(buffer.readResourceLocation(), buffer.readByte(), buffer.readInt());
    }

    public static void handle(SetCoordsPacket mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ((NetworkEvent.Context) ctx.get()).enqueueWork(() -> {
            ServerWorld world = Objects.requireNonNull(((NetworkEvent.Context) ctx.get()).getSender()).getLevel();
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ConsoleTile consoleTile = (ConsoleTile) te;
                    if (consoleTile != null) {
                        if (mes.Axis == (byte) 1)
                            consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(mes.Coord, consoleTile.getDestinationPosition().getY(), consoleTile.getDestinationPosition().getZ()));
                        if (mes.Axis == (byte) 2)
                            consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(consoleTile.getDestinationPosition().getX(), mes.Coord, consoleTile.getDestinationPosition().getZ()));
                        if (mes.Axis == (byte) 3)
                            consoleTile.setDestination(consoleTile.getDestinationDimension(), new BlockPos(consoleTile.getDestinationPosition().getX(), consoleTile.getDestinationPosition().getY(), mes.Coord));
                    }
                }
            }
        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}