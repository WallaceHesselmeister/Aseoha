//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.code.aseoha.events;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.Event;
import net.tardis.mod.controls.AbstractControl;

public class ControlEvents extends Event {
    private final AbstractControl control;
    private final PlayerEntity player;

    public ControlEvents(AbstractControl control, PlayerEntity player) {
        this.control = control;
        this.player = player;
    }

    public PlayerEntity getPlayer() {
        return this.player;
    }

    public AbstractControl getControl() {
        return this.control;
    }

    public static class ControlClickEvent extends ControlEvents {
        public ControlClickEvent(AbstractControl control, PlayerEntity player) {
            super(control, player);
        }

        public boolean isCancelable() {
            return true;
        }
    }
}
