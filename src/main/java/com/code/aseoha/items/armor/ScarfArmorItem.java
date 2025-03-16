package com.code.aseoha.items.armor;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.armor.ScarfModel;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

public class ScarfArmorItem extends ArmorItem {
    public ScarfArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(aseoha.MODID, "textures/models/armor/scarf.png").toString();
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        ScarfModel model = new ScarfModel();

        // Set visibility based on the armor slot
        model.head.visible = armorSlot == EquipmentSlotType.HEAD;
        model.hat.visible = armorSlot == EquipmentSlotType.HEAD;
        model.body.visible = armorSlot == EquipmentSlotType.CHEST;
        model.rightArm.visible = armorSlot == EquipmentSlotType.CHEST;
        model.leftArm.visible = armorSlot == EquipmentSlotType.CHEST;
        model.rightLeg.visible = armorSlot == EquipmentSlotType.LEGS || armorSlot == EquipmentSlotType.FEET;
        model.leftLeg.visible = armorSlot == EquipmentSlotType.LEGS || armorSlot == EquipmentSlotType.FEET;

        return (A) model;
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return this.slot;
    }
}