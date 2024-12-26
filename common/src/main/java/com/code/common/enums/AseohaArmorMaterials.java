package com.code.common.enums;

import com.code.aseoha;
import com.code.common.registries.AseohaItems;
import net.minecraft.Util;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum AseohaArmorMaterials implements ArmorMaterial {
//    private static final int[] BASE_DURABILITY = new int[]{40, 43, 44, 40};
//    private static final int[] PROTECTION_VALUES = new int[]{5, 8, 10, 5};

    LATINUM("latinum", 5, (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.BOOTS, 5);
        enumMap.put(ArmorItem.Type.LEGGINGS, 8);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 10);
        enumMap.put(ArmorItem.Type.HELMET, 5);
    }), 23, SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 1.0F, () -> Ingredient.of(AseohaItems.LATINUM_SLIP.get())),
    DALEKANIUM("dalekanium", 5, (EnumMap) Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.BOOTS, 7);
        enumMap.put(ArmorItem.Type.LEGGINGS, 10);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 12);
        enumMap.put(ArmorItem.Type.HELMET, 2);
    }), 23, SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 1.5F, () -> Ingredient.of(AseohaItems.LATINUM_SLIP.get())),
    STEEL("steel", 5, (EnumMap)Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.BOOTS, 3);
        enumMap.put(ArmorItem.Type.LEGGINGS, 6);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 7);
        enumMap.put(ArmorItem.Type.HELMET, 2);
    }), 20, SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5F, () -> Ingredient.of(Items.LEATHER));
    // In which A is boots, B leggings, C chestplate, and D helmet.
    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    private static final EnumMap HEALTH_FUNCTION_FOR_TYPE = Util.make(new EnumMap(ArmorItem.Type.class), (enumMap) -> {
        enumMap.put(ArmorItem.Type.BOOTS, 13);
        enumMap.put(ArmorItem.Type.LEGGINGS, 15);
        enumMap.put(ArmorItem.Type.CHESTPLATE, 16);
        enumMap.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap protectionFunctionForType;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private AseohaArmorMaterials(String string2, int j, EnumMap enumMap, int k, SoundEvent soundEvent, float f, float g, Supplier supplier) {
        this.name = string2;
        this.durabilityMultiplier = j;
        this.protectionFunctionForType = enumMap;
        this.enchantmentValue = k;
        this.sound = soundEvent;
        this.toughness = f;
        this.knockbackResistance = g;
        this.repairIngredient = new LazyLoadedValue(supplier);
    }

    public int getDurabilityForType(ArmorItem.Type type) {
        return (Integer)HEALTH_FUNCTION_FOR_TYPE.get(type) * this.durabilityMultiplier;
    }

    public int getDefenseForType(ArmorItem.Type type) {
        return (Integer)this.protectionFunctionForType.get(type);
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

    public String getName() {
        return aseoha.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String getSerializedName() {
        return this.name;
    }
}