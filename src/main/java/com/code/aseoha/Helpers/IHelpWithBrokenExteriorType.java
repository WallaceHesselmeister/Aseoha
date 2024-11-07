package com.code.aseoha.Helpers;

import com.code.aseoha.tileentities.blocks.EOHTile;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.tileentities.ConsoleTile;

public interface IHelpWithBrokenExteriorType {
    void Aseoha$SetPlayer(PlayerEntity player);

    PlayerEntity Aseoha$GetPlayer();
}