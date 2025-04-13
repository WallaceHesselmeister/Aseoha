package com.code.aseoha.common;//package com.code.aseoha.common;

//import com.code.aseoha.common.blocks.RoundelCastEntity;
//import io.wispforest.owo.registration.reflect.AutoRegistryContainer;
//import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
//import net.minecraft.block.entity.BlockEntityType;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//

import io.wispforest.owo.registration.reflect.AutoRegistryContainer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

///**
// * Do I know it's technically a "Block Entity" now? Yes, Yes I do, Do I care? Not at all.
//  */
public class TileEntities implements AutoRegistryContainer<BlockEntityType<?>> {

//        public static final BlockEntityType<?> ROUNDEL_CAST_ENTITY_TYPE = FabricBlockEntityTypeBuilder.create(RoundelCastEntity::new).build();


        @Override
        @SuppressWarnings("unchecked")
        public Class<BlockEntityType<?>> getTargetFieldType() {
            return (Class<BlockEntityType<?>>) (Object) BlockEntityType.class;
        }

    @Override
    public Registry<BlockEntityType<?>> getRegistry() {
        return Registries.BLOCK_ENTITY_TYPE;
    }
}
//