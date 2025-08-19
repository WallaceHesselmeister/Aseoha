/* (C) TAMA Studios 2025 */
package tama.data;

import net.minecraft.resources.ResourceLocation;

public record DataQuantiscopeRecipe(ResourceLocation item, ResourceLocation structure) {
    @Override
    public String toString() {
        return "DataQuantiscopeRecipe{" + "item='" + item + '\'' + ", location=" + structure + '}';
    }
}
