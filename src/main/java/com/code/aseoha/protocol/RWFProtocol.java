package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;

public class RWFProtocol extends Protocol {
    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
        if (world.isClientSide)
            playerIn.closeContainer();
        console.setPilot(playerIn);
        ((IHelpWithConsole) console).Aseoha$SetRealWorldFlight(!((IHelpWithConsole) console).Aseoha$IsRealWorldFlight());
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
