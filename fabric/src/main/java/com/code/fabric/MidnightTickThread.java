package com.code.fabric;

import com.code.common.world.AseohaDimensions;
import net.minecraft.server.MinecraftServer;

/**
 * This thread sets entities that are on midnight on fire
 */
public class MidnightTickThread extends Thread {
    private MinecraftServer Server;
    private boolean IsInitted = false;

    public MidnightTickThread(MinecraftServer server) {
        this.Server = server;
        this.IsInitted = false;
    }

    public MidnightTickThread() {
        this.IsInitted = true;
    }

    public MidnightTickThread SetServer(MinecraftServer server) {
        this.Server = this.Server == server ? this.Server : server;
        this.IsInitted = false;
        return this;
    }

    @Override
    public void run() {
        if (this.IsInitted) return;
        if (this.Server == null) return;

        this.Server.getAllLevels().forEach((level) -> {
            if (level.dimension().equals(AseohaDimensions.MIDNIGHT)) {
                level.getAllEntities().forEach((entity -> entity.setSecondsOnFire(1)));
            }
        });
    }
}
