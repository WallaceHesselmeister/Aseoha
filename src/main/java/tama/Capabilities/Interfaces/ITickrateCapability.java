/* (C) TAMA Studios 2025 */
package tama.Capabilities.Interfaces;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;
import net.minecraftforge.common.util.INBTSerializable;
import tama.Misc.TimerIMPL;
import tama.aseoha;

@AutoRegisterCapability
public interface ITickrateCapability extends INBTSerializable<CompoundTag> {
    ResourceLocation ID = new ResourceLocation(aseoha.MODID, "tickrate");

    void setEntity(Entity entity);

    void setBaseTickrate(float tickrate);

    void setTickrate(float tickrate);

    float getTickrate();

    void resetTickrate();

    void tick();

    int getTick();

    TimerIMPL getBaseTimer();

    TimerIMPL getCurrentTimer();

    void exclude(boolean flag);

    boolean isExcluded();

    void excludeSubEntities(boolean flag);

    void changeSubEntities(boolean flag);

    boolean shouldExcludeSubEntities();

    boolean shouldChangeSubEntities();

    boolean hasTimer();

    void sync(
            boolean excluded,
            boolean excludeSubEntities,
            boolean changeSubEntities,
            float baseTickrate,
            float currentTickrate,
            int tick);
}
