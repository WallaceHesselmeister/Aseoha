package com.code.aseoha.items;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item.Properties;
import net.minecraft.util.SoundEvent;

import java.util.function.Supplier;

public class LavaChickenDiscItem extends MusicDiscItem {
    public LavaChickenDiscItem(int comparatorValue, Supplier<SoundEvent> soundSupplier, Properties properties) {
        super(comparatorValue, soundSupplier, properties);
    }
}
