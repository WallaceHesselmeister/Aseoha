package com.code.common.registries;

import com.code.common.K9Entity;
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

        static {
                K9 = ENTITY_TYPES.register("k9", () -> EntityType.Builder.of(K9Entity::new, MobCategory.MISC).sized(1.0f, 1.0f).build("aseoha:k9"));
        }
}
