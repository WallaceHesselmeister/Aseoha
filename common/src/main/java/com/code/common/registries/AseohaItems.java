package com.code.common.registries;

import com.code.common.AseohaToolMaterials;
import com.code.common.items.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import static com.code.aseoha.MOD_ID;

public class AseohaItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static final DeferredRegister<Item> ITEMS_NO_FABRIC = DeferredRegister.create(MOD_ID, Registries.ITEM);

    public static TagKey<Item> JELLY_BABY = TagKey.create(Registries.ITEM, new ResourceLocation("forge", "items/jelly_baby"));

    public static final RegistrySupplier<Item> GOLDEN_POTATO = ITEMS.register("golden_potato", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(3).alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 1), 1.0F).build()).arch$tab(AseohaTabs.FOOD_TAB)));

    public static final RegistrySupplier<Item> RED_JELLY_BABY = ITEMS.register("jelly_baby/red",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));

    public static final RegistrySupplier<Item> BAG_OF_JELLY_BABIES = ITEMS.register("jelly_baby/bag",
            () -> new Item((new Item.Properties()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> HANDFUL_OF_JELLY_BABIES = ITEMS.register("jelly_baby/handful",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(8).saturationMod(16).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> ORANGE_JELLY_BABY = ITEMS.register("jelly_baby/orange",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> PURPLE_JELLY_BABY = ITEMS.register("jelly_baby/purple",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> YELLOW_JELLY_BABY = ITEMS.register("jelly_baby/yellow",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> GINGERBREAD_MAN = ITEMS.register("gingerbread_man",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> GINGERBREAD_CYBERMAN = ITEMS.register("gingerbread_cyberman",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.7F).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> GINGERBREAD_DALEK = ITEMS.register("gingerbread_dalek",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.7F).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.7F).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> CANDY_CANE_SONIC = ITEMS.register("candy_cane_sonic",
            () -> new SwordItem(AseohaToolMaterials.CANDY_CANE, 3, -2.4f, new Item.Properties().arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).alwaysEat().build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> SONIC_FOURTEENTH = ITEMS.register("sonic_fourteenth",
            () -> new SonicItem(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> PLASMA_RIFLE = ITEMS_NO_FABRIC.register("plasma_rifle",
            () -> new PlasmaRifle(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> PLASMA_BOLT_MAGAZINE = ITEMS_NO_FABRIC.register("plasma_bolt_magazine",
            () -> new PlasmaBoltMagazine(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> HEXAGONAL_ROUNDEL_MOLD = ITEMS.register("hexagonal_roundel_mold",
            () -> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> SONIC_WIIMOTE = ITEMS.register("sonic_wiimote",
            () -> new SonicItem(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> SONIC_SCREWDRIVER = ITEMS.register("sonic_screwdriver",
            () -> new SonicItem(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

//    public static final RegistrySupplier<Item> ASEOHA_MANUAL = ITEMS.register("aseoha_manual",
//            () -> new Manual(new Item.Properties().arch$tab(ModItemGroup.MAIN_TAB)));

    public static final RegistrySupplier<Item> TWINKIE = ITEMS.register("twinkie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0.7f).fast().build()).arch$tab(AseohaTabs.FOOD_TAB)));

    public static final RegistrySupplier<Item> TEZARAK_COIN = ITEMS.register("tezarak_coin",
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).stacksTo(16).rarity(Rarity.RARE).fireResistant()));

    public static final RegistrySupplier<Item> BLUE_CRYSTAL_SHARD = ITEMS.register("blue_crystal_shard", //TODO: HERE
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).rarity(Rarity.RARE).fireResistant()));

    public static final RegistrySupplier<Item> BLUE_CRYSTAL_PILE = ITEMS.register("blue_crystal_pile",
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).rarity(Rarity.RARE).fireResistant()));

    public static final RegistrySupplier<Item> BLUE_CRYSTAL_NUGGET = ITEMS.register("blue_crystal_nugget",
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).rarity(Rarity.RARE).fireResistant()));

    public static final RegistrySupplier<Item> BLUE_CRYSTAL_INGOT = ITEMS.register("blue_crystal_ingot", //TODO: TO HERE
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).rarity(Rarity.RARE).fireResistant()));

    public static final RegistrySupplier<Item> ROUNDEL_MOLD = ITEMS.register("roundel_mold",
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> ENGINE = ITEMS.register("engine",
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).stacksTo(1).rarity(Rarity.UNCOMMON)));

//    public static final RegistrySupplier<Item> MAJESTIC_TALE_DISC = ITEMS.register("majestic_tale_disc",
//            () -> new Music(1, () -> Sounds.MAJESTIC_TALE.get(), new Item.Properties().stacksTo(1).arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> HAMMER = ITEMS.register("hammer",
            ()-> new Item(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB).stacksTo(1).rarity(Rarity.RARE).fireResistant()));

//    public static final RegistrySupplier<Item> SONIC_LASER = ITEMS.register("sonic_laser",
//            ()-> new );

//    public static final Item LATINUM = ITEMS.register( "latinum_material", new LatinumArmorMaterial());
    // If you made a new material, this is where you would note it.
public static final RegistrySupplier<Item> LATINUM_HELMET = ITEMS.register("latinum_helm", () -> new ArmorItem(AseohaArmorMaterials.LATINUM, ArmorItem.Type.HELMET, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));
    public static final RegistrySupplier<Item> LATINUM_CHESTPLATE = ITEMS.register("latinum_chestplate", () -> new ArmorItem(AseohaArmorMaterials.LATINUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));
    public static final RegistrySupplier<Item> LATINUM_LEGGINGS = ITEMS.register("latinum_leggings", () -> new ArmorItem(AseohaArmorMaterials.LATINUM, ArmorItem.Type.LEGGINGS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));
    public static final RegistrySupplier<Item> LATINUM_BOOTS = ITEMS.register("latinum_boots", () -> new ArmorItem(AseohaArmorMaterials.LATINUM, ArmorItem.Type.BOOTS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(AseohaToolMaterials.STEEL, 1, -2.8F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(AseohaToolMaterials.STEEL, 1, -3.0F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(AseohaToolMaterials.STEEL, 7, -3.2F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(AseohaToolMaterials.STEEL, 1, -2.0F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(AseohaToolMaterials.STEEL, 3, -2.4F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));


    public static final RegistrySupplier<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new SteelItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB)));



    public static final RegistrySupplier<Item> DALEKANIUM_HELMET = ITEMS.register("dalekanium_helmet",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, ArmorItem.Type.HELMET, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_CHESTPLATE = ITEMS.register("dalekanium_chestplate",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_LEGGINGS = ITEMS.register("dalekanium_leggings",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_BOOTS = ITEMS.register("dalekanium_boots",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, ArmorItem.Type.BOOTS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_PICKAXE = ITEMS.register("dalekanium_pickaxe",
            () -> new PickaxeItem(AseohaToolMaterials.DALEKANIUM, 1, -2.8F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_SHOVEL = ITEMS.register("dalekanium_shovel",
            () -> new ShovelItem(AseohaToolMaterials.DALEKANIUM, 1, -3.0F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_AXE = ITEMS.register("dalekanium_axe",
            () -> new AxeItem(AseohaToolMaterials.DALEKANIUM, 7, -3.2F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_HOE = ITEMS.register("dalekanium_hoe",
            () -> new HoeItem(AseohaToolMaterials.DALEKANIUM, 1, -2.0F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> DALEKANIUM_SWORD = ITEMS.register("dalekanium_sword",
            () -> new SwordItem(AseohaToolMaterials.DALEKANIUM, 3, -2.4F, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));


    public static final RegistrySupplier<Item> DALEKANIUM_INGOT = ITEMS.register("dalekanium_ingot", () -> new SteelItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB)));



    public static final RegistrySupplier<Item> LATINUM_BAR = ITEMS.register("latinum_bar", () -> new SteelItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB).fireResistant()));
    public static final RegistrySupplier<Item> LATINUM_BRICK = ITEMS.register("latinum_brick", () -> new SteelItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB).fireResistant()));
    public static final RegistrySupplier<Item> LATINUM_SLIP = ITEMS.register("latinum_slip", () -> new SteelItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB).fireResistant()));

    public static <T extends Item> T createItem(T item) {
        return item;
    }
    public static void register(){ITEMS.register();}

}
