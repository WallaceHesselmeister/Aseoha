package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;

public class MaintenanceProtocol extends Protocol {

    public static final String MAINTENANCE = "Turned Maintenance Protocols ";

    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
        ((IHelpWithConsole) console).Aseoha$SetMaintenance(!((IHelpWithConsole) console).Aseoha$GetMaintenance());
        if (world.isClientSide) {
            for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(16))) {
                player.displayClientMessage(new TranslationTextComponent(MAINTENANCE + (((IHelpWithConsole) console).Aseoha$GetMaintenance() ? "On" : "Off")), true);
                player.closeContainer();
            }
        }
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
