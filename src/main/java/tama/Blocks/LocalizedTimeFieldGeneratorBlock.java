/* (C) TAMA Studios 2025 */
package tama.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import tama.Capabilities.Capabilities;
import tama.Misc.TickrateManager;

public class LocalizedTimeFieldGeneratorBlock extends Block {
    int rate = 20;

    public LocalizedTimeFieldGeneratorBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public InteractionResult use(
            BlockState blockState,
            Level level,
            BlockPos blockPos,
            Player player,
            InteractionHand interactionHand,
            BlockHitResult blockHitResult) {
        if (level.isClientSide || interactionHand.equals(InteractionHand.OFF_HAND))
            return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);

        if (player.isCrouching()) {
            rate = switch (rate) {
                case 0 -> 1;
                case 1 -> 5;
                case 5 -> 10;
                case 10 -> 20;
                case 20 -> 40;
                case 40 -> 80;
                default -> 0;};
            player.sendSystemMessage(Component.literal(String.valueOf(rate)));
            return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
        }

        AABB aabb = new AABB(
                new BlockPos(blockPos.getX() - 20, blockPos.getY() - 20, blockPos.getZ() - 20),
                new BlockPos(blockPos.getX() + 20, blockPos.getY() + 20, blockPos.getZ() + 20));

        TickrateManager.excludeEntity(player);
        TickrateManager.addTickrateArea(level.dimension(), aabb, rate);

        if(rate == 20) {
            level.getEntitiesOfClass(Entity.class, aabb).forEach(ent ->
                    ent.getCapability(Capabilities.TICK_RATE).ifPresent(cap -> {
                        if(!cap.isExcluded()) cap.setTickrate(rate);
                    }));
        }

        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }
}
