package com.code.aseoha.items.armor;

import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.armor.BowTieModel;
import lombok.Getter;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class BowtieArmorItem extends ArmorItem {
    @Getter
    private static final BowTieModel MODEL = new BowTieModel();
    public final String color;

    public BowtieArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties, String color) {
        super(material, slot, properties);
        this.color = color;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        ResourceLocation rl;
        switch (this.color) {
            case "blue": {
                rl = new ResourceLocation(aseoha.MODID, "textures/models/armor/bowtie_blue.png");
                break;
            }
            default: {
                rl = new ResourceLocation(aseoha.MODID, "textures/models/armor/bowtie_red.png");
                break;
            }
        }
        return rl.toString();
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return (A) MODEL;
    }

    @Nullable
    @Override
    public EquipmentSlotType getEquipmentSlot(ItemStack stack) {
        return this.slot;
    }
}