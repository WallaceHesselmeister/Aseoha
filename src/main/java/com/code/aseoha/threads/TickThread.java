package com.code.aseoha.threads;

import com.code.aseoha.Helpers.IHelpWithConsole;
import com.code.aseoha.Helpers.IHelpWithExterior;
import com.code.aseoha.aseoha;
import com.code.aseoha.items.AseohaItems;
import com.code.aseoha.texturevariants.TextureVariants;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.concurrent.TickDelayedTask;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.event.TickEvent;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.items.TItems;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.subsystem.ShieldGeneratorSubsystem;
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.tags.TardisEntityTypeTags;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.MonitorOverride;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
import net.tardis.mod.tileentities.exteriors.TTCapsuleExteriorTile;
import net.tardis.mod.tileentities.inventory.PanelInventory;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Random;

public class TickThread extends Thread {
    private TickEvent.WorldTickEvent tickEvent;
    private boolean isCalledNotInitialized;

    /**
     * This is used to initialize the thread
     */
    public TickThread() {
        this.isCalledNotInitialized = false;
    }

    @Deprecated
    /**
     * This is deprecated, use <code>TickThread().call(TickEvent.WorldTickEvent);</code> instead
     * This is ran every tick with <code>new TickThread(WorldTickEvent, true).run();</code><br />
     * if you're trying to Initialize the thread for whatever reason, do <code>new TickThread().call();</code> instead.
     * @param Event the WorldTickEvent, this is for tick-related stuff
     */
    public TickThread(TickEvent.WorldTickEvent Event) {
        this.tickEvent = Event;
        this.isCalledNotInitialized = true;
    }

    public void Call(TickEvent.WorldTickEvent Event) {
        this.isCalledNotInitialized = true;
//        this.event = Event;
        this.tickEvent = Event;
        this.run();
    }

    @Override
    public void run() {
        super.run();
//        aseoha.LOGGER.info("Thread run: {}", this.getName());
        if (isCalledNotInitialized)
            TickEvent(this.tickEvent);
    }

