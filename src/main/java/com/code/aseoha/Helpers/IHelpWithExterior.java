package com.code.aseoha.Helpers;

import org.spongepowered.asm.mixin.Unique;

public interface IHelpWithExterior {
    int Aseoha$GetScale();

    boolean Aseoha$IsSnowyVariant();

    void Aseoha$SetIsSnowyVariant(boolean aseoha$IsSnowyVariant);

    void Aseoha$SetScale(int Aseoha$Scale);

    byte Aseoha$GetLight();

    void Aseoha$SetLight(byte Aseoha$Light);

    void Aseoha$DematFly();
}