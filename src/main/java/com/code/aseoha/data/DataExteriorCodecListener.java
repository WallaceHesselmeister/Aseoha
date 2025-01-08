//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.data;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.misc.CodecJsonDataListener;
import org.apache.logging.log4j.Logger;

public class DataExteriorCodecListener extends CodecJsonDataListener<DataPackExterior> {
    public DataExteriorCodecListener(String folderName, Codec<DataPackExterior> codec, Logger logger) {
        super(folderName, codec, logger);
    }

    public Map<ResourceLocation, DataPackExterior> mapValues(Map<ResourceLocation, JsonElement> inputs) {
        Map<ResourceLocation, DataPackExterior> map = DataPackExterior.registerCoreDataPackExteriors();
        Map<ResourceLocation, DataPackExterior> parsedInData = new HashMap();

        for (Map.Entry<ResourceLocation, JsonElement> resourceLocationJsonElementEntry : inputs.entrySet()) {
            Map.Entry<ResourceLocation, JsonElement> entry = (Map.Entry) resourceLocationJsonElementEntry;
            ResourceLocation key = (ResourceLocation) entry.getKey();
            JsonElement element = (JsonElement) entry.getValue();
            this.codec.decode(JsonOps.INSTANCE, element).get().ifLeft((result) -> {
                ((DataPackExterior) result.getFirst()).setRegistryName(key);
                parsedInData.put(key, result.getFirst());
                /****** Add variant to the common variants array *****/
                result.getFirst().GetExteriorType().AddVariant(result.getFirst());

                this.logger.info("Added Datapack entry: {}, {}", result.getFirst().getDisplayName().toString(), result.getFirst().getRegistryName());

            }).ifRight((partial) -> this.logger.error("Failed to parse data json for {} due to: {}", key.toString(), partial.message()));
        }

        map.putAll(parsedInData);
        return map;
    }

    public void setData(Map<ResourceLocation, DataPackExterior> input) {

        for (Map.Entry<ResourceLocation, DataPackExterior> resourceLocationDataPackExteriorEntry : input.entrySet()) {
            resourceLocationDataPackExteriorEntry.getValue().setRegistryName(((Map.Entry<ResourceLocation, DataPackExterior>) (Map.Entry) resourceLocationDataPackExteriorEntry).getKey());
        }

        super.setData(input);
    }
}
