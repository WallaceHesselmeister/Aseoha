// src/main/java/com/yourname/modname/ModMaterials.java
package com.code.aseoha.enums;

import com.code.aseoha.items.AseohaItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum EnumArmorMaterials implements IArmorMaterial {
    CUSTOM("custom", 25, new int[]{3, 6, 8, 3}, 15,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> Ingredient.of(Items.DIAMOND)),

    SASH_OF_RASSILON("sash_of_rassilon", 25, new int[]{1, 1, 1, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.0F, () -> Ingredient.of(Items.WHITE_WOOL)),

    SCARF("scarf", 25, new int[]{1, 1, 1, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.0F, () -> Ingredient.of(Items.WHITE_WOOL)),

    FEZ("fez", 25, new int[]{1, 1, 1, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.0F, () -> Ingredient.of(Items.WHITE_WOOL)),

    BOWTIE("bowtie", 25, new int[]{1, 1, 1, 1}, 15,
            SoundEvents.ARMOR_EQUIP_LEATHER, 1.0F, 0.0F, () -> Ingredient.of(Items.WHITE_WOOL)),

    STEEL("steel", 25, new int[] { 3, 6, 7, 2 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    DALEKANIUM("dalekanium", 25, new int[] { 4, 7, 9, 2 }, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.of(AseohaItems.DALEKANIUM_INGOT.get())),

    CARBON_STEEL("carbon_steel", 25, new int[] { 3, 6, 7, 2 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.of(AseohaItems.CARBON_STEEL_INGOT.get())),

    PURE_DALEKANIUM("pure_dalekanium", 25, new int[] { 3, 6, 7, 2 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.of(AseohaItems.PURE_DALEKANIUM_INGOT.get())),

    LATINUM("latinum", 25, new int[] { 3, 6, 7, 2 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.of(AseohaItems.LATINUM_INGOT.get())),

    METALERT("metalert", 25, new int[] { 3, 6, 7, 2 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 1.0f, 0.5f, () -> Ingredient.of(AseohaItems.METALERT_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 13};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    EnumArmorMaterials(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue,
                 SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return HEALTH_PER_SLOT[slot.getIndex()] * durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlotType slot) {
        return slotProtections[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }

    @Override
    public String getName() {
    return "aseoha:" + name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }
}