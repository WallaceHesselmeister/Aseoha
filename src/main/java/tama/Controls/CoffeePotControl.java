/* (C) TAMA Studios 2025 */
package tama.Controls;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.Control;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataFloat;
import net.tardis.mod.control.datas.ControlDataNone;
import net.tardis.mod.registry.ItemRegistry;
import net.tardis.mod.sound.SoundRegistry;
import tama.RoundelRemote;

public class CoffeePotControl extends Control<ControlDataNone> {
    public RoundelRemote.Range range = RoundelRemote.Range.LONGEST;

    public CoffeePotControl(ControlType<ControlDataNone> type) {
        super(type);
    }

    public SoundEvent getDefaultSuccessSound(ControlDataFloat controlData) {
        return SoundRegistry.CONTROL_GENERIC.get();
    }

    public InteractionResult onUse(Player player, InteractionHand hand, ITardisLevel level) {
        if (hand == InteractionHand.MAIN_HAND) {
            if (!level.isClient()) {
                if (level.getFuelHandler().takeArtron(16, true) >= 0) {
                    player.getInventory().add(ItemRegistry.TEA.get().getDefaultInstance());
                    level.getFuelHandler().takeArtron(16, false);
                    return InteractionResult.SUCCESS;
                }
            }
        }

        return InteractionResult.FAIL;
    }

    public InteractionResult onPunch(Player player, ITardisLevel level) {
        return InteractionResult.PASS;
    }

    @Override
    public ControlDataNone getData(ITardisLevel tardis) {
        return super.getData(tardis);
    }
}
