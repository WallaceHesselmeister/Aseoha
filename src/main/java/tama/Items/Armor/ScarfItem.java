package tama.Items.Armor;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;
import tama.Client.Models.Armor.ScarfModel;
import tama.Client.Renderers.Armor.ScarfRenderer;

import static tama.aseoha.MODID;

public class ScarfItem extends ModdedArmorItem{
    public ScarfItem(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    protected ModelPart getRenderer(LivingEntity living, ItemStack stack, EquipmentSlot slot) {
        return new ScarfRenderer<>(ScarfModel::createBodyLayer, ScarfModel::new).makeArmorParts(slot);
    }

    @Override
    public @Nullable String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return makeCustomTextureLocation(MODID, "scarf");
    }
}
