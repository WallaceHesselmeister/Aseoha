package com.code.aseoha.upgrades;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.StreamSupport;

import javax.annotation.Nullable;

import com.code.aseoha.aseoha;
import com.code.aseoha.networking.Networking;
import com.code.aseoha.networking.Packets.UpdateClientPacket;
import net.minecraft.block.*;
import net.minecraft.client.Minecraft;
import net.minecraft.data.TagsProvider;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.ITag;
import net.minecraft.tags.Tag;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.registries.IForgeRegistry;
import net.tardis.mod.Tardis;
import net.tardis.mod.blocks.TBlocks;
import net.tardis.mod.blocks.exteriors.ExteriorBlock;
import net.tardis.mod.controls.YControl;
import net.tardis.mod.misc.IDontBreak;
import net.tardis.mod.registries.ExteriorRegistry;
import net.tardis.mod.subsystem.ChameleonSubsystem;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.IMultiblock;
import net.tardis.mod.tileentities.console.misc.MonitorOverride;
import net.tardis.mod.upgrades.Upgrade;
import net.tardis.mod.upgrades.UpgradeEntry;

public class Atrium extends Upgrade implements INBTSerializable<CompoundNBT> {
    public boolean GetIsSafeToLand() {
        return isSafeToLand;
    }

    public void SetIsSafeToLand(boolean safeToLand) {
        isSafeToLand = safeToLand;
    }

    boolean isSafeToLand;
    private static final ResourceLocation REGISTRY_NAME = new ResourceLocation(Tardis.MODID, "atrium");
    public static int radius = 5;
    private final Map<BlockPos, BlockState> blocks = new HashMap<BlockPos, BlockState>();
    private int width = 0;
    private int height = 0;

    public Atrium(UpgradeEntry entry, ConsoleTile tile, @Nullable Class<? extends Subsystem> sys) {
        super(entry, tile, sys);
        tile.registerDataHandler(REGISTRY_NAME, this);
    }

    //Should be relative to the exterior
    public void add(BlockPos pos, BlockState state) {
        this.blocks.put(pos, state);
    }

    public BlockState getState(BlockPos pos) {
        return this.blocks.getOrDefault(pos, Blocks.AIR.defaultBlockState());
    }

    public Map<BlockPos, BlockState> getStoredBlocks() {
        return this.blocks;
    }

    public boolean isActive() {
        if (this.getConsole() != null && this.getConsole().getExteriorType() == ExteriorRegistry.DISGUISE.get())
            return false;
        return this.isUsable();
    }

