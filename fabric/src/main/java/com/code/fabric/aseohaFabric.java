package com.code.fabric;

import com.code.aseoha;
import com.code.common.data.ExteriorPredicatesReloader;
import com.code.common.data.JSONHelper;
import com.code.common.entities.DalekEntity;
import com.code.common.entities.K9Entity;
import com.code.common.entities.K9MkIIEntity;
import com.code.common.items.AseohaTabs;
import com.code.fabric.entities.CybermanEntity;
import com.code.fabric.registries.AseohaEntities;
import com.code.fabric.registries.AseohaItems;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import dev.architectury.event.events.common.TickEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.CloseableResourceManager;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class aseohaFabric implements ModInitializer {
    MidnightTickThread TickThread = new MidnightTickThread();
    public static ArrayList<ResourceLocation> ExteriorVariantLocations = new ArrayList<>();

    SimpleSynchronousResourceReloadListener exteriorListener = new SimpleSynchronousResourceReloadListener() {
        public static final String PATH = aseoha.MOD_ID + "/exteriors";
        @Override
        public ResourceLocation getFabricId() {
            return new ResourceLocation(aseoha.MOD_ID, "variants");
        }

        @Override
        public void onResourceManagerReload(ResourceManager manager) {
            for (Map.Entry<ResourceLocation, Resource> r : manager.listResources(PATH, JSONHelper::isJson).entrySet()) {
//                try(InputStream stream = manager.getResource(r.getKey()).get().open()) {
                    // Consume the stream however you want, medium, rare, or well done.

//                }
//                catch (IOException e) {
//                    throw new RuntimeException(e);
//                }

                try {
                    final JsonElement ele = JsonParser.parseReader(r.getValue().openAsReader());
                    aseoha.LOGGER.info("EXTERIOR LOCATION HERE: {}", ele.getAsString());
                    ExteriorVariantLocations.add(ResourceLocation.tryParse(ele.getAsString()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    };


    @Override
    public void onInitialize() {
        AseohaItems.ITEMS.register();

        /** Add every item from the fabric-specific item list to the main tab **/
        AseohaItems.ITEMS.forEach(itemRegistrySupplier -> ItemGroupEvents.modifyEntriesEvent(AseohaTabs.MAIN_TAB.getKey()).register(itemGroup -> itemGroup.accept(itemRegistrySupplier.get())));

        AseohaEntities.ENTITY_TYPES.register();

        aseoha.init();

        FabricDefaultAttributeRegistry.register(AseohaEntities.K9.get(), K9Entity.createMobAttributes());

        FabricDefaultAttributeRegistry.register(AseohaEntities.K9MkII.get(), K9MkIIEntity.createMobAttributes());

        FabricDefaultAttributeRegistry.register(AseohaEntities.DALEK.get(), DalekEntity.createMobAttributes());

        FabricDefaultAttributeRegistry.register(AseohaEntities.CYBERMAN.get(), CybermanEntity.createMobAttributes());

        AseohaItems.SPAWN_EGGS.register();

        TickThread.start();

        TickEvent.SERVER_PRE.register((MinecraftServer server) -> this.TickThread.SetServer(server).run());

        ResourceManagerHelper.get(PackType.SERVER_DATA).registerReloadListener(exteriorListener);
    }
}