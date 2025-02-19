package com.code.aseoha.compat;

import com.code.aseoha.items.unDeadLocker;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.code.aseoha.aseoha.MODID;

/**
 * This registers items ONLY if Temporal Additions is NOT installed, such as the un-deadlocker
 */
public class NoTadditionsItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<unDeadLocker> UNDEADLOCKER = ITEMS.register("undeadlocker",
            unDeadLocker::new);


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
