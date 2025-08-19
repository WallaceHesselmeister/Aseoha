/* (C) TAMA Studios 2025 */
package tama.data;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.util.GsonHelper;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
public class QuantiscopeDataLoader implements ResourceManagerReloadListener {
    private static final Logger LOGGER = LogUtils.getLogger();
    private final List<DataQuantiscopeRecipe> dataRecipe = new ArrayList<>(); // List to store Data recipe objects

    @Override
    public void onResourceManagerReload(ResourceManager resourceManager) {
        dataRecipe.clear(); // Reset the list of Data recipe objects

        // Log namespaces
        LOGGER.info("Loaded namespaces: {}", resourceManager.getNamespaces());

        // Iterate over all namespaces
        for (String namespace : resourceManager.getNamespaces()) {
            LOGGER.info("Searching resources in namespace: {}", namespace);

            // List all resources in this namespace inside 'data' folder, looking for .json
            // files
            Map<ResourceLocation, Resource> resources = resourceManager.listResources(
                    "aseoha/ars_recipe", fileName -> fileName.toString().endsWith(".json"));

            // Log the paths being searched for resources
            LOGGER.info("Searching for nbt under {}:aseoha/recipes/", namespace);

            // Log the resources found in this namespace
            LOGGER.info("Resources found in {}: {}", namespace, resources.keySet());

            if (resources.isEmpty()) {
                LOGGER.warn("No resources found for namespace: {}", namespace);
            }

            for (ResourceLocation rl : resources.keySet()) { // Iterate over the keys
                LOGGER.info("Found resource: {}", rl);

                Resource resource = resources.get(rl);

                try (InputStreamReader reader = new InputStreamReader(resource.open())) {
                    JsonElement jsonElement = GsonHelper.parse(reader);

                    if (jsonElement.isJsonObject()) {
                        JsonObject jsonObject = jsonElement.getAsJsonObject();
                        if (isValidJson(jsonObject)) {
                            JsonObject valuesObject = jsonObject.getAsJsonObject("values");
                            String item = valuesObject.get("item").getAsString();
                            String location = valuesObject.get("location").getAsString();
                            ResourceLocation structureLocation = new ResourceLocation(location);
                            ResourceLocation itemLocation = new ResourceLocation(item);

                            // Create Data recipes and add em to the list
                            DataQuantiscopeRecipe Structure = new DataQuantiscopeRecipe(structureLocation, itemLocation);
                            dataRecipe.add(Structure);

                            LOGGER.info("Loaded recipe from {}: {}", location, Structure);
                        } else {
                            LOGGER.warn("Invalid JSON structure in {}", rl);
                        }
                    }
                } catch (IOException e) {
                    LOGGER.error("Error reading or parsing JSON file: {}", rl, e);
                }
            }
        }

        // Store the list of Data recipe objects in the Data recipe Array
        DataQuantiscopeList.setList(dataRecipe);
    }

    private boolean isValidJson(JsonObject jsonObject) {
        if (jsonObject.has("values") && jsonObject.get("values").isJsonObject()) {
            JsonObject valuesObject = jsonObject.getAsJsonObject("values");

            // Validate item and ars fields
            if (valuesObject.has("item") && valuesObject.has("location")) {
                String item = valuesObject.get("item").getAsString();
                String location = valuesObject.get("location").getAsString();

                // Check for non-empty item
                if (item.isEmpty()) {
                    LOGGER.warn("Empty item field");
                    return false;
                }

                // Validate ars room as ResourceLocation
                try {
                    ResourceLocation.tryParse(location); // Will throw exception if invalid
                } catch (IllegalArgumentException e) {
                    LOGGER.warn("Invalid texture ResourceLocation: {}", location);
                    return false;
                }

                return true;
            }
        }
        return false;
    }
}
