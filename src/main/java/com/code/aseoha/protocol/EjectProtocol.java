package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.PlayerHelper;
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
        for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(128))) {
            ExteriorTile ext = console.getExteriorType().getExteriorTile(console);
            if (ext != null)
                if (player != null && !PlayerHelper.HasKey(playerIn, console))
                    Objects.requireNonNull(world.getServer()).tell(new TickDelayedTask(1, () -> console.relocatePlayerToExterior(player, Objects.requireNonNull(Objects.requireNonNull(ext.getLevel()).getServer()).getLevel(ext.getLevel().dimension()))));

        }

        if (world.isClientSide) {
            playerIn.closeContainer();
        }
    }

    @Override
    public String getSubmenu() {
        return TardisConstants.Strings.SECURITY_MENU;
    }
}
