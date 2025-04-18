package com.code.aseoha.capabilities;

public class OverworldCapability implements IOverworldCapability {
    private boolean hasEOH = false;


    public OverworldCapability() {

    }

    @Override
    public boolean HasEOH() {
        return this.hasEOH;
    }

    @Override
    public void SetEOH(boolean hasEOH) {
        this.hasEOH = hasEOH;
    }
}
