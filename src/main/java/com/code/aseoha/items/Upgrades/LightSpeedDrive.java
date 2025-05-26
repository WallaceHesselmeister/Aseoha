package com.code.aseoha.items.Upgrades;

import com.code.aseoha.items.AseohaItemGroups;
import com.code.aseoha.items.CustomTooltipItem;
import net.minecraft.item.Item;
import net.minecraft.util.text.TranslationTextComponent;
import net.tardis.mod.constants.TardisConstants;
import net.tardis.mod.items.TardisPartItem;

public class LightSpeedDrive extends TardisPartItem implements CustomTooltipItem {

    public LightSpeedDrive() {
        super(new Item.Properties().tab(AseohaItemGroups.ASEOHA_GROUP), TardisConstants.Part.PartType.UPGRADE, false, false, TardisConstants.Translations.DEMAT_CIRCUIT, false);
    }

    @Override
    public TranslationTextComponent toolTip() {
        return new TranslationTextComponent("tooltip.aseoha.upgrade_lightspeed_drive");
    }
}
