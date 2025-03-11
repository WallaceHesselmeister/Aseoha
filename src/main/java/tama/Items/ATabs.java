package tama.Items;


import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tama.Blocks.ABlocks;
import tama.Blocks.Roundels;
import tama.aseoha;

@Mod.EventBusSubscriber(modid = aseoha.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ATabs {


    public static CreativeModeTab MAIN;
    public static CreativeModeTab FOOD;



    public static String buildName(String name){
        return "itemGroup." + aseoha.MODID + "_" + name;
    }

    @SubscribeEvent
    public static void registerTabs(CreativeModeTabEvent.Register event){
        MAIN = event.registerCreativeModeTab(new ResourceLocation(aseoha.MODID, "main"), builder -> builder.
                icon(() -> new ItemStack(Roundels.COPPER_ROUNDEL.get()))
                .title(Component.translatable(buildName("main")))
                .build());

        FOOD = event.registerCreativeModeTab(new ResourceLocation(aseoha.MODID, "food"), builder -> builder.
                icon(() -> new ItemStack(AItems.GOLDEN_POTATO.get()))
                .title(Component.translatable(buildName("food")))
                .build());
    }

    @SubscribeEvent
    public static void addItemsEvent(CreativeModeTabEvent.BuildContents event){
        if(event.getTab() == MAIN){
            AItems.ITEMS.getEntries().forEach(event::accept);
        }
        else if(event.getTab() == FOOD){
            AItems.FOOD_ITEMS.getEntries().forEach(event::accept);
        }
    }

}