    public void TickEvent(@NotNull TickEvent.WorldTickEvent event) {
        TardisHelper.getConsoleInWorld(event.world).ifPresent(tardisTile -> {
            Random random = new Random();

            if (((IHelpWithConsole) tardisTile).Aseoha$GetMaintenance()) {
                tardisTile.onPowerDown(true);
                tardisTile.getInteriorManager().setLight(0);
                tardisTile.setMaxArtron(0);
                tardisTile.updateClient();
            }

            event.world.getCapability(Capabilities.TARDIS_DATA).ifPresent(cap -> {
                PanelInventory attunementPanel = cap.getEngineInventoryForSide(Direction.EAST);
                if (attunementPanel != null) {
                    for (int i = 0; i < attunementPanel.getSlots(); ++i) {
                        ItemStack itemStack = attunementPanel.getStackInSlot(i);
                        if (itemStack.getItem() == Items.CHICKEN) {
                            if (random.nextInt(100 * itemStack.getStack().getCount()) == 1) {
                                ItemStack itemStack1 = new ItemStack(Items.COOKED_CHICKEN);
                                itemStack1.setCount(itemStack.getStack().getCount());
                                attunementPanel.getStackInSlot(i);
                                attunementPanel.setStackInSlot(i, itemStack1);
                                Objects.requireNonNull(tardisTile.getLevel()).playSound(null, tardisTile.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 10f, 1.5f);
                            }
                            if (random.nextInt(100 * itemStack.getStack().getCount()) == 2) {
                                ItemStack itemStack1 = new ItemStack(Items.EGG);
                                itemStack1.setCount(itemStack.getStack().getCount());
                                attunementPanel.getStackInSlot(i);
                                attunementPanel.setStackInSlot(i, itemStack1);
                                Objects.requireNonNull(tardisTile.getLevel()).playSound(null, tardisTile.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 10f, 1.5f);
                            }
                        }
                        if (itemStack.getItem() == Items.POTATO) {
                            if (random.nextInt(100 * itemStack.getStack().getCount()) == 1) {
                                ItemStack itemStack1 = new ItemStack(Items.POISONOUS_POTATO);
                                itemStack1.setCount(itemStack.getStack().getCount());
                                attunementPanel.getStackInSlot(i);
                                attunementPanel.setStackInSlot(i, itemStack1);
                                Objects.requireNonNull(tardisTile.getLevel()).playSound(null, tardisTile.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 10f, 1.5f);
                            }
                            if (random.nextInt(100 * itemStack.getStack().getCount()) == 2) {
                                ItemStack itemStack1 = new ItemStack(Items.BAKED_POTATO);
                                itemStack1.setCount(itemStack.getStack().getCount());
                                attunementPanel.getStackInSlot(i);
                                attunementPanel.setStackInSlot(i, itemStack1);
                                Objects.requireNonNull(tardisTile.getLevel()).playSound(null, tardisTile.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 10f, 1.5f);
                            }
                            if (random.nextInt(100 * itemStack.getStack().getCount()) == 3) {
                                ItemStack itemStack1 = new ItemStack(AseohaItems.GOLDEN_POTATO.get());
                                itemStack1.setCount(itemStack.getStack().getCount());
                                attunementPanel.getStackInSlot(i);
                                attunementPanel.setStackInSlot(i, itemStack1);
                                Objects.requireNonNull(tardisTile.getLevel()).playSound(null, tardisTile.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 10f, 1.5f);
                            }
                        }
                    }
                }
            });

            ExteriorTile exteriorBlock = tardisTile.getExteriorType().getExteriorTile(tardisTile);

            if (exteriorBlock != null)
                if (!tardisTile.isInFlight())
                    if (exteriorBlock.getLevel() != null) {
                        if (((IHelpWithConsole) tardisTile).Aseoha$GetHads()) {
                            for (LivingEntity liv : exteriorBlock.getLevel().getEntitiesOfClass(LivingEntity.class, new AxisAlignedBB(exteriorBlock.getBlockPos()).inflate(5))) {
                                if ((liv instanceof IMob && !liv.getType().is(TardisEntityTypeTags.IGNORED_ALARM_ENTITIES))) {
                                    if (!tardisTile.isInFlight())
                                        aseoha.SendDebugToAll("HADS Triggered by entity " + liv.getEntity() + " With UUID " + liv.getUUID());
                                    HadsActivate(tardisTile);
                                }
                            }

                            for (ArrowEntity arrow : exteriorBlock.getLevel().getEntitiesOfClass(ArrowEntity.class, new AxisAlignedBB(exteriorBlock.getBlockPos()).inflate(3))) {
                                if (arrow instanceof ArrowEntity) {
                                    if (!tardisTile.isInFlight())
                                        aseoha.SendDebugToAll("HADS Triggered by arrow");
                                    HadsActivate(tardisTile);
                                }
                            }
                        }

                        if (exteriorBlock.getLevel().getGameTime() % 70 == 0 && !tardisTile.isInFlight()) {
                            /** check if alarm is on (For Exterior Cloister) **/
                            if (tardisTile.getInteriorManager().isAlarmOn()) {
                                Objects.requireNonNull(exteriorBlock.getLevel()).playSound(null, exteriorBlock.getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 1.0F, 0.5F);//(PlayerEntity) null, tile.getExteriorType().getExteriorTile(tile).getBlockPos(), TSounds.SINGLE_CLOISTER, SoundCategory.BLOCKS, 2f, 1f);
                            }
                        }

                        /** Check if shields are on (For Exterior Arrow Animation) **/
                        tardisTile.getSubsystem(ShieldGeneratorSubsystem.class).ifPresent((shield) -> {
                            if (shield.isForceFieldActivated())
                                Objects.requireNonNull(event.world.getServer()).getCommands().performCommand(event.world.getServer().createCommandSourceStack().withSuppressedOutput(), "function aseoha:shield/checkforarrow");
                        });

                        /** Check if TARDIS has SOS (For Exterior RING RING) **/
                        if (!tardisTile.getDistressSignals().isEmpty() && exteriorBlock.getLevel().getGameTime() % 100 == 0 && !tardisTile.isInFlight()) {
                            Objects.requireNonNull(exteriorBlock.getLevel()).playSound(null, exteriorBlock.getBlockPos(), TSounds.COMMUNICATOR_RING.get(), SoundCategory.BLOCKS, 1f, 1f);
                        }

                        if (exteriorBlock.getLevel().getBlockState(exteriorBlock.getBlockPos().below(2)).getBlock().equals(Blocks.SNOW) ||
                                exteriorBlock.getLevel().getBlockState(exteriorBlock.getBlockPos().below(2)).getBlock().equals(Blocks.SNOW_BLOCK)) {
                            ((IHelpWithExterior) exteriorBlock).Aseoha$SetIsSnowyVariant(true);
                        } else
                            ((IHelpWithExterior) exteriorBlock).Aseoha$SetIsSnowyVariant(false);

                        // Set Variants for TT Capsule
                        if (exteriorBlock instanceof TTCapsuleExteriorTile) {
                            exteriorBlock.setVariants(TextureVariants.TT);
                        }
                    }

            /** For Sonic Port Charging **/
            // Ignore the "tardistile.getsonicitem().getitem() == null is always false" that's bullshit because intelliJ doesn't account for it ACTUALLY being null, it assumes it always has a value, and if you leave out the != null it will nullPointer you
            if (!(tardisTile.getSonicItem().getItem() == null) && tardisTile.getSonicItem().getItem() == TItems.SONIC.get()) {
                if (event.world.getGameTime() % 20 == 0)
                    ((SonicItem) tardisTile.getSonicItem().getItem()).charge(tardisTile.getSonicItem().getStack(), 1.5f);
            }
        });
    }


    public static void HadsActivate(ConsoleTile console) {
        if (console == null)
            return;

        if (!((IHelpWithConsole) console).Aseoha$GetHads()) return;

        StabilizerSubsystem stabs = console.getSubsystem(StabilizerSubsystem.class).orElse(null);

        if (console.flightTicks >= 1200) {
            console.scaleDestination();
            console.land();
            stabs.setActivated(true);
            console.updateClient();
        }

        if (console.isInFlight()) return;
        stabs.setActivated(false);
        aseoha.SendDebugToAll("HADS Activated in TARDIS WorldKey " + console.getCustomName());
        aseoha.SendDebugToAll("Console" + console);
        console.takeoff();
        console.getInteriorManager().setMonitorOverrides(new MonitorOverride(console, 1200, "HADS Has been triggered!"));
        Objects.requireNonNull(Objects.requireNonNull(console.getLevel()).getServer()).tell(new TickDelayedTask(1, () -> {
            console.setDestinationReachedTick(1);
            console.setFlightTicks(1);
        }));
        console.updateClient();
    }
}