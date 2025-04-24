package com.code.aseoha.items.Materials;

import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum AseohaArmorMaterials implements IArmorMaterial {

    STEEL("steel", 25, new int[] { 3, 6, 7, 3 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(AseohaItems.STEEL_INGOT.get())),

    CARBON_STEEL("carbon_steel", 25, new int[] { 4, 6, 7, 3 }, 10,
            SoundEvents.ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.of(AseohaItems.CARBON_STEEL_INGOT.get())),

    DALEKANIUM("dalekanium", 25, new int[] { 4, 6, 8, 3 }, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 2.0f, 0.0f, () -> Ingredient.of(AseohaItems.DALEKANIUM_INGOT.get())),

    PURE_DALEKANIUM("pure_dalekanium", 25, new int[] { 4, 6, 8, 4 }, 20,
            SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.5f, () -> Ingredient.of(AseohaItems.PURE_DALEKANIUM_INGOT.get())),

    METALERT("metalert", 25, new int[] { 4, 7, 9, 3 }, 25,
            SoundEvents.ARMOR_EQUIP_IRON, 3.5f, 1.0f, () -> Ingredient.of(AseohaItems.METALERT_INGOT.get())),

    LATINUM("latinum", 25, new int[] { 4, 8, 9, 5 }, 30,
            SoundEvents.ARMOR_EQUIP_IRON, 4.0f, 1.5f, () -> Ingredient.of(AseohaItems.LATINUM_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairIngredient;

    /**
     * @param name The ID of the armor material, keep it lowecase letters and _ only, no numbers or special characters
     * @param durability The base durability of the armor material
     * @param protectionPerSlot An int array defined as such: new int[] { head, chest, legs, feet }
     * @param enchantmentValue The enchantment value of the armor material, gold has a very high enchantment value, which is why it's easy to get good enchants
     * @param sound The sound event played when the armor is equipped
     * @param toughness The toughness of the armor material, dunno what this does google it or mess around with it or smth, TODO: figure out toughness value
     * @param knockbackResistance The knockback resistance of the material, higher = less knockback on the player, I think the max is like 1.0f or smth
     * @param repairIngredient The ingredient used to repair the armor, example: () -> Ingredient.of(Items.DIAMOND), if you're using a mod item add .get() after the item, like this () -> Ingredient.of(AseohaItems.DALEKANIUM_INGOT.get()))
     **/
    AseohaArmorMaterials(String name, int durability, int[] protectionPerSlot, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durability;
        this.slotProtections = protectionPerSlot;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }


    public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
        return HEALTH_PER_SLOT[p_200896_1_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
        return this.slotProtections[p_200902_1_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @NotNull
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @NotNull
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return String.join("",aseoha.MODID, ":", this.name);
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
