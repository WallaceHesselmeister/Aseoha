package com.code.aseoha.Helpers;

import com.code.aseoha.tileentities.blocks.EOHTile;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.tileentities.ConsoleTile;

public interface IHelpWithConsole {
    //    List<RegistryKey<World>> getAvailable();
    boolean Aseoha$GetHads();

    void Aseoha$SetHads(boolean state);

    boolean Aseoha$GetMaintenance();

    void Aseoha$SetMaintenance(boolean maintenance);

    int Aseoha$GetExteriorSize();

    void Aseoha$SetExteriorSize(int aseoha$ExteriorSize);

    void Aseoha$Ride(PlayerEntity Player);

    void Aseoha$StopRide(boolean stop);

    void Aseoha$CleanupRide();

    TardisEntity Aseoha$GetTardisEntity();

    void Aseoha$SetInteriorDimension(World interiorDimension);

    ConsoleTile Aseoha$GetConsole();

    World Aseoha$GetInteriorDimension();

    boolean Aseoha$IsRealWorldFlight();

    void Aseoha$SetRealWorldFlight(boolean rwf);

    EOHTile Aseoha$GetEOH();

    void Aseoha$SetEOH(EOHTile eoh);

    void Aseoha$SetHasEOH(boolean eoh);

    boolean Aseoha$GetHasEOH();

    void Aseoha$SetEOHPillars(boolean EOHPillarCount);

    boolean Aseoha$GetEOHPillars();

    long Aseoha$GetEOHTimer();

    void Aseoha$SetEOHTimer(long timer);

    boolean Aseoha$GetEOHOverheated();

    void Aseoha$SetEOHOverheated(boolean overheatedState);

    boolean Aseoha$GetEOHActive();

    void Aseoha$SetEOHActive(boolean aseoha$EOHActive);
}