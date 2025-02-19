package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;

public class IsomorphicProtocol extends Protocol {
    public static final String ISOMORPHIC = "Turned Isomorphic Security ";
    public static final TranslationTextComponent TRANS_ON = new TranslationTextComponent("protocol.aseoha.isomorphic.off");
    public static final TranslationTextComponent TRANS_OFF = new TranslationTextComponent("protocol.aseoha.isomorphic.on");

    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
        ((IHelpWithConsole) console).Aseoha$SetIsomorphic(!((IHelpWithConsole) console).Aseoha$GetIsomorphic());

        if (world.isClientSide) {
            playerIn.sendMessage(new TranslationTextComponent(ISOMORPHIC + (((IHelpWithConsole) console).Aseoha$GetIsomorphic() ? "On" : "Off")), playerIn.getUUID());
            playerIn.closeContainer();
        }
    }

    public TranslationTextComponent getDisplayName(ConsoleTile tile) {
        return ((IHelpWithConsole) tile).Aseoha$GetIsomorphic() ? TRANS_ON : TRANS_OFF;
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
