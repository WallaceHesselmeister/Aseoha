/* (C) TAMA Studios 2025 */
package tama.Events;

import static tama.aseoha.MODID;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.block.ExteriorBlock;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.misc.SpaceTimeCoord;
import net.tardis.mod.registry.SubsystemRegistry;
import tama.World.Dimensions;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CommonEvents {

    @SubscribeEvent
    public static void OnSonicInsert(ControlEvent.SonicInsertEvent event) {
        /** If the item being inserted is Minecraft's Music Disc 11 * */
        if (event.getItem().getItem().equals(Items.MUSIC_DISC_11)) {
            /** Unlock Trenzalore, Set destination, and take off * */
            event.getTARDIS().getUnlockHandler().unlock(Dimensions.TRENZALORE_TYPE);
            event.getTARDIS()
                    .setDestination(new SpaceTimeCoord(Dimensions.TRENZALORE, new BlockPos(0, 64, 0), Direction.NORTH));
            event.getTARDIS().takeoff();
        }
    }

    @SubscribeEvent
    public static void OnWorldTick(TickEvent.LevelTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        if (event.level == null) return;
        if (event.level.isClientSide) return;
        if (event.level.getServer() == null) return;
        if (event.level.getServer().getLevel(event.level.dimension()) == null) return;
        if (event.level.getServer() == null) return;
        event.level
                .getServer()
                .getLevel(event.level.dimension())
                .getAllEntities()
                .forEach((entity -> {
                    if (entity instanceof Projectile projectile) {
                        BlockPos touchingPos = projectile.blockPosition().relative(projectile.getDirection(), 1);
                        BlockState touching = event.level.getBlockState(touchingPos);
                        if (touching.getBlock() instanceof ExteriorBlock) {
                            if (!entity.level().isClientSide) {
                                entity.getServer()
                                        .getCommands()
                                        .performPrefixedCommand(
                                                entity.getServer()
                                                        .createCommandSourceStack()
                                                        .withEntity(entity)
                                                        .withPosition(entity.position())
                                                        .withSuppressedOutput(),
                                                "function aseoha:shield/animate");
                            }
                        }
                    }

                    if (event.level.dimension()
                            == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("aseoha:midnight"))) {
                        if (entity instanceof LivingEntity livingEntity) {
                            livingEntity.setSecondsOnFire(1);
                        }
                    }
                }));
        event.level.getCapability(Capabilities.TARDIS).ifPresent(cap -> {
            cap.getSubsystem(SubsystemRegistry.NAV_COM.get()).ifPresent(navcom -> {});
        });
    }
}
