package com.code.aseoha.protocol;

import com.code.aseoha.Helpers.PlayerHelper;
import com.code.aseoha.upgrades.HostileEjection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.protocols.Protocol;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import java.util.List;
import java.util.Objects;

public class EjectProtocol extends Protocol {
    @Override
    public void call(World world, PlayerEntity playerIn, ConsoleTile console) {
        boolean present = console.getUpgrade(HostileEjection.class).isPresent();
        if (present) {
            List<Entity> entities = console.getLevel().getEntitiesOfClass(LivingEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(128));
            if(console.getUpgrade(HostileEjection.class).orElse(null).isActivated()) {
                    ExteriorTile ext = console.getExteriorType().getExteriorTile(console);
                    if (ext != null) {
                        entities.forEach(entity -> {
                            if(entity instanceof PlayerEntity && PlayerHelper.HasKey((PlayerEntity) entity, console)) {
                                entities.remove(entity);
                            }
                        });

                        world.getServer().tell(new TickDelayedTask(1, () -> console.getDoor().orElse(null).teleportEntities(entities)));
                    }
            }
        }
        for (PlayerEntity player : world.getEntitiesOfClass(PlayerEntity.class, new AxisAlignedBB(console.getBlockPos()).inflate(128))) {
            ExteriorTile ext = console.getExteriorType().getExteriorTile(console);
            if (ext != null)
                if (player != null && !PlayerHelper.HasKey(player, console))
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
