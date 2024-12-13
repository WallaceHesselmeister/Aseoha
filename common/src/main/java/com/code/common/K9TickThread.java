package com.code.common;

import com.code.common.entities.K9Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;

import static com.code.common.entities.K9Entity.TimeToDeplete;

public class K9TickThread extends Thread {
    boolean IsInstantiated = false;
    private K9Entity K9;

    public K9TickThread() {
        this.IsInstantiated = true;
    }

    public K9TickThread(K9Entity k9) {
        this.IsInstantiated = false;
        this.K9 = k9;
    }

    public void Call(K9Entity k9Entity){
        this.IsInstantiated = false;
//        this.event = Event;
        this.K9 = k9Entity;
        this.run();
    };

    @Override
    public void run(){
        super.run();
        if(this.IsInstantiated) return;
        if(this.K9 == null) return;


        if (this.K9.isAlive()) {
            this.K9.setNoAi(this.K9.isDead);
            if (this.K9.timer < TimeToDeplete()) {
                this.K9.timer++;
            }
            if (this.K9.timer >= TimeToDeplete()) {
                if (this.K9.power > 0) {
                    this.K9.power -= 1;
                    if(this.K9.power == 0)
                        this.K9.Say(Component.translatable("aseoha.k9.dead").toString(), (Player) this.K9.getOwner(), this.K9.level());
                }
                this.K9.timer = 0;
            }
            if (this.K9.getOwner() != null) {
                if (this.K9.timer == 0 && this.K9.power == 10)
                    this.K9.getOwner().sendSystemMessage(Component.nullToEmpty("Power Banks At 10%, Master."));
                if (this.K9.timer == 0 && this.K9.power == 1) {
                    this.K9.getOwner().sendSystemMessage(Component.nullToEmpty("Power Banks Depleted, Master."));
                    this.K9.power = 0;
                }
            }

            this.K9.isDead = this.K9.power <= 0;
            if (this.K9.isDead) {
                this.K9.SetIsJumping(false);
                this.K9.setNoGravity(false);
                if (!this.K9.isInsidePortal() && this.K9.onGround()) {
                    this.K9.getNavigation().stop();
                    this.K9.setTarget(null);
                }
            }
            if (this.K9.power < 0) this.K9.power = 0;
        }
    }
}
