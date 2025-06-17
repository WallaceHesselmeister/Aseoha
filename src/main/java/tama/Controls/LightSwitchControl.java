/* (C) TAMA Studios 2025 */
package tama.Controls;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.block.RoundelBlock;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.control.Control;
import net.tardis.mod.control.ControlType;
import net.tardis.mod.control.datas.ControlDataBool;
import net.tardis.mod.control.datas.ControlDataFloat;
import net.tardis.mod.sound.SoundRegistry;
import tama.RoundelRemote;

public class LightSwitchControl extends Control<ControlDataBool> {
    public RoundelRemote.Range range = RoundelRemote.Range.LONGEST;

    public LightSwitchControl(ControlType<ControlDataBool> type) {
        super(type);
    }

    public SoundEvent getDefaultSuccessSound(ControlDataFloat controlData) {
        return SoundRegistry.HANDBRAKE_ON.get();
    }

    public InteractionResult onUse(Player player, InteractionHand hand, ITardisLevel level) {
        if (hand == InteractionHand.MAIN_HAND) {
            if (!level.isClient()) {
                this.range = RoundelRemote.cycle(this.range);
                player.displayClientMessage(
                        Component.literal("§fRange set to " + this.range.name().toLowerCase() + " ("
                                + this.range.getRange() + ")"),
                        true);
            }

            return InteractionResult.sidedSuccess(player.level().isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    public InteractionResult onPunch(Player player, ITardisLevel level) {
        if (this.getData(level).get() == null) this.getData(level).set(false);

        if (!level.isClient()) {
            this.getData(level).set(!this.getData(level).get());
            for (int x = -range.range / 2; x < range.range / 2; x++) {
                for (int y = -range.range / 2; y < range.range / 2; y++) {
                    for (int z = -range.range / 2; z < range.range / 2; z++) {
                        BlockPos relativePos = player.blockPosition().offset(x, y, z);
                        if (level.getLevel().getBlockState(relativePos).getBlock() instanceof RoundelBlock) {
                            BlockState state = level.getLevel()
                                    .getBlockState(relativePos)
                                    .setValue(
                                            RoundelBlock.IS_LIT,
                                            this.getData(level).get());
                            level.getLevel().setBlockAndUpdate(relativePos, state);
                        }
                    }
                }
            }
        }

        return InteractionResult.sidedSuccess(level.isClient());
    }

    @Override
    public ControlDataBool getData(ITardisLevel tardis) {
        return super.getData(tardis);
    }
}
