package tama.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import tama.Sounds.Sounds;

public class AItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "tama");

    public static final RegistryObject<Item> LAVA_CHICKEN_DISC = ITEMS.register(
            "lava_chicken_disc",
            () -> new LavaChickenDiscItem(
                    1,
                    ModSounds.LAVA_CHICKEN,
                    new Item.Properties().stacksTo(1).rarity(Rarity.RARE),
                    180
            )
    );
}
