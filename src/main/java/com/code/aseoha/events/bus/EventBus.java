package com.code.aseoha.events.bus;

import com.code.aseoha.aseoha;
import com.code.aseoha.entities.ModEntityTypes;
import com.code.aseoha.entities.Walle;
import com.code.aseoha.items.SpawnEggs;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.code.aseoha.entities.k9;

@Mod.EventBusSubscriber(modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EventBus {
    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.K9.get(), k9.setCustomAttributes().build());
        event.put(ModEntityTypes.WALLE.get(), Walle.setCustomAttributes().build());
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        SpawnEggs.initSpawnEggs();
    }
}