//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.data;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.misc.CodecJsonDataListener;
import org.apache.logging.log4j.Logger;

public class DataVortexCodecListener extends CodecJsonDataListener<DataPackVortex> {
    public DataVortexCodecListener(String folderName, Codec<DataPackVortex> codec, Logger logger) {
        super(folderName, codec, logger);
    }

    public Map<ResourceLocation, DataPackVortex> mapValues(Map<ResourceLocation, JsonElement> inputs) {
        Map<ResourceLocation, DataPackVortex> map = DataPackVortex.registerCoreDataPackExteriors();
        Map<ResourceLocation, DataPackVortex> parsedInData = new HashMap();

        for (Map.Entry<ResourceLocation, JsonElement> resourceLocationJsonElementEntry : inputs.entrySet()) {
            Map.Entry<ResourceLocation, JsonElement> entry = (Map.Entry) resourceLocationJsonElementEntry;
            ResourceLocation key = entry.getKey();
            JsonElement element = entry.getValue();
            this.codec.decode(JsonOps.INSTANCE, element).get().ifLeft((result) -> {
                ((DataPackVortex) result.getFirst()).setRegistryName(key);
                parsedInData.put(key, result.getFirst());
                /****** Add variant to the common variants array *****/
                // TODO: THIS

                this.logger.info("Added Datapack entry: {}, {}", result.getFirst().getDisplayName().toString(), result.getFirst().getRegistryName());

            }).ifRight((partial) -> this.logger.error("Failed to parse data json for {} due to: {}", key.toString(), partial.message()));
        }

        map.putAll(parsedInData);
        return map;
    }

    public void setData(Map<ResourceLocation, DataPackVortex> input) {

        for (Map.Entry<ResourceLocation, DataPackVortex> resourceLocationDataPackExteriorEntry : input.entrySet()) {
            resourceLocationDataPackExteriorEntry.getValue().setRegistryName(((Map.Entry<ResourceLocation, DataPackVortex>) (Map.Entry) resourceLocationDataPackExteriorEntry).getKey());
        }

        super.setData(input);
    }
}
