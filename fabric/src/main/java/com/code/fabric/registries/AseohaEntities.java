package com.code.fabric.registries;

import com.code.fabric.entities.DalekEntity;
import com.code.fabric.entities.K9Entity;
import com.code.fabric.entities.K9MkIIEntity;
import com.code.fabric.entities.Lazer;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import static com.code.aseoha.MOD_ID;

public class AseohaEntities {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(MOD_ID, Registries.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<K9Entity>> K9;
    public static final RegistrySupplier<EntityType<K9MkIIEntity>> K9MkII;
    public static final RegistrySupplier<EntityType<Lazer>> LAZER;
    public static final RegistrySupplier<EntityType<DalekEntity>> DALEK;

    static {
        K9 = ENTITY_TYPES.register("k9", () -> EntityType.Builder.of(K9Entity::new, MobCategory.MISC).sized(1.0f, 1.0f).build("aseoha:k9"));
        K9MkII = ENTITY_TYPES.register("k9mk2", () -> EntityType.Builder.of(K9MkIIEntity::new, MobCategory.MISC).sized(1.0f, 1.0f).build("aseoha:k9mk2"));
        LAZER = ENTITY_TYPES.register("lazer", () -> EntityType.Builder.of(com.code.fabric.entities.Lazer::new, MobCategory.MISC).sized(0.5F, 0.5F).build("aseoha:lazer"));
        DALEK = ENTITY_TYPES.register("dalek", () -> EntityType.Builder.of(DalekEntity::new, MobCategory.MISC).sized(0.5F, 0.5F).build("aseoha:dalek"));
    }

    public static EntityType<com.code.fabric.entities.Lazer> LazerEntityType() {
        return LAZER.get();
    }
}