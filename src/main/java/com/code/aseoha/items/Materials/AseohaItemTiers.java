package com.code.aseoha.items.Materials;

import com.code.aseoha.items.AseohaItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.tardis.mod.items.TItems;

import java.util.function.Supplier;

public enum AseohaItemTiers implements IItemTier {

    STEEL(3, 500, 8.5F, 2.5F, 15,
            () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    CARBON_STEEL(4, 1200, 6.0F, 2.7F, 15,
            () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    DALEKANIUM(5, 1750, 9.0F, 3.2F, 15,
                  () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    PURE_DALEKANIUM(6, 2000, 9.0F, 3.4F, 15,
            () -> Ingredient.of(AseohaItems.PURE_DALEKANIUM_INGOT.get())),

    METALERT(7, 2150, 9.0F, 4.2F, 20,
                  () -> Ingredient.of(AseohaItems.METALERT_INGOT.get())),

    LATINUM(10, 3450, 10.0F, 6F, 30,
                  () -> Ingredient.of(AseohaItems.LATINUM_INGOT.get())),

    CANDY_CANE(0, 32, 12.0F, 0.0F, 22,
            () -> Ingredient.of(AseohaItems.STEEL_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    private AseohaItemTiers(int level, int durability, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
