/* (C) TAMA Studios 2025 */
package tama.Misc;

import lombok.Setter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Timer;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TimerIMPL {
    public float partialTick;
    public float tickDelta;
    public long lastMs;
    public float msPerTick;
    public float tickrate;
    public float accumulator = 0.0F;
    public int pendingTicks = 0;

    @Setter
    public int tick;

    public boolean canTick;

    public TimerIMPL(float p_92523_, long p_92524_) {
        this.tickrate = p_92523_;
        this.msPerTick = 1000.0F / p_92523_;
        this.lastMs = p_92524_;
    }

    @OnlyIn(Dist.CLIENT)
    public int advanceTime(long p_92526_) {
        this.tickDelta = (float) (p_92526_ - this.lastMs) / this.msPerTick;
        this.lastMs = p_92526_;
        this.partialTick += this.tickDelta;
        int i = (int) this.partialTick;
        this.partialTick -= (float) i;
        if (this.tick >= 15) {
            try {
                int time = (int) Mth.lerp(
                        Minecraft.getInstance().getFrameTime(),
                        i,
                        ((Timer) (Object) Minecraft.getInstance().getClass().getField("f_90991_"))
                                .advanceTime(p_92526_));
                return time;
            } catch (Exception ignored) {
            }
        }
        return i;
    }

    public void setTickrate(float p_92523_) {
        this.tickrate = p_92523_;
        this.msPerTick = 1000.0F / p_92523_;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TimerIMPL)) {
            return false;
        }
        TimerIMPL other = (TimerIMPL) obj;
        return this.tickrate == other.tickrate;
    }
}
