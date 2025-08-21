/* (C) TAMA Studios 2025 */
package tama.networking.s2c;

import java.util.UUID;
import java.util.function.Supplier;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.util.LogicalSidedProvider;
import net.minecraftforge.network.NetworkEvent;
import tama.Capabilities.Capabilities;
import tama.Capabilities.Interfaces.ITickrateCapability;
import tama.Capabilities.tick.TickrateCapabilityImpl;
import tama.Misc.TickrateManager;

public class UpdateTickratePacket {
    private final UUID uuid;
    private final ITickrateCapability cap;
    private final boolean reset;

    public UpdateTickratePacket(UUID uuid, ITickrateCapability cap, boolean reset) {
        this.uuid = uuid;
        this.cap = cap;
        this.reset = reset;
    }

    public UpdateTickratePacket(FriendlyByteBuf buf) {
        this.uuid = buf.readUUID();
        ITickrateCapability cap = new TickrateCapabilityImpl();
        cap.deserializeNBT(buf.readNbt());
        this.cap = cap;
        this.reset = buf.readBoolean();
    }

    public void encode(FriendlyByteBuf buf) {
        buf.writeUUID(this.uuid);
        buf.writeNbt(this.cap.serializeNBT());
        buf.writeBoolean(this.reset);
    }

    public static class Handler {
        public static boolean onMessage(UpdateTickratePacket message, Supplier<NetworkEvent.Context> ctx) {
            ctx.get().enqueueWork(() -> {
                if (ctx.get().getDirection().getReceptionSide().isClient()) {
                    LogicalSidedProvider.CLIENTWORLD
                            .get(ctx.get().getDirection().getReceptionSide())
                            .filter(ClientLevel.class::isInstance)
                            .ifPresent(t -> {
                                Entity entity = TickrateManager.getEntityByUUID(t, message.uuid);
                                ITickrateCapability cap = entity.getCapability(Capabilities.TICK_RATE)
                                        .orElse(new TickrateCapabilityImpl());
                                if (message.reset) {
                                    cap.resetTickrate();
                                } else {
                                    cap.sync(
                                            message.cap.isExcluded(),
                                            message.cap.shouldChangeSubEntities(),
                                            message.cap.shouldExcludeSubEntities(),
                                            message.cap.getBaseTimer().tickrate,
                                            message.cap.getCurrentTimer().tickrate,
                                            message.cap.getTick());
                                }
                            });
                }
            });
            ctx.get().setPacketHandled(true);
            return true;
        }
    }
}
