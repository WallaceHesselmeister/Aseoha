package com.code.aseoha.networking.Packets;

import com.code.aseoha.Helpers.IHelpWithExterior;
import com.code.aseoha.Helpers.TARDISHelper;
import com.code.aseoha.aseoha;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import net.tardis.mod.world.dimensions.TDimensions;

import java.util.function.Supplier;

public class EnterRWFPacket {
    public ResourceLocation console;

    public EnterRWFPacket(ResourceLocation console) {
        this.console = console;
    }

    public static void encode(EnterRWFPacket mes, PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
    }

    public static EnterRWFPacket decode(PacketBuffer buffer) {
        return new EnterRWFPacket(buffer.readResourceLocation());
    }

    public static void handle(EnterRWFPacket mes, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerWorld world = WorldHelper.getWorldFromRL(ServerLifecycleHooks.getCurrentServer(), mes.console);
            if (WorldHelper.areDimensionTypesSame(world, TDimensions.DimensionTypes.TARDIS_TYPE)) {
                TileEntity te = world.getBlockEntity(TardisHelper.TARDIS_POS);
                if (te instanceof ConsoleTile) {
                    ConsoleTile consoleTile = (ConsoleTile) te;

                    TardisEntity tardis = consoleTile.getEntity();

                    ExteriorTile Exterior = TARDISHelper.getExteriorTile(consoleTile);

                    if (Exterior != null && Exterior.getLevel() != null) {
                        Exterior.getLevel().addFreshEntity(tardis);
                        tardis.setConsole(consoleTile);
                        tardis.setExteriorTile(Exterior);
                        tardis.setInvulnerable(true);
                        tardis.setNoGravity(true);
                        WorldHelper.teleportEntities(tardis, (ServerWorld) Exterior.getLevel(), Exterior.getBlockPos(), 0, 90);
                        consoleTile.setEntity(tardis);

//                            this.relocatePlayerToExterior(p, (ServerWorld) Exterior.getLevel());
                        WorldHelper.teleportEntities(ctx.get().getSender(), (ServerWorld) Exterior.getLevel(), Exterior.getBlockPos(), 0, 90);
//                            this.getLevel().getServer().tell(new TickDelayedTask(1, () -> p.startRiding(tardis)));

                        Exterior.deleteExteriorBlocks();
                        ctx.get().getSender().startRiding(tardis);

                    }
                    assert tardis != null;
                    consoleTile.getPilot().startRiding(tardis);
                }
            }

        });
        ((NetworkEvent.Context) ctx.get()).setPacketHandled(true);
    }


}