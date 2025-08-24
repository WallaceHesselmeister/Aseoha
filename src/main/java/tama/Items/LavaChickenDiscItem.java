package tama.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.RecordItem;

public class LavaChickenDiscItem extends RecordItem {
    public LavaChickenDiscItem(int comparatorValue, SoundEvent soundEvent, Properties properties) {
        super(comparatorValue, soundEvent, properties.rarity(Rarity.RARE));
    }
}
