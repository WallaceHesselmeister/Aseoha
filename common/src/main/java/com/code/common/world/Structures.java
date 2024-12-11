package com.code.common.world;

import com.code.aseoha;
import com.mojang.serialization.Codec;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureType;

public class Structures {
//    public static StructureType<RoadStructure> ROAD_STRUCTURE;


    public static final DeferredRegister<StructureType<?>> DEFERRED_REGISTRY_STRUCTURE = DeferredRegister.create(aseoha.MOD_ID, Registries.STRUCTURE_TYPE);

    /**
     * Registers the base structure itself and sets what its path is. In this case,
     * this base structure will have the resourcelocation of structure_tutorial:sky_structures.
     */
    public static final RegistrySupplier<StructureType<RoadStructure>> ROAD_STRUCTURE = DEFERRED_REGISTRY_STRUCTURE.register("road_structure", () -> explicitStructureTypeTyping(RoadStructure.CODEC));

    /**
     * Originally, I had a double lambda ()->()-> for the RegistryObject line above, but it turns out that
     * some IDEs cannot resolve the typing correctly. This method explicitly states what the return type
     * is so that the IDE can put it into the DeferredRegistry properly.
     */
    private static <T extends Structure> StructureType<T> explicitStructureTypeTyping(Codec<T> structureCodec) {
        return () -> structureCodec;
    }

//
//    /**
//     * Registers the structure itself and sets what its path is. In this case, the
//     * structure will have the Identifier of structure_tutorial:sky_structures.
//     *
//     * It is always a good idea to register your Structures so that other mods and datapacks can
//     * use them too directly from the registries. It's great for mod/datapacks compatibility.
//     */
//    public static void registerStructureFeatures() {
////        ROAD_STRUCTURE = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, new ResourceLocation(aseoha.MOD_ID, "road_structure"), () -> RoadStructure.CODEC);
//    }
}
