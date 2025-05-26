package com.code.aseoha.mixin.client;

import com.code.aseoha.Config;
import net.minecraft.entity.player.PlayerEntity;
import net.tardis.mod.client.ClientHelper;
import net.tardis.mod.contexts.gui.EntityContext;
import net.tardis.mod.controls.BaseControl;
import net.tardis.mod.controls.MonitorControl;
import net.tardis.mod.entity.ControlEntity;
import net.tardis.mod.helper.PlayerHelper;
import net.tardis.mod.items.TItems;
import net.tardis.mod.misc.GuiContext;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.consoles.CoralConsoleTile;
import net.tardis.mod.tileentities.consoles.GalvanicConsoleTile;
import net.tardis.mod.tileentities.consoles.ToyotaConsoleTile;
import net.tardis.mod.tileentities.consoles.XionConsoleTile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = MonitorControl.class, priority = 1003)
public abstract class MonitorControlMixin extends BaseControl {

    public MonitorControlMixin(ControlRegistry.ControlEntry entry, ConsoleTile console, ControlEntity entity) {
        super(entry, console, entity);
    }

    /**
     * @author codiak
     * @reason config option to open the GUI in flight
     */
    @Overwrite(remap = false)
    public boolean onRightClicked(ConsoleTile console, PlayerEntity player) {
        if (console.getLevel().isClientSide && (console.isInFlight() && Config.COMMON.ShouldOpenGUIInFlight.get())) {
            if (PlayerHelper.InEitherHand(player, (stack) -> stack.getItem() == TItems.MONITOR_REMOTE.get())) {
                ClientHelper.openGUI(23, new EntityContext(this.getEntity()));
                return true;
            } else if (console instanceof GalvanicConsoleTile) {
                ClientHelper.openGUI(9, (GuiContext)null);
                return true;
            } else if (console instanceof XionConsoleTile) {
                ClientHelper.openGUI(18, (GuiContext)null);
                return true;
            } else if (console instanceof ToyotaConsoleTile) {
                ClientHelper.openGUI(19, (GuiContext)null);
                return true;
            } else if (console instanceof CoralConsoleTile) {
                ClientHelper.openGUI(20, (GuiContext)null);
                return true;
            } else {
                ClientHelper.openGUI(8, (GuiContext)null);
                return true;
            }
        } else {
            return true;
        }
    }
}
