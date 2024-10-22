package com.code.aseoha.misc;

import net.minecraft.util.math.MathHelper;
import net.tardis.mod.client.animation.ExteriorAnimation;
import net.tardis.mod.client.animation.ExteriorAnimationEntry;
import net.tardis.mod.enums.EnumMatterState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class FastAFAnimation extends ExteriorAnimation {

    private float alpha = 1.0F;
    private float intensi = 0.28F;
    private int pulseTime = 10;
    private int pulses = 1;

    public FastAFAnimation(ExteriorAnimationEntry entry, ExteriorTile exterior) {
        super(entry, exterior);
    }

    @Override
    public void tick(int timeLeft) {

        if(this.exterior.getMatterState() == EnumMatterState.DEMAT) {
            if(this.exterior.getMaterializationTicks() > 10){
                this.exterior.setMaterializeTime(10);
            }
            this.setAlpha(1.0F - this.animateDemat(timeLeft));
        }
        else if(timeLeft <= this.getMaxTime() - 10)
            this.setAlpha(this.animateRemat(timeLeft));
    }

    public float animateRemat(int timeLeft){

        if(timeLeft != this.getMaxTime() - 10 && timeLeft % pulseTime == 0){
            ++pulses;
        }

        float pulseAmount = pulses / (float)this.calcMaxPulses();
        return (pulseAmount) + this.pulseWithIntensity(intensi, timeLeft * 0.175F);

    }

    public float animateDemat(int timeLeft){

        if(timeLeft != this.getMaxTime() - 10 && timeLeft % pulseTime == 0){
            ++pulses;
        }

        float pulseAmount = pulses / (float)this.calcMaxPulses();

        return (pulseAmount) + this.pulseWithIntensity(0.28F, timeLeft * 0.175F);

    }

    public void setAlpha(float alpha){
        this.alpha = MathHelper.clamp(alpha, 0.0F, 1.0F);
    }

    public int calcMaxPulses(){
        return 1;
    }

    public int calcMaxFlyPulses(){
        return 1;
    }

    public float pulseWithIntensity(float intensity, float frequency){
        return (float) Math.cos(frequency) * intensity;
    }

    @Override
    public float getAlpha() {
        return this.alpha;
    }


    @Override
    public void reset() {
        this.alpha = 0.0F;
        this.pulses = 0;
    }
}