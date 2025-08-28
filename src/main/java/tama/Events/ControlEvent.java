/* (C) TAMA Studios 2025 */
package tama.Events;

import lombok.Getter;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import net.tardis.mod.cap.level.ITardisLevel;

public class ControlEvent extends Event {

    private final ITardisLevel tardis;

    public ControlEvent(ITardisLevel tardis) {
        this.tardis = tardis;
    }

    public ITardisLevel getTARDIS() {
        return this.tardis;
    }

    @Cancelable
    public static class SonicInsertEvent extends ControlEvent {

        @Getter
        public final Entity entity;

        public final ItemStack inserted;

        public SonicInsertEvent(ITardisLevel tardis, Entity entity, ItemStack itemInserted) {
            super(tardis);
            this.entity = entity;
            this.inserted = itemInserted;
        }

        public ItemStack getItem() {
            return this.inserted;
        }

    }
}
