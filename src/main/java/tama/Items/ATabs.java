/* (C) TAMA Studios 2025 */
package tama.Items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tama.Blocks.Roundels;
import tama.aseoha;

@Mod.EventBusSubscriber(modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ATabs {

    public static CreativeModeTab MAIN = CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.aseoha_main"))
            .icon(() -> new ItemStack(Roundels.COPPER_ROUNDEL.get()))
            .title(Component.translatable(buildName("main")))
            .build();

    public static CreativeModeTab FOOD = CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.aseoha_food"))
            .icon(() -> new ItemStack(AItems.GOLDEN_POTATO.get()))
            .title(Component.translatable(buildName("food")))
            .build();

    public static String buildName(String name) {
        return "itemGroup." + aseoha.MODID + "." + name;
    }

    @SubscribeEvent
    public static void addItemsEvent(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == MAIN) {
            AItems.ITEMS.getEntries().forEach(event::accept);
        } else if (event.getTab() == FOOD) {
            AItems.FOOD_ITEMS.getEntries().forEach(event::accept);
        }
    }
}
