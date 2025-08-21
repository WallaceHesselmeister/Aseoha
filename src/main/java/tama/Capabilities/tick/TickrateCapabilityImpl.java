/* (C) TAMA Studios 2025 */
package tama.Capabilities.tick;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.PacketDistributor;
import tama.Capabilities.Interfaces.ITickrateCapability;
import tama.Misc.TimerIMPL;
import tama.networking.Networking;
import tama.networking.s2c.UpdateTickratePacket;

public class TickrateCapabilityImpl implements ITickrateCapability {
    private final TimerIMPL baseTimer = new TimerIMPL(20.0F, 0L);
    private final TimerIMPL currentTimer = new TimerIMPL(20.0F, 0L);
    private Entity entity;
    private boolean excluded;
    private boolean excludeSubEntities;
    private boolean shouldChangeSubEntities = true;
    private float baseTickrate = 20.0F;
    private float tickrate = 20.0F;
    private int tick = 21;

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        nbt.putFloat("CurrentTickrate", this.currentTimer.tickrate);
        nbt.putFloat("BaseTickrate", this.baseTimer.tickrate);
        nbt.putFloat("Tickrate", this.tickrate);
        nbt.putFloat("Tick", this.tick);
        nbt.putBoolean("ChangeSubEntities", this.shouldChangeSubEntities);
        nbt.putBoolean("Excluded", this.excluded);
        nbt.putBoolean("ExcludeSubEntities", this.excludeSubEntities);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        this.currentTimer.setTickrate(nbt.getFloat("CurrentTickrate"));
        this.baseTimer.setTickrate(nbt.getFloat("BaseTickrate"));
        this.tickrate = nbt.getFloat("Tickrate");
        this.tick = nbt.getInt("Tick");
        this.shouldChangeSubEntities = nbt.getBoolean("ChangeSubEntities");
        this.excluded = nbt.getBoolean("Excluded");
        this.excludeSubEntities = nbt.getBoolean("ExcludeSubEntities");
    }

    @Override
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    @Override
    public void setBaseTickrate(float tickrate) {
        this.tick = 0;
        this.baseTickrate = tickrate;
        this.tickrate = tickrate;
        this.baseTimer.setTickrate(tickrate);
        this.currentTimer.setTickrate(tickrate);
        this.sendUpdatePacket(false);
    }

    @Override
    public void setTickrate(float tickrate) {
        this.tick = 0;
        this.tickrate = tickrate;
        this.currentTimer.setTickrate(tickrate);
        this.sendUpdatePacket(false);
    }

    @Override
    public float getTickrate() {
        return this.tickrate;
    }

    @Override
    public void resetTickrate() {
        this.currentTimer.setTickrate(20.0F);
        this.baseTimer.setTickrate(20.0F);
        this.baseTickrate = 20.0F;
        this.tickrate = 20.0F;
        this.tick = 21;
        this.sendUpdatePacket(true);
    }

    @Override
    public void tick() {
        if (this.baseTimer.tickrate == 20.0F) {
            this.tick += 1;
            this.sendUpdatePacket(false);
        }
        this.baseTimer.setTick(this.tick);
        this.currentTimer.setTick(this.tick);
        this.currentTimer.setTickrate(this.baseTimer.tickrate);
        this.tickrate = this.baseTickrate;
    }

    @Override
    public int getTick() {
        return this.tick;
    }

    @Override
    public TimerIMPL getBaseTimer() {
        return this.baseTimer;
    }

    @Override
    public TimerIMPL getCurrentTimer() {
        return this.currentTimer;
    }

    @Override
    public void exclude(boolean flag) {
        this.excluded = flag;
        this.sendUpdatePacket(false);
    }

    @Override
    public boolean isExcluded() {
        return this.excluded;
    }

    @Override
    public void excludeSubEntities(boolean flag) {
        this.excludeSubEntities = flag;
        this.sendUpdatePacket(false);
    }

    @Override
    public void changeSubEntities(boolean flag) {
        this.shouldChangeSubEntities = flag;
        this.sendUpdatePacket(false);
    }

    @Override
    public boolean shouldExcludeSubEntities() {
        return this.excludeSubEntities;
    }

    @Override
    public boolean shouldChangeSubEntities() {
        return this.shouldChangeSubEntities;
    }

    @Override
    public boolean hasTimer() {
        return this.tick <= 20;
    }

    @Override
    public void sync(
            boolean excluded,
            boolean excludeSubEntities,
            boolean changeSubEntities,
            float baseTickrate,
            float currentTickrate,
            int tick) {
        this.excluded = excluded;
        this.excludeSubEntities = excludeSubEntities;
        this.shouldChangeSubEntities = changeSubEntities;
        this.baseTimer.setTickrate(baseTickrate);
        this.baseTickrate = baseTickrate;
        this.currentTimer.setTickrate(currentTickrate);
        this.tickrate = currentTickrate;
        this.tick = tick;
    }

    private void sendUpdatePacket(boolean reset) {
        if (this.entity != null)
            if (!this.entity.level().isClientSide) {
                Networking.CHANNEL.send(
                        PacketDistributor.TRACKING_ENTITY_AND_SELF.with(() -> this.entity),
                        new UpdateTickratePacket(this.entity.getUUID(), this, reset));
            }
    }
}
