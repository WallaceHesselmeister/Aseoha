package com.code.aseoha.common.latinum;

import com.code.aseoha.common.Items;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LatinumArmorMaterial implements ArmorMaterial {
    public static final LatinumArmorMaterial INSTANCE = new LatinumArmorMaterial();

    @Override
    public int getDurability(ArmorItem.Type type) {
        // Replace this multiplier by a constant value for the durability of the armor.
        // For reference, diamond uses 33 for all armor pieces, whilst leather uses 5.
        int DURABILITY_MULTIPLIER = 50;
        return switch (type) {
            case BOOTS -> 13 * DURABILITY_MULTIPLIER;
            case LEGGINGS -> 15 * DURABILITY_MULTIPLIER;
            case CHESTPLATE -> 16 * DURABILITY_MULTIPLIER;
            case HELMET -> 11 * DURABILITY_MULTIPLIER;
            default -> 10;
        };
    }


    @Override
    public int getProtection(ArmorItem.Type type) {
        // Protection values for all the slots.
        // For reference, diamond uses 3 for boots, 6 for leggings, 8 for chestplate, and 3 for helmet,
        // whilst leather uses 1, 2, 3 and 1 respectively.
        return switch (type) {
            case BOOTS, HELMET -> 6;
            case LEGGINGS -> 8;
            case CHESTPLATE -> 11;
            default -> 6;
        };
    }


    @Override
    public int getEnchantability() {
        return 25;
    }


    @Override
    public SoundEvent getEquipSound() {
        // Example for Iron Armor
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.LATINUM_BAR);
    }


    @Override
    public String getName() {
        return "latinum";
    }

    @Override
    public float getToughness() {
        return 6.0F;
    }

    @Override
    public float getKnockbackResistance() {
        // We don't want knockback resistance for guidite armor, but if you do,
        // change this value to 0.XF, where X is the level of knockback resistance you want.
        return 0.4F;
    }
}
