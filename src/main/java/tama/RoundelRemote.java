/* (C) TAMA Studios 2025 */
package tama;

import lombok.Getter;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.tardis.mod.block.RoundelBlock;
import org.jetbrains.annotations.NotNull;

public class RoundelRemote extends Item {
    Range range = Range.SHORT;
    boolean swatch = false;

    public RoundelRemote(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, InteractionHand p_41434_) {
        if (p_41434_.equals(InteractionHand.OFF_HAND) || level.isClientSide)
            return InteractionResultHolder.pass(player.getItemInHand(p_41434_));
        if (player.isCrouching()) {
            this.cycle();
            player.sendSystemMessage(Component.literal("§aRoundel Remote: §fRange set to "
                    + this.range.name().toLowerCase() + " (" + this.range.getRange() + ")"));
            return InteractionResultHolder.pass(player.getItemInHand(p_41434_));
        }

        this.swatch = !this.swatch;
        for (int x = -range.range / 2; x < range.range / 2; x++) {
            for (int y = -range.range / 2; y < range.range / 2; y++) {
                for (int z = -range.range / 2; z < range.range / 2; z++) {
                    BlockPos relativePos = player.blockPosition().offset(x, y, z);
                    if (level.getBlockState(relativePos).getBlock() instanceof RoundelBlock) {
                        BlockState state = level.getBlockState(relativePos).setValue(RoundelBlock.IS_LIT, this.swatch);
                        level.setBlockAndUpdate(relativePos, state);
                    }
                }
            }
        }
        player.sendSystemMessage(
                Component.literal("§aRoundel Remote: §fTurned Roundels within radius " + (this.swatch ? "on" : "off")));
        return super.use(level, player, p_41434_);
    }

    public void cycle() {
        this.range = switch (this.range) {
            case SHORT -> Range.MEDIUM;
            case MEDIUM -> Range.LONG;
            case LONG -> Range.LONGEST;
            case LONGEST -> Range.LONGEREST;
            case LONGEREST -> Range.SHORT;};
    }

    public static Range cycle(Range range) {
        return switch (range) {
            case SHORT -> Range.MEDIUM;
            case MEDIUM -> Range.LONG;
            case LONG -> Range.LONGEST;
            case LONGEST -> Range.LONGEREST;
            case LONGEREST -> Range.SHORT;
        };
    }

    @Getter
    public enum Range {
        SHORT(10),
        MEDIUM(20),
        LONG(50),
        LONGEST(100),
        LONGEREST(200);

        public final int range;

        Range(int range) {
            this.range = range;
        }
    }
}
