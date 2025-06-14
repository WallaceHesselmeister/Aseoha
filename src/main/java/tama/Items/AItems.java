/* (C) TAMA Studios 2025 */
package tama.Items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tardis.mod.item.ManualItem;
import net.tardis.mod.item.tools.SonicItem;
import tama.Items.Armor.MondasCybermanArmorItem;
import tama.Items.Armor.ScarfItem;
import tama.World.Dimensions;

import static tama.aseoha.MODID;

public class AItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final DeferredRegister<Item> FOOD_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> CANDY_CANE = FOOD_ITEMS.register(
            "candy_cane",
            () -> new Item((new Item.Properties())
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(0.7F)
                            .build())
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> AUTHORIZED_CONTROL_DISC = ITEMS.register(
            "authorized_control_disc", () -> new AuthorizedControlDisc((new Item.Properties()).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> CANDY_CANE_SONIC =
            ITEMS.register("candy_cane_sonic", () -> new SonicItem(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> GOLDEN_POTATO = FOOD_ITEMS.register(
            "golden_potato",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(9)
                            .saturationMod(2)
                            .build())));

    public static final RegistryObject<Item> RED_JELLY_BABY = FOOD_ITEMS.register(
            "jelly_baby/red",
            () -> new Item((new Item.Properties())
                    .food(new FoodProperties.Builder()
                            .nutrition(1)
                            .saturationMod(2)
                            .build())
                    .rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> COFFEE = FOOD_ITEMS.register(
            "coffee",
            () -> new Item((new Item.Properties())
                    .food(new FoodProperties.Builder()
                            .nutrition(3)
                            .saturationMod(1.2F)
                            .alwaysEat()
                            .build())
                    .rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> sonic_fourteenth =
            ITEMS.register("sonic_fourteenth", () -> new SonicItem(new Item.Properties()));

    public static final RegistryObject<Item> SONIC_WIIMOTE =
            ITEMS.register("sonic_wiimote", () -> new SonicItem(new Item.Properties()));

    public static final RegistryObject<Item> SONIC_SCREWDRIVER =
            ITEMS.register("sonic_screwdriver", () -> new SonicItem(new Item.Properties()));

    public static final RegistryObject<Item> GALLIFREY_UNLOCKER = ITEMS.register(
            "gallifrey_unlocker", () -> new DimensionUnlocker(new Item.Properties(), Dimensions.GALLIFREY_TYPE));

    public static final RegistryObject<Item> MONDAS_UNLOCKER = ITEMS.register(
            "mondas_unlocker", () -> new DimensionUnlocker(new Item.Properties(), Dimensions.MONDAS_TYPE));

    public static final RegistryObject<Item> ASEOHA_MANUAL =
            ITEMS.register("aseoha_manual", () -> new ManualItem(new Item.Properties()));

    public static final RegistryObject<Item> TWINKIE = FOOD_ITEMS.register(
            "twinkie",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(4)
                            .saturationMod(0.7f)
                            .fast()
                            .build())));

    public static final RegistryObject<Item> TEZARAK_COIN = ITEMS.register(
            "tezarak_coin",
            () -> new Item(
                    new Item.Properties().stacksTo(16).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_SHARD = ITEMS.register(
            "blue_crystal_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_PILE = ITEMS.register(
            "blue_crystal_pile",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_NUGGET = ITEMS.register(
            "blue_crystal_nugget",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_INGOT = ITEMS.register(
            "blue_crystal_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> CONTROL_MOLD = ITEMS.register(
            "control_mold", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ENGINE = ITEMS.register(
            "engine", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<ArmorItem> MONDAS_CYBERMAN_HELMET = ITEMS.register(
            "mondas_cyberman_helmet",
            () -> new MondasCybermanArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> MONDAS_CYBERMAN_CHEST = ITEMS.register(
            "mondas_cyberman_chest",
            () -> new MondasCybermanArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> MONDAS_CYBERMAN_LEGS = ITEMS.register(
            "mondas_cyberman_legs",
            () -> new MondasCybermanArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> MONDAS_CYBERMAN_BOOTS = ITEMS.register(
            "mondas_cyberman_boots",
            () -> new MondasCybermanArmorItem(ArmorMaterials.CHAIN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<ArmorItem> SCARF = ITEMS.register(
            "scarf", () -> new ScarfItem(ArmorMaterials.LEATHER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    // public static final RegistryObject<Item> MAJESTIC_TALE_DISC =
    // ITEMS.register("majestic_tale_disc",
    // () -> new Music(1, () -> Sounds.MAJESTIC_TALE.get(), new
    // Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HAMMER = ITEMS.register(
            "hammer",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).fireResistant()));

    // public static final RegistryObject<Item> SONIC_LASER =
    // ITEMS.register("sonic_laser",
    // () -> new );

    public static <T extends Item> T createItem(T item) {
        return item;
    }
}
