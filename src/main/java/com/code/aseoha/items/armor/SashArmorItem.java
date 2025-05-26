package com.code.aseoha.items.armor;

import com.code.aseoha.Helpers.PlayerHelper;
import com.code.aseoha.aseoha;
import com.code.aseoha.client.models.armor.RassilonSashModel;
import lombok.Getter;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public class SashArmorItem extends ArmorItem {
    @Getter
    private static final RassilonSashModel MODEL = new RassilonSashModel();

    public SashArmorItem(IArmorMaterial material, EquipmentSlotType slot, Item.Properties properties) {
        super(material, slot, properties);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return new ResourceLocation(aseoha.MODID, "textures/models/armor/sash_of_rassilon.png").toString();
    }

    @Nullable
    @Override
    @SuppressWarnings("unchecked")
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        MODEL.setupAnim(entityLiving, entityLiving.swingTime, 0, entityLiving.tickCount, PlayerHelper.calculateNetHeadYaw(entityLiving), entityLiving.yHeadRotO);
        MODEL.body.visible = true;
        return (A) MODEL;
    }
}