package com.code.aseoha.items;

import java.util.Iterator;
import java.util.Map;

import com.code.aseoha.misc.AClientHelper;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.tardis.mod.itemgroups.TItemGroups;
import net.tardis.mod.properties.Prop.Items;
import org.jetbrains.annotations.NotNull;

public class PrydonianRobes extends ArmorItem {
    public static final GallifreyMaterial gallifreyMaterial = new GallifreyMaterial();

    public PrydonianRobes(EquipmentSlotType slot) {
        super(gallifreyMaterial, slot, ((Item.Properties)Items.ONE.get()).tab(ModItemGroup.ASEOHA_GROUP));
    }
    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if(slot == EquipmentSlotType.HEAD) return "aseoha:textures/armor/prydonian_helm.png";
        return "aseoha:textures/armor/prydonian_helm.png";
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        Map<Item, BipedModel<?>> map = AClientHelper.getPrydonianArmorModel(itemStack);
        BipedModel<?> model = map.get(itemStack.getItem());
        return (A) model;
    }

    public static class GallifreyMaterial implements IArmorMaterial {
        public GallifreyMaterial() {
        }

        public int getDefenseForSlot(@NotNull EquipmentSlotType arg0) {
            return 0;
        }

        public int getDurabilityForSlot(@NotNull EquipmentSlotType arg0) {
            return 0;
        }

        public int getEnchantmentValue() {
            return 0;
        }

        @NotNull
        public String getName() {
            return "aseoha:gallifrey_material";
        }

        @NotNull
        public Ingredient getRepairIngredient() {
            return Ingredient.EMPTY;
        }

        @NotNull
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_GENERIC;
        }

        public float getToughness() {
            return 3.0F;
        }

        public float getKnockbackResistance() {
            return 0.4F;
        }
    }
}
