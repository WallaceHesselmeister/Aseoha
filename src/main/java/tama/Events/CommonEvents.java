/* (C) TAMA Studios 2025 */
package tama.Events;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.block.ExteriorBlock;
import net.tardis.mod.misc.SpaceTimeCoord;
import tama.World.Dimensions;

import static tama.aseoha.MODID;

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
        event.level
                .getServer()
                .getLevel(event.level.dimension())
                .getAllEntities()
                .forEach((entity -> {
                    if (entity instanceof Projectile projectile) {
                        BlockPos touchingPos = projectile.blockPosition().relative(projectile.getDirection(), 1);
                        BlockState touching = event.level.getBlockState(touchingPos);
                        if (touching.getBlock() instanceof ExteriorBlock) {
                            entity.createCommandSourceStack()
                                    .withPosition(touchingPos.getCenter())
                                    .withSuppressedOutput();
                        }
                    }
                }));
    }
}
