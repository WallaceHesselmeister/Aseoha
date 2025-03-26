package com.code.aseoha.threads;

import com.code.aseoha.Config;
import com.code.aseoha.aseoha;
import com.code.aseoha.entities.K9Entity;
import net.minecraft.util.text.ITextComponent;

public class K9TickThread extends Thread {
    private K9Entity K9;
    private boolean IsCalledNotInitialized;

    public K9TickThread() {
        this.IsCalledNotInitialized = false;
    }

    public K9TickThread(K9Entity k9) {
        this.K9 = k9;
        this.IsCalledNotInitialized = true;
    }

    public void Call(K9Entity k9) {
        this.IsCalledNotInitialized = true;
//        this.event = Event;
        this.K9 = k9;
        this.run();
    }

    @Override
    public void run() {
        super.run();
        if (!this.IsCalledNotInitialized) return;
        if (!this.K9.isAlive()) return;

        this.K9.setNoAi(this.K9.isDead);

        if(this.K9.getTarget() == null && !this.K9.getHitList().isEmpty())
            this.K9.setTarget(this.K9.getHitList().get(0));

        if (this.K9.timer < Config.SERVER.K9PowerDrainRate.get() * 20)
            this.K9.timer++;

        if (this.K9.timer >= Config.SERVER.K9PowerDrainRate.get() * 20) {
            if (this.K9.power > 0)
                this.K9.power--;
            this.K9.timer = 0;
        }
        try {
            if (this.K9.getOwner() != null && this.K9.getOwnerUUID() != null) {
                if (this.K9.timer == 0 && this.K9.power == 10)
                    this.K9.getOwner().sendMessage(ITextComponent.nullToEmpty("Power Banks At 10%, Master."), this.K9.getOwnerUUID());
                if (this.K9.timer == 0 && this.K9.power == 1) {
                    this.K9.getOwner().sendMessage(ITextComponent.nullToEmpty("Power Banks Depleted, Master."), this.K9.getOwnerUUID());
                    this.K9.power = 0;
                }
            }
        } catch (Exception e) {
            aseoha.LOGGER.info("Error (K9TickThread) sending power message to Owner - {}", e.getMessage());
        }

        this.K9.isDead = this.K9.power <= 0;
        if (this.K9.isDead) {
            this.K9.jumping = false;
            this.K9.setNoGravity(false);
            if (!this.K9.isInsidePortal && this.K9.onGround) {
                this.K9.navigation.stop();
                this.K9.setTarget(null);
            }
        }
//            aseoha.LOGGER.info(this.K9.power);
        if (this.K9.power < 0) this.K9.power = 0;
    }
}
