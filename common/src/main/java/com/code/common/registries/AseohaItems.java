package com.code.common.registries;

import com.code.common.items.AseohaTabs;
import com.code.common.items.LatinumArmorMaterial;
import com.code.common.items.LatinumItem;
import com.code.common.items.SonicItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.core.Registry;
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

    public static TagKey<Item> JELLY_BABY = TagKey.create(Registries.ITEM, new ResourceLocation("forge", "items/jelly_baby"));

    public static final RegistrySupplier<Item> GOLDEN_POTATO = ITEMS.register("golden_potato", () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(9).saturationMod(3).alwaysEat().effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1), 1.0F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400, 1), 1.0F).build()).arch$tab(AseohaTabs.FOOD_TAB)));

    public static final RegistrySupplier<Item> RED_JELLY_BABY = ITEMS.register("jelly_baby/red",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));

    public static final RegistrySupplier<Item> BAG_OF_JELLY_BABIES = ITEMS.register("jelly_baby/bag",
            () -> new Item((new Item.Properties()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));


    public static final RegistrySupplier<Item> HANDFUL_OF_JELLY_BABIES = ITEMS.register("jelly_baby/handful",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(8).saturationMod(16).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));


    public static final RegistrySupplier<Item> ORANGE_JELLY_BABY = ITEMS.register("jelly_baby/orange",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));


    public static final RegistrySupplier<Item> PURPLE_JELLY_BABY = ITEMS.register("jelly_baby/purple",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));


    public static final RegistrySupplier<Item> YELLOW_JELLY_BABY = ITEMS.register("jelly_baby/yellow",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(2).saturationMod(3).build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.EPIC)));

    public static final RegistrySupplier<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item((new Item.Properties()).food(new FoodProperties.Builder().nutrition(3).saturationMod(3).alwaysEat().build()).arch$tab(AseohaTabs.FOOD_TAB).rarity(Rarity.UNCOMMON)));

    public static final RegistrySupplier<Item> SONIC_FOURTEENTH = ITEMS.register("sonic_fourteenth",
            () -> new SonicItem(new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

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

    public static final ArmorMaterial LATINUM_MATERIAL = new LatinumArmorMaterial();
//    public static final Item LATINUM = ITEMS.register( "latinum_material", new LatinumArmorMaterial());
    // If you made a new material, this is where you would note it.
    public static final RegistrySupplier<Item> LATINUM_HELMET = ITEMS.register("latinum_helm", () -> new ArmorItem(LATINUM_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));
    public static final RegistrySupplier<Item> LATINUM_CHESTPLATE = ITEMS.register("latinum_chestplate", () -> new ArmorItem(LATINUM_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));
    public static final RegistrySupplier<Item> LATINUM_LEGGINGS = ITEMS.register("latinum_leggings", () -> new ArmorItem(LATINUM_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));
    public static final RegistrySupplier<Item> LATINUM_BOOTS = ITEMS.register("latinum_boots", () -> new ArmorItem(LATINUM_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties().arch$tab(AseohaTabs.MAIN_TAB)));

    public static final RegistrySupplier<Item> LATINUM_BAR = ITEMS.register("latinum_bar", () -> new LatinumItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB).fireResistant()));
    public static final RegistrySupplier<Item> LATINUM_BRICK = ITEMS.register("latinum_brick", () -> new LatinumItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB).fireResistant()));
    public static final RegistrySupplier<Item> LATINUM_SLIP = ITEMS.register("latinum_slip", () -> new LatinumItem((new Item.Properties()).arch$tab(AseohaTabs.MAIN_TAB).fireResistant()));

    public static <T extends Item> T createItem(T item) {
        return item;
    }
    public static void register(){ITEMS.register();}

}
