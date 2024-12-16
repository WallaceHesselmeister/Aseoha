package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithExterior;
import com.code.aseoha.misc.PassNotNull;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.ExteriorSizePacket;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class ShrinkProtocol extends Protocol {
    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
        ExteriorTile ext = console.getExteriorType().getExteriorTile(console);

        if (ext == null || console == null || world == null)
            return;

        boolean sw = !((IHelpWithConsole) console).Aseoha$GetExteriorSize();

        if (world.isClientSide) {
            playerIn.displayClientMessage(
                    new TranslationTextComponent("Shrink toggled " +
                            (!((IHelpWithConsole) console).Aseoha$GetExteriorSize() ? "Off" : "On")), true);
            playerIn.closeContainer();
            return;
        }

        ((IHelpWithConsole) console).Aseoha$SetExteriorSize(sw);
        ((IHelpWithExterior) ext).Aseoha$SetScale(sw);
        Networking.sendToClient((ServerPlayerEntity) playerIn, new ExteriorSizePacket(
                PassNotNull.NotNullWorldRegKey(console.getLevel().dimension(), world.dimension()).getRegistryName(), sw));
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.EXTERIOR_PROPERTIES;
    }
}
