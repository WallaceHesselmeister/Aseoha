package com.code.aseoha.threads;

import com.code.aseoha.Constants;
import com.code.aseoha.aseoha;
import net.minecraft.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingEvent;

public class LivingTickThread extends Thread{
private LivingEvent.LivingUpdateEvent event;
private boolean IsCalledNotInitialized;
public LivingTickThread(){
    this.IsCalledNotInitialized = false;
}

public void Call(LivingEvent.LivingUpdateEvent Event){
    this.IsCalledNotInitialized = true;
    this.event = Event;
    this.run();
};
public LivingTickThread(LivingEvent.LivingUpdateEvent Event){
    this.event = Event;
    this.IsCalledNotInitialized = true;
}

    @Override
    public void run() {
        super.run();
//        aseoha.LOGGER.info("Thread run: {}", this.getName());
        if(this.IsCalledNotInitialized) {
            LivingEntity entity = this.event.getEntityLiving();
            if (entity.level.dimension() == Constants.MIDNIGHT)
                entity.setSecondsOnFire(5);
//        this.destroy();
        };
    }
}
