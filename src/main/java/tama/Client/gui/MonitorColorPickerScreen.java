package tama.Client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.tardis.mod.block.monitors.MonitorData;
import net.tardis.mod.cap.level.ITardisLevel;
import net.tardis.mod.client.gui.datas.GuiData;
import net.tardis.mod.client.gui.datas.GuiDatas;
import net.tardis.mod.client.gui.monitor.MonitorScreen;
import net.tardis.mod.misc.tardis.montior.BasicMonitorFunction;
import net.tardis.mod.misc.tardis.montior.OpenGuiMonitorFunction;

public class MonitorColorPickerScreen extends BasicMonitorFunction {
    @Override
    public void doServerAction(ITardisLevel tardis, Player player) {

    }

    @Override
    public boolean doClientAction(ITardisLevel tardis, Player player) {
        ColorPickerScreen.open(0xFFFF0000, argb -> {
            System.out.println(argb);
        });

        return false;
    }
}