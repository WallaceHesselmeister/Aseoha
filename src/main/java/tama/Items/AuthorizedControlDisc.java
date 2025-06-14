/* (C) TAMA Studios 2025 */
package tama.Items;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.tardis.mod.cap.GenericProvider;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.item.ISonicPortAction;
import net.tardis.mod.misc.SpaceTimeCoord;
import net.tardis.mod.registry.ControlRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tama.Capabilities.Capabilities;
import tama.Capabilities.ControlDiscCapability;
import tama.Capabilities.Interfaces.IControlDiscCapability;
import tama.Misc.GrammarNazi;

import java.util.List;

public class AuthorizedControlDisc extends Item implements ISonicPortAction {
    BlockPos blockPos;
    Level level;

    public AuthorizedControlDisc(Properties p_41383_) {
        super(p_41383_.stacksTo(1));
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext useOnContext) {
        if (!useOnContext.getPlayer().isCrouching()) return InteractionResult.FAIL;

        ItemStack itemStack = useOnContext.getItemInHand();
        this.level = useOnContext.getLevel();
        this.blockPos = useOnContext.getClickedPos();
        itemStack.getCapability(Capabilities.CONTROL_DISC).ifPresent(cap -> {
            cap.setDiscLevel(this.level.dimension());
            cap.setDiscBlockPos(this.blockPos);
        });
        return InteractionResult.SUCCESS;
    }

    @Override
    public @Nullable ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
        final GenericProvider<IControlDiscCapability, CompoundTag, IControlDiscCapability> provider =
                new GenericProvider<>(Capabilities.CONTROL_DISC, new ControlDiscCapability(stack));
        if (nbt != null) {
            provider.deserializeNBT(nbt);
        }
        return provider;
    }

    @Override
    public void appendHoverText(
            ItemStack pStack,
            @Nullable Level pLevel,
            @NotNull List<Component> tooltip,
            @NotNull TooltipFlag pIsAdvanced) {
        pStack.getCapability(Capabilities.CONTROL_DISC).ifPresent(tool -> {
            tool.getDiscLevel()
                    .ifPresent(key -> tooltip.add(Component.nullToEmpty("Level set to: "
                            + key.location().toString().replace(key.location().getNamespace() + ":", ""))));
            tool.getDiscBlockPos()
                    .ifPresent(pos -> tooltip.add(
                            Component.nullToEmpty("Location set to: " + GrammarNazi.BlockPosToString(pos))));
        });
        super.appendHoverText(pStack, pLevel, tooltip, pIsAdvanced);
    }

    @Override
    public ItemStack onAddedToPort(ItemStack itemStack, ITardisLevel iTardisLevel) {
        itemStack.getCapability(Capabilities.CONTROL_DISC).ifPresent(cap -> {
            if (cap.getDiscBlockPos().isEmpty() && cap.getDiscLevel().isEmpty()) return;
            iTardisLevel.setDestination(new SpaceTimeCoord(
                    cap.getDiscLevel().get(), cap.getDiscBlockPos().get()));
            iTardisLevel.takeoff();
            iTardisLevel.getControlDataOrCreate(ControlRegistry.HANDBRAKE.get()).set(false);
            iTardisLevel.getControlDataOrCreate(ControlRegistry.THROTTLE.get()).set(1f);
        });
        return itemStack;
    }
}
