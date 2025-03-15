package com.code.aseoha.items;
import com.code.aseoha.client.Sounds;
import com.code.aseoha.entities.ModEntityTypes;
import com.code.aseoha.items.Materials.AseohaArmorMaterials;
import com.code.aseoha.items.Materials.AseohaItemTiers;
import com.code.aseoha.items.Upgrades.LightSpeedDrive;
import com.code.aseoha.items.Upgrades.TesseractDrive;
import com.code.aseoha.items.Upgrades.WarpDrive;
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

    public static final RegistryObject<Item> WARP_DRIVE = ITEMS.register("upgrades/warp_drive", () -> createItem(new WarpDrive()));

    public static final RegistryObject<Item> TESSERACT_DRIVE = ITEMS.register("upgrades/tesseract_drive", () -> createItem(new TesseractDrive()));

    public static final RegistryObject<Item> LIGHTSPEED_DRIVE = ITEMS.register("upgrades/lightspeed_drive", () -> createItem(new LightSpeedDrive()));

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

    public static final RegistryObject<Item> BLUE_CRYSTAL_PILE = ITEMS.register("blue_crystal_pile",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_NUGGET = ITEMS.register("blue_crystal_nugget",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> BLUE_CRYSTAL_INGOT = ITEMS.register("blue_crystal_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.RARE).fireResistant()));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> DALEKANIUM_INGOT = ITEMS.register("dalekanium_ingot",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CONTROL_MOLD = ITEMS.register("control_mold",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ENGINE = ITEMS.register("engine",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> MAJESTIC_TALE_DISC = ITEMS.register("majestic_tale_disc",
            () -> new MusicDiscItem(1, Sounds.MAJESTIC_TALE, new Item.Properties().stacksTo(1).tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            ()-> new Item(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP).stacksTo(1).rarity(Rarity.RARE).fireResistant()));

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


    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_CHEST = ITEMS.register("steel_chestplate",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            () -> new ArmorItem(AseohaArmorMaterials.STEEL, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));


    public static final RegistryObject<Item> DALEKANIUM_HELMET = ITEMS.register("dalekanium_helmet",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, EquipmentSlotType.HEAD, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_CHESTPLATE = ITEMS.register("dalekanium_chestplate",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, EquipmentSlotType.CHEST, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_LEGGINGS = ITEMS.register("dalekanium_leggings",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, EquipmentSlotType.LEGS, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

    public static final RegistryObject<Item> DALEKANIUM_BOOTS = ITEMS.register("dalekanium_boots",
            () -> new ArmorItem(AseohaArmorMaterials.DALEKANIUM, EquipmentSlotType.FEET, new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP)));

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

//    public static final RegistryObject<Item> SONIC_LASER = ITEMS.register("sonic_laser",
//            ()-> new );

    public static <T extends Item> T createItem(T item) {
        return item;
    }
    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}


}