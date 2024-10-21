package com.code.aseoha.DataGen;

import com.code.aseoha.aseoha;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLang extends LanguageProvider {

    public EnglishLang(DataGenerator gen) {
        super(gen, aseoha.MODID, "en_us");
    }

    @Override
    /**
     * THANKS JERYN!
     */
    protected void addTranslations() {
            add("woooo.woo", "woOOoo");
//        add("regen.sound.staser", "Staser Fires");
//        add(RItems.FOB.get(), "Chameleon Arch");
//        add(RegenTraitRegistry.PHOTOSYNTHETIC.get().description().getKey(), "The sun energizes you!");
    }

    public String grammerNazi(String text) {
        String firstLetter = text.substring(0, 1).toUpperCase();
        return firstLetter + text.substring(1);
    }
}