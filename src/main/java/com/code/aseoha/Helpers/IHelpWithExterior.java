package com.code.aseoha.Helpers;

import net.minecraft.util.RegistryKey;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Unique;

import java.util.UUID;

public interface IHelpWithExterior {
    boolean Aseoha$GetScale();

    boolean Aseoha$IsSnowyVariant();

    void Aseoha$SetIsSnowyVariant(boolean aseoha$IsSnowyVariant);

    void Aseoha$SetScale(boolean Aseoha$Scale);

    byte Aseoha$GetLight();

    void Aseoha$SetLight(byte Aseoha$Light);

    void Aseoha$DematFly();
    
    // Exterior/Console ID linking
    UUID Aseoha$GetExteriorId();
    
    void Aseoha$SetExteriorId(UUID exteriorId);
    
    UUID Aseoha$GetConsoleId();
    
    void Aseoha$SetConsoleId(UUID consoleId);
    
    RegistryKey<World> Aseoha$GetInteriorDimensionKey();
    
    void Aseoha$SetInteriorDimensionKey(RegistryKey<World> dimensionKey);
}