    public void recalculateSize() {
        int width = 0;
        int height = 0;
        for (BlockPos pos : this.blocks.keySet()) {
            if (Math.abs(pos.getX()) > width)
                width = Math.abs(pos.getX());
            if (Math.abs(pos.getZ()) > width)
                width = Math.abs(pos.getZ());

            if (pos.getY() > height)
                height = pos.getY();
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public CompoundNBT serializeNBT() {
        CompoundNBT tag = new CompoundNBT();
        ListNBT list = new ListNBT();
        for (Entry<BlockPos, BlockState> entry : this.blocks.entrySet()) {
            CompoundNBT nbt = new CompoundNBT();
            nbt.putLong("pos", entry.getKey().asLong());
            nbt.put("state", NBTUtil.writeBlockState(entry.getValue()));
            list.add(nbt);
        }
        tag.put("list", list);
        return tag;
    }

    @Override
    public void deserializeNBT(CompoundNBT nbt) {
        ListNBT list = nbt.getList("list", Constants.NBT.TAG_COMPOUND);
        for (INBT item : list) {
            CompoundNBT comp = (CompoundNBT) item;
            this.blocks.put(BlockPos.of(comp.getLong("pos")), NBTUtil.readBlockState(nbt.getCompound("state")));
        }
    }

    public void PlaceAtriumBlocks(ServerWorld world) {
        Set<Entry<BlockPos, BlockState>> states = this.getStoredBlocks().entrySet();
        for (Entry<BlockPos, BlockState> first : states) {
//				System.out.println("Console's Destination: " + this.getConsole().getDestinationPosition());
            System.out.println("Atrium Placement: " + this.getConsole().getDestinationPosition().offset(first.getKey()));
            if (first.getValue().canOcclude() && (!first.getValue().equals(Blocks.BEDROCK.defaultBlockState()) && !first.getValue().equals(Blocks.END_PORTAL.defaultBlockState()) && !first.getValue().equals(Blocks.END_GATEWAY.defaultBlockState()) && !first.getValue().equals(Blocks.NETHER_PORTAL.defaultBlockState()) && !first.equals(Blocks.END_PORTAL_FRAME.defaultBlockState())))
                world.setBlock(this.getConsole().getDestinationPosition().offset(first.getKey()), first.getValue(), 2);
        }

        for (Entry<BlockPos, BlockState> first : states) {
            if (!first.getValue().canOcclude() && (!first.getValue().equals(Blocks.BEDROCK.defaultBlockState()) && !first.getValue().equals(Blocks.END_PORTAL.defaultBlockState()) && !first.getValue().equals(Blocks.END_GATEWAY.defaultBlockState()) && !first.getValue().equals(Blocks.NETHER_PORTAL.defaultBlockState()) && !first.equals(Blocks.END_PORTAL_FRAME.defaultBlockState())))
                world.setBlock(this.getConsole().getDestinationPosition().offset(first.getKey()), first.getValue(), 2);
        }
        this.getStoredBlocks().clear();
    }

    @Override
    public void onLand() {
        if (this.isActivated()) {
            if (this.isUsable()) {
                if (this.getConsole().getSubsystem(ChameleonSubsystem.class).isPresent()) {
                    Objects.requireNonNull(Objects.requireNonNull(this.getConsole().getLevel()).getServer()).tell(new TickDelayedTask(20, () -> {
                        ServerWorld world = Objects.requireNonNull(Objects.requireNonNull(this.getConsole().getLevel()).getServer()).getLevel(this.getConsole().getDestinationDimension());
                        if (world != null) {
                            if (IsSafeToLand(world)) {
                                PlaceAtriumBlocks(world);
                            } else {
                                this.getConsole().getInteriorManager().setMonitorOverrides(new MonitorOverride(this.getConsole(), 400, "Saving Atrium in Buffer."));
//                            this.getConsole().updateClient();
//                            this.getConsole().getSubsystem(StabilizerSubsystem.class).ifPresent(stab -> stab.setControlActivated(false));
//                            this.getConsole().setDestination(this.getConsole().getDestinationDimension(), new BlockPos(this.getConsole().getCurrentLocation().getX(), this.getConsole().getCurrentLocation().getY() + 50, this.getConsole().getCurrentLocation().getZ()));
//                            this.getConsole().getControl(YControl.class).ifPresent(YControl::);
//                            this.getConsole().setDestination(Objects.requireNonNull(this.getConsole().getExteriorType().getExteriorTile(this.getConsole()).getLevel()).dimension(), new BlockPos(this.getConsole().getDestinationPosition().getX(), this.getConsole().getDestinationPosition().getY(), this.getConsole().getDestinationPosition().getZ()));
//                                this.getConsole().takeoff();
//                                this.getConsole().randomizeCoords(this.getConsole().getCurrentLocation(), 50);
                                this.getConsole().updateClient();

//                            Networking.INSTANCE.send(PacketDistributor.ALL.noArg(), new UpdateClientPacket(this.getConsole().getLevel().dimension().getRegistryName()));
                            }
                        }
                    }));
                }
            }
        }
    }
//    public boolean IsSafeToLand(ServerWorld world) {
//        BlockState state;
//        int extX = this.getConsole().getCurrentLocation().below().getX(), extY = this.getConsole().getCurrentLocation().below().getY(), extZ = this.getConsole().getCurrentLocation().below().getZ();
//        for (int x = extX - Atrium.radius; x < extX + Atrium.radius; ++x) {
//            for (int z = extZ - Atrium.radius; z < extZ + Atrium.radius; ++z) {
//                for (int y = extY; y < extY + 11; ++y) {
//                    state = world.getBlockState(new BlockPos(x, y, z));
//                    SetIsSafeToLand(state.equals(Blocks.AIR.defaultBlockState()) || state.equals(Blocks.WATER.defaultBlockState()) || state.equals(Blocks.VOID_AIR.defaultBlockState()));
//
//                    if (GetIsSafeToLand() && (y == this.getHeight() && x == this.getWidth()))
//                        return true;
//                    if (!GetIsSafeToLand())
//                        return false;
//                }
//            }:?
//        }
//        return isSafeToLand;
//    }


    private boolean IsSafeToLand(ServerWorld world) {
//        return ((world.getBlockState(new BlockPos(this.getConsole().getCurrentLocation().getX(), this.getConsole().getCurrentLocation().below().getY() - 1, this.getConsole().getCurrentLocation().getZ())).getBlock() != Blocks.END_PORTAL));
//        world.getBlockState(new BlockPos(this.getConsole().getCurrentLocation().getX(), this.getConsole().getCurrentLocation().below().getY() - 1, this.getConsole().getCurrentLocation().getZ())).getBlock() != Blocks.BEDROCK) &&
        for (Iterator<BlockPos> iterator = BlockPos.withinManhattanStream(new BlockPos(this.getConsole().getDestinationPosition().getX(), this.getConsole().getDestinationPosition().getY() + 10, this.getConsole().getDestinationPosition().getZ()), 5, 11, 5).iterator(); iterator.hasNext(); ) {
            BlockPos pos = iterator.next();
            BlockState blockState = world.getBlockState(pos);
//            aseoha.LOGGER.info(pos);
//            aseoha.LOGGER.info("width {} height {}", this.getWidth() - this.getConsole().getCurrentLocation().getX(), this.getHeight() - this.getConsole().getCurrentLocation().getY());
//            if (!(blockState.getBlock() == Blocks.AIR || blockState.getBlock() == Blocks.VOID_AIR || blockState.getBlock() == Blocks.SEAGRASS || blockState.getBlock() == Blocks.TALL_SEAGRASS || blockState.getBlock() == Blocks.TALL_GRASS || blockState.getBlock() == Blocks.GRASS || blockState.getBlock() == Blocks.CAVE_AIR || blockState.getBlock() == Blocks.WATER || blockState.getBlock() == TBlocks.bottom_exterior.get() || blockState.getBlock() instanceof AbstractPlantBlock || blockState.getBlock() instanceof ExteriorBlock)) {
            if ((blockState instanceof IDontBreak
                    || blockState instanceof IMultiblock
                    || blockState.getBlock() == Blocks.END_PORTAL
                    || blockState.getBlock() == Blocks.NETHER_PORTAL
                    || blockState.getBlock() == Blocks.END_GATEWAY
                    || blockState.getBlock() == Blocks.END_PORTAL_FRAME
                    || blockState.hasTileEntity()
                    || blockState.getBlock() == Blocks.BARRIER
                    || blockState.getBlock() instanceof RedstoneBlock
                    || blockState.getBlock() instanceof RailBlock
                    || blockState.getBlock() instanceof FenceBlock
                    || blockState.getBlock() instanceof FenceGateBlock
                    || blockState.getBlock() instanceof IDontBreak
                    || blockState.getBlock().getTags().contains(Tags.Blocks.COBBLESTONE.getName())
                    || blockState.getBlock().getTags().contains(Tags.Blocks.CHESTS.getName())
                    || blockState.getBlock().getTags().contains(Tags.Blocks.BARRELS.getName())
                    || blockState.getBlock().getTags().contains(Tags.Blocks.STORAGE_BLOCKS.getName())
                    || blockState.getBlock().getTags().contains(Tags.Blocks.ORES.getName()))
                    /////////////////  This bit right here is to keep the Atrium from failing on the TARDIS Exterior blocks
                    && (pos != this.getConsole().getCurrentLocation() && !pos.equals(new BlockPos(
                    this.getConsole().getDestinationPosition().getX(),
                    this.getConsole().getDestinationPosition().getY() + 1,
                    this.getConsole().getDestinationPosition().getZ()))
                    &&
                    pos != this.getConsole().getCurrentLocation() && !pos.equals(new BlockPos(
                    this.getConsole().getCurrentLocation().getX(),
                    this.getConsole().getCurrentLocation().getY() + 1,
                    this.getConsole().getCurrentLocation().getZ()))
                    && !(blockState.getBlock() instanceof ExteriorBlock)
            )) {
//                aseoha.LOGGER.info("Current Y {}, Conflicting Atrium blockpos {}, Conflicting BlockState {}", this.getConsole().getCurrentLocation().getY()+ 1, pos, blockState);
                return false;
            } else if (!iterator.hasNext()) return true;
//            aseoha.LOGGER.info(pos);
        }
        return true;
    }


    @Override
    public void onTakeoff() {
        if (this.getConsole().getSubsystem(ChameleonSubsystem.class).isPresent()) {
            if (this.isActivated()) {
                if (this.isUsable()) {
                    ServerWorld world = Objects.requireNonNull(Objects.requireNonNull(this.getConsole().getLevel()).getServer()).getLevel(this.getConsole().getCurrentDimension());
                    if (world != null) {
                        int extX = this.getConsole().getCurrentLocation().below().getX(), extY = this.getConsole().getCurrentLocation().below().getY(), extZ = this.getConsole().getCurrentLocation().below().getZ();
                        for (int x = extX - Atrium.radius; x < extX + Atrium.radius; ++x) {
                            for (int z = extZ - Atrium.radius; z < extZ + Atrium.radius; ++z) {
                                if (world.getBlockState(new BlockPos(x, extY, z)).getBlock() == TBlocks.atrium_block.get()) {
                                    for (int y = extY; y < extY + 11; ++y) {
                                        BlockPos pos = new BlockPos(x, y, z);
                                        BlockState state = world.getBlockState(pos);
                                        if (!state.hasTileEntity() && !state.getMaterial().isReplaceable() && !state.getMaterial().isLiquid()) {
                                            this.add(pos.subtract(this.getConsole().getCurrentLocation()), state);
                                            this.add(this.getConsole().getCurrentLocation(), Blocks.AIR.defaultBlockState());
                                            if (!state.equals(Blocks.END_PORTAL.defaultBlockState()) && !state.equals(Blocks.NETHER_PORTAL.defaultBlockState()) && !state.equals(Blocks.BEDROCK.defaultBlockState()) && !state.equals(Blocks.END_GATEWAY.defaultBlockState()) && !state.equals(Blocks.END_PORTAL_FRAME.defaultBlockState()))
                                                world.setBlock(pos, Blocks.AIR.defaultBlockState(), 18);
                                        }
                                    }
                                }
                            }
                        }
                        this.recalculateSize();
                    }
                }
            }
        }
    }

    @Override
    public void onFlightSecond() {
    }
}