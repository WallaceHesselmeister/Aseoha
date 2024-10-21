package com.code.aseoha.DataGen;

import com.code.aseoha.aseoha;
import com.code.aseoha.misc.Loot;
import net.minecraft.data.DataGenerator;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class LootGen extends GlobalLootModifierProvider {
    public LootGen(DataGenerator gen) {
        super(gen, aseoha.MODID);
    }

    @Override
    protected void start() {

        ResourceLocation[] UncommonLootTable = new ResourceLocation[]{
                LootTables.ABANDONED_MINESHAFT,
                LootTables.BASTION_BRIDGE,
                LootTables.LIBRARIAN_GIFT,
                LootTables.WOODLAND_MANSION,
                LootTables.STRONGHOLD_LIBRARY,
                LootTables.SHIPWRECK_SUPPLY
        };
        ResourceLocation[] RareLootTable = new ResourceLocation[]{
                LootTables.ABANDONED_MINESHAFT,
                LootTables.BASTION_BRIDGE,
                LootTables.WOODLAND_MANSION,
                LootTables.STRONGHOLD_LIBRARY,
        };

        for (ResourceLocation currentTable : UncommonLootTable) {
            add(currentTable.getPath(), Loot.ASEOHA_COMMON_LOOT.get(), new Loot.AseohaCommonLoot(
                    new ILootCondition[]{LootTableIdCondition.builder(currentTable).build()}, 20)
            );
        }
        for (ResourceLocation currentTable : RareLootTable) {
            add(currentTable.getPath(), Loot.ASEOHA_UNCOMMON_LOOT.get(), new Loot.AseohaUncommonLoot(
                    new ILootCondition[]{LootTableIdCondition.builder(currentTable).build()}, 20)
            );
        }

        for (ResourceLocation resourceLocation : LootTables.all()) {
            if (resourceLocation.getPath().contains("treasure")) {
                add(resourceLocation.getPath(), Loot.ASEOHA_RARE_LOOT.get(), new Loot.AseohaRareLoot(
                        new ILootCondition[]{LootTableIdCondition.builder(resourceLocation).build()}, 50)
                );
            }
        }


    }
}
