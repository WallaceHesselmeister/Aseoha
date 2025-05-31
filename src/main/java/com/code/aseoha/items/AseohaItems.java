package com.code.aseoha.items;

import com.code.aseoha.client.Sounds;
import com.code.aseoha.entities.ModEntityTypes;
import com.code.aseoha.enums.EnumArmorMaterials;
import com.code.aseoha.fluid.ModFluids;
import com.code.aseoha.items.Materials.AseohaItemTiers;
import com.code.aseoha.items.Upgrades.LightSpeedDrive;
import com.code.aseoha.items.Upgrades.TesseractDrive;
import com.code.aseoha.items.Upgrades.WarpDrive;
import com.code.aseoha.items.armor.BowtieArmorItem;
import com.code.aseoha.items.armor.FezArmorItem;
import com.code.aseoha.items.armor.SashArmorItem;
import com.code.aseoha.items.armor.ScarfArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.entity.TEntities;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.items.TardisPartItem;

import static com.code.aseoha.aseoha.MODID;

public class AseohaItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final DeferredRegister<Item> ARMOR_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> PRYDONIAN_HELM = ITEMS.register("prydonian_robes_helm", () -> createItem(new PrydonianRobes(EquipmentSlotType.HEAD)));

    public static final RegistryObject<Item> MANUAL = ITEMS.register("aseoha_manual",
            () -> createItem(new ManualItem()));

//    public static final RegistryObject<Item> HADS = ITEMS.register("upgrades/hads", () -> {
//        return (TardisPartItem)createItem(new TardisPartItem((new Item.Properties()).tab(ModItemGroup.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.DEMAT_CIRCUIT));
//    });

