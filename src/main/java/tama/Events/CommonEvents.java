package tama.Events;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.misc.SpaceTimeCoord;
import tama.World.Dimensions;

import static tama.aseoha.MODID;

@Mod.EventBusSubscriber(modid = MODID)
public class CommonEvents {

    @SubscribeEvent
    public static void OnSonicInsert(ControlEvent.SonicInsertEvent event) {
        /** If the item being inserted is Minecraft's Music Disc 11 **/
        if (event.getItem().getItem().equals(Items.MUSIC_DISC_11)) {
            /** Unlock Trenzalore, Set destination, and take off **/
            event.getTARDIS().getUnlockHandler().unlock(Dimensions.TRENZALORE_TYPE);
            event.getTARDIS().setDestination(new SpaceTimeCoord(Dimensions.TRENZALORE, new BlockPos(0, 64, 0), Direction.NORTH));
            event.getTARDIS().takeoff();
        }
    }

//    @SubscribeEvent
//    public static void OnWorldTick(ArrowEv event) {
//        event.level.getServer().getLevel(event.level.dimension()).getAllEntities().forEach((entity -> {
//            if(entity instanceof Projectile projectile) {
//                projectile.blockPosition().
//            }
//        }));
//    }
}