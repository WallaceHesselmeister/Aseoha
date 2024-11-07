package com.code.aseoha.misc;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.aseoha;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pilot {
    private PlayerEntity PilotPlayer;


    public Pilot(PlayerEntity pilot) {
        this.PilotPlayer = pilot;
    }

    public Pilot() {}

    /**
     * Returns true if this Pilot is the Pilot of the provided console
     *
     * @param console ResourceLocation to check if this Pilot Pilots
     * @return True/False if this Pilot Pilots the specified console
     */
    public boolean IsPilotOf(ConsoleTile console, PlayerEntity player) {
//        TardisHelper.getConsole(ServerLifecycleHooks.getCurrentServer(), console).ifPresent(consoleTile -> {
        if (((IHelpWithConsole) console).Aseoha$GetPilot() != null) {
            return ((IHelpWithConsole) console).Aseoha$GetPilot().PilotPlayer.equals(player);
        }
        return false;
//        } else {
//            if (this.ConsoleTileList.contains(console)) return true;
//            else return false;
//        }
    }

//    public ArrayList<ConsoleTile> GetConsoleTilesPiloted() {
//        return this.ConsoleTileList;
//    }

    public PlayerEntity GetPilotPlayer(){
        return this.PilotPlayer;
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