//    public static final RegistryObject<Item> AUTO_STABILISER = ITEMS.register("upgrades/auto_stabilizers", () -> {
//        return (TardisPartItem)createItem(new TardisPartItem((new Item.Properties()).tab(ModItemGroup.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.DEMAT_CIRCUIT));
//    });

    public static final RegistryObject<Item> ENGINE_BOOSTER = ITEMS.register("upgrades/engine_booster", () -> createItem(new TardisPartItem((new Item.Properties()).tab(AseohaItemGroups.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.DEMAT_CIRCUIT)));

    public static final RegistryObject<Item> DYNAMIC_COORDS = ITEMS.register("upgrades/dynamic_coordinates", () -> createItem(new TardisPartItem((new Item.Properties()).tab(AseohaItemGroups.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.DEMAT_CIRCUIT)));

    public static final RegistryObject<Item> ATRIUM_UPGRADE = ITEMS.register("upgrades/atrium", () -> createItem(new TardisPartItem((new Item.Properties()).tab(AseohaItemGroups.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.CHAMELEON_CIRCUIT)));

    public static final RegistryObject<Item> EJECT_HOSTILES = ITEMS.register("upgrades/hostile_ejection", () -> createItem(new TardisPartItem((new Item.Properties()).tab(AseohaItemGroups.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.SHIELD_GENERATOR)));

    public static final RegistryObject<Item> WARP_DRIVE = ITEMS.register("upgrades/warp_drive", WarpDrive::new);

    public static final RegistryObject<Item> TESSERACT_DRIVE = ITEMS.register("upgrades/tesseract_drive", TesseractDrive::new);

    public static final RegistryObject<Item> LIGHTSPEED_DRIVE = ITEMS.register("upgrades/lightspeed_drive", LightSpeedDrive::new);

    public static final RegistryObject<HammerSpacePouch> HAMMER_SPACE_POUCH = ITEMS.register("hammer_space_pouch", HammerSpacePouch::new);
    //
//    public static final RegistryObject<Item> MANUAL = ITEMS.register("manual",
//            () -> new WrittenBookItem(new Item.Properties().tab(ModItemGroup.ASEOHA_GROUP)));

//    public static final RegistryObject<Item> TT_CAPSULE = ITEMS.register("tt_capsule", () -> {
//        return (TT_Capsule.BlockItemTTCapsule)createItem(new TT_Capsule.BlockItemTTCapsule((Block) TBlocks.exterior_tt_capsule.get()));
//    });

    public static final RegistryObject<SpawnEggs> K9_SPAWN_EGG = ITEMS.register("k9_spawn_egg",
            () -> new SpawnEggs(ModEntityTypes.K9, 0x879995, 0x576ABC,
                    new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<SpawnEggs> WALLE_SPAWN_EGG = ITEMS.register("walle_spawn_egg",
            () -> new SpawnEggs(ModEntityTypes.WALLE, 0xFF871D, 0xFF800F,
                    new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<SpawnEggs> DAVROS_SPAWN_EGG = ITEMS.register("davros_chair_spawn_egg",
            () -> new SpawnEggs(ModEntityTypes.DAVROS_CHAIR, 0xFF871D, 0xFF800F,
                    new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

//    public static final RegistryObject<BlockItem> PORTAL_ITEM = ITEMS.register("portal",
//            () -> new NetherPortalBlock())
    public static final RegistryObject<deadLocker> DEADLOCKER = ITEMS.register("deadlocker",
        deadLocker::new);

//    if(aseoha.){}
//    public static final RegistryObject<unDeadLocker> UNDEADLOCKER = ITEMS.register("undeadlocker",
//            () -> new unDeadLocker());

    public static final RegistryObject<SpawnEggs> BESSIE_SPAWN_EGG = ITEMS.register("bessie_spawn_egg",
            () -> new SpawnEggs(TEntities.BESSIE, 0xFF871D, 0x999999,
                    new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(9).saturationMod(2).effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 1200, 0), 1.0F).alwaysEat().build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.EPIC).fireResistant()));

    public static final RegistryObject<Item> GINGERBREAD_MAN = ITEMS.register("gingerbread_man",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(2).saturationMod(0.5F).build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> GINGERBREAD_CYBERMAN = ITEMS.register("gingerbread_cyberman",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(4).saturationMod(0.7F).build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> GINGERBREAD_DALEK = ITEMS.register("gingerbread_dalek",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(4).saturationMod(0.7F).build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> RED_JELLY_BABY = ITEMS.register("jelly_baby/red",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(1).saturationMod(2).build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(3).saturationMod(1.2F).alwaysEat().build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> sonic_fourteenth = ITEMS.register("sonic_fourteenth",
            SonicItem::new);

    public static final RegistryObject<Item> SONIC_WIIMOTE = ITEMS.register("sonic_wiimote",
            SonicItem::new);

    public static final RegistryObject<Item> SONIC_SCREWDRIVER = ITEMS.register("sonic_screwdriver",
            SonicItem::new);

//    public static final RegistryObject<Item> ASEOHA_MANUAL = ITEMS.register("aseoha_manual",
//            () -> new Manual(new Item.Properties().tab(ModItemGroup.ASEOHA_GROUP)));

    public static final RegistryObject<Item> TWINKIE = ITEMS.register("twinkie",
        () -> new Item(new Item.Properties().food(new Food.Builder().nutrition(4).saturationMod(0.7f).fast().build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP)));

    public static final RegistryObject<Item> TEZARAK_COIN = ITEMS.register("tezarak_coin",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(16).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_SHARD = ITEMS.register("blue_crystal_shard",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> CRYSTALINE_SHARD = ITEMS.register("crystaline_shard",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> PURE_CRYSTALINE_SHARD = ITEMS.register("pure_crystaline_shard",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_PILE = ITEMS.register("blue_crystal_pile",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> CRYSTALINE_PILE = ITEMS.register("crystaline_pile",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> PURE_CRYSTALINE_PILE = ITEMS.register("pure_crystaline_pile",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_NUGGET = ITEMS.register("blue_crystal_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> CRYSTALINE_NUGGET = ITEMS.register("crystaline_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> PURE_CRYSTALINE_NUGGET = ITEMS.register("pure_crystaline_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> DALEKANIUM_NUGGET = ITEMS.register("dalekanium_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CARBON_STEEL_NUGGET = ITEMS.register("carbon_steel_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> METALERT_NUGGET = ITEMS.register("metalert_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_NUGGET = ITEMS.register("pure_dalekanium_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> BLUE_CRYSTAL_INGOT = ITEMS.register("blue_crystal_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> PURE_CRYSTALINE_INGOT = ITEMS.register("pure_crystaline_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> METALERT_INGOT = ITEMS.register("metalert_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> PURE_DALEKANIUM_INGOT = ITEMS.register("pure_dalekanium_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> DALEKANIUM_INGOT = ITEMS.register("dalekanium_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CRYSTALINE_INGOT = ITEMS.register("crystaline_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CARBON_STEEL_INGOT = ITEMS.register("carbon_steel_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LATINUM_INGOT = ITEMS.register("latinum_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LATINUM_BAR = ITEMS.register("latinum_bar",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LATINUM_BOTTLE = ITEMS.register("latinum_bottle",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> HUON_BOTTLE = ITEMS.register("huon_bottle",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LATINUM_BUCKET = ITEMS.register("latinum_bucket",
            ()-> new BucketItem(ModFluids.LATINUM, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LATINUM_BRICK = ITEMS.register("latinum_brick",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> LATINUM_STRIP = ITEMS.register("latinum_strip",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CONTROL_MOLD = ITEMS.register("control_mold",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ENGINE = ITEMS.register("engine",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> MAJESTIC_TALE_DISC = ITEMS.register("majestic_tale_disc",
            () -> new MusicDiscItem(1, Sounds.MAJESTIC_TALE, new Item.Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CYBER_ARMY_DISC = ITEMS.register("cyber_army_disc",
            () -> new MusicDiscItem(1, Sounds.CYBER_ARMY, new Item.Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CYBERMEN_DISC = ITEMS.register("cybermen_disc",
            () -> new MusicDiscItem(1, Sounds.CYBERMEN, new Item.Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> IDIOT_BOX_DISC = ITEMS.register("idiot_box_disc",
            () -> new MusicDiscItem(1, Sounds.IDIOT_BOX, new Item.Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> WARP_CORE = ITEMS.register("warp_core",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(16).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> STAR_INFUSED_NETHERITE_INGOT = ITEMS.register("star_infused_netherite_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(16).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> NETHERITE_REINFORCED_CIRCUITS = ITEMS.register("netherite_reinforced_circuits",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(64).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> NEMESIS_TYPE_2_PHASER = ITEMS.register("nemesis_type_2_phaser",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> PHASER_POWER_CELL = ITEMS.register("phaser_power_cell",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(16).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item((new Item.Properties()).food(new Food.Builder().nutrition(4).saturationMod(0.7F).build()).tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CANDY_CANE_SONIC = ITEMS.register("candy_cane_sonic",
            () -> new SwordItem(AseohaItemTiers.CANDY_CANE, 3, -2.4f, new Item.Properties().tab(AseohaItemGroups.ASEOHA_FOOD_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(AseohaItemTiers.STEEL, 1, -2.8F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(AseohaItemTiers.STEEL, 1, -3.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(AseohaItemTiers.STEEL, 7, -3.2F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(AseohaItemTiers.STEEL, 1, -2.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(AseohaItemTiers.STEEL, 3, -2.4F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_BOOTS = ARMOR_ITEMS.register("steel_boots",
            () -> new ArmorItem(EnumArmorMaterials.STEEL, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ARMOR_ITEMS.register("steel_leggings",
            () -> new ArmorItem(EnumArmorMaterials.STEEL, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_CHEST = ARMOR_ITEMS.register("steel_chestplate",
            () -> new ArmorItem(EnumArmorMaterials.STEEL, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_HELMET = ARMOR_ITEMS.register("steel_helmet",
            () -> new ArmorItem(EnumArmorMaterials.STEEL, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_HELMET = ARMOR_ITEMS.register("dalekanium_helmet",
            () -> new ArmorItem(EnumArmorMaterials.DALEKANIUM, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_CHESTPLATE = ARMOR_ITEMS.register("dalekanium_chestplate",
            () -> new ArmorItem(EnumArmorMaterials.DALEKANIUM, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_LEGGINGS = ARMOR_ITEMS.register("dalekanium_leggings",
            () -> new ArmorItem(EnumArmorMaterials.DALEKANIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_BOOTS = ARMOR_ITEMS.register("dalekanium_boots",
            () -> new ArmorItem(EnumArmorMaterials.DALEKANIUM, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_PICKAXE = ITEMS.register("dalekanium_pickaxe",
            () -> new PickaxeItem(AseohaItemTiers.DALEKANIUM, 1, -2.8F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_SHOVEL = ITEMS.register("dalekanium_shovel",
            () -> new ShovelItem(AseohaItemTiers.DALEKANIUM, 1, -3.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_AXE = ITEMS.register("dalekanium_axe",
            () -> new AxeItem(AseohaItemTiers.DALEKANIUM, 7, -3.2F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_HOE = ITEMS.register("dalekanium_hoe",
            () -> new HoeItem(AseohaItemTiers.DALEKANIUM, 1, -2.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_SWORD = ITEMS.register("dalekanium_sword",
            () -> new SwordItem(AseohaItemTiers.DALEKANIUM, 3, -2.4F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_HELMET = ARMOR_ITEMS.register("carbon_steel_helmet",
            () -> new ArmorItem(EnumArmorMaterials.CARBON_STEEL, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_CHESTPLATE = ARMOR_ITEMS.register("carbon_steel_chestplate",
            () -> new ArmorItem(EnumArmorMaterials.CARBON_STEEL, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_LEGGINGS = ARMOR_ITEMS.register("carbon_steel_leggings",
            () -> new ArmorItem(EnumArmorMaterials.CARBON_STEEL, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_BOOTS = ARMOR_ITEMS.register("carbon_steel_boots",
            () -> new ArmorItem(EnumArmorMaterials.CARBON_STEEL, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_PICKAXE = ITEMS.register("carbon_steel_pickaxe",
            () -> new PickaxeItem(AseohaItemTiers.CARBON_STEEL, 1, -2.8F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_SHOVEL = ITEMS.register("carbon_steel_shovel",
            () -> new ShovelItem(AseohaItemTiers.CARBON_STEEL, 1, -3.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_AXE = ITEMS.register("carbon_steel_axe",
            () -> new AxeItem(AseohaItemTiers.CARBON_STEEL, 7, -3.2F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_HOE = ITEMS.register("carbon_steel_hoe",
            () -> new HoeItem(AseohaItemTiers.CARBON_STEEL, 1, -2.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> CARBON_STEEL_SWORD = ITEMS.register("carbon_steel_sword",
            () -> new SwordItem(AseohaItemTiers.CARBON_STEEL, 3, -2.4F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_HELMET = ARMOR_ITEMS.register("metalert_helmet",
            () -> new ArmorItem(EnumArmorMaterials.METALERT, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_CHESTPLATE = ARMOR_ITEMS.register("metalert_chestplate",
            () -> new ArmorItem(EnumArmorMaterials.METALERT, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_LEGGINGS = ARMOR_ITEMS.register("metalert_leggings",
            () -> new ArmorItem(EnumArmorMaterials.METALERT, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_BOOTS = ARMOR_ITEMS.register("metalert_boots",
            () -> new ArmorItem(EnumArmorMaterials.METALERT, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_PICKAXE = ITEMS.register("metalert_pickaxe",
            () -> new PickaxeItem(AseohaItemTiers.METALERT, 1, -2.8F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_SHOVEL = ITEMS.register("metalert_shovel",
            () -> new ShovelItem(AseohaItemTiers.METALERT, 1, -3.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_AXE = ITEMS.register("metalert_axe",
            () -> new AxeItem(AseohaItemTiers.METALERT, 7, -3.2F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_HOE = ITEMS.register("metalert_hoe",
            () -> new HoeItem(AseohaItemTiers.METALERT, 1, -2.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> METALERT_SWORD = ITEMS.register("metalert_sword",
            () -> new SwordItem(AseohaItemTiers.METALERT, 3, -2.4F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_HELMET = ARMOR_ITEMS.register("pure_dalekanium_helmet",
            () -> new ArmorItem(EnumArmorMaterials.PURE_DALEKANIUM, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_CHESTPLATE = ARMOR_ITEMS.register("pure_dalekanium_chestplate",
            () -> new ArmorItem(EnumArmorMaterials.PURE_DALEKANIUM, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_LEGGINGS = ARMOR_ITEMS.register("pure_dalekanium_leggings",
            () -> new ArmorItem(EnumArmorMaterials.PURE_DALEKANIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_BOOTS = ARMOR_ITEMS.register("pure_dalekanium_boots",
            () -> new ArmorItem(EnumArmorMaterials.PURE_DALEKANIUM, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_PICKAXE = ITEMS.register("pure_dalekanium_pickaxe",
            () -> new PickaxeItem(AseohaItemTiers.PURE_DALEKANIUM, 1, -2.8F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_SHOVEL = ITEMS.register("pure_dalekanium_shovel",
            () -> new ShovelItem(AseohaItemTiers.PURE_DALEKANIUM, 1, -3.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_AXE = ITEMS.register("pure_dalekanium_axe",
            () -> new AxeItem(AseohaItemTiers.PURE_DALEKANIUM, 7, -3.2F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_HOE = ITEMS.register("pure_dalekanium_hoe",
            () -> new HoeItem(AseohaItemTiers.PURE_DALEKANIUM, 1, -2.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> PURE_DALEKANIUM_SWORD = ITEMS.register("pure_dalekanium_sword",
            () -> new SwordItem(AseohaItemTiers.PURE_DALEKANIUM, 3, -2.4F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_HELMET = ARMOR_ITEMS.register("latinum_helmet",
            () -> new ArmorItem(EnumArmorMaterials.LATINUM, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_CHESTPLATE = ARMOR_ITEMS.register("latinum_chestplate",
            () -> new ArmorItem(EnumArmorMaterials.LATINUM, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_LEGGINGS = ARMOR_ITEMS.register("latinum_leggings",
            () -> new ArmorItem(EnumArmorMaterials.LATINUM, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_BOOTS = ARMOR_ITEMS.register("latinum_boots",
            () -> new ArmorItem(EnumArmorMaterials.LATINUM, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_PICKAXE = ITEMS.register("latinum_pickaxe",
            () -> new PickaxeItem(AseohaItemTiers.LATINUM, 1, -2.8F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_SHOVEL = ITEMS.register("latinum_shovel",
            () -> new ShovelItem(AseohaItemTiers.LATINUM, 1, -3.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_AXE = ITEMS.register("latinum_axe",
            () -> new AxeItem(AseohaItemTiers.LATINUM, 7, -3.2F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_HOE = ITEMS.register("latinum_hoe",
            () -> new HoeItem(AseohaItemTiers.LATINUM, 1, -2.0F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> LATINUM_SWORD = ITEMS.register("latinum_sword",
            () -> new SwordItem(AseohaItemTiers.LATINUM, 3, -2.4F, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STARFLEETCOMMANDER_TUNIC = ARMOR_ITEMS.register("starfleet_commander_tunic",
            () -> new ArmorItem(EnumArmorMaterials.STARFLEET_COMMANDER, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));
            
    public static final RegistryObject<Item> STARFLEET_OPERATIONS_TUNIC = ARMOR_ITEMS.register("starfleet_operations_tunic",
            () -> new ArmorItem(EnumArmorMaterials.STARFLEET_OPERATIONS, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STARFLEET_SCIENCE_TUNIC = ARMOR_ITEMS.register("starfleet_science_tunic",
            () -> new ArmorItem(EnumArmorMaterials.STARFLEET_SCIENCE, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STARFLEET_LEGGINGS = ARMOR_ITEMS.register("starfleet_leggings",
            () -> new ArmorItem(EnumArmorMaterials.STARFLEET, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STARFLEET_BOOTS = ARMOR_ITEMS.register("starfleet_boots",
            () -> new ArmorItem(EnumArmorMaterials.STARFLEET, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> SCARF = ARMOR_ITEMS.register("scarf",
            () -> new ScarfArmorItem(EnumArmorMaterials.SCARF, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> SASH_OF_RASSILON = ARMOR_ITEMS.register("sash_of_rassilon",
            () -> new SashArmorItem(EnumArmorMaterials.SASH_OF_RASSILON, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> FEZ = ARMOR_ITEMS.register("fez_red",
            () -> new FezArmorItem(EnumArmorMaterials.FEZ, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> BOWTIE_RED = ARMOR_ITEMS.register("bowtie_red",
            () -> new BowtieArmorItem(EnumArmorMaterials.BOWTIE, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP), "red"));

    public static final RegistryObject<Item> BOWTIE_BLUE = ARMOR_ITEMS.register("bowtie_blue",
            () -> new BowtieArmorItem(EnumArmorMaterials.BOWTIE, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP), "blue"));

    public static final RegistryObject<Item> SONIC_LASER = ITEMS.register("sonic_laser",
            LaserSonic::new);

    public static <T extends Item> T createItem(T item) {
        return item;
    }
    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}


}