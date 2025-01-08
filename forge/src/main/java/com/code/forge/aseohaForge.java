package com.code.forge;

import com.code.aseoha;
import com.code.common.client.models.*;
import com.code.common.client.renderer.*;
import com.code.common.data.ExteriorPredicatesReloader;
import com.code.common.entities.DalekEntity;
import com.code.common.registries.AseohaEntities;
import com.code.common.entities.K9Entity;
import com.code.common.world.AseohaDimensions;
import dev.architectury.platform.forge.EventBuses;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.code.aseoha.MOD_ID;

@Mod(MOD_ID)
public final class aseohaForge {
    @SuppressWarnings("removal")

    public aseohaForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MOD_ID, eventBus);
//        .registerEventListeners(eventBus);
        // Run our common setup.

        aseoha.init();
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientBus {

        @SubscribeEvent
        public static void RenderersRegister(EntityRenderersEvent.RegisterRenderers event){
            event.registerEntityRenderer(AseohaEntities.K9.get(), K9Renderer::new);

            event.registerEntityRenderer(AseohaEntities.K9MkII.get(), K9MkIIRenderer::new);

            event.registerEntityRenderer(AseohaEntities.LAZER.get(), LazerRenderer::new);

            event.registerEntityRenderer(AseohaEntities.DALEK.get(), DalekRenderer::new);

            event.registerEntityRenderer(AseohaEntities.CYBERMAN.get(), CybusCybermanRenderer::new);
        }

        @SubscribeEvent
        public static void RenderersLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
            event.registerLayerDefinition(K9model.LAYER_LOCATION, K9model::createBodyLayer);

            event.registerLayerDefinition(K9mkIIModel.LAYER_LOCATION, K9mkIIModel::createBodyLayer);

            event.registerLayerDefinition(LazerModel.LAYER_LOCATION, LazerModel::createBodyLayer);

            event.registerLayerDefinition(DalekModel.LAYER_LOCATION, DalekModel::createBodyLayer);

            event.registerLayerDefinition(CybusCybermanModel.LAYER_LOCATION, CybusCybermanModel::createBodyLayer);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.DEDICATED_SERVER)
    public static class CommonBus {

        @SubscribeEvent
        public static void LivingEntityTick(LivingEvent.LivingTickEvent event) {
            if (!event.getEntity().level().dimension().equals(AseohaDimensions.MIDNIGHT)) return;
            event.getEntity().setSecondsOnFire(1);
        }

        @SubscribeEvent
        public static void AddCustomAttributes(EntityAttributeCreationEvent event){
            event.put(AseohaEntities.K9.get(), K9Entity.setCustomAttributes().build());
            event.put(AseohaEntities.K9MkII.get(), K9Entity.setCustomAttributes().build());
            event.put(AseohaEntities.DALEK.get(), DalekEntity.setCustomAttributes().build());
        }

        @SubscribeEvent
        public static void SpawnPlacementRegister(SpawnPlacementRegisterEvent event){
            event.register(AseohaEntities.DALEK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.WORLD_SURFACE, DalekEntity::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.OR);
        }

        @SubscribeEvent
        public static void onServerResourceReload(AddReloadListenerEvent event){
            event.addListener(ExteriorPredicatesReloader.INSTANCE);
        }
    }
}