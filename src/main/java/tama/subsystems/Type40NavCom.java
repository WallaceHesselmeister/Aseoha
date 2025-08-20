/* (C) TAMA Studios 2025 */
package tama.subsystems;

import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.core.*;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.server.ServerLifecycleHooks;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.misc.SpaceTimeCoord;
import net.tardis.mod.subsystem.BasicSubsystem;
import net.tardis.mod.subsystem.SubsystemType;
import tama.Misc.WorldHelper;

public class Type40NavCom extends BasicSubsystem {
    public Type40NavCom(SubsystemType type, Predicate<ItemStack> stackTest, ITardisLevel level) {
        super(type, stackTest, level);
    }

    @Override
    public void onLand() {
        SetDest();
        super.onLand();
    }

    @Override
    public void onTakeoff() {
        SetDest();
        super.onTakeoff();
    }

    public void SetDest() {
        if (this.getTardis().getLevel().isClientSide) return;
        if (this.getTardis().getLevel().getRandom().nextInt(3) == 1) return;
        Optional<BlockPos> opPos = WorldHelper.findClosestStructureOfAnyType(
                ServerLifecycleHooks.getCurrentServer()
                        .getLevel(this.getTardis().getDestination().getLevel()),
                this.getTardis().getDestination().getPos());
        if (opPos.isPresent()) {
            BlockPos pos = opPos.get().atY(100);
            this.getTardis()
                    .setLocation(
                            new SpaceTimeCoord(this.getTardis().getDestination().getLevel(), pos));
            this.getTardis()
                    .setDestination(
                            new SpaceTimeCoord(this.getTardis().getDestination().getLevel(), pos));
        }
    }
}
