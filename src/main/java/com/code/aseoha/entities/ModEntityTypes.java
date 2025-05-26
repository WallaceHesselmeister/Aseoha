package com.code.aseoha.entities;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.code.aseoha.aseoha;

public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, aseoha.MODID);

    public static final RegistryObject<EntityType<K9Entity>> K9 =
            ENTITY_TYPES.register("k9",
                    () -> EntityType.Builder.of(K9Entity::new,
                                    EntityClassification.MISC).sized(1.0f, 1.0f)
                            .build(new ResourceLocation(aseoha.MODID, "k9").toString()));


    public static final RegistryObject<EntityType<Walle>> WALLE =
            ENTITY_TYPES.register("walle",
                    () -> EntityType.Builder.of(Walle::new,
                                    EntityClassification.MISC).sized(1.0f, 1.0f)
                            .build(new ResourceLocation(aseoha.MODID, "walle").toString()));

    public static final RegistryObject<EntityType<DavrosChair>> DAVROS_CHAIR =
            ENTITY_TYPES.register("davros_chair",
                    () -> EntityType.Builder.<DavrosChair>of(DavrosChair::new,
                                    EntityClassification.MISC).sized(0.5625F, 1.375F)
                            .build(new ResourceLocation(aseoha.MODID, "davros_chair").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}