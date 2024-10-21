package com.code.aseoha.outfits;

import com.code.aseoha.items.AseohaItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.tardis.mod.entity.misc.outfits.Outfit;

import java.util.function.Predicate;

public class PrydonianOutfit extends Outfit {
    public PrydonianOutfit(Predicate<LivingEntity> shouldBeWearing) {
        super(shouldBeWearing);
    }

    public void registerItems() {
        this.addItem(EquipmentSlotType.HEAD, (Item) AseohaItems.PRYDONIAN_HELM.get());
//        this.addItem(EquipmentSlotType.CHEST, (Item)TItems.SPACE_CHEST.get());
//        this.addItem(EquipmentSlotType.LEGS, (Item)TItems.SPACE_LEGS.get());
//        this.addItem(EquipmentSlotType.FEET, (Item)TItems.SPACE_BOOTS.get());
    }
}
