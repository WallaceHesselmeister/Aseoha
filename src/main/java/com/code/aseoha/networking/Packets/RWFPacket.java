package com.code.aseoha.networking.Packets;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;


public class RWFPacket {
    ResourceLocation console;
    /**
     * Used for setting Exterior Size
     * @param console The ResourceLocation of the consoletile of the TARDIS that will have the coords set
     */
    public RWFPacket(ResourceLocation console) {
        this.console = console;

    }

    public static void encode(@NotNull RWFPacket mes, @NotNull PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
//        buffer.writeInt(mes.size);
    }

    @NotNull
    @Contract("_ -> new")
    public static RWFPacket decode(@NotNull PacketBuffer buffer) {
        return new RWFPacket(buffer.readResourceLocation());
    }

    public static void handle(RWFPacket mes, @NotNull Supplier<NetworkEvent.Context> context) {
        context.get().enqueueWork(() -> {
            if(Objects.requireNonNull(context.get().getSender()).getVehicle() != null) {
                if(Objects.requireNonNull(context.get().getSender()).getVehicle() instanceof TardisEntity) {
                    TardisEntity entity = (TardisEntity) Objects.requireNonNull(context.get().getSender()).getVehicle();
                    assert entity != null;
                    if(entity.getConsole() != null) {
                        ((IHelpWithConsole) entity.getConsole()).Aseoha$StopRide(false);
                    }
                }
            } else {
                TileEntity te = Objects.requireNonNull(context.get().getSender()).getLevel().getBlockEntity(TardisHelper.TARDIS_POS);
                if(te instanceof ConsoleTile) {
                    ConsoleTile console = (ConsoleTile)te;

                    if(((IHelpWithConsole) console).Aseoha$IsRealWorldFlight()) {
                        ((IHelpWithConsole) console).Aseoha$Ride(context.get().getSender());
                    } else {
                        context.get().getSender().sendMessage(new StringTextComponent(new TranslationTextComponent("message.tardis.control.real_world_flight_not_possible").toString()), context.get().getSender().getUUID());
                    }
                }
            }
        });
        context.get().setPacketHandled(true);
//        ((NetworkEvent.Context) context.get()).enqueueWork(() -> {
//            aseoha.LOGGER.info("Inside Packet");
//            if(Objects.requireNonNull(context.get().getSender()).getVehicle() != null) {
//                if(Objects.requireNonNull(context.get().getSender()).getVehicle() instanceof TardisEntity) {
//                    TardisEntity entity = (TardisEntity) Objects.requireNonNull(context.get().getSender()).getVehicle();
//                    assert entity != null;
//                    if(entity.getConsole() != null) {
//                        ((IHelpWithConsole) entity.getConsole()).stopRide(false);
//                    }
//                }
//            } else {
//                TileEntity te = Objects.requireNonNull(context.get().getSender()).getLevel().getBlockEntity(TardisHelper.TARDIS_POS);
//                if(te instanceof ConsoleTile) {
//                    ConsoleTile console = (ConsoleTile)te;
//
//                    if(((IHelpWithConsole) console).isRealWorldFlight()) {
//                        ((IHelpWithConsole) console).ride(context.get().getSender());
//                    } else {
//                        Objects.requireNonNull(context.get().getSender()).sendMessage(new TranslationTextComponent("message.tardis.control.real_world_flight_not_possible"), Objects.requireNonNull(context.get().getSender()).getUUID());
//                    }
//                }
//            }
//        });
//        ((NetworkEvent.Context) context.get()).setPacketHandled(true);
    }

}