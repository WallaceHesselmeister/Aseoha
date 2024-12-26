package com.code.common.items;

import com.code.common.enums.AmmoType;
import com.code.common.items.magazines.AbstractMagazine;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BulletItem extends Item {
    private final AmmoType TYPE;
    public BulletItem(AmmoType type) {
        super(new Properties().arch$tab(AseohaTabs.FIREARMS_TAB));
        this.TYPE = type;
    }

    public AmmoType GetCaliber() {
        return this.TYPE;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
//        return super.use(level, player, interactionHand);

        if(player.getOffhandItem().getItem() instanceof AbstractMagazine abstractMagazine) {
            if(abstractMagazine.GetAmmoType() == this.TYPE) {
                if (abstractMagazine.GetRounds() < abstractMagazine.GetMaxSize()) {
                    abstractMagazine.AddRounds(((short) 1));
                    return InteractionResultHolder.consume(this.getDefaultInstance());
                }
            }
        }
        return InteractionResultHolder.fail(this.getDefaultInstance());
    }
}
