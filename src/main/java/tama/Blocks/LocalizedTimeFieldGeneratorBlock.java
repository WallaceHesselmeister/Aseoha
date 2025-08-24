/* (C) TAMA Studios 2025 */
package tama.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.ticks.TickPriority;
import org.jetbrains.annotations.NotNull;
import tama.Capabilities.Capabilities;
import tama.Misc.TickrateManager;

public class LocalizedTimeFieldGeneratorBlock extends Block {
    int rate = 20;
    //    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

    public LocalizedTimeFieldGeneratorBlock(Properties p_49795_) {
        super(p_49795_);
        //        this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, false));
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull InteractionResult use(
            @NotNull BlockState blockState,
            Level level,
            @NotNull BlockPos blockPos,
            @NotNull Player player,
            @NotNull InteractionHand interactionHand,
            @NotNull BlockHitResult blockHitResult) {
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
            player.sendSystemMessage(
                    Component.literal(String.format("Tickrate set to %s %s", rate, "Ticks per second")));
            return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
        }

        AABB aabb = new AABB(
                new BlockPos(blockPos.getX() - 10, blockPos.getY() - 10, blockPos.getZ() - 10),
                new BlockPos(blockPos.getX() + 10, blockPos.getY() + 10, blockPos.getZ() + 10));

        TickrateManager.excludeEntity(player);
        TickrateManager.addTickrateArea(level.dimension(), aabb, rate);

        if (rate != 0) {
            level.getEntitiesOfClass(Entity.class, aabb)
                    .forEach(ent -> ent.getCapability(Capabilities.TICK_RATE).ifPresent(cap -> {
                        if (!cap.isExcluded() && cap.getTickrate() == 0) cap.setTickrate(rate);
                    }));
        }
        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void onRemove(
            @NotNull BlockState blockState,
            Level level,
            @NotNull BlockPos blockPos,
            @NotNull BlockState blockState1,
            boolean b) {
        if (!level.isClientSide) {
            AABB aabb = new AABB(
                    new BlockPos(blockPos.getX() - 10, blockPos.getY() - 10, blockPos.getZ() - 10),
                    new BlockPos(blockPos.getX() + 10, blockPos.getY() + 10, blockPos.getZ() + 10));

            TickrateManager.addTickrateArea(level.dimension(), aabb, rate);

            level.getEntitiesOfClass(Entity.class, aabb)
                    .forEach(ent -> ent.getCapability(Capabilities.TICK_RATE).ifPresent(cap -> {
                        if (!cap.isExcluded()) cap.setTickrate(rate);
                        if (rate == 20) cap.exclude(false);
                    }));
        }
        super.onRemove(blockState, level, blockPos, blockState1, b);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        //        builder.add(POWERED);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void neighborChanged(
            @NotNull BlockState state,
            Level level,
            @NotNull BlockPos blockPos,
            @NotNull Block blockIn,
            @NotNull BlockPos fromPos,
            boolean isMoving) {
        if (!level.isClientSide) {
            boolean hasSignal = level.hasNeighborSignal(blockPos);
            //            if (hasSignal && !state.getValue(POWERED)) {
            if (hasSignal) {
                // The block just received power
                //                level.setBlockAndUpdate(blockPos, state.setValue(POWERED, true));

                AABB aabb = new AABB(
                        new BlockPos(blockPos.getX() - 3, blockPos.getY() - 3, blockPos.getZ() - 3),
                        new BlockPos(blockPos.getX() + 3, blockPos.getY() + 3, blockPos.getZ() + 3));

                level.getEntitiesOfClass(Entity.class, aabb).forEach(ent -> ent.getCapability(Capabilities.TICK_RATE)
                        .ifPresent(cap -> cap.setTickrate(0)));

                level.scheduleTick(blockPos, state.getBlock(), 3000, TickPriority.EXTREMELY_HIGH);
            }
            //            } else if (!hasSignal && state.getValue(POWERED)) {
            // The block just lost power
            //                level.setBlockAndUpdate(blockPos, state.setValue(POWERED, false));
            //            }
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public void tick(
            @NotNull BlockState blockState,
            @NotNull ServerLevel serverLevel,
            @NotNull BlockPos blockPos,
            @NotNull RandomSource randomSource) {
        super.tick(blockState, serverLevel, blockPos, randomSource);

        AABB aabb = new AABB(
                new BlockPos(blockPos.getX() - 4, blockPos.getY() - 4, blockPos.getZ() - 4),
                new BlockPos(blockPos.getX() + 4, blockPos.getY() + 4, blockPos.getZ() + 4));

        serverLevel.getEntitiesOfClass(Entity.class, aabb).forEach(ent -> ent.getCapability(Capabilities.TICK_RATE)
                .ifPresent(cap -> {
                    if (!cap.isExcluded()) cap.setTickrate(20);
                }));
    }
}
