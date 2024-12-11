package com.code.fabric;

import com.code.aseoha;
import com.code.common.entities.K9Entity;
import com.code.common.entities.K9MkIIEntity;
import com.code.common.items.AseohaTabs;
import com.code.fabric.registries.AseohaEntities;
import com.code.fabric.registries.AseohaItems;
import dev.architectury.event.events.common.TickEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.server.MinecraftServer;

public final class aseohaFabric implements ModInitializer {
    MidnightTickThread TickThread = new MidnightTickThread();

    @Override
    public void onInitialize() {
        AseohaItems.ITEMS.register();

        /** Add every item from the fabric-specific item list to the main tab **/
        AseohaItems.ITEMS.forEach(itemRegistrySupplier -> ItemGroupEvents.modifyEntriesEvent(AseohaTabs.MAIN_TAB.getKey()).register(itemGroup -> {
            itemGroup.accept(itemRegistrySupplier.get());
        }));

        AseohaEntities.ENTITY_TYPES.register();

        aseoha.init();

        FabricDefaultAttributeRegistry.register(AseohaEntities.K9.get(), K9Entity.createMobAttributes());

        FabricDefaultAttributeRegistry.register(AseohaEntities.K9MkII.get(), K9MkIIEntity.createMobAttributes());

        TickThread.start();

        TickEvent.SERVER_PRE.register((MinecraftServer server) -> this.TickThread.SetServer(server).run());
    }
}
