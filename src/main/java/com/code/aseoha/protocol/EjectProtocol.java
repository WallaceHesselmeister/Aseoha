package com.code.aseoha.protocol;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import java.util.Objects;

public class EjectProtocol extends Protocol {
    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
//        ((IHelpWithConsole) console).Aseoha$SetHads(!((IHelpWithConsole) console).Aseoha$GetHads());
        for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(128))) {
            ExteriorTile ext = console.getExteriorType().getExteriorTile(console);
            if(ext!=null)
                if(console!=null)
                    if(world!=null)
                        if(player!=null && !player.getUUID().equals(playerIn.getUUID()))
                            Objects.requireNonNull(world.getServer()).tell(new TickDelayedTask(1, () -> console.relocatePlayerToExterior(player, Objects.requireNonNull(Objects.requireNonNull(ext.getLevel()).getServer()).getLevel(ext.getLevel().dimension()))));

        }
        if (world.isClientSide) {
            for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(16))) {
//                player.displayClientMessage(new TranslationTextComponent(HADS + (((IHelpWithConsole) console).Aseoha$GetHads() ? "On" : "Off")), true);
                player.closeContainer();
            }
        }
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
