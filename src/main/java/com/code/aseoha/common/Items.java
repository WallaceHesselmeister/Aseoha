package com.code.aseoha.common;

import com.code.aseoha.common.latinum.*;
import io.wispforest.owo.itemgroup.OwoItemSettings;
import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.*;

public class Items implements ItemRegistryContainer {
        public static final Item ROUNDEL_MOLD = new Item(new OwoItemSettings().group(ItemGroup.aseohaGroup));
        public static final Item LATINUM_BAR = new latinumItem(new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_BRICK = new latinumItem(new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_SLIP = new latinumItem(new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_AXE = new LatinumAxe(AseohaToolMaterials.LATINUM, 10, -2.7F, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_SWORD = new LatinumSword(AseohaToolMaterials.LATINUM, 7, -2.2F, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_HOE = new LatinumSword(AseohaToolMaterials.LATINUM, 2, -2.4F, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_PICK = new LatinumSword(AseohaToolMaterials.LATINUM, 4, -2.6F, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_SHOVEL = new LatinumSword(AseohaToolMaterials.LATINUM, 5, -2.5F, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());

        public static final Item LATINUM_HELM = new ArmorItem(LatinumArmorMaterial.INSTANCE, ArmorItem.Type.HELMET, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_BOOTS = new ArmorItem(LatinumArmorMaterial.INSTANCE, ArmorItem.Type.BOOTS, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_LEGGINGS = new ArmorItem(LatinumArmorMaterial.INSTANCE, ArmorItem.Type.LEGGINGS, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_CHESTPLATE = new ArmorItem(LatinumArmorMaterial.INSTANCE, ArmorItem.Type.CHESTPLATE, new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
        public static final Item LATINUM_ELYTRA = new LatinumElytra(new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof().maxCount(1));

//        public static final Item LATINUM_CHESTPLATE = new ArmorItem(LatinumArmorMaterial.INSTANCE, ArmorItem.Type., new OwoItemSettings().group(ItemGroup.aseohaGroup).fireproof());
//        public static final Item LATINUM_UPGRADE = SmithingTemplateItem.createNetheriteUpgrade();//new SmithingTemplateItem(Text.of("Netherite"), Text.of(""), Text.of("Latinum Smithing Template"), Text.of("Turns Netherite Tools/Weapons into Latinum"), Text.of("Additionals"),
                //SmithingTemplateItem.createNetheriteUpgrade().getEmptyBaseSlotTextures(), SmithingTemplateItem.createNetheriteUpgrade().getEmptyAdditionsSlotTextures());
//net.minecraft.item.Items

}
