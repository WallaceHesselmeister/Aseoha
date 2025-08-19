/* (C) TAMA Studios 2025 */
package tama.data;

import net.minecraft.resources.ResourceLocation;

public record DataQuantiscopeRoom(String name, ResourceLocation structure) {
    @Override
    public String toString() {
        return "DataARSRoom{" + "name='" + name + '\'' + ", location=" + structure + '}';
    }
}
