/* (C) TAMA Studios 2025 */
package tama.Controls;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.Control;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataNone;

public class CollisionControl extends Control<ControlDataNone> {

    public CollisionControl(ControlType<ControlDataNone> type) {
        super(type);
    }

    @Override
    public InteractionResult onUse(Player player, InteractionHand interactionHand, ITardisLevel iTardisLevel) {
        return InteractionResult.PASS;
    }
}
