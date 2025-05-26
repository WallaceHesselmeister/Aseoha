package com.code.aseoha.networking.Packets.s2c;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.WorldHelper;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.world.dimensions.TDimensions;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Supplier;

public class ExteriorSizePacketS2C {
    public ResourceLocation console;
    public boolean size;
    /**
     * Used for setting Exterior Size
     * @param console The ResourceLocation of the consoletile of the TARDIS
     */
    public ExteriorSizePacketS2C(ResourceLocation console, boolean size) {
        this.console = console;
        this.size = size;
    }

    public static void encode(@NotNull ExteriorSizePacketS2C mes, @NotNull PacketBuffer buffer) {
        buffer.writeResourceLocation(mes.console);
        buffer.writeBoolean(mes.size);
    }

    @NotNull
    @Contract("_ -> new")
    public static ExteriorSizePacketS2C decode(@NotNull PacketBuffer buffer) {
        return new ExteriorSizePacketS2C(buffer.readResourceLocation(), buffer.readBoolean());
    }

    public static void handle(ExteriorSizePacketS2C mes, @NotNull Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            World world = Objects.requireNonNull(ctx.get().getSender()).getLevel();
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