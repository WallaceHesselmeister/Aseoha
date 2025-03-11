package com.code.aseoha.common.structures;

import com.code.aseoha.aseoha;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.structure.StructureType;

public class Structures {
    public static StructureType<RoadStructure> ROAD_STRUCTURE;

    /**
     * Registers the structure itself and sets what its path is. In this case, the
     * structure will have the Identifier of structure_tutorial:sky_structures.
     *
     * It is always a good idea to register your Structures so that other mods and datapacks can
     * use them too directly from the registries. It's great for mod/datapacks compatibility.
     */
    public static void registerStructureFeatures() {
        ROAD_STRUCTURE = Registry.register(Registries.STRUCTURE_TYPE, new Identifier(aseoha.MOD_ID, "road_structure"), () -> RoadStructure.CODEC);
    }
}
