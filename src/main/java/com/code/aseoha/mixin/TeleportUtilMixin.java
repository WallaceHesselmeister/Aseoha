package com.code.aseoha.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.helper.TeleportUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TeleportUtil.class)
public abstract class TeleportUtilMixin {

    /**
     * @author Codiak540
     * @reason stop NPE with modded entities/mod's that modify the vanilla Entity, like Cracker's Witherstorm
     */
    @Overwrite(remap = false)
    private static Entity teleportEntityInterdimensional(Entity entity, MinecraftServer server, ServerWorld sourceDim, ServerWorld targetDim, double xCoord, double yCoord, double zCoord, float yaw, float pitch) {
        Entity old = entity;
        old.unRide();
        Entity newEntity = entity.getType().create(targetDim);
        if (old.isAlive() && entity instanceof MinecartEntity) {
            old.remove(true);
            old.changeDimension(targetDim);
            old.revive();
        }

        if (old instanceof FishingBobberEntity) {
            FishingBobberEntity bobber = (FishingBobberEntity) old;
            old.remove(true);
            ServerPlayerEntity player = (ServerPlayerEntity) bobber.getPlayerOwner();
            assert player != null;
            newEntity = new FishingBobberEntity(player, targetDim, 0, 0);
        }

        sourceDim.removeEntity(old, true);
        try {
            if(old != null) {
                sourceDim.tickNonPassenger(old);
                if (newEntity != null) {
                    ((Entity) newEntity).restoreFrom(old);
                    ((Entity) newEntity).moveTo(xCoord, yCoord, zCoord, yaw, pitch);
                    targetDim.addFromAnotherDimension((Entity) newEntity);
                    targetDim.tickNonPassenger((Entity) newEntity);
                }
            }
        } catch (Exception e) {
            System.err.println("Error teleporting entity: " + old);
            System.err.println("Entity that was teleported: " + newEntity);
        }


        sourceDim.resetEmptyTime();
        targetDim.resetEmptyTime();
        if (!(newEntity instanceof LivingEntity) || !((LivingEntity) newEntity).isFallFlying()) {
            assert newEntity != null;
            ((Entity) newEntity).setDeltaMovement(((Entity) newEntity).getDeltaMovement().multiply(1.0, 0.0, 1.0));
            ((Entity) newEntity).setOnGround(true);
        }

        return (Entity) newEntity;
    }
}