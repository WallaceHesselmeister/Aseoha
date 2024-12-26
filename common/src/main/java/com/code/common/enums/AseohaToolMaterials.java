package com.code.common.enums;


import com.code.common.registries.AseohaItems;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

@SuppressWarnings({"deprecation", "unchecked"})
public enum AseohaToolMaterials implements Tier {
    LATINUM(6, 4128, 12.0F, 6.0F, 25, () -> Ingredient.of(AseohaItems.LATINUM_BRICK.get())),

    STEEL(3, 500, 8.5F, 3.5F, 15,
                  () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    DALEKANIUM(4, 3000, 6.0F, 5.5F, 20,
            () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    CANDY_CANE(0, 32, 12.0F, 0.0F, 22,
                       () -> Ingredient.of(AseohaItems.STEEL_INGOT.get()));


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    AseohaToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return this.itemDurability;
    }

    @Override
    public float getSpeed() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    @Override
    public int getLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
