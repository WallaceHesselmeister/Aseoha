package tama.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.MusicDiscItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;

public class LavaChickenDiscItem extends MusicDiscItem {
    public LavaChickenDiscItem(int comparatorValue, SoundEvent soundEvent, Properties properties) {
        super(comparatorValue, soundEvent, properties.rarity(Rarity.RARE));
    }
}
