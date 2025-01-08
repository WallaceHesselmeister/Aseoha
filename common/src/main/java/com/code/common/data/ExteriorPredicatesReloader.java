package com.code.common.data;

import com.code.aseoha;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


// Made with help from lillith
public class ExteriorPredicatesReloader extends SimplePreparableReloadListener<HashMap<ResourceLocation, ExteriorPredicatesReloader.ExteriorVariantPredicate>> {


    public static final ExteriorPredicatesReloader INSTANCE = new ExteriorPredicatesReloader();
    public static final String PATH = aseoha.MOD_ID + "/exteriors";
    public final Map<ResourceLocation, ExteriorVariantPredicate> predicateMaps = new HashMap<>();

    @Override
    protected HashMap<ResourceLocation, ExteriorVariantPredicate> prepare(ResourceManager manager, ProfilerFiller pProfiler) {

        final HashMap<ResourceLocation, ExteriorVariantPredicate> map = new HashMap<>();

        try {

            for (Map.Entry<ResourceLocation, Resource> r : manager.listResources(PATH, JSONHelper::isJson).entrySet()) {

                final JsonElement ele = JsonParser.parseReader(r.getValue().openAsReader());
                ExteriorVariantPredicate.CODEC.decode(JsonOps.INSTANCE, ele).result().ifPresent(p -> {
                    map.put(r.getKey(), p.getFirst());
                });

            }

        } catch (IOException e) {
            aseoha.LOGGER.warn(String.valueOf(e));
        }

        return map;
    }

    @Override
    protected void apply(HashMap<ResourceLocation, ExteriorVariantPredicate> pObject, ResourceManager pResourceManager, ProfilerFiller pProfiler) {
        this.predicateMaps.clear();
        this.predicateMaps.putAll(pObject);
        aseoha.LOGGER.debug("Loaded {} Exteriors!", this.predicateMaps.size());
    }

//    public record ExteriorVariantPredicate(ResourceKey<?> unlockedItem, Optional<ResourceLocation> biome, Optional<ResourceLocation> structure){
        public record ExteriorVariantPredicate(ResourceLocation variant){

        public static final Codec<ExteriorVariantPredicate> CODEC = RecordCodecBuilder.create(instance ->

//                instance.group(
//                        JSONHelper.GENERIC_RESOURCE_KEY_CODEC.fieldOf("unlock").forGetter(ExteriorVariantPredicate::unlockedItem),
//                        ResourceLocation.CODEC.optionalFieldOf("biome").forGetter(ExteriorVariantPredicate::biome),
//                        ResourceLocation.CODEC.optionalFieldOf("structure").forGetter(ExteriorVariantPredicate::structure)
//                ).apply(instance, ExteriorVariantPredicate::new)
                        instance.group(
                                ResourceLocation.CODEC.fieldOf("location").forGetter(ExteriorVariantPredicate::variant)
                        ).apply(instance, ExteriorVariantPredicate::new)
        );

//        public boolean matchesAnyStructure(Collection<Structure> struct, RegistryAccess access){
//            //If no structure constraints, all structures technically match
//            if(!structure().isPresent())
//                return true;
//
//            final Registry<Structure> reg = access.registryOrThrow(Registries.STRUCTURE);
//            for(Structure s : struct){
//                if(reg.getKey(s).equals(this.structure().get())){
//                    return true;
//                }
//            }
//            return false;
//        }

    }

}
