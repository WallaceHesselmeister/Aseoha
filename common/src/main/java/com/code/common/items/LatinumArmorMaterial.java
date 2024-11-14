package com.code.common.items;

import com.code.common.registries.AseohaItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class LatinumArmorMaterial  implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{40, 43, 44, 40};
    private static final int[] PROTECTION_VALUES = new int[]{5, 8, 10, 5};

    // In which A is boots, B leggings, C chestplate, and D helmet.
    // For reference, Leather uses {1, 2, 3, 1}, and Diamond/Netherite {3, 6, 8, 3}

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getSlot().getIndex()] * 3;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return PROTECTION_VALUES[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return 5;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(AseohaItems.BLUE_CRYSTAL_INGOT.get());
    }

    @Override
    public String getName() {
        // Must be all lowercase
        return "latinum";
    }

    @Override
    public float getToughness() {
        return 3.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.3F;
    }
}