/* (C) TAMA Studios 2025 */
package tama.Misc;

import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.structure.BuiltinStructureSets;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.StructureSet;

public class WorldHelper {

    public static Optional<BlockPos> findClosestStructure(
            ServerLevel level, BlockPos blockPos, ResourceKey<StructureSet> structureSetKey) {
        Optional<Holder.Reference<StructureSet>> structureSetHolder =
                level.registryAccess().registryOrThrow(Registries.STRUCTURE_SET).getHolder(structureSetKey);
        if (structureSetHolder.isEmpty()) {
            return Optional.empty();
        }
        List<Holder<Structure>> structuresInSet = structureSetHolder.get().get().structures().stream()
                .map(StructureSet.StructureSelectionEntry::structure)
                .collect(Collectors.toList());

        HolderSet<Structure> structuresToSearch = HolderSet.direct(structuresInSet);

        Optional<Pair<BlockPos, Holder<Structure>>> result = Optional.ofNullable(level.getChunkSource()
                .getGenerator()
                .findNearestMapStructure(level, structuresToSearch, blockPos, 100, false));

        return result.map(Pair::getFirst);
    }

    public static Optional<BlockPos> findClosestStructureOfAnyType(ServerLevel level, BlockPos blockPos) {
        List<Holder<Structure>> allStructures = level.registryAccess().registryOrThrow(Registries.STRUCTURE).stream()
                .map(Holder::direct)
                .collect(Collectors.toList());

        if (allStructures.isEmpty()) {
            return Optional.empty();
        }

        HolderSet<Structure> structuresToSearch = HolderSet.direct(allStructures);

        Optional<Pair<BlockPos, Holder<Structure>>> result = Optional.ofNullable(level.getChunkSource()
                .getGenerator()
                .findNearestMapStructure(level, structuresToSearch, blockPos, 100, false));
        return result.map(Pair::getFirst);
    }

    public static Optional<BlockPos> findNearestVillage(ServerLevel level, BlockPos blockPos) {
        return findClosestStructure(level, blockPos, BuiltinStructureSets.VILLAGES);
    }
}
