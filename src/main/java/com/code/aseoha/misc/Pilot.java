package com.code.aseoha.misc;

import com.code.aseoha.Helpers.IHelpWithConsole;
import net.minecraft.entity.player.PlayerEntity;
import net.tardis.mod.tileentities.ConsoleTile;

import java.util.ArrayList;

public class Pilot {
    private PlayerEntity PilotPlayer;
    private ArrayList<PlayerEntity> TrustedPlayers = new ArrayList<>();


    public Pilot(PlayerEntity pilot) {
        this.PilotPlayer = pilot;
    }

    public Pilot() {}

//    /**
//     * Returns true if this Pilot is the Pilot of the provided console
//     *
//     * @param console ResourceLocation to check if this Pilot Pilots
//     * @return True/False if this Pilot Pilots the specified console
//     */
//    public boolean IsPilotOf(ConsoleTile console, PlayerEntity player) {
//        if (((IHelpWithConsole) console).Aseoha$GetPilot() != null) {
//            return ((IHelpWithConsole) console).Aseoha$GetPilot().PilotPlayer.equals(player);
//        }
//        return false;
//    }

//    public ArrayList<ConsoleTile> GetConsoleTilesPiloted() {
//        return this.ConsoleTileList;
//    }

    public PlayerEntity GetPilotPlayer(){
        return this.PilotPlayer;
    }

    public ArrayList<PlayerEntity> GetTrustedPlayers() {
        return this.TrustedPlayers;
    }

    public void AddTrustedPlayers(PlayerEntity trustedPlayers) {
        this.TrustedPlayers.add(trustedPlayers);
    }

    public void SetNewPilot(PlayerEntity Pilot){
        this.PilotPlayer = Pilot;
    }

//    public void AddConsole(ConsoleTile consoleTile) {
//        if (this.ConsoleTileList == null || this.ConsoleTileList.isEmpty()) {
//            assert this.ConsoleTileList != null;
//            this.ConsoleTileList.add(consoleTile);
//            return;
//        }
//        if(!this.ConsoleTileList.contains(consoleTile))
//            this.ConsoleTileList.add(consoleTile);
//    }

//    public void AddConsole(RegistryKey<World> dimensionRegistryKey){
//        TardisHelper.getConsole(ServerLifecycleHooks.getCurrentServer(), dimensionRegistryKey).ifPresent(consoleTile -> {
//            if(!this.ConsoleTileList.contains(consoleTile))
//                this.ConsoleTileList.add(consoleTile);
//        });
//    }
}