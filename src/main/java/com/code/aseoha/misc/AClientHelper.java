package com.code.aseoha.misc;

import com.code.aseoha.client.models.armor.PrydonianHelmModel;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.tardis.mod.misc.GuiContext;

import java.util.HashMap;
import java.util.Map;

public class AClientHelper {
    private static final PrydonianHelmModel SUIT_HEAD;
    static {
        SUIT_HEAD = new PrydonianHelmModel(1.0F);
    }

//    public static void openGui(Screen screen) {
//        Minecraft.getInstance().setScreen(screen);
//    }
//
//    public static void openGUI(int guiId, GuiContext context) {
//        switch (guiId) {
//            case 1:
//                Minecraft.getInstance().setScreen(new ManualScreen(context));
//                break;
//        }
//
//    }

    public static Map<Item, BipedModel<?>> getPrydonianArmorModel(ItemStack itemStack) {
        Map<Item, BipedModel<?>> map = new HashMap<>();
        map.put(AseohaItems.PRYDONIAN_HELM.get(), SUIT_HEAD);
//        map.put(TItems.SPACE_CHEST.get(), SUIT_BODY);
//        map.put(TItems.SPACE_LEGS.get(), SUIT_LEGS);
//        map.put(TItems.SPACE_BOOTS.get(), SUIT_FEET);
        return map;
    }



    public static void openGUI(int guiId, GuiContext context) {
        switch (guiId) {
            case 0:
                Minecraft.getInstance().setScreen(new ManualScreen(context));
                break;
            default:
                break;
        }
    }


}
