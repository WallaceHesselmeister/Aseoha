package com.code.aseoha.events.bus;//
//package com.code.aseoha.events.bus;
//
//import com.code.aseoha.aseoha;
//import com.code.aseoha.client.Sounds;
//import net.minecraft.util.SoundCategory;
//import net.minecraft.util.math.AxisAlignedBB;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
//import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
//import net.tardis.api.events.TardisEvent;
//import net.tardis.mod.entity.DoorEntity;
//import net.tardis.mod.enums.EnumDoorState;
//import net.tardis.mod.helper.TardisHelper;
//
//import java.util.Iterator;
//
//@EventBusSubscriber(modid = aseoha.MODID, bus = Bus.MOD)
//public class onTakeOff {
//public onTakeOff() {}
//    @SubscribeEvent
//    public static void onTakeOff(TardisEvent.Takeoff event) {
////        TardisHelper.getConsoleInWorld(event.getConsole().getLevel()).ifPresent(tardisTile -> {
////            DoorEntity doorEntity;
////            for (Iterator i = tardisTile.getLevel().getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(tardisTile.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {
////                doorEntity = (DoorEntity) i.next();
////                if (doorEntity.getOpenState() != EnumDoorState.CLOSED) {
//////                tardisTile.getLevel().getServer().tell(new TickDelayedTask(1, () -> {
////                    aseoha.LOGGER.info("CANCLED");
////                    event.setCanceled(true);
//////                }));
////
////                }
////            }
//            {
//                if(event.getConsole().getArtron() < 64)
//                    event.getConsole().getLevel().playSound(null, event.getConsole().getBlockPos(), Sounds.LOW_ARTRON_TAKEOFF.get(), SoundCategory.BLOCKS, 1.0f,1.0f);
//            }
////        });
//    }
//}
