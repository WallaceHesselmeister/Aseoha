package com.code.aseoha.items.armor;

import com.code.aseoha.Helpers.PlayerHelper;
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
import org.jetbrains.annotations.Nullable;

public class ScarfArmorItem extends ArmorItem {
    public static final ScarfModel MODEL = new ScarfModel();

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
        MODEL.setupAnim(entityLiving, entityLiving.swingTime, 0, entityLiving.tickCount, PlayerHelper.calculateNetHeadYaw(entityLiving), entityLiving.yHeadRotO);
        // Set visibility based on the armor slot
        MODEL.head.visible = armorSlot == EquipmentSlotType.HEAD;
        MODEL.hat.visible = armorSlot == EquipmentSlotType.HEAD;
        MODEL.body.visible = armorSlot == EquipmentSlotType.CHEST;
        MODEL.rightArm.visible = armorSlot == EquipmentSlotType.CHEST;
        MODEL.leftArm.visible = armorSlot == EquipmentSlotType.CHEST;
        MODEL.rightLeg.visible = armorSlot == EquipmentSlotType.LEGS || armorSlot == EquipmentSlotType.FEET;
        MODEL.leftLeg.visible = armorSlot == EquipmentSlotType.LEGS || armorSlot == EquipmentSlotType.FEET;

        return (A) MODEL;
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return this.slot;
    }
}