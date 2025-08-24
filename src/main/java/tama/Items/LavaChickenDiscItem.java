package tama.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class LavaChickenDiscItem extends RecordItem {
    public LavaChickenDiscItem() {
        super(15, Sounds.LAVA_CHICKEN.get(), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 20); // TODO: Set the tick duration properly
    }
}
