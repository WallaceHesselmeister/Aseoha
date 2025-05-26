package com.code.aseoha.misc;

import com.code.aseoha.entities.K9Entity;
import com.code.aseoha.misc.Container.K9Screen;
import com.code.aseoha.misc.Container.TARDISSubMenu;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.tardis.mod.client.guis.monitors.IMonitorGui;

@OnlyIn(Dist.CLIENT)
public class ScreenClientStuff {
    @OnlyIn(Dist.CLIENT)
    public static void OpenTARDISScreen(K9Entity k9, IMonitorGui k9mon) {
        Minecraft.getInstance().setScreen(new TARDISSubMenu(k9mon, k9));
    }

    @OnlyIn(Dist.CLIENT)
    public static void OpenK9Screen(K9Entity K9) {Minecraft.getInstance().setScreen(new K9Screen(K9) {});}
}