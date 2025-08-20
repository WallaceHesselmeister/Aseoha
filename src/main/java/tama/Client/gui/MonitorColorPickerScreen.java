/* (C) TAMA Studios 2025 */
package tama.Client.gui;

import net.minecraft.world.entity.player.Player;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.misc.tardis.montior.BasicMonitorFunction;

public class MonitorColorPickerScreen extends BasicMonitorFunction {
    @Override
    public void doServerAction(ITardisLevel tardis, Player player) {}

    @Override
    public boolean doClientAction(ITardisLevel tardis, Player player) {
        ColorPickerScreen.open(0xFFFF0000, argb -> {
            System.out.println(argb);
        });

        return false;
    }
}
