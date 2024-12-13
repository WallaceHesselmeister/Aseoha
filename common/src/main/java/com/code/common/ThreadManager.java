package com.code.common;

import com.code.common.entities.K9Entity;

public class ThreadManager {
    private K9TickThread k9TickThread = new K9TickThread();
    private K9Entity k9Entity;

    /** ONLY RUN THIS ONCE WHEN ASEOHA IS INITIALIZED IN THE COMMON CLASS! */
    public void InitializeThreads() {
        this.k9TickThread.start();
    }

    /**
     * 1: K9 Tick Thread
     */
    private void RunThread(int Switch) {
        switch (Switch) {
            case 0 -> this.k9TickThread.Call(this.k9Entity);
        }
    }

    public void K9TickThread(K9Entity k9Entity) {
        this.k9Entity = k9Entity;
        this.RunThread(0);
    }
}


