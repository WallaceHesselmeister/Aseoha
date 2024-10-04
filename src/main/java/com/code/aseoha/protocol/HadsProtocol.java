package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;

public class HadsProtocol extends Protocol {

    public static final String HADS = "Turned HADs ";

    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
        ((IHelpWithConsole) console).Aseoha$SetHads(!((IHelpWithConsole) console).Aseoha$GetHads());
        if (world.isClientSide) {
            for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(16))) {
                player.displayClientMessage(new TranslationTextComponent(HADS + (((IHelpWithConsole) console).Aseoha$GetHads() ? "On" : "Off")), true);
                player.closeContainer();
            }
        }
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
