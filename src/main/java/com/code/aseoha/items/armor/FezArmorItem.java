package com.code.aseoha.items.armor;

import com.code.aseoha.Helpers.PlayerHelper;
import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.armor.FezModel;
import com.code.aseoha.client.models.armor.RassilonSashModel;
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

public class FezArmorItem extends ArmorItem {
    @Getter
    private static final FezModel MODEL = new FezModel();

    public FezArmorItem(IArmorMaterial material, EquipmentSlotType slot, Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(aseoha.MODID, "textures/models/armor/fez.png").toString();
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        MODEL.getBone().xRot = _default.head.xRot;
        MODEL.getBone().yRot = _default.head.yRot;
        MODEL.getBone().zRot = _default.head.zRot;
        return (A) MODEL;
    }
}