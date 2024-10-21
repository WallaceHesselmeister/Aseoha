package com.code.aseoha.threads;

import com.code.aseoha.aseoha;
import com.code.aseoha.events.CommonEvents;
import com.code.aseoha.items.AseohaItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.event.TickEvent;
import net.tardis.mod.cap.Capabilities;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.items.SonicItem;
import net.tardis.mod.items.TItems;
import net.tardis.mod.sounds.TSounds;
import net.tardis.mod.subsystem.ShieldGeneratorSubsystem;
import net.tardis.mod.tags.TardisEntityTypeTags;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;
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

    public void Call(TickEvent.WorldTickEvent Event){
        this.isCalledNotInitialized = true;
//        this.event = Event;
        this.tickEvent = Event;
        this.run();
    };

    @Override
    public void run() {
        super.run();
//        aseoha.LOGGER.info("Thread run: {}", this.getName());
        if(isCalledNotInitialized)
            TickEvent(this.tickEvent);
    }

    public void TickEvent(@NotNull TickEvent.WorldTickEvent event) {
        TardisHelper.getConsoleInWorld(event.world).ifPresent(tardisTile -> {
            if (tardisTile.getInteriorManager().getLight() > 15) tardisTile.getInteriorManager().setLight(0);
            Random random = new Random();
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
            if (exteriorBlock != null) {
                if (!tardisTile.isInFlight()) {
                    if (exteriorBlock.getLevel() != null) {
                        for (LivingEntity liv : exteriorBlock.getLevel().getEntitiesOfClass(LivingEntity.class, new AxisAlignedBB(exteriorBlock.getBlockPos()).inflate(2))) {
                            if ((liv instanceof IMob && !liv.getType().is(TardisEntityTypeTags.IGNORED_ALARM_ENTITIES))) {
                                aseoha.SendDebugToAll("HADS Triggered by entity " + liv.getEntity() + " With UUID " + liv.getUUID());
                                CommonEvents.HadsActivate(tardisTile);
                            }
                        }
                        for (ArrowEntity arrow : exteriorBlock.getLevel().getEntitiesOfClass(ArrowEntity.class, new AxisAlignedBB(exteriorBlock.getBlockPos()).inflate(2))) {
                            if (arrow instanceof ArrowEntity) {
                                aseoha.SendDebugToAll("HADS Triggered by arrow");
                                CommonEvents.HadsActivate(tardisTile);
                            }
                        }
                    }
                }

                if (Objects.requireNonNull(tardisTile.getExteriorType().getExteriorTile(tardisTile).getLevel()).getGameTime() % 70 == 0 && !tardisTile.isInFlight()) {
                    /**
                     * check if alarm is on (For Exterior Cloister)
                     */
                    if (tardisTile.getInteriorManager().isAlarmOn()) {
                        Objects.requireNonNull(exteriorBlock.getLevel()).playSound(null, tardisTile.getExteriorType().getExteriorTile(tardisTile).getBlockPos(), TSounds.SINGLE_CLOISTER.get(), SoundCategory.BLOCKS, 1.0F, 0.5F);//(PlayerEntity) null, tile.getExteriorType().getExteriorTile(tile).getBlockPos(), TSounds.SINGLE_CLOISTER, SoundCategory.BLOCKS, 2f, 1f);
                    }
                }

                /**
                 * Check if shields are on (For Exterior Arrow Animation)
                 */
                tardisTile.getSubsystem(ShieldGeneratorSubsystem.class).ifPresent((shield) -> {
                    if (shield.isForceFieldActivated())
                        Objects.requireNonNull(event.world.getServer()).getCommands().performCommand(event.world.getServer().createCommandSourceStack().withSuppressedOutput(), "function aseoha:shield/checkforarrow");
                });

                /**
                 * Check if TARDIS has SOS (For Exterior RING RING)
                 */
                if (!tardisTile.getDistressSignals().isEmpty() && Objects.requireNonNull(tardisTile.getExteriorType().getExteriorTile(tardisTile).getLevel()).getGameTime() % 100 == 0 && !tardisTile.isInFlight()) {
                    Objects.requireNonNull(exteriorBlock.getLevel()).playSound(null, tardisTile.getExteriorType().getExteriorTile(tardisTile).getBlockPos(), TSounds.COMMUNICATOR_RING.get(), SoundCategory.BLOCKS, 1f, 1f);
                }
            }

            /**
             * For Sonic Port Charging
             */
            //Ignore the "tardistile.getsonicitem().getitem() != null is always true" that's bullshit because intelliJ doesn't account for it ACTUALLY being null, it assumes it always has a value, and if you leave out the != null it will nullPointer you
            if (tardisTile.getSonicItem().getItem() != null) {
                if (tardisTile.getSonicItem().getItem() == TItems.SONIC.get()) {
                    SonicItem sonic = (SonicItem) tardisTile.getSonicItem().getItem();
                    ItemStack sonicStack = tardisTile.getSonicItem().getStack();
                    if (event.world.getGameTime() % 20 == 0) {
                        sonic.charge(sonicStack, 1.5f);
                    }
                }
            }
        });
    }
}