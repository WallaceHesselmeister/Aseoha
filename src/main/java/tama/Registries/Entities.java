/* (C) TAMA Studios 2025 */
package tama.Registries;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.entity.CarExteriorEntity;
import tama.aseoha;

public class Entities {
    public static final DeferredRegister<EntityType<?>> TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, aseoha.MODID);

    public static final RegistryObject<EntityType<CarExteriorEntity>> DELOREAN_TIME_MACHINE =
            createVehicle("exteriors/delorean", CarExteriorEntity::new, 2F, 1.5F);

    public static <T extends Entity> RegistryObject<EntityType<T>> createVehicle(
            String name, EntityType.EntityFactory<T> factory, float width, float height) {
        return TYPES.register(name, () -> EntityType.Builder.of(factory, MobCategory.MISC)
                .sized(width, height)
                .setTrackingRange(128)
                .setUpdateInterval(5)
                .setShouldReceiveVelocityUpdates(true)
                .build(aseoha.MODID));
    }
}
