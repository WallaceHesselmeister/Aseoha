package com.code.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.HashMap;
import java.util.Iterator;

import static com.code.aseoha.MOD_ID;

public class EN_USLangProvider extends FabricLanguageProvider {
    public HashMap<String, String> translations = new HashMap();
    public String languageType;
    private final FabricDataOutput dataGenerator;

    public EN_USLangProvider(FabricDataOutput dataOutput, String languageType) {
        super(dataOutput, languageType.toLowerCase());
        this.languageType = languageType;
        this.dataGenerator = dataOutput;
    }

//	private EN_USLangProvider(FabricDataOutput dataGenerator) {
//            super(dataGenerator, "en_us");
//        }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
//        translationBuilder.add("", "");
        Iterator var2 = this.translations.keySet().iterator();

        while(var2.hasNext()) {
            String key = (String)var2.next();
            translationBuilder.add(key, (String)this.translations.get(key));
        }

//        try {
//            Path existingFilePath = dataGenerator.getModContainer().findPath("assets/mymod/lang/en_us.existing.json").get();
//            translationBuilder.add(existingFilePath);
//        } catch (Exception e) {
//            throw new RuntimeException("Failed to add existing language file!", e);
//        }

//        this.dataGenerator.getModContainer().findPath("assets/aseoha/lang/en_us.existing.json").ifPresent((existingFilePath) -> {
//            try {
//                translationBuilder.add(existingFilePath);
//            } catch (Exception var4) {
//                Exception e = var4;
//                LOGGER.warn("Failed to add existing language file! ({}) | ", this.languageType.name().toLowerCase(), e);
//            }
//
//        });
    }

    public void addTranslation(Item item, String translation) {
        this.translations.put(item.getDescriptionId(), translation);
    }

    public void addTranslation(CreativeModeTab itemGroup, String translation) {
        this.translations.put(this.getTranslationKeyForItemGroup(itemGroup), translation);
    }

    public void addTranslation(String key, String translation) {
        this.translations.put(key, translation);
    }

    public void addTranslation(Block block, String translation) {
        this.translations.put(block.getDescriptionId(), translation);
    }

    private String getTranslationKeyForItemGroup(CreativeModeTab itemGroup) {
        return itemGroup.getDisplayName().getString();
    }
}