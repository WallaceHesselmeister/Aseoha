package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.RWFPacket;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class RWFProtocol extends Protocol {
    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
//        ((IHelpWithConsole) console).Aseoha$SetHads(!((IHelpWithConsole) console).Aseoha$GetHads());
//        for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(128))) {
            ExteriorTile ext = console.getExteriorType().getExteriorTile(console);
//        ((IHelpWithConsole) console).

//        ((IHelpWithConsole) console).setRealWorldFlight(!((IHelpWithConsole) console).isRealWorldFlight());
        ((IHelpWithConsole) console).Aseoha$SetRealWorldFlight(true);
        Networking.sendToServer(new RWFPacket(console.getType().getRegistryName()));
//        Networking.sendToServer(new RWFToggle(console.getType().getRegistryName()));
        playerIn.displayClientMessage(new TranslationTextComponent("Real World Flight toggled " + ((IHelpWithConsole) console).Aseoha$IsRealWorldFlight()), true);
        if(world.isClientSide)
            playerIn.closeContainer();
//        }
//        if (world.isClientSide) {
//        }
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
