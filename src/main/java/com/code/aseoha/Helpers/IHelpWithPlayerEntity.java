package com.code.aseoha.Helpers;

import com.code.aseoha.misc.Pilot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;

public interface IHelpWithPlayerEntity {
    void Aseoha$SetPilot(Pilot pilot);

    Pilot Aseoha$GetPilot();

    Pilot Aseoha$CreatePilot(PlayerEntity player);
}
