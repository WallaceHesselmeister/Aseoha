package tama.Events;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import tama.Items.AItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class LavaChickenDropHandler {
    @SubscribeEvent
    public static void onLivingDrops(LivingDropsEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity instanceof Zombie) {
            Zombie zombie = (Zombie) entity;
            if (zombie.isBaby() && zombie.getVehicle() instanceof Chicken) {
                Level world = zombie.level();
                ItemStack dropStack = new ItemStack(AItems.LAVA_CHICKEN_DISC.get());
                ItemEntity itemEntity = new ItemEntity(world, zombie.getX(), zombie.getY(), zombie.getZ(), dropStack);
                event.getDrops().add(itemEntity);
            }
        }
    }
}
