package com.code.aseoha.misc;

import com.code.aseoha.entities.k9;
import com.code.aseoha.misc.Container.K9Screen;
import com.code.aseoha.misc.Container.TARDISSubMenu;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.guis.monitors.IMonitorGui;

@OnlyIn(Dist.CLIENT)
public class ScreenClientStuff {
    @OnlyIn(Dist.CLIENT)
    public static void OpenTARDISScreen(k9 k9, IMonitorGui k9mon) {
        Minecraft.getInstance().setScreen(new TARDISSubMenu(k9mon, k9));
    }

    @OnlyIn(Dist.CLIENT)
    public static void OpenK9Screen(k9 K9) {Minecraft.getInstance().setScreen(new K9Screen(K9) {});}
}
