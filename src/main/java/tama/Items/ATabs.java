/* (C) TAMA Studios 2025 */
package tama.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tama.Blocks.Roundels;
import tama.aseoha;

public class ATabs {
    public static DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, aseoha.MODID);

    public static RegistryObject<CreativeModeTab> MAIN = TABS.register("main", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(Roundels.COPPER_ROUNDEL.get()))
            .title(Component.translatable(buildName("main")))
            .build());

    public static RegistryObject<CreativeModeTab> FOOD = TABS.register("food", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(AItems.GOLDEN_POTATO.get()))
            .title(Component.translatable(buildName("food")))
            .build());

    public static String buildName(String name) {
        return "itemGroup." + aseoha.MODID + "." + name;
    }
}
