/* (C) TAMA Studios 2025 */
package tama.Items;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.tardis.mod.cap.Capabilities;

public class DimensionUnlocker extends Item {

    private final ResourceKey<DimensionType> DimensionType;

    public DimensionUnlocker(Properties p_41383_, ResourceKey<DimensionType> Dimension) {
        super(p_41383_);
        this.DimensionType = Dimension;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if(interactionHand.equals(InteractionHand.OFF_HAND))
            return super.use(level, player, interactionHand);

        Capabilities.getCap(Capabilities.TARDIS, level)
                .ifPresent(iTardisLevel -> iTardisLevel.getUnlockHandler().unlock(this.DimensionType));

        player.setItemSlot(this.getEquipmentSlot(player.getMainHandItem()), AItems.EMPTY_UNLOCKER.get().getDefaultInstance());

        return super.use(level, player, interactionHand);
    }
}
