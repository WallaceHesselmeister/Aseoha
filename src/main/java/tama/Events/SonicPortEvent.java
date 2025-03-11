package tama.Events;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import net.tardis.mod.cap.level.ITardisLevel;

public class SonicPortEvent extends Event {
    private final Entity entity;
    private final ItemStack item;
    private final ITardisLevel tardis;

    public SonicPortEvent(ITardisLevel tardis, Entity entity, ItemStack itemInserted) {
        this.tardis = tardis;
        this.item = itemInserted;
        this.entity = entity;
    }

    public Entity getEntity() {
        return this.entity;
    }

    public ItemStack getItemInserted() {
        return this.item;
    }

    public ITardisLevel getTARDIS() {
        return this.tardis;
    }

    @Cancelable
    public static class SonicInsertEvent extends SonicPortEvent {
        public SonicInsertEvent(ITardisLevel tardis, Entity entity, ItemStack itemInserted) {
            super(tardis, entity, itemInserted);
        }

        @Override
        public boolean isCancelable() {
            return true;
        }
    }
}