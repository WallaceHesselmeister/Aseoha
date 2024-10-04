package com.code.aseoha.misc;

import com.code.aseoha.aseoha;
import com.code.aseoha.upgrades.EngineBoost;
import com.code.aseoha.upgrades.HADS;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.cap.TardisWorldCapability;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.entity.TardisEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.helper.TextHelper;
import net.tardis.mod.misc.Console;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.tileentities.ConsoleTile;

import javax.annotation.Nonnull;
import javax.swing.*;
import java.util.Iterator;
import java.util.Objects;

public class TARDISHelper {
//    public static void engineBooster(ConsoleTile consoleTile, EngineBoost engineBoost){
//        engineBoost.BoostThemEngines(consoleTile);
//    }

    /**
     * @param console The TARDIS Console
     * @return Returns true if both doors are open
     */
    public static boolean areDoorsOpen(ConsoleTile console){
        DoorEntity doorEntity;
        for (Iterator i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
            if (doorEntity.getOpenState() == EnumDoorState.BOTH)
                return true;

        }
        return false;
    }

    public static void FlyConsoleInWorld(@Nonnull World worldIn){
        TardisHelper.getConsoleInWorld(worldIn).ifPresent(ConsoleTile::takeoff);
    }

    /**
     * @param console The TARDIS Console
     * @return Returns true if both doors are closed
     */
    public static boolean areDoorsClosed(ConsoleTile console){
        DoorEntity doorEntity;
        for (Iterator i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
            if (doorEntity.getOpenState() == EnumDoorState.CLOSED)
                return true;

        }
        return false;
    }

    /**
     * @param console The TARDIS console
     * @return Returns true if 1 door is open
     */
    public static boolean isOneDoorOpen(ConsoleTile console){
        DoorEntity doorEntity;
        for (Iterator i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
            if (doorEntity.getOpenState() == EnumDoorState.ONE)
                return true;

        }
        return false;
    }

    /**
     * @param console The console of the TARDIS with the doors you want to set the state of
     * @param state The state of the doors, 0 = closed, 1 = 1 door open, 2 = 2 doors open
     */
    public static void setDoorState(ConsoleTile console, int state){ //with state, 0 = No doors open/All Closed, 1 = One door open, 2 = Two doors open
        DoorEntity doorEntity;
        for (Iterator i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
            if (state == 0)
                doorEntity.setOpenState(EnumDoorState.CLOSED);
            if (state == 1)
                doorEntity.setOpenState(EnumDoorState.ONE);
            if (state == 2)
                doorEntity.setOpenState(EnumDoorState.BOTH);
        }
    }


//    private static boolean setConsoleChanged(boolean state, boolean overwrite){
//        aseoha.LOGGER.info("INSIDE setConsoleChanged");
//        if(overwrite || !consoleChange)
//            consoleChange = state;
//
//        return consoleChange;
//    }



//    private static boolean consoleChange = false;
//    private static ConsoleTile prevConsole = null;
    private static World world = null;
//
//    private static ConsoleTile getPrevConsole(ConsoleTile console, boolean overwrite){
//        if(overwrite || prevConsole == null) {
//            prevConsole = console;
//        }
//        return prevConsole;
//    }

    private static World getWorld(ConsoleTile consoleTile, boolean overwrite){
        if(overwrite || world == null) {
            world = consoleTile.getLevel();
        }
        return world;
    }


//    public static boolean hasConsoleChanged(ConsoleTile console){
//
//        ConsoleTile preConsole = getPrevConsole(console, false);
//        if(preConsole != console && getWorld(console, false) == console.getLevel()){
//            getPrevConsole(null, true);
//            aseoha.LOGGER.info("changed!");
//            return true;
//        }
//        return false;
//    }






    public static void createTARDIS(BlockPos blockPos, ServerWorld world, AbstractExterior exterior, ConsoleRoom room, Console console) {
        BlockPos createPosition = (new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ())).relative(Direction.NORTH);
        BlockPos placedPos = createPosition.above();
        if (room != null) {
            ServerWorld interiorDimension = TardisHelper.setupTardisDim(world.getServer(), console.getState(), room);
            TardisHelper.getConsoleInWorld(interiorDimension).ifPresent((tile) -> {
                tile.getUnlockManager().addConsole(console);
                tile.getUnlockManager().addConsoleRoom(room);
                tile.getUnlockManager().addExterior(exterior);
                tile.setExteriorType(exterior);
                tile.setCurrentLocation(world.dimension(), createPosition);
                tile.setDestination(world.dimension(), createPosition);
                tile.getExteriorType().place(tile, world.dimension(), placedPos);
                tile.getExteriorType().getExteriorTile(tile).setInteriorDimensionKey(interiorDimension);
                tile.getExteriorType().getExteriorTile(tile).setDoorState(EnumDoorState.CLOSED);

            });}
    }



    public static String getTardisName(TardisWorldCapability cap) {
        CompoundNBT nbt = cap.serializeNBT();
        String tname = nbt.getString("name");
        return tname;
    }

    public static void setTardisName(TardisWorldCapability cap, String tname) {
        CompoundNBT nbt = cap.serializeNBT();
        nbt.putString("name", tname);
        cap.deserializeNBT(nbt);
    }
}
