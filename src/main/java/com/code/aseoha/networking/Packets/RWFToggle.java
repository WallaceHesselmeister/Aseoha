package com.code.aseoha.networking.Packets;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;


public class RWFToggle {
    ResourceLocation console;
    /**
     * Used for setting Exterior Size
     * @param console The ResourceLocation of the consoletile of the TARDIS that will have the coords set
     */
    public RWFToggle(ResourceLocation console) {
        this.console = console;

    }

    public static void encode(@NotNull RWFToggle mes, @NotNull PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
//        buffer.writeInt(mes.size);
    }

    @NotNull
    @Contract("_ -> new")
    public static RWFToggle decode(@NotNull PacketBuffer buffer) {
        return new RWFToggle(buffer.readResourceLocation());
    }

    public static void handle(RWFToggle mes, @NotNull Supplier<NetworkEvent.Context> context) {
        ((NetworkEvent.Context) context.get()).enqueueWork(() -> {
                TileEntity te = Objects.requireNonNull(context.get().getSender()).getLevel().getBlockEntity(TardisHelper.TARDIS_POS);
                if(te instanceof ConsoleTile) {
                    ConsoleTile console = (ConsoleTile)te;
                    ((IHelpWithConsole) console).Aseoha$SetRealWorldFlight(!((IHelpWithConsole) console).Aseoha$IsRealWorldFlight());
                    console.setChanged();
                    console.updateClient();
//                        ((IHelpWithConsole) console).ride(context.get().getSender());
//                    } else {
//                        Objects.requireNonNull(context.get().getSender()).sendMessage(new TranslationTextComponent("message.tardis.control.real_world_flight_not_possible"), Objects.requireNonNull(context.get().getSender()).getUUID());
//                    }
                }
        });
        ((NetworkEvent.Context) context.get()).setPacketHandled(true);
    }

}