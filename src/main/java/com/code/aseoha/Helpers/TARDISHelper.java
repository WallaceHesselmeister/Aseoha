package com.code.aseoha.Helpers;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.tardis.mod.ars.ConsoleRoom;
import net.tardis.mod.cap.TardisWorldCapability;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.KeyItem;
import net.tardis.mod.misc.Console;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import javax.annotation.Nonnull;
import java.util.Iterator;
import java.util.Objects;

public class TARDISHelper {
//    public static void engineBooster(ConsoleTile consoleTile, EngineBoost engineBoost){
//        engineBoost.BoostThemEngines(consoleTile);
//    }

    public static ExteriorTile getExteriorTile(ConsoleTile console) {
        if (!console.getLevel().isClientSide()) {
            ServerWorld world = console.getLevel().getServer().getLevel(console.getCurrentDimension());
            if (world != null) {
                TileEntity te = world.getBlockEntity(console.getCurrentLocation().above());
                if (te instanceof ExteriorTile) {
                    return (ExteriorTile)te;
                }
            }
        }

        return null;
    }

    /**
     * @param console The TARDIS Console
     * @return Returns true if both doors are open
     */
    public static boolean areDoorsOpen(ConsoleTile console){
        DoorEntity doorEntity;
        for (Iterator<DoorEntity> i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
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
        for (Iterator<DoorEntity> i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
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
        for (Iterator<DoorEntity> i = Objects.requireNonNull(console.getLevel()).getEntitiesOfClass(DoorEntity.class, (new AxisAlignedBB(console.getBlockPos())).inflate(25.0)).iterator(); i.hasNext(); doorEntity.updateExteriorDoorData()) {doorEntity = (DoorEntity) i.next();
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
        return nbt.getString("name");
    }

    public static void setTardisName(TardisWorldCapability cap, String tname) {
        CompoundNBT nbt = cap.serializeNBT();
        nbt.putString("name", tname);
        cap.deserializeNBT(nbt);
    }

    public static ActionResult MakeItemKey(PlayerEntity playerIn, Hand handIn, KeyItem keyItem){
        ItemStack stack = playerIn.getItemInHand(handIn);
        if (stack.getItem() instanceof KeyItem) {
                if (handIn == Hand.MAIN_HAND) {
                    ItemStack offHandItem = playerIn.getOffhandItem();
                    if (!(
                            playerIn.getOffhandItem().isEmpty() ||
                            playerIn.getOffhandItem().getItem().equals(Items.AIR) ||
                            playerIn.getOffhandItem().getItem() instanceof BlockItem ||
                            playerIn.getOffhandItem().getItem() instanceof BucketItem ||
                            playerIn.getOffhandItem().getItem() instanceof PotionItem ||
                            playerIn.getOffhandItem().getItem() instanceof SpawnEggItem ||
                            playerIn.getOffhandItem().getItem().equals(Items.SNOWBALL) ||
                            playerIn.getOffhandItem().getItem().equals(Items.ENDER_PEARL) ||
                            playerIn.getOffhandItem().getItem().equals(Items.EGG)
                    )) {
                        if (stack.hasTag()) {
                            keyItem.setTardis(offHandItem, keyItem.getTardis(stack));
                            playerIn.inventory.removeItem(stack);
                            return ActionResult.success(stack);
                        }
                    }
                }
        }
        return ActionResult.fail(stack);
    }
}