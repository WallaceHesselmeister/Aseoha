package tama.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.phys.BlockHitResult;
import net.tardis.mod.ars.ARSRoom;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.cap.level.TardisCap;
import net.tardis.mod.registry.JsonRegistries;
import org.jetbrains.annotations.NotNull;
import tama.aseoha;
import tama.data.DataQuantiscopeList;
import tama.data.DataQuantiscopeRecipe;

public class QuantiscopeBlock extends Block {
    public QuantiscopeBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    @SuppressWarnings("deprecation")
    public @NotNull InteractionResult use(@NotNull BlockState blockState, @NotNull Level level, @NotNull BlockPos blockPos, @NotNull Player player, @NotNull InteractionHand interactionHand, @NotNull BlockHitResult blockHitResult) {
        if(interactionHand.equals(InteractionHand.OFF_HAND) || level.isClientSide)
            return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);

        for(DataQuantiscopeRecipe recipe : DataQuantiscopeList.getStructureList()) {
            if(player.getMainHandItem().getItem().asItem().toString().equals(recipe.item().toString())) {
                ResourceKey<ARSRoom> TYPE =
                        ResourceKey.create(JsonRegistries.ARS_ROOM_REGISTRY, recipe.structure());

                level.getCapability(Capabilities.TARDIS).ifPresent(tardis -> tardis.getUnlockHandler().unlock(TYPE));

                player.getInventory().removeItem(player.getMainHandItem());
            }
        }
        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }
}
