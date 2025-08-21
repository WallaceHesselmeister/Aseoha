/* (C) TAMA Studios 2025 */
package tama.networking.s2c;

import java.util.function.Supplier;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.util.LogicalSidedProvider;
import net.minecraftforge.network.NetworkEvent;
import tama.Misc.TickrateManager;
import tama.Misc.TimerIMPL;

public class UpdateDimensionTickratePacket {
    private final ResourceKey<Level> dimension;
    private final float tickrate;

    public UpdateDimensionTickratePacket(ResourceKey<Level> dimension, float tickrate) {
        this.dimension = dimension;
        this.tickrate = tickrate;
    }

    public UpdateDimensionTickratePacket(FriendlyByteBuf buf) {
        this.dimension = buf.readResourceKey(Registries.DIMENSION);
        this.tickrate = buf.readFloat();
    }

    public void encode(FriendlyByteBuf buf) {
        buf.writeResourceKey(this.dimension);
        buf.writeFloat(this.tickrate);
    }

    public static class Handler {
        public static boolean onMessage(UpdateDimensionTickratePacket message, Supplier<NetworkEvent.Context> ctx) {
            ctx.get().enqueueWork(() -> {
                if (ctx.get().getDirection().getReceptionSide().isClient()) {
                    LogicalSidedProvider.CLIENTWORLD
                            .get(ctx.get().getDirection().getReceptionSide())
                            .filter(ClientLevel.class::isInstance)
                            .ifPresent(t -> {
                                if (message.tickrate == 20) {
                                    if (TickrateManager.LEVEL_MAP.containsKey(message.dimension)) {
                                        TickrateManager.LEVEL_MAP.remove(message.dimension);
                                    }
                                } else {
                                    TickrateManager.LEVEL_MAP.put(
                                            message.dimension, new TimerIMPL(message.tickrate, 0L));
                                }
                            });
                }
            });
            ctx.get().setPacketHandled(true);
            return true;
        }
    }
}
