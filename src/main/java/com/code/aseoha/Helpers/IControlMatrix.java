package com.code.aseoha.Helpers;


import net.minecraft.entity.player.PlayerEntity;

public interface IControlMatrix {
    double getControlState(int controlId, boolean useDefault);

    double getControlState(int controlId);

    double getControlHighlight(int controlId);

    double[] getColorRatio(int controlId);

    void activateControl(PlayerEntity player, int controlId);
}
