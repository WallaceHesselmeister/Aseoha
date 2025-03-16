//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.data;

import com.code.aseoha.Helpers.MiscHelper;
import com.code.aseoha.aseoha;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.misc.CodecJsonDataListener;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class DataWorkbenchRecipeCodecListener extends CodecJsonDataListener<DataPackWorkbenchRecipe> {
    public DataWorkbenchRecipeCodecListener(String folderName, Codec<DataPackWorkbenchRecipe> codec, Logger logger) {
        super(folderName, codec, logger);
    }

    public Map<ResourceLocation, DataPackWorkbenchRecipe> mapValues(Map<ResourceLocation, JsonElement> inputs) {
        Map<ResourceLocation, DataPackWorkbenchRecipe> map = DataPackWorkbenchRecipe.registerCoreDataPackExteriors();
        Map<ResourceLocation, DataPackWorkbenchRecipe> parsedInData = new HashMap<>();

        for (Map.Entry<ResourceLocation, JsonElement> resourceLocationJsonElementEntry : inputs.entrySet()) {
            ResourceLocation key = resourceLocationJsonElementEntry.getKey();
            JsonElement element = resourceLocationJsonElementEntry.getValue();
            this.codec.decode(JsonOps.INSTANCE, element).get().ifLeft((result) -> {
                result.getFirst().setRegistryName(key);
                parsedInData.put(key, result.getFirst());
                /****** Add variant to the common variants array *****/
                // TODO: THIS
                if (!aseoha.WorkBenchRecipeHandler.Contains(MiscHelper.WorkbenchDataRecipeToRecipe(result.getFirst())))
                    aseoha.WorkBenchRecipeHandler.AddRecipe(MiscHelper.WorkbenchDataRecipeToRecipe(result.getFirst()));
                this.logger.info("Added Datapack entry: {}, {}", result.getFirst().toString(), result.getFirst().getRegistryName());

            }).ifRight((partial) -> this.logger.error("Failed to parse data json for {} due to: {}", key.toString(), partial.message()));
        }

        map.putAll(parsedInData);
        return map;
    }

    public void setData(Map<ResourceLocation, DataPackWorkbenchRecipe> input) {
        for (Map.Entry<ResourceLocation, DataPackWorkbenchRecipe> resourceLocationDataPackExteriorEntry : input.entrySet()) {
            resourceLocationDataPackExteriorEntry.getValue().setRegistryName(resourceLocationDataPackExteriorEntry.getKey());
        }

        super.setData(input);
    }
}
