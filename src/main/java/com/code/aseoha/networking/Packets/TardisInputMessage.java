package com.code.aseoha.networking.Packets;


import com.code.aseoha.Helpers.IHelpWithTardisEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.entity.TardisEntity;

import java.util.function.Supplier;

public class TardisInputMessage {

    public boolean isJumping;

    public TardisInputMessage(boolean jump) {
        this.isJumping = jump;
    }

    public static void encode(TardisInputMessage mes, PacketBuffer buf) {
        buf.writeBoolean(mes.isJumping);
    }

    public static TardisInputMessage decode(PacketBuffer buf) {
        boolean isJumping = buf.readBoolean();

        return new TardisInputMessage(isJumping);
    }

    public static void handle(TardisInputMessage mes, Supplier<NetworkEvent.Context> context) {
        context.get().enqueueWork(() -> {
            if(context.get().getSender().getVehicle() != null && context.get().getSender().getVehicle() instanceof TardisEntity) {
                TardisEntity entity = (TardisEntity)context.get().getSender().getVehicle();

                ((IHelpWithTardisEntity) entity).setJumping(mes.isJumping);
            }
        });
        context.get().setPacketHandled(true);
    }

}
