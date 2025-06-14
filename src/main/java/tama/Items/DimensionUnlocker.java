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
    public InteractionResultHolder<ItemStack> use(Level p_41432_, Player p_41433_, InteractionHand p_41434_) {
        Capabilities.getCap(Capabilities.TARDIS, p_41432_)
                .ifPresent(iTardisLevel -> iTardisLevel.getUnlockHandler().unlock(this.DimensionType));

        return super.use(p_41432_, p_41433_, p_41434_);
    }
}
